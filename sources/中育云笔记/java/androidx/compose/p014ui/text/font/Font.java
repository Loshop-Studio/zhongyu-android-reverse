package androidx.compose.p014ui.text.font;

import androidx.compose.runtime.Immutable;
import p309qc.InterfaceC10770a;

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

    @InterfaceC10770a
    public interface ResourceLoader {
        @InterfaceC10770a
        Object load(Font font);
    }

    /* renamed from: getLoadingStrategy-PKNRLFQ */
    default int mo33022getLoadingStrategyPKNRLFQ() {
        return FontLoadingStrategy.Companion.m33069getBlockingPKNRLFQ();
    }

    /* renamed from: getStyle-_-LCdwA */
    int mo33030getStyle_LCdwA();

    FontWeight getWeight();
}
