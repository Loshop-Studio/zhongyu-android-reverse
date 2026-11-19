package com.tencent.smtt.sdk;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.tencent.smtt.audio.core.utils.TbsDialogBase;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import com.tencent.smtt.sdk.TbsLogReport;
import com.tencent.smtt.utils.Apn;
import com.tencent.smtt.utils.C6843a;
import com.tencent.smtt.utils.C6844aa;
import com.tencent.smtt.utils.C6854k;
import com.tencent.smtt.utils.TbsLog;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tencent.smtt.sdk.ad */
/* loaded from: classes4.dex */
class C6778ad {

    /* renamed from: d */
    private static int f6774d = 5;

    /* renamed from: e */
    private static int f6775e = 1;

    /* renamed from: f */
    private static final String[] f6776f = {"tbs_downloading_com.tencent.mtt", "tbs_downloading_com.tencent.mm", "tbs_downloading_com.tencent.mobileqq", "tbs_downloading_com.tencent.tbs", "tbs_downloading_com.qzone"};

    /* renamed from: A */
    private Set<String> f6777A;

    /* renamed from: C */
    private boolean f6779C;

    /* renamed from: a */
    String f6780a;

    /* renamed from: g */
    private Context f6783g;

    /* renamed from: h */
    private String f6784h;

    /* renamed from: i */
    private String f6785i;

    /* renamed from: j */
    private String f6786j;

    /* renamed from: k */
    private File f6787k;

    /* renamed from: l */
    private long f6788l;

    /* renamed from: o */
    private boolean f6791o;

    /* renamed from: p */
    private int f6792p;

    /* renamed from: q */
    private int f6793q;

    /* renamed from: r */
    private boolean f6794r;

    /* renamed from: s */
    private boolean f6795s;

    /* renamed from: t */
    private HttpURLConnection f6796t;

    /* renamed from: u */
    private String f6797u;

    /* renamed from: v */
    private TbsLogReport.TbsLogInfo f6798v;

    /* renamed from: w */
    private String f6799w;

    /* renamed from: x */
    private int f6800x;

    /* renamed from: y */
    private boolean f6801y;

    /* renamed from: z */
    private Handler f6802z;

    /* renamed from: m */
    private int f6789m = 30000;

    /* renamed from: n */
    private int f6790n = AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;

    /* renamed from: B */
    private int f6778B = f6774d;

    /* renamed from: b */
    String[] f6781b = null;

    /* renamed from: c */
    int f6782c = 0;

    public C6778ad(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f6783g = applicationContext;
        this.f6798v = TbsLogReport.m5877a(applicationContext).m5891a();
        this.f6777A = new HashSet();
        this.f6797u = "tbs_downloading_" + this.f6783g.getPackageName();
        C6785ak.m6068a();
        File fileM6087p = C6785ak.m6087p(this.f6783g);
        this.f6787k = fileM6087p;
        if (fileM6087p == null) {
            throw new NullPointerException("TbsCorePrivateDir is null!");
        }
        m6023f();
        this.f6799w = null;
        this.f6800x = -1;
    }

