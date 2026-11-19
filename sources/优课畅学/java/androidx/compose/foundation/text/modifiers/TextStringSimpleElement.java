package androidx.compose.foundation.text.modifiers;

import androidx.compose.p013ui.graphics.ColorProducer;
import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.style.TextOverflow;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class TextStringSimpleElement extends ModifierNodeElement<TextStringSimpleNode> {
    public static final int $stable = 0;
    private final ColorProducer color;
    private final FontFamily.Resolver fontFamilyResolver;
    private final int maxLines;
    private final int minLines;
    private final int overflow;
    private final boolean softWrap;
    private final TextStyle style;
    private final String text;

    public /* synthetic */ TextStringSimpleElement(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i10, boolean z10, int i11, int i12, ColorProducer colorProducer, AbstractC9126n abstractC9126n) {
        this(str, textStyle, resolver, i10, z10, i11, i12, colorProducer);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return AbstractC9133u.m16128b(this.color, textStringSimpleElement.color) && AbstractC9133u.m16128b(this.text, textStringSimpleElement.text) && AbstractC9133u.m16128b(this.style, textStringSimpleElement.style) && AbstractC9133u.m16128b(this.fontFamilyResolver, textStringSimpleElement.fontFamilyResolver) && TextOverflow.m26825equalsimpl0(this.overflow, textStringSimpleElement.overflow) && this.softWrap == textStringSimpleElement.softWrap && this.maxLines == textStringSimpleElement.maxLines && this.minLines == textStringSimpleElement.minLines;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = ((((((((((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31) + TextOverflow.m26826hashCodeimpl(this.overflow)) * 31) + Boolean.hashCode(this.softWrap)) * 31) + this.maxLines) * 31) + this.minLines) * 31;
        ColorProducer colorProducer = this.color;
        return iHashCode + (colorProducer != null ? colorProducer.hashCode() : 0);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public /* synthetic */ TextStringSimpleElement(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i10, boolean z10, int i11, int i12, ColorProducer colorProducer, int i13, AbstractC9126n abstractC9126n) {
        this(str, textStyle, resolver, (i13 & 8) != 0 ? TextOverflow.Companion.m26834getClipgIe3tQ8() : i10, (i13 & 16) != 0 ? true : z10, (i13 & 32) != 0 ? Integer.MAX_VALUE : i11, (i13 & 64) != 0 ? 1 : i12, (i13 & 128) != 0 ? null : colorProducer, null);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public TextStringSimpleNode create() {
        return new TextStringSimpleNode(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.color, null);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(TextStringSimpleNode textStringSimpleNode) {
        textStringSimpleNode.doInvalidations(textStringSimpleNode.updateDraw(this.color, this.style), textStringSimpleNode.updateText(this.text), textStringSimpleNode.m21605updateLayoutRelatedArgsHuAbxIM(this.style, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow));
    }

    private TextStringSimpleElement(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i10, boolean z10, int i11, int i12, ColorProducer colorProducer) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i10;
        this.softWrap = z10;
        this.maxLines = i11;
        this.minLines = i12;
        this.color = colorProducer;
    }
}
