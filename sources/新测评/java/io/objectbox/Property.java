package io.objectbox;

import io.objectbox.exception.DbException;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class Property<ENTITY> implements Serializable {

    /* renamed from: a */
    public final EntityInfo f13190a;

    /* renamed from: b */
    public final int f13191b;

    /* renamed from: c */
    public final int f13192c;

    /* renamed from: d */
    public final Class f13193d;

    /* renamed from: e */
    public final String f13194e;

    /* renamed from: f */
    public final boolean f13195f;

    /* renamed from: g */
    public final boolean f13196g;

    /* renamed from: h */
    public final String f13197h;

    /* renamed from: i */
    public final Class f13198i;

    /* renamed from: j */
    public final Class f13199j;

    /* renamed from: k */
    public boolean f13200k;

    public Property(EntityInfo entityInfo, int i10, int i11, Class cls, String str) {
        this(entityInfo, i10, i11, cls, str, false, str, null, null);
    }

    /* renamed from: a */
    public int m13008a() {
        int i10 = this.f13192c;
        if (i10 > 0) {
            return i10;
        }
        throw new IllegalStateException("Illegal property ID " + this.f13192c + " for " + toString());
    }

    /* renamed from: f */
    public boolean m13009f() {
        return this.f13200k;
    }

    /* renamed from: j */
    public void m13010j(int i10) {
        int i11 = this.f13192c;
        if (i11 <= 0) {
            throw new IllegalStateException("Illegal property ID " + this.f13192c + " for " + toString());
        }
        if (i11 == i10) {
            this.f13200k = true;
            return;
        }
        throw new DbException(toString() + " does not match ID in DB: " + i10);
    }

    public String toString() {
        return "Property \"" + this.f13194e + "\" (ID: " + this.f13192c + ")";
    }

    public Property(EntityInfo entityInfo, int i10, int i11, Class cls, String str, boolean z9) {
        this(entityInfo, i10, i11, cls, str, false, z9, str, null, null);
    }

    public Property(EntityInfo entityInfo, int i10, int i11, Class cls, String str, boolean z9, String str2) {
        this(entityInfo, i10, i11, cls, str, z9, str2, null, null);
    }

    public Property(EntityInfo entityInfo, int i10, int i11, Class cls, String str, boolean z9, String str2, Class cls2, Class cls3) {
        this(entityInfo, i10, i11, cls, str, z9, false, str2, cls2, cls3);
    }

    public Property(EntityInfo entityInfo, int i10, int i11, Class cls, String str, boolean z9, boolean z10, String str2, Class cls2, Class cls3) {
        this.f13190a = entityInfo;
        this.f13191b = i10;
        this.f13192c = i11;
        this.f13193d = cls;
        this.f13194e = str;
        this.f13195f = z9;
        this.f13196g = z10;
        this.f13197h = str2;
        this.f13198i = cls2;
        this.f13199j = cls3;
    }
}
