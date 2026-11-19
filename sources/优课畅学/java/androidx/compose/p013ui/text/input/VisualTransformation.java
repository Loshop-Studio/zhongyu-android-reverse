package androidx.compose.p013ui.text.input;

import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.input.VisualTransformation;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;

@Immutable
/* loaded from: classes2.dex */
public interface VisualTransformation {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final VisualTransformation None = new VisualTransformation() { // from class: androidx.compose.ui.text.input.f
            @Override // androidx.compose.p013ui.text.input.VisualTransformation
            public final TransformedText filter(AnnotatedString annotatedString) {
                return VisualTransformation.Companion.None$lambda$0(annotatedString);
            }
        };

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TransformedText None$lambda$0(AnnotatedString annotatedString) {
            return new TransformedText(annotatedString, OffsetMapping.Companion.getIdentity());
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }

        public final VisualTransformation getNone() {
            return None;
        }
    }

    TransformedText filter(AnnotatedString annotatedString);
}
