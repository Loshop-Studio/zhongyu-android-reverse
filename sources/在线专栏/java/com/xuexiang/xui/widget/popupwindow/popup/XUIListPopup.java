package com.xuexiang.xui.widget.popupwindow.popup;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.XUI;
import com.xuexiang.xui.utils.DensityUtils;
import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.widget.XUIWrapContentListView;
import com.xuexiang.xui.widget.popupwindow.popup.XUIListPopup;

/* loaded from: classes.dex */
public class XUIListPopup<T extends XUIListPopup> extends XUIPopup {
    protected ListAdapter mAdapter;
    private boolean mHasDivider;
    protected ListView mListView;

    public XUIListPopup(Context context, int i4, ListAdapter listAdapter) {
        super(context, i4);
        this.mAdapter = listAdapter;
    }

    private void updateListViewDivider(ListView listView) {
        if (!this.mHasDivider) {
            listView.setDivider(null);
            return;
        }
        listView.setDivider(new ColorDrawable(ThemeUtils.resolveColor(getContext(), C2042R.attr.xui_config_color_separator_light)));
        if (XUI.isTablet()) {
            listView.setDividerHeight(DensityUtils.dp2px(getContext(), 1.0f));
        } else {
            listView.setDividerHeight(DensityUtils.dp2px(getContext(), 0.5f));
        }
    }

    public T create(int i4, int i5, AdapterView.OnItemClickListener onItemClickListener) {
        create(i4, i5);
        this.mListView.setOnItemClickListener(onItemClickListener);
        return this;
    }

    public ListAdapter getAdapter() {
        return this.mAdapter;
    }

    public ListView getListView() {
        return this.mListView;
    }

    public T setDivider(Drawable drawable) {
        ListView listView = this.mListView;
        if (listView != null) {
            listView.setDivider(drawable);
        }
        return this;
    }

    public T setDividerHeight(int i4) {
        ListView listView = this.mListView;
        if (listView != null) {
            listView.setDividerHeight(i4);
        }
        return this;
    }

    public T setHasDivider(boolean z3) {
        this.mHasDivider = z3;
        ListView listView = this.mListView;
        if (listView != null) {
            updateListViewDivider(listView);
        }
        return this;
    }

    public XUIListPopup(Context context, ListAdapter listAdapter) {
        super(context);
        this.mAdapter = listAdapter;
    }

    protected T create(int i4, int i5) {
        int iDp2px = DensityUtils.dp2px(getContext(), 5.0f);
        if (i5 != 0) {
            this.mListView = new XUIWrapContentListView(getContext(), i5);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
            layoutParams.setMargins(0, iDp2px, 0, iDp2px);
            this.mListView.setLayoutParams(layoutParams);
        } else {
            this.mListView = new XUIWrapContentListView(getContext());
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i4, -2);
            layoutParams2.setMargins(0, iDp2px, 0, iDp2px);
            this.mListView.setLayoutParams(layoutParams2);
        }
        this.mListView.setPadding(iDp2px, 0, iDp2px, 0);
        this.mListView.setAdapter(this.mAdapter);
        this.mListView.setVerticalScrollBarEnabled(false);
        this.mListView.setOverScrollMode(2);
        updateListViewDivider(this.mListView);
        setContentView(this.mListView);
        return this;
    }

    protected T create(int i4) {
        return (T) create(i4, 0);
    }
}
