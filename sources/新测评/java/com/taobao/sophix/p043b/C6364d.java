package com.taobao.sophix.p043b;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.ArrayMap;
import com.google.android.material.color.AbstractC5535g;
import com.google.android.material.color.AbstractC5536h;
import com.taobao.sophix.p042a.C6348b;
import com.taobao.sophix.p052e.C6378e;
import com.taobao.sophix.p052e.C6381h;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.taobao.sophix.b.d */
/* loaded from: classes4.dex */
public class C6364d {

    /* renamed from: a */
    private Class f4919a;

    public C6364d() throws C6348b {
        try {
            this.f4919a = Class.forName("android.content.res.AssetManager");
        } catch (ClassNotFoundException e10) {
            throw new C6348b(82, e10);
        }
    }

    /* renamed from: b */
    private Field m4634b(String str) throws C6348b {
        try {
            return C6381h.m4723a(this.f4919a, str);
        } catch (Exception e10) {
            throw new C6348b(85, e10);
        }
    }

    /* renamed from: a */
    public boolean m4636a(File file) throws C6348b {
        if (Build.VERSION.SDK_INT >= 30 && m4635b(file)) {
            return true;
        }
        String path = file.getPath();
        try {
            m4632a(path);
            AssetManager assets = C6362b.f4912b.getAssets();
            synchronized (assets) {
                try {
                    try {
                        m4629a("addAssetPath", String.class).invoke(assets, path);
                        try {
                            m4630a();
                        } catch (Exception e10) {
                            throw new C6348b(122, e10);
                        }
                    } catch (Exception e11) {
                        throw new C6348b(123, e11);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        } catch (Exception e12) {
            throw new C6348b(121, e12);
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    private boolean m4635b(File file) {
        C6378e.m4709b("ResourceManager", "patchV30", "start patch res file");
        try {
            ResourcesProvider resourcesProviderLoadFromApk = ResourcesProvider.loadFromApk(ParcelFileDescriptor.open(file, 268435456));
            AbstractC5536h.m4026a();
            ResourcesLoader resourcesLoaderM4025a = AbstractC5535g.m4025a();
            resourcesLoaderM4025a.addProvider(resourcesProviderLoadFromApk);
            C6362b.f4912b.getResources().addLoaders(resourcesLoaderM4025a);
            C6378e.m4709b("ResourceManager", "patchV30", "patch res file success");
            return true;
        } catch (Throwable unused) {
            C6378e.m4709b("ResourceManager", "patchV30", "patch res file error");
            return false;
        }
    }

    @TargetApi(24)
    /* renamed from: a */
    private void m4632a(String str) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Object obj = C6381h.m4723a(C6381h.f4973a, "mPackageInfo").get(C6362b.f4912b.getBaseContext());
        Field fieldM4723a = C6381h.m4723a(obj.getClass(), "mSplitResDirs");
        fieldM4723a.set(obj, m4633a((String[]) fieldM4723a.get(obj), str));
    }

    /* renamed from: a */
    private String[] m4633a(String[] strArr, String str) {
        int length = strArr != null ? strArr.length : 0;
        String[] strArr2 = new String[length + 1];
        if (strArr != null) {
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        }
        strArr2[length] = str;
        return strArr2;
    }

    /* renamed from: a */
    private void m4630a() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Collection collectionValues;
        Class<?> cls = Class.forName("android.app.ResourcesManager");
        Object objInvoke = C6381h.m4724a(cls, "getInstance", new Class[0]).invoke(null, null);
        try {
            collectionValues = ((ArrayMap) C6381h.m4723a(cls, "mActiveResources").get(objInvoke)).values();
        } catch (NoSuchFieldException unused) {
            collectionValues = (Collection) C6381h.m4723a(cls, "mResourceReferences").get(objInvoke);
        }
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            Resources resources = (Resources) ((WeakReference) it.next()).get();
            if (resources != null) {
                resources.updateConfiguration(resources.getConfiguration(), resources.getDisplayMetrics());
                C6378e.m4702a("ResourceManager", "update successfully", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    private void m4631a(AssetManager assetManager, Method method, String str) throws IllegalAccessException, C6348b, IllegalArgumentException, InvocationTargetException {
        Method methodM4629a = m4629a("destroy", new Class[0]);
        Method methodM4629a2 = m4629a("getStringBlockCount", new Class[0]);
        Method methodM4629a3 = m4629a("getCookieName", Integer.TYPE);
        Field fieldM4634b = m4634b("mStringBlocks");
        ArrayList arrayList = new ArrayList();
        int iIntValue = ((Integer) methodM4629a2.invoke(assetManager, null)).intValue();
        int i10 = 0;
        while (i10 < iIntValue) {
            i10++;
            String str2 = (String) methodM4629a3.invoke(assetManager, Integer.valueOf(i10));
            if (!str2.equals(str)) {
                arrayList.add(str2);
            }
        }
        methodM4629a.invoke(assetManager, null);
        fieldM4634b.set(assetManager, null);
        try {
            m4629a("init", new Class[0]).invoke(assetManager, null);
        } catch (Exception unused) {
            m4629a("init", Boolean.TYPE).invoke(assetManager, Boolean.FALSE);
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            String str3 = (String) obj;
            C6378e.m4702a("ResourceManager", "add asset " + str3, new Object[0]);
            method.invoke(assetManager, str3);
        }
    }

    /* renamed from: a */
    private Method m4629a(String str, Class<?>... clsArr) throws C6348b {
        try {
            return C6381h.m4724a(this.f4919a, str, clsArr);
        } catch (NoSuchMethodException e10) {
            throw new C6348b(84, e10);
        }
    }
}
