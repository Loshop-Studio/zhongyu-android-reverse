package p253n;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import coil3.InterfaceC5470e;
import coil3.decode.DataSource;
import coil3.size.Precision;
import coil3.util.AbstractC5491d;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9979u;
import okio.Okio;
import p001a0.AbstractC0006c;
import p001a0.C0010g;
import p001a0.C0021r;
import p212k.AbstractC9761o;
import p212k.AbstractC9767u;
import p212k.C9766t;
import p228l.AbstractC10086s;
import p228l.C10087t;
import p253n.InterfaceC10281k;
import p310qd.AbstractC10793c0;
import p310qd.AbstractC10818y;
import p325rc.AbstractC10947g0;
import p380w.AbstractC11630j;
import p380w.C11634n;
import vc.InterfaceC11588c;

/* renamed from: n.o */
/* loaded from: classes3.dex */
public final class C10285o implements InterfaceC10281k {

    /* renamed from: a */
    public final C9766t f24477a;

    /* renamed from: b */
    public final C11634n f24478b;

    /* renamed from: n.o$a */
    public static final class a implements InterfaceC10281k.a {
        /* renamed from: c */
        private final boolean m21416c(C9766t c9766t) {
            return AbstractC9979u.m20289b(c9766t.m19685c(), "android.resource");
        }

        @Override // p253n.InterfaceC10281k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC10281k mo3225a(C9766t c9766t, C11634n c11634n, InterfaceC5470e interfaceC5470e) {
            if (m21416c(c9766t)) {
                return new C10285o(c9766t, c11634n);
            }
            return null;
        }
    }

    public C10285o(C9766t c9766t, C11634n c11634n) {
        this.f24477a = c9766t;
        this.f24478b = c11634n;
    }

    @Override // p253n.InterfaceC10281k
    /* renamed from: a */
    public Object mo3208a(InterfaceC11588c interfaceC11588c) throws Resources.NotFoundException {
        Integer numM23224q;
        String strM19683a = this.f24477a.m19683a();
        if (strM19683a != null) {
            if (AbstractC10793c0.m23132h0(strM19683a)) {
                strM19683a = null;
            }
            if (strM19683a != null) {
                String str = (String) AbstractC10947g0.m23957z0(AbstractC9767u.m19692f(this.f24477a));
                if (str == null || (numM23224q = AbstractC10818y.m23224q(str)) == null) {
                    m21415b(this.f24477a);
                    throw new KotlinNothingValueException();
                }
                int iIntValue = numM23224q.intValue();
                Context contextM25743c = this.f24478b.m25743c();
                Resources resources = AbstractC9979u.m20289b(strM19683a, contextM25743c.getPackageName()) ? contextM25743c.getResources() : contextM25743c.getPackageManager().getResourcesForApplication(strM19683a);
                TypedValue typedValue = new TypedValue();
                resources.getValue(iIntValue, typedValue, true);
                String strM49b = C0021r.f9a.m49b(typedValue.string.toString());
                if (!AbstractC9979u.m20289b(strM49b, "text/xml")) {
                    TypedValue typedValue2 = new TypedValue();
                    return new C10286p(AbstractC10086s.m21094a(Okio.buffer(Okio.source(resources.openRawResource(iIntValue, typedValue2))), this.f24478b.m25747g(), new C10087t(strM19683a, iIntValue, typedValue2.density)), strM49b, DataSource.f3612e);
                }
                Drawable drawableM14c = AbstractC9979u.m20289b(strM19683a, contextM25743c.getPackageName()) ? AbstractC0006c.m14c(contextM25743c, iIntValue) : AbstractC0006c.m17f(contextM25743c, resources, iIntValue);
                boolean zM3327j = AbstractC5491d.m3327j(drawableM14c);
                if (zM3327j) {
                    drawableM14c = new BitmapDrawable(contextM25743c.getResources(), C0010g.f2a.m20a(drawableM14c, AbstractC11630j.m25733j(this.f24478b), this.f24478b.m25751k(), this.f24478b.m25750j(), this.f24478b.m25749i() == Precision.f3907d));
                }
                return new C10283m(AbstractC9761o.m19680c(drawableM14c), zM3327j, DataSource.f3612e);
            }
        }
        m21415b(this.f24477a);
        throw new KotlinNothingValueException();
    }

    /* renamed from: b */
    public final Void m21415b(C9766t c9766t) {
        throw new IllegalStateException("Invalid android.resource URI: " + c9766t);
    }
}
