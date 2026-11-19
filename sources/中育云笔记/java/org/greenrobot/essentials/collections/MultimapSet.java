package org.greenrobot.essentials.collections;

import bf.AbstractC5200a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes6.dex */
public class MultimapSet extends AbstractC5200a {

    /* renamed from: d */
    public final SetType f25513d;

    public enum SetType {
        REGULAR,
        THREAD_SAFE
    }

    /* renamed from: org.greenrobot.essentials.collections.MultimapSet$a */
    public static /* synthetic */ class C10584a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25517a;

        static {
            int[] iArr = new int[SetType.values().length];
            f25517a = iArr;
            try {
                iArr[SetType.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25517a[SetType.THREAD_SAFE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MultimapSet(Map map, SetType setType) {
        super(map);
        this.f25513d = setType;
    }

    /* renamed from: f */
    public static MultimapSet m22367f(SetType setType) {
        return new MultimapSet(new HashMap(), setType);
    }

    @Override // bf.AbstractC5200a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Set mo2763a() {
        int i10 = C10584a.f25517a[this.f25513d.ordinal()];
        if (i10 == 1) {
            return new HashSet();
        }
        if (i10 == 2) {
            return new CopyOnWriteArraySet();
        }
        throw new IllegalStateException("Unknown set type: " + this.f25513d);
    }
}
