package com.xuexiang.xui.widget.popupwindow.easypopup;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.DensityUtils;
import com.xuexiang.xui.utils.ResUtils;
import com.xuexiang.xui.widget.XUIWrapContentListView;

/* loaded from: classes.dex */
public class ListPopup extends BaseCustomPopup {
    private BaseAdapter mAdapter;
    private int mMaxHeight;
    private AdapterView.OnItemClickListener mOnItemClickListener;

    protected ListPopup(Context context) {
        super(context);
    }

    public BaseAdapter getAdapter() {
        return this.mAdapter;
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    @Override // com.xuexiang.xui.widget.popupwindow.easypopup.BaseCustomPopup
    protected void initAttributes() {
        XUIWrapContentListView xUIWrapContentListView = new XUIWrapContentListView(getContext(), this.mMaxHeight);
        xUIWrapContentListView.setLayoutParams(new FrameLayout.LayoutParams(this.mWidth, this.mMaxHeight));
        xUIWrapContentListView.setAdapter((ListAdapter) this.mAdapter);
        xUIWrapContentListView.setVerticalScrollBarEnabled(false);
        xUIWrapContentListView.setOnItemClickListener(this.mOnItemClickListener);
        xUIWrapContentListView.setDivider(ResUtils.getDrawable(C2042R.drawable.xui_config_list_item_selector));
        xUIWrapContentListView.setDividerHeight(DensityUtils.dp2px(getContext(), 1.0f));
        setContentView(xUIWrapContentListView);
    }

    @Override // com.xuexiang.xui.widget.popupwindow.easypopup.BaseCustomPopup
    protected void initViews(View view) {
    }

    public ListPopup setAdapter(BaseAdapter baseAdapter) {
        this.mAdapter = baseAdapter;
        return this;
    }

    public ListPopup setMaxHeight(int i4) {
        this.mMaxHeight = i4;
        return this;
    }

    public ListPopup setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
        return this;
    }
}
