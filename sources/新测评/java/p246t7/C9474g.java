package p246t7;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t7.g */
/* loaded from: classes5.dex */
public final class C9474g {

    /* renamed from: a */
    public int f16556a;

    /* renamed from: b */
    public String f16557b;

    /* renamed from: c */
    public Function0 f16558c;

    public C9474g(int i10, String displayText, Function0 clickCallback) {
        Intrinsics.checkNotNullParameter(displayText, "displayText");
        Intrinsics.checkNotNullParameter(clickCallback, "clickCallback");
        this.f16556a = i10;
        this.f16557b = displayText;
        this.f16558c = clickCallback;
    }

    /* renamed from: a */
    public final Function0 m15853a() {
        return this.f16558c;
    }

    /* renamed from: b */
    public final String m15854b() {
        return this.f16557b;
    }

    /* renamed from: c */
    public final int m15855c() {
        return this.f16556a;
    }
}
