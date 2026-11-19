package androidx.compose.material3;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/PointerInputScope;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
@DebugMetadata(m5302c = "androidx.compose.material3.NavigationDrawerKt$Scrim$dismissDrawer$1$1", m5303f = "NavigationDrawer.kt", m5304i = {}, m5305l = {1146}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes.dex */
public final class NavigationDrawerKt$Scrim$dismissDrawer$1$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ InterfaceC6469a $onClose;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$Scrim$dismissDrawer$1$1(InterfaceC6469a interfaceC6469a, InterfaceC5631c<? super NavigationDrawerKt$Scrim$dismissDrawer$1$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$onClose = interfaceC6469a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
        NavigationDrawerKt$Scrim$dismissDrawer$1$1 navigationDrawerKt$Scrim$dismissDrawer$1$1 = new NavigationDrawerKt$Scrim$dismissDrawer$1$1(this.$onClose, interfaceC5631c);
        navigationDrawerKt$Scrim$dismissDrawer$1$1.L$0 = obj;
        return navigationDrawerKt$Scrim$dismissDrawer$1$1;
    }

    @Override // p152r6.InterfaceC6473e
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((NavigationDrawerKt$Scrim$dismissDrawer$1$1) create(pointerInputScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            final InterfaceC6469a interfaceC6469a = this.$onClose;
            InterfaceC6471c interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.material3.NavigationDrawerKt$Scrim$dismissDrawer$1$1.1
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m8696invokek4lQ0M(((Offset) obj2).m10451unboximpl());
                    return C5443s.f8405a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m8696invokek4lQ0M(long j7) {
                    interfaceC6469a.invoke();
                }
            };
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, interfaceC6471c, this, 7, null) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
        }
        return C5443s.f8405a;
    }
}
