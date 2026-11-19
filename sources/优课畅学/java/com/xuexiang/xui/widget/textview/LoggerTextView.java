package com.xuexiang.xui.widget.textview;

import android.text.Layout;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes4.dex */
public class LoggerTextView extends AppCompatTextView {

    /* renamed from: b */
    public InterfaceC7020d f8255b;

    /* renamed from: c */
    public InterfaceC7019c f8256c;

    /* renamed from: com.xuexiang.xui.widget.textview.LoggerTextView$a */
    public static class C7017a implements InterfaceC7019c {
    }

    /* renamed from: com.xuexiang.xui.widget.textview.LoggerTextView$b */
    public static class C7018b implements InterfaceC7020d {
    }

    /* renamed from: com.xuexiang.xui.widget.textview.LoggerTextView$c */
    public interface InterfaceC7019c {
    }

    /* renamed from: com.xuexiang.xui.widget.textview.LoggerTextView$d */
    public interface InterfaceC7020d {
    }

    private int getTextRealHeight() {
        Layout layout = getLayout();
        return (layout != null ? layout.getLineTop(getLineCount()) : 0) + getCompoundPaddingTop() + getCompoundPaddingBottom();
    }

    public InterfaceC7019c getLogDecorator() {
        if (this.f8256c == null) {
            this.f8256c = new C7017a();
        }
        return this.f8256c;
    }

    public InterfaceC7020d getLogFormatter() {
        if (this.f8255b == null) {
            this.f8255b = new C7018b();
        }
        return this.f8255b;
    }
}
