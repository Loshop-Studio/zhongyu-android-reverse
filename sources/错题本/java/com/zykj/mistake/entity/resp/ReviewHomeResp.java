package com.zykj.mistake.entity.resp;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.network.ApiResp;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/ReviewHomeResp;", "Lcom/zykj/mistake/network/ApiResp;", "<init>", "()V", "result", "Lcom/zykj/mistake/entity/resp/ReviewHomeResult;", "getResult", "()Lcom/zykj/mistake/entity/resp/ReviewHomeResult;", "setResult", "(Lcom/zykj/mistake/entity/resp/ReviewHomeResult;)V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class ReviewHomeResp extends ApiResp {
    public static final int $stable = 8;

    @NotNull
    private ReviewHomeResult result = new ReviewHomeResult(0, false, null, null, null, null, null, 127, null);

    @NotNull
    public final ReviewHomeResult getResult() {
        return this.result;
    }

    public final void setResult(@NotNull ReviewHomeResult reviewHomeResult) {
        AbstractC5830k.m5330g(reviewHomeResult, "<set-?>");
        this.result = reviewHomeResult;
    }
}
