package com.zykj.study.provide;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.zykj.study.bean.ClientCodeLiveData;
import javax.inject.Inject;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p136i9.C8899b0;
import p136i9.C8903d0;
import p136i9.InterfaceC8926x;

@StabilityInferred(parameters = 0)
@Keep
/* loaded from: classes3.dex */
public final class ClientCodeInterceptor implements InterfaceC8926x {
    public static final int $stable;
    public static final String CLIENT_CODE = "ClientCode";
    public static final C7735a Companion;
    private static final String TAG;

    @Inject
    public ClientCodeLiveData clientCodeLiveData;

    /* renamed from: com.zykj.study.provide.ClientCodeInterceptor$a */
    public static final class C7735a {
        public /* synthetic */ C7735a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C7735a() {
        }
    }

    static {
        C7735a c7735a = new C7735a(null);
        Companion = c7735a;
        $stable = 8;
        String name = c7735a.getClass().getName();
        AbstractC9133u.m16132f(name, "getName(...)");
        TAG = name;
    }

    @Inject
    public ClientCodeInterceptor() {
    }

    public final ClientCodeLiveData getClientCodeLiveData() {
        ClientCodeLiveData clientCodeLiveData = this.clientCodeLiveData;
        if (clientCodeLiveData != null) {
            return clientCodeLiveData;
        }
        AbstractC9133u.m16151y("clientCodeLiveData");
        return null;
    }

    @Override // p136i9.InterfaceC8926x
    public C8903d0 intercept(InterfaceC8926x.a chain) {
        AbstractC9133u.m16133g(chain, "chain");
        C8899b0.a aVarM15049i = chain.mo15332a().m15049i();
        String value = getClientCodeLiveData().getValue();
        if (value != null) {
            aVarM15049i.m15067o(CLIENT_CODE, value);
        }
        return chain.mo15333b(aVarM15049i.m15055b());
    }

    public final void setClientCodeLiveData(ClientCodeLiveData clientCodeLiveData) {
        AbstractC9133u.m16133g(clientCodeLiveData, "<set-?>");
        this.clientCodeLiveData = clientCodeLiveData;
    }
}
