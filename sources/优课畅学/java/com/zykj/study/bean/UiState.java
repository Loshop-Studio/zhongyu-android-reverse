package com.zykj.study.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.zykj.http.exception.RemoteCodeException;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public abstract class UiState {
    public static final int $stable = 0;

    @StabilityInferred(parameters = 0)
    public static final class Error extends UiState {
        public static final int $stable = 8;
        private final Throwable exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable exception) {
            super(null);
            AbstractC9133u.m16133g(exception, "exception");
            this.exception = exception;
        }

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                th = error.exception;
            }
            return error.copy(th);
        }

        public final Throwable component1() {
            return this.exception;
        }

        public final Error copy(Throwable exception) {
            AbstractC9133u.m16133g(exception, "exception");
            return new Error(exception);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && AbstractC9133u.m16128b(this.exception, ((Error) obj).exception);
        }

        public final Throwable getException() {
            return this.exception;
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public final boolean isBadNetwork() {
            int code;
            Throwable th = this.exception;
            return (th instanceof RemoteCodeException) && 597 <= (code = ((RemoteCodeException) th).getErrorCodeInfo().getCode()) && code < 600;
        }

        public String toString() {
            return "Error(exception=" + this.exception + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class Initial extends UiState {
        public static final int $stable = 0;
        public static final Initial INSTANCE = new Initial();

        private Initial() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class Success<T> extends UiState {
        public static final int $stable = 0;

        /* renamed from: t */
        private final T f10996t;

        public Success(T t10) {
            super(null);
            this.f10996t = t10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = success.f10996t;
            }
            return success.copy(obj);
        }

        public final T component1() {
            return this.f10996t;
        }

        public final Success<T> copy(T t10) {
            return new Success<>(t10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && AbstractC9133u.m16128b(this.f10996t, ((Success) obj).f10996t);
        }

        public final T getT() {
            return this.f10996t;
        }

        public int hashCode() {
            T t10 = this.f10996t;
            if (t10 == null) {
                return 0;
            }
            return t10.hashCode();
        }

        public String toString() {
            return "Success(t=" + this.f10996t + ")";
        }
    }

    public /* synthetic */ UiState(AbstractC9126n abstractC9126n) {
        this();
    }

    public final UiState onError(InterfaceC10570l block) {
        AbstractC9133u.m16133g(block, "block");
        if (this instanceof Error) {
            block.invoke(this);
        }
        return this;
    }

    public final UiState onInitial(InterfaceC10559a block) {
        AbstractC9133u.m16133g(block, "block");
        if (this instanceof Initial) {
            block.invoke();
        }
        return this;
    }

    public final /* synthetic */ <T> UiState onSuccess(InterfaceC10570l block) {
        AbstractC9133u.m16133g(block, "block");
        try {
            AbstractC9133u.m16131e(this, "null cannot be cast to non-null type com.zykj.study.bean.UiState.Success<*>");
            Object t10 = ((Success) this).getT();
            AbstractC9133u.m16139m(1, ExifInterface.GPS_DIRECTION_TRUE);
            block.invoke(t10);
        } catch (ClassCastException unused) {
        }
        return this;
    }

    private UiState() {
    }
}
