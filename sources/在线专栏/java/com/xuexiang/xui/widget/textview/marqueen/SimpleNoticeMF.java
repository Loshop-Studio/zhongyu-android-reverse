package com.xuexiang.xui.widget.textview.marqueen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.xuexiang.xui.C2042R;

/* loaded from: classes.dex */
public class SimpleNoticeMF extends MarqueeFactory<TextView, String> {
    private LayoutInflater inflater;

    public SimpleNoticeMF(Context context) {
        super(context);
        this.inflater = LayoutInflater.from(context);
    }

    @Override // com.xuexiang.xui.widget.textview.marqueen.MarqueeFactory
    public TextView generateMarqueeItemView(String str) {
        TextView textView = (TextView) this.inflater.inflate(C2042R.layout.marqueen_layout_notice_item, (ViewGroup) null);
        textView.setText(str);
        return textView;
    }
}
