package kotlinx.serialization;

import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes5.dex */
public final class MissingFieldException extends SerializationException {

    /* renamed from: a */
    public final List f18193a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(List missingFields, String str, Throwable th) {
        super(str, th);
        AbstractC9133u.m16133g(missingFields, "missingFields");
        this.f18193a = missingFields;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MissingFieldException(List missingFields, String serialName) {
        String str;
        AbstractC9133u.m16133g(missingFields, "missingFields");
        AbstractC9133u.m16133g(serialName, "serialName");
        if (missingFields.size() == 1) {
            str = "Field '" + ((String) missingFields.get(0)) + "' is required for type with serial name '" + serialName + "', but it was missing";
        } else {
            str = "Fields " + missingFields + " are required for type with serial name '" + serialName + "', but they were missing";
        }
        this(missingFields, str, null);
    }
}
