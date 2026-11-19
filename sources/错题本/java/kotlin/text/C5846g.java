package kotlin.text;

import androidx.compose.material3.AbstractC1923c;
import p000a.AbstractC0000a;

/* renamed from: kotlin.text.g */
/* loaded from: classes4.dex */
public final class C5846g {

    /* renamed from: b */
    public static final C5846g f9250b = new C5846g();

    /* renamed from: a */
    public final boolean f9251a = true;

    public C5846g() {
        if (AbstractC0000a.m3d("")) {
            return;
        }
        AbstractC0000a.m3d("");
    }

    /* renamed from: a */
    public final void m5368a(StringBuilder sb, String str) {
        AbstractC1923c.m1060x(sb, str, "prefix = \"", "", "\",");
        sb.append('\n');
        sb.append(str);
        sb.append("suffix = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("removeLeadingZeros = ");
        sb.append(false);
        sb.append(',');
        sb.append('\n');
        sb.append(str);
        sb.append("minLength = ");
        sb.append(1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NumberHexFormat(\n");
        m5368a(sb, "    ");
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
