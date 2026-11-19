package kotlinx.coroutines.flow;

import com.tencent.smtt.sdk.TbsListener;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10575q;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", m17801f = "Delay.kt", m17802l = {TbsListener.ErrorCode.COPY_EXCEPTION, TbsListener.ErrorCode.INFO_CORE_EXIST_NOT_LOAD}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class FlowKt__DelayKt$debounceInternal$1 extends SuspendLambda implements InterfaceC10575q {

    /* renamed from: a */
    public Object f17719a;

    /* renamed from: b */
    public Object f17720b;

    /* renamed from: c */
    public int f17721c;

    /* renamed from: d */
    public /* synthetic */ Object f17722d;

    /* renamed from: e */
    public /* synthetic */ Object f17723e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC10570l f17724f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC9266c f17725g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1(InterfaceC10570l interfaceC10570l, InterfaceC9266c interfaceC9266c, InterfaceC9324c interfaceC9324c) {
        super(3, interfaceC9324c);
        this.f17724f = interfaceC10570l;
        this.f17725g = interfaceC9266c;
    }

    @Override // p300x7.InterfaceC10575q
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new FlowKt__DelayKt$debounceInternal$1(this.f17724f, this.f17725g, interfaceC9324c);
        flowKt__DelayKt$debounceInternal$1.f17722d = interfaceC8822b0;
        flowKt__DelayKt$debounceInternal$1.f17723e = interfaceC9267d;
        return flowKt__DelayKt$debounceInternal$1.invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
    
        if (r7.emit(r15, r14) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e2, code lost:
    
        if (r7.m16848o(r14) != r0) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4 A[PHI: r1 r5 r6 r7
      0x00a4: PHI (r1v3 kotlin.jvm.internal.Ref$LongRef) = (r1v5 kotlin.jvm.internal.Ref$LongRef), (r1v7 kotlin.jvm.internal.Ref$LongRef), (r1v7 kotlin.jvm.internal.Ref$LongRef) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r5v3 kotlin.jvm.internal.Ref$ObjectRef) = 
      (r5v5 kotlin.jvm.internal.Ref$ObjectRef)
      (r5v6 kotlin.jvm.internal.Ref$ObjectRef)
      (r5v6 kotlin.jvm.internal.Ref$ObjectRef)
     binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r6v2 k8.i) = (r6v4 k8.i), (r6v5 k8.i), (r6v5 k8.i) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r7v2 l8.d) = (r7v4 l8.d), (r7v5 l8.d), (r7v5 l8.d) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e2 -> B:7:0x001e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
