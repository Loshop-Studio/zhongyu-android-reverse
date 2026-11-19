package p129e5;

import android.content.Context;
import android.content.SharedPreferences;
import com.huawei.hms.support.log.HMSLog;
import java.io.File;
import java.lang.reflect.Constructor;

/* renamed from: e5.b */
/* loaded from: classes5.dex */
public class C9105b {

    /* renamed from: a */
    public SharedPreferences f21272a;

    public C9105b(Context context, String str) throws NoSuchMethodException, SecurityException {
        if (context == null) {
            throw new NullPointerException("context is null!");
        }
        Context contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("move_to_de_records", 0);
        if (sharedPreferences.getBoolean(str, false)) {
            context = contextCreateDeviceProtectedStorageContext;
        } else if (contextCreateDeviceProtectedStorageContext.moveSharedPreferencesFrom(context, str)) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putBoolean(str, true);
            editorEdit.apply();
            context = contextCreateDeviceProtectedStorageContext;
        }
        SharedPreferences sharedPreferencesM17891b = m17891b(context, str);
        this.f21272a = sharedPreferencesM17891b;
        if (sharedPreferencesM17891b == null) {
            HMSLog.m8728w("PushPreferences", "get new sharedPreferences failed,start to get from context. ");
            this.f21272a = context.getSharedPreferences(str, 0);
        }
    }

    /* renamed from: a */
    public final File m17890a(Context context, String str) {
        try {
            File file = new File(context.getDataDir() + "/shared_prefs", str + ".xml");
            if (file.exists()) {
                return file;
            }
            return null;
        } catch (Exception e10) {
            HMSLog.m8725e("PushPreferences", "get failed error." + e10.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public final SharedPreferences m17891b(Context context, String str) throws NoSuchMethodException, SecurityException {
        File fileM17890a = m17890a(context, str);
        if (fileM17890a == null) {
            return null;
        }
        try {
            Constructor<?> declaredConstructor = Class.forName("android.app.SharedPreferencesImpl").getDeclaredConstructor(File.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            return (SharedPreferences) declaredConstructor.newInstance(fileM17890a, 0);
        } catch (Exception e10) {
            HMSLog.m8725e("PushPreferences", "get SharedPreferences error." + e10.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public boolean m17892c(String str) {
        SharedPreferences sharedPreferences = this.f21272a;
        return sharedPreferences != null && sharedPreferences.contains(str);
    }

    /* renamed from: d */
    public boolean m17893d(String str) {
        SharedPreferences sharedPreferences = this.f21272a;
        return sharedPreferences != null && sharedPreferences.getBoolean(str, false);
    }

    /* renamed from: e */
    public String m17894e(String str) {
        SharedPreferences sharedPreferences = this.f21272a;
        return sharedPreferences != null ? sharedPreferences.getString(str, "") : "";
    }

    /* renamed from: f */
    public boolean m17895f(String str) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences sharedPreferences = this.f21272a;
        if (sharedPreferences == null || !sharedPreferences.contains(str) || (editorEdit = this.f21272a.edit()) == null) {
            return false;
        }
        return editorEdit.remove(str).commit();
    }

    /* renamed from: g */
    public void m17896g(String str, boolean z10) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences sharedPreferences = this.f21272a;
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
            return;
        }
        editorEdit.putBoolean(str, z10).commit();
    }

    /* renamed from: h */
    public void m17897h(String str, Long l10) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences sharedPreferences = this.f21272a;
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
            return;
        }
        editorEdit.putLong(str, l10.longValue()).commit();
    }

    /* renamed from: i */
    public boolean m17898i(String str, String str2) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences sharedPreferences = this.f21272a;
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
            return false;
        }
        return editorEdit.putString(str, str2).commit();
    }
}
