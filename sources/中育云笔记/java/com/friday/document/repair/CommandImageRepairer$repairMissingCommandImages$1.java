package com.friday.document.repair;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.repair.CommandImageRepairer", m26211f = "CommandImageRepairer.kt", m26212l = {37}, m26213m = "repairMissingCommandImages")
/* loaded from: classes3.dex */
public final class CommandImageRepairer$repairMissingCommandImages$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f6671c;

    /* renamed from: d */
    public Object f6672d;

    /* renamed from: e */
    public Object f6673e;

    /* renamed from: f */
    public Object f6674f;

    /* renamed from: g */
    public Object f6675g;

    /* renamed from: h */
    public Object f6676h;

    /* renamed from: i */
    public int f6677i;

    /* renamed from: j */
    public int f6678j;

    /* renamed from: k */
    public /* synthetic */ Object f6679k;

    /* renamed from: l */
    public final /* synthetic */ CommandImageRepairer f6680l;

    /* renamed from: m */
    public int f6681m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommandImageRepairer$repairMissingCommandImages$1(CommandImageRepairer commandImageRepairer, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f6680l = commandImageRepairer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6679k = obj;
        this.f6681m |= Integer.MIN_VALUE;
        return this.f6680l.m5573i(null, null, null, this);
    }
}
