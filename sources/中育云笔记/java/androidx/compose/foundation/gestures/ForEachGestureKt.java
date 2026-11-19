package androidx.compose.foundation.gestures;

import androidx.compose.p014ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p014ui.input.pointer.PointerEventPass;
import androidx.compose.p014ui.input.pointer.PointerInputChange;
import androidx.compose.p014ui.input.pointer.PointerInputScope;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.fastjson.asm.Opcodes;
import com.taobao.sophix.PatchStatus;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class ForEachGestureKt {

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2", m26211f = "ForEachGesture.kt", m26212l = {75}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2 */
    public static final class C13152 extends RestrictedSuspendLambda implements InterfaceC9544p {
        private /* synthetic */ Object L$0;
        int label;

        public C13152(InterfaceC11588c<? super C13152> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C13152 c13152 = new C13152(interfaceC11588c);
            c13152.L$0 = obj;
            return c13152;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C13152) create(awaitPointerEventScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                this.label = 1;
                if (ForEachGestureKt.awaitAllPointersUp$default(awaitPointerEventScope, null, this, 1, null) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.ForEachGestureKt", m26211f = "ForEachGesture.kt", m26212l = {PatchStatus.CODE_LOAD_FIND_METHOD}, m26213m = "awaitAllPointersUp")
    /* renamed from: androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 */
    public static final class C13163 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C13163(InterfaceC11588c<? super C13163> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ForEachGestureKt.awaitAllPointersUp(null, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", m26211f = "ForEachGesture.kt", m26212l = {102, PatchStatus.CODE_PRELOAD_REMOVE_BASEDEX, IjkMediaMeta.FF_PROFILE_H264_HIGH_10}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2 */
    public static final class C13172 extends RestrictedSuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9544p $block;
        final /* synthetic */ InterfaceC9945d $currentContext;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13172(InterfaceC9945d interfaceC9945d, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C13172> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$currentContext = interfaceC9945d;
            this.$block = interfaceC9544p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C13172 c13172 = new C13172(this.$currentContext, this.$block, interfaceC11588c);
            c13172.L$0 = obj;
            return c13172;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C13172) create(awaitPointerEventScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
        
            if (r9 != r0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
        
            if (r9 == r0) goto L34;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005a -> B:12:0x0029). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0071 -> B:12:0x0029). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                int r1 = r8.label
                r2 = 3
                r3 = 2
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L35
                if (r1 == r5) goto L2d
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r1 = r8.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC9924b.m20071b(r9)
                goto L29
            L1a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L22:
                java.lang.Object r1 = r8.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC9924b.m20071b(r9)     // Catch: java.util.concurrent.CancellationException -> L2b
            L29:
                r9 = r1
                goto L3c
            L2b:
                r9 = move-exception
                goto L61
            L2d:
                java.lang.Object r1 = r8.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC9924b.m20071b(r9)     // Catch: java.util.concurrent.CancellationException -> L2b
                goto L52
            L35:
                kotlin.AbstractC9924b.m20071b(r9)
                java.lang.Object r9 = r8.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r9
            L3c:
                kotlin.coroutines.d r1 = r8.$currentContext
                boolean r1 = sd.AbstractC11147o1.m24780n(r1)
                if (r1 == 0) goto L75
                hd.p r1 = r8.$block     // Catch: java.util.concurrent.CancellationException -> L5d
                r8.L$0 = r9     // Catch: java.util.concurrent.CancellationException -> L5d
                r8.label = r5     // Catch: java.util.concurrent.CancellationException -> L5d
                java.lang.Object r1 = r1.invoke(r9, r8)     // Catch: java.util.concurrent.CancellationException -> L5d
                if (r1 != r0) goto L51
                goto L73
            L51:
                r1 = r9
            L52:
                r8.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L2b
                r8.label = r3     // Catch: java.util.concurrent.CancellationException -> L2b
                java.lang.Object r9 = androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp$default(r1, r4, r8, r5, r4)     // Catch: java.util.concurrent.CancellationException -> L2b
                if (r9 != r0) goto L29
                goto L73
            L5d:
                r1 = move-exception
                r7 = r1
                r1 = r9
                r9 = r7
            L61:
                kotlin.coroutines.d r6 = r8.$currentContext
                boolean r6 = sd.AbstractC11147o1.m24780n(r6)
                if (r6 == 0) goto L74
                r8.L$0 = r1
                r8.label = r2
                java.lang.Object r9 = androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp$default(r1, r4, r8, r5, r4)
                if (r9 != r0) goto L29
            L73:
                return r0
            L74:
                throw r9
            L75:
                qc.q r9 = p309qc.C10786q.f26013a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.C13172.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.ForEachGestureKt", m26211f = "ForEachGesture.kt", m26212l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE, 51, Opcodes.FSTORE}, m26213m = "forEachGesture")
    /* renamed from: androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 */
    public static final class C13181 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C13181(InterfaceC11588c<? super C13181> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ForEachGestureKt.forEachGesture(null, null, this);
        }
    }

    public static final boolean allPointersUp(AwaitPointerEventScope awaitPointerEventScope) {
        List<PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
        int size = changes.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (changes.get(i10).getPressed()) {
                z10 = true;
                break;
            }
            i10++;
        }
        return !z10;
    }

    public static final Object awaitAllPointersUp(PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new C13152(null), interfaceC11588c);
        return objAwaitPointerEventScope == AbstractC11725a.m25952f() ? objAwaitPointerEventScope : C10786q.f26013a;
    }

    public static /* synthetic */ Object awaitAllPointersUp$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pointerEventPass = PointerEventPass.Final;
        }
        return awaitAllPointersUp(awaitPointerEventScope, pointerEventPass, interfaceC11588c);
    }

    public static final Object awaitEachGesture(PointerInputScope pointerInputScope, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new C13172(interfaceC11588c.getContext(), interfaceC9544p, null), interfaceC11588c);
        return objAwaitPointerEventScope == AbstractC11725a.m25952f() ? objAwaitPointerEventScope : C10786q.f26013a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0091, code lost:
    
        if (r10 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ab, code lost:
    
        if (r10 == r1) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.input.pointer.PointerInputScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.input.pointer.PointerInputScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.compose.ui.input.pointer.PointerInputScope] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0091 -> B:18:0x0052). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00ab -> B:18:0x0052). Please report as a decompilation issue!!! */
    @p309qc.InterfaceC10770a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object forEachGesture(androidx.compose.p014ui.input.pointer.PointerInputScope r8, p181hd.InterfaceC9544p r9, vc.InterfaceC11588c<? super p309qc.C10786q> r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.ForEachGestureKt.C13181
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt.C13181) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L67
            if (r2 == r5) goto L57
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r8 = r0.L$2
            kotlin.coroutines.d r8 = (kotlin.coroutines.InterfaceC9945d) r8
            java.lang.Object r9 = r0.L$1
            hd.p r9 = (p181hd.InterfaceC9544p) r9
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.pointer.PointerInputScope r2 = (androidx.compose.p014ui.input.pointer.PointerInputScope) r2
            kotlin.AbstractC9924b.m20071b(r10)
            goto L52
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            java.lang.Object r8 = r0.L$2
            kotlin.coroutines.d r8 = (kotlin.coroutines.InterfaceC9945d) r8
            java.lang.Object r9 = r0.L$1
            hd.p r9 = (p181hd.InterfaceC9544p) r9
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.pointer.PointerInputScope r2 = (androidx.compose.p014ui.input.pointer.PointerInputScope) r2
            kotlin.AbstractC9924b.m20071b(r10)     // Catch: java.util.concurrent.CancellationException -> L55
        L52:
            r10 = r8
            r8 = r2
            goto L6e
        L55:
            r10 = move-exception
            goto L99
        L57:
            java.lang.Object r8 = r0.L$2
            kotlin.coroutines.d r8 = (kotlin.coroutines.InterfaceC9945d) r8
            java.lang.Object r9 = r0.L$1
            hd.p r9 = (p181hd.InterfaceC9544p) r9
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.pointer.PointerInputScope r2 = (androidx.compose.p014ui.input.pointer.PointerInputScope) r2
            kotlin.AbstractC9924b.m20071b(r10)     // Catch: java.util.concurrent.CancellationException -> L55
            goto L85
        L67:
            kotlin.AbstractC9924b.m20071b(r10)
            kotlin.coroutines.d r10 = r0.getContext()
        L6e:
            boolean r2 = sd.AbstractC11147o1.m24780n(r10)
            if (r2 == 0) goto Laf
            r0.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L94
            r0.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> L94
            r0.L$2 = r10     // Catch: java.util.concurrent.CancellationException -> L94
            r0.label = r5     // Catch: java.util.concurrent.CancellationException -> L94
            java.lang.Object r2 = r9.invoke(r8, r0)     // Catch: java.util.concurrent.CancellationException -> L94
            if (r2 != r1) goto L83
            goto Lad
        L83:
            r2 = r8
            r8 = r10
        L85:
            r0.L$0 = r2     // Catch: java.util.concurrent.CancellationException -> L55
            r0.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> L55
            r0.L$2 = r8     // Catch: java.util.concurrent.CancellationException -> L55
            r0.label = r4     // Catch: java.util.concurrent.CancellationException -> L55
            java.lang.Object r10 = awaitAllPointersUp(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L55
            if (r10 != r1) goto L52
            goto Lad
        L94:
            r2 = move-exception
            r7 = r2
            r2 = r8
            r8 = r10
            r10 = r7
        L99:
            boolean r6 = sd.AbstractC11147o1.m24780n(r8)
            if (r6 == 0) goto Lae
            r0.L$0 = r2
            r0.L$1 = r9
            r0.L$2 = r8
            r0.label = r3
            java.lang.Object r10 = awaitAllPointersUp(r2, r0)
            if (r10 != r1) goto L52
        Lad:
            return r1
        Lae:
            throw r10
        Laf:
            qc.q r8 = p309qc.C10786q.f26013a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.forEachGesture(androidx.compose.ui.input.pointer.PointerInputScope, hd.p, vc.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (allPointersUp(r7) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:19:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitAllPointersUp(androidx.compose.p014ui.input.pointer.AwaitPointerEventScope r7, androidx.compose.p014ui.input.pointer.PointerEventPass r8, vc.InterfaceC11588c<? super p309qc.C10786q> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.ForEachGestureKt.C13163
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt.C13163) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r7 = (androidx.compose.p014ui.input.pointer.PointerEventPass) r7
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.AbstractC9924b.m20071b(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L52
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            kotlin.AbstractC9924b.m20071b(r9)
            boolean r9 = allPointersUp(r7)
            if (r9 != 0) goto L72
        L45:
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r9 = r7.awaitPointerEvent(r8, r0)
            if (r9 != r1) goto L52
            return r1
        L52:
            androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.p014ui.input.pointer.PointerEvent) r9
            java.util.List r9 = r9.getChanges()
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r4 = 0
        L60:
            if (r4 >= r2) goto L72
            java.lang.Object r5 = r9.get(r4)
            androidx.compose.ui.input.pointer.PointerInputChange r5 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r5
            boolean r5 = r5.getPressed()
            if (r5 == 0) goto L6f
            goto L45
        L6f:
            int r4 = r4 + 1
            goto L60
        L72:
            qc.q r7 = p309qc.C10786q.f26013a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass, vc.c):java.lang.Object");
    }
}
