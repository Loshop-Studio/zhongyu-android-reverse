package androidx.compose.p014ui.input.key;

import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class KeyEvent {
    private final android.view.KeyEvent nativeKeyEvent;

    private /* synthetic */ KeyEvent(android.view.KeyEvent keyEvent) {
        this.nativeKeyEvent = keyEvent;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyEvent m31942boximpl(android.view.KeyEvent keyEvent) {
        return new KeyEvent(keyEvent);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static android.view.KeyEvent m31943constructorimpl(android.view.KeyEvent keyEvent) {
        return keyEvent;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m31944equalsimpl(android.view.KeyEvent keyEvent, Object obj) {
        return (obj instanceof KeyEvent) && AbstractC9979u.m20289b(keyEvent, ((KeyEvent) obj).m31948unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31945equalsimpl0(android.view.KeyEvent keyEvent, android.view.KeyEvent keyEvent2) {
        return AbstractC9979u.m20289b(keyEvent, keyEvent2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m31946hashCodeimpl(android.view.KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m31947toStringimpl(android.view.KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    public boolean equals(Object obj) {
        return m31944equalsimpl(this.nativeKeyEvent, obj);
    }

    public final android.view.KeyEvent getNativeKeyEvent() {
        return this.nativeKeyEvent;
    }

    public int hashCode() {
        return m31946hashCodeimpl(this.nativeKeyEvent);
    }

    public String toString() {
        return m31947toStringimpl(this.nativeKeyEvent);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ android.view.KeyEvent m31948unboximpl() {
        return this.nativeKeyEvent;
    }
}
