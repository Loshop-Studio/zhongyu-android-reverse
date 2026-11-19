package com.alibaba.sdk.android.push.notification;

import android.app.Notification;
import android.content.Context;

/* renamed from: com.alibaba.sdk.android.push.notification.c */
/* loaded from: classes.dex */
public abstract class AbstractC1187c {

    /* renamed from: a */
    protected String f6899a;

    /* renamed from: b */
    protected String f6900b;

    /* renamed from: d */
    protected String f6902d;

    /* renamed from: e */
    protected String f6903e;

    /* renamed from: f */
    protected String f6904f;

    /* renamed from: h */
    protected String f6906h;

    /* renamed from: i */
    protected String f6907i;

    /* renamed from: j */
    protected String f6908j;

    /* renamed from: k */
    protected String f6909k;

    /* renamed from: l */
    protected String f6910l;

    /* renamed from: m */
    protected String f6911m;

    /* renamed from: n */
    protected String f6912n;

    /* renamed from: c */
    protected int f6901c = 0;

    /* renamed from: g */
    protected int f6905g = 0;

    /* renamed from: a */
    public abstract Notification mo5280a(Context context, PushData pushData, NotificationConfigure notificationConfigure);

    /* renamed from: a */
    public String m5335a() {
        return this.f6899a;
    }

    /* renamed from: a */
    public void m5336a(int i4) {
        this.f6901c = i4;
    }

    /* renamed from: a */
    public void m5337a(String str) {
        this.f6899a = str;
    }

    /* renamed from: b */
    public abstract Notification mo5281b(Context context, PushData pushData, NotificationConfigure notificationConfigure);

    /* renamed from: b */
    public String m5338b() {
        return this.f6900b;
    }

    /* renamed from: b */
    public void m5339b(int i4) {
        this.f6905g = i4;
    }

    /* renamed from: b */
    public void m5340b(String str) {
        this.f6900b = str;
    }

    /* renamed from: c */
    public int m5341c() {
        return this.f6901c;
    }

    /* renamed from: c */
    public void m5342c(String str) {
        this.f6902d = str;
    }

    /* renamed from: d */
    public String m5343d() {
        return this.f6902d;
    }

    /* renamed from: d */
    public void m5344d(String str) {
        this.f6904f = str;
    }

    /* renamed from: e */
    public String m5345e() {
        return this.f6910l;
    }

    /* renamed from: e */
    public void m5346e(String str) {
        this.f6906h = str;
    }

    /* renamed from: f */
    public String m5347f() {
        return this.f6911m;
    }

    /* renamed from: f */
    public void m5348f(String str) {
        this.f6907i = str;
    }

    /* renamed from: g */
    public String m5349g() {
        return this.f6912n;
    }

    /* renamed from: g */
    public void m5350g(String str) {
        this.f6908j = str;
    }

    /* renamed from: h */
    public void m5351h(String str) {
        this.f6909k = str;
    }

    /* renamed from: i */
    public void m5352i(String str) {
        this.f6903e = str;
    }

    /* renamed from: j */
    public void m5353j(String str) {
        this.f6910l = str;
    }

    /* renamed from: k */
    public void m5354k(String str) {
        this.f6911m = str;
    }

    /* renamed from: l */
    public void m5355l(String str) {
        this.f6912n = str;
    }
}
