package com.zykj.sketch.utils;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.support.v4.media.AbstractC0037f;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import kotlin.text.AbstractC5862w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m5110d2 = {"Lcom/zykj/sketch/utils/FileUtils;", "", "()V", "Companion", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class FileUtils {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m5109d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0016\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u001cJ#\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010$\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u0004\u0018\u00010\u00042\u0006\u0010&\u001a\u00020!¢\u0006\u0004\b'\u0010(¨\u0006)"}, m5110d2 = {"Lcom/zykj/sketch/utils/FileUtils$Companion;", "", "<init>", "()V", "", "filePath", "fileName", "Landroid/graphics/Bitmap;", "resultBitmap", "", "isRecycle", "saveImage2SDCard", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Z)Ljava/lang/String;", "bitmap", "saveBitmap2SDCard", "(Landroid/graphics/Bitmap;Ljava/lang/String;)Ljava/lang/String;", "srcPath", "dstPath", "copyFolder", "(Ljava/lang/String;Ljava/lang/String;)Z", "Ljava/io/InputStream;", "inputStream", "copyAssets", "(Ljava/io/InputStream;Ljava/lang/String;)Z", "Landroid/content/res/AssetManager;", "assetManager", "path", "Ld6/s;", "(Landroid/content/res/AssetManager;Ljava/lang/String;Ljava/lang/String;)V", "", "audioFileList", "mergeAudioFile", "(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;", "Ljava/io/File;", "source", "dest", "copyFileUsingFileChannels", "(Ljava/io/File;Ljava/io/File;)V", "file", "Md5HashCode", "(Ljava/io/File;)Ljava/lang/String;", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        public static /* synthetic */ String saveImage2SDCard$default(Companion companion, String str, String str2, Bitmap bitmap, boolean z8, int i, Object obj) {
            if ((i & 8) != 0) {
                z8 = false;
            }
            return companion.saveImage2SDCard(str, str2, bitmap, z8);
        }

        @Nullable
        public final String Md5HashCode(@NotNull File file) {
            AbstractC5830k.m5330g(file, "file");
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                AbstractC5830k.m5329f(messageDigest, "getInstance(\"MD5\")");
                byte[] bArr = new byte[1024];
                FileInputStream fileInputStream = new FileInputStream(file);
                while (true) {
                    int i = fileInputStream.read(bArr, 0, 1024);
                    if (i == -1) {
                        fileInputStream.close();
                        byte[] bArrDigest = messageDigest.digest();
                        AbstractC5830k.m5329f(bArrDigest, "md.digest()");
                        return new BigInteger(1, bArrDigest).toString(16);
                    }
                    messageDigest.update(bArr, 0, i);
                }
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        }

        public final boolean copyAssets(@NotNull InputStream inputStream, @NotNull String dstPath) throws IOException {
            AbstractC5830k.m5330g(inputStream, "inputStream");
            AbstractC5830k.m5330g(dstPath, "dstPath");
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
        public final void copyFileUsingFileChannels(@org.jetbrains.annotations.NotNull java.io.File r9, @org.jetbrains.annotations.NotNull java.io.File r10) {
            /*
                r8 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.AbstractC5830k.m5330g(r9, r0)
                java.lang.String r0 = "dest"
                kotlin.jvm.internal.AbstractC5830k.m5330g(r10, r0)
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
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.utils.FileUtils.Companion.copyFileUsingFileChannels(java.io.File, java.io.File):void"); // DEX body: android/错题本/smali_classes3/com/zykj/sketch/utils/FileUtils$Companion.smali:490
        }

        public final boolean copyFolder(@NotNull String srcPath, @NotNull String dstPath) {
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
                    Companion companion = FileUtils.INSTANCE;
                    String absolutePath = file.getAbsolutePath();
                    AbstractC5830k.m5329f(absolutePath, "srcTempFile.absolutePath");
                    String absolutePath2 = file2.getAbsolutePath();
                    AbstractC5830k.m5329f(absolutePath2, "dstTempFile.absolutePath");
                    if (!companion.copyFolder(absolutePath, absolutePath2)) {
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

        /* JADX WARN: Removed duplicated region for block: B:21:0x0064 A[PHI: r2
          0x0064: PHI (r2v5 java.nio.channels.FileChannel) = (r2v4 java.nio.channels.FileChannel), (r2v6 java.nio.channels.FileChannel) binds: [B:27:0x0074, B:20:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:43:? A[SYNTHETIC] */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String mergeAudioFile(@org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r11) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.String r0 = "srcPath"
                kotlin.jvm.internal.AbstractC5830k.m5330g(r10, r0)
                java.lang.String r0 = "audioFileList"
                kotlin.jvm.internal.AbstractC5830k.m5330g(r11, r0)
                java.io.File r1 = new java.io.File
                r1.<init>(r10)
                r10 = 0
                java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6d
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6d
                java.nio.channels.FileChannel r2 = r0.getChannel()     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6d
                java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4d
                r0 = 0
            L1e:
                boolean r3 = r11.hasNext()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4d
                if (r3 == 0) goto L62
                java.lang.Object r3 = r11.next()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4d
                int r8 = r0 + 1
                if (r0 < 0) goto L5e
                java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4d
                java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4d
                r4.<init>(r3)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4d
                java.nio.channels.FileChannel r3 = r4.getChannel()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4d
                java.lang.String r4 = "FileInputStream(filePath).channel"
                kotlin.jvm.internal.AbstractC5830k.m5329f(r3, r4)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4d
                if (r0 == 0) goto L50
                long r4 = r2.size()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4d
                long r6 = r3.size()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4d
                r2.transferFrom(r3, r4, r6)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4d
                goto L59
            L4a:
                r0 = move-exception
                r10 = r0
                goto L81
            L4d:
                r0 = move-exception
                r10 = r0
                goto L71
            L50:
                long r6 = r3.size()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4d
                r4 = 0
                r2.transferFrom(r3, r4, r6)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4d
            L59:
                r3.close()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4d
                r0 = r8
                goto L1e
            L5e:
                kotlin.collections.AbstractC5806u.m5258L()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4d
                throw r10     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4d
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
                r10.printStackTrace()     // Catch: java.lang.Throwable -> L4a
                if (r2 == 0) goto L77
                goto L64
            L77:
                java.lang.String r10 = r1.getAbsolutePath()
                java.lang.String r11 = "newFile.absolutePath"
                kotlin.jvm.internal.AbstractC5830k.m5329f(r10, r11)
                return r10
            L81:
                if (r2 == 0) goto L86
                r2.close()
            L86:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.utils.FileUtils.Companion.mergeAudioFile(java.lang.String, java.util.List):java.lang.String"); // DEX body: android/错题本/smali_classes3/com/zykj/sketch/utils/FileUtils$Companion.smali:1333
        }

        @NotNull
        public final String saveBitmap2SDCard(@NotNull Bitmap bitmap, @NotNull String filePath) {
            AbstractC5830k.m5330g(bitmap, "bitmap");
            AbstractC5830k.m5330g(filePath, "filePath");
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
                AbstractC5830k.m5329f(absolutePath, "f.absolutePath");
                return absolutePath;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return "";
            } catch (IOException e4) {
                e4.printStackTrace();
                return "";
            }
        }

        @NotNull
        public final String saveImage2SDCard(@NotNull String filePath, @NotNull String fileName, @Nullable Bitmap resultBitmap, boolean isRecycle) throws IOException {
            AbstractC5830k.m5330g(filePath, "filePath");
            AbstractC5830k.m5330g(fileName, "fileName");
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
                AbstractC5830k.m5329f(absolutePath, "f.absolutePath");
                return absolutePath;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return "";
            } catch (IOException e4) {
                e4.printStackTrace();
                return "";
            }
        }

        private Companion() {
        }

        public final void copyAssets(@NotNull AssetManager assetManager, @NotNull String path, @NotNull String dstPath) throws IOException {
            String string;
            AbstractC5830k.m5330g(assetManager, "assetManager");
            AbstractC5830k.m5330g(path, "path");
            AbstractC5830k.m5330g(dstPath, "dstPath");
            String[] list = assetManager.list(path);
            if (list != null) {
                if (!(list.length == 0)) {
                    for (String str : list) {
                        Companion companion = FileUtils.INSTANCE;
                        StringBuilder sb = new StringBuilder();
                        if (AbstractC5855p.m5382P(path)) {
                            string = path;
                        } else {
                            StringBuilder sbM97v = AbstractC0037f.m97v(path);
                            sbM97v.append(File.separator);
                            string = sbM97v.toString();
                        }
                        companion.copyAssets(assetManager, AbstractC0037f.m91p(sb, string, str), AbstractC0037f.m91p(AbstractC0037f.m97v(dstPath), File.separator, str));
                    }
                    return;
                }
                Companion companion2 = FileUtils.INSTANCE;
                InputStream inputStreamOpen = assetManager.open(path);
                AbstractC5830k.m5329f(inputStreamOpen, "assetManager.open(path)");
                companion2.copyAssets(inputStreamOpen, dstPath);
            }
        }
    }
}
