package com.xuexiang.xui.widget.edittext.verify;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* renamed from: com.xuexiang.xui.widget.edittext.verify.a */
/* loaded from: classes2.dex */
public class C3565a extends InputConnectionWrapper {

    /* renamed from: com.xuexiang.xui.widget.edittext.verify.a$a */
    public interface a {
    }

    public C3565a(InputConnection inputConnection, boolean z3) {
        super(inputConnection, z3);
    }

    /* renamed from: a */
    public void m4301a(a aVar) {
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i4, int i5) {
        return super.deleteSurroundingText(i4, i5);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 67) {
            keyEvent.getAction();
        }
        return super.sendKeyEvent(keyEvent);
    }
}
