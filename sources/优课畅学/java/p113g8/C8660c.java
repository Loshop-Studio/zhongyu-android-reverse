package p113g8;

import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: g8.c */
/* loaded from: classes5.dex */
public final class C8660c {

    /* renamed from: a */
    public static final C8660c f16205a = new C8660c();

    /* renamed from: b */
    public static final Charset f16206b;

    /* renamed from: c */
    public static final Charset f16207c;

    /* renamed from: d */
    public static final Charset f16208d;

    /* renamed from: e */
    public static final Charset f16209e;

    /* renamed from: f */
    public static final Charset f16210f;

    /* renamed from: g */
    public static final Charset f16211g;

    /* renamed from: h */
    public static volatile Charset f16212h;

    /* renamed from: i */
    public static volatile Charset f16213i;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        AbstractC9133u.m16132f(charsetForName, "forName(...)");
        f16206b = charsetForName;
        Charset charsetForName2 = Charset.forName("UTF-16");
        AbstractC9133u.m16132f(charsetForName2, "forName(...)");
        f16207c = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16BE");
        AbstractC9133u.m16132f(charsetForName3, "forName(...)");
        f16208d = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        AbstractC9133u.m16132f(charsetForName4, "forName(...)");
        f16209e = charsetForName4;
        Charset charsetForName5 = Charset.forName("US-ASCII");
        AbstractC9133u.m16132f(charsetForName5, "forName(...)");
        f16210f = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        AbstractC9133u.m16132f(charsetForName6, "forName(...)");
        f16211g = charsetForName6;
    }

    /* renamed from: a */
    public final Charset m13948a() {
        Charset charset = f16213i;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        AbstractC9133u.m16132f(charsetForName, "forName(...)");
        f16213i = charsetForName;
        return charsetForName;
    }

    /* renamed from: b */
    public final Charset m13949b() {
        Charset charset = f16212h;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        AbstractC9133u.m16132f(charsetForName, "forName(...)");
        f16212h = charsetForName;
        return charsetForName;
    }
}
