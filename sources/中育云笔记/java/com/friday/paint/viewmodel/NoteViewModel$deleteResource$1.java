package com.friday.paint.viewmodel;

import androidx.compose.runtime.ComposerKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.viewmodel.NoteViewModel", m26211f = "NoteViewModel.kt", m26212l = {201, ComposerKt.providerMapsKey, ComposerKt.reuseKey}, m26213m = "deleteResource")
/* loaded from: classes4.dex */
public final class NoteViewModel$deleteResource$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f10466c;

    /* renamed from: d */
    public Object f10467d;

    /* renamed from: e */
    public Object f10468e;

    /* renamed from: f */
    public Object f10469f;

    /* renamed from: g */
    public Object f10470g;

    /* renamed from: h */
    public Object f10471h;

    /* renamed from: i */
    public int f10472i;

    /* renamed from: j */
    public int f10473j;

    /* renamed from: k */
    public int f10474k;

    /* renamed from: l */
    public /* synthetic */ Object f10475l;

    /* renamed from: m */
    public final /* synthetic */ NoteViewModel f10476m;

    /* renamed from: n */
    public int f10477n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteViewModel$deleteResource$1(NoteViewModel noteViewModel, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f10476m = noteViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10475l = obj;
        this.f10477n |= Integer.MIN_VALUE;
        return this.f10476m.m7737r(null, 0, this);
    }
}
