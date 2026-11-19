package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.foundation.text.modifiers.MinLinesConstrainer;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.MultiParagraph;
import androidx.compose.p011ui.text.MultiParagraphIntrinsics;
import androidx.compose.p011ui.text.Placeholder;
import androidx.compose.p011ui.text.TextLayoutInput;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.TextStyleKt;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.ConstraintsKt;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001:\u0001gBk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ*\u0010$\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001fH\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b&\u0010'J\"\u0010*\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)J(\u0010-\u001a\u00020\n*\u0004\u0018\u00010!2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020.H\u0002¢\u0006\u0004\b1\u00100J \u00104\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u001d\u00106\u001a\u00020\f2\u0006\u00105\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b6\u00107Jh\u0010:\u001a\u00020.2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0014\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013ø\u0001\u0000¢\u0006\u0004\b8\u00109J\u0015\u0010;\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b;\u0010<J\u0015\u0010=\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b=\u0010<R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010>R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010?R\u001c\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\t\u0010@R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010AR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010@R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010@R$\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010BR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010CR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001c\u0010H\u001a\u00020G8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bH\u0010IR.\u0010L\u001a\u0004\u0018\u00010J2\b\u0010K\u001a\u0004\u0018\u00010J8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010\u0005\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u00048\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0005\u0010R\"\u0004\bS\u0010TR\u0018\u0010U\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010W\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Y\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010[\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010@R\u0016\u0010\\\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010@R\u001c\u0010^\u001a\b\u0018\u00010]R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010b\u001a\u00060]R\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0011\u0010$\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0013\u0010f\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\be\u0010d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006h"}, m5110d2 = {"Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/foundation/text/TextAutoSize;", "autoSize", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILjava/util/List;Landroidx/compose/foundation/text/TextAutoSize;Lkotlin/jvm/internal/e;)V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "useMinLinesConstrainer-Oh53vG4", "(JLandroidx/compose/ui/unit/LayoutDirection;)J", "useMinLinesConstrainer", "finalConstraints", "Landroidx/compose/ui/text/MultiParagraph;", "multiParagraph", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult-VKLhPVY", "(Landroidx/compose/ui/unit/LayoutDirection;JLandroidx/compose/ui/text/MultiParagraph;)Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "layoutText-K40F9xA", "(JLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/MultiParagraph;", "layoutText", "newLayoutWillBeDifferent-VKLhPVY", "(Landroidx/compose/ui/text/TextLayoutResult;JLandroidx/compose/ui/unit/LayoutDirection;)Z", "newLayoutWillBeDifferent", "Ld6/s;", "markDirty", "()V", "markStyleAffectedDirty", "layoutWithConstraints-K40F9xA", "(JLandroidx/compose/ui/unit/LayoutDirection;)Z", "layoutWithConstraints", "width", "intrinsicHeight", "(ILandroidx/compose/ui/unit/LayoutDirection;)I", "update-J2qo7bo", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILjava/util/List;Landroidx/compose/foundation/text/TextAutoSize;)V", "update", "maxIntrinsicWidth", "(Landroidx/compose/ui/unit/LayoutDirection;)I", "minIntrinsicWidth", "Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "I", "Z", "Ljava/util/List;", "Landroidx/compose/foundation/text/TextAutoSize;", "Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "mMinLinesConstrainer", "Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "Landroidx/compose/foundation/text/modifiers/InlineDensity;", "lastDensity", "J", "Landroidx/compose/ui/unit/Density;", "value", "density", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/text/TextStyle;", "setStyle", "(Landroidx/compose/ui/text/TextStyle;)V", "paragraphIntrinsics", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "intrinsicsLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutCache", "Landroidx/compose/ui/text/TextLayoutResult;", "cachedIntrinsicHeightInputWidth", "cachedIntrinsicHeight", "Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache$TextAutoSizeLayoutScopeImpl;", "_textAutoSizeLayoutScope", "Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache$TextAutoSizeLayoutScopeImpl;", "getFontSizeSearchScope", "()Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache$TextAutoSizeLayoutScopeImpl;", "fontSizeSearchScope", "getTextLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "getLayoutOrNull", "layoutOrNull", "TextAutoSizeLayoutScopeImpl", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMultiParagraphLayoutCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,491:1\n1#2:492\n30#3:493\n80#4:494\n*S KotlinDebug\n*F\n+ 1 MultiParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache\n*L\n235#1:493\n235#1:494\n*E\n"})
/* loaded from: classes.dex */
public final class MultiParagraphLayoutCache {
    public static final int $stable = 8;

