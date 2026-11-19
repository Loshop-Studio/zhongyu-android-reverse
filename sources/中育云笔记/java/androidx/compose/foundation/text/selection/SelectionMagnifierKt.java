package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.InlineClassHelperKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.Lambda;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class SelectionMagnifierKt {
    private static final SpringSpec<Offset> MagnifierSpringSpec;
    private static final long OffsetDisplacementThreshold;
    private static final AnimationVector2D UnspecifiedAnimationVector2D = new AnimationVector2D(Float.NaN, Float.NaN);
    private static final TwoWayConverter<Offset, AnimationVector2D> UnspecifiedSafeOffsetVectorConverter = VectorConvertersKt.TwoWayConverter(new InterfaceC9540l() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m28231invokek4lQ0M(((Offset) obj).m30647unboximpl());
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final AnimationVector2D m28231invokek4lQ0M(long j10) {
            return (9223372034707292159L & j10) != InlineClassHelperKt.UnspecifiedPackedFloats ? new AnimationVector2D(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L))) : SelectionMagnifierKt.UnspecifiedAnimationVector2D;
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Offset.m30626boximpl(m28232invoketuRUvjQ((AnimationVector2D) obj));
        }

        /* renamed from: invoke-tuRUvjQ, reason: not valid java name */
        public final long m28232invoketuRUvjQ(AnimationVector2D animationVector2D) {
            float v12 = animationVector2D.getV1();
            float v22 = animationVector2D.getV2();
            return Offset.m30629constructorimpl((Float.floatToRawIntBits(v12) << 32) | (Float.floatToRawIntBits(v22) & 4294967295L));
        }
    });

    /* renamed from: androidx.compose.foundation.text.selection.SelectionMagnifierKt$animatedSelectionMagnifier$1 */
    public static final class C19781 extends Lambda implements InterfaceC9545q {
        final /* synthetic */ InterfaceC9529a $magnifierCenter;
        final /* synthetic */ InterfaceC9540l $platformMagnifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19781(InterfaceC9529a interfaceC9529a, InterfaceC9540l interfaceC9540l) {
            super(3);
            this.$magnifierCenter = interfaceC9529a;
            this.$platformMagnifier = interfaceC9540l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long invoke$lambda$0(State<Offset> state) {
            return state.getValue().m30647unboximpl();
        }

        @Override // p181hd.InterfaceC9545q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
        }

        @Composable
        public final Modifier invoke(Modifier modifier, Composer composer, int i10) {
            composer.startReplaceGroup(759876635);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(759876635, i10, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:64)");
            }
            final State stateRememberAnimatedMagnifierPosition = SelectionMagnifierKt.rememberAnimatedMagnifierPosition(this.$magnifierCenter, composer, 0);
            InterfaceC9540l interfaceC9540l = this.$platformMagnifier;
            boolean zChanged = composer.changed(stateRememberAnimatedMagnifierPosition);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new InterfaceC9529a() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$animatedSelectionMagnifier$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        return Offset.m30626boximpl(m28233invokeF1C5BW0());
                    }

                    /* renamed from: invoke-F1C5BW0, reason: not valid java name */
                    public final long m28233invokeF1C5BW0() {
                        return SelectionMagnifierKt.C19781.invoke$lambda$0(stateRememberAnimatedMagnifierPosition);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Modifier modifier2 = (Modifier) interfaceC9540l.invoke((InterfaceC9529a) objRememberedValue);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifier2;
        }
    }

    static {
        long jM30629constructorimpl = Offset.m30629constructorimpl((Float.floatToRawIntBits(0.01f) << 32) | (Float.floatToRawIntBits(0.01f) & 4294967295L));
        OffsetDisplacementThreshold = jM30629constructorimpl;
        MagnifierSpringSpec = new SpringSpec<>(0.0f, 0.0f, Offset.m30626boximpl(jM30629constructorimpl), 3, null);
    }

    public static final Modifier animatedSelectionMagnifier(Modifier modifier, InterfaceC9529a interfaceC9529a, InterfaceC9540l interfaceC9540l) {
        return ComposedModifierKt.composed$default(modifier, null, new C19781(interfaceC9529a, interfaceC9540l), 1, null);
    }

    public static final SpringSpec<Offset> getMagnifierSpringSpec() {
        return MagnifierSpringSpec;
    }

    public static final long getOffsetDisplacementThreshold() {
        return OffsetDisplacementThreshold;
    }

    public static final TwoWayConverter<Offset, AnimationVector2D> getUnspecifiedSafeOffsetVectorConverter() {
        return UnspecifiedSafeOffsetVectorConverter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final State<Offset> rememberAnimatedMagnifierPosition(InterfaceC9529a interfaceC9529a, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1589795249, i10, -1, "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:75)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(interfaceC9529a);
            composer.updateRememberedValue(objRememberedValue);
        }
        State state = (State) objRememberedValue;
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            Object animatable = new Animatable(Offset.m30626boximpl(rememberAnimatedMagnifierPosition$lambda$1(state)), UnspecifiedSafeOffsetVectorConverter, Offset.m30626boximpl(OffsetDisplacementThreshold), null, 8, null);
            composer.updateRememberedValue(animatable);
            objRememberedValue2 = animatable;
        }
        Animatable animatable2 = (Animatable) objRememberedValue2;
        C10786q c10786q = C10786q.f26013a;
        boolean zChangedInstance = composer.changedInstance(animatable2);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(state, animatable2, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        EffectsKt.LaunchedEffect(c10786q, (InterfaceC9544p) objRememberedValue3, composer, 6);
        State<Offset> stateAsState = animatable2.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long rememberAnimatedMagnifierPosition$lambda$1(State<Offset> state) {
        return state.getValue().m30647unboximpl();
    }
}
