package androidx.compose.material3;

import androidx.compose.p011ui.focus.FocusManager;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
@DebugMetadata(m5302c = "androidx.compose.material3.SearchBarDefaults$InputField$5$1", m5303f = "SearchBar.android.kt", m5304i = {}, m5305l = {571}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes.dex */
public final class SearchBarDefaults$InputField$5$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ boolean $shouldClearFocus;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarDefaults$InputField$5$1(boolean z8, FocusManager focusManager, InterfaceC5631c<? super SearchBarDefaults$InputField$5$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$shouldClearFocus = z8;
        this.$focusManager = focusManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
        return new SearchBarDefaults$InputField$5$1(this.$shouldClearFocus, this.$focusManager, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            if (this.$shouldClearFocus) {
                this.label = 1;
                if (AbstractC6014x.m5638i(100L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return C5443s.f8405a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5774b.m5119b(obj);
        FocusManager.clearFocus$default(this.$focusManager, false, 1, null);
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    @Nullable
    public final Object invoke(@NotNull InterfaceC6009v interfaceC6009v, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((SearchBarDefaults$InputField$5$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
