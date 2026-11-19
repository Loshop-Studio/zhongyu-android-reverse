package com.zykj.mistake.entity.req;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m5110d2 = {"Lcom/zykj/mistake/entity/req/CreateTagReq;", "", HintConstants.AUTOFILL_HINT_NAME, "", "id", "", "<init>", "(Ljava/lang/String;J)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getId", "()J", "setId", "(J)V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class CreateTagReq {
    public static final int $stable = 8;
    private long id;

    @NotNull
    private String name;

    public CreateTagReq() {
        this(null, 0L, 3, null);
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setName(@NotNull String str) {
        AbstractC5830k.m5330g(str, "<set-?>");
        this.name = str;
    }

    public CreateTagReq(@NotNull String name, long j7) {
        AbstractC5830k.m5330g(name, "name");
        this.name = name;
        this.id = j7;
    }

    public /* synthetic */ CreateTagReq(String str, long j7, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j7);
    }
}