    /* renamed from: a */
    private long m6006a(long j10, long j11) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f6798v.setDownConsumeTime(jCurrentTimeMillis - j10);
        this.f6798v.setDownloadSize(j11);
        return jCurrentTimeMillis;
    }

    /* renamed from: f */
    private void m6023f() {
        this.f6792p = 0;
        this.f6793q = 0;
        this.f6788l = -1L;
        this.f6786j = null;
        this.f6791o = false;
        this.f6794r = false;
        this.f6795s = false;
        this.f6801y = false;
    }

    /* renamed from: g */
    private void m6024g() {
        TbsLogReport tbsLogReportM5877a;
        TbsLogReport.EventType eventType;
        TbsLog.m6248i(TbsDownloader.LOGTAG, "[TbsApkDownloader.closeHttpRequest]");
        HttpURLConnection httpURLConnection = this.f6796t;
        if (httpURLConnection != null) {
            if (!this.f6794r) {
                this.f6798v.setResolveIp(m6010a(httpURLConnection.getURL()));
            }
            try {
                this.f6796t.disconnect();
            } catch (Throwable th) {
                TbsLog.m6246e(TbsDownloader.LOGTAG, "[closeHttpRequest] mHttpRequest.disconnect() Throwable:" + th.toString());
            }
            this.f6796t = null;
        }
        TbsLogReport.TbsLogInfo tbsLogInfo = this.f6798v;
        int i10 = tbsLogInfo.f6649a;
        if (this.f6794r || !this.f6801y) {
            TbsDownloader.f6627a = false;
            return;
        }
        tbsLogInfo.setEventTime(System.currentTimeMillis());
        String apnInfo = Apn.getApnInfo(this.f6783g);
        if (apnInfo == null) {
            apnInfo = "";
        }
        int apnType = Apn.getApnType(this.f6783g);
        this.f6798v.setApn(apnInfo);
        this.f6798v.setNetworkType(apnType);
        if (apnType != this.f6800x || !apnInfo.equals(this.f6799w)) {
            this.f6798v.setNetworkChange(0);
        }
        TbsLogReport.TbsLogInfo tbsLogInfo2 = this.f6798v;
        int i11 = tbsLogInfo2.f6649a;
        if ((i11 == 0 || i11 == 107) && tbsLogInfo2.getDownFinalFlag() == 0 && (!Apn.isNetworkAvailable(this.f6783g) || !m6029l())) {
            m6011a(101, null, true);
        }
        if (TbsDownloadConfig.getInstance(this.f6783g).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOADDECOUPLECORE, 0) == 1) {
            tbsLogReportM5877a = TbsLogReport.m5877a(this.f6783g);
            eventType = TbsLogReport.EventType.TYPE_DOWNLOAD_DECOUPLE;
        } else {
            tbsLogReportM5877a = TbsLogReport.m5877a(this.f6783g);
            eventType = TbsLogReport.EventType.TYPE_DOWNLOAD;
        }
        tbsLogReportM5877a.m5895a(eventType, this.f6798v);
        this.f6798v.resetArgs();
        if (i10 != 100) {
            QbSdk.f6582k.onDownloadFinish(i10);
        }
    }

    /* renamed from: h */
    private boolean m6025h() {
        File file = new File(C6854k.m6298a(this.f6783g, 4), TbsDownloader.getOverSea(this.f6783g) ? "x5.oversea.tbs.org" : "x5.tbs.org");
        int i10 = TbsDownloadConfig.getInstance(this.f6783g).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_USE_BACKUP_VERSION, 0);
        if (i10 == 0) {
            i10 = TbsDownloadConfig.getInstance(this.f6783g).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0);
        }
        return C6843a.m6262a(this.f6783g, file, 0L, i10);
    }

    /* renamed from: i */
    private void m6026i() {
        try {
            if (TbsDownloadConfig.getInstance(this.f6783g).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOADDECOUPLECORE, 0) == 1) {
                return;
            }
            File file = new File(C6854k.m6298a(this.f6783g, 4), TbsDownloader.getOverSea(this.f6783g) ? "x5.oversea.tbs.org" : "x5.tbs.org");
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: j */
    private boolean m6027j() {
        return new File(this.f6787k, "x5.tbs.temp").exists();
    }

    /* renamed from: k */
    private long m6028k() {
        File file = new File(this.f6787k, "x5.tbs.temp");
        if (file.exists()) {
            return file.length();
        }
        return 0L;
    }

    /* renamed from: l */
    private boolean m6029l() throws IOException {
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        Throwable th;
        InputStream inputStream;
        boolean z10 = false;
        try {
            inputStream = Runtime.getRuntime().exec("ping www.qq.com").getInputStream();
            try {
                inputStreamReader = new InputStreamReader(inputStream);
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    int i10 = 0;
                    do {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            if (line.contains("TTL") || line.contains("ttl")) {
                                z10 = true;
                                break;
                            }
                            i10++;
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                                return z10;
                            } finally {
                                m6013a(inputStream);
                                m6013a(inputStreamReader);
                                m6013a(bufferedReader);
                            }
                        }
                    } while (i10 < 5);
                } catch (Throwable th3) {
                    bufferedReader = null;
                    th = th3;
                }
            } catch (Throwable th4) {
                bufferedReader = null;
                th = th4;
                inputStreamReader = null;
            }
        } catch (Throwable th5) {
            inputStreamReader = null;
            bufferedReader = null;
            th = th5;
            inputStream = null;
        }
        return z10;
    }

    /* renamed from: m */
    private long m6030m() {
        int i10 = this.f6792p;
        return (i10 == 1 || i10 == 2) ? i10 * 20000 : (i10 == 3 || i10 == 4) ? 100000L : 200000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public boolean m6031n() {
        HttpURLConnection httpURLConnection;
        Throwable th;
        boolean z10 = false;
        boolean z11 = Apn.getApnType(this.f6783g) == 3;
        TbsLog.m6248i(TbsDownloader.LOGTAG, "[TbsApkDwonloader.detectWifiNetworkAvailable] isWifi=" + z11);
        String str = null;
        if (z11) {
            String wifiSSID = Apn.getWifiSSID(this.f6783g);
            TbsLog.m6248i(TbsDownloader.LOGTAG, "[TbsApkDwonloader.detectWifiNetworkAvailable] localBSSID=" + wifiSSID);
            try {
                httpURLConnection = (HttpURLConnection) new URL("http://pms.mb.qq.com/rsp204").openConnection();
                try {
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setConnectTimeout(TbsDialogBase.BTN_ID_POSITIVE);
                    httpURLConnection.setReadTimeout(TbsDialogBase.BTN_ID_POSITIVE);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.getInputStream();
                    int responseCode = httpURLConnection.getResponseCode();
                    TbsLog.m6248i(TbsDownloader.LOGTAG, "[TbsApkDwonloader.detectWifiNetworkAvailable] responseCode=" + responseCode);
                    boolean z12 = responseCode == 204;
                    try {
                        httpURLConnection.disconnect();
                    } catch (Exception unused) {
                    }
                    str = wifiSSID;
                    z10 = z12;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        th.printStackTrace();
                        if (httpURLConnection != null) {
                            try {
                                httpURLConnection.disconnect();
                            } catch (Exception unused2) {
                            }
                        }
                        str = wifiSSID;
                        if (!z10) {
                            this.f6777A.add(str);
                            m6032o();
                            this.f6802z.sendMessageDelayed(this.f6802z.obtainMessage(150, str), 120000L);
                        }
                        if (z10) {
                            this.f6777A.remove(str);
                        }
                        return z10;
                    } catch (Throwable th3) {
                        if (httpURLConnection != null) {
                            try {
                                httpURLConnection.disconnect();
                            } catch (Exception unused3) {
                            }
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                httpURLConnection = null;
                th = th4;
            }
        }
        if (!z10 && !TextUtils.isEmpty(str) && !this.f6777A.contains(str)) {
            this.f6777A.add(str);
            m6032o();
            this.f6802z.sendMessageDelayed(this.f6802z.obtainMessage(150, str), 120000L);
        }
        if (z10 && this.f6777A.contains(str)) {
            this.f6777A.remove(str);
        }
        return z10;
    }

    /* renamed from: o */
    private void m6032o() {
        if (this.f6802z == null) {
            this.f6802z = new HandlerC6779ae(this, HandlerThreadC6783ai.m6061a().getLooper());
        }
    }

    /* renamed from: b */
    public int m6037b() {
        File fileM6007a = m6007a(this.f6783g);
        if (fileM6007a == null) {
            return 0;
        }
        return C6843a.m6260a(this.f6783g, new File(fileM6007a, TbsDownloader.getOverSea(this.f6783g) ? "x5.oversea.tbs.org" : "x5.tbs.org"));
    }

    /* renamed from: c */
    public void m6039c() {
        TbsLogReport tbsLogReportM5877a;
        TbsLogReport.EventType eventType;
        this.f6794r = true;
        if (TbsShareManager.isThirdPartyApp(this.f6783g)) {
            TbsLogReport.TbsLogInfo tbsLogInfoM5891a = TbsLogReport.m5877a(this.f6783g).m5891a();
            tbsLogInfoM5891a.setErrorCode(-309);
            tbsLogInfoM5891a.setFailDetail(new Exception());
            if (TbsDownloadConfig.getInstance(this.f6783g).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOADDECOUPLECORE, 0) == 1) {
                tbsLogReportM5877a = TbsLogReport.m5877a(this.f6783g);
                eventType = TbsLogReport.EventType.TYPE_DOWNLOAD_DECOUPLE;
            } else {
                tbsLogReportM5877a = TbsLogReport.m5877a(this.f6783g);
                eventType = TbsLogReport.EventType.TYPE_DOWNLOAD;
            }
            tbsLogReportM5877a.m5895a(eventType, tbsLogInfoM5891a);
        }
    }

    /* renamed from: d */
    public void m6040d() {
        m6039c();
        m6021c(false);
        m6021c(true);
    }

    /* renamed from: e */
    public boolean m6041e() {
        TbsLog.m6248i(TbsDownloader.LOGTAG, "[TbsApkDownloader.isDownloadForeground] mIsDownloadForeground=" + this.f6779C);
        return this.f6779C;
    }

    @TargetApi(8)
    /* renamed from: a */
    public static File m6007a(Context context) {
        try {
            File file = new File(C6854k.m6298a(context, 4));
            if (!file.exists() && !file.isDirectory()) {
                file.mkdirs();
            }
            return file;
        } catch (Exception e10) {
            e10.printStackTrace();
            TbsLog.m6246e(TbsDownloader.LOGTAG, "[TbsApkDownloader.backupApkPath] Exception is " + e10.getMessage());
            return null;
        }
    }

    @TargetApi(8)
    /* renamed from: b */
    public static File m6017b(Context context) {
        try {
            File fileM6008a = m6008a(context, 4);
            if (fileM6008a == null) {
                fileM6008a = m6008a(context, 3);
            }
            if (fileM6008a == null) {
                fileM6008a = m6008a(context, 2);
            }
            return fileM6008a == null ? m6008a(context, 1) : fileM6008a;
        } catch (Exception e10) {
            e10.printStackTrace();
            TbsLog.m6246e(TbsDownloader.LOGTAG, "[TbsApkDownloader.backupApkPath] Exception is " + e10.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public static void m6020c(Context context) {
        try {
            C6785ak.m6068a();
            File fileM6087p = C6785ak.m6087p(context);
            new File(fileM6087p, "x5.tbs").delete();
            new File(fileM6087p, "x5.tbs.temp").delete();
            File fileM6007a = m6007a(context);
            if (fileM6007a != null) {
                new File(fileM6007a, "x5.tbs.org").delete();
                new File(fileM6007a, "x5.oversea.tbs.org").delete();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static File m6008a(Context context, int i10) {
        File file = new File(C6854k.m6298a(context, i10));
        if (file.exists() && file.isDirectory()) {
            if (new File(file, TbsDownloader.getOverSea(context) ? "x5.oversea.tbs.org" : "x5.tbs.org").exists()) {
                return file;
            }
        }
        return null;
    }

    /* renamed from: b */
    private void m6018b(boolean z10) throws Throwable {
        C6844aa.m6264a(this.f6783g);
        TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(this.f6783g);
        Map<String, Object> map = tbsDownloadConfig.f6625a;
        Boolean bool = Boolean.FALSE;
        map.put(TbsDownloadConfig.TbsConfigKey.KEY_FULL_PACKAGE, bool);
        tbsDownloadConfig.f6625a.put(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD, bool);
        tbsDownloadConfig.f6625a.put(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOAD_INTERRUPT_CODE_REASON, -123);
        tbsDownloadConfig.commit();
        QbSdk.f6582k.onDownloadFinish(z10 ? 100 : 120);
        int i10 = tbsDownloadConfig.mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_RESPONSECODE, 0);
        TbsDownloadConfig.getInstance(this.f6783g).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOADDECOUPLECORE, 0);
        if (i10 != 3 && i10 <= 10000) {
            C6785ak.m6068a().m6096a(this.f6783g, new File(this.f6787k, "x5.tbs").getAbsolutePath(), tbsDownloadConfig.mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0));
            m6014a(new File(this.f6787k, "x5.tbs"), this.f6783g);
            return;
        }
        File fileM6007a = m6007a(this.f6783g);
        if (fileM6007a == null) {
            m6040d();
            tbsDownloadConfig.f6625a.put(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD, Boolean.TRUE);
            tbsDownloadConfig.commit();
            return;
        }
        File file = new File(fileM6007a, TbsDownloader.getOverSea(this.f6783g) ? "x5.oversea.tbs.org" : "x5.tbs.org");
        int iM6260a = C6843a.m6260a(this.f6783g, file);
        File file2 = new File(this.f6787k, "x5.tbs");
        String absolutePath = file2.exists() ? file2.getAbsolutePath() : null;
        int i11 = tbsDownloadConfig.mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0);
        Bundle bundle = new Bundle();
        bundle.putInt("operation", i10);
        bundle.putInt("old_core_ver", iM6260a);
        bundle.putInt("new_core_ver", i11);
        bundle.putString("old_apk_location", file.getAbsolutePath());
        bundle.putString("new_apk_location", absolutePath);
        bundle.putString("diff_file_location", absolutePath);
        C6785ak.m6068a().m6106b(this.f6783g, bundle);
    }

    /* renamed from: c */
    private boolean m6021c(boolean z10) {
        TbsLog.m6248i(TbsDownloader.LOGTAG, "[TbsApkDownloader.deleteFile] isApk=" + z10);
        File file = z10 ? new File(this.f6787k, "x5.tbs") : new File(this.f6787k, "x5.tbs.temp");
        if (file.exists()) {
            return file.delete();
        }
        return true;
    }

    /* renamed from: a */
    private String m6009a(Throwable th) {
        String stackTraceString = Log.getStackTraceString(th);
        return stackTraceString.length() > 1024 ? stackTraceString.substring(0, 1024) : stackTraceString;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        if (r10 != r8) goto L22;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m6022c(boolean r13, boolean r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C6778ad.m6022c(boolean, boolean):boolean");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(2:567|265)|(13:547|267|(1:269)|282|557|283|551|284|(2:285|(1:559)(3:297|298|(3:600|300|(3:309|(1:311)|312)(1:(1:308)(1:307)))(9:314|315|(2:317|(1:603)(4:344|543|345|(2:599|347)))(1:354)|353|355|565|356|(5:358|(3:360|553|361)(1:367)|(1:406)(4:371|(1:602)|403|405)|407|605)(2:408|604)|409)))|348|289|290|(7:535|389|(1:391)|392|257|597|596)(1:588))|(1:281)(1:279)|282|557|283|551|284|(3:285|(0)(0)|409)|348|289|290|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x03f1, code lost:
    
        if (r42 == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03f3, code lost:
    
        r0 = com.tencent.smtt.sdk.TbsDownloadConfig.getInstance(r41.f6783g).f6625a;
        r2 = java.lang.Long.valueOf(r29);
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0463, code lost:
    
        if (r42 == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0465, code lost:
    
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x055c, code lost:
    
        com.tencent.smtt.sdk.TbsDownloadConfig.getInstance(r41.f6783g).setDownloadInterruptCode(-315);
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0567, code lost:
    
        if (r42 != false) goto L485;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0600, code lost:
    
        m6011a(com.tencent.smtt.sdk.TbsListener.ErrorCode.DOWNLOAD_FILE_CONTENTLENGTH_NOT_MATCH, "tbsApkFileSize=" + r5 + "  but contentLength=" + r41.f6788l, true);
        com.tencent.smtt.sdk.TbsDownloadConfig.getInstance(r41.f6783g).setDownloadInterruptCode(-310);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x062d, code lost:
    
        m6011a(101, "WifiNetworkUnAvailable", true);
        com.tencent.smtt.sdk.TbsDownloadConfig.getInstance(r41.f6783g).setDownloadInterruptCode(-304);
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0640, code lost:
    
        if (r42 != false) goto L485;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x06b1, code lost:
    
        com.tencent.smtt.utils.TbsLog.m6249i(com.tencent.smtt.sdk.TbsDownloader.LOGTAG, "STEP 1/2 begin downloading...Canceled!", r5);
        com.tencent.smtt.sdk.TbsDownloadConfig.getInstance(r41.f6783g).setDownloadInterruptCode(-309);
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x06c1, code lost:
    
        r12 = r6;
        r37 = r18;
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0732, code lost:
    
        com.tencent.smtt.utils.TbsLog.m6249i(com.tencent.smtt.sdk.TbsDownloader.LOGTAG, r4, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0736, code lost:
    
        r6 = new java.lang.StringBuilder();
        r6.append("downloadFlow=");
        r6.append(r5);
        r6.append(" downloadMaxflow=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0748, code lost:
    
        r20 = r5;
        r3 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x074c, code lost:
    
        r6.append(r3);
        m6011a(com.tencent.smtt.sdk.TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW, r6.toString(), true);
        com.tencent.smtt.sdk.TbsDownloadConfig.getInstance(r41.f6783g).setDownloadInterruptCode(-307);
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0762, code lost:
    
        r29 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0766, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0771, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0772, code lost:
    
        r37 = r3;
        r29 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x077c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x077d, code lost:
    
        r20 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x077f, code lost:
    
        r3 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0782, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0783, code lost:
    
        r20 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0785, code lost:
    
        r3 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0788, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0789, code lost:
    
        r20 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x078c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x078d, code lost:
    
        r20 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x0873, code lost:
    
        m6039c();
        r0 = com.tencent.smtt.sdk.QbSdk.f6582k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0878, code lost:
    
        if (r0 == null) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x087c, code lost:
    
        r0.onDownloadFinish(com.tencent.smtt.sdk.TbsListener.ErrorCode.NETWORK_NOT_WIFI_ERROR);
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x087f, code lost:
    
        com.tencent.smtt.utils.TbsLog.m6249i(com.tencent.smtt.sdk.TbsDownloader.LOGTAG, "Download is paused due to NOT_WIFI error!", false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x088d, code lost:
    
        com.tencent.smtt.sdk.TbsDownloadConfig.getInstance(r41.f6783g).setDownloadInterruptCode(-304);
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x08c7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x08ca, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x08f6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x08f7, code lost:
    
        r12 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x08fc, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x08fd, code lost:
    
        r12 = r6;
        r37 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0902, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0903, code lost:
    
        r12 = r6;
        r3 = r2;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x090c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x090d, code lost:
    
        r12 = r6;
        r37 = r18;
        r3 = r2;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x092d, code lost:
    
        m6013a(r11);
        m6013a(r12);
        m6013a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0938, code lost:
    
        if (r41.f6795s != false) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x093a, code lost:
    
        com.tencent.smtt.sdk.TbsDownloadConfig.getInstance(r41.f6783g).setDownloadInterruptCode(-319);
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0945, code lost:
    
        if (r42 != false) goto L485;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x09b3, code lost:
    
        if (r42 == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x016d, code lost:
    
        r15 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0212, code lost:
    
        com.tencent.smtt.sdk.TbsDownloadConfig.getInstance(r41.f6783g).f6625a.put(com.tencent.smtt.sdk.TbsDownloadConfig.TbsConfigKey.KEY_TBSDOWNLOAD_FLOW, java.lang.Long.valueOf(r11));
        com.tencent.smtt.sdk.TbsDownloadConfig.getInstance(r41.f6783g).commit();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:297:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x089f A[PHI: r13 r29 r37
      0x089f: PHI (r13v13 int) = (r13v47 int), (r13v48 int), (r13v49 int) binds: [B:462:0x0a08, B:456:0x09e5, B:390:0x089d] A[DONT_GENERATE, DONT_INLINE]
      0x089f: PHI (r29v7 long) = (r29v5 long), (r29v5 long), (r29v15 long) binds: [B:462:0x0a08, B:456:0x09e5, B:390:0x089d] A[DONT_GENERATE, DONT_INLINE]
      0x089f: PHI (r37v10 long) = (r37v8 long), (r37v8 long), (r37v27 long) binds: [B:462:0x0a08, B:456:0x09e5, B:390:0x089d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0962 A[Catch: all -> 0x09b7, TryCatch #12 {all -> 0x09b7, blocks: (B:432:0x095b, B:434:0x0962, B:438:0x096a, B:440:0x0972, B:447:0x09bb, B:451:0x09cb, B:454:0x09d2, B:459:0x09ec), top: B:529:0x095b }] */
    /* JADX WARN: Removed duplicated region for block: B:458:0x09e9  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0a08  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0a24 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0a9a  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0af1  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0b07  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0b41  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0894 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:559:0x06b1 A[EDGE_INSN: B:559:0x06b1->B:287:0x06b1 BREAK  A[LOOP:1: B:285:0x06ad->B:409:0x08ec], EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:588:0x092d A[EDGE_INSN: B:588:0x092d->B:423:0x092d BREAK  A[LOOP:0: B:50:0x0167->B:596:0x0167], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0a7b A[EDGE_INSN: B:595:0x0a7b->B:482:0x0a7b BREAK  A[LOOP:0: B:50:0x0167->B:596:0x0167], SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m6038b(boolean r42, boolean r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2949
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C6778ad.m6038b(boolean, boolean):void");
    }

    /* renamed from: a */
    private String m6010a(URL url) {
        try {
            return InetAddress.getByName(url.getHost()).getHostAddress();
        } catch (Error | Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* renamed from: b */
    private boolean m6019b(int i10) {
        try {
            File file = new File(this.f6787k, "x5.tbs");
            File fileM6007a = m6007a(this.f6783g);
            if (fileM6007a == null) {
                return false;
            }
            File file2 = new File(fileM6007a, TbsDownloader.getOverSea(this.f6783g) ? "x5.oversea.tbs.org" : "x5.tbs.org");
            file.delete();
            C6854k.m6320b(file2, file);
            if (C6843a.m6262a(this.f6783g, file, 0L, i10)) {
                return true;
            }
            TbsLog.m6248i(TbsDownloader.LOGTAG, "[TbsApkDownloader.copyTbsApkFromBackupToInstall] verifyTbsApk error!!");
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            TbsLog.m6246e(TbsDownloader.LOGTAG, "[TbsApkDownloader.copyTbsApkFromBackupToInstall] Exception is " + e10.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    public void m6033a(int i10) {
        try {
            File file = new File(this.f6787k, "x5.tbs");
            int iM6260a = C6843a.m6260a(this.f6783g, file);
            if (-1 == iM6260a || (i10 > 0 && i10 == iM6260a)) {
                file.delete();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m6011a(int i10, String str, boolean z10) {
        if (z10 || this.f6792p > this.f6778B) {
            this.f6798v.setErrorCode(i10);
            this.f6798v.setFailDetail(str);
        }
    }

    /* renamed from: a */
    private void m6012a(long j10) throws InterruptedException {
        this.f6792p++;
        if (j10 <= 0) {
            try {
                j10 = m6030m();
            } catch (Exception unused) {
                return;
            }
        }
        Thread.sleep(j10);
    }

    /* renamed from: a */
    private void m6013a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m6014a(File file, Context context) {
        File file2;
        if (file == null || !file.exists()) {
            return;
        }
        try {
            File fileM6007a = m6007a(context);
            if (fileM6007a != null) {
                if (TbsDownloadConfig.getInstance(context).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V_TYPE, 0) == 1) {
                    file2 = new File(fileM6007a, "x5.tbs.decouple");
                } else {
                    file2 = new File(fileM6007a, TbsDownloader.getOverSea(context) ? "x5.oversea.tbs.org" : "x5.tbs.org");
                }
                file2.delete();
                C6854k.m6320b(file, file2);
                if (TbsDownloadConfig.getInstance(context).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V_TYPE, 0) == 1 || TbsDownloadConfig.getInstance(context).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DECOUPLECOREVERSION, 0) != C6843a.m6260a(context, file)) {
                    return;
                }
                File file3 = new File(fileM6007a, "x5.tbs.decouple");
                if (C6843a.m6260a(context, file) != C6843a.m6260a(context, file3)) {
                    file3.delete();
                    C6854k.m6320b(file, file3);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m6015a(String str) throws ProtocolException {
        URL url = new URL(str);
        HttpURLConnection httpURLConnection = this.f6796t;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Throwable th) {
                TbsLog.m6246e(TbsDownloader.LOGTAG, "[initHttpRequest] mHttpRequest.disconnect() Throwable:" + th.toString());
            }
        }
        HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
        this.f6796t = httpURLConnection2;
        httpURLConnection2.setRequestProperty(HttpHeaders.USER_AGENT, TbsDownloader.m5855a(this.f6783g));
        this.f6796t.setRequestProperty("Accept-Encoding", "identity");
        this.f6796t.setRequestMethod("GET");
        this.f6796t.setInstanceFollowRedirects(false);
        this.f6796t.setConnectTimeout(this.f6790n);
        this.f6796t.setReadTimeout(this.f6789m);
    }

    /* renamed from: a */
    public boolean m6034a() {
        TbsLog.m6248i("TbsApkDownloader", "verifyAndInstallDecoupleCoreFromBackup #1");
        try {
            File file = new File(C6854k.m6298a(this.f6783g, 4), "x5.tbs.decouple");
            if (file.exists()) {
                TbsLog.m6248i("TbsApkDownloader", "verifyAndInstallDecoupleCoreFromBackup #2");
            } else {
                File fileM5864b = TbsDownloader.m5864b(TbsDownloadConfig.getInstance(this.f6783g).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DECOUPLECOREVERSION, -1));
                if (fileM5864b != null && fileM5864b.exists()) {
                    C6854k.m6320b(fileM5864b, file);
                }
            }
            Context context = this.f6783g;
            if (C6843a.m6262a(context, file, 0L, TbsDownloadConfig.getInstance(context).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DECOUPLECOREVERSION, -1))) {
                TbsLog.m6248i("TbsApkDownloader", "verifyAndInstallDecoupleCoreFromBackup #3");
                return C6785ak.m6068a().m6111d(this.f6783g);
            }
            TbsLog.m6248i("TbsApkDownloader", "verifyAndInstallDecoupleCoreFromBackup no backup file !!!");
            File file2 = new File(C6854k.m6298a(this.f6783g, 4), "x5.tbs.decouple");
            if (!file2.exists()) {
                return false;
            }
            file2.delete();
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public boolean m6035a(boolean z10) {
        String[] strArr;
        int i10;
        if ((!z10 || m6031n() || (QbSdk.getDownloadWithoutWifi() && Apn.isNetworkAvailable(this.f6783g))) && (strArr = this.f6781b) != null && (i10 = this.f6782c) >= 0 && i10 < strArr.length) {
            this.f6782c = i10 + 1;
            this.f6786j = strArr[i10];
            this.f6792p = 0;
            this.f6793q = 0;
            this.f6788l = -1L;
            this.f6791o = false;
            this.f6794r = false;
            this.f6795s = false;
            this.f6801y = false;
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00eb  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m6036a(boolean r10, boolean r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C6778ad.m6036a(boolean, boolean):boolean");
    }
}
