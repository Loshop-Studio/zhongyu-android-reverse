package gd;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import kotlin.jvm.internal.InterfaceC9969k;
import p280od.InterfaceC10469c;

/* renamed from: gd.a */
/* loaded from: classes6.dex */
public abstract class AbstractC9293a {
    /* renamed from: a */
    public static final Class m18324a(InterfaceC10469c interfaceC10469c) {
        AbstractC9979u.m20294g(interfaceC10469c, "<this>");
        Class clsMo20273b = ((InterfaceC9969k) interfaceC10469c).mo20273b();
        AbstractC9979u.m20292e(clsMo20273b, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsMo20273b;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: b */
    public static final Class m18325b(InterfaceC10469c interfaceC10469c) {
        AbstractC9979u.m20294g(interfaceC10469c, "<this>");
        Class clsMo20273b = ((InterfaceC9969k) interfaceC10469c).mo20273b();
        if (!clsMo20273b.isPrimitive()) {
            AbstractC9979u.m20292e(clsMo20273b, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return clsMo20273b;
        }
        String name = clsMo20273b.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    clsMo20273b = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    clsMo20273b = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    clsMo20273b = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    clsMo20273b = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    clsMo20273b = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    clsMo20273b = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals(TypedValues.Custom.S_BOOLEAN)) {
                    clsMo20273b = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals(TypedValues.Custom.S_FLOAT)) {
                    clsMo20273b = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    clsMo20273b = Short.class;
                    break;
                }
                break;
        }
        AbstractC9979u.m20292e(clsMo20273b, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return clsMo20273b;
    }

    /* renamed from: c */
    public static final InterfaceC10469c m18326c(Class cls) {
        AbstractC9979u.m20294g(cls, "<this>");
        return AbstractC9983y.m20315b(cls);
    }
}
