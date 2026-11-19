package p317r4;

import android.content.Context;
import android.util.Log;
import p372v4.C11542b;

/* renamed from: r4.c */
/* loaded from: classes5.dex */
public abstract class AbstractC10840c {
    /* renamed from: a */
    public static AbstractC10840c m23322a(InterfaceC10841d interfaceC10841d) {
        return C11542b.m25396h(interfaceC10841d);
    }

    /* renamed from: c */
    public static AbstractC10840c m23323c() {
        return C11542b.m25394f();
    }

    /* renamed from: e */
    public static void m23324e(Context context) {
        Log.i("AGConnectInstance", "AGConnectInstance#initialize");
        C11542b.m25398j(context);
    }

    /* renamed from: b */
    public abstract Context mo23325b();

    /* renamed from: d */
    public abstract InterfaceC10841d mo23326d();
}
