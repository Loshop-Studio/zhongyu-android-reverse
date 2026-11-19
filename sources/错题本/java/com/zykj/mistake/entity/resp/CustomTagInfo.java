package com.zykj.mistake.entity.resp;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/CustomTagInfo;", "", HintConstants.AUTOFILL_HINT_NAME, "", "id", "", "bindItemsCount", "", "localType", "<init>", "(Ljava/lang/String;JII)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getId", "()J", "setId", "(J)V", "getBindItemsCount", "()I", "setBindItemsCount", "(I)V", "getLocalType", "setLocalType", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class CustomTagInfo {
    public static final int $stable = 8;
    private int bindItemsCount;
    private long id;
    private int localType;

    @NotNull
    private String name;

    public CustomTagInfo() {
        this(null, 0L, 0, 0, 15, null);
    }

    public final int getBindItemsCount() {
        return this.bindItemsCount;
    }

    public final long getId() {
        return this.id;
    }

    public final int getLocalType() {
        return this.localType;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final void setBindItemsCount(int i) {
        this.bindItemsCount = i;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setLocalType(int i) {
        this.localType = i;
    }

    public final void setName(@NotNull String str) {
        AbstractC5830k.m5330g(str, "<set-?>");
        this.name = str;
    }

    public CustomTagInfo(@NotNull String name, long j7, int i, int i8) {
        AbstractC5830k.m5330g(name, "name");
        this.name = name;
        this.id = j7;
        this.bindItemsCount = i;
        this.localType = i8;
    }

    public /* synthetic */ CustomTagInfo(String str, long j7, int i, int i8, int i9, AbstractC5824e abstractC5824e) {
        this((i9 & 1) != 0 ? "" : str, (i9 & 2) != 0 ? 0L : j7, (i9 & 4) != 0 ? 0 : i, (i9 & 8) != 0 ? -1 : i8);
    }
}
