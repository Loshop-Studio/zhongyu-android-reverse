package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldBufferKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.TextRangeKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@Stable
/* loaded from: classes.dex */
public final class TransformedTextFieldState {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    private final CodepointTransformation codepointTransformation;
    private final State<TransformedText> codepointTransformedText;
    private InputTransformation inputTransformation;
    private final OutputTransformation outputTransformation;
    private final State<TransformedText> outputTransformedText;
    private final MutableState selectionWedgeAffinity$delegate;
    private final TextFieldState textFieldState;

    public static final class Companion {

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

        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final TransformedText calculateTransformedText(TextFieldCharSequence textFieldCharSequence, OutputTransformation outputTransformation, SelectionWedgeAffinity selectionWedgeAffinity) {
            OffsetMappingCalculator offsetMappingCalculator = new OffsetMappingCalculator();
            TextFieldBuffer textFieldBuffer = new TextFieldBuffer(textFieldCharSequence, null, null, offsetMappingCalculator, 6, null);
            outputTransformation.transformOutput(textFieldBuffer);
            TextRange textRangeM32954boximpl = null;
            if (textFieldBuffer.getChanges().getChangeCount() == 0) {
                return null;
            }
            long jM28090mapToTransformedXGyztTk = m28090mapToTransformedXGyztTk(textFieldCharSequence.m27947getSelectiond9O1mEE(), offsetMappingCalculator, selectionWedgeAffinity);
            TextRange textRangeM27946getCompositionMzsxiRA = textFieldCharSequence.m27946getCompositionMzsxiRA();
            if (textRangeM27946getCompositionMzsxiRA != null) {
                textRangeM32954boximpl = TextRange.m32954boximpl(TransformedTextFieldState.Companion.m28090mapToTransformedXGyztTk(textRangeM27946getCompositionMzsxiRA.m32970unboximpl(), offsetMappingCalculator, selectionWedgeAffinity));
            }
            return new TransformedText(TextFieldBuffer.m27936toTextFieldCharSequenceI88jaVs$foundation_release$default(textFieldBuffer, jM28090mapToTransformedXGyztTk, textRangeM32954boximpl, null, 4, null), offsetMappingCalculator);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: mapFromTransformed-xdX6-G0, reason: not valid java name */
        public final long m28089mapFromTransformedxdX6G0(long j10, OffsetMappingCalculator offsetMappingCalculator) {
            long jM28022mapFromDestjx7JFs = offsetMappingCalculator.m28022mapFromDestjx7JFs(TextRange.m32966getStartimpl(j10));
            long jM28022mapFromDestjx7JFs2 = TextRange.m32960getCollapsedimpl(j10) ? jM28022mapFromDestjx7JFs : offsetMappingCalculator.m28022mapFromDestjx7JFs(TextRange.m32961getEndimpl(j10));
            int iMin = Math.min(TextRange.m32964getMinimpl(jM28022mapFromDestjx7JFs), TextRange.m32964getMinimpl(jM28022mapFromDestjx7JFs2));
            int iMax = Math.max(TextRange.m32963getMaximpl(jM28022mapFromDestjx7JFs), TextRange.m32963getMaximpl(jM28022mapFromDestjx7JFs2));
            return TextRange.m32965getReversedimpl(j10) ? TextRangeKt.TextRange(iMax, iMin) : TextRangeKt.TextRange(iMin, iMax);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: mapToTransformed-XGyztTk, reason: not valid java name */
        public final long m28090mapToTransformedXGyztTk(long j10, OffsetMappingCalculator offsetMappingCalculator, SelectionWedgeAffinity selectionWedgeAffinity) {
            long jTextRange;
            long jM28023mapFromSourcejx7JFs = offsetMappingCalculator.m28023mapFromSourcejx7JFs(TextRange.m32966getStartimpl(j10));
            long jM28023mapFromSourcejx7JFs2 = TextRange.m32960getCollapsedimpl(j10) ? jM28023mapFromSourcejx7JFs : offsetMappingCalculator.m28023mapFromSourcejx7JFs(TextRange.m32961getEndimpl(j10));
            WedgeAffinity endAffinity = null;
            WedgeAffinity startAffinity = selectionWedgeAffinity != null ? selectionWedgeAffinity.getStartAffinity() : null;
            if (TextRange.m32960getCollapsedimpl(j10)) {
                endAffinity = startAffinity;
            } else if (selectionWedgeAffinity != null) {
                endAffinity = selectionWedgeAffinity.getEndAffinity();
            }
            if (startAffinity != null && !TextRange.m32960getCollapsedimpl(jM28023mapFromSourcejx7JFs)) {
                int i10 = WhenMappings.$EnumSwitchMapping$0[startAffinity.ordinal()];
                if (i10 == 1) {
                    jM28023mapFromSourcejx7JFs = TextRangeKt.TextRange(TextRange.m32966getStartimpl(jM28023mapFromSourcejx7JFs));
                } else {
                    if (i10 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jM28023mapFromSourcejx7JFs = TextRangeKt.TextRange(TextRange.m32961getEndimpl(jM28023mapFromSourcejx7JFs));
                }
            }
            if (endAffinity != null && !TextRange.m32960getCollapsedimpl(jM28023mapFromSourcejx7JFs2)) {
                int i11 = WhenMappings.$EnumSwitchMapping$0[endAffinity.ordinal()];
                if (i11 == 1) {
                    jTextRange = TextRangeKt.TextRange(TextRange.m32966getStartimpl(jM28023mapFromSourcejx7JFs2));
                } else {
                    if (i11 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jTextRange = TextRangeKt.TextRange(TextRange.m32961getEndimpl(jM28023mapFromSourcejx7JFs2));
                }
                jM28023mapFromSourcejx7JFs2 = jTextRange;
            }
            int iMin = Math.min(TextRange.m32964getMinimpl(jM28023mapFromSourcejx7JFs), TextRange.m32964getMinimpl(jM28023mapFromSourcejx7JFs2));
            int iMax = Math.max(TextRange.m32963getMaximpl(jM28023mapFromSourcejx7JFs), TextRange.m32963getMaximpl(jM28023mapFromSourcejx7JFs2));
            return TextRange.m32965getReversedimpl(j10) ? TextRangeKt.TextRange(iMax, iMin) : TextRangeKt.TextRange(iMin, iMax);
        }

        /* renamed from: mapToTransformed-XGyztTk$default, reason: not valid java name */
        public static /* synthetic */ long m28091mapToTransformedXGyztTk$default(Companion companion, long j10, OffsetMappingCalculator offsetMappingCalculator, SelectionWedgeAffinity selectionWedgeAffinity, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                selectionWedgeAffinity = null;
            }
            return companion.m28090mapToTransformedXGyztTk(j10, offsetMappingCalculator, selectionWedgeAffinity);
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final TransformedText calculateTransformedText(TextFieldCharSequence textFieldCharSequence, CodepointTransformation codepointTransformation, SelectionWedgeAffinity selectionWedgeAffinity) {
            OffsetMappingCalculator offsetMappingCalculator = new OffsetMappingCalculator();
            CharSequence visualText = CodepointTransformationKt.toVisualText(textFieldCharSequence, codepointTransformation, offsetMappingCalculator);
            TextRange textRangeM32954boximpl = null;
            if (visualText == textFieldCharSequence) {
                return null;
            }
            long jM28090mapToTransformedXGyztTk = m28090mapToTransformedXGyztTk(textFieldCharSequence.m27947getSelectiond9O1mEE(), offsetMappingCalculator, selectionWedgeAffinity);
            TextRange textRangeM27946getCompositionMzsxiRA = textFieldCharSequence.m27946getCompositionMzsxiRA();
            if (textRangeM27946getCompositionMzsxiRA != null) {
                textRangeM32954boximpl = TextRange.m32954boximpl(TransformedTextFieldState.Companion.m28090mapToTransformedXGyztTk(textRangeM27946getCompositionMzsxiRA.m32970unboximpl(), offsetMappingCalculator, selectionWedgeAffinity));
            }
            return new TransformedText(new TextFieldCharSequence(visualText, jM28090mapToTransformedXGyztTk, textRangeM32954boximpl, null, null, 24, null), offsetMappingCalculator);
        }
    }

    public static final class TransformedText {
        private final OffsetMappingCalculator offsetMapping;
        private final TextFieldCharSequence text;

        public TransformedText(TextFieldCharSequence textFieldCharSequence, OffsetMappingCalculator offsetMappingCalculator) {
            this.text = textFieldCharSequence;
            this.offsetMapping = offsetMappingCalculator;
        }

        public static /* synthetic */ TransformedText copy$default(TransformedText transformedText, TextFieldCharSequence textFieldCharSequence, OffsetMappingCalculator offsetMappingCalculator, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                textFieldCharSequence = transformedText.text;
            }
            if ((i10 & 2) != 0) {
                offsetMappingCalculator = transformedText.offsetMapping;
            }
            return transformedText.copy(textFieldCharSequence, offsetMappingCalculator);
        }

        public final TextFieldCharSequence component1() {
            return this.text;
        }

        public final OffsetMappingCalculator component2() {
            return this.offsetMapping;
        }

        public final TransformedText copy(TextFieldCharSequence textFieldCharSequence, OffsetMappingCalculator offsetMappingCalculator) {
            return new TransformedText(textFieldCharSequence, offsetMappingCalculator);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransformedText)) {
                return false;
            }
            TransformedText transformedText = (TransformedText) obj;
            return AbstractC9979u.m20289b(this.text, transformedText.text) && AbstractC9979u.m20289b(this.offsetMapping, transformedText.offsetMapping);
        }

        public final OffsetMappingCalculator getOffsetMapping() {
            return this.offsetMapping;
        }

        public final TextFieldCharSequence getText() {
            return this.text;
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + this.offsetMapping.hashCode();
        }

        public String toString() {
            return "TransformedText(text=" + ((Object) this.text) + ", offsetMapping=" + this.offsetMapping + ')';
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.input.internal.TransformedTextFieldState", m26211f = "TransformedTextFieldState.kt", m26212l = {747}, m26213m = "collectImeNotifications")
    /* renamed from: androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1 */
    public static final class C18331 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C18331(InterfaceC11588c<? super C18331> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransformedTextFieldState.this.collectImeNotifications(null, this);
        }
    }

    public TransformedTextFieldState(TextFieldState textFieldState, InputTransformation inputTransformation, final CodepointTransformation codepointTransformation, final OutputTransformation outputTransformation) {
        this.textFieldState = textFieldState;
        this.inputTransformation = inputTransformation;
        this.codepointTransformation = codepointTransformation;
        this.outputTransformation = outputTransformation;
        this.outputTransformedText = outputTransformation != null ? SnapshotStateKt.derivedStateOf(new InterfaceC9529a() { // from class: androidx.compose.foundation.text.input.internal.TransformedTextFieldState$outputTransformedText$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final TransformedTextFieldState.TransformedText invoke() {
                return TransformedTextFieldState.Companion.calculateTransformedText(this.this$0.textFieldState.getValue$foundation_release(), outputTransformation, this.this$0.getSelectionWedgeAffinity());
            }
        }) : null;
        this.codepointTransformedText = codepointTransformation != null ? SnapshotStateKt.derivedStateOf(new InterfaceC9529a() { // from class: androidx.compose.foundation.text.input.internal.TransformedTextFieldState$codepointTransformedText$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
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
        this.selectionWedgeAffinity$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new SelectionWedgeAffinity(WedgeAffinity.Start), null, 2, null);
    }

    private static final TransformedText calculateTransformedText(TextFieldCharSequence textFieldCharSequence, OutputTransformation outputTransformation, SelectionWedgeAffinity selectionWedgeAffinity) {
        return Companion.calculateTransformedText(textFieldCharSequence, outputTransformation, selectionWedgeAffinity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void collectImeNotifications$lambda$18(TextFieldState.NotifyImeListener notifyImeListener, TransformedTextFieldState transformedTextFieldState, TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z10) {
        TextFieldCharSequence text;
        TransformedText transformedTextCalculateTransformedText = Companion.calculateTransformedText(textFieldCharSequence, transformedTextFieldState.outputTransformation, transformedTextFieldState.getSelectionWedgeAffinity());
        if (transformedTextCalculateTransformedText != null && (text = transformedTextCalculateTransformedText.getText()) != null) {
            textFieldCharSequence = text;
        }
        notifyImeListener.onChange(textFieldCharSequence, transformedTextFieldState.getVisualText(), z10);
    }

    public static /* synthetic */ void editUntransformedTextAsUser$default(TransformedTextFieldState transformedTextFieldState, boolean z10, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        interfaceC9540l.invoke(mainBuffer$foundation_release);
        transformedTextFieldState.updateWedgeAffinity(mainBuffer$foundation_release);
        textFieldState.commitEditAsUser(inputTransformation, z10, textFieldEditUndoBehavior);
    }

    /* renamed from: mapFromTransformed-xdX6-G0, reason: not valid java name */
    private static final long m28076mapFromTransformedxdX6G0(long j10, OffsetMappingCalculator offsetMappingCalculator) {
        return Companion.m28089mapFromTransformedxdX6G0(j10, offsetMappingCalculator);
    }

    /* renamed from: mapToTransformed-XGyztTk, reason: not valid java name */
    private static final long m28077mapToTransformedXGyztTk(long j10, OffsetMappingCalculator offsetMappingCalculator, SelectionWedgeAffinity selectionWedgeAffinity) {
        return Companion.m28090mapToTransformedXGyztTk(j10, offsetMappingCalculator, selectionWedgeAffinity);
    }

    public static /* synthetic */ void replaceSelectedText$default(TransformedTextFieldState transformedTextFieldState, CharSequence charSequence, boolean z10, TextFieldEditUndoBehavior textFieldEditUndoBehavior, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        transformedTextFieldState.replaceSelectedText(charSequence, z10, textFieldEditUndoBehavior, z11);
    }

    /* renamed from: replaceText-M8tDOmk$default, reason: not valid java name */
    public static /* synthetic */ void m28078replaceTextM8tDOmk$default(TransformedTextFieldState transformedTextFieldState, CharSequence charSequence, long j10, TextFieldEditUndoBehavior textFieldEditUndoBehavior, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        TextFieldEditUndoBehavior textFieldEditUndoBehavior2 = textFieldEditUndoBehavior;
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        transformedTextFieldState.m28084replaceTextM8tDOmk(charSequence, j10, textFieldEditUndoBehavior2, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateWedgeAffinity(TextFieldBuffer textFieldBuffer) {
        if (textFieldBuffer.getChangeTracker$foundation_release().getChangeCount() <= 0 || !TextRange.m32960getCollapsedimpl(textFieldBuffer.m27939getSelectiond9O1mEE())) {
            return;
        }
        setSelectionWedgeAffinity(new SelectionWedgeAffinity(WedgeAffinity.Start));
    }

    public final void collapseSelectionToEnd() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        TextFieldBufferKt.setSelectionCoerced$default(mainBuffer$foundation_release, TextRange.m32961getEndimpl(mainBuffer$foundation_release.m27939getSelectiond9O1mEE()), 0, 2, null);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void collapseSelectionToMax() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        TextFieldBufferKt.setSelectionCoerced$default(mainBuffer$foundation_release, TextRange.m32963getMaximpl(mainBuffer$foundation_release.m27939getSelectiond9O1mEE()), 0, 2, null);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collectImeNotifications(final androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener r5, vc.InterfaceC11588c<?> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.text.input.internal.TransformedTextFieldState.C18331
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1 r0 = (androidx.compose.foundation.text.input.internal.TransformedTextFieldState.C18331) r0
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
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            java.lang.Object r5 = r0.L$1
            androidx.compose.foundation.text.input.TextFieldState$NotifyImeListener r5 = (androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener) r5
            java.lang.Object r5 = r0.L$0
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r5 = (androidx.compose.foundation.text.input.internal.TransformedTextFieldState) r5
            kotlin.AbstractC9924b.m20071b(r6)
            goto L77
        L39:
            kotlin.AbstractC9924b.m20071b(r6)
            androidx.compose.foundation.text.input.OutputTransformation r6 = r4.outputTransformation
            if (r6 == 0) goto L46
            androidx.compose.foundation.text.input.internal.f1 r6 = new androidx.compose.foundation.text.input.internal.f1
            r6.<init>()
            r5 = r6
        L46:
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            kotlinx.coroutines.c r6 = new kotlinx.coroutines.c
            vc.c r2 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m20224d(r0)
            r6.<init>(r2, r3)
            r6.m20503F()
            androidx.compose.foundation.text.input.TextFieldState r2 = access$getTextFieldState$p(r4)
            r2.addNotifyImeListener$foundation_release(r5)
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$2$1 r2 = new androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$2$1
            r2.<init>()
            r6.mo20536u(r2)
            java.lang.Object r5 = r6.m20538x()
            java.lang.Object r6 = p393wc.AbstractC11725a.m25952f()
            if (r5 != r6) goto L74
            p409xc.AbstractC11831f.m26221c(r0)
        L74:
            if (r5 != r1) goto L77
            return r1
        L77:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TransformedTextFieldState.collectImeNotifications(androidx.compose.foundation.text.input.TextFieldState$NotifyImeListener, vc.c):java.lang.Object");
    }

    public final void deleteSelectedText() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.NeverMerge;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        TextFieldBufferKt.delete(mainBuffer$foundation_release, TextRange.m32964getMinimpl(mainBuffer$foundation_release.m27939getSelectiond9O1mEE()), TextRange.m32963getMaximpl(mainBuffer$foundation_release.m27939getSelectiond9O1mEE()));
        TextFieldBufferKt.setSelectionCoerced$default(mainBuffer$foundation_release, TextRange.m32964getMinimpl(mainBuffer$foundation_release.m27939getSelectiond9O1mEE()), 0, 2, null);
        updateWedgeAffinity(mainBuffer$foundation_release);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void editUntransformedTextAsUser(boolean z10, InterfaceC9540l interfaceC9540l) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        interfaceC9540l.invoke(mainBuffer$foundation_release);
        updateWedgeAffinity(mainBuffer$foundation_release);
        textFieldState.commitEditAsUser(inputTransformation, z10, textFieldEditUndoBehavior);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransformedTextFieldState)) {
            return false;
        }
        TransformedTextFieldState transformedTextFieldState = (TransformedTextFieldState) obj;
        if (AbstractC9979u.m20289b(this.textFieldState, transformedTextFieldState.textFieldState) && AbstractC9979u.m20289b(this.codepointTransformation, transformedTextFieldState.codepointTransformation)) {
            return AbstractC9979u.m20289b(this.outputTransformation, transformedTextFieldState.outputTransformation);
        }
        return false;
    }

    public final TextFieldCharSequence getOutputText() {
        TransformedText value;
        TextFieldCharSequence text;
        State<TransformedText> state = this.outputTransformedText;
        return (state == null || (value = state.getValue()) == null || (text = value.getText()) == null) ? getUntransformedText() : text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SelectionWedgeAffinity getSelectionWedgeAffinity() {
        return (SelectionWedgeAffinity) this.selectionWedgeAffinity$delegate.getValue();
    }

    public final TextFieldCharSequence getUntransformedText() {
        return this.textFieldState.getValue$foundation_release();
    }

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
    public final void m28079highlightCharsIn7RAjNK8(int i10, long j10) {
        long jM28081mapFromTransformedGEjPoXI = m28081mapFromTransformedGEjPoXI(j10);
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        textFieldState.getMainBuffer$foundation_release().m27940setHighlightK7f2yys$foundation_release(i10, TextRange.m32966getStartimpl(jM28081mapFromTransformedGEjPoXI), TextRange.m32961getEndimpl(jM28081mapFromTransformedGEjPoXI));
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    /* renamed from: mapFromTransformed--jx7JFs, reason: not valid java name */
    public final long m28080mapFromTransformedjx7JFs(int i10) {
        TransformedText value;
        TransformedText value2;
        State<TransformedText> state = this.outputTransformedText;
        OffsetMappingCalculator offsetMapping = null;
        OffsetMappingCalculator offsetMapping2 = (state == null || (value2 = state.getValue()) == null) ? null : value2.getOffsetMapping();
        State<TransformedText> state2 = this.codepointTransformedText;
        if (state2 != null && (value = state2.getValue()) != null) {
            offsetMapping = value.getOffsetMapping();
        }
        long jM28022mapFromDestjx7JFs = offsetMapping != null ? offsetMapping.m28022mapFromDestjx7JFs(i10) : TextRangeKt.TextRange(i10);
        return offsetMapping2 != null ? Companion.m28089mapFromTransformedxdX6G0(jM28022mapFromDestjx7JFs, offsetMapping2) : jM28022mapFromDestjx7JFs;
    }

    /* renamed from: mapFromTransformed-GEjPoXI, reason: not valid java name */
    public final long m28081mapFromTransformedGEjPoXI(long j10) {
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
            j10 = Companion.m28089mapFromTransformedxdX6G0(j10, offsetMapping);
        }
        return offsetMapping2 != null ? Companion.m28089mapFromTransformedxdX6G0(j10, offsetMapping2) : j10;
    }

    /* renamed from: mapToTransformed--jx7JFs, reason: not valid java name */
    public final long m28082mapToTransformedjx7JFs(int i10) {
        TransformedText value;
        TransformedText value2;
        State<TransformedText> state = this.outputTransformedText;
        OffsetMappingCalculator offsetMapping = null;
        OffsetMappingCalculator offsetMapping2 = (state == null || (value2 = state.getValue()) == null) ? null : value2.getOffsetMapping();
        State<TransformedText> state2 = this.codepointTransformedText;
        if (state2 != null && (value = state2.getValue()) != null) {
            offsetMapping = value.getOffsetMapping();
        }
        long jM28023mapFromSourcejx7JFs = offsetMapping2 != null ? offsetMapping2.m28023mapFromSourcejx7JFs(i10) : TextRangeKt.TextRange(i10);
        return offsetMapping != null ? Companion.m28090mapToTransformedXGyztTk(jM28023mapFromSourcejx7JFs, offsetMapping, getSelectionWedgeAffinity()) : jM28023mapFromSourcejx7JFs;
    }

    /* renamed from: mapToTransformed-GEjPoXI, reason: not valid java name */
    public final long m28083mapToTransformedGEjPoXI(long j10) {
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
            j10 = Companion.m28091mapToTransformedXGyztTk$default(Companion, j10, offsetMapping2, null, 4, null);
        }
        return offsetMapping != null ? Companion.m28090mapToTransformedXGyztTk(j10, offsetMapping, getSelectionWedgeAffinity()) : j10;
    }

    public final void placeCursorBeforeCharAt(int i10) {
        m28085selectCharsIn5zctL8(TextRangeKt.TextRange(i10));
    }

    public final void redo() {
        this.textFieldState.getUndoState().redo();
    }

    public final void replaceAll(CharSequence charSequence) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        TextFieldBufferKt.delete(mainBuffer$foundation_release, 0, mainBuffer$foundation_release.getLength());
        mainBuffer$foundation_release.append(charSequence.toString());
        updateWedgeAffinity(mainBuffer$foundation_release);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void replaceSelectedText(CharSequence charSequence, boolean z10, TextFieldEditUndoBehavior textFieldEditUndoBehavior, boolean z11) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        if (z10) {
            mainBuffer$foundation_release.commitComposition$foundation_release();
        }
        long jM27939getSelectiond9O1mEE = mainBuffer$foundation_release.m27939getSelectiond9O1mEE();
        mainBuffer$foundation_release.replace(TextRange.m32964getMinimpl(jM27939getSelectiond9O1mEE), TextRange.m32963getMaximpl(jM27939getSelectiond9O1mEE), charSequence);
        TextFieldBufferKt.setSelectionCoerced$default(mainBuffer$foundation_release, TextRange.m32964getMinimpl(jM27939getSelectiond9O1mEE) + charSequence.length(), 0, 2, null);
        updateWedgeAffinity(mainBuffer$foundation_release);
        textFieldState.commitEditAsUser(inputTransformation, z11, textFieldEditUndoBehavior);
    }

    /* renamed from: replaceText-M8tDOmk, reason: not valid java name */
    public final void m28084replaceTextM8tDOmk(CharSequence charSequence, long j10, TextFieldEditUndoBehavior textFieldEditUndoBehavior, boolean z10) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        long jM28081mapFromTransformedGEjPoXI = m28081mapFromTransformedGEjPoXI(j10);
        mainBuffer$foundation_release.replace(TextRange.m32964getMinimpl(jM28081mapFromTransformedGEjPoXI), TextRange.m32963getMaximpl(jM28081mapFromTransformedGEjPoXI), charSequence);
        TextFieldBufferKt.setSelectionCoerced$default(mainBuffer$foundation_release, TextRange.m32964getMinimpl(jM28081mapFromTransformedGEjPoXI) + charSequence.length(), 0, 2, null);
        updateWedgeAffinity(mainBuffer$foundation_release);
        textFieldState.commitEditAsUser(inputTransformation, z10, textFieldEditUndoBehavior);
    }

