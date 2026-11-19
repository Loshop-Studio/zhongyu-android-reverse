package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.OffsetKt;
import androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p013ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p013ui.platform.CompositionLocalsKt;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.Velocity;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import com.tencent.smtt.sdk.TbsListener;
import p179m7.InterfaceC9324c;
import p201o7.AbstractC9536a;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class SheetDefaultsKt {
    private static final float DragHandleVerticalPadding = C3156Dp.m26899constructorimpl(22);
    private static final AnimationSpec<Float> BottomSheetAnimationSpec = AnimationSpecKt.tween$default(300, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(final SheetState sheetState, final Orientation orientation, final InterfaceC10570l interfaceC10570l) {
        return new NestedScrollConnection() { // from class: androidx.compose.material3.SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection.1
            private final float offsetToFloat(long j10) {
                return orientation == Orientation.Horizontal ? Offset.m24035getXimpl(j10) : Offset.m24036getYimpl(j10);
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
                return orientation == Orientation.Horizontal ? Velocity.m27137getXimpl(j10) : Velocity.m27138getYimpl(j10);
            }

            @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostFling-RZ2iAVY */
            public Object mo20627onPostFlingRZ2iAVY(long j10, long j11, InterfaceC9324c<? super Velocity> interfaceC9324c) {
                interfaceC10570l.invoke(AbstractC9536a.m17797b(velocityToFloat(j11)));
                return Velocity.m27128boximpl(j11);
            }

            @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostScroll-DzOQY0M */
            public long mo20628onPostScrollDzOQY0M(long j10, long j11, int i10) {
                return NestedScrollSource.m25382equalsimpl0(i10, NestedScrollSource.Companion.m25394getUserInputWNlRxjI()) ? toOffset(sheetState.getAnchoredDraggableState$material3_release().dispatchRawDelta(offsetToFloat(j11))) : Offset.Companion.m24051getZeroF1C5BW0();
            }

            @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPreFling-QWom1Mo */
            public Object mo20933onPreFlingQWom1Mo(long j10, InterfaceC9324c<? super Velocity> interfaceC9324c) {
                float fVelocityToFloat = velocityToFloat(j10);
                float fRequireOffset = sheetState.requireOffset();
                float fMinAnchor = sheetState.getAnchoredDraggableState$material3_release().getAnchors().minAnchor();
                if (fVelocityToFloat >= 0.0f || fRequireOffset <= fMinAnchor) {
                    j10 = Velocity.Companion.m27148getZero9UxMQ8M();
                } else {
                    interfaceC10570l.invoke(AbstractC9536a.m17797b(fVelocityToFloat));
                }
                return Velocity.m27128boximpl(j10);
            }

            @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPreScroll-OzD1aCk */
            public long mo20934onPreScrollOzD1aCk(long j10, int i10) {
                float fOffsetToFloat = offsetToFloat(j10);
                return (fOffsetToFloat >= 0.0f || !NestedScrollSource.m25382equalsimpl0(i10, NestedScrollSource.Companion.m25394getUserInputWNlRxjI())) ? Offset.Companion.m24051getZeroF1C5BW0() : toOffset(sheetState.getAnchoredDraggableState$material3_release().dispatchRawDelta(fOffsetToFloat));
            }
        };
    }

    @Composable
    @ExperimentalMaterial3Api
    public static final SheetState rememberSheetState(boolean z10, InterfaceC10570l interfaceC10570l, SheetValue sheetValue, boolean z11, Composer composer, int i10, int i11) {
        final boolean z12 = (i11 & 1) != 0 ? false : z10;
        if ((i11 & 2) != 0) {
            interfaceC10570l = new InterfaceC10570l() { // from class: androidx.compose.material3.SheetDefaultsKt.rememberSheetState.1
                @Override // p300x7.InterfaceC10570l
                public final Boolean invoke(SheetValue sheetValue2) {
                    return Boolean.TRUE;
                }
            };
        }
        final InterfaceC10570l interfaceC10570l2 = interfaceC10570l;
        final SheetValue sheetValue2 = (i11 & 4) != 0 ? SheetValue.Hidden : sheetValue;
        final boolean z13 = (i11 & 8) != 0 ? false : z11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1032784200, i10, -1, "androidx.compose.material3.rememberSheetState (SheetDefaults.kt:407)");
        }
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object[] objArr = {Boolean.valueOf(z12), interfaceC10570l2, Boolean.valueOf(z13)};
        Saver<SheetState, SheetValue> Saver = SheetState.Companion.Saver(z12, interfaceC10570l2, density, z13);
        boolean zChanged = ((((i10 & 14) ^ 6) > 4 && composer.changed(z12)) || (i10 & 6) == 4) | composer.changed(density) | ((((i10 & 896) ^ 384) > 256 && composer.changed(sheetValue2)) || (i10 & 384) == 256) | ((((i10 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) ^ 48) > 32 && composer.changed(interfaceC10570l2)) || (i10 & 48) == 32) | ((((i10 & 7168) ^ 3072) > 2048 && composer.changed(z13)) || (i10 & 3072) == 2048);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            Object obj = new InterfaceC10559a() { // from class: androidx.compose.material3.SheetDefaultsKt$rememberSheetState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                public final SheetState invoke() {
                    return new SheetState(z12, density, sheetValue2, interfaceC10570l2, z13);
                }
            };
            composer.updateRememberedValue(obj);
            objRememberedValue = obj;
        }
        SheetState sheetState = (SheetState) RememberSaveableKt.m23818rememberSaveable(objArr, (Saver) Saver, (String) null, (InterfaceC10559a) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return sheetState;
    }
}
