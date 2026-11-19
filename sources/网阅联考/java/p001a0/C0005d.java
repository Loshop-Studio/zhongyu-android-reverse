package p001a0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: a0.d */
/* loaded from: classes2.dex */
public final class C0005d {

    /* renamed from: a */
    public final Context f0a;

    public C0005d(Context context) {
        this.f0a = context;
    }

    /* renamed from: b */
    public static InterfaceC0003b m5b(String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        try {
            Class<?> cls = Class.forName(str);
            try {
                objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e4) {
                m6c(cls, e4);
                objNewInstance = null;
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
            } catch (InstantiationException e5) {
                m6c(cls, e5);
                objNewInstance = null;
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
            } catch (NoSuchMethodException e6) {
                m6c(cls, e6);
                objNewInstance = null;
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
            } catch (InvocationTargetException e7) {
                m6c(cls, e7);
                objNewInstance = null;
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
        } catch (ClassNotFoundException e8) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e8);
        }
    }

    /* renamed from: c */
    public static void m6c(Class cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    /* renamed from: a */
    public List m7a() throws IllegalAccessException, PackageManager.NameNotFoundException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Log.isLoggable("ManifestParser", 3);
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.f0a.getPackageManager().getApplicationInfo(this.f0a.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                Log.isLoggable("ManifestParser", 3);
                return arrayList;
            }
            if (Log.isLoggable("ManifestParser", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Got app info metadata: ");
                sb.append(applicationInfo.metaData);
            }
            for (String str : applicationInfo.metaData.keySet()) {
                if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                    m5b(str);
                    arrayList.add(null);
                    if (Log.isLoggable("ManifestParser", 3)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Loaded Glide module: ");
                        sb2.append(str);
                    }
                }
            }
            Log.isLoggable("ManifestParser", 3);
            return arrayList;
        } catch (PackageManager.NameNotFoundException e4) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e4);
        }
    }
}
