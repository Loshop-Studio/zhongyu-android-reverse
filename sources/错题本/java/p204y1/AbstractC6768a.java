package p204y1;

import android.graphics.Rect;
import android.support.v4.media.AbstractC0037f;
import android.view.View;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import coil3.InterfaceC3305k;
import coil3.core.R$id;
import coil3.decode.AbstractC3267h;
import coil3.request.NullRequestDataException;
import coil3.size.Scale;
import com.google.flatbuffers.C3821a;
import com.xuexiang.xui.widget.progress.ratingbar.PartialView;
import com.zykj.mistake.feature.notebook.detail.C4780d0;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import p000a.AbstractC0000a;
import p084i7.InterfaceC5686b;
import p101k7.C5760b;
import p101k7.InterfaceC5765g;
import p118m7.AbstractC6135f1;
import p118m7.AbstractC6191y0;
import p118m7.C6127d;
import p118m7.C6131e0;
import p118m7.C6141h1;
import p118m7.C6159n1;
import p118m7.C6170r0;
import p133o7.AbstractC6281e;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p154s.C6528b;
import p154s.C6530d;
import p154s.C6532f;
import p154s.ViewOnAttachStateChangeListenerC6541o;
import p162t.C6571a;
import p162t.C6576f;
import p162t.InterfaceC6573c;
import p167t4.AbstractC6591d;
import p167t4.C6592e;
import p185v7.AbstractC6675d;
import p191w4.AbstractC6719d;
import p191w4.C6716a;
import p191w4.C6717b;
import p191w4.InterfaceC6718c;
import p200x6.C6756f;
import p207y6.InterfaceC6779c;
import p207y6.InterfaceC6793q;
import p212z4.AbstractC6815b;
import p212z4.AbstractC6817d;
import p212z4.AbstractC6819f;
import p212z4.AbstractC6821h;

/* renamed from: y1.a */
/* loaded from: classes3.dex */
public abstract class AbstractC6768a {

    /* renamed from: a */
    public static DecimalFormat f11437a;

    /* renamed from: a */
    public static final C6528b m6437a(C6532f c6532f, Throwable th) {
        InterfaceC3305k interfaceC3305k;
        if (th instanceof NullRequestDataException) {
            InterfaceC6471c interfaceC6471c = c6532f.f10874n;
            C6530d c6530d = c6532f.f10880t;
            interfaceC3305k = (InterfaceC3305k) interfaceC6471c.invoke(c6532f);
            if (interfaceC3305k == null) {
                interfaceC3305k = (InterfaceC3305k) c6530d.f10845j.invoke(c6532f);
            }
            if (interfaceC3305k == null && (interfaceC3305k = (InterfaceC3305k) c6532f.f10873m.invoke(c6532f)) == null) {
                interfaceC3305k = (InterfaceC3305k) c6530d.f10844i.invoke(c6532f);
            }
        } else {
            interfaceC3305k = (InterfaceC3305k) c6532f.f10873m.invoke(c6532f);
            if (interfaceC3305k == null) {
                interfaceC3305k = (InterfaceC3305k) c6532f.f10880t.f10844i.invoke(c6532f);
            }
        }
        return new C6528b(interfaceC3305k, c6532f, th);
    }

