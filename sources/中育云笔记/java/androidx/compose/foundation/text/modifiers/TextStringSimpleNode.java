package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.graphics.Brush;
import androidx.compose.p014ui.graphics.Canvas;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.ColorProducer;
import androidx.compose.p014ui.graphics.Shadow;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawStyle;
import androidx.compose.p014ui.graphics.drawscope.Fill;
import androidx.compose.p014ui.layout.AlignmentLine;
import androidx.compose.p014ui.layout.AlignmentLineKt;
import androidx.compose.p014ui.layout.IntrinsicMeasurable;
import androidx.compose.p014ui.layout.IntrinsicMeasureScope;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.DrawModifierNode;
import androidx.compose.p014ui.node.DrawModifierNodeKt;
import androidx.compose.p014ui.node.LayoutModifierNode;
import androidx.compose.p014ui.node.LayoutModifierNodeKt;
import androidx.compose.p014ui.node.SemanticsModifierNode;
import androidx.compose.p014ui.node.SemanticsModifierNodeKt;
import androidx.compose.p014ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.Paragraph;
import androidx.compose.p014ui.text.TextLayoutResult;
import androidx.compose.p014ui.text.TextStyle;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.style.Hyphens;
import androidx.compose.p014ui.text.style.LineBreak;
import androidx.compose.p014ui.text.style.TextAlign;
import androidx.compose.p014ui.text.style.TextDecoration;
import androidx.compose.p014ui.text.style.TextDirection;
import androidx.compose.p014ui.text.style.TextOverflow;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.TextUnit;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TextStringSimpleNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {
    public static final int $stable = 8;
    private ParagraphLayoutCache _layoutCache;
    private Map<AlignmentLine, Integer> baselineCache;
    private FontFamily.Resolver fontFamilyResolver;
    private int maxLines;
    private int minLines;
    private int overflow;
    private ColorProducer overrideColor;
    private InterfaceC9540l semanticsTextLayoutResult;
    private boolean softWrap;
    private TextStyle style;
    private String text;
    private TextSubstitutionValue textSubstitution;

    public /* synthetic */ TextStringSimpleNode(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i10, boolean z10, int i11, int i12, ColorProducer colorProducer, AbstractC9972n abstractC9972n) {
        this(str, textStyle, resolver, i10, z10, i11, i12, colorProducer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearSubstitution() {
        this.textSubstitution = null;
    }

    private static /* synthetic */ void getBaselineCache$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ParagraphLayoutCache getLayoutCache() {
        if (this._layoutCache == null) {
            this._layoutCache = new ParagraphLayoutCache(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, null);
        }
        ParagraphLayoutCache paragraphLayoutCache = this._layoutCache;
        AbstractC9979u.m20291d(paragraphLayoutCache);
        return paragraphLayoutCache;
    }

    private final ParagraphLayoutCache getLayoutCacheForMeasure(IntrinsicMeasureScope intrinsicMeasureScope) {
        ParagraphLayoutCache layoutCacheOrSubstitute = getLayoutCacheOrSubstitute();
        layoutCacheOrSubstitute.setDensity$foundation_release(intrinsicMeasureScope);
        return layoutCacheOrSubstitute;
    }

    private final ParagraphLayoutCache getLayoutCacheOrSubstitute() {
        ParagraphLayoutCache layoutCache;
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            if (!textSubstitutionValue.isShowingSubstitution()) {
                textSubstitutionValue = null;
            }
            if (textSubstitutionValue != null && (layoutCache = textSubstitutionValue.getLayoutCache()) != null) {
                return layoutCache;
            }
        }
        return getLayoutCache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateForTranslate() {
        SemanticsModifierNodeKt.invalidateSemantics(this);
        LayoutModifierNodeKt.invalidateMeasurement(this);
        DrawModifierNodeKt.invalidateDraw(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean setSubstitution(String str) {
        C10786q c10786q;
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue == null) {
            TextSubstitutionValue textSubstitutionValue2 = new TextSubstitutionValue(this.text, str, false, null, 12, null);
            ParagraphLayoutCache paragraphLayoutCache = new ParagraphLayoutCache(str, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, null);
            paragraphLayoutCache.setDensity$foundation_release(getLayoutCache().getDensity$foundation_release());
            textSubstitutionValue2.setLayoutCache(paragraphLayoutCache);
            this.textSubstitution = textSubstitutionValue2;
            return true;
        }
        if (AbstractC9979u.m20289b(str, textSubstitutionValue.getSubstitution())) {
            return false;
        }
        textSubstitutionValue.setSubstitution(str);
        ParagraphLayoutCache layoutCache = textSubstitutionValue.getLayoutCache();
        if (layoutCache != null) {
            layoutCache.m28200updateL6sJoHM(str, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
            c10786q = C10786q.f26013a;
        } else {
            c10786q = null;
        }
        return c10786q != null;
    }

    @Override // androidx.compose.p014ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        InterfaceC9540l interfaceC9540l = this.semanticsTextLayoutResult;
        if (interfaceC9540l == null) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode.applySemantics.1
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public final Boolean invoke(List<TextLayoutResult> list) {
                    ParagraphLayoutCache layoutCache = TextStringSimpleNode.this.getLayoutCache();
                    TextStyle textStyle = TextStringSimpleNode.this.style;
                    ColorProducer colorProducer = TextStringSimpleNode.this.overrideColor;
                    TextLayoutResult textLayoutResultSlowCreateTextLayoutResultOrNull = layoutCache.slowCreateTextLayoutResultOrNull(textStyle.m33011mergedA7vx0o((16609104 & 1) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : colorProducer != null ? colorProducer.mo28650invoke0d7_KjU() : Color.Companion.m30914getUnspecified0d7_KjU(), (16609104 & 2) != 0 ? TextUnit.Companion.m33706getUnspecifiedXSAIIZE() : 0L, (16609104 & 4) != 0 ? null : null, (16609104 & 8) != 0 ? null : null, (16609104 & 16) != 0 ? null : null, (16609104 & 32) != 0 ? null : null, (16609104 & 64) != 0 ? null : null, (16609104 & 128) != 0 ? TextUnit.Companion.m33706getUnspecifiedXSAIIZE() : 0L, (16609104 & 256) != 0 ? null : null, (16609104 & 512) != 0 ? null : null, (16609104 & 1024) != 0 ? null : null, (16609104 & 2048) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : 0L, (16609104 & 4096) != 0 ? null : null, (16609104 & 8192) != 0 ? null : null, (16609104 & 16384) != 0 ? null : null, (16609104 & 32768) != 0 ? TextAlign.Companion.m33391getUnspecifiede0LSkKk() : 0, (16609104 & 65536) != 0 ? TextDirection.Companion.m33404getUnspecifieds_7Xco() : 0, (16609104 & 131072) != 0 ? TextUnit.Companion.m33706getUnspecifiedXSAIIZE() : 0L, (16609104 & 262144) != 0 ? null : null, (16609104 & 524288) != 0 ? null : null, (16609104 & 1048576) != 0 ? LineBreak.Companion.m33306getUnspecifiedrAG3T2k() : 0, (16609104 & 2097152) != 0 ? Hyphens.Companion.m33285getUnspecifiedvmbZdU8() : 0, (16609104 & 4194304) != 0 ? null : null, (16609104 & 8388608) != 0 ? null : null));
                    if (textLayoutResultSlowCreateTextLayoutResultOrNull != null) {
                        list.add(textLayoutResultSlowCreateTextLayoutResultOrNull);
                    } else {
                        textLayoutResultSlowCreateTextLayoutResultOrNull = null;
                    }
                    return Boolean.valueOf(textLayoutResultSlowCreateTextLayoutResultOrNull != null);
                }
            };
            this.semanticsTextLayoutResult = interfaceC9540l;
        }
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, new AnnotatedString(this.text, null, 2, null));
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            SemanticsPropertiesKt.setShowingTextSubstitution(semanticsPropertyReceiver, textSubstitutionValue.isShowingSubstitution());
            SemanticsPropertiesKt.setTextSubstitution(semanticsPropertyReceiver, new AnnotatedString(textSubstitutionValue.getSubstitution(), null, 2, null));
        }
        SemanticsPropertiesKt.setTextSubstitution$default(semanticsPropertyReceiver, null, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode.applySemantics.2
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(AnnotatedString annotatedString) {
                TextStringSimpleNode.this.setSubstitution(annotatedString.getText());
                TextStringSimpleNode.this.invalidateForTranslate();
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.showTextSubstitution$default(semanticsPropertyReceiver, null, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode.applySemantics.3
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Boolean) obj).booleanValue());
            }

            public final Boolean invoke(boolean z10) {
                if (TextStringSimpleNode.this.textSubstitution == null) {
                    return Boolean.FALSE;
                }
                TextSubstitutionValue textSubstitutionValue2 = TextStringSimpleNode.this.textSubstitution;
                if (textSubstitutionValue2 != null) {
                    textSubstitutionValue2.setShowingSubstitution(z10);
                }
                TextStringSimpleNode.this.invalidateForTranslate();
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.clearTextSubstitution$default(semanticsPropertyReceiver, null, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode.applySemantics.4
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Boolean invoke() {
                TextStringSimpleNode.this.clearSubstitution();
                TextStringSimpleNode.this.invalidateForTranslate();
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, interfaceC9540l, 1, null);
    }

    public final void doInvalidations(boolean z10, boolean z11, boolean z12) {
        if (z11 || z12) {
            getLayoutCache().m28200updateL6sJoHM(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
        }
        if (isAttached()) {
            if (z11 || (z10 && this.semanticsTextLayoutResult != null)) {
                SemanticsModifierNodeKt.invalidateSemantics(this);
            }
            if (z11 || z12) {
                LayoutModifierNodeKt.invalidateMeasurement(this);
                DrawModifierNodeKt.invalidateDraw(this);
            }
            if (z10) {
                DrawModifierNodeKt.invalidateDraw(this);
            }
        }
    }

    @Override // androidx.compose.p014ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        if (isAttached()) {
            ParagraphLayoutCache layoutCacheOrSubstitute = getLayoutCacheOrSubstitute();
            Paragraph paragraph$foundation_release = layoutCacheOrSubstitute.getParagraph$foundation_release();
            if (paragraph$foundation_release == null) {
                InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("no paragraph (layoutCache=" + this._layoutCache + ", textSubstitution=" + this.textSubstitution + ')');
                throw new KotlinNothingValueException();
            }
            Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
            boolean didOverflow$foundation_release = layoutCacheOrSubstitute.getDidOverflow$foundation_release();
            if (didOverflow$foundation_release) {
                float fM28196getLayoutSizeYbymL2g$foundation_release = (int) (layoutCacheOrSubstitute.m28196getLayoutSizeYbymL2g$foundation_release() >> 32);
                float fM28196getLayoutSizeYbymL2g$foundation_release2 = (int) (layoutCacheOrSubstitute.m28196getLayoutSizeYbymL2g$foundation_release() & 4294967295L);
                canvas.save();
                Canvas.m30850clipRectN_I0leg$default(canvas, 0.0f, 0.0f, fM28196getLayoutSizeYbymL2g$foundation_release, fM28196getLayoutSizeYbymL2g$foundation_release2, 0, 16, null);
            }
            try {
                TextDecoration textDecoration = this.style.getTextDecoration();
                if (textDecoration == null) {
                    textDecoration = TextDecoration.Companion.getNone();
                }
                TextDecoration textDecoration2 = textDecoration;
                Shadow shadow = this.style.getShadow();
                if (shadow == null) {
                    shadow = Shadow.Companion.getNone();
                }
                Shadow shadow2 = shadow;
                DrawStyle drawStyle = this.style.getDrawStyle();
                if (drawStyle == null) {
                    drawStyle = Fill.INSTANCE;
                }
                DrawStyle drawStyle2 = drawStyle;
                Brush brush = this.style.getBrush();
                if (brush != null) {
                    Paragraph.m32826painthn5TExg$default(paragraph$foundation_release, canvas, brush, this.style.getAlpha(), shadow2, textDecoration2, drawStyle2, 0, 64, null);
                } else {
                    ColorProducer colorProducer = this.overrideColor;
                    long jMo28650invoke0d7_KjU = colorProducer != null ? colorProducer.mo28650invoke0d7_KjU() : Color.Companion.m30914getUnspecified0d7_KjU();
                    if (jMo28650invoke0d7_KjU == 16) {
                        jMo28650invoke0d7_KjU = this.style.m32996getColor0d7_KjU() != 16 ? this.style.m32996getColor0d7_KjU() : Color.Companion.m30904getBlack0d7_KjU();
                    }
                    Paragraph.m32824paintLG529CI$default(paragraph$foundation_release, canvas, jMo28650invoke0d7_KjU, shadow2, textDecoration2, drawStyle2, 0, 32, null);
                }
                if (didOverflow$foundation_release) {
                    canvas.restore();
                }
            } catch (Throwable th) {
                if (didOverflow$foundation_release) {
                    canvas.restore();
                }
                throw th;
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return getLayoutCacheForMeasure(intrinsicMeasureScope).intrinsicHeight(i10, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return getLayoutCacheForMeasure(intrinsicMeasureScope).maxIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26769measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        ParagraphLayoutCache layoutCacheForMeasure = getLayoutCacheForMeasure(measureScope);
        boolean zM28198layoutWithConstraintsK40F9xA = layoutCacheForMeasure.m28198layoutWithConstraintsK40F9xA(j10, measureScope.getLayoutDirection());
        layoutCacheForMeasure.getObserveFontChanges$foundation_release();
        Paragraph paragraph$foundation_release = layoutCacheForMeasure.getParagraph$foundation_release();
        AbstractC9979u.m20291d(paragraph$foundation_release);
        long jM28196getLayoutSizeYbymL2g$foundation_release = layoutCacheForMeasure.m28196getLayoutSizeYbymL2g$foundation_release();
        if (zM28198layoutWithConstraintsK40F9xA) {
            LayoutModifierNodeKt.invalidateLayer(this);
            Map map = this.baselineCache;
            if (map == null) {
                map = new HashMap(2);
                this.baselineCache = map;
            }
            map.put(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(paragraph$foundation_release.getFirstBaseline())));
            map.put(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(paragraph$foundation_release.getLastBaseline())));
        }
        int i10 = (int) (jM28196getLayoutSizeYbymL2g$foundation_release >> 32);
        int i11 = (int) (jM28196getLayoutSizeYbymL2g$foundation_release & 4294967295L);
        final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(Constraints.Companion.m33463fitPrioritizingWidthZbe2FdA(i10, i10, i11, i11));
        Map<AlignmentLine, Integer> map2 = this.baselineCache;
        AbstractC9979u.m20291d(map2);
        return measureScope.layout(i10, i11, map2, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$measure$1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, placeableMo32229measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        });
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return getLayoutCacheForMeasure(intrinsicMeasureScope).intrinsicHeight(i10, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return getLayoutCacheForMeasure(intrinsicMeasureScope).minIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    public final boolean updateDraw(ColorProducer colorProducer, TextStyle textStyle) {
        boolean zM20289b = AbstractC9979u.m20289b(colorProducer, this.overrideColor);
        this.overrideColor = colorProducer;
        return (zM20289b && textStyle.hasSameDrawAffectingAttributes(this.style)) ? false : true;
    }

    /* renamed from: updateLayoutRelatedArgs-HuAbxIM, reason: not valid java name */
    public final boolean m28207updateLayoutRelatedArgsHuAbxIM(TextStyle textStyle, int i10, int i11, boolean z10, FontFamily.Resolver resolver, int i12) {
        boolean z11 = !this.style.hasSameLayoutAffectingAttributes(textStyle);
        this.style = textStyle;
        if (this.minLines != i10) {
            this.minLines = i10;
            z11 = true;
        }
        if (this.maxLines != i11) {
            this.maxLines = i11;
            z11 = true;
        }
        if (this.softWrap != z10) {
            this.softWrap = z10;
            z11 = true;
        }
        if (!AbstractC9979u.m20289b(this.fontFamilyResolver, resolver)) {
            this.fontFamilyResolver = resolver;
            z11 = true;
        }
        if (TextOverflow.m33427equalsimpl0(this.overflow, i12)) {
            return z11;
        }
        this.overflow = i12;
        return true;
    }

    public final boolean updateText(String str) {
        if (AbstractC9979u.m20289b(this.text, str)) {
            return false;
        }
        this.text = str;
        clearSubstitution();
        return true;
    }

    public /* synthetic */ TextStringSimpleNode(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i10, boolean z10, int i11, int i12, ColorProducer colorProducer, int i13, AbstractC9972n abstractC9972n) {
        this(str, textStyle, resolver, (i13 & 8) != 0 ? TextOverflow.Companion.m33436getClipgIe3tQ8() : i10, (i13 & 16) != 0 ? true : z10, (i13 & 32) != 0 ? Integer.MAX_VALUE : i11, (i13 & 64) != 0 ? 1 : i12, (i13 & 128) != 0 ? null : colorProducer, null);
    }

    private TextStringSimpleNode(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i10, boolean z10, int i11, int i12, ColorProducer colorProducer) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i10;
        this.softWrap = z10;
        this.maxLines = i11;
        this.minLines = i12;
        this.overrideColor = colorProducer;
    }

    @StabilityInferred(parameters = 0)
    public static final class TextSubstitutionValue {
        public static final int $stable = 8;
        private boolean isShowingSubstitution;
        private ParagraphLayoutCache layoutCache;
        private final String original;
        private String substitution;

        public TextSubstitutionValue(String str, String str2, boolean z10, ParagraphLayoutCache paragraphLayoutCache) {
            this.original = str;
            this.substitution = str2;
            this.isShowingSubstitution = z10;
            this.layoutCache = paragraphLayoutCache;
        }

        public static /* synthetic */ TextSubstitutionValue copy$default(TextSubstitutionValue textSubstitutionValue, String str, String str2, boolean z10, ParagraphLayoutCache paragraphLayoutCache, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = textSubstitutionValue.original;
            }
            if ((i10 & 2) != 0) {
                str2 = textSubstitutionValue.substitution;
            }
            if ((i10 & 4) != 0) {
                z10 = textSubstitutionValue.isShowingSubstitution;
            }
            if ((i10 & 8) != 0) {
                paragraphLayoutCache = textSubstitutionValue.layoutCache;
            }
            return textSubstitutionValue.copy(str, str2, z10, paragraphLayoutCache);
        }

        public final String component1() {
            return this.original;
        }

        public final String component2() {
            return this.substitution;
        }

        public final boolean component3() {
            return this.isShowingSubstitution;
        }

        public final ParagraphLayoutCache component4() {
            return this.layoutCache;
        }

        public final TextSubstitutionValue copy(String str, String str2, boolean z10, ParagraphLayoutCache paragraphLayoutCache) {
            return new TextSubstitutionValue(str, str2, z10, paragraphLayoutCache);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextSubstitutionValue)) {
                return false;
            }
            TextSubstitutionValue textSubstitutionValue = (TextSubstitutionValue) obj;
            return AbstractC9979u.m20289b(this.original, textSubstitutionValue.original) && AbstractC9979u.m20289b(this.substitution, textSubstitutionValue.substitution) && this.isShowingSubstitution == textSubstitutionValue.isShowingSubstitution && AbstractC9979u.m20289b(this.layoutCache, textSubstitutionValue.layoutCache);
        }

        public final ParagraphLayoutCache getLayoutCache() {
            return this.layoutCache;
        }

        public final String getOriginal() {
            return this.original;
        }

        public final String getSubstitution() {
            return this.substitution;
        }

        public int hashCode() {
            int iHashCode = ((((this.original.hashCode() * 31) + this.substitution.hashCode()) * 31) + Boolean.hashCode(this.isShowingSubstitution)) * 31;
            ParagraphLayoutCache paragraphLayoutCache = this.layoutCache;
            return iHashCode + (paragraphLayoutCache == null ? 0 : paragraphLayoutCache.hashCode());
        }

        public final boolean isShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        public final void setLayoutCache(ParagraphLayoutCache paragraphLayoutCache) {
            this.layoutCache = paragraphLayoutCache;
        }

        public final void setShowingSubstitution(boolean z10) {
            this.isShowingSubstitution = z10;
        }

        public final void setSubstitution(String str) {
            this.substitution = str;
        }

        public String toString() {
            return "TextSubstitution(layoutCache=" + this.layoutCache + ", isShowingSubstitution=" + this.isShowingSubstitution + ')';
        }

        public /* synthetic */ TextSubstitutionValue(String str, String str2, boolean z10, ParagraphLayoutCache paragraphLayoutCache, int i10, AbstractC9972n abstractC9972n) {
            this(str, str2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : paragraphLayoutCache);
        }
    }
}
