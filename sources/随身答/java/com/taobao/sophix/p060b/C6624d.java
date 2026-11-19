package com.taobao.sophix.p060b;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.ArrayMap;
import com.google.android.material.color.AbstractC5826g;
import com.google.android.material.color.AbstractC5827h;
import com.taobao.sophix.PatchStatus;
import com.taobao.sophix.p059a.C6608b;
import com.taobao.sophix.p069e.C6638e;
import com.taobao.sophix.p069e.C6641h;
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
public class C6624d {

    /* renamed from: a */
    private Class f5496a;

    public C6624d() throws C6608b {
        try {
            this.f5496a = Class.forName("android.content.res.AssetManager");
        } catch (ClassNotFoundException e10) {
            throw new C6608b(82, e10);
        }
    }

    /* renamed from: b */
    private Field m4813b(String str) throws C6608b {
        try {
            return C6641h.m4902a(this.f5496a, str);
        } catch (Exception e10) {
            throw new C6608b(85, e10);
        }
    }

    /* renamed from: a */
    public boolean m4815a(File file) throws C6608b {
        if (Build.VERSION.SDK_INT >= 30 && m4814b(file)) {
            return true;
        }
        String path = file.getPath();
        try {
            m4811a(path);
            AssetManager assets = C6622b.f5489b.getAssets();
            synchronized (assets) {
                try {
                    try {
                        m4808a("addAssetPath", String.class).invoke(assets, path);
                        try {
                            m4809a();
                        } catch (Exception e10) {
                            throw new C6608b(PatchStatus.CODE_LOAD_RES_UPDATECONFIG, e10);
                        }
                    } catch (Exception e11) {
                        throw new C6608b(PatchStatus.CODE_LOAD_RES_ADDASSERTPATH, e11);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        } catch (Exception e12) {
            throw new C6608b(PatchStatus.CODE_LOAD_RES_INJECT_PATH, e12);
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    private boolean m4814b(File file) {
        C6638e.m4888b("ResourceManager", "patchV30", "start patch res file");
        try {
            ResourcesProvider resourcesProviderLoadFromApk = ResourcesProvider.loadFromApk(ParcelFileDescriptor.open(file, 268435456));
            AbstractC5827h.m4241a();
            ResourcesLoader resourcesLoaderM4240a = AbstractC5826g.m4240a();
            resourcesLoaderM4240a.addProvider(resourcesProviderLoadFromApk);
            C6622b.f5489b.getResources().addLoaders(resourcesLoaderM4240a);
            C6638e.m4888b("ResourceManager", "patchV30", "patch res file success");
            return true;
        } catch (Throwable unused) {
            C6638e.m4888b("ResourceManager", "patchV30", "patch res file error");
            return false;
        }
    }

    @TargetApi(24)
    /* renamed from: a */
    private void m4811a(String str) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Object obj = C6641h.m4902a(C6641h.f5550a, "mPackageInfo").get(C6622b.f5489b.getBaseContext());
        Field fieldM4902a = C6641h.m4902a(obj.getClass(), "mSplitResDirs");
        fieldM4902a.set(obj, m4812a((String[]) fieldM4902a.get(obj), str));
    }

    /* renamed from: a */
    private String[] m4812a(String[] strArr, String str) {
        int length = strArr != null ? strArr.length : 0;
        String[] strArr2 = new String[length + 1];
        if (strArr != null) {
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        }
        strArr2[length] = str;
        return strArr2;
    }

    /* renamed from: a */
    private void m4809a() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Collection collectionValues;
        Class<?> cls = Class.forName("android.app.ResourcesManager");
        Object objInvoke = C6641h.m4903a(cls, "getInstance", new Class[0]).invoke(null, null);
        try {
            collectionValues = ((ArrayMap) C6641h.m4902a(cls, "mActiveResources").get(objInvoke)).values();
        } catch (NoSuchFieldException unused) {
            collectionValues = (Collection) C6641h.m4902a(cls, "mResourceReferences").get(objInvoke);
        }
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            Resources resources = (Resources) ((WeakReference) it.next()).get();
            if (resources != null) {
                resources.updateConfiguration(resources.getConfiguration(), resources.getDisplayMetrics());
                C6638e.m4881a("ResourceManager", "update successfully", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    private void m4810a(AssetManager assetManager, Method method, String str) throws IllegalAccessException, C6608b, IllegalArgumentException, InvocationTargetException {
        Method methodM4808a = m4808a("destroy", new Class[0]);
        Method methodM4808a2 = m4808a("getStringBlockCount", new Class[0]);
        Method methodM4808a3 = m4808a("getCookieName", Integer.TYPE);
        Field fieldM4813b = m4813b("mStringBlocks");
        ArrayList arrayList = new ArrayList();
        int iIntValue = ((Integer) methodM4808a2.invoke(assetManager, null)).intValue();
        int i9 = 0;
        while (i9 < iIntValue) {
            i9++;
            String str2 = (String) methodM4808a3.invoke(assetManager, Integer.valueOf(i9));
            if (!str2.equals(str)) {
                arrayList.add(str2);
            }
        }
        methodM4808a.invoke(assetManager, null);
        fieldM4813b.set(assetManager, null);
        try {
            m4808a("init", new Class[0]).invoke(assetManager, null);
        } catch (Exception unused) {
            m4808a("init", Boolean.TYPE).invoke(assetManager, Boolean.FALSE);
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String str3 = (String) obj;
            C6638e.m4881a("ResourceManager", "add asset " + str3, new Object[0]);
            method.invoke(assetManager, str3);
        }
    }

    /* renamed from: a */
    private Method m4808a(String str, Class<?>... clsArr) throws C6608b {
        try {
            return C6641h.m4903a(this.f5496a, str, clsArr);
        } catch (NoSuchMethodException e10) {
            throw new C6608b(84, e10);
        }
    }
}
