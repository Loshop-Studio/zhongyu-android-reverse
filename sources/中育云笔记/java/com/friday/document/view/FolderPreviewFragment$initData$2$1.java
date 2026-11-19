package com.friday.document.view;

import com.friday.common.entity.FileEntity;
import com.taobao.sophix.PatchStatus;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.view.FolderPreviewFragment$initData$2$1", m26211f = "FolderPreviewFragment.kt", m26212l = {PatchStatus.CODE_LOAD_UNDEFINED, 75, PatchStatus.CODE_LOAD_FIND_CLASS, 94, 102}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FolderPreviewFragment$initData$2$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f7111c;

    /* renamed from: d */
    public Object f7112d;

    /* renamed from: e */
    public int f7113e;

    /* renamed from: f */
    public int f7114f;

    /* renamed from: g */
    public final /* synthetic */ FileEntity f7115g;

    /* renamed from: h */
    public final /* synthetic */ FolderPreviewFragment f7116h;

    @InterfaceC11829d(m26210c = "com.friday.document.view.FolderPreviewFragment$initData$2$1$1", m26211f = "FolderPreviewFragment.kt", m26212l = {77, 79}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.FolderPreviewFragment$initData$2$1$1 */
    public static final class C60031 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7117c;

        /* renamed from: d */
        public final /* synthetic */ FileEntity f7118d;

        /* renamed from: e */
        public final /* synthetic */ FolderPreviewFragment f7119e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C60031(FileEntity fileEntity, FolderPreviewFragment folderPreviewFragment, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f7118d = fileEntity;
            this.f7119e = folderPreviewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C60031(this.f7118d, this.f7119e, interfaceC11588c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
        
            if (r5 == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
        
            if (r5 == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                int r1 = r4.f7117c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.AbstractC9924b.m20071b(r5)
                goto L54
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.AbstractC9924b.m20071b(r5)
                goto L40
            L1e:
                kotlin.AbstractC9924b.m20071b(r5)
                com.friday.common.entity.FileEntity r5 = r4.f7118d
                java.lang.String r5 = r5.getFileType()
                java.lang.String r1 = "1"
                boolean r5 = kotlin.jvm.internal.AbstractC9979u.m20289b(r5, r1)
                if (r5 == 0) goto L43
                com.friday.document.view.FolderPreviewFragment r5 = r4.f7119e
                com.friday.document.viewmodel.FolderViewModel r5 = com.friday.document.view.FolderPreviewFragment.m5664H(r5)
                com.friday.common.entity.FileEntity r1 = r4.f7118d
                r4.f7117c = r3
                java.lang.Object r5 = r5.m6233Q(r1, r4)
                if (r5 != r0) goto L40
                goto L53
            L40:
                java.util.List r5 = (java.util.List) r5
                return r5
            L43:
                com.friday.document.view.FolderPreviewFragment r5 = r4.f7119e
                com.friday.document.viewmodel.FolderViewModel r5 = com.friday.document.view.FolderPreviewFragment.m5664H(r5)
                com.friday.common.entity.FileEntity r1 = r4.f7118d
                r4.f7117c = r2
                java.lang.Object r5 = r5.m6234R(r1, r4)
                if (r5 != r0) goto L54
            L53:
                return r0
            L54:
                java.util.List r5 = (java.util.List) r5
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.friday.document.view.FolderPreviewFragment$initData$2$1.C60031.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/view/FolderPreviewFragment$initData$2$1$1.smali:129
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C60031) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderPreviewFragment$initData$2$1(FileEntity fileEntity, FolderPreviewFragment folderPreviewFragment, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7115g = fileEntity;
        this.f7116h = folderPreviewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new FolderPreviewFragment$initData$2$1(this.f7115g, this.f7116h, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0099, code lost:
    
        if (r1.m5690P(r2, r9) == r0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fc, code lost:
    
        if (sd.AbstractC11109f.m24709g(r4, r6, r9) != r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0111, code lost:
    
        if (r10.m5688L(r1, r9) != r0) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0107  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.view.FolderPreviewFragment$initData$2$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/view/FolderPreviewFragment$initData$2$1.smali:138
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((FolderPreviewFragment$initData$2$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
