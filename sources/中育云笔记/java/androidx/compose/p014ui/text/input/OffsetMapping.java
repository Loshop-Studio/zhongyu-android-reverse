package androidx.compose.p014ui.text.input;

/* loaded from: classes2.dex */
public interface OffsetMapping {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final OffsetMapping Identity = new OffsetMapping() { // from class: androidx.compose.ui.text.input.OffsetMapping$Companion$Identity$1
            @Override // androidx.compose.p014ui.text.input.OffsetMapping
            public int originalToTransformed(int i10) {
                return i10;
            }

            @Override // androidx.compose.p014ui.text.input.OffsetMapping
            public int transformedToOriginal(int i10) {
                return i10;
            }
        };

        private Companion() {
        }

        public final OffsetMapping getIdentity() {
            return Identity;
        }
    }

    int originalToTransformed(int i10);

    int transformedToOriginal(int i10);
}
