package androidx.camera.core.impl;

import androidx.camera.core.DynamicRange;
import androidx.core.util.Preconditions;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8810v0;

/* loaded from: classes.dex */
public final class DynamicRanges {
    public static final DynamicRanges INSTANCE = new DynamicRanges();

    private DynamicRanges() {
    }

    private final boolean canMatchBitDepth(DynamicRange dynamicRange, DynamicRange dynamicRange2) {
        Preconditions.checkState(dynamicRange2.isFullySpecified(), "Fully specified range is not actually fully specified.");
        return dynamicRange.getBitDepth() == 0 || dynamicRange.getBitDepth() == dynamicRange2.getBitDepth();
    }

    private final boolean canMatchEncoding(DynamicRange dynamicRange, DynamicRange dynamicRange2) {
        Preconditions.checkState(dynamicRange2.isFullySpecified(), "Fully specified range is not actually fully specified.");
        int encoding = dynamicRange.getEncoding();
        if (encoding == 0) {
            return true;
        }
        int encoding2 = dynamicRange2.getEncoding();
        return (encoding == 2 && encoding2 != 1) || encoding == encoding2;
    }

    public static final boolean canResolve(DynamicRange dynamicRangeToTest, Set<DynamicRange> fullySpecifiedDynamicRanges) {
        Object next;
        AbstractC9133u.m16133g(dynamicRangeToTest, "dynamicRangeToTest");
        AbstractC9133u.m16133g(fullySpecifiedDynamicRanges, "fullySpecifiedDynamicRanges");
        if (dynamicRangeToTest.isFullySpecified()) {
            return fullySpecifiedDynamicRanges.contains(dynamicRangeToTest);
        }
        Iterator<T> it = fullySpecifiedDynamicRanges.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (INSTANCE.canResolveUnderSpecifiedTo(dynamicRangeToTest, (DynamicRange) next)) {
                break;
            }
        }
        return next != null;
    }

    private final boolean canResolveUnderSpecifiedTo(DynamicRange dynamicRange, DynamicRange dynamicRange2) {
        return canMatchBitDepth(dynamicRange, dynamicRange2) && canMatchEncoding(dynamicRange, dynamicRange2);
    }

    public static final Set<DynamicRange> findAllPossibleMatches(Set<DynamicRange> dynamicRangesToTest, Set<DynamicRange> fullySpecifiedDynamicRanges) {
        AbstractC9133u.m16133g(dynamicRangesToTest, "dynamicRangesToTest");
        AbstractC9133u.m16133g(fullySpecifiedDynamicRanges, "fullySpecifiedDynamicRanges");
        if (dynamicRangesToTest.isEmpty()) {
            throw new IllegalArgumentException("Candidate dynamic range set must contain at least 1 candidate dynamic range.");
        }
        Set setM14782b = AbstractC8810v0.m14782b();
        for (DynamicRange dynamicRange : dynamicRangesToTest) {
            if (!dynamicRange.isFullySpecified()) {
                for (DynamicRange dynamicRange2 : fullySpecifiedDynamicRanges) {
                    if (INSTANCE.canResolveUnderSpecifiedTo(dynamicRange, dynamicRange2)) {
                        setM14782b.add(dynamicRange2);
                    }
                }
            } else if (fullySpecifiedDynamicRanges.contains(dynamicRange)) {
                setM14782b.add(dynamicRange);
            }
        }
        return AbstractC8810v0.m14781a(setM14782b);
    }
}
