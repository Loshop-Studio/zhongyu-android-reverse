package com.taobao.sophix.p090b;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.ArrayMap;
import com.google.android.material.color.AbstractC6432g;
import com.google.android.material.color.AbstractC6433h;
import com.taobao.sophix.PatchStatus;
import com.taobao.sophix.p089a.C7714b;
import com.taobao.sophix.p099e.C7744e;
import com.taobao.sophix.p099e.C7747h;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.taobao.sophix.b.d */
/* loaded from: classes5.dex */
public class C7730d {

    /* renamed from: a */
    private Class f13361a;

    public C7730d() throws C7714b {
        try {
            this.f13361a = Class.forName("android.content.res.AssetManager");
        } catch (ClassNotFoundException e10) {
            throw new C7714b(82, e10);
        }
    }

    /* renamed from: b */
    private Field m10325b(String str) throws C7714b {
        try {
            return C7747h.m10414a(this.f13361a, str);
        } catch (Exception e10) {
            throw new C7714b(85, e10);
        }
    }

    /* renamed from: a */
    public boolean m10327a(File file) throws C7714b {
        if (Build.VERSION.SDK_INT >= 30 && m10326b(file)) {
            return true;
        }
        String path = file.getPath();
        try {
            m10323a(path);
            AssetManager assets = C7728b.f13354b.getAssets();
            synchronized (assets) {
                try {
                    try {
                        m10320a("addAssetPath", String.class).invoke(assets, path);
                        try {
                            m10321a();
                        } catch (Exception e10) {
                            throw new C7714b(122, e10);
                        }
                    } catch (Exception e11) {
                        throw new C7714b(PatchStatus.CODE_LOAD_RES_ADDASSERTPATH, e11);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        } catch (Exception e12) {
            throw new C7714b(PatchStatus.CODE_LOAD_RES_INJECT_PATH, e12);
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    private boolean m10326b(File file) {
        C7744e.m10400b("ResourceManager", "patchV30", "start patch res file");
        try {
            ResourcesProvider resourcesProviderLoadFromApk = ResourcesProvider.loadFromApk(ParcelFileDescriptor.open(file, 268435456));
            AbstractC6433h.m7935a();
            ResourcesLoader resourcesLoaderM7934a = AbstractC6432g.m7934a();
            resourcesLoaderM7934a.addProvider(resourcesProviderLoadFromApk);
            C7728b.f13354b.getResources().addLoaders(resourcesLoaderM7934a);
            C7744e.m10400b("ResourceManager", "patchV30", "patch res file success");
            return true;
        } catch (Throwable unused) {
            C7744e.m10400b("ResourceManager", "patchV30", "patch res file error");
            return false;
        }
    }

    @TargetApi(24)
    /* renamed from: a */
    private void m10323a(String str) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Object obj = C7747h.m10414a(C7747h.f13415a, "mPackageInfo").get(C7728b.f13354b.getBaseContext());
        Field fieldM10414a = C7747h.m10414a(obj.getClass(), "mSplitResDirs");
        fieldM10414a.set(obj, m10324a((String[]) fieldM10414a.get(obj), str));
    }

    /* renamed from: a */
    private String[] m10324a(String[] strArr, String str) {
        int length = strArr != null ? strArr.length : 0;
        String[] strArr2 = new String[length + 1];
        if (strArr != null) {
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        }
        strArr2[length] = str;
        return strArr2;
    }

    /* renamed from: a */
    private void m10321a() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Collection collectionValues;
        Class<?> cls = Class.forName("android.app.ResourcesManager");
        Object objInvoke = C7747h.m10415a(cls, "getInstance", new Class[0]).invoke(null, null);
        try {
            collectionValues = ((ArrayMap) C7747h.m10414a(cls, "mActiveResources").get(objInvoke)).values();
        } catch (NoSuchFieldException unused) {
            collectionValues = (Collection) C7747h.m10414a(cls, "mResourceReferences").get(objInvoke);
        }
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            Resources resources = (Resources) ((WeakReference) it.next()).get();
            if (resources != null) {
                resources.updateConfiguration(resources.getConfiguration(), resources.getDisplayMetrics());
                C7744e.m10393a("ResourceManager", "update successfully", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    private void m10322a(AssetManager assetManager, Method method, String str) throws IllegalAccessException, C7714b, IllegalArgumentException, InvocationTargetException {
        Method methodM10320a = m10320a("destroy", new Class[0]);
        Method methodM10320a2 = m10320a("getStringBlockCount", new Class[0]);
        Method methodM10320a3 = m10320a("getCookieName", Integer.TYPE);
        Field fieldM10325b = m10325b("mStringBlocks");
        ArrayList arrayList = new ArrayList();
        int iIntValue = ((Integer) methodM10320a2.invoke(assetManager, null)).intValue();
        int i10 = 0;
        while (i10 < iIntValue) {
            i10++;
            String str2 = (String) methodM10320a3.invoke(assetManager, Integer.valueOf(i10));
            if (!str2.equals(str)) {
                arrayList.add(str2);
            }
        }
        methodM10320a.invoke(assetManager, null);
        fieldM10325b.set(assetManager, null);
        try {
            m10320a("init", new Class[0]).invoke(assetManager, null);
        } catch (Exception unused) {
            m10320a("init", Boolean.TYPE).invoke(assetManager, Boolean.FALSE);
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            String str3 = (String) obj;
            C7744e.m10393a("ResourceManager", "add asset " + str3, new Object[0]);
            method.invoke(assetManager, str3);
        }
    }

    /* renamed from: a */
    private Method m10320a(String str, Class<?>... clsArr) throws C7714b {
        try {
            return C7747h.m10415a(this.f13361a, str, clsArr);
        } catch (NoSuchMethodException e10) {
            throw new C7714b(84, e10);
        }
    }
}
