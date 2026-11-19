package com.friday.document.view.share;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.view.share.StudentSharePreviewFragment", m26211f = "StudentSharePreviewFragment.kt", m26212l = {221}, m26213m = "displayMicroClass")
/* loaded from: classes3.dex */
public final class StudentSharePreviewFragment$displayMicroClass$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f7693c;

    /* renamed from: d */
    public Object f7694d;

    /* renamed from: e */
    public /* synthetic */ Object f7695e;

    /* renamed from: f */
    public final /* synthetic */ StudentSharePreviewFragment f7696f;

    /* renamed from: g */
    public int f7697g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudentSharePreviewFragment$displayMicroClass$1(StudentSharePreviewFragment studentSharePreviewFragment, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f7696f = studentSharePreviewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7695e = obj;
        this.f7697g |= Integer.MIN_VALUE;
        return this.f7696f.m6127C(null, this);
    }
}