    @Nullable
    private TextAutoSizeLayoutScopeImpl _textAutoSizeLayoutScope;

    @Nullable
    private TextAutoSize autoSize;
    private int cachedIntrinsicHeight;
    private int cachedIntrinsicHeightInputWidth;

    @Nullable
    private Density density;

    @NotNull
    private FontFamily.Resolver fontFamilyResolver;

    @Nullable
    private LayoutDirection intrinsicsLayoutDirection;
    private long lastDensity;

    @Nullable
    private TextLayoutResult layoutCache;

    @Nullable
    private MinLinesConstrainer mMinLinesConstrainer;
    private int maxLines;
    private int minLines;
    private int overflow;

    @Nullable
    private MultiParagraphIntrinsics paragraphIntrinsics;

    @Nullable
    private List<AnnotatedString.Range<Placeholder>> placeholders;
    private boolean softWrap;

    @NotNull
    private TextStyle style;

    @NotNull
    private AnnotatedString text;

    @Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u0004*\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\"\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, m5110d2 = {"Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache$TextAutoSizeLayoutScopeImpl;", "Landroidx/compose/foundation/text/modifiers/TextAutoSizeLayoutScope;", "(Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;)V", "density", "", "getDensity", "()F", "fontScale", "getFontScale", "<set-?>", "Landroidx/compose/ui/text/TextLayoutResult;", "lastLayoutResult", "getLastLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "performLayout", "constraints", "Landroidx/compose/ui/unit/Constraints;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "performLayout-5ZSfY2I", "(JLandroidx/compose/ui/text/AnnotatedString;J)Landroidx/compose/ui/text/TextLayoutResult;", "toPx", "toPx--R2X_6o", "(J)F", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public final class TextAutoSizeLayoutScopeImpl implements TextAutoSizeLayoutScope {

        @Nullable
        private TextLayoutResult lastLayoutResult;

        public TextAutoSizeLayoutScopeImpl() {
        }

        @Override // androidx.compose.p011ui.unit.Density
        public float getDensity() {
            Density density = MultiParagraphLayoutCache.this.getDensity();
            AbstractC5830k.m5327d(density);
            return density.getDensity();
        }

        @Override // androidx.compose.p011ui.unit.FontScaling
        public float getFontScale() {
            Density density = MultiParagraphLayoutCache.this.getDensity();
            AbstractC5830k.m5327d(density);
            return density.getFontScale();
        }

        @Nullable
        public final TextLayoutResult getLastLayoutResult() {
            return this.lastLayoutResult;
        }

