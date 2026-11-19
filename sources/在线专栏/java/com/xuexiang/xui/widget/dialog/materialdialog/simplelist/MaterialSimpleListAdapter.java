package com.xuexiang.xui.widget.dialog.materialdialog.simplelist;

import android.R;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.MDAdapter;
import com.xuexiang.xui.widget.dialog.materialdialog.simplelist.MaterialSimpleListItem;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class MaterialSimpleListAdapter extends RecyclerView.AbstractC0562g<SimpleListVH> implements MDAdapter {
    private MaterialDialog mDialog;
    private List<MaterialSimpleListItem> mItems;
    private OnItemClickListener mOnItemClickListener;

    public interface OnItemClickListener {
        void onMaterialListItemSelected(MaterialDialog materialDialog, int i4, MaterialSimpleListItem materialSimpleListItem);
    }

    static class SimpleListVH extends RecyclerView.AbstractC0557b0 implements View.OnClickListener {
        final MaterialSimpleListAdapter mAdapter;
        final ImageView mIcon;
        final TextView mTitle;

        SimpleListVH(View view, MaterialSimpleListAdapter materialSimpleListAdapter) {
            super(view);
            this.mIcon = (ImageView) view.findViewById(R.id.icon);
            this.mTitle = (TextView) view.findViewById(R.id.title);
            this.mAdapter = materialSimpleListAdapter;
            view.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialSimpleListAdapter materialSimpleListAdapter = this.mAdapter;
            if (materialSimpleListAdapter == null || materialSimpleListAdapter.mOnItemClickListener == null) {
                return;
            }
            this.mAdapter.getMaterialDialog().dismiss();
            this.mAdapter.mOnItemClickListener.onMaterialListItemSelected(this.mAdapter.mDialog, getAdapterPosition(), this.mAdapter.getItem(getAdapterPosition()));
        }
    }

    public MaterialSimpleListAdapter(OnItemClickListener onItemClickListener) {
        this.mItems = new ArrayList(4);
        this.mOnItemClickListener = onItemClickListener;
    }

    public void add(MaterialSimpleListItem materialSimpleListItem) {
        this.mItems.add(materialSimpleListItem);
        notifyItemInserted(this.mItems.size() - 1);
    }

    public void clear() {
        this.mItems.clear();
        notifyDataSetChanged();
    }

    public MaterialSimpleListItem getItem(int i4) {
        return this.mItems.get(i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0562g
    public int getItemCount() {
        return this.mItems.size();
    }

    public MaterialDialog getMaterialDialog() {
        return this.mDialog;
    }

    @Override // com.xuexiang.xui.widget.dialog.materialdialog.internal.MDAdapter
    public void setDialog(MaterialDialog materialDialog) {
        this.mDialog = materialDialog;
    }

    public MaterialSimpleListAdapter setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
        return this;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0562g
    public void onBindViewHolder(SimpleListVH simpleListVH, int i4) {
        if (this.mDialog != null) {
            MaterialSimpleListItem materialSimpleListItem = this.mItems.get(i4);
            if (materialSimpleListItem.getIcon() != null) {
                simpleListVH.mIcon.setImageDrawable(materialSimpleListItem.getIcon());
                simpleListVH.mIcon.setPadding(materialSimpleListItem.getIconPadding(), materialSimpleListItem.getIconPadding(), materialSimpleListItem.getIconPadding(), materialSimpleListItem.getIconPadding());
                simpleListVH.mIcon.getBackground().setColorFilter(materialSimpleListItem.getBackgroundColor(), PorterDuff.Mode.SRC_ATOP);
            } else {
                simpleListVH.mIcon.setVisibility(8);
            }
            simpleListVH.mTitle.setTextColor(this.mDialog.getBuilder().getItemColor());
            simpleListVH.mTitle.setText(materialSimpleListItem.getContent());
            MaterialDialog materialDialog = this.mDialog;
            materialDialog.setTypeface(simpleListVH.mTitle, materialDialog.getBuilder().getRegularFont());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0562g
    public SimpleListVH onCreateViewHolder(ViewGroup viewGroup, int i4) {
        return new SimpleListVH(LayoutInflater.from(viewGroup.getContext()).inflate(C2042R.layout.xmd_layout_simplelist_item, viewGroup, false), this);
    }

    public void add(MaterialSimpleListItem.Builder builder) {
        add(builder.build());
    }

    public MaterialSimpleListAdapter(List<MaterialSimpleListItem> list) {
        this.mItems = list;
    }
}
