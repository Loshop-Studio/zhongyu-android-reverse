package p318r5;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.Map;

/* renamed from: r5.l */
/* loaded from: classes5.dex */
public abstract class AbstractC10877l {
    /* renamed from: a */
    public static long m23517a(Context context, String str, String str2, long j10) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            AbstractC10861f1.m23441m("hmsSdk", "context is null or spName empty or spkey is empty");
            return j10;
        }
        SharedPreferences sharedPreferencesM23521e = m23521e(context, str);
        return sharedPreferencesM23521e != null ? sharedPreferencesM23521e.getLong(str2, j10) : j10;
    }

    /* renamed from: b */
    public static String m23518b(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            AbstractC10861f1.m23441m("hmsSdk", "context is null or spName empty or spkey is empty");
            return str3;
        }
        SharedPreferences sharedPreferencesM23521e = m23521e(context, str);
        return sharedPreferencesM23521e != null ? sharedPreferencesM23521e.getString(str2, str3) : str3;
    }

    /* renamed from: c */
    public static Map m23519c(Context context, String str) {
        return m23521e(context, str).getAll();
    }

    /* renamed from: d */
    public static void m23520d(Context context, String str, String... strArr) {
        if (context == null || TextUtils.isEmpty(str)) {
            AbstractC10861f1.m23441m("hmsSdk", "clearData(): parameter error.context,spname");
            return;
        }
        if (strArr == null) {
            AbstractC10861f1.m23441m("hmsSdk", "clearData(): No data need to be deleted,keys is null");
            return;
        }
        SharedPreferences sharedPreferencesM23521e = m23521e(context, str);
        if (sharedPreferencesM23521e != null) {
            SharedPreferences.Editor editorEdit = sharedPreferencesM23521e.edit();
            if (strArr.length == 0) {
                editorEdit.clear();
                editorEdit.commit();
                return;
            }
            for (String str2 : strArr) {
                if (sharedPreferencesM23521e.contains(str2)) {
                    editorEdit.remove(str2);
                    editorEdit.commit();
                }
            }
        }
    }

    /* renamed from: e */
    public static SharedPreferences m23521e(Context context, String str) {
        return context.getSharedPreferences(m23524h(context, str), 0);
    }

    /* renamed from: f */
    public static void m23522f(Context context, String str, String str2, long j10) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            AbstractC10861f1.m23441m("hmsSdk", "context is null or spName empty or spkey is empty");
            return;
        }
        SharedPreferences sharedPreferencesM23521e = m23521e(context, str);
        if (sharedPreferencesM23521e != null) {
            SharedPreferences.Editor editorEdit = sharedPreferencesM23521e.edit();
            editorEdit.putLong(str2, j10);
            editorEdit.commit();
        }
    }

    /* renamed from: g */
    public static void m23523g(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            AbstractC10861f1.m23440l("hmsSdk", "context is null or spName empty or spkey is empty");
            return;
        }
        SharedPreferences sharedPreferencesM23521e = m23521e(context, str);
        if (sharedPreferencesM23521e != null) {
            SharedPreferences.Editor editorEdit = sharedPreferencesM23521e.edit();
            editorEdit.putString(str2, str3);
            editorEdit.commit();
        }
    }

    /* renamed from: h */
    public static String m23524h(Context context, String str) {
        String packageName = context.getPackageName();
        String strM23376o = AbstractC10850c.m23376o("_hms_config_tag", "oper");
        if (TextUtils.isEmpty(strM23376o)) {
            return "hms_" + str + BundleUtil.UNDERLINE_TAG + packageName;
        }
        return "hms_" + str + BundleUtil.UNDERLINE_TAG + packageName + BundleUtil.UNDERLINE_TAG + strM23376o;
    }
}
