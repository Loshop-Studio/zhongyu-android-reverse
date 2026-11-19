package p090f7;

import com.zykj.evaluation.upload.OssToken;
import com.zykj.evaluation.upload.TokenReq;
import com.zykj.http.bean.ApiResp;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import p259u9.InterfaceC9597a;
import p259u9.InterfaceC9611o;

@Metadata(m13557d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, m13558d2 = {"Lf7/c;", "", "Lcom/zykj/evaluation/upload/TokenReq;", "req", "Lcom/zykj/http/bean/ApiResp;", "Lcom/zykj/evaluation/upload/OssToken;", "a", "(Lcom/zykj/evaluation/upload/TokenReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* renamed from: f7.c */
/* loaded from: classes4.dex */
public interface InterfaceC7490c {
    @InterfaceC9611o("/api/services/app/ObjectStorage/GenerateTokenV2Async")
    /* renamed from: a */
    Object m12121a(@InterfaceC9597a TokenReq tokenReq, Continuation<? super ApiResp<OssToken>> continuation);
}
