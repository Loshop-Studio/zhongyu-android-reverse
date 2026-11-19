package p356u3;

import com.friday.common.base.BaseCameraResponse;
import gf.InterfaceC9413f;
import vc.InterfaceC11588c;

/* renamed from: u3.a */
/* loaded from: classes4.dex */
public interface InterfaceC11364a {
    @InterfaceC9413f("/api/services/app/StoreAppControl/CanIOpenCameraAsync?packageName=com.friday.cloudsnote")
    /* renamed from: a */
    Object m25278a(InterfaceC11588c<? super BaseCameraResponse> interfaceC11588c);

    @InterfaceC9413f("/api/services/app/StoreAppControl/CanIOpenAlbumAsync?packageName=com.friday.cloudsnote")
    /* renamed from: b */
    Object m25279b(InterfaceC11588c<? super BaseCameraResponse> interfaceC11588c);

    @InterfaceC9413f("/api/services/app/StoreAppControl/CanIOpenScreenShotAsync?packageName=com.friday.cloudsnote")
    /* renamed from: c */
    Object m25280c(InterfaceC11588c<? super BaseCameraResponse> interfaceC11588c);
}
