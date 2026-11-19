package io.objectbox.relation;

import io.objectbox.EntityInfo;
import io.objectbox.Property;
import io.objectbox.internal.ToManyGetter;
import io.objectbox.internal.ToOneGetter;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class RelationInfo<SOURCE, TARGET> implements Serializable {

    /* renamed from: a */
    public final EntityInfo f14052a;

    /* renamed from: b */
    public final EntityInfo f14053b;

    /* renamed from: c */
    public final Property f14054c;

    /* renamed from: d */
    public final int f14055d;

    /* renamed from: e */
    public final ToOneGetter f14056e;

    /* renamed from: f */
    public final ToManyGetter f14057f;

    /* renamed from: g */
    public final ToOneGetter f14058g;

    /* renamed from: h */
    public final ToManyGetter f14059h;

    /* renamed from: i */
    public final int f14060i;

    public RelationInfo(EntityInfo entityInfo, EntityInfo entityInfo2, Property property, ToOneGetter toOneGetter) {
        this.f14052a = entityInfo;
        this.f14053b = entityInfo2;
        this.f14054c = property;
        this.f14056e = toOneGetter;
        this.f14055d = 0;
        this.f14058g = null;
        this.f14059h = null;
        this.f14057f = null;
        this.f14060i = 0;
    }

    public String toString() {
        return "RelationInfo from " + this.f14052a.mo7364f() + " to " + this.f14053b.mo7364f();
    }

    public RelationInfo(EntityInfo entityInfo, EntityInfo entityInfo2, ToManyGetter toManyGetter, Property property, ToOneGetter toOneGetter) {
        this.f14052a = entityInfo;
        this.f14053b = entityInfo2;
        this.f14054c = property;
        this.f14057f = toManyGetter;
        this.f14058g = toOneGetter;
        this.f14055d = 0;
        this.f14056e = null;
        this.f14059h = null;
        this.f14060i = 0;
    }

    public RelationInfo(EntityInfo entityInfo, EntityInfo entityInfo2, ToManyGetter toManyGetter, int i9) {
        this.f14052a = entityInfo;
        this.f14053b = entityInfo2;
        this.f14057f = toManyGetter;
        this.f14060i = i9;
        this.f14055d = 0;
        this.f14054c = null;
        this.f14056e = null;
        this.f14058g = null;
        this.f14059h = null;
    }
}
