package p136p3;

import com.xuexiang.xui.widget.tabbar.VerticalTabLayout;

/* renamed from: p3.l */
/* loaded from: classes3.dex */
public final class RunnableC6374l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f10418a;

    /* renamed from: b */
    public final /* synthetic */ boolean f10419b;

    /* renamed from: c */
    public final /* synthetic */ VerticalTabLayout f10420c;

    public RunnableC6374l(VerticalTabLayout verticalTabLayout, int i, boolean z8) {
        this.f10420c = verticalTabLayout;
        this.f10418a = i;
        this.f10419b = z8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VerticalTabLayout.m3600a(this.f10420c, this.f10418a, this.f10419b);
    }
}
