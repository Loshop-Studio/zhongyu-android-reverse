package p173m;

import android.content.Context;
import androidx.compose.p012ui.graphics.ImageBitmap;
import androidx.compose.p012ui.graphics.painter.Painter;
import androidx.compose.p012ui.graphics.vector.ImageVector;
import androidx.compose.p012ui.layout.ContentScale;
import androidx.compose.p012ui.layout.MeasurePolicy;
import androidx.compose.p012ui.layout.MeasureResult;
import androidx.compose.p012ui.layout.MeasureScope;
import androidx.compose.p012ui.layout.Placeable;
import androidx.compose.p012ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p012ui.platform.InspectionModeKt;
import androidx.compose.p012ui.unit.Constraints;
import androidx.compose.p012ui.unit.ConstraintsKt;
import androidx.compose.p012ui.unit.IntSize;
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
import p163l.AbstractC8863i;
import p173m.AbstractC8937j;
import p297y.C9924e;
import p307z.AbstractC9972b;
import p307z.C9975e;
import p307z.InterfaceC9971a;
import p307z.InterfaceC9977g;

/* renamed from: m.j */
/* loaded from: classes3.dex */
public abstract class AbstractC8937j {

    /* renamed from: a */
    public static final MeasurePolicy f14972a = a.f14974a;

    /* renamed from: b */
    public static final long f14973b = ConstraintsKt.Constraints$default(0, 0, 0, 0, 5, null);

    /* renamed from: m.j$a */
    public static final class a implements MeasurePolicy {

        /* renamed from: a */
        public static final a f14974a = new a();

        /* renamed from: b */
        public static final Unit m14248b(Placeable.PlacementScope placementScope) {
            return Unit.INSTANCE;
        }

