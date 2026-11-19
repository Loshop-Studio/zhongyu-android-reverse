package p304y6;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.student.dialogue.network.BaseResponse;
import com.zykj.student.dialogue.upload.OssToken;
import com.zykj.student.dialogue.upload.TokenReq;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import p110f9.InterfaceC7956a;
import p110f9.InterfaceC7970o;

@Metadata(m13412d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, m13413d2 = {"Ly6/b;", "", "Lcom/zykj/student/dialogue/upload/TokenReq;", "req", "Lcom/zykj/student/dialogue/network/BaseResponse;", "Lcom/zykj/student/dialogue/upload/OssToken;", "a", "(Lcom/zykj/student/dialogue/upload/TokenReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* renamed from: y6.b */
/* loaded from: classes5.dex */
public interface InterfaceC9961b {
    @InterfaceC7970o("/api/services/app/ObjectStorage/GenerateTokenV2Async")
    /* renamed from: a */
    Object m17232a(@InterfaceC7956a TokenReq tokenReq, Continuation<? super BaseResponse<OssToken>> continuation);
}
