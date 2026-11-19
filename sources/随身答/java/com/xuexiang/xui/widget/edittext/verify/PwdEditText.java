package com.xuexiang.xui.widget.edittext.verify;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import com.xuexiang.xui.widget.edittext.verify.C6845a;

/* loaded from: classes4.dex */
public class PwdEditText extends AppCompatEditText {

    /* renamed from: a */
    public C6845a f7523a;

    public PwdEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6764a();
    }

    /* renamed from: a */
    private void m6764a() {
        this.f7523a = new C6845a(null, true);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        this.f7523a.setTarget(super.onCreateInputConnection(editorInfo));
        return this.f7523a;
    }

    public void setBackSpaceListener(C6845a.a aVar) {
        this.f7523a.m6765a(aVar);
    }
}
