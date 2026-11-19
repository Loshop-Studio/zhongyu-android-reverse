package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.OffsetKt;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.Velocity;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aB\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\u001aC\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m5110d2 = {"Landroidx/compose/material3/SheetState;", "sheetState", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "velocity", "Ld6/s;", "onFling", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "(Landroidx/compose/material3/SheetState;Landroidx/compose/foundation/gestures/Orientation;Lr6/c;)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "skipPartiallyExpanded", "Landroidx/compose/material3/SheetValue;", "confirmValueChange", "initialValue", "skipHiddenState", "rememberSheetState", "(ZLr6/c;Landroidx/compose/material3/SheetValue;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "Landroidx/compose/ui/unit/Dp;", "DragHandleVerticalPadding", "F", "Landroidx/compose/animation/core/AnimationSpec;", "BottomSheetAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSheetDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/SheetDefaultsKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,436:1\n77#2:437\n1223#3,6:438\n148#4:444\n*S KotlinDebug\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/SheetDefaultsKt\n*L\n409#1:437\n421#1:438,6\n432#1:444\n*E\n"})
/* loaded from: classes.dex */
public final class SheetDefaultsKt {
    private static final float DragHandleVerticalPadding = C2331Dp.m13305constructorimpl(22);

    @NotNull
    private static final AnimationSpec<Float> BottomSheetAnimationSpec = AnimationSpecKt.tween$default(300, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    @NotNull
    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(@NotNull final SheetState sheetState, @NotNull final Orientation orientation, @NotNull final InterfaceC6471c interfaceC6471c) {
        return new NestedScrollConnection() { // from class: androidx.compose.material3.SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection.1
            @JvmName(name = "offsetToFloat")
            private final float offsetToFloat(long j7) {
                return orientation == Orientation.Horizontal ? Offset.m10441getXimpl(j7) : Offset.m10442getYimpl(j7);
            }

            private final long toOffset(float f) {
                Orientation orientation2 = orientation;
                float f7 = orientation2 == Orientation.Horizontal ? f : 0.0f;
                if (orientation2 != Orientation.Vertical) {
                    f = 0.0f;
                }
                return OffsetKt.Offset(f7, f);
            }

            @JvmName(name = "velocityToFloat")
            private final float velocityToFloat(long j7) {
                return orientation == Orientation.Horizontal ? Velocity.m13543getXimpl(j7) : Velocity.m13544getYimpl(j7);
            }

            @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection
            @Nullable
            /* renamed from: onPostFling-RZ2iAVY */
            public Object mo7033onPostFlingRZ2iAVY(long j7, long j8, @NotNull InterfaceC5631c<? super Velocity> interfaceC5631c) {
                interfaceC6471c.invoke(new Float(velocityToFloat(j8)));
                return Velocity.m13534boximpl(j8);
            }

            @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostScroll-DzOQY0M */
            public long mo7034onPostScrollDzOQY0M(long consumed, long available, int source) {
                return NestedScrollSource.m11788equalsimpl0(source, NestedScrollSource.INSTANCE.m11800getUserInputWNlRxjI()) ? toOffset(sheetState.getAnchoredDraggableState$material3_release().dispatchRawDelta(offsetToFloat(available))) : Offset.INSTANCE.m10457getZeroF1C5BW0();
            }

            @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection
            @Nullable
            /* renamed from: onPreFling-QWom1Mo */
            public Object mo7339onPreFlingQWom1Mo(long j7, @NotNull InterfaceC5631c<? super Velocity> interfaceC5631c) {
                float fVelocityToFloat = velocityToFloat(j7);
                float fRequireOffset = sheetState.requireOffset();
                float fMinAnchor = sheetState.getAnchoredDraggableState$material3_release().getAnchors().minAnchor();
                if (fVelocityToFloat >= 0.0f || fRequireOffset <= fMinAnchor) {
                    j7 = Velocity.INSTANCE.m13554getZero9UxMQ8M();
                } else {
                    interfaceC6471c.invoke(new Float(fVelocityToFloat));
                }
                return Velocity.m13534boximpl(j7);
            }

            @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPreScroll-OzD1aCk */
            public long mo7340onPreScrollOzD1aCk(long available, int source) {
                float fOffsetToFloat = offsetToFloat(available);
                return (fOffsetToFloat >= 0.0f || !NestedScrollSource.m11788equalsimpl0(source, NestedScrollSource.INSTANCE.m11800getUserInputWNlRxjI())) ? Offset.INSTANCE.m10457getZeroF1C5BW0() : toOffset(sheetState.getAnchoredDraggableState$material3_release().dispatchRawDelta(fOffsetToFloat));
            }
        };
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    public static final SheetState rememberSheetState(boolean z8, @Nullable InterfaceC6471c interfaceC6471c, @Nullable SheetValue sheetValue, boolean z9, @Nullable Composer composer, int i, int i8) {
        final boolean z10 = (i8 & 1) != 0 ? false : z8;
        if ((i8 & 2) != 0) {
            interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.material3.SheetDefaultsKt.rememberSheetState.1
                @Override // p152r6.InterfaceC6471c
                @NotNull
                public final Boolean invoke(@NotNull SheetValue sheetValue2) {
                    return Boolean.TRUE;
                }
            };
        }
        final InterfaceC6471c interfaceC6471c2 = interfaceC6471c;
        final SheetValue sheetValue2 = (i8 & 4) != 0 ? SheetValue.Hidden : sheetValue;
        final boolean z11 = (i8 & 8) != 0 ? false : z9;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1032784200, i, -1, "androidx.compose.material3.rememberSheetState (SheetDefaults.kt:407)");
        }
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object[] objArr = {Boolean.valueOf(z10), interfaceC6471c2, Boolean.valueOf(z11)};
        Saver<SheetState, SheetValue> Saver = SheetState.INSTANCE.Saver(z10, interfaceC6471c2, density, z11);
        boolean zChanged = ((((i & 14) ^ 6) > 4 && composer.changed(z10)) || (i & 6) == 4) | composer.changed(density) | ((((i & 896) ^ 384) > 256 && composer.changed(sheetValue2)) || (i & 384) == 256) | ((((i & 112) ^ 48) > 32 && composer.changed(interfaceC6471c2)) || (i & 48) == 32) | ((((i & 7168) ^ 3072) > 2048 && composer.changed(z11)) || (i & 3072) == 2048);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Object obj = new InterfaceC6469a() { // from class: androidx.compose.material3.SheetDefaultsKt$rememberSheetState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                @NotNull
                public final SheetState invoke() {
                    return new SheetState(z10, density, sheetValue2, interfaceC6471c2, z11);
                }
            };
            composer.updateRememberedValue(obj);
            objRememberedValue = obj;
        }
        SheetState sheetState = (SheetState) RememberSaveableKt.m10224rememberSaveable(objArr, (Saver) Saver, (String) null, (InterfaceC6469a) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return sheetState;
    }
}
