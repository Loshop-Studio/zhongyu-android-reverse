package p132o6;

import kotlin.p102io.encoding.Base64$PaddingOption;

/* renamed from: o6.b */
/* loaded from: classes2.dex */
public class C6275b {

    /* renamed from: d */
    public static final C6274a f10025d;

    /* renamed from: a */
    public final boolean f10026a;

    /* renamed from: b */
    public final boolean f10027b;

    /* renamed from: c */
    public final Base64$PaddingOption f10028c;

    static {
        Base64$PaddingOption base64$PaddingOption = Base64$PaddingOption.PRESENT;
        f10025d = new C6274a(false, false, -1, base64$PaddingOption);
        new C6275b(true, false, -1, base64$PaddingOption);
        new C6275b(false, true, 76, base64$PaddingOption);
        new C6275b(false, true, 64, base64$PaddingOption);
    }

    public C6275b(boolean z8, boolean z9, int i, Base64$PaddingOption base64$PaddingOption) {
        this.f10026a = z8;
        this.f10027b = z9;
        this.f10028c = base64$PaddingOption;
        if (z8 && z9) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
