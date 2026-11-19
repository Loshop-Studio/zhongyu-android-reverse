package p103m;

import android.content.Context;
import androidx.compose.p009ui.graphics.ImageBitmap;
import androidx.compose.p009ui.graphics.painter.Painter;
import androidx.compose.p009ui.graphics.vector.ImageVector;
import androidx.compose.p009ui.layout.ContentScale;
import androidx.compose.p009ui.layout.MeasurePolicy;
import androidx.compose.p009ui.layout.MeasureResult;
import androidx.compose.p009ui.layout.MeasureScope;
import androidx.compose.p009ui.layout.Placeable;
import androidx.compose.p009ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p009ui.platform.InspectionModeKt;
import androidx.compose.p009ui.unit.Constraints;
import androidx.compose.p009ui.unit.ConstraintsKt;
import androidx.compose.p009ui.unit.IntSize;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import coil3.compose.AsyncImagePreviewHandler;
import coil3.size.Scale;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineDispatcher;
import p096l.AbstractC7266h;
import p103m.AbstractC7365h;
import p187y.C7872e;
import p194z.AbstractC7920b;
import p194z.C7923e;
import p194z.InterfaceC7919a;

/* renamed from: m.h */
/* loaded from: classes3.dex */
public abstract class AbstractC7365h {

    /* renamed from: a */
    public static final MeasurePolicy f9358a = a.f9360a;

    /* renamed from: b */
    public static final long f9359b = ConstraintsKt.Constraints$default(0, 0, 0, 0, 5, null);

    /* renamed from: m.h$a */
    public static final class a implements MeasurePolicy {

        /* renamed from: a */
        public static final a f9360a = new a();

        /* renamed from: b */
        public static final Unit m8384b(Placeable.PlacementScope placementScope) {
            return Unit.INSTANCE;
        }

        @Override // androidx.compose.p009ui.layout.MeasurePolicy
        /* renamed from: measure-3p2s80s */
        public final MeasureResult mo9911measure3p2s80s(MeasureScope measureScope, List list, long j6) {
            return MeasureScope.layout$default(measureScope, Constraints.m16439getMinWidthimpl(j6), Constraints.m16438getMinHeightimpl(j6), null, new Function1() { // from class: m.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC7365h.a.m8384b((Placeable.PlacementScope) obj);
                }
            }, 4, null);
        }
    }

    /* renamed from: a */
    public static final float m8370a(long j6, float f6) {
        return RangesKt.coerceIn(f6, Constraints.m16438getMinHeightimpl(j6), Constraints.m16436getMaxHeightimpl(j6));
    }

    /* renamed from: b */
    public static final float m8371b(long j6, float f6) {
        return RangesKt.coerceIn(f6, Constraints.m16439getMinWidthimpl(j6), Constraints.m16437getMaxWidthimpl(j6));
    }

    /* renamed from: c */
    public static final CoroutineDispatcher m8372c(CoroutineContext coroutineContext) {
        return (CoroutineDispatcher) coroutineContext.get(CoroutineDispatcher.INSTANCE);
    }

    /* renamed from: d */
    public static final long m8373d() {
        return f9359b;
    }

    /* renamed from: e */
    public static final AsyncImagePreviewHandler m8374e(Composer composer, int i6) {
        AsyncImagePreviewHandler asyncImagePreviewHandler;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2074249623, i6, -1, "coil3.compose.internal.previewHandler (utils.kt:218)");
        }
        if (((Boolean) composer.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue()) {
            composer.startReplaceGroup(2019071620);
            asyncImagePreviewHandler = (AsyncImagePreviewHandler) composer.consume(AbstractC7266h.m8189c());
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

    /* renamed from: f */
    public static final C7872e m8375f(Object obj, Composer composer, int i6) {
        composer.startReplaceGroup(1319639034);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1319639034, i6, -1, "coil3.compose.internal.requestOf (utils.kt:42)");
        }
        if (obj instanceof C7872e) {
            composer.startReplaceGroup(1530922508);
            C7872e c7872e = (C7872e) obj;
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return c7872e;
        }
        composer.startReplaceGroup(1530961754);
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        boolean zChanged = composer.changed(context) | composer.changed(obj);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new C7872e.a(context).m9600c(obj).m9598a();
            composer.updateRememberedValue(objRememberedValue);
        }
        C7872e c7872e2 = (C7872e) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return c7872e2;
    }

    /* renamed from: g */
    public static final InterfaceC7919a m8376g(int i6) {
        return i6 != Integer.MAX_VALUE ? InterfaceC7919a.a.m9711a(AbstractC7920b.m9717a(i6)) : InterfaceC7919a.b.f10638a;
    }

    /* renamed from: h */
    public static final long m8377h(long j6) {
        return IntSize.m16650constructorimpl((MathKt.roundToInt(Float.intBitsToFloat((int) (j6 & 4294967295L))) & 4294967295L) | (MathKt.roundToInt(Float.intBitsToFloat((int) (j6 >> 32))) << 32));
    }

    /* renamed from: i */
    public static final Scale m8378i(ContentScale contentScale) {
        ContentScale.Companion companion = ContentScale.INSTANCE;
        return (Intrinsics.areEqual(contentScale, companion.getFit()) || Intrinsics.areEqual(contentScale, companion.getInside())) ? Scale.f1920b : Scale.f1919a;
    }

    /* renamed from: j */
    public static final C7923e m8379j(long j6) {
        return new C7923e(m8376g(Constraints.m16437getMaxWidthimpl(j6)), m8376g(Constraints.m16436getMaxHeightimpl(j6)));
    }

    /* renamed from: k */
    public static final Void m8380k(String str, String str2) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + str2);
    }

    /* renamed from: l */
    public static /* synthetic */ Void m8381l(String str, String str2, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            str2 = "If you wish to display this " + str + ", use androidx.compose.foundation.Image.";
        }
        return m8380k(str, str2);
    }

    /* renamed from: m */
    public static final void m8382m(C7872e c7872e) {
        Object objM9575d = c7872e.m9575d();
        if (objM9575d instanceof C7872e.a) {
            m8380k("ImageRequest.Builder", "Did you forget to call ImageRequest.Builder.build()?");
            throw new KotlinNothingValueException();
        }
        if (objM9575d instanceof ImageBitmap) {
            m8381l("ImageBitmap", null, 2, null);
            throw new KotlinNothingValueException();
        }
        if (objM9575d instanceof ImageVector) {
            m8381l("ImageVector", null, 2, null);
            throw new KotlinNothingValueException();
        }
        if (objM9575d instanceof Painter) {
            m8381l("Painter", null, 2, null);
            throw new KotlinNothingValueException();
        }
        AbstractC7366i.m8385a(c7872e);
    }
}
