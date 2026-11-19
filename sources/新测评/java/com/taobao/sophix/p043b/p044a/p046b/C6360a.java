package com.taobao.sophix.p043b.p044a.p046b;

import androidx.camera.core.processing.util.GLUtils;
import com.taobao.sophix.p042a.C6348b;
import com.taobao.sophix.p043b.C6362b;
import com.taobao.sophix.p052e.C6376c;
import com.taobao.sophix.p052e.C6378e;
import com.taobao.sophix.p052e.C6381h;
import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;

/* renamed from: com.taobao.sophix.b.a.b.a */
/* loaded from: classes4.dex */
class C6360a extends ClassLoader {

    /* renamed from: a */
    private Method f4905a;

    /* renamed from: b */
    private Method f4906b;

    /* renamed from: c */
    private ClassLoader f4907c;

    /* renamed from: d */
    private DexFile f4908d;

    public C6360a(ClassLoader classLoader) throws C6348b {
        super(classLoader);
        this.f4907c = classLoader;
        try {
            this.f4906b = C6381h.m4724a(ClassLoader.class, "findLibrary", String.class);
            this.f4905a = C6381h.m4724a(ClassLoader.class, "findResource", String.class);
        } catch (NoSuchMethodException e10) {
            throw new C6348b(84, e10);
        }
    }

    /* renamed from: a */
    public void m4615a(DexFile dexFile) {
        this.f4908d = dexFile;
    }

    @Override // java.lang.ClassLoader
    public String findLibrary(String str) {
        try {
            File file = new File(C6362b.f4915e, "lib" + str + ".so");
            if (!file.exists()) {
                C6376c.m4693a(new File((String) this.f4906b.invoke(getParent(), str)), file);
            }
            return file.getAbsolutePath();
        } catch (Throwable th) {
            C6378e.m4708b("HotClassLoader", "findLibrary", th, new Object[0]);
            return null;
        }
    }

    @Override // java.lang.ClassLoader
    public URL findResource(String str) {
        try {
            return (URL) this.f4905a.invoke(this.f4907c, str);
        } catch (Exception e10) {
            C6378e.m4708b("HotClassLoader", "findResource", e10, new Object[0]);
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
        Class<?> clsLoadClass = this.f4908d.loadClass(str, this);
        if (clsLoadClass == null) {
            return getParent().loadClass(str);
        }
        C6378e.m4709b("HotClassLoader", "loadClass", "clazzPatch", str);
        return clsLoadClass;
    }
}
