package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.geometry.RectKt;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.Canvas;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorProducer;
import androidx.compose.p013ui.graphics.Shadow;
import androidx.compose.p013ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.graphics.drawscope.DrawStyle;
import androidx.compose.p013ui.graphics.drawscope.Fill;
import androidx.compose.p013ui.layout.AlignmentLine;
import androidx.compose.p013ui.layout.AlignmentLineKt;
import androidx.compose.p013ui.layout.IntrinsicMeasurable;
import androidx.compose.p013ui.layout.IntrinsicMeasureScope;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.DrawModifierNode;
import androidx.compose.p013ui.node.DrawModifierNodeKt;
import androidx.compose.p013ui.node.LayoutModifierNode;
import androidx.compose.p013ui.node.LayoutModifierNodeKt;
import androidx.compose.p013ui.node.SemanticsModifierNode;
import androidx.compose.p013ui.node.SemanticsModifierNodeKt;
import androidx.compose.p013ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.MultiParagraph;
import androidx.compose.p013ui.text.Placeholder;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.p013ui.text.style.TextOverflow;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TextAnnotatedStringNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {
    public static final int $stable = 8;
    private MultiParagraphLayoutCache _layoutCache;
    private TextAutoSize autoSize;
    private Map<AlignmentLine, Integer> baselineCache;
    private FontFamily.Resolver fontFamilyResolver;
    private int maxLines;
    private int minLines;
    private InterfaceC10570l onPlaceholderLayout;
    private InterfaceC10570l onShowTranslation;
    private InterfaceC10570l onTextLayout;
    private int overflow;
    private ColorProducer overrideColor;
    private List<AnnotatedString.Range<Placeholder>> placeholders;
    private SelectionController selectionController;
    private InterfaceC10570l semanticsTextLayoutResult;
    private boolean softWrap;
    private TextStyle style;
    private AnnotatedString text;
    private TextSubstitutionValue textSubstitution;

    public /* synthetic */ TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, InterfaceC10570l interfaceC10570l, int i10, boolean z10, int i11, int i12, List list, InterfaceC10570l interfaceC10570l2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, InterfaceC10570l interfaceC10570l3, AbstractC9126n abstractC9126n) {
        this(annotatedString, textStyle, resolver, interfaceC10570l, i10, z10, i11, i12, list, interfaceC10570l2, selectionController, colorProducer, textAutoSize, interfaceC10570l3);
    }

    private static /* synthetic */ void getBaselineCache$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MultiParagraphLayoutCache getLayoutCache() {
        if (this._layoutCache == null) {
            this._layoutCache = new MultiParagraphLayoutCache(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.autoSize, null);
        }
        MultiParagraphLayoutCache multiParagraphLayoutCache = this._layoutCache;
        AbstractC9133u.m16130d(multiParagraphLayoutCache);
        return multiParagraphLayoutCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateForTranslate() {
        SemanticsModifierNodeKt.invalidateSemantics(this);
        LayoutModifierNodeKt.invalidateMeasurement(this);
        DrawModifierNodeKt.invalidateDraw(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean setSubstitution(AnnotatedString annotatedString) {
        C8736p c8736p;
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue == null) {
            TextSubstitutionValue textSubstitutionValue2 = new TextSubstitutionValue(this.text, annotatedString, false, null, 12, null);
            MultiParagraphLayoutCache multiParagraphLayoutCache = new MultiParagraphLayoutCache(annotatedString, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, AbstractC8809v.m14771n(), this.autoSize, null);
            multiParagraphLayoutCache.setDensity$foundation_release(getLayoutCache().getDensity$foundation_release());
            textSubstitutionValue2.setLayoutCache(multiParagraphLayoutCache);
            this.textSubstitution = textSubstitutionValue2;
            return true;
        }
        if (AbstractC9133u.m16128b(annotatedString, textSubstitutionValue.getSubstitution())) {
            return false;
        }
        textSubstitutionValue.setSubstitution(annotatedString);
        MultiParagraphLayoutCache layoutCache = textSubstitutionValue.getLayoutCache();
        if (layoutCache != null) {
            layoutCache.m21587updateJ2qo7bo(annotatedString, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, AbstractC8809v.m14771n(), this.autoSize);
            c8736p = C8736p.f16368a;
        } else {
            c8736p = null;
        }
        return c8736p != null;
    }

    @Override // androidx.compose.p013ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        InterfaceC10570l interfaceC10570l = this.semanticsTextLayoutResult;
        if (interfaceC10570l == null) {
            interfaceC10570l = new InterfaceC10570l() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.applySemantics.1
                {
                    super(1);
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x00b7  */
                @Override // p300x7.InterfaceC10570l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Boolean invoke(java.util.List<androidx.compose.p013ui.text.TextLayoutResult> r38) {
                    /*
                        r37 = this;
                        r0 = r37
                        androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode r1 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this
                        androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache r1 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.access$getLayoutCache(r1)
                        androidx.compose.ui.text.TextLayoutResult r2 = r1.getLayoutOrNull()
                        if (r2 == 0) goto Lb7
                        androidx.compose.ui.text.TextLayoutInput r3 = new androidx.compose.ui.text.TextLayoutInput
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        androidx.compose.ui.text.AnnotatedString r4 = r1.getText()
                        androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode r1 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this
                        androidx.compose.ui.text.TextStyle r5 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.access$getStyle$p(r1)
                        androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode r1 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this
                        androidx.compose.ui.graphics.ColorProducer r1 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.access$getOverrideColor$p(r1)
                        if (r1 == 0) goto L2b
                        long r6 = r1.mo22048invoke0d7_KjU()
                        goto L31
                    L2b:
                        androidx.compose.ui.graphics.Color$Companion r1 = androidx.compose.p013ui.graphics.Color.Companion
                        long r6 = r1.m24312getUnspecified0d7_KjU()
                    L31:
                        r35 = 16777214(0xfffffe, float:2.3509884E-38)
                        r36 = 0
                        r8 = 0
                        r10 = 0
                        r11 = 0
                        r12 = 0
                        r13 = 0
                        r14 = 0
                        r15 = 0
                        r17 = 0
                        r18 = 0
                        r19 = 0
                        r20 = 0
                        r22 = 0
                        r23 = 0
                        r24 = 0
                        r25 = 0
                        r26 = 0
                        r27 = 0
                        r29 = 0
                        r30 = 0
                        r31 = 0
                        r32 = 0
                        r33 = 0
                        r34 = 0
                        androidx.compose.ui.text.TextStyle r5 = androidx.compose.p013ui.text.TextStyle.m26384mergedA7vx0o$default(r5, r6, r8, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36)
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        java.util.List r6 = r1.getPlaceholders()
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        int r7 = r1.getMaxLines()
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        boolean r8 = r1.getSoftWrap()
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        int r9 = r1.m26331getOverflowgIe3tQ8()
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        androidx.compose.ui.unit.Density r10 = r1.getDensity()
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        androidx.compose.ui.unit.LayoutDirection r11 = r1.getLayoutDirection()
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        androidx.compose.ui.text.font.FontFamily$Resolver r12 = r1.getFontFamilyResolver()
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        long r13 = r1.m26330getConstraintsmsEJaDk()
                        r15 = 0
                        r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15)
                        r6 = 2
                        r7 = 0
                        r4 = 0
                        androidx.compose.ui.text.TextLayoutResult r1 = androidx.compose.p013ui.text.TextLayoutResult.m26332copyO0kMr_c$default(r2, r3, r4, r6, r7)
                        if (r1 == 0) goto Lb7
                        r2 = r38
                        r2.add(r1)
                        goto Lb8
                    Lb7:
                        r1 = 0
                    Lb8:
                        if (r1 == 0) goto Lbc
                        r1 = 1
                        goto Lbd
                    Lbc:
                        r1 = 0
                    Lbd:
                        java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.C19091.invoke(java.util.List):java.lang.Boolean");
                }
            };
            this.semanticsTextLayoutResult = interfaceC10570l;
        }
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, this.text);
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            SemanticsPropertiesKt.setTextSubstitution(semanticsPropertyReceiver, textSubstitutionValue.getSubstitution());
            SemanticsPropertiesKt.setShowingTextSubstitution(semanticsPropertyReceiver, textSubstitutionValue.isShowingSubstitution());
        }
        SemanticsPropertiesKt.setTextSubstitution$default(semanticsPropertyReceiver, null, new InterfaceC10570l() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.applySemantics.2
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final Boolean invoke(AnnotatedString annotatedString) {
                TextAnnotatedStringNode.this.setSubstitution(annotatedString);
                TextAnnotatedStringNode.this.invalidateForTranslate();
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.showTextSubstitution$default(semanticsPropertyReceiver, null, new InterfaceC10570l() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.applySemantics.3
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Boolean) obj).booleanValue());
            }

            public final Boolean invoke(boolean z10) {
                if (TextAnnotatedStringNode.this.getTextSubstitution$foundation_release() == null) {
                    return Boolean.FALSE;
                }
                InterfaceC10570l interfaceC10570l2 = TextAnnotatedStringNode.this.onShowTranslation;
                if (interfaceC10570l2 != null) {
                    TextSubstitutionValue textSubstitution$foundation_release = TextAnnotatedStringNode.this.getTextSubstitution$foundation_release();
                    AbstractC9133u.m16130d(textSubstitution$foundation_release);
                    interfaceC10570l2.invoke(textSubstitution$foundation_release);
                }
                TextSubstitutionValue textSubstitution$foundation_release2 = TextAnnotatedStringNode.this.getTextSubstitution$foundation_release();
                if (textSubstitution$foundation_release2 != null) {
                    textSubstitution$foundation_release2.setShowingSubstitution(z10);
                }
                TextAnnotatedStringNode.this.invalidateForTranslate();
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.clearTextSubstitution$default(semanticsPropertyReceiver, null, new InterfaceC10559a() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.applySemantics.4
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Boolean invoke() {
                TextAnnotatedStringNode.this.clearSubstitution$foundation_release();
                TextAnnotatedStringNode.this.invalidateForTranslate();
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, interfaceC10570l, 1, null);
    }

    public final void clearSubstitution$foundation_release() {
        this.textSubstitution = null;
    }

    public final void doInvalidations(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (z11 || z12 || z13) {
            getLayoutCache().m21587updateJ2qo7bo(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.autoSize);
        }
        if (isAttached()) {
            if (z11 || (z10 && this.semanticsTextLayoutResult != null)) {
                SemanticsModifierNodeKt.invalidateSemantics(this);
            }
            if (z11 || z12 || z13) {
                LayoutModifierNodeKt.invalidateMeasurement(this);
                DrawModifierNodeKt.invalidateDraw(this);
            }
            if (z10) {
                DrawModifierNodeKt.invalidateDraw(this);
            }
        }
    }

    @Override // androidx.compose.p013ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        if (isAttached()) {
            SelectionController selectionController = this.selectionController;
            if (selectionController != null) {
                selectionController.draw(contentDrawScope);
            }
            Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
            TextLayoutResult textLayoutResult = getLayoutCache(contentDrawScope).getTextLayoutResult();
            MultiParagraph multiParagraph = textLayoutResult.getMultiParagraph();
            boolean z10 = true;
            boolean z11 = textLayoutResult.getHasVisualOverflow() && !TextOverflow.m26825equalsimpl0(this.overflow, TextOverflow.Companion.m26838getVisiblegIe3tQ8());
            if (z11) {
                Rect rectM24075Recttz77jQw = RectKt.m24075Recttz77jQw(Offset.Companion.m24051getZeroF1C5BW0(), Size.m24095constructorimpl((Float.floatToRawIntBits((int) (textLayoutResult.m26335getSizeYbymL2g() >> 32)) << 32) | (Float.floatToRawIntBits((int) (textLayoutResult.m26335getSizeYbymL2g() & 4294967295L)) & 4294967295L)));
                canvas.save();
                Canvas.m24249clipRectmtrdDE$default(canvas, rectM24075Recttz77jQw, 0, 2, null);
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
                    MultiParagraph.m26213painthn5TExg$default(multiParagraph, canvas, brush, this.style.getAlpha(), shadow2, textDecoration2, drawStyle2, 0, 64, null);
                } else {
                    ColorProducer colorProducer = this.overrideColor;
                    long jMo22048invoke0d7_KjU = colorProducer != null ? colorProducer.mo22048invoke0d7_KjU() : Color.Companion.m24312getUnspecified0d7_KjU();
                    if (jMo22048invoke0d7_KjU == 16) {
                        jMo22048invoke0d7_KjU = this.style.m26394getColor0d7_KjU() != 16 ? this.style.m26394getColor0d7_KjU() : Color.Companion.m24302getBlack0d7_KjU();
                    }
                    multiParagraph.m26218paintLG529CI(canvas, (32 & 2) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : jMo22048invoke0d7_KjU, (32 & 4) != 0 ? null : shadow2, (32 & 8) != 0 ? null : textDecoration2, (32 & 16) == 0 ? drawStyle2 : null, (32 & 32) != 0 ? DrawScope.Companion.m24829getDefaultBlendMode0nO6VwU() : 0);
                }
                if (z11) {
                    canvas.restore();
                }
                TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
                if (!((textSubstitutionValue == null || !textSubstitutionValue.isShowingSubstitution()) ? TextAnnotatedStringNodeKt.hasLinks(this.text) : false)) {
                    List<AnnotatedString.Range<Placeholder>> list = this.placeholders;
                    if (list != null && !list.isEmpty()) {
                        z10 = false;
                    }
                    if (z10) {
                        return;
                    }
                }
                contentDrawScope.drawContent();
            } catch (Throwable th) {
                if (z11) {
                    canvas.restore();
                }
                throw th;
            }
        }
    }

    public final void drawNonExtension(ContentDrawScope contentDrawScope) {
        draw(contentDrawScope);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final TextSubstitutionValue getTextSubstitution$foundation_release() {
        return this.textSubstitution;
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return getLayoutCache(intrinsicMeasureScope).intrinsicHeight(i10, intrinsicMeasureScope.getLayoutDirection());
    }

    public final int maxIntrinsicHeightNonExtension(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return maxIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return getLayoutCache(intrinsicMeasureScope).maxIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    public final int maxIntrinsicWidthNonExtension(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return maxIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20167measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        MultiParagraphLayoutCache layoutCache = getLayoutCache(measureScope);
        boolean zM21586layoutWithConstraintsK40F9xA = layoutCache.m21586layoutWithConstraintsK40F9xA(j10, measureScope.getLayoutDirection());
        TextLayoutResult textLayoutResult = layoutCache.getTextLayoutResult();
        textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts();
        if (zM21586layoutWithConstraintsK40F9xA) {
            LayoutModifierNodeKt.invalidateLayer(this);
            InterfaceC10570l interfaceC10570l = this.onTextLayout;
            if (interfaceC10570l != null) {
                interfaceC10570l.invoke(textLayoutResult);
            }
            SelectionController selectionController = this.selectionController;
            if (selectionController != null) {
                selectionController.updateTextLayout(textLayoutResult);
            }
            Map<AlignmentLine, Integer> linkedHashMap = this.baselineCache;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>(2);
            }
            linkedHashMap.put(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(textLayoutResult.getFirstBaseline())));
            linkedHashMap.put(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(textLayoutResult.getLastBaseline())));
            this.baselineCache = linkedHashMap;
        }
        InterfaceC10570l interfaceC10570l2 = this.onPlaceholderLayout;
        if (interfaceC10570l2 != null) {
            interfaceC10570l2.invoke(textLayoutResult.getPlaceholderRects());
        }
        final Placeable placeableMo25627measureBRTryo0 = measurable.mo25627measureBRTryo0(Constraints.Companion.m26861fitPrioritizingWidthZbe2FdA((int) (textLayoutResult.m26335getSizeYbymL2g() >> 32), (int) (textLayoutResult.m26335getSizeYbymL2g() >> 32), (int) (textLayoutResult.m26335getSizeYbymL2g() & 4294967295L), (int) (textLayoutResult.m26335getSizeYbymL2g() & 4294967295L)));
        int iM26335getSizeYbymL2g = (int) (textLayoutResult.m26335getSizeYbymL2g() >> 32);
        int iM26335getSizeYbymL2g2 = (int) (textLayoutResult.m26335getSizeYbymL2g() & 4294967295L);
        Map<AlignmentLine, Integer> map = this.baselineCache;
        AbstractC9133u.m16130d(map);
        return measureScope.layout(iM26335getSizeYbymL2g, iM26335getSizeYbymL2g2, map, new InterfaceC10570l() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$measure$1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, placeableMo25627measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        });
    }

    /* renamed from: measureNonExtension-3p2s80s, reason: not valid java name */
    public final MeasureResult m21603measureNonExtension3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        return mo20167measure3p2s80s(measureScope, measurable, j10);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return getLayoutCache(intrinsicMeasureScope).intrinsicHeight(i10, intrinsicMeasureScope.getLayoutDirection());
    }

    public final int minIntrinsicHeightNonExtension(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return minIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return getLayoutCache(intrinsicMeasureScope).minIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    public final int minIntrinsicWidthNonExtension(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return minIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    public final void setTextSubstitution$foundation_release(TextSubstitutionValue textSubstitutionValue) {
        this.textSubstitution = textSubstitutionValue;
    }

    public final boolean updateCallbacks(InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, SelectionController selectionController, InterfaceC10570l interfaceC10570l3) {
        boolean z10;
        if (this.onTextLayout != interfaceC10570l) {
            this.onTextLayout = interfaceC10570l;
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.onPlaceholderLayout != interfaceC10570l2) {
            this.onPlaceholderLayout = interfaceC10570l2;
            z10 = true;
        }
        if (!AbstractC9133u.m16128b(this.selectionController, selectionController)) {
            this.selectionController = selectionController;
            z10 = true;
        }
        if (this.onShowTranslation == interfaceC10570l3) {
            return z10;
        }
        this.onShowTranslation = interfaceC10570l3;
        return true;
    }

    public final boolean updateDraw(ColorProducer colorProducer, TextStyle textStyle) {
        boolean zM16128b = AbstractC9133u.m16128b(colorProducer, this.overrideColor);
        this.overrideColor = colorProducer;
        return (zM16128b && textStyle.hasSameDrawAffectingAttributes(this.style)) ? false : true;
    }

    /* renamed from: updateLayoutRelatedArgs-y0k-MQk, reason: not valid java name */
    public final boolean m21604updateLayoutRelatedArgsy0kMQk(TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i10, int i11, boolean z10, FontFamily.Resolver resolver, int i12, TextAutoSize textAutoSize) {
        boolean z11 = !this.style.hasSameLayoutAffectingAttributes(textStyle);
        this.style = textStyle;
        if (!AbstractC9133u.m16128b(this.placeholders, list)) {
            this.placeholders = list;
            z11 = true;
        }
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
        if (!AbstractC9133u.m16128b(this.fontFamilyResolver, resolver)) {
            this.fontFamilyResolver = resolver;
            z11 = true;
        }
        if (!TextOverflow.m26825equalsimpl0(this.overflow, i12)) {
            this.overflow = i12;
            z11 = true;
        }
        if (AbstractC9133u.m16128b(this.autoSize, textAutoSize)) {
            return z11;
        }
        this.autoSize = textAutoSize;
        return true;
    }

    public final boolean updateText$foundation_release(AnnotatedString annotatedString) {
        boolean zM16128b = AbstractC9133u.m16128b(this.text.getText(), annotatedString.getText());
        boolean z10 = (zM16128b && this.text.hasEqualAnnotations(annotatedString)) ? false : true;
        if (z10) {
            this.text = annotatedString;
        }
        if (!zM16128b) {
            clearSubstitution$foundation_release();
        }
        return z10;
    }

    public /* synthetic */ TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, InterfaceC10570l interfaceC10570l, int i10, boolean z10, int i11, int i12, List list, InterfaceC10570l interfaceC10570l2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, InterfaceC10570l interfaceC10570l3, int i13, AbstractC9126n abstractC9126n) {
        this(annotatedString, textStyle, resolver, (i13 & 8) != 0 ? null : interfaceC10570l, (i13 & 16) != 0 ? TextOverflow.Companion.m26834getClipgIe3tQ8() : i10, (i13 & 32) != 0 ? true : z10, (i13 & 64) != 0 ? Integer.MAX_VALUE : i11, (i13 & 128) != 0 ? 1 : i12, (i13 & 256) != 0 ? null : list, (i13 & 512) != 0 ? null : interfaceC10570l2, (i13 & 1024) != 0 ? null : selectionController, (i13 & 2048) != 0 ? null : colorProducer, (i13 & 4096) != 0 ? null : textAutoSize, (i13 & 8192) != 0 ? null : interfaceC10570l3, null);
    }

    private TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, InterfaceC10570l interfaceC10570l, int i10, boolean z10, int i11, int i12, List<AnnotatedString.Range<Placeholder>> list, InterfaceC10570l interfaceC10570l2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, InterfaceC10570l interfaceC10570l3) {
        this.text = annotatedString;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.onTextLayout = interfaceC10570l;
        this.overflow = i10;
        this.softWrap = z10;
        this.maxLines = i11;
        this.minLines = i12;
        this.placeholders = list;
        this.onPlaceholderLayout = interfaceC10570l2;
        this.selectionController = selectionController;
        this.overrideColor = colorProducer;
        this.autoSize = textAutoSize;
        this.onShowTranslation = interfaceC10570l3;
    }

    @StabilityInferred(parameters = 0)
    public static final class TextSubstitutionValue {
        public static final int $stable = 8;
        private boolean isShowingSubstitution;
        private MultiParagraphLayoutCache layoutCache;
        private final AnnotatedString original;
        private AnnotatedString substitution;

        public TextSubstitutionValue(AnnotatedString annotatedString, AnnotatedString annotatedString2, boolean z10, MultiParagraphLayoutCache multiParagraphLayoutCache) {
            this.original = annotatedString;
            this.substitution = annotatedString2;
            this.isShowingSubstitution = z10;
            this.layoutCache = multiParagraphLayoutCache;
        }

        public static /* synthetic */ TextSubstitutionValue copy$default(TextSubstitutionValue textSubstitutionValue, AnnotatedString annotatedString, AnnotatedString annotatedString2, boolean z10, MultiParagraphLayoutCache multiParagraphLayoutCache, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                annotatedString = textSubstitutionValue.original;
            }
            if ((i10 & 2) != 0) {
                annotatedString2 = textSubstitutionValue.substitution;
            }
            if ((i10 & 4) != 0) {
                z10 = textSubstitutionValue.isShowingSubstitution;
            }
            if ((i10 & 8) != 0) {
                multiParagraphLayoutCache = textSubstitutionValue.layoutCache;
            }
            return textSubstitutionValue.copy(annotatedString, annotatedString2, z10, multiParagraphLayoutCache);
        }

        public final AnnotatedString component1() {
            return this.original;
        }

        public final AnnotatedString component2() {
            return this.substitution;
        }

        public final boolean component3() {
            return this.isShowingSubstitution;
        }

        public final MultiParagraphLayoutCache component4() {
            return this.layoutCache;
        }

        public final TextSubstitutionValue copy(AnnotatedString annotatedString, AnnotatedString annotatedString2, boolean z10, MultiParagraphLayoutCache multiParagraphLayoutCache) {
            return new TextSubstitutionValue(annotatedString, annotatedString2, z10, multiParagraphLayoutCache);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextSubstitutionValue)) {
                return false;
            }
            TextSubstitutionValue textSubstitutionValue = (TextSubstitutionValue) obj;
            return AbstractC9133u.m16128b(this.original, textSubstitutionValue.original) && AbstractC9133u.m16128b(this.substitution, textSubstitutionValue.substitution) && this.isShowingSubstitution == textSubstitutionValue.isShowingSubstitution && AbstractC9133u.m16128b(this.layoutCache, textSubstitutionValue.layoutCache);
        }

        public final MultiParagraphLayoutCache getLayoutCache() {
            return this.layoutCache;
        }

        public final AnnotatedString getOriginal() {
            return this.original;
        }

        public final AnnotatedString getSubstitution() {
            return this.substitution;
        }

        public int hashCode() {
            int iHashCode = ((((this.original.hashCode() * 31) + this.substitution.hashCode()) * 31) + Boolean.hashCode(this.isShowingSubstitution)) * 31;
            MultiParagraphLayoutCache multiParagraphLayoutCache = this.layoutCache;
            return iHashCode + (multiParagraphLayoutCache == null ? 0 : multiParagraphLayoutCache.hashCode());
        }

        public final boolean isShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        public final void setLayoutCache(MultiParagraphLayoutCache multiParagraphLayoutCache) {
            this.layoutCache = multiParagraphLayoutCache;
        }

        public final void setShowingSubstitution(boolean z10) {
            this.isShowingSubstitution = z10;
        }

        public final void setSubstitution(AnnotatedString annotatedString) {
            this.substitution = annotatedString;
        }

        public String toString() {
            return "TextSubstitutionValue(original=" + ((Object) this.original) + ", substitution=" + ((Object) this.substitution) + ", isShowingSubstitution=" + this.isShowingSubstitution + ", layoutCache=" + this.layoutCache + ')';
        }

        public /* synthetic */ TextSubstitutionValue(AnnotatedString annotatedString, AnnotatedString annotatedString2, boolean z10, MultiParagraphLayoutCache multiParagraphLayoutCache, int i10, AbstractC9126n abstractC9126n) {
            this(annotatedString, annotatedString2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : multiParagraphLayoutCache);
        }
    }

    private final MultiParagraphLayoutCache getLayoutCache(Density density) {
        MultiParagraphLayoutCache layoutCache;
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null && textSubstitutionValue.isShowingSubstitution() && (layoutCache = textSubstitutionValue.getLayoutCache()) != null) {
            layoutCache.setDensity$foundation_release(density);
            return layoutCache;
        }
        MultiParagraphLayoutCache layoutCache2 = getLayoutCache();
        layoutCache2.setDensity$foundation_release(density);
        return layoutCache2;
    }
}
