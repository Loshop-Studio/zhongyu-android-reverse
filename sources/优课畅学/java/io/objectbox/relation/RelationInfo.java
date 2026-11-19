package io.objectbox.relation;

import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToManyGetter;
import io.objectbox.internal.ToOneGetter;
import java.io.Serializable;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public class RelationInfo<SOURCE, TARGET> implements Serializable {

    /* renamed from: a */
    public final EntityInfo f16983a;

    /* renamed from: b */
    public final EntityInfo f16984b;

    /* renamed from: c */
    public final Property f16985c;

    /* renamed from: d */
    public final int f16986d;

    /* renamed from: e */
    public final ToOneGetter f16987e;

    /* renamed from: f */
    public final ToManyGetter f16988f;

    /* renamed from: g */
    public final ToOneGetter f16989g;

    /* renamed from: h */
    public final ToManyGetter f16990h;

    /* renamed from: i */
    public final int f16991i;

    public RelationInfo(EntityInfo entityInfo, EntityInfo entityInfo2, Property property, ToOneGetter toOneGetter) {
        this.f16983a = entityInfo;
        this.f16984b = entityInfo2;
        this.f16985c = property;
        this.f16987e = toOneGetter;
        this.f16986d = 0;
        this.f16989g = null;
        this.f16990h = null;
        this.f16988f = null;
        this.f16991i = 0;
    }

    public String toString() {
        return "RelationInfo from " + this.f16983a.getEntityClass() + " to " + this.f16984b.getEntityClass();
    }

    public RelationInfo(EntityInfo entityInfo, EntityInfo entityInfo2, ToManyGetter toManyGetter, Property property, ToOneGetter toOneGetter) {
        this.f16983a = entityInfo;
        this.f16984b = entityInfo2;
        this.f16985c = property;
        this.f16988f = toManyGetter;
        this.f16989g = toOneGetter;
        this.f16986d = 0;
        this.f16987e = null;
        this.f16990h = null;
        this.f16991i = 0;
    }

    public RelationInfo(EntityInfo entityInfo, EntityInfo entityInfo2, ToManyGetter toManyGetter, int i10) {
        this.f16983a = entityInfo;
        this.f16984b = entityInfo2;
        this.f16988f = toManyGetter;
        this.f16991i = i10;
        this.f16986d = 0;
        this.f16985c = null;
        this.f16987e = null;
        this.f16989g = null;
        this.f16990h = null;
    }
}
