package com.taobao.accs.client;

import android.content.Context;
import com.taobao.accs.utl.ALog;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.taobao.accs.client.c */
/* loaded from: classes5.dex */
public class C7614c {

    /* renamed from: a */
    private final ConcurrentMap<String, Integer> f12914a = new ConcurrentHashMap();

    /* renamed from: b */
    private String f12915b = "ClientManager_";

    public C7614c(Context context, String str, String str2, String str3) {
        if (context == null) {
            throw new RuntimeException("Context is null!!");
        }
        this.f12915b += str;
    }

    /* renamed from: a */
    public void m9870a(String str) {
        Integer num = this.f12914a.get(str);
        if (num == null || num.intValue() != 2) {
            this.f12914a.put(str, 2);
        }
    }

    /* renamed from: b */
    public void m9871b(String str) {
        Integer num = this.f12914a.get(str);
        if (num == null || num.intValue() != 4) {
            this.f12914a.put(str, 4);
        }
    }

    /* renamed from: c */
    public void m9872c(String str) {
        Integer num = this.f12914a.get(str);
        if (num == null || num.intValue() != 1) {
            this.f12914a.put(str, 1);
        }
    }

    /* renamed from: d */
    public boolean m9873d(String str) {
        Integer num = this.f12914a.get(str);
        ALog.m10119i(this.f12915b, "isAppBound", "appStatus", num, "mBindStatus", this.f12914a);
        return num != null && num.intValue() == 2;
    }

    /* renamed from: e */
    public boolean m9874e(String str) {
        Integer num = this.f12914a.get(str);
        return num != null && num.intValue() == 4;
    }

    /* renamed from: f */
    public boolean m9875f(String str) {
        Integer num = this.f12914a.get(str);
        return num != null && num.intValue() == 1;
    }

    /* renamed from: a */
    public void m9869a() {
        try {
            this.f12914a.clear();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
