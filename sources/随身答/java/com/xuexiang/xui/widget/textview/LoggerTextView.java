package com.xuexiang.xui.widget.textview;

import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes4.dex */
public class LoggerTextView extends AppCompatTextView {
    private int getTextRealHeight() {
        return getLayout().getLineTop(getLineCount()) + getCompoundPaddingTop() + getCompoundPaddingBottom();
    }
}
