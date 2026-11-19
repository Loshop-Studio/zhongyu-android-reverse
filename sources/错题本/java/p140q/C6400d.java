package p140q;

import coil3.AbstractC3297h;
import coil3.AbstractC3330o;
import coil3.C3333r;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.AbstractC5785e0;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.C5823d;
import okhttp3.AbstractC6323m0;
import p126o.InterfaceC6254c;
import p139p7.ThreadFactoryC6395b;
import p154s.AbstractC6533g;
import p154s.C6532f;
import p154s.C6538l;
import p188w1.C6701a;
import p207y6.InterfaceC6779c;
import retrofit2.InterfaceC6506m;

/* renamed from: q.d */
/* loaded from: classes2.dex */
public final class C6400d implements InterfaceC6506m {

    /* renamed from: a */
    public final Object f10500a;

    public /* synthetic */ C6400d(Object obj) {
        this.f10500a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c6  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p140q.C6398b m6065a(p154s.C6532f r18, p140q.C6397a r19, p162t.C6576f r20, coil3.size.Scale r21) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p140q.C6400d.m6065a(s.f, q.a, t.f, coil3.size.Scale):q.b");
    }

    /* renamed from: b */
    public C6397a m6066b(C6532f c6532f, Object obj, C6538l c6538l, AbstractC3297h abstractC3297h) {
        String strMo5855a;
        c6532f.getClass();
        Map map = c6532f.f10864d;
        List list = ((C3333r) this.f10500a).f2048d.f1883c;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                strMo5855a = null;
                break;
            }
            Pair pair = (Pair) list.get(i);
            InterfaceC6254c interfaceC6254c = (InterfaceC6254c) pair.component1();
            if (((C5823d) ((InterfaceC6779c) pair.component2())).m5321f(obj)) {
                AbstractC5830k.m5328e(interfaceC6254c, "null cannot be cast to non-null type coil3.key.Keyer<kotlin.Any>");
                strMo5855a = interfaceC6254c.mo5855a(obj, c6538l);
                if (strMo5855a != null) {
                    break;
                }
            }
            i++;
        }
        if (strMo5855a == null) {
            return null;
        }
        if (((List) AbstractC3330o.m2267e(c6532f, AbstractC6533g.f10881a)).isEmpty()) {
            return new C6397a(strMo5855a, map);
        }
        LinkedHashMap linkedHashMapM5158L = AbstractC5785e0.m5158L(map);
        linkedHashMapM5158L.put("coil#size", c6538l.f10895b.toString());
        return new C6397a(strMo5855a, linkedHashMapM5158L);
    }

    @Override // retrofit2.InterfaceC6506m
    public Object convert(Object obj) {
        return Optional.ofNullable(((InterfaceC6506m) this.f10500a).convert((AbstractC6323m0) obj));
    }

    public C6400d(C3333r c3333r, C6701a c6701a) {
        this.f10500a = c3333r;
    }

    public C6400d(ThreadFactoryC6395b threadFactoryC6395b) {
        this.f10500a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactoryC6395b);
    }
}
