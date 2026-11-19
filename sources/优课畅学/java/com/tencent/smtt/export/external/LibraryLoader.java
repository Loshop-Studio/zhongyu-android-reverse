package com.tencent.smtt.export.external;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class LibraryLoader {
    private static String[] sLibrarySearchPaths;

    public static String[] getLibrarySearchPaths(Context context) {
        String[] strArr = sLibrarySearchPaths;
        if (strArr != null) {
            return strArr;
        }
        if (context == null) {
            return new String[]{"/system/lib"};
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(getNativeLibraryDir(context));
        arrayList.add("/system/lib");
        String[] strArr2 = new String[arrayList.size()];
        arrayList.toArray(strArr2);
        sLibrarySearchPaths = strArr2;
        return strArr2;
    }

    public static String getNativeLibraryDir(Context context) {
        return context.getApplicationInfo().nativeLibraryDir;
    }

    public static void loadLibrary(Context context, String str) {
        String[] librarySearchPaths = getLibrarySearchPaths(context);
        String strMapLibraryName = System.mapLibraryName(str);
        for (String str2 : librarySearchPaths) {
            try {
                String str3 = str2 + "/" + strMapLibraryName;
                if (new File(str3).exists()) {
                    System.load(str3);
                    return;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        System.loadLibrary(str);
    }
}
