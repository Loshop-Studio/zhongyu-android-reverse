package com.taobao.sophix.p090b.p091a.p093b;

import android.os.Build;
import com.taobao.sophix.core.dex.SophixNative;
import com.taobao.sophix.core.dex.hot.MethodReplace;
import com.taobao.sophix.p089a.C7714b;
import com.taobao.sophix.p090b.C7728b;
import com.taobao.sophix.p090b.p091a.InterfaceC7723a;
import com.taobao.sophix.p099e.C7741b;
import com.taobao.sophix.p099e.C7744e;
import com.taobao.sophix.p099e.C7748i;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Enumeration;

/* renamed from: com.taobao.sophix.b.a.b.b */
/* loaded from: classes5.dex */
public class C7727b implements InterfaceC7723a {

    /* renamed from: a */
    private static boolean f13351a = true;

    /* renamed from: b */
    private C7726a f13352b = new C7726a(C7728b.f13354b.getClassLoader());

    static {
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 31) {
            f13351a = false;
            return;
        }
        f13351a = true;
        if (SophixNative.initHotNative() && f13351a) {
            z10 = true;
        }
        f13351a = z10;
        if (z10) {
            f13351a = true ^ C7741b.m10378b();
        }
    }

    /* renamed from: a */
    public static boolean m10307a() {
        C7744e.m10402c("HotDexManager", "isSupport", Boolean.valueOf(f13351a));
        return f13351a;
    }

    @Override // com.taobao.sophix.p090b.p091a.InterfaceC7723a
    /* renamed from: a */
    public boolean mo10267a(File file) throws NoSuchMethodException, C7714b, IOException, ClassNotFoundException, SecurityException {
        boolean z10;
        Class<?> cls;
        C7744e.m10402c("HotDexManager", "patch", "sdk", Integer.valueOf(Build.VERSION.SDK_INT));
        File file2 = new File(file.getParentFile(), "hotfix-patch.odex");
        if (!file2.exists()) {
            z10 = true;
        } else if (C7748i.m10421b(file2)) {
            C7744e.m10400b("HotDexManager", "patch", "verifyOpt odex is legal");
            z10 = false;
        } else {
            C7744e.m10403d("HotDexManager", "patch", "verifyOpt fail, try to delete opt file.");
            if (!file2.delete()) {
                C7744e.m10404e("HotDexManager", "patch", "verifyOpt fail to delete opt file.");
                throw new C7714b(80, "verifyOpt fail to delete opt file");
            }
            z10 = true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            DexFile dexFileLoadDex = DexFile.loadDex(file.getPath(), file2.getAbsolutePath(), 0);
            this.f13352b.m10306a(dexFileLoadDex);
            C7744e.m10402c("HotDexManager", "patch", "loadDex time consumed(ms)", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            if (z10) {
                C7748i.m10422c(file2);
            }
            Enumeration<String> enumerationEntries = dexFileLoadDex.entries();
            while (enumerationEntries.hasMoreElements()) {
                String strNextElement = enumerationEntries.nextElement();
                try {
                    cls = Class.forName(strNextElement, true, C7728b.f13354b.getClassLoader());
                } catch (Throwable unused) {
                }
                try {
                    Class<?> cls2 = Class.forName(strNextElement, true, this.f13352b);
                    for (Constructor<?> constructor : cls2.getDeclaredConstructors()) {
                        if (constructor.getAnnotation(MethodReplace.class) != null) {
                            try {
                                Constructor<?> declaredConstructor = cls.getDeclaredConstructor(m10308a(constructor.getParameterTypes()));
                                C7744e.m10402c("HotDexManager", "patch replaceMethod", "oldConstructor", declaredConstructor, "newConstructor", constructor);
                                SophixNative.replaceMethod(declaredConstructor, constructor);
                            } catch (NoSuchMethodException e10) {
                                throw new C7714b(83, e10);
                            }
                        }
                    }
                    for (Method method : cls2.getDeclaredMethods()) {
                        if (method.getAnnotation(MethodReplace.class) != null) {
                            try {
                                Method declaredMethod = cls.getDeclaredMethod(method.getName(), m10308a(method.getParameterTypes()));
                                C7744e.m10402c("HotDexManager", "patch replaceMethod", "oldMethod", declaredMethod, "newMethod", method);
                                SophixNative.replaceMethod(declaredMethod, method);
                            } catch (NoSuchMethodException e11) {
                                throw new C7714b(84, e11);
                            }
                        }
                    }
                } catch (ClassNotFoundException e12) {
                    throw new C7714b(82, e12);
                }
            }
            return true;
        } catch (IOException e13) {
            throw new C7714b(81, e13);
        }
    }

    /* renamed from: a */
    private Class<?>[] m10308a(Class<?>[] clsArr) throws ClassNotFoundException {
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
