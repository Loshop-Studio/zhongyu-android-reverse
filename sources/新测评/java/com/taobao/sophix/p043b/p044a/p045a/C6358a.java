package com.taobao.sophix.p043b.p044a.p045a;

import android.annotation.TargetApi;
import android.app.Application;
import android.os.Build;
import com.taobao.sophix.SophixManager;
import com.taobao.sophix.core.dex.ILibPathLoader;
import com.taobao.sophix.core.dex.SophixNative;
import com.taobao.sophix.p042a.C6348b;
import com.taobao.sophix.p042a.C6351e;
import com.taobao.sophix.p043b.C6362b;
import com.taobao.sophix.p052e.C6375b;
import com.taobao.sophix.p052e.C6378e;
import com.taobao.sophix.p052e.C6381h;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexFile;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipFile;

@TargetApi(14)
/* renamed from: com.taobao.sophix.b.a.a.a */
/* loaded from: classes4.dex */
class C6358a extends PathClassLoader implements ILibPathLoader {

    /* renamed from: a */
    private final boolean f4889a;

    /* renamed from: b */
    private final Method f4890b;

    /* renamed from: c */
    private final Method f4891c;

    /* renamed from: d */
    private final Method f4892d;

    /* renamed from: e */
    private final Method f4893e;

    /* renamed from: f */
    private final Method f4894f;

    /* renamed from: g */
    private final Method f4895g;

    /* renamed from: h */
    private ClassLoader f4896h;

    /* renamed from: i */
    private ClassLoader f4897i;

    /* renamed from: j */
    private List<DexFile> f4898j;

    public C6358a(ClassLoader classLoader) throws IllegalAccessException, C6348b, SecurityException, IllegalArgumentException {
        super("", classLoader.getParent());
        this.f4898j = new ArrayList();
        try {
            synchronized (classLoader) {
                C6381h.m4723a(ClassLoader.class, "parent").set(classLoader, this);
            }
            this.f4896h = classLoader;
            this.f4891c = C6381h.m4724a(ClassLoader.class, "findLibrary", String.class);
            this.f4892d = C6381h.m4724a(ClassLoader.class, "findClass", String.class);
            this.f4890b = C6381h.m4724a(ClassLoader.class, "findResource", String.class);
            this.f4893e = C6381h.m4724a(ClassLoader.class, "findLoadedClass", String.class);
            this.f4895g = C6381h.m4724a(ClassLoader.class, "getPackage", String.class);
            this.f4894f = C6381h.m4724a(ClassLoader.class, "findResources", String.class);
            Build.BRAND.equals("zaszun#".replace("s", "m").replace("z", "s").replace("#", "g"));
            boolean zM4687b = C6375b.m4687b();
            this.f4889a = !zM4687b;
            this.f4897i = !zM4687b ? this : this.f4896h;
            if (zM4687b) {
                return;
            }
            Object obj = C6381h.m4723a(C6381h.f4973a, "mPackageInfo").get(C6362b.f4912b.getBaseContext());
            C6381h.m4723a(obj.getClass(), "mClassLoader").set(obj, this);
            Thread.currentThread().setContextClassLoader(this);
            if (C6359b.m4595b()) {
                m4582b(m4577a(C6362b.f4912b));
                m4578a();
            }
        } catch (IllegalAccessException e10) {
            throw new C6348b(86, e10);
        } catch (NoSuchFieldException e11) {
            throw new C6348b(85, e11);
        } catch (NoSuchMethodException e12) {
            throw new C6348b(84, e12);
        }
    }

    /* renamed from: a */
    private Object m4577a(Application application) {
        return C6381h.m4723a(Class.class.getClass(), "dexCache").get(application.getClass());
    }

