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
public final class TextAnnotatedStringElement extends ModifierNodeElement<TextAnnotatedStringNode> {
    public static final int $stable = 0;
    private final TextAutoSize autoSize;
    private final ColorProducer color;
    private final FontFamily.Resolver fontFamilyResolver;
    private final int maxLines;
    private final int minLines;
    private final InterfaceC9540l onPlaceholderLayout;
    private final InterfaceC9540l onShowTranslation;
    private final InterfaceC9540l onTextLayout;
    private final int overflow;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private final SelectionController selectionController;
    private final boolean softWrap;
    private final TextStyle style;
    private final AnnotatedString text;

    public /* synthetic */ TextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, InterfaceC9540l interfaceC9540l, int i10, boolean z10, int i11, int i12, List list, InterfaceC9540l interfaceC9540l2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, InterfaceC9540l interfaceC9540l3, AbstractC9972n abstractC9972n) {
        this(annotatedString, textStyle, resolver, interfaceC9540l, i10, z10, i11, i12, list, interfaceC9540l2, selectionController, colorProducer, textAutoSize, interfaceC9540l3);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return AbstractC9979u.m20289b(this.color, textAnnotatedStringElement.color) && AbstractC9979u.m20289b(this.text, textAnnotatedStringElement.text) && AbstractC9979u.m20289b(this.style, textAnnotatedStringElement.style) && AbstractC9979u.m20289b(this.placeholders, textAnnotatedStringElement.placeholders) && AbstractC9979u.m20289b(this.fontFamilyResolver, textAnnotatedStringElement.fontFamilyResolver) && this.onTextLayout == textAnnotatedStringElement.onTextLayout && this.onShowTranslation == textAnnotatedStringElement.onShowTranslation && TextOverflow.m33427equalsimpl0(this.overflow, textAnnotatedStringElement.overflow) && this.softWrap == textAnnotatedStringElement.softWrap && this.maxLines == textAnnotatedStringElement.maxLines && this.minLines == textAnnotatedStringElement.minLines && this.onPlaceholderLayout == textAnnotatedStringElement.onPlaceholderLayout && AbstractC9979u.m20289b(this.selectionController, textAnnotatedStringElement.selectionController);
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
        ColorProducer colorProducer = this.color;
        int iHashCode6 = (iHashCode5 + (colorProducer != null ? colorProducer.hashCode() : 0)) * 31;
        InterfaceC9540l interfaceC9540l3 = this.onShowTranslation;
        return iHashCode6 + (interfaceC9540l3 != null ? interfaceC9540l3.hashCode() : 0);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public /* synthetic */ TextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, InterfaceC9540l interfaceC9540l, int i10, boolean z10, int i11, int i12, List list, InterfaceC9540l interfaceC9540l2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, InterfaceC9540l interfaceC9540l3, int i13, AbstractC9972n abstractC9972n) {
        this(annotatedString, textStyle, resolver, (i13 & 8) != 0 ? null : interfaceC9540l, (i13 & 16) != 0 ? TextOverflow.Companion.m33436getClipgIe3tQ8() : i10, (i13 & 32) != 0 ? true : z10, (i13 & 64) != 0 ? Integer.MAX_VALUE : i11, (i13 & 128) != 0 ? 1 : i12, (i13 & 256) != 0 ? null : list, (i13 & 512) != 0 ? null : interfaceC9540l2, (i13 & 1024) != 0 ? null : selectionController, (i13 & 2048) != 0 ? null : colorProducer, (i13 & 4096) != 0 ? null : textAutoSize, (i13 & 8192) != 0 ? null : interfaceC9540l3, null);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public TextAnnotatedStringNode create() {
        return new TextAnnotatedStringNode(this.text, this.style, this.fontFamilyResolver, this.onTextLayout, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.onPlaceholderLayout, this.selectionController, this.color, this.autoSize, this.onShowTranslation, null);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(TextAnnotatedStringNode textAnnotatedStringNode) {
        textAnnotatedStringNode.doInvalidations(textAnnotatedStringNode.updateDraw(this.color, this.style), textAnnotatedStringNode.updateText$foundation_release(this.text), textAnnotatedStringNode.m28206updateLayoutRelatedArgsy0kMQk(this.style, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow, this.autoSize), textAnnotatedStringNode.updateCallbacks(this.onTextLayout, this.onPlaceholderLayout, this.selectionController, this.onShowTranslation));
    }

    private TextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, InterfaceC9540l interfaceC9540l, int i10, boolean z10, int i11, int i12, List<AnnotatedString.Range<Placeholder>> list, InterfaceC9540l interfaceC9540l2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, InterfaceC9540l interfaceC9540l3) {
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
        this.onShowTranslation = interfaceC9540l3;
    }
}
