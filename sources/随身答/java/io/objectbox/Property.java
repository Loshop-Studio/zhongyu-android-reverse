package io.objectbox;

import io.objectbox.exception.DbException;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class Property<ENTITY> implements Serializable {

    /* renamed from: a */
    public final EntityInfo f14004a;

    /* renamed from: b */
    public final int f14005b;

    /* renamed from: c */
    public final int f14006c;

    /* renamed from: d */
    public final Class f14007d;

    /* renamed from: e */
    public final String f14008e;

    /* renamed from: f */
    public final boolean f14009f;

    /* renamed from: g */
    public final boolean f14010g;

    /* renamed from: h */
    public final String f14011h;

    /* renamed from: i */
    public final Class f14012i;

    /* renamed from: j */
    public final Class f14013j;

    /* renamed from: k */
    public boolean f14014k;

    public Property(EntityInfo entityInfo, int i9, int i10, Class cls, String str) {
        this(entityInfo, i9, i10, cls, str, false, str, null, null);
    }

    /* renamed from: a */
    public int m13128a() {
        int i9 = this.f14006c;
        if (i9 > 0) {
            return i9;
        }
        throw new IllegalStateException("Illegal property ID " + this.f14006c + " for " + toString());
    }

    /* renamed from: c */
    public boolean m13129c() {
        return this.f14014k;
    }

    /* renamed from: g */
    public void m13130g(int i9) {
        int i10 = this.f14006c;
        if (i10 <= 0) {
            throw new IllegalStateException("Illegal property ID " + this.f14006c + " for " + toString());
        }
        if (i10 == i9) {
            this.f14014k = true;
            return;
        }
        throw new DbException(toString() + " does not match ID in DB: " + i9);
    }

    public String toString() {
        return "Property \"" + this.f14008e + "\" (ID: " + this.f14006c + ")";
    }

    public Property(EntityInfo entityInfo, int i9, int i10, Class cls, String str, boolean z9) {
        this(entityInfo, i9, i10, cls, str, false, z9, str, null, null);
    }

    public Property(EntityInfo entityInfo, int i9, int i10, Class cls, String str, boolean z9, String str2) {
        this(entityInfo, i9, i10, cls, str, z9, str2, null, null);
    }

    public Property(EntityInfo entityInfo, int i9, int i10, Class cls, String str, boolean z9, String str2, Class cls2, Class cls3) {
        this(entityInfo, i9, i10, cls, str, z9, false, str2, cls2, cls3);
    }

    public Property(EntityInfo entityInfo, int i9, int i10, Class cls, String str, boolean z9, boolean z10, String str2, Class cls2, Class cls3) {
        this.f14004a = entityInfo;
        this.f14005b = i9;
        this.f14006c = i10;
        this.f14007d = cls;
        this.f14008e = str;
        this.f14009f = z9;
        this.f14010g = z10;
        this.f14011h = str2;
        this.f14012i = cls2;
        this.f14013j = cls3;
    }
}
