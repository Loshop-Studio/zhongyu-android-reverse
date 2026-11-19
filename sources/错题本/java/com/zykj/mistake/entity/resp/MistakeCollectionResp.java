package com.zykj.mistake.entity.resp;

import android.support.v4.media.AbstractC0037f;
import androidx.autofill.HintConstants;
import androidx.collection.AbstractC0584a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001d"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/MistakeCollectionResp;", "", HintConstants.AUTOFILL_HINT_NAME, "", "description", "itemCount", "", "creationTime", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V", "getName", "()Ljava/lang/String;", "getDescription", "getItemCount", "()I", "getCreationTime", "getId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class MistakeCollectionResp {
    public static final int $stable = 0;

    @Nullable
    private final String creationTime;

    @NotNull
    private final String description;
    private final int id;
    private final int itemCount;

    @NotNull
    private final String name;

    public MistakeCollectionResp() {
        this(null, null, 0, null, 0, 31, null);
    }

    public static /* synthetic */ MistakeCollectionResp copy$default(MistakeCollectionResp mistakeCollectionResp, String str, String str2, int i, String str3, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = mistakeCollectionResp.name;
        }
        if ((i9 & 2) != 0) {
            str2 = mistakeCollectionResp.description;
        }
        if ((i9 & 4) != 0) {
            i = mistakeCollectionResp.itemCount;
        }
        if ((i9 & 8) != 0) {
            str3 = mistakeCollectionResp.creationTime;
        }
        if ((i9 & 16) != 0) {
            i8 = mistakeCollectionResp.id;
        }
        int i10 = i8;
        int i11 = i;
        return mistakeCollectionResp.copy(str, str2, i11, str3, i10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final int getItemCount() {
        return this.itemCount;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getCreationTime() {
        return this.creationTime;
    }

    /* renamed from: component5, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    public final MistakeCollectionResp copy(@NotNull String name, @NotNull String description, int itemCount, @Nullable String creationTime, int id) {
        AbstractC5830k.m5330g(name, "name");
        AbstractC5830k.m5330g(description, "description");
        return new MistakeCollectionResp(name, description, itemCount, creationTime, id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MistakeCollectionResp)) {
            return false;
        }
        MistakeCollectionResp mistakeCollectionResp = (MistakeCollectionResp) other;
        return AbstractC5830k.m5325b(this.name, mistakeCollectionResp.name) && AbstractC5830k.m5325b(this.description, mistakeCollectionResp.description) && this.itemCount == mistakeCollectionResp.itemCount && AbstractC5830k.m5325b(this.creationTime, mistakeCollectionResp.creationTime) && this.id == mistakeCollectionResp.id;
    }

    @Nullable
    public final String getCreationTime() {
        return this.creationTime;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final int getId() {
        return this.id;
    }

    public final int getItemCount() {
        return this.itemCount;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iM902c = AbstractC0584a.m902c(this.itemCount, AbstractC0584a.m903d(this.name.hashCode() * 31, 31, this.description), 31);
        String str = this.creationTime;
        return Integer.hashCode(this.id) + ((iM902c + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.description;
        int i = this.itemCount;
        String str3 = this.creationTime;
        int i8 = this.id;
        StringBuilder sbM101z = AbstractC0037f.m101z("MistakeCollectionResp(name=", str, ", description=", str2, ", itemCount=");
        sbM101z.append(i);
        sbM101z.append(", creationTime=");
        sbM101z.append(str3);
        sbM101z.append(", id=");
        return AbstractC0037f.m90o(sbM101z, ")", i8);
    }

    public MistakeCollectionResp(@NotNull String name, @NotNull String description, int i, @Nullable String str, int i8) {
        AbstractC5830k.m5330g(name, "name");
        AbstractC5830k.m5330g(description, "description");
        this.name = name;
        this.description = description;
        this.itemCount = i;
        this.creationTime = str;
        this.id = i8;
    }

    public /* synthetic */ MistakeCollectionResp(String str, String str2, int i, String str3, int i8, int i9, AbstractC5824e abstractC5824e) {
        this((i9 & 1) != 0 ? "" : str, (i9 & 2) != 0 ? "" : str2, (i9 & 4) != 0 ? 0 : i, (i9 & 8) != 0 ? null : str3, (i9 & 16) != 0 ? 0 : i8);
    }
}
