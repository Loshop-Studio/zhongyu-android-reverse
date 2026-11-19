package com.xuexiang.xui.widget.grouplist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.Utils;

/* loaded from: classes.dex */
public class XUIGroupListSectionHeaderFooterView extends LinearLayout {
    private TextView mTextView;

    public XUIGroupListSectionHeaderFooterView(Context context) {
        this(context, (AttributeSet) null, C2042R.attr.XUIGroupListSectionViewStyle);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(C2042R.layout.xui_layout_group_list_section, (ViewGroup) this, true);
        setGravity(80);
        this.mTextView = (TextView) findViewById(C2042R.id.group_list_section_header_textView);
    }

    public TextView getTextView() {
        return this.mTextView;
    }

    public void setText(CharSequence charSequence) {
        if (Utils.isNullOrEmpty(charSequence)) {
            this.mTextView.setVisibility(8);
        } else {
            this.mTextView.setVisibility(0);
        }
        this.mTextView.setText(charSequence);
    }

    public void setTextGravity(int i4) {
        this.mTextView.setGravity(i4);
    }

    public XUIGroupListSectionHeaderFooterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2042R.attr.XUIGroupListSectionViewStyle);
    }

    public XUIGroupListSectionHeaderFooterView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        init(context);
    }

    public XUIGroupListSectionHeaderFooterView(Context context, CharSequence charSequence) {
        this(context);
        setText(charSequence);
    }

    public XUIGroupListSectionHeaderFooterView(Context context, CharSequence charSequence, boolean z3) {
        this(context);
        if (z3) {
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), 0);
        }
        setText(charSequence);
    }
}
