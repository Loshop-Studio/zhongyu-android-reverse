package com.friday.common.helper;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.common.helper.NotePageOrder", m26211f = "NotePageOrder.kt", m26212l = {49, 14}, m26213m = "withNoteLock")
/* loaded from: classes3.dex */
public final class NotePageOrder$withNoteLock$1<T> extends ContinuationImpl {

    /* renamed from: c */
    public Object f6045c;

    /* renamed from: d */
    public Object f6046d;

    /* renamed from: e */
    public Object f6047e;

    /* renamed from: f */
    public int f6048f;

    /* renamed from: g */
    public int f6049g;

    /* renamed from: h */
    public /* synthetic */ Object f6050h;

    /* renamed from: i */
    public final /* synthetic */ NotePageOrder f6051i;

    /* renamed from: j */
    public int f6052j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotePageOrder$withNoteLock$1(NotePageOrder notePageOrder, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f6051i = notePageOrder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6050h = obj;
        this.f6052j |= Integer.MIN_VALUE;
        return this.f6051i.m5247e(null, null, this);
    }
}
