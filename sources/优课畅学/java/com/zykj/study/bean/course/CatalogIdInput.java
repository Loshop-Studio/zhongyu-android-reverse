package com.zykj.study.bean.course;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class CatalogIdInput {
    public static final int $stable = 0;

    /* renamed from: id */
    private final int f10999id;

    public CatalogIdInput(int i10) {
        this.f10999id = i10;
    }

    public static /* synthetic */ CatalogIdInput copy$default(CatalogIdInput catalogIdInput, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = catalogIdInput.f10999id;
        }
        return catalogIdInput.copy(i10);
    }

    public final int component1() {
        return this.f10999id;
    }

    public final CatalogIdInput copy(int i10) {
        return new CatalogIdInput(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CatalogIdInput) && this.f10999id == ((CatalogIdInput) obj).f10999id;
    }

    public final int getId() {
        return this.f10999id;
    }

    public int hashCode() {
        return Integer.hashCode(this.f10999id);
    }

    public String toString() {
        return "CatalogIdInput(id=" + this.f10999id + ")";
    }
}
