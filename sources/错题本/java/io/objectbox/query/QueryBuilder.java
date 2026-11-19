package io.objectbox.query;

import io.objectbox.C5696a;
import io.objectbox.Property;
import io.objectbox.exception.DbException;
import java.io.Closeable;

/* loaded from: classes3.dex */
public class QueryBuilder<T> implements Closeable {

    /* renamed from: a */
    public final C5696a f8974a;

    /* renamed from: b */
    public long f8975b;

    /* renamed from: c */
    public long f8976c;

    /* renamed from: d */
    public Operator f8977d = Operator.NONE;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Operator {
        public static final Operator AND;
        public static final Operator NONE;

        /* renamed from: OR */
        public static final Operator f8978OR;

        /* renamed from: a */
        public static final /* synthetic */ Operator[] f8979a;

        static {
            Operator operator = new Operator("NONE", 0);
            NONE = operator;
            Operator operator2 = new Operator("AND", 1);
            AND = operator2;
            Operator operator3 = new Operator("OR", 2);
            f8978OR = operator3;
            f8979a = new Operator[]{operator, operator2, operator3};
        }

        public static Operator valueOf(String str) {
            return (Operator) Enum.valueOf(Operator.class, str);
        }

        public static Operator[] values() {
            return (Operator[]) f8979a.clone();
        }
    }

    public QueryBuilder(C5696a c5696a, long j7, String str) {
        this.f8974a = c5696a;
        long jNativeCreate = nativeCreate(j7, str);
        this.f8975b = jNativeCreate;
        if (jNativeCreate == 0) {
            throw new DbException("Could not create native query builder");
        }
    }

    private native long nativeBuild(long j7);

    private native long nativeCombine(long j7, long j8, long j9, boolean z8);

    private native long nativeCreate(long j7, String str);

    private native void nativeDestroy(long j7);

    private native long nativeEqual(long j7, int i, String str, boolean z8);

    /* renamed from: a */
    public final Query m5063a() {
        long j7 = this.f8975b;
        if (j7 == 0) {
            throw new IllegalStateException("This QueryBuilder has already been closed. Please use a new instance.");
        }
        if (this.f8977d != Operator.NONE) {
            throw new IllegalStateException("Incomplete logic condition. Use or()/and() between two conditions only.");
        }
        long jNativeBuild = nativeBuild(j7);
        if (jNativeBuild == 0) {
            throw new DbException("Could not create native query");
        }
        Query query = new Query(this.f8974a, jNativeBuild);
        close();
        return query;
    }

    /* renamed from: b */
    public final void m5064b(Property property, String str) {
        long j7 = this.f8975b;
        if (j7 == 0) {
            throw new IllegalStateException("This QueryBuilder has already been closed. Please use a new instance.");
        }
        long jNativeEqual = nativeEqual(j7, property.getId(), str, false);
        Operator operator = this.f8977d;
        Operator operator2 = Operator.NONE;
        if (operator == operator2) {
            this.f8976c = jNativeEqual;
        } else {
            this.f8976c = nativeCombine(this.f8975b, this.f8976c, jNativeEqual, operator == Operator.f8978OR);
            this.f8977d = operator2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        long j7 = this.f8975b;
        if (j7 != 0) {
            this.f8975b = 0L;
            nativeDestroy(j7);
        }
    }

    public final void finalize() throws Throwable {
        close();
        super.finalize();
    }
}
