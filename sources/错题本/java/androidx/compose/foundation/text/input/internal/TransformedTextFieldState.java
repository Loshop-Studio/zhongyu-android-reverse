package androidx.compose.foundation.text.input.internal;

import android.view.serialization.ClassDiscriminatorModeKt;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldBufferKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRangeKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Stable
@Metadata(m5109d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 n2\u00020\u0001:\u0002noB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0016J \u0010\u001f\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\f¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\f¢\u0006\u0004\b&\u0010%J4\u0010.\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\u0006\u0010'\u001a\u00020\u00132\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020*ø\u0001\u0000¢\u0006\u0004\b,\u0010-J3\u00100\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010/\u001a\u00020*2\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020*¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\f¢\u0006\u0004\b2\u0010%J\r\u00103\u001a\u00020\f¢\u0006\u0004\b3\u0010%J\r\u00104\u001a\u00020\f¢\u0006\u0004\b4\u0010%J\r\u00105\u001a\u00020\f¢\u0006\u0004\b5\u0010%J3\u0010:\u001a\u00020\f2\b\b\u0002\u0010+\u001a\u00020*2\u0017\u00109\u001a\u0013\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\f06¢\u0006\u0002\b8H\u0086\b¢\u0006\u0004\b:\u0010;J\u001b\u0010?\u001a\u00020\u00132\u0006\u0010<\u001a\u00020\u000fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u0018\u0010?\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u001b\u0010C\u001a\u00020\u00132\u0006\u0010<\u001a\u00020\u000fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bB\u0010>J\u0018\u0010C\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\bD\u0010AJ\u0018\u0010H\u001a\u00020G2\u0006\u0010F\u001a\u00020EH\u0086@¢\u0006\u0004\bH\u0010IJ\u001a\u0010K\u001a\u00020*2\b\u0010J\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u000fH\u0016¢\u0006\u0004\bM\u0010NJ\u000f\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bP\u0010QJ\u0013\u0010R\u001a\u00020\f*\u000207H\u0002¢\u0006\u0004\bR\u0010SR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010TR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010UR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010VR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010WR\u001e\u0010Z\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010Y\u0018\u00010X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u001e\u0010\\\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010Y\u0018\u00010X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010[R+\u0010e\u001a\u00020]2\u0006\u0010^\u001a\u00020]8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u0011\u0010i\u001a\u00020f8F¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0011\u0010k\u001a\u00020f8F¢\u0006\u0006\u001a\u0004\bj\u0010hR\u0011\u0010m\u001a\u00020f8F¢\u0006\u0006\u001a\u0004\bl\u0010h\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006p"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "", "Landroidx/compose/foundation/text/input/TextFieldState;", "textFieldState", "Landroidx/compose/foundation/text/input/InputTransformation;", "inputTransformation", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "codepointTransformation", "Landroidx/compose/foundation/text/input/OutputTransformation;", "outputTransformation", "<init>", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/foundation/text/input/internal/CodepointTransformation;Landroidx/compose/foundation/text/input/OutputTransformation;)V", "Ld6/s;", "update", "(Landroidx/compose/foundation/text/input/InputTransformation;)V", "", "transformedOffset", "placeCursorBeforeCharAt", "(I)V", "Landroidx/compose/ui/text/TextRange;", "transformedRange", "selectCharsIn-5zc-tL8", "(J)V", "selectCharsIn", "untransformedRange", "selectUntransformedCharsIn-5zc-tL8", "selectUntransformedCharsIn", "Landroidx/compose/foundation/text/input/TextHighlightType;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "highlightCharsIn-7RAjNK8", "(IJ)V", "highlightCharsIn", "", "newText", "replaceAll", "(Ljava/lang/CharSequence;)V", "selectAll", "()V", "deleteSelectedText", "range", "Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;", "undoBehavior", "", "restartImeIfContentChanges", "replaceText-M8tDOmk", "(Ljava/lang/CharSequence;JLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;Z)V", "replaceText", "clearComposition", "replaceSelectedText", "(Ljava/lang/CharSequence;ZLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;Z)V", "collapseSelectionToMax", "collapseSelectionToEnd", "undo", "redo", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "Lkotlin/ExtensionFunctionType;", "block", "editUntransformedTextAsUser", "(ZLr6/c;)V", TypedValues.CycleType.S_WAVE_OFFSET, "mapToTransformed--jx7JFs", "(I)J", "mapToTransformed", "mapToTransformed-GEjPoXI", "(J)J", "mapFromTransformed--jx7JFs", "mapFromTransformed", "mapFromTransformed-GEjPoXI", "Landroidx/compose/foundation/text/input/TextFieldState$NotifyImeListener;", "notifyImeListener", "", "collectImeNotifications", "(Landroidx/compose/foundation/text/input/TextFieldState$NotifyImeListener;Lh6/c;)Ljava/lang/Object;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "updateWedgeAffinity", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V", "Landroidx/compose/foundation/text/input/TextFieldState;", "Landroidx/compose/foundation/text/input/InputTransformation;", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "Landroidx/compose/foundation/text/input/OutputTransformation;", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState$TransformedText;", "outputTransformedText", "Landroidx/compose/runtime/State;", "codepointTransformedText", "Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "<set-?>", "selectionWedgeAffinity$delegate", "Landroidx/compose/runtime/MutableState;", "getSelectionWedgeAffinity", "()Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "setSelectionWedgeAffinity", "(Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;)V", "selectionWedgeAffinity", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "getUntransformedText", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "untransformedText", "getOutputText", "outputText", "getVisualText", "visualText", "Companion", "TransformedText", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTransformedTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,746:1\n85#2:747\n113#2,2:748\n254#3,15:750\n254#3,15:765\n254#3,15:780\n254#3,15:795\n254#3,15:810\n260#3,9:825\n260#3,9:834\n254#3,15:843\n254#3,15:858\n254#3,15:873\n1#4:888\n314#5,11:889\n*S KotlinDebug\n*F\n+ 1 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n*L\n175#1:747\n175#1:748,2\n199#1:750,15\n206#1:765,15\n213#1:780,15\n221#1:795,15\n225#1:810,15\n246#1:825,9\n265#1:834,9\n284#1:843,15\n291#1:858,15\n320#1:873,15\n457#1:889,11\n*E\n"})
/* loaded from: classes.dex */
public final class TransformedTextFieldState {
    public static final int $stable = 0;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Nullable
    private final CodepointTransformation codepointTransformation;

    @Nullable
    private final State<TransformedText> codepointTransformedText;

    @Nullable
    private InputTransformation inputTransformation;

    @Nullable
    private final OutputTransformation outputTransformation;

    @Nullable
    private final State<TransformedText> outputTransformedText;

    /* renamed from: selectionWedgeAffinity$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState selectionWedgeAffinity;

    @NotNull
    private final TextFieldState textFieldState;

    @Metadata(m5109d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0003J\"\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0003J\"\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\nH\u0003ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState$Companion;", "", "()V", "calculateTransformedText", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState$TransformedText;", "untransformedValue", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "outputTransformation", "Landroidx/compose/foundation/text/input/OutputTransformation;", "wedgeAffinity", "Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "codepointTransformation", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "mapFromTransformed", "Landroidx/compose/ui/text/TextRange;", "range", "mapping", "Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "mapFromTransformed-xdX6-G0", "(JLandroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;)J", "mapToTransformed", "selectionWedgeAffinity", "mapToTransformed-XGyztTk", "(JLandroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;)J", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nTransformedTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,746:1\n1#2:747\n*E\n"})
    public static final class Companion {

        @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[WedgeAffinity.values().length];
                try {
                    iArr[WedgeAffinity.Start.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[WedgeAffinity.End.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final TransformedText calculateTransformedText(TextFieldCharSequence untransformedValue, OutputTransformation outputTransformation, SelectionWedgeAffinity wedgeAffinity) {
            OffsetMappingCalculator offsetMappingCalculator = new OffsetMappingCalculator();
            TextFieldBuffer textFieldBuffer = new TextFieldBuffer(untransformedValue, null, null, offsetMappingCalculator, 6, null);
            outputTransformation.transformOutput(textFieldBuffer);
            TextRange textRangeM12758boximpl = null;
            if (textFieldBuffer.getChanges().getChangeCount() == 0) {
                return null;
            }
            long jM7894mapToTransformedXGyztTk = m7894mapToTransformedXGyztTk(untransformedValue.getSelection(), offsetMappingCalculator, wedgeAffinity);
            TextRange composition = untransformedValue.getComposition();
            if (composition != null) {
                textRangeM12758boximpl = TextRange.m12758boximpl(TransformedTextFieldState.Companion.m7894mapToTransformedXGyztTk(composition.getPackedValue(), offsetMappingCalculator, wedgeAffinity));
            }
            return new TransformedText(TextFieldBuffer.m7740toTextFieldCharSequenceI88jaVs$foundation_release$default(textFieldBuffer, jM7894mapToTransformedXGyztTk, textRangeM12758boximpl, null, 4, null), offsetMappingCalculator);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        /* renamed from: mapFromTransformed-xdX6-G0, reason: not valid java name */
        public final long m7893mapFromTransformedxdX6G0(long range, OffsetMappingCalculator mapping) {
            long jM7826mapFromDestjx7JFs = mapping.m7826mapFromDestjx7JFs(TextRange.m12770getStartimpl(range));
            long jM7826mapFromDestjx7JFs2 = TextRange.m12764getCollapsedimpl(range) ? jM7826mapFromDestjx7JFs : mapping.m7826mapFromDestjx7JFs(TextRange.m12765getEndimpl(range));
            int iMin = Math.min(TextRange.m12768getMinimpl(jM7826mapFromDestjx7JFs), TextRange.m12768getMinimpl(jM7826mapFromDestjx7JFs2));
            int iMax = Math.max(TextRange.m12767getMaximpl(jM7826mapFromDestjx7JFs), TextRange.m12767getMaximpl(jM7826mapFromDestjx7JFs2));
            return TextRange.m12769getReversedimpl(range) ? TextRangeKt.TextRange(iMax, iMin) : TextRangeKt.TextRange(iMin, iMax);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        /* renamed from: mapToTransformed-XGyztTk, reason: not valid java name */
        public final long m7894mapToTransformedXGyztTk(long range, OffsetMappingCalculator mapping, SelectionWedgeAffinity selectionWedgeAffinity) {
            long jTextRange;
            long jM7827mapFromSourcejx7JFs = mapping.m7827mapFromSourcejx7JFs(TextRange.m12770getStartimpl(range));
            long jM7827mapFromSourcejx7JFs2 = TextRange.m12764getCollapsedimpl(range) ? jM7827mapFromSourcejx7JFs : mapping.m7827mapFromSourcejx7JFs(TextRange.m12765getEndimpl(range));
            WedgeAffinity endAffinity = null;
            WedgeAffinity startAffinity = selectionWedgeAffinity != null ? selectionWedgeAffinity.getStartAffinity() : null;
            if (TextRange.m12764getCollapsedimpl(range)) {
                endAffinity = startAffinity;
            } else if (selectionWedgeAffinity != null) {
                endAffinity = selectionWedgeAffinity.getEndAffinity();
            }
            if (startAffinity != null && !TextRange.m12764getCollapsedimpl(jM7827mapFromSourcejx7JFs)) {
                int i = WhenMappings.$EnumSwitchMapping$0[startAffinity.ordinal()];
                if (i == 1) {
                    jM7827mapFromSourcejx7JFs = TextRangeKt.TextRange(TextRange.m12770getStartimpl(jM7827mapFromSourcejx7JFs));
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jM7827mapFromSourcejx7JFs = TextRangeKt.TextRange(TextRange.m12765getEndimpl(jM7827mapFromSourcejx7JFs));
                }
            }
            if (endAffinity != null && !TextRange.m12764getCollapsedimpl(jM7827mapFromSourcejx7JFs2)) {
                int i8 = WhenMappings.$EnumSwitchMapping$0[endAffinity.ordinal()];
                if (i8 == 1) {
                    jTextRange = TextRangeKt.TextRange(TextRange.m12770getStartimpl(jM7827mapFromSourcejx7JFs2));
                } else {
                    if (i8 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jTextRange = TextRangeKt.TextRange(TextRange.m12765getEndimpl(jM7827mapFromSourcejx7JFs2));
                }
                jM7827mapFromSourcejx7JFs2 = jTextRange;
            }
            int iMin = Math.min(TextRange.m12768getMinimpl(jM7827mapFromSourcejx7JFs), TextRange.m12768getMinimpl(jM7827mapFromSourcejx7JFs2));
            int iMax = Math.max(TextRange.m12767getMaximpl(jM7827mapFromSourcejx7JFs), TextRange.m12767getMaximpl(jM7827mapFromSourcejx7JFs2));
            return TextRange.m12769getReversedimpl(range) ? TextRangeKt.TextRange(iMax, iMin) : TextRangeKt.TextRange(iMin, iMax);
        }

        /* renamed from: mapToTransformed-XGyztTk$default, reason: not valid java name */
        public static /* synthetic */ long m7895mapToTransformedXGyztTk$default(Companion companion, long j7, OffsetMappingCalculator offsetMappingCalculator, SelectionWedgeAffinity selectionWedgeAffinity, int i, Object obj) {
            if ((i & 4) != 0) {
                selectionWedgeAffinity = null;
            }
            return companion.m7894mapToTransformedXGyztTk(j7, offsetMappingCalculator, selectionWedgeAffinity);
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final TransformedText calculateTransformedText(TextFieldCharSequence untransformedValue, CodepointTransformation codepointTransformation, SelectionWedgeAffinity wedgeAffinity) {
            OffsetMappingCalculator offsetMappingCalculator = new OffsetMappingCalculator();
            CharSequence visualText = CodepointTransformationKt.toVisualText(untransformedValue, codepointTransformation, offsetMappingCalculator);
            TextRange textRangeM12758boximpl = null;
            if (visualText == untransformedValue) {
                return null;
            }
            long jM7894mapToTransformedXGyztTk = m7894mapToTransformedXGyztTk(untransformedValue.getSelection(), offsetMappingCalculator, wedgeAffinity);
            TextRange composition = untransformedValue.getComposition();
            if (composition != null) {
                textRangeM12758boximpl = TextRange.m12758boximpl(TransformedTextFieldState.Companion.m7894mapToTransformedXGyztTk(composition.getPackedValue(), offsetMappingCalculator, wedgeAffinity));
            }
            return new TransformedText(new TextFieldCharSequence(visualText, jM7894mapToTransformedXGyztTk, textRangeM12758boximpl, null, null, 24, null), offsetMappingCalculator);
        }
    }

    @Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState$TransformedText;", "", "text", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "offsetMapping", "Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;)V", "getOffsetMapping", "()Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "getText", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class TransformedText {

        @NotNull
        private final OffsetMappingCalculator offsetMapping;

        @NotNull
        private final TextFieldCharSequence text;

        public TransformedText(@NotNull TextFieldCharSequence textFieldCharSequence, @NotNull OffsetMappingCalculator offsetMappingCalculator) {
            this.text = textFieldCharSequence;
            this.offsetMapping = offsetMappingCalculator;
        }

        public static /* synthetic */ TransformedText copy$default(TransformedText transformedText, TextFieldCharSequence textFieldCharSequence, OffsetMappingCalculator offsetMappingCalculator, int i, Object obj) {
            if ((i & 1) != 0) {
                textFieldCharSequence = transformedText.text;
            }
            if ((i & 2) != 0) {
                offsetMappingCalculator = transformedText.offsetMapping;
            }
            return transformedText.copy(textFieldCharSequence, offsetMappingCalculator);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextFieldCharSequence getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final OffsetMappingCalculator getOffsetMapping() {
            return this.offsetMapping;
        }

        @NotNull
        public final TransformedText copy(@NotNull TextFieldCharSequence text, @NotNull OffsetMappingCalculator offsetMapping) {
            return new TransformedText(text, offsetMapping);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransformedText)) {
                return false;
            }
            TransformedText transformedText = (TransformedText) other;
            return AbstractC5830k.m5325b(this.text, transformedText.text) && AbstractC5830k.m5325b(this.offsetMapping, transformedText.offsetMapping);
        }

        @NotNull
        public final OffsetMappingCalculator getOffsetMapping() {
            return this.offsetMapping;
        }

        @NotNull
        public final TextFieldCharSequence getText() {
            return this.text;
        }

        public int hashCode() {
            return this.offsetMapping.hashCode() + (this.text.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "TransformedText(text=" + ((Object) this.text) + ", offsetMapping=" + this.offsetMapping + ')';
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.TransformedTextFieldState", m5303f = "TransformedTextFieldState.kt", m5304i = {0, 0}, m5305l = {747}, m5306m = "collectImeNotifications", m5307n = {"this", "transformedNotifyImeListener"}, m5308s = {"L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1 */
    public static final class C13711 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C13711(InterfaceC5631c<? super C13711> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransformedTextFieldState.this.collectImeNotifications(null, this);
        }
    }

    public TransformedTextFieldState(@NotNull TextFieldState textFieldState, @Nullable InputTransformation inputTransformation, @Nullable final CodepointTransformation codepointTransformation, @Nullable final OutputTransformation outputTransformation) {
        this.textFieldState = textFieldState;
        this.inputTransformation = inputTransformation;
        this.codepointTransformation = codepointTransformation;
        this.outputTransformation = outputTransformation;
        this.outputTransformedText = outputTransformation != null ? SnapshotStateKt.derivedStateOf(new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.TransformedTextFieldState$outputTransformedText$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public final TransformedTextFieldState.TransformedText invoke() {
                return TransformedTextFieldState.Companion.calculateTransformedText(this.this$0.textFieldState.getValue$foundation_release(), outputTransformation, this.this$0.getSelectionWedgeAffinity());
            }
        }) : null;
        this.codepointTransformedText = codepointTransformation != null ? SnapshotStateKt.derivedStateOf(new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.TransformedTextFieldState$codepointTransformedText$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public final TransformedTextFieldState.TransformedText invoke() {
                TextFieldCharSequence value$foundation_release;
                TransformedTextFieldState.TransformedText transformedText;
                TransformedTextFieldState.Companion companion = TransformedTextFieldState.Companion;
                State state = this.this$0.outputTransformedText;
                if (state == null || (transformedText = (TransformedTextFieldState.TransformedText) state.getValue()) == null || (value$foundation_release = transformedText.getText()) == null) {
                    value$foundation_release = this.this$0.textFieldState.getValue$foundation_release();
                }
                return companion.calculateTransformedText(value$foundation_release, codepointTransformation, this.this$0.getSelectionWedgeAffinity());
            }
        }) : null;
        this.selectionWedgeAffinity = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new SelectionWedgeAffinity(WedgeAffinity.Start), null, 2, null);
    }

    @JvmStatic
    private static final TransformedText calculateTransformedText(TextFieldCharSequence textFieldCharSequence, OutputTransformation outputTransformation, SelectionWedgeAffinity selectionWedgeAffinity) {
        return Companion.calculateTransformedText(textFieldCharSequence, outputTransformation, selectionWedgeAffinity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void collectImeNotifications$lambda$18(TextFieldState.NotifyImeListener notifyImeListener, TransformedTextFieldState transformedTextFieldState, TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z8) {
        TextFieldCharSequence text;
        TransformedText transformedTextCalculateTransformedText = Companion.calculateTransformedText(textFieldCharSequence, transformedTextFieldState.outputTransformation, transformedTextFieldState.getSelectionWedgeAffinity());
        if (transformedTextCalculateTransformedText != null && (text = transformedTextCalculateTransformedText.getText()) != null) {
            textFieldCharSequence = text;
        }
        notifyImeListener.onChange(textFieldCharSequence, transformedTextFieldState.getVisualText(), z8);
    }

    public static /* synthetic */ void editUntransformedTextAsUser$default(TransformedTextFieldState transformedTextFieldState, boolean z8, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = true;
        }
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        interfaceC6471c.invoke(mainBuffer);
        transformedTextFieldState.updateWedgeAffinity(mainBuffer);
        textFieldState.commitEditAsUser(inputTransformation, z8, textFieldEditUndoBehavior);
    }

    @JvmStatic
    /* renamed from: mapFromTransformed-xdX6-G0, reason: not valid java name */
    private static final long m7880mapFromTransformedxdX6G0(long j7, OffsetMappingCalculator offsetMappingCalculator) {
        return Companion.m7893mapFromTransformedxdX6G0(j7, offsetMappingCalculator);
    }

    @JvmStatic
    /* renamed from: mapToTransformed-XGyztTk, reason: not valid java name */
    private static final long m7881mapToTransformedXGyztTk(long j7, OffsetMappingCalculator offsetMappingCalculator, SelectionWedgeAffinity selectionWedgeAffinity) {
        return Companion.m7894mapToTransformedXGyztTk(j7, offsetMappingCalculator, selectionWedgeAffinity);
    }

    public static /* synthetic */ void replaceSelectedText$default(TransformedTextFieldState transformedTextFieldState, CharSequence charSequence, boolean z8, TextFieldEditUndoBehavior textFieldEditUndoBehavior, boolean z9, int i, Object obj) {
        if ((i & 2) != 0) {
            z8 = false;
        }
        if ((i & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        if ((i & 8) != 0) {
            z9 = true;
        }
        transformedTextFieldState.replaceSelectedText(charSequence, z8, textFieldEditUndoBehavior, z9);
    }

    /* renamed from: replaceText-M8tDOmk$default, reason: not valid java name */
    public static /* synthetic */ void m7882replaceTextM8tDOmk$default(TransformedTextFieldState transformedTextFieldState, CharSequence charSequence, long j7, TextFieldEditUndoBehavior textFieldEditUndoBehavior, boolean z8, int i, Object obj) {
        if ((i & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        TextFieldEditUndoBehavior textFieldEditUndoBehavior2 = textFieldEditUndoBehavior;
        if ((i & 8) != 0) {
            z8 = true;
        }
        transformedTextFieldState.m7888replaceTextM8tDOmk(charSequence, j7, textFieldEditUndoBehavior2, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateWedgeAffinity(TextFieldBuffer textFieldBuffer) {
        if (textFieldBuffer.getChangeTracker$foundation_release().getChangeCount() <= 0 || !TextRange.m12764getCollapsedimpl(textFieldBuffer.getSelectionInChars())) {
            return;
        }
        setSelectionWedgeAffinity(new SelectionWedgeAffinity(WedgeAffinity.Start));
    }

    public final void collapseSelectionToEnd() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        TextFieldBufferKt.setSelectionCoerced$default(mainBuffer, TextRange.m12765getEndimpl(mainBuffer.getSelectionInChars()), 0, 2, null);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void collapseSelectionToMax() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        TextFieldBufferKt.setSelectionCoerced$default(mainBuffer, TextRange.m12767getMaximpl(mainBuffer.getSelectionInChars()), 0, 2, null);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collectImeNotifications(@org.jetbrains.annotations.NotNull final androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener r5, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<?> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.text.input.internal.TransformedTextFieldState.C13711
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1 r0 = (androidx.compose.foundation.text.input.internal.TransformedTextFieldState.C13711) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1 r0 = new androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            java.lang.Object r5 = r0.L$1
            androidx.compose.foundation.text.input.TextFieldState$NotifyImeListener r5 = (androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener) r5
            java.lang.Object r5 = r0.L$0
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r5 = (androidx.compose.foundation.text.input.internal.TransformedTextFieldState) r5
            kotlin.AbstractC5774b.m5119b(r6)
            goto L6c
        L37:
            kotlin.AbstractC5774b.m5119b(r6)
            androidx.compose.foundation.text.input.OutputTransformation r6 = r4.outputTransformation
            if (r6 == 0) goto L44
            androidx.compose.foundation.text.input.internal.g r6 = new androidx.compose.foundation.text.input.internal.g
            r6.<init>(r4)
            r5 = r6
        L44:
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            kotlinx.coroutines.g r6 = new kotlinx.coroutines.g
            h6.c r0 = p185v7.AbstractC6683l.m6374n(r0)
            r6.<init>(r3, r0)
            r6.m5584u()
            androidx.compose.foundation.text.input.TextFieldState r0 = access$getTextFieldState$p(r4)
            r0.addNotifyImeListener$foundation_release(r5)
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$2$1 r0 = new androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$2$1
            r0.<init>()
            r6.mo4966m(r0)
            java.lang.Object r5 = r6.m5583t()
            if (r5 != r1) goto L6c
            return r1
        L6c:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TransformedTextFieldState.collectImeNotifications(androidx.compose.foundation.text.input.TextFieldState$NotifyImeListener, h6.c):java.lang.Object");
    }

    public final void deleteSelectedText() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.NeverMerge;
        textFieldState.getMainBuffer().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        TextFieldBufferKt.delete(mainBuffer, TextRange.m12768getMinimpl(mainBuffer.getSelectionInChars()), TextRange.m12767getMaximpl(mainBuffer.getSelectionInChars()));
        TextFieldBufferKt.setSelectionCoerced$default(mainBuffer, TextRange.m12768getMinimpl(mainBuffer.getSelectionInChars()), 0, 2, null);
        updateWedgeAffinity(mainBuffer);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void editUntransformedTextAsUser(boolean restartImeIfContentChanges, @NotNull InterfaceC6471c block) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        block.invoke(mainBuffer);
        updateWedgeAffinity(mainBuffer);
        textFieldState.commitEditAsUser(inputTransformation, restartImeIfContentChanges, textFieldEditUndoBehavior);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransformedTextFieldState)) {
            return false;
        }
        TransformedTextFieldState transformedTextFieldState = (TransformedTextFieldState) other;
        if (AbstractC5830k.m5325b(this.textFieldState, transformedTextFieldState.textFieldState) && AbstractC5830k.m5325b(this.codepointTransformation, transformedTextFieldState.codepointTransformation)) {
            return AbstractC5830k.m5325b(this.outputTransformation, transformedTextFieldState.outputTransformation);
        }
        return false;
    }

    @NotNull
    public final TextFieldCharSequence getOutputText() {
        TransformedText value;
        TextFieldCharSequence text;
        State<TransformedText> state = this.outputTransformedText;
        return (state == null || (value = state.getValue()) == null || (text = value.getText()) == null) ? getUntransformedText() : text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final SelectionWedgeAffinity getSelectionWedgeAffinity() {
        return (SelectionWedgeAffinity) this.selectionWedgeAffinity.getValue();
    }

    @NotNull
    public final TextFieldCharSequence getUntransformedText() {
        return this.textFieldState.getValue$foundation_release();
    }

    @NotNull
    public final TextFieldCharSequence getVisualText() {
        TransformedText value;
        TextFieldCharSequence text;
        State<TransformedText> state = this.codepointTransformedText;
        return (state == null || (value = state.getValue()) == null || (text = value.getText()) == null) ? getOutputText() : text;
    }

    public int hashCode() {
        int iHashCode = this.textFieldState.hashCode() * 31;
        CodepointTransformation codepointTransformation = this.codepointTransformation;
        int iHashCode2 = (iHashCode + (codepointTransformation != null ? codepointTransformation.hashCode() : 0)) * 31;
        OutputTransformation outputTransformation = this.outputTransformation;
        return iHashCode2 + (outputTransformation != null ? outputTransformation.hashCode() : 0);
    }

    /* renamed from: highlightCharsIn-7RAjNK8, reason: not valid java name */
    public final void m7883highlightCharsIn7RAjNK8(int type, long transformedRange) {
        long jM7885mapFromTransformedGEjPoXI = m7885mapFromTransformedGEjPoXI(transformedRange);
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer().getChangeTracker$foundation_release().clearChanges();
        textFieldState.getMainBuffer().m7744setHighlightK7f2yys$foundation_release(type, TextRange.m12770getStartimpl(jM7885mapFromTransformedGEjPoXI), TextRange.m12765getEndimpl(jM7885mapFromTransformedGEjPoXI));
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    /* renamed from: mapFromTransformed--jx7JFs, reason: not valid java name */
    public final long m7884mapFromTransformedjx7JFs(int offset) {
        TransformedText value;
        TransformedText value2;
        State<TransformedText> state = this.outputTransformedText;
        OffsetMappingCalculator offsetMapping = null;
        OffsetMappingCalculator offsetMapping2 = (state == null || (value2 = state.getValue()) == null) ? null : value2.getOffsetMapping();
        State<TransformedText> state2 = this.codepointTransformedText;
        if (state2 != null && (value = state2.getValue()) != null) {
            offsetMapping = value.getOffsetMapping();
        }
        long jM7826mapFromDestjx7JFs = offsetMapping != null ? offsetMapping.m7826mapFromDestjx7JFs(offset) : TextRangeKt.TextRange(offset);
        return offsetMapping2 != null ? Companion.m7893mapFromTransformedxdX6G0(jM7826mapFromDestjx7JFs, offsetMapping2) : jM7826mapFromDestjx7JFs;
    }

    /* renamed from: mapFromTransformed-GEjPoXI, reason: not valid java name */
    public final long m7885mapFromTransformedGEjPoXI(long range) {
        TransformedText value;
        TransformedText value2;
        State<TransformedText> state = this.outputTransformedText;
        OffsetMappingCalculator offsetMapping = null;
        OffsetMappingCalculator offsetMapping2 = (state == null || (value2 = state.getValue()) == null) ? null : value2.getOffsetMapping();
        State<TransformedText> state2 = this.codepointTransformedText;
        if (state2 != null && (value = state2.getValue()) != null) {
            offsetMapping = value.getOffsetMapping();
        }
        if (offsetMapping != null) {
            range = Companion.m7893mapFromTransformedxdX6G0(range, offsetMapping);
        }
        return offsetMapping2 != null ? Companion.m7893mapFromTransformedxdX6G0(range, offsetMapping2) : range;
    }

    /* renamed from: mapToTransformed--jx7JFs, reason: not valid java name */
    public final long m7886mapToTransformedjx7JFs(int offset) {
        TransformedText value;
        TransformedText value2;
        State<TransformedText> state = this.outputTransformedText;
        OffsetMappingCalculator offsetMapping = null;
        OffsetMappingCalculator offsetMapping2 = (state == null || (value2 = state.getValue()) == null) ? null : value2.getOffsetMapping();
        State<TransformedText> state2 = this.codepointTransformedText;
        if (state2 != null && (value = state2.getValue()) != null) {
            offsetMapping = value.getOffsetMapping();
        }
        long jM7827mapFromSourcejx7JFs = offsetMapping2 != null ? offsetMapping2.m7827mapFromSourcejx7JFs(offset) : TextRangeKt.TextRange(offset);
        return offsetMapping != null ? Companion.m7894mapToTransformedXGyztTk(jM7827mapFromSourcejx7JFs, offsetMapping, getSelectionWedgeAffinity()) : jM7827mapFromSourcejx7JFs;
    }

    /* renamed from: mapToTransformed-GEjPoXI, reason: not valid java name */
    public final long m7887mapToTransformedGEjPoXI(long range) {
        TransformedText value;
        TransformedText value2;
        State<TransformedText> state = this.outputTransformedText;
        OffsetMappingCalculator offsetMapping = null;
        OffsetMappingCalculator offsetMapping2 = (state == null || (value2 = state.getValue()) == null) ? null : value2.getOffsetMapping();
        State<TransformedText> state2 = this.codepointTransformedText;
        if (state2 != null && (value = state2.getValue()) != null) {
            offsetMapping = value.getOffsetMapping();
        }
        if (offsetMapping2 != null) {
            range = Companion.m7895mapToTransformedXGyztTk$default(Companion, range, offsetMapping2, null, 4, null);
        }
        return offsetMapping != null ? Companion.m7894mapToTransformedXGyztTk(range, offsetMapping, getSelectionWedgeAffinity()) : range;
    }

    public final void placeCursorBeforeCharAt(int transformedOffset) {
        m7889selectCharsIn5zctL8(TextRangeKt.TextRange(transformedOffset));
    }

    public final void redo() {
        this.textFieldState.getUndoState().redo();
    }

    public final void replaceAll(@NotNull CharSequence newText) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        TextFieldBufferKt.delete(mainBuffer, 0, mainBuffer.getLength());
        mainBuffer.append(newText.toString());
        updateWedgeAffinity(mainBuffer);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void replaceSelectedText(@NotNull CharSequence newText, boolean clearComposition, @NotNull TextFieldEditUndoBehavior undoBehavior, boolean restartImeIfContentChanges) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        textFieldState.getMainBuffer().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        if (clearComposition) {
            mainBuffer.commitComposition$foundation_release();
        }
        long selectionInChars = mainBuffer.getSelectionInChars();
        mainBuffer.replace(TextRange.m12768getMinimpl(selectionInChars), TextRange.m12767getMaximpl(selectionInChars), newText);
        TextFieldBufferKt.setSelectionCoerced$default(mainBuffer, newText.length() + TextRange.m12768getMinimpl(selectionInChars), 0, 2, null);
        updateWedgeAffinity(mainBuffer);
        textFieldState.commitEditAsUser(inputTransformation, restartImeIfContentChanges, undoBehavior);
    }

    /* renamed from: replaceText-M8tDOmk, reason: not valid java name */
    public final void m7888replaceTextM8tDOmk(@NotNull CharSequence newText, long range, @NotNull TextFieldEditUndoBehavior undoBehavior, boolean restartImeIfContentChanges) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        textFieldState.getMainBuffer().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        long jM7885mapFromTransformedGEjPoXI = m7885mapFromTransformedGEjPoXI(range);
        mainBuffer.replace(TextRange.m12768getMinimpl(jM7885mapFromTransformedGEjPoXI), TextRange.m12767getMaximpl(jM7885mapFromTransformedGEjPoXI), newText);
        TextFieldBufferKt.setSelectionCoerced$default(mainBuffer, newText.length() + TextRange.m12768getMinimpl(jM7885mapFromTransformedGEjPoXI), 0, 2, null);
        updateWedgeAffinity(mainBuffer);
        textFieldState.commitEditAsUser(inputTransformation, restartImeIfContentChanges, undoBehavior);
    }

    public final void selectAll() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        TextFieldBufferKt.setSelectionCoerced(mainBuffer, 0, mainBuffer.getLength());
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    /* renamed from: selectCharsIn-5zc-tL8, reason: not valid java name */
    public final void m7889selectCharsIn5zctL8(long transformedRange) {
        m7890selectUntransformedCharsIn5zctL8(m7885mapFromTransformedGEjPoXI(transformedRange));
    }

    /* renamed from: selectUntransformedCharsIn-5zc-tL8, reason: not valid java name */
    public final void m7890selectUntransformedCharsIn5zctL8(long untransformedRange) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer().getChangeTracker$foundation_release().clearChanges();
        TextFieldBufferKt.setSelectionCoerced(textFieldState.getMainBuffer(), TextRange.m12770getStartimpl(untransformedRange), TextRange.m12765getEndimpl(untransformedRange));
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void setSelectionWedgeAffinity(@NotNull SelectionWedgeAffinity selectionWedgeAffinity) {
        this.selectionWedgeAffinity.setValue(selectionWedgeAffinity);
    }

    @NotNull
    public String toString() {
        return "TransformedTextFieldState(textFieldState=" + this.textFieldState + ", outputTransformation=" + this.outputTransformation + ", outputTransformedText=" + this.outputTransformedText + ", codepointTransformation=" + this.codepointTransformation + ", codepointTransformedText=" + this.codepointTransformedText + ", outputText=\"" + ((Object) getOutputText()) + "\", visualText=\"" + ((Object) getVisualText()) + "\")";
    }

    public final void undo() {
        this.textFieldState.getUndoState().undo();
    }

    public final void update(@Nullable InputTransformation inputTransformation) {
        this.inputTransformation = inputTransformation;
    }

    @JvmStatic
    private static final TransformedText calculateTransformedText(TextFieldCharSequence textFieldCharSequence, CodepointTransformation codepointTransformation, SelectionWedgeAffinity selectionWedgeAffinity) {
        return Companion.calculateTransformedText(textFieldCharSequence, codepointTransformation, selectionWedgeAffinity);
    }

    public /* synthetic */ TransformedTextFieldState(TextFieldState textFieldState, InputTransformation inputTransformation, CodepointTransformation codepointTransformation, OutputTransformation outputTransformation, int i, AbstractC5824e abstractC5824e) {
        this(textFieldState, (i & 2) != 0 ? null : inputTransformation, (i & 4) != 0 ? null : codepointTransformation, (i & 8) != 0 ? null : outputTransformation);
    }
}
