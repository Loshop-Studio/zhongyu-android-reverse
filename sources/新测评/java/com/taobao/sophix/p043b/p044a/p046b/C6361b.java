package com.taobao.sophix.p043b.p044a.p046b;

import android.os.Build;
import com.taobao.sophix.core.dex.SophixNative;
import com.taobao.sophix.core.dex.hot.MethodReplace;
import com.taobao.sophix.p042a.C6348b;
import com.taobao.sophix.p043b.C6362b;
import com.taobao.sophix.p043b.p044a.InterfaceC6357a;
import com.taobao.sophix.p052e.C6375b;
import com.taobao.sophix.p052e.C6378e;
import com.taobao.sophix.p052e.C6382i;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Enumeration;

/* renamed from: com.taobao.sophix.b.a.b.b */
/* loaded from: classes4.dex */
public class C6361b implements InterfaceC6357a {

    /* renamed from: a */
    private static boolean f4909a = true;

    /* renamed from: b */
    private C6360a f4910b = new C6360a(C6362b.f4912b.getClassLoader());

    static {
        boolean z9 = false;
        if (Build.VERSION.SDK_INT >= 31) {
            f4909a = false;
            return;
        }
        f4909a = true;
        if (SophixNative.initHotNative() && f4909a) {
            z9 = true;
        }
        f4909a = z9;
        if (z9) {
            f4909a = true ^ C6375b.m4687b();
        }
    }

    /* renamed from: a */
    public static boolean m4616a() {
        C6378e.m4711c("HotDexManager", "isSupport", Boolean.valueOf(f4909a));
        return f4909a;
    }

    @Override // com.taobao.sophix.p043b.p044a.InterfaceC6357a
    /* renamed from: a */
    public boolean mo4576a(File file) throws NoSuchMethodException, C6348b, IOException, ClassNotFoundException, SecurityException {
        boolean z9;
        Class<?> cls;
        C6378e.m4711c("HotDexManager", "patch", "sdk", Integer.valueOf(Build.VERSION.SDK_INT));
        File file2 = new File(file.getParentFile(), "hotfix-patch.odex");
        if (!file2.exists()) {
            z9 = true;
        } else if (C6382i.m4730b(file2)) {
            C6378e.m4709b("HotDexManager", "patch", "verifyOpt odex is legal");
            z9 = false;
        } else {
            C6378e.m4712d("HotDexManager", "patch", "verifyOpt fail, try to delete opt file.");
            if (!file2.delete()) {
                C6378e.m4713e("HotDexManager", "patch", "verifyOpt fail to delete opt file.");
                throw new C6348b(80, "verifyOpt fail to delete opt file");
            }
            z9 = true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            DexFile dexFileLoadDex = DexFile.loadDex(file.getPath(), file2.getAbsolutePath(), 0);
            this.f4910b.m4615a(dexFileLoadDex);
            C6378e.m4711c("HotDexManager", "patch", "loadDex time consumed(ms)", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            if (z9) {
                C6382i.m4731c(file2);
            }
            Enumeration<String> enumerationEntries = dexFileLoadDex.entries();
            while (enumerationEntries.hasMoreElements()) {
                String strNextElement = enumerationEntries.nextElement();
                try {
                    cls = Class.forName(strNextElement, true, C6362b.f4912b.getClassLoader());
                } catch (Throwable unused) {
                }
                try {
                    Class<?> cls2 = Class.forName(strNextElement, true, this.f4910b);
                    for (Constructor<?> constructor : cls2.getDeclaredConstructors()) {
                        if (constructor.getAnnotation(MethodReplace.class) != null) {
                            try {
                                Constructor<?> declaredConstructor = cls.getDeclaredConstructor(m4617a(constructor.getParameterTypes()));
                                C6378e.m4711c("HotDexManager", "patch replaceMethod", "oldConstructor", declaredConstructor, "newConstructor", constructor);
                                SophixNative.replaceMethod(declaredConstructor, constructor);
                            } catch (NoSuchMethodException e10) {
                                throw new C6348b(83, e10);
                            }
                        }
                    }
                    for (Method method : cls2.getDeclaredMethods()) {
                        if (method.getAnnotation(MethodReplace.class) != null) {
                            try {
                                Method declaredMethod = cls.getDeclaredMethod(method.getName(), m4617a(method.getParameterTypes()));
                                C6378e.m4711c("HotDexManager", "patch replaceMethod", "oldMethod", declaredMethod, "newMethod", method);
                                SophixNative.replaceMethod(declaredMethod, method);
                            } catch (NoSuchMethodException e11) {
                                throw new C6348b(84, e11);
                            }
                        }
                    }
                } catch (ClassNotFoundException e12) {
                    throw new C6348b(82, e12);
                }
            }
            return true;
        } catch (IOException e13) {
            throw new C6348b(81, e13);
        }
    }

    /* renamed from: a */
    private Class<?>[] m4617a(Class<?>[] clsArr) throws ClassNotFoundException {
        Class<?>[] clsArr2 = new Class[clsArr.length];
        for (int i10 = 0; i10 != clsArr.length; i10++) {
            Class<?> cls = clsArr[i10];
            try {
                cls = Class.forName(cls.getName());
            } catch (ClassNotFoundException unused) {
            }
            clsArr2[i10] = cls;
        }
        return clsArr2;
    }
}
