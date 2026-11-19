package androidx.compose.p013ui.text.input;

import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import p113g8.AbstractC8687z;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class PasswordVisualTransformation implements VisualTransformation {
    public static final int $stable = 0;
    private final char mask;

    public PasswordVisualTransformation() {
        this((char) 0, 1, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PasswordVisualTransformation) && this.mask == ((PasswordVisualTransformation) obj).mask;
    }

    @Override // androidx.compose.p013ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString annotatedString) {
        return new TransformedText(new AnnotatedString(AbstractC8687z.m14097E(String.valueOf(this.mask), annotatedString.getText().length()), null, 2, null), OffsetMapping.Companion.getIdentity());
    }

    public final char getMask() {
        return this.mask;
    }

    public int hashCode() {
        return Character.hashCode(this.mask);
    }

    public PasswordVisualTransformation(char c10) {
        this.mask = c10;
    }

    public /* synthetic */ PasswordVisualTransformation(char c10, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? (char) 8226 : c10);
    }
}
