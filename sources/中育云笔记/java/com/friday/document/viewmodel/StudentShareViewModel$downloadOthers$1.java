package com.friday.document.viewmodel;

import anet.channel.util.HttpConstant;
import com.alibaba.android.arouter.utils.Consts;
import com.alibaba.sdk.android.oss.ServiceException;
import com.friday.common.entity.ShareCacheEntity;
import com.friday.common.helper.C5962b;
import com.friday.common.helper.C5964d;
import com.friday.document.model.ConvertEntity;
import com.friday.document.model.ShareFile;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import je.AbstractC9746z;
import je.C9742v;
import je.C9743w;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p040c2.InterfaceC5250g2;
import p181hd.InterfaceC9544p;
import p215k2.AbstractC9803u;
import p309qc.C10786q;
import p310qd.AbstractC10793c0;
import p310qd.AbstractC10819z;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import sd.AbstractC11106e0;
import sd.AbstractC11109f;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.StudentShareViewModel$downloadOthers$1", m26211f = "StudentShareViewModel.kt", m26212l = {269}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class StudentShareViewModel$downloadOthers$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f8370c;

    /* renamed from: d */
    public final /* synthetic */ StudentShareViewModel f8371d;

    /* renamed from: e */
    public final /* synthetic */ ShareFile f8372e;

    @InterfaceC11829d(m26210c = "com.friday.document.viewmodel.StudentShareViewModel$downloadOthers$1$1", m26211f = "StudentShareViewModel.kt", m26212l = {352}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.viewmodel.StudentShareViewModel$downloadOthers$1$1 */
    public static final class C61301 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public Object f8373c;

        /* renamed from: d */
        public Object f8374d;

        /* renamed from: e */
        public int f8375e;

        /* renamed from: f */
        public final /* synthetic */ StudentShareViewModel f8376f;

        /* renamed from: g */
        public final /* synthetic */ ShareFile f8377g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C61301(StudentShareViewModel studentShareViewModel, ShareFile shareFile, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f8376f = studentShareViewModel;
            this.f8377g = shareFile;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C61301(this.f8376f, this.f8377g, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            String strString;
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f8375e;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                String strM23084B0 = this.f8376f.m6452w(this.f8377g.getFileUrl(), "doc", "docx", "ppt", "pptx", "xls", "xlsx", "wps", "et", "dps") ? AbstractC10793c0.m23084B0(this.f8377g.getFileUrl(), Consts.DOT, "pdf", null, 4, null) : this.f8377g.getFileUrl();
                String othersPath = this.f8377g.getOthersPath();
                if (this.f8377g.isOfficeFile()) {
                    try {
                        C5964d.m5326h(C5964d.f6085d.m5337a(), strM23084B0, othersPath, null, 4, null);
                    } catch (ServiceException e10) {
                        if (e10.getStatusCode() != 404) {
                            this.f8376f.m6455F(null);
                            return C10786q.f26013a;
                        }
                        String fileUrl = this.f8377g.getFileUrl();
                        if (!AbstractC10819z.m23242O(fileUrl, HttpConstant.HTTP, false, 2, null)) {
                            fileUrl = C5962b.f6082a.m5299a().m5276d(fileUrl);
                        }
                        String str = "http://sfs.zykj.org:8085/OfficeConvertToPdf/Convert?pptUrl=" + fileUrl;
                        Integer num = (Integer) this.f8376f.f8344u.get(str);
                        if (num != null) {
                            StudentShareViewModel studentShareViewModel = this.f8376f;
                            if (num.intValue() >= 2) {
                                studentShareViewModel.f8344u.put(str, AbstractC11826a.m26208c(0));
                                studentShareViewModel.m6455F(null);
                                return C10786q.f26013a;
                            }
                        }
                        if (this.f8376f.f8344u.containsKey(str)) {
                            HashMap map = this.f8376f.f8344u;
                            Object obj2 = this.f8376f.f8344u.get(str);
                            AbstractC9979u.m20291d(obj2);
                            map.put(str, AbstractC11826a.m26208c(((Number) obj2).intValue() + 1));
                        } else {
                            this.f8376f.f8344u.put(str, AbstractC11826a.m26208c(0));
                        }
                        C9742v.a aVar = new C9742v.a();
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        AbstractC9746z abstractC9746zM19628e = aVar.m19559e(200L, timeUnit).m19551O(200L, timeUnit).m19554R(200L, timeUnit).m19557c().mo19319b(new C9743w.a().m19598f().m19608p(str).m19595b()).execute().m19628e();
                        if (abstractC9746zM19628e == null || (strString = abstractC9746zM19628e.string()) == null) {
                            this.f8376f.m6455F(null);
                            return C10786q.f26013a;
                        }
                        StudentShareViewModel studentShareViewModel2 = this.f8376f;
                        ShareFile shareFile = this.f8377g;
                        try {
                            if (((ConvertEntity) new Gson().fromJson(strString, ConvertEntity.class)).getSuccess()) {
                                studentShareViewModel2.m6460t(shareFile);
                                return C10786q.f26013a;
                            }
                            studentShareViewModel2.m6455F(null);
                            return C10786q.f26013a;
                        } catch (JsonSyntaxException unused) {
                            studentShareViewModel2.m6455F(null);
                            return C10786q.f26013a;
                        }
                    }
                } else if (!AbstractC9979u.m20289b(this.f8377g.getType(), "9") && !AbstractC9979u.m20289b(this.f8377g.getType(), "8")) {
                    C5964d.m5326h(C5964d.f6085d.m5337a(), strM23084B0, othersPath, null, 4, null);
                }
                InterfaceC5250g2 interfaceC5250g2 = this.f8376f.f8327d;
                String strM19814a = AbstractC9803u.m19814a();
                AbstractC9979u.m20293f(strM19814a, "get32UUID(...)");
                ShareCacheEntity shareCacheEntity = new ShareCacheEntity(strM19814a, this.f8377g.getFileId(), this.f8377g.getVersion(), this.f8376f.m6440G(), System.currentTimeMillis());
                this.f8373c = AbstractC11833h.m26224a(strM23084B0);
                this.f8374d = AbstractC11833h.m26224a(othersPath);
                this.f8375e = 1;
                if (interfaceC5250g2.mo2811g(shareCacheEntity, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            this.f8376f.m6455F(this.f8377g);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C61301) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudentShareViewModel$downloadOthers$1(StudentShareViewModel studentShareViewModel, ShareFile shareFile, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8371d = studentShareViewModel;
        this.f8372e = shareFile;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new StudentShareViewModel$downloadOthers$1(this.f8371d, this.f8372e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f8370c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            AbstractC11106e0 abstractC11106e0M24799b = C11157r0.m24799b();
            C61301 c61301 = new C61301(this.f8371d, this.f8372e, null);
            this.f8370c = 1;
            if (AbstractC11109f.m24709g(abstractC11106e0M24799b, c61301, this) == objM25952f) {
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
        return ((StudentShareViewModel$downloadOthers$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
