package io.objectbox.relation;

import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToManyGetter;
import io.objectbox.internal.ToOneGetter;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class RelationInfo<SOURCE, TARGET> implements Serializable {

    /* renamed from: a */
    public final EntityInfo f13238a;

    /* renamed from: b */
    public final EntityInfo f13239b;

    /* renamed from: c */
    public final Property f13240c;

    /* renamed from: d */
    public final int f13241d;

    /* renamed from: e */
    public final ToOneGetter f13242e;

    /* renamed from: f */
    public final ToManyGetter f13243f;

    /* renamed from: g */
    public final ToOneGetter f13244g;

    /* renamed from: h */
    public final ToManyGetter f13245h;

    /* renamed from: i */
    public final int f13246i;

    public RelationInfo(EntityInfo entityInfo, EntityInfo entityInfo2, Property property, ToOneGetter toOneGetter) {
        this.f13238a = entityInfo;
        this.f13239b = entityInfo2;
        this.f13240c = property;
        this.f13242e = toOneGetter;
        this.f13241d = 0;
        this.f13244g = null;
        this.f13245h = null;
        this.f13243f = null;
        this.f13246i = 0;
    }

    public String toString() {
        return "RelationInfo from " + this.f13238a.mo6271e() + " to " + this.f13239b.mo6271e();
    }

    public RelationInfo(EntityInfo entityInfo, EntityInfo entityInfo2, ToManyGetter toManyGetter, Property property, ToOneGetter toOneGetter) {
        this.f13238a = entityInfo;
        this.f13239b = entityInfo2;
        this.f13240c = property;
        this.f13243f = toManyGetter;
        this.f13244g = toOneGetter;
        this.f13241d = 0;
        this.f13242e = null;
        this.f13245h = null;
        this.f13246i = 0;
    }

    public RelationInfo(EntityInfo entityInfo, EntityInfo entityInfo2, ToManyGetter toManyGetter, int i10) {
        this.f13238a = entityInfo;
        this.f13239b = entityInfo2;
        this.f13243f = toManyGetter;
        this.f13246i = i10;
        this.f13241d = 0;
        this.f13240c = null;
        this.f13242e = null;
        this.f13244g = null;
        this.f13245h = null;
    }
}
