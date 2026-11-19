package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.p014ui.graphics.ColorProducer;
import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.Placeholder;
import androidx.compose.p014ui.text.TextStyle;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.style.TextOverflow;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class SelectableTextAnnotatedStringElement extends ModifierNodeElement<SelectableTextAnnotatedStringNode> {
    public static final int $stable = 0;
    private final TextAutoSize autoSize;
    private final ColorProducer color;
    private final FontFamily.Resolver fontFamilyResolver;
    private final int maxLines;
    private final int minLines;
    private final InterfaceC9540l onPlaceholderLayout;
    private final InterfaceC9540l onTextLayout;
    private final int overflow;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private final SelectionController selectionController;
    private final boolean softWrap;
    private final TextStyle style;
    private final AnnotatedString text;

    public /* synthetic */ SelectableTextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, InterfaceC9540l interfaceC9540l, int i10, boolean z10, int i11, int i12, List list, InterfaceC9540l interfaceC9540l2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, AbstractC9972n abstractC9972n) {
        this(annotatedString, textStyle, resolver, interfaceC9540l, i10, z10, i11, i12, list, interfaceC9540l2, selectionController, colorProducer, textAutoSize);
    }

    private final AnnotatedString component1() {
        return this.text;
    }

    private final InterfaceC9540l component10() {
        return this.onPlaceholderLayout;
    }

    private final SelectionController component11() {
        return this.selectionController;
    }

    private final ColorProducer component12() {
        return this.color;
    }

    private final TextAutoSize component13() {
        return this.autoSize;
    }

    private final TextStyle component2() {
        return this.style;
    }

    private final FontFamily.Resolver component3() {
        return this.fontFamilyResolver;
    }

    private final InterfaceC9540l component4() {
        return this.onTextLayout;
    }

    /* renamed from: component5-gIe3tQ8, reason: not valid java name */
    private final int m28201component5gIe3tQ8() {
        return this.overflow;
    }

    private final boolean component6() {
        return this.softWrap;
    }

    private final int component7() {
        return this.maxLines;
    }

    private final int component8() {
        return this.minLines;
    }

    private final List<AnnotatedString.Range<Placeholder>> component9() {
        return this.placeholders;
    }

    /* renamed from: copy-RWo7tUw$default, reason: not valid java name */
    public static /* synthetic */ SelectableTextAnnotatedStringElement m28202copyRWo7tUw$default(SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement, AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, InterfaceC9540l interfaceC9540l, int i10, boolean z10, int i11, int i12, List list, InterfaceC9540l interfaceC9540l2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            annotatedString = selectableTextAnnotatedStringElement.text;
        }
        return selectableTextAnnotatedStringElement.m28203copyRWo7tUw(annotatedString, (i13 & 2) != 0 ? selectableTextAnnotatedStringElement.style : textStyle, (i13 & 4) != 0 ? selectableTextAnnotatedStringElement.fontFamilyResolver : resolver, (i13 & 8) != 0 ? selectableTextAnnotatedStringElement.onTextLayout : interfaceC9540l, (i13 & 16) != 0 ? selectableTextAnnotatedStringElement.overflow : i10, (i13 & 32) != 0 ? selectableTextAnnotatedStringElement.softWrap : z10, (i13 & 64) != 0 ? selectableTextAnnotatedStringElement.maxLines : i11, (i13 & 128) != 0 ? selectableTextAnnotatedStringElement.minLines : i12, (i13 & 256) != 0 ? selectableTextAnnotatedStringElement.placeholders : list, (i13 & 512) != 0 ? selectableTextAnnotatedStringElement.onPlaceholderLayout : interfaceC9540l2, (i13 & 1024) != 0 ? selectableTextAnnotatedStringElement.selectionController : selectionController, (i13 & 2048) != 0 ? selectableTextAnnotatedStringElement.color : colorProducer, (i13 & 4096) != 0 ? selectableTextAnnotatedStringElement.autoSize : textAutoSize);
    }

    /* renamed from: copy-RWo7tUw, reason: not valid java name */
    public final SelectableTextAnnotatedStringElement m28203copyRWo7tUw(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, InterfaceC9540l interfaceC9540l, int i10, boolean z10, int i11, int i12, List<AnnotatedString.Range<Placeholder>> list, InterfaceC9540l interfaceC9540l2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize) {
        return new SelectableTextAnnotatedStringElement(annotatedString, textStyle, resolver, interfaceC9540l, i10, z10, i11, i12, list, interfaceC9540l2, selectionController, colorProducer, textAutoSize, null);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        return AbstractC9979u.m20289b(this.color, selectableTextAnnotatedStringElement.color) && AbstractC9979u.m20289b(this.text, selectableTextAnnotatedStringElement.text) && AbstractC9979u.m20289b(this.style, selectableTextAnnotatedStringElement.style) && AbstractC9979u.m20289b(this.placeholders, selectableTextAnnotatedStringElement.placeholders) && AbstractC9979u.m20289b(this.fontFamilyResolver, selectableTextAnnotatedStringElement.fontFamilyResolver) && AbstractC9979u.m20289b(this.autoSize, selectableTextAnnotatedStringElement.autoSize) && this.onTextLayout == selectableTextAnnotatedStringElement.onTextLayout && TextOverflow.m33427equalsimpl0(this.overflow, selectableTextAnnotatedStringElement.overflow) && this.softWrap == selectableTextAnnotatedStringElement.softWrap && this.maxLines == selectableTextAnnotatedStringElement.maxLines && this.minLines == selectableTextAnnotatedStringElement.minLines && this.onPlaceholderLayout == selectableTextAnnotatedStringElement.onPlaceholderLayout && AbstractC9979u.m20289b(this.selectionController, selectableTextAnnotatedStringElement.selectionController);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = ((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31;
        InterfaceC9540l interfaceC9540l = this.onTextLayout;
        int iHashCode2 = (((((((((iHashCode + (interfaceC9540l != null ? interfaceC9540l.hashCode() : 0)) * 31) + TextOverflow.m33428hashCodeimpl(this.overflow)) * 31) + Boolean.hashCode(this.softWrap)) * 31) + this.maxLines) * 31) + this.minLines) * 31;
        List<AnnotatedString.Range<Placeholder>> list = this.placeholders;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        InterfaceC9540l interfaceC9540l2 = this.onPlaceholderLayout;
        int iHashCode4 = (iHashCode3 + (interfaceC9540l2 != null ? interfaceC9540l2.hashCode() : 0)) * 31;
        SelectionController selectionController = this.selectionController;
        int iHashCode5 = (iHashCode4 + (selectionController != null ? selectionController.hashCode() : 0)) * 31;
        TextAutoSize textAutoSize = this.autoSize;
        int iHashCode6 = (iHashCode5 + (textAutoSize != null ? textAutoSize.hashCode() : 0)) * 31;
        ColorProducer colorProducer = this.color;
        return iHashCode6 + (colorProducer != null ? colorProducer.hashCode() : 0);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + ((Object) this.text) + ", style=" + this.style + ", fontFamilyResolver=" + this.fontFamilyResolver + ", onTextLayout=" + this.onTextLayout + ", overflow=" + ((Object) TextOverflow.m33429toStringimpl(this.overflow)) + ", softWrap=" + this.softWrap + ", maxLines=" + this.maxLines + ", minLines=" + this.minLines + ", placeholders=" + this.placeholders + ", onPlaceholderLayout=" + this.onPlaceholderLayout + ", selectionController=" + this.selectionController + ", color=" + this.color + ", autoSize=" + this.autoSize + ')';
    }

    public /* synthetic */ SelectableTextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, InterfaceC9540l interfaceC9540l, int i10, boolean z10, int i11, int i12, List list, InterfaceC9540l interfaceC9540l2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, int i13, AbstractC9972n abstractC9972n) {
        this(annotatedString, textStyle, resolver, (i13 & 8) != 0 ? null : interfaceC9540l, (i13 & 16) != 0 ? TextOverflow.Companion.m33436getClipgIe3tQ8() : i10, (i13 & 32) != 0 ? true : z10, (i13 & 64) != 0 ? Integer.MAX_VALUE : i11, (i13 & 128) != 0 ? 1 : i12, (i13 & 256) != 0 ? null : list, (i13 & 512) != 0 ? null : interfaceC9540l2, (i13 & 1024) != 0 ? null : selectionController, (i13 & 2048) != 0 ? null : colorProducer, (i13 & 4096) != 0 ? null : textAutoSize, null);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public SelectableTextAnnotatedStringNode create() {
        return new SelectableTextAnnotatedStringNode(this.text, this.style, this.fontFamilyResolver, this.onTextLayout, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.onPlaceholderLayout, this.selectionController, this.color, this.autoSize, null, 8192, null);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(SelectableTextAnnotatedStringNode selectableTextAnnotatedStringNode) {
        selectableTextAnnotatedStringNode.m28204update7NebLg4(this.text, this.style, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow, this.onTextLayout, this.onPlaceholderLayout, this.selectionController, this.color, this.autoSize);
    }

    private SelectableTextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, InterfaceC9540l interfaceC9540l, int i10, boolean z10, int i11, int i12, List<AnnotatedString.Range<Placeholder>> list, InterfaceC9540l interfaceC9540l2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize) {
        this.text = annotatedString;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.onTextLayout = interfaceC9540l;
        this.overflow = i10;
        this.softWrap = z10;
        this.maxLines = i11;
        this.minLines = i12;
        this.placeholders = list;
        this.onPlaceholderLayout = interfaceC9540l2;
        this.selectionController = selectionController;
        this.color = colorProducer;
        this.autoSize = textAutoSize;
    }
}
