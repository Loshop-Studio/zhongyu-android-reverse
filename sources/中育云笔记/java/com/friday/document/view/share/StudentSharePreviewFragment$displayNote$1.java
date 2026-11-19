package com.friday.document.view.share;

import com.alibaba.fastjson.asm.Opcodes;
import com.friday.document.R$id;
import com.friday.document.model.ShareFile;
import com.friday.document.view.preview.NotePreviewFragment;
import com.friday.document.viewmodel.ShareBaseViewModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.AbstractC10980x;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.view.share.StudentSharePreviewFragment$displayNote$1", m26211f = "StudentSharePreviewFragment.kt", m26212l = {Opcodes.IFEQ}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class StudentSharePreviewFragment$displayNote$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7698c;

    /* renamed from: d */
    public final /* synthetic */ StudentSharePreviewFragment f7699d;

    /* renamed from: e */
    public final /* synthetic */ ShareFile f7700e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudentSharePreviewFragment$displayNote$1(StudentSharePreviewFragment studentSharePreviewFragment, ShareFile shareFile, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7699d = studentSharePreviewFragment;
        this.f7700e = shareFile;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new StudentSharePreviewFragment$displayNote$1(this.f7699d, this.f7700e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7698c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            ShareBaseViewModel shareBaseViewModelM6115I = this.f7699d.m6115I();
            ShareFile shareFile = this.f7700e;
            this.f7698c = 1;
            obj = shareBaseViewModelM6115I.m6367D(shareFile, this);
            if (obj == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        ShareFile shareFile2 = this.f7700e;
        StudentSharePreviewFragment studentSharePreviewFragment = this.f7699d;
        NotePreviewFragment.C6057a c6057a = NotePreviewFragment.f7463e;
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((File) it.next()).getAbsolutePath());
        }
        studentSharePreviewFragment.getChildFragmentManager().beginTransaction().replace(R$id.fragment_container, c6057a.m5953a((String[]) arrayList.toArray(new String[0]), shareFile2.getFileId(), AbstractC9979u.m20289b(shareFile2.getType(), "12"), shareFile2.getShareTime())).commit();
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((StudentSharePreviewFragment$displayNote$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
