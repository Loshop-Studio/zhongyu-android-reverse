package com.friday.document.sync;

import com.alibaba.fastjson.asm.Opcodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.sync.SyncStateOne", m26211f = "SyncStateOne.kt", m26212l = {173, 175, Opcodes.INSTANCEOF, 194}, m26213m = "upsertNewNoteResource")
/* loaded from: classes3.dex */
public final class SyncStateOne$upsertNewNoteResource$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f7062c;

    /* renamed from: d */
    public Object f7063d;

    /* renamed from: e */
    public Object f7064e;

    /* renamed from: f */
    public Object f7065f;

    /* renamed from: g */
    public Object f7066g;

    /* renamed from: h */
    public Object f7067h;

    /* renamed from: i */
    public Object f7068i;

    /* renamed from: j */
    public int f7069j;

    /* renamed from: k */
    public /* synthetic */ Object f7070k;

    /* renamed from: l */
    public final /* synthetic */ SyncStateOne f7071l;

    /* renamed from: m */
    public int f7072m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncStateOne$upsertNewNoteResource$1(SyncStateOne syncStateOne, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f7071l = syncStateOne;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7070k = obj;
        this.f7072m |= Integer.MIN_VALUE;
        return this.f7071l.m5640F(null, null, 0, null, null, this);
    }
}
