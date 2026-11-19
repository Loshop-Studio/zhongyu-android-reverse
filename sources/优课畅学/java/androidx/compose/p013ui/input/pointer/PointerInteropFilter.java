package androidx.compose.p013ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.enums.AbstractC9108a;
import kotlin.jvm.internal.AbstractC9133u;
import p212p7.InterfaceC9760a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class PointerInteropFilter implements PointerInputModifier {
    public static final int $stable = 0;
    private boolean disallowIntercept;
    public InterfaceC10570l onTouchEvent;
    private final PointerInputFilter pointerInputFilter = new PointerInteropFilter$pointerInputFilter$1(this);
    private RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DispatchToViewState {
        private static final /* synthetic */ InterfaceC9760a $ENTRIES;
        private static final /* synthetic */ DispatchToViewState[] $VALUES;
        public static final DispatchToViewState Unknown = new DispatchToViewState("Unknown", 0);
        public static final DispatchToViewState Dispatching = new DispatchToViewState("Dispatching", 1);
        public static final DispatchToViewState NotDispatching = new DispatchToViewState("NotDispatching", 2);

        private static final /* synthetic */ DispatchToViewState[] $values() {
            return new DispatchToViewState[]{Unknown, Dispatching, NotDispatching};
        }

        static {
            DispatchToViewState[] dispatchToViewStateArr$values = $values();
            $VALUES = dispatchToViewStateArr$values;
            $ENTRIES = AbstractC9108a.m16085a(dispatchToViewStateArr$values);
        }

        private DispatchToViewState(String str, int i10) {
        }

        public static InterfaceC9760a getEntries() {
            return $ENTRIES;
        }

        public static DispatchToViewState valueOf(String str) {
            return (DispatchToViewState) Enum.valueOf(DispatchToViewState.class, str);
        }

        public static DispatchToViewState[] values() {
            return (DispatchToViewState[]) $VALUES.clone();
        }
    }

    public final boolean getDisallowIntercept$ui_release() {
        return this.disallowIntercept;
    }

    public final InterfaceC10570l getOnTouchEvent() {
        InterfaceC10570l interfaceC10570l = this.onTouchEvent;
        if (interfaceC10570l != null) {
            return interfaceC10570l;
        }
        AbstractC9133u.m16151y("onTouchEvent");
        return null;
    }

    @Override // androidx.compose.p013ui.input.pointer.PointerInputModifier
    public PointerInputFilter getPointerInputFilter() {
        return this.pointerInputFilter;
    }

    public final RequestDisallowInterceptTouchEvent getRequestDisallowInterceptTouchEvent() {
        return this.requestDisallowInterceptTouchEvent;
    }

    public final void setDisallowIntercept$ui_release(boolean z10) {
        this.disallowIntercept = z10;
    }

    public final void setOnTouchEvent(InterfaceC10570l interfaceC10570l) {
        this.onTouchEvent = interfaceC10570l;
    }

    public final void setRequestDisallowInterceptTouchEvent(RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent) {
        RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent2 = this.requestDisallowInterceptTouchEvent;
        if (requestDisallowInterceptTouchEvent2 != null) {
            requestDisallowInterceptTouchEvent2.setPointerInteropFilter$ui_release(null);
        }
        this.requestDisallowInterceptTouchEvent = requestDisallowInterceptTouchEvent;
        if (requestDisallowInterceptTouchEvent == null) {
            return;
        }
        requestDisallowInterceptTouchEvent.setPointerInteropFilter$ui_release(this);
    }
}
