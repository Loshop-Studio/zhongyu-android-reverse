package com.zykj.mistake.entity.resp;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/CreateOrUpdateCollectionResult;", "", HintConstants.AUTOFILL_HINT_NAME, "", "id", "", "<init>", "(Ljava/lang/String;I)V", "getName", "()Ljava/lang/String;", "getId", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class CreateOrUpdateCollectionResult {
    public static final int $stable = 0;
    private final int id;

    @NotNull
    private final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public CreateOrUpdateCollectionResult() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CreateOrUpdateCollectionResult copy$default(CreateOrUpdateCollectionResult createOrUpdateCollectionResult, String str, int i, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = createOrUpdateCollectionResult.name;
        }
        if ((i8 & 2) != 0) {
            i = createOrUpdateCollectionResult.id;
        }
        return createOrUpdateCollectionResult.copy(str, i);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    public final CreateOrUpdateCollectionResult copy(@NotNull String name, int id) {
        AbstractC5830k.m5330g(name, "name");
        return new CreateOrUpdateCollectionResult(name, id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateOrUpdateCollectionResult)) {
            return false;
        }
        CreateOrUpdateCollectionResult createOrUpdateCollectionResult = (CreateOrUpdateCollectionResult) other;
        return AbstractC5830k.m5325b(this.name, createOrUpdateCollectionResult.name) && this.id == createOrUpdateCollectionResult.id;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return Integer.hashCode(this.id) + (this.name.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "CreateOrUpdateCollectionResult(name=" + this.name + ", id=" + this.id + ")";
    }

    public CreateOrUpdateCollectionResult(@NotNull String name, int i) {
        AbstractC5830k.m5330g(name, "name");
        this.name = name;
        this.id = i;
    }

    public /* synthetic */ CreateOrUpdateCollectionResult(String str, int i, int i8, AbstractC5824e abstractC5824e) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? 0 : i);
    }
}
