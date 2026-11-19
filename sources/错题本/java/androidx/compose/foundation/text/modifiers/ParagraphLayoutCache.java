package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.foundation.text.modifiers.MinLinesConstrainer;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.MultiParagraph;
import androidx.compose.p011ui.text.MultiParagraphIntrinsics;
import androidx.compose.p011ui.text.Paragraph;
import androidx.compose.p011ui.text.ParagraphIntrinsics;
import androidx.compose.p011ui.text.ParagraphIntrinsicsKt;
import androidx.compose.p011ui.text.ParagraphKt;
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
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\"\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J \u0010\"\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001cJ\u001d\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b$\u0010%JH\u0010(\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b&\u0010'J\"\u0010,\u001a\u00020)2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0000ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b2\u00101J\u000f\u00103\u001a\u00020\u0002H\u0016¢\u0006\u0004\b3\u00104R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u00105R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u00106R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00107R\u001c\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\t\u00108R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u00109R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00108R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00108R\u001c\u0010;\u001a\u00020:8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b;\u0010<R.\u0010?\u001a\u0004\u0018\u00010=2\b\u0010>\u001a\u0004\u0018\u00010=8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010E\u001a\u0004\u0018\u00010)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010K\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u00109\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR(\u0010Q\u001a\u00020P8\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bQ\u0010<\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0018\u0010W\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Y\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010[\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u001c\u0010]\u001a\u00020\u00118\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b]\u0010<R\u0016\u0010^\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u00108R\u0016\u0010_\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u00108R\u0014\u0010b\u001a\u00020\u001e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b`\u0010a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006c"}, m5110d2 = {"Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "", "", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "minLines", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILkotlin/jvm/internal/e;)V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "useMinLinesConstrainer-euUD3Qg", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/TextStyle;)J", "useMinLinesConstrainer", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/ParagraphIntrinsics;", "newLayoutWillBeDifferent-K40F9xA", "(JLandroidx/compose/ui/unit/LayoutDirection;)Z", "newLayoutWillBeDifferent", "Ld6/s;", "markDirty", "()V", "layoutWithConstraints-K40F9xA", "layoutWithConstraints", "width", "intrinsicHeight", "(ILandroidx/compose/ui/unit/LayoutDirection;)I", "update-L6sJoHM", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZII)V", "update", "Landroidx/compose/ui/text/Paragraph;", "layoutText-K40F9xA$foundation_release", "(JLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/Paragraph;", "layoutText", "Landroidx/compose/ui/text/TextLayoutResult;", "slowCreateTextLayoutResultOrNull", "(Landroidx/compose/ui/text/TextStyle;)Landroidx/compose/ui/text/TextLayoutResult;", "minIntrinsicWidth", "(Landroidx/compose/ui/unit/LayoutDirection;)I", "maxIntrinsicWidth", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "Landroidx/compose/ui/text/TextStyle;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "I", "Z", "Landroidx/compose/foundation/text/modifiers/InlineDensity;", "lastDensity", "J", "Landroidx/compose/ui/unit/Density;", "value", "density", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "paragraph", "Landroidx/compose/ui/text/Paragraph;", "getParagraph$foundation_release", "()Landroidx/compose/ui/text/Paragraph;", "setParagraph$foundation_release", "(Landroidx/compose/ui/text/Paragraph;)V", "didOverflow", "getDidOverflow$foundation_release", "()Z", "setDidOverflow$foundation_release", "(Z)V", "Landroidx/compose/ui/unit/IntSize;", "layoutSize", "getLayoutSize-YbymL2g$foundation_release", "()J", "setLayoutSize-ozmzZPI$foundation_release", "(J)V", "Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "mMinLinesConstrainer", "Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "paragraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "intrinsicsLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "prevConstraints", "cachedIntrinsicHeightInputWidth", "cachedIntrinsicHeight", "getObserveFontChanges$foundation_release", "()Ld6/s;", "observeFontChanges", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nParagraphLayoutCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/ParagraphLayoutCache\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 6 Constraints.kt\nandroidx/compose/ui/unit/Constraints\n*L\n1#1,381:1\n30#2:382\n30#2:385\n30#2:391\n30#2:397\n80#3:383\n80#3:386\n85#3:388\n90#3:390\n80#3:392\n85#3:394\n90#3:396\n80#3:398\n1#4:384\n54#5:387\n59#5:389\n54#5:393\n59#5:395\n202#6:399\n*S KotlinDebug\n*F\n+ 1 ParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/ParagraphLayoutCache\n*L\n96#1:382\n136#1:385\n153#1:391\n317#1:397\n96#1:383\n136#1:386\n141#1:388\n142#1:390\n153#1:392\n158#1:394\n158#1:396\n317#1:398\n141#1:387\n142#1:389\n158#1:393\n158#1:395\n335#1:399\n*E\n"})
/* loaded from: classes.dex */
public final class ParagraphLayoutCache {
    public static final int $stable = 8;
    private int cachedIntrinsicHeight;
    private int cachedIntrinsicHeightInputWidth;

