package kotlin.text;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: kotlin.text.h */
/* loaded from: classes4.dex */
public final class C5847h {

    /* renamed from: d */
    public static final C5847h f9252d;

    /* renamed from: a */
    public final boolean f9253a;

    /* renamed from: b */
    public final C5845f f9254b;

    /* renamed from: c */
    public final C5846g f9255c;

    static {
        C5845f c5845f = C5845f.f9249a;
        C5846g c5846g = C5846g.f9250b;
        f9252d = new C5847h(false, c5845f, c5846g);
        new C5847h(true, c5845f, c5846g);
    }

    public C5847h(boolean z8, C5845f bytes, C5846g number) {
        AbstractC5830k.m5330g(bytes, "bytes");
        AbstractC5830k.m5330g(number, "number");
        this.f9253a = z8;
        this.f9254b = bytes;
        this.f9255c = number;
    }

    public final String toString() {
        StringBuilder sbM97v = AbstractC0037f.m97v("HexFormat(\n    upperCase = ");
        sbM97v.append(this.f9253a);
        sbM97v.append(",\n    bytes = BytesHexFormat(\n");
        this.f9254b.m5367a(sbM97v, "        ");
        sbM97v.append('\n');
        sbM97v.append("    ),");
        sbM97v.append('\n');
        sbM97v.append("    number = NumberHexFormat(");
        sbM97v.append('\n');
        this.f9255c.m5368a(sbM97v, "        ");
        sbM97v.append('\n');
        sbM97v.append("    )");
        sbM97v.append('\n');
        sbM97v.append(")");
        return sbM97v.toString();
    }
}
