package p145s;

import android.content.Context;
import p087k.AbstractC6622u;
import p087k.C6621t;
import p187y.C7880m;

/* renamed from: s.e */
/* loaded from: classes3.dex */
public final class C7677e implements InterfaceC7675c {
    @Override // p145s.InterfaceC7675c
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo9125a(Object obj, C7880m c7880m) {
        return m9130c(((Number) obj).intValue(), c7880m);
    }

    /* renamed from: b */
    public final boolean m9129b(int i6, Context context) {
        return context.getResources().getResourceEntryName(i6) != null;
    }

    /* renamed from: c */
    public C6621t m9130c(int i6, C7880m c7880m) {
        if (!m9129b(i6, c7880m.m9661c())) {
            return null;
        }
        return AbstractC6622u.m7586j("android.resource://" + c7880m.m9661c().getPackageName() + '/' + i6, null, 1, null);
    }
}
