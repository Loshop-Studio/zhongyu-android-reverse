package com.zykj.study.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class AttachmentIdInput {
    public static final int $stable = 0;
    private final String courseId;
    private final String name;
    private final String type;
    private final String url;

    public AttachmentIdInput(String type, String str, String url, String str2) {
        AbstractC9133u.m16133g(type, "type");
        AbstractC9133u.m16133g(url, "url");
        this.type = type;
        this.name = str;
        this.url = url;
        this.courseId = str2;
    }

    public static /* synthetic */ AttachmentIdInput copy$default(AttachmentIdInput attachmentIdInput, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = attachmentIdInput.type;
        }
        if ((i10 & 2) != 0) {
            str2 = attachmentIdInput.name;
        }
        if ((i10 & 4) != 0) {
            str3 = attachmentIdInput.url;
        }
        if ((i10 & 8) != 0) {
            str4 = attachmentIdInput.courseId;
        }
        return attachmentIdInput.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.url;
    }

    public final String component4() {
        return this.courseId;
    }

    public final AttachmentIdInput copy(String type, String str, String url, String str2) {
        AbstractC9133u.m16133g(type, "type");
        AbstractC9133u.m16133g(url, "url");
        return new AttachmentIdInput(type, str, url, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachmentIdInput)) {
            return false;
        }
        AttachmentIdInput attachmentIdInput = (AttachmentIdInput) obj;
        return AbstractC9133u.m16128b(this.type, attachmentIdInput.type) && AbstractC9133u.m16128b(this.name, attachmentIdInput.name) && AbstractC9133u.m16128b(this.url, attachmentIdInput.url) && AbstractC9133u.m16128b(this.courseId, attachmentIdInput.courseId);
    }

    public final String getCourseId() {
        return this.courseId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.name;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.url.hashCode()) * 31;
        String str2 = this.courseId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "AttachmentIdInput(type=" + this.type + ", name=" + this.name + ", url=" + this.url + ", courseId=" + this.courseId + ")";
    }

    public /* synthetic */ AttachmentIdInput(String str, String str2, String str3, String str4, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? "zip" : str, (i10 & 2) != 0 ? null : str2, str3, (i10 & 8) != 0 ? null : str4);
    }
}
