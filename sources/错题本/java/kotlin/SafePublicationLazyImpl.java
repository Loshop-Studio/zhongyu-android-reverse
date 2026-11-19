package kotlin;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5432h;
import p045d6.C5440p;
import p045d6.InterfaceC5429e;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0002\u0018\u0000 \u001f*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004:\u0001 B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u0012\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000b¨\u0006!"}, m5110d2 = {"Lkotlin/SafePublicationLazyImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Ld6/e;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Lkotlin/Function0;", "initializer", "<init>", "(Lr6/a;)V", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "input", "Ld6/s;", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "isInitialized", "()Z", "", "toString", "()Ljava/lang/String;", "Lr6/a;", "_value", "Ljava/lang/Object;", "final", "getFinal$annotations", "()V", "getValue", "value", "Companion", "d6/h", "kotlin-stdlib"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class SafePublicationLazyImpl<T> implements InterfaceC5429e, Serializable {

    @NotNull
    public static final C5432h Companion = new C5432h();

    /* renamed from: a */
    public static final AtomicReferenceFieldUpdater f9158a = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "_value");

    @Nullable
    private volatile Object _value;

    @NotNull
    private final Object final;

    @Nullable
    private volatile InterfaceC6469a initializer;

    public SafePublicationLazyImpl(@NotNull InterfaceC6469a initializer) {
        AbstractC5830k.m5330g(initializer, "initializer");
        this.initializer = initializer;
        C5440p c5440p = C5440p.f8402a;
        this._value = c5440p;
        this.final = c5440p;
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // p045d6.InterfaceC5429e
    public T getValue() {
        T t8 = (T) this._value;
        C5440p c5440p = C5440p.f8402a;
        if (t8 != c5440p) {
            return t8;
        }
        InterfaceC6469a interfaceC6469a = this.initializer;
        if (interfaceC6469a != null) {
            T t9 = (T) interfaceC6469a.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9158a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c5440p, t9)) {
                if (atomicReferenceFieldUpdater.get(this) != c5440p) {
                }
            }
            this.initializer = null;
            return t9;
        }
        return (T) this._value;
    }

    public boolean isInitialized() {
        return this._value != C5440p.f8402a;
    }

    @NotNull
    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
