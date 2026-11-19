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
import com.xuexiang.xui.utils.AbstractC8042h;

/* loaded from: classes5.dex */
public class XUIGroupListSectionHeaderFooterView extends LinearLayout {

    /* renamed from: c */
    public TextView f15965c;

    public XUIGroupListSectionHeaderFooterView(Context context) {
        this(context, null, R$attr.XUIGroupListSectionViewStyle);
    }

    /* renamed from: a */
    public final void m12638a(Context context) {
        LayoutInflater.from(context).inflate(R$layout.xui_layout_group_list_section, (ViewGroup) this, true);
        setGravity(80);
        this.f15965c = (TextView) findViewById(R$id.group_list_section_header_textView);
    }

    public TextView getTextView() {
        return this.f15965c;
    }

    public void setText(CharSequence charSequence) {
        if (AbstractC8042h.m12235i(charSequence)) {
            this.f15965c.setVisibility(8);
        } else {
            this.f15965c.setVisibility(0);
        }
        this.f15965c.setText(charSequence);
    }

    public void setTextGravity(int i10) {
        this.f15965c.setGravity(i10);
    }

    public XUIGroupListSectionHeaderFooterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.XUIGroupListSectionViewStyle);
    }

    public XUIGroupListSectionHeaderFooterView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m12638a(context);
    }
}
