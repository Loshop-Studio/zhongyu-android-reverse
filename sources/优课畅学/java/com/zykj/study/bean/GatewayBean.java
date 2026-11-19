package com.zykj.study.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class GatewayBean {
    public static final int $stable = 8;
    private String code;
    private final String lcid;
    private final String name;
    private final String server;
    private final String webServer;

    public GatewayBean(String str, String str2, String str3, String str4, String code) {
        AbstractC9133u.m16133g(code, "code");
        this.name = str;
        this.server = str2;
        this.webServer = str3;
        this.lcid = str4;
        this.code = code;
    }

    public static /* synthetic */ GatewayBean copy$default(GatewayBean gatewayBean, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = gatewayBean.name;
        }
        if ((i10 & 2) != 0) {
            str2 = gatewayBean.server;
        }
        if ((i10 & 4) != 0) {
            str3 = gatewayBean.webServer;
        }
        if ((i10 & 8) != 0) {
            str4 = gatewayBean.lcid;
        }
        if ((i10 & 16) != 0) {
            str5 = gatewayBean.code;
        }
        String str6 = str5;
        String str7 = str3;
        return gatewayBean.copy(str, str2, str7, str4, str6);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.server;
    }

    public final String component3() {
        return this.webServer;
    }

    public final String component4() {
        return this.lcid;
    }

    public final String component5() {
        return this.code;
    }

    public final GatewayBean copy(String str, String str2, String str3, String str4, String code) {
        AbstractC9133u.m16133g(code, "code");
        return new GatewayBean(str, str2, str3, str4, code);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GatewayBean)) {
            return false;
        }
        GatewayBean gatewayBean = (GatewayBean) obj;
        return AbstractC9133u.m16128b(this.name, gatewayBean.name) && AbstractC9133u.m16128b(this.server, gatewayBean.server) && AbstractC9133u.m16128b(this.webServer, gatewayBean.webServer) && AbstractC9133u.m16128b(this.lcid, gatewayBean.lcid) && AbstractC9133u.m16128b(this.code, gatewayBean.code);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getLcid() {
        return this.lcid;
    }

    public final String getName() {
        return this.name;
    }

    public final String getServer() {
        return this.server;
    }

    public final String getWebServer() {
        return this.webServer;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.server;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.webServer;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lcid;
        return ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.code.hashCode();
    }

    public final void setCode(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.code = str;
    }

    public String toString() {
        return "GatewayBean(name=" + this.name + ", server=" + this.server + ", webServer=" + this.webServer + ", lcid=" + this.lcid + ", code=" + this.code + ")";
    }

    public /* synthetic */ GatewayBean(String str, String str2, String str3, String str4, String str5, int i10, AbstractC9126n abstractC9126n) {
        this(str, str2, str3, str4, (i10 & 16) != 0 ? "" : str5);
    }
}
