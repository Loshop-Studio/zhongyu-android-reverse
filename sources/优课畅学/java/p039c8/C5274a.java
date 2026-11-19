package p039c8;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.AbstractC9133u;
import p028b8.AbstractC5210a;

/* renamed from: c8.a */
/* loaded from: classes5.dex */
public final class C5274a extends AbstractC5210a {
    @Override // p028b8.AbstractC5210a
    /* renamed from: d */
    public Random mo2106d() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        AbstractC9133u.m16132f(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
