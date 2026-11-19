package p119n;

import android.webkit.MimeTypeMap;
import coil3.AbstractC3330o;
import coil3.C3351x;
import coil3.decode.C3274o;
import coil3.decode.DataSource;
import coil3.network.AbstractC3315g;
import coil3.util.AbstractC3345i;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import okio.Path;
import p075h6.InterfaceC5631c;
import p154s.C6538l;

/* renamed from: n.h */
/* loaded from: classes2.dex */
public final class C6203h implements InterfaceC6202g {

    /* renamed from: a */
    public final C3351x f9915a;

    /* renamed from: b */
    public final C6538l f9916b;

    public C6203h(C3351x c3351x, C6538l c6538l) {
        this.f9915a = c3351x;
        this.f9916b = c6538l;
    }

    @Override // p119n.InterfaceC6202g
    /* renamed from: a */
    public final Object mo2253a(InterfaceC5631c interfaceC5631c) {
        Path.Companion companion = Path.INSTANCE;
        String strM2269g = AbstractC3330o.m2269g(this.f9915a);
        if (strM2269g == null) {
            throw new IllegalStateException("filePath == null");
        }
        String mimeTypeFromExtension = null;
        Path path = Path.Companion.get$default(companion, strM2269g, false, 1, (Object) null);
        C3274o c3274oM2233a = AbstractC3315g.m2233a(path, this.f9916b.f10899f, null, null, 28);
        String strM5397e0 = AbstractC5855p.m5397e0('.', path.name(), "");
        if (!AbstractC5855p.m5382P(strM5397e0)) {
            String lowerCase = strM5397e0.toLowerCase(Locale.ROOT);
            AbstractC5830k.m5329f(lowerCase, "toLowerCase(...)");
            mimeTypeFromExtension = (String) AbstractC3345i.f2079a.get(lowerCase);
            if (mimeTypeFromExtension == null) {
                mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
            }
        }
        return new C6206k(c3274oM2233a, mimeTypeFromExtension, DataSource.DISK);
    }
}
