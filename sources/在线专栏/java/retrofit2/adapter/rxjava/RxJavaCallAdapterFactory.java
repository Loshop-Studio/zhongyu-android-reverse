package retrofit2.adapter.rxjava;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import p147rx.Completable;
import p147rx.Observable;
import p147rx.Scheduler;
import p147rx.Single;
import retrofit2.CallAdapter;
import retrofit2.Response;
import retrofit2.Retrofit;

/* loaded from: classes.dex */
public final class RxJavaCallAdapterFactory extends CallAdapter.Factory {
    private final boolean isAsync;
    private final Scheduler scheduler;

    private RxJavaCallAdapterFactory(Scheduler scheduler, boolean z3) {
        this.scheduler = scheduler;
        this.isAsync = z3;
    }

    public static RxJavaCallAdapterFactory create() {
        return new RxJavaCallAdapterFactory(null, false);
    }

    public static RxJavaCallAdapterFactory createAsync() {
        return new RxJavaCallAdapterFactory(null, true);
    }

    public static RxJavaCallAdapterFactory createWithScheduler(Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler == null");
        return new RxJavaCallAdapterFactory(scheduler, false);
    }

    @Override // retrofit2.CallAdapter.Factory
    public CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        Type parameterUpperBound;
        boolean z3;
        boolean z4;
        Class<?> rawType = CallAdapter.Factory.getRawType(type);
        boolean z5 = rawType == Single.class;
        boolean z6 = rawType == Completable.class;
        if (rawType != Observable.class && !z5 && !z6) {
            return null;
        }
        if (z6) {
            return new RxJavaCallAdapter(Void.class, this.scheduler, this.isAsync, false, true, false, true);
        }
        if (!(type instanceof ParameterizedType)) {
            String str = z5 ? "Single" : "Observable";
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        Type parameterUpperBound2 = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) type);
        Class<?> rawType2 = CallAdapter.Factory.getRawType(parameterUpperBound2);
        if (rawType2 == Response.class) {
            if (!(parameterUpperBound2 instanceof ParameterizedType)) {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
            parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound2);
            z3 = false;
        } else {
            if (rawType2 != Result.class) {
                parameterUpperBound = parameterUpperBound2;
                z3 = false;
                z4 = true;
                return new RxJavaCallAdapter(parameterUpperBound, this.scheduler, this.isAsync, z3, z4, z5, false);
            }
            if (!(parameterUpperBound2 instanceof ParameterizedType)) {
                throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
            }
            parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound2);
            z3 = true;
        }
        z4 = false;
        return new RxJavaCallAdapter(parameterUpperBound, this.scheduler, this.isAsync, z3, z4, z5, false);
    }
}
