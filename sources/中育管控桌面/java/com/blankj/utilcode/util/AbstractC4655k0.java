package com.blankj.utilcode.util;

import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.blankj.utilcode.util.k0 */
/* loaded from: classes3.dex */
public abstract class AbstractC4655k0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.InputStream] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.File m2218a(android.net.Uri r7) throws java.lang.Throwable {
        /*
            r0 = 0
            android.app.Application r1 = com.blankj.utilcode.util.AbstractC4657l0.m2250a()     // Catch: java.lang.Throwable -> L45 java.io.FileNotFoundException -> L4a
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Throwable -> L45 java.io.FileNotFoundException -> L4a
            java.io.InputStream r7 = r1.openInputStream(r7)     // Catch: java.lang.Throwable -> L45 java.io.FileNotFoundException -> L4a
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L41 java.io.FileNotFoundException -> L43
            android.app.Application r2 = com.blankj.utilcode.util.AbstractC4657l0.m2250a()     // Catch: java.lang.Throwable -> L41 java.io.FileNotFoundException -> L43
            java.io.File r2 = r2.getCacheDir()     // Catch: java.lang.Throwable -> L41 java.io.FileNotFoundException -> L43
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41 java.io.FileNotFoundException -> L43
            r3.<init>()     // Catch: java.lang.Throwable -> L41 java.io.FileNotFoundException -> L43
            java.lang.String r4 = ""
            r3.append(r4)     // Catch: java.lang.Throwable -> L41 java.io.FileNotFoundException -> L43
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L41 java.io.FileNotFoundException -> L43
            r3.append(r4)     // Catch: java.lang.Throwable -> L41 java.io.FileNotFoundException -> L43
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L41 java.io.FileNotFoundException -> L43
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L41 java.io.FileNotFoundException -> L43
            java.lang.String r2 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L41 java.io.FileNotFoundException -> L43
            com.blankj.utilcode.util.AbstractC4663o0.m2314Q(r2, r7)     // Catch: java.lang.Throwable -> L41 java.io.FileNotFoundException -> L43
            if (r7 == 0) goto L40
            r7.close()     // Catch: java.io.IOException -> L3c
            return r1
        L3c:
            r7 = move-exception
            r7.printStackTrace()
        L40:
            return r1
        L41:
            r0 = move-exception
            goto L5a
        L43:
            r1 = move-exception
            goto L4c
        L45:
            r7 = move-exception
            r6 = r0
            r0 = r7
            r7 = r6
            goto L5a
        L4a:
            r1 = move-exception
            r7 = r0
        L4c:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L41
            if (r7 == 0) goto L59
            r7.close()     // Catch: java.io.IOException -> L55
            goto L59
        L55:
            r7 = move-exception
            r7.printStackTrace()
        L59:
            return r0
        L5a:
            if (r7 == 0) goto L64
            r7.close()     // Catch: java.io.IOException -> L60
            goto L64
        L60:
            r7 = move-exception
            r7.printStackTrace()
        L64:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.AbstractC4655k0.m2218a(android.net.Uri):java.io.File");
    }

    /* renamed from: b */
    public static File m2219b(Uri uri, String str) {
        return m2220c(uri, null, null, str);
    }