    /* renamed from: b */
    public static final void m6438b(InterfaceC6718c interfaceC6718c, C6716a infrastructure, C6592e mainNavController, InterfaceC6473e content, Composer composer, int i) {
        int i8;
        AbstractC5830k.m5330g(infrastructure, "infrastructure");
        AbstractC5830k.m5330g(mainNavController, "mainNavController");
        AbstractC5830k.m5330g(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-750114795);
        if ((i & 6) == 0) {
            i8 = ((i & 8) == 0 ? composerStartRestartGroup.changed(interfaceC6718c) : composerStartRestartGroup.changedInstance(interfaceC6718c) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(infrastructure) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(mainNavController) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(content) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 1171) != 1170, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-750114795, i8, -1, "com.zykj.mistake.platform.MainRouteCompositionLocals (MainRouteCompositionLocals.kt:17)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{AbstractC6719d.f11339a.provides(interfaceC6718c), AbstractC6591d.f11002a.provides(mainNavController), AbstractC6819f.f11552a.provides(infrastructure.f11333a), AbstractC6815b.f11543a.provides(infrastructure.f11334b), AbstractC6817d.f11545a.provides(infrastructure.f11335c), AbstractC6821h.f11556a.provides(infrastructure.f11336d)}, ComposableLambdaKt.rememberComposableLambda(1047862485, true, new C6717b(content, 0), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4780d0(interfaceC6718c, infrastructure, mainNavController, content, i, 4));
        }
    }

