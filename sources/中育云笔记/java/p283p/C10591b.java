package p283p;

import coil3.util.AbstractC5490c;
import okio.Path;
import p212k.AbstractC9767u;
import p212k.C9766t;
import p380w.AbstractC11628h;
import p380w.C11634n;

/* renamed from: p.b */
/* loaded from: classes3.dex */
public final class C10591b implements InterfaceC10592c {
    @Override // p283p.InterfaceC10592c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String mo22414a(C9766t c9766t, C11634n c11634n) {
        String strM19690d;
        if (!AbstractC5490c.m3313m(c9766t) || !AbstractC11628h.m25719a(c11634n) || (strM19690d = AbstractC9767u.m19690d(c9766t)) == null) {
            return null;
        }
        Long lastModifiedAtMillis = c11634n.m25747g().metadata(Path.Companion.get$default(Path.Companion, strM19690d, false, 1, (Object) null)).getLastModifiedAtMillis();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c9766t);
        sb2.append('-');
        sb2.append(lastModifiedAtMillis);
        return sb2.toString();
    }
}
