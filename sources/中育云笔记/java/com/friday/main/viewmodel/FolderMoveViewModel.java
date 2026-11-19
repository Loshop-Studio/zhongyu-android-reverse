package com.friday.main.viewmodel;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.Utils;
import com.friday.common.base.BaseViewModel;
import com.friday.common.dao.FileDao;
import com.friday.common.dao.ResourceDao;
import com.friday.common.entity.FileEntity;
import com.friday.common.entity.ImageSafetyEntity;
import com.friday.main.viewmodel.FolderMoveViewModel;
import com.zykj.blackboard.core.data.dao.AbstractC8434a;
import com.zykj.blackboard.core.data.dao.BlackBoardEntity;
import com.zykj.blackboard.core.data.dao.PageEntity;
import com.zykj.board.EzyPageSnapshot;
import com.zykj.board.EzyRouterRecord;
import io.objectbox.BoxStore;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC9979u;
import p040c2.InterfaceC5308v0;
import p210jc.C9710a;
import p309qc.C10786q;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10980x;
import p356u3.InterfaceC11365b;
import p379vd.AbstractC11596e;
import p379vd.AbstractC11608q;
import p379vd.AbstractC11613v;
import p379vd.InterfaceC11602k;
import p379vd.InterfaceC11603l;
import p379vd.InterfaceC11607p;
import p379vd.InterfaceC11612u;
import p393wc.AbstractC11725a;
import sd.AbstractC11117h;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class FolderMoveViewModel extends BaseViewModel {

    /* renamed from: b */
    public final FileDao f9455b;

    /* renamed from: c */
    public final ResourceDao f9456c;

    /* renamed from: d */
    public final InterfaceC5308v0 f9457d;

    /* renamed from: e */
    public final InterfaceC11365b f9458e;

    /* renamed from: f */
    public final InterfaceC11603l f9459f;

    /* renamed from: g */
    public final InterfaceC11612u f9460g;

    /* renamed from: h */
    public final InterfaceC11603l f9461h;

    /* renamed from: i */
    public final InterfaceC11612u f9462i;

    /* renamed from: j */
    public final InterfaceC11602k f9463j;

    /* renamed from: k */
    public final InterfaceC11607p f9464k;

    /* renamed from: l */
    public final InterfaceC11602k f9465l;

    /* renamed from: m */
    public final InterfaceC11607p f9466m;

    /* renamed from: n */
    public final InterfaceC11602k f9467n;

    public FolderMoveViewModel(FileDao fileDao, ResourceDao resourceDao, InterfaceC5308v0 imageSafetyDao, InterfaceC11365b homeService) {
        AbstractC9979u.m20294g(fileDao, "fileDao");
        AbstractC9979u.m20294g(resourceDao, "resourceDao");
        AbstractC9979u.m20294g(imageSafetyDao, "imageSafetyDao");
        AbstractC9979u.m20294g(homeService, "homeService");
        this.f9455b = fileDao;
        this.f9456c = resourceDao;
        this.f9457d = imageSafetyDao;
        this.f9458e = homeService;
        InterfaceC11603l interfaceC11603lM25602a = AbstractC11613v.m25602a(AbstractC10978w.m24136n());
        this.f9459f = interfaceC11603lM25602a;
        this.f9460g = interfaceC11603lM25602a;
        InterfaceC11603l interfaceC11603lM25602a2 = AbstractC11613v.m25602a(AbstractC10978w.m24136n());
        this.f9461h = interfaceC11603lM25602a2;
        this.f9462i = AbstractC11596e.m25552b(interfaceC11603lM25602a2);
        InterfaceC11602k interfaceC11602kM25592b = AbstractC11608q.m25592b(0, 0, null, 7, null);
        this.f9463j = interfaceC11602kM25592b;
        this.f9464k = AbstractC11596e.m25551a(interfaceC11602kM25592b);
        InterfaceC11602k interfaceC11602kM25592b2 = AbstractC11608q.m25592b(0, 0, null, 7, null);
        this.f9465l = interfaceC11602kM25592b2;
        this.f9466m = AbstractC11596e.m25551a(interfaceC11602kM25592b2);
        this.f9467n = AbstractC11608q.m25592b(0, 0, null, 7, null);
    }

    /* renamed from: C */
    public static final void m7194C(List list, C9710a c9710a, String str, BoxStore boxStore) {
        AbstractC9979u.m20291d(list);
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC10978w.m24145w();
            }
            PageEntity pageEntity = (PageEntity) obj;
            String strM14239d = pageEntity.m14239d();
            String string = UUID.randomUUID().toString();
            AbstractC9979u.m20293f(string, "toString(...)");
            File file = new File(str, strM14239d);
            if (file.exists()) {
                boolean zRename = FileUtils.rename(file, string);
                LogUtils.m3888i("页面FolderMoveViewModel.kt -> copyNote(), 页面 " + pageEntity.m14241f() + ": 物理重命名 [" + strM14239d + "] -> [" + string + "] " + (zRename ? "成功" : "失败"));
            } else {
                LogUtils.m3887e("页面FolderMoveViewModel.kt -> copyNote(),  copyNote()，ObjectBox,找不到物理文件夹 " + strM14239d);
            }
            pageEntity.m14248m(string);
            LogUtils.m3886d("页面FolderMoveViewModel.kt -> copyNote()，ObjectBox, 更新 PageEntity 字段: dirName 已设为 " + string);
            BlackBoardEntity blackBoardEntity = (BlackBoardEntity) pageEntity.m14236a().m19036d();
            if (blackBoardEntity != null) {
                blackBoardEntity.m14043e(str);
                boxStore.m18954g(BlackBoardEntity.class).m19227m(blackBoardEntity);
            }
            i10 = i11;
        }
        c9710a.m19228n(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public final Object m7195D(ImageSafetyEntity imageSafetyEntity, InterfaceC11588c interfaceC11588c) {
        Object objMo2812a = this.f9457d.mo2812a(imageSafetyEntity, interfaceC11588c);
        return objMo2812a == AbstractC11725a.m25952f() ? objMo2812a : C10786q.f26013a;
    }

    /* renamed from: A */
    public final InterfaceC11602k m7210A() {
        return this.f9467n;
    }

    /* renamed from: B */
    public final void m7211B(final String str) {
        LogUtils.m3886d("FolderMoveViewModel.kt -> copyNote(),开始复制新笔记");
        final BoxStore boxStoreM19242b = AbstractC8434a.m14380y().m19241a(Utils.getApp()).m19245f(new File(str, "page_mdb")).m19242b();
        try {
            final C9710a c9710aM18954g = boxStoreM19242b.m18954g(PageEntity.class);
            final List listM19219e = c9710aM18954g.m19219e();
            boxStoreM19242b.m18946I(new Runnable() { // from class: w3.d
                @Override // java.lang.Runnable
                public final void run() {
                    FolderMoveViewModel.m7194C(listM19219e, c9710aM18954g, str, boxStoreM19242b);
                }
            });
            LogUtils.m3888i("页面ObjectBox, MDB模式数据同步修正完成");
        } catch (Exception e10) {
            LogUtils.m3887e("页面ObjectBox, MDB失败: " + e10.getMessage());
            e10.printStackTrace();
        } finally {
            boxStoreM19242b.close();
        }
    }

    /* renamed from: E */
    public final InterfaceC11607p m7212E() {
        return this.f9466m;
    }

    /* renamed from: F */
    public final InterfaceC11607p m7213F() {
        return this.f9464k;
    }

    /* renamed from: G */
    public final void m7214G(String parentId, String fileId) {
        AbstractC9979u.m20294g(parentId, "parentId");
        AbstractC9979u.m20294g(fileId, "fileId");
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new FolderMoveViewModel$moveFile$1(this, fileId, parentId, null), 3, null);
    }

    /* renamed from: H */
    public final void m7215H(String parentId, List fileIdList) {
        AbstractC9979u.m20294g(parentId, "parentId");
        AbstractC9979u.m20294g(fileIdList, "fileIdList");
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new FolderMoveViewModel$moveFiles$1(this, parentId, fileIdList, null), 3, null);
    }

    /* renamed from: I */
    public final List m7216I(String str, List list, String str2, HashMap map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzyRouterRecord.RouterRecord.SourceCommandRecord sourceCommandRecord = (EzyRouterRecord.RouterRecord.SourceCommandRecord) it.next();
            String str3 = UUID.randomUUID() + str2;
            EzyRouterRecord.RouterRecord.SourceCommandRecord.C8511b builder = sourceCommandRecord.toBuilder();
            map.put(builder.getFileName(), str3);
            arrayList.add(builder.m15888q(str3).build());
            FileUtils.rename(new File(str, sourceCommandRecord.getFileName()), str3);
        }
        return arrayList;
    }

    /* renamed from: J */
    public final void m7217J(String parentId, String fileId) {
        AbstractC9979u.m20294g(parentId, "parentId");
        AbstractC9979u.m20294g(fileId, "fileId");
        BaseViewModel.m4802c(this, new FolderMoveViewModel$restoreFile$1(this, parentId, fileId, null), new FolderMoveViewModel$restoreFile$2(this, null), null, 4, null);
    }

    /* renamed from: K */
    public final void m7218K(FileEntity fileEntity) {
        AbstractC9979u.m20294g(fileEntity, "fileEntity");
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new FolderMoveViewModel$setCurrentFolder$1(this, fileEntity, null), 3, null);
    }

    /* renamed from: L */
    public final EzyPageSnapshot.PageSnapshot.GraphSnapshot m7219L(EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshot, HashMap map) {
        if (graphSnapshot.getChildGraphCount() <= 0) {
            EzyPageSnapshot.PageSnapshot.GraphSnapshot.C8496b builder = graphSnapshot.toBuilder();
            String strM15638A = (String) map.get(builder.m15638A());
            if (strM15638A == null) {
                strM15638A = builder.m15638A();
            }
            builder.m15657T(strM15638A);
            EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshotBuild = builder.build();
            AbstractC9979u.m20291d(graphSnapshotBuild);
            return graphSnapshotBuild;
        }
        EzyPageSnapshot.PageSnapshot.GraphSnapshot.C8496b builder2 = graphSnapshot.toBuilder();
        String strM15638A2 = (String) map.get(builder2.m15638A());
        if (strM15638A2 == null) {
            strM15638A2 = builder2.m15638A();
        }
        builder2.m15657T(strM15638A2);
        List childGraphList = graphSnapshot.getChildGraphList();
        AbstractC9979u.m20293f(childGraphList, "getChildGraphList(...)");
        List<EzyPageSnapshot.PageSnapshot.GraphSnapshot> list = childGraphList;
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list, 10));
        for (EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshot2 : list) {
            AbstractC9979u.m20291d(graphSnapshot2);
            arrayList.add(m7219L(graphSnapshot2, map));
        }
        builder2.m15669l();
        builder2.m15660b(arrayList);
        EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshotBuild2 = builder2.build();
        AbstractC9979u.m20291d(graphSnapshotBuild2);
        return graphSnapshotBuild2;
    }

    /* renamed from: s */
    public final void m7220s(List resourceList, FileEntity selectedFile) {
        AbstractC9979u.m20294g(resourceList, "resourceList");
        AbstractC9979u.m20294g(selectedFile, "selectedFile");
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new FolderMoveViewModel$copyNote$1(this, selectedFile, resourceList, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0093, code lost:
    
        if (m7221t(r9, r8, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7221t(com.friday.common.entity.FileEntity r7, java.util.List r8, vc.InterfaceC11588c r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.friday.main.viewmodel.FolderMoveViewModel$folderList$1
            if (r0 == 0) goto L13
            r0 = r9
            com.friday.main.viewmodel.FolderMoveViewModel$folderList$1 r0 = (com.friday.main.viewmodel.FolderMoveViewModel$folderList$1) r0
            int r1 = r0.f9532h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9532h = r1
            goto L18
        L13:
            com.friday.main.viewmodel.FolderMoveViewModel$folderList$1 r0 = new com.friday.main.viewmodel.FolderMoveViewModel$folderList$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f9530f
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f9532h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4d
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.f9529e
            com.friday.common.entity.FileEntity r7 = (com.friday.common.entity.FileEntity) r7
            java.lang.Object r7 = r0.f9528d
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r7 = r0.f9527c
            com.friday.common.entity.FileEntity r7 = (com.friday.common.entity.FileEntity) r7
            kotlin.AbstractC9924b.m20071b(r9)
            goto L96
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            java.lang.Object r7 = r0.f9528d
            r8 = r7
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r7 = r0.f9527c
            com.friday.common.entity.FileEntity r7 = (com.friday.common.entity.FileEntity) r7
            kotlin.AbstractC9924b.m20071b(r9)
            goto L77
        L4d:
            kotlin.AbstractC9924b.m20071b(r9)
            r9 = 0
            r8.add(r9, r7)
            java.lang.String r2 = r7.getParentId()
            java.lang.String r5 = "0"
            boolean r2 = kotlin.jvm.internal.AbstractC9979u.m20289b(r2, r5)
            if (r2 != 0) goto L99
            com.friday.common.dao.FileDao r9 = r6.f9455b
            java.lang.String r2 = r7.getParentId()
            java.lang.Object r5 = p409xc.AbstractC11833h.m26224a(r7)
            r0.f9527c = r5
            r0.f9528d = r8
            r0.f9532h = r4
            java.lang.Object r9 = r9.mo4941r(r2, r0)
            if (r9 != r1) goto L77
            goto L95
        L77:
            com.friday.common.entity.FileEntity r9 = (com.friday.common.entity.FileEntity) r9
            if (r9 == 0) goto La0
            java.lang.Object r7 = p409xc.AbstractC11833h.m26224a(r7)
            r0.f9527c = r7
            java.lang.Object r7 = p409xc.AbstractC11833h.m26224a(r8)
            r0.f9528d = r7
            java.lang.Object r7 = p409xc.AbstractC11833h.m26224a(r9)
            r0.f9529e = r7
            r0.f9532h = r3
            java.lang.Object r7 = r6.m7221t(r9, r8, r0)
            if (r7 != r1) goto L96
        L95:
            return r1
        L96:
            qc.q r7 = p309qc.C10786q.f26013a
            return r7
        L99:
            com.friday.common.entity.FileEntity r7 = r6.m7222u()
            r8.add(r9, r7)
        La0:
            qc.q r7 = p309qc.C10786q.f26013a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.main.viewmodel.FolderMoveViewModel.m7221t(com.friday.common.entity.FileEntity, java.util.List, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/main/viewmodel/FolderMoveViewModel.smali:1819
    }

    /* renamed from: u */
    public final FileEntity m7222u() {
        return new FileEntity("0", 0L, "根目录", "", "", "0", "0", "", "", 0, false, 0, false, null, 0, null, false, 0L, false, 393216, null);
    }

    /* renamed from: v */
    public final void m7223v(String parentId) {
        AbstractC9979u.m20294g(parentId, "parentId");
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new FolderMoveViewModel$getFileLevels$1(this, parentId, null), 3, null);
    }

    /* renamed from: w */
    public final InterfaceC11612u m7224w() {
        return this.f9460g;
    }

    /* renamed from: x */
    public final void m7225x(String parentId) {
        AbstractC9979u.m20294g(parentId, "parentId");
        BaseViewModel.m4802c(this, new FolderMoveViewModel$getFiles$1(this, parentId, null), new FolderMoveViewModel$getFiles$2(null), null, 4, null);
    }

    /* renamed from: y */
    public final void m7226y(boolean z10, boolean z11, String parentId, String fileId) {
        AbstractC9979u.m20294g(parentId, "parentId");
        AbstractC9979u.m20294g(fileId, "fileId");
        BaseViewModel.m4802c(this, new FolderMoveViewModel$getFilesExceptItself$1(z11, z10, this, parentId, fileId, null), new FolderMoveViewModel$getFilesExceptItself$2(null), null, 4, null);
    }

    /* renamed from: z */
    public final InterfaceC11612u m7227z() {
        return this.f9462i;
    }
}
