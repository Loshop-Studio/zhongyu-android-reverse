package p227r;

import coil3.util.AbstractC5349d;
import kotlin.jvm.internal.Intrinsics;
import p151k.C8247r;
import p297y.C9932m;

/* renamed from: r.a */
/* loaded from: classes3.dex */
public final class C9386a implements InterfaceC9388c {
    @Override // p227r.InterfaceC9388c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String mo15444a(C8247r c8247r, C9932m c9932m) {
        if (!Intrinsics.areEqual(c8247r.m13277c(), "android.resource")) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c8247r);
        sb.append(':');
        sb.append(AbstractC5349d.m2944d(c9932m.m17108c().getResources().getConfiguration()));
        return sb.toString();
    }
}
