package p128u1;

import com.umeng.analytics.pro.C3335ai;
import com.zykj.insight.bean.GetAllSettingsResp;
import com.zykj.insight.network.BaseResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import p097m3.InterfaceC4372f;
import p097m3.InterfaceC4386t;

@Metadata(m5174d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m5175d2 = {"Lu1/g;", "", "Lcom/zykj/insight/network/BaseResponse;", "Lcom/zykj/insight/bean/GetAllSettingsResp;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "clientType", "", C3335ai.f1705at, "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, m5176k = 1, m5177mv = {1, 8, 0})
/* renamed from: u1.g */
/* loaded from: classes2.dex */
public interface InterfaceC4609g {

    /* renamed from: u1.g$a */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ Object m6356a(InterfaceC4609g interfaceC4609g, int i4, Continuation continuation, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDnUrl");
            }
            if ((i5 & 1) != 0) {
                i4 = 2;
            }
            return interfaceC4609g.m6354a(i4, continuation);
        }
    }

    @InterfaceC4372f("/api/dn/GetDnUrl")
    /* renamed from: a */
    Object m6354a(@InterfaceC4386t("clientType") int i4, Continuation<? super BaseResponse<String>> continuation);

    @InterfaceC4372f("/api/services/app/Setting/GetAllSettings")
    /* renamed from: b */
    Object m6355b(Continuation<? super BaseResponse<GetAllSettingsResp>> continuation);
}
