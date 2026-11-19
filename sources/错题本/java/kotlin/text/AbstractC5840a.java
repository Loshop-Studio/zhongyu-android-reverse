package kotlin.text;

import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: kotlin.text.a */
/* loaded from: classes4.dex */
public abstract class AbstractC5840a {

    /* renamed from: a */
    public static final Charset f9235a;

    /* renamed from: b */
    public static final Charset f9236b;

    /* renamed from: c */
    public static volatile Charset f9237c;

    /* renamed from: d */
    public static volatile Charset f9238d;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        AbstractC5830k.m5329f(charsetForName, "forName(...)");
        f9235a = charsetForName;
        AbstractC5830k.m5329f(Charset.forName("UTF-16"), "forName(...)");
        AbstractC5830k.m5329f(Charset.forName("UTF-16BE"), "forName(...)");
        AbstractC5830k.m5329f(Charset.forName("UTF-16LE"), "forName(...)");
        AbstractC5830k.m5329f(Charset.forName("US-ASCII"), "forName(...)");
        Charset charsetForName2 = Charset.forName("ISO-8859-1");
        AbstractC5830k.m5329f(charsetForName2, "forName(...)");
        f9236b = charsetForName2;
    }
}
