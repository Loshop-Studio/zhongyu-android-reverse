package p126o;

import android.graphics.Bitmap;
import coil3.AbstractC3330o;
import coil3.C3351x;
import coil3.util.AbstractC3348l;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import okio.Path;
import p154s.AbstractC6533g;
import p154s.C6538l;

/* renamed from: o.b */
/* loaded from: classes2.dex */
public final class C6253b implements InterfaceC6254c {
    @Override // p126o.InterfaceC6254c
    /* renamed from: a */
    public final String mo5855a(Object obj, C6538l c6538l) {
        String strM2269g;
        C3351x c3351x = (C3351x) obj;
        String str = c3351x.f2088c;
        if ((str == null || str.equals("file")) && c3351x.f2090e != null) {
            Bitmap.Config[] configArr = AbstractC3348l.f2083a;
            if ((!AbstractC5830k.m5325b(c3351x.f2088c, "file") || !AbstractC5830k.m5325b(AbstractC5805t.m5229i0(AbstractC3330o.m2270h(c3351x)), "android_asset")) && ((Boolean) AbstractC3330o.m2268f(c6538l, AbstractC6533g.f10883c)).booleanValue() && (strM2269g = AbstractC3330o.m2269g(c3351x)) != null) {
                Long lastModifiedAtMillis = c6538l.f10899f.metadata(Path.Companion.get$default(Path.INSTANCE, strM2269g, false, 1, (Object) null)).getLastModifiedAtMillis();
                StringBuilder sb = new StringBuilder();
                sb.append(c3351x);
                sb.append('-');
                sb.append(lastModifiedAtMillis);
                return sb.toString();
            }
        }
        return null;
    }
}
