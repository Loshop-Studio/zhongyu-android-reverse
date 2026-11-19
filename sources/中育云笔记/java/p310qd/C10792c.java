package p310qd;

import anet.channel.request.Request;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: qd.c */
/* loaded from: classes6.dex */
public final class C10792c {

    /* renamed from: a */
    public static final C10792c f26018a = new C10792c();

    /* renamed from: b */
    public static final Charset f26019b;

    /* renamed from: c */
    public static final Charset f26020c;

    /* renamed from: d */
    public static final Charset f26021d;

    /* renamed from: e */
    public static final Charset f26022e;

    /* renamed from: f */
    public static final Charset f26023f;

    /* renamed from: g */
    public static final Charset f26024g;

    /* renamed from: h */
    public static volatile Charset f26025h;

    /* renamed from: i */
    public static volatile Charset f26026i;

    static {
        Charset charsetForName = Charset.forName(Request.DEFAULT_CHARSET);
        AbstractC9979u.m20293f(charsetForName, "forName(...)");
        f26019b = charsetForName;
        Charset charsetForName2 = Charset.forName("UTF-16");
        AbstractC9979u.m20293f(charsetForName2, "forName(...)");
        f26020c = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16BE");
        AbstractC9979u.m20293f(charsetForName3, "forName(...)");
        f26021d = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        AbstractC9979u.m20293f(charsetForName4, "forName(...)");
        f26022e = charsetForName4;
        Charset charsetForName5 = Charset.forName("US-ASCII");
        AbstractC9979u.m20293f(charsetForName5, "forName(...)");
        f26023f = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        AbstractC9979u.m20293f(charsetForName6, "forName(...)");
        f26024g = charsetForName6;
    }

    /* renamed from: a */
    public final Charset m23081a() {
        Charset charset = f26026i;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        AbstractC9979u.m20293f(charsetForName, "forName(...)");
        f26026i = charsetForName;
        return charsetForName;
    }

    /* renamed from: b */
    public final Charset m23082b() {
        Charset charset = f26025h;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        AbstractC9979u.m20293f(charsetForName, "forName(...)");
        f26025h = charsetForName;
        return charsetForName;
    }
}
