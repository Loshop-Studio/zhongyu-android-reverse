package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;
import p207y6.InterfaceC6782f;
import p207y6.InterfaceC6787k;

/* loaded from: classes2.dex */
public abstract class MutablePropertyReference extends PropertyReference {
    public MutablePropertyReference() {
    }

    @Override // kotlin.jvm.internal.PropertyReference
    @NotNull
    public abstract /* synthetic */ InterfaceC6787k getGetter();

    @NotNull
    public abstract /* synthetic */ InterfaceC6782f getSetter();

    @SinceKotlin(version = "1.1")
    public MutablePropertyReference(Object obj) {
        super(obj);
    }

    @SinceKotlin(version = "1.4")
    public MutablePropertyReference(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
