package androidx.compose.p013ui.text.input;

import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\u0005"}, m13558d2 = {"isSurrogatePair", "", "high", "", "low", "ui-text_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class EditCommandKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSurrogatePair(char c10, char c11) {
        return Character.isHighSurrogate(c10) && Character.isLowSurrogate(c11);
    }
}
