package com.friday.common.util;

import androidx.compose.runtime.internal.StabilityInferred;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.enums.AbstractC9953a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10793c0;
import p425yc.InterfaceC11943a;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class SyncException extends Exception {

    /* renamed from: e */
    public static final C5972a f6168e = new C5972a(null);

    /* renamed from: f */
    public static final int f6169f = 8;

    /* renamed from: c */
    public final Kind f6170c;

    /* renamed from: d */
    public final String f6171d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Kind {

        /* renamed from: c */
        public static final Kind f6172c = new Kind(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);

        /* renamed from: d */
        public static final Kind f6173d = new Kind("LOCAL_FILE_MISSING", 1);

        /* renamed from: e */
        public static final Kind f6174e = new Kind("PARENT_MISSING", 2);

        /* renamed from: f */
        public static final Kind f6175f = new Kind("PARENT_SYNC_FAILED", 3);

        /* renamed from: g */
        public static final Kind f6176g = new Kind("RATE_LIMIT", 4);

        /* renamed from: h */
        public static final Kind f6177h = new Kind("SERVICE_FAILED", 5);

        /* renamed from: i */
        public static final /* synthetic */ Kind[] f6178i;

        /* renamed from: j */
        public static final /* synthetic */ InterfaceC11943a f6179j;

        static {
            Kind[] kindArrM5378a = m5378a();
            f6178i = kindArrM5378a;
            f6179j = AbstractC9953a.m20230a(kindArrM5378a);
        }

        public Kind(String str, int i10) {
        }

        /* renamed from: a */
        public static final /* synthetic */ Kind[] m5378a() {
            return new Kind[]{f6172c, f6173d, f6174e, f6175f, f6176g, f6177h};
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) f6178i.clone();
        }
    }

    /* renamed from: com.friday.common.util.SyncException$a */
    public static final class C5972a {
        public /* synthetic */ C5972a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ boolean m5379b(C5972a c5972a, Integer num, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = null;
            }
            if ((i10 & 2) != 0) {
                str = null;
            }
            return c5972a.m5380a(num, str);
        }

        /* renamed from: a */
        public final boolean m5380a(Integer num, String str) {
            return (num != null && num.intValue() == 503) || (str != null && AbstractC10793c0.m23108U(str, "操作太频繁", false, 2, null));
        }

        /* renamed from: c */
        public final SyncException m5381c(Integer num, String str) {
            return m5380a(num, str) ? new SyncException(Kind.f6176g, str) : new SyncException(Kind.f6177h, str);
        }

        public C5972a() {
        }
    }

    public /* synthetic */ SyncException(Kind kind, String str, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? Kind.f6172c : kind, (i10 & 2) != 0 ? null : str);
    }

    /* renamed from: a */
    public final Kind m5376a() {
        return this.f6170c;
    }

    /* renamed from: c */
    public final boolean m5377c() {
        return this.f6170c == Kind.f6176g;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f6171d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncException(Kind kind, String str) {
        super(str);
        AbstractC9979u.m20294g(kind, "kind");
        this.f6170c = kind;
        this.f6171d = str;
    }
}
