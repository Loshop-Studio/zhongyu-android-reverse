package androidx.compose.foundation.text;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;

@Stable
/* loaded from: classes.dex */
public final class KeyboardActions {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final KeyboardActions Default = new KeyboardActions(null, null, null, null, null, null, 63, null);
    private final InterfaceC9540l onDone;
    private final InterfaceC9540l onGo;
    private final InterfaceC9540l onNext;
    private final InterfaceC9540l onPrevious;
    private final InterfaceC9540l onSearch;
    private final InterfaceC9540l onSend;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        @Stable
        public static /* synthetic */ void getDefault$annotations() {
        }

        public final KeyboardActions getDefault() {
            return KeyboardActions.Default;
        }

        private Companion() {
        }
    }

    public KeyboardActions() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyboardActions)) {
            return false;
        }
        KeyboardActions keyboardActions = (KeyboardActions) obj;
        return this.onDone == keyboardActions.onDone && this.onGo == keyboardActions.onGo && this.onNext == keyboardActions.onNext && this.onPrevious == keyboardActions.onPrevious && this.onSearch == keyboardActions.onSearch && this.onSend == keyboardActions.onSend;
    }

    public final InterfaceC9540l getOnDone() {
        return this.onDone;
    }

    public final InterfaceC9540l getOnGo() {
        return this.onGo;
    }

    public final InterfaceC9540l getOnNext() {
        return this.onNext;
    }

    public final InterfaceC9540l getOnPrevious() {
        return this.onPrevious;
    }

    public final InterfaceC9540l getOnSearch() {
        return this.onSearch;
    }

    public final InterfaceC9540l getOnSend() {
        return this.onSend;
    }

    public int hashCode() {
        InterfaceC9540l interfaceC9540l = this.onDone;
        int iHashCode = (interfaceC9540l != null ? interfaceC9540l.hashCode() : 0) * 31;
        InterfaceC9540l interfaceC9540l2 = this.onGo;
        int iHashCode2 = (iHashCode + (interfaceC9540l2 != null ? interfaceC9540l2.hashCode() : 0)) * 31;
        InterfaceC9540l interfaceC9540l3 = this.onNext;
        int iHashCode3 = (iHashCode2 + (interfaceC9540l3 != null ? interfaceC9540l3.hashCode() : 0)) * 31;
        InterfaceC9540l interfaceC9540l4 = this.onPrevious;
        int iHashCode4 = (iHashCode3 + (interfaceC9540l4 != null ? interfaceC9540l4.hashCode() : 0)) * 31;
        InterfaceC9540l interfaceC9540l5 = this.onSearch;
        int iHashCode5 = (iHashCode4 + (interfaceC9540l5 != null ? interfaceC9540l5.hashCode() : 0)) * 31;
        InterfaceC9540l interfaceC9540l6 = this.onSend;
        return iHashCode5 + (interfaceC9540l6 != null ? interfaceC9540l6.hashCode() : 0);
    }

    public KeyboardActions(InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9540l interfaceC9540l4, InterfaceC9540l interfaceC9540l5, InterfaceC9540l interfaceC9540l6) {
        this.onDone = interfaceC9540l;
        this.onGo = interfaceC9540l2;
        this.onNext = interfaceC9540l3;
        this.onPrevious = interfaceC9540l4;
        this.onSearch = interfaceC9540l5;
        this.onSend = interfaceC9540l6;
    }

    public /* synthetic */ KeyboardActions(InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9540l interfaceC9540l4, InterfaceC9540l interfaceC9540l5, InterfaceC9540l interfaceC9540l6, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? null : interfaceC9540l, (i10 & 2) != 0 ? null : interfaceC9540l2, (i10 & 4) != 0 ? null : interfaceC9540l3, (i10 & 8) != 0 ? null : interfaceC9540l4, (i10 & 16) != 0 ? null : interfaceC9540l5, (i10 & 32) != 0 ? null : interfaceC9540l6);
    }
}
