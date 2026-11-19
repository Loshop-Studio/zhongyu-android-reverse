package p227s;

import android.content.Context;
import p137k.AbstractC7849u;
import p137k.C7848t;
import p290y.C9892k;

/* renamed from: s.e */
/* loaded from: classes3.dex */
public final class C9097e implements InterfaceC9095c {
    @Override // p227s.InterfaceC9095c
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo15347a(Object obj, C9892k c9892k) {
        return m15352c(((Number) obj).intValue(), c9892k);
    }

    /* renamed from: b */
    public final boolean m15351b(int i10, Context context) {
        return context.getResources().getResourceEntryName(i10) != null;
    }

    /* renamed from: c */
    public C7848t m15352c(int i10, C9892k c9892k) {
        if (!m15351b(i10, c9892k.m16700c())) {
            return null;
        }
        return AbstractC7849u.m13320j("android.resource://" + c9892k.m16700c().getPackageName() + '/' + i10, null, 1, null);
    }
}
