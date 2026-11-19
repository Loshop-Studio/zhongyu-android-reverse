package com.taobao.sophix.p099e;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.zip.ZipFile;

/* renamed from: com.taobao.sophix.e.c */
/* loaded from: classes5.dex */
public class C7742c {
    /* renamed from: a */
    public static File m10381a(File file, String str) {
        File file2 = new File(file, str);
        if (!file2.exists() && !file2.mkdirs()) {
            C7744e.m10403d("FileUtils", "ensureDirCreated", "fail to mkdirs", file2.getAbsolutePath());
        }
        return file2;
    }

    /* renamed from: a */
    public static void m10384a(File file, File file2) throws Throwable {
        Throwable th;
        FileChannel channel;
        IOException iOException;
        FileChannel fileChannel = null;
        try {
            if (!file2.exists()) {
                file2.createNewFile();
            }
            FileChannel channel2 = new FileInputStream(file).getChannel();
            try {
                channel = new FileOutputStream(file2).getChannel();
                try {
                    channel2.transferTo(0L, channel2.size(), channel);
                    m10382a(channel2);
                    m10382a(channel);
                } catch (IOException e10) {
                    iOException = e10;
                    fileChannel = channel2;
                    try {
                        throw iOException;
                    } catch (Throwable th2) {
                        th = th2;
                        m10382a(fileChannel);
                        m10382a(channel);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileChannel = channel2;
                    m10382a(fileChannel);
                    m10382a(channel);
                    throw th;
                }
            } catch (IOException e11) {
                iOException = e11;
                channel = null;
            } catch (Throwable th4) {
                th = th4;
                channel = null;
            }
        } catch (IOException e12) {
            iOException = e12;
            channel = null;
        } catch (Throwable th5) {
            th = th5;
            channel = null;
        }
    }

    /* renamed from: a */
    public static void m10386a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4092];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i10);
            }
        }
    }

    /* renamed from: a */
    public static void m10383a(File file) {
        m10385a(file, (File[]) null);
    }

    /* renamed from: a */
    public static void m10385a(File file, File[] fileArr) {
        File[] fileArrListFiles;
        if (file == null || !file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (fileArr == null || !Arrays.asList(fileArr).contains(file2)) {
                if (file2.isDirectory()) {
                    m10385a(file2, fileArr);
                }
                file2.delete();
            }
        }
    }

    /* renamed from: a */
    public static void m10382a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m10387a(ZipFile zipFile) throws IOException {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException unused) {
            }
        }
    }
}
