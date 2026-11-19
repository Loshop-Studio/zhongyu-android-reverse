package p038c0;

import android.app.Notification;

/* renamed from: c0.j */
/* loaded from: classes3.dex */
public class RunnableC5214j implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ Notification f3087c;

    /* renamed from: d */
    public final /* synthetic */ Notification f3088d;

    /* renamed from: e */
    public final /* synthetic */ RunnableC5213i f3089e;

    public RunnableC5214j(RunnableC5213i runnableC5213i, Notification notification, Notification notification2) {
        this.f3089e = runnableC5213i;
        this.f3087c = notification;
        this.f3088d = notification2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f3089e.f3086i.mo2778a(this.f3087c, this.f3088d);
    }
}
