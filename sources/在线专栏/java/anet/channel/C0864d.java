package anet.channel;

import anet.channel.security.ISecurity;
import anet.channel.strategy.dispatch.IAmdcSign;

/* renamed from: anet.channel.d */
/* loaded from: classes.dex */
class C0864d implements IAmdcSign {

    /* renamed from: a */
    final /* synthetic */ String f5077a;

    /* renamed from: b */
    final /* synthetic */ ISecurity f5078b;

    /* renamed from: c */
    final /* synthetic */ SessionCenter f5079c;

    C0864d(SessionCenter sessionCenter, String str, ISecurity iSecurity) {
        this.f5079c = sessionCenter;
        this.f5077a = str;
        this.f5078b = iSecurity;
    }

    @Override // anet.channel.strategy.dispatch.IAmdcSign
    public String getAppkey() {
        return this.f5077a;
    }

    @Override // anet.channel.strategy.dispatch.IAmdcSign
    public String sign(String str) {
        return this.f5078b.sign(this.f5079c.f5018b, ISecurity.SIGN_ALGORITHM_HMAC_SHA1, getAppkey(), str);
    }

    @Override // anet.channel.strategy.dispatch.IAmdcSign
    public boolean useSecurityGuard() {
        return !this.f5078b.isSecOff();
    }
}
