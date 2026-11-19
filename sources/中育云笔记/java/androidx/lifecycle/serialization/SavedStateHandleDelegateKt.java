package androidx.lifecycle.serialization;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.SavedStateHandle;
import androidx.savedstate.serialization.SavedStateConfiguration;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9981w;
import p049ce.AbstractC5447q;
import p049ce.InterfaceC5432b;
import p181hd.InterfaceC9529a;
import p182he.AbstractC9553a;
import p226kd.InterfaceC9916c;

/* loaded from: classes2.dex */
public final class SavedStateHandleDelegateKt {
    public static final /* synthetic */ <T> InterfaceC9916c saved(SavedStateHandle savedStateHandle, String str, SavedStateConfiguration configuration, InterfaceC9529a init) {
        AbstractC9979u.m20294g(savedStateHandle, "<this>");
        AbstractC9979u.m20294g(configuration, "configuration");
        AbstractC9979u.m20294g(init, "init");
        AbstractC9553a serializersModule = configuration.getSerializersModule();
        AbstractC9979u.m20300m(6, ExifInterface.GPS_DIRECTION_TRUE);
        AbstractC9981w.m20313a("kotlinx.serialization.serializer.withModule");
        return saved(savedStateHandle, AbstractC5447q.m2952b(serializersModule, null), str, configuration, init);
    }

    public static /* synthetic */ InterfaceC9916c saved$default(SavedStateHandle savedStateHandle, String str, SavedStateConfiguration configuration, InterfaceC9529a init, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            configuration = SavedStateConfiguration.DEFAULT;
        }
        AbstractC9979u.m20294g(savedStateHandle, "<this>");
        AbstractC9979u.m20294g(configuration, "configuration");
        AbstractC9979u.m20294g(init, "init");
        AbstractC9553a serializersModule = configuration.getSerializersModule();
        AbstractC9979u.m20300m(6, ExifInterface.GPS_DIRECTION_TRUE);
        AbstractC9981w.m20313a("kotlinx.serialization.serializer.withModule");
        return saved(savedStateHandle, AbstractC5447q.m2952b(serializersModule, null), str, configuration, init);
    }

    public static final <T> InterfaceC9916c saved(SavedStateHandle savedStateHandle, InterfaceC5432b serializer, String str, SavedStateConfiguration configuration, InterfaceC9529a init) {
        AbstractC9979u.m20294g(savedStateHandle, "<this>");
        AbstractC9979u.m20294g(serializer, "serializer");
        AbstractC9979u.m20294g(configuration, "configuration");
        AbstractC9979u.m20294g(init, "init");
        return new SavedStateHandleDelegate(savedStateHandle, serializer, str, configuration, init);
    }

    public static /* synthetic */ InterfaceC9916c saved$default(SavedStateHandle savedStateHandle, InterfaceC5432b interfaceC5432b, String str, SavedStateConfiguration savedStateConfiguration, InterfaceC9529a interfaceC9529a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        return saved(savedStateHandle, interfaceC5432b, str, savedStateConfiguration, interfaceC9529a);
    }
}
