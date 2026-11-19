package com.zykj.mistake.feature.notebook.detail;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.o1 */
/* loaded from: classes3.dex */
public final class C4847o1 extends AbstractC4813i3 {

    /* renamed from: a */
    public final long f7224a;

    /* renamed from: b */
    public final String f7225b;

    /* renamed from: c */
    public final String f7226c;

    /* renamed from: d */
    public final List f7227d;

    /* renamed from: e */
    public final String f7228e;

    public C4847o1(long j7, String subject, String title, String str, List tags) {
        AbstractC5830k.m5330g(subject, "subject");
        AbstractC5830k.m5330g(title, "title");
        AbstractC5830k.m5330g(tags, "tags");
        this.f7224a = j7;
        this.f7225b = subject;
        this.f7226c = title;
        this.f7227d = tags;
        this.f7228e = str;
    }

    /* renamed from: a */
    public final String m4220a() {
        return this.f7228e;
    }

    /* renamed from: b */
    public final String m4221b() {
        return this.f7225b;
    }

    /* renamed from: c */
    public final List m4222c() {
        return this.f7227d;
    }

    /* renamed from: d */
    public final String m4223d() {
        return this.f7226c;
    }

    /* renamed from: e */
    public final long m4224e() {
        return this.f7224a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4847o1)) {
            return false;
        }
        C4847o1 c4847o1 = (C4847o1) obj;
        return this.f7224a == c4847o1.f7224a && AbstractC5830k.m5325b(this.f7225b, c4847o1.f7225b) && AbstractC5830k.m5325b(this.f7226c, c4847o1.f7226c) && AbstractC5830k.m5325b(this.f7227d, c4847o1.f7227d) && AbstractC5830k.m5325b(this.f7228e, c4847o1.f7228e);
    }

    public final int hashCode() {
        int iM907h = AbstractC0584a.m907h(this.f7227d, AbstractC0584a.m903d(AbstractC0584a.m903d(Long.hashCode(this.f7224a) * 31, 31, this.f7225b), 31, this.f7226c), 31);
        String str = this.f7228e;
        return iM907h + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApplyEditedMistake(topicId=");
        sb.append(this.f7224a);
        sb.append(", subject=");
        sb.append(this.f7225b);
        sb.append(", title=");
        sb.append(this.f7226c);
        sb.append(", tags=");
        sb.append(this.f7227d);
        return AbstractC0037f.m92q(sb, ", stemShoot=", this.f7228e, ")");
    }
}
