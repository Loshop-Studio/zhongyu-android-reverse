package com.xuexiang.xui.widget.edittext.verify;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import p113m2.C6099b;
import p113m2.InterfaceC6098a;

/* loaded from: classes3.dex */
public class PwdEditText extends AppCompatEditText {

    /* renamed from: a */
    public final C6099b f4302a;

    public PwdEditText(Context context) {
        super(context);
        this.f4302a = new C6099b(null, true);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        this.f4302a.setTarget(super.onCreateInputConnection(editorInfo));
        return this.f4302a;
    }

    public void setBackSpaceListener(InterfaceC6098a interfaceC6098a) {
        this.f4302a.f9743a = interfaceC6098a;
    }

    public PwdEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4302a = new C6099b(null, true);
    }

    public PwdEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4302a = new C6099b(null, true);
    }
}
