package com.tencent.bugly.proguard;

import java.io.Serializable;

/* renamed from: com.tencent.bugly.proguard.m */
/* loaded from: classes3.dex */
public abstract class AbstractC5839m implements Serializable {
    /* renamed from: a */
    public abstract void mo4140a(C5837k c5837k);

    /* renamed from: a */
    public abstract void mo4141a(C5838l c5838l);

    /* renamed from: a */
    public abstract void mo4142a(StringBuilder sb, int i6);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        mo4142a(sb, 0);
        return sb.toString();
    }
}
