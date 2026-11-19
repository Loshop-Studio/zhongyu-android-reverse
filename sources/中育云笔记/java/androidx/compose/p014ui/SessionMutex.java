package androidx.compose.p014ui;

import androidx.annotation.RestrictTo;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.AbstractC10006d;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import vc.InterfaceC11588c;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@InternalComposeUiApi
/* loaded from: classes2.dex */
public final class SessionMutex<T> {
    private final AtomicReference<Session<T>> currentSessionHolder;

    public static final class Session<T> {
        private final InterfaceC10045g job;
        private final T value;

        public Session(InterfaceC10045g interfaceC10045g, T t10) {
            this.job = interfaceC10045g;
            this.value = t10;
        }

        public final InterfaceC10045g getJob() {
            return this.job;
        }

        public final T getValue() {
            return this.value;
        }
    }

    private /* synthetic */ SessionMutex(AtomicReference atomicReference) {
        this.currentSessionHolder = atomicReference;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SessionMutex m30448boximpl(AtomicReference atomicReference) {
        return new SessionMutex(atomicReference);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static <T> AtomicReference<Session<T>> m30450constructorimpl(AtomicReference<Session<T>> atomicReference) {
        return atomicReference;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m30451equalsimpl(AtomicReference<Session<T>> atomicReference, Object obj) {
        return (obj instanceof SessionMutex) && AbstractC9979u.m20289b(atomicReference, ((SessionMutex) obj).m30457unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30452equalsimpl0(AtomicReference<Session<T>> atomicReference, AtomicReference<Session<T>> atomicReference2) {
        return AbstractC9979u.m20289b(atomicReference, atomicReference2);
    }

    /* renamed from: getCurrentSession-impl, reason: not valid java name */
    public static final T m30453getCurrentSessionimpl(AtomicReference<Session<T>> atomicReference) {
        Session<T> session = atomicReference.get();
        if (session != null) {
            return session.getValue();
        }
        return null;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m30454hashCodeimpl(AtomicReference<Session<T>> atomicReference) {
        return atomicReference.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m30455toStringimpl(AtomicReference<Session<T>> atomicReference) {
        return "SessionMutex(currentSessionHolder=" + atomicReference + ')';
    }

    /* renamed from: withSessionCancellingPrevious-impl, reason: not valid java name */
    public static final <R> Object m30456withSessionCancellingPreviousimpl(AtomicReference<Session<T>> atomicReference, InterfaceC9540l interfaceC9540l, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super R> interfaceC11588c) {
        return AbstractC10006d.m20748e(new SessionMutex$withSessionCancellingPrevious$2(interfaceC9540l, atomicReference, interfaceC9544p, null), interfaceC11588c);
    }

    public boolean equals(Object obj) {
        return m30451equalsimpl(this.currentSessionHolder, obj);
    }

    public int hashCode() {
        return m30454hashCodeimpl(this.currentSessionHolder);
    }

    public String toString() {
        return m30455toStringimpl(this.currentSessionHolder);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ AtomicReference m30457unboximpl() {
        return this.currentSessionHolder;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> AtomicReference<Session<T>> m30449constructorimpl() {
        return m30450constructorimpl(new AtomicReference(null));
    }
}
