package com.friday.document.view;

import com.friday.common.entity.FileEntity;
import com.taobao.sophix.PatchStatus;
import com.tendcloud.tenddata.C7843ab;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.view.RecycleBinPreviewFragment$initData$3$1", m26211f = "RecycleBinPreviewFragment.kt", m26212l = {PatchStatus.CODE_LOAD_FIND_CLASS, PatchStatus.CODE_LOAD_ILLEGAL_ACCESS, 93, PatchStatus.CODE_PRELOAD_REMOVE_BASEDEX}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RecycleBinPreviewFragment$initData$3$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f7255c;

    /* renamed from: d */
    public Object f7256d;

    /* renamed from: e */
    public int f7257e;

    /* renamed from: f */
    public int f7258f;

    /* renamed from: g */
    public final /* synthetic */ FileEntity f7259g;

    /* renamed from: h */
    public final /* synthetic */ RecycleBinPreviewFragment f7260h;

    @InterfaceC11829d(m26210c = "com.friday.document.view.RecycleBinPreviewFragment$initData$3$1$1", m26211f = "RecycleBinPreviewFragment.kt", m26212l = {IjkMediaMeta.FF_PROFILE_H264_EXTENDED, C7843ab.b.API_MYNA_INIT}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.RecycleBinPreviewFragment$initData$3$1$1 */
    public static final class C60241 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7261c;

        /* renamed from: d */
        public final /* synthetic */ FileEntity f7262d;

        /* renamed from: e */
        public final /* synthetic */ RecycleBinPreviewFragment f7263e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C60241(FileEntity fileEntity, RecycleBinPreviewFragment recycleBinPreviewFragment, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f7262d = fileEntity;
            this.f7263e = recycleBinPreviewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C60241(this.f7262d, this.f7263e, interfaceC11588c);
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
                int r1 = r4.f7261c
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
                com.friday.common.entity.FileEntity r5 = r4.f7262d
                java.lang.String r5 = r5.getFileType()
                java.lang.String r1 = "1"
                boolean r5 = kotlin.jvm.internal.AbstractC9979u.m20289b(r5, r1)
                if (r5 == 0) goto L43
                com.friday.document.view.RecycleBinPreviewFragment r5 = r4.f7263e
                com.friday.document.viewmodel.RecycleBinViewModel r5 = com.friday.document.view.RecycleBinPreviewFragment.m5757H(r5)
                com.friday.common.entity.FileEntity r1 = r4.f7262d
                r4.f7261c = r3
                java.lang.Object r5 = r5.m6233Q(r1, r4)
                if (r5 != r0) goto L40
                goto L53
            L40:
                java.util.List r5 = (java.util.List) r5
                return r5
            L43:
                com.friday.document.view.RecycleBinPreviewFragment r5 = r4.f7263e
                com.friday.document.viewmodel.RecycleBinViewModel r5 = com.friday.document.view.RecycleBinPreviewFragment.m5757H(r5)
                com.friday.common.entity.FileEntity r1 = r4.f7262d
                r4.f7261c = r2
                java.lang.Object r5 = r5.m6234R(r1, r4)
                if (r5 != r0) goto L54
            L53:
                return r0
            L54:
                java.util.List r5 = (java.util.List) r5
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.friday.document.view.RecycleBinPreviewFragment$initData$3$1.C60241.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/view/RecycleBinPreviewFragment$initData$3$1$1.smali:129
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C60241) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecycleBinPreviewFragment$initData$3$1(FileEntity fileEntity, RecycleBinPreviewFragment recycleBinPreviewFragment, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7259g = fileEntity;
        this.f7260h = recycleBinPreviewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new RecycleBinPreviewFragment$initData$3$1(this.f7259g, this.f7260h, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        if (r15.equals("12") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        if (r1.m5786Q(r2, r14) == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a3, code lost:
    
        if (r15.equals("1") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a6, code lost:
    
        r15 = r14.f7260h.m5788S();
        r1 = r14.f7259g;
        r14.f7258f = 1;
        r15 = r15.m6269w(r1, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b4, code lost:
    
        if (r15 != r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fb, code lost:
    
        if (sd.AbstractC11109f.m24709g(r6, r7, r14) != r0) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0139  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.view.RecycleBinPreviewFragment$initData$3$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/view/RecycleBinPreviewFragment$initData$3$1.smali:137
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((RecycleBinPreviewFragment$initData$3$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
