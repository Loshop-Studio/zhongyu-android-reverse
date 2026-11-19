package com.xuexiang.xui.widget.grouplist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;

/* loaded from: classes3.dex */
public class XUIGroupListSectionHeaderFooterView extends LinearLayout {

    /* renamed from: a */
    public final TextView f4316a;

    public XUIGroupListSectionHeaderFooterView(Context context) {
        this(context, null, R$attr.XUIGroupListSectionViewStyle);
    }

    public TextView getTextView() {
        return this.f4316a;
    }

    public void setText(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            this.f4316a.setVisibility(8);
        } else {
            this.f4316a.setVisibility(0);
        }
        this.f4316a.setText(charSequence);
    }

    public void setTextGravity(int i) {
        this.f4316a.setGravity(i);
    }

    public XUIGroupListSectionHeaderFooterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.XUIGroupListSectionViewStyle);
    }

    public XUIGroupListSectionHeaderFooterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R$layout.xui_layout_group_list_section, (ViewGroup) this, true);
        setGravity(80);
        this.f4316a = (TextView) findViewById(R$id.group_list_section_header_textView);
    }
}
