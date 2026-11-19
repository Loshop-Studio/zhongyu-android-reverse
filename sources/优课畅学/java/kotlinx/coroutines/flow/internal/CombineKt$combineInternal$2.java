package kotlinx.coroutines.flow.internal;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.InterfaceC9158a;
import kotlinx.coroutines.channels.InterfaceC9163f;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", m17801f = "Combine.kt", m17802l = {51, 73, 76}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class CombineKt$combineInternal$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f18026a;

    /* renamed from: b */
    public Object f18027b;

    /* renamed from: c */
    public int f18028c;

    /* renamed from: d */
    public int f18029d;

    /* renamed from: e */
    public int f18030e;

    /* renamed from: f */
    public /* synthetic */ Object f18031f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC9266c[] f18032g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC10559a f18033h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC10575q f18034i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC9267d f18035j;

    @InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", m17801f = "Combine.kt", m17802l = {28}, m17803m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1 */
    public static final class C92011 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f18036a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC9266c[] f18037b;

        /* renamed from: c */
        public final /* synthetic */ int f18038c;

        /* renamed from: d */
        public final /* synthetic */ AtomicInteger f18039d;

        /* renamed from: e */
        public final /* synthetic */ InterfaceC9158a f18040e;

        /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1, reason: invalid class name */
        public static final class AnonymousClass1 implements InterfaceC9267d {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC9158a f18041a;

            /* renamed from: b */
            public final /* synthetic */ int f18042b;

            public AnonymousClass1(InterfaceC9158a interfaceC9158a, int i10) {
                this.f18041a = interfaceC9158a;
                this.f18042b = i10;
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
            
                if (p135i8.AbstractC8820a2.m14803a(r0) == r1) goto L21;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // p169l8.InterfaceC9267d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, p179m7.InterfaceC9324c r8) throws java.lang.Throwable {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1) r0
                    int r1 = r0.f18045c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f18045c = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                    r0.<init>(r6, r8)
                L18:
                    java.lang.Object r8 = r0.f18043a
                    java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                    int r2 = r0.f18045c
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L38
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.AbstractC9079b.m15926b(r8)
                    goto L56
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    kotlin.AbstractC9079b.m15926b(r8)
                    goto L4d
                L38:
                    kotlin.AbstractC9079b.m15926b(r8)
                    kotlinx.coroutines.channels.a r8 = r6.f18041a
                    i7.j0 r2 = new i7.j0
                    int r5 = r6.f18042b
                    r2.<init>(r5, r7)
                    r0.f18045c = r4
                    java.lang.Object r7 = r8.send(r2, r0)
                    if (r7 != r1) goto L4d
                    goto L55
                L4d:
                    r0.f18045c = r3
                    java.lang.Object r7 = p135i8.AbstractC8820a2.m14803a(r0)
                    if (r7 != r1) goto L56
                L55:
                    return r1
                L56:
                    h7.p r7 = p123h7.C8736p.f16368a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.C92011.AnonymousClass1.emit(java.lang.Object, m7.c):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C92011(InterfaceC9266c[] interfaceC9266cArr, int i10, AtomicInteger atomicInteger, InterfaceC9158a interfaceC9158a, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f18037b = interfaceC9266cArr;
            this.f18038c = i10;
            this.f18039d = atomicInteger;
            this.f18040e = interfaceC9158a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return new C92011(this.f18037b, this.f18038c, this.f18039d, this.f18040e, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C92011) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AtomicInteger atomicInteger;
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f18036a;
            try {
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC9266c[] interfaceC9266cArr = this.f18037b;
                    int i11 = this.f18038c;
                    InterfaceC9266c interfaceC9266c = interfaceC9266cArr[i11];
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f18040e, i11);
                    this.f18036a = 1;
                    if (interfaceC9266c.collect(anonymousClass1, this) == objM17291f) {
                        return objM17291f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    InterfaceC9163f.a.m16549a(this.f18040e, null, 1, null);
                }
                return C8736p.f16368a;
            } finally {
                if (this.f18039d.decrementAndGet() == 0) {
                    InterfaceC9163f.a.m16549a(this.f18040e, null, 1, null);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$combineInternal$2(InterfaceC9266c[] interfaceC9266cArr, InterfaceC10559a interfaceC10559a, InterfaceC10575q interfaceC10575q, InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f18032g = interfaceC9266cArr;
        this.f18033h = interfaceC10559a;
        this.f18034i = interfaceC10575q;
        this.f18035j = interfaceC9267d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(this.f18032g, this.f18033h, this.f18034i, this.f18035j, interfaceC9324c);
        combineKt$combineInternal$2.f18031f = obj;
        return combineKt$combineInternal$2;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((CombineKt$combineInternal$2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0106, code lost:
    
        if (r10.invoke(r11, r9, r21) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0126, code lost:
    
        if (r11.invoke(r12, r10, r21) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0129, code lost:
    
        if (r6 != 0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1 A[LOOP:0: B:28:0x00c1->B:47:?, LOOP_START, PHI: r6 r10
      0x00c1: PHI (r6v4 int) = (r6v3 int), (r6v5 int) binds: [B:25:0x00bc, B:47:?] A[DONT_GENERATE, DONT_INLINE]
      0x00c1: PHI (r10v5 i7.j0) = (r10v4 i7.j0), (r10v12 i7.j0) binds: [B:25:0x00bc, B:47:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0106 -> B:44:0x0129). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0126 -> B:44:0x0129). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
