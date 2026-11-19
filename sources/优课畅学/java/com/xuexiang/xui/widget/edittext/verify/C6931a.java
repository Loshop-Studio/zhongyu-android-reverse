package com.xuexiang.xui.widget.edittext.verify;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* renamed from: com.xuexiang.xui.widget.edittext.verify.a */
/* loaded from: classes4.dex */
public class C6931a extends InputConnectionWrapper {

    /* renamed from: com.xuexiang.xui.widget.edittext.verify.a$a */
    public interface a {
    }

    public C6931a(InputConnection inputConnection, boolean z10) {
        super(inputConnection, z10);
    }

    /* renamed from: a */
    public void m6847a(a aVar) {
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        return super.deleteSurroundingText(i10, i11);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 67) {
            keyEvent.getAction();
        }
        return super.sendKeyEvent(keyEvent);
    }
}
