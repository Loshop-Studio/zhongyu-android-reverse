package androidx.compose.p013ui.text.font;

import androidx.compose.runtime.Immutable;
import p123h7.InterfaceC8721a;

@Immutable
/* loaded from: classes2.dex */
public interface Font {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final long MaximumAsyncTimeoutMillis = 15000;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long MaximumAsyncTimeoutMillis = 15000;

        private Companion() {
        }
    }

    @InterfaceC8721a
    public interface ResourceLoader {
        @InterfaceC8721a
        Object load(Font font);
    }

    /* renamed from: getLoadingStrategy-PKNRLFQ */
    default int mo26420getLoadingStrategyPKNRLFQ() {
        return FontLoadingStrategy.Companion.m26467getBlockingPKNRLFQ();
    }

    /* renamed from: getStyle-_-LCdwA */
    int mo26428getStyle_LCdwA();

    FontWeight getWeight();
}
