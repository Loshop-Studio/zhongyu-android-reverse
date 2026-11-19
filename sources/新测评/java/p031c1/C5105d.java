package p031c1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: c1.d */
/* loaded from: classes3.dex */
public final class C5105d {

    /* renamed from: a */
    public final Context f2665a;

    public C5105d(Context context) {
        this.f2665a = context;
    }

    /* renamed from: c */
    public static InterfaceC5103b m2722c(String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> cls = Class.forName(str);
            Object objNewInstance = null;
            try {
                objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            } catch (IllegalAccessException e10) {
                m2723d(cls, e10);
            } catch (InstantiationException e11) {
                m2723d(cls, e11);
            } catch (NoSuchMethodException e12) {
                m2723d(cls, e12);
            } catch (InvocationTargetException e13) {
                m2723d(cls, e13);
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
        } catch (ClassNotFoundException e14) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e14);
        }
    }

    /* renamed from: d */
    public static void m2723d(Class cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    /* renamed from: a */
    public final ApplicationInfo m2724a() {
        return this.f2665a.getPackageManager().getApplicationInfo(this.f2665a.getPackageName(), 128);
    }

    /* renamed from: b */
    public List m2725b() throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Log.isLoggable("ManifestParser", 3);
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfoM2724a = m2724a();
            if (applicationInfoM2724a != null && applicationInfoM2724a.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Objects.toString(applicationInfoM2724a.metaData);
                }
                for (String str : applicationInfoM2724a.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfoM2724a.metaData.get(str))) {
                        m2722c(str);
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
