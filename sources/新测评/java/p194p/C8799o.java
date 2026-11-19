package p194p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import coil3.InterfaceC5193e;
import coil3.decode.DataSource;
import coil3.size.Precision;
import coil3.util.AbstractC5214d;
import kotlin.KotlinNothingValueException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Okio;
import p030c0.AbstractC5078c;
import p030c0.C5082g;
import p030c0.C5093r;
import p137k.AbstractC7843o;
import p137k.AbstractC7849u;
import p137k.C7848t;
import p172n.AbstractC8604s;
import p172n.C8605t;
import p194p.InterfaceC8795k;
import p290y.AbstractC9888g;
import p290y.C9892k;

/* renamed from: p.o */
/* loaded from: classes3.dex */
public final class C8799o implements InterfaceC8795k {

    /* renamed from: a */
    public final C7848t f14941a;

    /* renamed from: b */
    public final C9892k f14942b;

    /* renamed from: p.o$a */
    public static final class a implements InterfaceC8795k.a {
        /* renamed from: c */
        private final boolean m14697c(C7848t c7848t) {
            return Intrinsics.areEqual(c7848t.m13309c(), "android.resource");
        }

        @Override // p194p.InterfaceC8795k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC8795k mo3134a(C7848t c7848t, C9892k c9892k, InterfaceC5193e interfaceC5193e) {
            if (m14697c(c7848t)) {
                return new C8799o(c7848t, c9892k);
            }
            return null;
        }
    }

    public C8799o(C7848t c7848t, C9892k c9892k) {
        this.f14941a = c7848t;
        this.f14942b = c9892k;
    }

    @Override // p194p.InterfaceC8795k
    /* renamed from: a */
    public Object mo3117a(Continuation continuation) throws Resources.NotFoundException {
        Integer intOrNull;
        String strM13307a = this.f14941a.m13307a();
        if (strM13307a != null) {
            if (StringsKt.isBlank(strM13307a)) {
                strM13307a = null;
            }
            if (strM13307a != null) {
                String str = (String) CollectionsKt.lastOrNull(AbstractC7849u.m13316f(this.f14941a));
                if (str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) {
                    m14696b(this.f14941a);
                    throw new KotlinNothingValueException();
                }
                int iIntValue = intOrNull.intValue();
                Context contextM16700c = this.f14942b.m16700c();
                Resources resources = Intrinsics.areEqual(strM13307a, contextM16700c.getPackageName()) ? contextM16700c.getResources() : contextM16700c.getPackageManager().getResourcesForApplication(strM13307a);
                TypedValue typedValue = new TypedValue();
                resources.getValue(iIntValue, typedValue, true);
                String strM2708b = C5093r.f2659a.m2708b(typedValue.string.toString());
                if (!Intrinsics.areEqual(strM2708b, "text/xml")) {
                    TypedValue typedValue2 = new TypedValue();
                    return new C8800p(AbstractC8604s.m14161a(Okio.buffer(Okio.source(resources.openRawResource(iIntValue, typedValue2))), this.f14942b.m16704g(), new C8605t(strM13307a, iIntValue, typedValue2.density)), strM2708b, DataSource.f2937c);
                }
                Drawable drawableM2673c = Intrinsics.areEqual(strM13307a, contextM16700c.getPackageName()) ? AbstractC5078c.m2673c(contextM16700c, iIntValue) : AbstractC5078c.m2676f(contextM16700c, resources, iIntValue);
                boolean zM3233j = AbstractC5214d.m3233j(drawableM2673c);
                if (zM3233j) {
                    drawableM2673c = new BitmapDrawable(contextM16700c.getResources(), C5082g.f2652a.m2679a(drawableM2673c, AbstractC9888g.m16692f(this.f14942b), this.f14942b.m16708k(), this.f14942b.m16707j(), this.f14942b.m16706i() == Precision.f3232b));
                }
                return new C8797m(AbstractC7843o.m13301c(drawableM2673c), zM3233j, DataSource.f2937c);
            }
        }
        m14696b(this.f14941a);
        throw new KotlinNothingValueException();
    }

    /* renamed from: b */
    public final Void m14696b(C7848t c7848t) {
        throw new IllegalStateException("Invalid android.resource URI: " + c7848t);
    }
}
