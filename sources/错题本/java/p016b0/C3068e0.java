package p016b0;

import android.support.v4.media.C0039h;
import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p185v7.AbstractC6675d;
import p187w0.C6696d;
import p202y.C6763f;
import p208z.InterfaceC6802g;

/* renamed from: b0.e0 */
/* loaded from: classes2.dex */
public final class C3068e0 {

    /* renamed from: a */
    public final Pools.Pool f1409a;

    /* renamed from: b */
    public final List f1410b;

    /* renamed from: c */
    public final String f1411c;

    public C3068e0(Class cls, Class cls2, Class cls3, List list, C6696d c6696d) {
        this.f1409a = c6696d;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f1410b = list;
        this.f1411c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public final InterfaceC3072g0 m2012a(int i, int i8, C0039h c0039h, C6763f c6763f, InterfaceC6802g interfaceC6802g) {
        Pools.Pool pool = this.f1409a;
        Object objAcquire = pool.acquire();
        AbstractC6675d.m6344f(objAcquire, "Argument must not be null");
        List list = (List) objAcquire;
        try {
            List list2 = this.f1410b;
            int size = list2.size();
            InterfaceC3072g0 interfaceC3072g0M2046a = null;
            for (int i9 = 0; i9 < size; i9++) {
                try {
                    interfaceC3072g0M2046a = ((C3081l) list2.get(i9)).m2046a(i, i8, c0039h, c6763f, interfaceC6802g);
                } catch (GlideException e) {
                    list.add(e);
                }
                if (interfaceC3072g0M2046a != null) {
                    break;
                }
            }
            if (interfaceC3072g0M2046a != null) {
                return interfaceC3072g0M2046a;
            }
            throw new GlideException(this.f1411c, new ArrayList(list));
        } finally {
            pool.release(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f1410b.toArray()) + '}';
    }
}
