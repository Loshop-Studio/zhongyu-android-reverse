package com.zykj.blackboard.utils;

// RE note 本类字节码直接引用的读写或显示接口包括文件流、位图。

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8687z;

/* loaded from: classes4.dex */
public final class FileUtils {
    public static final FileUtils INSTANCE = new FileUtils();

    private FileUtils() {
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void copyFileUsingFileChannels(java.io.File r9, java.io.File r10) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.AbstractC9133u.m16133g(r9, r0)
            java.lang.String r0 = "dest"
            kotlin.jvm.internal.AbstractC9133u.m16133g(r10, r0)
            boolean r0 = r10.exists()
            if (r0 == 0) goto L14
            r10.delete()
            goto L1b
        L14:
            java.io.File r0 = r10.getParentFile()
            r0.mkdirs()
        L1b:
            r10.createNewFile()
            r1 = 0
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L55
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L55
            java.nio.channels.FileChannel r3 = r0.getChannel()     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L55
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4d
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4d
            java.nio.channels.FileChannel r2 = r9.getChannel()     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4d
            long r6 = r3.size()     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            r4 = 0
            r2.transferFrom(r3, r4, r6)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            r3.close()
            r2.close()
            return
        L41:
            r0 = move-exception
            r9 = r0
        L43:
            r1 = r3
            goto L68
        L45:
            r0 = move-exception
            r9 = r0
        L47:
            r1 = r3
            goto L58
        L49:
            r0 = move-exception
            r9 = r0
            r2 = r1
            goto L43
        L4d:
            r0 = move-exception
            r9 = r0
            r2 = r1
            goto L47
        L51:
            r0 = move-exception
            r9 = r0
            r2 = r1
            goto L68
        L55:
            r0 = move-exception
            r9 = r0
            r2 = r1
        L58:
            r9.printStackTrace()     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L60
            r1.close()
        L60:
            if (r2 == 0) goto L65
            r2.close()
        L65:
            return
        L66:
            r0 = move-exception
            r9 = r0
        L68:
            if (r1 == 0) goto L6d
            r1.close()
        L6d:
            if (r2 == 0) goto L72
            r2.close()
        L72:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.utils.FileUtils.copyFileUsingFileChannels(java.io.File, java.io.File):void"); // DEX body: android/优课畅学/smali_classes4/com/zykj/blackboard/utils/FileUtils.smali:38
    }

