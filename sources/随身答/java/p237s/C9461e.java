package p237s;

import android.content.Context;
import p151k.AbstractC8248s;
import p151k.C8247r;
import p297y.C9932m;

/* renamed from: s.e */
/* loaded from: classes3.dex */
public final class C9461e implements InterfaceC9459c {
    @Override // p237s.InterfaceC9459c
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo15625a(Object obj, C9932m c9932m) {
        return m15630c(((Number) obj).intValue(), c9932m);
    }

    /* renamed from: b */
    public final boolean m15629b(int i9, Context context) {
        return context.getResources().getResourceEntryName(i9) != null;
    }

    /* renamed from: c */
    public C8247r m15630c(int i9, C9932m c9932m) {
        if (!m15629b(i9, c9932m.m17108c())) {
            return null;
        }
        return AbstractC8248s.m13288j("android.resource://" + c9932m.m17108c().getPackageName() + '/' + i9, null, 1, null);
    }
}
