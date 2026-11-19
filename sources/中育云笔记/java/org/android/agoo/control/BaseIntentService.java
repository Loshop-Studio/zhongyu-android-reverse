package org.android.agoo.control;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.os.Messenger;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.AdapterUtilityImpl;
import com.taobao.accs.utl.OrangeAdapter;
import com.taobao.accs.utl.Utils;
import org.android.agoo.common.Config;
import org.android.agoo.message.MessageService;

/* loaded from: classes6.dex */
public abstract class BaseIntentService extends Service {
    private static final String TAG = "BaseIntentService";
    private static final String msgStatus = "4";
    private AgooFactory agooFactory;
    private MessageService messageService;
    private NotifManager notifyManager;
    private Context mContext = null;
    private Messenger messenger = new Messenger(new HandlerC10564h(this));

    private String getTrace(long j10) {
        return "appkey|" + j10 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + System.currentTimeMillis() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + (TextUtils.isEmpty(null) ? "unknow" : null) + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + (TextUtils.isEmpty(null) ? "unknow" : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[Catch: all -> 0x00e3, TryCatch #2 {all -> 0x00e3, blocks: (B:27:0x00a4, B:29:0x00ac, B:33:0x00f4, B:35:0x011d, B:37:0x0128, B:39:0x013a, B:40:0x0145, B:43:0x0158, B:47:0x0171, B:46:0x0167, B:26:0x0089), top: B:105:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011d A[Catch: all -> 0x00e3, TryCatch #2 {all -> 0x00e3, blocks: (B:27:0x00a4, B:29:0x00ac, B:33:0x00f4, B:35:0x011d, B:37:0x0128, B:39:0x013a, B:40:0x0145, B:43:0x0158, B:47:0x0171, B:46:0x0167, B:26:0x0089), top: B:105:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0171 A[Catch: all -> 0x00e3, TRY_LEAVE, TryCatch #2 {all -> 0x00e3, blocks: (B:27:0x00a4, B:29:0x00ac, B:33:0x00f4, B:35:0x011d, B:37:0x0128, B:39:0x013a, B:40:0x0145, B:43:0x0158, B:47:0x0171, B:46:0x0167, B:26:0x0089), top: B:105:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e7 A[Catch: all -> 0x0213, TryCatch #7 {all -> 0x0213, blocks: (B:61:0x01df, B:63:0x01e7, B:65:0x01ef, B:68:0x0216, B:69:0x021f, B:71:0x0227, B:85:0x028a, B:87:0x0296, B:88:0x029b, B:90:0x02e0, B:91:0x02ea, B:60:0x01c4), top: B:113:0x01c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x021f A[Catch: all -> 0x0213, TryCatch #7 {all -> 0x0213, blocks: (B:61:0x01df, B:63:0x01e7, B:65:0x01ef, B:68:0x0216, B:69:0x021f, B:71:0x0227, B:85:0x028a, B:87:0x0296, B:88:0x029b, B:90:0x02e0, B:91:0x02ea, B:60:0x01c4), top: B:113:0x01c4 }] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void handleRemoteMessage(android.content.Context r35, android.content.Intent r36) {
        /*
            Method dump skipped, instructions count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.control.BaseIntentService.handleRemoteMessage(android.content.Context, android.content.Intent):void");
    }

    private void handleRemovePackage(Context context, Intent intent) {
        if (intent == null || context == null) {
            return;
        }
        Uri data = intent.getData();
        String schemeSpecificPart = data != null ? data.getSchemeSpecificPart() : null;
        if (TextUtils.isEmpty(schemeSpecificPart)) {
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.m10116d(TAG, "handleRemovePackage---->[replacing:" + booleanExtra + "],uninstallPack=" + schemeSpecificPart, new Object[0]);
        }
        if (booleanExtra) {
            return;
        }
        this.notifyManager.doUninstall(schemeSpecificPart, booleanExtra);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (OrangeAdapter.isBindService(this) && Utils.isTarget26(this)) {
            getApplicationContext().bindService(new Intent(this, getClass()), new ServiceConnectionC10566j(this), 1);
        }
        return this.messenger.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        ThreadPoolExecutorFactory.execute(new RunnableC10567k(this));
    }

    @Deprecated
    public abstract void onError(Context context, String str);

    public void onHandleIntent(Intent intent) {
        this.mContext = getApplicationContext();
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            return;
        }
        ALog.m10119i(TAG, "onHandleIntent,action=" + action, new Object[0]);
        try {
            if (action.equals("org.agoo.android.intent.action.RECEIVE")) {
                handleRemoteMessage(this.mContext, intent);
            } else if (TextUtils.equals(action, "org.agoo.android.intent.action.REPORT")) {
                try {
                    ALog.m10119i(TAG, "is report cache msg,Config.isReportCacheMsg(mContext)=" + Config.m22239e(this.mContext), new Object[0]);
                    if (Config.m22239e(this.mContext) && AdapterUtilityImpl.isNetworkConnected(this.mContext)) {
                        Config.m22240f(this.mContext);
                        this.agooFactory.reportCacheMsg();
                        this.messageService.deleteCacheMessage();
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (ALog.isPrintLog(ALog.Level.I)) {
                        ALog.m10119i(TAG, "is clear all msg=" + Config.m22236b(this.mContext, jCurrentTimeMillis), new Object[0]);
                    }
                    if (Config.m22236b(this.mContext, jCurrentTimeMillis)) {
                        Config.m22232a(this.mContext, jCurrentTimeMillis);
                        this.messageService.deleteCacheMessage();
                    }
                } catch (Throwable th) {
                    ALog.m10117e(TAG, "reportCacheMsg", th, new Object[0]);
                }
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public abstract void onMessage(Context context, Intent intent);

    @Deprecated
    public abstract void onRegistered(Context context, String str);

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        ThreadPoolExecutorFactory.execute(new RunnableC10568l(this, intent));
        return 2;
    }
}
