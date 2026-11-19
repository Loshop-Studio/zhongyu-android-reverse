package androidx.compose.material3;

import androidx.compose.p013ui.focus.FocusManager;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.material3.SearchBarDefaults$InputField$5$1", m17801f = "SearchBar.android.kt", m17802l = {571}, m17803m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SearchBarDefaults$InputField$5$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ boolean $shouldClearFocus;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarDefaults$InputField$5$1(boolean z10, FocusManager focusManager, InterfaceC9324c<? super SearchBarDefaults$InputField$5$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$shouldClearFocus = z10;
        this.$focusManager = focusManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new SearchBarDefaults$InputField$5$1(this.$shouldClearFocus, this.$focusManager, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((SearchBarDefaults$InputField$5$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            if (this.$shouldClearFocus) {
                this.label = 1;
                if (DelayKt.m16227b(100L, this) == objM17291f) {
                    return objM17291f;
                }
            }
            return C8736p.f16368a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        FocusManager.clearFocus$default(this.$focusManager, false, 1, null);
        return C8736p.f16368a;
    }
}
