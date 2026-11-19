package p227r;

import coil3.util.AbstractC5348c;
import okio.Path;
import p151k.AbstractC8248s;
import p151k.C8247r;
import p297y.AbstractC9925f;
import p297y.C9932m;

/* renamed from: r.b */
/* loaded from: classes3.dex */
public final class C9387b implements InterfaceC9388c {
    @Override // p227r.InterfaceC9388c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String mo15444a(C8247r c8247r, C9932m c9932m) {
        String strM13282d;
        if (!AbstractC5348c.m2936m(c8247r) || !AbstractC9925f.m17083a(c9932m) || (strM13282d = AbstractC8248s.m13282d(c8247r)) == null) {
            return null;
        }
        Long lastModifiedAtMillis = c9932m.m17112g().metadata(Path.Companion.get$default(Path.INSTANCE, strM13282d, false, 1, (Object) null)).getLastModifiedAtMillis();
        StringBuilder sb = new StringBuilder();
        sb.append(c8247r);
        sb.append('-');
        sb.append(lastModifiedAtMillis);
        return sb.toString();
    }
}
