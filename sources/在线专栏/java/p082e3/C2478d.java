package p082e3;

import java.nio.charset.Charset;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: e3.d */
/* loaded from: classes.dex */
public final class C2478d {

    /* renamed from: a */
    @NotNull
    public static final C2478d f10081a = new C2478d();

    /* renamed from: b */
    @NotNull
    public static final Charset f10082b;

    /* renamed from: c */
    @NotNull
    public static final Charset f10083c;

    /* renamed from: d */
    @NotNull
    public static final Charset f10084d;

    /* renamed from: e */
    @NotNull
    public static final Charset f10085e;

    /* renamed from: f */
    @NotNull
    public static final Charset f10086f;

    /* renamed from: g */
    @NotNull
    public static final Charset f10087g;

    /* renamed from: h */
    @Nullable
    private static Charset f10088h;

    /* renamed from: i */
    @Nullable
    private static Charset f10089i;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        C2769l.m9240d(charsetForName, "forName(\"UTF-8\")");
        f10082b = charsetForName;
        Charset charsetForName2 = Charset.forName("UTF-16");
        C2769l.m9240d(charsetForName2, "forName(\"UTF-16\")");
        f10083c = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16BE");
        C2769l.m9240d(charsetForName3, "forName(\"UTF-16BE\")");
        f10084d = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        C2769l.m9240d(charsetForName4, "forName(\"UTF-16LE\")");
        f10085e = charsetForName4;
        Charset charsetForName5 = Charset.forName("US-ASCII");
        C2769l.m9240d(charsetForName5, "forName(\"US-ASCII\")");
        f10086f = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        C2769l.m9240d(charsetForName6, "forName(\"ISO-8859-1\")");
        f10087g = charsetForName6;
    }

    private C2478d() {
    }

    @NotNull
    /* renamed from: a */
    public final Charset m8264a() {
        Charset charset = f10089i;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        C2769l.m9240d(charsetForName, "forName(\"UTF-32BE\")");
        f10089i = charsetForName;
        return charsetForName;
    }

    @NotNull
    /* renamed from: b */
    public final Charset m8265b() {
        Charset charset = f10088h;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        C2769l.m9240d(charsetForName, "forName(\"UTF-32LE\")");
        f10088h = charsetForName;
        return charsetForName;
    }
}
