package com.huawei.hms.utils;

import android.content.Context;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.log.HMSLog;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public abstract class FileUtil {
    public static final String LOCAL_REPORT_FILE = "hms/HwMobileServiceReport.txt";
    public static final String LOCAL_REPORT_FILE_CONFIG = "hms/config.txt";
    public static final long LOCAL_REPORT_FILE_MAX_SIZE = 10240;

    /* renamed from: a */
    public static boolean f11823a = false;

    /* renamed from: b */
    public static ScheduledExecutorService f11824b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: com.huawei.hms.utils.FileUtil$a */
    public class RunnableC7356a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ File f11825c;

        /* renamed from: d */
        public final /* synthetic */ long f11826d;

        /* renamed from: e */
        public final /* synthetic */ String f11827e;

        public RunnableC7356a(File file, long j10, String str) {
            this.f11825c = file;
            this.f11826d = j10;
            this.f11827e = str;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            RandomAccessFile randomAccessFile;
            Throwable th;
            File file = this.f11825c;
            if (file == null) {
                HMSLog.m8725e("FileUtil", "In writeFile Failed to get local file.");
                return;
            }
            File parentFile = file.getParentFile();
            if (parentFile == null || !(parentFile.mkdirs() || parentFile.isDirectory())) {
                HMSLog.m8725e("FileUtil", "In writeFile, Failed to create directory.");
                return;
            }
            RandomAccessFile randomAccessFile2 = null;
            try {
                try {
                    long length = this.f11825c.length();
                    if (length > this.f11826d) {
                        String canonicalPath = this.f11825c.getCanonicalPath();
                        if (!this.f11825c.delete()) {
                            HMSLog.m8725e("FileUtil", "last file delete failed.");
                        }
                        randomAccessFile2 = new RandomAccessFile(new File(canonicalPath), "rw");
                    } else {
                        randomAccessFile = new RandomAccessFile(this.f11825c, "rw");
                        try {
                            randomAccessFile.seek(length);
                            randomAccessFile2 = randomAccessFile;
                        } catch (IOException e10) {
                            e = e10;
                            randomAccessFile2 = randomAccessFile;
                            HMSLog.m8726e("FileUtil", "writeFile exception:", e);
                            IOUtils.closeQuietly(randomAccessFile2);
                        } catch (Throwable th2) {
                            th = th2;
                            IOUtils.closeQuietly(randomAccessFile);
                            throw th;
                        }
                    }
                    randomAccessFile2.writeBytes(this.f11827e + System.getProperty("line.separator"));
                } catch (Throwable th3) {
                    randomAccessFile = null;
                    th = th3;
                }
            } catch (IOException e11) {
                e = e11;
            }
            IOUtils.closeQuietly(randomAccessFile2);
        }
    }

    public static boolean verifyHash(String str, File file) throws Throwable {
        byte[] bArrDigest = SHA256.digest(file);
        return bArrDigest != null && HEX.encodeHexString(bArrDigest, true).equalsIgnoreCase(str);
    }

    public static void writeFile(File file, String str, long j10) {
        f11824b.execute(new RunnableC7356a(file, j10, str));
    }

    public static void writeFileReport(Context context, File file, File file2, String str, long j10, int i10) {
        if (file != null && file.isFile() && file.exists()) {
            if (!f11823a) {
                if (file2 != null && file2.exists() && !file2.delete()) {
                    HMSLog.m8725e("FileUtil", "file delete failed.");
                }
                f11823a = true;
            }
            writeFile(file2, str + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + j10 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i10, LOCAL_REPORT_FILE_MAX_SIZE);
        }
    }
}
