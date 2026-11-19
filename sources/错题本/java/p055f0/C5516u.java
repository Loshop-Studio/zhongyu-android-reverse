package p055f0;

import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.Arrays;
import p187w0.C6696d;
import p202y.C6763f;
import p202y.InterfaceC6760c;

/* renamed from: f0.u */
/* loaded from: classes2.dex */
public final class C5516u implements InterfaceC5511p {

    /* renamed from: a */
    public final ArrayList f8542a;

    /* renamed from: b */
    public final Pools.Pool f8543b;

    public C5516u(ArrayList arrayList, C6696d c6696d) {
        this.f8542a = arrayList;
        this.f8543b = c6696d;
    }

    @Override // p055f0.InterfaceC5511p
    /* renamed from: a */
    public final boolean mo4873a(Object obj) {
        ArrayList arrayList = this.f8542a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            if (((InterfaceC5511p) obj2).mo4873a(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // p055f0.InterfaceC5511p
    /* renamed from: b */
    public final C5510o mo4874b(Object obj, int i, int i8, C6763f c6763f) {
        C5510o c5510oMo4874b;
        ArrayList arrayList = this.f8542a;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        InterfaceC6760c interfaceC6760c = null;
        for (int i9 = 0; i9 < size; i9++) {
            InterfaceC5511p interfaceC5511p = (InterfaceC5511p) arrayList.get(i9);
            if (interfaceC5511p.mo4873a(obj) && (c5510oMo4874b = interfaceC5511p.mo4874b(obj, i, i8, c6763f)) != null) {
                interfaceC6760c = c5510oMo4874b.f8529a;
                arrayList2.add(c5510oMo4874b.f8531c);
            }
        }
        if (arrayList2.isEmpty() || interfaceC6760c == null) {
            return null;
        }
        return new C5510o(interfaceC6760c, new C5515t(arrayList2, this.f8543b));
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f8542a.toArray()) + '}';
    }
}
