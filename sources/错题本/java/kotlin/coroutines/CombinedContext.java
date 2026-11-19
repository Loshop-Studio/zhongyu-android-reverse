package kotlin.coroutines;

import androidx.collection.AbstractC0584a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p054e7.C5488t;
import p075h6.InterfaceC5634f;
import p075h6.InterfaceC5635g;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6473e;

@SinceKotlin(version = "1.3")
@Metadata(m5109d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001+B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u0018\u001a\u00028\u00002\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\u00012\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010)R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*¨\u0006,"}, m5110d2 = {"Lkotlin/coroutines/CombinedContext;", "Lh6/h;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "left", "Lh6/f;", "element", "<init>", "(Lh6/h;Lh6/f;)V", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/ReadObjectParameterType;", "input", "Ld6/s;", "readObject", "(Ljava/io/ObjectInputStream;)V", ExifInterface.LONGITUDE_EAST, "Lh6/g;", "key", "get", "(Lh6/g;)Lh6/f;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;Lr6/e;)Ljava/lang/Object;", "minusKey", "(Lh6/g;)Lh6/h;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lh6/h;", "Lh6/f;", "Serialized", "kotlin-stdlib"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1#2:201\n*E\n"})
/* loaded from: classes2.dex */
public final class CombinedContext implements InterfaceC5636h, Serializable {

    @NotNull
    private final InterfaceC5634f element;

    @NotNull
    private final InterfaceC5636h left;

