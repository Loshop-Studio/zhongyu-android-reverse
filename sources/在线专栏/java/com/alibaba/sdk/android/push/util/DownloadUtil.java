package com.alibaba.sdk.android.push.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.alibaba.sdk.android.ams.common.logger.AmsLogger;
import com.alibaba.sdk.android.push.p028a.C1154b;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class DownloadUtil {

    public interface OnLargeIconDownloadListener {
        void onDownloadBigPictureFailed(String str);

        void onDownloadLargeIconFailed(String str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.File] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void download(java.lang.String r8, java.io.File r9, java.lang.String r10, java.lang.String r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.push.util.DownloadUtil.download(java.lang.String, java.io.File, java.lang.String, java.lang.String):void");
    }

    public static Bitmap downloadImage(Context context, String str, String str2) {
        File file;
        File file2 = new File(context.getCacheDir(), "aliyun_push_images");
        String fileName = getFileName(str);
        if (new File(file2, fileName).exists()) {
            file = new File(file2, fileName);
        } else {
            try {
                download(str, file2, fileName, str2);
                file = new File(file2, fileName);
            } catch (Exception unused) {
                return null;
            }
        }
        return BitmapFactory.decodeFile(file.getAbsolutePath());
    }

    public static String getFileName(String str) {
        String strSubstring = str.substring(str.lastIndexOf("/") + 1);
        return strSubstring.contains("?") ? strSubstring.substring(0, strSubstring.indexOf("?")) : strSubstring;
    }

    public static StringBuilder readStringFrom(BufferedReader bufferedReader) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return sb;
            }
            sb.append(line);
        }
    }

    private static void writeToFile(InputStream inputStream, File file, String str) {
        FileOutputStream fileOutputStream;
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[10240];
                fileOutputStream = new FileOutputStream(file);
                while (true) {
                    try {
                        int i4 = bufferedInputStream2.read(bArr);
                        if (i4 != -1) {
                            fileOutputStream.write(bArr, 0, i4);
                        } else {
                            try {
                                break;
                            } catch (Throwable unused) {
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream = bufferedInputStream2;
                        try {
                            OnLargeIconDownloadListener onLargeIconDownloadListenerM5151b = C1154b.m5144a().m5151b();
                            if ("image".equals(str)) {
                                if (onLargeIconDownloadListenerM5151b != null) {
                                    onLargeIconDownloadListenerM5151b.onDownloadLargeIconFailed(th.getMessage());
                                }
                            } else if (onLargeIconDownloadListenerM5151b != null) {
                                onLargeIconDownloadListenerM5151b.onDownloadBigPictureFailed(th.getMessage());
                            }
                            AmsLogger.getLogger("MPS:Download").m5016d("writeToFile failed: " + str + ", error: " + Log.getStackTraceString(th));
                            throw th;
                        } finally {
                        }
                    }
                }
                bufferedInputStream2.close();
                try {
                    fileOutputStream.close();
                } catch (Throwable unused2) {
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }
}
