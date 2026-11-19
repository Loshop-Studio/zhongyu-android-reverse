package p119n;

import android.webkit.MimeTypeMap;
import coil3.C3351x;
import coil3.decode.C3274o;
import coil3.decode.DataSource;
import coil3.network.AbstractC3315g;
import coil3.util.AbstractC3345i;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import okio.Okio;
import okio.Path;
import p075h6.InterfaceC5631c;
import p154s.C6538l;

/* renamed from: n.j */
/* loaded from: classes2.dex */
public final class C6205j implements InterfaceC6202g {

    /* renamed from: a */
    public final C3351x f9920a;

    /* renamed from: b */
    public final C6538l f9921b;

    public C6205j(C3351x c3351x, C6538l c6538l) {
        this.f9920a = c3351x;
        this.f9921b = c6538l;
    }

    @Override // p119n.InterfaceC6202g
    /* renamed from: a */
    public final Object mo2253a(InterfaceC5631c interfaceC5631c) {
        C3351x c3351x = this.f9920a;
        String str = c3351x.f2090e;
        if (str == null) {
            str = "";
        }
        int iM5379M = AbstractC5855p.m5379M(str, '!', 0, 6);
        if (iM5379M == -1) {
            throw new IllegalStateException(("Invalid jar:file URI: " + c3351x).toString());
        }
        Path.Companion companion = Path.INSTANCE;
        String strSubstring = str.substring(0, iM5379M);
        AbstractC5830k.m5329f(strSubstring, "substring(...)");
        String mimeTypeFromExtension = null;
        Path path = Path.Companion.get$default(companion, strSubstring, false, 1, (Object) null);
        String strSubstring2 = str.substring(iM5379M + 1, str.length());
        AbstractC5830k.m5329f(strSubstring2, "substring(...)");
        Path path2 = Path.Companion.get$default(companion, strSubstring2, false, 1, (Object) null);
        C3274o c3274oM2233a = AbstractC3315g.m2233a(path2, Okio.openZip(this.f9921b.f10899f, path), null, null, 28);
        String strM5397e0 = AbstractC5855p.m5397e0('.', path2.name(), "");
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
