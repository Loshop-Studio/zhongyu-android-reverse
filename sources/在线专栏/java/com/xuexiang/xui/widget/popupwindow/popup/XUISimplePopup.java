package com.xuexiang.xui.widget.popupwindow.popup;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.xuexiang.xui.adapter.simple.AdapterItem;
import com.xuexiang.xui.adapter.simple.XUISimpleAdapter;
import com.xuexiang.xui.widget.popupwindow.popup.XUISimplePopup;
import java.util.List;

/* loaded from: classes.dex */
public class XUISimplePopup<T extends XUISimplePopup> extends XUIListPopup {

    public interface OnPopupItemClickListener {
        void onItemClick(XUISimpleAdapter xUISimpleAdapter, AdapterItem adapterItem, int i4);
    }

    public XUISimplePopup(Context context, String[] strArr) {
        this(context, XUISimpleAdapter.create(context, strArr));
    }

    public T setOnPopupItemClickListener(final OnPopupItemClickListener onPopupItemClickListener) {
        ListView listView = this.mListView;
        if (listView != null) {
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.xuexiang.xui.widget.popupwindow.popup.XUISimplePopup.1
                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
                    OnPopupItemClickListener onPopupItemClickListener2 = onPopupItemClickListener;
                    if (onPopupItemClickListener2 != null) {
                        onPopupItemClickListener2.onItemClick(XUISimplePopup.this.getAdapter(), XUISimplePopup.this.getAdapter().getItem(i4), i4);
                    }
                    XUISimplePopup.this.dismiss();
                }
            });
        }
        return this;
    }

    public XUISimplePopup(Context context, List<AdapterItem> list) {
        this(context, new XUISimpleAdapter(context, list));
    }

    @Override // com.xuexiang.xui.widget.popupwindow.popup.XUIListPopup
    public T create(int i4) {
        create(getPopupWidth(), i4);
        return this;
    }

    @Override // com.xuexiang.xui.widget.popupwindow.popup.XUIListPopup
    public XUISimpleAdapter getAdapter() {
        return (XUISimpleAdapter) this.mAdapter;
    }

    @Override // com.xuexiang.xui.widget.popupwindow.popup.XUIListPopup
    public T setHasDivider(boolean z3) {
        super.setHasDivider(z3);
        return this;
    }

    public XUISimplePopup(Context context, AdapterItem[] adapterItemArr) {
        this(context, new XUISimpleAdapter(context, adapterItemArr));
    }

    public T create(int i4, OnPopupItemClickListener onPopupItemClickListener) {
        return (T) create(getPopupWidth(), i4, onPopupItemClickListener);
    }

    public XUISimplePopup(Context context, XUISimpleAdapter xUISimpleAdapter) {
        super(context, xUISimpleAdapter);
    }

    public T create(OnPopupItemClickListener onPopupItemClickListener) {
        create(getPopupWidth());
        setOnPopupItemClickListener(onPopupItemClickListener);
        return this;
    }

    public T create(int i4, int i5, OnPopupItemClickListener onPopupItemClickListener) {
        create(i4, i5);
        setOnPopupItemClickListener(onPopupItemClickListener);
        return this;
    }
}
