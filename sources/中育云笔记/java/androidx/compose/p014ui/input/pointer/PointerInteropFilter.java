package androidx.compose.p014ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.enums.AbstractC9953a;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p425yc.InterfaceC11943a;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class PointerInteropFilter implements PointerInputModifier {
    public static final int $stable = 0;
    private boolean disallowIntercept;
    public InterfaceC9540l onTouchEvent;
    private final PointerInputFilter pointerInputFilter = new PointerInteropFilter$pointerInputFilter$1(this);
    private RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DispatchToViewState {
        private static final /* synthetic */ InterfaceC11943a $ENTRIES;
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
            $ENTRIES = AbstractC9953a.m20230a(dispatchToViewStateArr$values);
        }

        private DispatchToViewState(String str, int i10) {
        }

        public static InterfaceC11943a getEntries() {
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

    public final InterfaceC9540l getOnTouchEvent() {
        InterfaceC9540l interfaceC9540l = this.onTouchEvent;
        if (interfaceC9540l != null) {
            return interfaceC9540l;
        }
        AbstractC9979u.m20312y("onTouchEvent");
        return null;
    }

    @Override // androidx.compose.p014ui.input.pointer.PointerInputModifier
    public PointerInputFilter getPointerInputFilter() {
        return this.pointerInputFilter;
    }

    public final RequestDisallowInterceptTouchEvent getRequestDisallowInterceptTouchEvent() {
        return this.requestDisallowInterceptTouchEvent;
    }

    public final void setDisallowIntercept$ui_release(boolean z10) {
        this.disallowIntercept = z10;
    }

    public final void setOnTouchEvent(InterfaceC9540l interfaceC9540l) {
        this.onTouchEvent = interfaceC9540l;
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
