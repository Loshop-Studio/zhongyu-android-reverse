package com.zykj.study.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import p134i7.AbstractC8778f0;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class ChoiceList extends ArrayList<String> {
    /* renamed from: c */
    public /* bridge */ int m11871c() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return contains((String) obj);
        }
        return false;
    }

    /* renamed from: e */
    public /* bridge */ int m11872e(String str) {
        return super.indexOf(str);
    }

    /* renamed from: g */
    public /* bridge */ int m11873g(String str) {
        return super.lastIndexOf(str);
    }

    /* renamed from: h */
    public /* bridge */ boolean m11874h(String str) {
        return super.remove(str);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return m11872e((String) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return m11873g((String) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof String) {
            return m11874h((String) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return m11871c();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return AbstractC8778f0.m14576v0(this, ",", null, null, 0, null, null, 62, null);
    }

    public /* bridge */ boolean contains(String str) {
        return super.contains((Object) str);
    }
}
