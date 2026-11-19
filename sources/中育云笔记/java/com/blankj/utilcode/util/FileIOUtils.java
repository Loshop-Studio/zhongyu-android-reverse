package com.blankj.utilcode.util;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.List;

/* loaded from: classes3.dex */
public final class FileIOUtils {
    private static int sBufferSize = 524288;

    public interface OnProgressUpdateListener {
        void onProgressUpdate(double d10);
    }

    private FileIOUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static byte[] readFile2BytesByChannel(String str) {
        return readFile2BytesByChannel(UtilsBridge.getFileByPath(str));
    }

    public static byte[] readFile2BytesByMap(String str) {
        return readFile2BytesByMap(UtilsBridge.getFileByPath(str));
    }

    public static byte[] readFile2BytesByStream(String str) {
        return readFile2BytesByStream(UtilsBridge.getFileByPath(str), (OnProgressUpdateListener) null);
    }

    public static List<String> readFile2List(String str) {
        return readFile2List(UtilsBridge.getFileByPath(str), (String) null);
    }

    public static String readFile2String(String str) {
        return readFile2String(UtilsBridge.getFileByPath(str), (String) null);
    }

    public static void setBufferSize(int i10) {
        sBufferSize = i10;
    }

    public static boolean writeFileFromBytesByChannel(String str, byte[] bArr, boolean z10) {
        return writeFileFromBytesByChannel(UtilsBridge.getFileByPath(str), bArr, false, z10);
    }

    public static boolean writeFileFromBytesByMap(String str, byte[] bArr, boolean z10) {
        return writeFileFromBytesByMap(str, bArr, false, z10);
    }

    public static boolean writeFileFromBytesByStream(String str, byte[] bArr) {
        return writeFileFromBytesByStream(UtilsBridge.getFileByPath(str), bArr, false, (OnProgressUpdateListener) null);
    }

    public static boolean writeFileFromIS(String str, InputStream inputStream) {
        return writeFileFromIS(UtilsBridge.getFileByPath(str), inputStream, false, (OnProgressUpdateListener) null);
    }

