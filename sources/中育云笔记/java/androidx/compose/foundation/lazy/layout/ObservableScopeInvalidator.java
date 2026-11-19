package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class ObservableScopeInvalidator {
    private final MutableState<C10786q> state;

    private /* synthetic */ ObservableScopeInvalidator(MutableState mutableState) {
        this.state = mutableState;
    }

    /* renamed from: attachToScope-impl, reason: not valid java name */
    public static final void m27639attachToScopeimpl(MutableState<C10786q> mutableState) {
        mutableState.getValue();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ObservableScopeInvalidator m27640boximpl(MutableState mutableState) {
        return new ObservableScopeInvalidator(mutableState);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static MutableState<C10786q> m27641constructorimpl(MutableState<C10786q> mutableState) {
        return mutableState;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ MutableState m27642constructorimpl$default(MutableState mutableState, int i10, AbstractC9972n abstractC9972n) {
        if ((i10 & 1) != 0) {
            mutableState = SnapshotStateKt.mutableStateOf(C10786q.f26013a, SnapshotStateKt.neverEqualPolicy());
        }
        return m27641constructorimpl(mutableState);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m27643equalsimpl(MutableState<C10786q> mutableState, Object obj) {
        return (obj instanceof ObservableScopeInvalidator) && AbstractC9979u.m20289b(mutableState, ((ObservableScopeInvalidator) obj).m27648unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m27644equalsimpl0(MutableState<C10786q> mutableState, MutableState<C10786q> mutableState2) {
        return AbstractC9979u.m20289b(mutableState, mutableState2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m27645hashCodeimpl(MutableState<C10786q> mutableState) {
        return mutableState.hashCode();
    }

    /* renamed from: invalidateScope-impl, reason: not valid java name */
    public static final void m27646invalidateScopeimpl(MutableState<C10786q> mutableState) {
        mutableState.setValue(C10786q.f26013a);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m27647toStringimpl(MutableState<C10786q> mutableState) {
        return "ObservableScopeInvalidator(state=" + mutableState + ')';
    }

    public boolean equals(Object obj) {
        return m27643equalsimpl(this.state, obj);
    }

    public int hashCode() {
        return m27645hashCodeimpl(this.state);
    }

    public String toString() {
        return m27647toStringimpl(this.state);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ MutableState m27648unboximpl() {
        return this.state;
    }
}
