package p344t5;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.log.HMSLog;
import java.net.URISyntaxException;
import p358u5.AbstractC11368b;

/* renamed from: t5.r */
/* loaded from: classes5.dex */
public abstract class AbstractC11244r {
    /* renamed from: a */
    public static void m25077a(Context context, Intent intent) {
        try {
            if (context == null || intent == null) {
                HMSLog.m8722d("PushSelfShowLog", "enter SelfShowReceiver receiver, context or intent is null");
                return;
            }
            String action = intent.getAction();
            if (!"com.huawei.intent.action.PUSH".equals(action) && !"com.huawei.push.msg.NOTIFY_MSG".equals(action) && !"com.huawei.intent.action.PUSH_DELAY_NOTIFY".equals(action)) {
                return;
            }
            byte[] byteArrayExtra = intent.getByteArrayExtra("selfshow_info");
            byte[] byteArrayExtra2 = intent.getByteArrayExtra("selfshow_token");
            if (byteArrayExtra != null && byteArrayExtra2 != null && byteArrayExtra.length != 0 && byteArrayExtra2.length != 0) {
                m25080d(context, intent, byteArrayExtra, byteArrayExtra2);
                return;
            }
            HMSLog.m8727i("PushSelfShowLog", "self show info or token is null.");
        } catch (RuntimeException e10) {
            HMSLog.m8726e("PushSelfShowLog", "onReceive RuntimeException.", e10);
        } catch (Exception unused) {
            HMSLog.m8722d("PushSelfShowLog", "onReceive Exception.");
        }
    }

    /* renamed from: b */
    public static void m25078b(Context context, Intent intent, String str, C11239m c11239m, int i10) throws URISyntaxException {
        HMSLog.m8722d("PushSelfShowLog", "receive a selfshow user handle message eventId = " + str);
        if ("1".equals(str)) {
            new C11245s(context, c11239m).m25084d();
            AbstractC11368b.m25291b(context, c11239m.m25029B(), c11239m.m25044e());
        } else if ("2".equals(str)) {
            AbstractC11236j.m25012b(context, c11239m.m25029B(), c11239m.m25044e(), "2");
        } else {
            HMSLog.m8722d("PushSelfShowLog", "other event");
        }
    }

    /* renamed from: c */
    public static void m25079c(Context context, Intent intent, C11239m c11239m) {
        HMSLog.m8727i("PushSelfShowLog", "receive a selfshow message, the cmd type is " + c11239m.m25056q());
        if (C11245s.m25081b(c11239m.m25056q())) {
            new C11240n(context, c11239m).start();
        }
    }

    /* renamed from: d */
    public static void m25080d(Context context, Intent intent, byte[] bArr, byte[] bArr2) throws URISyntaxException {
        String stringExtra = intent.getStringExtra("selfshow_event_id");
        int intExtra = intent.getIntExtra("selfshow_notify_id", 0);
        HMSLog.m8727i("PushSelfShowLog", "get notifyId:" + intExtra);
        C11239m c11239m = new C11239m(bArr, bArr2);
        if (!c11239m.m25039L()) {
            HMSLog.m8722d("PushSelfShowLog", "parseMessage failed");
            return;
        }
        HMSLog.m8727i("PushSelfShowLog", "onReceive the msg id = " + c11239m.m25029B() + ",and cmd is " + c11239m.m25056q() + ",and the eventId is " + stringExtra);
        if (stringExtra == null) {
            m25079c(context, intent, c11239m);
        } else {
            m25078b(context, intent, stringExtra, c11239m, intExtra);
        }
    }
}
