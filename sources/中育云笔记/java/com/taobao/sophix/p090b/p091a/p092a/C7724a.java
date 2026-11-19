package com.taobao.sophix.p090b.p091a.p092a;

import android.annotation.TargetApi;
import android.app.Application;
import android.os.Build;
import com.taobao.sophix.SophixManager;
import com.taobao.sophix.core.dex.ILibPathLoader;
import com.taobao.sophix.core.dex.SophixNative;
import com.taobao.sophix.p089a.C7714b;
import com.taobao.sophix.p089a.C7717e;
import com.taobao.sophix.p090b.C7728b;
import com.taobao.sophix.p099e.C7741b;
import com.taobao.sophix.p099e.C7744e;
import com.taobao.sophix.p099e.C7747h;
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
import org.eclipse.paho.client.mqttv3.MqttTopic;

@TargetApi(14)
/* renamed from: com.taobao.sophix.b.a.a.a */
/* loaded from: classes5.dex */
class C7724a extends PathClassLoader implements ILibPathLoader {

    /* renamed from: a */
    private final boolean f13331a;

    /* renamed from: b */
    private final Method f13332b;

    /* renamed from: c */
    private final Method f13333c;

    /* renamed from: d */
    private final Method f13334d;

    /* renamed from: e */
    private final Method f13335e;

    /* renamed from: f */
    private final Method f13336f;

    /* renamed from: g */
    private final Method f13337g;

    /* renamed from: h */
    private ClassLoader f13338h;

    /* renamed from: i */
    private ClassLoader f13339i;

    /* renamed from: j */
    private List<DexFile> f13340j;

    public C7724a(ClassLoader classLoader) throws IllegalAccessException, C7714b, SecurityException, IllegalArgumentException {
        super("", classLoader.getParent());
        this.f13340j = new ArrayList();
        try {
            synchronized (classLoader) {
                C7747h.m10414a(ClassLoader.class, "parent").set(classLoader, this);
            }
            this.f13338h = classLoader;
            this.f13333c = C7747h.m10415a(ClassLoader.class, "findLibrary", String.class);
            this.f13334d = C7747h.m10415a(ClassLoader.class, "findClass", String.class);
            this.f13332b = C7747h.m10415a(ClassLoader.class, "findResource", String.class);
            this.f13335e = C7747h.m10415a(ClassLoader.class, "findLoadedClass", String.class);
            this.f13337g = C7747h.m10415a(ClassLoader.class, "getPackage", String.class);
            this.f13336f = C7747h.m10415a(ClassLoader.class, "findResources", String.class);
            Build.BRAND.equals("zaszun#".replace("s", "m").replace("z", "s").replace(MqttTopic.MULTI_LEVEL_WILDCARD, "g"));
            boolean zM10378b = C7741b.m10378b();
            this.f13331a = !zM10378b;
            this.f13339i = !zM10378b ? this : this.f13338h;
            if (zM10378b) {
                return;
            }
            Object obj = C7747h.m10414a(C7747h.f13415a, "mPackageInfo").get(C7728b.f13354b.getBaseContext());
            C7747h.m10414a(obj.getClass(), "mClassLoader").set(obj, this);
            Thread.currentThread().setContextClassLoader(this);
            if (C7725b.m10286b()) {
                m10273b(m10268a(C7728b.f13354b));
                m10269a();
            }
        } catch (IllegalAccessException e10) {
            throw new C7714b(86, e10);
        } catch (NoSuchFieldException e11) {
            throw new C7714b(85, e11);
        } catch (NoSuchMethodException e12) {
            throw new C7714b(84, e12);
        }
    }

    /* renamed from: a */
    private Object m10268a(Application application) {
        return C7747h.m10414a(Class.class.getClass(), "dexCache").get(application.getClass());
    }

