package p138r;

import coil3.util.AbstractC4595d;
import kotlin.jvm.internal.Intrinsics;
import p087k.C6621t;
import p187y.C7880m;

/* renamed from: r.a */
/* loaded from: classes3.dex */
public final class C7631a implements InterfaceC7633c {
    @Override // p138r.InterfaceC7633c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String mo9070a(C6621t c6621t, C7880m c7880m) {
        if (!Intrinsics.areEqual(c6621t.m7575c(), "android.resource")) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c6621t);
        sb.append(':');
        sb.append(AbstractC4595d.m2053d(c7880m.m9661c().getResources().getConfiguration()));
        return sb.toString();
    }
}
