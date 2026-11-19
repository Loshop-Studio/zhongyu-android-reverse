package com.zykj.mistake.main;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import com.zykj.mistake.platform.picker.CollectionDatePickerTarget;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.main.d0 */
/* loaded from: classes3.dex */
public final class C5029d0 extends AbstractC5057l {

    /* renamed from: a */
    public final CollectionDatePickerTarget f7839a;

    /* renamed from: b */
    public final String f7840b;

    /* renamed from: c */
    public final String f7841c;

    public C5029d0(CollectionDatePickerTarget target, String startTime, String endTime) {
        AbstractC5830k.m5330g(target, "target");
        AbstractC5830k.m5330g(startTime, "startTime");
        AbstractC5830k.m5330g(endTime, "endTime");
        this.f7839a = target;
        this.f7840b = startTime;
        this.f7841c = endTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5029d0)) {
            return false;
        }
        C5029d0 c5029d0 = (C5029d0) obj;
        return this.f7839a == c5029d0.f7839a && AbstractC5830k.m5325b(this.f7840b, c5029d0.f7840b) && AbstractC5830k.m5325b(this.f7841c, c5029d0.f7841c);
    }

    public final int hashCode() {
        return this.f7841c.hashCode() + AbstractC0584a.m903d(this.f7839a.hashCode() * 31, 31, this.f7840b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfirmCollectionCustomTime(target=");
        sb.append(this.f7839a);
        sb.append(", startTime=");
        sb.append(this.f7840b);
        sb.append(", endTime=");
        return AbstractC0037f.m91p(sb, this.f7841c, ")");
    }
}
