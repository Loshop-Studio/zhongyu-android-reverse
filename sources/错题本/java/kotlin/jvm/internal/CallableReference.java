package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.SinceKotlin;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KVisibility;
import p207y6.InterfaceC6778b;
import p207y6.InterfaceC6780d;
import p207y6.InterfaceC6793q;

/* loaded from: classes2.dex */
public abstract class CallableReference implements InterfaceC6778b, Serializable {

    @SinceKotlin(version = "1.1")
    public static final Object NO_RECEIVER = NoReceiver.f9212a;

    @SinceKotlin(version = "1.4")
    private final boolean isTopLevel;

    @SinceKotlin(version = "1.4")
    private final String name;

    @SinceKotlin(version = "1.4")
    private final Class owner;

    @SinceKotlin(version = "1.1")
    protected final Object receiver;
    private transient InterfaceC6778b reflected;

    @SinceKotlin(version = "1.4")
    private final String signature;

    @SinceKotlin(version = "1.2")
    public static class NoReceiver implements Serializable {

        /* renamed from: a */
        public static final NoReceiver f9212a = new NoReceiver();

        private NoReceiver() {
        }

        private Object readResolve() throws ObjectStreamException {
            return f9212a;
        }
    }

    public CallableReference() {
        this(NO_RECEIVER);
    }

    @Override // p207y6.InterfaceC6778b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // p207y6.InterfaceC6778b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    @SinceKotlin(version = "1.1")
    public InterfaceC6778b compute() {
        InterfaceC6778b interfaceC6778b = this.reflected;
        if (interfaceC6778b != null) {
            return interfaceC6778b;
        }
        InterfaceC6778b interfaceC6778bComputeReflected = computeReflected();
        this.reflected = interfaceC6778bComputeReflected;
        return interfaceC6778bComputeReflected;
    }

    public abstract InterfaceC6778b computeReflected();

    @Override // p207y6.InterfaceC6777a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    @SinceKotlin(version = "1.1")
    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // p207y6.InterfaceC6778b
    public String getName() {
        return this.name;
    }

    public InterfaceC6780d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return AbstractC5832m.m5340a(cls);
        }
        AbstractC5832m.f9223a.getClass();
        return new C5831l(cls);
    }

    @Override // p207y6.InterfaceC6778b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    @SinceKotlin(version = "1.1")
    public InterfaceC6778b getReflected() {
        InterfaceC6778b interfaceC6778bCompute = compute();
        if (interfaceC6778bCompute != this) {
            return interfaceC6778bCompute;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    @Override // p207y6.InterfaceC6778b
    public InterfaceC6793q getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // p207y6.InterfaceC6778b
    @SinceKotlin(version = "1.1")
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // p207y6.InterfaceC6778b
    @SinceKotlin(version = "1.1")
    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // p207y6.InterfaceC6778b
    @SinceKotlin(version = "1.1")
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // p207y6.InterfaceC6778b
    @SinceKotlin(version = "1.1")
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // p207y6.InterfaceC6778b
    @SinceKotlin(version = "1.1")
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // p207y6.InterfaceC6778b
    @SinceKotlin(version = "1.3")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    @SinceKotlin(version = "1.1")
    public CallableReference(Object obj) {
        this(obj, null, null, null, false);
    }

    @SinceKotlin(version = "1.4")
    public CallableReference(Object obj, Class cls, String str, String str2, boolean z8) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z8;
    }
}
