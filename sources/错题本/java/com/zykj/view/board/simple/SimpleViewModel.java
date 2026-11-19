package com.zykj.view.board.simple;

import android.view.ViewModel;
import android.view.ViewModelKt;
import android.view.serialization.ClassDiscriminatorModeKt;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.zykj.view.board.board.EraserType;
import com.zykj.view.board.board.ExpandStatus;
import com.zykj.view.board.board.MainToolType;
import com.zykj.view.board.board.MinorToolType;
import com.zykj.view.board.board.PenColor;
import com.zykj.view.board.simple.SimpleBoardEvent;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.C5901a0;
import kotlinx.coroutines.flow.C5911f0;
import kotlinx.coroutines.flow.C5946n0;
import kotlinx.coroutines.flow.C5960z;
import kotlinx.coroutines.flow.InterfaceC5905c0;
import kotlinx.coroutines.flow.InterfaceC5944m0;
import kotlinx.coroutines.flow.InterfaceC5958x;
import kotlinx.coroutines.flow.InterfaceC5959y;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0003J\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u0003J\u0015\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u0017J\r\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u0003J\u0015\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\nJ\r\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u0003R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020 0#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020)0,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, m5110d2 = {"Lcom/zykj/view/board/simple/SimpleViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "Ld6/s;", "updateConfigAboutPen", "updateConfigAboutEraser", "", "isTouchable", "updateTouchable", "(Z)V", "Lcom/zykj/view/board/board/MainToolType;", "mainToolType", "updateModeType", "(Lcom/zykj/view/board/board/MainToolType;)V", "switchPenTool", "Lcom/zykj/view/board/simple/SimplePenType;", "penType", "updatePenType", "(Lcom/zykj/view/board/simple/SimplePenType;)V", "", "level", "updatePenSizeLevel", "(I)V", "updatePenColorLevel", "switchEraserTool", "updateEraserSizeLevel", "handleExpandClick", "isOpen", "updateExpandState", "cleanPage", "Lkotlinx/coroutines/flow/y;", "Lcom/zykj/view/board/simple/SimpleUIState;", "_uiState", "Lkotlinx/coroutines/flow/y;", "Lkotlinx/coroutines/flow/m0;", "uiState", "Lkotlinx/coroutines/flow/m0;", "getUiState", "()Lkotlinx/coroutines/flow/m0;", "Lkotlinx/coroutines/flow/x;", "Lcom/zykj/view/board/simple/SimpleBoardEvent;", "_event", "Lkotlinx/coroutines/flow/x;", "Lkotlinx/coroutines/flow/c0;", NotificationCompat.CATEGORY_EVENT, "Lkotlinx/coroutines/flow/c0;", "getEvent", "()Lkotlinx/coroutines/flow/c0;", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSimpleViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,242:1\n226#2,5:243\n226#2,5:248\n226#2,5:253\n*S KotlinDebug\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel\n*L\n43#1:243,5\n67#1:248,5\n158#1:253,5\n*E\n"})
/* loaded from: classes3.dex */
public final class SimpleViewModel extends ViewModel {

    @NotNull
    private final InterfaceC5958x _event;

    @NotNull
    private final InterfaceC5959y _uiState;

    @NotNull
    private final InterfaceC5905c0 event;

    @NotNull
    private final InterfaceC5944m0 uiState;

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.view.board.simple.SimpleViewModel$cleanPage$1", m5303f = "SimpleViewModel.kt", m5304i = {}, m5305l = {237}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.view.board.simple.SimpleViewModel$cleanPage$1 */
    public static final class C53641 extends SuspendLambda implements InterfaceC6473e {
        int label;

