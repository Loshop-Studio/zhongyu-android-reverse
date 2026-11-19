package com.tencent.smtt.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import androidx.collection.SieveCacheKt;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import com.tencent.smtt.sdk.TbsDownloader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.Enumeration;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

@SuppressLint({"NewApi"})
/* renamed from: com.tencent.smtt.utils.k */
/* loaded from: classes4.dex */
public class C6854k {

    /* renamed from: a */
    public static String f6983a = null;

    /* renamed from: b */
    public static final a f6984b = new C6856m();

    /* renamed from: c */
    private static final int f6985c = 4;

    /* renamed from: com.tencent.smtt.utils.k$a */
    public interface a {
        /* renamed from: a */
        boolean mo6329a(File file, File file2);
    }

    /* renamed from: com.tencent.smtt.utils.k$b */
    public interface b {
        /* renamed from: a */
        boolean mo6330a(InputStream inputStream, ZipEntry zipEntry, String str);
    }

    /* renamed from: a */
    public static long m6294a(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (inputStream == null) {
            return -1L;
        }
        byte[] bArr = new byte[4096];
        long j10 = 0;
        while (true) {
            int i10 = inputStream.read(bArr);
            if (-1 == i10) {
                return j10;
            }
            outputStream.write(bArr, 0, i10);
            j10 += i10;
        }
    }

    /* renamed from: b */
    public static int m6315b(InputStream inputStream, OutputStream outputStream) throws IOException {
        long jM6294a = m6294a(inputStream, outputStream);
        if (jM6294a > SieveCacheKt.NodeLinkMask) {
            return -1;
        }
        return (int) jM6294a;
    }

