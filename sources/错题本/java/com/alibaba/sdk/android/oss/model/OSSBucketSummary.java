package com.alibaba.sdk.android.oss.model;

import android.support.v4.media.AbstractC0037f;
import java.util.Date;

/* loaded from: classes2.dex */
public class OSSBucketSummary {
    private CannedAccessControlList acl;
    public Date createDate;
    public String extranetEndpoint;
    public String intranetEndpoint;
    public String location;
    public String name;
    public Owner owner;
    public String storageClass;

    public String getAcl() {
        CannedAccessControlList cannedAccessControlList = this.acl;
        if (cannedAccessControlList != null) {
            return cannedAccessControlList.toString();
        }
        return null;
    }

    public void setAcl(String str) {
        this.acl = CannedAccessControlList.parseACL(str);
    }

    public String toString() {
        if (this.storageClass == null) {
            StringBuilder sb = new StringBuilder("OSSBucket [name=");
            sb.append(this.name);
            sb.append(", creationDate=");
            sb.append(this.createDate);
            sb.append(", owner=");
            sb.append(this.owner.toString());
            sb.append(", location=");
            return AbstractC0037f.m91p(sb, this.location, "]");
        }
        StringBuilder sb2 = new StringBuilder("OSSBucket [name=");
        sb2.append(this.name);
        sb2.append(", creationDate=");
        sb2.append(this.createDate);
        sb2.append(", owner=");
        sb2.append(this.owner.toString());
        sb2.append(", location=");
        sb2.append(this.location);
        sb2.append(", storageClass=");
        return AbstractC0037f.m91p(sb2, this.storageClass, "]");
    }
}
