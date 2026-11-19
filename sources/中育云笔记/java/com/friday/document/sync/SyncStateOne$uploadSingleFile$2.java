package com.friday.document.sync;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import com.friday.common.util.SyncException;
import com.friday.document.model.ConvertEntity;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.util.concurrent.TimeUnit;
import je.AbstractC9746z;
import je.C9742v;
import je.C9743w;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.sync.SyncStateOne$uploadSingleFile$2", m26211f = "SyncStateOne.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SyncStateOne$uploadSingleFile$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7060c;

    /* renamed from: d */
    public final /* synthetic */ String f7061d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncStateOne$uploadSingleFile$2(String str, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7061d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new SyncStateOne$uploadSingleFile$2(this.f7061d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f7060c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        C9742v.a aVar = new C9742v.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        AbstractC9746z abstractC9746zM19628e = aVar.m19559e(200L, timeUnit).m19551O(200L, timeUnit).m19554R(200L, timeUnit).m19557c().mo19319b(new C9743w.a().m19598f().m19608p("http://sfs.zykj.org:8085/OfficeConvertToPdf/Convert?pptUrl=" + this.f7061d).m19595b()).execute().m19628e();
        String strString = abstractC9746zM19628e != null ? abstractC9746zM19628e.string() : null;
        try {
            if (((ConvertEntity) new Gson().fromJson(strString, ConvertEntity.class)).getSuccess()) {
                return strString;
            }
            throw new SyncException(null, "office 转 PDF 失败", 1, null);
        } catch (JsonSyntaxException unused) {
            throw new SyncException(null, "office 转 PDF 结果解析失败", 1, null);
        }
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((SyncStateOne$uploadSingleFile$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
