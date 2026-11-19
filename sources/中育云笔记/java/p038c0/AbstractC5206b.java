package p038c0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.taobao.accs.utl.ALog;

/* renamed from: c0.b */
/* loaded from: classes3.dex */
public abstract class AbstractC5206b extends BroadcastReceiver implements InterfaceC5208d, InterfaceC5209e {
    public static final String EXTRA_MAP = "extraMap";
    public static final String MESSAGE_ID = "messageId";
    public static final String NOTIFICATION_GROUP = "group";
    public static final String NOTIFICATION_ID = "notificationId";
    public static final String NOTIFICATION_OPENED_ACTION = "com.alibaba.push2.action.NOTIFICATION_OPENED";
    public static final String NOTIFICATION_OPEN_TYPE = "notificationOpenType";
    public static final String NOTIFICATION_REMOVED_ACTION = "com.alibaba.push2.action.NOTIFICATION_REMOVED";
    public static final String SUMMARY = "summary";
    public static final String TAG = "MPS:AgooMessageReceiver";
    public static final String TITLE = "title";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ALog.m10116d(TAG, "AgooMessageReceiver onReceive begin...intent=" + intent, new Object[0]);
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            return;
        }
        try {
            if (TextUtils.equals("com.alibaba.sdk.android.push.RECEIVE", action)) {
                AbstractC5212h.m2774b(context, intent, this, this);
            } else if (TextUtils.equals(NOTIFICATION_OPENED_ACTION, action)) {
                AbstractC5212h.m2773a(context, intent, this);
            } else if (TextUtils.equals(NOTIFICATION_REMOVED_ACTION, action)) {
                AbstractC5212h.m2777e(context, intent, this);
            }
        } catch (Throwable th) {
            ALog.m10117e(TAG, "handle action error:", th, new Object[0]);
        }
    }
}
