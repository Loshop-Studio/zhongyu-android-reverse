package p124h8;

import kotlin.jvm.internal.AbstractC9133u;
import kotlin.time.DurationUnit;

/* renamed from: h8.e */
/* loaded from: classes5.dex */
public abstract class AbstractC8742e extends AbstractC8741d {
    /* renamed from: e */
    public static final DurationUnit m14393e(char c10, boolean z10) {
        if (!z10) {
            if (c10 == 'D') {
                return DurationUnit.f17533h;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c10);
        }
        if (c10 == 'H') {
            return DurationUnit.f17532g;
        }
        if (c10 == 'M') {
            return DurationUnit.f17531f;
        }
        if (c10 == 'S') {
            return DurationUnit.f17530e;
        }
        throw new IllegalArgumentException("Invalid duration ISO time unit: " + c10);
    }

    /* renamed from: f */
    public static final DurationUnit m14394f(String shortName) {
        AbstractC9133u.m16133g(shortName, "shortName");
        int iHashCode = shortName.hashCode();
        if (iHashCode != 100) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 115) {
                        if (iHashCode != 3494) {
                            if (iHashCode != 3525) {
                                if (iHashCode == 3742 && shortName.equals("us")) {
                                    return DurationUnit.f17528c;
                                }
                            } else if (shortName.equals("ns")) {
                                return DurationUnit.f17527b;
                            }
                        } else if (shortName.equals("ms")) {
                            return DurationUnit.f17529d;
                        }
                    } else if (shortName.equals("s")) {
                        return DurationUnit.f17530e;
                    }
                } else if (shortName.equals("m")) {
                    return DurationUnit.f17531f;
                }
            } else if (shortName.equals("h")) {
                return DurationUnit.f17532g;
            }
        } else if (shortName.equals("d")) {
            return DurationUnit.f17533h;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
    }
}
