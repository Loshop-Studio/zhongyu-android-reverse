package com.taobao.accs.utl;

import android.content.SharedPreferences;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;

/* renamed from: com.taobao.accs.utl.f */
/* loaded from: classes.dex */
public class C1783f {
    public static final int MAX_FAIL_TIMES = 3;

    /* renamed from: a */
    public static void m6144a() {
        try {
            int iM6146c = m6146c();
            if (iM6146c > 0) {
                SharedPreferences.Editor editorEdit = GlobalClientInfo.getContext().getSharedPreferences(Constants.SP_LOAD_SO_FILE_NAME, 0).edit();
                editorEdit.clear();
                editorEdit.apply();
                ALog.m6093i("LoadSoFailUtil", "loadSoSuccess", "fail times", Integer.valueOf(iM6146c));
            }
        } catch (Throwable th) {
            ALog.m6091e("LoadSoFailUtil", "loadSoSuccess", th, new Object[0]);
        }
    }

    /* renamed from: b */
    public static void m6145b() {
        try {
            SharedPreferences sharedPreferences = GlobalClientInfo.getContext().getSharedPreferences(Constants.SP_LOAD_SO_FILE_NAME, 0);
            int i4 = sharedPreferences.getInt(Constants.SP_KEY_LOAD_SO_TIMES, 0) + 1;
            if (i4 > 0) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putInt(Constants.SP_KEY_LOAD_SO_TIMES, i4);
                editorEdit.apply();
            }
            ALog.m6092e("LoadSoFailUtil", "loadSoFail", "times", Integer.valueOf(i4));
        } catch (Throwable th) {
            ALog.m6091e("LoadSoFailUtil", "loadSoFail", th, new Object[0]);
        }
    }

    /* renamed from: c */
    public static int m6146c() {
        int i4;
        try {
            i4 = GlobalClientInfo.getContext().getSharedPreferences(Constants.SP_LOAD_SO_FILE_NAME, 0).getInt(Constants.SP_KEY_LOAD_SO_TIMES, 0);
            try {
                ALog.m6093i("LoadSoFailUtil", "getSoFailTimes", "times", Integer.valueOf(i4));
            } catch (Throwable th) {
                th = th;
                ALog.m6091e("LoadSoFailUtil", "getSoFailTimes", th, new Object[0]);
                return i4;
            }
        } catch (Throwable th2) {
            th = th2;
            i4 = 0;
        }
        return i4;
    }
}
