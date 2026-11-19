package com.zykj.gallery.repository;

import com.zykj.gallery.api.PictureService;
import com.zykj.gallery.oss.FileResource;
import com.zykj.gallery.oss.FileType;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class GalleryRepository {

    /* renamed from: a */
    public final PictureService f5777a;

    public GalleryRepository(PictureService pictureService) {
        Intrinsics.checkNotNullParameter(pictureService, "pictureService");
        this.f5777a = pictureService;
    }

    /* renamed from: g */
    public static /* synthetic */ Object m5023g(GalleryRepository galleryRepository, String str, FileType fileType, String str2, FileResource fileResource, String str3, String str4, long j6, Continuation continuation, int i6, Object obj) {
        String strReplace$default;
        long jCurrentTimeMillis;
        GalleryRepository galleryRepository2;
        String str5;
        FileType fileType2;
        FileResource fileResource2;
        Continuation continuation2;
        String str6 = (i6 & 4) != 0 ? "" : str2;
        String str7 = (i6 & 16) != 0 ? "0" : str3;
        if ((i6 & 32) != 0) {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            strReplace$default = StringsKt.replace$default(string, "-", "", false, 4, (Object) null);
        } else {
            strReplace$default = str4;
        }
        if ((i6 & 64) != 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
            str5 = str;
            fileType2 = fileType;
            fileResource2 = fileResource;
            continuation2 = continuation;
            galleryRepository2 = galleryRepository;
        } else {
            jCurrentTimeMillis = j6;
            galleryRepository2 = galleryRepository;
            str5 = str;
            fileType2 = fileType;
            fileResource2 = fileResource;
            continuation2 = continuation;
        }
        return galleryRepository2.m5028f(str5, fileType2, str6, fileResource2, str7, strReplace$default, jCurrentTimeMillis, continuation2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e2, code lost:
    
        if (r8.recordPicturesAsync(r10, r3) == r4) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5024b(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, kotlin.coroutines.Continuation r22) throws com.zykj.http.exception.RemoteCodeException {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.gallery.repository.GalleryRepository.m5024b(java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes2/com/zykj/gallery/repository/GalleryRepository.smali:254
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5025c(java.util.List r5, kotlin.coroutines.Continuation r6) throws com.zykj.http.exception.RemoteCodeException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.zykj.gallery.repository.GalleryRepository$deletePicture$1
            if (r0 == 0) goto L13
            r0 = r6
            com.zykj.gallery.repository.GalleryRepository$deletePicture$1 r0 = (com.zykj.gallery.repository.GalleryRepository$deletePicture$1) r0
            int r1 = r0.f5789d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5789d = r1
            goto L18
        L13:
            com.zykj.gallery.repository.GalleryRepository$deletePicture$1 r0 = new com.zykj.gallery.repository.GalleryRepository$deletePicture$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f5787b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f5789d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f5786a
            java.util.List r5 = (java.util.List) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.throwOnFailure(r6)
            com.zykj.gallery.api.PictureService r6 = r4.f5777a
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r0.f5786a = r2
            r0.f5789d = r3
            java.lang.Object r6 = r6.deletePicture(r5, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            com.zykj.http.bean.ApiResp r6 = (com.zykj.http.bean.ApiResp) r6
            p004a3.AbstractC0009a.m13b(r6)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.gallery.repository.GalleryRepository.m5025c(java.util.List, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes2/com/zykj/gallery/repository/GalleryRepository.smali:742
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5026d(kotlin.coroutines.Continuation r5) throws com.zykj.http.exception.RemoteCodeException {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.zykj.gallery.repository.GalleryRepository$deletePictureClear$1
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.gallery.repository.GalleryRepository$deletePictureClear$1 r0 = (com.zykj.gallery.repository.GalleryRepository$deletePictureClear$1) r0
            int r1 = r0.f5792c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5792c = r1
            goto L18
        L13:
            com.zykj.gallery.repository.GalleryRepository$deletePictureClear$1 r0 = new com.zykj.gallery.repository.GalleryRepository$deletePictureClear$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f5790a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f5792c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.throwOnFailure(r5)
            com.zykj.gallery.api.PictureService r5 = r4.f5777a
            r0.f5792c = r3
            java.lang.Object r5 = r5.deleteClear(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.zykj.http.bean.ApiResp r5 = (com.zykj.http.bean.ApiResp) r5
            p004a3.AbstractC0009a.m13b(r5)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.gallery.repository.GalleryRepository.m5026d(kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes2/com/zykj/gallery/repository/GalleryRepository.smali:917
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5027e(int r5, int r6, boolean r7, kotlin.coroutines.Continuation r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.zykj.gallery.repository.GalleryRepository$getGalleryList$1
            if (r0 == 0) goto L13
            r0 = r8
            com.zykj.gallery.repository.GalleryRepository$getGalleryList$1 r0 = (com.zykj.gallery.repository.GalleryRepository$getGalleryList$1) r0
            int r1 = r0.f5798f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5798f = r1
            goto L18
        L13:
            com.zykj.gallery.repository.GalleryRepository$getGalleryList$1 r0 = new com.zykj.gallery.repository.GalleryRepository$getGalleryList$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f5796d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f5798f
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r8)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.throwOnFailure(r8)
            com.zykj.gallery.api.PictureService r8 = r4.f5777a
            r0.f5793a = r5
            r0.f5794b = r6
            r0.f5795c = r7
            r0.f5798f = r3
            java.lang.Object r8 = r8.getGarryList(r5, r6, r7, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            com.zykj.http.bean.ApiResp r8 = (com.zykj.http.bean.ApiResp) r8
            java.lang.Object r5 = p004a3.AbstractC0009a.m13b(r8)
            com.zykj.gallery.bean.PagedData r5 = (com.zykj.gallery.bean.PagedData) r5
            com.zykj.gallery.bean.PagedData r6 = new com.zykj.gallery.bean.PagedData
            if (r5 == 0) goto L57
            java.util.List r7 = r5.getItems()
            if (r7 != 0) goto L5b
        L57:
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
        L5b:
            if (r5 == 0) goto L62
            int r5 = r5.getTotalCount()
            goto L63
        L62:
            r5 = 0
        L63:
            r6.<init>(r7, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.gallery.repository.GalleryRepository.m5027e(int, int, boolean, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes2/com/zykj/gallery/repository/GalleryRepository.smali:1072
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5028f(java.lang.String r13, com.zykj.gallery.oss.FileType r14, java.lang.String r15, com.zykj.gallery.oss.FileResource r16, java.lang.String r17, java.lang.String r18, long r19, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.gallery.repository.GalleryRepository.m5028f(java.lang.String, com.zykj.gallery.oss.FileType, java.lang.String, com.zykj.gallery.oss.FileResource, java.lang.String, java.lang.String, long, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes2/com/zykj/gallery/repository/GalleryRepository.smali:1297
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5029h(java.lang.String r20, com.zykj.gallery.oss.FileType r21, java.lang.String r22, com.zykj.gallery.oss.FileResource r23, java.lang.String r24, java.lang.String r25, long r26, kotlin.coroutines.Continuation r28) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.gallery.repository.GalleryRepository.m5029h(java.lang.String, com.zykj.gallery.oss.FileType, java.lang.String, com.zykj.gallery.oss.FileResource, java.lang.String, java.lang.String, long, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes2/com/zykj/gallery/repository/GalleryRepository.smali:1817
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5030i(java.util.List r5, kotlin.coroutines.Continuation r6) throws com.zykj.http.exception.RemoteCodeException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.zykj.gallery.repository.GalleryRepository$moveToRecycleBinAsync$1
            if (r0 == 0) goto L13
            r0 = r6
            com.zykj.gallery.repository.GalleryRepository$moveToRecycleBinAsync$1 r0 = (com.zykj.gallery.repository.GalleryRepository$moveToRecycleBinAsync$1) r0
            int r1 = r0.f5827d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5827d = r1
            goto L18
        L13:
            com.zykj.gallery.repository.GalleryRepository$moveToRecycleBinAsync$1 r0 = new com.zykj.gallery.repository.GalleryRepository$moveToRecycleBinAsync$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f5825b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f5827d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f5824a
            java.util.List r5 = (java.util.List) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.throwOnFailure(r6)
            com.zykj.gallery.api.PictureService r6 = r4.f5777a
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r0.f5824a = r2
            r0.f5827d = r3
            java.lang.Object r6 = r6.moveToRecycleBinAsync(r5, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            com.zykj.http.bean.ApiResp r6 = (com.zykj.http.bean.ApiResp) r6
            p004a3.AbstractC0009a.m13b(r6)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.gallery.repository.GalleryRepository.m5030i(java.util.List, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes2/com/zykj/gallery/repository/GalleryRepository.smali:2425
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5031j(java.util.List r5, kotlin.coroutines.Continuation r6) throws com.zykj.http.exception.RemoteCodeException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.zykj.gallery.repository.GalleryRepository$receiverPicture$1
            if (r0 == 0) goto L13
            r0 = r6
            com.zykj.gallery.repository.GalleryRepository$receiverPicture$1 r0 = (com.zykj.gallery.repository.GalleryRepository$receiverPicture$1) r0
            int r1 = r0.f5831d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5831d = r1
            goto L18
        L13:
            com.zykj.gallery.repository.GalleryRepository$receiverPicture$1 r0 = new com.zykj.gallery.repository.GalleryRepository$receiverPicture$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f5829b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f5831d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f5828a
            java.util.List r5 = (java.util.List) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.throwOnFailure(r6)
            com.zykj.gallery.api.PictureService r6 = r4.f5777a
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r0.f5828a = r2
            r0.f5831d = r3
            java.lang.Object r6 = r6.receiverPicture(r5, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            com.zykj.http.bean.ApiResp r6 = (com.zykj.http.bean.ApiResp) r6
            p004a3.AbstractC0009a.m13b(r6)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.gallery.repository.GalleryRepository.m5031j(java.util.List, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes2/com/zykj/gallery/repository/GalleryRepository.smali:2600
    }
}
