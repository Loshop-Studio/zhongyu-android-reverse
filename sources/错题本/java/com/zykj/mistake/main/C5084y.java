package com.zykj.mistake.main;

import androidx.collection.AbstractC0584a;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.main.y */
/* loaded from: classes3.dex */
public final class C5084y extends AbstractC5020a0 {

    /* renamed from: a */
    public final TagEditorTarget f7974a;

    /* renamed from: b */
    public final String f7975b;

    /* renamed from: c */
    public final String f7976c;

    /* renamed from: d */
    public final long f7977d;

    public C5084y(TagEditorTarget target, String oldName, String newName, long j7) {
        AbstractC5830k.m5330g(target, "target");
        AbstractC5830k.m5330g(oldName, "oldName");
        AbstractC5830k.m5330g(newName, "newName");
        this.f7974a = target;
        this.f7975b = oldName;
        this.f7976c = newName;
        this.f7977d = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5084y)) {
            return false;
        }
        C5084y c5084y = (C5084y) obj;
        return this.f7974a == c5084y.f7974a && AbstractC5830k.m5325b(this.f7975b, c5084y.f7975b) && AbstractC5830k.m5325b(this.f7976c, c5084y.f7976c) && this.f7977d == c5084y.f7977d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7977d) + AbstractC0584a.m903d(AbstractC0584a.m903d(this.f7974a.hashCode() * 31, 31, this.f7975b), 31, this.f7976c);
    }

    public final String toString() {
        return "EditCustomTag(target=" + this.f7974a + ", oldName=" + this.f7975b + ", newName=" + this.f7976c + ", id=" + this.f7977d + ")";
    }
}
