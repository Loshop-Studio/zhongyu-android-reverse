package p343t4;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p332s4.InterfaceC11059c;

/* renamed from: t4.n */
/* loaded from: classes5.dex */
public class C11226n implements InterfaceC11059c {

    /* renamed from: a */
    public final Map f26934a = new ConcurrentHashMap();

    /* renamed from: b */
    public final C11224l f26935b;

    public C11226n(Context context, String str) {
        this.f26935b = new C11224l(context, str);
    }

    @Override // p332s4.InterfaceC11059c
    public String getString(String str, String str2) {
        String str3 = (String) this.f26934a.get(str);
        if (str3 != null) {
            return str3;
        }
        String strM24974b = this.f26935b.m24974b(str, str2);
        if (strM24974b == null) {
            return str2;
        }
        this.f26934a.put(str, strM24974b);
        return strM24974b;
    }

    public String toString() {
        return "SecurityResourcesReader{mKey=, encrypt=true}";
    }
}
