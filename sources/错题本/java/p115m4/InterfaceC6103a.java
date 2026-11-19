package p115m4;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import okhttp3.AbstractC6323m0;
import org.jetbrains.annotations.NotNull;
import p145q5.AbstractC6434e;
import retrofit2.http.GET;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

@Metadata(m5109d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, m5110d2 = {"Lm4/a;", "", "", "url", "Lq5/e;", "Lokhttp3/m0;", "a", "(Ljava/lang/String;)Lq5/e;", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* renamed from: m4.a */
/* loaded from: classes3.dex */
public interface InterfaceC6103a {
    @Streaming
    @GET
    @NotNull
    /* renamed from: a */
    AbstractC6434e<AbstractC6323m0> m5801a(@Url @NotNull String url);
}
