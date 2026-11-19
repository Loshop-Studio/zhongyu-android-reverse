package com.zykj.study.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class AttachmentExtraInput {
    public static final int $stable = 0;
    private final long attachmentId;
    private final String url;

    public AttachmentExtraInput(long j10, String url) {
        AbstractC9133u.m16133g(url, "url");
        this.attachmentId = j10;
        this.url = url;
    }

    public static /* synthetic */ AttachmentExtraInput copy$default(AttachmentExtraInput attachmentExtraInput, long j10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = attachmentExtraInput.attachmentId;
        }
        if ((i10 & 2) != 0) {
            str = attachmentExtraInput.url;
        }
        return attachmentExtraInput.copy(j10, str);
    }

    public final long component1() {
        return this.attachmentId;
    }

    public final String component2() {
        return this.url;
    }

    public final AttachmentExtraInput copy(long j10, String url) {
        AbstractC9133u.m16133g(url, "url");
        return new AttachmentExtraInput(j10, url);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachmentExtraInput)) {
            return false;
        }
        AttachmentExtraInput attachmentExtraInput = (AttachmentExtraInput) obj;
        return this.attachmentId == attachmentExtraInput.attachmentId && AbstractC9133u.m16128b(this.url, attachmentExtraInput.url);
    }

    public final long getAttachmentId() {
        return this.attachmentId;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (Long.hashCode(this.attachmentId) * 31) + this.url.hashCode();
    }

    public String toString() {
        return "AttachmentExtraInput(attachmentId=" + this.attachmentId + ", url=" + this.url + ")";
    }
}