    @Nullable
    private Density density;
    private boolean didOverflow;

    @NotNull
    private FontFamily.Resolver fontFamilyResolver;

    @Nullable
    private LayoutDirection intrinsicsLayoutDirection;
    private long lastDensity;
    private long layoutSize;

    @Nullable
    private MinLinesConstrainer mMinLinesConstrainer;
    private int maxLines;
    private int minLines;
    private int overflow;

    @Nullable
    private Paragraph paragraph;

    @Nullable
    private ParagraphIntrinsics paragraphIntrinsics;
    private long prevConstraints;
    private boolean softWrap;

    @NotNull
    private TextStyle style;

    @NotNull
    private String text;

    public /* synthetic */ ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z8, int i8, int i9, AbstractC5824e abstractC5824e) {
        this(str, textStyle, resolver, i, z8, i8, i9);
    }

    private final void markDirty() {
        this.paragraph = null;
        this.paragraphIntrinsics = null;
        this.intrinsicsLayoutDirection = null;
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
        this.prevConstraints = Constraints.INSTANCE.m13268fixedJhjzzOo(0, 0);
        long j7 = 0;
        this.layoutSize = IntSize.m13471constructorimpl((j7 & 4294967295L) | (j7 << 32));
        this.didOverflow = false;
    }

    /* renamed from: newLayoutWillBeDifferent-K40F9xA, reason: not valid java name */
    private final boolean m7997newLayoutWillBeDifferentK40F9xA(long constraints, LayoutDirection layoutDirection) {
        ParagraphIntrinsics paragraphIntrinsics;
        Paragraph paragraph = this.paragraph;
        if (paragraph == null || (paragraphIntrinsics = this.paragraphIntrinsics) == null || paragraphIntrinsics.getHasStaleResolvedFonts() || layoutDirection != this.intrinsicsLayoutDirection) {
            return true;
        }
        if (Constraints.m13251equalsimpl0(constraints, this.prevConstraints)) {
            return false;
        }
        return Constraints.m13258getMaxWidthimpl(constraints) != Constraints.m13258getMaxWidthimpl(this.prevConstraints) || Constraints.m13260getMinWidthimpl(constraints) != Constraints.m13260getMinWidthimpl(this.prevConstraints) || ((float) Constraints.m13257getMaxHeightimpl(constraints)) < paragraph.getHeight() || paragraph.getDidExceedMaxLines();
    }

    private final ParagraphIntrinsics setLayoutDirection(LayoutDirection layoutDirection) {
        ParagraphIntrinsics ParagraphIntrinsics = this.paragraphIntrinsics;
        if (ParagraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection || ParagraphIntrinsics.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            String str = this.text;
            TextStyle textStyleResolveDefaults = TextStyleKt.resolveDefaults(this.style, layoutDirection);
            EmptyList emptyList = EmptyList.INSTANCE;
            Density density = this.density;
            AbstractC5830k.m5327d(density);
            ParagraphIntrinsics = ParagraphIntrinsicsKt.ParagraphIntrinsics(str, textStyleResolveDefaults, emptyList, density, this.fontFamilyResolver, emptyList);
        }
        this.paragraphIntrinsics = ParagraphIntrinsics;
        return ParagraphIntrinsics;
    }

    /* renamed from: useMinLinesConstrainer-euUD3Qg, reason: not valid java name */
    private final long m7998useMinLinesConstrainereuUD3Qg(long constraints, LayoutDirection layoutDirection, TextStyle style) {
        MinLinesConstrainer.Companion companion = MinLinesConstrainer.INSTANCE;
        MinLinesConstrainer minLinesConstrainer = this.mMinLinesConstrainer;
        Density density = this.density;
        AbstractC5830k.m5327d(density);
        MinLinesConstrainer minLinesConstrainerFrom = companion.from(minLinesConstrainer, layoutDirection, style, density, this.fontFamilyResolver);
        this.mMinLinesConstrainer = minLinesConstrainerFrom;
        return minLinesConstrainerFrom.m7983coerceMinLinesOh53vG4$foundation_release(constraints, this.minLines);
    }

    /* renamed from: useMinLinesConstrainer-euUD3Qg$default, reason: not valid java name */
    public static /* synthetic */ long m7999useMinLinesConstrainereuUD3Qg$default(ParagraphLayoutCache paragraphLayoutCache, long j7, LayoutDirection layoutDirection, TextStyle textStyle, int i, Object obj) {
        if ((i & 4) != 0) {
            textStyle = paragraphLayoutCache.style;
        }
        return paragraphLayoutCache.m7998useMinLinesConstrainereuUD3Qg(j7, layoutDirection, textStyle);
    }

    @Nullable
    /* renamed from: getDensity$foundation_release, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    /* renamed from: getDidOverflow$foundation_release, reason: from getter */
    public final boolean getDidOverflow() {
        return this.didOverflow;
    }

    /* renamed from: getLayoutSize-YbymL2g$foundation_release, reason: not valid java name and from getter */
    public final long getLayoutSize() {
        return this.layoutSize;
    }

    @NotNull
    public final C5443s getObserveFontChanges$foundation_release() {
        ParagraphIntrinsics paragraphIntrinsics = this.paragraphIntrinsics;
        if (paragraphIntrinsics != null) {
            paragraphIntrinsics.getHasStaleResolvedFonts();
        }
        return C5443s.f8405a;
    }

    @Nullable
    /* renamed from: getParagraph$foundation_release, reason: from getter */
    public final Paragraph getParagraph() {
        return this.paragraph;
    }

    public final int intrinsicHeight(int width, @NotNull LayoutDirection layoutDirection) {
        ParagraphLayoutCache paragraphLayoutCache;
        LayoutDirection layoutDirection2;
        int i = this.cachedIntrinsicHeightInputWidth;
        int i8 = this.cachedIntrinsicHeight;
        if (width == i && i != -1) {
            return i8;
        }
        long jConstraints = ConstraintsKt.Constraints(0, width, 0, Integer.MAX_VALUE);
        if (this.minLines > 1) {
            paragraphLayoutCache = this;
            layoutDirection2 = layoutDirection;
            jConstraints = m7999useMinLinesConstrainereuUD3Qg$default(paragraphLayoutCache, jConstraints, layoutDirection2, null, 4, null);
        } else {
            paragraphLayoutCache = this;
            layoutDirection2 = layoutDirection;
        }
        int iCeilToIntPx = TextDelegateKt.ceilToIntPx(m8001layoutTextK40F9xA$foundation_release(jConstraints, layoutDirection2).getHeight());
        int iM13259getMinHeightimpl = Constraints.m13259getMinHeightimpl(jConstraints);
        if (iCeilToIntPx < iM13259getMinHeightimpl) {
            iCeilToIntPx = iM13259getMinHeightimpl;
        }
        paragraphLayoutCache.cachedIntrinsicHeightInputWidth = width;
        paragraphLayoutCache.cachedIntrinsicHeight = iCeilToIntPx;
        return iCeilToIntPx;
    }

    @NotNull
    /* renamed from: layoutText-K40F9xA$foundation_release, reason: not valid java name */
    public final Paragraph m8001layoutTextK40F9xA$foundation_release(long constraints, @NotNull LayoutDirection layoutDirection) {
        ParagraphIntrinsics layoutDirection2 = setLayoutDirection(layoutDirection);
        return ParagraphKt.m12643ParagraphczeNHc(layoutDirection2, LayoutUtilsKt.m7979finalConstraintstfFHcEY(constraints, this.softWrap, this.overflow, layoutDirection2.getMaxIntrinsicWidth()), LayoutUtilsKt.m7980finalMaxLinesxdlQI24(this.softWrap, this.overflow, this.maxLines), this.overflow);
    }

    /* renamed from: layoutWithConstraints-K40F9xA, reason: not valid java name */
    public final boolean m8002layoutWithConstraintsK40F9xA(long constraints, @NotNull LayoutDirection layoutDirection) {
        ParagraphLayoutCache paragraphLayoutCache;
        LayoutDirection layoutDirection2;
        boolean z8 = true;
        if (this.minLines > 1) {
            paragraphLayoutCache = this;
            layoutDirection2 = layoutDirection;
            constraints = m7999useMinLinesConstrainereuUD3Qg$default(paragraphLayoutCache, constraints, layoutDirection2, null, 4, null);
        } else {
            paragraphLayoutCache = this;
            layoutDirection2 = layoutDirection;
        }
        boolean z9 = false;
        if (m7997newLayoutWillBeDifferentK40F9xA(constraints, layoutDirection2)) {
            Paragraph paragraphM8001layoutTextK40F9xA$foundation_release = m8001layoutTextK40F9xA$foundation_release(constraints, layoutDirection2);
            paragraphLayoutCache.prevConstraints = constraints;
            paragraphLayoutCache.layoutSize = ConstraintsKt.m13272constrain4WqzIAM(constraints, IntSize.m13471constructorimpl((TextDelegateKt.ceilToIntPx(paragraphM8001layoutTextK40F9xA$foundation_release.getWidth()) << 32) | (TextDelegateKt.ceilToIntPx(paragraphM8001layoutTextK40F9xA$foundation_release.getHeight()) & 4294967295L)));
            if (!TextOverflow.m13231equalsimpl0(paragraphLayoutCache.overflow, TextOverflow.INSTANCE.m13244getVisiblegIe3tQ8()) && (((int) (r13 >> 32)) < paragraphM8001layoutTextK40F9xA$foundation_release.getWidth() || ((int) (r13 & 4294967295L)) < paragraphM8001layoutTextK40F9xA$foundation_release.getHeight())) {
                z9 = true;
            }
            paragraphLayoutCache.didOverflow = z9;
            paragraphLayoutCache.paragraph = paragraphM8001layoutTextK40F9xA$foundation_release;
            return true;
        }
        if (!Constraints.m13251equalsimpl0(constraints, paragraphLayoutCache.prevConstraints)) {
            Paragraph paragraph = paragraphLayoutCache.paragraph;
            AbstractC5830k.m5327d(paragraph);
            paragraphLayoutCache.layoutSize = ConstraintsKt.m13272constrain4WqzIAM(constraints, IntSize.m13471constructorimpl((TextDelegateKt.ceilToIntPx(Math.min(paragraph.getMaxIntrinsicWidth(), paragraph.getWidth())) << 32) | (TextDelegateKt.ceilToIntPx(paragraph.getHeight()) & 4294967295L)));
            if (TextOverflow.m13231equalsimpl0(paragraphLayoutCache.overflow, TextOverflow.INSTANCE.m13244getVisiblegIe3tQ8()) || (((int) (r7 >> 32)) >= paragraph.getWidth() && ((int) (4294967295L & r7)) >= paragraph.getHeight())) {
                z8 = false;
            }
            paragraphLayoutCache.didOverflow = z8;
            paragraphLayoutCache.prevConstraints = constraints;
        }
        return false;
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

    public final void setDidOverflow$foundation_release(boolean z8) {
        this.didOverflow = z8;
    }

    /* renamed from: setLayoutSize-ozmzZPI$foundation_release, reason: not valid java name */
    public final void m8003setLayoutSizeozmzZPI$foundation_release(long j7) {
        this.layoutSize = j7;
    }

    public final void setParagraph$foundation_release(@Nullable Paragraph paragraph) {
        this.paragraph = paragraph;
    }

    @Nullable
    public final TextLayoutResult slowCreateTextLayoutResultOrNull(@NotNull TextStyle style) {
        Density density;
        LayoutDirection layoutDirection = this.intrinsicsLayoutDirection;
        if (layoutDirection == null || (density = this.density) == null) {
            return null;
        }
        AnnotatedString annotatedString = new AnnotatedString(this.text, null, 2, null);
        if (this.paragraph == null || this.paragraphIntrinsics == null) {
            return null;
        }
        long jM13246constructorimpl = Constraints.m13246constructorimpl(this.prevConstraints & ConstraintsKt.MaxDimensionsAndFocusMask);
        EmptyList emptyList = EmptyList.INSTANCE;
        return new TextLayoutResult(new TextLayoutInput(annotatedString, style, emptyList, this.maxLines, this.softWrap, this.overflow, density, layoutDirection, this.fontFamilyResolver, jM13246constructorimpl, (AbstractC5824e) null), new MultiParagraph(new MultiParagraphIntrinsics(annotatedString, style, emptyList, density, this.fontFamilyResolver), jM13246constructorimpl, this.maxLines, this.overflow, (AbstractC5824e) null), this.layoutSize, null);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.paragraph != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) InlineDensity.m7976toStringimpl(this.lastDensity));
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: update-L6sJoHM, reason: not valid java name */
    public final void m8004updateL6sJoHM(@NotNull String text, @NotNull TextStyle style, @NotNull FontFamily.Resolver fontFamilyResolver, int overflow, boolean softWrap, int maxLines, int minLines) {
        this.text = text;
        this.style = style;
        this.fontFamilyResolver = fontFamilyResolver;
        this.overflow = overflow;
        this.softWrap = softWrap;
        this.maxLines = maxLines;
        this.minLines = minLines;
        markDirty();
    }

    private ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z8, int i8, int i9) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i;
        this.softWrap = z8;
        this.maxLines = i8;
        this.minLines = i9;
        this.lastDensity = InlineDensity.INSTANCE.m7978getUnspecifiedL26CHvs();
        long j7 = 0;
        this.layoutSize = IntSize.m13471constructorimpl((j7 & 4294967295L) | (j7 << 32));
        this.prevConstraints = Constraints.INSTANCE.m13268fixedJhjzzOo(0, 0);
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }

    public /* synthetic */ ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z8, int i8, int i9, int i10, AbstractC5824e abstractC5824e) {
        this(str, textStyle, resolver, (i10 & 8) != 0 ? TextOverflow.INSTANCE.m13240getClipgIe3tQ8() : i, (i10 & 16) != 0 ? true : z8, (i10 & 32) != 0 ? Integer.MAX_VALUE : i8, (i10 & 64) != 0 ? 1 : i9, null);
    }
}
