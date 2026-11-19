package org.android.agoo.control;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.os.Messenger;
import android.text.TextUtils;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.AdapterUtilityImpl;
import com.taobao.accs.utl.OrangeAdapter;
import com.taobao.accs.utl.Utils;
import org.android.agoo.common.Config;
import org.android.agoo.message.MessageService;

/* loaded from: classes.dex */
public abstract class BaseIntentService extends Service {
    private static final String TAG = "BaseIntentService";
    private static final String msgStatus = "4";
    private AgooFactory agooFactory;
    private MessageService messageService;
    private NotifManager notifyManager;
    private Context mContext = null;
    private Messenger messenger = new Messenger(new HandlerC2964h(this));

    private String getTrace(long j4) {
        return "appkey|" + j4 + "|" + System.currentTimeMillis() + "|" + (TextUtils.isEmpty(null) ? "unknow" : null) + "|" + (TextUtils.isEmpty(null) ? "unknow" : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0165 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1 A[Catch: all -> 0x0318, TryCatch #13 {all -> 0x0318, blocks: (B:33:0x00b1, B:35:0x00c1, B:36:0x00fe, B:38:0x0127, B:40:0x0131, B:42:0x0143, B:44:0x014d, B:47:0x015f, B:52:0x0177, B:50:0x016e, B:32:0x00a9), top: B:139:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0127 A[Catch: all -> 0x0318, TryCatch #13 {all -> 0x0318, blocks: (B:33:0x00b1, B:35:0x00c1, B:36:0x00fe, B:38:0x0127, B:40:0x0131, B:42:0x0143, B:44:0x014d, B:47:0x015f, B:52:0x0177, B:50:0x016e, B:32:0x00a9), top: B:139:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0177 A[Catch: all -> 0x0318, TRY_LEAVE, TryCatch #13 {all -> 0x0318, blocks: (B:33:0x00b1, B:35:0x00c1, B:36:0x00fe, B:38:0x0127, B:40:0x0131, B:42:0x0143, B:44:0x014d, B:47:0x015f, B:52:0x0177, B:50:0x016e, B:32:0x00a9), top: B:139:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f6 A[Catch: all -> 0x0316, TryCatch #12 {all -> 0x0316, blocks: (B:66:0x01ee, B:68:0x01f6, B:70:0x01fe, B:71:0x0221, B:73:0x0229, B:75:0x0231, B:90:0x02a6, B:92:0x02b2, B:93:0x02b7, B:95:0x0303, B:96:0x030d, B:65:0x01d3), top: B:138:0x01d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0229 A[Catch: all -> 0x0316, TryCatch #12 {all -> 0x0316, blocks: (B:66:0x01ee, B:68:0x01f6, B:70:0x01fe, B:71:0x0221, B:73:0x0229, B:75:0x0231, B:90:0x02a6, B:92:0x02b2, B:93:0x02b7, B:95:0x0303, B:96:0x030d, B:65:0x01d3), top: B:138:0x01d3 }] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void handleRemoteMessage(android.content.Context r34, android.content.Intent r35) {
        /*
            Method dump skipped, instructions count: 867
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
            ALog.m6090d(TAG, "handleRemovePackage---->[replacing:" + booleanExtra + "],uninstallPack=" + schemeSpecificPart, new Object[0]);
        }
        if (booleanExtra) {
            return;
        }
        this.notifyManager.doUninstall(schemeSpecificPart, booleanExtra);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (OrangeAdapter.isBindService(this) && Utils.isTarget26(this)) {
            getApplicationContext().bindService(new Intent(this, getClass()), new ServiceConnectionC2966j(this), 1);
        }
        return this.messenger.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        ThreadPoolExecutorFactory.execute(new RunnableC2967k(this));
    }

    @Deprecated
    protected abstract void onError(Context context, String str);

    protected void onHandleIntent(Intent intent) {
        this.mContext = getApplicationContext();
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            return;
        }
        ALog.m6093i(TAG, "onHandleIntent,action=" + action, new Object[0]);
        try {
            if (action.equals("org.agoo.android.intent.action.RECEIVE")) {
                handleRemoteMessage(this.mContext, intent);
            } else if (TextUtils.equals(action, "org.agoo.android.intent.action.REPORT")) {
                try {
                    ALog.m6093i(TAG, "is report cache msg,Config.isReportCacheMsg(mContext)=" + Config.m10021e(this.mContext), new Object[0]);
                    if (Config.m10021e(this.mContext) && AdapterUtilityImpl.isNetworkConnected(this.mContext)) {
                        Config.m10022f(this.mContext);
                        this.agooFactory.reportCacheMsg();
                        this.messageService.deleteCacheMessage();
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (ALog.isPrintLog(ALog.Level.I)) {
                        ALog.m6093i(TAG, "is clear all msg=" + Config.m10018b(this.mContext, jCurrentTimeMillis), new Object[0]);
                    }
                    if (Config.m10018b(this.mContext, jCurrentTimeMillis)) {
                        Config.m10014a(this.mContext, jCurrentTimeMillis);
                        this.messageService.deleteCacheMessage();
                    }
                } catch (Throwable th) {
                    ALog.m6091e(TAG, "reportCacheMsg", th, new Object[0]);
                }
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    protected abstract void onMessage(Context context, Intent intent);

    @Deprecated
    protected abstract void onRegistered(Context context, String str);

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i4, int i5) {
        ThreadPoolExecutorFactory.execute(new RunnableC2968l(this, intent));
        return 2;
    }
}
