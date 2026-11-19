package com.alibaba.sdk.android.tbrest.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes3.dex */
public class AppUtils {

    public interface ReaderListener {
        boolean onReadLine(String str);
    }

    public static void closeQuietly(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e10) {
                LogUtil.m3871e("close.", e10);
            }
        }
    }

    public static String dumpMeminfo(Context context) {
        Integer numValueOf;
        String str;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(AgooConstants.OPEN_ACTIIVTY_NAME);
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                numValueOf = Integer.valueOf((int) (memoryInfo.threshold >> 10));
            } else {
                numValueOf = null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("JavaTotal:");
            sb2.append(Runtime.getRuntime().totalMemory());
            sb2.append(" JavaFree:");
            sb2.append(Runtime.getRuntime().freeMemory());
            sb2.append(" NativeHeap:");
            sb2.append(Debug.getNativeHeapSize());
            sb2.append(" NativeAllocated:");
            sb2.append(Debug.getNativeHeapAllocatedSize());
            sb2.append(" NativeFree:");
            sb2.append(Debug.getNativeHeapFreeSize());
            sb2.append(" threshold:");
            if (numValueOf != null) {
                str = numValueOf + " KB";
            } else {
                str = "not valid";
            }
            sb2.append(str);
            return sb2.toString();
        } catch (Exception e10) {
            LogUtil.m3871e("dumpMeminfo", e10);
            return "";
        }
    }

    public static String dumpStorage(Context context) {
        boolean zEquals;
        StringBuilder sb2 = new StringBuilder();
        try {
            zEquals = "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception e10) {
            LogUtil.m3873w("hasSDCard", e10);
            zEquals = false;
        }
        try {
        } catch (Exception e11) {
            LogUtil.m3873w("installSDCard", e11);
        }
        boolean z10 = (context.getApplicationInfo().flags & 262144) != 0;
        sb2.append("hasSDCard: " + zEquals + SignParameters.NEW_LINE);
        sb2.append("installSDCard: " + z10 + SignParameters.NEW_LINE);
        try {
            File rootDirectory = Environment.getRootDirectory();
            if (rootDirectory != null) {
                long[] sizes = getSizes(rootDirectory.getAbsolutePath());
                sb2.append("RootDirectory: " + rootDirectory.getAbsolutePath() + " ");
                sb2.append(String.format("TotalSize: %s FreeSize: %s AvailableSize: %s \n", Long.valueOf(sizes[0]), Long.valueOf(sizes[1]), Long.valueOf(sizes[2])));
            }
            File dataDirectory = Environment.getDataDirectory();
            if (dataDirectory != null) {
                long[] sizes2 = getSizes(dataDirectory.getAbsolutePath());
                sb2.append("DataDirectory: " + dataDirectory.getAbsolutePath() + " ");
                sb2.append(String.format("TotalSize: %s FreeSize: %s AvailableSize: %s \n", Long.valueOf(sizes2[0]), Long.valueOf(sizes2[1]), Long.valueOf(sizes2[2])));
            }
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (dataDirectory != null) {
                sb2.append("ExternalStorageDirectory: " + externalStorageDirectory.getAbsolutePath() + " ");
                long[] sizes3 = getSizes(externalStorageDirectory.getAbsolutePath());
                sb2.append(String.format("TotalSize: %s FreeSize: %s AvailableSize: %s \n", Long.valueOf(sizes3[0]), Long.valueOf(sizes3[1]), Long.valueOf(sizes3[2])));
            }
            File downloadCacheDirectory = Environment.getDownloadCacheDirectory();
            if (downloadCacheDirectory != null) {
                sb2.append("DownloadCacheDirectory: " + downloadCacheDirectory.getAbsolutePath() + " ");
                long[] sizes4 = getSizes(downloadCacheDirectory.getAbsolutePath());
                sb2.append(String.format("TotalSize: %s FreeSize: %s AvailableSize: %s \n", Long.valueOf(sizes4[0]), Long.valueOf(sizes4[1]), Long.valueOf(sizes4[2])));
            }
        } catch (Exception e12) {
            LogUtil.m3871e("getSizes", e12);
        }
        return sb2.toString();
    }

    public static String dumpThread(Thread thread) {
        StringBuilder sb2 = new StringBuilder();
        try {
            sb2.append(String.format("Thread Name: '%s'\n", thread.getName()));
            sb2.append(String.format("\"%s\" prio=%d tid=%d %s\n", thread.getName(), Integer.valueOf(thread.getPriority()), Long.valueOf(thread.getId()), thread.getState()));
            for (StackTraceElement stackTraceElement : thread.getStackTrace()) {
                sb2.append(String.format("\tat %s\n", stackTraceElement.toString()));
            }
        } catch (Exception e10) {
            LogUtil.m3871e("dumpThread", e10);
        }
        return sb2.toString();
    }

    public static String getGMT8Time(long j10) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));
            return simpleDateFormat.format(new Date(j10));
        } catch (Exception e10) {
            LogUtil.m3871e("getGMT8Time", e10);
            return "";
        }
    }

    public static String getMeminfo() {
        return readFully(new File("/proc/meminfo")).trim();
    }

    public static String getMyProcessNameByAppProcessInfo(Context context) {
        if (context == null) {
            return null;
        }
        int iMyPid = Process.myPid();
        try {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService(AgooConstants.OPEN_ACTIIVTY_NAME)).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getMyProcessNameByCmdline() {
        try {
            return readLine("/proc/self/cmdline").trim();
        } catch (Exception e10) {
            LogUtil.m3871e("get my process name by cmd line failure .", e10);
            return null;
        }
    }

    public static String getMyStatus() {
        return readFully(new File("/proc/self/status")).trim();
    }

    private static long[] getSizes(String str) {
        long[] jArr = {-1, -1, -1};
        try {
            StatFs statFs = new StatFs(str);
            long blockSizeLong = statFs.getBlockSizeLong();
            long blockCountLong = statFs.getBlockCountLong();
            long freeBlocksLong = statFs.getFreeBlocksLong();
            long availableBlocksLong = statFs.getAvailableBlocksLong();
            jArr[0] = blockCountLong * blockSizeLong;
            jArr[1] = freeBlocksLong * blockSizeLong;
            jArr[2] = blockSizeLong * availableBlocksLong;
            return jArr;
        } catch (Exception e10) {
            LogUtil.m3871e("getSizes", e10);
            return jArr;
        }
    }

    public static Boolean isBackgroundRunning(Context context) {
        try {
            return Integer.parseInt(readLine("/proc/self/oom_adj").trim()) == 0 ? Boolean.FALSE : Boolean.TRUE;
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static String readFully(File file) throws Throwable {
        FileInputStream fileInputStream;
        Exception e10;
        InputStreamReader inputStreamReader;
        StringBuilder sb2 = new StringBuilder();
        ?? r12 = 0;
        r12 = 0;
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Throwable th) {
                th = th;
                r12 = file;
            }
            try {
                inputStreamReader = new InputStreamReader(fileInputStream);
                try {
                    char[] cArr = new char[4096];
                    while (true) {
                        int i10 = inputStreamReader.read(cArr);
                        if (-1 == i10) {
                            break;
                        }
                        sb2.append(cArr, 0, i10);
                    }
                } catch (Exception e11) {
                    e10 = e11;
                    LogUtil.m3871e("readFully.", e10);
                    closeQuietly(inputStreamReader);
                    closeQuietly(fileInputStream);
                    return sb2.toString();
                }
            } catch (Exception e12) {
                e10 = e12;
                inputStreamReader = null;
            } catch (Throwable th2) {
                th = th2;
                closeQuietly(r12);
                closeQuietly(fileInputStream);
                throw th;
            }
        } catch (Exception e13) {
            fileInputStream = null;
            e10 = e13;
            inputStreamReader = null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
        closeQuietly(inputStreamReader);
        closeQuietly(fileInputStream);
        return sb2.toString();
    }

    public static String readLine(String str) {
        return readLine(new File(str));
    }

    public static String readLineAndDel(File file) throws Throwable {
        try {
            String line = readLine(file);
            file.delete();
            return line;
        } catch (Exception e10) {
            LogUtil.m3871e("readLineAndDel", e10);
            return null;
        }
    }

    public static List<String> readLines(File file, int i10) throws Throwable {
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                int i11 = 0;
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        i11++;
                        arrayList.add(line);
                        if (i10 > 0 && i11 >= i10) {
                            break;
                        }
                    } catch (IOException e10) {
                        e = e10;
                        bufferedReader = bufferedReader2;
                        LogUtil.m3871e("readLine", e);
                        closeQuietly(bufferedReader);
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        closeQuietly(bufferedReader);
                        throw th;
                    }
                }
                closeQuietly(bufferedReader2);
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    public static boolean writeFile(File file, String str) {
        return writeFile(file, str, false);
    }

    public static String readLine(File file) throws Throwable {
        List<String> lines = readLines(file, 1);
        return !lines.isEmpty() ? lines.get(0) : "";
    }

    public static boolean writeFile(File file, String str, boolean z10) throws Throwable {
        FileWriter fileWriter;
        FileWriter fileWriter2 = null;
        try {
            try {
                fileWriter = new FileWriter(file, z10);
            } catch (IOException e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileWriter.write(str);
            fileWriter.flush();
            closeQuietly(fileWriter);
            return true;
        } catch (IOException e11) {
            e = e11;
            fileWriter2 = fileWriter;
            LogUtil.m3871e("writeFile", e);
            closeQuietly(fileWriter2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileWriter2 = fileWriter;
            closeQuietly(fileWriter2);
            throw th;
        }
    }

    public static void readLine(File file, ReaderListener readerListener) throws Throwable {
        String line;
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                do {
                    try {
                        line = bufferedReader2.readLine();
                        if (line == null) {
                            closeQuietly(bufferedReader2);
                            return;
                        }
                    } catch (IOException e10) {
                        e = e10;
                        bufferedReader = bufferedReader2;
                        LogUtil.m3871e("readLine", e);
                        closeQuietly(bufferedReader);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        closeQuietly(bufferedReader);
                        throw th;
                    }
                } while (!readerListener.onReadLine(line));
                closeQuietly(bufferedReader2);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e11) {
            e = e11;
        }
    }
}
