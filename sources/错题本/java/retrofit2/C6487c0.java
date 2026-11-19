package retrofit2;

import java.lang.reflect.Method;
import kotlin.jvm.internal.C5834o;
import okhttp3.C6329q;

/* renamed from: retrofit2.c0 */
/* loaded from: classes4.dex */
public final class C6487c0 extends AbstractC6522v {

    /* renamed from: d */
    public final /* synthetic */ int f10684d;

    /* renamed from: e */
    public final Method f10685e;

    /* renamed from: f */
    public final int f10686f;

    public /* synthetic */ C6487c0(Method method, int i, int i8) {
        this.f10684d = i8;
        this.f10685e = method;
        this.f10686f = i;
    }

    @Override // retrofit2.AbstractC6522v
    /* renamed from: a */
    public final void mo6137a(C6503k0 c6503k0, Object obj) {
        switch (this.f10684d) {
            case 0:
                C6329q c6329q = (C6329q) obj;
                if (c6329q == null) {
                    throw AbstractC6522v.m6172n(this.f10685e, this.f10686f, "Headers parameter must not be null.", new Object[0]);
                }
                C5834o c5834o = c6503k0.f10716f;
                c5834o.getClass();
                int size = c6329q.size();
                for (int i = 0; i < size; i++) {
                    c5834o.m5345c(c6329q.m5963b(i), c6329q.m5966e(i));
                }
                return;
            default:
                if (obj == null) {
                    throw AbstractC6522v.m6172n(this.f10685e, this.f10686f, "@Url parameter is null.", new Object[0]);
                }
                c6503k0.f10713c = obj.toString();
                return;
        }
    }
}
