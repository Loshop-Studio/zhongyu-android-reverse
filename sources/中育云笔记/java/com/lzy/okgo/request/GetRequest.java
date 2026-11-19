package com.lzy.okgo.request;

import com.lzy.okgo.request.base.NoBodyRequest;
import je.AbstractC9744x;
import je.C9743w;

/* loaded from: classes5.dex */
public class GetRequest<T> extends NoBodyRequest<T, GetRequest<T>> {
    public GetRequest(String str) {
        super(str);
    }

    @Override // com.lzy.okgo.request.base.Request
    /* renamed from: c */
    public C9743w mo9676c(AbstractC9744x abstractC9744x) {
        return m9678n(abstractC9744x).m19598f().m19608p(this.f12717c).m19607o(this.f12720f).m19595b();
    }
}
