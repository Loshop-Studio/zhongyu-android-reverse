package com.taobao.sophix.p090b;

import android.annotation.TargetApi;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.taobao.sophix.PatchStatus;
import com.taobao.sophix.p089a.C7714b;
import com.taobao.sophix.p099e.C7742c;
import com.taobao.sophix.p099e.C7744e;
import com.taobao.sophix.p099e.C7747h;
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
/* loaded from: classes5.dex */
public class C7729c {

    /* renamed from: a */
    private static String[] f13360a;

    public C7729c() {
        ApplicationInfo applicationInfo;
        if (f13360a != null) {
            return;
        }
        try {
            PackageManager packageManager = C7728b.f13354b.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(C7728b.f13354b.getBaseContext().getPackageName(), 0)) != null) {
                f13360a = new String[]{(String) C7747h.m10414a(ApplicationInfo.class, "primaryCpuAbi").get(applicationInfo)};
            }
            C7744e.m10400b("NativeLibManager", "init", "primaryCpuAbis", Arrays.toString(f13360a));
        } catch (Throwable th) {
            C7744e.m10399b("NativeLibManager", "init", th, new Object[0]);
        }
    }

    /* renamed from: b */
    private void m10317b(Object obj, String str, Object obj2) {
        ((List) m10311a(obj, str).get(obj)).add(0, obj2);
    }

    /* renamed from: a */
    public void m10318a(String str, ZipFile zipFile, File file) throws C7714b {
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream2;
        C7744e.m10400b("NativeLibManager", "unZipLibFile", "libPath", str, "libDir", file);
        try {
            Map<String, String> mapM10312a = m10312a(str);
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                String name = zipEntryNextElement.getName();
                if (m10315a(name, file, mapM10312a)) {
                    String strSubstring = name.substring(name.lastIndexOf(File.separator) + 1);
                    C7744e.m10393a("NativeLibManager", "unZipLibFile", "entryName", name, "soName", strSubstring);
                    int i10 = 0;
                    boolean z10 = false;
                    while (i10 < 3 && !z10) {
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
                                    C7744e.m10392a("NativeLibManager", "unZipLibFile", e, "entryName", name, "libName", strSubstring, "numAttempts", Integer.valueOf(i11));
                                    C7742c.m10382a(bufferedOutputStream);
                                    C7742c.m10382a(bufferedInputStream);
                                    i10 = i11;
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedOutputStream2 = bufferedOutputStream;
                                    C7742c.m10382a(bufferedOutputStream2);
                                    C7742c.m10382a(bufferedInputStream);
                                    throw th;
                                }
                            }
                            try {
                                byte[] bArr = new byte[1024];
                                for (int i12 = bufferedInputStream2.read(bArr); i12 != -1; i12 = bufferedInputStream2.read(bArr)) {
                                    bufferedOutputStream3.write(bArr, 0, i12);
                                }
                                C7742c.m10382a(bufferedOutputStream3);
                                C7742c.m10382a(bufferedInputStream2);
                                z10 = true;
                            } catch (IOException e12) {
                                e = e12;
                                bufferedOutputStream = bufferedOutputStream3;
                                bufferedInputStream = bufferedInputStream2;
                                C7744e.m10392a("NativeLibManager", "unZipLibFile", e, "entryName", name, "libName", strSubstring, "numAttempts", Integer.valueOf(i11));
                                C7742c.m10382a(bufferedOutputStream);
                                C7742c.m10382a(bufferedInputStream);
                                i10 = i11;
                            } catch (Throwable th3) {
                                th = th3;
                                bufferedOutputStream2 = bufferedOutputStream3;
                                bufferedInputStream = bufferedInputStream2;
                                C7742c.m10382a(bufferedOutputStream2);
                                C7742c.m10382a(bufferedInputStream);
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
                    if (!z10) {
                        throw new C7714b(PatchStatus.CODE_LOAD_LIB_UNZIP, "unZipLibFile entryName:" + name);
                    }
                }
            }
        } catch (C7714b e14) {
            throw e14;
        } catch (Throwable th5) {
            throw new C7714b(PatchStatus.CODE_LOAD_LIB_UNDEFINED, th5);
        }
    }

    /* renamed from: b */
    private Object m10316b(File file) throws Exception {
        Constructor constructorM10413a = C7747h.m10413a(Class.forName("dalvik.system.DexPathList$NativeLibraryElement"), File.class);
        if (constructorM10413a != null) {
            constructorM10413a.setAccessible(true);
            return constructorM10413a.newInstance(file);
        }
        throw new Exception("make nativeElement fail no such constructor");
    }

    /* renamed from: a */
    private static Map<String, String> m10312a(String str) throws C7714b {
        String[] strArr = f13360a;
        if (strArr != null && strArr.length != 0) {
            try {
                HashMap map = new HashMap();
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                    String[] strArr2 = f13360a;
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
                C7744e.m10393a("NativeLibManager", "getLibPatchMap", "libPatchMap", map);
                return map;
            } catch (JSONException e10) {
                throw new C7714b(PatchStatus.CODE_LOAD_LIB_JSON, e10);
            }
        }
        C7744e.m10403d("NativeLibManager", "getLibPatchMap", "primaryCpuAbis is null");
        throw new C7714b(PatchStatus.CODE_LOAD_LIB_CPUABIS, "primaryCpuAbis is null");
    }

    /* renamed from: a */
    private static boolean m10315a(String str, File file, Map<String, String> map) {
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
    public boolean m10319a(String str, File file) throws C7714b {
        C7744e.m10393a("NativeLibManager", "patch", "libDir", file.getAbsolutePath());
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
            Map<String, String> mapM10312a = m10312a(str);
            if (fileArrListFiles.length == mapM10312a.keySet().size()) {
                for (String str2 : mapM10312a.keySet()) {
                    for (File file2 : fileArrListFiles) {
                        if (file2.getName().equals(System.mapLibraryName(str2))) {
                            break;
                        }
                    }
                }
                try {
                    ClassLoader classLoader = getClass().getClassLoader();
                    C7744e.m10393a("NativeLibManager", "patch", "inject before classLoader", classLoader);
                    Object obj = m10311a(classLoader, "pathList").get(classLoader);
                    if (!TextUtils.isEmpty(file.getAbsolutePath()) && file.exists()) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            m10314a(obj, "nativeLibraryPathElements", m10316b(file));
                            m10317b(obj, "nativeLibraryDirectories", file);
                        } else {
                            m10314a(obj, "nativeLibraryPathElements", m10310a(file));
                            m10317b(obj, "nativeLibraryDirectories", file);
                        }
                    }
                    C7744e.m10393a("NativeLibManager", "patch", "inject after classLoader", classLoader);
                    return true;
                } catch (Throwable th) {
                    throw new C7714b(PatchStatus.CODE_LOAD_LIB_INJECT, th);
                }
            }
        }
        throw new C7714b(PatchStatus.CODE_LOAD_LIB_LOST, "lost some libs");
    }

    @TargetApi(18)
    /* renamed from: a */
    public static void m10313a() throws C7714b {
        try {
            ClassLoader classLoader = C7729c.class.getClassLoader();
            ClassLoader classLoader2 = C7728b.f13354b.getClassLoader();
            if ((classLoader instanceof BaseDexClassLoader) && classLoader2.getClass().getName().startsWith("com.taobao.sophix")) {
                String str = (String) C7747h.m10415a(BaseDexClassLoader.class, "getLdLibraryPath", new Class[0]).invoke(classLoader, null);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 31) {
                    return;
                }
                if (i10 >= 29) {
                    C7747h.m10415a(Class.forName("com.android.internal.os.ClassLoaderFactory"), "createClassloaderNamespace", ClassLoader.class, Integer.TYPE, String.class, String.class, Boolean.TYPE, String.class).invoke(null, classLoader2, 14, str, null, Boolean.FALSE, null);
                    return;
                }
                if (i10 < 27) {
                    C7747h.m10415a(Class.forName("com.android.internal.os.PathClassLoaderFactory"), "createClassloaderNamespace", ClassLoader.class, Integer.TYPE, String.class, String.class, Boolean.TYPE).invoke(null, classLoader2, 14, str, null, Boolean.FALSE);
                    return;
                }
                Class<?> cls = Class.forName("com.android.internal.os.ClassLoaderFactory");
                Class cls2 = Integer.TYPE;
                Class cls3 = Boolean.TYPE;
                Method methodM10415a = C7747h.m10415a(cls, "createClassloaderNamespace", ClassLoader.class, cls2, String.class, String.class, cls3, cls3);
                Boolean bool = Boolean.FALSE;
                methodM10415a.invoke(null, classLoader2, 14, str, null, bool, bool);
                return;
            }
            C7744e.m10393a("NativeLibManager", "no need to process ld path", new Object[0]);
        } catch (Throwable th) {
            throw new C7714b(PatchStatus.CODE_LOAD_LIB_NS, th);
        }
    }

    /* renamed from: a */
    private void m10314a(Object obj, String str, Object obj2) throws Exception {
        Field fieldM10311a = m10311a(obj, str);
        Object[] objArr = (Object[]) fieldM10311a.get(obj);
        Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), objArr.length + 1);
        objArr2[0] = obj2;
        System.arraycopy(objArr, 0, objArr2, 1, objArr.length);
        fieldM10311a.set(obj, objArr2);
    }

    /* renamed from: a */
    private Object m10310a(File file) throws Exception {
        Constructor constructorM10413a = C7747h.m10413a(Class.forName("dalvik.system.DexPathList$Element"), File.class, Boolean.TYPE, File.class, DexFile.class);
        if (constructorM10413a != null) {
            return constructorM10413a.newInstance(file, Boolean.TRUE, null, null);
        }
        throw new Exception("make nativeElement fail no such constructor");
    }

    /* renamed from: a */
    private Field m10311a(Object obj, String str) throws Exception {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                return C7747h.m10414a(superclass, str);
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new Exception("Field " + str + " not found in " + obj.getClass());
    }
}
