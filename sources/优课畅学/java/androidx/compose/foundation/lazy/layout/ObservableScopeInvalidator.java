package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;

/* loaded from: classes.dex */
public final class ObservableScopeInvalidator {
    private final MutableState<C8736p> state;

    private /* synthetic */ ObservableScopeInvalidator(MutableState mutableState) {
        this.state = mutableState;
    }

    /* renamed from: attachToScope-impl, reason: not valid java name */
    public static final void m21037attachToScopeimpl(MutableState<C8736p> mutableState) {
        mutableState.getValue();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ObservableScopeInvalidator m21038boximpl(MutableState mutableState) {
        return new ObservableScopeInvalidator(mutableState);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static MutableState<C8736p> m21039constructorimpl(MutableState<C8736p> mutableState) {
        return mutableState;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ MutableState m21040constructorimpl$default(MutableState mutableState, int i10, AbstractC9126n abstractC9126n) {
        if ((i10 & 1) != 0) {
            mutableState = SnapshotStateKt.mutableStateOf(C8736p.f16368a, SnapshotStateKt.neverEqualPolicy());
        }
        return m21039constructorimpl(mutableState);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m21041equalsimpl(MutableState<C8736p> mutableState, Object obj) {
        return (obj instanceof ObservableScopeInvalidator) && AbstractC9133u.m16128b(mutableState, ((ObservableScopeInvalidator) obj).m21046unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m21042equalsimpl0(MutableState<C8736p> mutableState, MutableState<C8736p> mutableState2) {
        return AbstractC9133u.m16128b(mutableState, mutableState2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m21043hashCodeimpl(MutableState<C8736p> mutableState) {
        return mutableState.hashCode();
    }

    /* renamed from: invalidateScope-impl, reason: not valid java name */
    public static final void m21044invalidateScopeimpl(MutableState<C8736p> mutableState) {
        mutableState.setValue(C8736p.f16368a);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m21045toStringimpl(MutableState<C8736p> mutableState) {
        return "ObservableScopeInvalidator(state=" + mutableState + ')';
    }

    public boolean equals(Object obj) {
        return m21041equalsimpl(this.state, obj);
    }

    public int hashCode() {
        return m21043hashCodeimpl(this.state);
    }

    public String toString() {
        return m21045toStringimpl(this.state);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ MutableState m21046unboximpl() {
        return this.state;
    }
}
