package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p012ui.geometry.Offset;
import androidx.compose.p012ui.geometry.OffsetKt;
import androidx.compose.p012ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p012ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p012ui.platform.CompositionLocalsKt;
import androidx.compose.p012ui.unit.C3115Dp;
import androidx.compose.p012ui.unit.Density;
import androidx.compose.p012ui.unit.Velocity;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\rH\u0000\u001aA\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00140\r2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u0014H\u0001¢\u0006\u0002\u0010\u0019\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u001a"}, m13413d2 = {"BottomSheetAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "DragHandleVerticalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "sheetState", "Landroidx/compose/material3/SheetState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "onFling", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "velocity", "", "rememberSheetState", "skipPartiallyExpanded", "", "confirmValueChange", "Landroidx/compose/material3/SheetValue;", "initialValue", "skipHiddenState", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/material3/SheetValue;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "material3_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSheetDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/SheetDefaultsKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,436:1\n77#2:437\n1223#3,6:438\n148#4:444\n*S KotlinDebug\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/SheetDefaultsKt\n*L\n409#1:437\n421#1:438,6\n432#1:444\n*E\n"})
/* loaded from: classes2.dex */
public final class SheetDefaultsKt {
    private static final float DragHandleVerticalPadding = C3115Dp.m23994constructorimpl(22);
    private static final AnimationSpec<Float> BottomSheetAnimationSpec = AnimationSpecKt.tween$default(300, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(final SheetState sheetState, final Orientation orientation, final Function1<? super Float, Unit> function1) {
        return new NestedScrollConnection() { // from class: androidx.compose.material3.SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection.1
            @JvmName(name = "offsetToFloat")
            private final float offsetToFloat(long j9) {
                return orientation == Orientation.Horizontal ? Offset.m21168getXimpl(j9) : Offset.m21169getYimpl(j9);
            }

            private final long toOffset(float f10) {
                Orientation orientation2 = orientation;
                float f11 = orientation2 == Orientation.Horizontal ? f10 : 0.0f;
                if (orientation2 != Orientation.Vertical) {
                    f10 = 0.0f;
                }
                return OffsetKt.Offset(f11, f10);
            }

            @JvmName(name = "velocityToFloat")
            private final float velocityToFloat(long j9) {
                return orientation == Orientation.Horizontal ? Velocity.m24232getXimpl(j9) : Velocity.m24233getYimpl(j9);
            }

            @Override // androidx.compose.p012ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostFling-RZ2iAVY */
            public Object mo17885onPostFlingRZ2iAVY(long j9, long j10, Continuation<? super Velocity> continuation) {
                function1.invoke(Boxing.boxFloat(velocityToFloat(j10)));
                return Velocity.m24223boximpl(j10);
            }

            @Override // androidx.compose.p012ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostScroll-DzOQY0M */
            public long mo17886onPostScrollDzOQY0M(long consumed, long available, int source) {
                return NestedScrollSource.m22513equalsimpl0(source, NestedScrollSource.INSTANCE.m22525getUserInputWNlRxjI()) ? toOffset(sheetState.getAnchoredDraggableState$material3_release().dispatchRawDelta(offsetToFloat(available))) : Offset.INSTANCE.m21184getZeroF1C5BW0();
            }

            @Override // androidx.compose.p012ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPreFling-QWom1Mo */
            public Object mo18191onPreFlingQWom1Mo(long j9, Continuation<? super Velocity> continuation) {
                float fVelocityToFloat = velocityToFloat(j9);
                float fRequireOffset = sheetState.requireOffset();
                float fMinAnchor = sheetState.getAnchoredDraggableState$material3_release().getAnchors().minAnchor();
                if (fVelocityToFloat >= 0.0f || fRequireOffset <= fMinAnchor) {
                    j9 = Velocity.INSTANCE.m24243getZero9UxMQ8M();
                } else {
                    function1.invoke(Boxing.boxFloat(fVelocityToFloat));
                }
                return Velocity.m24223boximpl(j9);
            }

            @Override // androidx.compose.p012ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPreScroll-OzD1aCk */
            public long mo18192onPreScrollOzD1aCk(long available, int source) {
                float fOffsetToFloat = offsetToFloat(available);
                return (fOffsetToFloat >= 0.0f || !NestedScrollSource.m22513equalsimpl0(source, NestedScrollSource.INSTANCE.m22525getUserInputWNlRxjI())) ? Offset.INSTANCE.m21184getZeroF1C5BW0() : toOffset(sheetState.getAnchoredDraggableState$material3_release().dispatchRawDelta(fOffsetToFloat));
            }
        };
    }

    @Composable
    @ExperimentalMaterial3Api
    public static final SheetState rememberSheetState(boolean z9, Function1<? super SheetValue, Boolean> function1, SheetValue sheetValue, boolean z10, Composer composer, int i9, int i10) {
        final boolean z11 = (i10 & 1) != 0 ? false : z9;
        if ((i10 & 2) != 0) {
            function1 = new Function1<SheetValue, Boolean>() { // from class: androidx.compose.material3.SheetDefaultsKt.rememberSheetState.1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(SheetValue sheetValue2) {
                    return Boolean.TRUE;
                }
            };
        }
        final Function1<? super SheetValue, Boolean> function12 = function1;
        final SheetValue sheetValue2 = (i10 & 4) != 0 ? SheetValue.Hidden : sheetValue;
        final boolean z12 = (i10 & 8) != 0 ? false : z10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1032784200, i9, -1, "androidx.compose.material3.rememberSheetState (SheetDefaults.kt:407)");
        }
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object[] objArr = {Boolean.valueOf(z11), function12, Boolean.valueOf(z12)};
        Saver<SheetState, SheetValue> Saver = SheetState.INSTANCE.Saver(z11, function12, density, z12);
        boolean zChanged = ((((i9 & 14) ^ 6) > 4 && composer.changed(z11)) || (i9 & 6) == 4) | composer.changed(density) | ((((i9 & 896) ^ 384) > 256 && composer.changed(sheetValue2)) || (i9 & 384) == 256) | ((((i9 & 112) ^ 48) > 32 && composer.changed(function12)) || (i9 & 48) == 32) | ((((i9 & 7168) ^ 3072) > 2048 && composer.changed(z12)) || (i9 & 3072) == 2048);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Object obj = new Function0<SheetState>() { // from class: androidx.compose.material3.SheetDefaultsKt$rememberSheetState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final SheetState invoke() {
                    return new SheetState(z11, density, sheetValue2, function12, z12);
                }
            };
            composer.updateRememberedValue(obj);
            objRememberedValue = obj;
        }
        SheetState sheetState = (SheetState) RememberSaveableKt.m20966rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return sheetState;
    }
}
