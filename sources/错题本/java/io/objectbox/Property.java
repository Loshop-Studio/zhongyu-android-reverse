package io.objectbox;

import android.support.v4.media.AbstractC0037f;
import android.support.v4.media.C0039h;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.converter.PropertyConverter;
import io.objectbox.exception.DbException;
import io.objectbox.query.QueryCondition$PropertyCondition$Operation;
import java.io.Serializable;
import java.util.Collection;
import javax.annotation.Nullable;
import p131o5.InterfaceC6272b;

/* loaded from: classes3.dex */
public class Property<ENTITY> implements Serializable {
    private static final long serialVersionUID = 8613291105982758093L;
    public final Class<? extends PropertyConverter<?, ?>> converterClass;
    public final Class<?> customType;
    public final String dbName;
    public final EntityInfo<ENTITY> entity;

    /* renamed from: id */
    public final int f8916id;
    private boolean idVerified;
    public final boolean isId;
    public final boolean isVirtual;
    public final String name;
    public final int ordinal;
    public final Class<?> type;

    public Property(EntityInfo<ENTITY> entityInfo, int i, int i8, Class<?> cls, String str) {
        this(entityInfo, i, i8, cls, str, false, str, null, null);
    }

    public InterfaceC6272b between(Object obj, Object obj2) {
        return new C0039h(this, QueryCondition$PropertyCondition$Operation.BETWEEN, new Object[]{obj, obj2});
    }

    public InterfaceC6272b contains(String str) {
        return new C0039h(this, str);
    }

    public InterfaceC6272b endsWith(String str) {
        return new C0039h(this, str);
    }

    /* renamed from: eq */
    public InterfaceC6272b m5022eq(Object obj) {
        return new C0039h(this, obj);
    }

    @Internal
    public int getEntityId() {
        return this.entity.getEntityId();
    }

    @Internal
    public int getId() {
        int i = this.f8916id;
        if (i > 0) {
            return i;
        }
        throw new IllegalStateException("Illegal property ID " + this.f8916id + " for " + toString());
    }

    /* renamed from: gt */
    public InterfaceC6272b m5023gt(Object obj) {
        return new C0039h(this, obj);
    }

    /* renamed from: in */
    public InterfaceC6272b m5025in(Object... objArr) {
        return new C0039h(this, QueryCondition$PropertyCondition$Operation.f8980IN, objArr);
    }

    public boolean isIdVerified() {
        return this.idVerified;
    }

    public InterfaceC6272b isNotNull() {
        return new C0039h(this, QueryCondition$PropertyCondition$Operation.IS_NOT_NULL, (Object[]) null);
    }

    public InterfaceC6272b isNull() {
        return new C0039h(this, QueryCondition$PropertyCondition$Operation.IS_NULL, (Object[]) null);
    }

    /* renamed from: lt */
    public InterfaceC6272b m5026lt(Object obj) {
        return new C0039h(this, obj);
    }

    public InterfaceC6272b notEq(Object obj) {
        return new C0039h(this, obj);
    }

    public InterfaceC6272b startsWith(String str) {
        return new C0039h(this, str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Property \"");
        sb.append(this.name);
        sb.append("\" (ID: ");
        return AbstractC0037f.m90o(sb, ")", this.f8916id);
    }

    public void verifyId(int i) {
        int i8 = this.f8916id;
        if (i8 <= 0) {
            throw new IllegalStateException("Illegal property ID " + this.f8916id + " for " + toString());
        }
        if (i8 == i) {
            this.idVerified = true;
            return;
        }
        throw new DbException(toString() + " does not match ID in DB: " + i);
    }

    public Property(EntityInfo<ENTITY> entityInfo, int i, int i8, Class<?> cls, String str, boolean z8) {
        this(entityInfo, i, i8, cls, str, false, z8, str, null, null);
    }

    /* renamed from: in */
    public InterfaceC6272b m5024in(Collection<?> collection) {
        return m5025in(collection.toArray());
    }

    public Property(EntityInfo<ENTITY> entityInfo, int i, int i8, Class<?> cls, String str, boolean z8, @Nullable String str2) {
        this(entityInfo, i, i8, cls, str, z8, str2, null, null);
    }

    public Property(EntityInfo<ENTITY> entityInfo, int i, int i8, Class<?> cls, String str, boolean z8, @Nullable String str2, @Nullable Class<? extends PropertyConverter<?, ?>> cls2, @Nullable Class<?> cls3) {
        this(entityInfo, i, i8, cls, str, z8, false, str2, cls2, cls3);
    }

    public Property(EntityInfo<ENTITY> entityInfo, int i, int i8, Class<?> cls, String str, boolean z8, boolean z9, @Nullable String str2, @Nullable Class<? extends PropertyConverter<?, ?>> cls2, @Nullable Class<?> cls3) {
        this.entity = entityInfo;
        this.ordinal = i;
        this.f8916id = i8;
        this.type = cls;
        this.name = str;
        this.isId = z8;
        this.isVirtual = z9;
        this.dbName = str2;
        this.converterClass = cls2;
        this.customType = cls3;
    }
}