    /* renamed from: c */
    public static File m6324c() {
        File file = new File(m6296a().getAbsolutePath() + "/.tbs");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: d */
    public static FileOutputStream m6327d(File file) throws IOException {
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                throw new IOException("File '" + file + "' could not be created");
            }
        } else {
            if (file.isDirectory()) {
                throw new IOException("File '" + file + "' exists but is a directory");
            }
            if (!file.canWrite()) {
                throw new IOException("File '" + file + "' cannot be written to");
            }
        }
        return new FileOutputStream(file);
    }

    /* renamed from: a */
    public static ByteArrayOutputStream m6295a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m6315b(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream;
    }

    /* renamed from: b */
    public static FileOutputStream m6316b(Context context, boolean z10, String str) throws IOException {
        File fileM6297a = m6297a(context, z10, str);
        if (fileM6297a == null) {
            return null;
        }
        try {
            return new FileOutputStream(fileM6297a);
        } catch (FileNotFoundException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static String m6325c(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        String str = File.separator;
        sb.append(str);
        sb.append("tbs");
        sb.append(str);
        sb.append("file_locks");
        return sb.toString();
    }

    /* renamed from: d */
    public static String m6328d(Context context) {
        File file = new File(context.getDir("tbs", 0), "core_private");
        if (file.isDirectory() || file.mkdir()) {
            return file.getAbsolutePath();
        }
        return null;
    }

    /* renamed from: a */
    public static File m6296a() {
        try {
            return Environment.getExternalStorageDirectory();
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static void m6317b(File file) {
        m6302a(file, false);
    }

    /* renamed from: c */
    public static boolean m6326c(File file) {
        return file != null && file.exists() && file.isFile() && file.length() > 0;
    }

    /* renamed from: a */
    public static File m6297a(Context context, boolean z10, String str) throws IOException {
        String strM6328d = z10 ? m6328d(context) : m6325c(context);
        if (strM6328d == null) {
            return null;
        }
        File file = new File(strM6328d);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (!file.canWrite()) {
            return null;
        }
        File file2 = new File(file, str);
        if (file2.exists()) {
            return file2;
        }
        try {
            file2.createNewFile();
            return file2;
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m6318b() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static String m6298a(Context context, int i10) {
        return m6300a(context, context.getApplicationInfo().packageName, i10, true);
    }

    /* renamed from: b */
    public static boolean m6319b(Context context) {
        long jM6263a = C6844aa.m6263a();
        boolean z10 = jM6263a >= TbsDownloadConfig.getInstance(context).getDownloadMinFreeSpace();
        if (!z10) {
            TbsLog.m6246e(TbsDownloader.LOGTAG, "[TbsApkDwonloader.hasEnoughFreeSpace] freeSpace too small,  freeSpace = " + jM6263a);
        }
        return z10;
    }

    /* renamed from: a */
    private static String m6299a(Context context, String str) {
        if (context == null) {
            return "";
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return applicationContext.getExternalFilesDir(str).getAbsolutePath();
        } catch (Throwable th) {
            th.printStackTrace();
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(Environment.getExternalStorageDirectory());
                String str2 = File.separator;
                sb.append(str2);
                sb.append("Android");
                sb.append(str2);
                sb.append("data");
                sb.append(str2);
                sb.append(applicationContext.getApplicationInfo().packageName);
                sb.append(str2);
                sb.append("files");
                sb.append(str2);
                sb.append(str);
                return sb.toString();
            } catch (Exception e10) {
                e10.printStackTrace();
                return "";
            }
        }
    }

    /* renamed from: b */
    public static boolean m6320b(File file, File file2) {
        return m6308a(file, file2, (FileFilter) null);
    }

    /* renamed from: a */
    public static String m6300a(Context context, String str, int i10, boolean z10) {
        String str2;
        if (context == null) {
            return "";
        }
        try {
            str2 = Environment.getExternalStorageDirectory() + File.separator;
        } catch (Exception e10) {
            e10.printStackTrace();
            str2 = "";
        }
        switch (i10) {
            case 1:
                if (!str2.equals("")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append("tencent");
                    String str3 = File.separator;
                    sb.append(str3);
                    sb.append("tbs");
                    sb.append(str3);
                    sb.append(str);
                    break;
                }
                break;
            case 2:
                if (!str2.equals("")) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append("tbs");
                    String str4 = File.separator;
                    sb2.append(str4);
                    sb2.append("backup");
                    sb2.append(str4);
                    sb2.append(str);
                    break;
                }
                break;
            case 3:
                if (!str2.equals("")) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str2);
                    sb3.append("tencent");
                    String str5 = File.separator;
                    sb3.append(str5);
                    sb3.append("tbs");
                    sb3.append(str5);
                    sb3.append("backup");
                    sb3.append(str5);
                    sb3.append(str);
                    break;
                }
                break;
            case 4:
                if (!str2.equals("")) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str2);
                    sb4.append("tencent");
                    String str6 = File.separator;
                    sb4.append(str6);
                    sb4.append("tbs");
                    sb4.append(str6);
                    sb4.append("backup");
                    sb4.append(str6);
                    sb4.append(str);
                    String string = sb4.toString();
                    if (z10) {
                        File file = new File(string);
                        if (!file.exists() || !file.canWrite()) {
                            if (!file.exists()) {
                                file.mkdirs();
                                if (file.canWrite()) {
                                }
                            }
                            break;
                        }
                    }
                } else {
                    break;
                }
                break;
            case 5:
                if (!str2.equals("")) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(str2);
                    sb5.append("tencent");
                    String str7 = File.separator;
                    sb5.append(str7);
                    sb5.append("tbs");
                    sb5.append(str7);
                    sb5.append(str);
                    break;
                }
                break;
            case 6:
                String str8 = f6983a;
                if (str8 == null) {
                    String strM6299a = m6299a(context, "tbslog");
                    f6983a = strM6299a;
                    break;
                }
                break;
        }
        return "";
    }

    /* renamed from: b */
    private static boolean m6321b(File file, File file2, FileFilter fileFilter, a aVar) throws Throwable {
        Throwable th;
        FileChannel channel;
        if (file == null || file2 == null) {
            return false;
        }
        if (fileFilter == null || fileFilter.accept(file)) {
            FileChannel fileChannel = null;
            try {
                if (file.exists() && file.isFile()) {
                    if (file2.exists()) {
                        if (aVar != null && aVar.mo6329a(file, file2)) {
                            return true;
                        }
                        m6317b(file2);
                    }
                    File parentFile = file2.getParentFile();
                    if (parentFile.isFile()) {
                        m6317b(parentFile);
                    }
                    if (!parentFile.exists() && !parentFile.mkdirs()) {
                        return false;
                    }
                    FileChannel channel2 = new FileInputStream(file).getChannel();
                    try {
                        channel = new FileOutputStream(file2).getChannel();
                    } catch (Throwable th2) {
                        th = th2;
                        channel = null;
                    }
                    try {
                        long size = channel2.size();
                        if (channel.transferFrom(channel2, 0L, size) == size) {
                            channel2.close();
                            channel.close();
                            return true;
                        }
                        m6317b(file2);
                        channel2.close();
                        channel.close();
                        return false;
                    } catch (Throwable th3) {
                        th = th3;
                        fileChannel = channel2;
                        if (fileChannel != null) {
                            fileChannel.close();
                        }
                        if (channel == null) {
                            throw th;
                        }
                        channel.close();
                        throw th;
                    }
                }
                return false;
            } catch (Throwable th4) {
                th = th4;
                channel = null;
            }
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public static FileLock m6301a(Context context, FileOutputStream fileOutputStream) throws IOException {
        FileLock fileLockTryLock;
        if (fileOutputStream == null) {
            return null;
        }
        try {
            fileLockTryLock = fileOutputStream.getChannel().tryLock();
        } catch (OverlappingFileLockException | Exception e10) {
            e10.printStackTrace();
        }
        if (fileLockTryLock.isValid()) {
            return fileLockTryLock;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public static boolean m6322b(InputStream inputStream, ZipEntry zipEntry, String str, String str2) throws Throwable {
        IOException iOException;
        Throwable th;
        FileOutputStream fileOutputStream;
        m6306a(new File(str));
        String str3 = str + File.separator + str2;
        File file = new File(str3);
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e10) {
            iOException = e10;
        }
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, i10);
            }
            fileOutputStream.close();
            if (m6311a(str3, zipEntry.getSize(), zipEntry.getTime(), zipEntry.getCrc())) {
                TbsLog.m6246e("FileHelper", "file is different: " + str3);
                return false;
            }
            if (file.setLastModified(zipEntry.getTime())) {
                return true;
            }
            TbsLog.m6246e("FileHelper", "Couldn't set time for dst file " + file);
            return true;
        } catch (IOException e11) {
            iOException = e11;
            m6317b(file);
            throw new IOException("Couldn't write dst file " + file, iOException);
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 == null) {
                throw th;
            }
            fileOutputStream2.close();
            throw th;
        }
    }

    /* renamed from: a */
    public static void m6302a(File file, boolean z10) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            file.delete();
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            m6302a(file2, z10);
        }
        if (z10) {
            return;
        }
        file.delete();
    }

    /* renamed from: b */
    public static byte[] m6323b(InputStream inputStream) {
        return m6295a(inputStream).toByteArray();
    }

    /* renamed from: a */
    public static void m6303a(File file, boolean z10, String str) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            file.delete();
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (!file2.getName().equals(str)) {
                m6302a(file2, z10);
            }
        }
        if (z10) {
            return;
        }
        file.delete();
    }

    /* renamed from: a */
    public static void m6304a(FileLock fileLock, FileOutputStream fileOutputStream) throws IOException {
        if (fileLock != null) {
            try {
                FileChannel fileChannelChannel = fileLock.channel();
                if (fileChannelChannel != null && fileChannelChannel.isOpen()) {
                    fileLock.release();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static boolean m6305a(Context context) {
        return context != null && context.getApplicationContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    /* renamed from: a */
    public static boolean m6306a(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists() && file.isDirectory()) {
            return true;
        }
        m6317b(file);
        return file.mkdirs();
    }

    /* renamed from: a */
    public static boolean m6307a(File file, File file2) {
        return m6312a(file.getPath(), file2.getPath());
    }

    /* renamed from: a */
    public static boolean m6308a(File file, File file2, FileFilter fileFilter) {
        return m6309a(file, file2, fileFilter, f6984b);
    }

    /* renamed from: a */
    public static boolean m6309a(File file, File file2, FileFilter fileFilter, a aVar) {
        if (file == null || file2 == null || !file.exists()) {
            return false;
        }
        if (file.isFile()) {
            return m6321b(file, file2, fileFilter, aVar);
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z10 = true;
        for (File file3 : fileArrListFiles) {
            if (!m6308a(file3, new File(file2, file3.getName()), fileFilter)) {
                z10 = false;
            }
        }
        return z10;
    }

    /* renamed from: a */
    private static boolean m6311a(String str, long j10, long j11, long j12) throws Throwable {
        FileInputStream fileInputStream;
        Throwable th;
        File file = new File(str);
        if (file.length() != j10) {
            TbsLog.m6246e("FileHelper", "file size doesn't match: " + file.length() + " vs " + j10);
            return true;
        }
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Throwable th2) {
            fileInputStream = null;
            th = th2;
        }
        try {
            CRC32 crc32 = new CRC32();
            byte[] bArr = new byte[8192];
            while (true) {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    break;
                }
                crc32.update(bArr, 0, i10);
            }
            long value = crc32.getValue();
            TbsLog.m6248i("FileHelper", "" + file.getName() + ": crc = " + value + ", zipCrc = " + j12);
            fileInputStream.close();
            return value != j12;
        } catch (Throwable th3) {
            th = th3;
            if (fileInputStream == null) {
                throw th;
            }
            fileInputStream.close();
            throw th;
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public static boolean m6312a(String str, String str2) {
        return m6314a(str, str2, Build.CPU_ABI, Build.CPU_ABI2, C6861r.m6352a("ro.product.cpu.upgradeabi", "armeabi"));
    }

    /* renamed from: a */
    private static boolean m6313a(String str, String str2, String str3, String str4, b bVar) throws Throwable {
        ZipFile zipFile = null;
        try {
            ZipFile zipFile2 = new ZipFile(str);
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile2.entries();
                boolean z10 = false;
                boolean z11 = false;
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    String name = zipEntryNextElement.getName();
                    if (name != null && (name.startsWith("lib/") || name.startsWith("assets/"))) {
                        String strSubstring = name.substring(name.lastIndexOf(47));
                        if (strSubstring.endsWith(".so")) {
                            int i10 = f6985c;
                            if (name.regionMatches(i10, str2, 0, str2.length()) && name.charAt(str2.length() + i10) == '/') {
                                z10 = true;
                            } else if (str3 != null && name.regionMatches(i10, str3, 0, str3.length()) && name.charAt(str3.length() + i10) == '/') {
                                z11 = true;
                                if (z10) {
                                }
                            } else if (str4 != null && name.regionMatches(i10, str4, 0, str4.length()) && name.charAt(i10 + str4.length()) == '/' && !z10 && !z11) {
                            }
                        }
                        InputStream inputStream = zipFile2.getInputStream(zipEntryNextElement);
                        try {
                            if (!bVar.mo6330a(inputStream, zipEntryNextElement, strSubstring.substring(1))) {
                                zipFile2.close();
                                return false;
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                        } finally {
                            if (inputStream != null) {
                                inputStream.close();
                            }
                        }
                    }
                }
                zipFile2.close();
                return true;
            } catch (Throwable th) {
                th = th;
                zipFile = zipFile2;
                if (zipFile != null) {
                    zipFile.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    private static boolean m6314a(String str, String str2, String str3, String str4, String str5) {
        return m6313a(str, str3, str4, str5, new C6855l(str2));
    }
}
