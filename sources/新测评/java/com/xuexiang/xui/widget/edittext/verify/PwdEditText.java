package com.xuexiang.xui.widget.edittext.verify;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import com.xuexiang.xui.widget.edittext.verify.C6525a;

/* loaded from: classes4.dex */
public class PwdEditText extends AppCompatEditText {

    /* renamed from: a */
    public C6525a f6265a;

    public PwdEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m5658a();
    }

    /* renamed from: a */
    private void m5658a() {
        this.f6265a = new C6525a(null, true);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        this.f6265a.setTarget(super.onCreateInputConnection(editorInfo));
        return this.f6265a;
    }

    public void setBackSpaceListener(C6525a.a aVar) {
        this.f6265a.m5659a(aVar);
    }
}
