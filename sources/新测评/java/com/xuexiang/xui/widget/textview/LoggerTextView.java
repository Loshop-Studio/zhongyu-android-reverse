package com.xuexiang.xui.widget.textview;

import android.text.Layout;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes4.dex */
public class LoggerTextView extends AppCompatTextView {

    /* renamed from: b */
    public InterfaceC6604d f6774b;

    /* renamed from: c */
    public InterfaceC6603c f6775c;

    /* renamed from: com.xuexiang.xui.widget.textview.LoggerTextView$a */
    public static class C6601a implements InterfaceC6603c {
    }

    /* renamed from: com.xuexiang.xui.widget.textview.LoggerTextView$b */
    public static class C6602b implements InterfaceC6604d {
    }

    /* renamed from: com.xuexiang.xui.widget.textview.LoggerTextView$c */
    public interface InterfaceC6603c {
    }

    /* renamed from: com.xuexiang.xui.widget.textview.LoggerTextView$d */
    public interface InterfaceC6604d {
    }

    private int getTextRealHeight() {
        Layout layout = getLayout();
        return (layout != null ? layout.getLineTop(getLineCount()) : 0) + getCompoundPaddingTop() + getCompoundPaddingBottom();
    }

    public InterfaceC6603c getLogDecorator() {
        if (this.f6775c == null) {
            this.f6775c = new C6601a();
        }
        return this.f6775c;
    }

    public InterfaceC6604d getLogFormatter() {
        if (this.f6774b == null) {
            this.f6774b = new C6602b();
        }
        return this.f6774b;
    }
}
