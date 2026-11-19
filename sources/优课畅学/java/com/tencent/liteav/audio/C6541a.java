package com.tencent.liteav.audio;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;

/* renamed from: com.tencent.liteav.audio.a */
/* loaded from: classes4.dex */
public class C6541a {

    /* renamed from: a */
    private final SharedPreferences f5099a;

    /* renamed from: com.tencent.liteav.audio.a$a */
    public static class a {

        /* renamed from: a */
        private static final C6541a f5100a = new C6541a();
    }

    /* renamed from: a */
    public static C6541a m4727a() {
        return a.f5100a;
    }

    /* renamed from: b */
    public long m4731b(String str, long j10) {
        return ((Long) m4729b(str, Long.valueOf(j10))).longValue();
    }

    private C6541a() {
        this.f5099a = TXCCommonUtil.getAppContext().getSharedPreferences("txc_audio_settings", 0);
    }

    /* renamed from: b */
    private Object m4729b(String str, Object obj) {
        try {
            return obj instanceof String ? this.f5099a.getString(str, obj.toString()) : obj instanceof Integer ? Integer.valueOf(this.f5099a.getInt(str, ((Integer) obj).intValue())) : obj instanceof Boolean ? Boolean.valueOf(this.f5099a.getBoolean(str, ((Boolean) obj).booleanValue())) : obj instanceof Long ? Long.valueOf(this.f5099a.getLong(str, ((Long) obj).longValue())) : obj instanceof Float ? Float.valueOf(this.f5099a.getFloat(str, ((Float) obj).floatValue())) : obj instanceof Double ? Double.valueOf(Double.longBitsToDouble(this.f5099a.getLong(str, Double.doubleToLongBits(((Double) obj).doubleValue())))) : obj;
        } catch (Exception e10) {
            TXCLog.m4993e("TXCAudioSettings", "get value from sharedpreference failed for key: %s", str, e10);
            return obj;
        }
    }

    /* renamed from: a */
    public void m4730a(String str, long j10) {
        m4728a(str, Long.valueOf(j10));
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: a */
    private void m4728a(String str, Object obj) {
        SharedPreferences.Editor editorEdit = this.f5099a.edit();
        if (obj instanceof Integer) {
            editorEdit.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof String) {
            editorEdit.putString(str, obj.toString());
        } else if (obj instanceof Boolean) {
            editorEdit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Long) {
            editorEdit.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Float) {
            editorEdit.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            editorEdit.putLong(str, Double.doubleToRawLongBits(((Double) obj).doubleValue()));
        }
        editorEdit.commit();
    }
}
