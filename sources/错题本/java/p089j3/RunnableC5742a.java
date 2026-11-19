package p089j3;

import com.xuexiang.xui.widget.progress.CircleProgressView;

/* renamed from: j3.a */
/* loaded from: classes3.dex */
public final class RunnableC5742a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ boolean f9088a;

    /* renamed from: b */
    public final /* synthetic */ CircleProgressView f9089b;

    public RunnableC5742a(CircleProgressView circleProgressView, boolean z8) {
        this.f9089b = circleProgressView;
        this.f9088a = z8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = CircleProgressView.f4638z;
        this.f9089b.m3537a(this.f9088a);
    }
}
