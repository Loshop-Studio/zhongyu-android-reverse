package p397x0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: x0.d */
/* loaded from: classes3.dex */
public final class C11758d {

    /* renamed from: a */
    public final Context f27936a;

    public C11758d(Context context) {
        this.f27936a = context;
    }

    /* renamed from: c */
    public static InterfaceC11756b m26015c(String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> cls = Class.forName(str);
            Object objNewInstance = null;
            try {
                objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            } catch (IllegalAccessException e10) {
                m26016d(cls, e10);
            } catch (InstantiationException e11) {
                m26016d(cls, e11);
            } catch (NoSuchMethodException e12) {
                m26016d(cls, e12);
            } catch (InvocationTargetException e13) {
                m26016d(cls, e13);
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
        } catch (ClassNotFoundException e14) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e14);
        }
    }

    /* renamed from: d */
    public static void m26016d(Class cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    /* renamed from: a */
    public final ApplicationInfo m26017a() {
        return this.f27936a.getPackageManager().getApplicationInfo(this.f27936a.getPackageName(), 128);
    }

    /* renamed from: b */
    public List m26018b() throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Log.isLoggable("ManifestParser", 3);
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfoM26017a = m26017a();
            if (applicationInfoM26017a != null && applicationInfoM26017a.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Objects.toString(applicationInfoM26017a.metaData);
                }
                for (String str : applicationInfoM26017a.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfoM26017a.metaData.get(str))) {
                        m26015c(str);
                        arrayList.add(null);
                        Log.isLoggable("ManifestParser", 3);
                    }
                }
                Log.isLoggable("ManifestParser", 3);
                return arrayList;
            }
            Log.isLoggable("ManifestParser", 3);
            return arrayList;
        } catch (PackageManager.NameNotFoundException e10) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e10);
            }
            return arrayList;
        }
    }
}
