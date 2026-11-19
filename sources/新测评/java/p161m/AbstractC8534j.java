package p161m;

import android.content.Context;
import androidx.compose.p013ui.graphics.ImageBitmap;
import androidx.compose.p013ui.graphics.painter.Painter;
import androidx.compose.p013ui.graphics.vector.ImageVector;
import androidx.compose.p013ui.layout.ContentScale;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p013ui.platform.InspectionModeKt;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import coil3.compose.AsyncImagePainter;
import coil3.compose.AsyncImagePreviewHandler;
import coil3.compose.ConstraintsSizeResolver;
import coil3.request.NullRequestDataException;
import coil3.size.Scale;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineDispatcher;
import p150l.AbstractC8481i;
import p161m.AbstractC8534j;
import p290y.C9886e;
import p300z.AbstractC9955b;
import p300z.C9958e;
import p300z.InterfaceC9954a;
import p300z.InterfaceC9960g;

/* renamed from: m.j */
/* loaded from: classes3.dex */
public abstract class AbstractC8534j {

    /* renamed from: a */
    public static final MeasurePolicy f14170a = a.f14172a;

    /* renamed from: b */
    public static final long f14171b = ConstraintsKt.Constraints$default(0, 0, 0, 0, 5, null);

    /* renamed from: m.j$a */
    public static final class a implements MeasurePolicy {

        /* renamed from: a */
        public static final a f14172a = new a();

        /* renamed from: b */
        public static final Unit m14046b(Placeable.PlacementScope placementScope) {
            return Unit.INSTANCE;
        }

