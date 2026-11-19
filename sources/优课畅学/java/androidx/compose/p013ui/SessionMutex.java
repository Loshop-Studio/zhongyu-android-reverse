package androidx.compose.p013ui;

import androidx.annotation.RestrictTo;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.AbstractC9165e;
import kotlinx.coroutines.InterfaceC9212n;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@InternalComposeUiApi
/* loaded from: classes2.dex */
public final class SessionMutex<T> {
    private final AtomicReference<Session<T>> currentSessionHolder;

    public static final class Session<T> {
        private final InterfaceC9212n job;
        private final T value;

        public Session(InterfaceC9212n interfaceC9212n, T t10) {
            this.job = interfaceC9212n;
            this.value = t10;
        }

        public final InterfaceC9212n getJob() {
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
    public static final /* synthetic */ SessionMutex m23846boximpl(AtomicReference atomicReference) {
        return new SessionMutex(atomicReference);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static <T> AtomicReference<Session<T>> m23848constructorimpl(AtomicReference<Session<T>> atomicReference) {
        return atomicReference;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23849equalsimpl(AtomicReference<Session<T>> atomicReference, Object obj) {
        return (obj instanceof SessionMutex) && AbstractC9133u.m16128b(atomicReference, ((SessionMutex) obj).m23855unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23850equalsimpl0(AtomicReference<Session<T>> atomicReference, AtomicReference<Session<T>> atomicReference2) {
        return AbstractC9133u.m16128b(atomicReference, atomicReference2);
    }

    /* renamed from: getCurrentSession-impl, reason: not valid java name */
    public static final T m23851getCurrentSessionimpl(AtomicReference<Session<T>> atomicReference) {
        Session<T> session = atomicReference.get();
        if (session != null) {
            return session.getValue();
        }
        return null;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23852hashCodeimpl(AtomicReference<Session<T>> atomicReference) {
        return atomicReference.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m23853toStringimpl(AtomicReference<Session<T>> atomicReference) {
        return "SessionMutex(currentSessionHolder=" + atomicReference + ')';
    }

    /* renamed from: withSessionCancellingPrevious-impl, reason: not valid java name */
    public static final <R> Object m23854withSessionCancellingPreviousimpl(AtomicReference<Session<T>> atomicReference, InterfaceC10570l interfaceC10570l, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super R> interfaceC9324c) {
        return AbstractC9165e.m16556e(new SessionMutex$withSessionCancellingPrevious$2(interfaceC10570l, atomicReference, interfaceC10574p, null), interfaceC9324c);
    }

    public boolean equals(Object obj) {
        return m23849equalsimpl(this.currentSessionHolder, obj);
    }

    public int hashCode() {
        return m23852hashCodeimpl(this.currentSessionHolder);
    }

    public String toString() {
        return m23853toStringimpl(this.currentSessionHolder);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ AtomicReference m23855unboximpl() {
        return this.currentSessionHolder;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> AtomicReference<Session<T>> m23847constructorimpl() {
        return m23848constructorimpl(new AtomicReference(null));
    }
}
