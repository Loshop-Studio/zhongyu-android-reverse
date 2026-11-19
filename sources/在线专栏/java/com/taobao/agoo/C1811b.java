package com.taobao.agoo;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import java.util.ArrayList;

/* renamed from: com.taobao.agoo.b */
/* loaded from: classes.dex */
public class C1811b {
    public static final String TAG = "LocalStorage";

    /* renamed from: a */
    public static void m6185a(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str) || context == null) {
            ALog.m6090d(TAG, "saveAliasToken input invalid", new Object[0]);
            return;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
        if (TextUtils.isEmpty(str2)) {
            editorEdit.remove(m6186b(str));
            String string = defaultSharedPreferences.getString("alicloud-third-push-alias-list", "");
            String strM6183a = m6183a(str);
            if (string.contains(strM6183a)) {
                editorEdit.putString("alicloud-third-push-alias-list", string.replace(strM6183a, ""));
            }
        } else {
            editorEdit.putString(m6186b(str), str2);
            String string2 = defaultSharedPreferences.getString("alicloud-third-push-alias-list", "");
            String strM6183a2 = m6183a(str);
            if (!string2.contains(strM6183a2)) {
                editorEdit.putString("alicloud-third-push-alias-list", string2 + strM6183a2);
            }
        }
        editorEdit.apply();
    }

    /* renamed from: b */
    private static String m6186b(String str) {
        return "alicloud-third-push-pat-" + str;
    }

    /* renamed from: a */
    private static String m6183a(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        return "#&#" + str + "#&#";
    }

    /* renamed from: a */
    public static String m6182a(Context context, String str) {
        if (!TextUtils.isEmpty(str) && context != null) {
            return PreferenceManager.getDefaultSharedPreferences(context).getString(m6186b(str), null);
        }
        ALog.m6090d(TAG, "getAliasToken input invalid", new Object[0]);
        return null;
    }

    /* renamed from: a */
    public static ArrayList<String> m6184a(Context context) {
        String[] strArrSplit = PreferenceManager.getDefaultSharedPreferences(context).getString("alicloud-third-push-alias-list", "").split("#&#");
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i4 = 0; i4 < strArrSplit.length; i4++) {
            if (strArrSplit[i4] != null && !strArrSplit[i4].isEmpty()) {
                arrayList.add(strArrSplit[i4]);
            }
        }
        return arrayList;
    }
}
