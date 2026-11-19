package io.objectbox.relation;

import androidx.camera.core.impl.utils.RunnableC0377a;
import io.objectbox.BoxStore;
import io.objectbox.C5696a;
import io.objectbox.Cursor;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.exception.DbDetachedException;
import java.io.PrintStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import javax.annotation.Nullable;
import p116m5.C6114f;

/* loaded from: classes3.dex */
public class ToOne<TARGET> implements Serializable {
    private static final long serialVersionUID = 5092547044335989281L;

    /* renamed from: a */
    public transient BoxStore f8987a;

    /* renamed from: b */
    public transient C5696a f8988b;

    /* renamed from: c */
    public volatile transient C5696a f8989c;
    private boolean checkIdOfTargetForPut;

    /* renamed from: d */
    public transient Field f8990d;
    private boolean debugRelations;
    private final Object entity;
    private final RelationInfo<Object, TARGET> relationInfo;
    private volatile long resolvedTargetId;
    private TARGET target;
    private long targetId;
    private final boolean virtualProperty;

    public ToOne(Object obj, RelationInfo<?, TARGET> relationInfo) {
        if (obj == null) {
            throw new IllegalArgumentException("No source entity given (null)");
        }
        if (relationInfo == null) {
            throw new IllegalArgumentException("No relation info given (null)");
        }
        this.entity = obj;
        this.relationInfo = relationInfo;
        this.virtualProperty = relationInfo.targetIdProperty.isVirtual;
    }

    /* renamed from: a */
    public static /* synthetic */ void m5070a(ToOne toOne, Object obj) {
        toOne.m5073d(obj, toOne.f8989c.m5034e(obj));
        toOne.f8988b.m5034e(toOne.entity);
    }

    /* renamed from: b */
    public final synchronized void m5071b() {
        this.resolvedTargetId = 0L;
        this.target = null;
    }

    /* renamed from: c */
    public final void m5072c(Object obj) {
        if (this.f8989c == null) {
            C6114f c6114f = C6114f.f9760b;
            try {
                BoxStore boxStore = (BoxStore) c6114f.m5808a(this.entity.getClass(), "__boxStore").get(this.entity);
                this.f8987a = boxStore;
                if (boxStore == null) {
                    if (obj != null) {
                        this.f8987a = (BoxStore) c6114f.m5808a(obj.getClass(), "__boxStore").get(obj);
                    }
                    if (this.f8987a == null) {
                        throw new DbDetachedException("Cannot resolve relation for detached entities, call box.attach(entity) beforehand.");
                    }
                }
                this.f8987a.getClass();
                this.debugRelations = false;
                this.f8988b = this.f8987a.m5018c(this.relationInfo.sourceInfo.getEntityClass());
                this.f8989c = this.f8987a.m5018c(this.relationInfo.targetInfo.getEntityClass());
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final synchronized void m5073d(Object obj, long j7) {
        try {
            if (this.debugRelations) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder("Setting resolved ToOne target to ");
                sb.append(obj == 0 ? "null" : "non-null");
                sb.append(" for ID ");
                sb.append(j7);
                printStream.println(sb.toString());
            }
            this.resolvedTargetId = j7;
            this.target = obj;
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ToOne)) {
            return false;
        }
        ToOne toOne = (ToOne) obj;
        return this.relationInfo == toOne.relationInfo && getTargetId() == toOne.getTargetId();
    }

    public TARGET getCachedTarget() {
        return this.target;
    }

    public Object getEntity() {
        return this.entity;
    }

    public TARGET getTarget() {
        return getTarget(getTargetId());
    }

    public long getTargetId() {
        if (this.virtualProperty) {
            return this.targetId;
        }
        if (this.f8990d == null) {
            this.f8990d = C6114f.f9760b.m5808a(this.entity.getClass(), this.relationInfo.targetIdProperty.name);
        }
        Field field = this.f8990d;
        try {
            Long l = (Long) field.get(this.entity);
            if (l != null) {
                return l.longValue();
            }
            return 0L;
        } catch (IllegalAccessException unused) {
            throw new RuntimeException("Could not access field " + field);
        }
    }

    public int hashCode() {
        long targetId = getTargetId();
        return (int) (targetId ^ (targetId >>> 32));
    }

    @Internal
    public void internalPutTarget(Cursor<TARGET> cursor) throws IllegalAccessException, IllegalArgumentException {
        this.checkIdOfTargetForPut = false;
        long jPut = cursor.put(this.target);
        setTargetId(jPut);
        m5073d(this.target, jPut);
    }

    @Internal
    public boolean internalRequiresPutTarget() {
        return this.checkIdOfTargetForPut && this.target != null && getTargetId() == 0;
    }

    public boolean isNull() {
        return getTargetId() == 0 && this.target == null;
    }

    public boolean isResolved() {
        return this.resolvedTargetId == getTargetId();
    }

    public boolean isResolvedAndNotNull() {
        return this.resolvedTargetId != 0 && this.resolvedTargetId == getTargetId();
    }

    public void setAndPutTarget(@Nullable TARGET target) throws IllegalAccessException, IllegalArgumentException {
        m5072c(target);
        if (target == null) {
            setTargetId(0L);
            m5071b();
            this.f8988b.m5034e(this.entity);
            return;
        }
        long id = this.f8989c.f8926e.getId(target);
        if (id == 0) {
            setAndPutTargetAlways(target);
            return;
        }
        setTargetId(id);
        m5073d(target, id);
        this.f8988b.m5034e(this.entity);
    }

    public void setAndPutTargetAlways(@Nullable TARGET target) throws IllegalAccessException, IllegalArgumentException {
        m5072c(target);
        if (target != null) {
            this.f8987a.m5021h(new RunnableC0377a(23, this, target));
            return;
        }
        setTargetId(0L);
        m5071b();
        this.f8988b.m5034e(this.entity);
    }

    public void setAndUpdateTargetId(long j7) throws IllegalAccessException, IllegalArgumentException {
        setTargetId(j7);
        m5072c(null);
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void setTarget(@Nullable TARGET target) {
        if (target == null) {
            setTargetId(0L);
            m5071b();
        } else {
            long id = this.relationInfo.targetInfo.getIdGetter().getId(target);
            this.checkIdOfTargetForPut = id == 0;
            setTargetId(id);
            m5073d(target, id);
        }
    }

    public void setTargetId(long j7) throws IllegalAccessException, IllegalArgumentException {
        if (this.virtualProperty) {
            this.targetId = j7;
        } else {
            try {
                if (this.f8990d == null) {
                    this.f8990d = C6114f.f9760b.m5808a(this.entity.getClass(), this.relationInfo.targetIdProperty.name);
                }
                this.f8990d.set(this.entity, Long.valueOf(j7));
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Could not update to-one ID in entity", e);
            }
        }
        if (j7 != 0) {
            this.checkIdOfTargetForPut = false;
        }
    }

    @Internal
    public TARGET getTarget(long j7) {
        synchronized (this) {
            try {
                if (this.resolvedTargetId == j7) {
                    return this.target;
                }
                m5072c(null);
                C5696a c5696a = this.f8989c;
                Cursor cursorM5032c = c5696a.m5032c();
                try {
                    TARGET target = (TARGET) cursorM5032c.get(j7);
                    c5696a.m5037h(cursorM5032c);
                    m5073d(target, j7);
                    return target;
                } catch (Throwable th) {
                    c5696a.m5037h(cursorM5032c);
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
