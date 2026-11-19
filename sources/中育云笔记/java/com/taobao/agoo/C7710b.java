package com.taobao.agoo;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import java.util.ArrayList;

/* renamed from: com.taobao.agoo.b */
/* loaded from: classes5.dex */
public class C7710b {
    public static final String TAG = "LocalStorage";

    /* renamed from: a */
    public static void m10211a(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str) || context == null) {
            ALog.m10116d(TAG, "saveAliasToken input invalid", new Object[0]);
            return;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
        if (TextUtils.isEmpty(str2)) {
            editorEdit.remove(m10212b(str));
            String string = defaultSharedPreferences.getString("alicloud-third-push-alias-list", "");
            String strM10209a = m10209a(str);
            if (string.contains(strM10209a)) {
                editorEdit.putString("alicloud-third-push-alias-list", string.replace(strM10209a, ""));
            }
        } else {
            editorEdit.putString(m10212b(str), str2);
            String string2 = defaultSharedPreferences.getString("alicloud-third-push-alias-list", "");
            String strM10209a2 = m10209a(str);
            if (!string2.contains(strM10209a2)) {
                editorEdit.putString("alicloud-third-push-alias-list", string2 + strM10209a2);
            }
        }
        editorEdit.apply();
    }

    /* renamed from: b */
    private static String m10212b(String str) {
        return "alicloud-third-push-pat-" + str;
    }

    /* renamed from: a */
    private static String m10209a(String str) {
        if (str != null && !str.isEmpty()) {
            return "#&#" + str + "#&#";
        }
        return "";
    }

    /* renamed from: a */
    public static String m10208a(Context context, String str) {
        if (!TextUtils.isEmpty(str) && context != null) {
            return PreferenceManager.getDefaultSharedPreferences(context).getString(m10212b(str), null);
        }
        ALog.m10116d(TAG, "getAliasToken input invalid", new Object[0]);
        return null;
    }

    /* renamed from: a */
    public static ArrayList<String> m10210a(Context context) {
        String[] strArrSplit = PreferenceManager.getDefaultSharedPreferences(context).getString("alicloud-third-push-alias-list", "").split("#&#");
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String str = strArrSplit[i10];
            if (str != null && !str.isEmpty()) {
                arrayList.add(strArrSplit[i10]);
            }
        }
        return arrayList;
    }
}
