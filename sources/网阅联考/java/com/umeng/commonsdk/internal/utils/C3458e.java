package com.umeng.commonsdk.internal.utils;

import android.os.Build;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/* renamed from: com.umeng.commonsdk.internal.utils.e */
/* loaded from: classes2.dex */
public class C3458e {

    /* renamed from: com.umeng.commonsdk.internal.utils.e$a */
    public enum a {
        check_su_binary(new String[]{"/system/xbin/which", "su"});


        /* renamed from: b */
        String[] f2661b;

        a(String[] strArr) {
            this.f2661b = strArr;
        }
    }

    /* renamed from: a */
    public ArrayList m3549a(a aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT > 28) {
            return arrayList;
        }
        try {
            Process processExec = Runtime.getRuntime().exec(aVar.f2661b);
            new BufferedWriter(new OutputStreamWriter(processExec.getOutputStream()));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    arrayList.add(line);
                } catch (Exception unused) {
                }
            }
            return arrayList;
        } catch (Exception unused2) {
            return null;
        }
    }
}
