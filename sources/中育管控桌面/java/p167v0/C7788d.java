package p167v0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: v0.d */
/* loaded from: classes3.dex */
public final class C7788d {

    /* renamed from: a */
    public final Context f10307a;

    public C7788d(Context context) {
        this.f10307a = context;
    }

    /* renamed from: c */
    public static InterfaceC7786b m9321c(String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> cls = Class.forName(str);
            Object objNewInstance = null;
            try {
                objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            } catch (IllegalAccessException e6) {
                m9322d(cls, e6);
            } catch (InstantiationException e7) {
                m9322d(cls, e7);
            } catch (NoSuchMethodException e8) {
                m9322d(cls, e8);
            } catch (InvocationTargetException e9) {
                m9322d(cls, e9);
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
        } catch (ClassNotFoundException e10) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e10);
        }
    }

    /* renamed from: d */
    public static void m9322d(Class cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    /* renamed from: a */
    public final ApplicationInfo m9323a() {
        return this.f10307a.getPackageManager().getApplicationInfo(this.f10307a.getPackageName(), 128);
    }

    /* renamed from: b */
    public List m9324b() throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Log.isLoggable("ManifestParser", 3);
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfoM9323a = m9323a();
            if (applicationInfoM9323a != null && applicationInfoM9323a.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Objects.toString(applicationInfoM9323a.metaData);
                }
                for (String str : applicationInfoM9323a.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfoM9323a.metaData.get(str))) {
                        m9321c(str);
                        arrayList.add(null);
                        Log.isLoggable("ManifestParser", 3);
                    }
                }
                Log.isLoggable("ManifestParser", 3);
                return arrayList;
            }
            Log.isLoggable("ManifestParser", 3);
            return arrayList;
        } catch (PackageManager.NameNotFoundException e6) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e6);
            }
            return arrayList;
        }
    }
}
