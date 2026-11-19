package p000a.p052k.p053b;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import p000a.p021e.C0129a;
import p000a.p052k.p053b.C0333s0;

/* renamed from: a.k.b.r0 */
/* loaded from: classes.dex */
public class RunnableC0331r0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AbstractC0337u0 f2056b;

    /* renamed from: c */
    public final /* synthetic */ C0129a f2057c;

    /* renamed from: d */
    public final /* synthetic */ Object f2058d;

    /* renamed from: e */
    public final /* synthetic */ C0333s0.b f2059e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList f2060f;

    /* renamed from: g */
    public final /* synthetic */ View f2061g;

    /* renamed from: h */
    public final /* synthetic */ ComponentCallbacksC0320m f2062h;

    /* renamed from: i */
    public final /* synthetic */ ComponentCallbacksC0320m f2063i;

    /* renamed from: j */
    public final /* synthetic */ boolean f2064j;

    /* renamed from: k */
    public final /* synthetic */ ArrayList f2065k;

    /* renamed from: l */
    public final /* synthetic */ Object f2066l;

    /* renamed from: m */
    public final /* synthetic */ Rect f2067m;

    public RunnableC0331r0(AbstractC0337u0 abstractC0337u0, C0129a c0129a, Object obj, C0333s0.b bVar, ArrayList arrayList, View view, ComponentCallbacksC0320m componentCallbacksC0320m, ComponentCallbacksC0320m componentCallbacksC0320m2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.f2056b = abstractC0337u0;
        this.f2057c = c0129a;
        this.f2058d = obj;
        this.f2059e = bVar;
        this.f2060f = arrayList;
        this.f2061g = view;
        this.f2062h = componentCallbacksC0320m;
        this.f2063i = componentCallbacksC0320m2;
        this.f2064j = z;
        this.f2065k = arrayList2;
        this.f2066l = obj2;
        this.f2067m = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0129a<String, View> c0129aM1204e = C0333s0.m1204e(this.f2056b, this.f2057c, this.f2058d, this.f2059e);
        if (c0129aM1204e != null) {
            this.f2060f.addAll(c0129aM1204e.values());
            this.f2060f.add(this.f2061g);
        }
        C0333s0.m1202c(this.f2062h, this.f2063i, this.f2064j, c0129aM1204e, false);
        Object obj = this.f2058d;
        if (obj != null) {
            this.f2056b.mo1232x(obj, this.f2065k, this.f2060f);
            View viewM1210k = C0333s0.m1210k(c0129aM1204e, this.f2059e, this.f2066l, this.f2064j);
            if (viewM1210k != null) {
                this.f2056b.m1239j(viewM1210k, this.f2067m);
            }
        }
    }
}
