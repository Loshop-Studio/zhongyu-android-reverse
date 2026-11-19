package com.taobao.sophix.p060b.p061a.p063b;

import android.os.Build;
import com.taobao.sophix.core.dex.SophixNative;
import com.taobao.sophix.core.dex.hot.MethodReplace;
import com.taobao.sophix.p059a.C6608b;
import com.taobao.sophix.p060b.C6622b;
import com.taobao.sophix.p060b.p061a.InterfaceC6617a;
import com.taobao.sophix.p069e.C6635b;
import com.taobao.sophix.p069e.C6638e;
import com.taobao.sophix.p069e.C6642i;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Enumeration;

/* renamed from: com.taobao.sophix.b.a.b.b */
/* loaded from: classes4.dex */
public class C6621b implements InterfaceC6617a {

    /* renamed from: a */
    private static boolean f5486a = true;

    /* renamed from: b */
    private C6620a f5487b = new C6620a(C6622b.f5489b.getClassLoader());

    static {
        boolean z9 = false;
        if (Build.VERSION.SDK_INT >= 31) {
            f5486a = false;
            return;
        }
        f5486a = true;
        if (SophixNative.initHotNative() && f5486a) {
            z9 = true;
        }
        f5486a = z9;
        if (z9) {
            f5486a = true ^ C6635b.m4866b();
        }
    }

    /* renamed from: a */
    public static boolean m4795a() {
        C6638e.m4890c("HotDexManager", "isSupport", Boolean.valueOf(f5486a));
        return f5486a;
    }

    @Override // com.taobao.sophix.p060b.p061a.InterfaceC6617a
    /* renamed from: a */
    public boolean mo4755a(File file) throws NoSuchMethodException, C6608b, IOException, ClassNotFoundException, SecurityException {
        boolean z9;
        Class<?> cls;
        C6638e.m4890c("HotDexManager", "patch", "sdk", Integer.valueOf(Build.VERSION.SDK_INT));
        File file2 = new File(file.getParentFile(), "hotfix-patch.odex");
        if (!file2.exists()) {
            z9 = true;
        } else if (C6642i.m4909b(file2)) {
            C6638e.m4888b("HotDexManager", "patch", "verifyOpt odex is legal");
            z9 = false;
        } else {
            C6638e.m4891d("HotDexManager", "patch", "verifyOpt fail, try to delete opt file.");
            if (!file2.delete()) {
                C6638e.m4892e("HotDexManager", "patch", "verifyOpt fail to delete opt file.");
                throw new C6608b(80, "verifyOpt fail to delete opt file");
            }
            z9 = true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            DexFile dexFileLoadDex = DexFile.loadDex(file.getPath(), file2.getAbsolutePath(), 0);
            this.f5487b.m4794a(dexFileLoadDex);
            C6638e.m4890c("HotDexManager", "patch", "loadDex time consumed(ms)", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            if (z9) {
                C6642i.m4910c(file2);
            }
            Enumeration<String> enumerationEntries = dexFileLoadDex.entries();
            while (enumerationEntries.hasMoreElements()) {
                String strNextElement = enumerationEntries.nextElement();
                try {
                    cls = Class.forName(strNextElement, true, C6622b.f5489b.getClassLoader());
                } catch (Throwable unused) {
                }
                try {
                    Class<?> cls2 = Class.forName(strNextElement, true, this.f5487b);
                    for (Constructor<?> constructor : cls2.getDeclaredConstructors()) {
                        if (constructor.getAnnotation(MethodReplace.class) != null) {
                            try {
                                Constructor<?> declaredConstructor = cls.getDeclaredConstructor(m4796a(constructor.getParameterTypes()));
                                C6638e.m4890c("HotDexManager", "patch replaceMethod", "oldConstructor", declaredConstructor, "newConstructor", constructor);
                                SophixNative.replaceMethod(declaredConstructor, constructor);
                            } catch (NoSuchMethodException e10) {
                                throw new C6608b(83, e10);
                            }
                        }
                    }
                    for (Method method : cls2.getDeclaredMethods()) {
                        if (method.getAnnotation(MethodReplace.class) != null) {
                            try {
                                Method declaredMethod = cls.getDeclaredMethod(method.getName(), m4796a(method.getParameterTypes()));
                                C6638e.m4890c("HotDexManager", "patch replaceMethod", "oldMethod", declaredMethod, "newMethod", method);
                                SophixNative.replaceMethod(declaredMethod, method);
                            } catch (NoSuchMethodException e11) {
                                throw new C6608b(84, e11);
                            }
                        }
                    }
                } catch (ClassNotFoundException e12) {
                    throw new C6608b(82, e12);
                }
            }
            return true;
        } catch (IOException e13) {
            throw new C6608b(81, e13);
        }
    }

    /* renamed from: a */
    private Class<?>[] m4796a(Class<?>[] clsArr) throws ClassNotFoundException {
        Class<?>[] clsArr2 = new Class[clsArr.length];
        for (int i9 = 0; i9 != clsArr.length; i9++) {
            Class<?> cls = clsArr[i9];
            try {
                cls = Class.forName(cls.getName());
            } catch (ClassNotFoundException unused) {
            }
            clsArr2[i9] = cls;
        }
        return clsArr2;
    }
}
