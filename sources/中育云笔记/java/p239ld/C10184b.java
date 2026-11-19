package p239ld;

import java.util.Random;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: ld.b */
/* loaded from: classes6.dex */
public final class C10184b extends AbstractC10183a {

    /* renamed from: e */
    public final a f24228e = new a();

    /* renamed from: ld.b$a */
    public static final class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // p239ld.AbstractC10183a
    /* renamed from: e */
    public Random mo21258e() {
        Object obj = this.f24228e.get();
        AbstractC9979u.m20293f(obj, "get(...)");
        return (Random) obj;
    }
}
