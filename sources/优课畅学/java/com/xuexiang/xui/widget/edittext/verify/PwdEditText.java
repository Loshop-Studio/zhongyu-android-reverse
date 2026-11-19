package com.xuexiang.xui.widget.edittext.verify;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import com.xuexiang.xui.widget.edittext.verify.C6931a;

/* loaded from: classes4.dex */
public class PwdEditText extends AppCompatEditText {

    /* renamed from: a */
    public C6931a f7670a;

    public PwdEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6846a();
    }

    /* renamed from: a */
    private void m6846a() {
        this.f7670a = new C6931a(null, true);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        this.f7670a.setTarget(super.onCreateInputConnection(editorInfo));
        return this.f7670a;
    }

    public void setBackSpaceListener(C6931a.a aVar) {
        this.f7670a.m6847a(aVar);
    }
}
