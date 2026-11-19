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
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8661c0;
import p113g8.AbstractC8687z;

/* loaded from: classes3.dex */
public final class FileUtils {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public static /* synthetic */ String saveImage2SDCard$default(Companion companion, String str, String str2, Bitmap bitmap, boolean z10, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                z10 = false;
            }
            return companion.saveImage2SDCard(str, str2, bitmap, z10);
        }

        public final String Md5HashCode(File file) throws NoSuchAlgorithmException, IOException {
            AbstractC9133u.m16133g(file, "file");
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                AbstractC9133u.m16132f(messageDigest, "getInstance(\"MD5\")");
                byte[] bArr = new byte[1024];
                FileInputStream fileInputStream = new FileInputStream(file);
                while (true) {
                    int i10 = fileInputStream.read(bArr, 0, 1024);
                    if (i10 == -1) {
                        fileInputStream.close();
                        byte[] bArrDigest = messageDigest.digest();
                        AbstractC9133u.m16132f(bArrDigest, "md.digest()");
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
            AbstractC9133u.m16133g(inputStream, "inputStream");
            AbstractC9133u.m16133g(dstPath, "dstPath");
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
        public final void copyFileUsingFileChannels(java.io.File r9, java.io.File r10) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.AbstractC9133u.m16133g(r9, r0)
                java.lang.String r0 = "dest"
                kotlin.jvm.internal.AbstractC9133u.m16133g(r10, r0)
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
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.utils.FileUtils.Companion.copyFileUsingFileChannels(java.io.File, java.io.File):void"); // DEX body: android/优课畅学/smali_classes3/com/zykj/sketch/utils/FileUtils$Companion.smali:414
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
                    Companion companion = FileUtils.Companion;
                    String absolutePath = file3.getAbsolutePath();
                    AbstractC9133u.m16132f(absolutePath, "srcTempFile.absolutePath");
                    String absolutePath2 = file4.getAbsolutePath();
                    AbstractC9133u.m16132f(absolutePath2, "dstTempFile.absolutePath");
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
                kotlin.jvm.internal.AbstractC9133u.m16133g(r10, r0)
                java.lang.String r0 = "audioFileList"
                kotlin.jvm.internal.AbstractC9133u.m16133g(r11, r0)
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
                p134i7.AbstractC8809v.m14780w()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
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
                kotlin.jvm.internal.AbstractC9133u.m16132f(r3, r0)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
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
                kotlin.jvm.internal.AbstractC9133u.m16132f(r10, r11)
                return r10
            L81:
                if (r2 == 0) goto L86
                r2.close()
            L86:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.sketch.utils.FileUtils.Companion.mergeAudioFile(java.lang.String, java.util.List):java.lang.String"); // DEX body: android/优课畅学/smali_classes3/com/zykj/sketch/utils/FileUtils$Companion.smali:1288
        }

        public final String saveBitmap2SDCard(Bitmap bitmap, String filePath) throws IOException {
            AbstractC9133u.m16133g(bitmap, "bitmap");
            AbstractC9133u.m16133g(filePath, "filePath");
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
                AbstractC9133u.m16132f(absolutePath, "f.absolutePath");
                return absolutePath;
            } catch (FileNotFoundException e10) {
                e10.printStackTrace();
                return "";
            } catch (IOException e11) {
                e11.printStackTrace();
                return "";
            }
        }

        public final String saveImage2SDCard(String filePath, String fileName, Bitmap bitmap, boolean z10) throws IOException {
            AbstractC9133u.m16133g(filePath, "filePath");
            AbstractC9133u.m16133g(fileName, "fileName");
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
                if (bitmap != null) {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                }
                fileOutputStream.close();
                if (z10 && bitmap != null) {
                    bitmap.recycle();
                }
                String absolutePath = file2.getAbsolutePath();
                AbstractC9133u.m16132f(absolutePath, "f.absolutePath");
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
            AbstractC9133u.m16133g(assetManager, "assetManager");
            AbstractC9133u.m16133g(path, "path");
            AbstractC9133u.m16133g(dstPath, "dstPath");
            String[] list = assetManager.list(path);
            if (list != null) {
                if (!(list.length == 0)) {
                    for (String str : list) {
                        Companion companion = FileUtils.Companion;
                        StringBuilder sb = new StringBuilder();
                        sb.append(AbstractC8661c0.m13993h0(path) ? path : path + File.separator);
                        sb.append(str);
                        companion.copyAssets(assetManager, sb.toString(), dstPath + File.separator + str);
                    }
                    return;
                }
                Companion companion2 = FileUtils.Companion;
                InputStream inputStreamOpen = assetManager.open(path);
                AbstractC9133u.m16132f(inputStreamOpen, "assetManager.open(path)");
                companion2.copyAssets(inputStreamOpen, dstPath);
            }
        }
    }
}
