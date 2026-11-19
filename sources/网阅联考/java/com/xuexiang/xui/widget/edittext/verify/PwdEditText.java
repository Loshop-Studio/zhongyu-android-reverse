package com.xuexiang.xui.widget.edittext.verify;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import com.xuexiang.xui.widget.edittext.verify.C3565a;

/* loaded from: classes2.dex */
public class PwdEditText extends AppCompatEditText {

    /* renamed from: a */
    public C3565a f3469a;

    public PwdEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4300a();
    }

    /* renamed from: a */
    public final void m4300a() {
        this.f3469a = new C3565a(null, true);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        this.f3469a.setTarget(super.onCreateInputConnection(editorInfo));
        return this.f3469a;
    }

    public void setBackSpaceListener(C3565a.a aVar) {
        this.f3469a.m4301a(aVar);
    }
}
