package p125n7;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import kotlinx.serialization.json.internal.C6043x;
import p118m7.AbstractC6191y0;
import p118m7.C6134f0;
import p118m7.C6156m1;

/* renamed from: n7.k */
/* loaded from: classes4.dex */
public abstract class AbstractC6236k {

    /* renamed from: a */
    public static final C6134f0 f9982a = AbstractC6191y0.m5831a("kotlinx.serialization.json.JsonUnquotedLiteral", C6156m1.f9829a);

    /* renamed from: a */
    public static final AbstractC6250y m5851a(AbstractC6235j abstractC6235j) {
        AbstractC6250y abstractC6250y = abstractC6235j instanceof AbstractC6250y ? (AbstractC6250y) abstractC6235j : null;
        if (abstractC6250y != null) {
            return abstractC6250y;
        }
        throw new IllegalArgumentException("Element " + AbstractC5832m.m5340a(abstractC6235j.getClass()) + " is not a JsonPrimitive");
    }

    /* renamed from: b */
    public static final long m5852b(AbstractC6250y abstractC6250y) {
        AbstractC5830k.m5330g(abstractC6250y, "<this>");
        String strMo5854a = abstractC6250y.mo5854a();
        C6043x c6043x = new C6043x(strMo5854a);
        long jM5714h = c6043x.m5714h();
        if (c6043x.m5711e() == 10) {
            return jM5714h;
        }
        int i = c6043x.f9597b;
        int i8 = i - 1;
        C6043x.m5706m(c6043x, AbstractC0037f.m86k("Expected input to contain a single valid number, but got '", (i == strMo5854a.length() || i8 < 0) ? "EOF" : String.valueOf(strMo5854a.charAt(i8)), "' after it"), i8, null, 4);
        throw null;
    }
}
