package p138r;

import coil3.util.AbstractC4594c;
import okio.Path;
import p087k.AbstractC6622u;
import p087k.C6621t;
import p187y.AbstractC7873f;
import p187y.C7880m;

/* renamed from: r.b */
/* loaded from: classes3.dex */
public final class C7632b implements InterfaceC7633c {
    @Override // p138r.InterfaceC7633c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String mo9070a(C6621t c6621t, C7880m c7880m) {
        String strM7580d;
        if (!AbstractC4594c.m2045m(c6621t) || !AbstractC7873f.m9637a(c7880m) || (strM7580d = AbstractC6622u.m7580d(c6621t)) == null) {
            return null;
        }
        Long lastModifiedAtMillis = c7880m.m9665g().metadata(Path.Companion.get$default(Path.INSTANCE, strM7580d, false, 1, (Object) null)).getLastModifiedAtMillis();
        StringBuilder sb = new StringBuilder();
        sb.append(c6621t);
        sb.append('-');
        sb.append(lastModifiedAtMillis);
        return sb.toString();
    }
}
