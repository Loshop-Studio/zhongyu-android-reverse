package p101k7;

import androidx.navigation.C2827b;
import java.util.Iterator;
import kotlin.collections.C5778b0;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.C5820a;
import kotlin.jvm.internal.C5821b;
import kotlin.text.C5841b;
import kotlin.text.C5842c;
import p045d6.C5434j;
import p118m7.C6187x;
import p160s6.InterfaceC6560a;

/* renamed from: k7.i */
/* loaded from: classes4.dex */
public final class C5767i implements Iterable, InterfaceC6560a {

    /* renamed from: a */
    public final /* synthetic */ int f9142a;

    /* renamed from: b */
    public final Object f9143b;

    public /* synthetic */ C5767i(Object obj, int i) {
        this.f9142a = i;
        this.f9143b = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f9142a) {
            case 0:
                return new C5434j((C6187x) this.f9143b);
            case 1:
                return AbstractC5830k.m5335l((Object[]) this.f9143b);
            case 2:
                int[] array = (int[]) this.f9143b;
                AbstractC5830k.m5330g(array, "array");
                return new C5820a(array);
            case 3:
                long[] array2 = (long[]) this.f9143b;
                AbstractC5830k.m5330g(array2, "array");
                return new C5821b(array2);
            case 4:
                float[] array3 = (float[]) this.f9143b;
                AbstractC5830k.m5330g(array3, "array");
                return new C5434j(array3);
            case 5:
                double[] array4 = (double[]) this.f9143b;
                AbstractC5830k.m5330g(array4, "array");
                return new C5434j(array4);
            case 6:
                return new C5778b0(AbstractC5830k.m5335l((Object[]) ((C2827b) this.f9143b).f1196b));
            default:
                return new C5841b((C5842c) this.f9143b);
        }
    }
}
