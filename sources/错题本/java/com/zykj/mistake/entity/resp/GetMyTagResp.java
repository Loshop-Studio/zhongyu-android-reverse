package com.zykj.mistake.entity.resp;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.network.ApiResp;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/GetMyTagResp;", "Lcom/zykj/mistake/network/ApiResp;", "<init>", "()V", "result", "", "Lcom/zykj/mistake/entity/resp/CustomTagInfo;", "getResult", "()Ljava/util/List;", "setResult", "(Ljava/util/List;)V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class GetMyTagResp extends ApiResp {
    public static final int $stable = 8;

    @Nullable
    private List<CustomTagInfo> result;

    @Nullable
    public final List<CustomTagInfo> getResult() {
        return this.result;
    }

    public final void setResult(@Nullable List<CustomTagInfo> list) {
        this.result = list;
    }
}
