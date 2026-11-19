package p207p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import coil3.InterfaceC5328e;
import coil3.decode.DataSource;
import coil3.size.Precision;
import coil3.util.AbstractC5349d;
import kotlin.KotlinNothingValueException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Okio;
import p090e0.AbstractC7805c;
import p090e0.C7808f;
import p090e0.C7819q;
import p151k.AbstractC8243n;
import p151k.AbstractC8248s;
import p151k.C8247r;
import p183n.AbstractC9074s;
import p183n.C9075t;
import p207p.InterfaceC9298k;
import p297y.AbstractC9928i;
import p297y.C9932m;

/* renamed from: p.o */
/* loaded from: classes3.dex */
public final class C9302o implements InterfaceC9298k {

    /* renamed from: a */
    public final C8247r f16106a;

    /* renamed from: b */
    public final C9932m f16107b;

    /* renamed from: p.o$a */
    public static final class a implements InterfaceC9298k.a {
        /* renamed from: c */
        private final boolean m15148c(C8247r c8247r) {
            return Intrinsics.areEqual(c8247r.m13277c(), "android.resource");
        }

        @Override // p207p.InterfaceC9298k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC9298k mo2854a(C8247r c8247r, C9932m c9932m, InterfaceC5328e interfaceC5328e) {
            if (m15148c(c8247r)) {
                return new C9302o(c8247r, c9932m);
            }
            return null;
        }
    }

    public C9302o(C8247r c8247r, C9932m c9932m) {
        this.f16106a = c8247r;
        this.f16107b = c9932m;
    }

    @Override // p207p.InterfaceC9298k
    /* renamed from: a */
    public Object mo2837a(Continuation continuation) throws Resources.NotFoundException {
        Integer intOrNull;
        String strM13275a = this.f16106a.m13275a();
        if (strM13275a != null) {
            if (StringsKt.isBlank(strM13275a)) {
                strM13275a = null;
            }
            if (strM13275a != null) {
                String str = (String) CollectionsKt.lastOrNull(AbstractC8248s.m13284f(this.f16106a));
                if (str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) {
                    m15147b(this.f16106a);
                    throw new KotlinNothingValueException();
                }
                int iIntValue = intOrNull.intValue();
                Context contextM17108c = this.f16107b.m17108c();
                Resources resources = Intrinsics.areEqual(strM13275a, contextM17108c.getPackageName()) ? contextM17108c.getResources() : contextM17108c.getPackageManager().getResourcesForApplication(strM13275a);
                TypedValue typedValue = new TypedValue();
                resources.getValue(iIntValue, typedValue, true);
                String strM12215b = C7819q.f13131a.m12215b(typedValue.string.toString());
                if (!Intrinsics.areEqual(strM12215b, "text/xml")) {
                    TypedValue typedValue2 = new TypedValue();
                    return new C9303p(AbstractC9074s.m14552a(Okio.buffer(Okio.source(resources.openRawResource(iIntValue, typedValue2))), this.f16107b.m17112g(), new C9075t(strM13275a, iIntValue, typedValue2.density)), strM12215b, DataSource.f2866c);
                }
                Drawable drawableM12181c = Intrinsics.areEqual(strM13275a, contextM17108c.getPackageName()) ? AbstractC7805c.m12181c(contextM17108c, iIntValue) : AbstractC7805c.m12184f(contextM17108c, resources, iIntValue);
                boolean zM2950j = AbstractC5349d.m2950j(drawableM12181c);
                if (zM2950j) {
                    drawableM12181c = new BitmapDrawable(contextM17108c.getResources(), C7808f.f13124a.m12187a(drawableM12181c, AbstractC9928i.m17097j(this.f16107b), this.f16107b.m17116k(), this.f16107b.m17115j(), this.f16107b.m17114i() == Precision.f3120b));
                }
                return new C9300m(AbstractC8243n.m13270c(drawableM12181c), zM2950j, DataSource.f2866c);
            }
        }
        m15147b(this.f16106a);
        throw new KotlinNothingValueException();
    }

    /* renamed from: b */
    public final Void m15147b(C8247r c8247r) {
        throw new IllegalStateException("Invalid android.resource URI: " + c8247r);
    }
}
