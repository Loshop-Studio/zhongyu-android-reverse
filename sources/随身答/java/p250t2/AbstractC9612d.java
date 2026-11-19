package p250t2;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import p210p2.AbstractC9318a;
import p270v2.AbstractC9758f;

/* renamed from: t2.d */
/* loaded from: classes4.dex */
public abstract class AbstractC9612d {

    /* renamed from: a */
    public static final byte[] f16897a = {10, 1, 11, 5, 4, 15, 7, 9, 23, 3, 1, 6, 8, 12, 13, 91};

    /* renamed from: b */
    public static Object f16898b = new Object();

    /* renamed from: t2.d$a */
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

    /* renamed from: t2.d$b */
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

    /* renamed from: t2.d$c */
    public static class c implements FilenameFilter {

        /* renamed from: a */
        public final /* synthetic */ String f16899a;

        public c(String str) {
            this.f16899a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(this.f16899a);
        }
    }

    /* renamed from: t2.d$d */
    public static class d implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            if (file == null || file2 == null || file.lastModified() >= file2.lastModified()) {
                return (file == null || file2 == null || file.lastModified() != file2.lastModified()) ? 1 : 0;
            }
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0067 A[EXC_TOP_SPLITTER, PHI: r1
      0x0067: PHI (r1v2 java.io.FileOutputStream) = (r1v1 java.io.FileOutputStream), (r1v3 java.io.FileOutputStream) binds: [B:26:0x0065, B:32:0x0070] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m15892a(android.content.Context r6, java.lang.String r7, java.lang.String r8, byte[] r9) {
        /*
            r0 = 101(0x65, float:1.42E-43)
            if (r6 == 0) goto L7a
            r1 = 0
            java.lang.Object r2 = p250t2.AbstractC9612d.f16898b     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r4.<init>()     // Catch: java.lang.Throwable -> L2f
            java.io.File r5 = r6.getFilesDir()     // Catch: java.lang.Throwable -> L2f
            r4.append(r5)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r5 = java.io.File.separator     // Catch: java.lang.Throwable -> L2f
            r4.append(r5)     // Catch: java.lang.Throwable -> L2f
            r4.append(r7)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L2f
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L2f
            boolean r7 = r3.isDirectory()     // Catch: java.lang.Throwable -> L2f
            if (r7 != 0) goto L31
            r3.mkdir()     // Catch: java.lang.Throwable -> L2f
            goto L31
        L2f:
            r7 = move-exception
            goto L5c
        L31:
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r4.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = r3.getPath()     // Catch: java.lang.Throwable -> L2f
            r4.append(r3)     // Catch: java.lang.Throwable -> L2f
            r4.append(r5)     // Catch: java.lang.Throwable -> L2f
            r4.append(r8)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> L2f
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L2f
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2f
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L2f
            r8.write(r9)     // Catch: java.lang.Throwable -> L5a
            r8.close()     // Catch: java.lang.Throwable -> L5a
            r0 = 0
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            return r0
        L5a:
            r7 = move-exception
            r1 = r8
        L5c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            throw r7     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
        L5e:
            r7 = move-exception
            goto L62
        L60:
            r7 = move-exception
            goto L6d
        L62:
            p210p2.AbstractC9318a.m15200b(r6, r7)     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L73
        L67:
            r1.close()     // Catch: java.lang.Throwable -> L73
            goto L73
        L6b:
            r6 = move-exception
            goto L74
        L6d:
            p210p2.AbstractC9318a.m15200b(r6, r7)     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L73
            goto L67
        L73:
            return r0
        L74:
            if (r1 == 0) goto L79
            r1.close()     // Catch: java.lang.Throwable -> L79
        L79:
            throw r6
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p250t2.AbstractC9612d.m15892a(android.content.Context, java.lang.String, java.lang.String, byte[]):int");
    }

    /* renamed from: b */
    public static File m15893b(Context context) {
        File[] fileArrListFiles;
        File[] fileArrListFiles2;
        File file = null;
        try {
            synchronized (f16898b) {
                try {
                    AbstractC9758f.m16434i("walle", "get last envelope begin, thread is " + Thread.currentThread());
                    if (context != null && context.getApplicationContext() != null) {
                        String str = context.getApplicationContext().getFilesDir() + File.separator + "stateless";
                        if (!TextUtils.isEmpty(str)) {
                            File file2 = new File(str);
                            if (file2.isDirectory() && (fileArrListFiles = file2.listFiles()) != null && fileArrListFiles.length > 0) {
                                for (File file3 : fileArrListFiles) {
                                    if (file3 != null && file3.isDirectory() && (fileArrListFiles2 = file3.listFiles()) != null && fileArrListFiles2.length > 0) {
                                        Arrays.sort(fileArrListFiles2, new a());
                                        File file4 = fileArrListFiles2[0];
                                        if (file4 != null && (file == null || file.lastModified() > file4.lastModified())) {
                                            file = file4;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    AbstractC9758f.m16434i("walle", "get last envelope end, thread is " + Thread.currentThread());
                } finally {
                }
            }
            return file;
        } catch (Throwable th) {
            AbstractC9318a.m15200b(context, th);
            return file;
        }
    }

    /* renamed from: c */
    public static String m15894c(Context context, boolean z9) {
        if (context == null) {
            return null;
        }
        try {
            if (z9) {
                return context.getApplicationContext().getFilesDir() + File.separator + "stateless";
            }
            return context.getApplicationContext().getFilesDir() + File.separator + ".emitter";
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static void m15895d(Context context, String str, String str2, int i9) {
        if (str == null) {
            return;
        }
        try {
            File file = new File(str);
            if (file.isDirectory()) {
                synchronized (f16898b) {
                    try {
                        File[] fileArrListFiles = file.listFiles(new c(str2));
                        if (fileArrListFiles == null || fileArrListFiles.length < i9) {
                            AbstractC9758f.m16434i("AmapLBS", "[lbs-build] file size < max");
                        } else {
                            AbstractC9758f.m16434i("AmapLBS", "[lbs-build] file size >= max");
                            ArrayList arrayList = new ArrayList();
                            for (File file2 : fileArrListFiles) {
                                if (file2 != null) {
                                    arrayList.add(file2);
                                }
                            }
                            if (arrayList.size() >= i9) {
                                Collections.sort(arrayList, new d());
                                if (AbstractC9758f.f17293a) {
                                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                        AbstractC9758f.m16434i("AmapLBS", "[lbs-build] overrun native file is " + ((File) arrayList.get(i10)).getPath());
                                    }
                                }
                                for (int i11 = 0; i11 <= arrayList.size() - i9; i11++) {
                                    if (arrayList.get(i11) != null) {
                                        AbstractC9758f.m16434i("AmapLBS", "[lbs-build] overrun remove file is " + ((File) arrayList.get(i11)).getPath());
                                        try {
                                            ((File) arrayList.get(i11)).delete();
                                            arrayList.remove(i11);
                                        } catch (Exception unused) {
                                        }
                                    }
                                }
                            }
                        }
                        AbstractC9758f.m16434i("AmapLBS", "[lbs-build] delete file end " + fileArrListFiles.length + ", thread is " + Thread.currentThread());
                    } finally {
                    }
                }
            }
        } catch (Throwable th) {
            AbstractC9318a.m15200b(context, th);
        }
    }

    /* renamed from: e */
    public static boolean m15896e(File file) {
        if (file == null) {
            return false;
        }
        if (file.isDirectory()) {
            for (String str : file.list()) {
                if (!m15896e(new File(file, str))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    /* renamed from: f */
    public static byte[] m15897f(String str) {
        Throwable th;
        IOException iOException;
        FileChannel channel;
        byte[] bArr;
        synchronized (f16898b) {
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
                } catch (Throwable unused) {
                }
            } catch (IOException e11) {
                iOException = e11;
                fileChannel = channel;
                AbstractC9758f.m16434i("walle", "[stateless] write envelope, e is " + iOException.getMessage());
                throw iOException;
            } catch (Throwable th3) {
                th = th3;
                fileChannel = channel;
                if (fileChannel == null) {
                    throw th;
                }
                try {
                    fileChannel.close();
                    throw th;
                } catch (Throwable unused2) {
                    throw th;
                }
            }
        }
        return bArr;
    }

    /* renamed from: g */
    public static String m15898g(String str) {
        try {
            return Base64.encodeToString(str.getBytes(), 0);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: h */
    public static String m15899h(String str) {
        try {
            return new String(Base64.decode(str, 0));
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: i */
    public static File[] m15900i(Context context) {
        if (context == null) {
            return null;
        }
        try {
            synchronized (f16898b) {
                try {
                    String str = context.getApplicationContext().getFilesDir() + File.separator + ".emitter";
                    if (TextUtils.isEmpty(str)) {
                        return null;
                    }
                    File file = new File(str);
                    synchronized (f16898b) {
                        File[] fileArrListFiles = file.listFiles();
                        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                            Arrays.sort(fileArrListFiles, new b());
                            return fileArrListFiles;
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            AbstractC9318a.m15200b(context, th2);
            return null;
        }
    }

    /* renamed from: j */
    public static String m15901j(String str) {
        int iLastIndexOf;
        int iLastIndexOf2;
        return (!TextUtils.isEmpty(str) && str.indexOf("envelope") < 0 && (iLastIndexOf = str.lastIndexOf("_")) >= 0 && (iLastIndexOf2 = str.lastIndexOf(".")) >= 0) ? str.substring(iLastIndexOf + 1, iLastIndexOf2) : "";
    }
}
