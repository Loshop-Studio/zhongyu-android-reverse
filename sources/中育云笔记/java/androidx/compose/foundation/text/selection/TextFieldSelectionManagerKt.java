package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p014ui.input.pointer.PointerInputScope;
import androidx.compose.p014ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.TextLayoutResult;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.style.ResolvedTextDirection;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.NoWhenBranchMatchedException;
import p181hd.InterfaceC9544p;
import p265nd.AbstractC10410o;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class TextFieldSelectionManagerKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TextFieldSelectionHandle(final boolean z10, final ResolvedTextDirection resolvedTextDirection, final TextFieldSelectionManager textFieldSelectionManager, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1344558920);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(resolvedTextDirection) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(textFieldSelectionManager) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 147) != 146, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1344558920, i11, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:1029)");
            }
            int i12 = i11 & 14;
            boolean zChanged = (i12 == 4) | composerStartRestartGroup.changed(textFieldSelectionManager);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = textFieldSelectionManager.handleDragObserver$foundation_release(z10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final TextDragObserver textDragObserver = (TextDragObserver) objRememberedValue;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(textFieldSelectionManager) | (i12 == 4);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new OffsetProvider() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$1$1
                    @Override // androidx.compose.foundation.text.selection.OffsetProvider
                    /* renamed from: provide-F1C5BW0 */
                    public final long mo27772provideF1C5BW0() {
                        return textFieldSelectionManager.m28290getHandlePositiontuRUvjQ$foundation_release(z10);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            OffsetProvider offsetProvider = (OffsetProvider) objRememberedValue2;
            boolean zM32965getReversedimpl = TextRange.m32965getReversedimpl(textFieldSelectionManager.getValue$foundation_release().m33214getSelectiond9O1mEE());
            float handleLineHeight$foundation_release = textFieldSelectionManager.getHandleLineHeight$foundation_release(z10);
            Modifier.Companion companion = Modifier.Companion;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(textDragObserver);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$2$1
                    @Override // androidx.compose.p014ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                        Object objDetectDownAndDragGesturesWithObserver = LongPressTextDragObserverKt.detectDownAndDragGesturesWithObserver(pointerInputScope, textDragObserver, interfaceC11588c);
                        return objDetectDownAndDragGesturesWithObserver == AbstractC11725a.m25952f() ? objDetectDownAndDragGesturesWithObserver : C10786q.f26013a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            AndroidSelectionHandles_androidKt.m28208SelectionHandlewLIcFTc(offsetProvider, z10, resolvedTextDirection, zM32965getReversedimpl, 0L, handleLineHeight$foundation_release, SuspendingPointerInputFilterKt.pointerInput(companion, textDragObserver, (PointerInputEventHandler) objRememberedValue3), composerStartRestartGroup, (i11 << 3) & 1008, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.TextFieldSelectionHandle.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i13) {
                    TextFieldSelectionManagerKt.TextFieldSelectionHandle(z10, resolvedTextDirection, textFieldSelectionManager, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c, reason: not valid java name */
    public static final long m28299calculateSelectionMagnifierCenterAndroidO0kMr_c(TextFieldSelectionManager textFieldSelectionManager, long j10) {
        int iM32966getStartimpl;
        TextLayoutResultProxy layoutResult;
        TextDelegate textDelegate;
        AnnotatedString text;
        Offset offsetM28288getCurrentDragPosition_m7T9E = textFieldSelectionManager.m28288getCurrentDragPosition_m7T9E();
        if (offsetM28288getCurrentDragPosition_m7T9E == null) {
            return Offset.Companion.m30652getUnspecifiedF1C5BW0();
        }
        long jM30647unboximpl = offsetM28288getCurrentDragPosition_m7T9E.m30647unboximpl();
        AnnotatedString transformedText$foundation_release = textFieldSelectionManager.getTransformedText$foundation_release();
        if (transformedText$foundation_release == null || transformedText$foundation_release.length() == 0) {
            return Offset.Companion.m30652getUnspecifiedF1C5BW0();
        }
        Handle draggingHandle = textFieldSelectionManager.getDraggingHandle();
        int i10 = draggingHandle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i10 == -1) {
            return Offset.Companion.m30652getUnspecifiedF1C5BW0();
        }
        if (i10 == 1 || i10 == 2) {
            iM32966getStartimpl = TextRange.m32966getStartimpl(textFieldSelectionManager.getValue$foundation_release().m33214getSelectiond9O1mEE());
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            iM32966getStartimpl = TextRange.m32961getEndimpl(textFieldSelectionManager.getValue$foundation_release().m33214getSelectiond9O1mEE());
        }
        LegacyTextFieldState state$foundation_release = textFieldSelectionManager.getState$foundation_release();
        if (state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
            return Offset.Companion.m30652getUnspecifiedF1C5BW0();
        }
        LegacyTextFieldState state$foundation_release2 = textFieldSelectionManager.getState$foundation_release();
        if (state$foundation_release2 == null || (textDelegate = state$foundation_release2.getTextDelegate()) == null || (text = textDelegate.getText()) == null) {
            return Offset.Companion.m30652getUnspecifiedF1C5BW0();
        }
        int iM21761n = AbstractC10410o.m21761n(textFieldSelectionManager.getOffsetMapping$foundation_release().originalToTransformed(iM32966getStartimpl), 0, text.length());
        float fIntBitsToFloat = Float.intBitsToFloat((int) (layoutResult.m27924translateDecorationToInnerCoordinatesMKHz9U$foundation_release(jM30647unboximpl) >> 32));
        TextLayoutResult value = layoutResult.getValue();
        int lineForOffset = value.getLineForOffset(iM21761n);
        float lineLeft = value.getLineLeft(lineForOffset);
        float lineRight = value.getLineRight(lineForOffset);
        float fM21760m = AbstractC10410o.m21760m(fIntBitsToFloat, Math.min(lineLeft, lineRight), Math.max(lineLeft, lineRight));
        if (!IntSize.m33670equalsimpl0(j10, IntSize.Companion.m33677getZeroYbymL2g()) && Math.abs(fIntBitsToFloat - fM21760m) > ((int) (j10 >> 32)) / 2) {
            return Offset.Companion.m30652getUnspecifiedF1C5BW0();
        }
        float lineTop = value.getLineTop(lineForOffset);
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(fM21760m) << 32) | (Float.floatToRawIntBits(((value.getLineBottom(lineForOffset) - lineTop) / 2) + lineTop) & 4294967295L));
    }

    public static final boolean isSelectionHandleInVisibleBound(TextFieldSelectionManager textFieldSelectionManager, boolean z10) {
        LayoutCoordinates layoutCoordinates;
        Rect rectVisibleBounds;
        LegacyTextFieldState state$foundation_release = textFieldSelectionManager.getState$foundation_release();
        if (state$foundation_release == null || (layoutCoordinates = state$foundation_release.getLayoutCoordinates()) == null || (rectVisibleBounds = SelectionManagerKt.visibleBounds(layoutCoordinates)) == null) {
            return false;
        }
        return SelectionManagerKt.m28267containsInclusiveUv8p0NA(rectVisibleBounds, textFieldSelectionManager.m28290getHandlePositiontuRUvjQ$foundation_release(z10));
    }
}
