package p136p3;

import com.xuexiang.xui.widget.tabbar.VerticalTabLayout;

/* renamed from: p3.k */
/* loaded from: classes3.dex */
public final class RunnableC6373k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f10416a;

    /* renamed from: b */
    public final /* synthetic */ VerticalTabLayout f10417b;

    public /* synthetic */ RunnableC6373k(VerticalTabLayout verticalTabLayout, int i) {
        this.f10416a = i;
        this.f10417b = verticalTabLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10416a) {
            case 0:
                this.f10417b.f4961b.m6028a(0.0f);
                break;
            case 1:
                C6380r c6380r = this.f10417b.f4961b;
                c6380r.m6029b(c6380r.f10439h.getSelectedTabPosition());
                break;
            case 2:
                C6380r c6380r2 = this.f10417b.f4961b;
                c6380r2.m6029b(c6380r2.f10439h.getSelectedTabPosition());
                break;
            default:
                C6380r c6380r3 = this.f10417b.f4961b;
                c6380r3.m6029b(c6380r3.f10439h.getSelectedTabPosition());
                break;
        }
    }
}
