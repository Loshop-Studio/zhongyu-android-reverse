package p044d5;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.update.network.UpdateResp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p145q5.AbstractC6434e;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J3\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, m5110d2 = {"Ld5/a;", "", "", "packageName", "", "version", "appType", "Lq5/e;", "Lcom/zykj/mistake/update/network/UpdateResp;", "a", "(Ljava/lang/String;II)Lq5/e;", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* renamed from: d5.a */
/* loaded from: classes3.dex */
public interface InterfaceC5423a {
    @GET("api/services/app/AppStore/CheckUpdateAsync")
    @NotNull
    /* renamed from: a */
    AbstractC6434e<UpdateResp> m4814a(@NotNull @Query("packageName") String packageName, @Query("version") int version, @Query("appType") int appType);
}
