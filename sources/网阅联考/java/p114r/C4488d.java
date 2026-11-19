package p114r;

import android.content.Context;
import android.net.Uri;
import p057f0.C3731b;
import p076j.C3794d;
import p088l.AbstractC4330b;
import p088l.C4331c;
import p110q.C4468q;
import p110q.InterfaceC4464m;
import p110q.InterfaceC4465n;
import p122t.C4558d0;

/* renamed from: r.d */
/* loaded from: classes2.dex */
public class C4488d implements InterfaceC4464m {

    /* renamed from: a */
    public final Context f5259a;

    /* renamed from: r.d$a */
    public static class a implements InterfaceC4465n {

        /* renamed from: a */
        public final Context f5260a;

        public a(Context context) {
            this.f5260a = context;
        }

        @Override // p110q.InterfaceC4465n
        /* renamed from: b */
        public InterfaceC4464m mo5675b(C4468q c4468q) {
            return new C4488d(this.f5260a);
        }
    }

    public C4488d(Context context) {
        this.f5259a = context.getApplicationContext();
    }

    @Override // p110q.InterfaceC4464m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4464m.a mo5671b(Uri uri, int i4, int i5, C3794d c3794d) {
        if (AbstractC4330b.m5335d(i4, i5) && m5776e(c3794d)) {
            return new InterfaceC4464m.a(new C3731b(uri), C4331c.m5339g(this.f5259a, uri));
        }
        return null;
    }

    @Override // p110q.InterfaceC4464m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo5670a(Uri uri) {
        return AbstractC4330b.m5334c(uri);
    }

    /* renamed from: e */
    public final boolean m5776e(C3794d c3794d) {
        Long l4 = (Long) c3794d.m4951c(C4558d0.f5727d);
        return l4 != null && l4.longValue() == -1;
    }
}
