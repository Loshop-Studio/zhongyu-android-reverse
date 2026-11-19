package org.android.spdy;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes6.dex */
public class SoInstallMgrSdk {
    private static final String ARMEABI = "armeabi";
    private static final int EventID_SO_INIT = 21033;
    static final String LOGTAG = "INIT_SO";
    private static final String MIPS = "mips";
    private static final String X86 = "x86";
    static Context mContext;

    private static String _cpuType() {
        String str_getFieldReflectively = _getFieldReflectively(new Build(), "CPU_ABI");
        if (str_getFieldReflectively == null || str_getFieldReflectively.length() == 0 || str_getFieldReflectively.equals("Unknown")) {
            str_getFieldReflectively = ARMEABI;
        }
        return str_getFieldReflectively.toLowerCase();
    }

    private static String _getFieldReflectively(Build build, String str) {
        try {
            return Build.class.getField(str).get(build).toString();
        } catch (Exception unused) {
            return "Unknown";
        }
    }

    public static boolean _loadUnzipSo(String str, int i10, ClassLoader classLoader) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            if (isExist(str, i10)) {
                if (classLoader == null) {
                    System.load(_targetSoFile(str, i10));
                } else {
                    Runtime runtime = Runtime.getRuntime();
                    Method declaredMethod = Runtime.class.getDeclaredMethod("load", String.class, ClassLoader.class);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(runtime, _targetSoFile(str, i10), classLoader);
                }
            }
            return true;
        } catch (Error e10) {
            e10.printStackTrace();
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        } catch (UnsatisfiedLinkError e12) {
            e12.printStackTrace();
            return false;
        }
    }

    public static String _targetSoFile(String str, int i10) {
        Context context = mContext;
        if (context == null) {
            return "";
        }
        String path = "/data/data/" + context.getPackageName() + "/files";
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            path = filesDir.getPath();
        }
        return path + "/lib" + str + "bk" + i10 + ".so";
    }

    public static void init(Context context) {
        mContext = context;
    }

    public static boolean initSo(String str, int i10) {
        return initSo(str, i10, null);
    }

    public static boolean isExist(String str, int i10) {
        return new File(_targetSoFile(str, i10)).exists();
    }

    public static void removeSoIfExit(String str, int i10) {
        File file = new File(_targetSoFile(str, i10));
        if (file.exists()) {
            file.delete();
        }
    }

    public static boolean unZipSelectedFiles(String str, int i10, ClassLoader classLoader) throws Throwable {
        Context context;
        FileChannel fileChannel;
        FileOutputStream fileOutputStreamOpenFileOutput;
        InputStream inputStream;
        String str2 = "lib/armeabi/lib" + str + ".so";
        try {
            context = mContext;
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        if (context == null) {
            return false;
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        ZipFile zipFile = new ZipFile(applicationInfo != null ? applicationInfo.sourceDir : "");
        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
        while (enumerationEntries.hasMoreElements()) {
            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
            String name = zipEntryNextElement.getName();
            if (!name.contains("..") && !name.contains("\\") && !name.contains("%")) {
                if (zipEntryNextElement.getName().startsWith(str2)) {
                    InputStream inputStream2 = null;
                    FileChannel channel = null;
                    try {
                        removeSoIfExit(str, i10);
                        inputStream = zipFile.getInputStream(zipEntryNextElement);
                        try {
                            fileOutputStreamOpenFileOutput = context.openFileOutput("lib" + str + "bk" + i10 + ".so", 0);
                        } catch (Throwable th) {
                            th = th;
                            fileChannel = null;
                            fileOutputStreamOpenFileOutput = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileChannel = null;
                        fileOutputStreamOpenFileOutput = null;
                    }
                    try {
                        channel = fileOutputStreamOpenFileOutput.getChannel();
                        byte[] bArr = new byte[1024];
                        int i11 = 0;
                        while (true) {
                            int i12 = inputStream.read(bArr);
                            if (i12 > 0) {
                                channel.write(ByteBuffer.wrap(bArr, 0, i12));
                                i11 += i12;
                            } else {
                                try {
                                    break;
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                            }
                        }
                        inputStream.close();
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (Exception e12) {
                                e12.printStackTrace();
                            }
                        }
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (Exception e13) {
                            e13.printStackTrace();
                        }
                        zipFile.close();
                        if (i11 > 0) {
                            return _loadUnzipSo(str, i10, classLoader);
                        }
                        return false;
                    } catch (Throwable th3) {
                        th = th3;
                        fileChannel = channel;
                        inputStream2 = inputStream;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Exception e14) {
                                e14.printStackTrace();
                            }
                        }
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (Exception e15) {
                                e15.printStackTrace();
                            }
                        }
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (Exception e16) {
                                e16.printStackTrace();
                            }
                        }
                        zipFile.close();
                        throw th;
                    }
                }
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean initSo(java.lang.String r6, int r7, java.lang.ClassLoader r8) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r0 = 1
            r1 = 0
            if (r8 != 0) goto Le
            java.lang.System.loadLibrary(r6)     // Catch: java.lang.Error -> L8 java.lang.UnsatisfiedLinkError -> La java.lang.Exception -> Lc
            goto L3a
        L8:
            r0 = move-exception
            goto L2d
        La:
            r0 = move-exception
            goto L32
        Lc:
            r0 = move-exception
            goto L36
        Le:
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Error -> L8 java.lang.UnsatisfiedLinkError -> La java.lang.Exception -> Lc
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Class<java.lang.ClassLoader> r4 = java.lang.ClassLoader.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r4}     // Catch: java.lang.Error -> L8 java.lang.UnsatisfiedLinkError -> La java.lang.Exception -> Lc
            java.lang.Class<java.lang.Runtime> r4 = java.lang.Runtime.class
            java.lang.String r5 = "loadLibrary"
            java.lang.reflect.Method r3 = r4.getDeclaredMethod(r5, r3)     // Catch: java.lang.Error -> L8 java.lang.UnsatisfiedLinkError -> La java.lang.Exception -> Lc
            r3.setAccessible(r0)     // Catch: java.lang.Error -> L8 java.lang.UnsatisfiedLinkError -> La java.lang.Exception -> Lc
            java.lang.Object[] r4 = new java.lang.Object[]{r6, r8}     // Catch: java.lang.Error -> L8 java.lang.UnsatisfiedLinkError -> La java.lang.Exception -> Lc
            r3.invoke(r2, r4)     // Catch: java.lang.Error -> L8 java.lang.UnsatisfiedLinkError -> La java.lang.Exception -> Lc
            goto L3a
        L2d:
            r0.printStackTrace()
        L30:
            r0 = r1
            goto L3a
        L32:
            r0.printStackTrace()
            goto L30
        L36:
            r0.printStackTrace()
            goto L30
        L3a:
            if (r0 != 0) goto L84
            boolean r2 = isExist(r6, r7)     // Catch: java.lang.Error -> L4d java.lang.UnsatisfiedLinkError -> L4f java.lang.Exception -> L51
            if (r2 == 0) goto L53
            boolean r2 = _loadUnzipSo(r6, r7, r8)     // Catch: java.lang.Error -> L4d java.lang.UnsatisfiedLinkError -> L4f java.lang.Exception -> L51
            if (r2 == 0) goto L49
            return r2
        L49:
            removeSoIfExit(r6, r7)     // Catch: java.lang.Error -> L4d java.lang.UnsatisfiedLinkError -> L4f java.lang.Exception -> L51
            goto L53
        L4d:
            r6 = move-exception
            goto L78
        L4f:
            r6 = move-exception
            goto L7c
        L51:
            r6 = move-exception
            goto L80
        L53:
            java.lang.String r2 = _cpuType()     // Catch: java.lang.Error -> L4d java.lang.UnsatisfiedLinkError -> L4f java.lang.Exception -> L51
            java.lang.String r3 = "mips"
            boolean r3 = r2.equalsIgnoreCase(r3)     // Catch: java.lang.Error -> L4d java.lang.UnsatisfiedLinkError -> L4f java.lang.Exception -> L51
            if (r3 != 0) goto L84
            java.lang.String r3 = "x86"
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch: java.lang.Error -> L4d java.lang.UnsatisfiedLinkError -> L4f java.lang.Exception -> L51
            if (r2 == 0) goto L68
            goto L84
        L68:
            boolean r6 = unZipSelectedFiles(r6, r7, r8)     // Catch: java.lang.Error -> L4d java.lang.UnsatisfiedLinkError -> L4f java.lang.Exception -> L51 java.io.IOException -> L6e java.util.zip.ZipException -> L73
            r1 = r6
            goto L85
        L6e:
            r6 = move-exception
            r6.printStackTrace()     // Catch: java.lang.Error -> L4d java.lang.UnsatisfiedLinkError -> L4f java.lang.Exception -> L51
            goto L84
        L73:
            r6 = move-exception
            r6.printStackTrace()     // Catch: java.lang.Error -> L4d java.lang.UnsatisfiedLinkError -> L4f java.lang.Exception -> L51
            goto L84
        L78:
            r6.printStackTrace()
            goto L85
        L7c:
            r6.printStackTrace()
            goto L85
        L80:
            r6.printStackTrace()
            goto L85
        L84:
            r1 = r0
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.spdy.SoInstallMgrSdk.initSo(java.lang.String, int, java.lang.ClassLoader):boolean");
    }
}
