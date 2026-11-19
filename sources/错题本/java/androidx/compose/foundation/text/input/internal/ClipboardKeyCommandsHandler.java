package androidx.compose.foundation.text.input.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081@\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0014\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0088\u0001\u0005\u0092\u0001\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\u0018"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/ClipboardKeyCommandsHandler;", "", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/KeyCommand;", "Ld6/s;", "handler", "constructor-impl", "(Lr6/c;)Lr6/c;", "", "toString-impl", "(Lr6/c;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Lr6/c;)I", "hashCode", "other", "", "equals-impl", "(Lr6/c;Ljava/lang/Object;)Z", "equals", "Lr6/c;", "getHandler", "()Lr6/c;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
/* loaded from: classes.dex */
public final class ClipboardKeyCommandsHandler {

    @NotNull
    private final InterfaceC6471c handler;

    private /* synthetic */ ClipboardKeyCommandsHandler(InterfaceC6471c interfaceC6471c) {
        this.handler = interfaceC6471c;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ClipboardKeyCommandsHandler m7782boximpl(InterfaceC6471c interfaceC6471c) {
        return new ClipboardKeyCommandsHandler(interfaceC6471c);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7784equalsimpl(InterfaceC6471c interfaceC6471c, Object obj) {
        return (obj instanceof ClipboardKeyCommandsHandler) && AbstractC5830k.m5325b(interfaceC6471c, ((ClipboardKeyCommandsHandler) obj).m7788unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7785equalsimpl0(InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2) {
        return AbstractC5830k.m5325b(interfaceC6471c, interfaceC6471c2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7786hashCodeimpl(InterfaceC6471c interfaceC6471c) {
        return interfaceC6471c.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7787toStringimpl(InterfaceC6471c interfaceC6471c) {
        return "ClipboardKeyCommandsHandler(handler=" + interfaceC6471c + ')';
    }

    public boolean equals(Object obj) {
        return m7784equalsimpl(this.handler, obj);
    }

    @NotNull
    public final InterfaceC6471c getHandler() {
        return this.handler;
    }

    public int hashCode() {
        return m7786hashCodeimpl(this.handler);
    }

    public String toString() {
        return m7787toStringimpl(this.handler);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ InterfaceC6471c m7788unboximpl() {
        return this.handler;
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static InterfaceC6471c m7783constructorimpl(@NotNull InterfaceC6471c interfaceC6471c) {
        return interfaceC6471c;
    }
}
