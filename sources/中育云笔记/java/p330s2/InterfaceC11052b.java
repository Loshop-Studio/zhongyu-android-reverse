package p330s2;

import com.friday.common.entity.GetResourceEntity;
import com.friday.common.property.BaseResponse;
import com.friday.document.model.ShareFile;
import com.friday.document.model.StudentShareEntity;
import com.friday.document.model.TchListEntity;
import gf.InterfaceC9413f;
import gf.InterfaceC9427t;
import org.android.agoo.common.AgooConstants;
import vc.InterfaceC11588c;

/* renamed from: s2.b */
/* loaded from: classes3.dex */
public interface InterfaceC11052b {
    /* renamed from: g */
    static /* synthetic */ Object m24501g(InterfaceC11052b interfaceC11052b, String str, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStudentSharedList");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return interfaceC11052b.m24503b(str, interfaceC11588c);
    }

    @InterfaceC9413f("CloudNotes/api/SuperShare/GetResourceByFileId")
    /* renamed from: a */
    Object m24502a(@InterfaceC9427t("fileId") String str, @InterfaceC9427t("ownerId") long j10, InterfaceC11588c<? super BaseResponse<GetResourceEntity>> interfaceC11588c);

    @InterfaceC9413f("CloudNotes/api/SuperShare/SharedToMe")
    /* renamed from: b */
    Object m24503b(@InterfaceC9427t("keyword") String str, InterfaceC11588c<? super BaseResponse<StudentShareEntity>> interfaceC11588c);

    @InterfaceC9413f("CloudNotes/api/SuperShare/GetShareFileById")
    /* renamed from: c */
    Object m24504c(@InterfaceC9427t(AgooConstants.MESSAGE_ID) String str, @InterfaceC9427t("ownerId") long j10, InterfaceC11588c<? super BaseResponse<ShareFile>> interfaceC11588c);

    @InterfaceC9413f("CloudNotes/api/SuperShare/GetByParentId")
    /* renamed from: d */
    Object m24505d(@InterfaceC9427t("parentId") String str, @InterfaceC9427t("ownerId") long j10, @InterfaceC9427t("isNoteNode") boolean z10, InterfaceC11588c<? super BaseResponse<StudentShareEntity>> interfaceC11588c);

    @InterfaceC9413f("CloudNotes/api/SuperShare/RetrieveTeachers")
    /* renamed from: e */
    Object m24506e(InterfaceC11588c<? super BaseResponse<TchListEntity>> interfaceC11588c);

    @InterfaceC9413f("CloudNotes/api/SuperShare/GetSharedToMeByTeacher")
    /* renamed from: f */
    Object m24507f(@InterfaceC9427t("teacherId") long j10, InterfaceC11588c<? super BaseResponse<StudentShareEntity>> interfaceC11588c);
}
