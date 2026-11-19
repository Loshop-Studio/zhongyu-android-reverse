package io.objectbox;

import io.objectbox.exception.DbException;
import java.io.Serializable;

/* loaded from: classes6.dex */
public class Property<ENTITY> implements Serializable {

    /* renamed from: c */
    public final EntityInfo f22263c;

    /* renamed from: d */
    public final int f22264d;

    /* renamed from: e */
    public final int f22265e;

    /* renamed from: f */
    public final Class f22266f;

    /* renamed from: g */
    public final String f22267g;

    /* renamed from: h */
    public final boolean f22268h;

    /* renamed from: i */
    public final boolean f22269i;

    /* renamed from: j */
    public final String f22270j;

    /* renamed from: k */
    public final Class f22271k;

    /* renamed from: l */
    public final Class f22272l;

    /* renamed from: m */
    public boolean f22273m;

    public Property(EntityInfo entityInfo, int i10, int i11, Class cls, String str) {
        this(entityInfo, i10, i11, cls, str, false, str, null, null);
    }

    /* renamed from: a */
    public int m18981a() {
        int i10 = this.f22265e;
        if (i10 > 0) {
            return i10;
        }
        throw new IllegalStateException("Illegal property ID " + this.f22265e + " for " + toString());
    }

    /* renamed from: c */
    public boolean m18982c() {
        return this.f22273m;
    }

    /* renamed from: d */
    public void m18983d(int i10) {
        int i11 = this.f22265e;
        if (i11 <= 0) {
            throw new IllegalStateException("Illegal property ID " + this.f22265e + " for " + toString());
        }
        if (i11 == i10) {
            this.f22273m = true;
            return;
        }
        throw new DbException(toString() + " does not match ID in DB: " + i10);
    }

    public String toString() {
        return "Property \"" + this.f22267g + "\" (ID: " + this.f22265e + ")";
    }

    public Property(EntityInfo entityInfo, int i10, int i11, Class cls, String str, boolean z10) {
        this(entityInfo, i10, i11, cls, str, false, z10, str, null, null);
    }

    public Property(EntityInfo entityInfo, int i10, int i11, Class cls, String str, boolean z10, String str2) {
        this(entityInfo, i10, i11, cls, str, z10, str2, null, null);
    }

    public Property(EntityInfo entityInfo, int i10, int i11, Class cls, String str, boolean z10, String str2, Class cls2, Class cls3) {
        this(entityInfo, i10, i11, cls, str, z10, false, str2, cls2, cls3);
    }

    public Property(EntityInfo entityInfo, int i10, int i11, Class cls, String str, boolean z10, boolean z11, String str2, Class cls2, Class cls3) {
        this.f22263c = entityInfo;
        this.f22264d = i10;
        this.f22265e = i11;
        this.f22266f = cls;
        this.f22267g = str;
        this.f22268h = z10;
        this.f22269i = z11;
        this.f22270j = str2;
        this.f22271k = cls2;
        this.f22272l = cls3;
    }
}
