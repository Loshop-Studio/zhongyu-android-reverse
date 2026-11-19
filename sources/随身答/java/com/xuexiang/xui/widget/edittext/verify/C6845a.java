package com.xuexiang.xui.widget.edittext.verify;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* renamed from: com.xuexiang.xui.widget.edittext.verify.a */
/* loaded from: classes4.dex */
public class C6845a extends InputConnectionWrapper {

    /* renamed from: com.xuexiang.xui.widget.edittext.verify.a$a */
    public interface a {
    }

    public C6845a(InputConnection inputConnection, boolean z9) {
        super(inputConnection, z9);
    }

    /* renamed from: a */
    public void m6765a(a aVar) {
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i9, int i10) {
        return super.deleteSurroundingText(i9, i10);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 67) {
            keyEvent.getAction();
        }
        return super.sendKeyEvent(keyEvent);
    }
}
