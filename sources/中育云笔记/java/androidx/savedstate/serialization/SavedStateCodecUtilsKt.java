package androidx.savedstate.serialization;

import de.AbstractC9025a;
import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9983y;
import kotlin.jvm.internal.C9960c0;
import kotlin.jvm.internal.C9978t;

/* loaded from: classes3.dex */
public final class SavedStateCodecUtilsKt {
    private static final InterfaceC9129f booleanArrayDescriptor;
    private static final InterfaceC9129f charArrayDescriptor;
    private static final InterfaceC9129f doubleArrayDescriptor;
    private static final InterfaceC9129f floatArrayDescriptor;
    private static final InterfaceC9129f intArrayDescriptor;
    private static final InterfaceC9129f intListDescriptor = AbstractC9025a.m17650h(AbstractC9025a.m17668z(C9978t.f23425a)).getDescriptor();
    private static final InterfaceC9129f longArrayDescriptor;
    private static final InterfaceC9129f stringArrayDescriptor;
    private static final InterfaceC9129f stringListDescriptor;

    static {
        C9960c0 c9960c0 = C9960c0.f23411a;
        stringListDescriptor = AbstractC9025a.m17650h(AbstractC9025a.m17635C(c9960c0)).getDescriptor();
        booleanArrayDescriptor = AbstractC9025a.m17644b().getDescriptor();
        charArrayDescriptor = AbstractC9025a.m17646d().getDescriptor();
        doubleArrayDescriptor = AbstractC9025a.m17647e().getDescriptor();
        floatArrayDescriptor = AbstractC9025a.m17648f().getDescriptor();
        intArrayDescriptor = AbstractC9025a.m17649g().getDescriptor();
        longArrayDescriptor = AbstractC9025a.m17651i().getDescriptor();
        stringArrayDescriptor = AbstractC9025a.m17643a(AbstractC9983y.m20315b(String.class), AbstractC9025a.m17635C(c9960c0)).getDescriptor();
    }

    public static final InterfaceC9129f getBooleanArrayDescriptor() {
        return booleanArrayDescriptor;
    }

    public static final InterfaceC9129f getCharArrayDescriptor() {
        return charArrayDescriptor;
    }

    public static final InterfaceC9129f getDoubleArrayDescriptor() {
        return doubleArrayDescriptor;
    }

    public static final InterfaceC9129f getFloatArrayDescriptor() {
        return floatArrayDescriptor;
    }

    public static final InterfaceC9129f getIntArrayDescriptor() {
        return intArrayDescriptor;
    }

    public static final InterfaceC9129f getIntListDescriptor() {
        return intListDescriptor;
    }

    public static final InterfaceC9129f getLongArrayDescriptor() {
        return longArrayDescriptor;
    }

    public static final InterfaceC9129f getStringArrayDescriptor() {
        return stringArrayDescriptor;
    }

    public static /* synthetic */ void getStringArrayDescriptor$annotations() {
    }

    public static final InterfaceC9129f getStringListDescriptor() {
        return stringListDescriptor;
    }
}
