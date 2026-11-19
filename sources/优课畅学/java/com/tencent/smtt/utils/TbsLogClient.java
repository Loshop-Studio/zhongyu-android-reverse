package com.tencent.smtt.utils;

import android.content.Context;
import android.os.Environment;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import android.widget.TextView;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes4.dex */
public class TbsLogClient {

    /* renamed from: a */
    static TbsLogClient f6946a = null;

    /* renamed from: c */
    static File f6947c = null;

    /* renamed from: d */
    static String f6948d = null;

    /* renamed from: e */
    static byte[] f6949e = null;

    /* renamed from: i */
    private static boolean f6950i = true;

    /* renamed from: b */
    TextView f6951b;

    /* renamed from: f */
    private SimpleDateFormat f6952f;

    /* renamed from: g */
    private Context f6953g;

    /* renamed from: h */
    private StringBuffer f6954h = new StringBuffer();

    /* renamed from: com.tencent.smtt.utils.TbsLogClient$a */
    public class RunnableC6842a implements Runnable {

        /* renamed from: a */
        String f6955a;

        public RunnableC6842a(String str) {
            this.f6955a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView = TbsLogClient.this.f6951b;
            if (textView != null) {
                textView.append(this.f6955a + SignParameters.NEW_LINE);
            }
        }
    }

    public TbsLogClient(Context context) {
        this.f6952f = null;
        this.f6953g = null;
        try {
            this.f6953g = context.getApplicationContext();
            this.f6952f = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss.SSS", Locale.US);
        } catch (Exception unused) {
            this.f6952f = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss.SSS");
        }
    }

    /* renamed from: a */
    private void m6254a() {
        String strM6298a;
        try {
            if (f6947c == null) {
                if (!Environment.getExternalStorageState().equals("mounted") || (strM6298a = C6854k.m6298a(this.f6953g, 6)) == null) {
                    f6947c = null;
                    return;
                }
                f6947c = new File(strM6298a, "tbslog.txt");
                f6948d = LogFileUtils.createKey();
                f6949e = LogFileUtils.createHeaderText(f6947c.getName(), f6948d);
            }
        } catch (NullPointerException e10) {
            e = e10;
            e.printStackTrace();
        } catch (SecurityException e11) {
            e = e11;
            e.printStackTrace();
        }
    }

    public static void setWriteLogJIT(boolean z10) {
        f6950i = z10;
    }

    /* renamed from: d */
    public void m6255d(String str, String str2) {
    }

    /* renamed from: e */
    public void m6256e(String str, String str2) {
        Log.e(str, str2);
    }

    /* renamed from: i */
    public void m6257i(String str, String str2) {
    }

    public void setLogView(TextView textView) {
        this.f6951b = textView;
    }

    public void showLog(String str) {
        TextView textView = this.f6951b;
        if (textView != null) {
            textView.post(new RunnableC6842a(str));
        }
    }

    /* renamed from: v */
    public void m6258v(String str, String str2) {
    }

    /* renamed from: w */
    public void m6259w(String str, String str2) {
    }

    public void writeLog(String str) {
        try {
            String str2 = this.f6952f.format(Long.valueOf(System.currentTimeMillis()));
            StringBuffer stringBuffer = this.f6954h;
            stringBuffer.append(str2);
            stringBuffer.append(" pid=");
            stringBuffer.append(Process.myPid());
            stringBuffer.append(" tid=");
            stringBuffer.append(Process.myTid());
            stringBuffer.append(str);
            stringBuffer.append(SignParameters.NEW_LINE);
            if (Thread.currentThread() == Looper.getMainLooper().getThread() && !f6950i) {
                return;
            }
            writeLogToDisk();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void writeLogToDisk() {
        m6254a();
        File file = f6947c;
        if (file != null) {
            LogFileUtils.writeDataToStorage(file, f6948d, f6949e, this.f6954h.toString(), true);
            StringBuffer stringBuffer = this.f6954h;
            stringBuffer.delete(0, stringBuffer.length());
        }
    }
}
