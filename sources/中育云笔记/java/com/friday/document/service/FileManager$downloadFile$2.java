package com.friday.document.service;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import cd.AbstractC5428g;
import com.friday.common.dao.FileDao;
import com.friday.common.entity.FileEntity;
import com.friday.common.entity.NoteResource;
import com.friday.common.helper.C5962b;
import com.friday.common.helper.C5964d;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.service.FileManager$downloadFile$2", m26211f = "FileManager.kt", m26212l = {399}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FileManager$downloadFile$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f6760c;

    /* renamed from: d */
    public Object f6761d;

    /* renamed from: e */
    public Object f6762e;

    /* renamed from: f */
    public Object f6763f;

    /* renamed from: g */
    public Object f6764g;

    /* renamed from: h */
    public Object f6765h;

    /* renamed from: i */
    public Object f6766i;

    /* renamed from: j */
    public int f6767j;

    /* renamed from: k */
    public final /* synthetic */ FileEntity f6768k;

    /* renamed from: l */
    public final /* synthetic */ FileManager f6769l;

    /* renamed from: com.friday.document.service.FileManager$downloadFile$2$a */
    public static final class C5993a extends TypeToken<ArrayList<NoteResource>> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileManager$downloadFile$2(FileEntity fileEntity, FileManager fileManager, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f6768k = fileEntity;
        this.f6769l = fileManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new FileManager$downloadFile$2(this.f6768k, this.f6769l, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f6767j;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            String localFileUrl = this.f6768k.getLocalFileUrl();
            String str = File.separator;
            String str2 = localFileUrl + str + "index.json";
            String str3 = this.f6768k.getLocalFileUrl() + str + "res.json";
            C5962b.a aVar = C5962b.f6082a;
            C5962b c5962bM5299a = aVar.m5299a();
            String strM5276d = c5962bM5299a.m5276d(c5962bM5299a.m5275c(this.f6768k.getFileId() + str + "index.json"));
            C5962b c5962bM5299a2 = aVar.m5299a();
            String strM5276d2 = c5962bM5299a2.m5276d(c5962bM5299a2.m5275c(this.f6768k.getFileId() + str + "res.json"));
            C5964d.m5326h(C5964d.f6085d.m5337a(), strM5276d2, str3, null, 4, null);
            String strM2921e = AbstractC5428g.m2921e(new File(str3), null, 1, null);
            Type type = new C5993a().getType();
            ArrayList arrayList = (ArrayList) new Gson().fromJson(strM2921e, type);
            if (arrayList != null && !arrayList.isEmpty()) {
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    NoteResource noteResource = (NoteResource) obj2;
                    C5964d.m5326h(C5964d.f6085d.m5337a(), noteResource.getService(), noteResource.getLocal(), null, 4, null);
                }
            }
            C5964d.m5326h(C5964d.f6085d.m5337a(), strM5276d, str2, null, 4, null);
            FileDao fileDao = this.f6769l.f6734c;
            String fileId = this.f6768k.getFileId();
            this.f6760c = AbstractC11833h.m26224a(str2);
            this.f6761d = AbstractC11833h.m26224a(str3);
            this.f6762e = AbstractC11833h.m26224a(strM5276d);
            this.f6763f = AbstractC11833h.m26224a(strM5276d2);
            this.f6764g = AbstractC11833h.m26224a(strM2921e);
            this.f6765h = AbstractC11833h.m26224a(type);
            this.f6766i = AbstractC11833h.m26224a(arrayList);
            this.f6767j = 1;
            if (fileDao.mo4931b0(fileId, true, this) == objM25952f) {
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
        return ((FileManager$downloadFile$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
