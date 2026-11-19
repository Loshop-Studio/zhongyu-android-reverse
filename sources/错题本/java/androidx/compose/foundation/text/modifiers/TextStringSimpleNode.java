package androidx.compose.foundation.text.modifiers;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorProducer;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawStyle;
import androidx.compose.p011ui.graphics.drawscope.Fill;
import androidx.compose.p011ui.layout.AlignmentLine;
import androidx.compose.p011ui.layout.AlignmentLineKt;
import androidx.compose.p011ui.layout.IntrinsicMeasurable;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.DrawModifierNode;
import androidx.compose.p011ui.node.DrawModifierNodeKt;
import androidx.compose.p011ui.node.LayoutModifierNode;
import androidx.compose.p011ui.node.LayoutModifierNodeKt;
import androidx.compose.p011ui.node.SemanticsModifierNode;
import androidx.compose.p011ui.node.SemanticsModifierNodeKt;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.Paragraph;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.style.Hyphens;
import androidx.compose.p011ui.text.style.LineBreak;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextDirection;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001`BS\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010\"J\u001f\u0010%\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b'\u0010\u001fJ@\u0010*\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b(\u0010)J%\u0010.\u001a\u00020 2\u0006\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\r¢\u0006\u0004\b.\u0010/J\u0013\u00101\u001a\u00020 *\u000200H\u0016¢\u0006\u0004\b1\u00102J&\u0010;\u001a\u000208*\u0002032\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0016ø\u0001\u0000¢\u0006\u0004\b9\u0010:J#\u0010>\u001a\u00020\u000f*\u00020\u00162\u0006\u00105\u001a\u00020<2\u0006\u0010=\u001a\u00020\u000fH\u0016¢\u0006\u0004\b>\u0010?J#\u0010A\u001a\u00020\u000f*\u00020\u00162\u0006\u00105\u001a\u00020<2\u0006\u0010@\u001a\u00020\u000fH\u0016¢\u0006\u0004\bA\u0010?J#\u0010B\u001a\u00020\u000f*\u00020\u00162\u0006\u00105\u001a\u00020<2\u0006\u0010=\u001a\u00020\u000fH\u0016¢\u0006\u0004\bB\u0010?J#\u0010C\u001a\u00020\u000f*\u00020\u00162\u0006\u00105\u001a\u00020<2\u0006\u0010@\u001a\u00020\u000fH\u0016¢\u0006\u0004\bC\u0010?J\u0013\u0010E\u001a\u00020 *\u00020DH\u0016¢\u0006\u0004\bE\u0010FR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010GR\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010HR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010IR\u001c\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\f\u0010JR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010KR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010JR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010JR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010LR*\u0010O\u001a\u0010\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\u000f\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bO\u0010P\u0012\u0004\bQ\u0010\"R\u0018\u0010R\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR*\u0010W\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020V0U\u0012\u0004\u0012\u00020\r\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Z\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\\\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001bR\u0014\u0010_\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006a"}, m5110d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Landroidx/compose/ui/graphics/ColorProducer;", "overrideColor", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/internal/e;)V", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "getLayoutCacheForMeasure", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;)Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "getLayoutCacheOrSubstitute", "()Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "getLayoutCache", "updatedText", "setSubstitution", "(Ljava/lang/String;)Z", "Ld6/s;", "clearSubstitution", "()V", "invalidateForTranslate", TypedValues.Custom.S_COLOR, "updateDraw", "(Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/ui/text/TextStyle;)Z", "updateText", "updateLayoutRelatedArgs-HuAbxIM", "(Landroidx/compose/ui/text/TextStyle;IIZLandroidx/compose/ui/text/font/FontFamily$Resolver;I)Z", "updateLayoutRelatedArgs", "drawChanged", "textChanged", "layoutChanged", "doInvalidations", "(ZZZ)V", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Ljava/lang/String;", "Landroidx/compose/ui/text/TextStyle;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "I", "Z", "Landroidx/compose/ui/graphics/ColorProducer;", "", "Landroidx/compose/ui/layout/AlignmentLine;", "baselineCache", "Ljava/util/Map;", "getBaselineCache$annotations", "_layoutCache", "Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/TextLayoutResult;", "semanticsTextLayoutResult", "Lr6/c;", "Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;", "textSubstitution", "Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;", "layoutCache", "getShouldAutoInvalidate", "()Z", "shouldAutoInvalidate", "TextSubstitutionValue", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextStringSimpleNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextStringSimpleNode.kt\nandroidx/compose/foundation/text/modifiers/TextStringSimpleNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 7 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 8 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,473:1\n1#2:474\n26#3:475\n26#3:476\n54#4:477\n54#4:479\n59#4:481\n59#4:483\n54#4:485\n59#4:487\n54#4:497\n59#4:499\n85#5:478\n85#5:480\n90#5:482\n90#5:484\n85#5:486\n90#5:488\n85#5:498\n90#5:500\n107#6,7:489\n233#7:496\n635#8:501\n635#8:502\n*S KotlinDebug\n*F\n+ 1 TextStringSimpleNode.kt\nandroidx/compose/foundation/text/modifiers/TextStringSimpleNode\n*L\n369#1:475\n370#1:476\n377#1:477\n378#1:479\n379#1:481\n380#1:483\n384#1:485\n384#1:487\n427#1:497\n428#1:499\n377#1:478\n378#1:480\n379#1:482\n380#1:484\n384#1:486\n384#1:488\n427#1:498\n428#1:500\n420#1:489,7\n424#1:496\n450#1:501\n452#1:502\n*E\n"})
/* loaded from: classes.dex */
public final class TextStringSimpleNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {
    public static final int $stable = 8;

    @Nullable
    private ParagraphLayoutCache _layoutCache;

    @Nullable
    private Map<AlignmentLine, Integer> baselineCache;

    @NotNull
    private FontFamily.Resolver fontFamilyResolver;
    private int maxLines;
    private int minLines;
    private int overflow;

    @Nullable
    private ColorProducer overrideColor;

    @Nullable
    private InterfaceC6471c semanticsTextLayoutResult;
    private boolean softWrap;

    @NotNull
    private TextStyle style;

    @NotNull
    private String text;

    @Nullable
    private TextSubstitutionValue textSubstitution;

    public /* synthetic */ TextStringSimpleNode(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z8, int i8, int i9, ColorProducer colorProducer, AbstractC5824e abstractC5824e) {
        this(str, textStyle, resolver, i, z8, i8, i9, colorProducer);
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
        AbstractC5830k.m5327d(paragraphLayoutCache);
        return paragraphLayoutCache;
    }

    private final ParagraphLayoutCache getLayoutCacheForMeasure(IntrinsicMeasureScope intrinsicMeasureScope) {
        ParagraphLayoutCache layoutCacheOrSubstitute = getLayoutCacheOrSubstitute();
        layoutCacheOrSubstitute.setDensity$foundation_release(intrinsicMeasureScope);
        return layoutCacheOrSubstitute;
    }

    @JvmName(name = "getLayoutCacheOrSubstitute")
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
    public final boolean setSubstitution(String updatedText) {
        C5443s c5443s;
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue == null) {
            TextSubstitutionValue textSubstitutionValue2 = new TextSubstitutionValue(this.text, updatedText, false, null, 12, null);
            ParagraphLayoutCache paragraphLayoutCache = new ParagraphLayoutCache(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, null);
            paragraphLayoutCache.setDensity$foundation_release(getLayoutCache().getDensity());
            textSubstitutionValue2.setLayoutCache(paragraphLayoutCache);
            this.textSubstitution = textSubstitutionValue2;
            return true;
        }
        if (AbstractC5830k.m5325b(updatedText, textSubstitutionValue.getSubstitution())) {
            return false;
        }
        textSubstitutionValue.setSubstitution(updatedText);
        ParagraphLayoutCache layoutCache = textSubstitutionValue.getLayoutCache();
        if (layoutCache != null) {
            layoutCache.m8004updateL6sJoHM(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
            c5443s = C5443s.f8405a;
        } else {
            c5443s = null;
        }
        return c5443s != null;
    }

    @Override // androidx.compose.p011ui.node.SemanticsModifierNode
    public void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        InterfaceC6471c interfaceC6471c = this.semanticsTextLayoutResult;
        if (interfaceC6471c == null) {
            interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode.applySemantics.1
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public final Boolean invoke(List<TextLayoutResult> list) {
                    ParagraphLayoutCache layoutCache = TextStringSimpleNode.this.getLayoutCache();
                    TextStyle textStyle = TextStringSimpleNode.this.style;
                    ColorProducer colorProducer = TextStringSimpleNode.this.overrideColor;
                    TextLayoutResult textLayoutResultSlowCreateTextLayoutResultOrNull = layoutCache.slowCreateTextLayoutResultOrNull(textStyle.m12815mergedA7vx0o((16609104 & 1) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : colorProducer != null ? colorProducer.mo8454invoke0d7_KjU() : Color.INSTANCE.m10718getUnspecified0d7_KjU(), (16609104 & 2) != 0 ? TextUnit.INSTANCE.m13510getUnspecifiedXSAIIZE() : 0L, (16609104 & 4) != 0 ? null : null, (16609104 & 8) != 0 ? null : null, (16609104 & 16) != 0 ? null : null, (16609104 & 32) != 0 ? null : null, (16609104 & 64) != 0 ? null : null, (16609104 & 128) != 0 ? TextUnit.INSTANCE.m13510getUnspecifiedXSAIIZE() : 0L, (16609104 & 256) != 0 ? null : null, (16609104 & 512) != 0 ? null : null, (16609104 & 1024) != 0 ? null : null, (16609104 & 2048) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : 0L, (16609104 & 4096) != 0 ? null : null, (16609104 & 8192) != 0 ? null : null, (16609104 & 16384) != 0 ? null : null, (16609104 & 32768) != 0 ? TextAlign.INSTANCE.m13195getUnspecifiede0LSkKk() : 0, (16609104 & 65536) != 0 ? TextDirection.INSTANCE.m13208getUnspecifieds_7Xco() : 0, (16609104 & 131072) != 0 ? TextUnit.INSTANCE.m13510getUnspecifiedXSAIIZE() : 0L, (16609104 & 262144) != 0 ? null : null, (16609104 & 524288) != 0 ? null : null, (16609104 & 1048576) != 0 ? LineBreak.INSTANCE.m13110getUnspecifiedrAG3T2k() : 0, (16609104 & 2097152) != 0 ? Hyphens.INSTANCE.m13089getUnspecifiedvmbZdU8() : 0, (16609104 & 4194304) != 0 ? null : null, (16609104 & 8388608) != 0 ? null : null));
                    if (textLayoutResultSlowCreateTextLayoutResultOrNull != null) {
                        list.add(textLayoutResultSlowCreateTextLayoutResultOrNull);
                    } else {
                        textLayoutResultSlowCreateTextLayoutResultOrNull = null;
                    }
                    return Boolean.valueOf(textLayoutResultSlowCreateTextLayoutResultOrNull != null);
                }
            };
            this.semanticsTextLayoutResult = interfaceC6471c;
        }
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, new AnnotatedString(this.text, null, 2, null));
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            SemanticsPropertiesKt.setShowingTextSubstitution(semanticsPropertyReceiver, textSubstitutionValue.isShowingSubstitution());
            SemanticsPropertiesKt.setTextSubstitution(semanticsPropertyReceiver, new AnnotatedString(textSubstitutionValue.getSubstitution(), null, 2, null));
        }
        SemanticsPropertiesKt.setTextSubstitution$default(semanticsPropertyReceiver, null, new InterfaceC6471c() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode.applySemantics.2
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public final Boolean invoke(AnnotatedString annotatedString) {
                TextStringSimpleNode.this.setSubstitution(annotatedString.getText());
                TextStringSimpleNode.this.invalidateForTranslate();
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.showTextSubstitution$default(semanticsPropertyReceiver, null, new InterfaceC6471c() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode.applySemantics.3
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Boolean) obj).booleanValue());
            }

            public final Boolean invoke(boolean z8) {
                if (TextStringSimpleNode.this.textSubstitution == null) {
                    return Boolean.FALSE;
                }
                TextSubstitutionValue textSubstitutionValue2 = TextStringSimpleNode.this.textSubstitution;
                if (textSubstitutionValue2 != null) {
                    textSubstitutionValue2.setShowingSubstitution(z8);
                }
                TextStringSimpleNode.this.invalidateForTranslate();
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.clearTextSubstitution$default(semanticsPropertyReceiver, null, new InterfaceC6469a() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode.applySemantics.4
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public final Boolean invoke() {
                TextStringSimpleNode.this.clearSubstitution();
                TextStringSimpleNode.this.invalidateForTranslate();
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, interfaceC6471c, 1, null);
    }

    public final void doInvalidations(boolean drawChanged, boolean textChanged, boolean layoutChanged) {
        if (textChanged || layoutChanged) {
            getLayoutCache().m8004updateL6sJoHM(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
        }
        if (getIsAttached()) {
            if (textChanged || (drawChanged && this.semanticsTextLayoutResult != null)) {
                SemanticsModifierNodeKt.invalidateSemantics(this);
            }
            if (textChanged || layoutChanged) {
                LayoutModifierNodeKt.invalidateMeasurement(this);
                DrawModifierNodeKt.invalidateDraw(this);
            }
            if (drawChanged) {
                DrawModifierNodeKt.invalidateDraw(this);
            }
        }
    }

    @Override // androidx.compose.p011ui.node.DrawModifierNode
    public void draw(@NotNull ContentDrawScope contentDrawScope) {
        if (getIsAttached()) {
            ParagraphLayoutCache layoutCacheOrSubstitute = getLayoutCacheOrSubstitute();
            Paragraph paragraph = layoutCacheOrSubstitute.getParagraph();
            if (paragraph == null) {
                InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("no paragraph (layoutCache=" + this._layoutCache + ", textSubstitution=" + this.textSubstitution + ')');
                throw new KotlinNothingValueException();
            }
            Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
            boolean didOverflow = layoutCacheOrSubstitute.getDidOverflow();
            if (didOverflow) {
                float layoutSize = (int) (layoutCacheOrSubstitute.getLayoutSize() >> 32);
                float layoutSize2 = (int) (layoutCacheOrSubstitute.getLayoutSize() & 4294967295L);
                canvas.save();
                Canvas.m10654clipRectN_I0leg$default(canvas, 0.0f, 0.0f, layoutSize, layoutSize2, 0, 16, null);
            }
            try {
                TextDecoration textDecoration = this.style.getTextDecoration();
                if (textDecoration == null) {
                    textDecoration = TextDecoration.INSTANCE.getNone();
                }
                TextDecoration textDecoration2 = textDecoration;
                Shadow shadow = this.style.getShadow();
                if (shadow == null) {
                    shadow = Shadow.INSTANCE.getNone();
                }
                Shadow shadow2 = shadow;
                DrawStyle drawStyle = this.style.getDrawStyle();
                if (drawStyle == null) {
                    drawStyle = Fill.INSTANCE;
                }
                DrawStyle drawStyle2 = drawStyle;
                Brush brush = this.style.getBrush();
                if (brush != null) {
                    Paragraph.m12630painthn5TExg$default(paragraph, canvas, brush, this.style.getAlpha(), shadow2, textDecoration2, drawStyle2, 0, 64, null);
                } else {
                    ColorProducer colorProducer = this.overrideColor;
                    long jMo8454invoke0d7_KjU = colorProducer != null ? colorProducer.mo8454invoke0d7_KjU() : Color.INSTANCE.m10718getUnspecified0d7_KjU();
                    if (jMo8454invoke0d7_KjU == 16) {
                        jMo8454invoke0d7_KjU = this.style.m12800getColor0d7_KjU() != 16 ? this.style.m12800getColor0d7_KjU() : Color.INSTANCE.m10708getBlack0d7_KjU();
                    }
                    Paragraph.m12628paintLG529CI$default(paragraph, canvas, jMo8454invoke0d7_KjU, shadow2, textDecoration2, drawStyle2, 0, 32, null);
                }
                if (didOverflow) {
                    canvas.restore();
                }
            } catch (Throwable th) {
                if (didOverflow) {
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

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCacheForMeasure(intrinsicMeasureScope).intrinsicHeight(i, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCacheForMeasure(intrinsicMeasureScope).maxIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo6573measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j7) {
        ParagraphLayoutCache layoutCacheForMeasure = getLayoutCacheForMeasure(measureScope);
        boolean zM8002layoutWithConstraintsK40F9xA = layoutCacheForMeasure.m8002layoutWithConstraintsK40F9xA(j7, measureScope.getLayoutDirection());
        layoutCacheForMeasure.getObserveFontChanges$foundation_release();
        Paragraph paragraph = layoutCacheForMeasure.getParagraph();
        AbstractC5830k.m5327d(paragraph);
        long layoutSize = layoutCacheForMeasure.getLayoutSize();
        if (zM8002layoutWithConstraintsK40F9xA) {
            LayoutModifierNodeKt.invalidateLayer(this);
            Map map = this.baselineCache;
            if (map == null) {
                map = new HashMap(2);
                this.baselineCache = map;
            }
            map.put(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(paragraph.getFirstBaseline())));
            map.put(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(paragraph.getLastBaseline())));
        }
        int i = (int) (layoutSize >> 32);
        int i8 = (int) (layoutSize & 4294967295L);
        final Placeable placeableMo12033measureBRTryo0 = measurable.mo12033measureBRTryo0(Constraints.INSTANCE.m13267fitPrioritizingWidthZbe2FdA(i, i, i8, i8));
        Map<AlignmentLine, Integer> map2 = this.baselineCache;
        AbstractC5830k.m5327d(map2);
        return measureScope.layout(i, i8, map2, new InterfaceC6471c() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$measure$1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, placeableMo12033measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        });
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCacheForMeasure(intrinsicMeasureScope).intrinsicHeight(i, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCacheForMeasure(intrinsicMeasureScope).minIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    public final boolean updateDraw(@Nullable ColorProducer color, @NotNull TextStyle style) {
        boolean zM5325b = AbstractC5830k.m5325b(color, this.overrideColor);
        this.overrideColor = color;
        return (zM5325b && style.hasSameDrawAffectingAttributes(this.style)) ? false : true;
    }

    /* renamed from: updateLayoutRelatedArgs-HuAbxIM, reason: not valid java name */
    public final boolean m8011updateLayoutRelatedArgsHuAbxIM(@NotNull TextStyle style, int minLines, int maxLines, boolean softWrap, @NotNull FontFamily.Resolver fontFamilyResolver, int overflow) {
        boolean z8 = !this.style.hasSameLayoutAffectingAttributes(style);
        this.style = style;
        if (this.minLines != minLines) {
            this.minLines = minLines;
            z8 = true;
        }
        if (this.maxLines != maxLines) {
            this.maxLines = maxLines;
            z8 = true;
        }
        if (this.softWrap != softWrap) {
            this.softWrap = softWrap;
            z8 = true;
        }
        if (!AbstractC5830k.m5325b(this.fontFamilyResolver, fontFamilyResolver)) {
            this.fontFamilyResolver = fontFamilyResolver;
            z8 = true;
        }
        if (TextOverflow.m13231equalsimpl0(this.overflow, overflow)) {
            return z8;
        }
        this.overflow = overflow;
        return true;
    }

    public final boolean updateText(@NotNull String text) {
        if (AbstractC5830k.m5325b(this.text, text)) {
            return false;
        }
        this.text = text;
        clearSubstitution();
        return true;
    }

    public /* synthetic */ TextStringSimpleNode(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z8, int i8, int i9, ColorProducer colorProducer, int i10, AbstractC5824e abstractC5824e) {
        this(str, textStyle, resolver, (i10 & 8) != 0 ? TextOverflow.INSTANCE.m13240getClipgIe3tQ8() : i, (i10 & 16) != 0 ? true : z8, (i10 & 32) != 0 ? Integer.MAX_VALUE : i8, (i10 & 64) != 0 ? 1 : i9, (i10 & 128) != 0 ? null : colorProducer, null);
    }

    private TextStringSimpleNode(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z8, int i8, int i9, ColorProducer colorProducer) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i;
        this.softWrap = z8;
        this.maxLines = i8;
        this.minLines = i9;
        this.overrideColor = colorProducer;
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\b\u0010\u001f\u001a\u00020\u0003H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0012\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, m5110d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;", "", "original", "", "substitution", "isShowingSubstitution", "", "layoutCache", "Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;)V", "()Z", "setShowingSubstitution", "(Z)V", "getLayoutCache", "()Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "setLayoutCache", "(Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;)V", "getOriginal", "()Ljava/lang/String;", "getSubstitution", "setSubstitution", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class TextSubstitutionValue {
        public static final int $stable = 8;
        private boolean isShowingSubstitution;

        @Nullable
        private ParagraphLayoutCache layoutCache;

        @NotNull
        private final String original;

        @NotNull
        private String substitution;

        public TextSubstitutionValue(@NotNull String str, @NotNull String str2, boolean z8, @Nullable ParagraphLayoutCache paragraphLayoutCache) {
            this.original = str;
            this.substitution = str2;
            this.isShowingSubstitution = z8;
            this.layoutCache = paragraphLayoutCache;
        }

        public static /* synthetic */ TextSubstitutionValue copy$default(TextSubstitutionValue textSubstitutionValue, String str, String str2, boolean z8, ParagraphLayoutCache paragraphLayoutCache, int i, Object obj) {
            if ((i & 1) != 0) {
                str = textSubstitutionValue.original;
            }
            if ((i & 2) != 0) {
                str2 = textSubstitutionValue.substitution;
            }
            if ((i & 4) != 0) {
                z8 = textSubstitutionValue.isShowingSubstitution;
            }
            if ((i & 8) != 0) {
                paragraphLayoutCache = textSubstitutionValue.layoutCache;
            }
            return textSubstitutionValue.copy(str, str2, z8, paragraphLayoutCache);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getOriginal() {
            return this.original;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getSubstitution() {
            return this.substitution;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final ParagraphLayoutCache getLayoutCache() {
            return this.layoutCache;
        }

        @NotNull
        public final TextSubstitutionValue copy(@NotNull String original, @NotNull String substitution, boolean isShowingSubstitution, @Nullable ParagraphLayoutCache layoutCache) {
            return new TextSubstitutionValue(original, substitution, isShowingSubstitution, layoutCache);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextSubstitutionValue)) {
                return false;
            }
            TextSubstitutionValue textSubstitutionValue = (TextSubstitutionValue) other;
            return AbstractC5830k.m5325b(this.original, textSubstitutionValue.original) && AbstractC5830k.m5325b(this.substitution, textSubstitutionValue.substitution) && this.isShowingSubstitution == textSubstitutionValue.isShowingSubstitution && AbstractC5830k.m5325b(this.layoutCache, textSubstitutionValue.layoutCache);
        }

        @Nullable
        public final ParagraphLayoutCache getLayoutCache() {
            return this.layoutCache;
        }

        @NotNull
        public final String getOriginal() {
            return this.original;
        }

        @NotNull
        public final String getSubstitution() {
            return this.substitution;
        }

        public int hashCode() {
            int iM908i = AbstractC0584a.m908i(this.isShowingSubstitution, AbstractC0584a.m903d(this.original.hashCode() * 31, 31, this.substitution), 31);
            ParagraphLayoutCache paragraphLayoutCache = this.layoutCache;
            return iM908i + (paragraphLayoutCache == null ? 0 : paragraphLayoutCache.hashCode());
        }

        public final boolean isShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        public final void setLayoutCache(@Nullable ParagraphLayoutCache paragraphLayoutCache) {
            this.layoutCache = paragraphLayoutCache;
        }

        public final void setShowingSubstitution(boolean z8) {
            this.isShowingSubstitution = z8;
        }

        public final void setSubstitution(@NotNull String str) {
            this.substitution = str;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("TextSubstitution(layoutCache=");
            sb.append(this.layoutCache);
            sb.append(", isShowingSubstitution=");
            return AbstractC0037f.m93r(sb, this.isShowingSubstitution, ')');
        }

        public /* synthetic */ TextSubstitutionValue(String str, String str2, boolean z8, ParagraphLayoutCache paragraphLayoutCache, int i, AbstractC5824e abstractC5824e) {
            this(str, str2, (i & 4) != 0 ? false : z8, (i & 8) != 0 ? null : paragraphLayoutCache);
        }
    }
}
