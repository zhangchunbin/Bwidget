package com.bingo.widget.contactsview.indexableview;

import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

/**
 * 该HeaderAdapter 接收一个IndexableAdapter, 使其布局以及点击事件和IndexableAdapter一致
 * Created by zcb on 17/09/12
 */
public class SimpleFooterAdapter<T extends IndexableEntity> extends IndexableFooterAdapter<T> {
    private IndexableAdapter<T> mAdapter;

    public SimpleFooterAdapter(IndexableAdapter<T> adapter, String index, String indexTitle, List<T> datas) {
        super(index, indexTitle, datas);
        this.mAdapter = adapter;
    }

    @Override
    public int getItemViewType() {
        return EntityWrapper.TYPE_CONTENT;
    }

    @Override
    public RecyclerView.ViewHolder onCreateContentViewHolder(ViewGroup parent) {
        return mAdapter.onCreateContentViewHolder(parent);
    }

    @Override
    public void onBindContentViewHolder(RecyclerView.ViewHolder holder, T entity) {
        mAdapter.onBindContentViewHolder(holder, entity);
    }
}
