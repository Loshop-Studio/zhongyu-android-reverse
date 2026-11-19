package com.zykj.mistake.main;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import com.zykj.mistake.platform.picker.CollectionDatePickerTarget;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.main.q */
/* loaded from: classes3.dex */
public final class C5068q extends AbstractC5020a0 {

    /* renamed from: a */
    public final CollectionDatePickerTarget f7953a;

    /* renamed from: b */
    public final String f7954b;

    /* renamed from: c */
    public final String f7955c;

    public C5068q(CollectionDatePickerTarget target, String startTime, String endTime) {
        AbstractC5830k.m5330g(target, "target");
        AbstractC5830k.m5330g(startTime, "startTime");
        AbstractC5830k.m5330g(endTime, "endTime");
        this.f7953a = target;
        this.f7954b = startTime;
        this.f7955c = endTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5068q)) {
            return false;
        }
        C5068q c5068q = (C5068q) obj;
        return this.f7953a == c5068q.f7953a && AbstractC5830k.m5325b(this.f7954b, c5068q.f7954b) && AbstractC5830k.m5325b(this.f7955c, c5068q.f7955c);
    }

    public final int hashCode() {
        return this.f7955c.hashCode() + AbstractC0584a.m903d(this.f7953a.hashCode() * 31, 31, this.f7954b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionCustomTimeConfirmed(target=");
        sb.append(this.f7953a);
        sb.append(", startTime=");
        sb.append(this.f7954b);
        sb.append(", endTime=");
        return AbstractC0037f.m91p(sb, this.f7955c, ")");
    }
}
