package com.taobao.sophix.p043b;

import android.annotation.TargetApi;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.taobao.sophix.p042a.C6348b;
import com.taobao.sophix.p052e.C6376c;
import com.taobao.sophix.p052e.C6378e;
import com.taobao.sophix.p052e.C6381h;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexFile;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.taobao.sophix.b.c */
/* loaded from: classes4.dex */
public class C6363c {

    /* renamed from: a */
    private static String[] f4918a;

    public C6363c() {
        ApplicationInfo applicationInfo;
        if (f4918a != null) {
            return;
        }
        try {
            PackageManager packageManager = C6362b.f4912b.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(C6362b.f4912b.getBaseContext().getPackageName(), 0)) != null) {
                f4918a = new String[]{(String) C6381h.m4723a(ApplicationInfo.class, "primaryCpuAbi").get(applicationInfo)};
            }
            C6378e.m4709b("NativeLibManager", "init", "primaryCpuAbis", Arrays.toString(f4918a));
        } catch (Throwable th) {
            C6378e.m4708b("NativeLibManager", "init", th, new Object[0]);
        }
    }

    /* renamed from: b */
    private void m4626b(Object obj, String str, Object obj2) {
        ((List) m4620a(obj, str).get(obj)).add(0, obj2);
    }

    /* renamed from: a */
    public void m4627a(String str, ZipFile zipFile, File file) throws C6348b {
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream2;
        C6378e.m4709b("NativeLibManager", "unZipLibFile", "libPath", str, "libDir", file);
        try {
            Map<String, String> mapM4621a = m4621a(str);
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                String name = zipEntryNextElement.getName();
                if (m4624a(name, file, mapM4621a)) {
                    String strSubstring = name.substring(name.lastIndexOf(File.separator) + 1);
                    C6378e.m4702a("NativeLibManager", "unZipLibFile", "entryName", name, "soName", strSubstring);
                    int i10 = 0;
                    boolean z9 = false;
                    while (i10 < 3 && !z9) {
                        int i11 = i10 + 1;
                        BufferedOutputStream bufferedOutputStream2 = null;
                        try {
                            BufferedOutputStream bufferedOutputStream3 = new BufferedOutputStream(new FileOutputStream(new File(file, strSubstring)));
                            try {
                                try {
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedInputStream = null;
                                    bufferedOutputStream2 = bufferedOutputStream3;
                                }
                            } catch (IOException e10) {
                                e = e10;
                            }
                            try {
                                bufferedInputStream2 = new BufferedInputStream(zipFile.getInputStream(zipEntryNextElement));
                            } catch (IOException e11) {
                                e = e11;
                                bufferedInputStream = null;
                                bufferedOutputStream = bufferedOutputStream3;
                                try {
                                    C6378e.m4701a("NativeLibManager", "unZipLibFile", e, "entryName", name, "libName", strSubstring, "numAttempts", Integer.valueOf(i11));
                                    C6376c.m4691a(bufferedOutputStream);
                                    C6376c.m4691a(bufferedInputStream);
                                    i10 = i11;
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedOutputStream2 = bufferedOutputStream;
                                    C6376c.m4691a(bufferedOutputStream2);
                                    C6376c.m4691a(bufferedInputStream);
                                    throw th;
                                }
                            }
                            try {
                                byte[] bArr = new byte[1024];
                                for (int i12 = bufferedInputStream2.read(bArr); i12 != -1; i12 = bufferedInputStream2.read(bArr)) {
                                    bufferedOutputStream3.write(bArr, 0, i12);
                                }
                                C6376c.m4691a(bufferedOutputStream3);
                                C6376c.m4691a(bufferedInputStream2);
                                z9 = true;
                            } catch (IOException e12) {
                                e = e12;
                                bufferedOutputStream = bufferedOutputStream3;
                                bufferedInputStream = bufferedInputStream2;
                                C6378e.m4701a("NativeLibManager", "unZipLibFile", e, "entryName", name, "libName", strSubstring, "numAttempts", Integer.valueOf(i11));
                                C6376c.m4691a(bufferedOutputStream);
                                C6376c.m4691a(bufferedInputStream);
                                i10 = i11;
                            } catch (Throwable th3) {
                                th = th3;
                                bufferedOutputStream2 = bufferedOutputStream3;
                                bufferedInputStream = bufferedInputStream2;
                                C6376c.m4691a(bufferedOutputStream2);
                                C6376c.m4691a(bufferedInputStream);
                                throw th;
                            }
                        } catch (IOException e13) {
                            e = e13;
                            bufferedOutputStream = null;
                            bufferedInputStream = null;
                        } catch (Throwable th4) {
                            th = th4;
                            bufferedInputStream = null;
                        }
                        i10 = i11;
                    }
                    if (!z9) {
                        throw new C6348b(135, "unZipLibFile entryName:" + name);
                    }
                }
            }
        } catch (C6348b e14) {
            throw e14;
        } catch (Throwable th5) {
            throw new C6348b(131, th5);
        }
    }

    /* renamed from: b */
    private Object m4625b(File file) throws Exception {
        Constructor constructorM4722a = C6381h.m4722a(Class.forName("dalvik.system.DexPathList$NativeLibraryElement"), File.class);
        if (constructorM4722a != null) {
            constructorM4722a.setAccessible(true);
            return constructorM4722a.newInstance(file);
        }
        throw new Exception("make nativeElement fail no such constructor");
    }

    /* renamed from: a */
    private static Map<String, String> m4621a(String str) throws C6348b {
        String[] strArr = f4918a;
        if (strArr != null && strArr.length != 0) {
            try {
                HashMap map = new HashMap();
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                    String[] strArr2 = f4918a;
                    int length = strArr2.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 < length) {
                            String str2 = strArr2[i10];
                            for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                                String strOptString = jSONArrayOptJSONArray.optString(i11);
                                if (str2.equals(strOptString)) {
                                    map.put(next, strOptString);
                                    break;
                                }
                            }
                            i10++;
                        }
                    }
                }
                C6378e.m4702a("NativeLibManager", "getLibPatchMap", "libPatchMap", map);
                return map;
            } catch (JSONException e10) {
                throw new C6348b(133, e10);
            }
        }
        C6378e.m4712d("NativeLibManager", "getLibPatchMap", "primaryCpuAbis is null");
        throw new C6348b(132, "primaryCpuAbis is null");
    }

    /* renamed from: a */
    private static boolean m4624a(String str, File file, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String str2 = entry.getValue() + File.separator + System.mapLibraryName(entry.getKey());
                if (new File(file, str2).exists()) {
                    return false;
                }
                if (str.endsWith(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m4628a(String str, File file) throws C6348b {
        C6378e.m4702a("NativeLibManager", "patch", "libDir", file.getAbsolutePath());
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
            Map<String, String> mapM4621a = m4621a(str);
            if (fileArrListFiles.length == mapM4621a.keySet().size()) {
                for (String str2 : mapM4621a.keySet()) {
                    for (File file2 : fileArrListFiles) {
                        if (file2.getName().equals(System.mapLibraryName(str2))) {
                            break;
                        }
                    }
                }
                try {
                    ClassLoader classLoader = getClass().getClassLoader();
                    C6378e.m4702a("NativeLibManager", "patch", "inject before classLoader", classLoader);
                    Object obj = m4620a(classLoader, "pathList").get(classLoader);
                    if (!TextUtils.isEmpty(file.getAbsolutePath()) && file.exists()) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            m4623a(obj, "nativeLibraryPathElements", m4625b(file));
                            m4626b(obj, "nativeLibraryDirectories", file);
                        } else {
                            m4623a(obj, "nativeLibraryPathElements", m4619a(file));
                            m4626b(obj, "nativeLibraryDirectories", file);
                        }
                    }
                    C6378e.m4702a("NativeLibManager", "patch", "inject after classLoader", classLoader);
                    return true;
                } catch (Throwable th) {
                    throw new C6348b(136, th);
                }
            }
        }
        throw new C6348b(134, "lost some libs");
    }

    @TargetApi(18)
    /* renamed from: a */
    public static void m4622a() throws C6348b {
        try {
            ClassLoader classLoader = C6363c.class.getClassLoader();
            ClassLoader classLoader2 = C6362b.f4912b.getClassLoader();
            if ((classLoader instanceof BaseDexClassLoader) && classLoader2.getClass().getName().startsWith("com.taobao.sophix")) {
                String str = (String) C6381h.m4724a(BaseDexClassLoader.class, "getLdLibraryPath", new Class[0]).invoke(classLoader, null);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 31) {
                    return;
                }
                if (i10 >= 29) {
                    C6381h.m4724a(Class.forName("com.android.internal.os.ClassLoaderFactory"), "createClassloaderNamespace", ClassLoader.class, Integer.TYPE, String.class, String.class, Boolean.TYPE, String.class).invoke(null, classLoader2, 14, str, null, Boolean.FALSE, null);
                    return;
                }
                if (i10 < 27) {
                    C6381h.m4724a(Class.forName("com.android.internal.os.PathClassLoaderFactory"), "createClassloaderNamespace", ClassLoader.class, Integer.TYPE, String.class, String.class, Boolean.TYPE).invoke(null, classLoader2, 14, str, null, Boolean.FALSE);
                    return;
                }
                Class<?> cls = Class.forName("com.android.internal.os.ClassLoaderFactory");
                Class cls2 = Integer.TYPE;
                Class cls3 = Boolean.TYPE;
                Method methodM4724a = C6381h.m4724a(cls, "createClassloaderNamespace", ClassLoader.class, cls2, String.class, String.class, cls3, cls3);
                Boolean bool = Boolean.FALSE;
                methodM4724a.invoke(null, classLoader2, 14, str, null, bool, bool);
                return;
            }
            C6378e.m4702a("NativeLibManager", "no need to process ld path", new Object[0]);
        } catch (Throwable th) {
            throw new C6348b(137, th);
        }
    }

    /* renamed from: a */
    private void m4623a(Object obj, String str, Object obj2) throws Exception {
        Field fieldM4620a = m4620a(obj, str);
        Object[] objArr = (Object[]) fieldM4620a.get(obj);
        Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), objArr.length + 1);
        objArr2[0] = obj2;
        System.arraycopy(objArr, 0, objArr2, 1, objArr.length);
        fieldM4620a.set(obj, objArr2);
    }

    /* renamed from: a */
    private Object m4619a(File file) throws Exception {
        Constructor constructorM4722a = C6381h.m4722a(Class.forName("dalvik.system.DexPathList$Element"), File.class, Boolean.TYPE, File.class, DexFile.class);
        if (constructorM4722a != null) {
            return constructorM4722a.newInstance(file, Boolean.TRUE, null, null);
        }
        throw new Exception("make nativeElement fail no such constructor");
    }

    /* renamed from: a */
    private Field m4620a(Object obj, String str) throws Exception {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                return C6381h.m4723a(superclass, str);
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new Exception("Field " + str + " not found in " + obj.getClass());
    }
}
