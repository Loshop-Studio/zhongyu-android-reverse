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

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1", m26211f = "FolderViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1 extends SuspendLambda implements InterfaceC9547s {

    /* renamed from: c */
    public int f8018c;

    /* renamed from: d */
    public /* synthetic */ Object f8019d;

    /* renamed from: e */
    public /* synthetic */ Object f8020e;

    /* renamed from: f */
    public /* synthetic */ Object f8021f;

    /* renamed from: g */
    public /* synthetic */ Object f8022g;

    @InterfaceC11829d(m26210c = "com.friday.document.viewmodel.FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1$1", m26211f = "FolderViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.viewmodel.FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1$1 */
    public static final class C61151 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f8023c;

        /* renamed from: d */
        public /* synthetic */ Object f8024d;

        /* renamed from: e */
        public final /* synthetic */ Boolean f8025e;

        /* renamed from: f */
        public final /* synthetic */ List f8026f;

        /* renamed from: g */
        public final /* synthetic */ FileEntity f8027g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C61151(Boolean bool, List list, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f8025e = bool;
            this.f8026f = list;
            this.f8027g = fileEntity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            C61151 c61151 = new C61151(this.f8025e, this.f8026f, this.f8027g, interfaceC11588c);
            c61151.f8024d = obj;
            return c61151;
        }

        @Override // p181hd.InterfaceC9544p
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
            return ((C61151) create(fileEntity, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean zM20289b;
            FileEntity fileEntity = (FileEntity) this.f8024d;
            AbstractC11725a.m25952f();
            if (this.f8023c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            Boolean bool = this.f8025e;
            AbstractC9979u.m20291d(bool);
            boolean zBooleanValue = bool.booleanValue();
            if (this.f8025e.booleanValue()) {
                List list = this.f8026f;
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
                FileEntity fileEntity2 = this.f8027g;
                zM20289b = AbstractC9979u.m20289b(fileId, fileEntity2 != null ? fileEntity2.getFileId() : null);
            }
            return new MultiModeFileEntity(zBooleanValue, zM20289b, fileEntity);
        }
    }

    public FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1(InterfaceC11588c interfaceC11588c) {
        super(5, interfaceC11588c);
    }

    @Override // p181hd.InterfaceC9547s
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(PagingData pagingData, Boolean bool, List list, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1 folderViewModel$convertStateFlowToPagingDataFlow$1$3$1 = new FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1(interfaceC11588c);
        folderViewModel$convertStateFlowToPagingDataFlow$1$3$1.f8019d = pagingData;
        folderViewModel$convertStateFlowToPagingDataFlow$1$3$1.f8020e = bool;
        folderViewModel$convertStateFlowToPagingDataFlow$1$3$1.f8021f = list;
        folderViewModel$convertStateFlowToPagingDataFlow$1$3$1.f8022g = fileEntity;
        return folderViewModel$convertStateFlowToPagingDataFlow$1$3$1.invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        PagingData pagingData = (PagingData) this.f8019d;
        Boolean bool = (Boolean) this.f8020e;
        List list = (List) this.f8021f;
        FileEntity fileEntity = (FileEntity) this.f8022g;
        AbstractC11725a.m25952f();
        if (this.f8018c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        return PagingDataTransforms__PagingDataTransformsKt.map(pagingData, new C61151(bool, list, fileEntity, null));
    }
}
