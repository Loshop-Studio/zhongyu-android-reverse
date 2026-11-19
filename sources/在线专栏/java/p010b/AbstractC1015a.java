package p010b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;

/* renamed from: b.a */
/* loaded from: classes.dex */
public abstract class AbstractC1015a<I, O> {

    /* renamed from: b.a$a */
    public static final class a<T> {

        /* renamed from: a */
        @SuppressLint({"UnknownNullness"})
        private final T f5697a;

        public a(@SuppressLint({"UnknownNullness"}) T t3) {
            this.f5697a = t3;
        }

        @SuppressLint({"UnknownNullness"})
        /* renamed from: a */
        public T m4765a() {
            return this.f5697a;
        }
    }

    /* renamed from: a */
    public abstract Intent mo2522a(Context context, @SuppressLint({"UnknownNullness"}) I i4);

    /* renamed from: b */
    public a<O> mo4764b(Context context, @SuppressLint({"UnknownNullness"}) I i4) {
        return null;
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: c */
    public abstract O mo2523c(int i4, Intent intent);
}
