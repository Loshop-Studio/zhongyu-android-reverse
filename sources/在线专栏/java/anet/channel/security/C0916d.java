package anet.channel.security;

/* renamed from: anet.channel.security.d */
/* loaded from: classes.dex */
final class C0916d implements ISecurityFactory {
    C0916d() {
    }

    @Override // anet.channel.security.ISecurityFactory
    public ISecurity createNonSecurity(String str) {
        return new C0913a(str);
    }

    @Override // anet.channel.security.ISecurityFactory
    public ISecurity createSecurity(String str) {
        return new C0914b(str);
    }
}
