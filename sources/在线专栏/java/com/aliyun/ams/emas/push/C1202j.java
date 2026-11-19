package com.aliyun.ams.emas.push;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.sdk.android.error.ErrorCode;
import com.aliyun.ams.emas.push.notification.CPushMessage;
import com.taobao.accs.utl.ALog;
import com.taobao.agoo.C1804a;
import java.util.Calendar;
import org.android.agoo.common.AgooConstants;

/* renamed from: com.aliyun.ams.emas.push.j */
/* loaded from: classes.dex */
public class C1202j {

    /* renamed from: a */
    private final Context f6936a;

    /* renamed from: b */
    private int f6937b;

    /* renamed from: c */
    private int f6938c;

    /* renamed from: d */
    private int f6939d;

    /* renamed from: e */
    private int f6940e;

    /* renamed from: f */
    private boolean f6941f = false;

    public C1202j(Context context) {
        this.f6936a = context;
    }

    /* renamed from: a */
    public void m5384a(int i4, int i5, int i6, int i7, InterfaceC1193a interfaceC1193a) {
        ALog.m6090d("MPS:CloudPushService", "setDoNotDisturb " + i4 + ":" + i5 + "-" + i6 + ":" + i7, new Object[0]);
        if (i4 < 0 || i4 > 23 || i6 < 0 || i6 > 23 || i5 < 0 || i5 > 59 || i7 < 0 || i7 > 59) {
            if (interfaceC1193a != null) {
                ErrorCode errorCode = C1804a.INVALID_ARG;
                interfaceC1193a.onFailed(errorCode.getCode(), errorCode.getMsg());
                return;
            }
            return;
        }
        this.f6941f = true;
        this.f6937b = i4;
        this.f6938c = i5;
        this.f6939d = i6;
        this.f6940e = i7;
        if (interfaceC1193a != null) {
            interfaceC1193a.onSuccess("");
        }
    }

    /* renamed from: b */
    public void m5385b(CPushMessage cPushMessage) {
        if (cPushMessage == null || TextUtils.isEmpty(cPushMessage.m5403c())) {
            ALog.m6092e("MPS:CloudPushService", "message is null", new Object[0]);
            return;
        }
        if (this.f6936a == null) {
            ALog.m6092e("MPS:CloudPushService", "context is null", new Object[0]);
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction(C1204l.f6943b);
            intent.setClassName(this.f6936a.getPackageName(), MsgService.class.getName());
            intent.putExtra(AgooConstants.ACTION_TYPE, AgooConstants.MESSAGE_TYPE_OPEN);
            intent.putExtra("msgId", cPushMessage.m5403c());
            intent.putExtra(AgooConstants.MESSAGE_EXT, cPushMessage.m5405e());
            this.f6936a.startService(intent);
        } catch (Throwable th) {
            ALog.m6091e("MPS:CloudPushService", "Click message event upload failed.", th, new Object[0]);
        }
    }

    /* renamed from: c */
    public void m5386c(boolean z3) {
        this.f6941f = z3;
    }

    /* renamed from: d */
    public boolean m5387d() {
        if (!this.f6941f) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        int i4 = (this.f6937b * 60) + this.f6938c;
        int i5 = (this.f6939d * 60) + this.f6940e;
        int i6 = (calendar.get(11) * 60) + calendar.get(12);
        return i4 <= i5 ? i6 >= i4 && i6 <= i5 : i6 >= i4 || i6 <= i5;
    }

    /* renamed from: e */
    public void m5388e(CPushMessage cPushMessage) {
        if (cPushMessage == null || TextUtils.isEmpty(cPushMessage.m5403c())) {
            ALog.m6092e("MPS:CloudPushService", "message is null", new Object[0]);
            return;
        }
        if (this.f6936a == null) {
            ALog.m6092e("MPS:CloudPushService", "context is null", new Object[0]);
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction(C1204l.f6943b);
            intent.setClassName(this.f6936a.getPackageName(), MsgService.class.getName());
            intent.putExtra(AgooConstants.ACTION_TYPE, AgooConstants.MESSAGE_TYPE_DELETE);
            intent.putExtra("msgId", cPushMessage.m5403c());
            intent.putExtra(AgooConstants.MESSAGE_EXT, cPushMessage.m5405e());
            this.f6936a.startService(intent);
        } catch (Throwable th) {
            ALog.m6091e("MPS:CloudPushService", "Dismiss message event upload failed.", th, new Object[0]);
        }
    }
}
