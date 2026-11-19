package p097e7;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e7.g */
/* loaded from: classes5.dex */
public final class C7863g {

    /* renamed from: a */
    public int f13223a;

    /* renamed from: b */
    public String f13224b;

    /* renamed from: c */
    public Function0 f13225c;

    public C7863g(int i9, String displayText, Function0 clickCallback) {
        Intrinsics.checkNotNullParameter(displayText, "displayText");
        Intrinsics.checkNotNullParameter(clickCallback, "clickCallback");
        this.f13223a = i9;
        this.f13224b = displayText;
        this.f13225c = clickCallback;
    }

    /* renamed from: a */
    public final Function0 m12352a() {
        return this.f13225c;
    }

    /* renamed from: b */
    public final String m12353b() {
        return this.f13224b;
    }

    /* renamed from: c */
    public final int m12354c() {
        return this.f13223a;
    }
}
