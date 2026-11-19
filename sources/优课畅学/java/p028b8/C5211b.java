package p028b8;

import java.util.Random;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: b8.b */
/* loaded from: classes5.dex */
public final class C5211b extends AbstractC5210a {

    /* renamed from: c */
    public final a f2292c = new a();

    /* renamed from: b8.b$a */
    public static final class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // p028b8.AbstractC5210a
    /* renamed from: d */
    public Random mo2106d() {
        Object obj = this.f2292c.get();
        AbstractC9133u.m16132f(obj, "get(...)");
        return (Random) obj;
    }
}
