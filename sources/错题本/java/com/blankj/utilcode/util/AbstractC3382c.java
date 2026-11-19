package com.blankj.utilcode.util;

import android.app.Application;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.ContentUris;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.storage.StorageManager;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.support.v4.media.AbstractC0037f;
import android.support.v4.media.C0039h;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.FileProvider;
import androidx.exifinterface.media.ExifInterface;
import com.google.gson.C3836b;
import com.google.gson.C3841g;
import com.google.gson.C3842h;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.blankj.utilcode.util.c */
/* loaded from: classes2.dex */
public abstract class AbstractC3382c {

    /* renamed from: a */
    public static final char[] f2130a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b */
    public static final String[] f2131b = {"huawei"};

    /* renamed from: c */
    public static final String[] f2132c = {"vivo"};

    /* renamed from: d */
    public static final String[] f2133d = {"xiaomi"};

    /* renamed from: e */
    public static final String[] f2134e = {"oppo"};

    /* renamed from: f */
    public static final String[] f2135f = {"leeco", "letv"};

    /* renamed from: g */
    public static final String[] f2136g = {"360", "qiku"};

    /* renamed from: h */
    public static final String[] f2137h = {"zte"};

    /* renamed from: i */
    public static final String[] f2138i = {"oneplus"};

    /* renamed from: j */
    public static final String[] f2139j = {"nubia"};

    /* renamed from: k */
    public static final String[] f2140k = {"coolpad", "yulong"};

    /* renamed from: l */
    public static final String[] f2141l = {"lg", "lge"};

    /* renamed from: m */
    public static final String[] f2142m = {"google"};

    /* renamed from: n */
    public static final String[] f2143n = {"samsung"};

    /* renamed from: o */
    public static final String[] f2144o = {"meizu"};

    /* renamed from: p */
    public static final String[] f2145p = {"lenovo"};

    /* renamed from: q */
    public static final String[] f2146q = {"smartisan", "deltainno"};

    /* renamed from: r */
    public static final String[] f2147r = {"htc"};

    /* renamed from: s */
    public static final String[] f2148s = {"sony"};

    /* renamed from: t */
    public static final String[] f2149t = {"gionee", "amigo"};

    /* renamed from: u */
    public static final String[] f2150u = {"motorola"};

    /* renamed from: v */
    public static C0039h f2151v = null;

    /* renamed from: w */
    public static ArrayList f2152w;

    /* renamed from: x */
    public static Application f2153x;

