package com.zykj.huiwei.launcher.bean.resp;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\r¨\u0006 "}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;", "", HintConstants.AUTOFILL_HINT_NAME, "", "server", "webServer", "lcid", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getServer", "setServer", "getWebServer", "getLcid", "getCode", "setCode", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GatewayBean {
    public static final int $stable = 8;
    private String code;
    private final String lcid;
    private String name;
    private String server;
    private final String webServer;

    public GatewayBean(String str, String str2, String str3, String lcid, String code) {
        Intrinsics.checkNotNullParameter(lcid, "lcid");
        Intrinsics.checkNotNullParameter(code, "code");
        this.name = str;
        this.server = str2;
        this.webServer = str3;
        this.lcid = lcid;
        this.code = code;
    }

    public static /* synthetic */ GatewayBean copy$default(GatewayBean gatewayBean, String str, String str2, String str3, String str4, String str5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = gatewayBean.name;
        }
        if ((i6 & 2) != 0) {
            str2 = gatewayBean.server;
        }
        if ((i6 & 4) != 0) {
            str3 = gatewayBean.webServer;
        }
        if ((i6 & 8) != 0) {
            str4 = gatewayBean.lcid;
        }
        if ((i6 & 16) != 0) {
            str5 = gatewayBean.code;
        }
        String str6 = str5;
        String str7 = str3;
        return gatewayBean.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getServer() {
        return this.server;
    }

    /* renamed from: component3, reason: from getter */
    public final String getWebServer() {
        return this.webServer;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLcid() {
        return this.lcid;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    public final GatewayBean copy(String name, String server, String webServer, String lcid, String code) {
        Intrinsics.checkNotNullParameter(lcid, "lcid");
        Intrinsics.checkNotNullParameter(code, "code");
        return new GatewayBean(name, server, webServer, lcid, code);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GatewayBean)) {
            return false;
        }
        GatewayBean gatewayBean = (GatewayBean) other;
        return Intrinsics.areEqual(this.name, gatewayBean.name) && Intrinsics.areEqual(this.server, gatewayBean.server) && Intrinsics.areEqual(this.webServer, gatewayBean.webServer) && Intrinsics.areEqual(this.lcid, gatewayBean.lcid) && Intrinsics.areEqual(this.code, gatewayBean.code);
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
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.lcid.hashCode()) * 31) + this.code.hashCode();
    }

    public final void setCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.code = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setServer(String str) {
        this.server = str;
    }

    public String toString() {
        return "GatewayBean(name=" + this.name + ", server=" + this.server + ", webServer=" + this.webServer + ", lcid=" + this.lcid + ", code=" + this.code + ")";
    }

    public /* synthetic */ GatewayBean(String str, String str2, String str3, String str4, String str5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i6 & 16) != 0 ? "" : str5);
    }
}
