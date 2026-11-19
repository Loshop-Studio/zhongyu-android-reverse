package okhttp3;

import java.nio.charset.Charset;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5862w;
import p185v7.AbstractC6683l;

/* renamed from: okhttp3.u */
/* loaded from: classes4.dex */
public final class C6333u {

    /* renamed from: d */
    public static final Pattern f10275d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e */
    public static final Pattern f10276e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    public final String f10277a;

    /* renamed from: b */
    public final String f10278b;

    /* renamed from: c */
    public final String[] f10279c;

    public C6333u(String str, String[] strArr, String str2) {
        this.f10277a = str;
        this.f10278b = str2;
        this.f10279c = strArr;
    }

    /* renamed from: a */
    public final Charset m5975a(Charset charset) {
        String str;
        String[] strArr = this.f10279c;
        int i = 0;
        int iM6373m = AbstractC6683l.m6373m(0, strArr.length - 1, 2);
        if (iM6373m < 0) {
            str = null;
            break;
        }
        while (!AbstractC5862w.m5415v(strArr[i], "charset", true)) {
            if (i == iM6373m) {
                str = null;
                break;
            }
            i += 2;
        }
        str = strArr[i + 1];
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C6333u) && AbstractC5830k.m5325b(((C6333u) obj).f10277a, this.f10277a);
    }

    public final int hashCode() {
        return this.f10277a.hashCode();
    }

    public final String toString() {
        return this.f10277a;
    }
}
