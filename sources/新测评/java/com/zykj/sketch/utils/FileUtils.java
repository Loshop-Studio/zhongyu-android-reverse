package com.zykj.sketch.utils;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m13558d2 = {"Lcom/zykj/sketch/utils/FileUtils;", "", "()V", "Companion", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class FileUtils {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m13557d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J\u0016\u0010\u0007\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0004J\u0016\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006J\u0016\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J\u001c\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0017J\u0016\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0004J*\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001f\u001a\u00020\r¨\u0006 "}, m13558d2 = {"Lcom/zykj/sketch/utils/FileUtils$Companion;", "", "()V", "Md5HashCode", "", "file", "Ljava/io/File;", "copyAssets", "", "assetManager", "Landroid/content/res/AssetManager;", "path", "dstPath", "", "inputStream", "Ljava/io/InputStream;", "copyFileUsingFileChannels", "source", "dest", "copyFolder", "srcPath", "mergeAudioFile", "audioFileList", "", "saveBitmap2SDCard", "bitmap", "Landroid/graphics/Bitmap;", "filePath", "saveImage2SDCard", "fileName", "resultBitmap", "isRecycle", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String saveImage2SDCard$default(Companion companion, String str, String str2, Bitmap bitmap, boolean z9, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                z9 = false;
            }
            return companion.saveImage2SDCard(str, str2, bitmap, z9);
        }

        public final String Md5HashCode(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                Intrinsics.checkNotNullExpressionValue(messageDigest, "getInstance(\"MD5\")");
                byte[] bArr = new byte[1024];
                FileInputStream fileInputStream = new FileInputStream(file);
                while (true) {
                    int i10 = fileInputStream.read(bArr, 0, 1024);
                    if (i10 == -1) {
                        fileInputStream.close();
                        byte[] bArrDigest = messageDigest.digest();
                        Intrinsics.checkNotNullExpressionValue(bArrDigest, "md.digest()");
                        return new BigInteger(1, bArrDigest).toString(16);
                    }
                    messageDigest.update(bArr, 0, i10);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                return "";
            }
        }

        public final boolean copyAssets(InputStream inputStream, String dstPath) throws IOException {
            Intrinsics.checkNotNullParameter(inputStream, "inputStream");
            Intrinsics.checkNotNullParameter(dstPath, "dstPath");
            File file = new File(dstPath);
            file.getParentFile().mkdirs();
            file.delete();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[512];
            while (inputStream.read(bArr) != -1) {
                fileOutputStream.write(bArr);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            inputStream.close();
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:48:? A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void copyFileUsingFileChannels(java.io.File r9, java.io.File r10) {
            /*
                r8 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                java.lang.String r0 = "dest"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                boolean r0 = r10.exists()
                if (r0 == 0) goto L14
                r10.createNewFile()
                goto L1b
            L14:
                java.io.File r0 = r10.getParentFile()
                r0.mkdirs()
            L1b:
                r1 = 0
                java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L52
                r0.<init>(r9)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L52
                java.nio.channels.FileChannel r3 = r0.getChannel()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L52
                java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L4a
                r9.<init>(r10)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L4a
                java.nio.channels.FileChannel r2 = r9.getChannel()     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L4a
                long r6 = r3.size()     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L42
                r4 = 0
                r2.transferFrom(r3, r4, r6)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L42
                r3.close()
                r2.close()
                return
            L3e:
                r0 = move-exception
                r9 = r0
            L40:
                r1 = r3
                goto L65
            L42:
                r0 = move-exception
                r9 = r0
            L44:
                r1 = r3
                goto L55
            L46:
                r0 = move-exception
                r9 = r0
                r2 = r1
                goto L40
            L4a:
                r0 = move-exception
                r9 = r0
                r2 = r1
                goto L44
            L4e:
                r0 = move-exception
                r9 = r0
                r2 = r1
                goto L65
            L52:
                r0 = move-exception
                r9 = r0
                r2 = r1
            L55:
                r9.printStackTrace()     // Catch: java.lang.Throwable -> L63
                if (r1 == 0) goto L5d
                r1.close()
            L5d:
                if (r2 == 0) goto L62
                r2.close()
            L62:
                return
            L63:
                r0 = move-exception
                r9 = r0
            L65:
                if (r1 == 0) goto L6a
                r1.close()
            L6a:
                if (r2 == 0) goto L6f
                r2.close()
            L6f:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.utils.FileUtils.Companion.copyFileUsingFileChannels(java.io.File, java.io.File):void"); // DEX body: android/新测评/smali_classes5/com/zykj/sketch/utils/FileUtils$Companion.smali:462
        }

        public final boolean copyFolder(String srcPath, String dstPath) throws IOException {
            Intrinsics.checkNotNullParameter(srcPath, "srcPath");
            Intrinsics.checkNotNullParameter(dstPath, "dstPath");
            File file = new File(srcPath);
            if (!file.exists()) {
                return true;
            }
            File[] fileArrListFiles = file.listFiles();
            Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "srcFile.listFiles()");
            for (File file2 : fileArrListFiles) {
                String separator = File.separator;
                Intrinsics.checkNotNullExpressionValue(separator, "separator");
                File file3 = StringsKt.endsWith$default(srcPath, separator, false, 2, (Object) null) ? new File(srcPath + file2.getName()) : new File(srcPath + separator + file2.getName());
                Intrinsics.checkNotNullExpressionValue(separator, "separator");
                File file4 = StringsKt.endsWith$default(dstPath, separator, false, 2, (Object) null) ? new File(dstPath + file2.getName()) : new File(dstPath + separator + file2.getName());
                if (file3.isDirectory()) {
                    Companion companion = FileUtils.INSTANCE;
                    String absolutePath = file3.getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(absolutePath, "srcTempFile.absolutePath");
                    String absolutePath2 = file4.getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(absolutePath2, "dstTempFile.absolutePath");
                    if (!companion.copyFolder(absolutePath, absolutePath2)) {
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

        /* JADX WARN: Removed duplicated region for block: B:21:0x0064 A[PHI: r2
          0x0064: PHI (r2v4 java.nio.channels.FileChannel) = (r2v3 java.nio.channels.FileChannel), (r2v5 java.nio.channels.FileChannel) binds: [B:27:0x0074, B:20:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:39:? A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String mergeAudioFile(java.lang.String r10, java.util.List<java.lang.String> r11) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.String r0 = "srcPath"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                java.lang.String r0 = "audioFileList"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                java.io.File r1 = new java.io.File
                r1.<init>(r10)
                r10 = 0
                java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6d
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6d
                java.nio.channels.FileChannel r2 = r0.getChannel()     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6d
                java.util.Iterator r10 = r11.iterator()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
                r11 = 0
            L1e:
                boolean r0 = r10.hasNext()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
                if (r0 == 0) goto L62
                java.lang.Object r0 = r10.next()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
                int r8 = r11 + 1
                if (r11 >= 0) goto L36
                kotlin.collections.CollectionsKt.throwIndexOverflow()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
                goto L36
            L30:
                r0 = move-exception
                r10 = r0
                goto L81
            L33:
                r0 = move-exception
                r10 = r0
                goto L71
            L36:
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
                java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
                r3.<init>(r0)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
                java.nio.channels.FileChannel r3 = r3.getChannel()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
                java.lang.String r0 = "FileInputStream(filePath).channel"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
                if (r11 == 0) goto L54
                long r4 = r2.size()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
                long r6 = r3.size()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
                r2.transferFrom(r3, r4, r6)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
                goto L5d
            L54:
                long r6 = r3.size()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
                r4 = 0
                r2.transferFrom(r3, r4, r6)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            L5d:
                r3.close()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
                r11 = r8
                goto L1e
            L62:
                if (r2 == 0) goto L77
            L64:
                r2.close()
                goto L77
            L68:
                r0 = move-exception
                r11 = r0
                r2 = r10
                r10 = r11
                goto L81
            L6d:
                r0 = move-exception
                r11 = r0
                r2 = r10
                r10 = r11
            L71:
                r10.printStackTrace()     // Catch: java.lang.Throwable -> L30
                if (r2 == 0) goto L77
                goto L64
            L77:
                java.lang.String r10 = r1.getAbsolutePath()
                java.lang.String r11 = "newFile.absolutePath"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)
                return r10
            L81:
                if (r2 == 0) goto L86
                r2.close()
            L86:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.utils.FileUtils.Companion.mergeAudioFile(java.lang.String, java.util.List):java.lang.String"); // DEX body: android/新测评/smali_classes5/com/zykj/sketch/utils/FileUtils$Companion.smali:1336
        }

        public final String saveBitmap2SDCard(Bitmap bitmap, String filePath) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            Intrinsics.checkNotNullParameter(filePath, "filePath");
            try {
                new File(filePath).getParentFile().mkdirs();
                File file = new File(filePath);
                if (file.exists()) {
                    file.delete();
                } else {
                    file.createNewFile();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 70, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                String absolutePath = file.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "f.absolutePath");
                return absolutePath;
            } catch (FileNotFoundException e10) {
                e10.printStackTrace();
                return "";
            } catch (IOException e11) {
                e11.printStackTrace();
                return "";
            }
        }

        public final String saveImage2SDCard(String filePath, String fileName, Bitmap resultBitmap, boolean isRecycle) throws IOException {
            Intrinsics.checkNotNullParameter(filePath, "filePath");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            try {
                File file = new File(filePath);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(filePath, fileName);
                if (file2.exists()) {
                    file2.delete();
                } else {
                    file2.createNewFile();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                if (resultBitmap != null) {
                    resultBitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                }
                fileOutputStream.close();
                if (isRecycle && resultBitmap != null) {
                    resultBitmap.recycle();
                }
                String absolutePath = file2.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "f.absolutePath");
                return absolutePath;
            } catch (FileNotFoundException e10) {
                e10.printStackTrace();
                return "";
            } catch (IOException e11) {
                e11.printStackTrace();
                return "";
            }
        }

        private Companion() {
        }

        public final void copyAssets(AssetManager assetManager, String path, String dstPath) throws IOException {
            Intrinsics.checkNotNullParameter(assetManager, "assetManager");
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(dstPath, "dstPath");
            String[] list = assetManager.list(path);
            if (list != null) {
                if (!(list.length == 0)) {
                    for (String str : list) {
                        Companion companion = FileUtils.INSTANCE;
                        StringBuilder sb = new StringBuilder();
                        sb.append(StringsKt.isBlank(path) ? path : path + File.separator);
                        sb.append(str);
                        companion.copyAssets(assetManager, sb.toString(), dstPath + File.separator + str);
                    }
                    return;
                }
                Companion companion2 = FileUtils.INSTANCE;
                InputStream inputStreamOpen = assetManager.open(path);
                Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "assetManager.open(path)");
                companion2.copyAssets(inputStreamOpen, dstPath);
            }
        }
    }
}
