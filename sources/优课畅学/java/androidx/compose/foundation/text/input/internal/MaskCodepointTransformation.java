package androidx.compose.foundation.text.input.internal;

/* loaded from: classes.dex */
final class MaskCodepointTransformation implements CodepointTransformation {
    private final char character;

    public MaskCodepointTransformation(char c10) {
        this.character = c10;
    }

    public static /* synthetic */ MaskCodepointTransformation copy$default(MaskCodepointTransformation maskCodepointTransformation, char c10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c10 = maskCodepointTransformation.character;
        }
        return maskCodepointTransformation.copy(c10);
    }

    public final char component1() {
        return this.character;
    }

    public final MaskCodepointTransformation copy(char c10) {
        return new MaskCodepointTransformation(c10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MaskCodepointTransformation) && this.character == ((MaskCodepointTransformation) obj).character;
    }

    public final char getCharacter() {
        return this.character;
    }

    public int hashCode() {
        return Character.hashCode(this.character);
    }

    public String toString() {
        return "MaskCodepointTransformation(character=" + this.character + ')';
    }

    @Override // androidx.compose.foundation.text.input.internal.CodepointTransformation
    public int transform(int i10, int i11) {
        return this.character;
    }
}
