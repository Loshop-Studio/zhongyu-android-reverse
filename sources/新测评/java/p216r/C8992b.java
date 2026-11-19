package p216r;

import coil3.util.AbstractC5213c;
import okio.Path;
import p137k.AbstractC7849u;
import p137k.C7848t;
import p290y.AbstractC9887f;
import p290y.C9892k;

/* renamed from: r.b */
/* loaded from: classes3.dex */
public final class C8992b implements InterfaceC8993c {
    @Override // p216r.InterfaceC8993c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String mo15095a(C7848t c7848t, C9892k c9892k) {
        String strM13314d;
        if (!AbstractC5213c.m3219m(c7848t) || !AbstractC9887f.m16682a(c9892k) || (strM13314d = AbstractC7849u.m13314d(c7848t)) == null) {
            return null;
        }
        Long lastModifiedAtMillis = c9892k.m16704g().metadata(Path.Companion.get$default(Path.INSTANCE, strM13314d, false, 1, (Object) null)).getLastModifiedAtMillis();
        StringBuilder sb = new StringBuilder();
        sb.append(c7848t);
        sb.append('-');
        sb.append(lastModifiedAtMillis);
        return sb.toString();
    }
}