        @Override // androidx.compose.foundation.text.modifiers.TextAutoSizeLayoutScope
        @NotNull
        /* renamed from: performLayout-5ZSfY2I, reason: not valid java name */
        public TextLayoutResult mo7994performLayout5ZSfY2I(long constraints, @NotNull AnnotatedString text, long fontSize) {
            long jM7991useMinLinesConstrainerOh53vG4;
            TextStyle textStyle = MultiParagraphLayoutCache.this.style;
            long jM7996timesNB67dxo = TextUnit.m13501isEmimpl(fontSize) ? MultiParagraphLayoutCacheKt.m7996timesNB67dxo(MultiParagraphLayoutCache.this.style.m12801getFontSizeXSAIIZE(), fontSize) : fontSize;
            if (!TextUnit.m13496equalsimpl0(jM7996timesNB67dxo, MultiParagraphLayoutCache.this.style.m12801getFontSizeXSAIIZE())) {
                MultiParagraphLayoutCache multiParagraphLayoutCache = MultiParagraphLayoutCache.this;
                multiParagraphLayoutCache.setStyle(TextStyle.m12783copyp1EtxEg$default(multiParagraphLayoutCache.style, 0L, jM7996timesNB67dxo, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null));
            }
            if (MultiParagraphLayoutCache.this.minLines > 1) {
                MultiParagraphLayoutCache multiParagraphLayoutCache2 = MultiParagraphLayoutCache.this;
                LayoutDirection layoutDirection = multiParagraphLayoutCache2.intrinsicsLayoutDirection;
                AbstractC5830k.m5327d(layoutDirection);
                jM7991useMinLinesConstrainerOh53vG4 = multiParagraphLayoutCache2.m7991useMinLinesConstrainerOh53vG4(constraints, layoutDirection);
            } else {
                jM7991useMinLinesConstrainerOh53vG4 = constraints;
            }
            MultiParagraphLayoutCache multiParagraphLayoutCache3 = MultiParagraphLayoutCache.this;
            LayoutDirection layoutDirection2 = multiParagraphLayoutCache3.intrinsicsLayoutDirection;
            AbstractC5830k.m5327d(layoutDirection2);
            MultiParagraph multiParagraphM7988layoutTextK40F9xA = multiParagraphLayoutCache3.m7988layoutTextK40F9xA(jM7991useMinLinesConstrainerOh53vG4, layoutDirection2);
            MultiParagraphLayoutCache multiParagraphLayoutCache4 = MultiParagraphLayoutCache.this;
            LayoutDirection layoutDirection3 = multiParagraphLayoutCache4.intrinsicsLayoutDirection;
            AbstractC5830k.m5327d(layoutDirection3);
            TextLayoutResult textLayoutResultM7990textLayoutResultVKLhPVY = multiParagraphLayoutCache4.m7990textLayoutResultVKLhPVY(layoutDirection3, jM7991useMinLinesConstrainerOh53vG4, multiParagraphM7988layoutTextK40F9xA);
            this.lastLayoutResult = textLayoutResultM7990textLayoutResultVKLhPVY;
            MultiParagraphLayoutCache.this.setStyle(textStyle);
            return textLayoutResultM7990textLayoutResultVKLhPVY;
        }