    /* renamed from: c */
    public static File m2220c(Uri uri, String str, String[] strArr, String str2) {
        if ("com.google.android.apps.photos.content".equals(uri.getAuthority())) {
            if (!TextUtils.isEmpty(uri.getLastPathSegment())) {
                return new File(uri.getLastPathSegment());
            }
        } else if ("com.tencent.mtt.fileprovider".equals(uri.getAuthority())) {
            String path = uri.getPath();
            if (!TextUtils.isEmpty(path)) {
                return new File(Environment.getExternalStorageDirectory(), path.substring(10, path.length()));
            }
        } else if ("com.huawei.hidisk.fileprovider".equals(uri.getAuthority())) {
            String path2 = uri.getPath();
            if (!TextUtils.isEmpty(path2)) {
                return new File(path2.replace("/root", ""));
            }
        }
        Cursor cursorQuery = AbstractC4657l0.m2250a().getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
        try {
            if (cursorQuery == null) {
                uri.toString();
                return null;
            }
            try {
                if (!cursorQuery.moveToFirst()) {
                    uri.toString();
                    cursorQuery.close();
                    return null;
                }
                int columnIndex = cursorQuery.getColumnIndex("_data");
                if (columnIndex > -1) {
                    File file = new File(cursorQuery.getString(columnIndex));
                    cursorQuery.close();
                    return file;
                }
                uri.toString();
                cursorQuery.close();
                return null;
            } catch (Exception unused) {
                uri.toString();
                cursorQuery.close();
                return null;
            }
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    /* renamed from: d */
    public static File m2221d(Uri uri) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException {
        if (uri == null) {
            return null;
        }
        File fileM2222e = m2222e(uri);
        return fileM2222e != null ? fileM2222e : m2218a(uri);
    }

    /* renamed from: e */
    public static File m2222e(Uri uri) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException {
        Uri uri2;
        File fileM2219b;
        String str;
        File file;
        uri.toString();
        String authority = uri.getAuthority();
        String scheme = uri.getScheme();
        String path = uri.getPath();
        int i6 = 0;
        if (path != null) {
            String[] strArr = {"/external/", "/external_path/"};
            for (int i7 = 0; i7 < 2; i7++) {
                String str2 = strArr[i7];
                if (path.startsWith(str2)) {
                    File file2 = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + path.replace(str2, "/"));
                    if (file2.exists()) {
                        uri.toString();
                        return file2;
                    }
                }
            }
            if (path.startsWith("/files_path/")) {
                file = new File(AbstractC4657l0.m2250a().getFilesDir().getAbsolutePath() + path.replace("/files_path/", "/"));
            } else if (path.startsWith("/cache_path/")) {
                file = new File(AbstractC4657l0.m2250a().getCacheDir().getAbsolutePath() + path.replace("/cache_path/", "/"));
            } else if (path.startsWith("/external_files_path/")) {
                file = new File(AbstractC4657l0.m2250a().getExternalFilesDir(null).getAbsolutePath() + path.replace("/external_files_path/", "/"));
            } else if (path.startsWith("/external_cache_path/")) {
                file = new File(AbstractC4657l0.m2250a().getExternalCacheDir().getAbsolutePath() + path.replace("/external_cache_path/", "/"));
            } else {
                file = null;
            }
            if (file != null && file.exists()) {
                uri.toString();
                return file;
            }
        }
        if ("file".equals(scheme)) {
            if (path != null) {
                return new File(path);
            }
            uri.toString();
            return null;
        }
        if (!DocumentsContract.isDocumentUri(AbstractC4657l0.m2250a(), uri)) {
            if ("content".equals(scheme)) {
                return m2219b(uri, ExifInterface.GPS_MEASUREMENT_2D);
            }
            uri.toString();
            return null;
        }
        boolean z6 = true;
        if (!"com.android.externalstorage.documents".equals(authority)) {
            if (!"com.android.providers.downloads.documents".equals(authority)) {
                if (!"com.android.providers.media.documents".equals(authority)) {
                    if ("content".equals(scheme)) {
                        return m2219b(uri, "1_3");
                    }
                    uri.toString();
                    return null;
                }
                String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(":");
                String str3 = strArrSplit[0];
                if ("image".equals(str3)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(str3)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else {
                    if (!"audio".equals(str3)) {
                        uri.toString();
                        return null;
                    }
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return m2220c(uri2, "_id=?", new String[]{strArrSplit[1]}, "1_2");
            }
            String documentId = DocumentsContract.getDocumentId(uri);
            if (TextUtils.isEmpty(documentId)) {
                uri.toString();
                return null;
            }
            if (documentId.startsWith("raw:")) {
                return new File(documentId.substring(4));
            }
            if (documentId.startsWith("msf:")) {
                documentId = documentId.split(":")[1];
            }
            try {
                long j6 = Long.parseLong(documentId);
                String[] strArr2 = {"content://downloads/public_downloads", "content://downloads/all_downloads", "content://downloads/my_downloads"};
                while (i6 < 3) {
                    try {
                        fileM2219b = m2219b(ContentUris.withAppendedId(Uri.parse(strArr2[i6]), j6), "1_1");
                    } catch (Exception unused) {
                    }
                    if (fileM2219b != null) {
                        return fileM2219b;
                    }
                    i6++;
                }
                uri.toString();
            } catch (Exception unused2) {
            }
            return null;
        }
        String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(":");
        String str4 = strArrSplit2[0];
        if ("primary".equalsIgnoreCase(str4)) {
            return new File(Environment.getExternalStorageDirectory() + "/" + strArrSplit2[1]);
        }
        StorageManager storageManager = (StorageManager) AbstractC4657l0.m2250a().getSystemService("storage");
        try {
            Class<?> cls = Class.forName("android.os.storage.StorageVolume");
            Method method = storageManager.getClass().getMethod("getVolumeList", null);
            Method method2 = cls.getMethod("getUuid", null);
            Method method3 = cls.getMethod("getState", null);
            Method method4 = cls.getMethod("getPath", null);
            Method method5 = cls.getMethod("isPrimary", null);
            Method method6 = cls.getMethod("isEmulated", null);
            Object objInvoke = method.invoke(storageManager, null);
            int length = Array.getLength(objInvoke);
            while (i6 < length) {
                Object obj = Array.get(objInvoke, i6);
                boolean z7 = z6;
                if ("mounted".equals(method3.invoke(obj, null)) || "mounted_ro".equals(method3.invoke(obj, null))) {
                    if ((!((Boolean) method5.invoke(obj, null)).booleanValue() || !((Boolean) method6.invoke(obj, null)).booleanValue()) && (str = (String) method2.invoke(obj, null)) != null && str.equals(str4)) {
                        return new File(method4.invoke(obj, null) + "/" + strArrSplit2[z7 ? 1 : 0]);
                    }
                }
                i6++;
                z6 = z7 ? 1 : 0;
            }
        } catch (Exception e6) {
            uri.toString();
            e6.toString();
        }
        uri.toString();
        return null;
    }
}
