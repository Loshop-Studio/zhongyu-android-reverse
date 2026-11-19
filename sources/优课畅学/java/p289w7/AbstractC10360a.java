package p289w7;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.InterfaceC9123k;
import p089e8.InterfaceC8375c;

/* renamed from: w7.a */
/* loaded from: classes5.dex */
public abstract class AbstractC10360a {
    /* renamed from: a */
    public static final Class m19298a(InterfaceC8375c interfaceC8375c) {
        AbstractC9133u.m16133g(interfaceC8375c, "<this>");
        Class clsMo16115d = ((InterfaceC9123k) interfaceC8375c).mo16115d();
        AbstractC9133u.m16131e(clsMo16115d, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsMo16115d;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: b */
    public static final Class m19299b(InterfaceC8375c interfaceC8375c) {
        AbstractC9133u.m16133g(interfaceC8375c, "<this>");
        Class clsMo16115d = ((InterfaceC9123k) interfaceC8375c).mo16115d();
        if (!clsMo16115d.isPrimitive()) {
            AbstractC9133u.m16131e(clsMo16115d, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return clsMo16115d;
        }
        String name = clsMo16115d.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    clsMo16115d = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    clsMo16115d = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    clsMo16115d = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    clsMo16115d = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    clsMo16115d = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    clsMo16115d = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals(TypedValues.Custom.S_BOOLEAN)) {
                    clsMo16115d = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals(TypedValues.Custom.S_FLOAT)) {
                    clsMo16115d = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    clsMo16115d = Short.class;
                    break;
                }
                break;
        }
        AbstractC9133u.m16131e(clsMo16115d, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return clsMo16115d;
    }

    /* renamed from: c */
    public static final InterfaceC8375c m19300c(Class cls) {
        AbstractC9133u.m16133g(cls, "<this>");
        return AbstractC9137y.m16154b(cls);
    }
}
