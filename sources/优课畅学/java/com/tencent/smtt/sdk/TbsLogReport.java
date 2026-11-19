package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import com.tencent.smtt.utils.C6845b;
import com.tencent.smtt.utils.C6857n;
import com.tencent.smtt.utils.C6866w;
import com.tencent.smtt.utils.C6867x;
import com.tencent.smtt.utils.TbsLog;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONArray;

/* loaded from: classes4.dex */
class TbsLogReport {

    /* renamed from: a */
    private static TbsLogReport f6643a;

    /* renamed from: b */
    private Handler f6644b;

    /* renamed from: c */
    private Context f6645c;

    /* renamed from: d */
    private boolean f6646d = false;

    public enum EventType {
        TYPE_DOWNLOAD(0),
        TYPE_INSTALL(1),
        TYPE_LOAD(2),
        TYPE_DOWNLOAD_DECOUPLE(3),
        TYPE_INSTALL_DECOUPLE(4),
        TYPE_COOKIE_DB_SWITCH(5);


        /* renamed from: a */
        int f6648a;

        EventType(int i10) {
            this.f6648a = i10;
        }
    }

    public static class TbsLogInfo implements Cloneable {

        /* renamed from: a */
        int f6649a;

        /* renamed from: b */
        private long f6650b;

        /* renamed from: c */
        private String f6651c;

        /* renamed from: d */
        private String f6652d;

        /* renamed from: e */
        private int f6653e;

        /* renamed from: f */
        private int f6654f;

        /* renamed from: g */
        private int f6655g;

        /* renamed from: h */
        private int f6656h;

        /* renamed from: i */
        private String f6657i;

        /* renamed from: j */
        private int f6658j;

        /* renamed from: k */
        private int f6659k;

        /* renamed from: l */
        private long f6660l;

        /* renamed from: m */
        private long f6661m;

        /* renamed from: n */
        private int f6662n;

        /* renamed from: o */
        private String f6663o;

        /* renamed from: p */
        private String f6664p;

        /* renamed from: q */
        private long f6665q;

        private TbsLogInfo() {
            resetArgs();
        }

        public Object clone() {
            try {
                return super.clone();
            } catch (CloneNotSupportedException unused) {
                return this;
            }
        }

        public int getDownFinalFlag() {
            return this.f6659k;
        }

        public void resetArgs() {
            this.f6650b = 0L;
            this.f6651c = null;
            this.f6652d = null;
            this.f6653e = 0;
            this.f6654f = 0;
            this.f6655g = 0;
            this.f6656h = 2;
            this.f6657i = "unknown";
            this.f6658j = 0;
            this.f6659k = 2;
            this.f6660l = 0L;
            this.f6661m = 0L;
            this.f6662n = 1;
            this.f6649a = 0;
            this.f6663o = null;
            this.f6664p = null;
            this.f6665q = 0L;
        }

        public void setApn(String str) {
            this.f6657i = str;
        }

        public void setCheckErrorDetail(String str) {
            setErrorCode(108);
            this.f6663o = str;
        }

        public void setDownConsumeTime(long j10) {
            this.f6661m += j10;
        }

        public void setDownFinalFlag(int i10) {
            this.f6659k = i10;
        }

        public void setDownloadCancel(int i10) {
            this.f6655g = i10;
        }

        public void setDownloadSize(long j10) {
            this.f6665q += j10;
        }

        public void setDownloadUrl(String str) {
            if (this.f6651c == null) {
                this.f6651c = str;
                return;
            }
            this.f6651c += ";" + str;
        }

        public void setErrorCode(int i10) {
            if (i10 != 100 && i10 != 110 && i10 != 120 && i10 != 111 && i10 < 400) {
                TbsLog.m6249i(TbsDownloader.LOGTAG, "error occured, errorCode:" + i10, true);
            }
            if (i10 == 111) {
                TbsLog.m6249i(TbsDownloader.LOGTAG, "you are not in wifi, downloading stoped", true);
            }
            this.f6649a = i10;
        }

        public void setEventTime(long j10) {
            this.f6650b = j10;
        }

        public void setFailDetail(String str) {
            if (str == null) {
                return;
            }
            if (str.length() > 1024) {
                str = str.substring(0, 1024);
            }
            this.f6664p = str;
        }

        public void setHttpCode(int i10) {
            this.f6653e = i10;
        }

        public void setNetworkChange(int i10) {
            this.f6662n = i10;
        }

        public void setNetworkType(int i10) {
            this.f6658j = i10;
        }

