package androidx.compose.foundation.layout;

import kotlin.jvm.internal.AbstractC9126n;
import p123h7.InterfaceC8724d;
import p300x7.InterfaceC10559a;

/* loaded from: classes.dex */
final class LazyImpl implements InterfaceC8724d {
    public static final Companion Companion = new Companion(null);
    public static final int UNINITIALIZED_VALUE = -1;
    private int _value = -1;
    private final String errorMessage;
    private final InterfaceC10559a initializer;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    public LazyImpl(InterfaceC10559a interfaceC10559a, String str) {
        this.initializer = interfaceC10559a;
        this.errorMessage = str;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final InterfaceC10559a getInitializer() {
        return this.initializer;
    }

    @Override // p123h7.InterfaceC8724d
    public boolean isInitialized() {
        return this._value != -1;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue().intValue()) : this.errorMessage;
    }

    @Override // p123h7.InterfaceC8724d
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
