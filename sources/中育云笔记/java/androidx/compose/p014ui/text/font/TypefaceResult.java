package androidx.compose.p014ui.text.font;

import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes2.dex */
public interface TypefaceResult extends State<Object> {

    @StabilityInferred(parameters = 1)
    public static final class Async implements TypefaceResult, State<Object> {
        public static final int $stable = 0;
        private final AsyncFontListLoader current;

        public Async(AsyncFontListLoader asyncFontListLoader) {
            this.current = asyncFontListLoader;
        }

        @Override // androidx.compose.p014ui.text.font.TypefaceResult
        public boolean getCacheable() {
            return this.current.getCacheable$ui_text_release();
        }

        public final AsyncFontListLoader getCurrent$ui_text_release() {
            return this.current;
        }

        @Override // androidx.compose.runtime.State
        public Object getValue() {
            return this.current.getValue();
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class Immutable implements TypefaceResult {
        public static final int $stable = 0;
        private final boolean cacheable;
        private final Object value;

        public Immutable(Object obj, boolean z10) {
            this.value = obj;
            this.cacheable = z10;
        }

        @Override // androidx.compose.p014ui.text.font.TypefaceResult
        public boolean getCacheable() {
            return this.cacheable;
        }

        @Override // androidx.compose.runtime.State
        public Object getValue() {
            return this.value;
        }

        public /* synthetic */ Immutable(Object obj, boolean z10, int i10, AbstractC9972n abstractC9972n) {
            this(obj, (i10 & 2) != 0 ? true : z10);
        }
    }

    boolean getCacheable();
}
