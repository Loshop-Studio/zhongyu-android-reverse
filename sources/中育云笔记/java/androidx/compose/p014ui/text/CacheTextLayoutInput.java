package androidx.compose.p014ui.text;

import androidx.compose.p014ui.text.style.TextOverflow;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9979u;

@Immutable
/* loaded from: classes2.dex */
public final class CacheTextLayoutInput {
    public static final int $stable = 0;
    private final TextLayoutInput textLayoutInput;

    public CacheTextLayoutInput(TextLayoutInput textLayoutInput) {
        this.textLayoutInput = textLayoutInput;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CacheTextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput = this.textLayoutInput;
        CacheTextLayoutInput cacheTextLayoutInput = (CacheTextLayoutInput) obj;
        return AbstractC9979u.m20289b(textLayoutInput.getText(), cacheTextLayoutInput.textLayoutInput.getText()) && textLayoutInput.getStyle().hasSameLayoutAffectingAttributes(cacheTextLayoutInput.textLayoutInput.getStyle()) && AbstractC9979u.m20289b(textLayoutInput.getPlaceholders(), cacheTextLayoutInput.textLayoutInput.getPlaceholders()) && textLayoutInput.getMaxLines() == cacheTextLayoutInput.textLayoutInput.getMaxLines() && textLayoutInput.getSoftWrap() == cacheTextLayoutInput.textLayoutInput.getSoftWrap() && TextOverflow.m33427equalsimpl0(textLayoutInput.m32933getOverflowgIe3tQ8(), cacheTextLayoutInput.textLayoutInput.m32933getOverflowgIe3tQ8()) && AbstractC9979u.m20289b(textLayoutInput.getDensity(), cacheTextLayoutInput.textLayoutInput.getDensity()) && textLayoutInput.getLayoutDirection() == cacheTextLayoutInput.textLayoutInput.getLayoutDirection() && textLayoutInput.getFontFamilyResolver() == cacheTextLayoutInput.textLayoutInput.getFontFamilyResolver() && Constraints.m33447equalsimpl0(textLayoutInput.m32932getConstraintsmsEJaDk(), cacheTextLayoutInput.textLayoutInput.m32932getConstraintsmsEJaDk());
    }

    public final TextLayoutInput getTextLayoutInput() {
        return this.textLayoutInput;
    }

    public int hashCode() {
        TextLayoutInput textLayoutInput = this.textLayoutInput;
        return (((((((((((((((((textLayoutInput.getText().hashCode() * 31) + textLayoutInput.getStyle().hashCodeLayoutAffectingAttributes$ui_text_release()) * 31) + textLayoutInput.getPlaceholders().hashCode()) * 31) + textLayoutInput.getMaxLines()) * 31) + Boolean.hashCode(textLayoutInput.getSoftWrap())) * 31) + TextOverflow.m33428hashCodeimpl(textLayoutInput.m32933getOverflowgIe3tQ8())) * 31) + textLayoutInput.getDensity().hashCode()) * 31) + textLayoutInput.getLayoutDirection().hashCode()) * 31) + textLayoutInput.getFontFamilyResolver().hashCode()) * 31) + Constraints.m33457hashCodeimpl(textLayoutInput.m32932getConstraintsmsEJaDk());
    }
}
