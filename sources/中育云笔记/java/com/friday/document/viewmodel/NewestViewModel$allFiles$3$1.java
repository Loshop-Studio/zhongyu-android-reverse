package com.friday.document.viewmodel;

import androidx.paging.PagingData;
import androidx.paging.PagingDataTransforms__PagingDataTransformsKt;
import com.friday.common.entity.FileEntity;
import com.friday.document.adapter.MultiModeFileEntity;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9547s;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.NewestViewModel$allFiles$3$1", m26211f = "NewestViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class NewestViewModel$allFiles$3$1 extends SuspendLambda implements InterfaceC9547s {

    /* renamed from: c */
    public int f8080c;

    /* renamed from: d */
    public /* synthetic */ Object f8081d;

    /* renamed from: e */
    public /* synthetic */ Object f8082e;

    /* renamed from: f */
    public /* synthetic */ Object f8083f;

    /* renamed from: g */
    public /* synthetic */ Object f8084g;

    @InterfaceC11829d(m26210c = "com.friday.document.viewmodel.NewestViewModel$allFiles$3$1$1", m26211f = "NewestViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.viewmodel.NewestViewModel$allFiles$3$1$1 */
    public static final class C61171 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f8085c;

        /* renamed from: d */
        public /* synthetic */ Object f8086d;

        /* renamed from: e */
        public final /* synthetic */ Boolean f8087e;

        /* renamed from: f */
        public final /* synthetic */ List f8088f;

        /* renamed from: g */
        public final /* synthetic */ FileEntity f8089g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C61171(Boolean bool, List list, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f8087e = bool;
            this.f8088f = list;
            this.f8089g = fileEntity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            C61171 c61171 = new C61171(this.f8087e, this.f8088f, this.f8089g, interfaceC11588c);
            c61171.f8086d = obj;
            return c61171;
        }

        @Override // p181hd.InterfaceC9544p
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
            return ((C61171) create(fileEntity, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean zM20289b;
            FileEntity fileEntity = (FileEntity) this.f8086d;
            AbstractC11725a.m25952f();
            if (this.f8085c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            Boolean bool = this.f8087e;
            AbstractC9979u.m20291d(bool);
            boolean zBooleanValue = bool.booleanValue();
            if (this.f8087e.booleanValue()) {
                List list = this.f8088f;
                zM20289b = false;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (AbstractC9979u.m20289b(((FileEntity) it.next()).getFileId(), fileEntity.getFileId())) {
                            zM20289b = true;
                            break;
                        }
                    }
                }
            } else {
                String fileId = fileEntity.getFileId();
                FileEntity fileEntity2 = this.f8089g;
                zM20289b = AbstractC9979u.m20289b(fileId, fileEntity2 != null ? fileEntity2.getFileId() : null);
            }
            return new MultiModeFileEntity(zBooleanValue, zM20289b, fileEntity);
        }
    }

    public NewestViewModel$allFiles$3$1(InterfaceC11588c interfaceC11588c) {
        super(5, interfaceC11588c);
    }

    @Override // p181hd.InterfaceC9547s
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(PagingData pagingData, Boolean bool, List list, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        NewestViewModel$allFiles$3$1 newestViewModel$allFiles$3$1 = new NewestViewModel$allFiles$3$1(interfaceC11588c);
        newestViewModel$allFiles$3$1.f8081d = pagingData;
        newestViewModel$allFiles$3$1.f8082e = bool;
        newestViewModel$allFiles$3$1.f8083f = list;
        newestViewModel$allFiles$3$1.f8084g = fileEntity;
        return newestViewModel$allFiles$3$1.invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        PagingData pagingData = (PagingData) this.f8081d;
        Boolean bool = (Boolean) this.f8082e;
        List list = (List) this.f8083f;
        FileEntity fileEntity = (FileEntity) this.f8084g;
        AbstractC11725a.m25952f();
        if (this.f8080c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        return PagingDataTransforms__PagingDataTransformsKt.map(pagingData, new C61171(bool, list, fileEntity, null));
    }
}
