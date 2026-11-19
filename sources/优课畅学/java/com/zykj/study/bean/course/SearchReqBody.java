package com.zykj.study.bean.course;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class SearchReqBody {
    public static final int $stable = 0;
    private final int courseId;
    private final String param;

    public SearchReqBody(int i10, String param) {
        AbstractC9133u.m16133g(param, "param");
        this.courseId = i10;
        this.param = param;
    }

    public static /* synthetic */ SearchReqBody copy$default(SearchReqBody searchReqBody, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = searchReqBody.courseId;
        }
        if ((i11 & 2) != 0) {
            str = searchReqBody.param;
        }
        return searchReqBody.copy(i10, str);
    }

    public final int component1() {
        return this.courseId;
    }

    public final String component2() {
        return this.param;
    }

    public final SearchReqBody copy(int i10, String param) {
        AbstractC9133u.m16133g(param, "param");
        return new SearchReqBody(i10, param);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchReqBody)) {
            return false;
        }
        SearchReqBody searchReqBody = (SearchReqBody) obj;
        return this.courseId == searchReqBody.courseId && AbstractC9133u.m16128b(this.param, searchReqBody.param);
    }

    public final int getCourseId() {
        return this.courseId;
    }

    public final String getParam() {
        return this.param;
    }

    public int hashCode() {
        return (Integer.hashCode(this.courseId) * 31) + this.param.hashCode();
    }

    public String toString() {
        return "SearchReqBody(courseId=" + this.courseId + ", param=" + this.param + ")";
    }
}