    public static boolean writeFileFromString(String str, String str2) {
        return writeFileFromString(UtilsBridge.getFileByPath(str), str2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    public static byte[] readFile2BytesByChannel(File file) throws Throwable {
        FileChannel channel;
        byte[] bArrArray;
        ?? r12 = 0;
        try {
            if (!UtilsBridge.isFileExists(file)) {
                return null;
            }
            try {
                channel = new RandomAccessFile(file, "r").getChannel();
                try {
                    if (channel == null) {
                        Log.e("FileIOUtils", "fc is null.");
                        bArrArray = new byte[0];
                        if (channel != null) {
                        }
                        return bArrArray;
                    }
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) channel.size());
                    while (channel.read(byteBufferAllocate) > 0) {
                    }
                    bArrArray = byteBufferAllocate.array();
                    try {
                        channel.close();
                        return bArrArray;
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                } catch (IOException e11) {
                    e = e11;
                    e.printStackTrace();
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (IOException e13) {
                e = e13;
                channel = null;
            } catch (Throwable th) {
                th = th;
                if (r12 != 0) {
                    try {
                        r12.close();
                    } catch (IOException e14) {
                        e14.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r12 = file;
        }
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x002c: MOVE (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:16:0x002b */
    public static byte[] readFile2BytesByMap(File file) throws Throwable {
        Throwable th;
        AbstractInterruptibleChannel abstractInterruptibleChannel;
        IOException iOException;
        FileChannel channel;
        AbstractInterruptibleChannel abstractInterruptibleChannel2 = null;
        try {
            if (!UtilsBridge.isFileExists(file)) {
                return null;
            }
            try {
                channel = new RandomAccessFile(file, "r").getChannel();
                try {
                    if (channel == null) {
                        Log.e("FileIOUtils", "fc is null.");
                        byte[] bArr = new byte[0];
                        if (channel != null) {
                            try {
                                channel.close();
                                return bArr;
                            } catch (IOException e10) {
                                e10.printStackTrace();
                            }
                        }
                        return bArr;
                    }
                    int size = (int) channel.size();
                    byte[] bArr2 = new byte[size];
                    channel.map(FileChannel.MapMode.READ_ONLY, 0L, size).load().get(bArr2, 0, size);
                    try {
                        channel.close();
                        return bArr2;
                    } catch (IOException e11) {
                        e11.printStackTrace();
                        return bArr2;
                    }
                } catch (IOException e12) {
                    iOException = e12;
                    iOException.printStackTrace();
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException e13) {
                            e13.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (IOException e14) {
                iOException = e14;
                channel = null;
            } catch (Throwable th2) {
                th = th2;
                if (abstractInterruptibleChannel2 == null) {
                    throw th;
                }
                try {
                    abstractInterruptibleChannel2.close();
                    throw th;
                } catch (IOException e15) {
                    e15.printStackTrace();
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            abstractInterruptibleChannel2 = abstractInterruptibleChannel;
        }
    }

    public static byte[] readFile2BytesByStream(File file) {
        return readFile2BytesByStream(file, (OnProgressUpdateListener) null);
    }

    public static List<String> readFile2List(String str, String str2) {
        return readFile2List(UtilsBridge.getFileByPath(str), str2);
    }

    public static String readFile2String(String str, String str2) {
        return readFile2String(UtilsBridge.getFileByPath(str), str2);
    }

    public static boolean writeFileFromBytesByChannel(String str, byte[] bArr, boolean z10, boolean z11) {
        return writeFileFromBytesByChannel(UtilsBridge.getFileByPath(str), bArr, z10, z11);
    }

    public static boolean writeFileFromBytesByMap(String str, byte[] bArr, boolean z10, boolean z11) {
        return writeFileFromBytesByMap(UtilsBridge.getFileByPath(str), bArr, z10, z11);
    }

    public static boolean writeFileFromBytesByStream(String str, byte[] bArr, boolean z10) {
        return writeFileFromBytesByStream(UtilsBridge.getFileByPath(str), bArr, z10, (OnProgressUpdateListener) null);
    }

    public static boolean writeFileFromIS(String str, InputStream inputStream, boolean z10) {
        return writeFileFromIS(UtilsBridge.getFileByPath(str), inputStream, z10, (OnProgressUpdateListener) null);
    }

    public static boolean writeFileFromString(String str, String str2, boolean z10) {
        return writeFileFromString(UtilsBridge.getFileByPath(str), str2, z10);
    }

    public static byte[] readFile2BytesByStream(String str, OnProgressUpdateListener onProgressUpdateListener) {
        return readFile2BytesByStream(UtilsBridge.getFileByPath(str), onProgressUpdateListener);
    }

    public static List<String> readFile2List(File file) {
        return readFile2List(file, 0, Integer.MAX_VALUE, (String) null);
    }

    public static String readFile2String(File file) {
        return readFile2String(file, (String) null);
    }

    public static boolean writeFileFromBytesByChannel(File file, byte[] bArr, boolean z10) {
        return writeFileFromBytesByChannel(file, bArr, false, z10);
    }

    public static boolean writeFileFromBytesByMap(File file, byte[] bArr, boolean z10) {
        return writeFileFromBytesByMap(file, bArr, false, z10);
    }

    public static boolean writeFileFromBytesByStream(File file, byte[] bArr) {
        return writeFileFromBytesByStream(file, bArr, false, (OnProgressUpdateListener) null);
    }

    public static boolean writeFileFromIS(File file, InputStream inputStream) {
        return writeFileFromIS(file, inputStream, false, (OnProgressUpdateListener) null);
    }

    public static boolean writeFileFromString(File file, String str) {
        return writeFileFromString(file, str, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[Catch: FileNotFoundException -> 0x0063, SYNTHETIC, TRY_LEAVE, TryCatch #4 {FileNotFoundException -> 0x0063, blocks: (B:5:0x0008, B:28:0x005f, B:24:0x0057, B:56:0x0092, B:55:0x008f, B:50:0x0085, B:45:0x007c, B:40:0x0072, B:21:0x0052, B:47:0x0080, B:37:0x006d, B:52:0x008a, B:25:0x005a, B:42:0x0077), top: B:63:0x0008, inners: #1, #3, #5, #7, #8, #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] readFile2BytesByStream(java.io.File r10, com.blankj.utilcode.util.FileIOUtils.OnProgressUpdateListener r11) throws java.lang.Throwable {
        /*
            boolean r0 = com.blankj.utilcode.util.UtilsBridge.isFileExists(r10)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.io.FileNotFoundException -> L63
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L63
            r2.<init>(r10)     // Catch: java.io.FileNotFoundException -> L63
            int r10 = com.blankj.utilcode.util.FileIOUtils.sBufferSize     // Catch: java.io.FileNotFoundException -> L63
            r0.<init>(r2, r10)     // Catch: java.io.FileNotFoundException -> L63
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L68
            r10.<init>()     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L68
            int r2 = com.blankj.utilcode.util.FileIOUtils.sBufferSize     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            r3 = -1
            r4 = 0
            if (r11 != 0) goto L31
        L21:
            int r11 = com.blankj.utilcode.util.FileIOUtils.sBufferSize     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            int r11 = r0.read(r2, r4, r11)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            if (r11 == r3) goto L4e
            r10.write(r2, r4, r11)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            goto L21
        L2d:
            r11 = move-exception
            goto L80
        L2f:
            r11 = move-exception
            goto L6a
        L31:
            int r5 = r0.available()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            double r5 = (double) r5     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            r7 = 0
            r11.onProgressUpdate(r7)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            r7 = r4
        L3c:
            int r8 = com.blankj.utilcode.util.FileIOUtils.sBufferSize     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            int r8 = r0.read(r2, r4, r8)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            if (r8 == r3) goto L4e
            r10.write(r2, r4, r8)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            int r7 = r7 + r8
            double r8 = (double) r7     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            double r8 = r8 / r5
            r11.onProgressUpdate(r8)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            goto L3c
        L4e:
            byte[] r11 = r10.toByteArray()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            r0.close()     // Catch: java.io.IOException -> L56
            goto L5a
        L56:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.io.FileNotFoundException -> L63
        L5a:
            r10.close()     // Catch: java.io.IOException -> L5e
            goto L62
        L5e:
            r10 = move-exception
            r10.printStackTrace()     // Catch: java.io.FileNotFoundException -> L63
        L62:
            return r11
        L63:
            r10 = move-exception
            goto L93
        L65:
            r11 = move-exception
            r10 = r1
            goto L80
        L68:
            r11 = move-exception
            r10 = r1
        L6a:
            r11.printStackTrace()     // Catch: java.lang.Throwable -> L2d
            r0.close()     // Catch: java.io.IOException -> L71
            goto L75
        L71:
            r11 = move-exception
            r11.printStackTrace()     // Catch: java.io.FileNotFoundException -> L63
        L75:
            if (r10 == 0) goto L7f
            r10.close()     // Catch: java.io.IOException -> L7b
            goto L7f
        L7b:
            r10 = move-exception
            r10.printStackTrace()     // Catch: java.io.FileNotFoundException -> L63
        L7f:
            return r1
        L80:
            r0.close()     // Catch: java.io.IOException -> L84
            goto L88
        L84:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.io.FileNotFoundException -> L63
        L88:
            if (r10 == 0) goto L92
            r10.close()     // Catch: java.io.IOException -> L8e
            goto L92
        L8e:
            r10 = move-exception
            r10.printStackTrace()     // Catch: java.io.FileNotFoundException -> L63
        L92:
            throw r11     // Catch: java.io.FileNotFoundException -> L63
        L93:
            r10.printStackTrace()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.FileIOUtils.readFile2BytesByStream(java.io.File, com.blankj.utilcode.util.FileIOUtils$OnProgressUpdateListener):byte[]");
    }

    public static List<String> readFile2List(File file, String str) {
        return readFile2List(file, 0, Integer.MAX_VALUE, str);
    }

    public static String readFile2String(File file, String str) {
        byte[] file2BytesByStream = readFile2BytesByStream(file);
        if (file2BytesByStream == null) {
            return null;
        }
        if (UtilsBridge.isSpace(str)) {
            return new String(file2BytesByStream);
        }
        try {
            return new String(file2BytesByStream, str);
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static boolean writeFileFromBytesByChannel(File file, byte[] bArr, boolean z10, boolean z11) throws IOException {
        if (bArr == null) {
            Log.e("FileIOUtils", "bytes is null.");
            return false;
        }
        if (!UtilsBridge.createOrExistsFile(file)) {
            Log.e("FileIOUtils", "create file <" + file + "> failed.");
            return false;
        }
        AbstractInterruptibleChannel abstractInterruptibleChannel = null;
        try {
            try {
                FileChannel channel = new FileOutputStream(file, z10).getChannel();
                if (channel == null) {
                    Log.e("FileIOUtils", "fc is null.");
                    if (channel != null) {
                        try {
                            channel.close();
                            return false;
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                    }
                    return false;
                }
                channel.position(channel.size());
                channel.write(ByteBuffer.wrap(bArr));
                if (z11) {
                    channel.force(true);
                }
                try {
                    channel.close();
                    return true;
                } catch (IOException e11) {
                    e11.printStackTrace();
                    return true;
                }
            } catch (IOException e12) {
                e12.printStackTrace();
                if (0 != 0) {
                    try {
                        abstractInterruptibleChannel.close();
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                }
                return false;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    abstractInterruptibleChannel.close();
                } catch (IOException e14) {
                    e14.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static boolean writeFileFromBytesByMap(File file, byte[] bArr, boolean z10, boolean z11) throws Throwable {
        IOException iOException;
        Throwable th;
        FileChannel channel;
        if (bArr != null && UtilsBridge.createOrExistsFile(file)) {
            FileChannel fileChannel = null;
            try {
                try {
                    channel = new FileOutputStream(file, z10).getChannel();
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e10) {
                iOException = e10;
            }
            try {
                if (channel == null) {
                    Log.e("FileIOUtils", "fc is null.");
                    if (channel != null) {
                        try {
                            channel.close();
                            return false;
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                    }
                    return false;
                }
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_WRITE, channel.size(), bArr.length);
                map.put(bArr);
                if (z11) {
                    map.force();
                }
                try {
                    channel.close();
                    return true;
                } catch (IOException e12) {
                    e12.printStackTrace();
                    return true;
                }
            } catch (IOException e13) {
                iOException = e13;
                fileChannel = channel;
                iOException.printStackTrace();
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException e14) {
                        e14.printStackTrace();
                    }
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                fileChannel = channel;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                        throw th;
                    } catch (IOException e15) {
                        e15.printStackTrace();
                        throw th;
                    }
                }
                throw th;
            }
        }
        Log.e("FileIOUtils", "create file <" + file + "> failed.");
        return false;
    }

    public static boolean writeFileFromBytesByStream(File file, byte[] bArr, boolean z10) {
        return writeFileFromBytesByStream(file, bArr, z10, (OnProgressUpdateListener) null);
    }

    public static boolean writeFileFromIS(File file, InputStream inputStream, boolean z10) {
        return writeFileFromIS(file, inputStream, z10, (OnProgressUpdateListener) null);
    }

    public static boolean writeFileFromString(File file, String str, boolean z10) throws Throwable {
        BufferedWriter bufferedWriter;
        if (file == null || str == null) {
            return false;
        }
        if (!UtilsBridge.createOrExistsFile(file)) {
            Log.e("FileIOUtils", "create file <" + file + "> failed.");
            return false;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(file, z10));
            } catch (IOException e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(str);
            try {
                bufferedWriter.close();
                return true;
            } catch (IOException e11) {
                e11.printStackTrace();
                return true;
            }
        } catch (IOException e12) {
            e = e12;
            bufferedWriter2 = bufferedWriter;
            e.printStackTrace();
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (IOException e13) {
                    e13.printStackTrace();
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (IOException e14) {
                    e14.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static List<String> readFile2List(String str, int i10, int i11) {
        return readFile2List(UtilsBridge.getFileByPath(str), i10, i11, (String) null);
    }

    public static boolean writeFileFromBytesByStream(String str, byte[] bArr, OnProgressUpdateListener onProgressUpdateListener) {
        return writeFileFromBytesByStream(UtilsBridge.getFileByPath(str), bArr, false, onProgressUpdateListener);
    }

    public static boolean writeFileFromIS(String str, InputStream inputStream, OnProgressUpdateListener onProgressUpdateListener) {
        return writeFileFromIS(UtilsBridge.getFileByPath(str), inputStream, false, onProgressUpdateListener);
    }

    public static List<String> readFile2List(String str, int i10, int i11, String str2) {
        return readFile2List(UtilsBridge.getFileByPath(str), i10, i11, str2);
    }

    public static boolean writeFileFromBytesByStream(String str, byte[] bArr, boolean z10, OnProgressUpdateListener onProgressUpdateListener) {
        return writeFileFromBytesByStream(UtilsBridge.getFileByPath(str), bArr, z10, onProgressUpdateListener);
    }

    public static boolean writeFileFromIS(String str, InputStream inputStream, boolean z10, OnProgressUpdateListener onProgressUpdateListener) {
        return writeFileFromIS(UtilsBridge.getFileByPath(str), inputStream, z10, onProgressUpdateListener);
    }

    public static List<String> readFile2List(File file, int i10, int i11) {
        return readFile2List(file, i10, i11, (String) null);
    }

    public static boolean writeFileFromBytesByStream(File file, byte[] bArr, OnProgressUpdateListener onProgressUpdateListener) {
        return writeFileFromBytesByStream(file, bArr, false, onProgressUpdateListener);
    }

    public static boolean writeFileFromIS(File file, InputStream inputStream, OnProgressUpdateListener onProgressUpdateListener) {
        return writeFileFromIS(file, inputStream, false, onProgressUpdateListener);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<java.lang.String> readFile2List(java.io.File r6, int r7, int r8, java.lang.String r9) throws java.lang.Throwable {
        /*
            boolean r0 = com.blankj.utilcode.util.UtilsBridge.isFileExists(r6)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            if (r7 <= r8) goto Lb
            return r1
        Lb:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r0.<init>()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            boolean r2 = com.blankj.utilcode.util.UtilsBridge.isSpace(r9)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r3 = 1
            if (r2 == 0) goto L2c
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r9.<init>(r2)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            goto L3c
        L27:
            r6 = move-exception
            goto L6c
        L29:
            r6 = move-exception
            r9 = r1
            goto L5e
        L2c:
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r4.<init>(r5, r9)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r9 = r2
        L3c:
            java.lang.String r6 = r9.readLine()     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
            if (r6 == 0) goto L55
            if (r3 <= r8) goto L45
            goto L55
        L45:
            if (r7 > r3) goto L52
            if (r3 > r8) goto L52
            r0.add(r6)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
            goto L52
        L4d:
            r6 = move-exception
            r1 = r9
            goto L6c
        L50:
            r6 = move-exception
            goto L5e
        L52:
            int r3 = r3 + 1
            goto L3c
        L55:
            r9.close()     // Catch: java.io.IOException -> L59
            return r0
        L59:
            r6 = move-exception
            r6.printStackTrace()
            return r0
        L5e:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L4d
            if (r9 == 0) goto L6b
            r9.close()     // Catch: java.io.IOException -> L67
            goto L6b
        L67:
            r6 = move-exception
            r6.printStackTrace()
        L6b:
            return r1
        L6c:
            if (r1 == 0) goto L76
            r1.close()     // Catch: java.io.IOException -> L72
            goto L76
        L72:
            r7 = move-exception
            r7.printStackTrace()
        L76:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.FileIOUtils.readFile2List(java.io.File, int, int, java.lang.String):java.util.List");
    }

    public static boolean writeFileFromBytesByStream(File file, byte[] bArr, boolean z10, OnProgressUpdateListener onProgressUpdateListener) {
        if (bArr == null) {
            return false;
        }
        return writeFileFromIS(file, new ByteArrayInputStream(bArr), z10, onProgressUpdateListener);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:76|(6:11|(2:12|(1:14)(0))|24|65|28|79)(6:19|(2:20|(1:22)(0))|24|65|28|79)|71|24|65|28|79) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        r7.printStackTrace();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean writeFileFromIS(java.io.File r7, java.io.InputStream r8, boolean r9, com.blankj.utilcode.util.FileIOUtils.OnProgressUpdateListener r10) throws java.lang.Throwable {
        /*
            r0 = 0
            if (r8 == 0) goto L8c
            boolean r1 = com.blankj.utilcode.util.UtilsBridge.createOrExistsFile(r7)
            if (r1 != 0) goto Lb
            goto L8c
        Lb:
            r1 = 0
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r3.<init>(r7, r9)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            int r7 = com.blankj.utilcode.util.FileIOUtils.sBufferSize     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r2.<init>(r3, r7)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r7 = -1
            if (r10 != 0) goto L2f
            int r9 = com.blankj.utilcode.util.FileIOUtils.sBufferSize     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            byte[] r9 = new byte[r9]     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
        L1f:
            int r10 = r8.read(r9)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            if (r10 == r7) goto L4e
            r2.write(r9, r0, r10)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            goto L1f
        L29:
            r7 = move-exception
            r1 = r2
            goto L79
        L2c:
            r7 = move-exception
            r1 = r2
            goto L63
        L2f:
            int r9 = r8.available()     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            double r3 = (double) r9     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            r5 = 0
            r10.onProgressUpdate(r5)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            int r9 = com.blankj.utilcode.util.FileIOUtils.sBufferSize     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            byte[] r9 = new byte[r9]     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            r1 = r0
        L3e:
            int r5 = r8.read(r9)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            if (r5 == r7) goto L4e
            r2.write(r9, r0, r5)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            int r1 = r1 + r5
            double r5 = (double) r1     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            double r5 = r5 / r3
            r10.onProgressUpdate(r5)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            goto L3e
        L4e:
            r8.close()     // Catch: java.io.IOException -> L52
            goto L56
        L52:
            r7 = move-exception
            r7.printStackTrace()
        L56:
            r2.close()     // Catch: java.io.IOException -> L5a
            goto L5e
        L5a:
            r7 = move-exception
            r7.printStackTrace()
        L5e:
            r7 = 1
            return r7
        L60:
            r7 = move-exception
            goto L79
        L62:
            r7 = move-exception
        L63:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L60
            r8.close()     // Catch: java.io.IOException -> L6a
            goto L6e
        L6a:
            r7 = move-exception
            r7.printStackTrace()
        L6e:
            if (r1 == 0) goto L78
            r1.close()     // Catch: java.io.IOException -> L74
            goto L78
        L74:
            r7 = move-exception
            r7.printStackTrace()
        L78:
            return r0
        L79:
            r8.close()     // Catch: java.io.IOException -> L7d
            goto L81
        L7d:
            r8 = move-exception
            r8.printStackTrace()
        L81:
            if (r1 == 0) goto L8b
            r1.close()     // Catch: java.io.IOException -> L87
            goto L8b
        L87:
            r8 = move-exception
            r8.printStackTrace()
        L8b:
            throw r7
        L8c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "create file <"
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = "> failed."
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = "FileIOUtils"
            android.util.Log.e(r8, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.FileIOUtils.writeFileFromIS(java.io.File, java.io.InputStream, boolean, com.blankj.utilcode.util.FileIOUtils$OnProgressUpdateListener):boolean");
    }
}
