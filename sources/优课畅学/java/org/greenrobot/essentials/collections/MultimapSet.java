package org.greenrobot.essentials.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p324z9.AbstractC10747a;

/* loaded from: classes5.dex */
public class MultimapSet extends AbstractC10747a {

    /* renamed from: b */
    public final SetType f19239b;

    public enum SetType {
        REGULAR,
        THREAD_SAFE
    }

    /* renamed from: org.greenrobot.essentials.collections.MultimapSet$a */
    public static /* synthetic */ class C9623a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19243a;

        static {
            int[] iArr = new int[SetType.values().length];
            f19243a = iArr;
            try {
                iArr[SetType.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19243a[SetType.THREAD_SAFE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MultimapSet(Map map, SetType setType) {
        super(map);
        this.f19239b = setType;
    }

    /* renamed from: f */
    public static MultimapSet m18167f(SetType setType) {
        return new MultimapSet(new HashMap(), setType);
    }

    @Override // p324z9.AbstractC10747a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Set mo18168a() {
        int i10 = C9623a.f19243a[this.f19239b.ordinal()];
        if (i10 == 1) {
            return new HashSet();
        }
        if (i10 == 2) {
            return new CopyOnWriteArraySet();
        }
        throw new IllegalStateException("Unknown set type: " + this.f19239b);
    }
}
