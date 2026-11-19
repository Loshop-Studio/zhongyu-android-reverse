package com.friday.main.viewmodel;

import com.alibaba.fastjson.asm.Opcodes;
import com.friday.common.dao.FileDao;
import com.friday.common.entity.FileEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.main.viewmodel.FolderMoveViewModel$getFileLevels$1", m26211f = "FolderMoveViewModel.kt", m26212l = {171, Opcodes.ARETURN}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class FolderMoveViewModel$getFileLevels$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f9533c;

    /* renamed from: d */
    public Object f9534d;

    /* renamed from: e */
    public int f9535e;

    /* renamed from: f */
    public final /* synthetic */ FolderMoveViewModel f9536f;

    /* renamed from: g */
    public final /* synthetic */ String f9537g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderMoveViewModel$getFileLevels$1(FolderMoveViewModel folderMoveViewModel, String str, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9536f = folderMoveViewModel;
        this.f9537g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new FolderMoveViewModel$getFileLevels$1(this.f9536f, this.f9537g, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        List list2;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f9535e;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            ArrayList arrayList = new ArrayList();
            FileDao fileDao = this.f9536f.f9455b;
            String str = this.f9537g;
            this.f9533c = arrayList;
            this.f9535e = 1;
            Object objMo4941r = fileDao.mo4941r(str, this);
            if (objMo4941r != objM25952f) {
                list = arrayList;
                obj = objMo4941r;
            }
            return objM25952f;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = (List) this.f9533c;
            AbstractC9924b.m20071b(obj);
            list = list2;
            this.f9536f.f9461h.setValue(list);
            return C10786q.f26013a;
        }
        list = (List) this.f9533c;
        AbstractC9924b.m20071b(obj);
        FileEntity fileEntity = (FileEntity) obj;
        if (fileEntity == null) {
            list.add(0, this.f9536f.m7222u());
            this.f9536f.f9461h.setValue(list);
            return C10786q.f26013a;
        }
        FolderMoveViewModel folderMoveViewModel = this.f9536f;
        this.f9533c = list;
        this.f9534d = AbstractC11833h.m26224a(fileEntity);
        this.f9535e = 2;
        if (folderMoveViewModel.m7221t(fileEntity, list, this) != objM25952f) {
            list2 = list;
            list = list2;
            this.f9536f.f9461h.setValue(list);
            return C10786q.f26013a;
        }
        return objM25952f;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((FolderMoveViewModel$getFileLevels$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
