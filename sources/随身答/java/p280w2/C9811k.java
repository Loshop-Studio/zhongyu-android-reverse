package p280w2;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.commonsdk.config.C6780a;

/* renamed from: w2.k */
/* loaded from: classes4.dex */
public class C9811k extends AbstractC9803c {

    /* renamed from: f */
    public Context f17479f;

    public C9811k(Context context) {
        super("oaid");
        this.f17479f = context;
    }

    @Override // p280w2.AbstractC9803c
    /* renamed from: i */
    public String mo16651i() {
        if (!C6780a.m6260e("header_device_oaid")) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = this.f17479f.getSharedPreferences("umeng_sp_oaid", 0);
            if (sharedPreferences != null) {
                return sharedPreferences.getString("key_umeng_sp_oaid", "");
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
