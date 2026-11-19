package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p006ui.ComposedModifierKt;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.draw.ClipKt;
import androidx.compose.p006ui.geometry.Rect;
import androidx.compose.p006ui.platform.InspectableValueKt;
import androidx.compose.p006ui.platform.InspectorInfo;
import androidx.compose.p006ui.text.TextLayoutResult;
import androidx.compose.p006ui.text.input.TextFieldValue;
import androidx.compose.p006ui.text.input.TransformedText;
import androidx.compose.p006ui.text.input.VisualTransformation;
import androidx.compose.p006ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a6\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002\u001a4\u0010\f\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0000\u001a*\u0010\u0017\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\nH\u0000¨\u0006\u001b"}, m5175d2 = {"getCursorRectInScroller", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/Density;", "cursorOffset", "", "transformedText", "Landroidx/compose/ui/text/input/TransformedText;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "rtl", "", "textFieldWidth", "textFieldScroll", "Landroidx/compose/ui/Modifier;", "scrollerPosition", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "textLayoutResultProvider", "Lkotlin/Function0;", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "textFieldScrollable", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "enabled", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,369:1\n135#2:370\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt\n*L\n60#1:370\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldScrollKt {

    @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect getCursorRectInScroller(Density density, int i4, TransformedText transformedText, TextLayoutResult textLayoutResult, boolean z3, int i5) {
        Rect zero;
        if (textLayoutResult == null || (zero = textLayoutResult.getCursorRect(transformedText.getOffsetMapping().originalToTransformed(i4))) == null) {
            zero = Rect.INSTANCE.getZero();
        }
        Rect rect = zero;
        int iMo7200roundToPx0680j_4 = density.mo7200roundToPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness());
        return Rect.copy$default(rect, z3 ? (i5 - rect.getLeft()) - iMo7200roundToPx0680j_4 : rect.getLeft(), 0.0f, z3 ? i5 - rect.getLeft() : rect.getLeft() + iMo7200roundToPx0680j_4, 0.0f, 10, null);
    }

    public static final Modifier textFieldScroll(Modifier modifier, TextFieldScrollerPosition scrollerPosition, TextFieldValue textFieldValue, VisualTransformation visualTransformation, Function0<TextLayoutResultProxy> textLayoutResultProvider) {
        Modifier verticalScrollLayoutModifier;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(scrollerPosition, "scrollerPosition");
        Intrinsics.checkNotNullParameter(textFieldValue, "textFieldValue");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(textLayoutResultProvider, "textLayoutResultProvider");
        Orientation orientation = scrollerPosition.getOrientation();
        int iM7678getOffsetToFollow5zctL8 = scrollerPosition.m7678getOffsetToFollow5zctL8(textFieldValue.getSelection());
        scrollerPosition.m7680setPreviousSelection5zctL8(textFieldValue.getSelection());
        TransformedText transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation, textFieldValue.getText());
        int i4 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i4 == 1) {
            verticalScrollLayoutModifier = new VerticalScrollLayoutModifier(scrollerPosition, iM7678getOffsetToFollow5zctL8, transformedTextFilterWithValidation, textLayoutResultProvider);
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            verticalScrollLayoutModifier = new HorizontalScrollLayoutModifier(scrollerPosition, iM7678getOffsetToFollow5zctL8, transformedTextFilterWithValidation, textLayoutResultProvider);
        }
        return ClipKt.clipToBounds(modifier).then(verticalScrollLayoutModifier);
    }

    public static final Modifier textFieldScrollable(Modifier modifier, final TextFieldScrollerPosition scrollerPosition, final MutableInteractionSource mutableInteractionSource, final boolean z3) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(scrollerPosition, "scrollerPosition");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("textFieldScrollable");
                inspectorInfo.getProperties().set("scrollerPosition", scrollerPosition);
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z3));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt.textFieldScrollable.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            /* JADX WARN: Removed duplicated region for block: B:33:0x00ae  */
            @androidx.compose.runtime.Composable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final androidx.compose.p006ui.Modifier invoke(androidx.compose.p006ui.Modifier r13, androidx.compose.runtime.Composer r14, int r15) {
                /*
                    r12 = this;
                    java.lang.String r0 = "$this$composed"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
                    r13 = 805428266(0x3001dc2a, float:4.72428E-10)
                    r14.startReplaceableGroup(r13)
                    boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                    if (r0 == 0) goto L17
                    r0 = -1
                    java.lang.String r1 = "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:65)"
                    androidx.compose.runtime.ComposerKt.traceEventStart(r13, r15, r0, r1)
                L17:
                    androidx.compose.runtime.ProvidableCompositionLocal r13 = androidx.compose.p006ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
                    java.lang.Object r13 = r14.consume(r13)
                    androidx.compose.ui.unit.LayoutDirection r15 = androidx.compose.p006ui.unit.LayoutDirection.Rtl
                    r0 = 1
                    r1 = 0
                    if (r13 != r15) goto L27
                    r13 = r0
                    goto L28
                L27:
                    r13 = r1
                L28:
                    androidx.compose.foundation.text.TextFieldScrollerPosition r15 = r1
                    androidx.compose.foundation.gestures.Orientation r15 = r15.getOrientation()
                    androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.Vertical
                    if (r15 == r2) goto L37
                    if (r13 != 0) goto L35
                    goto L37
                L35:
                    r7 = r1
                    goto L38
                L37:
                    r7 = r0
                L38:
                    androidx.compose.foundation.text.TextFieldScrollerPosition r13 = r1
                    r15 = 1157296644(0x44faf204, float:2007.563)
                    r14.startReplaceableGroup(r15)
                    boolean r15 = r14.changed(r13)
                    java.lang.Object r2 = r14.rememberedValue()
                    if (r15 != 0) goto L52
                    androidx.compose.runtime.Composer$Companion r15 = androidx.compose.runtime.Composer.INSTANCE
                    java.lang.Object r15 = r15.getEmpty()
                    if (r2 != r15) goto L5a
                L52:
                    androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1 r2 = new androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1
                    r2.<init>()
                    r14.updateRememberedValue(r2)
                L5a:
                    r14.endReplaceableGroup()
                    kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
                    androidx.compose.foundation.gestures.ScrollableState r13 = androidx.compose.foundation.gestures.ScrollableStateKt.rememberScrollableState(r2, r14, r1)
                    androidx.compose.foundation.text.TextFieldScrollerPosition r15 = r1
                    r2 = 511388516(0x1e7b2b64, float:1.3296802E-20)
                    r14.startReplaceableGroup(r2)
                    boolean r2 = r14.changed(r13)
                    boolean r3 = r14.changed(r15)
                    r2 = r2 | r3
                    java.lang.Object r3 = r14.rememberedValue()
                    if (r2 != 0) goto L82
                    androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.INSTANCE
                    java.lang.Object r2 = r2.getEmpty()
                    if (r3 != r2) goto L8a
                L82:
                    androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1 r3 = new androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1
                    r3.<init>(r15)
                    r14.updateRememberedValue(r3)
                L8a:
                    r14.endReplaceableGroup()
                    r4 = r3
                    androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1 r4 = (androidx.compose.foundation.text.C0872x4ee6fee2) r4
                    androidx.compose.ui.Modifier$Companion r3 = androidx.compose.p006ui.Modifier.INSTANCE
                    androidx.compose.foundation.text.TextFieldScrollerPosition r13 = r1
                    androidx.compose.foundation.gestures.Orientation r5 = r13.getOrientation()
                    boolean r13 = r2
                    if (r13 == 0) goto Lae
                    androidx.compose.foundation.text.TextFieldScrollerPosition r13 = r1
                    float r13 = r13.getMaximum()
                    r15 = 0
                    int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                    if (r13 != 0) goto La9
                    r13 = r0
                    goto Laa
                La9:
                    r13 = r1
                Laa:
                    if (r13 != 0) goto Lae
                    r6 = r0
                    goto Laf
                Lae:
                    r6 = r1
                Laf:
                    r8 = 0
                    androidx.compose.foundation.interaction.MutableInteractionSource r9 = r3
                    r10 = 16
                    r11 = 0
                    androidx.compose.ui.Modifier r13 = androidx.compose.foundation.gestures.ScrollableKt.scrollable$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                    boolean r15 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                    if (r15 == 0) goto Lc2
                    androidx.compose.runtime.ComposerKt.traceEventEnd()
                Lc2:
                    r14.endReplaceableGroup()
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldScrollKt.C08712.invoke(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
            }
        });
    }

    public static /* synthetic */ Modifier textFieldScrollable$default(Modifier modifier, TextFieldScrollerPosition textFieldScrollerPosition, MutableInteractionSource mutableInteractionSource, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            mutableInteractionSource = null;
        }
        if ((i4 & 4) != 0) {
            z3 = true;
        }
        return textFieldScrollable(modifier, textFieldScrollerPosition, mutableInteractionSource, z3);
    }
}
