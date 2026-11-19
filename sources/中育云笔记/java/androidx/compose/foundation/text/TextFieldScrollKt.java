package androidx.compose.foundation.text;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.draw.ClipKt;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.platform.InspectableValueKt;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.p014ui.text.TextLayoutResult;
import androidx.compose.p014ui.text.input.TextFieldValue;
import androidx.compose.p014ui.text.input.TransformedText;
import androidx.compose.p014ui.text.input.VisualTransformation;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.NoWhenBranchMatchedException;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class TextFieldScrollKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Modifier defaultTextFieldScroll(Modifier modifier, TextFieldScrollerPosition textFieldScrollerPosition, TextFieldValue textFieldValue, VisualTransformation visualTransformation, InterfaceC9529a interfaceC9529a) {
        Modifier verticalScrollLayoutModifier;
        Orientation orientation = textFieldScrollerPosition.getOrientation();
        int iM27912getOffsetToFollow5zctL8 = textFieldScrollerPosition.m27912getOffsetToFollow5zctL8(textFieldValue.m33214getSelectiond9O1mEE());
        textFieldScrollerPosition.m27914setPreviousSelection5zctL8(textFieldValue.m33214getSelectiond9O1mEE());
        TransformedText transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation, textFieldValue.getAnnotatedString());
        int i10 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i10 == 1) {
            verticalScrollLayoutModifier = new VerticalScrollLayoutModifier(textFieldScrollerPosition, iM27912getOffsetToFollow5zctL8, transformedTextFilterWithValidation, interfaceC9529a);
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            verticalScrollLayoutModifier = new HorizontalScrollLayoutModifier(textFieldScrollerPosition, iM27912getOffsetToFollow5zctL8, transformedTextFilterWithValidation, interfaceC9529a);
        }
        return ClipKt.clipToBounds(modifier).then(verticalScrollLayoutModifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect getCursorRectInScroller(Density density, int i10, TransformedText transformedText, TextLayoutResult textLayoutResult, boolean z10, int i11) {
        Rect zero;
        if (textLayoutResult == null || (zero = textLayoutResult.getCursorRect(transformedText.getOffsetMapping().originalToTransformed(i10))) == null) {
            zero = Rect.Companion.getZero();
        }
        Rect rect = zero;
        int iMo27093roundToPx0680j_4 = density.mo27093roundToPx0680j_4(TextFieldCursor_androidKt.getDefaultCursorThickness());
        return Rect.copy$default(rect, z10 ? (i11 - rect.getLeft()) - iMo27093roundToPx0680j_4 : rect.getLeft(), 0.0f, z10 ? i11 - rect.getLeft() : iMo27093roundToPx0680j_4 + rect.getLeft(), 0.0f, 10, null);
    }

    public static final Modifier textFieldScrollable(Modifier modifier, final TextFieldScrollerPosition textFieldScrollerPosition, final MutableInteractionSource mutableInteractionSource, final boolean z10) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("textFieldScrollable");
                inspectorInfo.getProperties().set("scrollerPosition", textFieldScrollerPosition);
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z10));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC9545q() { // from class: androidx.compose.foundation.text.TextFieldScrollKt.textFieldScrollable.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i10) {
                composer.startReplaceGroup(805428266);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(805428266, i10, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:71)");
                }
                boolean z11 = textFieldScrollerPosition.getOrientation() == Orientation.Vertical || !(composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl);
                boolean zChanged = composer.changed(textFieldScrollerPosition);
                final TextFieldScrollerPosition textFieldScrollerPosition2 = textFieldScrollerPosition;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new InterfaceC9540l() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1
                        {
                            super(1);
                        }

                        @Override // p181hd.InterfaceC9540l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return invoke(((Number) obj).floatValue());
                        }

                        public final Float invoke(float f10) {
                            float offset = textFieldScrollerPosition2.getOffset() + f10;
                            if (offset > textFieldScrollerPosition2.getMaximum()) {
                                f10 = textFieldScrollerPosition2.getMaximum() - textFieldScrollerPosition2.getOffset();
                            } else if (offset < 0.0f) {
                                f10 = -textFieldScrollerPosition2.getOffset();
                            }
                            TextFieldScrollerPosition textFieldScrollerPosition3 = textFieldScrollerPosition2;
                            textFieldScrollerPosition3.setOffset(textFieldScrollerPosition3.getOffset() + f10);
                            return Float.valueOf(f10);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                final ScrollableState scrollableStateRememberScrollableState = ScrollableStateKt.rememberScrollableState((InterfaceC9540l) objRememberedValue, composer, 0);
                boolean zChanged2 = composer.changed(scrollableStateRememberScrollableState) | composer.changed(textFieldScrollerPosition);
                final TextFieldScrollerPosition textFieldScrollerPosition3 = textFieldScrollerPosition;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new ScrollableState(textFieldScrollerPosition3) { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1
                        private final State canScrollBackward$delegate;
                        private final State canScrollForward$delegate;

                        {
                            this.canScrollForward$delegate = SnapshotStateKt.derivedStateOf(new InterfaceC9529a() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollForward$2
                                {
                                    super(0);
                                }

                                @Override // p181hd.InterfaceC9529a
                                public final Boolean invoke() {
                                    return Boolean.valueOf(textFieldScrollerPosition3.getOffset() < textFieldScrollerPosition3.getMaximum());
                                }
                            });
                            this.canScrollBackward$delegate = SnapshotStateKt.derivedStateOf(new InterfaceC9529a() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollBackward$2
                                {
                                    super(0);
                                }

                                @Override // p181hd.InterfaceC9529a
                                public final Boolean invoke() {
                                    return Boolean.valueOf(textFieldScrollerPosition3.getOffset() > 0.0f);
                                }
                            });
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public float dispatchRawDelta(float f10) {
                            return this.$$delegate_0.dispatchRawDelta(f10);
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public boolean getCanScrollBackward() {
                            return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public boolean getCanScrollForward() {
                            return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public boolean getLastScrolledBackward() {
                            return this.$$delegate_0.getLastScrolledBackward();
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public boolean getLastScrolledForward() {
                            return this.$$delegate_0.getLastScrolledForward();
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public boolean isScrollInProgress() {
                            return this.$$delegate_0.isScrollInProgress();
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public Object scroll(MutatePriority mutatePriority, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                            return this.$$delegate_0.scroll(mutatePriority, interfaceC9544p, interfaceC11588c);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Modifier modifierScrollable$default = ScrollableKt.scrollable$default(Modifier.Companion, (C1752x4ee6fee2) objRememberedValue2, textFieldScrollerPosition.getOrientation(), z10 && textFieldScrollerPosition.getMaximum() != 0.0f, z11, null, mutableInteractionSource, 16, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierScrollable$default;
            }
        });
    }

    public static /* synthetic */ Modifier textFieldScrollable$default(Modifier modifier, TextFieldScrollerPosition textFieldScrollerPosition, MutableInteractionSource mutableInteractionSource, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            mutableInteractionSource = null;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return textFieldScrollable(modifier, textFieldScrollerPosition, mutableInteractionSource, z10);
    }
}
