package com.friday.user.viewmodel;

import com.alibaba.fastjson.asm.Opcodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.user.viewmodel.UserViewModel", m26211f = "UserViewModel.kt", m26212l = {Opcodes.IF_ACMPEQ, Opcodes.RET}, m26213m = "deleteNoteFile")
/* loaded from: classes5.dex */
public final class UserViewModel$deleteNoteFile$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f10699c;

    /* renamed from: d */
    public Object f10700d;

    /* renamed from: e */
    public Object f10701e;

    /* renamed from: f */
    public Object f10702f;

    /* renamed from: g */
    public Object f10703g;

    /* renamed from: h */
    public Object f10704h;

    /* renamed from: i */
    public Object f10705i;

    /* renamed from: j */
    public Object f10706j;

    /* renamed from: k */
    public Object f10707k;

    /* renamed from: l */
    public Object f10708l;

    /* renamed from: m */
    public Object f10709m;

    /* renamed from: n */
    public int f10710n;

    /* renamed from: o */
    public int f10711o;

    /* renamed from: p */
    public /* synthetic */ Object f10712p;

    /* renamed from: q */
    public final /* synthetic */ UserViewModel f10713q;

    /* renamed from: r */
    public int f10714r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserViewModel$deleteNoteFile$1(UserViewModel userViewModel, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f10713q = userViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10712p = obj;
        this.f10714r |= Integer.MIN_VALUE;
        return this.f10713q.m7825n(null, null, null, null, this);
    }
}
