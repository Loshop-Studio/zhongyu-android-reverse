package com.efs.sdk.base.p035a.p046h;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/* renamed from: com.efs.sdk.base.a.h.h */
/* loaded from: classes.dex */
public class C1333h {

    /* renamed from: a */
    private static volatile String f7125a = "";

    /* renamed from: a */
    public static String m5584a(Context context) {
        if (TextUtils.isEmpty(f7125a)) {
            synchronized (C1333h.class) {
                if (TextUtils.isEmpty(f7125a)) {
                    String strM5585b = m5585b(context);
                    f7125a = strM5585b;
                    if (TextUtils.isEmpty(strM5585b)) {
                        f7125a = m5586c(context);
                    }
                }
            }
        }
        return f7125a;
    }

    /* renamed from: b */
    private static String m5585b(Context context) {
        try {
            File file = new File(C1315a.m5526a(context), "efsid");
            if (file.exists()) {
                return C1321b.m5540a(file);
            }
            return null;
        } catch (Exception e4) {
            C1329d.m5573b("efs.base", "get uuid error", e4);
            return null;
        }
    }

    /* renamed from: c */
    private static String m5586c(Context context) throws IOException {
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
            File fileM5526a = C1315a.m5526a(context);
            File file = new File(fileM5526a, "efsid" + Process.myPid());
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            C1321b.m5543a(file, string);
            if (file.renameTo(new File(fileM5526a, "efsid"))) {
                file.delete();
            }
        } catch (Exception e4) {
            C1329d.m5573b("efs.base", "save uuid '" + string + "' error", e4);
        }
        return string;
    }
}
