package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.app.C0320a;
import androidx.core.content.C0332a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p011b0.C1025h;

/* renamed from: androidx.fragment.app.h */
/* loaded from: classes.dex */
public abstract class AbstractC0459h<E> extends AbstractC0456e {

    /* renamed from: a */
    private final Activity f3187a;

    /* renamed from: b */
    private final Context f3188b;

    /* renamed from: c */
    private final Handler f3189c;

    /* renamed from: d */
    private final int f3190d;

    /* renamed from: e */
    final FragmentManager f3191e;

    AbstractC0459h(FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, new Handler(), 0);
    }

    @Override // androidx.fragment.app.AbstractC0456e
    /* renamed from: c */
    public View mo2371c(int i4) {
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0456e
    /* renamed from: d */
    public boolean mo2372d() {
        return true;
    }

    /* renamed from: e */
    Activity m2618e() {
        return this.f3187a;
    }

    /* renamed from: f */
    Context m2619f() {
        return this.f3188b;
    }

    /* renamed from: g */
    Handler m2620g() {
        return this.f3189c;
    }

    /* renamed from: h */
    public void mo2379h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: i */
    public abstract E mo2380i();

    /* renamed from: j */
    public LayoutInflater mo2381j() {
        return LayoutInflater.from(this.f3188b);
    }

    @Deprecated
    /* renamed from: k */
    public void m2621k(Fragment fragment, String[] strArr, int i4) {
    }

    /* renamed from: l */
    public boolean mo2382l(Fragment fragment) {
        return true;
    }

    /* renamed from: m */
    public boolean mo2383m(String str) {
        return false;
    }

    /* renamed from: n */
    public void m2622n(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i4, Bundle bundle) {
        if (i4 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        C0332a.m1810h(this.f3188b, intent, bundle);
    }

    @Deprecated
    /* renamed from: o */
    public void m2623o(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i4, Intent intent, int i5, int i6, int i7, Bundle bundle) throws IntentSender.SendIntentException {
        if (i4 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        C0320a.m1763s(this.f3187a, intentSender, i4, intent, i5, i6, i7, bundle);
    }

    /* renamed from: p */
    public void mo2384p() {
    }

    AbstractC0459h(Activity activity, Context context, Handler handler, int i4) {
        this.f3191e = new C0462k();
        this.f3187a = activity;
        this.f3188b = (Context) C1025h.m4783g(context, "context == null");
        this.f3189c = (Handler) C1025h.m4783g(handler, "handler == null");
        this.f3190d = i4;
    }
}
