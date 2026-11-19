package com.zykj.mistake.feature.collection.detail;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.collection.detail.f0 */
/* loaded from: classes3.dex */
public final class C4591f0 extends AbstractC4630y0 {

    /* renamed from: a */
    public final String f6477a;

    /* renamed from: b */
    public final String f6478b;

    /* renamed from: c */
    public final int f6479c;

    /* renamed from: d */
    public final MistakeCollectionDetailContract$EntryMode f6480d;

    public C4591f0(String collectionId, String title, int i, MistakeCollectionDetailContract$EntryMode entryMode) {
        AbstractC5830k.m5330g(collectionId, "collectionId");
        AbstractC5830k.m5330g(title, "title");
        AbstractC5830k.m5330g(entryMode, "entryMode");
        this.f6477a = collectionId;
        this.f6478b = title;
        this.f6479c = i;
        this.f6480d = entryMode;
    }

    /* renamed from: a */
    public final MistakeCollectionDetailContract$EntryMode m4037a() {
        return this.f6480d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4591f0)) {
            return false;
        }
        C4591f0 c4591f0 = (C4591f0) obj;
        return AbstractC5830k.m5325b(this.f6477a, c4591f0.f6477a) && AbstractC5830k.m5325b(this.f6478b, c4591f0.f6478b) && this.f6479c == c4591f0.f6479c && this.f6480d == c4591f0.f6480d;
    }

    public final int hashCode() {
        return this.f6480d.hashCode() + AbstractC0584a.m902c(this.f6479c, AbstractC0584a.m903d(this.f6477a.hashCode() * 31, 31, this.f6478b), 31);
    }

    public final String toString() {
        StringBuilder sbM101z = AbstractC0037f.m101z("Init(collectionId=", this.f6477a, ", title=", this.f6478b, ", currentCount=");
        sbM101z.append(this.f6479c);
        sbM101z.append(", entryMode=");
        sbM101z.append(this.f6480d);
        sbM101z.append(")");
        return sbM101z.toString();
    }
}
