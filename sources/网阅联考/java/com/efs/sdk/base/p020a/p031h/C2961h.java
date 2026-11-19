package com.efs.sdk.base.p020a.p031h;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/* renamed from: com.efs.sdk.base.a.h.h */
/* loaded from: classes2.dex */
public class C2961h {

    /* renamed from: a */
    private static volatile String f1155a = "";

    /* renamed from: a */
    public static String m2225a(Context context) {
        if (TextUtils.isEmpty(f1155a)) {
            synchronized (C2961h.class) {
                if (TextUtils.isEmpty(f1155a)) {
                    String strM2226b = m2226b(context);
                    f1155a = strM2226b;
                    if (TextUtils.isEmpty(strM2226b)) {
                        f1155a = m2227c(context);
                    }
                }
            }
        }
        return f1155a;
    }

    /* renamed from: b */
    private static String m2226b(Context context) {
        try {
            File file = new File(C2943a.m2167a(context), "efsid");
            if (file.exists()) {
                return C2949b.m2181a(file);
            }
            return null;
        } catch (Exception e4) {
            C2957d.m2214b("efs.base", "get uuid error", e4);
            return null;
        }
    }

    /* renamed from: c */
    private static String m2227c(Context context) throws IOException {
        String string = "";
        for (int i4 = 0; i4 < 3; i4++) {
            try {
                string = UUID.randomUUID().toString();
            } catch (Throwable unused) {
            }
            if (TextUtils.isEmpty(string)) {
            }
        }
        try {
            File fileM2167a = C2943a.m2167a(context);
            File file = new File(fileM2167a, "efsid" + Process.myPid());
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            C2949b.m2184a(file, string);
            if (file.renameTo(new File(fileM2167a, "efsid"))) {
                file.delete();
            }
        } catch (Exception e4) {
            C2957d.m2214b("efs.base", "save uuid '" + string + "' error", e4);
        }
        return string;
    }
}