        public C53641(InterfaceC5631c<? super C53641> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return SimpleViewModel.this.new C53641(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                InterfaceC5958x interfaceC5958x = SimpleViewModel.this._event;
                SimpleBoardEvent.Clean clean = SimpleBoardEvent.Clean.INSTANCE;
                this.label = 1;
                if (interfaceC5958x.emit(clean, this) == coroutineSingletons) {
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

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C53641) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.view.board.simple.SimpleViewModel$handleExpandClick$1", m5303f = "SimpleViewModel.kt", m5304i = {0}, m5305l = {ComposerKt.referenceKey}, m5306m = "invokeSuspend", m5307n = {"isOpen"}, m5308s = {"Z$0"})
    /* renamed from: com.zykj.view.board.simple.SimpleViewModel$handleExpandClick$1 */
    public static final class C53651 extends SuspendLambda implements InterfaceC6473e {
        boolean Z$0;
        int label;

        public C53651(InterfaceC5631c<? super C53651> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return SimpleViewModel.this.new C53651(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                boolean zM5325b = AbstractC5830k.m5325b(((SimpleUIState) ((C5946n0) SimpleViewModel.this._uiState).getValue()).getExpandStatus(), ExpandStatus.Collapse.INSTANCE);
                InterfaceC5958x interfaceC5958x = SimpleViewModel.this._event;
                SimpleBoardEvent.ExpandAnimate expandAnimate = new SimpleBoardEvent.ExpandAnimate(zM5325b);
                this.Z$0 = zM5325b;
                this.label = 1;
                if (interfaceC5958x.emit(expandAnimate, this) == coroutineSingletons) {
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

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C53651) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.view.board.simple.SimpleViewModel$updateConfigAboutEraser$1", m5303f = "SimpleViewModel.kt", m5304i = {0}, m5305l = {189}, m5306m = "invokeSuspend", m5307n = {"state"}, m5308s = {"L$0"})
    /* renamed from: com.zykj.view.board.simple.SimpleViewModel$updateConfigAboutEraser$1 */
    public static final class C53661 extends SuspendLambda implements InterfaceC6473e {
        Object L$0;
        int label;

        public C53661(InterfaceC5631c<? super C53661> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return SimpleViewModel.this.new C53661(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                SimpleUIState simpleUIState = (SimpleUIState) ((C5946n0) SimpleViewModel.this._uiState).getValue();
                InterfaceC5958x interfaceC5958x = SimpleViewModel.this._event;
                SimpleBoardEvent.SetEraserSize setEraserSize = new SimpleBoardEvent.SetEraserSize(simpleUIState.getEraserType().getSize());
                this.L$0 = null;
                this.label = 1;
                if (interfaceC5958x.emit(setEraserSize, this) == coroutineSingletons) {
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

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C53661) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.view.board.simple.SimpleViewModel$updateConfigAboutPen$1", m5303f = "SimpleViewModel.kt", m5304i = {0, 1, 2}, m5305l = {130, 136, 141}, m5306m = "invokeSuspend", m5307n = {"state", "state", "state"}, m5308s = {"L$0", "L$0", "L$0"})
    /* renamed from: com.zykj.view.board.simple.SimpleViewModel$updateConfigAboutPen$1 */
    public static final class C53671 extends SuspendLambda implements InterfaceC6473e {
        Object L$0;
        int label;

        public C53671(InterfaceC5631c<? super C53671> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return SimpleViewModel.this.new C53671(interfaceC5631c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00a2, code lost:
        
            if (r9.emit(r3, r8) != r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r8.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L30
                if (r1 == r4) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r0 = r8.L$0
                com.zykj.view.board.simple.SimpleUIState r0 = (com.zykj.view.board.simple.SimpleUIState) r0
                kotlin.AbstractC5774b.m5119b(r9)
                goto La5
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                java.lang.Object r1 = r8.L$0
                com.zykj.view.board.simple.SimpleUIState r1 = (com.zykj.view.board.simple.SimpleUIState) r1
                kotlin.AbstractC5774b.m5119b(r9)
                goto L86
            L28:
                java.lang.Object r1 = r8.L$0
                com.zykj.view.board.simple.SimpleUIState r1 = (com.zykj.view.board.simple.SimpleUIState) r1
                kotlin.AbstractC5774b.m5119b(r9)
                goto L68
            L30:
                kotlin.AbstractC5774b.m5119b(r9)
                com.zykj.view.board.simple.SimpleViewModel r9 = com.zykj.view.board.simple.SimpleViewModel.this
                kotlinx.coroutines.flow.y r9 = com.zykj.view.board.simple.SimpleViewModel.access$get_uiState$p(r9)
                kotlinx.coroutines.flow.n0 r9 = (kotlinx.coroutines.flow.C5946n0) r9
                java.lang.Object r9 = r9.getValue()
                com.zykj.view.board.simple.SimpleUIState r9 = (com.zykj.view.board.simple.SimpleUIState) r9
                com.zykj.view.board.simple.SimpleViewModel r1 = com.zykj.view.board.simple.SimpleViewModel.this
                kotlinx.coroutines.flow.x r1 = com.zykj.view.board.simple.SimpleViewModel.access$get_event$p(r1)
                com.zykj.view.board.simple.SimpleBoardEvent$SetPenMode r5 = new com.zykj.view.board.simple.SimpleBoardEvent$SetPenMode
                com.zykj.view.board.simple.SimplePenType r6 = r9.getPenType()
                int r6 = r6.getMode()
                com.zykj.view.board.simple.SimplePenType r7 = r9.getPenType()
                boolean r7 = r7.getIsPenDashed()
                r5.<init>(r6, r7)
                r8.L$0 = r9
                r8.label = r4
                java.lang.Object r1 = r1.emit(r5, r8)
                if (r1 != r0) goto L67
                goto La4
            L67:
                r1 = r9
            L68:
                com.zykj.view.board.simple.SimpleViewModel r9 = com.zykj.view.board.simple.SimpleViewModel.this
                kotlinx.coroutines.flow.x r9 = com.zykj.view.board.simple.SimpleViewModel.access$get_event$p(r9)
                com.zykj.view.board.simple.SimpleBoardEvent$SetPenSize r4 = new com.zykj.view.board.simple.SimpleBoardEvent$SetPenSize
                com.zykj.view.board.simple.SimplePenSize r5 = r1.getPenSize()
                float r5 = r5.getSize()
                r4.<init>(r5)
                r8.L$0 = r1
                r8.label = r3
                java.lang.Object r9 = r9.emit(r4, r8)
                if (r9 != r0) goto L86
                goto La4
            L86:
                com.zykj.view.board.simple.SimpleViewModel r9 = com.zykj.view.board.simple.SimpleViewModel.this
                kotlinx.coroutines.flow.x r9 = com.zykj.view.board.simple.SimpleViewModel.access$get_event$p(r9)
                com.zykj.view.board.simple.SimpleBoardEvent$SetPenColor r3 = new com.zykj.view.board.simple.SimpleBoardEvent$SetPenColor
                com.zykj.view.board.board.PenColor r1 = r1.getPenColor()
                int r1 = r1.getColor()
                r3.<init>(r1)
                r1 = 0
                r8.L$0 = r1
                r8.label = r2
                java.lang.Object r9 = r9.emit(r3, r8)
                if (r9 != r0) goto La5
            La4:
                return r0
            La5:
                d6.s r9 = p045d6.C5443s.f8405a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.board.simple.SimpleViewModel.C53671.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1.smali:187
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C53671) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.view.board.simple.SimpleViewModel$updateEraserSizeLevel$1", m5303f = "SimpleViewModel.kt", m5304i = {0}, m5305l = {175}, m5306m = "invokeSuspend", m5307n = {ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY}, m5308s = {"L$0"})
    @SourceDebugExtension({"SMAP\nSimpleViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel$updateEraserSizeLevel$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,242:1\n226#2,5:243\n*S KotlinDebug\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel$updateEraserSizeLevel$1\n*L\n174#1:243,5\n*E\n"})
    /* renamed from: com.zykj.view.board.simple.SimpleViewModel$updateEraserSizeLevel$1 */
    public static final class C53681 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ int $level;
        Object L$0;
        int label;
        final /* synthetic */ SimpleViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C53681(int i, SimpleViewModel simpleViewModel, InterfaceC5631c<? super C53681> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$level = i;
            this.this$0 = simpleViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return new C53681(this.$level, this.this$0, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C5946n0 c5946n0;
            Object value;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                EraserType eraserType = com.zykj.view.board.board.DataStateKt.getEraserTypeList().get(this.$level);
                InterfaceC5959y interfaceC5959y = this.this$0._uiState;
                do {
                    c5946n0 = (C5946n0) interfaceC5959y;
                    value = c5946n0.getValue();
                } while (!c5946n0.m5569i(value, SimpleUIState.copy$default((SimpleUIState) value, false, null, null, null, null, null, eraserType, null, 191, null)));
                InterfaceC5958x interfaceC5958x = this.this$0._event;
                SimpleBoardEvent.SetEraserSize setEraserSize = new SimpleBoardEvent.SetEraserSize(eraserType.getSize());
                this.L$0 = null;
                this.label = 1;
                if (interfaceC5958x.emit(setEraserSize, this) == coroutineSingletons) {
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

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C53681) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.view.board.simple.SimpleViewModel$updateExpandState$1", m5303f = "SimpleViewModel.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    @SourceDebugExtension({"SMAP\nSimpleViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,242:1\n226#2,5:243\n226#2,5:248\n*S KotlinDebug\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1\n*L\n216#1:243,5\n225#1:248,5\n*E\n"})
    /* renamed from: com.zykj.view.board.simple.SimpleViewModel$updateExpandState$1 */
    public static final class C53691 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ boolean $isOpen;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C53691(boolean z8, InterfaceC5631c<? super C53691> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$isOpen = z8;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return SimpleViewModel.this.new C53691(this.$isOpen, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C5946n0 c5946n0;
            Object value;
            C5946n0 c5946n02;
            Object value2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            InterfaceC5959y interfaceC5959y = SimpleViewModel.this._uiState;
            boolean z8 = this.$isOpen;
            do {
                c5946n0 = (C5946n0) interfaceC5959y;
                value = c5946n0.getValue();
            } while (!c5946n0.m5569i(value, SimpleUIState.copy$default((SimpleUIState) value, false, null, null, null, null, null, null, z8 ? ExpandStatus.Expanded.INSTANCE : ExpandStatus.Collapse.INSTANCE, 127, null)));
            if (!this.$isOpen) {
                InterfaceC5959y interfaceC5959y2 = SimpleViewModel.this._uiState;
                do {
                    c5946n02 = (C5946n0) interfaceC5959y2;
                    value2 = c5946n02.getValue();
                } while (!c5946n02.m5569i(value2, SimpleUIState.copy$default((SimpleUIState) value2, false, null, MinorToolType.Null.INSTANCE, null, null, null, null, null, 251, null)));
            }
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C53691) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.view.board.simple.SimpleViewModel$updatePenColorLevel$1", m5303f = "SimpleViewModel.kt", m5304i = {0}, m5305l = {115}, m5306m = "invokeSuspend", m5307n = {TypedValues.Custom.S_COLOR}, m5308s = {"L$0"})
    @SourceDebugExtension({"SMAP\nSimpleViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,242:1\n226#2,5:243\n*S KotlinDebug\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1\n*L\n114#1:243,5\n*E\n"})
    /* renamed from: com.zykj.view.board.simple.SimpleViewModel$updatePenColorLevel$1 */
    public static final class C53701 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ int $level;
        Object L$0;
        int label;
        final /* synthetic */ SimpleViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C53701(int i, SimpleViewModel simpleViewModel, InterfaceC5631c<? super C53701> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$level = i;
            this.this$0 = simpleViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return new C53701(this.$level, this.this$0, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C5946n0 c5946n0;
            Object value;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                PenColor penColor = com.zykj.view.board.board.DataStateKt.getPenColorList().get(this.$level);
                InterfaceC5959y interfaceC5959y = this.this$0._uiState;
                do {
                    c5946n0 = (C5946n0) interfaceC5959y;
                    value = c5946n0.getValue();
                } while (!c5946n0.m5569i(value, SimpleUIState.copy$default((SimpleUIState) value, false, null, null, null, null, penColor, null, null, 223, null)));
                InterfaceC5958x interfaceC5958x = this.this$0._event;
                SimpleBoardEvent.SetPenColor setPenColor = new SimpleBoardEvent.SetPenColor(penColor.getColor());
                this.L$0 = null;
                this.label = 1;
                if (interfaceC5958x.emit(setPenColor, this) == coroutineSingletons) {
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

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C53701) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.view.board.simple.SimpleViewModel$updatePenSizeLevel$1", m5303f = "SimpleViewModel.kt", m5304i = {0}, m5305l = {99}, m5306m = "invokeSuspend", m5307n = {"penSize"}, m5308s = {"L$0"})
    @SourceDebugExtension({"SMAP\nSimpleViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel$updatePenSizeLevel$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,242:1\n226#2,5:243\n*S KotlinDebug\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel$updatePenSizeLevel$1\n*L\n98#1:243,5\n*E\n"})
    /* renamed from: com.zykj.view.board.simple.SimpleViewModel$updatePenSizeLevel$1 */
    public static final class C53711 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ int $level;
        Object L$0;
        int label;
        final /* synthetic */ SimpleViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C53711(int i, SimpleViewModel simpleViewModel, InterfaceC5631c<? super C53711> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$level = i;
            this.this$0 = simpleViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return new C53711(this.$level, this.this$0, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C5946n0 c5946n0;
            Object value;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                SimplePenSize simplePenSize = DataStateKt.getSimplePenSizeList().get(this.$level);
                InterfaceC5959y interfaceC5959y = this.this$0._uiState;
                do {
                    c5946n0 = (C5946n0) interfaceC5959y;
                    value = c5946n0.getValue();
                } while (!c5946n0.m5569i(value, SimpleUIState.copy$default((SimpleUIState) value, false, null, null, null, simplePenSize, null, null, null, 239, null)));
                InterfaceC5958x interfaceC5958x = this.this$0._event;
                SimpleBoardEvent.SetPenSize setPenSize = new SimpleBoardEvent.SetPenSize(simplePenSize.getSize());
                this.L$0 = null;
                this.label = 1;
                if (interfaceC5958x.emit(setPenSize, this) == coroutineSingletons) {
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

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C53711) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.view.board.simple.SimpleViewModel$updatePenType$1", m5303f = "SimpleViewModel.kt", m5304i = {}, m5305l = {83}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    @SourceDebugExtension({"SMAP\nSimpleViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel$updatePenType$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,242:1\n226#2,5:243\n*S KotlinDebug\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel$updatePenType$1\n*L\n82#1:243,5\n*E\n"})
    /* renamed from: com.zykj.view.board.simple.SimpleViewModel$updatePenType$1 */
    public static final class C53721 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ SimplePenType $penType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C53721(SimplePenType simplePenType, InterfaceC5631c<? super C53721> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$penType = simplePenType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return SimpleViewModel.this.new C53721(this.$penType, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C5946n0 c5946n0;
            Object value;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                InterfaceC5959y interfaceC5959y = SimpleViewModel.this._uiState;
                SimplePenType simplePenType = this.$penType;
                do {
                    c5946n0 = (C5946n0) interfaceC5959y;
                    value = c5946n0.getValue();
                } while (!c5946n0.m5569i(value, SimpleUIState.copy$default((SimpleUIState) value, false, null, null, simplePenType, null, null, null, null, 247, null)));
                InterfaceC5958x interfaceC5958x = SimpleViewModel.this._event;
                SimpleBoardEvent.SetPenMode setPenMode = new SimpleBoardEvent.SetPenMode(this.$penType.getMode(), this.$penType.getIsPenDashed());
                this.label = 1;
                if (interfaceC5958x.emit(setPenMode, this) == coroutineSingletons) {
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

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C53721) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.view.board.simple.SimpleViewModel$updateTouchable$1", m5303f = "SimpleViewModel.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    @SourceDebugExtension({"SMAP\nSimpleViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,242:1\n226#2,5:243\n*S KotlinDebug\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1\n*L\n32#1:243,5\n*E\n"})
    /* renamed from: com.zykj.view.board.simple.SimpleViewModel$updateTouchable$1 */
    public static final class C53731 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ boolean $isTouchable;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C53731(boolean z8, InterfaceC5631c<? super C53731> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$isTouchable = z8;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return SimpleViewModel.this.new C53731(this.$isTouchable, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C5946n0 c5946n0;
            Object value;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            InterfaceC5959y interfaceC5959y = SimpleViewModel.this._uiState;
            boolean z8 = this.$isTouchable;
            do {
                c5946n0 = (C5946n0) interfaceC5959y;
                value = c5946n0.getValue();
            } while (!c5946n0.m5569i(value, SimpleUIState.copy$default((SimpleUIState) value, z8, null, null, null, null, null, null, null, 254, null)));
            SimpleViewModel.this._event.mo5527a(new SimpleBoardEvent.SetFingerTouchable(this.$isTouchable));
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C53731) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    public SimpleViewModel() {
        C5946n0 c5946n0M5546b = AbstractC5914h.m5546b(new SimpleUIState(false, null, null, null, null, null, null, null, 255, null));
        this._uiState = c5946n0M5546b;
        this.uiState = new C5901a0(c5946n0M5546b);
        C5911f0 c5911f0M5545a = AbstractC5914h.m5545a(0, 7, null);
        this._event = c5911f0M5545a;
        this.event = new C5960z(c5911f0M5545a);
    }

    private final void updateConfigAboutEraser() {
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new C53661(null), 3);
    }

    private final void updateConfigAboutPen() {
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new C53671(null), 3);
    }

    public static /* synthetic */ void updateTouchable$default(SimpleViewModel simpleViewModel, boolean z8, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = !((SimpleUIState) ((C5946n0) simpleViewModel._uiState).getValue()).isTouchable();
        }
        simpleViewModel.updateTouchable(z8);
    }

    public final void cleanPage() {
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new C53641(null), 3);
    }

    @NotNull
    public final InterfaceC5905c0 getEvent() {
        return this.event;
    }

    @NotNull
    public final InterfaceC5944m0 getUiState() {
        return this.uiState;
    }

    public final void handleExpandClick() {
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new C53651(null), 3);
    }

    public final void switchEraserTool() {
        C5946n0 c5946n0;
        Object value;
        SimpleUIState simpleUIState;
        MinorToolType minorToolType;
        InterfaceC5959y interfaceC5959y = this._uiState;
        do {
            c5946n0 = (C5946n0) interfaceC5959y;
            value = c5946n0.getValue();
            simpleUIState = (SimpleUIState) value;
            MinorToolType minorToolType2 = simpleUIState.getMinorToolType();
            minorToolType = MinorToolType.Eraser.INSTANCE;
            if (AbstractC5830k.m5325b(minorToolType2, minorToolType)) {
                minorToolType = MinorToolType.Null.INSTANCE;
            }
        } while (!c5946n0.m5569i(value, SimpleUIState.copy$default(simpleUIState, false, null, minorToolType, null, null, null, null, null, 251, null)));
    }

    public final void switchPenTool() {
        C5946n0 c5946n0;
        Object value;
        SimpleUIState simpleUIState;
        MinorToolType minorToolType;
        InterfaceC5959y interfaceC5959y = this._uiState;
        do {
            c5946n0 = (C5946n0) interfaceC5959y;
            value = c5946n0.getValue();
            simpleUIState = (SimpleUIState) value;
            MinorToolType minorToolType2 = simpleUIState.getMinorToolType();
            minorToolType = MinorToolType.Pen.INSTANCE;
            if (AbstractC5830k.m5325b(minorToolType2, minorToolType)) {
                minorToolType = MinorToolType.Null.INSTANCE;
            }
        } while (!c5946n0.m5569i(value, SimpleUIState.copy$default(simpleUIState, false, null, minorToolType, null, null, null, null, null, 251, null)));
    }

    public final void updateEraserSizeLevel(int level) {
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new C53681(level, this, null), 3);
    }

    public final void updateExpandState(boolean isOpen) {
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new C53691(isOpen, null), 3);
    }

    public final void updateModeType(@NotNull MainToolType mainToolType) {
        MainToolType mainToolType2;
        AbstractC5830k.m5330g(mainToolType, "mainToolType");
        InterfaceC5959y interfaceC5959y = this._uiState;
        while (true) {
            C5946n0 c5946n0 = (C5946n0) interfaceC5959y;
            Object value = c5946n0.getValue();
            mainToolType2 = mainToolType;
            if (c5946n0.m5569i(value, SimpleUIState.copy$default((SimpleUIState) value, false, mainToolType2, null, null, null, null, null, null, 253, null))) {
                break;
            } else {
                mainToolType = mainToolType2;
            }
        }
        if (mainToolType2 instanceof MainToolType.Pen) {
            updateConfigAboutPen();
        } else if (mainToolType2 instanceof MainToolType.Eraser) {
            updateConfigAboutEraser();
        }
    }

    public final void updatePenColorLevel(int level) {
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new C53701(level, this, null), 3);
    }

    public final void updatePenSizeLevel(int level) {
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new C53711(level, this, null), 3);
    }

    public final void updatePenType(@NotNull SimplePenType penType) {
        AbstractC5830k.m5330g(penType, "penType");
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new C53721(penType, null), 3);
    }

    public final void updateTouchable(boolean isTouchable) {
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new C53731(isTouchable, null), 3);
    }
}
