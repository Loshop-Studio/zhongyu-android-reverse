package com.xuexiang.xui.widget.edittext.verify;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import com.xuexiang.xui.widget.edittext.verify.C8116a;

/* loaded from: classes5.dex */
public class PwdEditText extends AppCompatEditText {

    /* renamed from: c */
    public C8116a f15919c;

    public PwdEditText(Context context) {
        super(context);
        m12606a();
    }

    /* renamed from: a */
    private void m12606a() {
        this.f15919c = new C8116a(null, true);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        this.f15919c.setTarget(super.onCreateInputConnection(editorInfo));
        return this.f15919c;
    }

    public void setBackSpaceListener(C8116a.a aVar) {
        this.f15919c.m12622a(aVar);
    }

    public PwdEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12606a();
    }

    public PwdEditText(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m12606a();
    }
}
