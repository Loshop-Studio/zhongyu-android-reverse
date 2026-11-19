package androidx.savedstate.compose.serialization.serializers;

import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9981w;
import p049ce.AbstractC5447q;
import p049ce.InterfaceC5432b;

/* loaded from: classes3.dex */
public final class SnapshotStateMapSerializerKt {
    public static final /* synthetic */ <K, V> SnapshotStateMapSerializer<K, V> SnapshotStateMapSerializer() {
        AbstractC9979u.m20300m(6, "K");
        AbstractC9981w.m20313a("kotlinx.serialization.serializer.simple");
        InterfaceC5432b interfaceC5432bM2954d = AbstractC5447q.m2954d(null);
        AbstractC9979u.m20300m(6, ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        AbstractC9981w.m20313a("kotlinx.serialization.serializer.simple");
        return new SnapshotStateMapSerializer<>(interfaceC5432bM2954d, AbstractC5447q.m2954d(null));
    }
}
