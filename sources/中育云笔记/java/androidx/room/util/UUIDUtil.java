package androidx.room.util;

import androidx.annotation.RestrictTo;
import java.nio.ByteBuffer;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC9979u;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class UUIDUtil {
    public static final UUID convertByteToUUID(byte[] bytes) {
        AbstractC9979u.m20294g(bytes, "bytes");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bytes);
        return new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong());
    }

    public static final byte[] convertUUIDToByte(UUID uuid) {
        AbstractC9979u.m20294g(uuid, "uuid");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[16]);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        byte[] bArrArray = byteBufferWrap.array();
        AbstractC9979u.m20293f(bArrArray, "array(...)");
        return bArrArray;
    }
}
