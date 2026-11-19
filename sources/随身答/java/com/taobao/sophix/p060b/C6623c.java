package com.taobao.sophix.p060b;

import android.annotation.TargetApi;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.taobao.sophix.PatchStatus;
import com.taobao.sophix.p059a.C6608b;
import com.taobao.sophix.p069e.C6636c;
import com.taobao.sophix.p069e.C6638e;
import com.taobao.sophix.p069e.C6641h;
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
public class C6623c {

    /* renamed from: a */
    private static String[] f5495a;

    public C6623c() {
        ApplicationInfo applicationInfo;
        if (f5495a != null) {
            return;
        }
        try {
            PackageManager packageManager = C6622b.f5489b.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(C6622b.f5489b.getBaseContext().getPackageName(), 0)) != null) {
                f5495a = new String[]{(String) C6641h.m4902a(ApplicationInfo.class, "primaryCpuAbi").get(applicationInfo)};
            }
            C6638e.m4888b("NativeLibManager", "init", "primaryCpuAbis", Arrays.toString(f5495a));
        } catch (Throwable th) {
            C6638e.m4887b("NativeLibManager", "init", th, new Object[0]);
        }
    }

    /* renamed from: b */
    private void m4805b(Object obj, String str, Object obj2) {
        ((List) m4799a(obj, str).get(obj)).add(0, obj2);
    }

    /* renamed from: a */
    public void m4806a(String str, ZipFile zipFile, File file) throws C6608b {
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream2;
        C6638e.m4888b("NativeLibManager", "unZipLibFile", "libPath", str, "libDir", file);
        try {
            Map<String, String> mapM4800a = m4800a(str);
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                String name = zipEntryNextElement.getName();
                if (m4803a(name, file, mapM4800a)) {
                    String strSubstring = name.substring(name.lastIndexOf(File.separator) + 1);
                    C6638e.m4881a("NativeLibManager", "unZipLibFile", "entryName", name, "soName", strSubstring);
                    int i9 = 0;
                    boolean z9 = false;
                    while (i9 < 3 && !z9) {
                        int i10 = i9 + 1;
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
                                    C6638e.m4880a("NativeLibManager", "unZipLibFile", e, "entryName", name, "libName", strSubstring, "numAttempts", Integer.valueOf(i10));
                                    C6636c.m4870a(bufferedOutputStream);
                                    C6636c.m4870a(bufferedInputStream);
                                    i9 = i10;
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedOutputStream2 = bufferedOutputStream;
                                    C6636c.m4870a(bufferedOutputStream2);
                                    C6636c.m4870a(bufferedInputStream);
                                    throw th;
                                }
                            }
                            try {
                                byte[] bArr = new byte[1024];
                                for (int i11 = bufferedInputStream2.read(bArr); i11 != -1; i11 = bufferedInputStream2.read(bArr)) {
                                    bufferedOutputStream3.write(bArr, 0, i11);
                                }
                                C6636c.m4870a(bufferedOutputStream3);
                                C6636c.m4870a(bufferedInputStream2);
                                z9 = true;
                            } catch (IOException e12) {
                                e = e12;
                                bufferedOutputStream = bufferedOutputStream3;
                                bufferedInputStream = bufferedInputStream2;
                                C6638e.m4880a("NativeLibManager", "unZipLibFile", e, "entryName", name, "libName", strSubstring, "numAttempts", Integer.valueOf(i10));
                                C6636c.m4870a(bufferedOutputStream);
                                C6636c.m4870a(bufferedInputStream);
                                i9 = i10;
                            } catch (Throwable th3) {
                                th = th3;
                                bufferedOutputStream2 = bufferedOutputStream3;
                                bufferedInputStream = bufferedInputStream2;
                                C6636c.m4870a(bufferedOutputStream2);
                                C6636c.m4870a(bufferedInputStream);
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
                        i9 = i10;
                    }
                    if (!z9) {
                        throw new C6608b(PatchStatus.CODE_LOAD_LIB_UNZIP, "unZipLibFile entryName:" + name);
                    }
                }
            }
        } catch (C6608b e14) {
            throw e14;
        } catch (Throwable th5) {
            throw new C6608b(PatchStatus.CODE_LOAD_LIB_UNDEFINED, th5);
        }
    }

    /* renamed from: b */
    private Object m4804b(File file) throws Exception {
        Constructor constructorM4901a = C6641h.m4901a(Class.forName("dalvik.system.DexPathList$NativeLibraryElement"), File.class);
        if (constructorM4901a != null) {
            constructorM4901a.setAccessible(true);
            return constructorM4901a.newInstance(file);
        }
        throw new Exception("make nativeElement fail no such constructor");
    }

    /* renamed from: a */
    private static Map<String, String> m4800a(String str) throws C6608b {
        String[] strArr = f5495a;
        if (strArr != null && strArr.length != 0) {
            try {
                HashMap map = new HashMap();
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                    String[] strArr2 = f5495a;
                    int length = strArr2.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 < length) {
                            String str2 = strArr2[i9];
                            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                                String strOptString = jSONArrayOptJSONArray.optString(i10);
                                if (str2.equals(strOptString)) {
                                    map.put(next, strOptString);
                                    break;
                                }
                            }
                            i9++;
                        }
                    }
                }
                C6638e.m4881a("NativeLibManager", "getLibPatchMap", "libPatchMap", map);
                return map;
            } catch (JSONException e10) {
                throw new C6608b(PatchStatus.CODE_LOAD_LIB_JSON, e10);
            }
        }
        C6638e.m4891d("NativeLibManager", "getLibPatchMap", "primaryCpuAbis is null");
        throw new C6608b(PatchStatus.CODE_LOAD_LIB_CPUABIS, "primaryCpuAbis is null");
    }

    /* renamed from: a */
    private static boolean m4803a(String str, File file, Map<String, String> map) {
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
    public boolean m4807a(String str, File file) throws C6608b {
        C6638e.m4881a("NativeLibManager", "patch", "libDir", file.getAbsolutePath());
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
            Map<String, String> mapM4800a = m4800a(str);
            if (fileArrListFiles.length == mapM4800a.keySet().size()) {
                for (String str2 : mapM4800a.keySet()) {
                    for (File file2 : fileArrListFiles) {
                        if (file2.getName().equals(System.mapLibraryName(str2))) {
                            break;
                        }
                    }
                }
                try {
                    ClassLoader classLoader = getClass().getClassLoader();
                    C6638e.m4881a("NativeLibManager", "patch", "inject before classLoader", classLoader);
                    Object obj = m4799a(classLoader, "pathList").get(classLoader);
                    if (!TextUtils.isEmpty(file.getAbsolutePath()) && file.exists()) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            m4802a(obj, "nativeLibraryPathElements", m4804b(file));
                            m4805b(obj, "nativeLibraryDirectories", file);
                        } else {
                            m4802a(obj, "nativeLibraryPathElements", m4798a(file));
                            m4805b(obj, "nativeLibraryDirectories", file);
                        }
                    }
                    C6638e.m4881a("NativeLibManager", "patch", "inject after classLoader", classLoader);
                    return true;
                } catch (Throwable th) {
                    throw new C6608b(PatchStatus.CODE_LOAD_LIB_INJECT, th);
                }
            }
        }
        throw new C6608b(PatchStatus.CODE_LOAD_LIB_LOST, "lost some libs");
    }

    @TargetApi(18)
    /* renamed from: a */
    public static void m4801a() throws C6608b {
        try {
            ClassLoader classLoader = C6623c.class.getClassLoader();
            ClassLoader classLoader2 = C6622b.f5489b.getClassLoader();
            if ((classLoader instanceof BaseDexClassLoader) && classLoader2.getClass().getName().startsWith("com.taobao.sophix")) {
                String str = (String) C6641h.m4903a(BaseDexClassLoader.class, "getLdLibraryPath", new Class[0]).invoke(classLoader, null);
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 31) {
                    return;
                }
                if (i9 >= 29) {
                    C6641h.m4903a(Class.forName("com.android.internal.os.ClassLoaderFactory"), "createClassloaderNamespace", ClassLoader.class, Integer.TYPE, String.class, String.class, Boolean.TYPE, String.class).invoke(null, classLoader2, 14, str, null, Boolean.FALSE, null);
                    return;
                }
                if (i9 < 27) {
                    C6641h.m4903a(Class.forName("com.android.internal.os.PathClassLoaderFactory"), "createClassloaderNamespace", ClassLoader.class, Integer.TYPE, String.class, String.class, Boolean.TYPE).invoke(null, classLoader2, 14, str, null, Boolean.FALSE);
                    return;
                }
                Class<?> cls = Class.forName("com.android.internal.os.ClassLoaderFactory");
                Class cls2 = Integer.TYPE;
                Class cls3 = Boolean.TYPE;
                Method methodM4903a = C6641h.m4903a(cls, "createClassloaderNamespace", ClassLoader.class, cls2, String.class, String.class, cls3, cls3);
                Boolean bool = Boolean.FALSE;
                methodM4903a.invoke(null, classLoader2, 14, str, null, bool, bool);
                return;
            }
            C6638e.m4881a("NativeLibManager", "no need to process ld path", new Object[0]);
        } catch (Throwable th) {
            throw new C6608b(PatchStatus.CODE_LOAD_LIB_NS, th);
        }
    }

    /* renamed from: a */
    private void m4802a(Object obj, String str, Object obj2) throws Exception {
        Field fieldM4799a = m4799a(obj, str);
        Object[] objArr = (Object[]) fieldM4799a.get(obj);
        Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), objArr.length + 1);
        objArr2[0] = obj2;
        System.arraycopy(objArr, 0, objArr2, 1, objArr.length);
        fieldM4799a.set(obj, objArr2);
    }

    /* renamed from: a */
    private Object m4798a(File file) throws Exception {
        Constructor constructorM4901a = C6641h.m4901a(Class.forName("dalvik.system.DexPathList$Element"), File.class, Boolean.TYPE, File.class, DexFile.class);
        if (constructorM4901a != null) {
            return constructorM4901a.newInstance(file, Boolean.TRUE, null, null);
        }
        throw new Exception("make nativeElement fail no such constructor");
    }

    /* renamed from: a */
    private Field m4799a(Object obj, String str) throws Exception {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                return C6641h.m4902a(superclass, str);
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new Exception("Field " + str + " not found in " + obj.getClass());
    }
}
