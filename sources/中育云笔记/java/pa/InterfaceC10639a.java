package pa;

import com.friday.common.entity.FileBean;
import com.friday.common.entity.UpdateRequest;
import com.friday.common.entity.UpdateResponse;
import com.friday.common.property.BaseResponse;
import gf.InterfaceC9408a;
import gf.InterfaceC9413f;
import gf.InterfaceC9422o;
import vc.InterfaceC11588c;

/* renamed from: pa.a */
/* loaded from: classes6.dex */
public interface InterfaceC10639a {
    @InterfaceC9413f("CloudNotes/api/Notes/GetAll")
    /* renamed from: a */
    Object m22509a(InterfaceC11588c<? super BaseResponse<FileBean>> interfaceC11588c);

    @InterfaceC9422o("CloudNotes/api/Notes/AddOrUpdate")
    /* renamed from: c */
    Object m22510c(@InterfaceC9408a UpdateRequest updateRequest, InterfaceC11588c<? super BaseResponse<UpdateResponse>> interfaceC11588c);
}
