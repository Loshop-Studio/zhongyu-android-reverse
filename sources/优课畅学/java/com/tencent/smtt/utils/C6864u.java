package com.tencent.smtt.utils;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;

/* renamed from: com.tencent.smtt.utils.u */
/* loaded from: classes4.dex */
public class C6864u {

    /* renamed from: a */
    private static C6864u f7004a;

    /* renamed from: b */
    private static Context f7005b;

    private C6864u() {
    }

    /* renamed from: a */
    public static C6864u m6369a(Context context) {
        f7005b = context.getApplicationContext();
        if (f7004a == null) {
            f7004a = new C6864u();
        }
        return f7004a;
    }

    /* renamed from: b */
    private void m6370b(String str) throws Throwable {
        DataOutputStream dataOutputStream;
        if (C6854k.m6318b()) {
            DataOutputStream dataOutputStream2 = null;
            try {
                try {
                    try {
                        File file = new File(C6854k.m6324c(), "ins.dat");
                        if (!file.exists()) {
                            file.createNewFile();
                        }
                        dataOutputStream = new DataOutputStream(new BufferedOutputStream(C6854k.m6327d(file)));
                    } catch (IOException e10) {
                        e10.printStackTrace();
                        return;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                dataOutputStream.writeUTF(str);
                dataOutputStream.flush();
                dataOutputStream.close();
            } catch (Exception e12) {
                e = e12;
                dataOutputStream2 = dataOutputStream;
                e.printStackTrace();
                if (dataOutputStream2 != null) {
                    dataOutputStream2.close();
                }
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream2 = dataOutputStream;
                if (dataOutputStream2 != null) {
                    try {
                        dataOutputStream2.close();
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                }
                throw th;
            }
        }
    }

    /* renamed from: c */
    private void m6371c(String str) {
        try {
            Settings.System.putString(f7005b.getContentResolver(), "sys_setting_tbs_qb_installer", str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m6372a(String str) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m6370b(str);
        m6371c(str);
    }
}
