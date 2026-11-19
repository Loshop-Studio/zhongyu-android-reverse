package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import p019c3.EnumC1095l;
import p019c3.InterfaceC1085b;
import p019c3.InterfaceC1087d;
import p019c3.InterfaceC1094k;
import p167w2.C3429b;

/* renamed from: kotlin.jvm.internal.c */
/* loaded from: classes.dex */
public abstract class AbstractC2760c implements InterfaceC1085b, Serializable {
    public static final Object NO_RECEIVER = a.f10721a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC1085b reflected;
    private final String signature;

    /* renamed from: kotlin.jvm.internal.c$a */
    private static class a implements Serializable {

        /* renamed from: a */
        private static final a f10721a = new a();

        private a() {
        }
    }

    public AbstractC2760c() {
        this(NO_RECEIVER);
    }

    @Override // p019c3.InterfaceC1085b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // p019c3.InterfaceC1085b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC1085b compute() {
        InterfaceC1085b interfaceC1085b = this.reflected;
        if (interfaceC1085b != null) {
            return interfaceC1085b;
        }
        InterfaceC1085b interfaceC1085bComputeReflected = computeReflected();
        this.reflected = interfaceC1085bComputeReflected;
        return interfaceC1085bComputeReflected;
    }

    protected abstract InterfaceC1085b computeReflected();

    @Override // p019c3.InterfaceC1084a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public InterfaceC1087d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? C2782y.m9259c(cls) : C2782y.m9258b(cls);
    }

    @Override // p019c3.InterfaceC1085b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    protected InterfaceC1085b getReflected() {
        InterfaceC1085b interfaceC1085bCompute = compute();
        if (interfaceC1085bCompute != this) {
            return interfaceC1085bCompute;
        }
        throw new C3429b();
    }

    @Override // p019c3.InterfaceC1085b
    public InterfaceC1094k getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // p019c3.InterfaceC1085b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // p019c3.InterfaceC1085b
    public EnumC1095l getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // p019c3.InterfaceC1085b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // p019c3.InterfaceC1085b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // p019c3.InterfaceC1085b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // p019c3.InterfaceC1085b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    protected AbstractC2760c(Object obj) {
        this(obj, null, null, null, false);
    }

    protected AbstractC2760c(Object obj, Class cls, String str, String str2, boolean z3) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z3;
    }
}
