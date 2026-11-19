package com.aliyun.ams.emas.push;

import android.app.Notification;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.aliyun.ams.emas.push.g */
/* loaded from: classes.dex */
final class RunnableC1199g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InterfaceC1195c f6921a;

    /* renamed from: b */
    final /* synthetic */ Context f6922b;

    /* renamed from: c */
    final /* synthetic */ Map f6923c;

    /* renamed from: d */
    final /* synthetic */ String f6924d;

    /* renamed from: e */
    final /* synthetic */ boolean f6925e;

    /* renamed from: f */
    final /* synthetic */ Handler f6926f;

    /* renamed from: g */
    final /* synthetic */ InterfaceC1203k f6927g;

    RunnableC1199g(InterfaceC1195c interfaceC1195c, Context context, Map map, String str, boolean z3, Handler handler, InterfaceC1203k interfaceC1203k) {
        this.f6921a = interfaceC1195c;
        this.f6922b = context;
        this.f6923c = map;
        this.f6924d = str;
        this.f6925e = z3;
        this.f6926f = handler;
        this.f6927g = interfaceC1203k;
    }

    @Override // java.lang.Runnable
    public void run() {
        Notification notificationCustomNotificationUI = this.f6921a.customNotificationUI(this.f6922b, this.f6923c);
        Notification notificationCustomSummaryNotification = (!TextUtils.isEmpty(this.f6924d) || this.f6925e) ? this.f6921a.customSummaryNotification(this.f6922b, this.f6923c) : null;
        Handler handler = this.f6926f;
        if (handler != null) {
            handler.post(new RunnableC1200h(this, notificationCustomNotificationUI, notificationCustomSummaryNotification));
        } else {
            this.f6927g.mo5383a(notificationCustomNotificationUI, notificationCustomSummaryNotification);
        }
    }
}
