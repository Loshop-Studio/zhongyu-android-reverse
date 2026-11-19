package com.lzy.okgo.request.base;

import com.lzy.okgo.request.base.NoBodyRequest;
import je.AbstractC9744x;
import je.C9743w;
import p146f7.AbstractC9202a;

/* loaded from: classes5.dex */
public abstract class NoBodyRequest<T, R extends NoBodyRequest> extends Request<T, R> {
    public NoBodyRequest(String str) {
        super(str);
    }

    @Override // com.lzy.okgo.request.base.Request
    /* renamed from: d */
    public AbstractC9744x mo9677d() {
        return null;
    }

    /* renamed from: n */
    public C9743w.a m9678n(AbstractC9744x abstractC9744x) {
        this.f12717c = AbstractC9202a.m18097c(this.f12718d, this.f12724j.f12695c);
        return AbstractC9202a.m18095a(new C9743w.a(), this.f12725k);
    }
}
