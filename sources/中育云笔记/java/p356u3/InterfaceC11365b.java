package p356u3;

import com.friday.common.entity.GetResourceEntity;
import com.friday.common.entity.RestoreResponse;
import com.friday.common.property.BaseResponse;
import com.friday.main.model.RestoreReq;
import gf.InterfaceC9408a;
import gf.InterfaceC9413f;
import gf.InterfaceC9422o;
import gf.InterfaceC9427t;
import java.util.List;
import vc.InterfaceC11588c;

/* renamed from: u3.b */
/* loaded from: classes4.dex */
public interface InterfaceC11365b {
    @InterfaceC9422o("CloudNotes/api/Notes/Restore")
    /* renamed from: a */
    Object m25281a(@InterfaceC9408a RestoreReq restoreReq, InterfaceC11588c<? super BaseResponse<List<RestoreResponse>>> interfaceC11588c);

    @InterfaceC9413f("CloudNotes/api/Resources/GetByFileId")
    /* renamed from: b */
    Object m25282b(@InterfaceC9427t("fileId") String str, InterfaceC11588c<? super BaseResponse<GetResourceEntity>> interfaceC11588c);
}
