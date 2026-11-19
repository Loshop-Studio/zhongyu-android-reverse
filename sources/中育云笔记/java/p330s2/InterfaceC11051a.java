package p330s2;

import com.friday.common.entity.FileBean;
import com.friday.common.entity.GetResourceEntity;
import com.friday.common.entity.ResourceEntity;
import com.friday.common.entity.RestoreResponse;
import com.friday.common.entity.UpdateRequest;
import com.friday.common.entity.UpdateResponse;
import com.friday.common.property.BaseResponse;
import com.friday.document.model.ResourceDeleteEntity;
import gf.InterfaceC9408a;
import gf.InterfaceC9413f;
import gf.InterfaceC9422o;
import gf.InterfaceC9427t;
import java.util.List;
import vc.InterfaceC11588c;

/* renamed from: s2.a */
/* loaded from: classes3.dex */
public interface InterfaceC11051a {
    @InterfaceC9413f("CloudNotes/api/Notes/GetAll")
    /* renamed from: a */
    Object m24493a(InterfaceC11588c<? super BaseResponse<FileBean>> interfaceC11588c);

    @InterfaceC9413f("CloudNotes/api/Resources/GetByFileId")
    /* renamed from: b */
    Object m24494b(@InterfaceC9427t("fileId") String str, InterfaceC11588c<? super BaseResponse<GetResourceEntity>> interfaceC11588c);

    @InterfaceC9422o("CloudNotes/api/Notes/AddOrUpdate")
    /* renamed from: c */
    Object m24495c(@InterfaceC9408a UpdateRequest updateRequest, InterfaceC11588c<? super BaseResponse<UpdateResponse>> interfaceC11588c);

    @InterfaceC9422o("CloudNotes/api/Notes/Delete")
    /* renamed from: d */
    Object m24496d(@InterfaceC9408a List<String> list, InterfaceC11588c<? super BaseResponse<Object>> interfaceC11588c);

    @InterfaceC9422o("CloudNotes/api/Resources/Delete")
    /* renamed from: e */
    Object m24497e(@InterfaceC9408a List<ResourceDeleteEntity> list, InterfaceC11588c<? super BaseResponse<Object>> interfaceC11588c);

    @InterfaceC9422o("CloudNotes/api/Notes/MoveToRecycleBin")
    /* renamed from: f */
    Object m24498f(@InterfaceC9408a List<String> list, InterfaceC11588c<? super BaseResponse<List<RestoreResponse>>> interfaceC11588c);

    @InterfaceC9422o("CloudNotes/api/Resources/AddOrUpdate")
    /* renamed from: g */
    Object m24499g(@InterfaceC9408a List<ResourceEntity> list, InterfaceC11588c<? super BaseResponse<List<String>>> interfaceC11588c);

    @InterfaceC9422o("CloudNotes/api/Notes/ExpiredDelete")
    /* renamed from: h */
    Object m24500h(@InterfaceC9408a List<String> list, InterfaceC11588c<? super BaseResponse<List<String>>> interfaceC11588c);
}
