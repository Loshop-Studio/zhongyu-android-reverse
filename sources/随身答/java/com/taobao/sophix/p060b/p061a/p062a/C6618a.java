package com.taobao.sophix.p060b.p061a.p062a;

import android.annotation.TargetApi;
import android.app.Application;
import android.os.Build;
import com.taobao.sophix.SophixManager;
import com.taobao.sophix.core.dex.ILibPathLoader;
import com.taobao.sophix.core.dex.SophixNative;
import com.taobao.sophix.p059a.C6608b;
import com.taobao.sophix.p059a.C6611e;
import com.taobao.sophix.p060b.C6622b;
import com.taobao.sophix.p069e.C6635b;
import com.taobao.sophix.p069e.C6638e;
import com.taobao.sophix.p069e.C6641h;
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
class C6618a extends PathClassLoader implements ILibPathLoader {

    /* renamed from: a */
    private final boolean f5466a;

    /* renamed from: b */
    private final Method f5467b;

    /* renamed from: c */
    private final Method f5468c;

    /* renamed from: d */
    private final Method f5469d;

    /* renamed from: e */
    private final Method f5470e;

    /* renamed from: f */
    private final Method f5471f;

    /* renamed from: g */
    private final Method f5472g;

    /* renamed from: h */
    private ClassLoader f5473h;

    /* renamed from: i */
    private ClassLoader f5474i;

    /* renamed from: j */
    private List<DexFile> f5475j;

    public C6618a(ClassLoader classLoader) throws IllegalAccessException, C6608b, SecurityException, IllegalArgumentException {
        super("", classLoader.getParent());
        this.f5475j = new ArrayList();
        try {
            synchronized (classLoader) {
                C6641h.m4902a(ClassLoader.class, "parent").set(classLoader, this);
            }
            this.f5473h = classLoader;
            this.f5468c = C6641h.m4903a(ClassLoader.class, "findLibrary", String.class);
            this.f5469d = C6641h.m4903a(ClassLoader.class, "findClass", String.class);
            this.f5467b = C6641h.m4903a(ClassLoader.class, "findResource", String.class);
            this.f5470e = C6641h.m4903a(ClassLoader.class, "findLoadedClass", String.class);
            this.f5472g = C6641h.m4903a(ClassLoader.class, "getPackage", String.class);
            this.f5471f = C6641h.m4903a(ClassLoader.class, "findResources", String.class);
            Build.BRAND.equals("zaszun#".replace("s", "m").replace("z", "s").replace("#", "g"));
            boolean zM4866b = C6635b.m4866b();
            this.f5466a = !zM4866b;
            this.f5474i = !zM4866b ? this : this.f5473h;
            if (zM4866b) {
                return;
            }
            Object obj = C6641h.m4902a(C6641h.f5550a, "mPackageInfo").get(C6622b.f5489b.getBaseContext());
            C6641h.m4902a(obj.getClass(), "mClassLoader").set(obj, this);
            Thread.currentThread().setContextClassLoader(this);
            if (C6619b.m4774b()) {
                m4761b(m4756a(C6622b.f5489b));
                m4757a();
            }
        } catch (IllegalAccessException e10) {
            throw new C6608b(86, e10);
        } catch (NoSuchFieldException e11) {
            throw new C6608b(85, e11);
        } catch (NoSuchMethodException e12) {
            throw new C6608b(84, e12);
        }
    }

    /* renamed from: a */
    private Object m4756a(Application application) {
        return C6641h.m4902a(Class.class.getClass(), "dexCache").get(application.getClass());
    }

