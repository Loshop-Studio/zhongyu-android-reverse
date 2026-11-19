package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KVisibility;
import p089e8.InterfaceC8374b;
import p089e8.InterfaceC8378f;
import p089e8.InterfaceC8387o;

/* loaded from: classes5.dex */
public abstract class CallableReference implements InterfaceC8374b, Serializable {
    public static final Object NO_RECEIVER = NoReceiver.f17468a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC8374b reflected;
    private final String signature;

    public static class NoReceiver implements Serializable {

        /* renamed from: a */
        public static final NoReceiver f17468a = new NoReceiver();

        private NoReceiver() {
        }

        private Object readResolve() {
            return f17468a;
        }
    }

    public CallableReference(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }

    @Override // p089e8.InterfaceC8374b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // p089e8.InterfaceC8374b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC8374b compute() {
        InterfaceC8374b interfaceC8374b = this.reflected;
        if (interfaceC8374b != null) {
            return interfaceC8374b;
        }
        InterfaceC8374b interfaceC8374bComputeReflected = computeReflected();
        this.reflected = interfaceC8374bComputeReflected;
        return interfaceC8374bComputeReflected;
    }

    public abstract InterfaceC8374b computeReflected();

    @Override // p089e8.InterfaceC8373a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // p089e8.InterfaceC8374b
    public String getName() {
        return this.name;
    }

    public InterfaceC8378f getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? AbstractC9137y.m16155c(cls) : AbstractC9137y.m16154b(cls);
    }

    @Override // p089e8.InterfaceC8374b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public InterfaceC8374b getReflected() {
        InterfaceC8374b interfaceC8374bCompute = compute();
        if (interfaceC8374bCompute != this) {
            return interfaceC8374bCompute;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    @Override // p089e8.InterfaceC8374b
    public InterfaceC8387o getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // p089e8.InterfaceC8374b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // p089e8.InterfaceC8374b
    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // p089e8.InterfaceC8374b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // p089e8.InterfaceC8374b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // p089e8.InterfaceC8374b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // p089e8.InterfaceC8374b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
