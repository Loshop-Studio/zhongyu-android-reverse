package com.xuexiang.xui.widget.flowlayout;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.xuexiang.xui.C2042R;

/* loaded from: classes.dex */
public class DefaultFlowTagAdapter extends BaseTagAdapter<String, TextView> {
    public DefaultFlowTagAdapter(Context context) {
        super(context);
    }

    @Override // com.xuexiang.xui.adapter.listview.BaseListAdapter
    protected int getLayoutId() {
        return C2042R.layout.xui_adapter_default_flow_tag_item;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xuexiang.xui.adapter.listview.BaseListAdapter
    public void convert(TextView textView, String str, int i4) {
        textView.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xuexiang.xui.adapter.listview.BaseListAdapter
    public TextView newViewHolder(View view) {
        return (TextView) view.findViewById(C2042R.id.tv_tag_item);
    }
}
