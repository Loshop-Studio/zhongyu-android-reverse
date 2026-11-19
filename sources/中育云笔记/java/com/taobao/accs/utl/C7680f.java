package com.taobao.accs.utl;

import android.content.SharedPreferences;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;

/* renamed from: com.taobao.accs.utl.f */
/* loaded from: classes5.dex */
public class C7680f {
    public static final int MAX_FAIL_TIMES = 3;

    /* renamed from: a */
    public static void m10170a() {
        try {
            int iM10172c = m10172c();
            if (iM10172c > 0) {
                SharedPreferences.Editor editorEdit = GlobalClientInfo.getContext().getSharedPreferences(Constants.SP_LOAD_SO_FILE_NAME, 0).edit();
                editorEdit.clear();
                editorEdit.apply();
                ALog.m10119i("LoadSoFailUtil", "loadSoSuccess", "fail times", Integer.valueOf(iM10172c));
            }
        } catch (Throwable th) {
            ALog.m10117e("LoadSoFailUtil", "loadSoSuccess", th, new Object[0]);
        }
    }

    /* renamed from: b */
    public static void m10171b() {
        try {
            SharedPreferences sharedPreferences = GlobalClientInfo.getContext().getSharedPreferences(Constants.SP_LOAD_SO_FILE_NAME, 0);
            int i10 = sharedPreferences.getInt(Constants.SP_KEY_LOAD_SO_TIMES, 0) + 1;
            if (i10 > 0) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putInt(Constants.SP_KEY_LOAD_SO_TIMES, i10);
                editorEdit.apply();
            }
            ALog.m10118e("LoadSoFailUtil", "loadSoFail", "times", Integer.valueOf(i10));
        } catch (Throwable th) {
            ALog.m10117e("LoadSoFailUtil", "loadSoFail", th, new Object[0]);
        }
    }

    /* renamed from: c */
    public static int m10172c() {
        int i10;
        try {
            i10 = GlobalClientInfo.getContext().getSharedPreferences(Constants.SP_LOAD_SO_FILE_NAME, 0).getInt(Constants.SP_KEY_LOAD_SO_TIMES, 0);
            try {
                ALog.m10119i("LoadSoFailUtil", "getSoFailTimes", "times", Integer.valueOf(i10));
                return i10;
            } catch (Throwable th) {
                th = th;
                ALog.m10117e("LoadSoFailUtil", "getSoFailTimes", th, new Object[0]);
                return i10;
            }
        } catch (Throwable th2) {
            th = th2;
            i10 = 0;
        }
    }
}
