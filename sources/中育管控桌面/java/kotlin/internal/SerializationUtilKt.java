package kotlin.internal;

import java.io.InvalidObjectException;
import kotlin.Metadata;

@Metadata(m7879d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\t\u0010\u0000\u001a\u00020\u0001H\u0081\b*\f\b\u0000\u0010\u0002\"\u00020\u00032\u00020\u0003¨\u0006\u0004"}, m7880d2 = {"throwReadObjectNotSupported", "", "ReadObjectParameterType", "Ljava/io/ObjectInputStream;", "kotlin-stdlib"}, m7881k = 2, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class SerializationUtilKt {
    @InlineOnly
    private static final Void throwReadObjectNotSupported() throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }
}
