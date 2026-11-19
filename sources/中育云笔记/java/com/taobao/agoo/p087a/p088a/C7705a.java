package com.taobao.agoo.p087a.p088a;

import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.JsonUtility;

/* renamed from: com.taobao.agoo.a.a.a */
/* loaded from: classes5.dex */
public class C7705a extends AbstractC7706b {
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
    public String f13256a;

    /* renamed from: b */
    public String f13257b;

    /* renamed from: c */
    public String f13258c;

    /* renamed from: d */
    public String f13259d;

    /* renamed from: b */
    public static byte[] m10199b(String str, String str2, String str3) {
        C7705a c7705a = new C7705a();
        c7705a.f13256a = str;
        c7705a.f13257b = str2;
        c7705a.f13258c = str3;
        c7705a.f13260e = JSON_CMD_ADDALIAS;
        return c7705a.m10202a();
    }

    /* renamed from: c */
    public static byte[] m10200c(String str, String str2, String str3) {
        C7705a c7705a = new C7705a();
        c7705a.f13256a = str;
        c7705a.f13257b = str2;
        c7705a.f13258c = str3;
        c7705a.f13260e = JSON_CMD_REMOVEALLALIASANDADDALIAS;
        return c7705a.m10202a();
    }

    /* renamed from: d */
    public static byte[] m10201d(String str, String str2, String str3) {
        C7705a c7705a = new C7705a();
        c7705a.f13256a = str;
        c7705a.f13257b = str2;
        c7705a.f13258c = str3;
        c7705a.f13260e = JSON_CMD_RESETALIASDEVICEONE2ONE;
        return c7705a.m10202a();
    }

    /* renamed from: a */
    public byte[] m10202a() {
        try {
            String string = new JsonUtility.JsonObjectBuilder().put(AbstractC7706b.JSON_CMD, this.f13260e).put(Constants.KEY_APP_KEY, this.f13256a).put("deviceId", this.f13257b).put("alias", this.f13258c).put("pushAliasToken", this.f13259d).build().toString();
            ALog.m10119i("AliasDO", "buildData", "data", string);
            return string.getBytes("utf-8");
        } catch (Throwable th) {
            ALog.m10117e("AliasDO", "buildData", th, new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m10198b(String str, String str2) {
        C7705a c7705a = new C7705a();
        c7705a.f13256a = str;
        c7705a.f13257b = str2;
        c7705a.f13260e = JSON_CMD_LISTALIAS;
        return c7705a.m10202a();
    }

    /* renamed from: a */
    public static byte[] m10196a(String str, String str2, String str3) {
        C7705a c7705a = new C7705a();
        c7705a.f13256a = str;
        c7705a.f13257b = str2;
        c7705a.f13258c = str3;
        c7705a.f13260e = JSON_CMD_RESETAlIASANDBINDCURRENT;
        return c7705a.m10202a();
    }

    /* renamed from: a */
    public static byte[] m10197a(String str, String str2, String str3, String str4) {
        C7705a c7705a = new C7705a();
        c7705a.f13256a = str;
        c7705a.f13257b = str2;
        c7705a.f13258c = str3;
        c7705a.f13259d = str4;
        c7705a.f13260e = JSON_CMD_REMOVEALIAS;
        return c7705a.m10202a();
    }

    /* renamed from: a */
    public static byte[] m10195a(String str, String str2) {
        C7705a c7705a = new C7705a();
        c7705a.f13256a = str;
        c7705a.f13257b = str2;
        c7705a.f13260e = JSON_CMD_REMOVEALLALIAS;
        return c7705a.m10202a();
    }
}
