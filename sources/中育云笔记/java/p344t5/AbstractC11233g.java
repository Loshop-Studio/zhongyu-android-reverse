package p344t5;

import android.R;
import android.app.Notification;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.alibaba.sdk.android.push.notification.CustomNotificationBuilder;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.log.HMSLog;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* renamed from: t5.g */
/* loaded from: classes5.dex */
public abstract class AbstractC11233g {
    /* renamed from: a */
    public static int m25003a(Context context) {
        int i10 = context.getApplicationInfo().icon;
        if (i10 != 0) {
            return i10;
        }
        int identifier = context.getResources().getIdentifier("btn_star_big_on", CustomNotificationBuilder.NOTIFICATION_ICON_RES_TYPE, DispatchConstants.ANDROID);
        HMSLog.m8722d("PushSelfShowLog", "icon is btn_star_big_on ");
        if (identifier != 0) {
            return identifier;
        }
        HMSLog.m8722d("PushSelfShowLog", "icon is sym_def_app_icon ");
        return R.drawable.sym_def_app_icon;
    }

    /* renamed from: b */
    public static Bitmap m25004b(Context context, C11239m c11239m) {
        if (context != null && c11239m != null) {
            try {
                if (HwBuildEx.VERSION.EMUI_SDK_INT >= 11) {
                    HMSLog.m8727i("PushSelfShowLog", "huawei phone, and emui5.0, need not show large icon.");
                    return null;
                }
                if (!"com.huawei.android.pushagent".equals(c11239m.m25060u())) {
                    HMSLog.m8727i("PushSelfShowLog", "get left bitmap from " + c11239m.m25060u());
                    return ((BitmapDrawable) context.getPackageManager().getApplicationIcon(c11239m.m25060u())).getBitmap();
                }
            } catch (PackageManager.NameNotFoundException unused) {
                HMSLog.m8725e("PushSelfShowLog", "build left icon occur NameNotFoundException.");
            } catch (Exception unused2) {
                HMSLog.m8725e("PushSelfShowLog", "build left icon occur Exception.");
            }
        }
        return null;
    }

    /* renamed from: c */
    public static void m25005c(Context context, Notification.Builder builder, C11239m c11239m) {
        if (context == null || builder == null || c11239m == null) {
            HMSLog.m8725e("PushSelfShowLog", "msg is null");
        } else {
            builder.setSmallIcon(m25006d(context, c11239m));
        }
    }

    /* renamed from: d */
    public static int m25006d(Context context, C11239m c11239m) throws NoSuchFieldException, PackageManager.NameNotFoundException, NumberFormatException {
        int iM25075a = 0;
        if (context == null || c11239m == null) {
            HMSLog.m8727i("PushSelfShowLog", "enter getSmallIconId, context or msg is null");
            return 0;
        }
        if (!TextUtils.isEmpty(c11239m.m25064y())) {
            String[] strArrSplit = c11239m.m25064y().split(MqttTopic.TOPIC_LEVEL_SEPARATOR);
            if (strArrSplit.length == 3) {
                iM25075a = AbstractC11243q.m25076b(context, strArrSplit[1], strArrSplit[2]);
            }
        }
        if (iM25075a == 0) {
            iM25075a = AbstractC11243q.m25075a(context, "com.huawei.messaging.default_notification_icon");
        }
        return iM25075a != 0 ? iM25075a : m25003a(context);
    }
}
