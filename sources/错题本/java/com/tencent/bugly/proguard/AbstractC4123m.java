package com.tencent.bugly.proguard;

import java.io.Serializable;

/* renamed from: com.tencent.bugly.proguard.m */
/* loaded from: classes3.dex */
public abstract class AbstractC4123m implements Serializable {
    /* renamed from: a */
    public abstract void mo3232a(C4119k c4119k);

    /* renamed from: a */
    public abstract void mo3233a(C4121l c4121l);

    /* renamed from: a */
    public abstract void mo3234a(StringBuilder sb, int i);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        mo3234a(sb, 0);
        return sb.toString();
    }
}
