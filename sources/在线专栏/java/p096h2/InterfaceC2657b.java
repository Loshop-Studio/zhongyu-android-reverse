package p096h2;

import com.zykj.subscriber.entity.resp.GetWhiteListResp;
import org.jetbrains.annotations.NotNull;
import p147rx.Observable;
import retrofit2.http.GET;

/* renamed from: h2.b */
/* loaded from: classes.dex */
public interface InterfaceC2657b {
    @GET("api/services/app/WebWhiteList/GetAllWhiteUrlAsync")
    @NotNull
    /* renamed from: a */
    Observable<GetWhiteListResp> m8927a();
}
