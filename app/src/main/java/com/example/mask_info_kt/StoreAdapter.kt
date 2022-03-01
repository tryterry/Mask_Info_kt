package com.example.mask_info_kt

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mask_info_kt.model.Store
import java.lang.String

// 아이템 뷰 정보를 가지고 있는 클래스
class StoreViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var nameTextView: TextView = itemView.findViewById(R.id.name_text_view)
    var addressTextView: TextView = itemView.findViewById(R.id.addr_text_view)
    var distanceTextView: TextView = itemView.findViewById(R.id.distance_text_view)
    var remainTextView: TextView = itemView.findViewById(R.id.remain_text_view)
    var countTextView: TextView = itemView.findViewById(R.id.count_text_view)
}

class StoreAdapter : RecyclerView.Adapter<StoreViewHolder?>() {
        private var mItems: List<Store> = ArrayList<Store>()

        fun updateItems(items: List<Store>) {
            mItems = items
            notifyDataSetChanged()
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoreViewHolder {
            return StoreViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.item_store, parent, false)
            )
        }

        override fun onBindViewHolder(holder: StoreViewHolder, position: Int) {
            val store: Store = mItems[position]
            holder.nameTextView.setText(store.name)
            holder.addressTextView.text = store.addr
            holder.distanceTextView.text = "1km"
            var count = "100개 이상"
            var remainStat = "충분"
            var color = Color.GREEN
            when (store.remain_stat) {
                "plenty" -> {
                    count = "100개 이상"
                    remainStat = "충분"
                    color = Color.GREEN
                }
                "some" -> {
                    count = "30개 이상"
                    remainStat = "여유"
                    color = Color.YELLOW
                }
                "few" -> {
                    count = "2개 이상"
                    remainStat = "매진 임박"
                    color = Color.RED
                }
                "empty" -> {
                    count = "1개 이하"
                    remainStat = "재고 없음"
                    color = Color.GRAY
                }
                else -> {}
            }
            holder.remainTextView.text = remainStat
            holder.remainTextView.setTextColor(color)
            holder.countTextView.text = count
            holder.countTextView.setTextColor(color)
        }

        override fun getItemCount(): Int = mItems.size
}