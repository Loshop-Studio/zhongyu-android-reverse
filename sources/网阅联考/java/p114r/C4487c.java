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

/* renamed from: r.c */
/* loaded from: classes2.dex */
public class C4487c implements InterfaceC4464m {

    /* renamed from: a */
    public final Context f5257a;

    /* renamed from: r.c$a */
    public static class a implements InterfaceC4465n {

        /* renamed from: a */
        public final Context f5258a;

        public a(Context context) {
            this.f5258a = context;
        }

        @Override // p110q.InterfaceC4465n
        /* renamed from: b */
        public InterfaceC4464m mo5675b(C4468q c4468q) {
            return new C4487c(this.f5258a);
        }
    }

    public C4487c(Context context) {
        this.f5257a = context.getApplicationContext();
    }

    @Override // p110q.InterfaceC4464m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4464m.a mo5671b(Uri uri, int i4, int i5, C3794d c3794d) {
        if (AbstractC4330b.m5335d(i4, i5)) {
            return new InterfaceC4464m.a(new C3731b(uri), C4331c.m5338e(this.f5257a, uri));
        }
        return null;
    }

    @Override // p110q.InterfaceC4464m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo5670a(Uri uri) {
        return AbstractC4330b.m5332a(uri);
    }
}
