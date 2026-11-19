package androidx.compose.p014ui.text.android.selection;

/* loaded from: classes2.dex */
public interface SegmentFinder {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int DONE = -1;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int DONE = -1;

        private Companion() {
        }
    }

    int nextEndBoundary(int i10);

    int nextStartBoundary(int i10);

    int previousEndBoundary(int i10);

    int previousStartBoundary(int i10);
}
