package com.luck.picture.lib.adapter.holder;

import android.view.View;
import android.widget.TextView;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$string;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.style.SelectMainStyle;
import p008a7.AbstractC0082o;
import p235l6.AbstractC10150d;

/* loaded from: classes5.dex */
public class CameraViewHolder extends BaseRecyclerMediaHolder {
    public CameraViewHolder(View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(R$id.tvCamera);
        SelectMainStyle selectMainStyleM26627c = PictureSelectionConfig.f12295P0.m26627c();
        int iM9530a = selectMainStyleM26627c.m9530a();
        if (AbstractC0082o.m228c(iM9530a)) {
            textView.setBackgroundColor(iM9530a);
        }
        int iM9531b = selectMainStyleM26627c.m9531b();
        if (AbstractC0082o.m228c(iM9531b)) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, iM9531b, 0, 0);
        }
        String strM9532c = selectMainStyleM26627c.m9532c();
        if (AbstractC0082o.m231f(strM9532c)) {
            textView.setText(strM9532c);
        } else if (PictureSelectionConfig.m9328c().f12337c == AbstractC10150d.m21191b()) {
            textView.setText(view.getContext().getString(R$string.ps_tape));
        }
        int iM9534h = selectMainStyleM26627c.m9534h();
        if (AbstractC0082o.m227b(iM9534h)) {
            textView.setTextSize(iM9534h);
        }
        int iM9533g = selectMainStyleM26627c.m9533g();
        if (AbstractC0082o.m228c(iM9533g)) {
            textView.setTextColor(iM9533g);
        }
    }
}
