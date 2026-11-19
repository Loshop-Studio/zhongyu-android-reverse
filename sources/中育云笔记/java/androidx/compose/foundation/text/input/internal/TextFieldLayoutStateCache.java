package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache;
import androidx.compose.p014ui.graphics.Shadow;
import androidx.compose.p014ui.graphics.drawscope.DrawStyle;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.PlatformTextStyle;
import androidx.compose.p014ui.text.TextLayoutInput;
import androidx.compose.p014ui.text.TextLayoutResult;
import androidx.compose.p014ui.text.TextMeasurer;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.TextStyle;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.font.FontStyle;
import androidx.compose.p014ui.text.font.FontSynthesis;
import androidx.compose.p014ui.text.font.FontWeight;
import androidx.compose.p014ui.text.input.KeyboardType;
import androidx.compose.p014ui.text.intl.Locale;
import androidx.compose.p014ui.text.intl.LocaleList;
import androidx.compose.p014ui.text.style.BaselineShift;
import androidx.compose.p014ui.text.style.LineHeightStyle;
import androidx.compose.p014ui.text.style.TextDecoration;
import androidx.compose.p014ui.text.style.TextGeometricTransform;
import androidx.compose.p014ui.text.style.TextIndent;
import androidx.compose.p014ui.text.style.TextMotion;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.ConstraintsKt;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateRecord;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9977s;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p310qd.AbstractC10819z;
import p325rc.AbstractC10978w;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class TextFieldLayoutStateCache implements State<TextLayoutResult>, StateObject {
    public static final int $stable = 0;
    private TextMeasurer textMeasurer;
    private final MutableState nonMeasureInputs$delegate = SnapshotStateKt.mutableStateOf(null, NonMeasureInputs.Companion.getMutationPolicy());
    private final MutableState measureInputs$delegate = SnapshotStateKt.mutableStateOf(null, MeasureInputs.Companion.getMutationPolicy());
    private CacheRecord record = new CacheRecord();

    public static final class CacheRecord extends StateRecord {
        private List<AnnotatedString.Range<AnnotatedString.Annotation>> composingAnnotations;
        private TextRange composition;
        private FontFamily.Resolver fontFamilyResolver;
        private LayoutDirection layoutDirection;
        private TextLayoutResult layoutResult;
        private boolean singleLine;
        private boolean softWrap;
        private TextStyle textStyle;
        private CharSequence visualText;
        private float densityValue = Float.NaN;
        private float fontScale = Float.NaN;
        private long constraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord) {
            AbstractC9979u.m20292e(stateRecord, "null cannot be cast to non-null type androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.CacheRecord");
            CacheRecord cacheRecord = (CacheRecord) stateRecord;
            this.visualText = cacheRecord.visualText;
            this.composingAnnotations = cacheRecord.composingAnnotations;
            this.composition = cacheRecord.composition;
            this.textStyle = cacheRecord.textStyle;
            this.singleLine = cacheRecord.singleLine;
            this.softWrap = cacheRecord.softWrap;
            this.densityValue = cacheRecord.densityValue;
            this.fontScale = cacheRecord.fontScale;
            this.layoutDirection = cacheRecord.layoutDirection;
            this.fontFamilyResolver = cacheRecord.fontFamilyResolver;
            this.constraints = cacheRecord.constraints;
            this.layoutResult = cacheRecord.layoutResult;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return new CacheRecord();
        }

        public final List<AnnotatedString.Range<AnnotatedString.Annotation>> getComposingAnnotations() {
            return this.composingAnnotations;
        }

        /* renamed from: getComposition-MzsxiRA, reason: not valid java name */
        public final TextRange m28060getCompositionMzsxiRA() {
            return this.composition;
        }

        /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
        public final long m28061getConstraintsmsEJaDk() {
            return this.constraints;
        }

        public final float getDensityValue() {
            return this.densityValue;
        }

        public final FontFamily.Resolver getFontFamilyResolver() {
            return this.fontFamilyResolver;
        }

        public final float getFontScale() {
            return this.fontScale;
        }

        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        public final TextLayoutResult getLayoutResult() {
            return this.layoutResult;
        }

        public final boolean getSingleLine() {
            return this.singleLine;
        }

        public final boolean getSoftWrap() {
            return this.softWrap;
        }

        public final TextStyle getTextStyle() {
            return this.textStyle;
        }

        public final CharSequence getVisualText() {
            return this.visualText;
        }

        public final void setComposingAnnotations(List<AnnotatedString.Range<AnnotatedString.Annotation>> list) {
            this.composingAnnotations = list;
        }

        /* renamed from: setComposition-OEnZFl4, reason: not valid java name */
        public final void m28062setCompositionOEnZFl4(TextRange textRange) {
            this.composition = textRange;
        }

        /* renamed from: setConstraints-BRTryo0, reason: not valid java name */
        public final void m28063setConstraintsBRTryo0(long j10) {
            this.constraints = j10;
        }

        public final void setDensityValue(float f10) {
            this.densityValue = f10;
        }

        public final void setFontFamilyResolver(FontFamily.Resolver resolver) {
            this.fontFamilyResolver = resolver;
        }

        public final void setFontScale(float f10) {
            this.fontScale = f10;
        }

        public final void setLayoutDirection(LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        public final void setLayoutResult(TextLayoutResult textLayoutResult) {
            this.layoutResult = textLayoutResult;
        }

        public final void setSingleLine(boolean z10) {
            this.singleLine = z10;
        }

        public final void setSoftWrap(boolean z10) {
            this.softWrap = z10;
        }

        public final void setTextStyle(TextStyle textStyle) {
            this.textStyle = textStyle;
        }

        public final void setVisualText(CharSequence charSequence) {
            this.visualText = charSequence;
        }

        public String toString() {
            return "CacheRecord(visualText=" + ((Object) this.visualText) + ", composingAnnotations=" + this.composingAnnotations + ", composition=" + this.composition + ", textStyle=" + this.textStyle + ", singleLine=" + this.singleLine + ", softWrap=" + this.softWrap + ", densityValue=" + this.densityValue + ", fontScale=" + this.fontScale + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + ((Object) Constraints.m33459toStringimpl(this.constraints)) + ", layoutResult=" + this.layoutResult + ')';
        }
    }

    public static final class MeasureInputs {
        public static final Companion Companion = new Companion(null);
        private static final SnapshotMutationPolicy<MeasureInputs> mutationPolicy = new SnapshotMutationPolicy<MeasureInputs>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache$MeasureInputs$Companion$mutationPolicy$1
            @Override // androidx.compose.runtime.SnapshotMutationPolicy
            public boolean equivalent(TextFieldLayoutStateCache.MeasureInputs measureInputs, TextFieldLayoutStateCache.MeasureInputs measureInputs2) {
                if (measureInputs == null || measureInputs2 == null) {
                    return !((measureInputs == null) ^ (measureInputs2 == null));
                }
                return measureInputs.getDensityValue() == measureInputs2.getDensityValue() && measureInputs.getFontScale() == measureInputs2.getFontScale() && measureInputs.getLayoutDirection() == measureInputs2.getLayoutDirection() && AbstractC9979u.m20289b(measureInputs.getFontFamilyResolver(), measureInputs2.getFontFamilyResolver()) && Constraints.m33447equalsimpl0(measureInputs.m28064getConstraintsmsEJaDk(), measureInputs2.m28064getConstraintsmsEJaDk());
            }
        };
        private final long constraints;
        private final Density density;
        private final float densityValue;
        private final FontFamily.Resolver fontFamilyResolver;
        private final float fontScale;
        private final LayoutDirection layoutDirection;

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
                this();
            }

            public final SnapshotMutationPolicy<MeasureInputs> getMutationPolicy() {
                return MeasureInputs.mutationPolicy;
            }

            private Companion() {
            }
        }

        public /* synthetic */ MeasureInputs(Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j10, AbstractC9972n abstractC9972n) {
            this(density, layoutDirection, resolver, j10);
        }

        /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
        public final long m28064getConstraintsmsEJaDk() {
            return this.constraints;
        }

        public final Density getDensity() {
            return this.density;
        }

        public final float getDensityValue() {
            return this.densityValue;
        }

        public final FontFamily.Resolver getFontFamilyResolver() {
            return this.fontFamilyResolver;
        }

        public final float getFontScale() {
            return this.fontScale;
        }

        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        public String toString() {
            return "MeasureInputs(density=" + this.density + ", densityValue=" + this.densityValue + ", fontScale=" + this.fontScale + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + ((Object) Constraints.m33459toStringimpl(this.constraints)) + ')';
        }

        private MeasureInputs(Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j10) {
            this.density = density;
            this.layoutDirection = layoutDirection;
            this.fontFamilyResolver = resolver;
            this.constraints = j10;
            this.densityValue = density.getDensity();
            this.fontScale = density.getFontScale();
        }
    }

    public static final class NonMeasureInputs {
        public static final Companion Companion = new Companion(null);
        private static final SnapshotMutationPolicy<NonMeasureInputs> mutationPolicy = new SnapshotMutationPolicy<NonMeasureInputs>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache$NonMeasureInputs$Companion$mutationPolicy$1
            @Override // androidx.compose.runtime.SnapshotMutationPolicy
            public boolean equivalent(TextFieldLayoutStateCache.NonMeasureInputs nonMeasureInputs, TextFieldLayoutStateCache.NonMeasureInputs nonMeasureInputs2) {
                if (nonMeasureInputs == null || nonMeasureInputs2 == null) {
                    return !((nonMeasureInputs == null) ^ (nonMeasureInputs2 == null));
                }
                return nonMeasureInputs.getTextFieldState() == nonMeasureInputs2.getTextFieldState() && AbstractC9979u.m20289b(nonMeasureInputs.getTextStyle(), nonMeasureInputs2.getTextStyle()) && nonMeasureInputs.getSingleLine() == nonMeasureInputs2.getSingleLine() && nonMeasureInputs.getSoftWrap() == nonMeasureInputs2.getSoftWrap() && nonMeasureInputs.isKeyboardTypePhone() == nonMeasureInputs2.isKeyboardTypePhone();
            }
        };
        private final boolean isKeyboardTypePhone;
        private final boolean singleLine;
        private final boolean softWrap;
        private final TransformedTextFieldState textFieldState;
        private final TextStyle textStyle;

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
                this();
            }

            public final SnapshotMutationPolicy<NonMeasureInputs> getMutationPolicy() {
                return NonMeasureInputs.mutationPolicy;
            }

            private Companion() {
            }
        }

        public NonMeasureInputs(TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z10, boolean z11, boolean z12) {
            this.textFieldState = transformedTextFieldState;
            this.textStyle = textStyle;
            this.singleLine = z10;
            this.softWrap = z11;
            this.isKeyboardTypePhone = z12;
        }

        public final boolean getSingleLine() {
            return this.singleLine;
        }

        public final boolean getSoftWrap() {
            return this.softWrap;
        }

        public final TransformedTextFieldState getTextFieldState() {
            return this.textFieldState;
        }

        public final TextStyle getTextStyle() {
            return this.textStyle;
        }

        public final boolean isKeyboardTypePhone() {
            return this.isKeyboardTypePhone;
        }

        public String toString() {
            return "NonMeasureInputs(textFieldState=" + this.textFieldState + ", textStyle=" + this.textStyle + ", singleLine=" + this.singleLine + ", softWrap=" + this.softWrap + ", isKeyboardTypePhone=" + this.isKeyboardTypePhone + ')';
        }
    }

    private final TextLayoutResult computeLayout(TextFieldCharSequence textFieldCharSequence, NonMeasureInputs nonMeasureInputs, MeasureInputs measureInputs) {
        TextStyle textStyle;
        Locale current;
        TextMeasurer textMeasurerObtainTextMeasurer = obtainTextMeasurer(measureInputs);
        if (nonMeasureInputs.isKeyboardTypePhone()) {
            LocaleList localeList = nonMeasureInputs.getTextStyle().getLocaleList();
            if (localeList == null || (current = localeList.get(0)) == null) {
                current = Locale.Companion.getCurrent();
            }
            textStyle = nonMeasureInputs.getTextStyle().merge(new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, TextFieldLayoutStateCache_androidKt.resolveTextDirectionForKeyboardTypePhone(current.getPlatformLocale()), 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16711679, (AbstractC9972n) null));
        } else {
            textStyle = nonMeasureInputs.getTextStyle();
        }
        String string = textFieldCharSequence.toString();
        List<AnnotatedString.Range<AnnotatedString.Annotation>> composingAnnotations = textFieldCharSequence.getComposingAnnotations();
        if (composingAnnotations == null) {
            composingAnnotations = AbstractC10978w.m24136n();
        }
        return TextMeasurer.m32940measurexDpz5zY$default(textMeasurerObtainTextMeasurer, new AnnotatedString(string, composingAnnotations), textStyle, 0, nonMeasureInputs.getSoftWrap(), nonMeasureInputs.getSingleLine() ? 1 : Integer.MAX_VALUE, null, measureInputs.m28064getConstraintsmsEJaDk(), measureInputs.getLayoutDirection(), measureInputs.getDensity(), measureInputs.getFontFamilyResolver(), false, 1060, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final MeasureInputs getMeasureInputs() {
        return (MeasureInputs) this.measureInputs$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final NonMeasureInputs getNonMeasureInputs() {
        return (NonMeasureInputs) this.nonMeasureInputs$delegate.getValue();
    }

    private final TextLayoutResult getOrComputeLayout(NonMeasureInputs nonMeasureInputs, MeasureInputs measureInputs) {
        CharSequence visualText;
        TextFieldCharSequence visualText2 = nonMeasureInputs.getTextFieldState().getVisualText();
        CacheRecord cacheRecord = (CacheRecord) SnapshotKt.current(this.record);
        TextLayoutResult layoutResult = cacheRecord.getLayoutResult();
        if (layoutResult != null && (visualText = cacheRecord.getVisualText()) != null && AbstractC10819z.m23245w(visualText, visualText2) && AbstractC9979u.m20289b(cacheRecord.getComposingAnnotations(), visualText2.getComposingAnnotations()) && AbstractC9979u.m20289b(cacheRecord.m28060getCompositionMzsxiRA(), visualText2.m27946getCompositionMzsxiRA()) && cacheRecord.getSingleLine() == nonMeasureInputs.getSingleLine() && cacheRecord.getSoftWrap() == nonMeasureInputs.getSoftWrap() && cacheRecord.getLayoutDirection() == measureInputs.getLayoutDirection() && cacheRecord.getDensityValue() == measureInputs.getDensity().getDensity() && cacheRecord.getFontScale() == measureInputs.getDensity().getFontScale() && Constraints.m33447equalsimpl0(cacheRecord.m28061getConstraintsmsEJaDk(), measureInputs.m28064getConstraintsmsEJaDk()) && AbstractC9979u.m20289b(cacheRecord.getFontFamilyResolver(), measureInputs.getFontFamilyResolver()) && !layoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts()) {
            TextStyle textStyle = cacheRecord.getTextStyle();
            boolean zHasSameLayoutAffectingAttributes = textStyle != null ? textStyle.hasSameLayoutAffectingAttributes(nonMeasureInputs.getTextStyle()) : false;
            TextStyle textStyle2 = cacheRecord.getTextStyle();
            boolean zHasSameDrawAffectingAttributes = textStyle2 != null ? textStyle2.hasSameDrawAffectingAttributes(nonMeasureInputs.getTextStyle()) : false;
            if (zHasSameLayoutAffectingAttributes && zHasSameDrawAffectingAttributes) {
                return layoutResult;
            }
            if (zHasSameLayoutAffectingAttributes) {
                return TextLayoutResult.m32934copyO0kMr_c$default(layoutResult, new TextLayoutInput(layoutResult.getLayoutInput().getText(), nonMeasureInputs.getTextStyle(), layoutResult.getLayoutInput().getPlaceholders(), layoutResult.getLayoutInput().getMaxLines(), layoutResult.getLayoutInput().getSoftWrap(), layoutResult.getLayoutInput().m32933getOverflowgIe3tQ8(), layoutResult.getLayoutInput().getDensity(), layoutResult.getLayoutInput().getLayoutDirection(), layoutResult.getLayoutInput().getFontFamilyResolver(), layoutResult.getLayoutInput().m32932getConstraintsmsEJaDk(), (AbstractC9972n) null), 0L, 2, null);
            }
        }
        TextLayoutResult textLayoutResultComputeLayout = computeLayout(visualText2, nonMeasureInputs, measureInputs);
        if (!AbstractC9979u.m20289b(textLayoutResultComputeLayout, layoutResult)) {
            Snapshot current = Snapshot.Companion.getCurrent();
            if (!current.getReadOnly()) {
                CacheRecord cacheRecord2 = this.record;
                synchronized (SnapshotKt.getLock()) {
                    CacheRecord cacheRecord3 = (CacheRecord) SnapshotKt.writableRecord(cacheRecord2, this, current);
                    cacheRecord3.setVisualText(visualText2);
                    cacheRecord3.setComposingAnnotations(visualText2.getComposingAnnotations());
                    cacheRecord3.m28062setCompositionOEnZFl4(visualText2.m27946getCompositionMzsxiRA());
                    cacheRecord3.setSingleLine(nonMeasureInputs.getSingleLine());
                    cacheRecord3.setSoftWrap(nonMeasureInputs.getSoftWrap());
                    cacheRecord3.setTextStyle(nonMeasureInputs.getTextStyle());
                    cacheRecord3.setLayoutDirection(measureInputs.getLayoutDirection());
                    cacheRecord3.setDensityValue(measureInputs.getDensityValue());
                    cacheRecord3.setFontScale(measureInputs.getFontScale());
                    cacheRecord3.m28063setConstraintsBRTryo0(measureInputs.m28064getConstraintsmsEJaDk());
                    cacheRecord3.setFontFamilyResolver(measureInputs.getFontFamilyResolver());
                    cacheRecord3.setLayoutResult(textLayoutResultComputeLayout);
                    C10786q c10786q = C10786q.f26013a;
                }
                SnapshotKt.notifyWrite(current, this);
                return textLayoutResultComputeLayout;
            }
        }
        return textLayoutResultComputeLayout;
    }

    private final TextMeasurer obtainTextMeasurer(MeasureInputs measureInputs) {
        TextMeasurer textMeasurer = this.textMeasurer;
        if (textMeasurer != null) {
            return textMeasurer;
        }
        TextMeasurer textMeasurer2 = new TextMeasurer(measureInputs.getFontFamilyResolver(), measureInputs.getDensity(), measureInputs.getLayoutDirection(), 1);
        this.textMeasurer = textMeasurer2;
        return textMeasurer2;
    }

    private final void setMeasureInputs(MeasureInputs measureInputs) {
        this.measureInputs$delegate.setValue(measureInputs);
    }

    private final void setNonMeasureInputs(NonMeasureInputs nonMeasureInputs) {
        this.nonMeasureInputs$delegate.setValue(nonMeasureInputs);
    }

    private final void updateCacheIfWritable(InterfaceC9540l interfaceC9540l) {
        Snapshot current = Snapshot.Companion.getCurrent();
        if (current.getReadOnly()) {
            return;
        }
        CacheRecord cacheRecord = this.record;
        synchronized (SnapshotKt.getLock()) {
            try {
                interfaceC9540l.invoke(SnapshotKt.writableRecord(cacheRecord, this, current));
                AbstractC9977s.m20286b(1);
            } catch (Throwable th) {
                AbstractC9977s.m20286b(1);
                AbstractC9977s.m20285a(1);
                throw th;
            }
        }
        AbstractC9977s.m20285a(1);
        SnapshotKt.notifyWrite(current, this);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.record;
    }

    /* renamed from: layoutWithNewMeasureInputs--hBUhpc, reason: not valid java name */
    public final TextLayoutResult m28059layoutWithNewMeasureInputshBUhpc(Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j10) {
        MeasureInputs measureInputs = new MeasureInputs(density, layoutDirection, resolver, j10, null);
        setMeasureInputs(measureInputs);
        NonMeasureInputs nonMeasureInputs = getNonMeasureInputs();
        if (nonMeasureInputs != null) {
            return getOrComputeLayout(nonMeasureInputs, measureInputs);
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Called layoutWithNewMeasureInputs before updateNonMeasureInputs");
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        return stateRecord3;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord) {
        AbstractC9979u.m20292e(stateRecord, "null cannot be cast to non-null type androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.CacheRecord");
        this.record = (CacheRecord) stateRecord;
    }

    public final void updateNonMeasureInputs(TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z10, boolean z11, KeyboardOptions keyboardOptions) {
        setNonMeasureInputs(new NonMeasureInputs(transformedTextFieldState, textStyle, z10, z11, KeyboardType.m33185equalsimpl0(keyboardOptions.m27819getKeyboardTypePjHm6EE(), KeyboardType.Companion.m33205getPhonePjHm6EE())));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    public TextLayoutResult getValue() {
        MeasureInputs measureInputs;
        NonMeasureInputs nonMeasureInputs = getNonMeasureInputs();
        if (nonMeasureInputs == null || (measureInputs = getMeasureInputs()) == null) {
            return null;
        }
        return getOrComputeLayout(nonMeasureInputs, measureInputs);
    }
}
