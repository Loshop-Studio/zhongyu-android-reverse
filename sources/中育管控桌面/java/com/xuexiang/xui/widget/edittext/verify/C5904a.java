package com.xuexiang.xui.widget.edittext.verify;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* renamed from: com.xuexiang.xui.widget.edittext.verify.a */
/* loaded from: classes3.dex */
public class C5904a extends InputConnectionWrapper {

    /* renamed from: com.xuexiang.xui.widget.edittext.verify.a$a */
    public interface a {
    }

    public C5904a(InputConnection inputConnection, boolean z6) {
        super(inputConnection, z6);
    }

    /* renamed from: a */
    public void m4678a(a aVar) {
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i6, int i7) {
        return super.deleteSurroundingText(i6, i7);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 67) {
            keyEvent.getAction();
        }
        return super.sendKeyEvent(keyEvent);
    }
}
