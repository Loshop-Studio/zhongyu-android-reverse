package p101g7;

import android.os.SystemClock;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* renamed from: g7.i */
/* loaded from: classes4.dex */
public abstract class AbstractC7593i {
    /* renamed from: d */
    public static final Modifier m12477d(Modifier modifier, final boolean z9, final MutableInteractionSource interactionSource, final Indication indication, final Function0 onClick) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed$default(modifier, null, new Function3() { // from class: g7.g
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AbstractC7593i.m12482i(interactionSource, indication, z9, onClick, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }, 1, null);
    }

    /* renamed from: e */
    public static final Modifier m12478e(Modifier modifier, final boolean z9, final Function0 onClick) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed$default(modifier, null, new Function3() { // from class: g7.f
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AbstractC7593i.m12481h(z9, onClick, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }, 1, null);
    }

    /* renamed from: f */
    public static /* synthetic */ Modifier m12479f(Modifier modifier, boolean z9, MutableInteractionSource mutableInteractionSource, Indication indication, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = true;
        }
        return m12477d(modifier, z9, mutableInteractionSource, indication, function0);
    }

    /* renamed from: g */
    public static /* synthetic */ Modifier m12480g(Modifier modifier, boolean z9, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = true;
        }
        return m12478e(modifier, z9, function0);
    }

    /* renamed from: h */
    public static final Modifier m12481h(boolean z9, Function0 function0, Modifier composed, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceGroup(-970018562);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-970018562, i10, -1, "com.zykj.evaluation.utils.singleClick.<anonymous> (SingleClickUtil.kt:17)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
            composer.updateRememberedValue(objRememberedValue);
        }
        Modifier modifierM12477d = m12477d(companion, z9, (MutableInteractionSource) objRememberedValue, (Indication) composer.consume(IndicationKt.getLocalIndication()), function0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierM12477d;
    }

    /* renamed from: i */
    public static final Modifier m12482i(MutableInteractionSource mutableInteractionSource, Indication indication, boolean z9, final Function0 function0, Modifier composed, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceGroup(-1270807063);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1270807063, i10, -1, "com.zykj.evaluation.utils.singleClick.<anonymous> (SingleClickUtil.kt:32)");
        }
        final Ref.LongRef longRef = new Ref.LongRef();
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = 0L;
            composer.updateRememberedValue(objRememberedValue);
        }
        longRef.element = ((Number) objRememberedValue).longValue();
        Modifier modifierM17222clickableO2vRcR0$default = ClickableKt.m17222clickableO2vRcR0$default(Modifier.INSTANCE, mutableInteractionSource, indication, z9, null, null, new Function0() { // from class: g7.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC7593i.m12483j(longRef, function0);
            }
        }, 24, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierM17222clickableO2vRcR0$default;
    }

    /* renamed from: j */
    public static final Unit m12483j(Ref.LongRef longRef, Function0 function0) {
        if (SystemClock.uptimeMillis() - longRef.element > 1500) {
            longRef.element = SystemClock.uptimeMillis();
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
