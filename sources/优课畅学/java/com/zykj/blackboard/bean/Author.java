package com.zykj.blackboard.bean;

import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class Author {
    private String authorId;
    private String authorName;
    private String schoolId;

    public Author() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Author copy$default(Author author, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = author.authorName;
        }
        if ((i10 & 2) != 0) {
            str2 = author.authorId;
        }
        if ((i10 & 4) != 0) {
            str3 = author.schoolId;
        }
        return author.copy(str, str2, str3);
    }

    public final String component1() {
        return this.authorName;
    }

    public final String component2() {
        return this.authorId;
    }

    public final String component3() {
        return this.schoolId;
    }

    public final Author copy(String authorName, String authorId, String schoolId) {
        AbstractC9133u.m16133g(authorName, "authorName");
        AbstractC9133u.m16133g(authorId, "authorId");
        AbstractC9133u.m16133g(schoolId, "schoolId");
        return new Author(authorName, authorId, schoolId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Author)) {
            return false;
        }
        Author author = (Author) obj;
        return AbstractC9133u.m16128b(this.authorName, author.authorName) && AbstractC9133u.m16128b(this.authorId, author.authorId) && AbstractC9133u.m16128b(this.schoolId, author.schoolId);
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final String getAuthorName() {
        return this.authorName;
    }

    public final String getSchoolId() {
        return this.schoolId;
    }

    public int hashCode() {
        return (((this.authorName.hashCode() * 31) + this.authorId.hashCode()) * 31) + this.schoolId.hashCode();
    }

    public final void setAuthorId(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.authorId = str;
    }

    public final void setAuthorName(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.authorName = str;
    }

    public final void setSchoolId(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.schoolId = str;
    }

    public String toString() {
        return "Author(authorName=" + this.authorName + ", authorId=" + this.authorId + ", schoolId=" + this.schoolId + ')';
    }

    public Author(String authorName, String authorId, String schoolId) {
        AbstractC9133u.m16133g(authorName, "authorName");
        AbstractC9133u.m16133g(authorId, "authorId");
        AbstractC9133u.m16133g(schoolId, "schoolId");
        this.authorName = authorName;
        this.authorId = authorId;
        this.schoolId = schoolId;
    }

    public /* synthetic */ Author(String str, String str2, String str3, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3);
    }
}
