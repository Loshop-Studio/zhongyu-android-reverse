package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;

@Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081@\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\bJ\u0010\u0010\u000f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0018\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019\u0088\u0001\u0004\u0092\u0001\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u001a"}, m5110d2 = {"Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "", "Landroidx/compose/runtime/MutableState;", "Ld6/s;", "state", "constructor-impl", "(Landroidx/compose/runtime/MutableState;)Landroidx/compose/runtime/MutableState;", "attachToScope-impl", "(Landroidx/compose/runtime/MutableState;)V", "attachToScope", "invalidateScope-impl", "invalidateScope", "", "toString-impl", "(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Landroidx/compose/runtime/MutableState;)I", "hashCode", "other", "", "equals-impl", "(Landroidx/compose/runtime/MutableState;Ljava/lang/Object;)Z", "equals", "Landroidx/compose/runtime/MutableState;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
/* loaded from: classes.dex */
public final class ObservableScopeInvalidator {

    @NotNull
    private final MutableState<C5443s> state;

    private /* synthetic */ ObservableScopeInvalidator(MutableState mutableState) {
        this.state = mutableState;
    }

    /* renamed from: attachToScope-impl, reason: not valid java name */
    public static final void m7443attachToScopeimpl(MutableState<C5443s> mutableState) {
        mutableState.getValue();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ObservableScopeInvalidator m7444boximpl(MutableState mutableState) {
        return new ObservableScopeInvalidator(mutableState);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static MutableState<C5443s> m7445constructorimpl(@NotNull MutableState<C5443s> mutableState) {
        return mutableState;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ MutableState m7446constructorimpl$default(MutableState mutableState, int i, AbstractC5824e abstractC5824e) {
        if ((i & 1) != 0) {
            mutableState = SnapshotStateKt.mutableStateOf(C5443s.f8405a, SnapshotStateKt.neverEqualPolicy());
        }
        return m7445constructorimpl(mutableState);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7447equalsimpl(MutableState<C5443s> mutableState, Object obj) {
        return (obj instanceof ObservableScopeInvalidator) && AbstractC5830k.m5325b(mutableState, ((ObservableScopeInvalidator) obj).getState());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7448equalsimpl0(MutableState<C5443s> mutableState, MutableState<C5443s> mutableState2) {
        return AbstractC5830k.m5325b(mutableState, mutableState2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7449hashCodeimpl(MutableState<C5443s> mutableState) {
        return mutableState.hashCode();
    }

    /* renamed from: invalidateScope-impl, reason: not valid java name */
    public static final void m7450invalidateScopeimpl(MutableState<C5443s> mutableState) {
        mutableState.setValue(C5443s.f8405a);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7451toStringimpl(MutableState<C5443s> mutableState) {
        return "ObservableScopeInvalidator(state=" + mutableState + ')';
    }

    public boolean equals(Object obj) {
        return m7447equalsimpl(this.state, obj);
    }

    public int hashCode() {
        return m7449hashCodeimpl(this.state);
    }

    public String toString() {
        return m7451toStringimpl(this.state);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ MutableState getState() {
        return this.state;
    }
}
