package io.objectbox;

import io.objectbox.exception.DbException;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class Property<ENTITY> implements Serializable {

    /* renamed from: a */
    public final EntityInfo f16870a;

    /* renamed from: b */
    public final int f16871b;

    /* renamed from: c */
    public final int f16872c;

    /* renamed from: d */
    public final Class f16873d;

    /* renamed from: e */
    public final String f16874e;

    /* renamed from: f */
    public final boolean f16875f;

    /* renamed from: g */
    public final boolean f16876g;

    /* renamed from: h */
    public final String f16877h;

    /* renamed from: i */
    public final Class f16878i;

    /* renamed from: j */
    public final Class f16879j;

    /* renamed from: k */
    public boolean f16880k;

    public Property(EntityInfo entityInfo, int i10, int i11, Class cls, String str) {
        this(entityInfo, i10, i11, cls, str, false, str, null, null);
    }

    /* renamed from: a */
    public int m15390a() {
        int i10 = this.f16872c;
        if (i10 > 0) {
            return i10;
        }
        throw new IllegalStateException("Illegal property ID " + this.f16872c + " for " + toString());
    }

    /* renamed from: b */
    public boolean m15391b() {
        return this.f16880k;
    }

    /* renamed from: c */
    public void m15392c(int i10) {
        int i11 = this.f16872c;
        if (i11 <= 0) {
            throw new IllegalStateException("Illegal property ID " + this.f16872c + " for " + toString());
        }
        if (i11 == i10) {
            this.f16880k = true;
            return;
        }
        throw new DbException(toString() + " does not match ID in DB: " + i10);
    }

    public String toString() {
        return "Property \"" + this.f16874e + "\" (ID: " + this.f16872c + ")";
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
        this.f16870a = entityInfo;
        this.f16871b = i10;
        this.f16872c = i11;
        this.f16873d = cls;
        this.f16874e = str;
        this.f16875f = z10;
        this.f16876g = z11;
        this.f16877h = str2;
        this.f16878i = cls2;
        this.f16879j = cls3;
    }
}
