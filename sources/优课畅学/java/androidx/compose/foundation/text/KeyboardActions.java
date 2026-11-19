package androidx.compose.foundation.text;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9126n;
import p300x7.InterfaceC10570l;

@Stable
/* loaded from: classes.dex */
public final class KeyboardActions {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final KeyboardActions Default = new KeyboardActions(null, null, null, null, null, null, 63, null);
    private final InterfaceC10570l onDone;
    private final InterfaceC10570l onGo;
    private final InterfaceC10570l onNext;
    private final InterfaceC10570l onPrevious;
    private final InterfaceC10570l onSearch;
    private final InterfaceC10570l onSend;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
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

    public final InterfaceC10570l getOnDone() {
        return this.onDone;
    }

    public final InterfaceC10570l getOnGo() {
        return this.onGo;
    }

    public final InterfaceC10570l getOnNext() {
        return this.onNext;
    }

    public final InterfaceC10570l getOnPrevious() {
        return this.onPrevious;
    }

    public final InterfaceC10570l getOnSearch() {
        return this.onSearch;
    }

    public final InterfaceC10570l getOnSend() {
        return this.onSend;
    }

    public int hashCode() {
        InterfaceC10570l interfaceC10570l = this.onDone;
        int iHashCode = (interfaceC10570l != null ? interfaceC10570l.hashCode() : 0) * 31;
        InterfaceC10570l interfaceC10570l2 = this.onGo;
        int iHashCode2 = (iHashCode + (interfaceC10570l2 != null ? interfaceC10570l2.hashCode() : 0)) * 31;
        InterfaceC10570l interfaceC10570l3 = this.onNext;
        int iHashCode3 = (iHashCode2 + (interfaceC10570l3 != null ? interfaceC10570l3.hashCode() : 0)) * 31;
        InterfaceC10570l interfaceC10570l4 = this.onPrevious;
        int iHashCode4 = (iHashCode3 + (interfaceC10570l4 != null ? interfaceC10570l4.hashCode() : 0)) * 31;
        InterfaceC10570l interfaceC10570l5 = this.onSearch;
        int iHashCode5 = (iHashCode4 + (interfaceC10570l5 != null ? interfaceC10570l5.hashCode() : 0)) * 31;
        InterfaceC10570l interfaceC10570l6 = this.onSend;
        return iHashCode5 + (interfaceC10570l6 != null ? interfaceC10570l6.hashCode() : 0);
    }

    public KeyboardActions(InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, InterfaceC10570l interfaceC10570l3, InterfaceC10570l interfaceC10570l4, InterfaceC10570l interfaceC10570l5, InterfaceC10570l interfaceC10570l6) {
        this.onDone = interfaceC10570l;
        this.onGo = interfaceC10570l2;
        this.onNext = interfaceC10570l3;
        this.onPrevious = interfaceC10570l4;
        this.onSearch = interfaceC10570l5;
        this.onSend = interfaceC10570l6;
    }

    public /* synthetic */ KeyboardActions(InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, InterfaceC10570l interfaceC10570l3, InterfaceC10570l interfaceC10570l4, InterfaceC10570l interfaceC10570l5, InterfaceC10570l interfaceC10570l6, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? null : interfaceC10570l, (i10 & 2) != 0 ? null : interfaceC10570l2, (i10 & 4) != 0 ? null : interfaceC10570l3, (i10 & 8) != 0 ? null : interfaceC10570l4, (i10 & 16) != 0 ? null : interfaceC10570l5, (i10 & 32) != 0 ? null : interfaceC10570l6);
    }
}
