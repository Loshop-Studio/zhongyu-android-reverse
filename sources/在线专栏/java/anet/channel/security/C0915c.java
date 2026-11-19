package anet.channel.security;

/* renamed from: anet.channel.security.c */
/* loaded from: classes.dex */
public class C0915c {

    /* renamed from: a */
    private static volatile ISecurityFactory f5269a;

    /* renamed from: a */
    public static ISecurityFactory m4519a() {
        if (f5269a == null) {
            f5269a = new C0916d();
        }
        return f5269a;
    }
}
