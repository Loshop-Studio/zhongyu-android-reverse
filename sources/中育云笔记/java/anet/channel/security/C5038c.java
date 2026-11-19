package anet.channel.security;

/* renamed from: anet.channel.security.c */
/* loaded from: classes3.dex */
public class C5038c {

    /* renamed from: a */
    private static volatile ISecurityFactory f2547a;

    /* renamed from: a */
    public static ISecurityFactory m2410a() {
        if (f2547a == null) {
            f2547a = new C5039d();
        }
        return f2547a;
    }
}