    public final boolean copyFolder(String srcPath, String dstPath) throws IOException {
        AbstractC9133u.m16133g(srcPath, "srcPath");
        AbstractC9133u.m16133g(dstPath, "dstPath");
        File file = new File(srcPath);
        if (!file.exists()) {
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        AbstractC9133u.m16132f(fileArrListFiles, "srcFile.listFiles()");
        for (File file2 : fileArrListFiles) {
            String separator = File.separator;
            AbstractC9133u.m16132f(separator, "separator");
            File file3 = AbstractC8687z.m14111z(srcPath, separator, false, 2, null) ? new File(srcPath + file2.getName()) : new File(srcPath + separator + file2.getName());
            AbstractC9133u.m16132f(separator, "separator");
            File file4 = AbstractC8687z.m14111z(dstPath, separator, false, 2, null) ? new File(dstPath + file2.getName()) : new File(dstPath + separator + file2.getName());
            if (file3.isDirectory()) {
                FileUtils fileUtils = INSTANCE;
                String absolutePath = file3.getAbsolutePath();
                AbstractC9133u.m16132f(absolutePath, "srcTempFile.absolutePath");
                String absolutePath2 = file4.getAbsolutePath();
                AbstractC9133u.m16132f(absolutePath2, "dstTempFile.absolutePath");
                if (!fileUtils.copyFolder(absolutePath, absolutePath2)) {
                    return false;
                }
            } else if (file3.exists() && file3.isFile() && file3.canRead()) {
                file4.getParentFile().mkdirs();
                file4.createNewFile();
                FileChannel channel = new FileInputStream(file3).getChannel();
                FileChannel channel2 = new FileOutputStream(file4).getChannel();
                if (channel2 != null) {
                    try {
                        try {
                            channel2.transferFrom(channel, 0L, channel.size());
                            channel.close();
                            channel2.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                            if (channel != null) {
                                channel.close();
                            }
                            channel2.close();
                            return false;
                        }
                    } catch (Throwable th) {
                        if (channel != null) {
                            channel.close();
                        }
                        channel2.close();
                        throw th;
                    }
                } else {
                    continue;
                }
            }
        }
        return true;
    }

    public final boolean delete(String path) {
        AbstractC9133u.m16133g(path, "path");
        File file = new File(path);
        if (!file.exists()) {
            return false;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] files = file.listFiles();
        AbstractC9133u.m16132f(files, "files");
        for (File file2 : files) {
            if (!file2.isFile()) {
                String absolutePath = file2.getAbsolutePath();
                AbstractC9133u.m16132f(absolutePath, "f.absolutePath");
                if (!delete(absolutePath)) {
                    return false;
                }
            } else if (!file2.delete()) {
                System.out.println((Object) (file2.getAbsolutePath() + " onDelete error!"));
                return false;
            }
        }
        return file.delete();
    }

    public final String saveBitmap2SDCard(Bitmap bitmap, String filePath, boolean z10) throws IOException {
        AbstractC9133u.m16133g(bitmap, "bitmap");
        AbstractC9133u.m16133g(filePath, "filePath");
        File file = new File(filePath);
        try {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            if (AbstractC8687z.m14111z(filePath, "png", false, 2, null)) {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            } else {
                bitmap.compress(Bitmap.CompressFormat.WEBP, 100, fileOutputStream);
            }
            fileOutputStream.close();
            if (z10) {
                bitmap.recycle();
            }
            return filePath;
        } catch (Exception e10) {
            e10.printStackTrace();
            if (!file.exists()) {
                return "";
            }
            file.delete();
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0073 A[Catch: IOException -> 0x006f, TRY_LEAVE, TryCatch #4 {IOException -> 0x006f, blocks: (B:35:0x006b, B:39:0x0073), top: B:47:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.File saveToFile(java.lang.String r5, java.lang.String r6, com.google.protobuf.MessageLite r7) throws java.lang.Throwable {
        /*
            r4 = this;
            java.lang.String r0 = "filePath"
            kotlin.jvm.internal.AbstractC9133u.m16133g(r5, r0)
            java.lang.String r0 = "fileName"
            kotlin.jvm.internal.AbstractC9133u.m16133g(r6, r0)
            java.lang.String r0 = "data"
            kotlin.jvm.internal.AbstractC9133u.m16133g(r7, r0)
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r1.<init>(r2, r6)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            boolean r5 = r1.exists()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            if (r5 != 0) goto L30
            java.io.File r5 = r1.getParentFile()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r5.mkdirs()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r1.createNewFile()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            goto L36
        L2b:
            r5 = move-exception
            goto L69
        L2d:
            r5 = move-exception
            r6 = r0
            goto L52
        L30:
            r1.delete()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r1.createNewFile()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
        L36:
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r7.writeTo(r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            r5.flush()     // Catch: java.io.IOException -> L45
            r5.close()     // Catch: java.io.IOException -> L45
            return r1
        L45:
            r5 = move-exception
            r5.printStackTrace()
            return r1
        L4a:
            r6 = move-exception
            r0 = r5
            r5 = r6
            goto L69
        L4e:
            r6 = move-exception
            r3 = r6
            r6 = r5
            r5 = r3
        L52:
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L67
            if (r6 == 0) goto L5d
            r6.flush()     // Catch: java.io.IOException -> L5b
            goto L5d
        L5b:
            r5 = move-exception
            goto L63
        L5d:
            if (r6 == 0) goto L66
            r6.close()     // Catch: java.io.IOException -> L5b
            goto L66
        L63:
            r5.printStackTrace()
        L66:
            return r0
        L67:
            r5 = move-exception
            r0 = r6
        L69:
            if (r0 == 0) goto L71
            r0.flush()     // Catch: java.io.IOException -> L6f
            goto L71
        L6f:
            r6 = move-exception
            goto L77
        L71:
            if (r0 == 0) goto L7a
            r0.close()     // Catch: java.io.IOException -> L6f
            goto L7a
        L77:
            r6.printStackTrace()
        L7a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.utils.FileUtils.saveToFile(java.lang.String, java.lang.String, com.google.protobuf.MessageLite):java.io.File"); // DEX body: android/优课畅学/smali_classes4/com/zykj/blackboard/utils/FileUtils.smali:1355
    }
}
