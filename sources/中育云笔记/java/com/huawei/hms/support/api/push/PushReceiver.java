package com.huawei.hms.support.api.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONException;
import org.json.JSONObject;
import p344t5.AbstractC11228b;
import p344t5.AbstractC11230d;
import p344t5.AbstractC11241o;
import p344t5.C11242p;
import p358u5.AbstractC11367a;

/* loaded from: classes5.dex */
public final class PushReceiver extends BroadcastReceiver {

    /* renamed from: com.huawei.hms.support.api.push.PushReceiver$b */
    public static class RunnableC7335b implements Runnable {

        /* renamed from: c */
        public Context f11747c;

        /* renamed from: d */
        public Intent f11748d;

        @Override // java.lang.Runnable
        public void run() {
            Intent intent = new Intent("com.huawei.push.action.MESSAGING_EVENT");
            intent.setPackage(this.f11748d.getPackage());
            try {
                JSONObject jSONObjectM8696e = PushReceiver.m8696e(this.f11748d);
                String strM25287e = AbstractC11367a.m25287e(jSONObjectM8696e, "moduleName", "");
                int iM25284b = AbstractC11367a.m25284b(jSONObjectM8696e, "msgType", 0);
                int iM25284b2 = AbstractC11367a.m25284b(jSONObjectM8696e, NotificationCompat.CATEGORY_STATUS, 0);
                if (ErrorEnum.SUCCESS.m8226d() != iM25284b2) {
                    iM25284b2 = ErrorEnum.ERROR_APP_SERVER_NOT_ONLINE.m8226d();
                }
                Bundle bundle = new Bundle();
                if ("Push".equals(strM25287e) && iM25284b == 1) {
                    bundle.putString("message_type", "delivery");
                    bundle.putString("message_id", AbstractC11367a.m25287e(jSONObjectM8696e, "msgId", ""));
                    bundle.putInt("error", iM25284b2);
                    bundle.putString(CommonCode.MapKey.TRANSACTION_ID, AbstractC11367a.m25287e(jSONObjectM8696e, "transactionId", ""));
                } else {
                    if (this.f11748d.getExtras() != null) {
                        bundle.putAll(this.f11748d.getExtras());
                    }
                    bundle.putString("message_type", "received_message");
                    bundle.putString("message_id", this.f11748d.getStringExtra("msgIdStr"));
                    bundle.putByteArray("message_body", this.f11748d.getByteArrayExtra("msg_data"));
                    bundle.putString("device_token", AbstractC11228b.m24988a(this.f11748d.getByteArrayExtra("device_token")));
                    bundle.putInt("inputType", 1);
                    bundle.putString("message_proxy_type", this.f11748d.getStringExtra("message_proxy_type"));
                }
                if (new C11242p().m25074c(this.f11747c, bundle, intent)) {
                    HMSLog.m8727i("PushReceiver", "receive " + this.f11748d.getAction() + " and start service success");
                    return;
                }
                HMSLog.m8725e("PushReceiver", "receive " + this.f11748d.getAction() + " and start service failed");
            } catch (RuntimeException unused) {
                HMSLog.m8725e("PushReceiver", "handle push message occur exception.");
            }
        }

        public RunnableC7335b(Context context, Intent intent) {
            this.f11747c = context;
            this.f11748d = intent;
        }
    }

    /* renamed from: com.huawei.hms.support.api.push.PushReceiver$c */
    public static class RunnableC7336c implements Runnable {

        /* renamed from: c */
        public Context f11749c;

        /* renamed from: d */
        public Intent f11750d;

