package com.friday.main.model;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class AddRelationResponse {
    public static final int $stable = 0;
    private final boolean isexist;

    public AddRelationResponse(boolean z10) {
        this.isexist = z10;
    }

    public static /* synthetic */ AddRelationResponse copy$default(AddRelationResponse addRelationResponse, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = addRelationResponse.isexist;
        }
        return addRelationResponse.copy(z10);
    }

    public final boolean component1() {
        return this.isexist;
    }

    public final AddRelationResponse copy(boolean z10) {
        return new AddRelationResponse(z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddRelationResponse) && this.isexist == ((AddRelationResponse) obj).isexist;
    }

    public final boolean getIsexist() {
        return this.isexist;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isexist);
    }

    public String toString() {
        return "AddRelationResponse(isexist=" + this.isexist + ")";
    }
}
