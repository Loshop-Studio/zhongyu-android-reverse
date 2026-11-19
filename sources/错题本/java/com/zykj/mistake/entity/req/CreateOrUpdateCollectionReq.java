package com.zykj.mistake.entity.req;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m5110d2 = {"Lcom/zykj/mistake/entity/req/CreateOrUpdateCollectionReq;", "", "id", "", HintConstants.AUTOFILL_HINT_NAME, "", "<init>", "(ILjava/lang/String;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class CreateOrUpdateCollectionReq {
    public static final int $stable = 0;
    private final int id;

    @NotNull
    private final String name;

    public CreateOrUpdateCollectionReq(int i, @NotNull String name) {
        AbstractC5830k.m5330g(name, "name");
        this.id = i;
        this.name = name;
    }

    public static /* synthetic */ CreateOrUpdateCollectionReq copy$default(CreateOrUpdateCollectionReq createOrUpdateCollectionReq, int i, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = createOrUpdateCollectionReq.id;
        }
        if ((i8 & 2) != 0) {
            str = createOrUpdateCollectionReq.name;
        }
        return createOrUpdateCollectionReq.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final CreateOrUpdateCollectionReq copy(int id, @NotNull String name) {
        AbstractC5830k.m5330g(name, "name");
        return new CreateOrUpdateCollectionReq(id, name);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateOrUpdateCollectionReq)) {
            return false;
        }
        CreateOrUpdateCollectionReq createOrUpdateCollectionReq = (CreateOrUpdateCollectionReq) other;
        return this.id == createOrUpdateCollectionReq.id && AbstractC5830k.m5325b(this.name, createOrUpdateCollectionReq.name);
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        return "CreateOrUpdateCollectionReq(id=" + this.id + ", name=" + this.name + ")";
    }
}
