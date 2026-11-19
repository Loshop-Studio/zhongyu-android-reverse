package com.zykj.mistake.feature.collection.list;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailContract$EntryMode;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.collection.list.d */
/* loaded from: classes3.dex */
public final class C4705d extends AbstractC4708g {

    /* renamed from: a */
    public final String f6755a;

    /* renamed from: b */
    public final String f6756b;

    /* renamed from: c */
    public final int f6757c;

    /* renamed from: d */
    public final MistakeCollectionDetailContract$EntryMode f6758d;

    public C4705d(String collectionId, String title, int i, MistakeCollectionDetailContract$EntryMode entryMode) {
        AbstractC5830k.m5330g(collectionId, "collectionId");
        AbstractC5830k.m5330g(title, "title");
        AbstractC5830k.m5330g(entryMode, "entryMode");
        this.f6755a = collectionId;
        this.f6756b = title;
        this.f6757c = i;
        this.f6758d = entryMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4705d)) {
            return false;
        }
        C4705d c4705d = (C4705d) obj;
        return AbstractC5830k.m5325b(this.f6755a, c4705d.f6755a) && AbstractC5830k.m5325b(this.f6756b, c4705d.f6756b) && this.f6757c == c4705d.f6757c && this.f6758d == c4705d.f6758d;
    }

    public final int hashCode() {
        return this.f6758d.hashCode() + AbstractC0584a.m902c(this.f6757c, AbstractC0584a.m903d(this.f6755a.hashCode() * 31, 31, this.f6756b), 31);
    }

    public final String toString() {
        StringBuilder sbM101z = AbstractC0037f.m101z("OpenDetail(collectionId=", this.f6755a, ", title=", this.f6756b, ", count=");
        sbM101z.append(this.f6757c);
        sbM101z.append(", entryMode=");
        sbM101z.append(this.f6758d);
        sbM101z.append(")");
        return sbM101z.toString();
    }
}
