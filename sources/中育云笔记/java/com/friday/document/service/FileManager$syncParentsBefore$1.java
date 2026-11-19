package com.friday.document.service;

import com.alibaba.fastjson.asm.Opcodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.service.FileManager", m26211f = "FileManager.kt", m26212l = {Opcodes.IFNULL, 200, 213}, m26213m = "syncParentsBefore")
/* loaded from: classes3.dex */
public final class FileManager$syncParentsBefore$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f6863c;

    /* renamed from: d */
    public Object f6864d;

    /* renamed from: e */
    public Object f6865e;

    /* renamed from: f */
    public Object f6866f;

    /* renamed from: g */
    public Object f6867g;

    /* renamed from: h */
    public Object f6868h;

    /* renamed from: i */
    public Object f6869i;

    /* renamed from: j */
    public int f6870j;

    /* renamed from: k */
    public int f6871k;

    /* renamed from: l */
    public /* synthetic */ Object f6872l;

    /* renamed from: m */
    public final /* synthetic */ FileManager f6873m;

    /* renamed from: n */
    public int f6874n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileManager$syncParentsBefore$1(FileManager fileManager, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f6873m = fileManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6872l = obj;
        this.f6874n |= Integer.MIN_VALUE;
        return this.f6873m.m5601F(null, this);
    }
}
