package p124e0;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.alibaba.sdk.android.logger.ILog;
import com.taobao.accs.dispatch.IntentDispatch;
import com.taobao.accs.utl.ALog;
import com.taobao.agoo.TaobaoRegister;
import java.util.Iterator;
import org.android.agoo.common.AgooConstants;
import p038c0.AbstractC5206b;
import p038c0.AbstractC5218n;

/* renamed from: e0.g */
/* loaded from: classes3.dex */
public class C9067g {
    /* renamed from: a */
    public int m17852a(Intent intent, Context context) {
        return m17853b(intent, context, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v11, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.String] */
    /* renamed from: b */
    public int m17853b(Intent intent, Context context, int i10) {
        String str;
        ILog iLog;
        StringBuilder sb2;
        Context context2;
        String str2;
        String str3;
        String str4;
        String str5;
        Context context3;
        Context context4;
        Class<?> clsM2784a = AbstractC5218n.m2784a();
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
                intent2.setAction(AbstractC5206b.NOTIFICATION_REMOVED_ACTION);
                intent2.putExtra(AbstractC5206b.MESSAGE_ID, stringExtra);
                intent2.putExtra("title", intent.getStringExtra("title"));
                intent2.putExtra(AbstractC5206b.SUMMARY, intent.getStringExtra(AbstractC5206b.SUMMARY));
                intent2.putExtra(AbstractC5206b.EXTRA_MAP, intent.getStringExtra(AbstractC5206b.EXTRA_MAP));
                intent2.putExtra(AbstractC5206b.NOTIFICATION_OPEN_TYPE, intent.getIntExtra(AbstractC5206b.NOTIFICATION_OPEN_TYPE, 1));
                intent2.putExtra(AbstractC5206b.NOTIFICATION_GROUP, intent.getStringExtra(AbstractC5206b.NOTIFICATION_GROUP));
                intent2.setFlags(32);
                if (clsM2784a == null) {
                    context.sendBroadcast(intent2, context.getPackageName() + ".AGOO");
                } else {
                    intent2.setClass(context, clsM2784a);
                    IntentDispatch.dispatchIntent(context, intent2, clsM2784a.getName());
                }
                iLog = AbstractC5218n.f3101a;
                sb2 = new StringBuilder();
                str = "Delete msg(";
            } catch (Throwable th) {
                str = "Delete msg(";
                try {
                    ALog.m10117e("MPS:CPushServiceListener", "send intent failed.", th, new Object[0]);
                    iLog = AbstractC5218n.f3101a;
                    sb2 = new StringBuilder();
                } catch (Throwable th2) {
                    AbstractC5218n.f3101a.mo3538i(str + stringExtra + ")");
                    TaobaoRegister.dismissMessage(context, stringExtra, stringExtra2);
                    throw th2;
                }
            }
            sb2.append(str);
            sb2.append(stringExtra);
            sb2.append(")");
            iLog.mo3538i(sb2.toString());
            TaobaoRegister.dismissMessage(context, stringExtra, stringExtra2);
            return 0;
        }
        Intent intent3 = (Intent) intent.getExtras().get(AgooConstants.KEY_REAL_INTENT);
        intent3.setFlags(335544320);
        String stringExtra3 = intent3.getStringExtra("msgId");
        String stringExtra4 = intent3.getStringExtra("title");
        ?? stringExtra5 = intent3.getStringExtra(AbstractC5206b.SUMMARY);
        String stringExtra6 = intent.getStringExtra(AgooConstants.MESSAGE_EXT);
        String stringExtra7 = intent.getStringExtra(AbstractC5206b.NOTIFICATION_GROUP);
        int intExtra = intent3.getIntExtra(AbstractC5206b.NOTIFICATION_OPEN_TYPE, 1);
        int intExtra2 = intent3.getIntExtra(AbstractC5206b.NOTIFICATION_ID, 0);
        String stringExtra8 = intent3.getStringExtra(AbstractC5206b.EXTRA_MAP);
        try {
            ?? intent4 = new Intent();
            intent4.setPackage(context.getPackageName());
            intent4.setAction(AbstractC5206b.NOTIFICATION_OPENED_ACTION);
            intent4.putExtra(AbstractC5206b.MESSAGE_ID, stringExtra3);
            intent4.putExtra("title", stringExtra4);
            intent4.putExtra(AbstractC5206b.SUMMARY, stringExtra5);
            intent4.putExtra(AbstractC5206b.EXTRA_MAP, stringExtra8);
            intent4.putExtra(AbstractC5206b.NOTIFICATION_OPEN_TYPE, intExtra);
            intent4.putExtra(AbstractC5206b.NOTIFICATION_ID, intExtra2);
            if (!TextUtils.isEmpty(stringExtra7)) {
                intent4.putExtra(AbstractC5206b.NOTIFICATION_GROUP, stringExtra7);
            }
            intent4.setFlags(32);
            try {
                if (clsM2784a == null) {
                    ?? r32 = context;
                    r32.sendBroadcast(intent4, context.getPackageName() + ".AGOO");
                    stringExtra5 = r32;
                } else {
                    Context context5 = context;
                    intent4.setClass(context5, clsM2784a);
                    IntentDispatch.dispatchIntent(context5, intent4, clsM2784a.getName());
                    stringExtra5 = context5;
                }
                if (i10 == 0 && "android.intent.action.MAIN".equals(intent3.getAction()) && AbstractC9068h.m17854a(stringExtra5)) {
                    AbstractC5218n.f3101a.mo3533d("app is in front, action:" + intent3.getAction());
                } else {
                    try {
                        if (intExtra == 4) {
                            try {
                                ALog.m10119i("MPS:CPushServiceListener", "open with no action", new Object[0]);
                            } catch (Throwable th3) {
                                th = th3;
                                intent4 = "MPS:CPushServiceListener";
                                str2 = stringExtra6;
                                str3 = ")";
                                str4 = "Open msg(";
                                context3 = stringExtra5;
                                str5 = intent4;
                                try {
                                    ALog.m10117e(str5, "startActivity error", th, new Object[0]);
                                    AbstractC5218n.f3101a.mo3538i(str4 + stringExtra3 + str3);
                                    context4 = context3;
                                    TaobaoRegister.clickMessage(context4, stringExtra3, str2);
                                    return 0;
                                } catch (Throwable th4) {
                                    AbstractC5218n.f3101a.mo3538i(str4 + stringExtra3 + str3);
                                    TaobaoRegister.clickMessage(context3, stringExtra3, str2);
                                    throw th4;
                                }
                            }
                        } else {
                            intent4 = "MPS:CPushServiceListener";
                            if (intExtra == 1) {
                                ALog.m10119i(intent4, "open app", new Object[0]);
                                if (i10 != 0) {
                                    ALog.m10122w(intent4, "sdk version < 11 or start from activity, start app with launch activity", new Object[0]);
                                    stringExtra5.startActivity(intent3);
                                } else if (ContextCompat.checkSelfPermission(stringExtra5, "android.permission.GET_TASKS") == 0 && ContextCompat.checkSelfPermission(stringExtra5, "android.permission.REORDER_TASKS") == 0) {
                                    ActivityManager activityManager = (ActivityManager) stringExtra5.getSystemService(AgooConstants.OPEN_ACTIIVTY_NAME);
                                    Iterator<ActivityManager.RunningTaskInfo> it = activityManager.getRunningTasks(Integer.MAX_VALUE).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            ALog.m10122w(intent4, "do not find corresponing running task, start app with launch activity", new Object[0]);
                                            stringExtra5.startActivity(intent3);
                                            break;
                                        }
                                        ActivityManager.RunningTaskInfo next = it.next();
                                        if (next.topActivity.getPackageName().equals(stringExtra5.getPackageName())) {
                                            ALog.m10116d(intent4, "move task to front", new Object[0]);
                                            try {
                                                activityManager.moveTaskToFront(next.id, 0);
                                                break;
                                            } catch (Throwable th5) {
                                                ALog.m10121w(intent4, "move task to front fail", th5, new Object[0]);
                                            }
                                        }
                                    }
                                } else {
                                    ALog.m10116d(intent4, "no get tasks and reorder tasks permission, start app with launch activity", new Object[0]);
                                    stringExtra5.startActivity(intent3);
                                }
                            } else {
                                if (intExtra == 2) {
                                    ALog.m10116d(intent4, "open activity", new Object[0]);
                                } else if (intExtra == 3) {
                                    ALog.m10116d(intent4, "open url", new Object[0]);
                                }
                                stringExtra5.startActivity(intent3);
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                AbstractC5218n.f3101a.mo3538i("Open msg(" + stringExtra3 + ")");
                str2 = stringExtra6;
                context4 = stringExtra5;
            } catch (Throwable th7) {
                th = th7;
                context2 = stringExtra5;
                str2 = stringExtra6;
                str3 = ")";
                str4 = "Open msg(";
                str5 = "MPS:CPushServiceListener";
                context3 = context2;
                ALog.m10117e(str5, "startActivity error", th, new Object[0]);
                AbstractC5218n.f3101a.mo3538i(str4 + stringExtra3 + str3);
                context4 = context3;
                TaobaoRegister.clickMessage(context4, stringExtra3, str2);
                return 0;
            }
        } catch (Throwable th8) {
            th = th8;
            context2 = context;
        }
        TaobaoRegister.clickMessage(context4, stringExtra3, str2);
        return 0;
    }
}
