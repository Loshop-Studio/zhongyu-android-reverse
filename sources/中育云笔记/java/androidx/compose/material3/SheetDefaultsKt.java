package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.OffsetKt;
import androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p014ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.Velocity;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p409xc.AbstractC11826a;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public final class SheetDefaultsKt {
    private static final float DragHandleVerticalPadding = C3186Dp.m33501constructorimpl(22);
    private static final AnimationSpec<Float> BottomSheetAnimationSpec = AnimationSpecKt.tween$default(300, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(final SheetState sheetState, final Orientation orientation, final InterfaceC9540l interfaceC9540l) {
        return new NestedScrollConnection() { // from class: androidx.compose.material3.SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection.1
            private final float offsetToFloat(long j10) {
                return orientation == Orientation.Horizontal ? Offset.m30637getXimpl(j10) : Offset.m30638getYimpl(j10);
            }

            private final long toOffset(float f10) {
                Orientation orientation2 = orientation;
                float f11 = orientation2 == Orientation.Horizontal ? f10 : 0.0f;
                if (orientation2 != Orientation.Vertical) {
                    f10 = 0.0f;
                }
                return OffsetKt.Offset(f11, f10);
            }

            private final float velocityToFloat(long j10) {
                return orientation == Orientation.Horizontal ? Velocity.m33739getXimpl(j10) : Velocity.m33740getYimpl(j10);
            }

            @Override // androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostFling-RZ2iAVY */
            public Object mo27229onPostFlingRZ2iAVY(long j10, long j11, InterfaceC11588c<? super Velocity> interfaceC11588c) {
                interfaceC9540l.invoke(AbstractC11826a.m26207b(velocityToFloat(j11)));
                return Velocity.m33730boximpl(j11);
            }

            @Override // androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostScroll-DzOQY0M */
            public long mo27230onPostScrollDzOQY0M(long j10, long j11, int i10) {
                return NestedScrollSource.m31984equalsimpl0(i10, NestedScrollSource.Companion.m31996getUserInputWNlRxjI()) ? toOffset(sheetState.getAnchoredDraggableState$material3_release().dispatchRawDelta(offsetToFloat(j11))) : Offset.Companion.m30653getZeroF1C5BW0();
            }

            @Override // androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPreFling-QWom1Mo */
            public Object mo27535onPreFlingQWom1Mo(long j10, InterfaceC11588c<? super Velocity> interfaceC11588c) {
                float fVelocityToFloat = velocityToFloat(j10);
                float fRequireOffset = sheetState.requireOffset();
                float fMinAnchor = sheetState.getAnchoredDraggableState$material3_release().getAnchors().minAnchor();
                if (fVelocityToFloat >= 0.0f || fRequireOffset <= fMinAnchor) {
                    j10 = Velocity.Companion.m33750getZero9UxMQ8M();
                } else {
                    interfaceC9540l.invoke(AbstractC11826a.m26207b(fVelocityToFloat));
                }
                return Velocity.m33730boximpl(j10);
            }

            @Override // androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPreScroll-OzD1aCk */
            public long mo27536onPreScrollOzD1aCk(long j10, int i10) {
                float fOffsetToFloat = offsetToFloat(j10);
                return (fOffsetToFloat >= 0.0f || !NestedScrollSource.m31984equalsimpl0(i10, NestedScrollSource.Companion.m31996getUserInputWNlRxjI())) ? Offset.Companion.m30653getZeroF1C5BW0() : toOffset(sheetState.getAnchoredDraggableState$material3_release().dispatchRawDelta(fOffsetToFloat));
            }
        };
    }

    @Composable
    @ExperimentalMaterial3Api
    public static final SheetState rememberSheetState(boolean z10, InterfaceC9540l interfaceC9540l, SheetValue sheetValue, boolean z11, Composer composer, int i10, int i11) {
        final boolean z12 = (i11 & 1) != 0 ? false : z10;
        if ((i11 & 2) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.material3.SheetDefaultsKt.rememberSheetState.1
                @Override // p181hd.InterfaceC9540l
                public final Boolean invoke(SheetValue sheetValue2) {
                    return Boolean.TRUE;
                }
            };
        }
        final InterfaceC9540l interfaceC9540l2 = interfaceC9540l;
        final SheetValue sheetValue2 = (i11 & 4) != 0 ? SheetValue.Hidden : sheetValue;
        final boolean z13 = (i11 & 8) != 0 ? false : z11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1032784200, i10, -1, "androidx.compose.material3.rememberSheetState (SheetDefaults.kt:407)");
        }
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object[] objArr = {Boolean.valueOf(z12), interfaceC9540l2, Boolean.valueOf(z13)};
        Saver<SheetState, SheetValue> Saver = SheetState.Companion.Saver(z12, interfaceC9540l2, density, z13);
        boolean zChanged = ((((i10 & 14) ^ 6) > 4 && composer.changed(z12)) || (i10 & 6) == 4) | composer.changed(density) | ((((i10 & 896) ^ 384) > 256 && composer.changed(sheetValue2)) || (i10 & 384) == 256) | ((((i10 & 112) ^ 48) > 32 && composer.changed(interfaceC9540l2)) || (i10 & 48) == 32) | ((((i10 & 7168) ^ 3072) > 2048 && composer.changed(z13)) || (i10 & 3072) == 2048);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            Object obj = new InterfaceC9529a() { // from class: androidx.compose.material3.SheetDefaultsKt$rememberSheetState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final SheetState invoke() {
                    return new SheetState(z12, density, sheetValue2, interfaceC9540l2, z13);
                }
            };
            composer.updateRememberedValue(obj);
            objRememberedValue = obj;
        }
        SheetState sheetState = (SheetState) RememberSaveableKt.m30420rememberSaveable(objArr, (Saver) Saver, (String) null, (InterfaceC9529a) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return sheetState;
    }
}
