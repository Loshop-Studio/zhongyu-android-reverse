package anet.channel;

import anet.channel.security.ISecurity;
import anet.channel.strategy.dispatch.IAmdcSign;

/* renamed from: anet.channel.d */
/* loaded from: classes3.dex */
class C4987d implements IAmdcSign {

    /* renamed from: a */
    final /* synthetic */ String f2355a;

    /* renamed from: b */
    final /* synthetic */ ISecurity f2356b;

    /* renamed from: c */
    final /* synthetic */ SessionCenter f2357c;

    public C4987d(SessionCenter sessionCenter, String str, ISecurity iSecurity) {
        this.f2357c = sessionCenter;
        this.f2355a = str;
        this.f2356b = iSecurity;
    }

    @Override // anet.channel.strategy.dispatch.IAmdcSign
    public String getAppkey() {
        return this.f2355a;
    }

    @Override // anet.channel.strategy.dispatch.IAmdcSign
    public String sign(String str) {
        return this.f2356b.sign(this.f2357c.f2296b, ISecurity.SIGN_ALGORITHM_HMAC_SHA1, getAppkey(), str);
    }

    @Override // anet.channel.strategy.dispatch.IAmdcSign
    public boolean useSecurityGuard() {
        return !this.f2356b.isSecOff();
    }
}
