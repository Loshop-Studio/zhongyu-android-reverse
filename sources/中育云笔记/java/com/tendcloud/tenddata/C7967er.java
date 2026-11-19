package com.tendcloud.tenddata;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;

/* renamed from: com.tendcloud.tenddata.er */
/* loaded from: classes5.dex */
public class C7967er {
    /* renamed from: a */
    public static boolean m11908a(Context context) {
        PackageManager packageManager;
        try {
            if (C7963en.m11892i() && (packageManager = context.getPackageManager()) != null) {
                if (packageManager.resolveContentProvider("com.meizu.flyme.openidsdk", 0) != null) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static void reflectMEiZU(Context context) {
        try {
            Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"oaid"}, null);
            if (cursorQuery != null) {
                cursorQuery.moveToFirst();
                String string = cursorQuery.getString(cursorQuery.getColumnIndex("value"));
                if (string != null) {
                    C7994fr.m11998a().setOAID(string);
                }
                cursorQuery.close();
            }
        } catch (Throwable unused) {
        }
    }
}
