package com.zykj.study.bean.course;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class CatalogUpdateInput {
    public static final int $stable = 0;

    /* renamed from: id */
    private final int f11002id;
    private final String title;

    public CatalogUpdateInput(int i10, String title) {
        AbstractC9133u.m16133g(title, "title");
        this.f11002id = i10;
        this.title = title;
    }

    public static /* synthetic */ CatalogUpdateInput copy$default(CatalogUpdateInput catalogUpdateInput, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = catalogUpdateInput.f11002id;
        }
        if ((i11 & 2) != 0) {
            str = catalogUpdateInput.title;
        }
        return catalogUpdateInput.copy(i10, str);
    }

    public final int component1() {
        return this.f11002id;
    }

    public final String component2() {
        return this.title;
    }

    public final CatalogUpdateInput copy(int i10, String title) {
        AbstractC9133u.m16133g(title, "title");
        return new CatalogUpdateInput(i10, title);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogUpdateInput)) {
            return false;
        }
        CatalogUpdateInput catalogUpdateInput = (CatalogUpdateInput) obj;
        return this.f11002id == catalogUpdateInput.f11002id && AbstractC9133u.m16128b(this.title, catalogUpdateInput.title);
    }

    public final int getId() {
        return this.f11002id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f11002id) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "CatalogUpdateInput(id=" + this.f11002id + ", title=" + this.title + ")";
    }
}