    @Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\b\u0002\u0018\u0000 \u000e2\u00060\u0001j\u0002`\u0002:\u0001\u000fB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m5110d2 = {"Lkotlin/coroutines/CombinedContext$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "Lh6/h;", "elements", "<init>", "([Lh6/h;)V", "", "readResolve", "()Ljava/lang/Object;", "[Lh6/h;", "getElements", "()[Lh6/h;", "Companion", "kotlin/coroutines/a", "kotlin-stdlib"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,200:1\n12883#2,3:201\n*S KotlinDebug\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n*L\n197#1:201,3\n*E\n"})
    public static final class Serialized implements Serializable {

        @NotNull
        public static final C5812a Companion = new C5812a();
        private static final long serialVersionUID = 0;

        @NotNull
        private final InterfaceC5636h[] elements;

        public Serialized(@NotNull InterfaceC5636h[] elements) {
            AbstractC5830k.m5330g(elements, "elements");
            this.elements = elements;
        }

        private final Object readResolve() {
            InterfaceC5636h[] interfaceC5636hArr = this.elements;
            InterfaceC5636h interfaceC5636hPlus = EmptyCoroutineContext.INSTANCE;
            for (InterfaceC5636h interfaceC5636h : interfaceC5636hArr) {
                interfaceC5636hPlus = interfaceC5636hPlus.plus(interfaceC5636h);
            }
            return interfaceC5636hPlus;
        }

        @NotNull
        public final InterfaceC5636h[] getElements() {
            return this.elements;
        }
    }

    public CombinedContext(@NotNull InterfaceC5636h left, @NotNull InterfaceC5634f element) {
        AbstractC5830k.m5330g(left, "left");
        AbstractC5830k.m5330g(element, "element");
        this.left = left;
        this.element = element;
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        int iM5301a = m5301a();
        final InterfaceC5636h[] interfaceC5636hArr = new InterfaceC5636h[iM5301a];
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        fold(C5443s.f8405a, new InterfaceC6473e() { // from class: h6.b
            @Override // p152r6.InterfaceC6473e
            public final Object invoke(Object obj, Object obj2) {
                InterfaceC5634f element = (InterfaceC5634f) obj2;
                AbstractC5830k.m5330g((C5443s) obj, "<unused var>");
                AbstractC5830k.m5330g(element, "element");
                Ref$IntRef ref$IntRef2 = ref$IntRef;
                int i = ref$IntRef2.element;
                ref$IntRef2.element = i + 1;
                interfaceC5636hArr[i] = element;
                return C5443s.f8405a;
            }
        });
        if (ref$IntRef.element == iM5301a) {
            return new Serialized(interfaceC5636hArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    /* renamed from: a */
    public final int m5301a() {
        int i = 2;
        CombinedContext combinedContext = this;
        while (true) {
            InterfaceC5636h interfaceC5636h = combinedContext.left;
            combinedContext = interfaceC5636h instanceof CombinedContext ? (CombinedContext) interfaceC5636h : null;
            if (combinedContext == null) {
                return i;
            }
            i++;
        }
    }

    public boolean equals(@Nullable Object other) {
        boolean zM5325b;
        if (this == other) {
            return true;
        }
        if (other instanceof CombinedContext) {
            CombinedContext combinedContext = (CombinedContext) other;
            if (combinedContext.m5301a() == m5301a()) {
                CombinedContext combinedContext2 = this;
                while (true) {
                    InterfaceC5634f interfaceC5634f = combinedContext2.element;
                    if (!AbstractC5830k.m5325b(combinedContext.get(interfaceC5634f.getKey()), interfaceC5634f)) {
                        zM5325b = false;
                        break;
                    }
                    InterfaceC5636h interfaceC5636h = combinedContext2.left;
                    if (!(interfaceC5636h instanceof CombinedContext)) {
                        AbstractC5830k.m5328e(interfaceC5636h, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        InterfaceC5634f interfaceC5634f2 = (InterfaceC5634f) interfaceC5636h;
                        zM5325b = AbstractC5830k.m5325b(combinedContext.get(interfaceC5634f2.getKey()), interfaceC5634f2);
                        break;
                    }
                    combinedContext2 = (CombinedContext) interfaceC5636h;
                }
                if (zM5325b) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p075h6.InterfaceC5636h
    public <R> R fold(R initial, @NotNull InterfaceC6473e operation) {
        AbstractC5830k.m5330g(operation, "operation");
        return (R) operation.invoke(this.left.fold(initial, operation), this.element);
    }

    @Override // p075h6.InterfaceC5636h
    @Nullable
    public <E extends InterfaceC5634f> E get(@NotNull InterfaceC5635g key) {
        AbstractC5830k.m5330g(key, "key");
        CombinedContext combinedContext = this;
        while (true) {
            E e = (E) combinedContext.element.get(key);
            if (e != null) {
                return e;
            }
            InterfaceC5636h interfaceC5636h = combinedContext.left;
            if (!(interfaceC5636h instanceof CombinedContext)) {
                return (E) interfaceC5636h.get(key);
            }
            combinedContext = (CombinedContext) interfaceC5636h;
        }
    }

    public int hashCode() {
        return this.element.hashCode() + this.left.hashCode();
    }

    @Override // p075h6.InterfaceC5636h
    @NotNull
    public InterfaceC5636h minusKey(@NotNull InterfaceC5635g key) {
        AbstractC5830k.m5330g(key, "key");
        if (this.element.get(key) != null) {
            return this.left;
        }
        InterfaceC5636h interfaceC5636hMinusKey = this.left.minusKey(key);
        return interfaceC5636hMinusKey == this.left ? this : interfaceC5636hMinusKey == EmptyCoroutineContext.INSTANCE ? this.element : new CombinedContext(interfaceC5636hMinusKey, this.element);
    }

    @Override // p075h6.InterfaceC5636h
    @NotNull
    public InterfaceC5636h plus(@NotNull InterfaceC5636h context) {
        AbstractC5830k.m5330g(context, "context");
        return context == EmptyCoroutineContext.INSTANCE ? this : (InterfaceC5636h) context.fold(this, new C5488t(4));
    }

    @NotNull
    public String toString() {
        return AbstractC0584a.m911l(']', (String) fold("", new C5488t(3)), new StringBuilder("["));
    }
}