    /* renamed from: b */
    private void m4761b(Object obj) throws C6608b {
        if (!SophixNative.clearResolvedCache(new File(C6622b.f5491d, "sophix.mkbm").getPath(), obj)) {
            throw new C6608b(78, "fail to clear cache! abort cold fix");
        }
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public Class<?> findClass(String str) throws ClassNotFoundException {
        boolean zM4760a = m4760a(str);
        if (this.f5466a) {
            try {
                Class<?> cls = (Class) this.f5470e.invoke(this.f5473h, str);
                if (cls != null) {
                    if (!zM4760a) {
                        Iterator<Class> it = C6619b.m4765a().iterator();
                        while (it.hasNext()) {
                            if (it.next().equals(cls)) {
                            }
                        }
                    }
                    return cls;
                }
            } catch (Exception e10) {
                if (((C6611e) SophixManager.getInstance()).m4747a()) {
                    C6638e.m4888b("ColdClassLoader", "findClass fail to find loaded class: " + str, e10);
                }
            }
        }
        if (zM4760a) {
            try {
                return (Class) this.f5469d.invoke(this.f5473h, str);
            } catch (Exception e11) {
                if (((C6611e) SophixManager.getInstance()).m4747a()) {
                    C6638e.m4880a("ColdClassLoader", "findClass fail to find kept class: " + str, e11, new Object[0]);
                }
            }
        }
        Iterator<DexFile> it2 = this.f5475j.iterator();
        while (it2.hasNext()) {
            Class<?> clsLoadClass = it2.next().loadClass(str, this.f5474i);
            if (clsLoadClass != null) {
                return clsLoadClass;
            }
        }
        try {
            Class<?> cls2 = (Class) this.f5469d.invoke(this.f5473h, str);
            if (cls2 != null) {
                return cls2;
            }
        } catch (Exception e12) {
            if (((C6611e) SophixManager.getInstance()).m4747a()) {
                C6638e.m4880a("ColdClassLoader", "findClass fail to find: " + str, e12, new Object[0]);
            }
        }
        try {
            Class<?> clsFindClass = super.findClass(str);
            if (clsFindClass != null) {
                return clsFindClass;
            }
        } catch (Exception e13) {
            if (((C6611e) SophixManager.getInstance()).m4747a()) {
                C6638e.m4880a("ColdClassLoader", "super findClass fail to find: " + str, e13, new Object[0]);
            }
        }
        throw new ClassNotFoundException();
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public String findLibrary(String str) {
        try {
            return (String) this.f5468c.invoke(this.f5473h, str);
        } catch (Exception e10) {
            C6638e.m4887b("ColdClassLoader", "findLibrary", e10, new Object[0]);
            return null;
        }
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public URL findResource(String str) {
        try {
        } catch (Exception e10) {
            C6638e.m4880a("ColdClassLoader", "findResource", e10, new Object[0]);
        }
        if (new ZipFile(C6622b.f5490c.getPath()).getEntry(str) != null) {
            return new URL("jar:" + C6622b.f5490c.toURI().toURL() + "!/" + str);
        }
        URL url = (URL) this.f5467b.invoke(this.f5473h, str);
        if (url != null) {
            return url;
        }
        C6638e.m4891d("ColdClassLoader", "findResource don't find " + str, new Object[0]);
        return null;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public Enumeration<URL> findResources(String str) throws IOException {
        Enumeration<URL> enumerationFindResources = super.findResources(str);
        if (enumerationFindResources != null && enumerationFindResources.hasMoreElements()) {
            return enumerationFindResources;
        }
        try {
            Enumeration<URL> enumeration = (Enumeration) this.f5471f.invoke(this.f5473h, str);
            if (enumeration != null) {
                if (enumeration.hasMoreElements()) {
                    return enumeration;
                }
            }
            return enumerationFindResources;
        } catch (Exception e10) {
            C6638e.m4887b("ColdClassLoader", "getResources appClassLoader name:" + str, e10, new Object[0]);
            return enumerationFindResources;
        }
    }

    @Override // com.taobao.sophix.core.dex.ILibPathLoader
    public String getLdLibraryPath() {
        if (this.f5473h instanceof BaseDexClassLoader) {
            try {
                return (String) C6641h.m4903a(BaseDexClassLoader.class, "getLdLibraryPath", new Class[0]).invoke(this.f5473h, null);
            } catch (Exception e10) {
                C6638e.m4887b("ColdClassLoader", "getLdLibraryPath", e10, new Object[0]);
            }
        }
        return null;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public Package getPackage(String str) {
        try {
            return (Package) this.f5472g.invoke(this.f5473h, str);
        } catch (Exception e10) {
            C6638e.m4887b("ColdClassLoader", "getPackage", e10, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    private void m4757a() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Field fieldM4902a = C6641h.m4902a(Class.class.getClass(), "classLoader");
        Iterator<Class> it = C6619b.m4765a().iterator();
        while (it.hasNext()) {
            fieldM4902a.set(it.next(), this);
        }
    }

    /* renamed from: a */
    private void m4758a(Object obj) throws C6608b {
        try {
            Object[] objArr = (Object[]) C6641h.m4902a(obj.getClass(), "resolvedTypes").get(obj);
            List<Class> listM4765a = C6619b.m4765a();
            for (int i9 = 0; i9 < objArr.length; i9++) {
                if (m4759a((Class) objArr[i9], listM4765a)) {
                    objArr[i9] = null;
                }
            }
        } catch (IllegalAccessException e10) {
            throw new C6608b(86, e10);
        } catch (NoSuchFieldException e11) {
            throw new C6608b(85, e11);
        }
    }

    /* renamed from: a */
    private boolean m4759a(Class cls, List<Class> list) {
        return (cls == null || cls.getClassLoader() == null || !cls.getClassLoader().equals(getClass().getClassLoader()) || list.contains(cls) || m4760a(cls.getName())) ? false : true;
    }

    /* renamed from: a */
    private boolean m4760a(String str) {
        return str.startsWith("com.taobao.sophix.") || str.startsWith("com.ali.fixHelper");
    }

    /* renamed from: a */
    public void m4762a(File file) throws C6608b, IOException {
        C6638e.m4881a("ColdClassLoader", "addDexFile", file.getName());
        try {
            this.f5475j.add(DexFile.loadDex(file.getPath(), C6619b.m4764a(file.getPath()), 0));
        } catch (IOException e10) {
            throw new C6608b(81, e10);
        }
    }
}