        public void setPatchUpdateFlag(int i10) {
            this.f6654f = i10;
        }

        public void setPkgSize(long j10) {
            this.f6660l = j10;
        }

        public void setResolveIp(String str) {
            this.f6652d = str;
        }

        public void setUnpkgFlag(int i10) {
            this.f6656h = i10;
        }

        public /* synthetic */ TbsLogInfo(HandlerC6796av handlerC6796av) {
            this();
        }

        public void setFailDetail(Throwable th) {
            if (th == null) {
                this.f6664p = "";
                return;
            }
            String stackTraceString = Log.getStackTraceString(th);
            if (stackTraceString.length() > 1024) {
                stackTraceString = stackTraceString.substring(0, 1024);
            }
            this.f6664p = stackTraceString;
        }
    }

    /* renamed from: com.tencent.smtt.sdk.TbsLogReport$a */
    public static class C6766a {

        /* renamed from: a */
        private final String f6666a;

        /* renamed from: b */
        private final String f6667b;

        public C6766a(String str, String str2) {
            this.f6666a = str;
            this.f6667b = str2;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:126|4|5|(3:99|6|(2:121|7))|(9:124|8|115|9|(2:10|(1:12)(1:128))|17|97|18|26)|111|49|100|50) */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0094, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0095, code lost:
        
