package com.tencent.bugly.proguard;

import java.io.Serializable;

/* renamed from: com.tencent.bugly.proguard.m */
/* loaded from: classes4.dex */
public abstract class AbstractC6722m implements Serializable {
    /* renamed from: a */
    public abstract void mo5314a(C6720k c6720k);

    /* renamed from: a */
    public abstract void mo5315a(C6721l c6721l);

    /* renamed from: a */
    public abstract void mo5316a(StringBuilder sb, int i9);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        mo5316a(sb, 0);
        return sb.toString();
    }
}
