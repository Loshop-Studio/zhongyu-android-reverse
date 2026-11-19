package com.aliyun.ams.emas.push;

import android.app.Notification;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.sdk.android.logger.ILog;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import p115l1.C2834a;
import p115l1.C2835b;

/* renamed from: com.aliyun.ams.emas.push.i */
/* loaded from: classes.dex */
final class C1201i implements InterfaceC1203k {

    /* renamed from: a */
    final /* synthetic */ Map f6931a;

    /* renamed from: b */
    final /* synthetic */ C2834a f6932b;

    /* renamed from: c */
    final /* synthetic */ C2835b f6933c;

    /* renamed from: d */
    final /* synthetic */ Context f6934d;

    /* renamed from: e */
    final /* synthetic */ InterfaceC1194b f6935e;

    C1201i(Map map, C2834a c2834a, C2835b c2835b, Context context, InterfaceC1194b interfaceC1194b) {
        this.f6931a = map;
        this.f6932b = c2834a;
        this.f6933c = c2835b;
        this.f6934d = context;
        this.f6935e = interfaceC1194b;
    }

    @Override // com.aliyun.ams.emas.push.InterfaceC1203k
    /* renamed from: a */
    public void mo5383a(Notification notification, Notification notification2) {
        String str = (String) this.f6931a.get(AgooConstants.MESSAGE_BODY_EMAS_GROUP);
        if (!TextUtils.isEmpty(str)) {
            this.f6932b.m9482C(str);
        }
        ILog iLog = C1204l.f6942a;
        iLog.mo5083d("push created notification" + this.f6932b.m9491e());
        this.f6933c.m9516d(this.f6934d, notification, notification2, this.f6932b);
        iLog.mo5083d("push onNotificationShow " + this.f6932b.m9491e());
        this.f6935e.onNotificationShow(this.f6934d, this.f6932b.m9491e(), this.f6932b.m9494h(), this.f6932b.m9498l());
    }
}
