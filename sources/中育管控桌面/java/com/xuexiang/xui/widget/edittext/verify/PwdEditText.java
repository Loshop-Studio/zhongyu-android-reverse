package com.xuexiang.xui.widget.edittext.verify;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import com.xuexiang.xui.widget.edittext.verify.C5904a;

/* loaded from: classes3.dex */
public class PwdEditText extends AppCompatEditText {

    /* renamed from: a */
    public C5904a f4990a;

    public PwdEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4677a();
    }

    /* renamed from: a */
    private void m4677a() {
        this.f4990a = new C5904a(null, true);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        this.f4990a.setTarget(super.onCreateInputConnection(editorInfo));
        return this.f4990a;
    }

    public void setBackSpaceListener(C5904a.a aVar) {
        this.f4990a.m4678a(aVar);
    }
}
