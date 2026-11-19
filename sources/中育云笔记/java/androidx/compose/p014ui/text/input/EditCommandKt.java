package androidx.compose.p014ui.text.input;

/* loaded from: classes2.dex */
public final class EditCommandKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSurrogatePair(char c10, char c11) {
        return Character.isHighSurrogate(c10) && Character.isLowSurrogate(c11);
    }
}
