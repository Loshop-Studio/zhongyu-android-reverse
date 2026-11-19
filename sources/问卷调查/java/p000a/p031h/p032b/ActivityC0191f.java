package p000a.p031h.p032b;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import p000a.p031h.p043j.C0256e;
import p000a.p057m.AbstractC0355d;
import p000a.p057m.C0359h;
import p000a.p057m.FragmentC0366o;
import p000a.p057m.InterfaceC0358g;

/* renamed from: a.h.b.f */
/* loaded from: classes.dex */
public class ActivityC0191f extends Activity implements InterfaceC0358g, C0256e.a {

    /* renamed from: b */
    public C0359h f1424b = new C0359h(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0256e.m840a(decorView, keyEvent)) {
            return C0256e.m841b(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0256e.m840a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // p000a.p031h.p043j.C0256e.a
    /* renamed from: i */
    public boolean mo100i(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentC0366o.m1292c(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C0359h c0359h = this.f1424b;
        AbstractC0355d.b bVar = AbstractC0355d.b.CREATED;
        c0359h.m1281c("markState");
        c0359h.m1281c("setCurrentState");
        c0359h.m1283f(bVar);
        super.onSaveInstanceState(bundle);
    }
}
