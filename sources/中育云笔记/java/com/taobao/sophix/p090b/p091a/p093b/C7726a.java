package com.taobao.sophix.p090b.p091a.p093b;

import androidx.camera.core.processing.util.GLUtils;
import com.taobao.sophix.p089a.C7714b;
import com.taobao.sophix.p090b.C7728b;
import com.taobao.sophix.p099e.C7742c;
import com.taobao.sophix.p099e.C7744e;
import com.taobao.sophix.p099e.C7747h;
import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;

/* renamed from: com.taobao.sophix.b.a.b.a */
/* loaded from: classes5.dex */
class C7726a extends ClassLoader {

    /* renamed from: a */
    private Method f13347a;

    /* renamed from: b */
    private Method f13348b;

    /* renamed from: c */
    private ClassLoader f13349c;

    /* renamed from: d */
    private DexFile f13350d;

    public C7726a(ClassLoader classLoader) throws C7714b {
        super(classLoader);
        this.f13349c = classLoader;
        try {
            this.f13348b = C7747h.m10415a(ClassLoader.class, "findLibrary", String.class);
            this.f13347a = C7747h.m10415a(ClassLoader.class, "findResource", String.class);
        } catch (NoSuchMethodException e10) {
            throw new C7714b(84, e10);
        }
    }

    /* renamed from: a */
    public void m10306a(DexFile dexFile) {
        this.f13350d = dexFile;
    }

    @Override // java.lang.ClassLoader
    public String findLibrary(String str) {
        try {
            File file = new File(C7728b.f13357e, "lib" + str + ".so");
            if (!file.exists()) {
                C7742c.m10384a(new File((String) this.f13348b.invoke(getParent(), str)), file);
            }
            return file.getAbsolutePath();
        } catch (Throwable th) {
            C7744e.m10399b("HotClassLoader", "findLibrary", th, new Object[0]);
            return null;
        }
    }

    @Override // java.lang.ClassLoader
    public URL findResource(String str) {
        try {
            return (URL) this.f13347a.invoke(this.f13349c, str);
        } catch (Exception e10) {
            C7744e.m10399b("HotClassLoader", "findResource", e10, new Object[0]);
            return null;
        }
    }

    @Override // java.lang.ClassLoader
    public Package getPackage(String str) throws Throwable {
        if (str == null || str.isEmpty()) {
            return null;
        }
        synchronized (this) {
            try {
                try {
                    Package packageDefinePackage = super.getPackage(str);
                    if (packageDefinePackage == null) {
                        packageDefinePackage = definePackage(str, "Unknown", GLUtils.VERSION_UNKNOWN, "Unknown", "Unknown", GLUtils.VERSION_UNKNOWN, "Unknown", null);
                    }
                    return packageDefinePackage;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str) {
        Class<?> clsFindLoadedClass = findLoadedClass(str);
        if (clsFindLoadedClass != null && clsFindLoadedClass.getClassLoader() == this) {
            return clsFindLoadedClass;
        }
        Class<?> clsLoadClass = this.f13350d.loadClass(str, this);
        if (clsLoadClass == null) {
            return getParent().loadClass(str);
        }
        C7744e.m10400b("HotClassLoader", "loadClass", "clazzPatch", str);
        return clsLoadClass;
    }
}
