package com.friday.login.service;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
@Keep
/* loaded from: classes4.dex */
public final class GatewayBean {
    public static final int $stable = 8;
    private String code;
    private String name;
    private String server;

    public GatewayBean(String str, String str2, String code) {
        AbstractC9979u.m20294g(code, "code");
        this.name = str;
        this.server = str2;
        this.code = code;
    }

    public static /* synthetic */ GatewayBean copy$default(GatewayBean gatewayBean, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = gatewayBean.name;
        }
        if ((i10 & 2) != 0) {
            str2 = gatewayBean.server;
        }
        if ((i10 & 4) != 0) {
            str3 = gatewayBean.code;
        }
        return gatewayBean.copy(str, str2, str3);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.server;
    }

    public final String component3() {
        return this.code;
    }

    public final GatewayBean copy(String str, String str2, String code) {
        AbstractC9979u.m20294g(code, "code");
        return new GatewayBean(str, str2, code);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GatewayBean)) {
            return false;
        }
        GatewayBean gatewayBean = (GatewayBean) obj;
        return AbstractC9979u.m20289b(this.name, gatewayBean.name) && AbstractC9979u.m20289b(this.server, gatewayBean.server) && AbstractC9979u.m20289b(this.code, gatewayBean.code);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getName() {
        return this.name;
    }

    public final String getServer() {
        return this.server;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.server;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.code.hashCode();
    }

    public final void setCode(String str) {
        AbstractC9979u.m20294g(str, "<set-?>");
        this.code = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setServer(String str) {
        this.server = str;
    }

    public String toString() {
        return "GatewayBean(name=" + this.name + ", server=" + this.server + ", code=" + this.code + ")";
    }

    public /* synthetic */ GatewayBean(String str, String str2, String str3, int i10, AbstractC9972n abstractC9972n) {
        this(str, str2, (i10 & 4) != 0 ? "" : str3);
    }
}
