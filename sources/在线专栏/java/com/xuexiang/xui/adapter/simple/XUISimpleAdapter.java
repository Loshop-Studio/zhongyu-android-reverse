package com.xuexiang.xui.adapter.simple;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.adapter.listview.BaseListAdapter;
import com.xuexiang.xui.utils.DensityUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class XUISimpleAdapter extends BaseListAdapter<AdapterItem, ViewHolder> {
    private int mPaddingStartPx;

    public XUISimpleAdapter(Context context) {
        super(context);
    }

    public static XUISimpleAdapter create(Context context, String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return new XUISimpleAdapter(context);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(new AdapterItem(str));
        }
        return new XUISimpleAdapter(context, arrayList);
    }

    @Override // com.xuexiang.xui.adapter.listview.BaseListAdapter
    protected int getLayoutId() {
        return C2042R.layout.xui_adapter_listview_simple_item;
    }

    @Deprecated
    public XUISimpleAdapter setPaddingLeftDp(int i4) {
        this.mPaddingStartPx = DensityUtils.dp2px(i4);
        return this;
    }

    @Deprecated
    public XUISimpleAdapter setPaddingLeftPx(int i4) {
        this.mPaddingStartPx = i4;
        return this;
    }

    public XUISimpleAdapter setPaddingStartDp(int i4) {
        this.mPaddingStartPx = DensityUtils.dp2px(i4);
        return this;
    }

    public XUISimpleAdapter setPaddingStartPx(int i4) {
        this.mPaddingStartPx = i4;
        return this;
    }

    public XUISimpleAdapter(Context context, List<AdapterItem> list) {
        super(context, list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xuexiang.xui.adapter.listview.BaseListAdapter
    public void convert(ViewHolder viewHolder, AdapterItem adapterItem, int i4) {
        viewHolder.mTvTitle.setText(adapterItem.getTitle());
        if (adapterItem.getIcon() == null) {
            viewHolder.mIvIcon.setVisibility(8);
        } else {
            viewHolder.mIvIcon.setVisibility(0);
            viewHolder.mIvIcon.setImageDrawable(adapterItem.getIcon());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xuexiang.xui.adapter.listview.BaseListAdapter
    public ViewHolder newViewHolder(View view) {
        ViewHolder viewHolder = new ViewHolder();
        viewHolder.mLLContentView = (LinearLayout) view.findViewById(C2042R.id.ll_content);
        viewHolder.mTvTitle = (TextView) view.findViewById(C2042R.id.tv_title);
        viewHolder.mIvIcon = (ImageView) view.findViewById(C2042R.id.iv_icon);
        int i4 = this.mPaddingStartPx;
        if (i4 != 0) {
            viewHolder.mLLContentView.setPaddingRelative(i4, 0, 0, 0);
            viewHolder.mLLContentView.setGravity(16);
        } else {
            viewHolder.mLLContentView.setGravity(17);
        }
        return viewHolder;
    }

    public XUISimpleAdapter(Context context, AdapterItem[] adapterItemArr) {
        super(context, adapterItemArr);
    }

    public static XUISimpleAdapter create(Context context, List<String> list) {
        if (list != null && list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < list.size(); i4++) {
                arrayList.add(new AdapterItem(list.get(i4)));
            }
            return new XUISimpleAdapter(context, arrayList);
        }
        return new XUISimpleAdapter(context);
    }
}
