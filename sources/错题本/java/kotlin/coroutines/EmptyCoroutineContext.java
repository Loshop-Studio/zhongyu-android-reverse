package kotlin.coroutines;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5634f;
import p075h6.InterfaceC5635g;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6473e;

@SinceKotlin(version = "1.3")
@Metadata(m5109d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\r\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\u00012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m5110d2 = {"Lkotlin/coroutines/EmptyCoroutineContext;", "Lh6/h;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "", "readResolve", "()Ljava/lang/Object;", "Lh6/f;", ExifInterface.LONGITUDE_EAST, "Lh6/g;", "key", "get", "(Lh6/g;)Lh6/f;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;Lr6/e;)Ljava/lang/Object;", "context", "plus", "(Lh6/h;)Lh6/h;", "minusKey", "(Lh6/g;)Lh6/h;", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "serialVersionUID", "J", "kotlin-stdlib"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class EmptyCoroutineContext implements InterfaceC5636h, Serializable {

    @NotNull
    public static final EmptyCoroutineContext INSTANCE = new EmptyCoroutineContext();
    private static final long serialVersionUID = 0;

    private EmptyCoroutineContext() {
    }

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override // p075h6.InterfaceC5636h
    public <R> R fold(R initial, @NotNull InterfaceC6473e operation) {
        AbstractC5830k.m5330g(operation, "operation");
        return initial;
    }

    @Override // p075h6.InterfaceC5636h
    @Nullable
    public <E extends InterfaceC5634f> E get(@NotNull InterfaceC5635g key) {
        AbstractC5830k.m5330g(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // p075h6.InterfaceC5636h
    @NotNull
    public InterfaceC5636h minusKey(@NotNull InterfaceC5635g key) {
        AbstractC5830k.m5330g(key, "key");
        return this;
    }

    @Override // p075h6.InterfaceC5636h
    @NotNull
    public InterfaceC5636h plus(@NotNull InterfaceC5636h context) {
        AbstractC5830k.m5330g(context, "context");
        return context;
    }

    @NotNull
    public String toString() {
        return "EmptyCoroutineContext";
    }
}
