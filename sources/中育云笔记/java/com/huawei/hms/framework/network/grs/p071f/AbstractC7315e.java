package com.huawei.hms.framework.network.grs.p071f;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p189i5.C9607a;
import p218k5.C9812b;

/* renamed from: com.huawei.hms.framework.network.grs.f.e */
/* loaded from: classes5.dex */
public abstract class AbstractC7315e {

    /* renamed from: a */
    public static final String f11673a = "e";

    /* renamed from: b */
    public static final Set f11674b = Collections.unmodifiableSet(new a(16));

    /* renamed from: com.huawei.hms.framework.network.grs.f.e$a */
    public class a extends HashSet<String> {
        public a(int i10) {
            super(i10);
            add("ser_country");
            add("reg_country");
            add("issue_country");
            add("geo_ip");
        }
    }

    /* renamed from: a */
    public static String m8632a(Context context, C9607a c9607a, String str, GrsBaseInfo grsBaseInfo, boolean z10) {
        String serCountry = grsBaseInfo.getSerCountry();
        String regCountry = grsBaseInfo.getRegCountry();
        String issueCountry = grsBaseInfo.getIssueCountry();
        for (String str2 : str.split(">")) {
            if (f11674b.contains(str2.trim())) {
                if ("ser_country".equals(str2.trim()) && !TextUtils.isEmpty(serCountry) && !GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(serCountry)) {
                    Logger.m8580i(f11673a, "current route_by is serCountry and routerCountry is: " + serCountry);
                    return serCountry;
                }
                if ("reg_country".equals(str2.trim()) && !TextUtils.isEmpty(regCountry) && !GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(regCountry)) {
                    Logger.m8580i(f11673a, "current route_by is regCountry and routerCountry is: " + regCountry);
                    return regCountry;
                }
                if ("issue_country".equals(str2.trim()) && !TextUtils.isEmpty(issueCountry) && !GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(issueCountry)) {
                    Logger.m8580i(f11673a, "current route_by is issueCountry and routerCountry is: " + issueCountry);
                    return issueCountry;
                }
                if ("geo_ip".equals(str2.trim())) {
                    String strM19830a = new C9812b(context, c9607a, grsBaseInfo).m19830a(z10);
                    Logger.m8580i(f11673a, "current route_by is geo_ip and routerCountry is: " + strM19830a);
                    return strM19830a;
                }
            }
        }
        return "";
    }

    /* renamed from: b */
    public static String m8633b(Context context, C9607a c9607a, String str, GrsBaseInfo grsBaseInfo, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            Logger.m8588w(f11673a, "routeBy must be not empty string or null.");
            return null;
        }
        if (!"no_route".equals(str) && !"unconditional".equals(str)) {
            return m8632a(context, c9607a, str, grsBaseInfo, z10);
        }
        Logger.m8586v(f11673a, "routeBy equals NO_ROUTE_POLICY");
        return "no_route_country";
    }
}
