package com.taobao.sophix.p060b.p061a.p063b;

import androidx.camera.core.processing.util.GLUtils;
import com.taobao.sophix.p059a.C6608b;
import com.taobao.sophix.p060b.C6622b;
import com.taobao.sophix.p069e.C6636c;
import com.taobao.sophix.p069e.C6638e;
import com.taobao.sophix.p069e.C6641h;
import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;

/* renamed from: com.taobao.sophix.b.a.b.a */
/* loaded from: classes4.dex */
class C6620a extends ClassLoader {

    /* renamed from: a */
    private Method f5482a;

    /* renamed from: b */
    private Method f5483b;

    /* renamed from: c */
    private ClassLoader f5484c;

    /* renamed from: d */
    private DexFile f5485d;

    public C6620a(ClassLoader classLoader) throws C6608b {
        super(classLoader);
        this.f5484c = classLoader;
        try {
            this.f5483b = C6641h.m4903a(ClassLoader.class, "findLibrary", String.class);
            this.f5482a = C6641h.m4903a(ClassLoader.class, "findResource", String.class);
        } catch (NoSuchMethodException e10) {
            throw new C6608b(84, e10);
        }
    }

    /* renamed from: a */
    public void m4794a(DexFile dexFile) {
        this.f5485d = dexFile;
    }

    @Override // java.lang.ClassLoader
    public String findLibrary(String str) {
        try {
            File file = new File(C6622b.f5492e, "lib" + str + ".so");
            if (!file.exists()) {
                C6636c.m4872a(new File((String) this.f5483b.invoke(getParent(), str)), file);
            }
            return file.getAbsolutePath();
        } catch (Throwable th) {
            C6638e.m4887b("HotClassLoader", "findLibrary", th, new Object[0]);
            return null;
        }
    }

    @Override // java.lang.ClassLoader
    public URL findResource(String str) {
        try {
            return (URL) this.f5482a.invoke(this.f5484c, str);
        } catch (Exception e10) {
            C6638e.m4887b("HotClassLoader", "findResource", e10, new Object[0]);
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
        Class<?> clsLoadClass = this.f5485d.loadClass(str, this);
        if (clsLoadClass == null) {
            return getParent().loadClass(str);
        }
        C6638e.m4888b("HotClassLoader", "loadClass", "clazzPatch", str);
        return clsLoadClass;
    }
}
