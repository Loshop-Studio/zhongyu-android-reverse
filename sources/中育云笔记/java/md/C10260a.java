package md;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.AbstractC9979u;
import p239ld.AbstractC10183a;

/* renamed from: md.a */
/* loaded from: classes6.dex */
public final class C10260a extends AbstractC10183a {
    @Override // p239ld.AbstractC10183a
    /* renamed from: e */
    public Random mo21258e() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        AbstractC9979u.m20293f(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
