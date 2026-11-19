package com.taobao.accs.client;

import android.content.Context;
import com.taobao.accs.utl.ALog;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.taobao.accs.client.c */
/* loaded from: classes.dex */
public class C1717c {

    /* renamed from: a */
    private final ConcurrentMap<String, Integer> f7516a = new ConcurrentHashMap();

    /* renamed from: b */
    private String f7517b = "ClientManager_";

    public C1717c(Context context, String str, String str2, String str3) {
        if (context == null) {
            throw new RuntimeException("Context is null!!");
        }
        this.f7517b += str;
    }

    /* renamed from: a */
    public void m5844a(String str) {
        Integer num = this.f7516a.get(str);
        if (num == null || num.intValue() != 2) {
            this.f7516a.put(str, 2);
        }
    }

    /* renamed from: b */
    public void m5845b(String str) {
        Integer num = this.f7516a.get(str);
        if (num == null || num.intValue() != 4) {
            this.f7516a.put(str, 4);
        }
    }

    /* renamed from: c */
    public void m5846c(String str) {
        Integer num = this.f7516a.get(str);
        if (num == null || num.intValue() != 1) {
            this.f7516a.put(str, 1);
        }
    }

    /* renamed from: d */
    public boolean m5847d(String str) {
        Integer num = this.f7516a.get(str);
        ALog.m6093i(this.f7517b, "isAppBound", "appStatus", num, "mBindStatus", this.f7516a);
        return num != null && num.intValue() == 2;
    }

    /* renamed from: e */
    public boolean m5848e(String str) {
        Integer num = this.f7516a.get(str);
        return num != null && num.intValue() == 4;
    }

    /* renamed from: f */
    public boolean m5849f(String str) {
        Integer num = this.f7516a.get(str);
        return num != null && num.intValue() == 1;
    }

    /* renamed from: a */
    public void m5843a() {
        try {
            this.f7516a.clear();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }
}
