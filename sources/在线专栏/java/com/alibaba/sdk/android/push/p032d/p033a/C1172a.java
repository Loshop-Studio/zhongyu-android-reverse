package com.alibaba.sdk.android.push.p032d.p033a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.alibaba.sdk.android.ams.common.p020a.C1096a;
import com.alibaba.sdk.android.ams.common.p021b.InterfaceC1099b;
import com.alibaba.sdk.android.ams.common.util.C1108b;
import com.alibaba.sdk.android.ams.common.util.StringUtil;
import com.alibaba.sdk.android.push.common.util.AppInfoUtil;
import com.alibaba.sdk.android.push.common.util.p031a.EnumC1169d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.alibaba.sdk.android.push.d.a.a */
/* loaded from: classes.dex */
public class C1172a implements InterfaceC1099b {

    /* renamed from: b */
    private String f6777b = null;

    /* renamed from: c */
    private String f6778c = null;

    /* renamed from: d */
    private String f6779d = null;

    /* renamed from: a */
    private final SharedPreferences f6776a = C1096a.m4989h();

    /* renamed from: a */
    private static int m5189a(Context context, String str) {
        return context.getResources().getIdentifier(str, "string", context.getPackageName());
    }

    /* renamed from: b */
    private static String m5190b(Context context, String str) {
        try {
            return context.getResources().getString(m5189a(context, str));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    private String m5191f() {
        return "mps_deviceId_" + mo4998a();
    }

    @Override // com.alibaba.sdk.android.ams.common.p021b.InterfaceC1099b
    /* renamed from: a */
    public String mo4998a() throws PackageManager.NameNotFoundException {
        if (!StringUtil.isEmpty(this.f6777b)) {
            return this.f6777b;
        }
        String strM4982a = C1096a.m4982a("com.alibaba.app.appkey");
        this.f6777b = strM4982a;
        if (!StringUtil.isEmpty(strM4982a)) {
            return this.f6777b;
        }
        String strM5190b = m5190b(C1096a.m4981a(), "ams_appKey");
        this.f6777b = strM5190b;
        return strM5190b;
    }

    @Override // com.alibaba.sdk.android.ams.common.p021b.InterfaceC1099b
    /* renamed from: a */
    public String mo4999a(Map<String, String> map, String str) throws NumberFormatException {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arrayList = new ArrayList(map.keySet());
        arrayList.add("appSecret");
        Collections.sort(arrayList);
        for (String str2 : arrayList) {
            if (!str2.equals("VipRequestType")) {
                boolean zEquals = "appSecret".equals(str2);
                sb.append(str2);
                sb.append(zEquals ? mo5006d() : map.get(str2));
            }
        }
        if (map.containsKey("VipRequestType")) {
            int i4 = Integer.parseInt(map.get("VipRequestType"));
            map.remove("VipRequestType");
            if (i4 > EnumC1169d.m5184b()) {
                return C1108b.m5039a().m5055a(sb.toString());
            }
        }
        return C1108b.m5039a().m5056b(sb.toString());
    }

    @Override // com.alibaba.sdk.android.ams.common.p021b.InterfaceC1099b
    /* renamed from: a */
    public void mo5000a(String str) {
        this.f6779d = str;
        this.f6776a.edit().putString(m5191f(), str).putLong("mps_device_store_time", System.currentTimeMillis()).commit();
    }

    @Override // com.alibaba.sdk.android.ams.common.p021b.InterfaceC1099b
    /* renamed from: a */
    public void mo5001a(String str, String str2) {
        this.f6776a.edit().putString(str, str2).commit();
    }

    @Override // com.alibaba.sdk.android.ams.common.p021b.InterfaceC1099b
    /* renamed from: b */
    public String mo5002b() {
        String str = this.f6779d;
        if (str != null) {
            return str;
        }
        String string = this.f6776a.getString(m5191f(), "");
        if (System.currentTimeMillis() - this.f6776a.getLong("mps_device_store_time", 0L) > 604800000) {
            return "";
        }
        this.f6779d = string;
        return string;
    }

    @Override // com.alibaba.sdk.android.ams.common.p021b.InterfaceC1099b
    /* renamed from: b */
    public void mo5003b(String str) {
        this.f6776a.edit().putString("mps_utdid", str).commit();
    }

    @Override // com.alibaba.sdk.android.ams.common.p021b.InterfaceC1099b
    /* renamed from: c */
    public String mo5004c() {
        return this.f6776a.getString("mps_utdid", "");
    }

    @Override // com.alibaba.sdk.android.ams.common.p021b.InterfaceC1099b
    /* renamed from: c */
    public String mo5005c(String str) {
        return this.f6776a.getString(str, "");
    }

    @Override // com.alibaba.sdk.android.ams.common.p021b.InterfaceC1099b
    /* renamed from: d */
    public String mo5006d() throws PackageManager.NameNotFoundException {
        if (!StringUtil.isEmpty(this.f6778c)) {
            return this.f6778c;
        }
        String strM4982a = C1096a.m4982a("com.alibaba.app.appsecret");
        this.f6778c = strM4982a;
        if (!StringUtil.isEmpty(strM4982a)) {
            return this.f6778c;
        }
        String strM5190b = m5190b(C1096a.m4981a(), "ams_appSecret");
        this.f6778c = strM5190b;
        return strM5190b;
    }

    @Override // com.alibaba.sdk.android.ams.common.p021b.InterfaceC1099b
    /* renamed from: d */
    public void mo5007d(String str) {
        this.f6777b = str;
    }

    @Override // com.alibaba.sdk.android.ams.common.p021b.InterfaceC1099b
    /* renamed from: e */
    public String mo5008e() {
        return AppInfoUtil.getAppVersionName(C1096a.m4981a());
    }

    @Override // com.alibaba.sdk.android.ams.common.p021b.InterfaceC1099b
    /* renamed from: e */
    public void mo5009e(String str) {
        this.f6778c = str;
    }
}
