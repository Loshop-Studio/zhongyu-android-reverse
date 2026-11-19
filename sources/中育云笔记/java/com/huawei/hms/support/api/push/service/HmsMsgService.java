package com.huawei.hms.support.api.push.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.ResourceLoaderUtil;
import java.util.Objects;
import p344t5.AbstractC11229c;
import p344t5.AbstractC11234h;
import p344t5.AbstractC11244r;

/* loaded from: classes5.dex */
public class HmsMsgService extends Service {

    /* renamed from: com.huawei.hms.support.api.push.service.HmsMsgService$a */
    public static class HandlerC7337a extends Handler {

        /* renamed from: a */
        public Context f11751a;

        public HandlerC7337a(Context context) {
            this.f11751a = context;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            if (Objects.equals(this.f11751a.getApplicationContext().getPackageManager().getNameForUid(message.sendingUid), HMSPackageManager.getInstance(this.f11751a).getHMSPackageName()) && data != null) {
                PackageManagerHelper.PackageStates hMSPackageStates = HMSPackageManager.getInstance(this.f11751a).getHMSPackageStates();
                PackageManagerHelper.PackageStates packageStates = PackageManagerHelper.PackageStates.ENABLED;
                if (hMSPackageStates == packageStates) {
                    if (HMSPackageManager.getInstance(this.f11751a).getHMSPackageStates() != packageStates) {
                        HMSLog.m8727i("HmsMsgService", "service not start by hms");
                    } else {
                        HMSLog.m8727i("HmsMsgService", "chose push type");
                        if (Objects.equals(AbstractC11229c.m24990b(data, "push_action"), "com.huawei.push.msg.NOTIFY_MSG")) {
                            if (ResourceLoaderUtil.getmContext() == null) {
                                ResourceLoaderUtil.setmContext(this.f11751a.getApplicationContext());
                            }
                            HMSLog.m8727i("HmsMsgService", "invokeSelfShow");
                            HmsMsgService.m8702c(this.f11751a, data);
                        } else if (Objects.equals(AbstractC11229c.m24990b(data, "push_action"), "com.huawei.push.msg.PASSBY_MSG")) {
                            HMSLog.m8727i("HmsMsgService", "sendBroadcastToHms");
                            HmsMsgService.m8703d(this.f11751a, data);
                        }
                    }
                }
            }
            super.handleMessage(message);
        }
    }

    /* renamed from: c */
    public static void m8702c(Context context, Bundle bundle) {
        if (!AbstractC11234h.m25007a(context)) {
            HMSLog.m8727i("HmsMsgService", context.getPackageName() + " disable display notification.");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.huawei.push.msg.NOTIFY_MSG");
        intent.putExtra("selfshow_info", AbstractC11229c.m24989a(bundle, "selfshow_info"));
        intent.putExtra("selfshow_token", AbstractC11229c.m24989a(bundle, "selfshow_token"));
        intent.setPackage(AbstractC11229c.m24991c(bundle, "push_package"));
        AbstractC11244r.m25077a(context, intent);
        HMSLog.m8727i("HmsMsgService", "invokeSelfShow done");
    }

    /* renamed from: d */
    public static void m8703d(Context context, Bundle bundle) {
        try {
            Intent intent = new Intent();
            intent.setAction("com.huawei.android.push.intent.RECEIVE");
            intent.putExtra("msg_data", AbstractC11229c.m24989a(bundle, "msg_data"));
            intent.putExtra("device_token", AbstractC11229c.m24989a(bundle, "device_token"));
            intent.putExtra("msgIdStr", AbstractC11229c.m24991c(bundle, "msgIdStr"));
            intent.setFlags(32);
            intent.setPackage(AbstractC11229c.m24991c(bundle, "push_package"));
            context.sendBroadcast(intent, context.getPackageName() + ".permission.PROCESS_PUSH_MSG");
            HMSLog.m8727i("HmsMsgService", "send broadcast passby done");
        } catch (SecurityException unused) {
            HMSLog.m8727i("HmsMsgService", "send broadcast SecurityException");
        } catch (Exception unused2) {
            HMSLog.m8727i("HmsMsgService", "send broadcast Exception");
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        HMSLog.m8727i("HmsMsgService", "onBind");
        return new Messenger(new HandlerC7337a(this)).getBinder();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        HMSLog.m8727i("HmsMsgService", "Enter onStartCommand.");
        return 2;
    }
}
