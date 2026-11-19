package com.efs.sdk.base.p039a.p050h;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/* renamed from: com.efs.sdk.base.a.h.h */
/* loaded from: classes3.dex */
public class C5701h {

    /* renamed from: a */
    private static volatile String f4759a = "";

    /* renamed from: a */
    public static String m4194a(Context context) {
        if (TextUtils.isEmpty(f4759a)) {
            synchronized (C5701h.class) {
                try {
                    if (TextUtils.isEmpty(f4759a)) {
                        String strM4195b = m4195b(context);
                        f4759a = strM4195b;
                        if (TextUtils.isEmpty(strM4195b)) {
                            f4759a = m4196c(context);
                        }
                    }
                } finally {
                }
            }
        }
        return f4759a;
    }

    /* renamed from: b */
    private static String m4195b(Context context) {
        try {
            File file = new File(C5683a.m4136a(context), "efsid");
            if (file.exists()) {
                return C5689b.m4150a(file);
            }
            return null;
        } catch (Exception e10) {
            C5697d.m4183b("efs.base", "get uuid error", e10);
            return null;
        }
    }

    /* renamed from: c */
    private static String m4196c(Context context) throws IOException {
        String string = "";
        for (int i9 = 0; i9 < 3; i9++) {
            try {
                string = UUID.randomUUID().toString();
            } catch (Throwable unused) {
            }
            if (TextUtils.isEmpty(string)) {
            }
        }
        try {
            File fileM4136a = C5683a.m4136a(context);
            File file = new File(fileM4136a, "efsid" + Process.myPid());
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            C5689b.m4153a(file, string);
            if (file.renameTo(new File(fileM4136a, "efsid"))) {
                file.delete();
            }
        } catch (Exception e10) {
            C5697d.m4183b("efs.base", "save uuid '" + string + "' error", e10);
        }
        return string;
    }
}
