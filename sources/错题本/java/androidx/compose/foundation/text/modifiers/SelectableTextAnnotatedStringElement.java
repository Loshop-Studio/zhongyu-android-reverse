package androidx.compose.foundation.text.modifiers;

import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.p011ui.graphics.ColorProducer;
import androidx.compose.p011ui.node.ModifierNodeElement;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.Placeholder;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B»\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0014\u0012\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0005HÂ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÂ\u0003¢\u0006\u0004\b&\u0010'J\u001e\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÂ\u0003¢\u0006\u0004\b(\u0010)J\u0016\u0010,\u001a\u00020\rHÂ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020\u000fHÂ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0011HÂ\u0003¢\u0006\u0004\b/\u0010+J\u0010\u00100\u001a\u00020\u0011HÂ\u0003¢\u0006\u0004\b0\u0010+J\u001e\u00101\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0014HÂ\u0003¢\u0006\u0004\b1\u00102J&\u00103\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÂ\u0003¢\u0006\u0004\b3\u0010)J\u0012\u00104\u001a\u0004\u0018\u00010\u001aHÂ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u001cHÂ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u001eHÂ\u0003¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0002H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u0002H\u0016¢\u0006\u0004\b=\u0010>J\u001a\u0010A\u001a\u00020\u000f2\b\u0010@\u001a\u0004\u0018\u00010?H\u0096\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0011H\u0016¢\u0006\u0004\bC\u0010+J\u0013\u0010E\u001a\u00020\u000b*\u00020DH\u0016¢\u0006\u0004\bE\u0010FJÍ\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u00142\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÆ\u0001ø\u0001\u0001¢\u0006\u0004\bG\u0010HJ\u0010\u0010K\u001a\u00020JHÖ\u0001¢\u0006\u0004\bK\u0010LR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010MR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010NR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010OR\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010PR\u001a\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000e\u0010QR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010RR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010QR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010QR\"\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010SR*\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010PR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010TR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010UR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010V\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006W"}, m5110d2 = {"Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringNode;", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "Ld6/s;", "onTextLayout", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/geometry/Rect;", "onPlaceholderLayout", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "selectionController", "Landroidx/compose/ui/graphics/ColorProducer;", TypedValues.Custom.S_COLOR, "Landroidx/compose/foundation/text/TextAutoSize;", "autoSize", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lr6/c;IZIILjava/util/List;Lr6/c;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;Lkotlin/jvm/internal/e;)V", "component1", "()Landroidx/compose/ui/text/AnnotatedString;", "component2", "()Landroidx/compose/ui/text/TextStyle;", "component3", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "component4", "()Lr6/c;", "component5-gIe3tQ8", "()I", "component5", "component6", "()Z", "component7", "component8", "component9", "()Ljava/util/List;", "component10", "component11", "()Landroidx/compose/foundation/text/modifiers/SelectionController;", "component12", "()Landroidx/compose/ui/graphics/ColorProducer;", "component13", "()Landroidx/compose/foundation/text/TextAutoSize;", "create", "()Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringNode;", "node", "update", "(Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringNode;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "copy-RWo7tUw", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lr6/c;IZIILjava/util/List;Lr6/c;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;)Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;", "copy", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/TextStyle;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "Lr6/c;", "I", "Z", "Ljava/util/List;", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "Landroidx/compose/ui/graphics/ColorProducer;", "Landroidx/compose/foundation/text/TextAutoSize;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final /* data */ class SelectableTextAnnotatedStringElement extends ModifierNodeElement<SelectableTextAnnotatedStringNode> {
    public static final int $stable = 0;

    @Nullable
    private final TextAutoSize autoSize;

    @Nullable
    private final ColorProducer color;

    @NotNull
    private final FontFamily.Resolver fontFamilyResolver;
    private final int maxLines;
    private final int minLines;

    @Nullable
    private final InterfaceC6471c onPlaceholderLayout;

    @Nullable
    private final InterfaceC6471c onTextLayout;
    private final int overflow;

    @Nullable
    private final List<AnnotatedString.Range<Placeholder>> placeholders;

    @Nullable
    private final SelectionController selectionController;
    private final boolean softWrap;

    @NotNull
    private final TextStyle style;

    @NotNull
    private final AnnotatedString text;

    public /* synthetic */ SelectableTextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, InterfaceC6471c interfaceC6471c, int i, boolean z8, int i8, int i9, List list, InterfaceC6471c interfaceC6471c2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, AbstractC5824e abstractC5824e) {
        this(annotatedString, textStyle, resolver, interfaceC6471c, i, z8, i8, i9, list, interfaceC6471c2, selectionController, colorProducer, textAutoSize);
    }

    /* renamed from: component1, reason: from getter */
    private final AnnotatedString getText() {
        return this.text;
    }

    /* renamed from: component10, reason: from getter */
    private final InterfaceC6471c getOnPlaceholderLayout() {
        return this.onPlaceholderLayout;
    }

    /* renamed from: component11, reason: from getter */
    private final SelectionController getSelectionController() {
        return this.selectionController;
    }

    /* renamed from: component12, reason: from getter */
    private final ColorProducer getColor() {
        return this.color;
    }

    /* renamed from: component13, reason: from getter */
    private final TextAutoSize getAutoSize() {
        return this.autoSize;
    }

    /* renamed from: component2, reason: from getter */
    private final TextStyle getStyle() {
        return this.style;
    }

    /* renamed from: component3, reason: from getter */
    private final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    /* renamed from: component4, reason: from getter */
    private final InterfaceC6471c getOnTextLayout() {
        return this.onTextLayout;
    }

    /* renamed from: component5-gIe3tQ8, reason: not valid java name and from getter */
    private final int getOverflow() {
        return this.overflow;
    }

    /* renamed from: component6, reason: from getter */
    private final boolean getSoftWrap() {
        return this.softWrap;
    }

    /* renamed from: component7, reason: from getter */
    private final int getMaxLines() {
        return this.maxLines;
    }

    /* renamed from: component8, reason: from getter */
    private final int getMinLines() {
        return this.minLines;
    }

    private final List<AnnotatedString.Range<Placeholder>> component9() {
        return this.placeholders;
    }

    /* renamed from: copy-RWo7tUw$default, reason: not valid java name */
    public static /* synthetic */ SelectableTextAnnotatedStringElement m8006copyRWo7tUw$default(SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement, AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, InterfaceC6471c interfaceC6471c, int i, boolean z8, int i8, int i9, List list, InterfaceC6471c interfaceC6471c2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            annotatedString = selectableTextAnnotatedStringElement.text;
        }
        return selectableTextAnnotatedStringElement.m8007copyRWo7tUw(annotatedString, (i10 & 2) != 0 ? selectableTextAnnotatedStringElement.style : textStyle, (i10 & 4) != 0 ? selectableTextAnnotatedStringElement.fontFamilyResolver : resolver, (i10 & 8) != 0 ? selectableTextAnnotatedStringElement.onTextLayout : interfaceC6471c, (i10 & 16) != 0 ? selectableTextAnnotatedStringElement.overflow : i, (i10 & 32) != 0 ? selectableTextAnnotatedStringElement.softWrap : z8, (i10 & 64) != 0 ? selectableTextAnnotatedStringElement.maxLines : i8, (i10 & 128) != 0 ? selectableTextAnnotatedStringElement.minLines : i9, (i10 & 256) != 0 ? selectableTextAnnotatedStringElement.placeholders : list, (i10 & 512) != 0 ? selectableTextAnnotatedStringElement.onPlaceholderLayout : interfaceC6471c2, (i10 & 1024) != 0 ? selectableTextAnnotatedStringElement.selectionController : selectionController, (i10 & 2048) != 0 ? selectableTextAnnotatedStringElement.color : colorProducer, (i10 & 4096) != 0 ? selectableTextAnnotatedStringElement.autoSize : textAutoSize);
    }

    @NotNull
    /* renamed from: copy-RWo7tUw, reason: not valid java name */
    public final SelectableTextAnnotatedStringElement m8007copyRWo7tUw(@NotNull AnnotatedString text, @NotNull TextStyle style, @NotNull FontFamily.Resolver fontFamilyResolver, @Nullable InterfaceC6471c onTextLayout, int overflow, boolean softWrap, int maxLines, int minLines, @Nullable List<AnnotatedString.Range<Placeholder>> placeholders, @Nullable InterfaceC6471c onPlaceholderLayout, @Nullable SelectionController selectionController, @Nullable ColorProducer color, @Nullable TextAutoSize autoSize) {
        return new SelectableTextAnnotatedStringElement(text, style, fontFamilyResolver, onTextLayout, overflow, softWrap, maxLines, minLines, placeholders, onPlaceholderLayout, selectionController, color, autoSize, null);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) other;
        return AbstractC5830k.m5325b(this.color, selectableTextAnnotatedStringElement.color) && AbstractC5830k.m5325b(this.text, selectableTextAnnotatedStringElement.text) && AbstractC5830k.m5325b(this.style, selectableTextAnnotatedStringElement.style) && AbstractC5830k.m5325b(this.placeholders, selectableTextAnnotatedStringElement.placeholders) && AbstractC5830k.m5325b(this.fontFamilyResolver, selectableTextAnnotatedStringElement.fontFamilyResolver) && AbstractC5830k.m5325b(this.autoSize, selectableTextAnnotatedStringElement.autoSize) && this.onTextLayout == selectableTextAnnotatedStringElement.onTextLayout && TextOverflow.m13231equalsimpl0(this.overflow, selectableTextAnnotatedStringElement.overflow) && this.softWrap == selectableTextAnnotatedStringElement.softWrap && this.maxLines == selectableTextAnnotatedStringElement.maxLines && this.minLines == selectableTextAnnotatedStringElement.minLines && this.onPlaceholderLayout == selectableTextAnnotatedStringElement.onPlaceholderLayout && AbstractC5830k.m5325b(this.selectionController, selectableTextAnnotatedStringElement.selectionController);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = (this.fontFamilyResolver.hashCode() + ((this.style.hashCode() + (this.text.hashCode() * 31)) * 31)) * 31;
        InterfaceC6471c interfaceC6471c = this.onTextLayout;
        int iM908i = (((AbstractC0584a.m908i(this.softWrap, (TextOverflow.m13232hashCodeimpl(this.overflow) + ((iHashCode + (interfaceC6471c != null ? interfaceC6471c.hashCode() : 0)) * 31)) * 31, 31) + this.maxLines) * 31) + this.minLines) * 31;
        List<AnnotatedString.Range<Placeholder>> list = this.placeholders;
        int iHashCode2 = (iM908i + (list != null ? list.hashCode() : 0)) * 31;
        InterfaceC6471c interfaceC6471c2 = this.onPlaceholderLayout;
        int iHashCode3 = (iHashCode2 + (interfaceC6471c2 != null ? interfaceC6471c2.hashCode() : 0)) * 31;
        SelectionController selectionController = this.selectionController;
        int iHashCode4 = (iHashCode3 + (selectionController != null ? selectionController.hashCode() : 0)) * 31;
        TextAutoSize textAutoSize = this.autoSize;
        int iHashCode5 = (iHashCode4 + (textAutoSize != null ? textAutoSize.hashCode() : 0)) * 31;
        ColorProducer colorProducer = this.color;
        return iHashCode5 + (colorProducer != null ? colorProducer.hashCode() : 0);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
    }

    @NotNull
    public String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + ((Object) this.text) + ", style=" + this.style + ", fontFamilyResolver=" + this.fontFamilyResolver + ", onTextLayout=" + this.onTextLayout + ", overflow=" + ((Object) TextOverflow.m13233toStringimpl(this.overflow)) + ", softWrap=" + this.softWrap + ", maxLines=" + this.maxLines + ", minLines=" + this.minLines + ", placeholders=" + this.placeholders + ", onPlaceholderLayout=" + this.onPlaceholderLayout + ", selectionController=" + this.selectionController + ", color=" + this.color + ", autoSize=" + this.autoSize + ')';
    }

    public /* synthetic */ SelectableTextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, InterfaceC6471c interfaceC6471c, int i, boolean z8, int i8, int i9, List list, InterfaceC6471c interfaceC6471c2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, int i10, AbstractC5824e abstractC5824e) {
        this(annotatedString, textStyle, resolver, (i10 & 8) != 0 ? null : interfaceC6471c, (i10 & 16) != 0 ? TextOverflow.INSTANCE.m13240getClipgIe3tQ8() : i, (i10 & 32) != 0 ? true : z8, (i10 & 64) != 0 ? Integer.MAX_VALUE : i8, (i10 & 128) != 0 ? 1 : i9, (i10 & 256) != 0 ? null : list, (i10 & 512) != 0 ? null : interfaceC6471c2, (i10 & 1024) != 0 ? null : selectionController, (i10 & 2048) != 0 ? null : colorProducer, (i10 & 4096) != 0 ? null : textAutoSize, null);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    @NotNull
    /* renamed from: create */
    public SelectableTextAnnotatedStringNode getNode() {
        return new SelectableTextAnnotatedStringNode(this.text, this.style, this.fontFamilyResolver, this.onTextLayout, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.onPlaceholderLayout, this.selectionController, this.color, this.autoSize, null, 8192, null);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void update(@NotNull SelectableTextAnnotatedStringNode node) {
        node.m8008update7NebLg4(this.text, this.style, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow, this.onTextLayout, this.onPlaceholderLayout, this.selectionController, this.color, this.autoSize);
    }

    private SelectableTextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, InterfaceC6471c interfaceC6471c, int i, boolean z8, int i8, int i9, List<AnnotatedString.Range<Placeholder>> list, InterfaceC6471c interfaceC6471c2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize) {
        this.text = annotatedString;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.onTextLayout = interfaceC6471c;
        this.overflow = i;
        this.softWrap = z8;
        this.maxLines = i8;
        this.minLines = i9;
        this.placeholders = list;
        this.onPlaceholderLayout = interfaceC6471c2;
        this.selectionController = selectionController;
        this.color = colorProducer;
        this.autoSize = textAutoSize;
    }
}
