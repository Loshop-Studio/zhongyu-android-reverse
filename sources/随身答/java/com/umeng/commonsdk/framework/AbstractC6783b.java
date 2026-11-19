package com.umeng.commonsdk.framework;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p186n2.AbstractC9087a;
import p210p2.AbstractC9318a;
import p270v2.AbstractC9758f;
import p290x2.AbstractC9866a;
import p290x2.C9870e;

/* renamed from: com.umeng.commonsdk.framework.b */
/* loaded from: classes4.dex */
public abstract class AbstractC6783b {

    /* renamed from: b */
    public static String f6853b = "envelope";

    /* renamed from: c */
    public static String f6854c = null;

    /* renamed from: e */
    public static String f6856e = "";

    /* renamed from: a */
    public static Object f6852a = new Object();

    /* renamed from: d */
    public static Object f6855d = new Object();

    /* renamed from: com.umeng.commonsdk.framework.b$a */
    public static class a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            long jLastModified = file.lastModified() - file2.lastModified();
            if (jLastModified > 0) {
                return 1;
            }
            return jLastModified == 0 ? 0 : -1;
        }
    }

    /* renamed from: com.umeng.commonsdk.framework.b$b */
    public static class b implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            long jLastModified = file.lastModified() - file2.lastModified();
            if (jLastModified > 0) {
                return 1;
            }
            return jLastModified == 0 ? 0 : -1;
        }
    }

    /* renamed from: a */
    public static boolean m6280a(Context context, String str) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            try {
                return ((Integer) Class.forName("android.content.Context").getMethod("checkSelfPermission", String.class).invoke(context, str)).intValue() == 0;
            } catch (Throwable th) {
                AbstractC9318a.m15200b(applicationContext, th);
            }
        }
        return false;
    }

    /* renamed from: b */
    public static int m6281b(Context context) {
        String[] list;
        if (context != null) {
            try {
                File file = new File(m6283d(context));
                synchronized (f6855d) {
                    try {
                        if (file.isDirectory() && (list = file.list()) != null) {
                            return list.length;
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                AbstractC9318a.m15200b(context, th);
            }
        }
        return 0;
    }

    /* renamed from: c */
    public static String m6282c(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (TextUtils.isEmpty(f6856e)) {
            try {
                int iMyPid = Process.myPid();
                String strM6288i = m6288i(iMyPid);
                if (TextUtils.isEmpty(strM6288i)) {
                    ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                    if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && runningAppProcesses.size() > 0) {
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                ActivityManager.RunningAppProcessInfo next = it.next();
                                if (next.pid == iMyPid) {
                                    f6856e = next.processName;
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    f6856e = strM6288i;
                }
                break;
            } catch (Throwable th) {
                AbstractC9318a.m15200b(context.getApplicationContext(), th);
            }
        }
        return f6856e;
    }

    /* renamed from: d */
    public static String m6283d(Context context) {
        File file;
        synchronized (f6855d) {
            try {
                if (f6854c == null) {
                    f6854c = context.getFilesDir().getAbsolutePath() + File.separator + "." + f6853b;
                }
                file = new File(f6854c);
            } finally {
                return f6854c;
            }
            if (file.exists() || file.mkdir()) {
            } else {
                AbstractC9758f.m16426a("--->>> Create Envelope Directory failed!!!");
            }
        }
        return f6854c;
    }

    /* renamed from: e */
    public static File m6284e(Context context) {
        if (context == null) {
            return null;
        }
        File file = new File(m6283d(context));
        synchronized (f6855d) {
            try {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                    Arrays.sort(fileArrListFiles, new b());
                    return fileArrListFiles[0];
                }
                return null;
            } finally {
            }
        }
    }

    /* renamed from: f */
    public static long m6285f(Context context) {
        long j9;
        synchronized (f6852a) {
            j9 = AbstractC9866a.m16841a(context).getLong("last_instant_build_time", 0L);
        }
        return j9;
    }

    /* renamed from: g */
    public static long m6286g(Context context) {
        long j9;
        synchronized (f6852a) {
            j9 = AbstractC9866a.m16841a(context).getLong("last_successful_build_time", 0L);
        }
        return j9;
    }

    /* renamed from: h */
    public static String m6287h(Context context) {
        String strM6288i;
        try {
            strM6288i = m6288i(Process.myPid());
        } catch (Throwable th) {
            AbstractC9318a.m15200b(context, th);
        }
        if (!TextUtils.isEmpty(strM6288i)) {
            String strReplace = strM6288i.replace(':', '_');
            AbstractC9758f.m16426a("--->>> getEnvelopeDir: use current process name as envelope directory.");
            return strReplace;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null) {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                AbstractC9758f.m16426a("--->>> getEnvelopeDir: can't get process name, use default envelope directory.");
                return f6853b;
            }
            if (runningAppProcesses.size() == 0) {
                return f6853b;
            }
            try {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == Process.myPid()) {
                        String strReplace2 = runningAppProcessInfo.processName.replace(':', '_');
                        AbstractC9758f.m16426a("--->>> getEnvelopeDir: use current process name as envelope directory.");
                        return strReplace2;
                    }
                }
            } catch (Throwable th2) {
                AbstractC9318a.m15200b(context, th2);
            }
        }
        return f6853b;
    }

    /* renamed from: i */
    public static String m6288i(int i9) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/" + i9 + "/cmdline"));
        } catch (Throwable unused) {
            bufferedReader = null;
        }
        try {
            String line = bufferedReader.readLine();
            if (!TextUtils.isEmpty(line)) {
                line = line.trim();
            }
            try {
                bufferedReader.close();
            } catch (Throwable unused2) {
            }
            return line;
        } catch (Throwable unused3) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (Throwable unused4) {
                }
            }
            return null;
        }
    }

    /* renamed from: j */
    public static String m6289j(Context context) {
        String strSubstring;
        strSubstring = "";
        try {
            String strM6282c = m6282c(context);
            int iIndexOf = strM6282c.indexOf(":");
            strSubstring = iIndexOf >= 0 ? strM6282c.substring(iIndexOf + 1) : "";
            if (iIndexOf >= 0) {
                return strSubstring;
            }
            String packageName = context.getPackageName();
            return strM6282c.length() > packageName.length() ? strM6282c.substring(packageName.length() + 1, strM6282c.length()) : strM6282c;
        } catch (Throwable th) {
            AbstractC9318a.m15200b(context.getApplicationContext(), th);
            return strSubstring;
        }
    }

    /* renamed from: k */
    public static boolean m6290k(Context context, UMLogDataProtocol.UMBusinessType uMBusinessType) {
        File[] fileArrListFiles;
        String str = uMBusinessType == UMLogDataProtocol.UMBusinessType.U_INTERNAL ? "i" : "a";
        if (uMBusinessType == UMLogDataProtocol.UMBusinessType.U_ZeroEnv) {
            str = "z";
        }
        String strM6283d = m6283d(context);
        if (strM6283d == null) {
            return false;
        }
        File file = new File(strM6283d);
        synchronized (f6855d) {
            try {
                fileArrListFiles = file.listFiles();
            } catch (Throwable th) {
                AbstractC9318a.m15200b(context, th);
            } finally {
            }
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                for (File file2 : fileArrListFiles) {
                    if (file2.getName().startsWith(str)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
    }

    /* renamed from: l */
    public static boolean m6291l(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        try {
            if (!m6280a(context, "android.permission.ACCESS_NETWORK_STATE") || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return false;
            }
            return activeNetworkInfo.isConnectedOrConnecting();
        } catch (Throwable th) {
            AbstractC9318a.m15200b(context.getApplicationContext(), th);
            return false;
        }
    }

    /* renamed from: m */
    public static boolean m6292m(File file) {
        Context contextM14580b = AbstractC9087a.m14580b();
        synchronized (f6855d) {
            try {
                if (file != null) {
                    try {
                        if (file.exists()) {
                            return file.delete();
                        }
                    } catch (Throwable th) {
                        AbstractC9318a.m15200b(contextM14580b, th);
                    }
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: n */
    public static void m6293n(Context context, int i9) {
        File[] fileArrListFiles;
        File file = new File(m6283d(context));
        synchronized (f6855d) {
            try {
                fileArrListFiles = file.listFiles();
            } catch (Throwable th) {
                AbstractC9318a.m15200b(context, th);
            } finally {
            }
            if (fileArrListFiles != null && fileArrListFiles.length > i9) {
                Arrays.sort(fileArrListFiles, new a());
                if (fileArrListFiles.length > i9) {
                    for (int i10 = 0; i10 < fileArrListFiles.length - i9; i10++) {
                        if (!fileArrListFiles[i10].delete()) {
                            AbstractC9758f.m16426a("--->>> remove [" + i10 + "] file fail.");
                        }
                    }
                }
            }
        }
    }

    /* renamed from: o */
    public static int m6294o(Context context, String str, byte[] bArr) {
        FileOutputStream fileOutputStream;
        if (bArr == null) {
            return 101;
        }
        File file = new File(m6283d(context) + File.separator + str);
        synchronized (f6855d) {
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    try {
                        fileOutputStream = new FileOutputStream(file);
                    } catch (IOException e10) {
                        e = e10;
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    fileOutputStream.write(bArr);
                    fileOutputStream.close();
                    boolean zM16855c = C9870e.m16853b(context).m16855c(str);
                    boolean zM16857e = C9870e.m16853b(context).m16857e(str);
                    if (zM16855c) {
                        m6298s(context);
                    }
                    if (zM16857e) {
                        m6297r(context);
                    }
                    return 0;
                } catch (IOException e11) {
                    e = e11;
                    fileOutputStream2 = fileOutputStream;
                    AbstractC9318a.m15200b(context, e);
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (Throwable th2) {
                            AbstractC9318a.m15200b(context, th2);
                        }
                    }
                    return 101;
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream2 = fileOutputStream;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (Throwable th4) {
                            AbstractC9318a.m15200b(context, th4);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    /* renamed from: p */
    public static void m6295p(Context context) {
        String strM6287h;
        if (context == null) {
            return;
        }
        try {
            strM6287h = m6287h(context);
        } catch (Throwable th) {
            AbstractC9318a.m15200b(context, th);
        }
        if (!TextUtils.isEmpty(strM6287h) && !strM6287h.equals(f6853b)) {
            File file = new File(context.getFilesDir().getAbsolutePath() + "/." + strM6287h);
            if (file.exists()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                    try {
                        if (file.isDirectory()) {
                            file.delete();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        AbstractC9318a.m15200b(context, th2);
                        return;
                    }
                }
                try {
                    String strM6283d = m6283d(context);
                    for (int i9 = 0; i9 < fileArrListFiles.length; i9++) {
                        fileArrListFiles[i9].renameTo(new File(strM6283d + File.separator + fileArrListFiles[i9].getName()));
                    }
                    if (file.isDirectory()) {
                        file.delete();
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    AbstractC9318a.m15200b(context, th3);
                    return;
                }
                AbstractC9318a.m15200b(context, th);
            }
        }
    }

    /* renamed from: q */
    public static byte[] m6296q(String str) {
        Throwable th;
        IOException iOException;
        FileChannel channel;
        byte[] bArr;
        Context contextM14580b = AbstractC9087a.m14580b();
        synchronized (f6855d) {
            FileChannel fileChannel = null;
            try {
                try {
                    channel = new RandomAccessFile(str, "r").getChannel();
                } catch (IOException e10) {
                    iOException = e10;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size()).load();
                bArr = new byte[(int) channel.size()];
                if (mappedByteBufferLoad.remaining() > 0) {
                    mappedByteBufferLoad.get(bArr, 0, mappedByteBufferLoad.remaining());
                }
                try {
                    channel.close();
                } catch (Throwable th3) {
                    AbstractC9318a.m15200b(contextM14580b, th3);
                }
            } catch (IOException e11) {
                iOException = e11;
                fileChannel = channel;
                AbstractC9318a.m15200b(contextM14580b, iOException);
                throw iOException;
            } catch (Throwable th4) {
                th = th4;
                fileChannel = channel;
                try {
                    fileChannel.close();
                    throw th;
                } catch (Throwable th5) {
                    AbstractC9318a.m15200b(contextM14580b, th5);
                    throw th;
                }
            }
        }
        return bArr;
    }

    /* renamed from: r */
    public static void m6297r(Context context) {
        synchronized (f6852a) {
            SharedPreferences sharedPreferencesM16841a = AbstractC9866a.m16841a(context);
            sharedPreferencesM16841a.edit().putLong("last_instant_build_time", System.currentTimeMillis()).commit();
        }
    }

    /* renamed from: s */
    public static void m6298s(Context context) {
        synchronized (f6852a) {
            SharedPreferences sharedPreferencesM16841a = AbstractC9866a.m16841a(context);
            sharedPreferencesM16841a.edit().putLong("last_successful_build_time", System.currentTimeMillis()).commit();
        }
    }
}
