package androidx.compose.foundation.gestures;

import androidx.compose.p014ui.geometry.InlineClassHelperKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p014ui.input.pointer.PointerEvent;
import androidx.compose.p014ui.input.pointer.PointerEventKt;
import androidx.compose.p014ui.input.pointer.PointerEventPass;
import androidx.compose.p014ui.input.pointer.PointerId;
import androidx.compose.p014ui.input.pointer.PointerInputChange;
import androidx.compose.p014ui.input.pointer.PointerInputScope;
import androidx.compose.p014ui.input.pointer.PointerType;
import androidx.compose.p014ui.platform.ViewConfiguration;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.InputDeviceCompat;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.AbstractC9977s;
import kotlin.jvm.internal.Ref$LongRef;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class DragGestureDetectorKt {
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m26211f = "DragGestureDetector.kt", m26212l = {851}, m26213m = "awaitAllPointersUpWithSlopDetection")
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 */
    public static final class C12871 extends ContinuationImpl {
        float F$0;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C12871(InterfaceC11588c<? super C12871> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DragGestureDetectorKt.awaitAllPointersUpWithSlopDetection(null, null, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9", m26211f = "DragGestureDetector.kt", m26212l = {245, 251, 1061, 1101, 278, 1148, 1190, 1202}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9 */
    public static final class C12949 extends RestrictedSuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9544p $onDrag;
        final /* synthetic */ InterfaceC9529a $onDragCancel;
        final /* synthetic */ InterfaceC9540l $onDragEnd;
        final /* synthetic */ InterfaceC9545q $onDragStart;
        final /* synthetic */ Orientation $orientationLock;
        final /* synthetic */ Ref$LongRef $overSlop;
        final /* synthetic */ InterfaceC9529a $shouldAwaitTouchSlop;
        float F$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12949(InterfaceC9529a interfaceC9529a, Ref$LongRef ref$LongRef, Orientation orientation, InterfaceC9545q interfaceC9545q, InterfaceC9544p interfaceC9544p, InterfaceC9529a interfaceC9529a2, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super C12949> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$shouldAwaitTouchSlop = interfaceC9529a;
            this.$overSlop = ref$LongRef;
            this.$orientationLock = orientation;
            this.$onDragStart = interfaceC9545q;
            this.$onDrag = interfaceC9544p;
            this.$onDragCancel = interfaceC9529a2;
            this.$onDragEnd = interfaceC9540l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C12949 c12949 = new C12949(this.$shouldAwaitTouchSlop, this.$overSlop, this.$orientationLock, this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, interfaceC11588c);
            c12949.L$0 = obj;
            return c12949;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C12949) create(awaitPointerEventScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:164:0x04b8, code lost:
        
            if (androidx.compose.foundation.gestures.DragGestureDetectorKt.m27158isPointerUpDmW0f2w(r2.getCurrentEvent(), r0) != false) goto L165;
         */
        /* JADX WARN: Code restructure failed: missing block: B:168:0x04e0, code lost:
        
            if (r9 != r6) goto L170;
         */
        /* JADX WARN: Code restructure failed: missing block: B:205:0x056d, code lost:
        
            if (r8 == false) goto L206;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x02fb, code lost:
        
            if (r4 == r6) goto L169;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:182:0x051a, B:193:0x0546], limit reached: 221 */
        /* JADX WARN: Removed duplicated region for block: B:118:0x03c0 A[PHI: r0 r1 r2 r4 r7 r9 r10 r11 r16 r18
          0x03c0: PHI (r0v21 float) = (r0v19 float), (r0v22 float) binds: [B:8:0x0065, B:116:0x03bc] A[DONT_GENERATE, DONT_INLINE]
          0x03c0: PHI (r1v36 androidx.compose.ui.input.pointer.PointerInputChange) = 
          (r1v34 androidx.compose.ui.input.pointer.PointerInputChange)
          (r1v38 androidx.compose.ui.input.pointer.PointerInputChange)
         binds: [B:8:0x0065, B:116:0x03bc] A[DONT_GENERATE, DONT_INLINE]
          0x03c0: PHI (r2v26 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
          (r2v24 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
          (r2v29 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
         binds: [B:8:0x0065, B:116:0x03bc] A[DONT_GENERATE, DONT_INLINE]
          0x03c0: PHI (r4v19 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
          (r4v17 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
          (r4v20 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
         binds: [B:8:0x0065, B:116:0x03bc] A[DONT_GENERATE, DONT_INLINE]
          0x03c0: PHI (r7v30 androidx.compose.foundation.gestures.TouchSlopDetector) = 
          (r7v28 androidx.compose.foundation.gestures.TouchSlopDetector)
          (r7v32 androidx.compose.foundation.gestures.TouchSlopDetector)
         binds: [B:8:0x0065, B:116:0x03bc] A[DONT_GENERATE, DONT_INLINE]
          0x03c0: PHI (r9v13 java.lang.Object) = (r9v12 java.lang.Object), (r9v21 java.lang.Object) binds: [B:8:0x0065, B:116:0x03bc] A[DONT_GENERATE, DONT_INLINE]
          0x03c0: PHI (r10v9 kotlin.jvm.internal.Ref$LongRef) = (r10v7 kotlin.jvm.internal.Ref$LongRef), (r10v10 kotlin.jvm.internal.Ref$LongRef) binds: [B:8:0x0065, B:116:0x03bc] A[DONT_GENERATE, DONT_INLINE]
          0x03c0: PHI (r11v20 kotlin.jvm.internal.Ref$LongRef) = (r11v18 kotlin.jvm.internal.Ref$LongRef), (r11v21 kotlin.jvm.internal.Ref$LongRef) binds: [B:8:0x0065, B:116:0x03bc] A[DONT_GENERATE, DONT_INLINE]
          0x03c0: PHI (r16v16 long) = (r16v14 long), (r16v17 long) binds: [B:8:0x0065, B:116:0x03bc] A[DONT_GENERATE, DONT_INLINE]
          0x03c0: PHI (r18v12 long) = (r18v10 long), (r18v13 long) binds: [B:8:0x0065, B:116:0x03bc] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:120:0x03d0  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x0406  */
        /* JADX WARN: Removed duplicated region for block: B:144:0x0433  */
        /* JADX WARN: Removed duplicated region for block: B:157:0x047b  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x047f  */
        /* JADX WARN: Removed duplicated region for block: B:163:0x048e  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0169  */
        /* JADX WARN: Removed duplicated region for block: B:233:0x03f0 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:237:0x0215 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0181  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x01b2  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x01b5  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x01e6 A[PHI: r0 r1 r2 r4 r5 r7 r8 r9 r11 r16 r18
          0x01e6: PHI (r0v10 float) = (r0v9 float), (r0v11 float) binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
          0x01e6: PHI (r1v18 androidx.compose.ui.input.pointer.PointerInputChange) = 
          (r1v17 androidx.compose.ui.input.pointer.PointerInputChange)
          (r1v20 androidx.compose.ui.input.pointer.PointerInputChange)
         binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
          0x01e6: PHI (r2v8 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
          (r2v7 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
          (r2v11 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
         binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
          0x01e6: PHI (r4v5 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
          (r4v4 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
          (r4v6 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
         binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
          0x01e6: PHI (r5v5 androidx.compose.foundation.gestures.TouchSlopDetector) = 
          (r5v4 androidx.compose.foundation.gestures.TouchSlopDetector)
          (r5v6 androidx.compose.foundation.gestures.TouchSlopDetector)
         binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
          0x01e6: PHI (r7v7 java.lang.Object) = (r7v6 java.lang.Object), (r7v17 java.lang.Object) binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
          0x01e6: PHI (r8v4 kotlin.jvm.internal.Ref$LongRef) = (r8v3 kotlin.jvm.internal.Ref$LongRef), (r8v6 kotlin.jvm.internal.Ref$LongRef) binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
          0x01e6: PHI (r9v2 kotlin.jvm.internal.Ref$LongRef) = (r9v1 kotlin.jvm.internal.Ref$LongRef), (r9v3 kotlin.jvm.internal.Ref$LongRef) binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
          0x01e6: PHI (r11v1 int) = (r11v0 int), (r11v14 int) binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
          0x01e6: PHI (r16v6 long) = (r16v5 long), (r16v7 long) binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]
          0x01e6: PHI (r18v2 long) = (r18v1 long), (r18v3 long) binds: [B:11:0x00e7, B:31:0x01e2] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x01f6  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x022e  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x025a  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x02a0  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x02a6  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x02b2  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x02b9  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x02c2 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x02d6  */
        /* JADX WARN: Type inference failed for: r13v10, types: [kotlin.jvm.internal.n] */
        /* JADX WARN: Type inference failed for: r13v11 */
        /* JADX WARN: Type inference failed for: r13v12 */
        /* JADX WARN: Type inference failed for: r13v2 */
        /* JADX WARN: Type inference failed for: r13v3 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x0389 -> B:113:0x038b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x03f7 -> B:113:0x038b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:148:0x044c -> B:81:0x02be). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x0453 -> B:115:0x03a4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:154:0x0473 -> B:155:0x0475). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x0485 -> B:81:0x02be). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:168:0x04e0 -> B:170:0x04e3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x01b2 -> B:74:0x02a4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x021d -> B:43:0x021e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x026f -> B:74:0x02a4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0297 -> B:71:0x029a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x0333 -> B:89:0x02e3). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 1474
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.C12949.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", m26211f = "DragGestureDetector.kt", m26212l = {354, 355, 360}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 */
    public static final class C12985 extends RestrictedSuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9544p $onDrag;
        final /* synthetic */ InterfaceC9529a $onDragCancel;
        final /* synthetic */ InterfaceC9529a $onDragEnd;
        final /* synthetic */ InterfaceC9540l $onDragStart;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12985(InterfaceC9540l interfaceC9540l, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C12985> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$onDragStart = interfaceC9540l;
            this.$onDragEnd = interfaceC9529a;
            this.$onDragCancel = interfaceC9529a2;
            this.$onDrag = interfaceC9544p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C12985 c12985 = new C12985(this.$onDragStart, this.$onDragEnd, this.$onDragCancel, this.$onDrag, interfaceC11588c);
            c12985.L$0 = obj;
            return c12985;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C12985) create(awaitPointerEventScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0064 A[Catch: CancellationException -> 0x00b6, PHI: r1 r8 r12
          0x0064: PHI (r1v8 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
          (r1v4 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
          (r1v9 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
         binds: [B:16:0x002f, B:28:0x0061] A[DONT_GENERATE, DONT_INLINE]
          0x0064: PHI (r8v6 androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5) = 
          (r8v2 androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5)
          (r8v7 androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5)
         binds: [B:16:0x002f, B:28:0x0061] A[DONT_GENERATE, DONT_INLINE]
          0x0064: PHI (r12v12 java.lang.Object) = (r12v0 java.lang.Object), (r12v18 java.lang.Object) binds: [B:16:0x002f, B:28:0x0061] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x00b6, blocks: (B:36:0x008c, B:38:0x0094, B:40:0x00a6, B:42:0x00b2, B:45:0x00b9, B:46:0x00bc, B:47:0x00c2, B:30:0x0064, B:32:0x0068, B:27:0x0053, B:23:0x004b), top: B:57:0x004b }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[Catch: CancellationException -> 0x00b6, TryCatch #2 {CancellationException -> 0x00b6, blocks: (B:36:0x008c, B:38:0x0094, B:40:0x00a6, B:42:0x00b2, B:45:0x00b9, B:46:0x00bc, B:47:0x00c2, B:30:0x0064, B:32:0x0068, B:27:0x0053, B:23:0x004b), top: B:57:0x004b }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0094 A[Catch: CancellationException -> 0x00b6, TryCatch #2 {CancellationException -> 0x00b6, blocks: (B:36:0x008c, B:38:0x0094, B:40:0x00a6, B:42:0x00b2, B:45:0x00b9, B:46:0x00bc, B:47:0x00c2, B:30:0x0064, B:32:0x0068, B:27:0x0053, B:23:0x004b), top: B:57:0x004b }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00c2 A[Catch: CancellationException -> 0x00b6, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00b6, blocks: (B:36:0x008c, B:38:0x0094, B:40:0x00a6, B:42:0x00b2, B:45:0x00b9, B:46:0x00bc, B:47:0x00c2, B:30:0x0064, B:32:0x0068, B:27:0x0053, B:23:0x004b), top: B:57:0x004b }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 211
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.C12985.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5", m26211f = "DragGestureDetector.kt", m26212l = {661, 664, 672}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5 */
    public static final class C13025 extends RestrictedSuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9529a $onDragCancel;
        final /* synthetic */ InterfaceC9529a $onDragEnd;
        final /* synthetic */ InterfaceC9540l $onDragStart;
        final /* synthetic */ InterfaceC9544p $onHorizontalDrag;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13025(InterfaceC9540l interfaceC9540l, InterfaceC9544p interfaceC9544p, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, InterfaceC11588c<? super C13025> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$onDragStart = interfaceC9540l;
            this.$onHorizontalDrag = interfaceC9544p;
            this.$onDragEnd = interfaceC9529a;
            this.$onDragCancel = interfaceC9529a2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C13025 c13025 = new C13025(this.$onDragStart, this.$onHorizontalDrag, this.$onDragEnd, this.$onDragCancel, interfaceC11588c);
            c13025.L$0 = obj;
            return c13025;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C13025) create(awaitPointerEventScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00a5, code lost:
        
            if (r13 == r0) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                r12 = this;
                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                int r1 = r12.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L36
                if (r1 == r4) goto L2c
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                kotlin.AbstractC9924b.m20071b(r13)
                r8 = r12
                goto La8
            L17:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1f:
                java.lang.Object r1 = r12.L$1
                kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref$FloatRef) r1
                java.lang.Object r3 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r3
                kotlin.AbstractC9924b.m20071b(r13)
                r8 = r12
                goto L73
            L2c:
                java.lang.Object r1 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC9924b.m20071b(r13)
                r8 = r12
                r6 = r1
                goto L4f
            L36:
                kotlin.AbstractC9924b.m20071b(r13)
                java.lang.Object r13 = r12.L$0
                r5 = r13
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r5
                r12.L$0 = r5
                r12.label = r4
                r6 = 0
                r7 = 0
                r9 = 2
                r10 = 0
                r8 = r12
                java.lang.Object r13 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
                if (r13 != r0) goto L4e
                goto La7
            L4e:
                r6 = r5
            L4f:
                androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r13
                kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
                r1.<init>()
                r11 = r8
                long r7 = r13.m32102getIdJ3iCeTQ()
                int r9 = r13.m32107getTypeT8wyACA()
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$drag$1 r10 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$drag$1
                r10.<init>()
                r11.L$0 = r6
                r11.L$1 = r1
                r11.label = r3
                java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m27144awaitHorizontalPointerSlopOrCancellationgDDlDlE(r6, r7, r9, r10, r11)
                r8 = r11
                if (r13 != r0) goto L72
                goto La7
            L72:
                r3 = r6
            L73:
                androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r13
                if (r13 == 0) goto Lbb
                hd.l r4 = r8.$onDragStart
                long r5 = r13.m32104getPositionF1C5BW0()
                androidx.compose.ui.geometry.Offset r5 = androidx.compose.p014ui.geometry.Offset.m30626boximpl(r5)
                r4.invoke(r5)
                hd.p r4 = r8.$onHorizontalDrag
                float r1 = r1.f23399c
                java.lang.Float r1 = p409xc.AbstractC11826a.m26207b(r1)
                r4.invoke(r13, r1)
                long r4 = r13.m32102getIdJ3iCeTQ()
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1 r13 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1
                hd.p r1 = r8.$onHorizontalDrag
                r13.<init>()
                r1 = 0
                r8.L$0 = r1
                r8.L$1 = r1
                r8.label = r2
                java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m27157horizontalDragjO51t88(r3, r4, r13, r12)
                if (r13 != r0) goto La8
            La7:
                return r0
            La8:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto Lb6
                hd.a r13 = r8.$onDragEnd
                r13.invoke()
                goto Lbb
            Lb6:
                hd.a r13 = r8.$onDragCancel
                r13.invoke()
            Lbb:
                qc.q r13 = p309qc.C10786q.f26013a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.C13025.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5", m26211f = "DragGestureDetector.kt", m26212l = {TypedValues.PositionType.TYPE_POSITION_TYPE, InputDeviceCompat.SOURCE_DPAD, 521}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5 */
    public static final class C13065 extends RestrictedSuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9529a $onDragCancel;
        final /* synthetic */ InterfaceC9529a $onDragEnd;
        final /* synthetic */ InterfaceC9540l $onDragStart;
        final /* synthetic */ InterfaceC9544p $onVerticalDrag;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13065(InterfaceC9540l interfaceC9540l, InterfaceC9544p interfaceC9544p, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, InterfaceC11588c<? super C13065> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$onDragStart = interfaceC9540l;
            this.$onVerticalDrag = interfaceC9544p;
            this.$onDragEnd = interfaceC9529a;
            this.$onDragCancel = interfaceC9529a2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C13065 c13065 = new C13065(this.$onDragStart, this.$onVerticalDrag, this.$onDragEnd, this.$onDragCancel, interfaceC11588c);
            c13065.L$0 = obj;
            return c13065;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C13065) create(awaitPointerEventScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00a5, code lost:
        
            if (r13 == r0) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                r12 = this;
                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                int r1 = r12.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L36
                if (r1 == r4) goto L2c
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                kotlin.AbstractC9924b.m20071b(r13)
                r8 = r12
                goto La8
            L17:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1f:
                java.lang.Object r1 = r12.L$1
                kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref$FloatRef) r1
                java.lang.Object r3 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r3
                kotlin.AbstractC9924b.m20071b(r13)
                r8 = r12
                goto L73
            L2c:
                java.lang.Object r1 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC9924b.m20071b(r13)
                r8 = r12
                r6 = r1
                goto L4f
            L36:
                kotlin.AbstractC9924b.m20071b(r13)
                java.lang.Object r13 = r12.L$0
                r5 = r13
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r5
                r12.L$0 = r5
                r12.label = r4
                r6 = 0
                r7 = 0
                r9 = 2
                r10 = 0
                r8 = r12
                java.lang.Object r13 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
                if (r13 != r0) goto L4e
                goto La7
            L4e:
                r6 = r5
            L4f:
                androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r13
                kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
                r1.<init>()
                r11 = r8
                long r7 = r13.m32102getIdJ3iCeTQ()
                int r9 = r13.m32107getTypeT8wyACA()
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$drag$1 r10 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$drag$1
                r10.<init>()
                r11.L$0 = r6
                r11.L$1 = r1
                r11.label = r3
                java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m27152awaitVerticalPointerSlopOrCancellationgDDlDlE(r6, r7, r9, r10, r11)
                r8 = r11
                if (r13 != r0) goto L72
                goto La7
            L72:
                r3 = r6
            L73:
                androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r13
                if (r13 == 0) goto Lbb
                hd.l r4 = r8.$onDragStart
                long r5 = r13.m32104getPositionF1C5BW0()
                androidx.compose.ui.geometry.Offset r5 = androidx.compose.p014ui.geometry.Offset.m30626boximpl(r5)
                r4.invoke(r5)
                hd.p r4 = r8.$onVerticalDrag
                float r1 = r1.f23399c
                java.lang.Float r1 = p409xc.AbstractC11826a.m26207b(r1)
                r4.invoke(r13, r1)
                long r4 = r13.m32102getIdJ3iCeTQ()
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$1 r13 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$1
                hd.p r1 = r8.$onVerticalDrag
                r13.<init>()
                r1 = 0
                r8.L$0 = r1
                r8.L$1 = r1
                r8.label = r2
                java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m27160verticalDragjO51t88(r3, r4, r13, r12)
                if (r13 != r0) goto La8
            La7:
                return r0
            La8:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto Lb6
                hd.a r13 = r8.$onDragEnd
                r13.invoke()
                goto Lbb
            Lb6:
                hd.a r13 = r8.$onDragCancel
                r13.invoke()
            Lbb:
                qc.q r13 = p309qc.C10786q.f26013a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.C13065.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        float fM33501constructorimpl = C3186Dp.m33501constructorimpl((float) 0.125d);
        mouseSlop = fM33501constructorimpl;
        float fM33501constructorimpl2 = C3186Dp.m33501constructorimpl(18);
        defaultTouchSlop = fM33501constructorimpl2;
        mouseToTouchSlopRatio = fM33501constructorimpl / fM33501constructorimpl2;
    }

    /* JADX WARN: Path cross not found for [B:32:0x00d6, B:38:0x00f2], limit reached: 69 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x009e -> B:23:0x00a3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitAllPointersUpWithSlopDetection(androidx.compose.p014ui.input.pointer.AwaitPointerEventScope r18, androidx.compose.p014ui.input.pointer.PointerInputChange r19, androidx.compose.p014ui.input.pointer.PointerEventPass r20, vc.InterfaceC11588c<? super java.lang.Boolean> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitAllPointersUpWithSlopDetection(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.input.pointer.PointerEventPass, vc.c):java.lang.Object");
    }

    public static /* synthetic */ Object awaitAllPointersUpWithSlopDetection$default(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, PointerEventPass pointerEventPass, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitAllPointersUpWithSlopDetection(awaitPointerEventScope, pointerInputChange, pointerEventPass, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d0, code lost:
    
        if (androidx.compose.p014ui.input.pointer.PointerEventKt.positionChangedIgnoreConsumed(r11) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please report as a decompilation issue!!! */
    /* renamed from: awaitDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m27141awaitDragOrCancellationrnUCldI(androidx.compose.p014ui.input.pointer.AwaitPointerEventScope r17, long r18, vc.InterfaceC11588c<? super androidx.compose.p014ui.input.pointer.PointerInputChange> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m27141awaitDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, vc.c):java.lang.Object");
    }

    /* renamed from: awaitDragOrUp-jO51t88, reason: not valid java name */
    private static final Object m27142awaitDragOrUpjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j10, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super PointerInputChange> interfaceC11588c) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.f23401c = j10;
        while (true) {
            int i10 = 0;
            AbstractC9977s.m20287c(0);
            PointerInputChange pointerInputChange3 = null;
            Object objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, interfaceC11588c, 1, null);
            AbstractC9977s.m20287c(1);
            PointerEvent pointerEvent = (PointerEvent) objAwaitPointerEvent$default;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i11);
                if (Boolean.valueOf(PointerId.m32086equalsimpl0(pointerInputChange.m32102getIdJ3iCeTQ(), ref$LongRef.f23401c)).booleanValue()) {
                    break;
                }
                i11++;
            }
            pointerInputChange2 = pointerInputChange;
            if (pointerInputChange2 == null) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i10 >= size2) {
                        break;
                    }
                    PointerInputChange pointerInputChange4 = changes2.get(i10);
                    if (Boolean.valueOf(pointerInputChange4.getPressed()).booleanValue()) {
                        pointerInputChange3 = pointerInputChange4;
                        break;
                    }
                    i10++;
                }
                PointerInputChange pointerInputChange5 = pointerInputChange3;
                if (pointerInputChange5 == null) {
                    break;
                }
                ref$LongRef.f23401c = pointerInputChange5.m32102getIdJ3iCeTQ();
            } else if (((Boolean) interfaceC9540l.invoke(pointerInputChange2)).booleanValue()) {
                break;
            }
        }
        return pointerInputChange2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00de, code lost:
    
        if ((java.lang.Float.intBitsToFloat((int) (androidx.compose.p014ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11) >> 32)) == 0.0f ? 1 : 0) == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m27143awaitHorizontalDragOrCancellationrnUCldI(androidx.compose.p014ui.input.pointer.AwaitPointerEventScope r17, long r18, vc.InterfaceC11588c<? super androidx.compose.p014ui.input.pointer.PointerInputChange> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m27143awaitHorizontalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, vc.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x017e -> B:61:0x0184). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m27144awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.p014ui.input.pointer.AwaitPointerEventScope r21, long r22, int r24, p181hd.InterfaceC9544p r25, vc.InterfaceC11588c<? super androidx.compose.p014ui.input.pointer.PointerInputChange> r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m27144awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, hd.p, vc.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0190 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0184 -> B:61:0x018a). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m27145awaitHorizontalTouchSlopOrCancellationjO51t88(androidx.compose.p014ui.input.pointer.AwaitPointerEventScope r21, long r22, p181hd.InterfaceC9544p r24, vc.InterfaceC11588c<? super androidx.compose.p014ui.input.pointer.PointerInputChange> r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m27145awaitHorizontalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, hd.p, vc.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* renamed from: awaitLongPressOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m27146awaitLongPressOrCancellationrnUCldI(androidx.compose.p014ui.input.pointer.AwaitPointerEventScope r9, long r10, vc.InterfaceC11588c<? super androidx.compose.p014ui.input.pointer.PointerInputChange> r12) throws java.lang.Throwable {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r9 = r0.L$2
            kotlin.jvm.internal.Ref$BooleanRef r9 = (kotlin.jvm.internal.Ref$BooleanRef) r9
            java.lang.Object r10 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r10 = (kotlin.jvm.internal.Ref$ObjectRef) r10
            java.lang.Object r11 = r0.L$0
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r11
            kotlin.AbstractC9924b.m20071b(r12)     // Catch: androidx.compose.p014ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            goto La9
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3f:
            kotlin.AbstractC9924b.m20071b(r12)
            androidx.compose.ui.input.pointer.PointerEvent r12 = r9.getCurrentEvent()
            boolean r12 = m27158isPointerUpDmW0f2w(r12, r10)
            if (r12 == 0) goto L4d
            return r4
        L4d:
            androidx.compose.ui.input.pointer.PointerEvent r12 = r9.getCurrentEvent()
            java.util.List r12 = r12.getChanges()
            r2 = r12
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r5 = 0
        L5d:
            if (r5 >= r2) goto L74
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r7
            long r7 = r7.m32102getIdJ3iCeTQ()
            boolean r7 = androidx.compose.p014ui.input.pointer.PointerId.m32086equalsimpl0(r7, r10)
            if (r7 == 0) goto L71
            goto L75
        L71:
            int r5 = r5 + 1
            goto L5d
        L74:
            r6 = r4
        L75:
            r11 = r6
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r11
            if (r11 != 0) goto L7b
            return r4
        L7b:
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r12 = new kotlin.jvm.internal.Ref$ObjectRef
            r12.<init>()
            r12.f23402c = r11
            androidx.compose.ui.platform.ViewConfiguration r2 = r9.getViewConfiguration()
            long r5 = r2.getLongPressTimeoutMillis()
            kotlin.jvm.internal.Ref$BooleanRef r2 = new kotlin.jvm.internal.Ref$BooleanRef     // Catch: androidx.compose.p014ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            r2.<init>()     // Catch: androidx.compose.p014ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2 r7 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2     // Catch: androidx.compose.p014ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            r7.<init>(r2, r12, r10, r4)     // Catch: androidx.compose.p014ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            r0.L$0 = r11     // Catch: androidx.compose.p014ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            r0.L$1 = r10     // Catch: androidx.compose.p014ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            r0.L$2 = r2     // Catch: androidx.compose.p014ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            r0.label = r3     // Catch: androidx.compose.p014ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            java.lang.Object r9 = r9.withTimeout(r5, r7, r0)     // Catch: androidx.compose.p014ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            if (r9 != r1) goto La8
            return r1
        La8:
            r9 = r2
        La9:
            boolean r9 = r9.f23398c     // Catch: androidx.compose.p014ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            if (r9 == 0) goto Lb5
            java.lang.Object r9 = r10.f23402c     // Catch: androidx.compose.p014ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r9     // Catch: androidx.compose.p014ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            if (r9 != 0) goto Lb4
            return r11
        Lb4:
            return r9
        Lb5:
            return r4
        Lb6:
            java.lang.Object r9 = r10.f23402c
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r9
            if (r9 != 0) goto Lbd
            goto Lbe
        Lbd:
            r11 = r9
        Lbe:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m27146awaitLongPressOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, vc.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0189 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x017d -> B:62:0x0183). Please report as a decompilation issue!!! */
    /* renamed from: awaitPointerSlopOrCancellation-6ksA65w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m27147awaitPointerSlopOrCancellation6ksA65w(androidx.compose.p014ui.input.pointer.AwaitPointerEventScope r19, long r20, int r22, androidx.compose.foundation.gestures.Orientation r23, long r24, p181hd.InterfaceC9544p r26, vc.InterfaceC11588c<? super androidx.compose.p014ui.input.pointer.PointerInputChange> r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m27147awaitPointerSlopOrCancellation6ksA65w(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, androidx.compose.foundation.gestures.Orientation, long, hd.p, vc.c):java.lang.Object");
    }

    /* renamed from: awaitPointerSlopOrCancellation-6ksA65w$$forInline, reason: not valid java name */
    private static final Object m27148awaitPointerSlopOrCancellation6ksA65w$$forInline(AwaitPointerEventScope awaitPointerEventScope, long j10, int i10, Orientation orientation, long j11, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super PointerInputChange> interfaceC11588c) {
        int i11;
        PointerEvent pointerEvent;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (m27158isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j10)) {
            return null;
        }
        float fM27159pointerSlopE8SPZFQ = m27159pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i10);
        Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.f23401c = j10;
        TouchSlopDetector touchSlopDetector = new TouchSlopDetector(orientation, j11, null);
        while (true) {
            int i12 = 0;
            AbstractC9977s.m20287c(0);
            int i13 = 1;
            Object objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, interfaceC11588c, 1, null);
            AbstractC9977s.m20287c(1);
            PointerEvent pointerEvent2 = (PointerEvent) objAwaitPointerEvent$default;
            List<PointerInputChange> changes = pointerEvent2.getChanges();
            int size = changes.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    i11 = i13;
                    pointerEvent = pointerEvent2;
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i14);
                i11 = i13;
                pointerEvent = pointerEvent2;
                if (Boolean.valueOf(PointerId.m32086equalsimpl0(pointerInputChange.m32102getIdJ3iCeTQ(), ref$LongRef.f23401c)).booleanValue()) {
                    break;
                }
                i14++;
                i13 = i11;
                pointerEvent2 = pointerEvent;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null || pointerInputChange3.isConsumed()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i12 >= size2) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes2.get(i12);
                    if (Boolean.valueOf(pointerInputChange2.getPressed()).booleanValue()) {
                        break;
                    }
                    i12++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 == null) {
                    return null;
                }
                ref$LongRef.f23401c = pointerInputChange4.m32102getIdJ3iCeTQ();
            } else {
                long jM27254addPointerInputChangedBAh8RU = touchSlopDetector.m27254addPointerInputChangedBAh8RU(pointerInputChange3, fM27159pointerSlopE8SPZFQ);
                if ((9223372034707292159L & jM27254addPointerInputChangedBAh8RU) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                    interfaceC9544p.invoke(pointerInputChange3, Offset.m30626boximpl(jM27254addPointerInputChangedBAh8RU));
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    touchSlopDetector.reset();
                } else {
                    PointerEventPass pointerEventPass = PointerEventPass.Final;
                    AbstractC9977s.m20287c(0);
                    awaitPointerEventScope.awaitPointerEvent(pointerEventPass, interfaceC11588c);
                    AbstractC9977s.m20287c(i11);
                    if (pointerInputChange3.isConsumed()) {
                        break;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: awaitPointerSlopOrCancellation-6ksA65w$default, reason: not valid java name */
    public static /* synthetic */ Object m27149awaitPointerSlopOrCancellation6ksA65w$default(AwaitPointerEventScope awaitPointerEventScope, long j10, int i10, Orientation orientation, long j11, InterfaceC9544p interfaceC9544p, InterfaceC11588c interfaceC11588c, int i11, Object obj) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        long jM30653getZeroF1C5BW0 = (i11 & 8) != 0 ? Offset.Companion.m30653getZeroF1C5BW0() : j11;
        long jM32102getIdJ3iCeTQ = j10;
        if (m27158isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), jM32102getIdJ3iCeTQ)) {
            return null;
        }
        float fM27159pointerSlopE8SPZFQ = m27159pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i10);
        TouchSlopDetector touchSlopDetector = new TouchSlopDetector(orientation, jM30653getZeroF1C5BW0, null);
        while (true) {
            int i12 = 0;
            AbstractC9977s.m20287c(0);
            Object objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, interfaceC11588c, 1, null);
            AbstractC9977s.m20287c(1);
            PointerEvent pointerEvent = (PointerEvent) objAwaitPointerEvent$default;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i13);
                if (PointerId.m32086equalsimpl0(pointerInputChange.m32102getIdJ3iCeTQ(), jM32102getIdJ3iCeTQ)) {
                    break;
                }
                i13++;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null || pointerInputChange3.isConsumed()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i12 >= size2) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes2.get(i12);
                    if (pointerInputChange2.getPressed()) {
                        break;
                    }
                    i12++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 == null) {
                    return null;
                }
                jM32102getIdJ3iCeTQ = pointerInputChange4.m32102getIdJ3iCeTQ();
            } else {
                long jM27254addPointerInputChangedBAh8RU = touchSlopDetector.m27254addPointerInputChangedBAh8RU(pointerInputChange3, fM27159pointerSlopE8SPZFQ);
                if ((9223372034707292159L & jM27254addPointerInputChangedBAh8RU) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                    interfaceC9544p.invoke(pointerInputChange3, Offset.m30626boximpl(jM27254addPointerInputChangedBAh8RU));
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    touchSlopDetector.reset();
                } else {
                    PointerEventPass pointerEventPass = PointerEventPass.Final;
                    AbstractC9977s.m20287c(0);
                    awaitPointerEventScope.awaitPointerEvent(pointerEventPass, interfaceC11588c);
                    AbstractC9977s.m20287c(1);
                    if (pointerInputChange3.isConsumed()) {
                        break;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0180 -> B:62:0x0186). Please report as a decompilation issue!!! */
    /* renamed from: awaitTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m27150awaitTouchSlopOrCancellationjO51t88(androidx.compose.p014ui.input.pointer.AwaitPointerEventScope r19, long r20, p181hd.InterfaceC9544p r22, vc.InterfaceC11588c<? super androidx.compose.p014ui.input.pointer.PointerInputChange> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m27150awaitTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, hd.p, vc.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e1, code lost:
    
        if ((java.lang.Float.intBitsToFloat((int) (androidx.compose.p014ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11) & 4294967295L)) == 0.0f ? 1 : 0) == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m27151awaitVerticalDragOrCancellationrnUCldI(androidx.compose.p014ui.input.pointer.AwaitPointerEventScope r17, long r18, vc.InterfaceC11588c<? super androidx.compose.p014ui.input.pointer.PointerInputChange> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m27151awaitVerticalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, vc.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0181 -> B:61:0x0187). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m27152awaitVerticalPointerSlopOrCancellationgDDlDlE(androidx.compose.p014ui.input.pointer.AwaitPointerEventScope r21, long r22, int r24, p181hd.InterfaceC9544p r25, vc.InterfaceC11588c<? super androidx.compose.p014ui.input.pointer.PointerInputChange> r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m27152awaitVerticalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, hd.p, vc.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0193 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0187 -> B:61:0x018d). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m27153awaitVerticalTouchSlopOrCancellationjO51t88(androidx.compose.p014ui.input.pointer.AwaitPointerEventScope r21, long r22, p181hd.InterfaceC9544p r24, vc.InterfaceC11588c<? super androidx.compose.p014ui.input.pointer.PointerInputChange> r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m27153awaitVerticalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, hd.p, vc.c):java.lang.Object");
    }

    public static final Object detectDragGestures(PointerInputScope pointerInputScope, final InterfaceC9540l interfaceC9540l, final InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objDetectDragGestures = detectDragGestures(pointerInputScope, new InterfaceC9545q() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.5
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                m27164invoke0AR0LA0((PointerInputChange) obj, (PointerInputChange) obj2, ((Offset) obj3).m30647unboximpl());
                return C10786q.f26013a;
            }

            /* renamed from: invoke-0AR0LA0, reason: not valid java name */
            public final void m27164invoke0AR0LA0(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, long j10) {
                interfaceC9540l.invoke(Offset.m30626boximpl(pointerInputChange2.m32104getPositionF1C5BW0()));
            }
        }, new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.6
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PointerInputChange) obj);
                return C10786q.f26013a;
            }

            public final void invoke(PointerInputChange pointerInputChange) {
                interfaceC9529a.invoke();
            }
        }, interfaceC9529a2, new InterfaceC9529a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.7
            @Override // p181hd.InterfaceC9529a
            public final Boolean invoke() {
                return Boolean.TRUE;
            }
        }, null, interfaceC9544p, interfaceC11588c);
        return objDetectDragGestures == AbstractC11725a.m25952f() ? objDetectDragGestures : C10786q.f26013a;
    }

    public static /* synthetic */ Object detectDragGestures$default(PointerInputScope pointerInputScope, InterfaceC9540l interfaceC9540l, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, InterfaceC9544p interfaceC9544p, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.2
                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m27161invokek4lQ0M(((Offset) obj2).m30647unboximpl());
                    return C10786q.f26013a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m27161invokek4lQ0M(long j10) {
                }
            };
        }
        if ((i10 & 2) != 0) {
            interfaceC9529a = new InterfaceC9529a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.3
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m27162invoke() {
                }

                @Override // p181hd.InterfaceC9529a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m27162invoke();
                    return C10786q.f26013a;
                }
            };
        }
        if ((i10 & 4) != 0) {
            interfaceC9529a2 = new InterfaceC9529a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.4
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m27163invoke() {
                }

                @Override // p181hd.InterfaceC9529a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m27163invoke();
                    return C10786q.f26013a;
                }
            };
        }
        InterfaceC9529a interfaceC9529a3 = interfaceC9529a2;
        return detectDragGestures(pointerInputScope, interfaceC9540l, interfaceC9529a, interfaceC9529a3, interfaceC9544p, interfaceC11588c);
    }

    public static final Object detectDragGesturesAfterLongPress(PointerInputScope pointerInputScope, InterfaceC9540l interfaceC9540l, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C12985(interfaceC9540l, interfaceC9529a, interfaceC9529a2, interfaceC9544p, null), interfaceC11588c);
        return objAwaitEachGesture == AbstractC11725a.m25952f() ? objAwaitEachGesture : C10786q.f26013a;
    }

    public static /* synthetic */ Object detectDragGesturesAfterLongPress$default(PointerInputScope pointerInputScope, InterfaceC9540l interfaceC9540l, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, InterfaceC9544p interfaceC9544p, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.2
                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m27165invokek4lQ0M(((Offset) obj2).m30647unboximpl());
                    return C10786q.f26013a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m27165invokek4lQ0M(long j10) {
                }
            };
        }
        if ((i10 & 2) != 0) {
            interfaceC9529a = new InterfaceC9529a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.3
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m27166invoke() {
                }

                @Override // p181hd.InterfaceC9529a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m27166invoke();
                    return C10786q.f26013a;
                }
            };
        }
        if ((i10 & 4) != 0) {
            interfaceC9529a2 = new InterfaceC9529a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.4
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m27167invoke() {
                }

                @Override // p181hd.InterfaceC9529a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m27167invoke();
                    return C10786q.f26013a;
                }
            };
        }
        InterfaceC9529a interfaceC9529a3 = interfaceC9529a2;
        return detectDragGesturesAfterLongPress(pointerInputScope, interfaceC9540l, interfaceC9529a, interfaceC9529a3, interfaceC9544p, interfaceC11588c);
    }

    public static final Object detectHorizontalDragGestures(PointerInputScope pointerInputScope, InterfaceC9540l interfaceC9540l, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C13025(interfaceC9540l, interfaceC9544p, interfaceC9529a, interfaceC9529a2, null), interfaceC11588c);
        return objAwaitEachGesture == AbstractC11725a.m25952f() ? objAwaitEachGesture : C10786q.f26013a;
    }

    public static /* synthetic */ Object detectHorizontalDragGestures$default(PointerInputScope pointerInputScope, InterfaceC9540l interfaceC9540l, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, InterfaceC9544p interfaceC9544p, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.2
                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m27168invokek4lQ0M(((Offset) obj2).m30647unboximpl());
                    return C10786q.f26013a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m27168invokek4lQ0M(long j10) {
                }
            };
        }
        if ((i10 & 2) != 0) {
            interfaceC9529a = new InterfaceC9529a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.3
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m27169invoke() {
                }

                @Override // p181hd.InterfaceC9529a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m27169invoke();
                    return C10786q.f26013a;
                }
            };
        }
        if ((i10 & 4) != 0) {
            interfaceC9529a2 = new InterfaceC9529a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.4
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m27170invoke() {
                }

                @Override // p181hd.InterfaceC9529a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m27170invoke();
                    return C10786q.f26013a;
                }
            };
        }
        InterfaceC9529a interfaceC9529a3 = interfaceC9529a2;
        return detectHorizontalDragGestures(pointerInputScope, interfaceC9540l, interfaceC9529a, interfaceC9529a3, interfaceC9544p, interfaceC11588c);
    }

    public static final Object detectVerticalDragGestures(PointerInputScope pointerInputScope, InterfaceC9540l interfaceC9540l, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C13065(interfaceC9540l, interfaceC9544p, interfaceC9529a, interfaceC9529a2, null), interfaceC11588c);
        return objAwaitEachGesture == AbstractC11725a.m25952f() ? objAwaitEachGesture : C10786q.f26013a;
    }

    public static /* synthetic */ Object detectVerticalDragGestures$default(PointerInputScope pointerInputScope, InterfaceC9540l interfaceC9540l, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, InterfaceC9544p interfaceC9544p, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.2
                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m27171invokek4lQ0M(((Offset) obj2).m30647unboximpl());
                    return C10786q.f26013a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m27171invokek4lQ0M(long j10) {
                }
            };
        }
        if ((i10 & 2) != 0) {
            interfaceC9529a = new InterfaceC9529a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.3
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m27172invoke() {
                }

                @Override // p181hd.InterfaceC9529a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m27172invoke();
                    return C10786q.f26013a;
                }
            };
        }
        if ((i10 & 4) != 0) {
            interfaceC9529a2 = new InterfaceC9529a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.4
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m27173invoke() {
                }

                @Override // p181hd.InterfaceC9529a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m27173invoke();
                    return C10786q.f26013a;
                }
            };
        }
        InterfaceC9529a interfaceC9529a3 = interfaceC9529a2;
        return detectVerticalDragGestures(pointerInputScope, interfaceC9540l, interfaceC9529a, interfaceC9529a3, interfaceC9544p, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x012b, code lost:
    
        if (((r3 != null ? r3 == androidx.compose.foundation.gestures.Orientation.Vertical ? java.lang.Float.intBitsToFloat((int) (r4 & 4294967295L)) : java.lang.Float.intBitsToFloat((int) (r4 >> 32)) : androidx.compose.p014ui.geometry.Offset.m30635getDistanceimpl(r4)) == 0.0f) == false) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:35:0x00d3, B:46:0x0100], limit reached: 69 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r15v2, types: [androidx.compose.ui.input.pointer.PointerInputChange] */
    /* JADX WARN: Type inference failed for: r15v3, types: [androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6, types: [hd.l] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r8v3, types: [hd.l] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008d -> B:23:0x0093). Please report as a decompilation issue!!! */
    /* renamed from: drag-VnAYq1g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m27154dragVnAYq1g(androidx.compose.p014ui.input.pointer.AwaitPointerEventScope r19, long r20, p181hd.InterfaceC9540l r22, androidx.compose.foundation.gestures.Orientation r23, p181hd.InterfaceC9540l r24, vc.InterfaceC11588c<? super androidx.compose.p014ui.input.pointer.PointerInputChange> r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m27154dragVnAYq1g(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, hd.l, androidx.compose.foundation.gestures.Orientation, hd.l, vc.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: drag-VnAYq1g$$forInline, reason: not valid java name */
    private static final Object m27155dragVnAYq1g$$forInline(AwaitPointerEventScope awaitPointerEventScope, long j10, InterfaceC9540l interfaceC9540l, Orientation orientation, InterfaceC9540l interfaceC9540l2, InterfaceC11588c<? super PointerInputChange> interfaceC11588c) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        long jM32102getIdJ3iCeTQ = j10;
        if (m27158isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), jM32102getIdJ3iCeTQ)) {
            return null;
        }
        while (true) {
            Ref$LongRef ref$LongRef = new Ref$LongRef();
            ref$LongRef.f23401c = jM32102getIdJ3iCeTQ;
            while (true) {
                AbstractC9977s.m20287c(0);
                Object objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, interfaceC11588c, 1, null);
                AbstractC9977s.m20287c(1);
                PointerEvent pointerEvent = (PointerEvent) objAwaitPointerEvent$default;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes.get(i10);
                    if (Boolean.valueOf(PointerId.m32086equalsimpl0(pointerInputChange.m32102getIdJ3iCeTQ(), ref$LongRef.f23401c)).booleanValue()) {
                        break;
                    }
                    i10++;
                }
                pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2 == null) {
                    pointerInputChange2 = null;
                    break;
                }
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    List<PointerInputChange> changes2 = pointerEvent.getChanges();
                    int size2 = changes2.size();
                    while (true) {
                        if (i >= size2) {
                            pointerInputChange3 = null;
                            break;
                        }
                        pointerInputChange3 = changes2.get(i);
                        if (Boolean.valueOf(pointerInputChange3.getPressed()).booleanValue()) {
                            break;
                        }
                        i++;
                    }
                    PointerInputChange pointerInputChange4 = pointerInputChange3;
                    if (pointerInputChange4 == null) {
                        break;
                    }
                    ref$LongRef.f23401c = pointerInputChange4.m32102getIdJ3iCeTQ();
                } else {
                    long jPositionChangeIgnoreConsumed = PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange2);
                    if (Boolean.valueOf(((orientation == null ? Offset.m30635getDistanceimpl(jPositionChangeIgnoreConsumed) : orientation == Orientation.Vertical ? Float.intBitsToFloat((int) (jPositionChangeIgnoreConsumed & 4294967295L)) : Float.intBitsToFloat((int) (jPositionChangeIgnoreConsumed >> 32))) == 0.0f ? 1 : 0) ^ 1).booleanValue()) {
                        break;
                    }
                }
            }
            if (pointerInputChange2 == null || ((Boolean) interfaceC9540l2.invoke(pointerInputChange2)).booleanValue()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                return pointerInputChange2;
            }
            interfaceC9540l.invoke(pointerInputChange2);
            jM32102getIdJ3iCeTQ = pointerInputChange2.m32102getIdJ3iCeTQ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /* renamed from: drag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m27156dragjO51t88(androidx.compose.p014ui.input.pointer.AwaitPointerEventScope r4, long r5, p181hd.InterfaceC9540l r7, vc.InterfaceC11588c<? super java.lang.Boolean> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.L$1
            hd.l r4 = (p181hd.InterfaceC9540l) r4
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r5
            kotlin.AbstractC9924b.m20071b(r8)
            r7 = r4
            r4 = r5
            goto L4b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.AbstractC9924b.m20071b(r8)
        L3e:
            r0.L$0 = r4
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = m27141awaitDragOrCancellationrnUCldI(r4, r5, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r8
            if (r8 != 0) goto L55
            r4 = 0
            java.lang.Boolean r4 = p409xc.AbstractC11826a.m26206a(r4)
            return r4
        L55:
            boolean r5 = androidx.compose.p014ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r8)
            if (r5 == 0) goto L60
            java.lang.Boolean r4 = p409xc.AbstractC11826a.m26206a(r3)
            return r4
        L60:
            r7.invoke(r8)
            long r5 = r8.m32102getIdJ3iCeTQ()
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m27156dragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, hd.l, vc.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0118, code lost:
    
        if ((r0 == 0.0f) == false) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:35:0x00c5, B:46:0x00f1], limit reached: 73 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0083 -> B:23:0x0089). Please report as a decompilation issue!!! */
    /* renamed from: horizontalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m27157horizontalDragjO51t88(androidx.compose.p014ui.input.pointer.AwaitPointerEventScope r17, long r18, p181hd.InterfaceC9540l r20, vc.InterfaceC11588c<? super java.lang.Boolean> r21) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m27157horizontalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, hd.l, vc.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    public static final boolean m27158isPointerUpDmW0f2w(PointerEvent pointerEvent, long j10) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = changes.get(i10);
            if (PointerId.m32086equalsimpl0(pointerInputChange.m32102getIdJ3iCeTQ(), j10)) {
                break;
            }
            i10++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z10 = true;
        }
        return true ^ z10;
    }

    /* renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m27159pointerSlopE8SPZFQ(ViewConfiguration viewConfiguration, int i10) {
        return PointerType.m32175equalsimpl0(i10, PointerType.Companion.m32180getMouseT8wyACA()) ? viewConfiguration.getTouchSlop() * mouseToTouchSlopRatio : viewConfiguration.getTouchSlop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0118, code lost:
    
        if ((r0 == 0.0f) == false) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:35:0x00c5, B:46:0x00f1], limit reached: 73 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0083 -> B:23:0x0089). Please report as a decompilation issue!!! */
    /* renamed from: verticalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m27160verticalDragjO51t88(androidx.compose.p014ui.input.pointer.AwaitPointerEventScope r17, long r18, p181hd.InterfaceC9540l r20, vc.InterfaceC11588c<? super java.lang.Boolean> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m27160verticalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, hd.l, vc.c):java.lang.Object");
    }

    public static final Object detectDragGestures(PointerInputScope pointerInputScope, InterfaceC9545q interfaceC9545q, InterfaceC9540l interfaceC9540l, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, Orientation orientation, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C12949(interfaceC9529a2, new Ref$LongRef(), orientation, interfaceC9545q, interfaceC9544p, interfaceC9529a, interfaceC9540l, null), interfaceC11588c);
        return objAwaitEachGesture == AbstractC11725a.m25952f() ? objAwaitEachGesture : C10786q.f26013a;
    }
}
