package com.xuexiang.xui.widget.popupwindow.popup;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ExpandableListView;
import com.xuexiang.xui.adapter.simple.ExpandableItem;
import com.xuexiang.xui.adapter.simple.XUISimpleExpandableListAdapter;
import com.xuexiang.xui.widget.popupwindow.popup.XUISimpleExpandablePopup;
import java.util.List;

/* loaded from: classes.dex */
public class XUISimpleExpandablePopup<T extends XUISimpleExpandablePopup> extends XUIExpandableListPopup {

    public interface OnExpandableItemClickListener {
        void onExpandableItemClick(XUISimpleExpandableListAdapter xUISimpleExpandableListAdapter, ExpandableItem expandableItem, int i4, int i5);
    }

    public XUISimpleExpandablePopup(Context context, List<ExpandableItem> list) {
        this(context, new XUISimpleExpandableListAdapter(list));
    }

    public XUIExpandableListPopup setOnExpandableItemClickListener(OnExpandableItemClickListener onExpandableItemClickListener) {
        setOnExpandableItemClickListener(true, onExpandableItemClickListener);
        return this;
    }

    public XUISimpleExpandablePopup(Context context, ExpandableItem... expandableItemArr) {
        this(context, new XUISimpleExpandableListAdapter(expandableItemArr));
    }

    @Override // com.xuexiang.xui.widget.popupwindow.popup.XUIExpandableListPopup
    public XUISimpleExpandableListAdapter getAdapter() {
        return (XUISimpleExpandableListAdapter) this.mAdapter;
    }

    @Override // com.xuexiang.xui.widget.popupwindow.popup.XUIExpandableListPopup
    public T setChildDivider(Drawable drawable) {
        super.setChildDivider(drawable);
        return this;
    }

    @Override // com.xuexiang.xui.widget.popupwindow.popup.XUIExpandableListPopup
    public T setDividerHeight(int i4) {
        super.setDividerHeight(i4);
        return this;
    }

    @Override // com.xuexiang.xui.widget.popupwindow.popup.XUIExpandableListPopup
    public T setEnableOnlyExpandOne(boolean z3) {
        super.setEnableOnlyExpandOne(z3);
        return this;
    }

    @Override // com.xuexiang.xui.widget.popupwindow.popup.XUIExpandableListPopup
    public T setGroupDivider(Drawable drawable) {
        super.setGroupDivider(drawable);
        return this;
    }

    @Override // com.xuexiang.xui.widget.popupwindow.popup.XUIExpandableListPopup
    public T setHasDivider(boolean z3) {
        super.setHasDivider(z3);
        return this;
    }

    public T setOnExpandableItemClickListener(final boolean z3, final OnExpandableItemClickListener onExpandableItemClickListener) {
        ExpandableListView expandableListView = this.mExpandableListView;
        if (expandableListView != null) {
            expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() { // from class: com.xuexiang.xui.widget.popupwindow.popup.XUISimpleExpandablePopup.1
                @Override // android.widget.ExpandableListView.OnChildClickListener
                public boolean onChildClick(ExpandableListView expandableListView2, View view, int i4, int i5, long j4) {
                    OnExpandableItemClickListener onExpandableItemClickListener2 = onExpandableItemClickListener;
                    if (onExpandableItemClickListener2 != null) {
                        onExpandableItemClickListener2.onExpandableItemClick(XUISimpleExpandablePopup.this.getAdapter(), XUISimpleExpandablePopup.this.getAdapter().getGroup(i4), i4, i5);
                    }
                    if (!z3) {
                        return false;
                    }
                    XUISimpleExpandablePopup.this.dismiss();
                    return false;
                }
            });
        }
        return this;
    }

    public XUISimpleExpandablePopup(Context context, XUISimpleExpandableListAdapter xUISimpleExpandableListAdapter) {
        super(context, xUISimpleExpandableListAdapter);
    }

    public T create(int i4, OnExpandableItemClickListener onExpandableItemClickListener) {
        create(i4);
        setOnExpandableItemClickListener(onExpandableItemClickListener);
        return this;
    }

    @Override // com.xuexiang.xui.widget.popupwindow.popup.XUIExpandableListPopup
    public T create(int i4, int i5) {
        super.create(i4, i5);
        return this;
    }

    public T create(int i4, int i5, OnExpandableItemClickListener onExpandableItemClickListener) {
        create(i4, i5);
        setOnExpandableItemClickListener(onExpandableItemClickListener);
        return this;
    }

    @Override // com.xuexiang.xui.widget.popupwindow.popup.XUIExpandableListPopup
    public T create(int i4) {
        super.create(i4);
        return this;
    }
}