        @Override // androidx.compose.p013ui.layout.MeasurePolicy
        /* renamed from: measure-3p2s80s */
        public final MeasureResult mo16988measure3p2s80s(MeasureScope measureScope, List list, long j10) {
            return MeasureScope.layout$default(measureScope, Constraints.m23516getMinWidthimpl(j10), Constraints.m23515getMinHeightimpl(j10), null, new Function1() { // from class: m.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC8534j.a.m14046b((Placeable.PlacementScope) obj);
                }
            }, 4, null);
        }
    }

    /* renamed from: c */
    public static final float m14026c(long j10, float f10) {
        return RangesKt.coerceIn(f10, Constraints.m23515getMinHeightimpl(j10), Constraints.m23513getMaxHeightimpl(j10));
    }

    /* renamed from: d */
    public static final float m14027d(long j10, float f10) {
        return RangesKt.coerceIn(f10, Constraints.m23516getMinWidthimpl(j10), Constraints.m23514getMaxWidthimpl(j10));
    }

    /* renamed from: e */
    public static final CoroutineDispatcher m14028e(CoroutineContext coroutineContext) {
        return (CoroutineDispatcher) coroutineContext.get(CoroutineDispatcher.INSTANCE);
    }

    /* renamed from: f */
    public static final MeasurePolicy m14029f() {
        return f14170a;
    }

    /* renamed from: g */
    public static final long m14030g() {
        return f14171b;
    }

    /* renamed from: h */
    public static final Function1 m14031h(final Function1 function1, final Function1 function12, final Function1 function13) {
        if (function1 == null && function12 == null && function13 == null) {
            return null;
        }
        return new Function1() { // from class: m.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC8534j.m14032i(function1, function12, function13, (AsyncImagePainter.InterfaceC5172c) obj);
            }
        };
    }

    /* renamed from: i */
    public static final Unit m14032i(Function1 function1, Function1 function12, Function1 function13, AsyncImagePainter.InterfaceC5172c interfaceC5172c) {
        if (interfaceC5172c instanceof AsyncImagePainter.InterfaceC5172c.c) {
            if (function1 != null) {
                function1.invoke(interfaceC5172c);
            }
        } else if (interfaceC5172c instanceof AsyncImagePainter.InterfaceC5172c.d) {
            if (function12 != null) {
                function12.invoke(interfaceC5172c);
            }
        } else if (interfaceC5172c instanceof AsyncImagePainter.InterfaceC5172c.b) {
            if (function13 != null) {
                function13.invoke(interfaceC5172c);
            }
        } else if (!(interfaceC5172c instanceof AsyncImagePainter.InterfaceC5172c.a)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: j */
    public static final AsyncImagePreviewHandler m14033j(Composer composer, int i10) {
        AsyncImagePreviewHandler asyncImagePreviewHandler;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2074249623, i10, -1, "coil3.compose.internal.previewHandler (utils.kt:218)");
        }
        if (((Boolean) composer.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue()) {
            composer.startReplaceGroup(2019071620);
            asyncImagePreviewHandler = (AsyncImagePreviewHandler) composer.consume(AbstractC8481i.m13865c());
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(2019129125);
            composer.endReplaceGroup();
            asyncImagePreviewHandler = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return asyncImagePreviewHandler;
    }

    /* renamed from: k */
    public static final InterfaceC9960g m14034k(ContentScale contentScale, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-894086142, i10, -1, "coil3.compose.internal.rememberSizeResolver (utils.kt:86)");
        }
        boolean zAreEqual = Intrinsics.areEqual(contentScale, ContentScale.INSTANCE.getNone());
        boolean zChanged = composer.changed(zAreEqual);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = zAreEqual ? InterfaceC9960g.f17804b0 : new ConstraintsSizeResolver();
            composer.updateRememberedValue(objRememberedValue);
        }
        InterfaceC9960g interfaceC9960g = (InterfaceC9960g) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return interfaceC9960g;
    }

    /* renamed from: l */
    public static final C9886e m14035l(Object obj, ContentScale contentScale, Composer composer, int i10) {
        composer.startReplaceGroup(-329318062);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-329318062, i10, -1, "coil3.compose.internal.requestOfWithSizeResolver (utils.kt:61)");
        }
        if (!(obj instanceof C9886e)) {
            composer.startReplaceGroup(-1008549326);
            Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            InterfaceC9960g interfaceC9960gM14034k = m14034k(contentScale, composer, (i10 >> 3) & 14);
            boolean zChanged = composer.changed(context) | composer.changed(obj) | composer.changed(interfaceC9960gM14034k);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C9886e.a(context).m16643c(obj).m16651k(interfaceC9960gM14034k).m16641a();
                composer.updateRememberedValue(objRememberedValue);
            }
            C9886e c9886e = (C9886e) objRememberedValue;
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return c9886e;
        }
        composer.startReplaceGroup(-1008895720);
        C9886e c9886e2 = (C9886e) obj;
        if (c9886e2.m16622h().m16681m() != null) {
            composer.startReplaceGroup(-1008855668);
            composer.endReplaceGroup();
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return c9886e2;
        }
        composer.startReplaceGroup(-1008807494);
        InterfaceC9960g interfaceC9960gM14034k2 = m14034k(contentScale, composer, (i10 >> 3) & 14);
        boolean zChanged2 = composer.changed(c9886e2) | composer.changed(interfaceC9960gM14034k2);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = C9886e.m16613A(c9886e2, null, 1, null).m16651k(interfaceC9960gM14034k2).m16641a();
            composer.updateRememberedValue(objRememberedValue2);
        }
        C9886e c9886e3 = (C9886e) objRememberedValue2;
        composer.endReplaceGroup();
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return c9886e3;
    }

    /* renamed from: m */
    public static final InterfaceC9954a m14036m(int i10) {
        return i10 != Integer.MAX_VALUE ? InterfaceC9954a.a.m16763a(AbstractC9955b.m16769a(i10)) : InterfaceC9954a.b.f17795a;
    }

    /* renamed from: n */
    public static final long m14037n(long j10) {
        return IntSize.m23727constructorimpl((MathKt.roundToInt(Float.intBitsToFloat((int) (j10 & 4294967295L))) & 4294967295L) | (MathKt.roundToInt(Float.intBitsToFloat((int) (j10 >> 32))) << 32));
    }

    /* renamed from: o */
    public static final Scale m14038o(ContentScale contentScale) {
        ContentScale.Companion companion = ContentScale.INSTANCE;
        return (Intrinsics.areEqual(contentScale, companion.getFit()) || Intrinsics.areEqual(contentScale, companion.getInside())) ? Scale.f3236b : Scale.f3235a;
    }

    /* renamed from: p */
    public static final C9958e m14039p(long j10) {
        return new C9958e(m14036m(Constraints.m23514getMaxWidthimpl(j10)), m14036m(Constraints.m23513getMaxHeightimpl(j10)));
    }

    /* renamed from: q */
    public static final Function1 m14040q(final Painter painter, final Painter painter2, final Painter painter3) {
        return (painter == null && painter2 == null && painter3 == null) ? AsyncImagePainter.INSTANCE.m2920a() : new Function1() { // from class: m.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC8534j.m14041r(painter, painter3, painter2, (AsyncImagePainter.InterfaceC5172c) obj);
            }
        };
    }

    /* renamed from: r */
    public static final AsyncImagePainter.InterfaceC5172c m14041r(Painter painter, Painter painter2, Painter painter3, AsyncImagePainter.InterfaceC5172c interfaceC5172c) {
        if (interfaceC5172c instanceof AsyncImagePainter.InterfaceC5172c.c) {
            AsyncImagePainter.InterfaceC5172c.c cVar = (AsyncImagePainter.InterfaceC5172c.c) interfaceC5172c;
            return painter != null ? cVar.m2927b(painter) : cVar;
        }
        boolean z9 = interfaceC5172c instanceof AsyncImagePainter.InterfaceC5172c.b;
        AsyncImagePainter.InterfaceC5172c interfaceC5172c2 = interfaceC5172c;
        if (z9) {
            AsyncImagePainter.InterfaceC5172c.b bVar = (AsyncImagePainter.InterfaceC5172c.b) interfaceC5172c;
            boolean z10 = bVar.m2926d().m16612b() instanceof NullRequestDataException;
            interfaceC5172c2 = bVar;
            interfaceC5172c2 = bVar;
            if (z10) {
                if (painter2 != null) {
                    return AsyncImagePainter.InterfaceC5172c.b.m2924c(bVar, painter2, null, 2, null);
                }
            } else if (painter3 != null) {
                return AsyncImagePainter.InterfaceC5172c.b.m2924c(bVar, painter3, null, 2, null);
            }
        }
        return interfaceC5172c2;
    }

    /* renamed from: s */
    public static final Void m14042s(String str, String str2) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + str2);
    }

    /* renamed from: t */
    public static /* synthetic */ Void m14043t(String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "If you wish to display this " + str + ", use androidx.compose.foundation.Image.";
        }
        return m14042s(str, str2);
    }

    /* renamed from: u */
    public static final void m14044u(C9886e c9886e) {
        Object objM16618d = c9886e.m16618d();
        if (objM16618d instanceof C9886e.a) {
            m14042s("ImageRequest.Builder", "Did you forget to call ImageRequest.Builder.build()?");
            throw new KotlinNothingValueException();
        }
        if (objM16618d instanceof ImageBitmap) {
            m14043t("ImageBitmap", null, 2, null);
            throw new KotlinNothingValueException();
        }
        if (objM16618d instanceof ImageVector) {
            m14043t("ImageVector", null, 2, null);
            throw new KotlinNothingValueException();
        }
        if (objM16618d instanceof Painter) {
            m14043t("Painter", null, 2, null);
            throw new KotlinNothingValueException();
        }
        AbstractC8535k.m14047a(c9886e);
    }
}
