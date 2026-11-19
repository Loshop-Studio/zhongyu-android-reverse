package org.greenrobot.essentials.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p306y8.AbstractC9969a;

/* loaded from: classes5.dex */
public class MultimapSet extends AbstractC9969a {

    /* renamed from: b */
    public final SetType f16003b;

    public enum SetType {
        REGULAR,
        THREAD_SAFE
    }

    /* renamed from: org.greenrobot.essentials.collections.MultimapSet$a */
    public static /* synthetic */ class C9282a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16007a;

        static {
            int[] iArr = new int[SetType.values().length];
            f16007a = iArr;
            try {
                iArr[SetType.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16007a[SetType.THREAD_SAFE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MultimapSet(Map map, SetType setType) {
        super(map);
        this.f16003b = setType;
    }

    /* renamed from: f */
    public static MultimapSet m15087f(SetType setType) {
        return new MultimapSet(new HashMap(), setType);
    }

    @Override // p306y8.AbstractC9969a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Set mo15088a() {
        int i9 = C9282a.f16007a[this.f16003b.ordinal()];
        if (i9 == 1) {
            return new HashSet();
        }
        if (i9 == 2) {
            return new CopyOnWriteArraySet();
        }
        throw new IllegalStateException("Unknown set type: " + this.f16003b);
    }
}
