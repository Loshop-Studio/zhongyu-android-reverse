package com.zykj.evaluation.bean;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J$\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m13558d2 = {"Lcom/zykj/evaluation/bean/CreateTagReq;", "", "id", "", HintConstants.AUTOFILL_HINT_NAME, "", "<init>", "(Ljava/lang/Long;Ljava/lang/String;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/String;)Lcom/zykj/evaluation/bean/CreateTagReq;", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CreateTagReq {
    public static final int $stable = 0;
    private final Long id;
    private final String name;

    public CreateTagReq(Long l10, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = l10;
        this.name = name;
    }

    public static /* synthetic */ CreateTagReq copy$default(CreateTagReq createTagReq, Long l10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = createTagReq.id;
        }
        if ((i10 & 2) != 0) {
            str = createTagReq.name;
        }
        return createTagReq.copy(l10, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final CreateTagReq copy(Long id, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new CreateTagReq(id, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateTagReq)) {
            return false;
        }
        CreateTagReq createTagReq = (CreateTagReq) other;
        return Intrinsics.areEqual(this.id, createTagReq.id) && Intrinsics.areEqual(this.name, createTagReq.name);
    }

    public final Long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        Long l10 = this.id;
        return ((l10 == null ? 0 : l10.hashCode()) * 31) + this.name.hashCode();
    }

    public String toString() {
        return "CreateTagReq(id=" + this.id + ", name=" + this.name + ")";
    }

    public /* synthetic */ CreateTagReq(Long l10, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : l10, str);
    }
}
