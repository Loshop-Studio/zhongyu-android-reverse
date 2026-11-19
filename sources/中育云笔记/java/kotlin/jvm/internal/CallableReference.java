package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KVisibility;
import p280od.InterfaceC10468b;
import p280od.InterfaceC10472f;
import p280od.InterfaceC10477k;
import p280od.InterfaceC10481o;

/* loaded from: classes6.dex */
public abstract class CallableReference implements InterfaceC10468b, Serializable {
    public static final Object NO_RECEIVER = NoReceiver.f23397c;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC10468b reflected;
    private final String signature;

    public static class NoReceiver implements Serializable {

        /* renamed from: c */
        public static final NoReceiver f23397c = new NoReceiver();

        private NoReceiver() {
        }

        private Object readResolve() {
            return f23397c;
        }
    }

    public CallableReference(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }

    @Override // p280od.InterfaceC10468b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // p280od.InterfaceC10468b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC10468b compute() {
        InterfaceC10468b interfaceC10468b = this.reflected;
        if (interfaceC10468b != null) {
            return interfaceC10468b;
        }
        InterfaceC10468b interfaceC10468bComputeReflected = computeReflected();
        this.reflected = interfaceC10468bComputeReflected;
        return interfaceC10468bComputeReflected;
    }

    public abstract InterfaceC10468b computeReflected();

    @Override // p280od.InterfaceC10467a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // p280od.InterfaceC10468b
    public String getName() {
        return this.name;
    }

    public InterfaceC10472f getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? AbstractC9983y.m20316c(cls) : AbstractC9983y.m20315b(cls);
    }

    @Override // p280od.InterfaceC10468b
    public List<InterfaceC10477k> getParameters() {
        return getReflected().getParameters();
    }

    public InterfaceC10468b getReflected() {
        InterfaceC10468b interfaceC10468bCompute = compute();
        if (interfaceC10468bCompute != this) {
            return interfaceC10468bCompute;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    @Override // p280od.InterfaceC10468b
    public InterfaceC10481o getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // p280od.InterfaceC10468b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // p280od.InterfaceC10468b
    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // p280od.InterfaceC10468b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // p280od.InterfaceC10468b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // p280od.InterfaceC10468b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // p280od.InterfaceC10468b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
