package androidx.compose.foundation.text.input.internal;

import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class ClipboardKeyCommandsHandler {
    private final InterfaceC9540l handler;

    private /* synthetic */ ClipboardKeyCommandsHandler(InterfaceC9540l interfaceC9540l) {
        this.handler = interfaceC9540l;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ClipboardKeyCommandsHandler m27978boximpl(InterfaceC9540l interfaceC9540l) {
        return new ClipboardKeyCommandsHandler(interfaceC9540l);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m27980equalsimpl(InterfaceC9540l interfaceC9540l, Object obj) {
        return (obj instanceof ClipboardKeyCommandsHandler) && AbstractC9979u.m20289b(interfaceC9540l, ((ClipboardKeyCommandsHandler) obj).m27984unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m27981equalsimpl0(InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
        return AbstractC9979u.m20289b(interfaceC9540l, interfaceC9540l2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m27982hashCodeimpl(InterfaceC9540l interfaceC9540l) {
        return interfaceC9540l.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m27983toStringimpl(InterfaceC9540l interfaceC9540l) {
        return "ClipboardKeyCommandsHandler(handler=" + interfaceC9540l + ')';
    }

    public boolean equals(Object obj) {
        return m27980equalsimpl(this.handler, obj);
    }

    public final InterfaceC9540l getHandler() {
        return this.handler;
    }

    public int hashCode() {
        return m27982hashCodeimpl(this.handler);
    }

    public String toString() {
        return m27983toStringimpl(this.handler);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ InterfaceC9540l m27984unboximpl() {
        return this.handler;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static InterfaceC9540l m27979constructorimpl(InterfaceC9540l interfaceC9540l) {
        return interfaceC9540l;
    }
}
