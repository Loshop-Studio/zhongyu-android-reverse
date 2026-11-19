package kotlin.jvm.internal;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.navigation.C2861i;
import java.util.List;
import kotlin.collections.AbstractC5805t;
import p185v7.AbstractC6675d;
import p207y6.InterfaceC6779c;
import p207y6.InterfaceC6793q;

/* renamed from: kotlin.jvm.internal.r */
/* loaded from: classes2.dex */
public final class C5837r implements InterfaceC6793q {

    /* renamed from: a */
    public final C5823d f9226a;

    /* renamed from: b */
    public final List f9227b;

    public C5837r(C5823d c5823d, List arguments) {
        AbstractC5830k.m5330g(arguments, "arguments");
        this.f9226a = c5823d;
        this.f9227b = arguments;
    }

    @Override // p207y6.InterfaceC6793q
    /* renamed from: a */
    public final boolean mo5360a() {
        return false;
    }

    @Override // p207y6.InterfaceC6793q
    /* renamed from: b */
    public final InterfaceC6779c mo5361b() {
        return this.f9226a;
    }

    /* renamed from: c */
    public final String m5362c(boolean z8) {
        C5823d c5823d = this.f9226a;
        Class clsM6349m = AbstractC6675d.m6349m(c5823d);
        return AbstractC0037f.m75D(clsM6349m.isArray() ? clsM6349m.equals(boolean[].class) ? "kotlin.BooleanArray" : clsM6349m.equals(char[].class) ? "kotlin.CharArray" : clsM6349m.equals(byte[].class) ? "kotlin.ByteArray" : clsM6349m.equals(short[].class) ? "kotlin.ShortArray" : clsM6349m.equals(int[].class) ? "kotlin.IntArray" : clsM6349m.equals(float[].class) ? "kotlin.FloatArray" : clsM6349m.equals(long[].class) ? "kotlin.LongArray" : clsM6349m.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array" : (z8 && clsM6349m.isPrimitive()) ? AbstractC6675d.m6350n(c5823d).getName() : clsM6349m.getName(), this.f9227b.isEmpty() ? "" : AbstractC5805t.m5234n0(this.f9227b, ", ", "<", ">", new C2861i(this, 23), 24), "");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5837r)) {
            return false;
        }
        C5837r c5837r = (C5837r) obj;
        return this.f9226a.equals(c5837r.f9226a) && AbstractC5830k.m5325b(this.f9227b, c5837r.f9227b);
    }

    @Override // p207y6.InterfaceC6793q
    public final List getArguments() {
        return this.f9227b;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + AbstractC0584a.m907h(this.f9227b, this.f9226a.hashCode() * 31, 31);
    }

    public final String toString() {
        return m5362c(false) + " (Kotlin reflection is not available)";
    }
}
