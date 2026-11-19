package com.xuexiang.xui.widget.edittext.verify;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* renamed from: com.xuexiang.xui.widget.edittext.verify.a */
/* loaded from: classes5.dex */
public class C8116a extends InputConnectionWrapper {

    /* renamed from: a */
    public a f15939a;

    /* renamed from: com.xuexiang.xui.widget.edittext.verify.a$a */
    public interface a {
        /* renamed from: a */
        boolean mo12621a();
    }

    public C8116a(InputConnection inputConnection, boolean z10) {
        super(inputConnection, z10);
    }

    /* renamed from: a */
    public void m12622a(a aVar) {
        this.f15939a = aVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        a aVar = this.f15939a;
        if (aVar == null || !aVar.mo12621a()) {
            return super.deleteSurroundingText(i10, i11);
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        a aVar;
        if (keyEvent.getKeyCode() == 67 && keyEvent.getAction() == 0 && (aVar = this.f15939a) != null && aVar.mo12621a()) {
            return true;
        }
        return super.sendKeyEvent(keyEvent);
    }
}
