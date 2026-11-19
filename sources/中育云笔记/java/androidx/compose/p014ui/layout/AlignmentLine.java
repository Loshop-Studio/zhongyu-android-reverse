package androidx.compose.p014ui.layout;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9544p;

@Immutable
/* loaded from: classes2.dex */
public abstract class AlignmentLine {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final int Unspecified = Integer.MIN_VALUE;
    private final InterfaceC9544p merger;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ AlignmentLine(InterfaceC9544p interfaceC9544p, AbstractC9972n abstractC9972n) {
        this(interfaceC9544p);
    }

    public final InterfaceC9544p getMerger$ui_release() {
        return this.merger;
    }

    private AlignmentLine(InterfaceC9544p interfaceC9544p) {
        this.merger = interfaceC9544p;
    }
}
