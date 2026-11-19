package androidx.compose.material3.internal;

import android.content.res.Resources;
import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.C0785R;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.TooltipState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.C2142xe3d9cdbd;
import androidx.compose.p011ui.input.pointer.PointerEventPass;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.LiveRegionMode;
import androidx.compose.p011ui.semantics.SemanticsModifierKt;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.window.AndroidPopup_androidKt;
import androidx.compose.p011ui.window.PopupPositionProvider;
import androidx.compose.p011ui.window.PopupProperties;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.flow.InterfaceC5959y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\u001ac\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a<\u0010\u0010\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001aB\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a#\u0010\u0017\u001a\u00020\b*\u00020\b2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001b\u001a\u00020\b*\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m5110d2 = {"Landroidx/compose/ui/window/PopupPositionProvider;", "positionProvider", "Lkotlin/Function0;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "tooltip", "Landroidx/compose/material3/TooltipState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "", "focusable", "enableUserInput", "content", "BasicTooltipBox", "(Landroidx/compose/ui/window/PopupPositionProvider;Lr6/e;Landroidx/compose/material3/TooltipState;Landroidx/compose/ui/Modifier;ZZLr6/e;Landroidx/compose/runtime/Composer;II)V", "WrappedAnchor", "(ZLandroidx/compose/material3/TooltipState;Landroidx/compose/ui/Modifier;Lr6/e;Landroidx/compose/runtime/Composer;II)V", "Lkotlinx/coroutines/v;", "scope", "TooltipPopup", "(Landroidx/compose/ui/window/PopupPositionProvider;Landroidx/compose/material3/TooltipState;Lkotlinx/coroutines/v;ZLr6/e;Landroidx/compose/runtime/Composer;I)V", "enabled", "handleGestures", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/TooltipState;)Landroidx/compose/ui/Modifier;", "", "label", "anchorSemantics", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLandroidx/compose/material3/TooltipState;Lkotlinx/coroutines/v;)Landroidx/compose/ui/Modifier;", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBasicTooltip.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.android.kt\nandroidx/compose/material3/internal/BasicTooltip_androidKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,247:1\n488#2:248\n487#2,4:249\n491#2,2:256\n495#2:262\n488#2:310\n487#2,4:311\n491#2,2:318\n495#2:324\n1223#3,3:253\n1226#3,3:259\n1223#3,6:304\n1223#3,3:315\n1226#3,3:321\n1223#3,6:365\n487#4:258\n487#4:320\n71#5:263\n67#5,7:264\n74#5:299\n78#5:303\n71#5:325\n68#5,6:326\n74#5:360\n78#5:364\n78#6,6:271\n85#6,4:286\n89#6,2:296\n93#6:302\n78#6,6:332\n85#6,4:347\n89#6,2:357\n93#6:363\n368#7,9:277\n377#7:298\n378#7,2:300\n368#7,9:338\n377#7:359\n378#7,2:361\n4032#8,6:290\n4032#8,6:351\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.android.kt\nandroidx/compose/material3/internal/BasicTooltip_androidKt\n*L\n87#1:248\n87#1:249,4\n87#1:256,2\n87#1:262\n117#1:310\n117#1:311,4\n117#1:318,2\n117#1:324\n87#1:253,3\n87#1:259,3\n107#1:304,6\n117#1:315,3\n117#1:321,3\n140#1:365,6\n87#1:258\n117#1:320\n88#1:263\n88#1:264,7\n88#1:299\n88#1:303\n119#1:325\n119#1:326,6\n119#1:360\n119#1:364\n88#1:271,6\n88#1:286,4\n88#1:296,2\n88#1:302\n119#1:332,6\n119#1:347,4\n119#1:357,2\n119#1:363\n88#1:277,9\n88#1:298\n88#1:300,2\n119#1:338,9\n119#1:359\n119#1:361,2\n88#1:290,6\n119#1:351,6\n*E\n"})
/* loaded from: classes.dex */
public final class BasicTooltip_androidKt {

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/PointerInputScope;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
    @DebugMetadata(m5302c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1", m5303f = "BasicTooltip.android.kt", m5304i = {}, m5305l = {162}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1 */
    public static final class C19581 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ TooltipState $state;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
        @DebugMetadata(m5302c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1", m5303f = "BasicTooltip.android.kt", m5304i = {}, m5305l = {163}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
            final /* synthetic */ PointerInputScope $$this$pointerInput;
            final /* synthetic */ TooltipState $state;
            private /* synthetic */ Object L$0;
            int label;

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
            @DebugMetadata(m5302c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1", m5303f = "BasicTooltip.android.kt", m5304i = {0, 0, 0, 0, 1, 1, 1, 2}, m5305l = {171, 177, 197}, m5306m = "invokeSuspend", m5307n = {"$this$awaitEachGesture", "isLongPressedFlow", "pass", "longPressTimeout", "$this$awaitEachGesture", "isLongPressedFlow", "pass", "isLongPressedFlow"}, m5308s = {"L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "L$0"})
            /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C68681 extends RestrictedSuspendLambda implements InterfaceC6473e {
                final /* synthetic */ InterfaceC6009v $$this$coroutineScope;
                final /* synthetic */ TooltipState $state;
                long J$0;
                private /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                int label;

                @Metadata(m5109d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, m5110d2 = {"<anonymous>", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                @DebugMetadata(m5302c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$1", m5303f = "BasicTooltip.android.kt", m5304i = {}, m5305l = {178}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C68691 extends RestrictedSuspendLambda implements InterfaceC6473e {
                    final /* synthetic */ PointerEventPass $pass;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C68691(PointerEventPass pointerEventPass, InterfaceC5631c<? super C68691> interfaceC5631c) {
                        super(2, interfaceC5631c);
                        this.$pass = pointerEventPass;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
                        C68691 c68691 = new C68691(this.$pass, interfaceC5631c);
                        c68691.L$0 = obj;
                        return c68691;
                    }

                    @Override // p152r6.InterfaceC6473e
                    @Nullable
                    public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable InterfaceC5631c<? super PointerInputChange> interfaceC5631c) {
                        return ((C68691) create(awaitPointerEventScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i = this.label;
                        if (i != 0) {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC5774b.m5119b(obj);
                            return obj;
                        }
                        AbstractC5774b.m5119b(obj);
                        AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                        PointerEventPass pointerEventPass = this.$pass;
                        this.label = 1;
                        Object objWaitForUpOrCancellation = TapGestureDetectorKt.waitForUpOrCancellation(awaitPointerEventScope, pointerEventPass, this);
                        return objWaitForUpOrCancellation == coroutineSingletons ? coroutineSingletons : objWaitForUpOrCancellation;
                    }
                }

                @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
                @DebugMetadata(m5302c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2", m5303f = "BasicTooltip.android.kt", m5304i = {}, m5305l = {185, 187, 187}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2, reason: invalid class name */
                public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6473e {
                    final /* synthetic */ InterfaceC5959y $isLongPressedFlow;
                    final /* synthetic */ TooltipState $state;
                    Object L$0;
                    int label;

                    @Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"", "isLongPressed", "Ld6/s;", "<anonymous>", "(Z)V"}, m5111k = 3, m5112mv = {1, 8, 0})
                    @DebugMetadata(m5302c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2$1", m5303f = "BasicTooltip.android.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                    /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2$1, reason: invalid class name and collision with other inner class name */
                    public static final class C68701 extends SuspendLambda implements InterfaceC6473e {
                        final /* synthetic */ TooltipState $state;
                        /* synthetic */ boolean Z$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C68701(TooltipState tooltipState, InterfaceC5631c<? super C68701> interfaceC5631c) {
                            super(2, interfaceC5631c);
                            this.$state = tooltipState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
                            C68701 c68701 = new C68701(this.$state, interfaceC5631c);
                            c68701.Z$0 = ((Boolean) obj).booleanValue();
                            return c68701;
                        }

                        @Override // p152r6.InterfaceC6473e
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return invoke(((Boolean) obj).booleanValue(), (InterfaceC5631c<? super C5443s>) obj2);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC5774b.m5119b(obj);
                            if (!this.Z$0) {
                                this.$state.dismiss();
                            }
                            return C5443s.f8405a;
                        }

                        @Nullable
                        public final Object invoke(boolean z8, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
                            return ((C68701) create(Boolean.valueOf(z8), interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(InterfaceC5959y interfaceC5959y, TooltipState tooltipState, InterfaceC5631c<? super AnonymousClass2> interfaceC5631c) {
                        super(2, interfaceC5631c);
                        this.$isLongPressedFlow = interfaceC5959y;
                        this.$state = tooltipState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
                        return new AnonymousClass2(this.$isLongPressedFlow, this.$state, interfaceC5631c);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
                    
                        if (kotlinx.coroutines.flow.AbstractC5914h.m5552h(r7, r1, r6) == r0) goto L26;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r3v0 */
                    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.material3.TooltipState] */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @org.jetbrains.annotations.Nullable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) throws java.lang.Throwable {
                        /*
                            r6 = this;
                            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                            int r1 = r6.label
                            r2 = 0
                            r3 = 3
                            r4 = 2
                            r5 = 1
                            if (r1 == 0) goto L2a
                            if (r1 == r5) goto L24
                            if (r1 == r4) goto L20
                            if (r1 == r3) goto L18
                            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r7.<init>(r0)
                            throw r7
                        L18:
                            java.lang.Object r0 = r6.L$0
                            java.lang.Throwable r0 = (java.lang.Throwable) r0
                            kotlin.AbstractC5774b.m5119b(r7)
                            goto L6d
                        L20:
                            kotlin.AbstractC5774b.m5119b(r7)
                            goto L55
                        L24:
                            kotlin.AbstractC5774b.m5119b(r7)     // Catch: java.lang.Throwable -> L28
                            goto L43
                        L28:
                            r7 = move-exception
                            goto L58
                        L2a:
                            kotlin.AbstractC5774b.m5119b(r7)
                            kotlinx.coroutines.flow.y r7 = r6.$isLongPressedFlow     // Catch: java.lang.Throwable -> L28
                            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L28
                            kotlinx.coroutines.flow.n0 r7 = (kotlinx.coroutines.flow.C5946n0) r7     // Catch: java.lang.Throwable -> L28
                            r7.m5570j(r1)     // Catch: java.lang.Throwable -> L28
                            androidx.compose.material3.TooltipState r7 = r6.$state     // Catch: java.lang.Throwable -> L28
                            androidx.compose.foundation.MutatePriority r1 = androidx.compose.foundation.MutatePriority.PreventUserInput     // Catch: java.lang.Throwable -> L28
                            r6.label = r5     // Catch: java.lang.Throwable -> L28
                            java.lang.Object r7 = r7.show(r1, r6)     // Catch: java.lang.Throwable -> L28
                            if (r7 != r0) goto L43
                            goto L6b
                        L43:
                            kotlinx.coroutines.flow.y r7 = r6.$isLongPressedFlow
                            androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2$1 r1 = new androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2$1
                            androidx.compose.material3.TooltipState r3 = r6.$state
                            r1.<init>(r3, r2)
                            r6.label = r4
                            java.lang.Object r7 = kotlinx.coroutines.flow.AbstractC5914h.m5552h(r7, r1, r6)
                            if (r7 != r0) goto L55
                            goto L6b
                        L55:
                            d6.s r7 = p045d6.C5443s.f8405a
                            return r7
                        L58:
                            kotlinx.coroutines.flow.y r1 = r6.$isLongPressedFlow
                            androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2$1 r4 = new androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2$1
                            androidx.compose.material3.TooltipState r5 = r6.$state
                            r4.<init>(r5, r2)
                            r6.L$0 = r7
                            r6.label = r3
                            java.lang.Object r1 = kotlinx.coroutines.flow.AbstractC5914h.m5552h(r1, r4, r6)
                            if (r1 != r0) goto L6c
                        L6b:
                            return r0
                        L6c:
                            r0 = r7
                        L6d:
                            throw r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.BasicTooltip_androidKt.C19581.AnonymousClass1.C68681.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                    }

                    @Override // p152r6.InterfaceC6473e
                    @Nullable
                    public final Object invoke(@NotNull InterfaceC6009v interfaceC6009v, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
                        return ((AnonymousClass2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C68681(InterfaceC6009v interfaceC6009v, TooltipState tooltipState, InterfaceC5631c<? super C68681> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.$$this$coroutineScope = interfaceC6009v;
                    this.$state = tooltipState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
                    C68681 c68681 = new C68681(this.$$this$coroutineScope, this.$state, interfaceC5631c);
                    c68681.L$0 = obj;
                    return c68681;
                }

                @Override // p152r6.InterfaceC6473e
                @Nullable
                public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((C68681) create(awaitPointerEventScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:35:0x00d7, code lost:
                
                    if (r0 == r6) goto L36;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v6, types: [kotlinx.coroutines.flow.y] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r15) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instructions count: 240
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.BasicTooltip_androidKt.C19581.AnonymousClass1.C68681.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PointerInputScope pointerInputScope, TooltipState tooltipState, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.$$this$pointerInput = pointerInputScope;
                this.$state = tooltipState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$pointerInput, this.$state, interfaceC5631c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5774b.m5119b(obj);
                    InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
                    PointerInputScope pointerInputScope = this.$$this$pointerInput;
                    C68681 c68681 = new C68681(interfaceC6009v, this.$state, null);
                    this.label = 1;
                    if (ForEachGestureKt.awaitEachGesture(pointerInputScope, c68681, this) == coroutineSingletons) {
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
            @Nullable
            public final Object invoke(@NotNull InterfaceC6009v interfaceC6009v, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
                return ((AnonymousClass1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19581(TooltipState tooltipState, InterfaceC5631c<? super C19581> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$state = tooltipState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
            C19581 c19581 = new C19581(this.$state, interfaceC5631c);
            c19581.L$0 = obj;
            return c19581;
        }

        @Override // p152r6.InterfaceC6473e
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C19581) create(pointerInputScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.L$0, this.$state, null);
                this.label = 1;
                if (AbstractC6014x.m5637h(anonymousClass1, this) == coroutineSingletons) {
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

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/PointerInputScope;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
    @DebugMetadata(m5302c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2", m5303f = "BasicTooltip.android.kt", m5304i = {}, m5305l = {ComposerKt.reuseKey}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2 */
    public static final class C19592 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ TooltipState $state;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
        @DebugMetadata(m5302c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1", m5303f = "BasicTooltip.android.kt", m5304i = {}, m5305l = {208}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
            final /* synthetic */ PointerInputScope $$this$pointerInput;
            final /* synthetic */ TooltipState $state;
            private /* synthetic */ Object L$0;
            int label;

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
            @DebugMetadata(m5302c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1$1", m5303f = "BasicTooltip.android.kt", m5304i = {0, 0}, m5305l = {212}, m5306m = "invokeSuspend", m5307n = {"$this$awaitPointerEventScope", "pass"}, m5308s = {"L$0", "L$1"})
            /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C68711 extends RestrictedSuspendLambda implements InterfaceC6473e {
                final /* synthetic */ InterfaceC6009v $$this$coroutineScope;
                final /* synthetic */ TooltipState $state;
                private /* synthetic */ Object L$0;
                Object L$1;
                int label;

                @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
                @DebugMetadata(m5302c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1$1$1", m5303f = "BasicTooltip.android.kt", m5304i = {}, m5305l = {217}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C68721 extends SuspendLambda implements InterfaceC6473e {
                    final /* synthetic */ TooltipState $state;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C68721(TooltipState tooltipState, InterfaceC5631c<? super C68721> interfaceC5631c) {
                        super(2, interfaceC5631c);
                        this.$state = tooltipState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
                        return new C68721(this.$state, interfaceC5631c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i = this.label;
                        if (i == 0) {
                            AbstractC5774b.m5119b(obj);
                            TooltipState tooltipState = this.$state;
                            MutatePriority mutatePriority = MutatePriority.UserInput;
                            this.label = 1;
                            if (tooltipState.show(mutatePriority, this) == coroutineSingletons) {
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
                    @Nullable
                    public final Object invoke(@NotNull InterfaceC6009v interfaceC6009v, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
                        return ((C68721) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C68711(InterfaceC6009v interfaceC6009v, TooltipState tooltipState, InterfaceC5631c<? super C68711> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.$$this$coroutineScope = interfaceC6009v;
                    this.$state = tooltipState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
                    C68711 c68711 = new C68711(this.$$this$coroutineScope, this.$state, interfaceC5631c);
                    c68711.L$0 = obj;
                    return c68711;
                }

                @Override // p152r6.InterfaceC6473e
                @Nullable
                public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((C68711) create(awaitPointerEventScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }

                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0031 -> B:12:0x0034). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
                    /*
                        r7 = this;
                        kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r1 = r7.label
                        r2 = 1
                        if (r1 == 0) goto L1d
                        if (r1 != r2) goto L15
                        java.lang.Object r1 = r7.L$1
                        androidx.compose.ui.input.pointer.PointerEventPass r1 = (androidx.compose.p011ui.input.pointer.PointerEventPass) r1
                        java.lang.Object r3 = r7.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r3
                        kotlin.AbstractC5774b.m5119b(r8)
                        goto L34
                    L15:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r0)
                        throw r8
                    L1d:
                        kotlin.AbstractC5774b.m5119b(r8)
                        java.lang.Object r8 = r7.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r8
                        androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.p011ui.input.pointer.PointerEventPass.Main
                        r3 = r8
                    L27:
                        r7.L$0 = r3
                        r7.L$1 = r1
                        r7.label = r2
                        java.lang.Object r8 = r3.awaitPointerEvent(r1, r7)
                        if (r8 != r0) goto L34
                        return r0
                    L34:
                        androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.p011ui.input.pointer.PointerEvent) r8
                        java.util.List r4 = r8.getChanges()
                        r5 = 0
                        java.lang.Object r4 = r4.get(r5)
                        androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r4
                        int r4 = r4.getType()
                        androidx.compose.ui.input.pointer.PointerType$Companion r5 = androidx.compose.p011ui.input.pointer.PointerType.INSTANCE
                        int r5 = r5.m11984getMouseT8wyACA()
                        boolean r4 = androidx.compose.p011ui.input.pointer.PointerType.m11979equalsimpl0(r4, r5)
                        if (r4 == 0) goto L27
                        int r8 = r8.getType()
                        androidx.compose.ui.input.pointer.PointerEventType$Companion r4 = androidx.compose.p011ui.input.pointer.PointerEventType.INSTANCE
                        int r5 = r4.m11861getEnter7fucELk()
                        boolean r5 = androidx.compose.p011ui.input.pointer.PointerEventType.m11857equalsimpl0(r8, r5)
                        if (r5 == 0) goto L70
                        kotlinx.coroutines.v r8 = r7.$$this$coroutineScope
                        androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1$1$1 r4 = new androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1$1$1
                        androidx.compose.material3.TooltipState r5 = r7.$state
                        r6 = 0
                        r4.<init>(r5, r6)
                        r5 = 3
                        kotlinx.coroutines.AbstractC6014x.m5651v(r8, r6, r6, r4, r5)
                        goto L27
                    L70:
                        int r4 = r4.m11862getExit7fucELk()
                        boolean r8 = androidx.compose.p011ui.input.pointer.PointerEventType.m11857equalsimpl0(r8, r4)
                        if (r8 == 0) goto L27
                        androidx.compose.material3.TooltipState r8 = r7.$state
                        r8.dismiss()
                        goto L27
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.BasicTooltip_androidKt.C19592.AnonymousClass1.C68711.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PointerInputScope pointerInputScope, TooltipState tooltipState, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.$$this$pointerInput = pointerInputScope;
                this.$state = tooltipState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$pointerInput, this.$state, interfaceC5631c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5774b.m5119b(obj);
                    InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
                    PointerInputScope pointerInputScope = this.$$this$pointerInput;
                    C68711 c68711 = new C68711(interfaceC6009v, this.$state, null);
                    this.label = 1;
                    if (pointerInputScope.awaitPointerEventScope(c68711, this) == coroutineSingletons) {
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
            @Nullable
            public final Object invoke(@NotNull InterfaceC6009v interfaceC6009v, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
                return ((AnonymousClass1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19592(TooltipState tooltipState, InterfaceC5631c<? super C19592> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$state = tooltipState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
            C19592 c19592 = new C19592(this.$state, interfaceC5631c);
            c19592.L$0 = obj;
            return c19592;
        }

        @Override // p152r6.InterfaceC6473e
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C19592) create(pointerInputScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.L$0, this.$state, null);
                this.label = 1;
                if (AbstractC6014x.m5637h(anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ff  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTooltipBox(@org.jetbrains.annotations.NotNull final androidx.compose.p011ui.window.PopupPositionProvider r17, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r18, @org.jetbrains.annotations.NotNull androidx.compose.material3.TooltipState r19, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r20, boolean r21, boolean r22, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r23, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r24, final int r25, final int r26) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.BasicTooltip_androidKt.BasicTooltipBox(androidx.compose.ui.window.PopupPositionProvider, r6.e, androidx.compose.material3.TooltipState, androidx.compose.ui.Modifier, boolean, boolean, r6.e, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void TooltipPopup(final PopupPositionProvider popupPositionProvider, final TooltipState tooltipState, final InterfaceC6009v interfaceC6009v, final boolean z8, final InterfaceC6473e interfaceC6473e, Composer composer, final int i) throws Resources.NotFoundException {
        PopupPositionProvider popupPositionProvider2;
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-273292979);
        if ((i & 6) == 0) {
            popupPositionProvider2 = popupPositionProvider;
            i8 = (composerStartRestartGroup.changed(popupPositionProvider2) ? 4 : 2) | i;
        } else {
            popupPositionProvider2 = popupPositionProvider;
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= (i & 64) == 0 ? composerStartRestartGroup.changed(tooltipState) : composerStartRestartGroup.changedInstance(tooltipState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6009v) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= composerStartRestartGroup.changed(z8) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e) ? 16384 : 8192;
        }
        if ((i8 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-273292979, i8, -1, "androidx.compose.material3.internal.TooltipPopup (BasicTooltip.android.kt:135)");
            }
            boolean z9 = false;
            final String strStringResource = StringResources_androidKt.stringResource(C0785R.string.tooltip_description, composerStartRestartGroup, 0);
            if ((i8 & 112) == 32 || ((i8 & 64) != 0 && composerStartRestartGroup.changedInstance(tooltipState))) {
                z9 = true;
            }
            boolean zChangedInstance = z9 | composerStartRestartGroup.changedInstance(interfaceC6009v);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new InterfaceC6469a() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt$TooltipPopup$1$1

                    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
                    @DebugMetadata(m5302c = "androidx.compose.material3.internal.BasicTooltip_androidKt$TooltipPopup$1$1$1", m5303f = "BasicTooltip.android.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                    /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$TooltipPopup$1$1$1 */
                    public static final class C19531 extends SuspendLambda implements InterfaceC6473e {
                        final /* synthetic */ TooltipState $state;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C19531(TooltipState tooltipState, InterfaceC5631c<? super C19531> interfaceC5631c) {
                            super(2, interfaceC5631c);
                            this.$state = tooltipState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
                            return new C19531(this.$state, interfaceC5631c);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC5774b.m5119b(obj);
                            this.$state.dismiss();
                            return C5443s.f8405a;
                        }

                        @Override // p152r6.InterfaceC6473e
                        @Nullable
                        public final Object invoke(@NotNull InterfaceC6009v interfaceC6009v, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
                            return ((C19531) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m9310invoke();
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m9310invoke() {
                        if (tooltipState.getIsVisible()) {
                            AbstractC6014x.m5651v(interfaceC6009v, null, null, new C19531(tooltipState, null), 3);
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            AndroidPopup_androidKt.Popup(popupPositionProvider2, (InterfaceC6469a) objRememberedValue, new PopupProperties(z8, false, false, false, 14, (AbstractC5824e) null), ComposableLambdaKt.rememberComposableLambda(610617071, true, new InterfaceC6473e() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt.TooltipPopup.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer2, int i9) {
                    if ((i9 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(610617071, i9, -1, "androidx.compose.material3.internal.TooltipPopup.<anonymous> (BasicTooltip.android.kt:146)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    boolean zChanged = composer2.changed(strStringResource);
                    final String str = strStringResource;
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new InterfaceC6471c() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt$TooltipPopup$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p152r6.InterfaceC6471c
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((SemanticsPropertyReceiver) obj);
                                return C5443s.f8405a;
                            }

                            public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.m12550setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.INSTANCE.m12523getAssertive0phEisY());
                                SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion, false, (InterfaceC6471c) objRememberedValue2, 1, null);
                    InterfaceC6473e interfaceC6473e2 = interfaceC6473e;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierSemantics$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    InterfaceC6469a constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composer2);
                    InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion2, composerM10109constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
                    if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
                    }
                    Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (AbstractC0584a.m924y(composer2, 0, interfaceC6473e2)) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i8 & 14) | 3072, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt.TooltipPopup.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i9) throws Resources.NotFoundException {
                    BasicTooltip_androidKt.TooltipPopup(popupPositionProvider, tooltipState, interfaceC6009v, z8, interfaceC6473e, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void WrappedAnchor(final boolean z8, final TooltipState tooltipState, Modifier modifier, final InterfaceC6473e interfaceC6473e, Composer composer, final int i, final int i8) {
        int i9;
        Composer composerStartRestartGroup = composer.startRestartGroup(1848240995);
        if ((i8 & 1) != 0) {
            i9 = i | 6;
        } else if ((i & 6) == 0) {
            i9 = (composerStartRestartGroup.changed(z8) ? 4 : 2) | i;
        } else {
            i9 = i;
        }
        if ((i8 & 2) != 0) {
            i9 |= 48;
        } else if ((i & 48) == 0) {
            i9 |= (i & 64) == 0 ? composerStartRestartGroup.changed(tooltipState) : composerStartRestartGroup.changedInstance(tooltipState) ? 32 : 16;
        }
        int i10 = i8 & 4;
        if (i10 != 0) {
            i9 |= 384;
        } else if ((i & 384) == 0) {
            i9 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i8 & 8) != 0) {
            i9 |= 3072;
        } else if ((i & 3072) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6473e) ? 2048 : 1024;
        }
        if ((i9 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i10 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1848240995, i9, -1, "androidx.compose.material3.internal.WrappedAnchor (BasicTooltip.android.kt:115)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            Modifier modifierAnchorSemantics = anchorSemantics(handleGestures(modifier, z8, tooltipState), StringResources_androidKt.stringResource(C0785R.string.tooltip_label, composerStartRestartGroup, 0), z8, tooltipState, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAnchorSemantics);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            InterfaceC6469a constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composerStartRestartGroup);
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion, composerM10109constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (AbstractC0584a.m924y(composerStartRestartGroup, (i9 >> 9) & 14, interfaceC6473e)) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt.WrappedAnchor.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i11) {
                    BasicTooltip_androidKt.WrappedAnchor(z8, tooltipState, modifier2, interfaceC6473e, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i8);
                }
            });
        }
    }

    private static final Modifier anchorSemantics(Modifier modifier, final String str, boolean z8, final TooltipState tooltipState, final InterfaceC6009v interfaceC6009v) {
        return z8 ? SemanticsModifierKt.semantics(modifier, true, new InterfaceC6471c() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt.anchorSemantics.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return C5443s.f8405a;
            }

            public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                String str2 = str;
                final InterfaceC6009v interfaceC6009v2 = interfaceC6009v;
                final TooltipState tooltipState2 = tooltipState;
                SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver, str2, new InterfaceC6469a() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt.anchorSemantics.1.1

                    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
                    @DebugMetadata(m5302c = "androidx.compose.material3.internal.BasicTooltip_androidKt$anchorSemantics$1$1$1", m5303f = "BasicTooltip.android.kt", m5304i = {}, m5305l = {241}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                    /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$anchorSemantics$1$1$1, reason: invalid class name and collision with other inner class name */
                    public static final class C68671 extends SuspendLambda implements InterfaceC6473e {
                        final /* synthetic */ TooltipState $state;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C68671(TooltipState tooltipState, InterfaceC5631c<? super C68671> interfaceC5631c) {
                            super(2, interfaceC5631c);
                            this.$state = tooltipState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
                            return new C68671(this.$state, interfaceC5631c);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                AbstractC5774b.m5119b(obj);
                                TooltipState tooltipState = this.$state;
                                this.label = 1;
                                if (TooltipState.show$default(tooltipState, null, this, 1, null) == coroutineSingletons) {
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
                        @Nullable
                        public final Object invoke(@NotNull InterfaceC6009v interfaceC6009v, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
                            return ((C68671) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    @NotNull
                    public final Boolean invoke() {
                        AbstractC6014x.m5651v(interfaceC6009v2, null, null, new C68671(tooltipState2, null), 3);
                        return Boolean.TRUE;
                    }
                });
            }
        }) : modifier;
    }

    private static final Modifier handleGestures(Modifier modifier, boolean z8, TooltipState tooltipState) {
        return z8 ? modifier.then(new SuspendPointerInputElement(tooltipState, null, null, new C2142xe3d9cdbd(new C19581(tooltipState, null)), 6, null)).then(new SuspendPointerInputElement(tooltipState, null, null, new C2142xe3d9cdbd(new C19592(tooltipState, null)), 6, null)) : modifier;
    }
}
