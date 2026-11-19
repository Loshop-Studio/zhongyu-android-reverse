package org.greenrobot.essentials.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p193o9.AbstractC8729a;

/* loaded from: classes5.dex */
public class MultimapSet extends AbstractC8729a {

    /* renamed from: b */
    public final SetType f14912b;

    public enum SetType {
        REGULAR,
        THREAD_SAFE
    }

    /* renamed from: org.greenrobot.essentials.collections.MultimapSet$a */
    public static /* synthetic */ class C8784a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14916a;

        static {
            int[] iArr = new int[SetType.values().length];
            f14916a = iArr;
            try {
                iArr[SetType.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14916a[SetType.THREAD_SAFE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MultimapSet(Map map, SetType setType) {
        super(map);
        this.f14912b = setType;
    }

    /* renamed from: f */
    public static MultimapSet m14675f(SetType setType) {
        return new MultimapSet(new HashMap(), setType);
    }

    @Override // p193o9.AbstractC8729a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Set mo14368a() {
        int i10 = C8784a.f14916a[this.f14912b.ordinal()];
        if (i10 == 1) {
            return new HashSet();
        }
        if (i10 == 2) {
            return new CopyOnWriteArraySet();
        }
        throw new IllegalStateException("Unknown set type: " + this.f14912b);
    }
}
