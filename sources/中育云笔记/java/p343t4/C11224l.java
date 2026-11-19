package p343t4;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import p332s4.InterfaceC11058b;

/* renamed from: t4.l */
/* loaded from: classes5.dex */
public class C11224l {

    /* renamed from: a */
    public final InterfaceC11058b f26933a;

    public C11224l(Context context, String str) {
        this.f26933a = (TextUtils.isEmpty(m24973a(context, str)) || Build.VERSION.SDK_INT < 26) ? new C11220h(context, str) : new C11221i(context, str);
    }

    /* renamed from: a */
    public final String m24973a(Context context, String str) {
        String strM24976b = AbstractC11225m.m24976b(context, str, "agc_plugin_", "crypto");
        if (strM24976b == null) {
            return null;
        }
        try {
            return new String(AbstractC11213a.m24932b(strM24976b), "utf-8");
        } catch (UnsupportedEncodingException | IllegalArgumentException e10) {
            Log.e("ReaderStrategy", "UnsupportedEncodingException" + e10.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public String m24974b(String str, String str2) {
        return this.f26933a.mo24514a(str, str2);
    }
}
