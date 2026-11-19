package androidx.compose.p013ui.layout;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;
import p300x7.InterfaceC10574p;

@Immutable
/* loaded from: classes2.dex */
public abstract class AlignmentLine {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final int Unspecified = Integer.MIN_VALUE;
    private final InterfaceC10574p merger;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ AlignmentLine(InterfaceC10574p interfaceC10574p, AbstractC9126n abstractC9126n) {
        this(interfaceC10574p);
    }

    public final InterfaceC10574p getMerger$ui_release() {
        return this.merger;
    }

    private AlignmentLine(InterfaceC10574p interfaceC10574p) {
        this.merger = interfaceC10574p;
    }
}
