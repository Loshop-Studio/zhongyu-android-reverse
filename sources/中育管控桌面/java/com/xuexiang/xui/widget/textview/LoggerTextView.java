package com.xuexiang.xui.widget.textview;

import android.text.Layout;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes3.dex */
public class LoggerTextView extends AppCompatTextView {

    /* renamed from: b */
    public InterfaceC5982d f5498b;

    /* renamed from: c */
    public InterfaceC5981c f5499c;

    /* renamed from: com.xuexiang.xui.widget.textview.LoggerTextView$a */
    public static class C5979a implements InterfaceC5981c {
    }

    /* renamed from: com.xuexiang.xui.widget.textview.LoggerTextView$b */
    public static class C5980b implements InterfaceC5982d {
    }

    /* renamed from: com.xuexiang.xui.widget.textview.LoggerTextView$c */
    public interface InterfaceC5981c {
    }

    /* renamed from: com.xuexiang.xui.widget.textview.LoggerTextView$d */
    public interface InterfaceC5982d {
    }

    private int getTextRealHeight() {
        Layout layout = getLayout();
        return (layout != null ? layout.getLineTop(getLineCount()) : 0) + getCompoundPaddingTop() + getCompoundPaddingBottom();
    }

    public InterfaceC5981c getLogDecorator() {
        if (this.f5499c == null) {
            this.f5499c = new C5979a();
        }
        return this.f5499c;
    }

    public InterfaceC5982d getLogFormatter() {
        if (this.f5498b == null) {
            this.f5498b = new C5980b();
        }
        return this.f5498b;
    }
}
