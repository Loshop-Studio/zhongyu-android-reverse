package p200z5;

import java.util.Objects;
import p058f5.AbstractC6364e0;
import p058f5.C6362d0;
import p058f5.C6383v;

/* renamed from: z5.c0 */
/* loaded from: classes4.dex */
public final class C7957c0<T> {

    /* renamed from: a */
    public final C6362d0 f10733a;

    /* renamed from: b */
    public final Object f10734b;

    /* renamed from: c */
    public final AbstractC6364e0 f10735c;

    public C7957c0(C6362d0 c6362d0, Object obj, AbstractC6364e0 abstractC6364e0) {
        this.f10733a = c6362d0;
        this.f10734b = obj;
        this.f10735c = abstractC6364e0;
    }

    /* renamed from: c */
    public static C7957c0 m9783c(AbstractC6364e0 abstractC6364e0, C6362d0 c6362d0) {
        Objects.requireNonNull(abstractC6364e0, "body == null");
        Objects.requireNonNull(c6362d0, "rawResponse == null");
        if (c6362d0.m6671q()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new C7957c0(c6362d0, null, abstractC6364e0);
    }

    /* renamed from: g */
    public static C7957c0 m9784g(Object obj, C6362d0 c6362d0) {
        Objects.requireNonNull(c6362d0, "rawResponse == null");
        if (c6362d0.m6671q()) {
            return new C7957c0(c6362d0, obj, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    /* renamed from: a */
    public Object m9785a() {
        return this.f10734b;
    }

    /* renamed from: b */
    public int m9786b() {
        return this.f10733a.m6665j();
    }

    /* renamed from: d */
    public C6383v m9787d() {
        return this.f10733a.m6670p();
    }

    /* renamed from: e */
    public boolean m9788e() {
        return this.f10733a.m6671q();
    }

    /* renamed from: f */
    public String m9789f() {
        return this.f10733a.m6672r();
    }

    public String toString() {
        return this.f10733a.toString();
    }
}
