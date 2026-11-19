package p000a.p052k.p053b;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import p000a.p031h.p032b.C0190e;

/* renamed from: a.k.b.z */
/* loaded from: classes.dex */
public abstract class AbstractC0346z<E> extends AbstractC0338v {

    /* renamed from: b */
    public final Activity f2121b;

    /* renamed from: c */
    public final Context f2122c;

    /* renamed from: d */
    public final Handler f2123d;

    /* renamed from: e */
    public final AbstractC0301c0 f2124e;

    public AbstractC0346z(ActivityC0326p activityC0326p) {
        Handler handler = new Handler();
        this.f2124e = new C0303d0();
        this.f2121b = activityC0326p;
        C0190e.m711f(activityC0326p, "context == null");
        this.f2122c = activityC0326p;
        C0190e.m711f(handler, "handler == null");
        this.f2123d = handler;
    }

    /* renamed from: i */
    public abstract E mo1196i();

    /* renamed from: j */
    public abstract LayoutInflater mo1197j();

    /* renamed from: k */
    public abstract boolean mo1198k(ComponentCallbacksC0320m componentCallbacksC0320m);

    /* renamed from: l */
    public abstract void mo1199l();
}
