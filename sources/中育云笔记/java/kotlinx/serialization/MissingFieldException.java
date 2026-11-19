package kotlinx.serialization;

import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
public final class MissingFieldException extends SerializationException {

    /* renamed from: c */
    public final List f24058c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(List missingFields, String str, Throwable th) {
        super(str, th);
        AbstractC9979u.m20294g(missingFields, "missingFields");
        this.f24058c = missingFields;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MissingFieldException(List missingFields, String serialName) {
        String str;
        AbstractC9979u.m20294g(missingFields, "missingFields");
        AbstractC9979u.m20294g(serialName, "serialName");
        if (missingFields.size() == 1) {
            str = "Field '" + ((String) missingFields.get(0)) + "' is required for type with serial name '" + serialName + "', but it was missing";
        } else {
            str = "Fields " + missingFields + " are required for type with serial name '" + serialName + "', but they were missing";
        }
        this(missingFields, str, null);
    }
}
