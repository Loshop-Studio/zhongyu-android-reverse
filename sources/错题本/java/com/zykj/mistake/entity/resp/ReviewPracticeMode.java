package com.zykj.mistake.entity.resp;

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
@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/ReviewPracticeMode;", "", "mode", "", HintConstants.AUTOFILL_HINT_NAME, "", "description", "count", "canPractice", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;IZ)V", "getMode", "()I", "getName", "()Ljava/lang/String;", "getDescription", "getCount", "getCanPractice", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class ReviewPracticeMode {
    public static final int $stable = 0;
    private final boolean canPractice;
    private final int count;

    @NotNull
    private final String description;
    private final int mode;

    @NotNull
    private final String name;

    public ReviewPracticeMode() {
        this(0, null, null, 0, false, 31, null);
    }

    public static /* synthetic */ ReviewPracticeMode copy$default(ReviewPracticeMode reviewPracticeMode, int i, String str, String str2, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i = reviewPracticeMode.mode;
        }
        if ((i9 & 2) != 0) {
            str = reviewPracticeMode.name;
        }
        if ((i9 & 4) != 0) {
            str2 = reviewPracticeMode.description;
        }
        if ((i9 & 8) != 0) {
            i8 = reviewPracticeMode.count;
        }
        if ((i9 & 16) != 0) {
            z8 = reviewPracticeMode.canPractice;
        }
        boolean z9 = z8;
        String str3 = str2;
        return reviewPracticeMode.copy(i, str, str3, i8, z9);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getCanPractice() {
        return this.canPractice;
    }

    @NotNull
    public final ReviewPracticeMode copy(int mode, @NotNull String name, @NotNull String description, int count, boolean canPractice) {
        AbstractC5830k.m5330g(name, "name");
        AbstractC5830k.m5330g(description, "description");
        return new ReviewPracticeMode(mode, name, description, count, canPractice);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewPracticeMode)) {
            return false;
        }
        ReviewPracticeMode reviewPracticeMode = (ReviewPracticeMode) other;
        return this.mode == reviewPracticeMode.mode && AbstractC5830k.m5325b(this.name, reviewPracticeMode.name) && AbstractC5830k.m5325b(this.description, reviewPracticeMode.description) && this.count == reviewPracticeMode.count && this.canPractice == reviewPracticeMode.canPractice;
    }

    public final boolean getCanPractice() {
        return this.canPractice;
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final int getMode() {
        return this.mode;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return Boolean.hashCode(this.canPractice) + AbstractC0584a.m902c(this.count, AbstractC0584a.m903d(AbstractC0584a.m903d(Integer.hashCode(this.mode) * 31, 31, this.name), 31, this.description), 31);
    }

    @NotNull
    public String toString() {
        return "ReviewPracticeMode(mode=" + this.mode + ", name=" + this.name + ", description=" + this.description + ", count=" + this.count + ", canPractice=" + this.canPractice + ")";
    }

    public ReviewPracticeMode(int i, @NotNull String name, @NotNull String description, int i8, boolean z8) {
        AbstractC5830k.m5330g(name, "name");
        AbstractC5830k.m5330g(description, "description");
        this.mode = i;
        this.name = name;
        this.description = description;
        this.count = i8;
        this.canPractice = z8;
    }

    public /* synthetic */ ReviewPracticeMode(int i, String str, String str2, int i8, boolean z8, int i9, AbstractC5824e abstractC5824e) {
        this((i9 & 1) != 0 ? 0 : i, (i9 & 2) != 0 ? "" : str, (i9 & 4) != 0 ? "" : str2, (i9 & 8) != 0 ? 0 : i8, (i9 & 16) != 0 ? false : z8);
    }
}
