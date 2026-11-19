package p124p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import coil3.InterfaceC4574e;
import coil3.decode.DataSource;
import coil3.size.Precision;
import coil3.util.AbstractC4595d;
import kotlin.KotlinNothingValueException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Okio;
import p023c0.AbstractC4458c;
import p023c0.C4462g;
import p023c0.C4473r;
import p087k.AbstractC6616o;
import p087k.AbstractC6622u;
import p087k.C6621t;
import p110n.AbstractC7436s;
import p110n.C7437t;
import p124p.InterfaceC7582k;
import p187y.AbstractC7876i;
import p187y.C7880m;

/* renamed from: p.o */
/* loaded from: classes3.dex */
public final class C7586o implements InterfaceC7582k {

    /* renamed from: a */
    public final C6621t f10041a;

    /* renamed from: b */
    public final C7880m f10042b;

    /* renamed from: p.o$a */
    public static final class a implements InterfaceC7582k.a {
        /* renamed from: c */
        private final boolean m8989c(C6621t c6621t) {
            return Intrinsics.areEqual(c6621t.m7575c(), "android.resource");
        }

        @Override // p124p.InterfaceC7582k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC7582k mo1960a(C6621t c6621t, C7880m c7880m, InterfaceC4574e interfaceC4574e) {
            if (m8989c(c6621t)) {
                return new C7586o(c6621t, c7880m);
            }
            return null;
        }
    }

    public C7586o(C6621t c6621t, C7880m c7880m) {
        this.f10041a = c6621t;
        this.f10042b = c7880m;
    }

    @Override // p124p.InterfaceC7582k
    /* renamed from: a */
    public Object mo1943a(Continuation continuation) throws Resources.NotFoundException {
        Integer intOrNull;
        String strM7573a = this.f10041a.m7573a();
        if (strM7573a != null) {
            if (StringsKt.isBlank(strM7573a)) {
                strM7573a = null;
            }
            if (strM7573a != null) {
                String str = (String) CollectionsKt.lastOrNull(AbstractC6622u.m7582f(this.f10041a));
                if (str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) {
                    m8988b(this.f10041a);
                    throw new KotlinNothingValueException();
                }
                int iIntValue = intOrNull.intValue();
                Context contextM9661c = this.f10042b.m9661c();
                Resources resources = Intrinsics.areEqual(strM7573a, contextM9661c.getPackageName()) ? contextM9661c.getResources() : contextM9661c.getPackageManager().getResourcesForApplication(strM7573a);
                TypedValue typedValue = new TypedValue();
                resources.getValue(iIntValue, typedValue, true);
                String strM1566b = C4473r.f1339a.m1566b(typedValue.string.toString());
                if (!Intrinsics.areEqual(strM1566b, "text/xml")) {
                    TypedValue typedValue2 = new TypedValue();
                    return new C7587p(AbstractC7436s.m8482a(Okio.buffer(Okio.source(resources.openRawResource(iIntValue, typedValue2))), this.f10042b.m9665g(), new C7437t(strM7573a, iIntValue, typedValue2.density)), strM1566b, DataSource.f1621c);
                }
                Drawable drawableM1530c = Intrinsics.areEqual(strM7573a, contextM9661c.getPackageName()) ? AbstractC4458c.m1530c(contextM9661c, iIntValue) : AbstractC4458c.m1533f(contextM9661c, resources, iIntValue);
                boolean zM2059j = AbstractC4595d.m2059j(drawableM1530c);
                if (zM2059j) {
                    drawableM1530c = new BitmapDrawable(contextM9661c.getResources(), C4462g.f1332a.m1536a(drawableM1530c, AbstractC7876i.m9651j(this.f10042b), this.f10042b.m9669k(), this.f10042b.m9668j(), this.f10042b.m9667i() == Precision.f1916b));
                }
                return new C7584m(AbstractC6616o.m7570c(drawableM1530c), zM2059j, DataSource.f1621c);
            }
        }
        m8988b(this.f10041a);
        throw new KotlinNothingValueException();
    }

    /* renamed from: b */
    public final Void m8988b(C6621t c6621t) {
        throw new IllegalStateException("Invalid android.resource URI: " + c6621t);
    }
}