    /* renamed from: b */
    private void m4582b(Object obj) throws C6348b {
        if (!SophixNative.clearResolvedCache(new File(C6362b.f4914d, "sophix.mkbm").getPath(), obj)) {
            throw new C6348b(78, "fail to clear cache! abort cold fix");
        }
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public Class<?> findClass(String str) throws ClassNotFoundException {
        boolean zM4581a = m4581a(str);
        if (this.f4889a) {
            try {
                Class<?> cls = (Class) this.f4893e.invoke(this.f4896h, str);
                if (cls != null) {
                    if (!zM4581a) {
                        Iterator<Class> it = C6359b.m4586a().iterator();
                        while (it.hasNext()) {
                            if (it.next().equals(cls)) {
                            }
                        }
                    }
                    return cls;
                }
            } catch (Exception e10) {
                if (((C6351e) SophixManager.getInstance()).m4568a()) {
                    C6378e.m4709b("ColdClassLoader", "findClass fail to find loaded class: " + str, e10);
                }
            }
        }
        if (zM4581a) {
            try {
                return (Class) this.f4892d.invoke(this.f4896h, str);
            } catch (Exception e11) {
                if (((C6351e) SophixManager.getInstance()).m4568a()) {
                    C6378e.m4701a("ColdClassLoader", "findClass fail to find kept class: " + str, e11, new Object[0]);
                }
            }
        }
        Iterator<DexFile> it2 = this.f4898j.iterator();
        while (it2.hasNext()) {
            Class<?> clsLoadClass = it2.next().loadClass(str, this.f4897i);
            if (clsLoadClass != null) {
                return clsLoadClass;
            }
        }
        try {
            Class<?> cls2 = (Class) this.f4892d.invoke(this.f4896h, str);
            if (cls2 != null) {
                return cls2;
            }
        } catch (Exception e12) {
            if (((C6351e) SophixManager.getInstance()).m4568a()) {
                C6378e.m4701a("ColdClassLoader", "findClass fail to find: " + str, e12, new Object[0]);
            }
        }
        try {
            Class<?> clsFindClass = super.findClass(str);
            if (clsFindClass != null) {
                return clsFindClass;
            }
        } catch (Exception e13) {
            if (((C6351e) SophixManager.getInstance()).m4568a()) {
                C6378e.m4701a("ColdClassLoader", "super findClass fail to find: " + str, e13, new Object[0]);
            }
        }
        throw new ClassNotFoundException();
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public String findLibrary(String str) {
        try {
            return (String) this.f4891c.invoke(this.f4896h, str);
        } catch (Exception e10) {
            C6378e.m4708b("ColdClassLoader", "findLibrary", e10, new Object[0]);
            return null;
        }
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public URL findResource(String str) {
        try {
        } catch (Exception e10) {
            C6378e.m4701a("ColdClassLoader", "findResource", e10, new Object[0]);
        }
        if (new ZipFile(C6362b.f4913c.getPath()).getEntry(str) != null) {
            return new URL("jar:" + C6362b.f4913c.toURI().toURL() + "!/" + str);
        }
        URL url = (URL) this.f4890b.invoke(this.f4896h, str);
        if (url != null) {
            return url;
        }
        C6378e.m4712d("ColdClassLoader", "findResource don't find " + str, new Object[0]);
        return null;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public Enumeration<URL> findResources(String str) throws IOException {
        Enumeration<URL> enumerationFindResources = super.findResources(str);
        if (enumerationFindResources != null && enumerationFindResources.hasMoreElements()) {
            return enumerationFindResources;
        }
        try {
            Enumeration<URL> enumeration = (Enumeration) this.f4894f.invoke(this.f4896h, str);
            if (enumeration != null) {
                if (enumeration.hasMoreElements()) {
                    return enumeration;
                }
            }
            return enumerationFindResources;
        } catch (Exception e10) {
            C6378e.m4708b("ColdClassLoader", "getResources appClassLoader name:" + str, e10, new Object[0]);
            return enumerationFindResources;
        }
    }

    @Override // com.taobao.sophix.core.dex.ILibPathLoader
    public String getLdLibraryPath() {
        if (this.f4896h instanceof BaseDexClassLoader) {
            try {
                return (String) C6381h.m4724a(BaseDexClassLoader.class, "getLdLibraryPath", new Class[0]).invoke(this.f4896h, null);
            } catch (Exception e10) {
                C6378e.m4708b("ColdClassLoader", "getLdLibraryPath", e10, new Object[0]);
            }
        }
        return null;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public Package getPackage(String str) {
        try {
            return (Package) this.f4895g.invoke(this.f4896h, str);
        } catch (Exception e10) {
            C6378e.m4708b("ColdClassLoader", "getPackage", e10, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    private void m4578a() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Field fieldM4723a = C6381h.m4723a(Class.class.getClass(), "classLoader");
        Iterator<Class> it = C6359b.m4586a().iterator();
        while (it.hasNext()) {
            fieldM4723a.set(it.next(), this);
        }
    }

    /* renamed from: a */
    private void m4579a(Object obj) throws C6348b {
        try {
            Object[] objArr = (Object[]) C6381h.m4723a(obj.getClass(), "resolvedTypes").get(obj);
            List<Class> listM4586a = C6359b.m4586a();
            for (int i10 = 0; i10 < objArr.length; i10++) {
                if (m4580a((Class) objArr[i10], listM4586a)) {
                    objArr[i10] = null;
                }
            }
        } catch (IllegalAccessException e10) {
            throw new C6348b(86, e10);
        } catch (NoSuchFieldException e11) {
            throw new C6348b(85, e11);
        }
    }

    /* renamed from: a */
    private boolean m4580a(Class cls, List<Class> list) {
        return (cls == null || cls.getClassLoader() == null || !cls.getClassLoader().equals(getClass().getClassLoader()) || list.contains(cls) || m4581a(cls.getName())) ? false : true;
    }

    /* renamed from: a */
    private boolean m4581a(String str) {
        return str.startsWith("com.taobao.sophix.") || str.startsWith("com.ali.fixHelper");
    }

    /* renamed from: a */
    public void m4583a(File file) throws C6348b, IOException {
        C6378e.m4702a("ColdClassLoader", "addDexFile", file.getName());
        try {
            this.f4898j.add(DexFile.loadDex(file.getPath(), C6359b.m4585a(file.getPath()), 0));
        } catch (IOException e10) {
            throw new C6348b(81, e10);
        }
    }
}
