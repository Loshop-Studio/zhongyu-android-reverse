package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.p013ui.graphics.ColorProducer;
import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.Placeholder;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.style.TextOverflow;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class SelectableTextAnnotatedStringElement extends ModifierNodeElement<SelectableTextAnnotatedStringNode> {
    public static final int $stable = 0;
    private final TextAutoSize autoSize;
    private final ColorProducer color;
    private final FontFamily.Resolver fontFamilyResolver;
    private final int maxLines;
    private final int minLines;
    private final InterfaceC10570l onPlaceholderLayout;
    private final InterfaceC10570l onTextLayout;
    private final int overflow;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private final SelectionController selectionController;
    private final boolean softWrap;
    private final TextStyle style;
    private final AnnotatedString text;

    public /* synthetic */ SelectableTextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, InterfaceC10570l interfaceC10570l, int i10, boolean z10, int i11, int i12, List list, InterfaceC10570l interfaceC10570l2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, AbstractC9126n abstractC9126n) {
        this(annotatedString, textStyle, resolver, interfaceC10570l, i10, z10, i11, i12, list, interfaceC10570l2, selectionController, colorProducer, textAutoSize);
    }

    private final AnnotatedString component1() {
        return this.text;
    }

    private final InterfaceC10570l component10() {
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

    private final InterfaceC10570l component4() {
        return this.onTextLayout;
    }

    /* renamed from: component5-gIe3tQ8, reason: not valid java name */
    private final int m21599component5gIe3tQ8() {
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
    public static /* synthetic */ SelectableTextAnnotatedStringElement m21600copyRWo7tUw$default(SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement, AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, InterfaceC10570l interfaceC10570l, int i10, boolean z10, int i11, int i12, List list, InterfaceC10570l interfaceC10570l2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            annotatedString = selectableTextAnnotatedStringElement.text;
        }
        return selectableTextAnnotatedStringElement.m21601copyRWo7tUw(annotatedString, (i13 & 2) != 0 ? selectableTextAnnotatedStringElement.style : textStyle, (i13 & 4) != 0 ? selectableTextAnnotatedStringElement.fontFamilyResolver : resolver, (i13 & 8) != 0 ? selectableTextAnnotatedStringElement.onTextLayout : interfaceC10570l, (i13 & 16) != 0 ? selectableTextAnnotatedStringElement.overflow : i10, (i13 & 32) != 0 ? selectableTextAnnotatedStringElement.softWrap : z10, (i13 & 64) != 0 ? selectableTextAnnotatedStringElement.maxLines : i11, (i13 & 128) != 0 ? selectableTextAnnotatedStringElement.minLines : i12, (i13 & 256) != 0 ? selectableTextAnnotatedStringElement.placeholders : list, (i13 & 512) != 0 ? selectableTextAnnotatedStringElement.onPlaceholderLayout : interfaceC10570l2, (i13 & 1024) != 0 ? selectableTextAnnotatedStringElement.selectionController : selectionController, (i13 & 2048) != 0 ? selectableTextAnnotatedStringElement.color : colorProducer, (i13 & 4096) != 0 ? selectableTextAnnotatedStringElement.autoSize : textAutoSize);
    }

    /* renamed from: copy-RWo7tUw, reason: not valid java name */
    public final SelectableTextAnnotatedStringElement m21601copyRWo7tUw(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, InterfaceC10570l interfaceC10570l, int i10, boolean z10, int i11, int i12, List<AnnotatedString.Range<Placeholder>> list, InterfaceC10570l interfaceC10570l2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize) {
        return new SelectableTextAnnotatedStringElement(annotatedString, textStyle, resolver, interfaceC10570l, i10, z10, i11, i12, list, interfaceC10570l2, selectionController, colorProducer, textAutoSize, null);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        return AbstractC9133u.m16128b(this.color, selectableTextAnnotatedStringElement.color) && AbstractC9133u.m16128b(this.text, selectableTextAnnotatedStringElement.text) && AbstractC9133u.m16128b(this.style, selectableTextAnnotatedStringElement.style) && AbstractC9133u.m16128b(this.placeholders, selectableTextAnnotatedStringElement.placeholders) && AbstractC9133u.m16128b(this.fontFamilyResolver, selectableTextAnnotatedStringElement.fontFamilyResolver) && AbstractC9133u.m16128b(this.autoSize, selectableTextAnnotatedStringElement.autoSize) && this.onTextLayout == selectableTextAnnotatedStringElement.onTextLayout && TextOverflow.m26825equalsimpl0(this.overflow, selectableTextAnnotatedStringElement.overflow) && this.softWrap == selectableTextAnnotatedStringElement.softWrap && this.maxLines == selectableTextAnnotatedStringElement.maxLines && this.minLines == selectableTextAnnotatedStringElement.minLines && this.onPlaceholderLayout == selectableTextAnnotatedStringElement.onPlaceholderLayout && AbstractC9133u.m16128b(this.selectionController, selectableTextAnnotatedStringElement.selectionController);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = ((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31;
        InterfaceC10570l interfaceC10570l = this.onTextLayout;
        int iHashCode2 = (((((((((iHashCode + (interfaceC10570l != null ? interfaceC10570l.hashCode() : 0)) * 31) + TextOverflow.m26826hashCodeimpl(this.overflow)) * 31) + Boolean.hashCode(this.softWrap)) * 31) + this.maxLines) * 31) + this.minLines) * 31;
        List<AnnotatedString.Range<Placeholder>> list = this.placeholders;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        InterfaceC10570l interfaceC10570l2 = this.onPlaceholderLayout;
        int iHashCode4 = (iHashCode3 + (interfaceC10570l2 != null ? interfaceC10570l2.hashCode() : 0)) * 31;
        SelectionController selectionController = this.selectionController;
        int iHashCode5 = (iHashCode4 + (selectionController != null ? selectionController.hashCode() : 0)) * 31;
        TextAutoSize textAutoSize = this.autoSize;
        int iHashCode6 = (iHashCode5 + (textAutoSize != null ? textAutoSize.hashCode() : 0)) * 31;
        ColorProducer colorProducer = this.color;
        return iHashCode6 + (colorProducer != null ? colorProducer.hashCode() : 0);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + ((Object) this.text) + ", style=" + this.style + ", fontFamilyResolver=" + this.fontFamilyResolver + ", onTextLayout=" + this.onTextLayout + ", overflow=" + ((Object) TextOverflow.m26827toStringimpl(this.overflow)) + ", softWrap=" + this.softWrap + ", maxLines=" + this.maxLines + ", minLines=" + this.minLines + ", placeholders=" + this.placeholders + ", onPlaceholderLayout=" + this.onPlaceholderLayout + ", selectionController=" + this.selectionController + ", color=" + this.color + ", autoSize=" + this.autoSize + ')';
    }

    public /* synthetic */ SelectableTextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, InterfaceC10570l interfaceC10570l, int i10, boolean z10, int i11, int i12, List list, InterfaceC10570l interfaceC10570l2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, int i13, AbstractC9126n abstractC9126n) {
        this(annotatedString, textStyle, resolver, (i13 & 8) != 0 ? null : interfaceC10570l, (i13 & 16) != 0 ? TextOverflow.Companion.m26834getClipgIe3tQ8() : i10, (i13 & 32) != 0 ? true : z10, (i13 & 64) != 0 ? Integer.MAX_VALUE : i11, (i13 & 128) != 0 ? 1 : i12, (i13 & 256) != 0 ? null : list, (i13 & 512) != 0 ? null : interfaceC10570l2, (i13 & 1024) != 0 ? null : selectionController, (i13 & 2048) != 0 ? null : colorProducer, (i13 & 4096) != 0 ? null : textAutoSize, null);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public SelectableTextAnnotatedStringNode create() {
        return new SelectableTextAnnotatedStringNode(this.text, this.style, this.fontFamilyResolver, this.onTextLayout, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.onPlaceholderLayout, this.selectionController, this.color, this.autoSize, null, 8192, null);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(SelectableTextAnnotatedStringNode selectableTextAnnotatedStringNode) {
        selectableTextAnnotatedStringNode.m21602update7NebLg4(this.text, this.style, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow, this.onTextLayout, this.onPlaceholderLayout, this.selectionController, this.color, this.autoSize);
    }

    private SelectableTextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, InterfaceC10570l interfaceC10570l, int i10, boolean z10, int i11, int i12, List<AnnotatedString.Range<Placeholder>> list, InterfaceC10570l interfaceC10570l2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize) {
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
        this.color = colorProducer;
        this.autoSize = textAutoSize;
    }
}
