package androidx.compose.p013ui.platform;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1", m17801f = "WindowInfo.kt", m17802l = {63}, m17803m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class WindowInfoKt$WindowFocusObserver$1$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ State<InterfaceC10570l> $callback;
    final /* synthetic */ WindowInfo $windowInfo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WindowInfoKt$WindowFocusObserver$1$1(WindowInfo windowInfo, State<? extends InterfaceC10570l> state, InterfaceC9324c<? super WindowInfoKt$WindowFocusObserver$1$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$windowInfo = windowInfo;
        this.$callback = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new WindowInfoKt$WindowFocusObserver$1$1(this.$windowInfo, this.$callback, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((WindowInfoKt$WindowFocusObserver$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            final WindowInfo windowInfo = this.$windowInfo;
            InterfaceC9266c interfaceC9266cSnapshotFlow = SnapshotStateKt.snapshotFlow(new InterfaceC10559a() { // from class: androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1.1
                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                public final Boolean invoke() {
                    return Boolean.valueOf(windowInfo.isWindowFocused());
                }
            });
            final State<InterfaceC10570l> state = this.$callback;
            InterfaceC9267d interfaceC9267d = new InterfaceC9267d() { // from class: androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1.2
                @Override // p169l8.InterfaceC9267d
                public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC9324c interfaceC9324c) {
                    return emit(((Boolean) obj2).booleanValue(), (InterfaceC9324c<? super C8736p>) interfaceC9324c);
                }

                public final Object emit(boolean z10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                    state.getValue().invoke(AbstractC9536a.m17796a(z10));
                    return C8736p.f16368a;
                }
            };
            this.label = 1;
            if (interfaceC9266cSnapshotFlow.collect(interfaceC9267d, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return C8736p.f16368a;
    }
}
