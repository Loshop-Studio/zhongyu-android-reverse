package anet.channel.security;

/* renamed from: anet.channel.security.d */
/* loaded from: classes3.dex */
final class C5039d implements ISecurityFactory {
    @Override // anet.channel.security.ISecurityFactory
    public ISecurity createNonSecurity(String str) {
        return new C5036a(str);
    }

    @Override // anet.channel.security.ISecurityFactory
    public ISecurity createSecurity(String str) {
        return new C5037b(str);
    }
}
