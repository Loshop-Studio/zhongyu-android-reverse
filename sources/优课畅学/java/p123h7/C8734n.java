package p123h7;

import com.tencent.smtt.export.external.interfaces.ISelectionInterface;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: h7.n */
/* loaded from: classes5.dex */
public final class C8734n implements Comparable {

    /* renamed from: b */
    public static final a f16363b = new a(null);

    /* renamed from: a */
    public final short f16364a;

    /* renamed from: h7.n$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ C8734n(short s10) {
        this.f16364a = s10;
    }

    /* renamed from: a */
    public static final /* synthetic */ C8734n m14301a(short s10) {
        return new C8734n(s10);
    }

    /* renamed from: c */
    public static boolean m14303c(short s10, Object obj) {
        return (obj instanceof C8734n) && s10 == ((C8734n) obj).m14306f();
    }

    /* renamed from: d */
    public static int m14304d(short s10) {
        return Short.hashCode(s10);
    }

    /* renamed from: e */
    public static String m14305e(short s10) {
        return String.valueOf(s10 & ISelectionInterface.HELD_NOTHING);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC9133u.m16135i(m14306f() & ISelectionInterface.HELD_NOTHING, ((C8734n) obj).m14306f() & ISelectionInterface.HELD_NOTHING);
    }

    public boolean equals(Object obj) {
        return m14303c(this.f16364a, obj);
    }

    /* renamed from: f */
    public final /* synthetic */ short m14306f() {
        return this.f16364a;
    }

    public int hashCode() {
        return m14304d(this.f16364a);
    }

    public String toString() {
        return m14305e(this.f16364a);
    }

    /* renamed from: b */
    public static short m14302b(short s10) {
        return s10;
    }
}