    public final void selectAll() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        TextFieldBufferKt.setSelectionCoerced(mainBuffer$foundation_release, 0, mainBuffer$foundation_release.getLength());
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    /* renamed from: selectCharsIn-5zc-tL8, reason: not valid java name */
    public final void m28085selectCharsIn5zctL8(long j10) {
        m28086selectUntransformedCharsIn5zctL8(m28081mapFromTransformedGEjPoXI(j10));
    }

    /* renamed from: selectUntransformedCharsIn-5zc-tL8, reason: not valid java name */
    public final void m28086selectUntransformedCharsIn5zctL8(long j10) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBufferKt.setSelectionCoerced(textFieldState.getMainBuffer$foundation_release(), TextRange.m32966getStartimpl(j10), TextRange.m32961getEndimpl(j10));
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void setSelectionWedgeAffinity(SelectionWedgeAffinity selectionWedgeAffinity) {
        this.selectionWedgeAffinity$delegate.setValue(selectionWedgeAffinity);
    }

    public String toString() {
        return "TransformedTextFieldState(textFieldState=" + this.textFieldState + ", outputTransformation=" + this.outputTransformation + ", outputTransformedText=" + this.outputTransformedText + ", codepointTransformation=" + this.codepointTransformation + ", codepointTransformedText=" + this.codepointTransformedText + ", outputText=\"" + ((Object) getOutputText()) + "\", visualText=\"" + ((Object) getVisualText()) + "\")";
    }

    public final void undo() {
        this.textFieldState.getUndoState().undo();
    }

    public final void update(InputTransformation inputTransformation) {
        this.inputTransformation = inputTransformation;
    }

    private static final TransformedText calculateTransformedText(TextFieldCharSequence textFieldCharSequence, CodepointTransformation codepointTransformation, SelectionWedgeAffinity selectionWedgeAffinity) {
        return Companion.calculateTransformedText(textFieldCharSequence, codepointTransformation, selectionWedgeAffinity);
    }

    public /* synthetic */ TransformedTextFieldState(TextFieldState textFieldState, InputTransformation inputTransformation, CodepointTransformation codepointTransformation, OutputTransformation outputTransformation, int i10, AbstractC9972n abstractC9972n) {
        this(textFieldState, (i10 & 2) != 0 ? null : inputTransformation, (i10 & 4) != 0 ? null : codepointTransformation, (i10 & 8) != 0 ? null : outputTransformation);
    }
}
