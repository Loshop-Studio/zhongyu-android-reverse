package androidx.savedstate.serialization;

import androidx.exifinterface.media.ExifInterface;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9135w;
import p009a8.InterfaceC0049e;
import p246s8.AbstractC10067q;
import p246s8.InterfaceC10052b;
import p300x7.InterfaceC10559a;
import p301x8.AbstractC10583a;

/* loaded from: classes3.dex */
public final class SavedStateRegistryOwnerDelegateKt {
    public static final /* synthetic */ <T> InterfaceC0049e saved(SavedStateRegistryOwner savedStateRegistryOwner, String str, SavedStateConfiguration configuration, InterfaceC10559a init) {
        AbstractC9133u.m16133g(savedStateRegistryOwner, "<this>");
        AbstractC9133u.m16133g(configuration, "configuration");
        AbstractC9133u.m16133g(init, "init");
        AbstractC10583a serializersModule = configuration.getSerializersModule();
        AbstractC9133u.m16139m(6, ExifInterface.GPS_DIRECTION_TRUE);
        AbstractC9135w.m16152a("kotlinx.serialization.serializer.withModule");
        return saved(savedStateRegistryOwner, AbstractC10067q.m18780d(serializersModule, null), str, configuration, init);
    }

    public static /* synthetic */ InterfaceC0049e saved$default(SavedStateRegistryOwner savedStateRegistryOwner, String str, SavedStateConfiguration configuration, InterfaceC10559a init, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            configuration = SavedStateConfiguration.DEFAULT;
        }
        AbstractC9133u.m16133g(savedStateRegistryOwner, "<this>");
        AbstractC9133u.m16133g(configuration, "configuration");
        AbstractC9133u.m16133g(init, "init");
        AbstractC10583a serializersModule = configuration.getSerializersModule();
        AbstractC9133u.m16139m(6, ExifInterface.GPS_DIRECTION_TRUE);
        AbstractC9135w.m16152a("kotlinx.serialization.serializer.withModule");
        return saved(savedStateRegistryOwner, AbstractC10067q.m18780d(serializersModule, null), str, configuration, init);
    }

    public static final <T> InterfaceC0049e saved(SavedStateRegistryOwner savedStateRegistryOwner, InterfaceC10052b serializer, String str, SavedStateConfiguration configuration, InterfaceC10559a init) {
        AbstractC9133u.m16133g(savedStateRegistryOwner, "<this>");
        AbstractC9133u.m16133g(serializer, "serializer");
        AbstractC9133u.m16133g(configuration, "configuration");
        AbstractC9133u.m16133g(init, "init");
        return new SavedStateRegistryOwnerDelegate(savedStateRegistryOwner.getSavedStateRegistry(), serializer, str, configuration, init);
    }

    public static /* synthetic */ InterfaceC0049e saved$default(SavedStateRegistryOwner savedStateRegistryOwner, InterfaceC10052b interfaceC10052b, String str, SavedStateConfiguration savedStateConfiguration, InterfaceC10559a interfaceC10559a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        return saved(savedStateRegistryOwner, interfaceC10052b, str, savedStateConfiguration, interfaceC10559a);
    }
}
