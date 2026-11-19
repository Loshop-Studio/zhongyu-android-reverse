package com.zykj.blackboard.bean;

import androidx.collection.AbstractC0584a;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, m5110d2 = {"Lcom/zykj/blackboard/bean/Author;", "", "authorName", "", "authorId", "schoolId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthorId", "()Ljava/lang/String;", "setAuthorId", "(Ljava/lang/String;)V", "getAuthorName", "setAuthorName", "getSchoolId", "setSchoolId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class Author {

    @NotNull
    private String authorId;

    @NotNull
    private String authorName;

    @NotNull
    private String schoolId;

    public Author() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Author copy$default(Author author, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = author.authorName;
        }
        if ((i & 2) != 0) {
            str2 = author.authorId;
        }
        if ((i & 4) != 0) {
            str3 = author.schoolId;
        }
        return author.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAuthorName() {
        return this.authorName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAuthorId() {
        return this.authorId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSchoolId() {
        return this.schoolId;
    }

    @NotNull
    public final Author copy(@NotNull String authorName, @NotNull String authorId, @NotNull String schoolId) {
        AbstractC5830k.m5330g(authorName, "authorName");
        AbstractC5830k.m5330g(authorId, "authorId");
        AbstractC5830k.m5330g(schoolId, "schoolId");
        return new Author(authorName, authorId, schoolId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Author)) {
            return false;
        }
        Author author = (Author) other;
        return AbstractC5830k.m5325b(this.authorName, author.authorName) && AbstractC5830k.m5325b(this.authorId, author.authorId) && AbstractC5830k.m5325b(this.schoolId, author.schoolId);
    }

    @NotNull
    public final String getAuthorId() {
        return this.authorId;
    }

    @NotNull
    public final String getAuthorName() {
        return this.authorName;
    }

    @NotNull
    public final String getSchoolId() {
        return this.schoolId;
    }

    public int hashCode() {
        return this.schoolId.hashCode() + AbstractC0584a.m903d(this.authorName.hashCode() * 31, 31, this.authorId);
    }

    public final void setAuthorId(@NotNull String str) {
        AbstractC5830k.m5330g(str, "<set-?>");
        this.authorId = str;
    }

    public final void setAuthorName(@NotNull String str) {
        AbstractC5830k.m5330g(str, "<set-?>");
        this.authorName = str;
    }

    public final void setSchoolId(@NotNull String str) {
        AbstractC5830k.m5330g(str, "<set-?>");
        this.schoolId = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Author(authorName=");
        sb.append(this.authorName);
        sb.append(", authorId=");
        sb.append(this.authorId);
        sb.append(", schoolId=");
        return AbstractC0584a.m911l(')', this.schoolId, sb);
    }

    public Author(@NotNull String authorName, @NotNull String authorId, @NotNull String schoolId) {
        AbstractC5830k.m5330g(authorName, "authorName");
        AbstractC5830k.m5330g(authorId, "authorId");
        AbstractC5830k.m5330g(schoolId, "schoolId");
        this.authorName = authorName;
        this.authorId = authorId;
        this.schoolId = schoolId;
    }

    public /* synthetic */ Author(String str, String str2, String str3, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
