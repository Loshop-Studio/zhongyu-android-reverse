package p000a.p031h.p032b;

import android.app.Activity;

/* renamed from: a.h.b.a */
/* loaded from: classes.dex */
public class RunnableC0186a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Activity f1401b;

    public RunnableC0186a(Activity activity) {
        this.f1401b = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f1401b.isFinishing() || C0188c.m687b(this.f1401b)) {
            return;
        }
        this.f1401b.recreate();
    }
}
