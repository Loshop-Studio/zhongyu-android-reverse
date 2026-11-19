package com.alibaba.sdk.android.push.p062d.p063a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.sdk.android.ams.common.p050a.C5571a;
import com.alibaba.sdk.android.ams.common.p051b.InterfaceC5574b;
import com.alibaba.sdk.android.ams.common.util.C5583b;
import com.alibaba.sdk.android.ams.common.util.StringUtil;
import com.alibaba.sdk.android.push.common.util.AppInfoUtil;
import com.alibaba.sdk.android.push.common.util.p061a.EnumC5660d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.alibaba.sdk.android.push.d.a.a */
/* loaded from: classes3.dex */
public class C5663a implements InterfaceC5574b {

    /* renamed from: b */
    private String f4301b = null;

    /* renamed from: c */
    private String f4302c = null;

    /* renamed from: d */
    private String f4303d = null;

    /* renamed from: a */
    private final SharedPreferences f4300a = C5571a.m3390h();

    /* renamed from: a */
    private static int m3640a(Context context, String str) {
        return context.getResources().getIdentifier(str, TypedValues.Custom.S_STRING, context.getPackageName());
    }

    /* renamed from: f */
    private String m3642f() {
        return "mps_deviceId_" + mo3399a();
    }

    @Override // com.alibaba.sdk.android.ams.common.p051b.InterfaceC5574b
    /* renamed from: b */
    public String mo3403b() {
        String str = this.f4303d;
        if (str != null) {
            return str;
        }
        String string = this.f4300a.getString(m3642f(), "");
        if (System.currentTimeMillis() - this.f4300a.getLong("mps_device_store_time", 0L) > 604800000) {
            return "";
        }
        this.f4303d = string;
        return string;
    }

    @Override // com.alibaba.sdk.android.ams.common.p051b.InterfaceC5574b
    /* renamed from: c */
    public String mo3405c() {
        return this.f4300a.getString("mps_utdid", "");
    }

    @Override // com.alibaba.sdk.android.ams.common.p051b.InterfaceC5574b
    /* renamed from: d */
    public String mo3407d() throws PackageManager.NameNotFoundException {
        if (!StringUtil.isEmpty(this.f4302c)) {
            return this.f4302c;
        }
        String strM3383a = C5571a.m3383a("com.alibaba.app.appsecret");
        this.f4302c = strM3383a;
        if (!StringUtil.isEmpty(strM3383a)) {
            return this.f4302c;
        }
        String strM3641b = m3641b(C5571a.m3382a(), "ams_appSecret");
        this.f4302c = strM3641b;
        return strM3641b;
    }

    @Override // com.alibaba.sdk.android.ams.common.p051b.InterfaceC5574b
    /* renamed from: e */
    public String mo3409e() {
        return AppInfoUtil.getAppVersionName(C5571a.m3382a());
    }

    /* renamed from: b */
    private static String m3641b(Context context, String str) {
        try {
            return context.getResources().getString(m3640a(context, str));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.alibaba.sdk.android.ams.common.p051b.InterfaceC5574b
    /* renamed from: a */
    public String mo3399a() throws PackageManager.NameNotFoundException {
        if (!StringUtil.isEmpty(this.f4301b)) {
            return this.f4301b;
        }
        String strM3383a = C5571a.m3383a("com.alibaba.app.appkey");
        this.f4301b = strM3383a;
        if (!StringUtil.isEmpty(strM3383a)) {
            return this.f4301b;
        }
        String strM3641b = m3641b(C5571a.m3382a(), "ams_appKey");
        this.f4301b = strM3641b;
        return strM3641b;
    }

    @Override // com.alibaba.sdk.android.ams.common.p051b.InterfaceC5574b
    /* renamed from: c */
    public String mo3406c(String str) {
        return this.f4300a.getString(str, "");
    }

    @Override // com.alibaba.sdk.android.ams.common.p051b.InterfaceC5574b
    /* renamed from: d */
    public void mo3408d(String str) {
        this.f4301b = str;
    }

    @Override // com.alibaba.sdk.android.ams.common.p051b.InterfaceC5574b
    /* renamed from: e */
    public void mo3410e(String str) {
        this.f4302c = str;
    }

    @Override // com.alibaba.sdk.android.ams.common.p051b.InterfaceC5574b
    /* renamed from: a */
    public String mo3400a(Map<String, String> map, String str) throws NumberFormatException {
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList(map.keySet());
        arrayList.add("appSecret");
        Collections.sort(arrayList);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String str2 = (String) obj;
            if (!str2.equals("VipRequestType")) {
                boolean zEquals = "appSecret".equals(str2);
                sb2.append(str2);
                sb2.append(zEquals ? mo3407d() : map.get(str2));
            }
        }
        if (map.containsKey("VipRequestType")) {
            int i11 = Integer.parseInt(map.get("VipRequestType"));
            map.remove("VipRequestType");
            if (i11 > EnumC5660d.m3635b()) {
                return C5583b.m3440a().m3456a(sb2.toString());
            }
        }
        return C5583b.m3440a().m3457b(sb2.toString());
    }

    @Override // com.alibaba.sdk.android.ams.common.p051b.InterfaceC5574b
    /* renamed from: b */
    public void mo3404b(String str) {
        this.f4300a.edit().putString("mps_utdid", str).commit();
    }

    @Override // com.alibaba.sdk.android.ams.common.p051b.InterfaceC5574b
    /* renamed from: a */
    public void mo3401a(String str) {
        this.f4303d = str;
        this.f4300a.edit().putString(m3642f(), str).putLong("mps_device_store_time", System.currentTimeMillis()).commit();
    }

    @Override // com.alibaba.sdk.android.ams.common.p051b.InterfaceC5574b
    /* renamed from: a */
    public void mo3402a(String str, String str2) {
        this.f4300a.edit().putString(str, str2).commit();
    }
}
