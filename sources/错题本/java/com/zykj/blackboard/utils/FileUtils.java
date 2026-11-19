package com.zykj.blackboard.utils;

// RE note 本类字节码直接引用的读写或显示接口包括文件流、位图。

import android.graphics.Bitmap;
import android.support.v4.media.AbstractC0037f;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5862w;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m5110d2 = {"Lcom/zykj/blackboard/utils/FileUtils;", "", "<init>", "()V", "Landroid/graphics/Bitmap;", "bitmap", "", "filePath", "", "isRecycle", "saveBitmap2SDCard", "(Landroid/graphics/Bitmap;Ljava/lang/String;Z)Ljava/lang/String;", "fileName", "Lcom/google/protobuf/MessageLite;", "data", "Ljava/io/File;", "saveToFile", "(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;", "srcPath", "dstPath", "copyFolder", "(Ljava/lang/String;Ljava/lang/String;)Z", "source", "dest", "Ld6/s;", "copyFileUsingFileChannels", "(Ljava/io/File;Ljava/io/File;)V", "path", RequestParameters.SUBRESOURCE_DELETE, "(Ljava/lang/String;)Z", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class FileUtils {

    @NotNull
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
    public final void copyFileUsingFileChannels(@org.jetbrains.annotations.NotNull java.io.File r9, @org.jetbrains.annotations.NotNull java.io.File r10) {
        /*
            r8 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r9, r0)
            java.lang.String r0 = "dest"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r10, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.utils.FileUtils.copyFileUsingFileChannels(java.io.File, java.io.File):void"); // DEX body: android/错题本/smali_classes3/com/zykj/blackboard/utils/FileUtils.smali:89
    }

    public final boolean copyFolder(@NotNull String srcPath, @NotNull String dstPath) throws IOException {
        File file;
        File file2;
        AbstractC5830k.m5330g(srcPath, "srcPath");
        AbstractC5830k.m5330g(dstPath, "dstPath");
        File file3 = new File(srcPath);
        if (!file3.exists()) {
            return true;
        }
        File[] fileArrListFiles = file3.listFiles();
        AbstractC5830k.m5329f(fileArrListFiles, "srcFile.listFiles()");
        for (File file4 : fileArrListFiles) {
            String separator = File.separator;
            AbstractC5830k.m5329f(separator, "separator");
            if (AbstractC5862w.m5414u(srcPath, separator, false)) {
                StringBuilder sbM97v = AbstractC0037f.m97v(srcPath);
                sbM97v.append(file4.getName());
                file = new File(sbM97v.toString());
            } else {
                StringBuilder sbM98w = AbstractC0037f.m98w(srcPath, separator);
                sbM98w.append(file4.getName());
                file = new File(sbM98w.toString());
            }
            if (AbstractC5862w.m5414u(dstPath, separator, false)) {
                StringBuilder sbM97v2 = AbstractC0037f.m97v(dstPath);
                sbM97v2.append(file4.getName());
                file2 = new File(sbM97v2.toString());
            } else {
                StringBuilder sbM98w2 = AbstractC0037f.m98w(dstPath, separator);
                sbM98w2.append(file4.getName());
                file2 = new File(sbM98w2.toString());
            }
            if (file.isDirectory()) {
                FileUtils fileUtils = INSTANCE;
                String absolutePath = file.getAbsolutePath();
                AbstractC5830k.m5329f(absolutePath, "srcTempFile.absolutePath");
                String absolutePath2 = file2.getAbsolutePath();
                AbstractC5830k.m5329f(absolutePath2, "dstTempFile.absolutePath");
                if (!fileUtils.copyFolder(absolutePath, absolutePath2)) {
                    return false;
                }
            } else if (file.exists() && file.isFile() && file.canRead()) {
                file2.getParentFile().mkdirs();
                file2.createNewFile();
                FileChannel channel = new FileInputStream(file).getChannel();
                FileChannel channel2 = new FileOutputStream(file2).getChannel();
                if (channel2 != null) {
                    try {
                        try {
                            channel2.transferFrom(channel, 0L, channel.size());
                            channel.close();
                            channel2.close();
                        } catch (IOException e) {
                            e.printStackTrace();
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

    public final boolean delete(@NotNull String path) {
        AbstractC5830k.m5330g(path, "path");
        File file = new File(path);
        if (!file.exists()) {
            return false;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] files = file.listFiles();
        AbstractC5830k.m5329f(files, "files");
        for (File file2 : files) {
            if (!file2.isFile()) {
                String absolutePath = file2.getAbsolutePath();
                AbstractC5830k.m5329f(absolutePath, "f.absolutePath");
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

    @NotNull
    public final String saveBitmap2SDCard(@NotNull Bitmap bitmap, @NotNull String filePath, boolean isRecycle) throws IOException {
        AbstractC5830k.m5330g(bitmap, "bitmap");
        AbstractC5830k.m5330g(filePath, "filePath");
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
            if (AbstractC5862w.m5414u(filePath, "png", false)) {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            } else {
                bitmap.compress(Bitmap.CompressFormat.WEBP, 100, fileOutputStream);
            }
            fileOutputStream.close();
            if (isRecycle) {
                bitmap.recycle();
            }
            return filePath;
        } catch (Exception e) {
            e.printStackTrace();
            if (!file.exists()) {
                return "";
            }
            file.delete();
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0073 A[Catch: IOException -> 0x006f, TRY_LEAVE, TryCatch #4 {IOException -> 0x006f, blocks: (B:35:0x006b, B:39:0x0073), top: B:47:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.File saveToFile(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull com.google.protobuf.MessageLite r7) throws java.lang.Throwable {
        /*
            r4 = this;
            java.lang.String r0 = "filePath"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r5, r0)
            java.lang.String r0 = "fileName"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r6, r0)
            java.lang.String r0 = "data"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r7, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.utils.FileUtils.saveToFile(java.lang.String, java.lang.String, com.google.protobuf.MessageLite):java.io.File"); // DEX body: android/错题本/smali_classes3/com/zykj/blackboard/utils/FileUtils.smali:1383
    }
}
