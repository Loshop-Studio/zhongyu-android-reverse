package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.collection.C0253g;
import androidx.core.view.C0343f;
import androidx.lifecycle.AbstractC0496f;
import androidx.lifecycle.C0506n;
import androidx.lifecycle.FragmentC0516x;
import androidx.lifecycle.InterfaceC0504l;

/* loaded from: classes.dex */
public class ComponentActivity extends Activity implements InterfaceC0504l, C0343f.a {
    private C0253g<Class<? extends C0310a>, C0310a> mExtraDataMap = new C0253g<>();
    private C0506n mLifecycleRegistry = new C0506n(this);

    @Deprecated
    /* renamed from: androidx.core.app.ComponentActivity$a */
    public static class C0310a {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0343f.m1932d(decorView, keyEvent)) {
            return C0343f.m1933e(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0343f.m1932d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Deprecated
    public <T extends C0310a> T getExtraData(Class<T> cls) {
        return (T) this.mExtraDataMap.get(cls);
    }

    public AbstractC0496f getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentC0516x.m2915f(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        this.mLifecycleRegistry.m2892j(AbstractC0496f.c.CREATED);
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public void putExtraData(C0310a c0310a) {
        this.mExtraDataMap.put(c0310a.getClass(), c0310a);
    }

    @Override // androidx.core.view.C0343f.a
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
