package com.zykj.gallery.api;

import com.zykj.gallery.bean.GalleryBody;
import com.zykj.gallery.bean.GalleryImgBean;
import com.zykj.gallery.bean.PagedData;
import com.zykj.gallery.bean.RecordImgBean;
import com.zykj.gallery.oss.OssToken;
import com.zykj.gallery.oss.TokenReq;
import com.zykj.http.bean.ApiResp;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import p029c6.InterfaceC4510a;
import p029c6.InterfaceC4511b;
import p029c6.InterfaceC4515f;
import p029c6.InterfaceC4524o;
import p029c6.InterfaceC4529t;

@Metadata(m7879d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH§@¢\u0006\u0002\u0010\u0010J$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u000e\b\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH§@¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H§@¢\u0006\u0002\u0010\u0014J$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH§@¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u0017H§@¢\u0006\u0002\u0010\u0018J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u001cH§@¢\u0006\u0002\u0010\u001dJ\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u001f\u001a\u00020 H§@¢\u0006\u0002\u0010!¨\u0006\"À\u0006\u0003"}, m7880d2 = {"Lcom/zykj/gallery/api/PictureService;", "", "getGarryList", "Lcom/zykj/http/bean/ApiResp;", "Lcom/zykj/gallery/bean/PagedData;", "Lcom/zykj/gallery/bean/GalleryImgBean;", "skipCount", "", "maxResultCount", "isRecycleBin", "", "(IIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "moveToRecycleBinAsync", "", "list", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePicture", "ids", "deleteClear", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiverPicture", "addPicture", "Lcom/zykj/gallery/bean/GalleryBody;", "(Lcom/zykj/gallery/bean/GalleryBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGeneratorTokenTypeV2", "Lcom/zykj/gallery/oss/OssToken;", "req", "Lcom/zykj/gallery/oss/TokenReq;", "(Lcom/zykj/gallery/oss/TokenReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recordPicturesAsync", "body", "Lcom/zykj/gallery/bean/RecordImgBean;", "(Lcom/zykj/gallery/bean/RecordImgBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "module_gallery_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes.dex */
public interface PictureService {
    @InterfaceC4524o("/api/services/app/PictureLibrary/AddPictureAsync")
    Object addPicture(@InterfaceC4510a GalleryBody galleryBody, Continuation<? super ApiResp<Object>> continuation);

    @InterfaceC4511b("/api/services/app/PictureLibrary/EmptyRecycleBinAsync")
    Object deleteClear(Continuation<? super ApiResp<Object>> continuation);

    @InterfaceC4511b("/api/services/app/PictureLibrary/DeletePicture")
    Object deletePicture(@InterfaceC4529t("ids") List<Long> list, Continuation<? super ApiResp<Object>> continuation);

    @InterfaceC4515f("/api/services/app/PictureLibrary/GetAllPicturesFromLibrary")
    Object getGarryList(@InterfaceC4529t("SkipCount") int i6, @InterfaceC4529t("MaxResultCount") int i7, @InterfaceC4529t("IsRecycleBin") boolean z6, Continuation<? super ApiResp<PagedData<GalleryImgBean>>> continuation);

    @InterfaceC4524o("/api/services/app/ObjectStorage/GenerateTokenV2Async")
    Object getGeneratorTokenTypeV2(@InterfaceC4510a TokenReq tokenReq, Continuation<? super ApiResp<OssToken>> continuation);

    @InterfaceC4524o("/api/services/app/PictureLibrary/MoveToRecycleBinAsync")
    Object moveToRecycleBinAsync(@InterfaceC4510a List<Long> list, Continuation<? super ApiResp<Long>> continuation);

    @InterfaceC4524o("/api/services/app/PictureLibrary/RecoverPictureFromRecycleBinAsync")
    Object receiverPicture(@InterfaceC4510a List<Long> list, Continuation<? super ApiResp<Long>> continuation);

    @InterfaceC4524o("/api/services/app/StoreAppControl/RecordPicturesAsync")
    Object recordPicturesAsync(@InterfaceC4510a RecordImgBean recordImgBean, Continuation<? super ApiResp<Object>> continuation);
}
