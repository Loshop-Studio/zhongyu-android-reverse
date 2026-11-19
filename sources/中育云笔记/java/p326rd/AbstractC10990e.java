package p326rd;

import kotlin.jvm.internal.AbstractC9979u;
import kotlin.time.DurationUnit;

/* renamed from: rd.e */
/* loaded from: classes6.dex */
public abstract class AbstractC10990e extends AbstractC10989d {
    /* renamed from: e */
    public static final DurationUnit m24234e(char c10, boolean z10) {
        if (!z10) {
            if (c10 == 'D') {
                return DurationUnit.f23462j;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c10);
        }
        if (c10 == 'H') {
            return DurationUnit.f23461i;
        }
        if (c10 == 'M') {
            return DurationUnit.f23460h;
        }
        if (c10 == 'S') {
            return DurationUnit.f23459g;
        }
        throw new IllegalArgumentException("Invalid duration ISO time unit: " + c10);
    }

    /* renamed from: f */
    public static final DurationUnit m24235f(String shortName) {
        AbstractC9979u.m20294g(shortName, "shortName");
        int iHashCode = shortName.hashCode();
        if (iHashCode != 100) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 115) {
                        if (iHashCode != 3494) {
                            if (iHashCode != 3525) {
                                if (iHashCode == 3742 && shortName.equals("us")) {
                                    return DurationUnit.f23457e;
                                }
                            } else if (shortName.equals("ns")) {
                                return DurationUnit.f23456d;
                            }
                        } else if (shortName.equals("ms")) {
                            return DurationUnit.f23458f;
                        }
                    } else if (shortName.equals("s")) {
                        return DurationUnit.f23459g;
                    }
                } else if (shortName.equals("m")) {
                    return DurationUnit.f23460h;
                }
            } else if (shortName.equals("h")) {
                return DurationUnit.f23461i;
            }
        } else if (shortName.equals("d")) {
            return DurationUnit.f23462j;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
    }
}