        @Override // java.lang.Runnable
        public void run() {
            try {
                byte[] byteArrayExtra = this.f11750d.getByteArrayExtra("device_token");
                if (byteArrayExtra != null && byteArrayExtra.length != 0) {
                    HMSLog.m8727i("PushReceiver", "receive a push token: " + this.f11749c.getPackageName());
                    Intent intent = new Intent("com.huawei.push.action.MESSAGING_EVENT");
                    intent.setPackage(this.f11750d.getPackage());
                    Bundle bundle = new Bundle();
                    bundle.putString("message_type", "new_token");
                    bundle.putString("device_token", AbstractC11228b.m24988a(byteArrayExtra));
                    bundle.putString(CommonCode.MapKey.TRANSACTION_ID, this.f11750d.getStringExtra(CommonCode.MapKey.TRANSACTION_ID));
                    bundle.putString("subjectId", this.f11750d.getStringExtra("subjectId"));
                    bundle.putInt("error", this.f11750d.getIntExtra("error", ErrorEnum.SUCCESS.m8226d()));
                    bundle.putString("belongId", this.f11750d.getStringExtra("belongId"));
                    if (new C11242p().m25074c(this.f11749c, bundle, intent)) {
                        return;
                    }
                    HMSLog.m8725e("PushReceiver", "receive " + this.f11750d.getAction() + " and start service failed");
                    return;
                }
                HMSLog.m8727i("PushReceiver", "get a deviceToken, but it is null or empty");
            } catch (RejectedExecutionException unused) {
                HMSLog.m8725e("PushReceiver", "execute task error");
            } catch (Exception unused2) {
                HMSLog.m8725e("PushReceiver", "handle push token error");
            }
        }

        public RunnableC7336c(Context context, Intent intent) {
            this.f11749c = context;
            this.f11750d = intent;
        }
    }

    /* renamed from: b */
    public static JSONObject m8694b(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject("msgContent");
        }
        return null;
    }

    /* renamed from: c */
    public static JSONObject m8695c(byte[] bArr) {
        try {
            return new JSONObject(AbstractC11228b.m24988a(bArr));
        } catch (JSONException unused) {
            HMSLog.m8728w("PushReceiver", "JSONException:parse message body failed.");
            return null;
        }
    }

    /* renamed from: e */
    public static JSONObject m8696e(Intent intent) {
        JSONObject jSONObjectM8695c = m8695c(intent.getByteArrayExtra("msg_data"));
        JSONObject jSONObjectM8694b = m8694b(jSONObjectM8695c);
        String strM25287e = AbstractC11367a.m25287e(jSONObjectM8694b, "data", null);
        if (AbstractC11230d.m24992a(jSONObjectM8694b, m8697f(jSONObjectM8694b), strM25287e)) {
            return jSONObjectM8695c;
        }
        if (TextUtils.isEmpty(strM25287e)) {
            return null;
        }
        try {
            return new JSONObject(strM25287e);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static JSONObject m8697f(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject("psContent");
        }
        return null;
    }

    /* renamed from: d */
    public final void m8698d(Context context, Intent intent) {
        try {
            if (intent.hasExtra("msg_data")) {
                AbstractC11241o.m25070a().execute(new RunnableC7335b(context, intent));
            } else {
                HMSLog.m8727i("PushReceiver", "This push message dose not sent by hwpush.");
            }
        } catch (RuntimeException unused) {
            HMSLog.m8725e("PushReceiver", "handlePushMessageEvent execute task runtime exception.");
        } catch (Exception unused2) {
            HMSLog.m8725e("PushReceiver", "handlePushMessageEvent execute task error");
        }
    }

    /* renamed from: g */
    public final void m8699g(Context context, Intent intent) {
        try {
            if (intent.hasExtra("device_token")) {
                AbstractC11241o.m25070a().execute(new RunnableC7336c(context, intent));
            } else {
                HMSLog.m8727i("PushReceiver", "This message dose not sent by hwpush.");
            }
        } catch (RuntimeException unused) {
            HMSLog.m8725e("PushReceiver", "handlePushMessageEvent execute task runtime exception.");
        } catch (Exception unused2) {
            HMSLog.m8725e("PushReceiver", "handlePushTokenEvent execute task error");
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || context == null) {
            return;
        }
        HMSLog.m8727i("PushReceiver", "push receive broadcast message, Intent:" + intent.getAction() + " pkgName:" + context.getPackageName());
        try {
            intent.getStringExtra("TestIntent");
            String action = intent.getAction();
            if (ResourceLoaderUtil.getmContext() == null) {
                ResourceLoaderUtil.setmContext(context.getApplicationContext());
            }
            if ("com.huawei.android.push.intent.REGISTRATION".equals(action)) {
                m8699g(context, intent);
            } else if ("com.huawei.android.push.intent.RECEIVE".equals(action)) {
                m8698d(context, intent);
            } else {
                HMSLog.m8727i("PushReceiver", "message can't be recognised.");
            }
        } catch (Exception unused) {
            HMSLog.m8725e("PushReceiver", "intent has some error");
        }
    }
}
