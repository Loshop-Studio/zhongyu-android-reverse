package p318r5;

import android.util.Log;

/* renamed from: r5.k0 */
/* loaded from: classes5.dex */
public class C10875k0 {

    /* renamed from: a */
    public boolean f26249a = false;

    /* renamed from: b */
    public int f26250b = 4;

    /* renamed from: a */
    public static String m23508a() {
        return "FormalHASDK_2.2.0.315" + AbstractC10898u0.m23661a();
    }

    /* renamed from: b */
    public void m23509b(int i10) {
        Log.i("FormalHASDK", System.lineSeparator() + "======================================= " + System.lineSeparator() + m23508a() + "" + System.lineSeparator() + "=======================================");
        this.f26250b = i10;
        this.f26249a = true;
    }

    /* renamed from: c */
    public void m23510c(int i10, String str, String str2) {
        if (i10 != 3) {
            if (i10 == 5) {
                Log.w(str, str2);
            } else if (i10 != 6) {
                Log.i(str, str2);
            } else {
                Log.e(str, str2);
            }
        }
    }

    /* renamed from: d */
    public void m23511d(int i10, String str, String str2) {
        m23510c(i10, "FormalHASDK", str + "=> " + str2);
    }

    /* renamed from: e */
    public boolean m23512e(int i10) {
        return this.f26249a && i10 >= this.f26250b;
    }
}
