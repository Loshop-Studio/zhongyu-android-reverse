package com.taobao.agoo.p066a.p067a;

import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.JsonUtility;

/* renamed from: com.taobao.agoo.a.a.a */
/* loaded from: classes.dex */
public class C1806a extends AbstractC1807b {
    public static final String INVALID_TOKEN = "deprecated_alias_token_should_be_ignored";
    public static final String JSON_ALIAS_TOKEN_MAP = "aliasTokenMap";
    public static final String JSON_CMD_ADDALIAS = "setAlias";
    public static final String JSON_CMD_LISTALIAS = "getAliasTokenMap";
    public static final String JSON_CMD_REMOVEALIAS = "removeAlias";
    public static final String JSON_CMD_REMOVEALLALIAS = "unbindAllAliasByDeviceId";
    public static final String JSON_CMD_REMOVEALLALIASANDADDALIAS = "resetDeviceAndBindCurrentAlias";
    public static final String JSON_CMD_RESETALIASDEVICEONE2ONE = "resetDeviceAndAliasToSingleBind";
    public static final String JSON_CMD_RESETAlIASANDBINDCURRENT = "resetAliasAndBindCurrentDevice";

    /* renamed from: a */
    public String f7858a;

    /* renamed from: b */
    public String f7859b;

    /* renamed from: c */
    public String f7860c;

    /* renamed from: d */
    public String f7861d;

    /* renamed from: b */
    public static byte[] m6173b(String str, String str2, String str3) {
        C1806a c1806a = new C1806a();
        c1806a.f7858a = str;
        c1806a.f7859b = str2;
        c1806a.f7860c = str3;
        c1806a.f7862e = JSON_CMD_ADDALIAS;
        return c1806a.m6176a();
    }

    /* renamed from: c */
    public static byte[] m6174c(String str, String str2, String str3) {
        C1806a c1806a = new C1806a();
        c1806a.f7858a = str;
        c1806a.f7859b = str2;
        c1806a.f7860c = str3;
        c1806a.f7862e = JSON_CMD_REMOVEALLALIASANDADDALIAS;
        return c1806a.m6176a();
    }

    /* renamed from: d */
    public static byte[] m6175d(String str, String str2, String str3) {
        C1806a c1806a = new C1806a();
        c1806a.f7858a = str;
        c1806a.f7859b = str2;
        c1806a.f7860c = str3;
        c1806a.f7862e = JSON_CMD_RESETALIASDEVICEONE2ONE;
        return c1806a.m6176a();
    }

    /* renamed from: a */
    public byte[] m6176a() {
        try {
            String string = new JsonUtility.JsonObjectBuilder().put(AbstractC1807b.JSON_CMD, this.f7862e).put(Constants.KEY_APP_KEY, this.f7858a).put("deviceId", this.f7859b).put("alias", this.f7860c).put("pushAliasToken", this.f7861d).build().toString();
            ALog.m6093i("AliasDO", "buildData", Constants.KEY_DATA, string);
            return string.getBytes("utf-8");
        } catch (Throwable th) {
            ALog.m6091e("AliasDO", "buildData", th, new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m6172b(String str, String str2) {
        C1806a c1806a = new C1806a();
        c1806a.f7858a = str;
        c1806a.f7859b = str2;
        c1806a.f7862e = JSON_CMD_LISTALIAS;
        return c1806a.m6176a();
    }

    /* renamed from: a */
    public static byte[] m6170a(String str, String str2, String str3) {
        C1806a c1806a = new C1806a();
        c1806a.f7858a = str;
        c1806a.f7859b = str2;
        c1806a.f7860c = str3;
        c1806a.f7862e = JSON_CMD_RESETAlIASANDBINDCURRENT;
        return c1806a.m6176a();
    }

    /* renamed from: a */
    public static byte[] m6171a(String str, String str2, String str3, String str4) {
        C1806a c1806a = new C1806a();
        c1806a.f7858a = str;
        c1806a.f7859b = str2;
        c1806a.f7860c = str3;
        c1806a.f7861d = str4;
        c1806a.f7862e = JSON_CMD_REMOVEALIAS;
        return c1806a.m6176a();
    }

    /* renamed from: a */
    public static byte[] m6169a(String str, String str2) {
        C1806a c1806a = new C1806a();
        c1806a.f7858a = str;
        c1806a.f7859b = str2;
        c1806a.f7862e = JSON_CMD_REMOVEALLALIAS;
        return c1806a.m6176a();
    }
}
