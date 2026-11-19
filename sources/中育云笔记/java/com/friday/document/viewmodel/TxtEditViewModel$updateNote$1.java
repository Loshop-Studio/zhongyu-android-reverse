package com.friday.document.viewmodel;

import com.friday.common.dao.FileDao;
import com.friday.common.entity.FileEntity;
import com.taobao.sophix.PatchStatus;
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

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.TxtEditViewModel$updateNote$1", m26211f = "TxtEditViewModel.kt", m26212l = {75, PatchStatus.CODE_LOAD_SOPHIX_VERSION}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class TxtEditViewModel$updateNote$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f8427c;

    /* renamed from: d */
    public Object f8428d;

    /* renamed from: e */
    public int f8429e;

    /* renamed from: f */
    public final /* synthetic */ TxtEditViewModel f8430f;

    /* renamed from: g */
    public final /* synthetic */ String f8431g;

    /* renamed from: h */
    public final /* synthetic */ String f8432h;

    /* renamed from: i */
    public final /* synthetic */ int f8433i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TxtEditViewModel$updateNote$1(TxtEditViewModel txtEditViewModel, String str, String str2, int i10, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8430f = txtEditViewModel;
        this.f8431g = str;
        this.f8432h = str2;
        this.f8433i = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new TxtEditViewModel$updateNote$1(this.f8430f, this.f8431g, this.f8432h, this.f8433i, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        TxtEditViewModel$updateNote$1 txtEditViewModel$updateNote$1;
        FileEntity fileEntity;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f8429e;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).format(new Date());
            FileDao fileDao = this.f8430f.f8414b;
            String str2 = this.f8431g;
            this.f8427c = str;
            this.f8429e = 1;
            obj = fileDao.mo4941r(str2, this);
            if (obj == objM25952f) {
            }
            return objM25952f;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileEntity = (FileEntity) this.f8428d;
            AbstractC9924b.m20071b(obj);
            txtEditViewModel$updateNote$1 = this;
            txtEditViewModel$updateNote$1.f8430f.m6486m().setValue(fileEntity);
            return C10786q.f26013a;
        }
        str = (String) this.f8427c;
        AbstractC9924b.m20071b(obj);
        String str3 = str;
        FileEntity fileEntity2 = (FileEntity) obj;
        FileDao fileDao2 = this.f8430f.f8414b;
        String str4 = this.f8431g;
        String str5 = this.f8432h;
        int i11 = this.f8433i;
        AbstractC9979u.m20291d(str3);
        this.f8427c = AbstractC11833h.m26224a(str3);
        this.f8428d = fileEntity2;
        this.f8429e = 2;
        txtEditViewModel$updateNote$1 = this;
        if (fileDao2.mo4929a0(str4, str5, i11, str3, txtEditViewModel$updateNote$1) != objM25952f) {
            fileEntity = fileEntity2;
            txtEditViewModel$updateNote$1.f8430f.m6486m().setValue(fileEntity);
            return C10786q.f26013a;
        }
        return objM25952f;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((TxtEditViewModel$updateNote$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
