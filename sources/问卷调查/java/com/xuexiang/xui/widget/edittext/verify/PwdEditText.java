package com.xuexiang.xui.widget.edittext.verify;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import p070b.p113c.p114a.p116e.p126e.p127b.C0808a;

/* loaded from: classes.dex */
public class PwdEditText extends AppCompatEditText {

    /* renamed from: b */
    public C0808a f5196b;

    public PwdEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5196b = new C0808a(null, true);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        this.f5196b.setTarget(super.onCreateInputConnection(editorInfo));
        return this.f5196b;
    }

    public void setBackSpaceListener(C0808a.a aVar) {
        this.f5196b.f4524a = aVar;
    }
}
