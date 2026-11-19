package p297q;

import android.content.Context;
import p212k.AbstractC9767u;
import p212k.C9766t;
import p380w.C11634n;

/* renamed from: q.e */
/* loaded from: classes3.dex */
public final class C10689e implements InterfaceC10687c {
    @Override // p297q.InterfaceC10687c
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo22645a(Object obj, C11634n c11634n) {
        return m22650c(((Number) obj).intValue(), c11634n);
    }

    /* renamed from: b */
    public final boolean m22649b(int i10, Context context) {
        return context.getResources().getResourceEntryName(i10) != null;
    }

    /* renamed from: c */
    public C9766t m22650c(int i10, C11634n c11634n) {
        if (!m22649b(i10, c11634n.m25743c())) {
            return null;
        }
        return AbstractC9767u.m19696j("android.resource://" + c11634n.m25743c().getPackageName() + '/' + i10, null, 1, null);
    }
}