        @Override // androidx.compose.p012ui.layout.MeasurePolicy
        /* renamed from: measure-3p2s80s */
        public final MeasureResult mo17421measure3p2s80s(MeasureScope measureScope, List list, long j9) {
            return MeasureScope.layout$default(measureScope, Constraints.m23949getMinWidthimpl(j9), Constraints.m23948getMinHeightimpl(j9), null, new Function1() { // from class: m.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC8937j.a.m14248b((Placeable.PlacementScope) obj);
                }
            }, 4, null);
        }
    }

    /* renamed from: c */
    public static final float m14228c(long j9, float f10) {
        return RangesKt.coerceIn(f10, Constraints.m23948getMinHeightimpl(j9), Constraints.m23946getMaxHeightimpl(j9));
    }

    /* renamed from: d */
    public static final float m14229d(long j9, float f10) {
        return RangesKt.coerceIn(f10, Constraints.m23949getMinWidthimpl(j9), Constraints.m23947getMaxWidthimpl(j9));
    }

    /* renamed from: e */
    public static final CoroutineDispatcher m14230e(CoroutineContext coroutineContext) {
        return (CoroutineDispatcher) coroutineContext.get(CoroutineDispatcher.INSTANCE);
    }

    /* renamed from: f */
    public static final MeasurePolicy m14231f() {
        return f14972a;
    }

    /* renamed from: g */
    public static final long m14232g() {
        return f14973b;
    }

    /* renamed from: h */
    public static final Function1 m14233h(final Function1 function1, final Function1 function12, final Function1 function13) {
        if (function1 == null && function12 == null && function13 == null) {
            return null;
        }
        return new Function1() { // from class: m.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC8937j.m14234i(function1, function12, function13, (AsyncImagePainter.InterfaceC5307c) obj);
            }
        };
    }

    /* renamed from: i */
    public static final Unit m14234i(Function1 function1, Function1 function12, Function1 function13, AsyncImagePainter.InterfaceC5307c interfaceC5307c) {
        if (interfaceC5307c instanceof AsyncImagePainter.InterfaceC5307c.c) {
            if (function1 != null) {
                function1.invoke(interfaceC5307c);
            }
        } else if (interfaceC5307c instanceof AsyncImagePainter.InterfaceC5307c.d) {
            if (function12 != null) {
                function12.invoke(interfaceC5307c);
            }
        } else if (interfaceC5307c instanceof AsyncImagePainter.InterfaceC5307c.b) {
            if (function13 != null) {
                function13.invoke(interfaceC5307c);
            }
        } else if (!(interfaceC5307c instanceof AsyncImagePainter.InterfaceC5307c.a)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: j */
    public static final AsyncImagePreviewHandler m14235j(Composer composer, int i9) {
        AsyncImagePreviewHandler asyncImagePreviewHandler;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2074249623, i9, -1, "coil3.compose.internal.previewHandler (utils.kt:218)");
        }
        if (((Boolean) composer.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue()) {
            composer.startReplaceGroup(2019071620);
            asyncImagePreviewHandler = (AsyncImagePreviewHandler) composer.consume(AbstractC8863i.m13720c());
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
    public static final InterfaceC9977g m14236k(ContentScale contentScale, Composer composer, int i9) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-894086142, i9, -1, "coil3.compose.internal.rememberSizeResolver (utils.kt:86)");
        }
        boolean zAreEqual = Intrinsics.areEqual(contentScale, ContentScale.INSTANCE.getNone());
        boolean zChanged = composer.changed(zAreEqual);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = zAreEqual ? InterfaceC9977g.f17948b0 : new ConstraintsSizeResolver();
            composer.updateRememberedValue(objRememberedValue);
        }
        InterfaceC9977g interfaceC9977g = (InterfaceC9977g) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return interfaceC9977g;
    }

    /* renamed from: l */
    public static final C9924e m14237l(Object obj, ContentScale contentScale, Composer composer, int i9) {
        composer.startReplaceGroup(-329318062);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-329318062, i9, -1, "coil3.compose.internal.requestOfWithSizeResolver (utils.kt:61)");
        }
        if (!(obj instanceof C9924e)) {
            composer.startReplaceGroup(-1008549326);
            Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            InterfaceC9977g interfaceC9977gM14236k = m14236k(contentScale, composer, (i9 >> 3) & 14);
            boolean zChanged = composer.changed(context) | composer.changed(obj) | composer.changed(interfaceC9977gM14236k);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C9924e.a(context).m17045c(obj).m17052j(interfaceC9977gM14236k).m17043a();
                composer.updateRememberedValue(objRememberedValue);
            }
            C9924e c9924e = (C9924e) objRememberedValue;
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return c9924e;
        }
        composer.startReplaceGroup(-1008895720);
        C9924e c9924e2 = (C9924e) obj;
        if (c9924e2.m17024h().m17082m() != null) {
            composer.startReplaceGroup(-1008855668);
            composer.endReplaceGroup();
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return c9924e2;
        }
        composer.startReplaceGroup(-1008807494);
        InterfaceC9977g interfaceC9977gM14236k2 = m14236k(contentScale, composer, (i9 >> 3) & 14);
        boolean zChanged2 = composer.changed(c9924e2) | composer.changed(interfaceC9977gM14236k2);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = C9924e.m17015A(c9924e2, null, 1, null).m17052j(interfaceC9977gM14236k2).m17043a();
            composer.updateRememberedValue(objRememberedValue2);
        }
        C9924e c9924e3 = (C9924e) objRememberedValue2;
        composer.endReplaceGroup();
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return c9924e3;
    }

    /* renamed from: m */
    public static final InterfaceC9971a m14238m(int i9) {
        return i9 != Integer.MAX_VALUE ? InterfaceC9971a.a.m17250a(AbstractC9972b.m17256a(i9)) : InterfaceC9971a.b.f17939a;
    }

    /* renamed from: n */
    public static final long m14239n(long j9) {
        return IntSize.m24160constructorimpl((MathKt.roundToInt(Float.intBitsToFloat((int) (j9 & 4294967295L))) & 4294967295L) | (MathKt.roundToInt(Float.intBitsToFloat((int) (j9 >> 32))) << 32));
    }

    /* renamed from: o */
    public static final Scale m14240o(ContentScale contentScale) {
        ContentScale.Companion companion = ContentScale.INSTANCE;
        return (Intrinsics.areEqual(contentScale, companion.getFit()) || Intrinsics.areEqual(contentScale, companion.getInside())) ? Scale.f3124b : Scale.f3123a;
    }

    /* renamed from: p */
    public static final C9975e m14241p(long j9) {
        return new C9975e(m14238m(Constraints.m23947getMaxWidthimpl(j9)), m14238m(Constraints.m23946getMaxHeightimpl(j9)));
    }

    /* renamed from: q */
    public static final Function1 m14242q(final Painter painter, final Painter painter2, final Painter painter3) {
        return (painter == null && painter2 == null && painter3 == null) ? AsyncImagePainter.INSTANCE.m2648a() : new Function1() { // from class: m.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC8937j.m14243r(painter, painter3, painter2, (AsyncImagePainter.InterfaceC5307c) obj);
            }
        };
    }

    /* renamed from: r */
    public static final AsyncImagePainter.InterfaceC5307c m14243r(Painter painter, Painter painter2, Painter painter3, AsyncImagePainter.InterfaceC5307c interfaceC5307c) {
        if (interfaceC5307c instanceof AsyncImagePainter.InterfaceC5307c.c) {
            AsyncImagePainter.InterfaceC5307c.c cVar = (AsyncImagePainter.InterfaceC5307c.c) interfaceC5307c;
            return painter != null ? cVar.m2655b(painter) : cVar;
        }
        boolean z9 = interfaceC5307c instanceof AsyncImagePainter.InterfaceC5307c.b;
        AsyncImagePainter.InterfaceC5307c interfaceC5307c2 = interfaceC5307c;
        if (z9) {
            AsyncImagePainter.InterfaceC5307c.b bVar = (AsyncImagePainter.InterfaceC5307c.b) interfaceC5307c;
            boolean z10 = bVar.m2654d().m17014c() instanceof NullRequestDataException;
            interfaceC5307c2 = bVar;
            interfaceC5307c2 = bVar;
            if (z10) {
                if (painter2 != null) {
                    return AsyncImagePainter.InterfaceC5307c.b.m2652c(bVar, painter2, null, 2, null);
                }
            } else if (painter3 != null) {
                return AsyncImagePainter.InterfaceC5307c.b.m2652c(bVar, painter3, null, 2, null);
            }
        }
        return interfaceC5307c2;
    }

    /* renamed from: s */
    public static final Void m14244s(String str, String str2) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + str2);
    }

    /* renamed from: t */
    public static /* synthetic */ Void m14245t(String str, String str2, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            str2 = "If you wish to display this " + str + ", use androidx.compose.foundation.Image.";
        }
        return m14244s(str, str2);
    }

    /* renamed from: u */
    public static final void m14246u(C9924e c9924e) {
        Object objM17020d = c9924e.m17020d();
        if (objM17020d instanceof C9924e.a) {
            m14244s("ImageRequest.Builder", "Did you forget to call ImageRequest.Builder.build()?");
            throw new KotlinNothingValueException();
        }
        if (objM17020d instanceof ImageBitmap) {
            m14245t("ImageBitmap", null, 2, null);
            throw new KotlinNothingValueException();
        }
        if (objM17020d instanceof ImageVector) {
            m14245t("ImageVector", null, 2, null);
            throw new KotlinNothingValueException();
        }
        if (objM17020d instanceof Painter) {
            m14245t("Painter", null, 2, null);
            throw new KotlinNothingValueException();
        }
        AbstractC8938k.m14249a(c9924e);
    }
}
