package androidx.compose.foundation.text.input.internal;

import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class ClipboardKeyCommandsHandler {
    private final InterfaceC10570l handler;

    private /* synthetic */ ClipboardKeyCommandsHandler(InterfaceC10570l interfaceC10570l) {
        this.handler = interfaceC10570l;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ClipboardKeyCommandsHandler m21376boximpl(InterfaceC10570l interfaceC10570l) {
        return new ClipboardKeyCommandsHandler(interfaceC10570l);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m21378equalsimpl(InterfaceC10570l interfaceC10570l, Object obj) {
        return (obj instanceof ClipboardKeyCommandsHandler) && AbstractC9133u.m16128b(interfaceC10570l, ((ClipboardKeyCommandsHandler) obj).m21382unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m21379equalsimpl0(InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
        return AbstractC9133u.m16128b(interfaceC10570l, interfaceC10570l2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m21380hashCodeimpl(InterfaceC10570l interfaceC10570l) {
        return interfaceC10570l.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m21381toStringimpl(InterfaceC10570l interfaceC10570l) {
        return "ClipboardKeyCommandsHandler(handler=" + interfaceC10570l + ')';
    }

    public boolean equals(Object obj) {
        return m21378equalsimpl(this.handler, obj);
    }

    public final InterfaceC10570l getHandler() {
        return this.handler;
    }

    public int hashCode() {
        return m21380hashCodeimpl(this.handler);
    }

    public String toString() {
        return m21381toStringimpl(this.handler);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ InterfaceC10570l m21382unboximpl() {
        return this.handler;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static InterfaceC10570l m21377constructorimpl(InterfaceC10570l interfaceC10570l) {
        return interfaceC10570l;
    }
}
