package androidx.compose.foundation.gestures;

import androidx.compose.p013ui.geometry.InlineClassHelperKt;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p013ui.input.pointer.PointerEvent;
import androidx.compose.p013ui.input.pointer.PointerEventKt;
import androidx.compose.p013ui.input.pointer.PointerEventPass;
import androidx.compose.p013ui.input.pointer.PointerId;
import androidx.compose.p013ui.input.pointer.PointerInputChange;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import androidx.compose.p013ui.input.pointer.PointerType;
import androidx.compose.p013ui.platform.ViewConfiguration;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.core.view.InputDeviceCompat;
import com.tencent.liteav.TXLiteAVCode;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.AbstractC9131s;
import kotlin.jvm.internal.Ref$LongRef;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* loaded from: classes.dex */
public final class DragGestureDetectorKt {
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m17801f = "DragGestureDetector.kt", m17802l = {851}, m17803m = "awaitAllPointersUpWithSlopDetection")
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 */
    public static final class C12571 extends ContinuationImpl {
        float F$0;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C12571(InterfaceC9324c<? super C12571> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DragGestureDetectorKt.awaitAllPointersUpWithSlopDetection(null, null, null, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9", m17801f = "DragGestureDetector.kt", m17802l = {245, 251, 1061, 1101, 278, 1148, 1190, TXLiteAVCode.WARNING_SPEAKER_DEVICE_EMPTY}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9 */
    public static final class C12649 extends RestrictedSuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10574p $onDrag;
        final /* synthetic */ InterfaceC10559a $onDragCancel;
        final /* synthetic */ InterfaceC10570l $onDragEnd;
        final /* synthetic */ InterfaceC10575q $onDragStart;
        final /* synthetic */ Orientation $orientationLock;
        final /* synthetic */ Ref$LongRef $overSlop;
        final /* synthetic */ InterfaceC10559a $shouldAwaitTouchSlop;
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
        public C12649(InterfaceC10559a interfaceC10559a, Ref$LongRef ref$LongRef, Orientation orientation, InterfaceC10575q interfaceC10575q, InterfaceC10574p interfaceC10574p, InterfaceC10559a interfaceC10559a2, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super C12649> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$shouldAwaitTouchSlop = interfaceC10559a;
            this.$overSlop = ref$LongRef;
            this.$orientationLock = orientation;
            this.$onDragStart = interfaceC10575q;
            this.$onDrag = interfaceC10574p;
            this.$onDragCancel = interfaceC10559a2;
            this.$onDragEnd = interfaceC10570l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C12649 c12649 = new C12649(this.$shouldAwaitTouchSlop, this.$overSlop, this.$orientationLock, this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, interfaceC9324c);
            c12649.L$0 = obj;
            return c12649;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C12649) create(awaitPointerEventScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:164:0x04a0, code lost:
        
            if (androidx.compose.foundation.gestures.DragGestureDetectorKt.m20556isPointerUpDmW0f2w(r2.getCurrentEvent(), r0) != false) goto L165;
         */
        /* JADX WARN: Code restructure failed: missing block: B:168:0x04c8, code lost:
        
            if (r9 != r6) goto L170;
         */
        /* JADX WARN: Code restructure failed: missing block: B:205:0x054f, code lost:
        
            if (r8 == false) goto L206;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x02f2, code lost:
        
            if (r4 == r6) goto L169;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:182:0x04ff, B:193:0x0528], limit reached: 221 */
        /* JADX WARN: Removed duplicated region for block: B:118:0x03ae A[PHI: r0 r1 r2 r4 r7 r9 r10 r11 r16 r18
          0x03ae: PHI (r0v21 float) = (r0v19 float), (r0v22 float) binds: [B:8:0x0065, B:116:0x03aa] A[DONT_GENERATE, DONT_INLINE]
          0x03ae: PHI (r1v36 androidx.compose.ui.input.pointer.PointerInputChange) = 
          (r1v34 androidx.compose.ui.input.pointer.PointerInputChange)
          (r1v38 androidx.compose.ui.input.pointer.PointerInputChange)
         binds: [B:8:0x0065, B:116:0x03aa] A[DONT_GENERATE, DONT_INLINE]
          0x03ae: PHI (r2v26 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
          (r2v24 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
          (r2v29 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
         binds: [B:8:0x0065, B:116:0x03aa] A[DONT_GENERATE, DONT_INLINE]
          0x03ae: PHI (r4v19 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
          (r4v17 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
          (r4v20 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
         binds: [B:8:0x0065, B:116:0x03aa] A[DONT_GENERATE, DONT_INLINE]
          0x03ae: PHI (r7v30 androidx.compose.foundation.gestures.TouchSlopDetector) = 
          (r7v28 androidx.compose.foundation.gestures.TouchSlopDetector)
          (r7v32 androidx.compose.foundation.gestures.TouchSlopDetector)
         binds: [B:8:0x0065, B:116:0x03aa] A[DONT_GENERATE, DONT_INLINE]
          0x03ae: PHI (r9v13 java.lang.Object) = (r9v12 java.lang.Object), (r9v21 java.lang.Object) binds: [B:8:0x0065, B:116:0x03aa] A[DONT_GENERATE, DONT_INLINE]
          0x03ae: PHI (r10v7 kotlin.jvm.internal.Ref$LongRef) = (r10v5 kotlin.jvm.internal.Ref$LongRef), (r10v8 kotlin.jvm.internal.Ref$LongRef) binds: [B:8:0x0065, B:116:0x03aa] A[DONT_GENERATE, DONT_INLINE]
          0x03ae: PHI (r11v20 kotlin.jvm.internal.Ref$LongRef) = (r11v18 kotlin.jvm.internal.Ref$LongRef), (r11v21 kotlin.jvm.internal.Ref$LongRef) binds: [B:8:0x0065, B:116:0x03aa] A[DONT_GENERATE, DONT_INLINE]
          0x03ae: PHI (r16v16 long) = (r16v14 long), (r16v17 long) binds: [B:8:0x0065, B:116:0x03aa] A[DONT_GENERATE, DONT_INLINE]
          0x03ae: PHI (r18v12 long) = (r18v10 long), (r18v13 long) binds: [B:8:0x0065, B:116:0x03aa] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:120:0x03bb  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x03f1  */
        /* JADX WARN: Removed duplicated region for block: B:144:0x041b  */
        /* JADX WARN: Removed duplicated region for block: B:157:0x0463  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x0467  */
        /* JADX WARN: Removed duplicated region for block: B:163:0x0476  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0169  */
        /* JADX WARN: Removed duplicated region for block: B:233:0x03db A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:237:0x0212 A[SYNTHETIC] */
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
        /* JADX WARN: Removed duplicated region for block: B:35:0x01f3  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x022b  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0254  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x029a  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x02a0  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x02ac  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x02b3  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x02bc A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x02cd  */
        /* JADX WARN: Type inference failed for: r13v10, types: [kotlin.jvm.internal.n] */
        /* JADX WARN: Type inference failed for: r13v11 */
        /* JADX WARN: Type inference failed for: r13v12 */
        /* JADX WARN: Type inference failed for: r13v2 */
        /* JADX WARN: Type inference failed for: r13v3 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x0377 -> B:113:0x0379). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x03e2 -> B:113:0x0379). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:148:0x0434 -> B:81:0x02b8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x043b -> B:115:0x0392). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:154:0x045b -> B:155:0x045d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x046d -> B:81:0x02b8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:168:0x04c8 -> B:170:0x04cb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x01b2 -> B:74:0x029e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x021a -> B:43:0x021b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0269 -> B:74:0x029e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0291 -> B:71:0x0294). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x0324 -> B:89:0x02da). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 1444
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.C12649.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", m17801f = "DragGestureDetector.kt", m17802l = {354, 355, 360}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 */
    public static final class C12685 extends RestrictedSuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10574p $onDrag;
        final /* synthetic */ InterfaceC10559a $onDragCancel;
        final /* synthetic */ InterfaceC10559a $onDragEnd;
        final /* synthetic */ InterfaceC10570l $onDragStart;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12685(InterfaceC10570l interfaceC10570l, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C12685> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$onDragStart = interfaceC10570l;
            this.$onDragEnd = interfaceC10559a;
            this.$onDragCancel = interfaceC10559a2;
            this.$onDrag = interfaceC10574p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C12685 c12685 = new C12685(this.$onDragStart, this.$onDragEnd, this.$onDragCancel, this.$onDrag, interfaceC9324c);
            c12685.L$0 = obj;
            return c12685;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C12685) create(awaitPointerEventScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0064 A[Catch: CancellationException -> 0x00b3, PHI: r1 r8 r12
          0x0064: PHI (r1v8 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
          (r1v4 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
          (r1v9 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
         binds: [B:16:0x002f, B:28:0x0061] A[DONT_GENERATE, DONT_INLINE]
          0x0064: PHI (r8v6 androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5) = 
          (r8v2 androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5)
          (r8v7 androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5)
         binds: [B:16:0x002f, B:28:0x0061] A[DONT_GENERATE, DONT_INLINE]
          0x0064: PHI (r12v12 java.lang.Object) = (r12v0 java.lang.Object), (r12v18 java.lang.Object) binds: [B:16:0x002f, B:28:0x0061] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x00b3, blocks: (B:36:0x008c, B:38:0x0094, B:40:0x00a3, B:42:0x00af, B:45:0x00b6, B:46:0x00b9, B:47:0x00bf, B:30:0x0064, B:32:0x0068, B:27:0x0053, B:23:0x004b), top: B:57:0x004b }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[Catch: CancellationException -> 0x00b3, TryCatch #2 {CancellationException -> 0x00b3, blocks: (B:36:0x008c, B:38:0x0094, B:40:0x00a3, B:42:0x00af, B:45:0x00b6, B:46:0x00b9, B:47:0x00bf, B:30:0x0064, B:32:0x0068, B:27:0x0053, B:23:0x004b), top: B:57:0x004b }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0094 A[Catch: CancellationException -> 0x00b3, TryCatch #2 {CancellationException -> 0x00b3, blocks: (B:36:0x008c, B:38:0x0094, B:40:0x00a3, B:42:0x00af, B:45:0x00b6, B:46:0x00b9, B:47:0x00bf, B:30:0x0064, B:32:0x0068, B:27:0x0053, B:23:0x004b), top: B:57:0x004b }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00bf A[Catch: CancellationException -> 0x00b3, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00b3, blocks: (B:36:0x008c, B:38:0x0094, B:40:0x00a3, B:42:0x00af, B:45:0x00b6, B:46:0x00b9, B:47:0x00bf, B:30:0x0064, B:32:0x0068, B:27:0x0053, B:23:0x004b), top: B:57:0x004b }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 208
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.C12685.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5", m17801f = "DragGestureDetector.kt", m17802l = {661, 664, 672}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5 */
    public static final class C12725 extends RestrictedSuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10559a $onDragCancel;
        final /* synthetic */ InterfaceC10559a $onDragEnd;
        final /* synthetic */ InterfaceC10570l $onDragStart;
        final /* synthetic */ InterfaceC10574p $onHorizontalDrag;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12725(InterfaceC10570l interfaceC10570l, InterfaceC10574p interfaceC10574p, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, InterfaceC9324c<? super C12725> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$onDragStart = interfaceC10570l;
            this.$onHorizontalDrag = interfaceC10574p;
            this.$onDragEnd = interfaceC10559a;
            this.$onDragCancel = interfaceC10559a2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C12725 c12725 = new C12725(this.$onDragStart, this.$onHorizontalDrag, this.$onDragEnd, this.$onDragCancel, interfaceC9324c);
            c12725.L$0 = obj;
            return c12725;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C12725) create(awaitPointerEventScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r12.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L36
                if (r1 == r4) goto L2c
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                kotlin.AbstractC9079b.m15926b(r13)
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
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r3
                kotlin.AbstractC9079b.m15926b(r13)
                r8 = r12
                goto L73
            L2c:
                java.lang.Object r1 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC9079b.m15926b(r13)
                r8 = r12
                r6 = r1
                goto L4f
            L36:
                kotlin.AbstractC9079b.m15926b(r13)
                java.lang.Object r13 = r12.L$0
                r5 = r13
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r5
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
                androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r13
                kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
                r1.<init>()
                r11 = r8
                long r7 = r13.m25500getIdJ3iCeTQ()
                int r9 = r13.m25505getTypeT8wyACA()
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$drag$1 r10 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$drag$1
                r10.<init>()
                r11.L$0 = r6
                r11.L$1 = r1
                r11.label = r3
                java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m20542awaitHorizontalPointerSlopOrCancellationgDDlDlE(r6, r7, r9, r10, r11)
                r8 = r11
                if (r13 != r0) goto L72
                goto La7
            L72:
                r3 = r6
            L73:
                androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r13
                if (r13 == 0) goto Lbb
                x7.l r4 = r8.$onDragStart
                long r5 = r13.m25502getPositionF1C5BW0()
                androidx.compose.ui.geometry.Offset r5 = androidx.compose.p013ui.geometry.Offset.m24024boximpl(r5)
                r4.invoke(r5)
                x7.p r4 = r8.$onHorizontalDrag
                float r1 = r1.f17470a
                java.lang.Float r1 = p201o7.AbstractC9536a.m17797b(r1)
                r4.invoke(r13, r1)
                long r4 = r13.m25500getIdJ3iCeTQ()
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1 r13 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1
                x7.p r1 = r8.$onHorizontalDrag
                r13.<init>()
                r1 = 0
                r8.L$0 = r1
                r8.L$1 = r1
                r8.label = r2
                java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m20555horizontalDragjO51t88(r3, r4, r13, r12)
                if (r13 != r0) goto La8
            La7:
                return r0
            La8:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto Lb6
                x7.a r13 = r8.$onDragEnd
                r13.invoke()
                goto Lbb
            Lb6:
                x7.a r13 = r8.$onDragCancel
                r13.invoke()
            Lbb:
                h7.p r13 = p123h7.C8736p.f16368a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.C12725.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5", m17801f = "DragGestureDetector.kt", m17802l = {510, InputDeviceCompat.SOURCE_DPAD, 521}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5 */
    public static final class C12765 extends RestrictedSuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10559a $onDragCancel;
        final /* synthetic */ InterfaceC10559a $onDragEnd;
        final /* synthetic */ InterfaceC10570l $onDragStart;
        final /* synthetic */ InterfaceC10574p $onVerticalDrag;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12765(InterfaceC10570l interfaceC10570l, InterfaceC10574p interfaceC10574p, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, InterfaceC9324c<? super C12765> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$onDragStart = interfaceC10570l;
            this.$onVerticalDrag = interfaceC10574p;
            this.$onDragEnd = interfaceC10559a;
            this.$onDragCancel = interfaceC10559a2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C12765 c12765 = new C12765(this.$onDragStart, this.$onVerticalDrag, this.$onDragEnd, this.$onDragCancel, interfaceC9324c);
            c12765.L$0 = obj;
            return c12765;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C12765) create(awaitPointerEventScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r12.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L36
                if (r1 == r4) goto L2c
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                kotlin.AbstractC9079b.m15926b(r13)
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
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r3
                kotlin.AbstractC9079b.m15926b(r13)
                r8 = r12
                goto L73
            L2c:
                java.lang.Object r1 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.AbstractC9079b.m15926b(r13)
                r8 = r12
                r6 = r1
                goto L4f
            L36:
                kotlin.AbstractC9079b.m15926b(r13)
                java.lang.Object r13 = r12.L$0
                r5 = r13
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r5
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
                androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r13
                kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
                r1.<init>()
                r11 = r8
                long r7 = r13.m25500getIdJ3iCeTQ()
                int r9 = r13.m25505getTypeT8wyACA()
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$drag$1 r10 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$drag$1
                r10.<init>()
                r11.L$0 = r6
                r11.L$1 = r1
                r11.label = r3
                java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m20550awaitVerticalPointerSlopOrCancellationgDDlDlE(r6, r7, r9, r10, r11)
                r8 = r11
                if (r13 != r0) goto L72
                goto La7
            L72:
                r3 = r6
            L73:
                androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r13
                if (r13 == 0) goto Lbb
                x7.l r4 = r8.$onDragStart
                long r5 = r13.m25502getPositionF1C5BW0()
                androidx.compose.ui.geometry.Offset r5 = androidx.compose.p013ui.geometry.Offset.m24024boximpl(r5)
                r4.invoke(r5)
                x7.p r4 = r8.$onVerticalDrag
                float r1 = r1.f17470a
                java.lang.Float r1 = p201o7.AbstractC9536a.m17797b(r1)
                r4.invoke(r13, r1)
                long r4 = r13.m25500getIdJ3iCeTQ()
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$1 r13 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$1
                x7.p r1 = r8.$onVerticalDrag
                r13.<init>()
                r1 = 0
                r8.L$0 = r1
                r8.L$1 = r1
                r8.label = r2
                java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m20558verticalDragjO51t88(r3, r4, r13, r12)
                if (r13 != r0) goto La8
            La7:
                return r0
            La8:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto Lb6
                x7.a r13 = r8.$onDragEnd
                r13.invoke()
                goto Lbb
            Lb6:
                x7.a r13 = r8.$onDragCancel
                r13.invoke()
            Lbb:
                h7.p r13 = p123h7.C8736p.f16368a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.C12765.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        float fM26899constructorimpl = C3156Dp.m26899constructorimpl((float) 0.125d);
        mouseSlop = fM26899constructorimpl;
        float fM26899constructorimpl2 = C3156Dp.m26899constructorimpl(18);
        defaultTouchSlop = fM26899constructorimpl2;
        mouseToTouchSlopRatio = fM26899constructorimpl / fM26899constructorimpl2;
    }

    /* JADX WARN: Path cross not found for [B:32:0x00d3, B:38:0x00ef], limit reached: 69 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x009e -> B:23:0x00a3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitAllPointersUpWithSlopDetection(androidx.compose.p013ui.input.pointer.AwaitPointerEventScope r18, androidx.compose.p013ui.input.pointer.PointerInputChange r19, androidx.compose.p013ui.input.pointer.PointerEventPass r20, p179m7.InterfaceC9324c<? super java.lang.Boolean> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitAllPointersUpWithSlopDetection(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.input.pointer.PointerEventPass, m7.c):java.lang.Object");
    }

    public static /* synthetic */ Object awaitAllPointersUpWithSlopDetection$default(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, PointerEventPass pointerEventPass, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitAllPointersUpWithSlopDetection(awaitPointerEventScope, pointerInputChange, pointerEventPass, interfaceC9324c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ca, code lost:
    
        if (androidx.compose.p013ui.input.pointer.PointerEventKt.positionChangedIgnoreConsumed(r11) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please report as a decompilation issue!!! */
    /* renamed from: awaitDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m20539awaitDragOrCancellationrnUCldI(androidx.compose.p013ui.input.pointer.AwaitPointerEventScope r17, long r18, p179m7.InterfaceC9324c<? super androidx.compose.p013ui.input.pointer.PointerInputChange> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m20539awaitDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, m7.c):java.lang.Object");
    }

    /* renamed from: awaitDragOrUp-jO51t88, reason: not valid java name */
    private static final Object m20540awaitDragOrUpjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j10, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super PointerInputChange> interfaceC9324c) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.f17472a = j10;
        while (true) {
            int i10 = 0;
            AbstractC9131s.m16126c(0);
            PointerInputChange pointerInputChange3 = null;
            Object objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, interfaceC9324c, 1, null);
            AbstractC9131s.m16126c(1);
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
                if (Boolean.valueOf(PointerId.m25484equalsimpl0(pointerInputChange.m25500getIdJ3iCeTQ(), ref$LongRef.f17472a)).booleanValue()) {
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
                ref$LongRef.f17472a = pointerInputChange5.m25500getIdJ3iCeTQ();
            } else if (((Boolean) interfaceC10570l.invoke(pointerInputChange2)).booleanValue()) {
                break;
            }
        }
        return pointerInputChange2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d8, code lost:
    
        if ((java.lang.Float.intBitsToFloat((int) (androidx.compose.p013ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11) >> 32)) == 0.0f ? 1 : 0) == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m20541awaitHorizontalDragOrCancellationrnUCldI(androidx.compose.p013ui.input.pointer.AwaitPointerEventScope r17, long r18, p179m7.InterfaceC9324c<? super androidx.compose.p013ui.input.pointer.PointerInputChange> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m20541awaitHorizontalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, m7.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0184 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0178 -> B:61:0x017e). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m20542awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.p013ui.input.pointer.AwaitPointerEventScope r21, long r22, int r24, p300x7.InterfaceC10574p r25, p179m7.InterfaceC9324c<? super androidx.compose.p013ui.input.pointer.PointerInputChange> r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m20542awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, x7.p, m7.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x017e -> B:61:0x0184). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m20543awaitHorizontalTouchSlopOrCancellationjO51t88(androidx.compose.p013ui.input.pointer.AwaitPointerEventScope r21, long r22, p300x7.InterfaceC10574p r24, p179m7.InterfaceC9324c<? super androidx.compose.p013ui.input.pointer.PointerInputChange> r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m20543awaitHorizontalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, x7.p, m7.c):java.lang.Object");
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
    public static final java.lang.Object m20544awaitLongPressOrCancellationrnUCldI(androidx.compose.p013ui.input.pointer.AwaitPointerEventScope r9, long r10, p179m7.InterfaceC9324c<? super androidx.compose.p013ui.input.pointer.PointerInputChange> r12) throws java.lang.Throwable {
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r9 = r0.L$2
            kotlin.jvm.internal.Ref$BooleanRef r9 = (kotlin.jvm.internal.Ref$BooleanRef) r9
            java.lang.Object r10 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r10 = (kotlin.jvm.internal.Ref$ObjectRef) r10
            java.lang.Object r11 = r0.L$0
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r11
            kotlin.AbstractC9079b.m15926b(r12)     // Catch: androidx.compose.p013ui.input.pointer.PointerEventTimeoutCancellationException -> Lb2
            goto La5
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            kotlin.AbstractC9079b.m15926b(r12)
            androidx.compose.ui.input.pointer.PointerEvent r12 = r9.getCurrentEvent()
            boolean r12 = m20556isPointerUpDmW0f2w(r12, r10)
            if (r12 == 0) goto L4c
            return r4
        L4c:
            androidx.compose.ui.input.pointer.PointerEvent r12 = r9.getCurrentEvent()
            java.util.List r12 = r12.getChanges()
            int r2 = r12.size()
            r5 = 0
        L59:
            if (r5 >= r2) goto L70
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r7
            long r7 = r7.m25500getIdJ3iCeTQ()
            boolean r7 = androidx.compose.p013ui.input.pointer.PointerId.m25484equalsimpl0(r7, r10)
            if (r7 == 0) goto L6d
            goto L71
        L6d:
            int r5 = r5 + 1
            goto L59
        L70:
            r6 = r4
        L71:
            r11 = r6
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r11
            if (r11 != 0) goto L77
            return r4
        L77:
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r12 = new kotlin.jvm.internal.Ref$ObjectRef
            r12.<init>()
            r12.f17473a = r11
            androidx.compose.ui.platform.ViewConfiguration r2 = r9.getViewConfiguration()
            long r5 = r2.getLongPressTimeoutMillis()
            kotlin.jvm.internal.Ref$BooleanRef r2 = new kotlin.jvm.internal.Ref$BooleanRef     // Catch: androidx.compose.p013ui.input.pointer.PointerEventTimeoutCancellationException -> Lb2
            r2.<init>()     // Catch: androidx.compose.p013ui.input.pointer.PointerEventTimeoutCancellationException -> Lb2
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2 r7 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2     // Catch: androidx.compose.p013ui.input.pointer.PointerEventTimeoutCancellationException -> Lb2
            r7.<init>(r2, r12, r10, r4)     // Catch: androidx.compose.p013ui.input.pointer.PointerEventTimeoutCancellationException -> Lb2
            r0.L$0 = r11     // Catch: androidx.compose.p013ui.input.pointer.PointerEventTimeoutCancellationException -> Lb2
            r0.L$1 = r10     // Catch: androidx.compose.p013ui.input.pointer.PointerEventTimeoutCancellationException -> Lb2
            r0.L$2 = r2     // Catch: androidx.compose.p013ui.input.pointer.PointerEventTimeoutCancellationException -> Lb2
            r0.label = r3     // Catch: androidx.compose.p013ui.input.pointer.PointerEventTimeoutCancellationException -> Lb2
            java.lang.Object r9 = r9.withTimeout(r5, r7, r0)     // Catch: androidx.compose.p013ui.input.pointer.PointerEventTimeoutCancellationException -> Lb2
            if (r9 != r1) goto La4
            return r1
        La4:
            r9 = r2
        La5:
            boolean r9 = r9.f17469a     // Catch: androidx.compose.p013ui.input.pointer.PointerEventTimeoutCancellationException -> Lb2
            if (r9 == 0) goto Lb1
            java.lang.Object r9 = r10.f17473a     // Catch: androidx.compose.p013ui.input.pointer.PointerEventTimeoutCancellationException -> Lb2
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r9     // Catch: androidx.compose.p013ui.input.pointer.PointerEventTimeoutCancellationException -> Lb2
            if (r9 != 0) goto Lb0
            return r11
        Lb0:
            return r9
        Lb1:
            return r4
        Lb2:
            java.lang.Object r9 = r10.f17473a
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r9
            if (r9 != 0) goto Lb9
            goto Lba
        Lb9:
            r11 = r9
        Lba:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m20544awaitLongPressOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, m7.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0183 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0177 -> B:62:0x017d). Please report as a decompilation issue!!! */
    /* renamed from: awaitPointerSlopOrCancellation-6ksA65w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m20545awaitPointerSlopOrCancellation6ksA65w(androidx.compose.p013ui.input.pointer.AwaitPointerEventScope r19, long r20, int r22, androidx.compose.foundation.gestures.Orientation r23, long r24, p300x7.InterfaceC10574p r26, p179m7.InterfaceC9324c<? super androidx.compose.p013ui.input.pointer.PointerInputChange> r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m20545awaitPointerSlopOrCancellation6ksA65w(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, androidx.compose.foundation.gestures.Orientation, long, x7.p, m7.c):java.lang.Object");
    }

    /* renamed from: awaitPointerSlopOrCancellation-6ksA65w$$forInline, reason: not valid java name */
    private static final Object m20546awaitPointerSlopOrCancellation6ksA65w$$forInline(AwaitPointerEventScope awaitPointerEventScope, long j10, int i10, Orientation orientation, long j11, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super PointerInputChange> interfaceC9324c) {
        int i11;
        PointerEvent pointerEvent;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (m20556isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j10)) {
            return null;
        }
        float fM20557pointerSlopE8SPZFQ = m20557pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i10);
        Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.f17472a = j10;
        TouchSlopDetector touchSlopDetector = new TouchSlopDetector(orientation, j11, null);
        while (true) {
            int i12 = 0;
            AbstractC9131s.m16126c(0);
            int i13 = 1;
            Object objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, interfaceC9324c, 1, null);
            AbstractC9131s.m16126c(1);
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
                if (Boolean.valueOf(PointerId.m25484equalsimpl0(pointerInputChange.m25500getIdJ3iCeTQ(), ref$LongRef.f17472a)).booleanValue()) {
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
                ref$LongRef.f17472a = pointerInputChange4.m25500getIdJ3iCeTQ();
            } else {
                long jM20652addPointerInputChangedBAh8RU = touchSlopDetector.m20652addPointerInputChangedBAh8RU(pointerInputChange3, fM20557pointerSlopE8SPZFQ);
                if ((9223372034707292159L & jM20652addPointerInputChangedBAh8RU) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                    interfaceC10574p.invoke(pointerInputChange3, Offset.m24024boximpl(jM20652addPointerInputChangedBAh8RU));
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    touchSlopDetector.reset();
                } else {
                    PointerEventPass pointerEventPass = PointerEventPass.Final;
                    AbstractC9131s.m16126c(0);
                    awaitPointerEventScope.awaitPointerEvent(pointerEventPass, interfaceC9324c);
                    AbstractC9131s.m16126c(i11);
                    if (pointerInputChange3.isConsumed()) {
                        break;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: awaitPointerSlopOrCancellation-6ksA65w$default, reason: not valid java name */
    public static /* synthetic */ Object m20547awaitPointerSlopOrCancellation6ksA65w$default(AwaitPointerEventScope awaitPointerEventScope, long j10, int i10, Orientation orientation, long j11, InterfaceC10574p interfaceC10574p, InterfaceC9324c interfaceC9324c, int i11, Object obj) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        long jM24051getZeroF1C5BW0 = (i11 & 8) != 0 ? Offset.Companion.m24051getZeroF1C5BW0() : j11;
        long jM25500getIdJ3iCeTQ = j10;
        if (m20556isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), jM25500getIdJ3iCeTQ)) {
            return null;
        }
        float fM20557pointerSlopE8SPZFQ = m20557pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i10);
        TouchSlopDetector touchSlopDetector = new TouchSlopDetector(orientation, jM24051getZeroF1C5BW0, null);
        while (true) {
            int i12 = 0;
            AbstractC9131s.m16126c(0);
            Object objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, interfaceC9324c, 1, null);
            AbstractC9131s.m16126c(1);
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
                if (PointerId.m25484equalsimpl0(pointerInputChange.m25500getIdJ3iCeTQ(), jM25500getIdJ3iCeTQ)) {
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
                jM25500getIdJ3iCeTQ = pointerInputChange4.m25500getIdJ3iCeTQ();
            } else {
                long jM20652addPointerInputChangedBAh8RU = touchSlopDetector.m20652addPointerInputChangedBAh8RU(pointerInputChange3, fM20557pointerSlopE8SPZFQ);
                if ((9223372034707292159L & jM20652addPointerInputChangedBAh8RU) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                    interfaceC10574p.invoke(pointerInputChange3, Offset.m24024boximpl(jM20652addPointerInputChangedBAh8RU));
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    touchSlopDetector.reset();
                } else {
                    PointerEventPass pointerEventPass = PointerEventPass.Final;
                    AbstractC9131s.m16126c(0);
                    awaitPointerEventScope.awaitPointerEvent(pointerEventPass, interfaceC9324c);
                    AbstractC9131s.m16126c(1);
                    if (pointerInputChange3.isConsumed()) {
                        break;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0186 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x017a -> B:62:0x0180). Please report as a decompilation issue!!! */
    /* renamed from: awaitTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m20548awaitTouchSlopOrCancellationjO51t88(androidx.compose.p013ui.input.pointer.AwaitPointerEventScope r19, long r20, p300x7.InterfaceC10574p r22, p179m7.InterfaceC9324c<? super androidx.compose.p013ui.input.pointer.PointerInputChange> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m20548awaitTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, x7.p, m7.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00db, code lost:
    
        if ((java.lang.Float.intBitsToFloat((int) (androidx.compose.p013ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11) & 4294967295L)) == 0.0f ? 1 : 0) == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m20549awaitVerticalDragOrCancellationrnUCldI(androidx.compose.p013ui.input.pointer.AwaitPointerEventScope r17, long r18, p179m7.InterfaceC9324c<? super androidx.compose.p013ui.input.pointer.PointerInputChange> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m20549awaitVerticalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, m7.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0187 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x017b -> B:61:0x0181). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m20550awaitVerticalPointerSlopOrCancellationgDDlDlE(androidx.compose.p013ui.input.pointer.AwaitPointerEventScope r21, long r22, int r24, p300x7.InterfaceC10574p r25, p179m7.InterfaceC9324c<? super androidx.compose.p013ui.input.pointer.PointerInputChange> r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m20550awaitVerticalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, x7.p, m7.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0181 -> B:61:0x0187). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m20551awaitVerticalTouchSlopOrCancellationjO51t88(androidx.compose.p013ui.input.pointer.AwaitPointerEventScope r21, long r22, p300x7.InterfaceC10574p r24, p179m7.InterfaceC9324c<? super androidx.compose.p013ui.input.pointer.PointerInputChange> r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m20551awaitVerticalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, x7.p, m7.c):java.lang.Object");
    }

    public static final Object detectDragGestures(PointerInputScope pointerInputScope, final InterfaceC10570l interfaceC10570l, final InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objDetectDragGestures = detectDragGestures(pointerInputScope, new InterfaceC10575q() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.5
            {
                super(3);
            }

            @Override // p300x7.InterfaceC10575q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                m20562invoke0AR0LA0((PointerInputChange) obj, (PointerInputChange) obj2, ((Offset) obj3).m24045unboximpl());
                return C8736p.f16368a;
            }

            /* renamed from: invoke-0AR0LA0, reason: not valid java name */
            public final void m20562invoke0AR0LA0(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, long j10) {
                interfaceC10570l.invoke(Offset.m24024boximpl(pointerInputChange2.m25502getPositionF1C5BW0()));
            }
        }, new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.6
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PointerInputChange) obj);
                return C8736p.f16368a;
            }

            public final void invoke(PointerInputChange pointerInputChange) {
                interfaceC10559a.invoke();
            }
        }, interfaceC10559a2, new InterfaceC10559a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.7
            @Override // p300x7.InterfaceC10559a
            public final Boolean invoke() {
                return Boolean.TRUE;
            }
        }, null, interfaceC10574p, interfaceC9324c);
        return objDetectDragGestures == AbstractC9434a.m17291f() ? objDetectDragGestures : C8736p.f16368a;
    }

    public static /* synthetic */ Object detectDragGestures$default(PointerInputScope pointerInputScope, InterfaceC10570l interfaceC10570l, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, InterfaceC10574p interfaceC10574p, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10570l = new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.2
                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m20559invokek4lQ0M(((Offset) obj2).m24045unboximpl());
                    return C8736p.f16368a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m20559invokek4lQ0M(long j10) {
                }
            };
        }
        if ((i10 & 2) != 0) {
            interfaceC10559a = new InterfaceC10559a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.3
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m20560invoke() {
                }

                @Override // p300x7.InterfaceC10559a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m20560invoke();
                    return C8736p.f16368a;
                }
            };
        }
        if ((i10 & 4) != 0) {
            interfaceC10559a2 = new InterfaceC10559a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.4
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m20561invoke() {
                }

                @Override // p300x7.InterfaceC10559a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m20561invoke();
                    return C8736p.f16368a;
                }
            };
        }
        InterfaceC10559a interfaceC10559a3 = interfaceC10559a2;
        return detectDragGestures(pointerInputScope, interfaceC10570l, interfaceC10559a, interfaceC10559a3, interfaceC10574p, interfaceC9324c);
    }

    public static final Object detectDragGesturesAfterLongPress(PointerInputScope pointerInputScope, InterfaceC10570l interfaceC10570l, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C12685(interfaceC10570l, interfaceC10559a, interfaceC10559a2, interfaceC10574p, null), interfaceC9324c);
        return objAwaitEachGesture == AbstractC9434a.m17291f() ? objAwaitEachGesture : C8736p.f16368a;
    }

    public static /* synthetic */ Object detectDragGesturesAfterLongPress$default(PointerInputScope pointerInputScope, InterfaceC10570l interfaceC10570l, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, InterfaceC10574p interfaceC10574p, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10570l = new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.2
                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m20563invokek4lQ0M(((Offset) obj2).m24045unboximpl());
                    return C8736p.f16368a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m20563invokek4lQ0M(long j10) {
                }
            };
        }
        if ((i10 & 2) != 0) {
            interfaceC10559a = new InterfaceC10559a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.3
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m20564invoke() {
                }

                @Override // p300x7.InterfaceC10559a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m20564invoke();
                    return C8736p.f16368a;
                }
            };
        }
        if ((i10 & 4) != 0) {
            interfaceC10559a2 = new InterfaceC10559a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.4
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m20565invoke() {
                }

                @Override // p300x7.InterfaceC10559a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m20565invoke();
                    return C8736p.f16368a;
                }
            };
        }
        InterfaceC10559a interfaceC10559a3 = interfaceC10559a2;
        return detectDragGesturesAfterLongPress(pointerInputScope, interfaceC10570l, interfaceC10559a, interfaceC10559a3, interfaceC10574p, interfaceC9324c);
    }

    public static final Object detectHorizontalDragGestures(PointerInputScope pointerInputScope, InterfaceC10570l interfaceC10570l, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C12725(interfaceC10570l, interfaceC10574p, interfaceC10559a, interfaceC10559a2, null), interfaceC9324c);
        return objAwaitEachGesture == AbstractC9434a.m17291f() ? objAwaitEachGesture : C8736p.f16368a;
    }

    public static /* synthetic */ Object detectHorizontalDragGestures$default(PointerInputScope pointerInputScope, InterfaceC10570l interfaceC10570l, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, InterfaceC10574p interfaceC10574p, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10570l = new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.2
                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m20566invokek4lQ0M(((Offset) obj2).m24045unboximpl());
                    return C8736p.f16368a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m20566invokek4lQ0M(long j10) {
                }
            };
        }
        if ((i10 & 2) != 0) {
            interfaceC10559a = new InterfaceC10559a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.3
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m20567invoke() {
                }

                @Override // p300x7.InterfaceC10559a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m20567invoke();
                    return C8736p.f16368a;
                }
            };
        }
        if ((i10 & 4) != 0) {
            interfaceC10559a2 = new InterfaceC10559a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.4
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m20568invoke() {
                }

                @Override // p300x7.InterfaceC10559a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m20568invoke();
                    return C8736p.f16368a;
                }
            };
        }
        InterfaceC10559a interfaceC10559a3 = interfaceC10559a2;
        return detectHorizontalDragGestures(pointerInputScope, interfaceC10570l, interfaceC10559a, interfaceC10559a3, interfaceC10574p, interfaceC9324c);
    }

    public static final Object detectVerticalDragGestures(PointerInputScope pointerInputScope, InterfaceC10570l interfaceC10570l, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C12765(interfaceC10570l, interfaceC10574p, interfaceC10559a, interfaceC10559a2, null), interfaceC9324c);
        return objAwaitEachGesture == AbstractC9434a.m17291f() ? objAwaitEachGesture : C8736p.f16368a;
    }

    public static /* synthetic */ Object detectVerticalDragGestures$default(PointerInputScope pointerInputScope, InterfaceC10570l interfaceC10570l, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, InterfaceC10574p interfaceC10574p, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10570l = new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.2
                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m20569invokek4lQ0M(((Offset) obj2).m24045unboximpl());
                    return C8736p.f16368a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m20569invokek4lQ0M(long j10) {
                }
            };
        }
        if ((i10 & 2) != 0) {
            interfaceC10559a = new InterfaceC10559a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.3
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m20570invoke() {
                }

                @Override // p300x7.InterfaceC10559a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m20570invoke();
                    return C8736p.f16368a;
                }
            };
        }
        if ((i10 & 4) != 0) {
            interfaceC10559a2 = new InterfaceC10559a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.4
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m20571invoke() {
                }

                @Override // p300x7.InterfaceC10559a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m20571invoke();
                    return C8736p.f16368a;
                }
            };
        }
        InterfaceC10559a interfaceC10559a3 = interfaceC10559a2;
        return detectVerticalDragGestures(pointerInputScope, interfaceC10570l, interfaceC10559a, interfaceC10559a3, interfaceC10574p, interfaceC9324c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0125, code lost:
    
        if (((r3 != null ? r3 == androidx.compose.foundation.gestures.Orientation.Vertical ? java.lang.Float.intBitsToFloat((int) (r4 & 4294967295L)) : java.lang.Float.intBitsToFloat((int) (r4 >> 32)) : androidx.compose.p013ui.geometry.Offset.m24033getDistanceimpl(r4)) == 0.0f) == false) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:35:0x00d0, B:46:0x00fa], limit reached: 69 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r15v2, types: [androidx.compose.ui.input.pointer.PointerInputChange] */
    /* JADX WARN: Type inference failed for: r15v3, types: [androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6, types: [x7.l] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r8v3, types: [x7.l] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008d -> B:23:0x0093). Please report as a decompilation issue!!! */
    /* renamed from: drag-VnAYq1g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m20552dragVnAYq1g(androidx.compose.p013ui.input.pointer.AwaitPointerEventScope r19, long r20, p300x7.InterfaceC10570l r22, androidx.compose.foundation.gestures.Orientation r23, p300x7.InterfaceC10570l r24, p179m7.InterfaceC9324c<? super androidx.compose.p013ui.input.pointer.PointerInputChange> r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m20552dragVnAYq1g(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, x7.l, androidx.compose.foundation.gestures.Orientation, x7.l, m7.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: drag-VnAYq1g$$forInline, reason: not valid java name */
    private static final Object m20553dragVnAYq1g$$forInline(AwaitPointerEventScope awaitPointerEventScope, long j10, InterfaceC10570l interfaceC10570l, Orientation orientation, InterfaceC10570l interfaceC10570l2, InterfaceC9324c<? super PointerInputChange> interfaceC9324c) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        long jM25500getIdJ3iCeTQ = j10;
        if (m20556isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), jM25500getIdJ3iCeTQ)) {
            return null;
        }
        while (true) {
            Ref$LongRef ref$LongRef = new Ref$LongRef();
            ref$LongRef.f17472a = jM25500getIdJ3iCeTQ;
            while (true) {
                AbstractC9131s.m16126c(0);
                Object objAwaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, interfaceC9324c, 1, null);
                AbstractC9131s.m16126c(1);
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
                    if (Boolean.valueOf(PointerId.m25484equalsimpl0(pointerInputChange.m25500getIdJ3iCeTQ(), ref$LongRef.f17472a)).booleanValue()) {
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
                    ref$LongRef.f17472a = pointerInputChange4.m25500getIdJ3iCeTQ();
                } else {
                    long jPositionChangeIgnoreConsumed = PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange2);
                    if (Boolean.valueOf(((orientation == null ? Offset.m24033getDistanceimpl(jPositionChangeIgnoreConsumed) : orientation == Orientation.Vertical ? Float.intBitsToFloat((int) (jPositionChangeIgnoreConsumed & 4294967295L)) : Float.intBitsToFloat((int) (jPositionChangeIgnoreConsumed >> 32))) == 0.0f ? 1 : 0) ^ 1).booleanValue()) {
                        break;
                    }
                }
            }
            if (pointerInputChange2 == null || ((Boolean) interfaceC10570l2.invoke(pointerInputChange2)).booleanValue()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                return pointerInputChange2;
            }
            interfaceC10570l.invoke(pointerInputChange2);
            jM25500getIdJ3iCeTQ = pointerInputChange2.m25500getIdJ3iCeTQ();
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
    public static final java.lang.Object m20554dragjO51t88(androidx.compose.p013ui.input.pointer.AwaitPointerEventScope r4, long r5, p300x7.InterfaceC10570l r7, p179m7.InterfaceC9324c<? super java.lang.Boolean> r8) throws java.lang.Throwable {
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.L$1
            x7.l r4 = (p300x7.InterfaceC10570l) r4
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r5
            kotlin.AbstractC9079b.m15926b(r8)
            r7 = r4
            r4 = r5
            goto L4b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.AbstractC9079b.m15926b(r8)
        L3e:
            r0.L$0 = r4
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = m20539awaitDragOrCancellationrnUCldI(r4, r5, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r8
            if (r8 != 0) goto L55
            r4 = 0
            java.lang.Boolean r4 = p201o7.AbstractC9536a.m17796a(r4)
            return r4
        L55:
            boolean r5 = androidx.compose.p013ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r8)
            if (r5 == 0) goto L60
            java.lang.Boolean r4 = p201o7.AbstractC9536a.m17796a(r3)
            return r4
        L60:
            r7.invoke(r8)
            long r5 = r8.m25500getIdJ3iCeTQ()
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m20554dragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, x7.l, m7.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0112, code lost:
    
        if ((r0 == 0.0f) == false) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:35:0x00c2, B:46:0x00eb], limit reached: 73 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0083 -> B:23:0x0089). Please report as a decompilation issue!!! */
    /* renamed from: horizontalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m20555horizontalDragjO51t88(androidx.compose.p013ui.input.pointer.AwaitPointerEventScope r17, long r18, p300x7.InterfaceC10570l r20, p179m7.InterfaceC9324c<? super java.lang.Boolean> r21) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m20555horizontalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, x7.l, m7.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    public static final boolean m20556isPointerUpDmW0f2w(PointerEvent pointerEvent, long j10) {
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
            if (PointerId.m25484equalsimpl0(pointerInputChange.m25500getIdJ3iCeTQ(), j10)) {
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
    public static final float m20557pointerSlopE8SPZFQ(ViewConfiguration viewConfiguration, int i10) {
        return PointerType.m25573equalsimpl0(i10, PointerType.Companion.m25578getMouseT8wyACA()) ? viewConfiguration.getTouchSlop() * mouseToTouchSlopRatio : viewConfiguration.getTouchSlop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0112, code lost:
    
        if ((r0 == 0.0f) == false) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:35:0x00c2, B:46:0x00eb], limit reached: 73 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0083 -> B:23:0x0089). Please report as a decompilation issue!!! */
    /* renamed from: verticalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m20558verticalDragjO51t88(androidx.compose.p013ui.input.pointer.AwaitPointerEventScope r17, long r18, p300x7.InterfaceC10570l r20, p179m7.InterfaceC9324c<? super java.lang.Boolean> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m20558verticalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, x7.l, m7.c):java.lang.Object");
    }

    public static final Object detectDragGestures(PointerInputScope pointerInputScope, InterfaceC10575q interfaceC10575q, InterfaceC10570l interfaceC10570l, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, Orientation orientation, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C12649(interfaceC10559a2, new Ref$LongRef(), orientation, interfaceC10575q, interfaceC10574p, interfaceC10559a, interfaceC10570l, null), interfaceC9324c);
        return objAwaitEachGesture == AbstractC9434a.m17291f() ? objAwaitEachGesture : C8736p.f16368a;
    }
}
