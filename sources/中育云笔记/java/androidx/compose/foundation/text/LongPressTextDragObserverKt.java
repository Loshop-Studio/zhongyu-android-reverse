package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p014ui.input.pointer.PointerInputChange;
import androidx.compose.p014ui.input.pointer.PointerInputScope;
import com.alibaba.fastjson.asm.Opcodes;
import com.taobao.sophix.PatchStatus;
import com.tendcloud.tenddata.C7843ab;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC10006d;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class LongPressTextDragObserverKt {

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", m26211f = "LongPressTextDragObserver.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2 */
    public static final class C17222 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ TextDragObserver $observer;
        final /* synthetic */ PointerInputScope $this_detectDownAndDragGesturesWithObserver;
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", m26211f = "LongPressTextDragObserver.kt", m26212l = {77}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ TextDragObserver $observer;
            final /* synthetic */ PointerInputScope $this_detectDownAndDragGesturesWithObserver;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.$this_detectDownAndDragGesturesWithObserver = pointerInputScope;
                this.$observer = textDragObserver;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                return new AnonymousClass1(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    PointerInputScope pointerInputScope = this.$this_detectDownAndDragGesturesWithObserver;
                    TextDragObserver textDragObserver = this.$observer;
                    this.label = 1;
                    if (LongPressTextDragObserverKt.detectPreDragGesturesWithObserver(pointerInputScope, textDragObserver, this) == objM25952f) {
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

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", m26211f = "LongPressTextDragObserver.kt", m26212l = {PatchStatus.CODE_LOAD_JIT_CLEAR}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ TextDragObserver $observer;
            final /* synthetic */ PointerInputScope $this_detectDownAndDragGesturesWithObserver;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, InterfaceC11588c<? super AnonymousClass2> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.$this_detectDownAndDragGesturesWithObserver = pointerInputScope;
                this.$observer = textDragObserver;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                return new AnonymousClass2(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    PointerInputScope pointerInputScope = this.$this_detectDownAndDragGesturesWithObserver;
                    TextDragObserver textDragObserver = this.$observer;
                    this.label = 1;
                    if (LongPressTextDragObserverKt.detectDragGesturesWithObserver(pointerInputScope, textDragObserver, this) == objM25952f) {
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

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17222(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, InterfaceC11588c<? super C17222> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$this_detectDownAndDragGesturesWithObserver = pointerInputScope;
            this.$observer = textDragObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C17222 c17222 = new C17222(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, interfaceC11588c);
            c17222.L$0 = obj;
            return c17222;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
            CoroutineStart coroutineStart = CoroutineStart.f23479f;
            AbstractC11117h.m24726d(interfaceC11122i0, null, coroutineStart, new AnonymousClass1(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, null), 1, null);
            return AbstractC11117h.m24726d(interfaceC11122i0, null, coroutineStart, new AnonymousClass2(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, null), 1, null);
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super InterfaceC10045g> interfaceC11588c) {
            return ((C17222) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", m26211f = "LongPressTextDragObserver.kt", m26212l = {Opcodes.POP, C7843ab.b.API_MYNA_START}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 */
    public static final class C17312 extends RestrictedSuspendLambda implements InterfaceC9544p {
        final /* synthetic */ TextDragObserver $observer;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17312(TextDragObserver textDragObserver, InterfaceC11588c<? super C17312> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$observer = textDragObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C17312 c17312 = new C17312(this.$observer, interfaceC11588c);
            c17312.L$0 = obj;
            return c17312;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C17312) create(awaitPointerEventScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
        
            if (r14 != r0) goto L18;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005d -> B:18:0x0060). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                r13 = this;
                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                int r1 = r13.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2c
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r13.L$1
                androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r1
                java.lang.Object r4 = r13.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r4
                kotlin.AbstractC9924b.m20071b(r14)
                r7 = r13
                goto L60
            L1b:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L23:
                java.lang.Object r1 = r13.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC9924b.m20071b(r14)
                r7 = r13
                goto L45
            L2c:
                kotlin.AbstractC9924b.m20071b(r14)
                java.lang.Object r14 = r13.L$0
                r4 = r14
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r4
                r13.L$0 = r4
                r13.label = r3
                r5 = 0
                r6 = 0
                r8 = 2
                r9 = 0
                r7 = r13
                java.lang.Object r14 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r4, r5, r6, r7, r8, r9)
                if (r14 != r0) goto L44
                goto L5f
            L44:
                r1 = r4
            L45:
                androidx.compose.ui.input.pointer.PointerInputChange r14 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r14
                androidx.compose.foundation.text.TextDragObserver r4 = r7.$observer
                long r5 = r14.m32104getPositionF1C5BW0()
                r4.mo27888onDownk4lQ0M(r5)
                r4 = r1
                r1 = r14
            L52:
                r7.L$0 = r4
                r7.L$1 = r1
                r7.label = r2
                r14 = 0
                java.lang.Object r14 = androidx.compose.p014ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r4, r14, r13, r3, r14)
                if (r14 != r0) goto L60
            L5f:
                return r0
            L60:
                androidx.compose.ui.input.pointer.PointerEvent r14 = (androidx.compose.p014ui.input.pointer.PointerEvent) r14
                java.util.List r14 = r14.getChanges()
                r5 = r14
                java.util.Collection r5 = (java.util.Collection) r5
                int r5 = r5.size()
                r6 = 0
            L6e:
                if (r6 >= r5) goto L8e
                java.lang.Object r8 = r14.get(r6)
                androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r8
                long r9 = r8.m32102getIdJ3iCeTQ()
                long r11 = r1.m32102getIdJ3iCeTQ()
                boolean r9 = androidx.compose.p014ui.input.pointer.PointerId.m32086equalsimpl0(r9, r11)
                if (r9 == 0) goto L8b
                boolean r8 = r8.getPressed()
                if (r8 == 0) goto L8b
                goto L52
            L8b:
                int r6 = r6 + 1
                goto L6e
            L8e:
                androidx.compose.foundation.text.TextDragObserver r14 = r7.$observer
                r14.onUp()
                qc.q r14 = p309qc.C10786q.f26013a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.LongPressTextDragObserverKt.C17312.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object detectDownAndDragGesturesWithObserver(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objM20748e = AbstractC10006d.m20748e(new C17222(pointerInputScope, textDragObserver, null), interfaceC11588c);
        return objM20748e == AbstractC11725a.m25952f() ? objM20748e : C10786q.f26013a;
    }

    public static final Object detectDragGesturesAfterLongPressWithObserver(PointerInputScope pointerInputScope, final TextDragObserver textDragObserver, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objDetectDragGesturesAfterLongPress = DragGestureDetectorKt.detectDragGesturesAfterLongPress(pointerInputScope, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt.detectDragGesturesAfterLongPressWithObserver.2
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m27830invokek4lQ0M(((Offset) obj).m30647unboximpl());
                return C10786q.f26013a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m27830invokek4lQ0M(long j10) {
                textDragObserver.mo27890onStartk4lQ0M(j10);
            }
        }, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt.detectDragGesturesAfterLongPressWithObserver.3
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27831invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27831invoke() {
                textDragObserver.onStop();
            }
        }, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt.detectDragGesturesAfterLongPressWithObserver.4
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27832invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27832invoke() {
                textDragObserver.onCancel();
            }
        }, new InterfaceC9544p() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt.detectDragGesturesAfterLongPressWithObserver.5
            {
                super(2);
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                m27833invokeUv8p0NA((PointerInputChange) obj, ((Offset) obj2).m30647unboximpl());
                return C10786q.f26013a;
            }

            /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
            public final void m27833invokeUv8p0NA(PointerInputChange pointerInputChange, long j10) {
                textDragObserver.mo27889onDragk4lQ0M(j10);
            }
        }, interfaceC11588c);
        return objDetectDragGesturesAfterLongPress == AbstractC11725a.m25952f() ? objDetectDragGesturesAfterLongPress : C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectDragGesturesWithObserver(PointerInputScope pointerInputScope, final TextDragObserver textDragObserver, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objDetectDragGestures = DragGestureDetectorKt.detectDragGestures(pointerInputScope, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt.detectDragGesturesWithObserver.2
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m27834invokek4lQ0M(((Offset) obj).m30647unboximpl());
                return C10786q.f26013a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m27834invokek4lQ0M(long j10) {
                textDragObserver.mo27890onStartk4lQ0M(j10);
            }
        }, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt.detectDragGesturesWithObserver.3
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27835invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27835invoke() {
                textDragObserver.onStop();
            }
        }, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt.detectDragGesturesWithObserver.4
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27836invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27836invoke() {
                textDragObserver.onCancel();
            }
        }, new InterfaceC9544p() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt.detectDragGesturesWithObserver.5
            {
                super(2);
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                m27837invokeUv8p0NA((PointerInputChange) obj, ((Offset) obj2).m30647unboximpl());
                return C10786q.f26013a;
            }

            /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
            public final void m27837invokeUv8p0NA(PointerInputChange pointerInputChange, long j10) {
                textDragObserver.mo27889onDragk4lQ0M(j10);
            }
        }, interfaceC11588c);
        return objDetectDragGestures == AbstractC11725a.m25952f() ? objDetectDragGestures : C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectPreDragGesturesWithObserver(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C17312(textDragObserver, null), interfaceC11588c);
        return objAwaitEachGesture == AbstractC11725a.m25952f() ? objAwaitEachGesture : C10786q.f26013a;
    }
}
