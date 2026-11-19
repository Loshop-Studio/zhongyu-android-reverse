package com.friday.paint.viewmodel;

import com.friday.common.dao.FileDao;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.viewmodel.NoteViewModel$updateNote$1", m26211f = "NoteViewModel.kt", m26212l = {382}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NoteViewModel$updateNote$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f10545c;

    /* renamed from: d */
    public int f10546d;

    /* renamed from: e */
    public final /* synthetic */ NoteViewModel f10547e;

    /* renamed from: f */
    public final /* synthetic */ String f10548f;

    /* renamed from: g */
    public final /* synthetic */ String f10549g;

    /* renamed from: h */
    public final /* synthetic */ int f10550h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteViewModel$updateNote$1(NoteViewModel noteViewModel, String str, String str2, int i10, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f10547e = noteViewModel;
        this.f10548f = str;
        this.f10549g = str2;
        this.f10550h = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new NoteViewModel$updateNote$1(this.f10547e, this.f10548f, this.f10549g, this.f10550h, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f10546d;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).format(new Date());
            FileDao fileDao = this.f10547e.f10428b;
            String str2 = this.f10548f;
            String str3 = this.f10549g;
            int i11 = this.f10550h;
            AbstractC9979u.m20291d(str);
            this.f10545c = AbstractC11833h.m26224a(str);
            this.f10546d = 1;
            if (fileDao.mo4929a0(str2, str3, i11, str, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((NoteViewModel$updateNote$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
