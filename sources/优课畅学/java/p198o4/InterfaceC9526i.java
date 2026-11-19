package p198o4;

import com.zykj.study.bean.DeleteSubBatchReq;
import com.zykj.study.bean.DeleteSubSingReq;
import com.zykj.study.bean.FreeSubscribeReq;
import com.zykj.study.bean.FreeSubscribeResp;
import com.zykj.study.bean.OtherSubscribe;
import com.zykj.study.bean.SelfSubscribeList;
import java.util.List;
import p103fa.InterfaceC8487a;
import p103fa.InterfaceC8492f;
import p103fa.InterfaceC8501o;
import p103fa.InterfaceC8506t;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;

/* renamed from: o4.i */
/* loaded from: classes4.dex */
public interface InterfaceC9526i {
    @InterfaceC8492f("SelfStudy/api/Supervise/GetSuperviseLearnerCount")
    /* renamed from: a */
    Object m17730a(@InterfaceC8506t("superviseId") long j10, InterfaceC9324c<? super Integer> interfaceC9324c);

    @InterfaceC8501o("SelfStudy/api/learn/deleteLearnersByCondition")
    /* renamed from: b */
    Object m17731b(@InterfaceC8487a DeleteSubBatchReq deleteSubBatchReq, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @InterfaceC8492f("SelfStudy/api/supervise/GetSuperviseTeachers")
    /* renamed from: c */
    Object m17732c(@InterfaceC8506t("courseId") long j10, InterfaceC9324c<? super List<OtherSubscribe>> interfaceC9324c);

    @InterfaceC8501o("SelfStudy/api/learn/getCourseLearners")
    /* renamed from: d */
    Object m17733d(@InterfaceC8487a FreeSubscribeReq freeSubscribeReq, InterfaceC9324c<? super FreeSubscribeResp> interfaceC9324c);

    @InterfaceC8492f("SelfStudy/api/Supervise/GetSuperviseGroupMember")
    /* renamed from: e */
    Object m17734e(@InterfaceC8506t("courseId") long j10, InterfaceC9324c<? super SelfSubscribeList> interfaceC9324c);

    @InterfaceC8501o("SelfStudy/api/learn/deleteCourseLearner")
    /* renamed from: f */
    Object m17735f(@InterfaceC8487a DeleteSubSingReq deleteSubSingReq, InterfaceC9324c<? super C8736p> interfaceC9324c);
}
