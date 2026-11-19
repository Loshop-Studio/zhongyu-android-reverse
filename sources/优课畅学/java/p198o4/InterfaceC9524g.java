package p198o4;

import com.zykj.study.bean.AttachmentIdInput;
import com.zykj.study.bean.AttachmentInput;
import com.zykj.study.bean.ScanResult;
import p103fa.InterfaceC8487a;
import p103fa.InterfaceC8501o;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;

/* renamed from: o4.g */
/* loaded from: classes4.dex */
public interface InterfaceC9524g {
    @InterfaceC8501o("SelfStudy/api/course/AddAttachment")
    /* renamed from: a */
    Object m17726a(@InterfaceC8487a AttachmentIdInput attachmentIdInput, InterfaceC9324c<? super Long> interfaceC9324c);

    @InterfaceC8501o("SelfStudy/api/quickCode/useCode")
    /* renamed from: b */
    Object m17727b(@InterfaceC8487a AttachmentInput attachmentInput, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @InterfaceC8501o("SelfStudy/api/quickCode/verifyCode")
    /* renamed from: c */
    Object m17728c(@InterfaceC8487a ScanResult scanResult, InterfaceC9324c<? super C8736p> interfaceC9324c);
}