    /* renamed from: a */
    public static String m2300a(Bundle bundle) {
        Iterator<String> it = bundle.keySet().iterator();
        if (!it.hasNext()) {
            return "Bundle {}";
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("Bundle { ");
        while (true) {
            String next = it.next();
            Object obj = bundle.get(next);
            sb.append(next);
            sb.append('=');
            if (obj instanceof Bundle) {
                sb.append(obj == bundle ? "(this Bundle)" : m2300a((Bundle) obj));
            } else {
                sb.append(AbstractC3387g.m2340c(obj));
            }
            if (!it.hasNext()) {
                sb.append(" }");
                return sb.toString();
            }
            sb.append(", ");
        }
    }

    /* renamed from: b */
    public static String m2301b(String str) throws NoSuchAlgorithmException {
        if (str == null || str.length() == 0) {
            return "";
        }
        byte[] bytes = str.getBytes();
        byte[] bArrDigest = null;
        if (bytes != null && bytes.length > 0) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(bytes);
                bArrDigest = messageDigest.digest();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
        return AbstractC3383c0.m2322a(bArrDigest);
    }

    /* renamed from: c */
    public static Uri m2302c(File file) {
        if (!AbstractC3383c0.m2326e(file)) {
            return null;
        }
        return FileProvider.getUriForFile(m2303d(), m2303d().getPackageName() + ".utilcode.fileprovider", file);
    }

    /* renamed from: d */
    public static Application m2303d() throws ClassNotFoundException {
        Object objInvoke;
        Application application = f2153x;
        if (application != null) {
            return application;
        }
        C3381b0.f2122g.getClass();
        Application application2 = null;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objM2294c = C3381b0.m2294c();
            if (objM2294c != null && (objInvoke = cls.getMethod("getApplication", null).invoke(objM2294c, null)) != null) {
                application2 = (Application) objInvoke;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        m2308i(application2);
        if (f2153x == null) {
            throw new NullPointerException("reflect failed.");
        }
        Log.i("Utils", AbstractC3383c0.m2325d() + " reflect app success.");
        return f2153x;
    }

    /* renamed from: e */
    public static int m2304e() throws PackageManager.NameNotFoundException {
        String packageName = m2303d().getPackageName();
        if (!AbstractC3383c0.m2327f(packageName)) {
            try {
                PackageInfo packageInfo = m2303d().getPackageManager().getPackageInfo(packageName, 0);
                if (packageInfo != null) {
                    return packageInfo.versionCode;
                }
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                return -1;
            }
        }
        return -1;
    }

    /* renamed from: f */
    public static File m2305f(Uri uri, String str, String[] strArr, String str2) {
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
        Cursor cursorQuery = m2303d().getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
        try {
            if (cursorQuery == null) {
                Log.d("UriUtils", uri.toString() + " parse failed(cursor is null). -> " + str2);
                return null;
            }
            try {
                if (!cursorQuery.moveToFirst()) {
                    Log.d("UriUtils", uri.toString() + " parse failed(moveToFirst return false). -> " + str2);
                    cursorQuery.close();
                    return null;
                }
                int columnIndex = cursorQuery.getColumnIndex("_data");
                if (columnIndex > -1) {
                    File file = new File(cursorQuery.getString(columnIndex));
                    cursorQuery.close();
                    return file;
                }
                Log.d("UriUtils", uri.toString() + " parse failed(columnIndex: " + columnIndex + " is wrong). -> " + str2);
                cursorQuery.close();
                return null;
            } catch (Exception unused) {
                Log.d("UriUtils", uri.toString() + " parse failed. -> " + str2);
                cursorQuery.close();
                return null;
            }
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004d A[PHI: r0
      0x004d: PHI (r0v10 java.lang.String) = (r0v2 java.lang.String), (r0v4 java.lang.String), (r0v4 java.lang.String) binds: [B:23:0x004b, B:29:0x0071, B:32:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae A[Catch: all -> 0x00b2, TRY_LEAVE, TryCatch #0 {all -> 0x00b2, blocks: (B:40:0x00a6, B:42:0x00ae), top: B:53:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m2306g(java.lang.String r6) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "getprop "
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r2 = ""
            if (r1 != 0) goto L97
            r1 = 0
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L41
            java.lang.String r0 = r0.concat(r6)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L41
            java.lang.Process r0 = r3.exec(r0)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L41
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L41
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L41
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L41
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L41
            r0 = 1024(0x400, float:1.435E-42)
            r3.<init>(r4, r0)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L41
            java.lang.String r0 = r3.readLine()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L38
            if (r0 == 0) goto L31
            r3.close()     // Catch: java.io.IOException -> L47
            goto L47
        L31:
            r3.close()     // Catch: java.io.IOException -> L46
            goto L46
        L35:
            r6 = move-exception
            r1 = r3
            goto L3b
        L38:
            r1 = r3
            goto L41
        L3a:
            r6 = move-exception
        L3b:
            if (r1 == 0) goto L40
            r1.close()     // Catch: java.io.IOException -> L40
        L40:
            throw r6
        L41:
            if (r1 == 0) goto L46
            r1.close()     // Catch: java.io.IOException -> L46
        L46:
            r0 = r2
        L47:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L4f
        L4d:
            r2 = r0
            goto L97
        L4f:
            java.util.Properties r0 = new java.util.Properties     // Catch: java.lang.Exception -> L6c
            r0.<init>()     // Catch: java.lang.Exception -> L6c
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L6c
            java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> L6c
            java.io.File r4 = android.os.Environment.getRootDirectory()     // Catch: java.lang.Exception -> L6c
            java.lang.String r5 = "build.prop"
            r3.<init>(r4, r5)     // Catch: java.lang.Exception -> L6c
            r1.<init>(r3)     // Catch: java.lang.Exception -> L6c
            r0.load(r1)     // Catch: java.lang.Exception -> L6c
            java.lang.String r0 = r0.getProperty(r6, r2)     // Catch: java.lang.Exception -> L6c
            goto L6d
        L6c:
            r0 = r2
        L6d:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L74
            goto L4d
        L74:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r1 >= r3) goto L4d
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "android.os.SystemProperties"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L97
            java.lang.String r3 = "get"
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r0}     // Catch: java.lang.Exception -> L97
            java.lang.reflect.Method r0 = r1.getMethod(r3, r0)     // Catch: java.lang.Exception -> L97
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r2}     // Catch: java.lang.Exception -> L97
            java.lang.Object r6 = r0.invoke(r1, r6)     // Catch: java.lang.Exception -> L97
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L97
            r2 = r6
        L97:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r0 = "unknown"
            if (r6 != 0) goto La6
            boolean r6 = r2.equals(r0)
            if (r6 == 0) goto Lb2
        La6:
            java.lang.String r6 = android.os.Build.DISPLAY     // Catch: java.lang.Throwable -> Lb2
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> Lb2
            if (r1 != 0) goto Lb2
            java.lang.String r2 = r6.toLowerCase()     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto Lb9
            return r0
        Lb9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.AbstractC3382c.m2306g(java.lang.String):java.lang.String");
    }

    /* renamed from: h */
    public static String m2307h(int i, Object... objArr) {
        try {
            String string = m2303d().getString(i);
            if (string == null || objArr == null || objArr.length <= 0) {
                return string;
            }
            try {
                return String.format(string, objArr);
            } catch (IllegalFormatException e) {
                e.printStackTrace();
                return string;
            }
        } catch (Resources.NotFoundException e4) {
            e4.printStackTrace();
            return String.valueOf(i);
        }
    }

    /* renamed from: i */
    public static void m2308i(Application application) {
        Executor executorM2348a;
        if (application == null) {
            Log.e("Utils", "app is null.");
            return;
        }
        Application application2 = f2153x;
        if (application2 != null) {
            if (application2.equals(application)) {
                return;
            }
            Application application3 = f2153x;
            C3381b0 c3381b0 = C3381b0.f2122g;
            c3381b0.f2124a.clear();
            application3.unregisterActivityLifecycleCallbacks(c3381b0);
            f2153x = application;
            c3381b0.getClass();
            application.registerActivityLifecycleCallbacks(c3381b0);
            return;
        }
        f2153x = application;
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = C3381b0.f2122g;
        activityLifecycleCallbacks.getClass();
        application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        Runnable runnable = new Runnable[]{new RunnableC3378a(0)}[0];
        HashMap map = AbstractC3396p.f2174b;
        synchronized (map) {
            try {
                Map map2 = (Map) map.get(-2);
                if (map2 == null) {
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                    executorM2348a = C3393m.m2348a();
                    concurrentHashMap.put(5, executorM2348a);
                    map.put(-2, concurrentHashMap);
                } else {
                    executorM2348a = (ExecutorService) map2.get(5);
                    if (executorM2348a == null) {
                        executorM2348a = C3393m.m2348a();
                        map2.put(5, executorM2348a);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        executorM2348a.execute(runnable);
    }

    /* renamed from: j */
    public static String m2309j(Intent intent) {
        boolean z8;
        StringBuilder sb = new StringBuilder(128);
        sb.append("Intent { ");
        String action = intent.getAction();
        boolean z9 = false;
        boolean z10 = true;
        if (action != null) {
            sb.append("act=");
            sb.append(action);
            z8 = false;
        } else {
            z8 = true;
        }
        Set<String> categories = intent.getCategories();
        if (categories != null) {
            if (!z8) {
                sb.append(' ');
            }
            sb.append("cat=[");
            for (String str : categories) {
                if (!z10) {
                    sb.append(',');
                }
                sb.append(str);
                z10 = false;
            }
            sb.append("]");
            z8 = false;
        }
        Uri data = intent.getData();
        if (data != null) {
            if (!z8) {
                sb.append(' ');
            }
            sb.append("dat=");
            sb.append(data);
            z8 = false;
        }
        String type = intent.getType();
        if (type != null) {
            if (!z8) {
                sb.append(' ');
            }
            sb.append("typ=");
            sb.append(type);
            z8 = false;
        }
        int flags = intent.getFlags();
        if (flags != 0) {
            if (!z8) {
                sb.append(' ');
            }
            sb.append("flg=0x");
            sb.append(Integer.toHexString(flags));
            z8 = false;
        }
        String str2 = intent.getPackage();
        if (str2 != null) {
            if (!z8) {
                sb.append(' ');
            }
            sb.append("pkg=");
            sb.append(str2);
            z8 = false;
        }
        ComponentName component = intent.getComponent();
        if (component != null) {
            if (!z8) {
                sb.append(' ');
            }
            sb.append("cmp=");
            sb.append(component.flattenToShortString());
            z8 = false;
        }
        Rect sourceBounds = intent.getSourceBounds();
        if (sourceBounds != null) {
            if (!z8) {
                sb.append(' ');
            }
            sb.append("bnds=");
            sb.append(sourceBounds.toShortString());
            z8 = false;
        }
        ClipData clipData = intent.getClipData();
        if (clipData != null) {
            if (!z8) {
                sb.append(' ');
            }
            ClipData.Item itemAt = clipData.getItemAt(0);
            if (itemAt == null) {
                sb.append("ClipData.Item {}");
            } else {
                sb.append("ClipData.Item { ");
                String htmlText = itemAt.getHtmlText();
                if (htmlText != null) {
                    sb.append("H:");
                    sb.append(htmlText);
                    sb.append("}");
                } else {
                    CharSequence text = itemAt.getText();
                    if (text != null) {
                        sb.append("T:");
                        sb.append(text);
                        sb.append("}");
                    } else {
                        Uri uri = itemAt.getUri();
                        if (uri != null) {
                            sb.append("U:");
                            sb.append(uri);
                            sb.append("}");
                        } else {
                            Intent intent2 = itemAt.getIntent();
                            if (intent2 != null) {
                                sb.append("I:");
                                sb.append(m2309j(intent2));
                                sb.append("}");
                            } else {
                                sb.append("NULL}");
                            }
                        }
                    }
                }
            }
            z8 = false;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            if (!z8) {
                sb.append(' ');
            }
            sb.append("extras={");
            sb.append(m2300a(extras));
            sb.append('}');
        } else {
            z9 = z8;
        }
        Intent selector = intent.getSelector();
        if (selector != null) {
            if (!z9) {
                sb.append(' ');
            }
            sb.append("sel={");
            sb.append(selector == intent ? "(this Intent)" : m2309j(selector));
            sb.append("}");
        }
        sb.append(" }");
        return sb.toString();
    }

    /* renamed from: k */
    public static boolean m2310k(String str, String[] strArr, String str2) {
        for (String str3 : strArr) {
            if (str.contains(str3) || str2.contains(str3)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public static String m2311l(int i, Object obj) throws TransformerException, IllegalArgumentException {
        ArrayList arrayListM2349a;
        if (obj.getClass().isArray()) {
            if (obj instanceof Object[]) {
                return Arrays.deepToString((Object[]) obj);
            }
            if (obj instanceof boolean[]) {
                return Arrays.toString((boolean[]) obj);
            }
            if (obj instanceof byte[]) {
                return Arrays.toString((byte[]) obj);
            }
            if (obj instanceof char[]) {
                return Arrays.toString((char[]) obj);
            }
            if (obj instanceof double[]) {
                return Arrays.toString((double[]) obj);
            }
            if (obj instanceof float[]) {
                return Arrays.toString((float[]) obj);
            }
            if (obj instanceof int[]) {
                return Arrays.toString((int[]) obj);
            }
            if (obj instanceof long[]) {
                return Arrays.toString((long[]) obj);
            }
            if (obj instanceof short[]) {
                return Arrays.toString((short[]) obj);
            }
            throw new IllegalArgumentException("Array has incompatible type: " + obj.getClass());
        }
        int i8 = 0;
        if (obj instanceof Throwable) {
            String str = AbstractC3397q.f2175a;
            ArrayList arrayList = new ArrayList();
            for (Throwable cause = (Throwable) obj; cause != null && !arrayList.contains(cause); cause = cause.getCause()) {
                arrayList.add(cause);
            }
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList();
            int i9 = size - 1;
            ArrayList arrayListM2349a2 = AbstractC3397q.m2349a((Throwable) arrayList.get(i9));
            while (true) {
                int i10 = size - 1;
                if (i10 < 0) {
                    break;
                }
                if (i10 != 0) {
                    arrayListM2349a = AbstractC3397q.m2349a((Throwable) arrayList.get(size - 2));
                    int size2 = arrayListM2349a2.size() - 1;
                    for (int size3 = arrayListM2349a.size() - 1; size2 >= 0 && size3 >= 0; size3--) {
                        if (((String) arrayListM2349a2.get(size2)).equals((String) arrayListM2349a.get(size3))) {
                            arrayListM2349a2.remove(size2);
                        }
                        size2--;
                    }
                } else {
                    arrayListM2349a = arrayListM2349a2;
                }
                if (i10 == i9) {
                    arrayList2.add(((Throwable) arrayList.get(i10)).toString());
                } else {
                    arrayList2.add(" Caused by: " + ((Throwable) arrayList.get(i10)).toString());
                }
                arrayList2.addAll(arrayListM2349a2);
                arrayListM2349a2 = arrayListM2349a;
                size = i10;
            }
            StringBuilder sb = new StringBuilder();
            int size4 = arrayList2.size();
            while (i8 < size4) {
                Object obj2 = arrayList2.get(i8);
                i8++;
                sb.append((String) obj2);
                sb.append(AbstractC3397q.f2175a);
            }
            return sb.toString();
        }
        if (obj instanceof Bundle) {
            return m2300a((Bundle) obj);
        }
        if (obj instanceof Intent) {
            return m2309j((Intent) obj);
        }
        if (i != 32) {
            if (i != 48) {
                return obj.toString();
            }
            String string = obj.toString();
            try {
                StreamSource streamSource = new StreamSource(new StringReader(string));
                StreamResult streamResult = new StreamResult(new StringWriter());
                Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
                transformerNewTransformer.setOutputProperty("indent", "yes");
                transformerNewTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", ExifInterface.GPS_MEASUREMENT_2D);
                transformerNewTransformer.transform(streamSource, streamResult);
                return streamResult.getWriter().toString().replaceFirst(">", ">" + AbstractC3387g.f2158b);
            } catch (Exception e) {
                e.printStackTrace();
                return string;
            }
        }
        if (!(obj instanceof CharSequence)) {
            try {
                ConcurrentHashMap concurrentHashMap = AbstractC3386f.f2156a;
                C3841g c3841gM2790a = (C3841g) concurrentHashMap.get("logUtilsGson");
                if (c3841gM2790a == null) {
                    C3842h c3842h = new C3842h();
                    C3836b c3836b = C3836b.f2973e;
                    Objects.requireNonNull(c3836b);
                    c3842h.f3008l = c3836b;
                    c3842h.f3003g = true;
                    c3841gM2790a = c3842h.m2790a();
                    concurrentHashMap.put("logUtilsGson", c3841gM2790a);
                }
                return c3841gM2790a.m2787f(obj);
            } catch (Throwable unused) {
                return obj.toString();
            }
        }
        String string2 = obj.toString();
        try {
            int length = string2.length();
            while (i8 < length) {
                char cCharAt = string2.charAt(i8);
                if (cCharAt == '{') {
                    return new JSONObject(string2).toString(4);
                }
                if (cCharAt == '[') {
                    return new JSONArray(string2).toString(4);
                }
                if (!Character.isWhitespace(cCharAt)) {
                    break;
                }
                i8++;
            }
            return string2;
        } catch (JSONException e4) {
            e4.printStackTrace();
            return string2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[Catch: FileNotFoundException -> 0x0046, SYNTHETIC, TRY_LEAVE, TryCatch #7 {FileNotFoundException -> 0x0046, blocks: (B:5:0x000e, B:23:0x0042, B:19:0x003a, B:51:0x0075, B:50:0x0072, B:45:0x0068, B:40:0x005f, B:35:0x0055, B:16:0x0035, B:42:0x0063, B:32:0x0050, B:47:0x006d, B:20:0x003d, B:37:0x005a), top: B:69:0x000e, inners: #0, #1, #2, #3, #4, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m2312m(java.lang.String r7) throws java.lang.Throwable {
        /*
            java.io.File r7 = com.blankj.utilcode.util.AbstractC3385e.m2335g(r7)
            boolean r0 = com.blankj.utilcode.util.AbstractC3383c0.m2326e(r7)
            r1 = 0
            if (r0 != 0) goto Le
        Lb:
            r7 = r1
            goto L7a
        Le:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.io.FileNotFoundException -> L46
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L46
            r2.<init>(r7)     // Catch: java.io.FileNotFoundException -> L46
            r7 = 524288(0x80000, float:7.34684E-40)
            r0.<init>(r2, r7)     // Catch: java.io.FileNotFoundException -> L46
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4b
            r2.<init>()     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4b
            byte[] r3 = new byte[r7]     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
        L21:
            r4 = 0
            int r5 = r0.read(r3, r4, r7)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            r6 = -1
            if (r5 == r6) goto L31
            r2.write(r3, r4, r5)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            goto L21
        L2d:
            r7 = move-exception
            goto L63
        L2f:
            r7 = move-exception
            goto L4d
        L31:
            byte[] r7 = r2.toByteArray()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            r0.close()     // Catch: java.io.IOException -> L39
            goto L3d
        L39:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.io.FileNotFoundException -> L46
        L3d:
            r2.close()     // Catch: java.io.IOException -> L41
            goto L7a
        L41:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.io.FileNotFoundException -> L46
            goto L7a
        L46:
            r7 = move-exception
            goto L76
        L48:
            r7 = move-exception
            r2 = r1
            goto L63
        L4b:
            r7 = move-exception
            r2 = r1
        L4d:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L2d
            r0.close()     // Catch: java.io.IOException -> L54
            goto L58
        L54:
            r7 = move-exception
            r7.printStackTrace()     // Catch: java.io.FileNotFoundException -> L46
        L58:
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.io.IOException -> L5e
            goto Lb
        L5e:
            r7 = move-exception
            r7.printStackTrace()     // Catch: java.io.FileNotFoundException -> L46
            goto Lb
        L63:
            r0.close()     // Catch: java.io.IOException -> L67
            goto L6b
        L67:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.io.FileNotFoundException -> L46
        L6b:
            if (r2 == 0) goto L75
            r2.close()     // Catch: java.io.IOException -> L71
            goto L75
        L71:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.io.FileNotFoundException -> L46
        L75:
            throw r7     // Catch: java.io.FileNotFoundException -> L46
        L76:
            r7.printStackTrace()
            goto Lb
        L7a:
            if (r7 != 0) goto L7d
            goto L82
        L7d:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r7)
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.AbstractC3382c.m2312m(java.lang.String):java.lang.String");
    }

    /* renamed from: n */
    public static boolean m2313n(Bitmap bitmap, File file) throws Throwable {
        boolean zCreateNewFile;
        BufferedOutputStream bufferedOutputStream;
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        boolean zCompress = false;
        if (bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            Log.e("ImageUtils", "bitmap is empty.");
            return false;
        }
        if (bitmap.isRecycled()) {
            Log.e("ImageUtils", "bitmap is recycled.");
            return false;
        }
        int i = AbstractC3385e.f2155a;
        if (file != null && ((!file.exists() || file.delete()) && AbstractC3385e.m2331c(file.getParentFile()))) {
            try {
                zCreateNewFile = file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            zCreateNewFile = false;
        }
        if (zCreateNewFile) {
            BufferedOutputStream bufferedOutputStream2 = null;
            try {
                try {
                    try {
                        bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                } catch (IOException e8) {
                    e = e8;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                zCompress = bitmap.compress(compressFormat, 100, bufferedOutputStream);
                bufferedOutputStream.close();
            } catch (IOException e9) {
                e = e9;
                bufferedOutputStream2 = bufferedOutputStream;
                e.printStackTrace();
                if (bufferedOutputStream2 != null) {
                    bufferedOutputStream2.close();
                }
                return zCompress;
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream2 = bufferedOutputStream;
                if (bufferedOutputStream2 != null) {
                    try {
                        bufferedOutputStream2.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                }
                throw th;
            }
        } else {
            Log.e("ImageUtils", "create or delete file <" + file + "> failed.");
        }
        return zCompress;
    }

    /* renamed from: o */
    public static void m2314o(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) m2303d().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        inputMethodManager.showSoftInput(view, 0, new KeyboardUtils$1(new Handler()));
        inputMethodManager.toggleSoftInput(2, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m2315p(java.io.File r1, java.util.ArrayList r2, java.util.zip.ZipFile r3, java.util.zip.ZipEntry r4, java.lang.String r5) throws java.lang.Throwable {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r5)
            r2.add(r0)
            boolean r1 = r4.isDirectory()
            if (r1 == 0) goto L13
            boolean r1 = com.blankj.utilcode.util.AbstractC3385e.m2331c(r0)
            return r1
        L13:
            boolean r1 = com.blankj.utilcode.util.AbstractC3385e.m2332d(r0)
            r2 = 0
            if (r1 != 0) goto L1b
            return r2
        L1b:
            r1 = 0
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L4c
            java.io.InputStream r3 = r3.getInputStream(r4)     // Catch: java.lang.Throwable -> L4c
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L4c
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L48
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L48
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L48
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L48
            r1 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L3e
        L33:
            int r4 = r5.read(r1)     // Catch: java.lang.Throwable -> L3e
            r0 = -1
            if (r4 == r0) goto L40
            r3.write(r1, r2, r4)     // Catch: java.lang.Throwable -> L3e
            goto L33
        L3e:
            r1 = move-exception
            goto L50
        L40:
            r5.close()
            r3.close()
            r1 = 1
            return r1
        L48:
            r2 = move-exception
            r3 = r1
        L4a:
            r1 = r2
            goto L50
        L4c:
            r2 = move-exception
            r3 = r1
            r5 = r3
            goto L4a
        L50:
            if (r5 == 0) goto L55
            r5.close()
        L55:
            if (r3 == 0) goto L5a
            r3.close()
        L5a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.AbstractC3382c.m2315p(java.io.File, java.util.ArrayList, java.util.zip.ZipFile, java.util.zip.ZipEntry, java.lang.String):boolean");
    }

    /* renamed from: q */
    public static void m2316q(String str, String str2) throws IOException {
        File fileM2335g = AbstractC3385e.m2335g(str);
        File fileM2335g2 = AbstractC3385e.m2335g(str2);
        if (fileM2335g == null || fileM2335g2 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(fileM2335g);
        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
        while (enumerationEntries.hasMoreElements()) {
            try {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                String strReplace = zipEntryNextElement.getName().replace("\\", "/");
                if (strReplace.contains("../")) {
                    Log.e("ZipUtils", "entryName: " + strReplace + " is dangerous!");
                } else if (!m2315p(fileM2335g2, arrayList, zipFile, zipEntryNextElement, strReplace)) {
                    zipFile.close();
                    return;
                }
            } catch (Throwable th) {
                zipFile.close();
                throw th;
            }
        }
        zipFile.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.File m2317r(android.net.Uri r8) {
        /*
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            java.io.File r1 = m2318s(r8)
            if (r1 == 0) goto Lb
            return r1
        Lb:
            java.lang.String r1 = ""
            java.lang.String r2 = "UriUtils"
            java.lang.String r3 = "copyUri2Cache() called"
            android.util.Log.d(r2, r3)
            android.app.Application r2 = m2303d()     // Catch: java.lang.Throwable -> L55 java.io.FileNotFoundException -> L5a
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L55 java.io.FileNotFoundException -> L5a
            java.io.InputStream r8 = r2.openInputStream(r8)     // Catch: java.lang.Throwable -> L55 java.io.FileNotFoundException -> L5a
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L51 java.io.FileNotFoundException -> L53
            android.app.Application r3 = m2303d()     // Catch: java.lang.Throwable -> L51 java.io.FileNotFoundException -> L53
            java.io.File r3 = r3.getCacheDir()     // Catch: java.lang.Throwable -> L51 java.io.FileNotFoundException -> L53
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51 java.io.FileNotFoundException -> L53
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L51 java.io.FileNotFoundException -> L53
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L51 java.io.FileNotFoundException -> L53
            r4.append(r5)     // Catch: java.lang.Throwable -> L51 java.io.FileNotFoundException -> L53
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L51 java.io.FileNotFoundException -> L53
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L51 java.io.FileNotFoundException -> L53
            java.lang.String r1 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L51 java.io.FileNotFoundException -> L53
            m2319t(r8, r1)     // Catch: java.lang.Throwable -> L51 java.io.FileNotFoundException -> L53
            if (r8 == 0) goto L50
            r8.close()     // Catch: java.io.IOException -> L4a
            return r2
        L4a:
            r8 = move-exception
            r8.printStackTrace()
            r0 = r2
            goto L69
        L50:
            return r2
        L51:
            r0 = move-exception
            goto L6a
        L53:
            r1 = move-exception
            goto L5c
        L55:
            r8 = move-exception
            r7 = r0
            r0 = r8
            r8 = r7
            goto L6a
        L5a:
            r1 = move-exception
            r8 = r0
        L5c:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L51
            if (r8 == 0) goto L69
            r8.close()     // Catch: java.io.IOException -> L65
            goto L69
        L65:
            r8 = move-exception
            r8.printStackTrace()
        L69:
            return r0
        L6a:
            if (r8 == 0) goto L74
            r8.close()     // Catch: java.io.IOException -> L70
            goto L74
        L70:
            r8 = move-exception
            r8.printStackTrace()
        L74:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.AbstractC3382c.m2317r(android.net.Uri):java.io.File");
    }

    /* renamed from: s */
    public static File m2318s(Uri uri) {
        Uri uri2;
        File fileM2305f;
        String str;
        File file;
        Log.d("UriUtils", uri.toString());
        String authority = uri.getAuthority();
        String scheme = uri.getScheme();
        String path = uri.getPath();
        int i = 0;
        if (path != null) {
            String[] strArr = {"/external/", "/external_path/"};
            for (int i8 = 0; i8 < 2; i8++) {
                String str2 = strArr[i8];
                if (path.startsWith(str2)) {
                    File file2 = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + path.replace(str2, "/"));
                    if (file2.exists()) {
                        Log.d("UriUtils", uri.toString() + " -> " + str2);
                        return file2;
                    }
                }
            }
            if (path.startsWith("/files_path/")) {
                file = new File(m2303d().getFilesDir().getAbsolutePath() + path.replace("/files_path/", "/"));
            } else if (path.startsWith("/cache_path/")) {
                file = new File(m2303d().getCacheDir().getAbsolutePath() + path.replace("/cache_path/", "/"));
            } else if (path.startsWith("/external_files_path/")) {
                file = new File(m2303d().getExternalFilesDir(null).getAbsolutePath() + path.replace("/external_files_path/", "/"));
            } else if (path.startsWith("/external_cache_path/")) {
                file = new File(m2303d().getExternalCacheDir().getAbsolutePath() + path.replace("/external_cache_path/", "/"));
            } else {
                file = null;
            }
            if (file != null && file.exists()) {
                Log.d("UriUtils", uri.toString() + " -> " + path);
                return file;
            }
        }
        if ("file".equals(scheme)) {
            if (path != null) {
                return new File(path);
            }
            Log.d("UriUtils", uri.toString() + " parse failed. -> 0");
            return null;
        }
        if (!DocumentsContract.isDocumentUri(m2303d(), uri)) {
            if ("content".equals(scheme)) {
                return m2305f(uri, null, null, ExifInterface.GPS_MEASUREMENT_2D);
            }
            Log.d("UriUtils", uri.toString() + " parse failed. -> 3");
            return null;
        }
        boolean z8 = true;
        if (!"com.android.externalstorage.documents".equals(authority)) {
            if (!"com.android.providers.downloads.documents".equals(authority)) {
                if (!"com.android.providers.media.documents".equals(authority)) {
                    if ("content".equals(scheme)) {
                        return m2305f(uri, null, null, "1_3");
                    }
                    Log.d("UriUtils", uri.toString() + " parse failed. -> 1_4");
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
                        Log.d("UriUtils", uri.toString() + " parse failed. -> 1_2");
                        return null;
                    }
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return m2305f(uri2, "_id=?", new String[]{strArrSplit[1]}, "1_2");
            }
            String documentId = DocumentsContract.getDocumentId(uri);
            if (TextUtils.isEmpty(documentId)) {
                Log.d("UriUtils", uri.toString() + " parse failed(id is null). -> 1_1");
                return null;
            }
            if (documentId.startsWith("raw:")) {
                return new File(documentId.substring(4));
            }
            if (documentId.startsWith("msf:")) {
                documentId = documentId.split(":")[1];
            }
            try {
                long j7 = Long.parseLong(documentId);
                String[] strArr2 = {"content://downloads/public_downloads", "content://downloads/all_downloads", "content://downloads/my_downloads"};
                while (i < 3) {
                    try {
                        fileM2305f = m2305f(ContentUris.withAppendedId(Uri.parse(strArr2[i]), j7), null, null, "1_1");
                    } catch (Exception unused) {
                    }
                    if (fileM2305f != null) {
                        return fileM2305f;
                    }
                    i++;
                }
                Log.d("UriUtils", uri.toString() + " parse failed. -> 1_1");
            } catch (Exception unused2) {
            }
            return null;
        }
        String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(":");
        String str4 = strArrSplit2[0];
        if ("primary".equalsIgnoreCase(str4)) {
            return new File(Environment.getExternalStorageDirectory() + "/" + strArrSplit2[1]);
        }
        StorageManager storageManager = (StorageManager) m2303d().getSystemService("storage");
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
            while (i < length) {
                Object obj = Array.get(objInvoke, i);
                boolean z9 = z8;
                String[] strArr3 = strArrSplit2;
                if ("mounted".equals(method3.invoke(obj, null)) || "mounted_ro".equals(method3.invoke(obj, null))) {
                    if ((!((Boolean) method5.invoke(obj, null)).booleanValue() || !((Boolean) method6.invoke(obj, null)).booleanValue()) && (str = (String) method2.invoke(obj, null)) != null && str.equals(str4)) {
                        return new File(method4.invoke(obj, null) + "/" + strArr3[z9 ? 1 : 0]);
                    }
                }
                i++;
                z8 = z9 ? 1 : 0;
                strArrSplit2 = strArr3;
            }
        } catch (Exception e) {
            Log.d("UriUtils", uri.toString() + " parse failed. " + e.toString() + " -> 1_0");
        }
        Log.d("UriUtils", uri.toString() + " parse failed. -> 1_0");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.io.BufferedOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.io.IOException, java.lang.Throwable] */
    /* renamed from: t */
    public static boolean m2319t(InputStream e, String str) throws Throwable {
        ?? bufferedOutputStream;
        IOException iOException;
        File fileM2335g = AbstractC3385e.m2335g(str);
        boolean z8 = false;
        if (e == 0 || !AbstractC3385e.m2332d(fileM2335g)) {
            Log.e("FileIOUtils", "create file <" + fileM2335g + "> failed.");
            return false;
        }
        ?? r1 = 0;
        r1 = 0;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileM2335g, false), 524288);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e4) {
            e = e4;
        }
        try {
            byte[] bArr = new byte[524288];
            while (true) {
                r1 = e.read(bArr);
                if (r1 != -1) {
                    bufferedOutputStream.write(bArr, 0, r1);
                } else {
                    try {
                        break;
                    } catch (IOException e8) {
                        e8.printStackTrace();
                        iOException = e8;
                    }
                }
            }
            e.close();
            iOException = e;
            try {
                bufferedOutputStream.close();
                e = iOException;
            } catch (IOException e9) {
                e9.printStackTrace();
                e = e9;
            }
            z8 = true;
        } catch (IOException e10) {
            e = e10;
            r1 = bufferedOutputStream;
            e.printStackTrace();
            try {
                e.close();
                e = e;
            } catch (IOException e11) {
                e11.printStackTrace();
                e = e11;
            }
            if (r1 != 0) {
                try {
                    r1.close();
                } catch (IOException e12) {
                    e = e12;
                    e.printStackTrace();
                }
            }
            return z8;
        } catch (Throwable th2) {
            th = th2;
            r1 = bufferedOutputStream;
            try {
                e.close();
            } catch (IOException e13) {
                e13.printStackTrace();
            }
            if (r1 == 0) {
                throw th;
            }
            try {
                r1.close();
                throw th;
            } catch (IOException e14) {
                e14.printStackTrace();
                throw th;
            }
        }
        return z8;
    }

    /* renamed from: u */
    public static boolean m2320u(File file, String str, boolean z8) throws Throwable {
        BufferedWriter bufferedWriter;
        if (file != null && str != null) {
            if (!AbstractC3385e.m2332d(file)) {
                Log.e("FileIOUtils", "create file <" + file + "> failed.");
                return false;
            }
            BufferedWriter bufferedWriter2 = null;
            try {
                try {
                    bufferedWriter = new BufferedWriter(new FileWriter(file, z8));
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException e) {
                e = e;
            }
            try {
                bufferedWriter.write(str);
                try {
                    bufferedWriter.close();
                    return true;
                } catch (IOException e4) {
                    e4.printStackTrace();
                    return true;
                }
            } catch (IOException e8) {
                e = e8;
                bufferedWriter2 = bufferedWriter;
                e.printStackTrace();
                if (bufferedWriter2 != null) {
                    try {
                        bufferedWriter2.close();
                    } catch (IOException e9) {
                        e9.printStackTrace();
                    }
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter2 = bufferedWriter;
                if (bufferedWriter2 != null) {
                    try {
                        bufferedWriter2.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                }
                throw th;
            }
        }
        return false;
    }

    /* renamed from: v */
    public static boolean m2321v(File file, String str, ZipOutputStream zipOutputStream) throws Throwable {
        StringBuilder sbM97v = AbstractC0037f.m97v(str);
        sbM97v.append(AbstractC3383c0.m2327f(str) ? "" : File.separator);
        sbM97v.append(file.getName());
        String string = sbM97v.toString();
        BufferedInputStream bufferedInputStream = null;
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file2 : fileArrListFiles) {
                    if (!m2321v(file2, string, zipOutputStream)) {
                        return false;
                    }
                }
                return true;
            }
            ZipEntry zipEntry = new ZipEntry(string + '/');
            zipEntry.setComment(null);
            zipOutputStream.putNextEntry(zipEntry);
            zipOutputStream.closeEntry();
            return true;
        }
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
            try {
                ZipEntry zipEntry2 = new ZipEntry(string);
                zipEntry2.setComment(null);
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = bufferedInputStream2.read(bArr, 0, 8192);
                    if (i == -1) {
                        zipOutputStream.closeEntry();
                        bufferedInputStream2.close();
                        return true;
                    }
                    zipOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
