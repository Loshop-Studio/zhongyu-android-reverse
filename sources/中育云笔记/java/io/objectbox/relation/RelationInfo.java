package io.objectbox.relation;

import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToManyGetter;
import io.objectbox.internal.ToOneGetter;
import java.io.Serializable;

/* loaded from: classes6.dex */
public class RelationInfo<SOURCE, TARGET> implements Serializable {

    /* renamed from: c */
    public final EntityInfo f22311c;

    /* renamed from: d */
    public final EntityInfo f22312d;

    /* renamed from: e */
    public final Property f22313e;

    /* renamed from: f */
    public final int f22314f;

    /* renamed from: g */
    public final ToOneGetter f22315g;

    /* renamed from: h */
    public final ToManyGetter f22316h;

    /* renamed from: i */
    public final ToOneGetter f22317i;

    /* renamed from: j */
    public final ToManyGetter f22318j;

    /* renamed from: k */
    public final int f22319k;

    public RelationInfo(EntityInfo entityInfo, EntityInfo entityInfo2, Property property, ToOneGetter toOneGetter) {
        this.f22311c = entityInfo;
        this.f22312d = entityInfo2;
        this.f22313e = property;
        this.f22315g = toOneGetter;
        this.f22314f = 0;
        this.f22317i = null;
        this.f22318j = null;
        this.f22316h = null;
        this.f22319k = 0;
    }

    public String toString() {
        return "RelationInfo from " + this.f22311c.mo13994j() + " to " + this.f22312d.mo13994j();
    }

    public RelationInfo(EntityInfo entityInfo, EntityInfo entityInfo2, ToManyGetter toManyGetter, Property property, ToOneGetter toOneGetter) {
        this.f22311c = entityInfo;
        this.f22312d = entityInfo2;
        this.f22313e = property;
        this.f22316h = toManyGetter;
        this.f22317i = toOneGetter;
        this.f22314f = 0;
        this.f22315g = null;
        this.f22318j = null;
        this.f22319k = 0;
    }

    public RelationInfo(EntityInfo entityInfo, EntityInfo entityInfo2, ToManyGetter toManyGetter, int i10) {
        this.f22311c = entityInfo;
        this.f22312d = entityInfo2;
        this.f22316h = toManyGetter;
        this.f22319k = i10;
        this.f22314f = 0;
        this.f22313e = null;
        this.f22315g = null;
        this.f22317i = null;
        this.f22318j = null;
    }
}
