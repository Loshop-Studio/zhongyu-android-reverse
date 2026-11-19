package com.xuexiang.xui.widget.textview.marqueen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.xuexiang.xui.C2042R;

/* loaded from: classes.dex */
public class ComplexViewMF extends MarqueeFactory<RelativeLayout, ComplexItemEntity> {
    private LayoutInflater inflater;

    public ComplexViewMF(Context context) {
        super(context);
        this.inflater = LayoutInflater.from(context);
    }

    @Override // com.xuexiang.xui.widget.textview.marqueen.MarqueeFactory
    public RelativeLayout generateMarqueeItemView(ComplexItemEntity complexItemEntity) {
        RelativeLayout relativeLayout = (RelativeLayout) this.inflater.inflate(C2042R.layout.marqueen_layout_complex_view, (ViewGroup) null);
        ((TextView) relativeLayout.findViewById(C2042R.id.title)).setText(complexItemEntity.getTitle());
        ((TextView) relativeLayout.findViewById(C2042R.id.subTitle)).setText(complexItemEntity.getSubTitle());
        ((TextView) relativeLayout.findViewById(C2042R.id.time)).setText(complexItemEntity.getTime());
        return relativeLayout;
    }
}
