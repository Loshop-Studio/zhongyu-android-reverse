package androidx.compose.p013ui.input.pointer;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.platform.ViewConfiguration;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.DpRect;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9131s;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.C9155c;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC9212n;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8845j;
import p179m7.AbstractC9325d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9541f;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class SuspendingPointerInputModifierNodeImpl extends Modifier.Node implements SuspendingPointerInputModifierNode, PointerInputScope, Density {
    public static final int $stable = 0;
    private InterfaceC10574p _deprecatedPointerInputHandler;
    private PointerInputEventHandler _pointerInputEventHandler;
    private long boundsSize;
    private PointerEvent currentEvent;
    private final MutableVector<PointerEventHandlerCoroutine<?>> dispatchingPointerHandlers;
    private boolean interceptOutOfBoundsChildEvents;
    private Object key1;
    private Object key2;
    private Object[] keys;
    private PointerEvent lastPointerEvent;
    private final MutableVector<PointerEventHandlerCoroutine<?>> pointerHandlers;
    private final Object pointerHandlersLock;
    private InterfaceC9212n pointerInputJob;

    public final class PointerEventHandlerCoroutine<R> implements AwaitPointerEventScope, Density, InterfaceC9324c<R> {
        private final /* synthetic */ SuspendingPointerInputModifierNodeImpl $$delegate_0;
        private final InterfaceC9324c<R> completion;
        private InterfaceC8845j pointerAwaiter;
        private PointerEventPass awaitPass = PointerEventPass.Main;
        private final InterfaceC9100d context = EmptyCoroutineContext.f17438a;

        /* JADX WARN: Multi-variable type inference failed */
        public PointerEventHandlerCoroutine(InterfaceC9324c<? super R> interfaceC9324c) {
            this.completion = interfaceC9324c;
            this.$$delegate_0 = SuspendingPointerInputModifierNodeImpl.this;
        }

        @Override // androidx.compose.p013ui.input.pointer.AwaitPointerEventScope
        public Object awaitPointerEvent(PointerEventPass pointerEventPass, InterfaceC9324c<? super PointerEvent> interfaceC9324c) {
            C9155c c9155c = new C9155c(IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c), 1);
            c9155c.m16343D();
            this.awaitPass = pointerEventPass;
            this.pointerAwaiter = c9155c;
            Object objM16372x = c9155c.m16372x();
            if (objM16372x == AbstractC9434a.m17291f()) {
                AbstractC9541f.m17811c(interfaceC9324c);
            }
            return objM16372x;
        }

        public final void cancel(Throwable th) {
            InterfaceC8845j interfaceC8845j = this.pointerAwaiter;
            if (interfaceC8845j != null) {
                interfaceC8845j.mo14871i(th);
            }
            this.pointerAwaiter = null;
        }

        @Override // p179m7.InterfaceC9324c
        public InterfaceC9100d getContext() {
            return this.context;
        }

        @Override // androidx.compose.p013ui.input.pointer.AwaitPointerEventScope
        public PointerEvent getCurrentEvent() {
            return SuspendingPointerInputModifierNodeImpl.this.currentEvent;
        }

        @Override // androidx.compose.p013ui.unit.Density
        public float getDensity() {
            return this.$$delegate_0.getDensity();
        }

        @Override // androidx.compose.p013ui.input.pointer.AwaitPointerEventScope
        /* renamed from: getExtendedTouchPadding-NH-jbRc */
        public long mo25409getExtendedTouchPaddingNHjbRc() {
            return SuspendingPointerInputModifierNodeImpl.this.mo20487getExtendedTouchPaddingNHjbRc();
        }

        @Override // androidx.compose.p013ui.unit.FontScaling
        public float getFontScale() {
            return this.$$delegate_0.getFontScale();
        }

        @Override // androidx.compose.p013ui.input.pointer.AwaitPointerEventScope
        /* renamed from: getSize-YbymL2g */
        public long mo25410getSizeYbymL2g() {
            return SuspendingPointerInputModifierNodeImpl.this.boundsSize;
        }

        @Override // androidx.compose.p013ui.input.pointer.AwaitPointerEventScope
        public ViewConfiguration getViewConfiguration() {
            return SuspendingPointerInputModifierNodeImpl.this.getViewConfiguration();
        }

        public final void offerPointerEvent(PointerEvent pointerEvent, PointerEventPass pointerEventPass) {
            InterfaceC8845j interfaceC8845j;
            if (pointerEventPass != this.awaitPass || (interfaceC8845j = this.pointerAwaiter) == null) {
                return;
            }
            this.pointerAwaiter = null;
            interfaceC8845j.resumeWith(Result.m15909b(pointerEvent));
        }

        @Override // p179m7.InterfaceC9324c
        public void resumeWith(Object obj) {
            Object obj2 = SuspendingPointerInputModifierNodeImpl.this.pointerHandlersLock;
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = SuspendingPointerInputModifierNodeImpl.this;
            synchronized (obj2) {
                suspendingPointerInputModifierNodeImpl.pointerHandlers.remove(this);
                C8736p c8736p = C8736p.f16368a;
            }
            this.completion.resumeWith(obj);
        }

        @Override // androidx.compose.p013ui.unit.Density
        @Stable
        /* renamed from: roundToPx--R2X_6o */
        public int mo20490roundToPxR2X_6o(long j10) {
            return this.$$delegate_0.mo20490roundToPxR2X_6o(j10);
        }

        @Override // androidx.compose.p013ui.unit.Density
        @Stable
        /* renamed from: roundToPx-0680j_4 */
        public int mo20491roundToPx0680j_4(float f10) {
            return this.$$delegate_0.mo20491roundToPx0680j_4(f10);
        }

        @Override // androidx.compose.p013ui.unit.FontScaling
        @Stable
        /* renamed from: toDp-GaN1DYA */
        public float mo20492toDpGaN1DYA(long j10) {
            return this.$$delegate_0.mo20492toDpGaN1DYA(j10);
        }

        @Override // androidx.compose.p013ui.unit.Density
        @Stable
        /* renamed from: toDp-u2uoSUM */
        public float mo20493toDpu2uoSUM(float f10) {
            return this.$$delegate_0.mo20493toDpu2uoSUM(f10);
        }

        @Override // androidx.compose.p013ui.unit.Density
        @Stable
        /* renamed from: toDpSize-k-rfVVM */
        public long mo20495toDpSizekrfVVM(long j10) {
            return this.$$delegate_0.mo20495toDpSizekrfVVM(j10);
        }

        @Override // androidx.compose.p013ui.unit.Density
        @Stable
        /* renamed from: toPx--R2X_6o */
        public float mo20496toPxR2X_6o(long j10) {
            return this.$$delegate_0.mo20496toPxR2X_6o(j10);
        }

        @Override // androidx.compose.p013ui.unit.Density
        @Stable
        /* renamed from: toPx-0680j_4 */
        public float mo20497toPx0680j_4(float f10) {
            return this.$$delegate_0.mo20497toPx0680j_4(f10);
        }

        @Override // androidx.compose.p013ui.unit.Density
        @Stable
        public Rect toRect(DpRect dpRect) {
            return this.$$delegate_0.toRect(dpRect);
        }

        @Override // androidx.compose.p013ui.unit.Density
        @Stable
        /* renamed from: toSize-XkaWNTQ */
        public long mo20498toSizeXkaWNTQ(long j10) {
            return this.$$delegate_0.mo20498toSizeXkaWNTQ(j10);
        }

        @Override // androidx.compose.p013ui.unit.FontScaling
        @Stable
        /* renamed from: toSp-0xMU5do */
        public long mo20499toSp0xMU5do(float f10) {
            return this.$$delegate_0.mo20499toSp0xMU5do(f10);
        }

        @Override // androidx.compose.p013ui.unit.Density
        @Stable
        /* renamed from: toSp-kPz2Gy4 */
        public long mo20500toSpkPz2Gy4(float f10) {
            return this.$$delegate_0.mo20500toSpkPz2Gy4(f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r11v0, types: [long] */
        /* JADX WARN: Type inference failed for: r11v1, types: [kotlinx.coroutines.n] */
        /* JADX WARN: Type inference failed for: r11v3, types: [kotlinx.coroutines.n] */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8 */
        /* JADX WARN: Type inference failed for: r13v0, types: [x7.p] */
        @Override // androidx.compose.p013ui.input.pointer.AwaitPointerEventScope
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public <T> java.lang.Object withTimeout(long r11, p300x7.InterfaceC10574p r13, p179m7.InterfaceC9324c<? super T> r14) throws java.lang.Throwable {
            /*
                r10 = this;
                boolean r0 = r14 instanceof androidx.compose.p013ui.input.pointer.C2862x647a7347
                if (r0 == 0) goto L13
                r0 = r14
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 r0 = (androidx.compose.p013ui.input.pointer.C2862x647a7347) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1
                r0.<init>(r10, r14)
            L18:
                java.lang.Object r14 = r0.result
                java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r11 = r0.L$0
                kotlinx.coroutines.n r11 = (kotlinx.coroutines.InterfaceC9212n) r11
                kotlin.AbstractC9079b.m15926b(r14)     // Catch: java.lang.Throwable -> L2d
                goto L76
            L2d:
                r0 = move-exception
                r12 = r0
                goto L7c
            L30:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L38:
                kotlin.AbstractC9079b.m15926b(r14)
                r4 = 0
                int r14 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r14 > 0) goto L57
                i8.j r14 = r10.pointerAwaiter
                if (r14 == 0) goto L57
                kotlin.Result$a r2 = kotlin.Result.f17350b
                androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                r2.<init>(r11)
                java.lang.Object r2 = kotlin.AbstractC9079b.m15925a(r2)
                java.lang.Object r2 = kotlin.Result.m15909b(r2)
                r14.resumeWith(r2)
            L57:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl r14 = androidx.compose.p013ui.input.pointer.SuspendingPointerInputModifierNodeImpl.this
                i8.b0 r4 = r14.getCoroutineScope()
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1 r7 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1
                r14 = 0
                r7.<init>(r11, r10, r14)
                r8 = 3
                r9 = 0
                r5 = 0
                r6 = 0
                kotlinx.coroutines.n r11 = p135i8.AbstractC8833f.m14845d(r4, r5, r6, r7, r8, r9)
                r0.L$0 = r11     // Catch: java.lang.Throwable -> L2d
                r0.label = r3     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r14 = r13.invoke(r10, r0)     // Catch: java.lang.Throwable -> L2d
                if (r14 != r1) goto L76
                return r1
            L76:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r12 = androidx.compose.p013ui.input.pointer.CancelTimeoutCancellationException.INSTANCE
                r11.cancel(r12)
                return r14
            L7c:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r13 = androidx.compose.p013ui.input.pointer.CancelTimeoutCancellationException.INSTANCE
                r11.cancel(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine.withTimeout(long, x7.p, m7.c):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // androidx.compose.p013ui.input.pointer.AwaitPointerEventScope
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public <T> java.lang.Object withTimeoutOrNull(long r5, p300x7.InterfaceC10574p r7, p179m7.InterfaceC9324c<? super T> r8) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r8 instanceof androidx.compose.p013ui.input.pointer.C2864x2677a771
                if (r0 == 0) goto L13
                r0 = r8
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = (androidx.compose.p013ui.input.pointer.C2864x2677a771) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                r0.<init>(r4, r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.AbstractC9079b.m15926b(r8)     // Catch: androidx.compose.p013ui.input.pointer.PointerEventTimeoutCancellationException -> L3e
                return r8
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.AbstractC9079b.m15926b(r8)
                r0.label = r3     // Catch: androidx.compose.p013ui.input.pointer.PointerEventTimeoutCancellationException -> L3e
                java.lang.Object r5 = r4.withTimeout(r5, r7, r0)     // Catch: androidx.compose.p013ui.input.pointer.PointerEventTimeoutCancellationException -> L3e
                if (r5 != r1) goto L3d
                return r1
            L3d:
                return r5
            L3e:
                r5 = 0
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine.withTimeoutOrNull(long, x7.p, m7.c):java.lang.Object");
        }

        @Override // androidx.compose.p013ui.unit.Density
        @Stable
        /* renamed from: toDp-u2uoSUM */
        public float mo20494toDpu2uoSUM(int i10) {
            return this.$$delegate_0.mo20494toDpu2uoSUM(i10);
        }

        @Override // androidx.compose.p013ui.unit.Density
        @Stable
        /* renamed from: toSp-kPz2Gy4 */
        public long mo20501toSpkPz2Gy4(int i10) {
            return this.$$delegate_0.mo20501toSpkPz2Gy4(i10);
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PointerEventPass.values().length];
            try {
                iArr[PointerEventPass.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointerEventPass.Final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointerEventPass.Main.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ SuspendingPointerInputModifierNodeImpl(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? null : obj, (i10 & 2) != 0 ? null : obj2, (i10 & 4) != 0 ? null : objArr, pointerInputEventHandler);
    }

    private final void dispatchPointerEvent(PointerEvent pointerEvent, PointerEventPass pointerEventPass) {
        synchronized (this.pointerHandlersLock) {
            MutableVector<PointerEventHandlerCoroutine<?>> mutableVector = this.dispatchingPointerHandlers;
            mutableVector.addAll(mutableVector.getSize(), this.pointerHandlers);
        }
        try {
            int i10 = WhenMappings.$EnumSwitchMapping$0[pointerEventPass.ordinal()];
            if (i10 == 1 || i10 == 2) {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector2 = this.dispatchingPointerHandlers;
                PointerEventHandlerCoroutine<?>[] pointerEventHandlerCoroutineArr = mutableVector2.content;
                int size = mutableVector2.getSize();
                for (int i11 = 0; i11 < size; i11++) {
                    pointerEventHandlerCoroutineArr[i11].offerPointerEvent(pointerEvent, pointerEventPass);
                }
            } else if (i10 == 3) {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector3 = this.dispatchingPointerHandlers;
                int size2 = mutableVector3.getSize() - 1;
                PointerEventHandlerCoroutine<?>[] pointerEventHandlerCoroutineArr2 = mutableVector3.content;
                if (size2 < pointerEventHandlerCoroutineArr2.length) {
                    while (size2 >= 0) {
                        pointerEventHandlerCoroutineArr2[size2].offerPointerEvent(pointerEvent, pointerEventPass);
                        size2--;
                    }
                }
            }
        } finally {
            this.dispatchingPointerHandlers.clear();
        }
    }

    private final void forEachCurrentPointerHandler(PointerEventPass pointerEventPass, InterfaceC10570l interfaceC10570l) {
        synchronized (this.pointerHandlersLock) {
            try {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector = this.dispatchingPointerHandlers;
                mutableVector.addAll(mutableVector.getSize(), this.pointerHandlers);
                AbstractC9131s.m16125b(1);
            } catch (Throwable th) {
                AbstractC9131s.m16125b(1);
                AbstractC9131s.m16124a(1);
                throw th;
            }
        }
        AbstractC9131s.m16124a(1);
        try {
            int i10 = WhenMappings.$EnumSwitchMapping$0[pointerEventPass.ordinal()];
            if (i10 == 1 || i10 == 2) {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector2 = this.dispatchingPointerHandlers;
                PointerEventHandlerCoroutine<?>[] pointerEventHandlerCoroutineArr = mutableVector2.content;
                int size = mutableVector2.getSize();
                for (int i11 = 0; i11 < size; i11++) {
                    interfaceC10570l.invoke(pointerEventHandlerCoroutineArr[i11]);
                }
            } else if (i10 == 3) {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector3 = this.dispatchingPointerHandlers;
                int size2 = mutableVector3.getSize() - 1;
                PointerEventHandlerCoroutine<?>[] pointerEventHandlerCoroutineArr2 = mutableVector3.content;
                if (size2 < pointerEventHandlerCoroutineArr2.length) {
                    while (size2 >= 0) {
                        interfaceC10570l.invoke(pointerEventHandlerCoroutineArr2[size2]);
                        size2--;
                    }
                }
            }
        } finally {
            AbstractC9131s.m16125b(1);
            this.dispatchingPointerHandlers.clear();
            AbstractC9131s.m16124a(1);
        }
    }

    @InterfaceC8721a
    public static /* synthetic */ void getPointerInputHandler$annotations() {
    }

    @Override // androidx.compose.p013ui.input.pointer.PointerInputScope
    public <R> Object awaitPointerEventScope(InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super R> interfaceC9324c) {
        C9155c c9155c = new C9155c(IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c), 1);
        c9155c.m16343D();
        final PointerEventHandlerCoroutine pointerEventHandlerCoroutine = new PointerEventHandlerCoroutine(c9155c);
        synchronized (this.pointerHandlersLock) {
            this.pointerHandlers.add(pointerEventHandlerCoroutine);
            InterfaceC9324c interfaceC9324cM17153b = AbstractC9325d.m17153b(interfaceC10574p, pointerEventHandlerCoroutine, pointerEventHandlerCoroutine);
            Result.C9076a c9076a = Result.f17350b;
            interfaceC9324cM17153b.resumeWith(Result.m15909b(C8736p.f16368a));
        }
        c9155c.mo14873r(new InterfaceC10570l() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$awaitPointerEventScope$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Throwable th) {
                pointerEventHandlerCoroutine.cancel(th);
            }
        });
        Object objM16372x = c9155c.m16372x();
        if (objM16372x == AbstractC9434a.m17291f()) {
            AbstractC9541f.m17811c(interfaceC9324c);
        }
        return objM16372x;
    }

    @Override // androidx.compose.p013ui.unit.Density
    public float getDensity() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity().getDensity();
    }

    @Override // androidx.compose.p013ui.input.pointer.PointerInputScope
    /* renamed from: getExtendedTouchPadding-NH-jbRc */
    public long mo20487getExtendedTouchPaddingNHjbRc() {
        long jMo20498toSizeXkaWNTQ = mo20498toSizeXkaWNTQ(getViewConfiguration().mo25816getMinimumTouchTargetSizeMYxV2XQ());
        long jMo20488getSizeYbymL2g = mo20488getSizeYbymL2g();
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jMo20498toSizeXkaWNTQ >> 32)) - ((int) (jMo20488getSizeYbymL2g >> 32))) / 2.0f;
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (jMo20498toSizeXkaWNTQ & 4294967295L)) - ((int) (jMo20488getSizeYbymL2g & 4294967295L))) / 2.0f;
        return Size.m24095constructorimpl((Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L));
    }

    @Override // androidx.compose.p013ui.unit.FontScaling
    public float getFontScale() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity().getFontScale();
    }

    @Override // androidx.compose.p013ui.input.pointer.PointerInputScope
    public boolean getInterceptOutOfBoundsChildEvents() {
        return this.interceptOutOfBoundsChildEvents;
    }

    @Override // androidx.compose.p013ui.input.pointer.SuspendingPointerInputModifierNode
    public PointerInputEventHandler getPointerInputEventHandler() {
        return this._pointerInputEventHandler;
    }

    @Override // androidx.compose.p013ui.input.pointer.SuspendingPointerInputModifierNode
    public InterfaceC10574p getPointerInputHandler() {
        InterfaceC10574p interfaceC10574p = this._deprecatedPointerInputHandler;
        return interfaceC10574p == null ? new SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1(null) : interfaceC10574p;
    }

    @Override // androidx.compose.p013ui.input.pointer.PointerInputScope
    /* renamed from: getSize-YbymL2g */
    public long mo20488getSizeYbymL2g() {
        return this.boundsSize;
    }

    @Override // androidx.compose.p013ui.input.pointer.PointerInputScope
    public ViewConfiguration getViewConfiguration() {
        return DelegatableNodeKt.requireLayoutNode(this).getViewConfiguration();
    }

    @Override // androidx.compose.p013ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        PointerEvent pointerEvent = this.lastPointerEvent;
        if (pointerEvent == null) {
            return;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (changes.get(i10).getPressed()) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                ArrayList arrayList = new ArrayList(changes2.size());
                int size2 = changes2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    PointerInputChange pointerInputChange = changes2.get(i11);
                    arrayList.add(new PointerInputChange(pointerInputChange.m25500getIdJ3iCeTQ(), pointerInputChange.getUptimeMillis(), pointerInputChange.m25502getPositionF1C5BW0(), false, pointerInputChange.getPressure(), pointerInputChange.getUptimeMillis(), pointerInputChange.m25502getPositionF1C5BW0(), pointerInputChange.getPressed(), pointerInputChange.getPressed(), pointerInputChange.m25505getTypeT8wyACA(), 0L, 1024, (AbstractC9126n) null));
                }
                PointerEvent pointerEvent2 = new PointerEvent(arrayList);
                this.currentEvent = pointerEvent2;
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Initial);
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Main);
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Final);
                this.lastPointerEvent = null;
                return;
            }
        }
    }

    @Override // androidx.compose.p013ui.node.DelegatableNode, androidx.compose.p013ui.node.PointerInputModifierNode
    public void onDensityChange() {
        resetPointerInputHandler();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        resetPointerInputHandler();
        super.onDetach();
    }

    @Override // androidx.compose.p013ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo20318onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j10) {
        this.boundsSize = j10;
        if (pointerEventPass == PointerEventPass.Initial) {
            this.currentEvent = pointerEvent;
        }
        if (this.pointerInputJob == null) {
            this.pointerInputJob = AbstractC8839h.m14861d(getCoroutineScope(), null, CoroutineStart.f17555d, new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this, null), 1, null);
        }
        dispatchPointerEvent(pointerEvent, pointerEventPass);
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = true;
                break;
            } else if (!PointerEventKt.changedToUpIgnoreConsumed(changes.get(i10))) {
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            pointerEvent = null;
        }
        this.lastPointerEvent = pointerEvent;
    }

    @Override // androidx.compose.p013ui.node.PointerInputModifierNode
    public void onViewConfigurationChange() {
        resetPointerInputHandler();
    }

    @Override // androidx.compose.p013ui.input.pointer.SuspendingPointerInputModifierNode
    public void resetPointerInputHandler() {
        InterfaceC9212n interfaceC9212n = this.pointerInputJob;
        if (interfaceC9212n != null) {
            interfaceC9212n.cancel(new PointerInputResetException());
            this.pointerInputJob = null;
        }
    }

    @Override // androidx.compose.p013ui.input.pointer.PointerInputScope
    public void setInterceptOutOfBoundsChildEvents(boolean z10) {
        this.interceptOutOfBoundsChildEvents = z10;
    }

    @Override // androidx.compose.p013ui.input.pointer.SuspendingPointerInputModifierNode
    public void setPointerInputEventHandler(PointerInputEventHandler pointerInputEventHandler) {
        resetPointerInputHandler();
        this._deprecatedPointerInputHandler = null;
        this._pointerInputEventHandler = pointerInputEventHandler;
    }

    @Override // androidx.compose.p013ui.input.pointer.SuspendingPointerInputModifierNode
    public void setPointerInputHandler(InterfaceC10574p interfaceC10574p) {
        resetPointerInputHandler();
        this._deprecatedPointerInputHandler = interfaceC10574p;
    }

    public final void update$ui_release(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        boolean z10 = !AbstractC9133u.m16128b(this.key1, obj);
        this.key1 = obj;
        if (!AbstractC9133u.m16128b(this.key2, obj2)) {
            z10 = true;
        }
        this.key2 = obj2;
        Object[] objArr2 = this.keys;
        if (objArr2 != null && objArr == null) {
            z10 = true;
        }
        if (objArr2 == null && objArr != null) {
            z10 = true;
        }
        if (objArr2 != null && objArr != null && !Arrays.equals(objArr, objArr2)) {
            z10 = true;
        }
        this.keys = objArr;
        if (getPointerInputEventHandler().getClass() == pointerInputEventHandler.getClass() ? z10 : true) {
            resetPointerInputHandler();
        }
        this._pointerInputEventHandler = pointerInputEventHandler;
    }

    public SuspendingPointerInputModifierNodeImpl(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.key1 = obj;
        this.key2 = obj2;
        this.keys = objArr;
        this._pointerInputEventHandler = pointerInputEventHandler;
        this.currentEvent = SuspendingPointerInputFilterKt.EmptyPointerEvent;
        MutableVector<PointerEventHandlerCoroutine<?>> mutableVector = new MutableVector<>(new PointerEventHandlerCoroutine[16], 0);
        this.pointerHandlers = mutableVector;
        this.pointerHandlersLock = mutableVector;
        this.dispatchingPointerHandlers = new MutableVector<>(new PointerEventHandlerCoroutine[16], 0);
        this.boundsSize = IntSize.Companion.m27075getZeroYbymL2g();
    }

    @InterfaceC8721a
    public SuspendingPointerInputModifierNodeImpl(Object obj, Object obj2, Object[] objArr, InterfaceC10574p interfaceC10574p) {
        this(obj, obj2, objArr, new PointerInputEventHandler() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.1
            @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return C8736p.f16368a;
            }
        });
        this._deprecatedPointerInputHandler = interfaceC10574p;
    }
}