    /* renamed from: b */
    private void m10273b(Object obj) throws C7714b {
        if (!SophixNative.clearResolvedCache(new File(C7728b.f13356d, "sophix.mkbm").getPath(), obj)) {
            throw new C7714b(78, "fail to clear cache! abort cold fix");
        }
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public Class<?> findClass(String str) throws ClassNotFoundException {
        boolean zM10272a = m10272a(str);
        if (this.f13331a) {
            try {
                Class<?> cls = (Class) this.f13335e.invoke(this.f13338h, str);
                if (cls != null) {
                    if (!zM10272a) {
                        Iterator<Class> it = C7725b.m10277a().iterator();
                        while (it.hasNext()) {
                            if (it.next().equals(cls)) {
                            }
                        }
                    }
                    return cls;
                }
            } catch (Exception e10) {
                if (((C7717e) SophixManager.getInstance()).m10259a()) {
                    C7744e.m10400b("ColdClassLoader", "findClass fail to find loaded class: " + str, e10);
                }
            }
        }
        if (zM10272a) {
            try {
                return (Class) this.f13334d.invoke(this.f13338h, str);
            } catch (Exception e11) {
                if (((C7717e) SophixManager.getInstance()).m10259a()) {
                    C7744e.m10392a("ColdClassLoader", "findClass fail to find kept class: " + str, e11, new Object[0]);
                }
            }
        }
        Iterator<DexFile> it2 = this.f13340j.iterator();
        while (it2.hasNext()) {
            Class<?> clsLoadClass = it2.next().loadClass(str, this.f13339i);
            if (clsLoadClass != null) {
                return clsLoadClass;
            }
        }
        try {
            Class<?> cls2 = (Class) this.f13334d.invoke(this.f13338h, str);
            if (cls2 != null) {
                return cls2;
            }
        } catch (Exception e12) {
            if (((C7717e) SophixManager.getInstance()).m10259a()) {
                C7744e.m10392a("ColdClassLoader", "findClass fail to find: " + str, e12, new Object[0]);
            }
        }
        try {
            Class<?> clsFindClass = super.findClass(str);
            if (clsFindClass != null) {
                return clsFindClass;
            }
        } catch (Exception e13) {
            if (((C7717e) SophixManager.getInstance()).m10259a()) {
                C7744e.m10392a("ColdClassLoader", "super findClass fail to find: " + str, e13, new Object[0]);
            }
        }
        throw new ClassNotFoundException();
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public String findLibrary(String str) {
        try {
            return (String) this.f13333c.invoke(this.f13338h, str);
        } catch (Exception e10) {
            C7744e.m10399b("ColdClassLoader", "findLibrary", e10, new Object[0]);
            return null;
        }
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public URL findResource(String str) {
        try {
        } catch (Exception e10) {
            C7744e.m10392a("ColdClassLoader", "findResource", e10, new Object[0]);
        }
        if (new ZipFile(C7728b.f13355c.getPath()).getEntry(str) != null) {
            return new URL("jar:" + C7728b.f13355c.toURI().toURL() + "!/" + str);
        }
        URL url = (URL) this.f13332b.invoke(this.f13338h, str);
        if (url != null) {
            return url;
        }
        C7744e.m10403d("ColdClassLoader", "findResource don't find " + str, new Object[0]);
        return null;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public Enumeration<URL> findResources(String str) throws IOException {
        Enumeration<URL> enumerationFindResources = super.findResources(str);
        if (enumerationFindResources != null && enumerationFindResources.hasMoreElements()) {
            return enumerationFindResources;
        }
        try {
            Enumeration<URL> enumeration = (Enumeration) this.f13336f.invoke(this.f13338h, str);
            if (enumeration != null) {
                if (enumeration.hasMoreElements()) {
                    return enumeration;
                }
            }
            return enumerationFindResources;
        } catch (Exception e10) {
            C7744e.m10399b("ColdClassLoader", "getResources appClassLoader name:" + str, e10, new Object[0]);
            return enumerationFindResources;
        }
    }

    @Override // com.taobao.sophix.core.dex.ILibPathLoader
    public String getLdLibraryPath() {
        if (this.f13338h instanceof BaseDexClassLoader) {
            try {
                return (String) C7747h.m10415a(BaseDexClassLoader.class, "getLdLibraryPath", new Class[0]).invoke(this.f13338h, null);
            } catch (Exception e10) {
                C7744e.m10399b("ColdClassLoader", "getLdLibraryPath", e10, new Object[0]);
            }
        }
        return null;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public Package getPackage(String str) {
        try {
            return (Package) this.f13337g.invoke(this.f13338h, str);
        } catch (Exception e10) {
            C7744e.m10399b("ColdClassLoader", "getPackage", e10, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    private void m10269a() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Field fieldM10414a = C7747h.m10414a(Class.class.getClass(), "classLoader");
        Iterator<Class> it = C7725b.m10277a().iterator();
        while (it.hasNext()) {
            fieldM10414a.set(it.next(), this);
        }
    }

    /* renamed from: a */
    private void m10270a(Object obj) throws C7714b {
        try {
            Object[] objArr = (Object[]) C7747h.m10414a(obj.getClass(), "resolvedTypes").get(obj);
            List<Class> listM10277a = C7725b.m10277a();
            for (int i10 = 0; i10 < objArr.length; i10++) {
                if (m10271a((Class) objArr[i10], listM10277a)) {
                    objArr[i10] = null;
                }
            }
        } catch (IllegalAccessException e10) {
            throw new C7714b(86, e10);
        } catch (NoSuchFieldException e11) {
            throw new C7714b(85, e11);
        }
    }

    /* renamed from: a */
    private boolean m10271a(Class cls, List<Class> list) {
        return (cls == null || cls.getClassLoader() == null || !cls.getClassLoader().equals(getClass().getClassLoader()) || list.contains(cls) || m10272a(cls.getName())) ? false : true;
    }

    /* renamed from: a */
    private boolean m10272a(String str) {
        return str.startsWith("com.taobao.sophix.") || str.startsWith("com.ali.fixHelper");
    }

    /* renamed from: a */
    public void m10274a(File file) throws C7714b, IOException {
        C7744e.m10393a("ColdClassLoader", "addDexFile", file.getName());
        try {
            this.f13340j.add(DexFile.loadDex(file.getPath(), C7725b.m10276a(file.getPath()), 0));
        } catch (IOException e10) {
            throw new C7714b(81, e10);
        }
    }
}
