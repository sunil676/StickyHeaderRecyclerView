package com.sunil.stickyheaderrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by sunil on 12/2/16.
 */

public abstract class RecyclerItemAdapter<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {

    List<ItemModel> items = new ArrayList<>();
    RecyclerItemAdapter(){
        setHasStableIds(true);
    }


    public void add(ItemModel object) {
        items.add(object);
        notifyDataSetChanged();
    }

    public void add(int index, ItemModel object) {
        items.add(index, object);
        notifyDataSetChanged();
    }

    public void addAll(Collection<? extends ItemModel> collection) {
        if (collection != null) {
            items.addAll(collection);
            notifyDataSetChanged();
        }
    }

    public void addAll(ItemModel... items) {
        addAll(Arrays.asList(items));
    }

    public void clear() {
        items.clear();
        notifyDataSetChanged();
    }

    public void remove(ItemModel object) {
        items.remove(object);
        notifyDataSetChanged();
    }



}
