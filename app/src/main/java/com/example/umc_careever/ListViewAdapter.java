package com.example.umc_careever;

import android.content.ClipData;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class ListViewAdapter extends RecyclerView.Adapter<ListViewAdapter.ItemViewHolder> {

    private ArrayList<ListItem> mList;
    private int position;

    public ListViewAdapter(ArrayList<ListItem> list) {
        this.mList = list;
    }


    public class ItemViewHolder extends RecyclerView.ViewHolder {
        protected TextView Group;
        protected TextView Title;

        public ItemViewHolder(@NonNull final View itemView) {
            super(itemView);
            this.Group = itemView.findViewById(R.id.help_list_group_tv);
            this.Title = itemView.findViewById(R.id.help_list_title_tv);
        }

        public void onBind(ListItem item) {
            Group.setText(item.getGroup());
            Title.setText(item.getTitle());
        }

    }

    @NonNull
    @androidx.annotation.NonNull
    @Override
    public ListViewAdapter.ItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_item, viewGroup, false);

        ItemViewHolder viewHolder = new ItemViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder viewHolder, int position) {
    }

    @Override
    public int getItemCount() {
        return (null != mList ? mList.size() : 0);
    }

    public ArrayList<ListItem> getListData() {
        return mList;
    }

    public void setListData(ArrayList<ListItem> listData) {
        this.mList = listData;
    }
}
