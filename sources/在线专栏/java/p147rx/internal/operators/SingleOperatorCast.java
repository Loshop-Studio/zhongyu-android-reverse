package p147rx.internal.operators;

import p147rx.functions.Func1;

/* loaded from: classes2.dex */
public class SingleOperatorCast<T, R> implements Func1<T, R> {
    final Class<R> castClass;

    public SingleOperatorCast(Class<R> cls) {
        this.castClass = cls;
    }

    @Override // p147rx.functions.Func1
    public R call(T t3) {
        return this.castClass.cast(t3);
    }
}
