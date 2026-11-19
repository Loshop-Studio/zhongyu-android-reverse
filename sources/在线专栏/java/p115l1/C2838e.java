package p115l1;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.core.content.C0332a;
import com.alibaba.sdk.android.logger.ILog;
import com.aliyun.ams.emas.push.AgooMessageReceiver;
import com.aliyun.ams.emas.push.C1204l;
import com.taobao.accs.dispatch.IntentDispatch;
import com.taobao.accs.utl.ALog;
import com.taobao.agoo.TaobaoRegister;
import java.util.Iterator;
import org.android.agoo.common.AgooConstants;

/* renamed from: l1.e */
/* loaded from: classes.dex */
public class C2838e {
    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public int m9532a(Intent intent, Context context) {
        return m9533b(intent, context, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r3v10, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v4, types: [int] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* renamed from: b */
    public int m9533b(Intent intent, Context context, int i4) {
        String str;
        ILog iLog;
        StringBuilder sb;
        String str2;
        String str3;
        String str4;
        String str5;
        Context context2;
        Context context3;
        String str6;
        boolean z3;
        Class<?> clsM5389a = C1204l.m5389a();
        if (!AgooConstants.NOTIFICATION_TYPE_OPEN.equals(intent.getStringExtra(AgooConstants.ACTION_TYPE))) {
            if (!AgooConstants.NOTIFICATION_TYPE_DELETE.equals(intent.getStringExtra(AgooConstants.ACTION_TYPE))) {
                if (AgooConstants.MESSAGE_TYPE_OPEN.equals(intent.getStringExtra(AgooConstants.ACTION_TYPE))) {
                    TaobaoRegister.clickMessage(context, intent.getStringExtra("msgId"), intent.getStringExtra(AgooConstants.MESSAGE_EXT));
                    return 0;
                }
                if (!AgooConstants.MESSAGE_TYPE_DELETE.equals(intent.getStringExtra(AgooConstants.ACTION_TYPE))) {
                    return 0;
                }
                TaobaoRegister.dismissMessage(context, intent.getStringExtra("msgId"), intent.getStringExtra(AgooConstants.MESSAGE_EXT));
                return 0;
            }
            String stringExtra = intent.getStringExtra("msgId");
            intent.getStringExtra(AgooConstants.MESSAGE_TASK_ID);
            String stringExtra2 = intent.getStringExtra(AgooConstants.MESSAGE_EXT);
            try {
                Intent intent2 = new Intent();
                intent2.setPackage(context.getPackageName());
                intent2.setAction(AgooMessageReceiver.NOTIFICATION_REMOVED_ACTION);
                intent2.putExtra(AgooMessageReceiver.MESSAGE_ID, stringExtra);
                intent2.putExtra("title", intent.getStringExtra("title"));
                intent2.putExtra(AgooMessageReceiver.SUMMARY, intent.getStringExtra(AgooMessageReceiver.SUMMARY));
                intent2.putExtra(AgooMessageReceiver.EXTRA_MAP, intent.getStringExtra(AgooMessageReceiver.EXTRA_MAP));
                intent2.putExtra(AgooMessageReceiver.NOTIFICATION_OPEN_TYPE, intent.getIntExtra(AgooMessageReceiver.NOTIFICATION_OPEN_TYPE, 1));
                intent2.putExtra(AgooMessageReceiver.NOTIFICATION_GROUP, intent.getStringExtra(AgooMessageReceiver.NOTIFICATION_GROUP));
                intent2.setFlags(32);
                if (clsM5389a == null) {
                    context.sendBroadcast(intent2, context.getPackageName() + ".AGOO");
                } else {
                    intent2.setClass(context, clsM5389a);
                    IntentDispatch.dispatchIntent(context, intent2, clsM5389a.getName());
                }
                iLog = C1204l.f6942a;
                sb = new StringBuilder();
                str = "Delete msg(";
            } catch (Throwable th) {
                str = "Delete msg(";
                try {
                    ALog.m6091e("MPS:CPushServiceListener", "send intent failed.", th, new Object[0]);
                    iLog = C1204l.f6942a;
                    sb = new StringBuilder();
                } catch (Throwable th2) {
                    C1204l.f6942a.mo5088i(str + stringExtra + ")");
                    TaobaoRegister.dismissMessage(context, stringExtra, stringExtra2);
                    throw th2;
                }
            }
            sb.append(str);
            sb.append(stringExtra);
            sb.append(")");
            iLog.mo5088i(sb.toString());
            TaobaoRegister.dismissMessage(context, stringExtra, stringExtra2);
            return 0;
        }
        Intent intent3 = (Intent) intent.getExtras().get(AgooConstants.KEY_REAL_INTENT);
        intent3.setFlags(335544320);
        String stringExtra3 = intent3.getStringExtra("msgId");
        String stringExtra4 = intent3.getStringExtra("title");
        ?? stringExtra5 = intent3.getStringExtra(AgooMessageReceiver.SUMMARY);
        String stringExtra6 = intent.getStringExtra(AgooConstants.MESSAGE_EXT);
        String stringExtra7 = intent.getStringExtra(AgooMessageReceiver.NOTIFICATION_GROUP);
        int intExtra = intent3.getIntExtra(AgooMessageReceiver.NOTIFICATION_OPEN_TYPE, 1);
        ?? intExtra2 = intent3.getIntExtra(AgooMessageReceiver.NOTIFICATION_ID, 0);
        String stringExtra8 = intent3.getStringExtra(AgooMessageReceiver.EXTRA_MAP);
        try {
            ?? intent4 = new Intent();
            intent4.setPackage(context.getPackageName());
            intent4.setAction(AgooMessageReceiver.NOTIFICATION_OPENED_ACTION);
            intent4.putExtra(AgooMessageReceiver.MESSAGE_ID, stringExtra3);
            intent4.putExtra("title", stringExtra4);
            intent4.putExtra(AgooMessageReceiver.SUMMARY, stringExtra5);
            intent4.putExtra(AgooMessageReceiver.EXTRA_MAP, stringExtra8);
            intent4.putExtra(AgooMessageReceiver.NOTIFICATION_OPEN_TYPE, intExtra);
            intent4.putExtra(AgooMessageReceiver.NOTIFICATION_ID, intExtra2);
            if (!TextUtils.isEmpty(stringExtra7)) {
                intent4.putExtra(AgooMessageReceiver.NOTIFICATION_GROUP, stringExtra7);
            }
            intent4.setFlags(32);
            try {
                if (clsM5389a == null) {
                    ?? r3 = context;
                    r3.sendBroadcast(intent4, context.getPackageName() + ".AGOO");
                    stringExtra5 = r3;
                } else {
                    Context context4 = context;
                    intent4.setClass(context4, clsM5389a);
                    IntentDispatch.dispatchIntent(context4, intent4, clsM5389a.getName());
                    stringExtra5 = context4;
                }
                if (i4 == 0 && "android.intent.action.MAIN".equals(intent3.getAction()) && C2839f.m9534a(context)) {
                    C1204l.f6942a.mo5083d("app is in front, action:" + intent3.getAction());
                } else {
                    try {
                        if (intExtra == 4) {
                            try {
                                ALog.m6093i("MPS:CPushServiceListener", "open with no action", new Object[0]);
                            } catch (Throwable th3) {
                                th = th3;
                                str6 = "MPS:CPushServiceListener";
                                str2 = stringExtra6;
                                str3 = ")";
                                str4 = "Open msg(";
                                context2 = stringExtra5;
                                str5 = str6;
                                try {
                                    ALog.m6091e(str5, "startActivity error", th, new Object[0]);
                                    C1204l.f6942a.mo5088i(str4 + stringExtra3 + str3);
                                    context3 = context2;
                                    TaobaoRegister.clickMessage(context3, stringExtra3, str2);
                                    return 0;
                                } catch (Throwable th4) {
                                    C1204l.f6942a.mo5088i(str4 + stringExtra3 + str3);
                                    TaobaoRegister.clickMessage(context2, stringExtra3, str2);
                                    throw th4;
                                }
                            }
                        } else {
                            intExtra2 = "MPS:CPushServiceListener";
                            if (intExtra == 1) {
                                ALog.m6093i(intExtra2, "open app", new Object[0]);
                                if (i4 != 0) {
                                    ALog.m6096w(intExtra2, "sdk version < 11 or start from activity, start app with launch activity", new Object[0]);
                                    stringExtra5.startActivity(intent3);
                                } else if (C0332a.m1803a(stringExtra5, "android.permission.GET_TASKS") == 0 && C0332a.m1803a(stringExtra5, "android.permission.REORDER_TASKS") == 0) {
                                    ActivityManager activityManager = (ActivityManager) stringExtra5.getSystemService(AgooConstants.OPEN_ACTIIVTY_NAME);
                                    Iterator<ActivityManager.RunningTaskInfo> it = activityManager.getRunningTasks(Integer.MAX_VALUE).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z3 = true;
                                            break;
                                        }
                                        ActivityManager.RunningTaskInfo next = it.next();
                                        if (next.topActivity.getPackageName().equals(context.getPackageName())) {
                                            ALog.m6090d(intExtra2, "move task to front", new Object[0]);
                                            try {
                                                activityManager.moveTaskToFront(next.id, 0);
                                                z3 = false;
                                                break;
                                            } catch (Throwable th5) {
                                                ALog.m6095w(intExtra2, "move task to front fail", th5, new Object[0]);
                                            }
                                        }
                                    }
                                    if (true == z3) {
                                        ALog.m6096w(intExtra2, "do not find corresponing running task, start app with launch activity", new Object[0]);
                                        stringExtra5.startActivity(intent3);
                                    }
                                } else {
                                    ALog.m6090d(intExtra2, "no get tasks and reorder tasks permission, start app with launch activity", new Object[0]);
                                    stringExtra5.startActivity(intent3);
                                }
                            } else {
                                if (intExtra == 2) {
                                    ALog.m6090d(intExtra2, "open activity", new Object[0]);
                                } else if (intExtra == 3) {
                                    ALog.m6090d(intExtra2, "open url", new Object[0]);
                                }
                                stringExtra5.startActivity(intent3);
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        str6 = intExtra2;
                    }
                }
                C1204l.f6942a.mo5088i("Open msg(" + stringExtra3 + ")");
                str2 = stringExtra6;
                context3 = stringExtra5;
            } catch (Throwable th7) {
                th = th7;
                str2 = stringExtra6;
                str3 = ")";
                str4 = "Open msg(";
                str5 = "MPS:CPushServiceListener";
                context2 = stringExtra5;
                ALog.m6091e(str5, "startActivity error", th, new Object[0]);
                C1204l.f6942a.mo5088i(str4 + stringExtra3 + str3);
                context3 = context2;
                TaobaoRegister.clickMessage(context3, stringExtra3, str2);
                return 0;
            }
        } catch (Throwable th8) {
            th = th8;
            stringExtra5 = context;
        }
        TaobaoRegister.clickMessage(context3, stringExtra3, str2);
        return 0;
    }
}