            r0.printStackTrace();
         */
        /* JADX WARN: Removed duplicated region for block: B:117:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0083 A[Catch: all -> 0x0051, Exception -> 0x0054, IOException -> 0x005f, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x0054, blocks: (B:6:0x0014, B:18:0x004d, B:26:0x005b, B:49:0x0086, B:29:0x0060, B:25:0x0058, B:59:0x00a3, B:64:0x00ad, B:68:0x00b5, B:67:0x00b2, B:62:0x00a8, B:43:0x0079, B:48:0x0083, B:46:0x007e), top: B:99:0x0014 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0060 -> B:111:0x0086). Please report as a decompilation issue!!! */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void m5920a() throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 239
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsLogReport.C6766a.m5920a():void");
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0032 -> B:31:0x0041). Please report as a decompilation issue!!! */
        /* renamed from: a */
        private static void m5919a(File file) throws Throwable {
            RandomAccessFile randomAccessFile;
            RandomAccessFile randomAccessFile2 = null;
            try {
                try {
                    try {
                        randomAccessFile = new RandomAccessFile(file, "rw");
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (IOException e11) {
                e11.printStackTrace();
            }
            try {
                int i10 = Integer.parseInt("00001000", 2);
                randomAccessFile.seek(7L);
                int i11 = randomAccessFile.read();
                if ((i11 & i10) > 0) {
                    randomAccessFile.seek(7L);
                    randomAccessFile.write((~i10) & 255 & i11);
                }
                randomAccessFile.close();
            } catch (Exception e12) {
                e = e12;
                randomAccessFile2 = randomAccessFile;
                e.printStackTrace();
                if (randomAccessFile2 != null) {
                    randomAccessFile2.close();
                }
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile2 = randomAccessFile;
                if (randomAccessFile2 != null) {
                    try {
                        randomAccessFile2.close();
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                }
                throw th;
            }
        }
    }

    private TbsLogReport(Context context) {
        this.f6644b = null;
        this.f6645c = context.getApplicationContext();
        HandlerThread handlerThread = new HandlerThread("TbsLogReportThread");
        handlerThread.start();
        this.f6644b = new HandlerC6796av(this, handlerThread.getLooper());
    }

    /* renamed from: b */
    private String m5885b(long j10) {
        return j10 + "|";
    }

    /* renamed from: f */
    private JSONArray m5887f() {
        String string = m5890i().getString("tbs_download_upload", null);
        if (string == null) {
            return new JSONArray();
        }
        try {
            JSONArray jSONArray = new JSONArray(string);
            if (jSONArray.length() > 5) {
                JSONArray jSONArray2 = new JSONArray();
                int length = jSONArray.length() - 1;
                if (length > jSONArray.length() - 5) {
                    jSONArray2.put(jSONArray.get(length));
                    return jSONArray2;
                }
            }
            return jSONArray;
        } catch (Exception unused) {
            return new JSONArray();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m5888g() {
        TbsLog.m6248i(TbsDownloader.LOGTAG, "[TbsApkDownloadStat.reportDownloadStat]");
        JSONArray jSONArrayM5887f = m5887f();
        if (jSONArrayM5887f == null || jSONArrayM5887f.length() == 0) {
            TbsLog.m6248i(TbsDownloader.LOGTAG, "[TbsApkDownloadStat.reportDownloadStat] no data");
            return;
        }
        TbsLog.m6248i(TbsDownloader.LOGTAG, "[TbsApkDownloadStat.reportDownloadStat] jsonArray:" + jSONArrayM5887f);
        try {
            TbsLog.m6248i(TbsDownloader.LOGTAG, "[TbsApkDownloadStat.reportDownloadStat] response:" + C6857n.m6332a(C6867x.m6388a(this.f6645c).m6392c(), jSONArrayM5887f.toString().getBytes("utf-8"), new C6798ax(this), true) + " testcase: -1");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m5889h() {
        SharedPreferences.Editor editorEdit = m5890i().edit();
        editorEdit.remove("tbs_download_upload");
        editorEdit.commit();
    }

    /* renamed from: i */
    private SharedPreferences m5890i() {
        return this.f6645c.getSharedPreferences("tbs_download_stat", 4);
    }

    /* renamed from: a */
    public TbsLogInfo m5891a() {
        return new TbsLogInfo(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e5 A[PHI: r0 r5
      0x00e5: PHI (r0v12 java.io.File) = (r0v9 java.io.File), (r0v13 java.io.File), (r0v13 java.io.File) binds: [B:44:0x010b, B:57:0x00e5, B:24:0x00e2] A[DONT_GENERATE, DONT_INLINE]
      0x00e5: PHI (r5v11 byte[]) = (r5v16 byte[]), (r5v13 byte[]), (r5v13 byte[]) binds: [B:44:0x010b, B:57:0x00e5, B:24:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0108 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0103 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m5900c() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsLogReport.m5900c():void");
    }

    /* renamed from: d */
    public void m5901d() {
        try {
            SharedPreferences.Editor editorEdit = m5890i().edit();
            editorEdit.clear();
            editorEdit.commit();
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public boolean m5902e() {
        return this.f6646d;
    }

    /* renamed from: a */
    public static TbsLogReport m5877a(Context context) {
        if (f6643a == null) {
            synchronized (TbsLogReport.class) {
                try {
                    if (f6643a == null) {
                        f6643a = new TbsLogReport(context);
                    }
                } finally {
                }
            }
        }
        return f6643a;
    }

    /* renamed from: b */
    public void m5897b() {
        this.f6644b.sendEmptyMessage(601);
    }

    /* renamed from: a */
    private String m5878a(int i10) {
        return i10 + "|";
    }

    /* renamed from: b */
    public void m5898b(int i10, String str) {
        TbsLogInfo tbsLogInfoM5891a = m5891a();
        tbsLogInfoM5891a.setErrorCode(i10);
        tbsLogInfoM5891a.setEventTime(System.currentTimeMillis());
        tbsLogInfoM5891a.setFailDetail(str);
        m5895a(EventType.TYPE_LOAD, tbsLogInfoM5891a);
    }

    /* renamed from: a */
    private String m5879a(long j10) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(j10));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public void m5899b(int i10, Throwable th) {
        String strSubstring;
        if (th != null) {
            strSubstring = "msg: " + th.getMessage() + "; err: " + th + "; cause: " + Log.getStackTraceString(th.getCause());
            if (strSubstring.length() > 1024) {
                strSubstring = strSubstring.substring(0, 1024);
            }
        } else {
            strSubstring = "NULL";
        }
        m5898b(i10, strSubstring);
    }

    /* renamed from: a */
    private String m5880a(String str) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append("|");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5881a(int i10, TbsLogInfo tbsLogInfo) {
        StringBuilder sb = new StringBuilder();
        sb.append(m5878a(i10));
        sb.append(m5880a(C6845b.m6276c(this.f6645c)));
        sb.append(m5880a(C6866w.m6379a(this.f6645c)));
        sb.append(m5878a(C6785ak.m6068a().m6117j(this.f6645c)));
        String str = Build.MODEL;
        try {
            str = new String(str.getBytes("UTF-8"), "ISO8859-1");
        } catch (Exception unused) {
        }
        sb.append(m5880a(str));
        String packageName = this.f6645c.getPackageName();
        sb.append(m5880a(packageName));
        sb.append(TbsConfig.APP_WX.equals(packageName) ? m5880a(C6845b.m6270a(this.f6645c, "com.tencent.mm.BuildInfo.CLIENT_VERSION")) : m5878a(C6845b.m6275b(this.f6645c)));
        sb.append(m5880a(m5879a(tbsLogInfo.f6650b)));
        sb.append(m5880a(tbsLogInfo.f6651c));
        sb.append(m5880a(tbsLogInfo.f6652d));
        sb.append(m5878a(tbsLogInfo.f6653e));
        sb.append(m5878a(tbsLogInfo.f6654f));
        sb.append(m5878a(tbsLogInfo.f6655g));
        sb.append(m5878a(tbsLogInfo.f6656h));
        sb.append(m5880a(tbsLogInfo.f6657i));
        sb.append(m5878a(tbsLogInfo.f6658j));
        sb.append(m5878a(tbsLogInfo.f6659k));
        sb.append(m5885b(tbsLogInfo.f6665q));
        sb.append(m5885b(tbsLogInfo.f6660l));
        sb.append(m5885b(tbsLogInfo.f6661m));
        sb.append(m5878a(tbsLogInfo.f6662n));
        sb.append(m5878a(tbsLogInfo.f6649a));
        sb.append(m5880a(tbsLogInfo.f6663o));
        sb.append(m5880a(tbsLogInfo.f6664p));
        sb.append(m5878a(TbsDownloadConfig.getInstance(this.f6645c).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0)));
        sb.append(m5880a(C6845b.m6279f(this.f6645c)));
        sb.append(m5880a("3.5.0.1063_43500"));
        sb.append(true);
        SharedPreferences sharedPreferencesM5890i = m5890i();
        JSONArray jSONArrayM5887f = m5887f();
        JSONArray jSONArray = new JSONArray();
        if (jSONArray.length() >= 5) {
            for (int i11 = 4; i11 >= 1; i11--) {
                try {
                    jSONArray.put(jSONArrayM5887f.get(jSONArray.length() - i11));
                } catch (Exception unused2) {
                    TbsLog.m6246e("upload", "JSONArray transform error!");
                }
            }
            jSONArrayM5887f = jSONArray;
        }
        jSONArrayM5887f.put(sb.toString());
        SharedPreferences.Editor editorEdit = sharedPreferencesM5890i.edit();
        editorEdit.putString("tbs_download_upload", jSONArrayM5887f.toString());
        editorEdit.commit();
        if (this.f6646d || i10 != EventType.TYPE_LOAD.f6648a) {
            m5888g();
        }
    }

    /* renamed from: a */
    private void m5882a(int i10, TbsLogInfo tbsLogInfo, EventType eventType) {
        tbsLogInfo.setErrorCode(i10);
        tbsLogInfo.setEventTime(System.currentTimeMillis());
        QbSdk.f6582k.onInstallFinish(i10);
        m5895a(eventType, tbsLogInfo);
    }

    /* renamed from: a */
    public void m5892a(int i10, String str) {
        m5893a(i10, str, EventType.TYPE_INSTALL);
    }

    /* renamed from: a */
    public void m5893a(int i10, String str, EventType eventType) {
        if (i10 != 200 && i10 != 220 && i10 != 221) {
            TbsLog.m6249i(TbsDownloader.LOGTAG, "error occured in installation, errorCode:" + i10, true);
        }
        TbsLogInfo tbsLogInfoM5891a = m5891a();
        tbsLogInfoM5891a.setFailDetail(str);
        m5882a(i10, tbsLogInfoM5891a, eventType);
    }

    /* renamed from: a */
    public void m5894a(int i10, Throwable th) {
        TbsLogInfo tbsLogInfoM5891a = m5891a();
        tbsLogInfoM5891a.setFailDetail(th);
        m5882a(i10, tbsLogInfoM5891a, EventType.TYPE_INSTALL);
    }

    /* renamed from: a */
    public void m5895a(EventType eventType, TbsLogInfo tbsLogInfo) {
        try {
            TbsLogInfo tbsLogInfo2 = (TbsLogInfo) tbsLogInfo.clone();
            Message messageObtainMessage = this.f6644b.obtainMessage();
            messageObtainMessage.what = 600;
            messageObtainMessage.arg1 = eventType.f6648a;
            messageObtainMessage.obj = tbsLogInfo2;
            this.f6644b.sendMessage(messageObtainMessage);
        } catch (Throwable th) {
            TbsLog.m6252w("upload", "[TbsLogReport.eventReport] error, message=" + th.getMessage());
        }
    }

    /* renamed from: a */
    public void m5896a(boolean z10) {
        this.f6646d = z10;
    }
}