    /* renamed from: c */
    public static float m6439c(PartialView partialView, float f, float f7) {
        if (f11437a == null) {
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.ENGLISH);
            decimalFormatSymbols.setDecimalSeparator('.');
            f11437a = new DecimalFormat("#.##", decimalFormatSymbols);
        }
        return Float.parseFloat(f11437a.format(((Integer) partialView.getTag()).intValue() - (1.0f - (Math.round(Float.parseFloat(r0.format((f7 - partialView.getLeft()) / partialView.getWidth())) / f) * f))));
    }

    /* renamed from: d */
    public static void m6440d(int i) {
        if (2 > i || i >= 37) {
            StringBuilder sbM94s = AbstractC0037f.m94s(i, "radix ", " was not in valid range ");
            sbM94s.append(new C6756f(2, 36, 1));
            throw new IllegalArgumentException(sbM94s.toString());
        }
    }

    /* renamed from: f */
    public static int m6441f(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* renamed from: g */
    public static final long m6442g(int i, int i8, C6576f c6576f, Scale scale, C6576f c6576f2) {
        int i9;
        int i10;
        if (!AbstractC5830k.m5325b(c6576f, C6576f.f10977c)) {
            i = m6456u(c6576f.f10978a, scale);
            i8 = m6456u(c6576f.f10979b, scale);
        }
        InterfaceC6573c interfaceC6573c = c6576f2.f10978a;
        InterfaceC6573c interfaceC6573c2 = c6576f2.f10979b;
        if ((interfaceC6573c instanceof C6571a) && i != Integer.MIN_VALUE && i != Integer.MAX_VALUE && i > (i10 = ((C6571a) interfaceC6573c).f10974a)) {
            i = i10;
        }
        if ((interfaceC6573c2 instanceof C6571a) && i8 != Integer.MIN_VALUE && i8 != Integer.MAX_VALUE && i8 > (i9 = ((C6571a) interfaceC6573c2).f10974a)) {
            i8 = i9;
        }
        return (i8 & 4294967295L) | (i << 32);
    }

    /* renamed from: h */
    public static final double m6443h(int i, int i8, int i9, int i10, Scale scale) {
        double d9 = i9 / i;
        double d10 = i10 / i8;
        int i11 = AbstractC3267h.f1903a[scale.ordinal()];
        if (i11 == 1) {
            return Math.max(d9, d10);
        }
        if (i11 == 2) {
            return Math.min(d9, d10);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: i */
    public static int m6444i(C3821a c3821a, long j7, long j8) {
        c3821a.m2773h(8, 16);
        ByteBuffer byteBuffer = c3821a.f2954a;
        int i = c3821a.f2955b - 8;
        c3821a.f2955b = i;
        byteBuffer.putLong(i, j8);
        for (int i8 = 0; i8 < 4; i8++) {
            ByteBuffer byteBuffer2 = c3821a.f2954a;
            int i9 = c3821a.f2955b - 1;
            c3821a.f2955b = i9;
            byteBuffer2.put(i9, (byte) 0);
        }
        c3821a.m2774i((int) j7);
        return c3821a.m2772g();
    }

    /* renamed from: j */
    public static int m6445j(char c) {
        int iDigit = Character.digit((int) c, 10);
        if (iDigit >= 0) {
            return iDigit;
        }
        throw new IllegalArgumentException("Char " + c + " is not a decimal digit");
    }

    /* renamed from: k */
    public static final boolean m6446k(char c, char c9, boolean z8) {
        if (c == c9) {
            return true;
        }
        if (!z8) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c9);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* renamed from: l */
    public static Rect m6447l(int i, int i8, int i9, int i10) {
        double d9;
        double d10;
        long jRound;
        int i11;
        double d11 = i9 < i ? i9 / i : Double.POSITIVE_INFINITY;
        double d12 = i10 < i8 ? i10 / i8 : Double.POSITIVE_INFINITY;
        if (d11 == Double.POSITIVE_INFINITY && d12 == Double.POSITIVE_INFINITY) {
            d9 = i8;
            d10 = i;
        } else if (d11 <= d12) {
            double d13 = i9;
            d9 = (i8 * d13) / i;
            d10 = d13;
        } else {
            d9 = i10;
            d10 = (i * d9) / i8;
        }
        double d14 = i9;
        int iRound = 0;
        if (d10 == d14) {
            jRound = Math.round((i10 - d9) / 2.0d);
        } else {
            double d15 = i10;
            if (d9 == d15) {
                iRound = (int) Math.round((d14 - d10) / 2.0d);
                i11 = 0;
                return new Rect(iRound, i11, ((int) Math.ceil(d10)) + iRound, ((int) Math.ceil(d9)) + i11);
            }
            iRound = (int) Math.round((d14 - d10) / 2.0d);
            jRound = Math.round((d15 - d9) / 2.0d);
        }
        i11 = (int) jRound;
        return new Rect(iRound, i11, ((int) Math.ceil(d10)) + iRound, ((int) Math.ceil(d9)) + i11);
    }

    /* renamed from: m */
    public static final InterfaceC6779c m6448m(InterfaceC5765g interfaceC5765g) {
        AbstractC5830k.m5330g(interfaceC5765g, "<this>");
        if (interfaceC5765g instanceof C5760b) {
            return ((C5760b) interfaceC5765g).f9117b;
        }
        if (interfaceC5765g instanceof C6141h1) {
            return m6448m(((C6141h1) interfaceC5765g).f9809a);
        }
        return null;
    }

    /* renamed from: n */
    public static final ViewOnAttachStateChangeListenerC6541o m6449n(View view) {
        ViewOnAttachStateChangeListenerC6541o viewOnAttachStateChangeListenerC6541o;
        Object tag = view.getTag(R$id.coil3_request_manager);
        ViewOnAttachStateChangeListenerC6541o viewOnAttachStateChangeListenerC6541o2 = tag instanceof ViewOnAttachStateChangeListenerC6541o ? (ViewOnAttachStateChangeListenerC6541o) tag : null;
        if (viewOnAttachStateChangeListenerC6541o2 != null) {
            return viewOnAttachStateChangeListenerC6541o2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(R$id.coil3_request_manager);
                viewOnAttachStateChangeListenerC6541o = tag2 instanceof ViewOnAttachStateChangeListenerC6541o ? (ViewOnAttachStateChangeListenerC6541o) tag2 : null;
                if (viewOnAttachStateChangeListenerC6541o == null) {
                    viewOnAttachStateChangeListenerC6541o = new ViewOnAttachStateChangeListenerC6541o(view);
                    view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC6541o);
                    view.setTag(R$id.coil3_request_manager, viewOnAttachStateChangeListenerC6541o);
                }
            } finally {
            }
        }
        return viewOnAttachStateChangeListenerC6541o;
    }

    /* renamed from: o */
    public static boolean m6450o(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    /* renamed from: p */
    public static Comparable m6451p(C2331Dp a9, C2331Dp b6) {
        AbstractC5830k.m5330g(a9, "a");
        AbstractC5830k.m5330g(b6, "b");
        return a9.compareTo(b6) >= 0 ? a9 : b6;
    }

    /* renamed from: q */
    public static final InterfaceC5686b m6452q(InterfaceC6779c interfaceC6779c, ArrayList arrayList, InterfaceC6469a interfaceC6469a) {
        InterfaceC5686b c6127d;
        C6170r0 c6170r0;
        AbstractC5830k.m5330g(interfaceC6779c, "<this>");
        if (interfaceC6779c.equals(AbstractC5832m.m5340a(Collection.class)) || interfaceC6779c.equals(AbstractC5832m.m5340a(List.class)) || interfaceC6779c.equals(AbstractC5832m.m5340a(List.class)) || interfaceC6779c.equals(AbstractC5832m.m5340a(ArrayList.class))) {
            c6127d = new C6127d((InterfaceC5686b) arrayList.get(0), 0);
        } else if (interfaceC6779c.equals(AbstractC5832m.m5340a(HashSet.class))) {
            c6127d = new C6127d((InterfaceC5686b) arrayList.get(0), 1);
        } else if (interfaceC6779c.equals(AbstractC5832m.m5340a(Set.class)) || interfaceC6779c.equals(AbstractC5832m.m5340a(Set.class)) || interfaceC6779c.equals(AbstractC5832m.m5340a(LinkedHashSet.class))) {
            c6127d = new C6127d((InterfaceC5686b) arrayList.get(0), 2);
        } else if (interfaceC6779c.equals(AbstractC5832m.m5340a(HashMap.class))) {
            c6127d = new C6131e0((InterfaceC5686b) arrayList.get(0), (InterfaceC5686b) arrayList.get(1), 0);
        } else if (interfaceC6779c.equals(AbstractC5832m.m5340a(Map.class)) || interfaceC6779c.equals(AbstractC5832m.m5340a(Map.class)) || interfaceC6779c.equals(AbstractC5832m.m5340a(LinkedHashMap.class))) {
            c6127d = new C6131e0((InterfaceC5686b) arrayList.get(0), (InterfaceC5686b) arrayList.get(1), 1);
        } else {
            if (interfaceC6779c.equals(AbstractC5832m.m5340a(Map.Entry.class))) {
                InterfaceC5686b keySerializer = (InterfaceC5686b) arrayList.get(0);
                InterfaceC5686b valueSerializer = (InterfaceC5686b) arrayList.get(1);
                AbstractC5830k.m5330g(keySerializer, "keySerializer");
                AbstractC5830k.m5330g(valueSerializer, "valueSerializer");
                c6170r0 = new C6170r0(keySerializer, valueSerializer, 0);
            } else if (interfaceC6779c.equals(AbstractC5832m.m5340a(Pair.class))) {
                InterfaceC5686b keySerializer2 = (InterfaceC5686b) arrayList.get(0);
                InterfaceC5686b valueSerializer2 = (InterfaceC5686b) arrayList.get(1);
                AbstractC5830k.m5330g(keySerializer2, "keySerializer");
                AbstractC5830k.m5330g(valueSerializer2, "valueSerializer");
                c6170r0 = new C6170r0(keySerializer2, valueSerializer2, 1);
            } else if (interfaceC6779c.equals(AbstractC5832m.m5340a(Triple.class))) {
                InterfaceC5686b aSerializer = (InterfaceC5686b) arrayList.get(0);
                InterfaceC5686b bSerializer = (InterfaceC5686b) arrayList.get(1);
                InterfaceC5686b cSerializer = (InterfaceC5686b) arrayList.get(2);
                AbstractC5830k.m5330g(aSerializer, "aSerializer");
                AbstractC5830k.m5330g(bSerializer, "bSerializer");
                AbstractC5830k.m5330g(cSerializer, "cSerializer");
                c6127d = new C6159n1(aSerializer, bSerializer, cSerializer);
            } else if (AbstractC6675d.m6349m(interfaceC6779c).isArray()) {
                Object objInvoke = interfaceC6469a.invoke();
                AbstractC5830k.m5328e(objInvoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                c6127d = AbstractC5806u.m5262a((InterfaceC6779c) objInvoke, (InterfaceC5686b) arrayList.get(0));
            } else {
                c6127d = null;
            }
            c6127d = c6170r0;
        }
        if (c6127d != null) {
            return c6127d;
        }
        InterfaceC5686b[] interfaceC5686bArr = (InterfaceC5686b[]) arrayList.toArray(new InterfaceC5686b[0]);
        return AbstractC6191y0.m5834d(interfaceC6779c, (InterfaceC5686b[]) Arrays.copyOf(interfaceC5686bArr, interfaceC5686bArr.length));
    }

    /* renamed from: r */
    public static final InterfaceC5686b m6453r(InterfaceC6779c interfaceC6779c) {
        AbstractC5830k.m5330g(interfaceC6779c, "<this>");
        InterfaceC5686b interfaceC5686bM6454s = m6454s(interfaceC6779c);
        if (interfaceC5686bM6454s != null) {
            return interfaceC5686bM6454s;
        }
        AbstractC6191y0.m5840j(interfaceC6779c);
        throw null;
    }

    /* renamed from: s */
    public static final InterfaceC5686b m6454s(InterfaceC6779c interfaceC6779c) {
        AbstractC5830k.m5330g(interfaceC6779c, "<this>");
        InterfaceC5686b interfaceC5686bM5834d = AbstractC6191y0.m5834d(interfaceC6779c, new InterfaceC5686b[0]);
        return interfaceC5686bM5834d == null ? (InterfaceC5686b) AbstractC6135f1.f9799a.get(interfaceC6779c) : interfaceC5686bM5834d;
    }

    /* renamed from: t */
    public static final ArrayList m6455t(AbstractC6281e abstractC6281e, List typeArguments, boolean z8) {
        AbstractC5830k.m5330g(abstractC6281e, "<this>");
        AbstractC5830k.m5330g(typeArguments, "typeArguments");
        if (!z8) {
            ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(typeArguments, 10));
            Iterator it = typeArguments.iterator();
            while (it.hasNext()) {
                InterfaceC6793q type = (InterfaceC6793q) it.next();
                AbstractC5830k.m5330g(type, "type");
                InterfaceC5686b interfaceC5686bM12o = AbstractC0000a.m12o(abstractC6281e, type, false);
                if (interfaceC5686bM12o == null) {
                    return null;
                }
                arrayList.add(interfaceC5686bM12o);
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC5806u.m5277p(typeArguments, 10));
        Iterator it2 = typeArguments.iterator();
        while (it2.hasNext()) {
            InterfaceC6793q type2 = (InterfaceC6793q) it2.next();
            AbstractC5830k.m5330g(type2, "type");
            InterfaceC5686b interfaceC5686bM12o2 = AbstractC0000a.m12o(abstractC6281e, type2, true);
            if (interfaceC5686bM12o2 == null) {
                InterfaceC6779c interfaceC6779cM5839i = AbstractC6191y0.m5839i(type2);
                AbstractC5830k.m5330g(interfaceC6779cM5839i, "<this>");
                AbstractC6191y0.m5840j(interfaceC6779cM5839i);
                throw null;
            }
            arrayList2.add(interfaceC5686bM12o2);
        }
        return arrayList2;
    }

    /* renamed from: u */
    public static int m6456u(InterfaceC6573c interfaceC6573c, Scale scale) {
        if (interfaceC6573c instanceof C6571a) {
            return ((C6571a) interfaceC6573c).f10974a;
        }
        int i = AbstractC3267h.f1903a[scale.ordinal()];
        if (i == 1) {
            return Integer.MIN_VALUE;
        }
        if (i == 2) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: e */
    public abstract List mo6413e(String str, List list);
}
