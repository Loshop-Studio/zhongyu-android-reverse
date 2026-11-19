package androidx.compose.foundation.layout;

import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10773d;

/* loaded from: classes.dex */
final class LazyImpl implements InterfaceC10773d {
    public static final Companion Companion = new Companion(null);
    public static final int UNINITIALIZED_VALUE = -1;
    private int _value = -1;
    private final String errorMessage;
    private final InterfaceC9529a initializer;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    public LazyImpl(InterfaceC9529a interfaceC9529a, String str) {
        this.initializer = interfaceC9529a;
        this.errorMessage = str;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final InterfaceC9529a getInitializer() {
        return this.initializer;
    }

    @Override // p309qc.InterfaceC10773d
    public boolean isInitialized() {
        return this._value != -1;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue().intValue()) : this.errorMessage;
    }

    @Override // p309qc.InterfaceC10773d
    public Integer getValue() {
        if (this._value == -1) {
            this._value = ((Number) this.initializer.invoke()).intValue();
        }
        int i10 = this._value;
        if (i10 != -1) {
            return Integer.valueOf(i10);
        }
        throw new IllegalStateException(this.errorMessage);
    }
}
