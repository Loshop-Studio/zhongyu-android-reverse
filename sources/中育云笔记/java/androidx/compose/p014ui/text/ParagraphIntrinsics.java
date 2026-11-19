package androidx.compose.p014ui.text;

/* loaded from: classes2.dex */
public interface ParagraphIntrinsics {
    default boolean getHasStaleResolvedFonts() {
        return false;
    }

    float getMaxIntrinsicWidth();

    float getMinIntrinsicWidth();
}
