package com.friday.paint.viewmodel;

import com.alibaba.fastjson.asm.Opcodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.viewmodel.NoteViewModel", m26211f = "NoteViewModel.kt", m26212l = {Opcodes.INVOKEVIRTUAL, 196, 197}, m26213m = "updateIndexJson")
/* loaded from: classes4.dex */
public final class NoteViewModel$updateIndexJson$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f10540c;

    /* renamed from: d */
    public Object f10541d;

    /* renamed from: e */
    public /* synthetic */ Object f10542e;

    /* renamed from: f */
    public final /* synthetic */ NoteViewModel f10543f;

    /* renamed from: g */
    public int f10544g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteViewModel$updateIndexJson$1(NoteViewModel noteViewModel, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f10543f = noteViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10542e = obj;
        this.f10544g |= Integer.MIN_VALUE;
        return this.f10543f.m7733X(null, this);
    }
}
