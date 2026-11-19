package com.zykj.mistake.main;

import androidx.collection.AbstractC0584a;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.main.a1 */
/* loaded from: classes3.dex */
public final class C5021a1 {

    /* renamed from: a */
    public final TagEditorTarget f7828a;

    /* renamed from: b */
    public final List f7829b;

    /* renamed from: c */
    public final List f7830c;

    /* renamed from: d */
    public final C5019a f7831d;

    public C5021a1(TagEditorTarget target, List customTags, List initialDisplayTags, C5019a c5019a) {
        AbstractC5830k.m5330g(target, "target");
        AbstractC5830k.m5330g(customTags, "customTags");
        AbstractC5830k.m5330g(initialDisplayTags, "initialDisplayTags");
        this.f7828a = target;
        this.f7829b = customTags;
        this.f7830c = initialDisplayTags;
        this.f7831d = c5019a;
    }

    /* renamed from: a */
    public static C5021a1 m4360a(C5021a1 c5021a1, List customTags, C5019a c5019a, int i) {
        TagEditorTarget target = c5021a1.f7828a;
        if ((i & 2) != 0) {
            customTags = c5021a1.f7829b;
        }
        List initialDisplayTags = c5021a1.f7830c;
        c5021a1.getClass();
        AbstractC5830k.m5330g(target, "target");
        AbstractC5830k.m5330g(customTags, "customTags");
        AbstractC5830k.m5330g(initialDisplayTags, "initialDisplayTags");
        return new C5021a1(target, customTags, initialDisplayTags, c5019a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5021a1)) {
            return false;
        }
        C5021a1 c5021a1 = (C5021a1) obj;
        return this.f7828a == c5021a1.f7828a && AbstractC5830k.m5325b(this.f7829b, c5021a1.f7829b) && AbstractC5830k.m5325b(this.f7830c, c5021a1.f7830c) && AbstractC5830k.m5325b(this.f7831d, c5021a1.f7831d);
    }

    public final int hashCode() {
        int iM907h = AbstractC0584a.m907h(this.f7830c, AbstractC0584a.m907h(this.f7829b, this.f7828a.hashCode() * 31, 31), 31);
        C5019a c5019a = this.f7831d;
        return iM907h + (c5019a == null ? 0 : c5019a.hashCode());
    }

    public final String toString() {
        return "TagEditorState(target=" + this.f7828a + ", customTags=" + this.f7829b + ", initialDisplayTags=" + this.f7830c + ", nameDialog=" + this.f7831d + ")";
    }

    public C5021a1(TagEditorTarget tagEditorTarget, List list, List list2, int i) {
        this(tagEditorTarget, list, (i & 4) != 0 ? EmptyList.INSTANCE : list2, (C5019a) null);
    }
}
