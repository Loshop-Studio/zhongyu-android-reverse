package androidx.savedstate.serialization;

import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.C9114c0;
import kotlin.jvm.internal.C9132t;
import p257t8.AbstractC10124a;
import p268u8.InterfaceC10210f;

/* loaded from: classes3.dex */
public final class SavedStateCodecUtilsKt {
    private static final InterfaceC10210f booleanArrayDescriptor;
    private static final InterfaceC10210f charArrayDescriptor;
    private static final InterfaceC10210f doubleArrayDescriptor;
    private static final InterfaceC10210f floatArrayDescriptor;
    private static final InterfaceC10210f intArrayDescriptor;
    private static final InterfaceC10210f intListDescriptor = AbstractC10124a.m18896h(AbstractC10124a.m18884E(C9132t.f17496a)).getDescriptor();
    private static final InterfaceC10210f longArrayDescriptor;
    private static final InterfaceC10210f stringArrayDescriptor;
    private static final InterfaceC10210f stringListDescriptor;

    static {
        C9114c0 c9114c0 = C9114c0.f17482a;
        stringListDescriptor = AbstractC10124a.m18896h(AbstractC10124a.m18887H(c9114c0)).getDescriptor();
        booleanArrayDescriptor = AbstractC10124a.m18890b().getDescriptor();
        charArrayDescriptor = AbstractC10124a.m18892d().getDescriptor();
        doubleArrayDescriptor = AbstractC10124a.m18893e().getDescriptor();
        floatArrayDescriptor = AbstractC10124a.m18894f().getDescriptor();
        intArrayDescriptor = AbstractC10124a.m18895g().getDescriptor();
        longArrayDescriptor = AbstractC10124a.m18897i().getDescriptor();
        stringArrayDescriptor = AbstractC10124a.m18889a(AbstractC9137y.m16154b(String.class), AbstractC10124a.m18887H(c9114c0)).getDescriptor();
    }

    public static final InterfaceC10210f getBooleanArrayDescriptor() {
        return booleanArrayDescriptor;
    }

    public static final InterfaceC10210f getCharArrayDescriptor() {
        return charArrayDescriptor;
    }

    public static final InterfaceC10210f getDoubleArrayDescriptor() {
        return doubleArrayDescriptor;
    }

    public static final InterfaceC10210f getFloatArrayDescriptor() {
        return floatArrayDescriptor;
    }

    public static final InterfaceC10210f getIntArrayDescriptor() {
        return intArrayDescriptor;
    }

    public static final InterfaceC10210f getIntListDescriptor() {
        return intListDescriptor;
    }

    public static final InterfaceC10210f getLongArrayDescriptor() {
        return longArrayDescriptor;
    }

    public static final InterfaceC10210f getStringArrayDescriptor() {
        return stringArrayDescriptor;
    }

    public static /* synthetic */ void getStringArrayDescriptor$annotations() {
    }

    public static final InterfaceC10210f getStringListDescriptor() {
        return stringListDescriptor;
    }
}
