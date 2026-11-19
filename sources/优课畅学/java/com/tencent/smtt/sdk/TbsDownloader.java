package com.tencent.smtt.sdk;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import androidx.compose.material3.internal.CalendarModelKt;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import com.tencent.smtt.sdk.TbsListener;
import com.tencent.smtt.utils.Apn;
import com.tencent.smtt.utils.C6843a;
import com.tencent.smtt.utils.C6845b;
import com.tencent.smtt.utils.C6854k;
import com.tencent.smtt.utils.TbsLog;
import java.io.File;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class TbsDownloader {
    public static final boolean DEBUG_DISABLE_DOWNLOAD = false;
    public static boolean DOWNLOAD_OVERSEA_TBS = false;
    public static final String LOGTAG = "TbsDownload";

    /* renamed from: a */
    static boolean f6627a = false;

    /* renamed from: b */
    private static String f6628b = null;

    /* renamed from: c */
    private static Context f6629c = null;

    /* renamed from: d */
    private static Handler f6630d = null;

    /* renamed from: e */
    private static String f6631e = null;

    /* renamed from: f */
    private static Object f6632f = new byte[0];

    /* renamed from: g */
    private static C6778ad f6633g = null;

    /* renamed from: h */
    private static HandlerThread f6634h = null;

    /* renamed from: i */
    private static boolean f6635i = false;

    /* renamed from: j */
    private static boolean f6636j = false;

    /* renamed from: k */
    private static boolean f6637k = false;

    /* renamed from: l */
    private static long f6638l = -1;

    public interface TbsDownloaderCallback {
        void onNeedDownloadFinish(boolean z10, int i10);
    }

    /* renamed from: c */
    private static boolean m5868c() {
        try {
            for (String str : TbsShareManager.getCoreProviderAppList()) {
                if (TbsShareManager.getSharedTbsCoreVersion(f6629c, str) > 0) {
                    return true;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return false;
    }

    /* renamed from: d */
    private static synchronized void m5870d() {
        try {
            if (f6634h == null) {
                f6634h = HandlerThreadC6783ai.m6061a();
                try {
                    f6633g = new C6778ad(f6629c);
                    f6630d = new HandlerC6781ag(f6634h.getLooper());
                } catch (Exception unused) {
                    f6635i = true;
                    TbsLog.m6246e(LOGTAG, "TbsApkDownloader init has Exception");
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: e */
    private static boolean m5871e() throws Throwable {
        try {
            return TbsDownloadConfig.getInstance(f6629c).mPreferences.getString(TbsDownloadConfig.TbsConfigKey.KEY_LAST_THIRDAPP_SENDREQUEST_COREVERSION, "").equals(m5872f().toString());
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: f */
    private static JSONArray m5872f() throws Throwable {
        if (!TbsShareManager.isThirdPartyApp(f6629c)) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        String[] coreProviderAppList = TbsShareManager.getCoreProviderAppList();
        String packageName = f6629c.getApplicationContext().getPackageName();
        if (packageName.equals(TbsShareManager.m5934f(f6629c))) {
            int length = coreProviderAppList.length;
            String[] strArr = new String[length + 1];
            System.arraycopy(coreProviderAppList, 0, strArr, 0, length);
            strArr[length] = packageName;
            coreProviderAppList = strArr;
        }
        for (String str : coreProviderAppList) {
            int sharedTbsCoreVersion = TbsShareManager.getSharedTbsCoreVersion(f6629c, str);
            if (sharedTbsCoreVersion > 0) {
                Context contextM5924a = TbsShareManager.m5924a(f6629c, str);
                if (contextM5924a == null || C6785ak.m6068a().m6112e(contextM5924a)) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= jSONArray.length()) {
                            jSONArray.put(sharedTbsCoreVersion);
                            break;
                        }
                        if (jSONArray.optInt(i10) == sharedTbsCoreVersion) {
                            break;
                        }
                        i10++;
                    }
                } else {
                    TbsLog.m6246e(LOGTAG, "host check failed,packageName = " + str);
                }
            }
        }
        for (String str2 : coreProviderAppList) {
            int coreShareDecoupleCoreVersion = TbsShareManager.getCoreShareDecoupleCoreVersion(f6629c, str2);
            if (coreShareDecoupleCoreVersion > 0) {
                Context contextM5924a2 = TbsShareManager.m5924a(f6629c, str2);
                if (contextM5924a2 == null || C6785ak.m6068a().m6112e(contextM5924a2)) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= jSONArray.length()) {
                            jSONArray.put(coreShareDecoupleCoreVersion);
                            break;
                        }
                        if (jSONArray.optInt(i11) == coreShareDecoupleCoreVersion) {
                            break;
                        }
                        i11++;
                    }
                } else {
                    TbsLog.m6246e(LOGTAG, "host check failed,packageName = " + str2);
                }
            }
        }
        if (TbsShareManager.getHostCorePathAppDefined() != null) {
            int iM6092a = C6785ak.m6068a().m6092a(TbsShareManager.getHostCorePathAppDefined());
            for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                if (jSONArray.optInt(i12) == iM6092a) {
                    return jSONArray;
                }
            }
            jSONArray.put(iM6092a);
        }
        return jSONArray;
    }

    /* renamed from: g */
    private static boolean m5873g() {
        int i10;
        TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(f6629c);
        if (tbsDownloadConfig.mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOAD_SUCCESS_RETRYTIMES, 0) >= tbsDownloadConfig.getDownloadSuccessMaxRetrytimes()) {
            TbsLog.m6249i(LOGTAG, "[TbsDownloader.needStartDownload] out of success retrytimes", true);
            i10 = -115;
        } else if (tbsDownloadConfig.mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOAD_FAILED_RETRYTIMES, 0) >= tbsDownloadConfig.getDownloadFailedMaxRetrytimes()) {
            TbsLog.m6249i(LOGTAG, "[TbsDownloader.needStartDownload] out of failed retrytimes", true);
            i10 = -116;
        } else {
            if (C6854k.m6319b(f6629c)) {
                if (System.currentTimeMillis() - tbsDownloadConfig.mPreferences.getLong(TbsDownloadConfig.TbsConfigKey.KEY_TBSDOWNLOAD_STARTTIME, 0L) <= CalendarModelKt.MillisecondsIn24Hours) {
                    long j10 = tbsDownloadConfig.mPreferences.getLong(TbsDownloadConfig.TbsConfigKey.KEY_TBSDOWNLOAD_FLOW, 0L);
                    TbsLog.m6248i(LOGTAG, "[TbsDownloader.needStartDownload] downloadFlow=" + j10);
                    if (j10 >= tbsDownloadConfig.getDownloadMaxflow()) {
                        TbsLog.m6249i(LOGTAG, "[TbsDownloader.needStartDownload] failed because you exceeded max flow!", true);
                        i10 = -120;
                    }
                }
                return true;
            }
            TbsLog.m6249i(LOGTAG, "[TbsDownloader.needStartDownload] local rom freespace limit", true);
            i10 = -117;
        }
        tbsDownloadConfig.setDownloadInterruptCode(i10);
        return false;
    }

    public static int getCoreShareDecoupleCoreVersion() {
        return C6785ak.m6068a().m6114g(f6629c);
    }

    public static synchronized boolean getOverSea(Context context) {
        try {
            if (!f6637k) {
                f6637k = true;
                TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(context);
                if (tbsDownloadConfig.mPreferences.contains(TbsDownloadConfig.TbsConfigKey.KEY_IS_OVERSEA)) {
                    f6636j = tbsDownloadConfig.mPreferences.getBoolean(TbsDownloadConfig.TbsConfigKey.KEY_IS_OVERSEA, false);
                    TbsLog.m6248i(LOGTAG, "[TbsDownloader.getOverSea]  first called. sOverSea = " + f6636j);
                }
                TbsLog.m6248i(LOGTAG, "[TbsDownloader.getOverSea]  sOverSea = " + f6636j);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6636j;
    }

    public static long getRetryIntervalInSeconds() {
        return f6638l;
    }

    public static HandlerThread getsTbsHandlerThread() {
        return f6634h;
    }

    /* renamed from: h */
    private static JSONArray m5874h() {
        JSONArray jSONArray = new JSONArray();
        for (String str : TbsShareManager.getCoreProviderAppList()) {
            File file = new File(C6854k.m6300a(f6629c, str, 4, false), getOverSea(f6629c) ? "x5.oversea.tbs.org" : "x5.tbs.org");
            if (file.exists()) {
                long jM6260a = C6843a.m6260a(f6629c, file);
                if (jM6260a > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= jSONArray.length()) {
                            jSONArray.put(jM6260a);
                            break;
                        }
                        if (jSONArray.optInt(i10) == jM6260a) {
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
        return jSONArray;
    }

    public static boolean isDownloadForeground() {
        C6778ad c6778ad = f6633g;
        return c6778ad != null && c6778ad.m6041e();
    }

    public static synchronized boolean isDownloading() {
        TbsLog.m6248i(LOGTAG, "[TbsDownloader.isDownloading] is " + f6627a);
        return f6627a;
    }

    public static boolean needDownload(Context context, boolean z10) {
        return needDownload(context, z10, false, null);
    }

    public static boolean needDownloadDecoupleCore() {
        int i10;
        if (TbsShareManager.isThirdPartyApp(f6629c) || TbsDownloadConfig.getInstance(f6629c).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOADDECOUPLECORE, 0) == 1) {
            return false;
        }
        return System.currentTimeMillis() - TbsDownloadConfig.getInstance(f6629c).mPreferences.getLong(TbsDownloadConfig.TbsConfigKey.KEY_LAST_DOWNLOAD_DECOUPLE_CORE, 0L) >= TbsDownloadConfig.getInstance(f6629c).getRetryInterval() * 1000 && (i10 = TbsDownloadConfig.getInstance(f6629c).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DECOUPLECOREVERSION, 0)) > 0 && i10 != C6785ak.m6068a().m6114g(f6629c) && TbsDownloadConfig.getInstance(f6629c).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0) != i10;
    }

    public static boolean needSendRequest(Context context, boolean z10) throws Throwable {
        f6629c = context.getApplicationContext();
        TbsLog.initIfNeed(context);
        boolean z11 = false;
        if (!m5858a(f6629c, z10, (TbsDownloaderCallback) null)) {
            return false;
        }
        int iM6117j = C6785ak.m6068a().m6117j(context);
        TbsLog.m6248i(LOGTAG, "[TbsDownloader.needSendRequest] localTbsVersion=" + iM6117j);
        if (iM6117j > 0) {
            return false;
        }
        if (m5859a(f6629c, false, true)) {
            return true;
        }
        TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(f6629c);
        boolean zContains = tbsDownloadConfig.mPreferences.contains(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD);
        TbsLog.m6248i(LOGTAG, "[TbsDownloader.needSendRequest] hasNeedDownloadKey=" + zContains);
        boolean z12 = !zContains ? true : tbsDownloadConfig.mPreferences.getBoolean(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD, false);
        TbsLog.m6248i(LOGTAG, "[TbsDownloader.needSendRequest] needDownload=" + z12);
        if (z12 && m5873g()) {
            z11 = true;
        }
        TbsLog.m6248i(LOGTAG, "[TbsDownloader.needSendRequest] ret=" + z11);
        return z11;
    }

    public static void setRetryIntervalInSeconds(Context context, long j10) {
        if (context == null) {
            return;
        }
        if (context.getApplicationInfo().packageName.equals("com.tencent.qqlive")) {
            f6638l = j10;
        }
        TbsLog.m6248i(LOGTAG, "mRetryIntervalInSeconds is " + f6638l);
    }

    public static boolean startDecoupleCoreIfNeeded() throws Throwable {
        StringBuilder sb;
        int iM6114g;
        TbsLog.m6248i(LOGTAG, "startDecoupleCoreIfNeeded ");
        if (TbsShareManager.isThirdPartyApp(f6629c)) {
            return false;
        }
        TbsLog.m6248i(LOGTAG, "startDecoupleCoreIfNeeded #1");
        if (TbsDownloadConfig.getInstance(f6629c).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOADDECOUPLECORE, 0) == 1) {
            return false;
        }
        TbsLog.m6248i(LOGTAG, "startDecoupleCoreIfNeeded #2");
        long j10 = TbsDownloadConfig.getInstance(f6629c).mPreferences.getLong(TbsDownloadConfig.TbsConfigKey.KEY_LAST_DOWNLOAD_DECOUPLE_CORE, 0L);
        if (System.currentTimeMillis() - j10 < TbsDownloadConfig.getInstance(f6629c).getRetryInterval() * 1000) {
            return false;
        }
        TbsLog.m6248i(LOGTAG, "startDecoupleCoreIfNeeded #3");
        int i10 = TbsDownloadConfig.getInstance(f6629c).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DECOUPLECOREVERSION, 0);
        if (i10 <= 0 || i10 == C6785ak.m6068a().m6114g(f6629c)) {
            sb = new StringBuilder();
            sb.append("startDecoupleCoreIfNeeded no need, deCoupleCoreVersion is ");
            sb.append(i10);
            sb.append(" getTbsCoreShareDecoupleCoreVersion is ");
            iM6114g = C6785ak.m6068a().m6114g(f6629c);
        } else {
            if (TbsDownloadConfig.getInstance(f6629c).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0) != i10 || TbsDownloadConfig.getInstance(f6629c).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V_TYPE, 0) == 1) {
                TbsLog.m6248i(LOGTAG, "startDecoupleCoreIfNeeded #4");
                f6627a = true;
                f6630d.removeMessages(108);
                Message messageObtain = Message.obtain(f6630d, 108, QbSdk.f6582k);
                messageObtain.arg1 = 0;
                messageObtain.sendToTarget();
                TbsDownloadConfig.getInstance(f6629c).f6625a.put(TbsDownloadConfig.TbsConfigKey.KEY_LAST_DOWNLOAD_DECOUPLE_CORE, Long.valueOf(System.currentTimeMillis()));
                return true;
            }
            sb = new StringBuilder();
            sb.append("startDecoupleCoreIfNeeded no need, KEY_TBS_DOWNLOAD_V is ");
            sb.append(TbsDownloadConfig.getInstance(f6629c).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0));
            sb.append(" deCoupleCoreVersion is ");
            sb.append(i10);
            sb.append(" KEY_TBS_DOWNLOAD_V_TYPE is ");
            iM6114g = TbsDownloadConfig.getInstance(f6629c).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V_TYPE, 0);
        }
        sb.append(iM6114g);
        TbsLog.m6248i(LOGTAG, sb.toString());
        return false;
    }

    public static void startDownload(Context context) {
        startDownload(context, false);
    }

    public static void stopDownload() {
        if (f6635i) {
            return;
        }
        TbsLog.m6248i(LOGTAG, "[TbsDownloader.stopDownload]");
        C6778ad c6778ad = f6633g;
        if (c6778ad != null) {
            c6778ad.m6039c();
        }
        Handler handler = f6630d;
        if (handler != null) {
            handler.removeMessages(100);
            f6630d.removeMessages(101);
            f6630d.removeMessages(108);
        }
    }

    /* renamed from: a */
    public static File m5854a(int i10) {
        String str;
        File file = null;
        for (String str2 : TbsShareManager.getCoreProviderAppList()) {
            if (!str2.equals(f6629c.getApplicationInfo().packageName)) {
                file = new File(C6854k.m6300a(f6629c, str2, 4, false), getOverSea(f6629c) ? "x5.oversea.tbs.org" : "x5.tbs.org");
                if (!file.exists()) {
                    str = "can not find local backup core file";
                } else {
                    if (C6843a.m6260a(f6629c, file) == i10) {
                        TbsLog.m6248i(LOGTAG, "local tbs version fond,path = " + file.getAbsolutePath());
                        return file;
                    }
                    str = "version is not match";
                }
                TbsLog.m6248i(LOGTAG, str);
            }
        }
        return file;
    }

    /* renamed from: b */
    public static File m5864b(int i10) {
        StringBuilder sb;
        String[] coreProviderAppList = TbsShareManager.getCoreProviderAppList();
        int length = coreProviderAppList.length;
        File file = null;
        int i11 = 0;
        while (i11 < length) {
            String str = coreProviderAppList[i11];
            File file2 = new File(C6854k.m6300a(f6629c, str, 4, false), getOverSea(f6629c) ? "x5.oversea.tbs.org" : "x5.tbs.org");
            if (file2.exists() && C6843a.m6260a(f6629c, file2) == i10) {
                sb = new StringBuilder();
            } else {
                file2 = new File(C6854k.m6300a(f6629c, str, 4, false), "x5.tbs.decouple");
                if (file2.exists() && C6843a.m6260a(f6629c, file2) == i10) {
                    sb = new StringBuilder();
                } else {
                    i11++;
                    file = file2;
                }
            }
            sb.append("local tbs version fond,path = ");
            sb.append(file2.getAbsolutePath());
            TbsLog.m6248i(LOGTAG, sb.toString());
            return file2;
        }
        return file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013b  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m5869c(boolean r12, boolean r13, boolean r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsDownloader.m5869c(boolean, boolean, boolean):boolean");
    }

    public static boolean needDownload(Context context, boolean z10, boolean z11, TbsDownloaderCallback tbsDownloaderCallback) throws Throwable {
        boolean z12;
        int i10;
        TbsLog.initIfNeed(context);
        if (!C6785ak.f6813b) {
            TbsLog.app_extra(LOGTAG, context);
            Context applicationContext = context.getApplicationContext();
            f6629c = applicationContext;
            TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(applicationContext);
            tbsDownloadConfig.setDownloadInterruptCode(-100);
            if (m5858a(f6629c, z10, tbsDownloaderCallback)) {
                m5870d();
                if (f6635i) {
                    if (tbsDownloaderCallback != null) {
                        tbsDownloaderCallback.onNeedDownloadFinish(false, 0);
                    }
                    tbsDownloadConfig.setDownloadInterruptCode(TXEAudioDef.TXE_AUDIO_PLAY_ERR_NOT_CREATE_JIT);
                    return false;
                }
                boolean zM5859a = m5859a(f6629c, z11, false);
                if (zM5859a) {
                    m5857a(z11, tbsDownloaderCallback);
                    tbsDownloadConfig.setDownloadInterruptCode(-114);
                }
                f6630d.removeMessages(102);
                Message.obtain(f6630d, 102).sendToTarget();
                if (QbSdk.f6574c || !TbsShareManager.isThirdPartyApp(context)) {
                    boolean zContains = tbsDownloadConfig.mPreferences.contains(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD);
                    TbsLog.m6248i(LOGTAG, "[TbsDownloader.needDownload] hasNeedDownloadKey=" + zContains);
                    z12 = (zContains || TbsShareManager.isThirdPartyApp(context)) ? tbsDownloadConfig.mPreferences.getBoolean(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD, false) : true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    int iM6117j = C6785ak.m6068a().m6117j(f6629c);
                    if (zM5859a || iM6117j <= 0) {
                        f6630d.removeMessages(TbsListener.ErrorCode.READ_RESPONSE_ERROR);
                        ((iM6117j > 0 || zM5859a) ? Message.obtain(f6630d, TbsListener.ErrorCode.READ_RESPONSE_ERROR, 1, 0, f6629c) : Message.obtain(f6630d, TbsListener.ErrorCode.READ_RESPONSE_ERROR, 0, 0, f6629c)).sendToTarget();
                        i10 = -121;
                    } else {
                        i10 = -119;
                    }
                } else {
                    if (!m5873g()) {
                        z12 = false;
                        if (!zM5859a && tbsDownloaderCallback != null) {
                            tbsDownloaderCallback.onNeedDownloadFinish(false, 0);
                        }
                        TbsLog.m6248i(LOGTAG, "[TbsDownloader.needDownload] needDownload=" + z12);
                        return z12;
                    }
                    i10 = -118;
                }
                tbsDownloadConfig.setDownloadInterruptCode(i10);
                if (!zM5859a) {
                    tbsDownloaderCallback.onNeedDownloadFinish(false, 0);
                }
                TbsLog.m6248i(LOGTAG, "[TbsDownloader.needDownload] needDownload=" + z12);
                return z12;
            }
        } else if (tbsDownloaderCallback != null) {
            tbsDownloaderCallback.onNeedDownloadFinish(false, 0);
            return false;
        }
        return false;
    }

    public static synchronized void startDownload(Context context, boolean z10) {
        TbsLog.m6248i(LOGTAG, "[TbsDownloader.startDownload] sAppContext=" + f6629c);
        if (C6785ak.f6813b) {
            return;
        }
        f6627a = true;
        Context applicationContext = context.getApplicationContext();
        f6629c = applicationContext;
        TbsDownloadConfig.getInstance(applicationContext).setDownloadInterruptCode(-200);
        m5870d();
        if (f6635i) {
            QbSdk.f6582k.onDownloadFinish(TbsListener.ErrorCode.THREAD_INIT_ERROR);
            TbsDownloadConfig.getInstance(f6629c).setDownloadInterruptCode(-202);
            return;
        }
        if (z10) {
            stopDownload();
        }
        f6630d.removeMessages(101);
        f6630d.removeMessages(100);
        Message messageObtain = Message.obtain(f6630d, 101, QbSdk.f6582k);
        messageObtain.arg1 = z10 ? 1 : 0;
        messageObtain.sendToTarget();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m5855a(android.content.Context r6) {
        /*
            java.lang.String r6 = "ISO8859-1"
            java.lang.String r0 = "UTF-8"
            java.lang.String r1 = com.tencent.smtt.sdk.TbsDownloader.f6628b
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Lf
            java.lang.String r6 = com.tencent.smtt.sdk.TbsDownloader.f6628b
            return r6
        Lf:
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.String r3 = android.os.Build.VERSION.RELEASE
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Exception -> L24
            byte[] r5 = r3.getBytes(r0)     // Catch: java.lang.Exception -> L24
            r4.<init>(r5, r6)     // Catch: java.lang.Exception -> L24
            r3 = r4
        L24:
            int r4 = r3.length()
            if (r4 <= 0) goto L2e
        L2a:
            r2.append(r3)
            goto L31
        L2e:
            java.lang.String r3 = "1.0"
            goto L2a
        L31:
            java.lang.String r3 = "; "
            r2.append(r3)
            java.lang.String r4 = r1.getLanguage()
            if (r4 == 0) goto L53
            java.lang.String r4 = r4.toLowerCase()
            r2.append(r4)
            java.lang.String r1 = r1.getCountry()
            if (r1 == 0) goto L58
            java.lang.String r4 = "-"
            r2.append(r4)
            java.lang.String r1 = r1.toLowerCase()
            goto L55
        L53:
            java.lang.String r1 = "en"
        L55:
            r2.append(r1)
        L58:
            java.lang.String r1 = "REL"
            java.lang.String r4 = android.os.Build.VERSION.CODENAME
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L7a
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Exception -> L6e
            byte[] r0 = r1.getBytes(r0)     // Catch: java.lang.Exception -> L6e
            r4.<init>(r0, r6)     // Catch: java.lang.Exception -> L6e
            r1 = r4
        L6e:
            int r6 = r1.length()
            if (r6 <= 0) goto L7a
            r2.append(r3)
            r2.append(r1)
        L7a:
            java.lang.String r6 = android.os.Build.ID
            java.lang.String r0 = "[一-龥]"
            java.lang.String r1 = ""
            java.lang.String r6 = r6.replaceAll(r0, r1)
            int r0 = r6.length()
            if (r0 <= 0) goto L92
            java.lang.String r0 = " Build/"
            r2.append(r0)
            r2.append(r6)
        L92:
            java.lang.String r6 = "Mozilla/5.0 (Linux; U; Android %s) AppleWebKit/533.1 (KHTML, like Gecko)Version/4.0 Mobile Safari/533.1"
            java.lang.Object[] r0 = new java.lang.Object[]{r2}
            java.lang.String r6 = java.lang.String.format(r6, r0)
            com.tencent.smtt.sdk.TbsDownloader.f6628b = r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsDownloader.m5855a(android.content.Context):java.lang.String");
    }

    /* renamed from: b */
    private static JSONObject m5865b(boolean z10, boolean z11, boolean z12) throws Throwable {
        int iM6117j;
        TbsLog.m6248i(LOGTAG, "[TbsDownloader.postJsonData]isQuery: " + z10 + " forDecoupleCore is " + z12);
        TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(f6629c);
        Object objM5855a = m5855a(f6629c);
        String strM6277d = C6845b.m6277d(f6629c);
        String strM6276c = C6845b.m6276c(f6629c);
        String strM6279f = C6845b.m6279f(f6629c);
        Object id = TimeZone.getDefault().getID();
        String str = id != null ? id : "";
        try {
            TelephonyManager telephonyManager = (TelephonyManager) f6629c.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            if (telephonyManager != null) {
                id = telephonyManager.getSimCountryIso();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        Object obj = id != null ? id : "";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("TIMEZONEID", str);
            jSONObject.put("COUNTRYISO", obj);
            jSONObject.put("PROTOCOLVERSION", 1);
            if (TbsShareManager.isThirdPartyApp(f6629c)) {
                iM6117j = QbSdk.f6574c ? TbsShareManager.m5923a(f6629c, false) : TbsDownloadConfig.getInstance(f6629c).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0);
            } else {
                iM6117j = C6785ak.m6068a().m6117j(f6629c);
                if (iM6117j == 0 && C6785ak.m6068a().m6116i(f6629c)) {
                    iM6117j = -1;
                }
                TbsLog.m6248i(LOGTAG, "[TbsDownloader.postJsonData] tbsLocalVersion=" + iM6117j + " isDownloadForeground=" + z11);
                if (z11 && !C6785ak.m6068a().m6116i(f6629c)) {
                    iM6117j = 0;
                }
            }
            if (z10) {
                jSONObject.put("FUNCTION", 2);
            } else {
                jSONObject.put("FUNCTION", iM6117j == 0 ? 0 : 1);
            }
            if (TbsShareManager.isThirdPartyApp(f6629c)) {
                JSONArray jSONArrayM5872f = m5872f();
                jSONObject.put("TBSVLARR", jSONArrayM5872f);
                tbsDownloadConfig.f6625a.put(TbsDownloadConfig.TbsConfigKey.KEY_LAST_THIRDAPP_SENDREQUEST_COREVERSION, jSONArrayM5872f.toString());
                tbsDownloadConfig.commit();
                if (QbSdk.f6574c) {
                    jSONObject.put("THIRDREQ", 1);
                }
            } else {
                JSONArray jSONArrayM5874h = m5874h();
                if (Apn.getApnType(f6629c) != 3 && jSONArrayM5874h.length() != 0 && iM6117j == 0 && z10) {
                    jSONObject.put("TBSBACKUPARR", jSONArrayM5874h);
                }
            }
            jSONObject.put("APPN", f6629c.getPackageName());
            jSONObject.put("APPVN", m5856a(tbsDownloadConfig.mPreferences.getString(TbsDownloadConfig.TbsConfigKey.KEY_APP_VERSIONNAME, null)));
            jSONObject.put("APPVC", tbsDownloadConfig.mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_APP_VERSIONCODE, 0));
            jSONObject.put("APPMETA", m5856a(tbsDownloadConfig.mPreferences.getString(TbsDownloadConfig.TbsConfigKey.KEY_APP_METADATA, null)));
            jSONObject.put("TBSSDKV", 43500);
            jSONObject.put("TBSV", iM6117j);
            jSONObject.put("DOWNLOADDECOUPLECORE", z12 ? 1 : 0);
            tbsDownloadConfig.f6625a.put(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOADDECOUPLECORE, Integer.valueOf(z12 ? 1 : 0));
            tbsDownloadConfig.commit();
            if (iM6117j != 0) {
                jSONObject.put("TBSBACKUPV", f6633g.m6037b());
            }
            jSONObject.put("CPU", f6631e);
            jSONObject.put("UA", objM5855a);
            jSONObject.put("IMSI", m5856a(strM6277d));
            jSONObject.put("IMEI", m5856a(strM6276c));
            jSONObject.put("ANDROID_ID", m5856a(strM6279f));
            if (!TbsShareManager.isThirdPartyApp(f6629c)) {
                if (iM6117j != 0) {
                    jSONObject.put("STATUS", !QbSdk.m5841a(f6629c, iM6117j) ? 1 : 0);
                } else {
                    jSONObject.put("STATUS", 0);
                }
                jSONObject.put("TBSDV", C6785ak.m6068a().m6114g(f6629c));
            }
            boolean z13 = TbsDownloadConfig.getInstance(f6629c).mPreferences.getBoolean(TbsDownloadConfig.TbsConfigKey.KEY_FULL_PACKAGE, false);
            Object objM5837a = QbSdk.m5837a(f6629c, "can_unlzma", (Bundle) null);
            if ((objM5837a == null || !(objM5837a instanceof Boolean)) ? false : ((Boolean) objM5837a).booleanValue() ? !z13 : false) {
                jSONObject.put("REQUEST_LZMA", 1);
            }
            if (getOverSea(f6629c)) {
                jSONObject.put("OVERSEA", 1);
            }
            if (z11) {
                jSONObject.put("DOWNLOAD_FOREGROUND", 1);
            }
        } catch (Exception unused) {
        }
        TbsLog.m6248i(LOGTAG, "[TbsDownloader.postJsonData] jsonData=" + jSONObject.toString());
        return jSONObject;
    }

    /* renamed from: a */
    private static String m5856a(String str) {
        return str == null ? "" : str;
    }

    @TargetApi(11)
    /* renamed from: b */
    public static void m5866b(Context context) {
        TbsDownloadConfig.getInstance(context).clear();
        TbsLogReport.m5877a(context).m5901d();
        C6778ad.m6020c(context);
        context.getSharedPreferences("tbs_extension_config", 4).edit().clear().commit();
        context.getSharedPreferences("tbs_preloadx5_check_cfg_file", 4).edit().clear().commit();
    }

    /* renamed from: a */
    private static void m5857a(boolean z10, TbsDownloaderCallback tbsDownloaderCallback) {
        TbsLog.m6248i(LOGTAG, "[TbsDownloader.queryConfig]");
        f6630d.removeMessages(100);
        Message messageObtain = Message.obtain(f6630d, 100);
        if (tbsDownloaderCallback != null) {
            messageObtain.obj = tbsDownloaderCallback;
        }
        messageObtain.arg1 = z10 ? 1 : 0;
        messageObtain.sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m5867b(boolean z10, boolean z11) {
        return m5869c(z10, z11, false);
    }

    /* renamed from: a */
    private static boolean m5858a(Context context, boolean z10, TbsDownloaderCallback tbsDownloaderCallback) {
        int i10;
        TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(context);
        int i11 = Build.VERSION.SDK_INT;
        if (!QbSdk.f6574c && TbsShareManager.isThirdPartyApp(f6629c) && !m5868c()) {
            if (tbsDownloaderCallback != null) {
                tbsDownloaderCallback.onNeedDownloadFinish(false, 0);
            }
            return false;
        }
        if (!tbsDownloadConfig.mPreferences.contains(TbsDownloadConfig.TbsConfigKey.KEY_IS_OVERSEA)) {
            if (z10 && !TbsConfig.APP_WX.equals(context.getApplicationInfo().packageName)) {
                TbsLog.m6248i(LOGTAG, "needDownload-oversea is true, but not WX");
                z10 = false;
            }
            tbsDownloadConfig.f6625a.put(TbsDownloadConfig.TbsConfigKey.KEY_IS_OVERSEA, Boolean.valueOf(z10));
            tbsDownloadConfig.commit();
            f6636j = z10;
            TbsLog.m6248i(LOGTAG, "needDownload-first-called--isoversea = " + z10);
        }
        if (getOverSea(context)) {
            TbsLog.m6248i(LOGTAG, "needDownload- return false,  because of  version is " + i11 + ", and overea");
            if (tbsDownloaderCallback != null) {
                tbsDownloaderCallback.onNeedDownloadFinish(false, 0);
            }
            i10 = TXEAudioDef.TXE_AUDIO_PLAY_ERR_START_HW_DECODEC_FAILED;
        } else {
            Matcher matcher = null;
            String string = tbsDownloadConfig.mPreferences.getString(TbsDownloadConfig.TbsConfigKey.KEY_DEVICE_CPUABI, null);
            f6631e = string;
            if (TextUtils.isEmpty(string)) {
                return true;
            }
            try {
                matcher = Pattern.compile("i686|mips|x86_64").matcher(f6631e);
            } catch (Exception unused) {
            }
            if (matcher == null || !matcher.find()) {
                return true;
            }
            if (tbsDownloaderCallback != null) {
                tbsDownloaderCallback.onNeedDownloadFinish(false, 0);
            }
            i10 = TXEAudioDef.TXE_AUDIO_PLAY_ERR_REPEAT_OPTION;
        }
        tbsDownloadConfig.setDownloadInterruptCode(i10);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0196  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m5859a(android.content.Context r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsDownloader.m5859a(android.content.Context, boolean, boolean):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:127:0x027b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05d1 A[PHI: r1
      0x05d1: PHI (r1v29 com.tencent.smtt.sdk.TbsLogReport$TbsLogInfo) = (r1v26 com.tencent.smtt.sdk.TbsLogReport$TbsLogInfo), (r1v35 com.tencent.smtt.sdk.TbsLogReport$TbsLogInfo) binds: [B:247:0x063e, B:238:0x05cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05dd A[PHI: r1
      0x05dd: PHI (r1v27 com.tencent.smtt.sdk.TbsLogReport$TbsLogInfo) = (r1v26 com.tencent.smtt.sdk.TbsLogReport$TbsLogInfo), (r1v35 com.tencent.smtt.sdk.TbsLogReport$TbsLogInfo) binds: [B:247:0x063e, B:238:0x05cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x010e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0175 A[Catch: Exception -> 0x0181, TRY_LEAVE, TryCatch #14 {Exception -> 0x0181, blocks: (B:56:0x016d, B:58:0x0175), top: B:288:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c0  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @android.annotation.TargetApi(11)
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m5860a(java.lang.String r33, int r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 1641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsDownloader.m5860a(java.lang.String, int, boolean, boolean):boolean");
    }
}