        @Override // androidx.compose.p011ui.unit.Density
        /* renamed from: toPx--R2X_6o */
        public float mo6902toPxR2X_6o(long j7) {
            if (!TextUnit.m13501isEmimpl(j7)) {
                return mo6903toPx0680j_4(mo6898toDpGaN1DYA(j7));
            }
            if (TextUnit.m13501isEmimpl(MultiParagraphLayoutCache.this.style.m12801getFontSizeXSAIIZE())) {
                throw new IllegalStateException("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is Em\nDeclare the composable's style.fontSize with Sp units instead.");
            }
            if (TextUnit.m13496equalsimpl0(MultiParagraphLayoutCache.this.style.m12801getFontSizeXSAIIZE(), TextUnit.INSTANCE.m13510getUnspecifiedXSAIIZE())) {
                throw new IllegalStateException("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is not set. Please specify a font size.");
            }
            return TextUnit.m13499getValueimpl(j7) * mo6902toPxR2X_6o(MultiParagraphLayoutCache.this.style.m12801getFontSizeXSAIIZE());
        }
    }

    public /* synthetic */ MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z8, int i8, int i9, List list, TextAutoSize textAutoSize, AbstractC5824e abstractC5824e) {
        this(annotatedString, textStyle, resolver, i, z8, i8, i9, list, textAutoSize);
    }

    private final TextAutoSizeLayoutScopeImpl getFontSizeSearchScope() {
        if (this._textAutoSizeLayoutScope == null) {
            this._textAutoSizeLayoutScope = new TextAutoSizeLayoutScopeImpl();
        }
        TextAutoSizeLayoutScopeImpl textAutoSizeLayoutScopeImpl = this._textAutoSizeLayoutScope;
        AbstractC5830k.m5327d(textAutoSizeLayoutScopeImpl);
        return textAutoSizeLayoutScopeImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: layoutText-K40F9xA, reason: not valid java name */
    public final MultiParagraph m7988layoutTextK40F9xA(long constraints, LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics layoutDirection2 = setLayoutDirection(layoutDirection);
        return new MultiParagraph(layoutDirection2, LayoutUtilsKt.m7979finalConstraintstfFHcEY(constraints, this.softWrap, this.overflow, layoutDirection2.getMaxIntrinsicWidth()), LayoutUtilsKt.m7980finalMaxLinesxdlQI24(this.softWrap, this.overflow, this.maxLines), this.overflow, (AbstractC5824e) null);
    }

    private final void markDirty() {
        this.paragraphIntrinsics = null;
        this.layoutCache = null;
        this.cachedIntrinsicHeight = -1;
        this.cachedIntrinsicHeightInputWidth = -1;
        this._textAutoSizeLayoutScope = null;
    }

    private final void markStyleAffectedDirty() {
        this.paragraphIntrinsics = null;
        this.layoutCache = null;
        this.cachedIntrinsicHeight = -1;
        this.cachedIntrinsicHeightInputWidth = -1;
    }

    /* renamed from: newLayoutWillBeDifferent-VKLhPVY, reason: not valid java name */
    private final boolean m7989newLayoutWillBeDifferentVKLhPVY(TextLayoutResult textLayoutResult, long j7, LayoutDirection layoutDirection) {
        if (textLayoutResult == null || textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() || layoutDirection != textLayoutResult.getLayoutInput().getLayoutDirection()) {
            return true;
        }
        if (Constraints.m13251equalsimpl0(j7, textLayoutResult.getLayoutInput().getConstraints())) {
            return false;
        }
        return Constraints.m13258getMaxWidthimpl(j7) != Constraints.m13258getMaxWidthimpl(textLayoutResult.getLayoutInput().getConstraints()) || Constraints.m13260getMinWidthimpl(j7) != Constraints.m13260getMinWidthimpl(textLayoutResult.getLayoutInput().getConstraints()) || ((float) Constraints.m13257getMaxHeightimpl(j7)) < textLayoutResult.getMultiParagraph().getHeight() || textLayoutResult.getMultiParagraph().getDidExceedMaxLines();
    }

    private final MultiParagraphIntrinsics setLayoutDirection(LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection || multiParagraphIntrinsics.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            AnnotatedString annotatedString = this.text;
            TextStyle textStyleResolveDefaults = TextStyleKt.resolveDefaults(this.style, layoutDirection);
            Density density = this.density;
            AbstractC5830k.m5327d(density);
            FontFamily.Resolver resolver = this.fontFamilyResolver;
            List list = this.placeholders;
            if (list == null) {
                list = EmptyList.INSTANCE;
            }
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, textStyleResolveDefaults, (List<AnnotatedString.Range<Placeholder>>) list, density, resolver);
        }
        this.paragraphIntrinsics = multiParagraphIntrinsics;
        return multiParagraphIntrinsics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setStyle(TextStyle textStyle) {
        boolean zHasSameLayoutAffectingAttributes = textStyle.hasSameLayoutAffectingAttributes(this.style);
        this.style = textStyle;
        if (zHasSameLayoutAffectingAttributes) {
            return;
        }
        markStyleAffectedDirty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: textLayoutResult-VKLhPVY, reason: not valid java name */
    public final TextLayoutResult m7990textLayoutResultVKLhPVY(LayoutDirection layoutDirection, long finalConstraints, MultiParagraph multiParagraph) {
        float fMin = Math.min(multiParagraph.getIntrinsics().getMaxIntrinsicWidth(), multiParagraph.getWidth());
        AnnotatedString annotatedString = this.text;
        TextStyle textStyle = this.style;
        List list = this.placeholders;
        if (list == null) {
            list = EmptyList.INSTANCE;
        }
        int i = this.maxLines;
        boolean z8 = this.softWrap;
        int i8 = this.overflow;
        Density density = this.density;
        AbstractC5830k.m5327d(density);
        return new TextLayoutResult(new TextLayoutInput(annotatedString, textStyle, list, i, z8, i8, density, layoutDirection, this.fontFamilyResolver, finalConstraints, (AbstractC5824e) null), multiParagraph, ConstraintsKt.m13272constrain4WqzIAM(finalConstraints, IntSize.m13471constructorimpl((TextDelegateKt.ceilToIntPx(fMin) << 32) | (TextDelegateKt.ceilToIntPx(multiParagraph.getHeight()) & 4294967295L))), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: useMinLinesConstrainer-Oh53vG4, reason: not valid java name */
    public final long m7991useMinLinesConstrainerOh53vG4(long constraints, LayoutDirection layoutDirection) {
        MinLinesConstrainer.Companion companion = MinLinesConstrainer.INSTANCE;
        MinLinesConstrainer minLinesConstrainer = this.mMinLinesConstrainer;
        TextStyle textStyle = this.style;
        Density density = this.density;
        AbstractC5830k.m5327d(density);
        MinLinesConstrainer minLinesConstrainerFrom = companion.from(minLinesConstrainer, layoutDirection, textStyle, density, this.fontFamilyResolver);
        this.mMinLinesConstrainer = minLinesConstrainerFrom;
        return minLinesConstrainerFrom.m7983coerceMinLinesOh53vG4$foundation_release(constraints, this.minLines);
    }

    @Nullable
    /* renamed from: getDensity$foundation_release, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    @Nullable
    /* renamed from: getLayoutOrNull, reason: from getter */
    public final TextLayoutResult getLayoutCache() {
        return this.layoutCache;
    }

    @NotNull
    public final TextLayoutResult getTextLayoutResult() {
        TextLayoutResult textLayoutResult = this.layoutCache;
        if (textLayoutResult != null) {
            return textLayoutResult;
        }
        throw new IllegalStateException("You must call layoutWithConstraints first");
    }

    public final int intrinsicHeight(int width, @NotNull LayoutDirection layoutDirection) {
        int i = this.cachedIntrinsicHeightInputWidth;
        int i8 = this.cachedIntrinsicHeight;
        if (width == i && i != -1) {
            return i8;
        }
        long jConstraints = ConstraintsKt.Constraints(0, width, 0, Integer.MAX_VALUE);
        if (this.minLines > 1) {
            jConstraints = m7991useMinLinesConstrainerOh53vG4(jConstraints, layoutDirection);
        }
        int iCeilToIntPx = TextDelegateKt.ceilToIntPx(m7988layoutTextK40F9xA(jConstraints, layoutDirection).getHeight());
        int iM13259getMinHeightimpl = Constraints.m13259getMinHeightimpl(jConstraints);
        if (iCeilToIntPx < iM13259getMinHeightimpl) {
            iCeilToIntPx = iM13259getMinHeightimpl;
        }
        this.cachedIntrinsicHeightInputWidth = width;
        this.cachedIntrinsicHeight = iCeilToIntPx;
        return iCeilToIntPx;
    }

    /* renamed from: layoutWithConstraints-K40F9xA, reason: not valid java name */
    public final boolean m7992layoutWithConstraintsK40F9xA(long constraints, @NotNull LayoutDirection layoutDirection) {
        long jM7991useMinLinesConstrainerOh53vG4 = this.minLines > 1 ? m7991useMinLinesConstrainerOh53vG4(constraints, layoutDirection) : constraints;
        if (!m7989newLayoutWillBeDifferentVKLhPVY(this.layoutCache, jM7991useMinLinesConstrainerOh53vG4, layoutDirection)) {
            TextLayoutResult textLayoutResult = this.layoutCache;
            AbstractC5830k.m5327d(textLayoutResult);
            if (Constraints.m13251equalsimpl0(jM7991useMinLinesConstrainerOh53vG4, textLayoutResult.getLayoutInput().getConstraints())) {
                return false;
            }
            TextLayoutResult textLayoutResult2 = this.layoutCache;
            AbstractC5830k.m5327d(textLayoutResult2);
            this.layoutCache = m7990textLayoutResultVKLhPVY(layoutDirection, jM7991useMinLinesConstrainerOh53vG4, textLayoutResult2.getMultiParagraph());
            return true;
        }
        if (this.autoSize != null) {
            this.intrinsicsLayoutDirection = layoutDirection;
            long jM12801getFontSizeXSAIIZE = this.style.m12801getFontSizeXSAIIZE();
            TextAutoSize textAutoSize = this.autoSize;
            AbstractC5830k.m5327d(textAutoSize);
            long jMo7563getFontSizeCi0_558 = textAutoSize.mo7563getFontSizeCi0_558(getFontSizeSearchScope(), constraints, this.text);
            if (TextUnit.m13501isEmimpl(jMo7563getFontSizeCi0_558)) {
                jMo7563getFontSizeCi0_558 = MultiParagraphLayoutCacheKt.m7996timesNB67dxo(jM12801getFontSizeXSAIIZE, jMo7563getFontSizeCi0_558);
            }
            long j7 = jMo7563getFontSizeCi0_558;
            TextLayoutResult lastLayoutResult = getFontSizeSearchScope().getLastLayoutResult();
            if (lastLayoutResult != null && TextUnit.m13496equalsimpl0(j7, lastLayoutResult.getLayoutInput().getStyle().m12801getFontSizeXSAIIZE()) && TextOverflow.m13231equalsimpl0(lastLayoutResult.getLayoutInput().getOverflow(), this.overflow)) {
                this.layoutCache = lastLayoutResult;
                return true;
            }
            setStyle(TextStyle.m12783copyp1EtxEg$default(this.style, 0L, j7, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null));
        }
        this.layoutCache = m7990textLayoutResultVKLhPVY(layoutDirection, jM7991useMinLinesConstrainerOh53vG4, m7988layoutTextK40F9xA(jM7991useMinLinesConstrainerOh53vG4, layoutDirection));
        return true;
    }

    public final int maxIntrinsicWidth(@NotNull LayoutDirection layoutDirection) {
        return TextDelegateKt.ceilToIntPx(setLayoutDirection(layoutDirection).getMaxIntrinsicWidth());
    }

    public final int minIntrinsicWidth(@NotNull LayoutDirection layoutDirection) {
        return TextDelegateKt.ceilToIntPx(setLayoutDirection(layoutDirection).getMinIntrinsicWidth());
    }

    public final void setDensity$foundation_release(@Nullable Density density) {
        Density density2 = this.density;
        long jM7970constructorimpl = density != null ? InlineDensity.m7970constructorimpl(density) : InlineDensity.INSTANCE.m7978getUnspecifiedL26CHvs();
        if (density2 == null) {
            this.density = density;
            this.lastDensity = jM7970constructorimpl;
        } else if (density == null || !InlineDensity.m7972equalsimpl0(this.lastDensity, jM7970constructorimpl)) {
            this.density = density;
            this.lastDensity = jM7970constructorimpl;
            markDirty();
        }
    }

    /* renamed from: update-J2qo7bo, reason: not valid java name */
    public final void m7993updateJ2qo7bo(@NotNull AnnotatedString text, @NotNull TextStyle style, @NotNull FontFamily.Resolver fontFamilyResolver, int overflow, boolean softWrap, int maxLines, int minLines, @Nullable List<AnnotatedString.Range<Placeholder>> placeholders, @Nullable TextAutoSize autoSize) {
        this.text = text;
        setStyle(style);
        this.fontFamilyResolver = fontFamilyResolver;
        this.overflow = overflow;
        this.softWrap = softWrap;
        this.maxLines = maxLines;
        this.minLines = minLines;
        this.placeholders = placeholders;
        this.autoSize = autoSize;
        markDirty();
    }

    private MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z8, int i8, int i9, List<AnnotatedString.Range<Placeholder>> list, TextAutoSize textAutoSize) {
        this.text = annotatedString;
        this.fontFamilyResolver = resolver;
        this.overflow = i;
        this.softWrap = z8;
        this.maxLines = i8;
        this.minLines = i9;
        this.placeholders = list;
        this.autoSize = textAutoSize;
        this.lastDensity = InlineDensity.INSTANCE.m7978getUnspecifiedL26CHvs();
        this.style = textStyle;
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }

    public /* synthetic */ MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z8, int i8, int i9, List list, TextAutoSize textAutoSize, int i10, AbstractC5824e abstractC5824e) {
        this(annotatedString, textStyle, resolver, (i10 & 8) != 0 ? TextOverflow.INSTANCE.m13240getClipgIe3tQ8() : i, (i10 & 16) != 0 ? true : z8, (i10 & 32) != 0 ? Integer.MAX_VALUE : i8, (i10 & 64) != 0 ? 1 : i9, (i10 & 128) != 0 ? null : list, (i10 & 256) != 0 ? null : textAutoSize, null);
    }
}
