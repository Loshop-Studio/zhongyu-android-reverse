package kotlin.text;

import androidx.compose.material3.AbstractC1923c;
import p000a.AbstractC0000a;

/* renamed from: kotlin.text.f */
/* loaded from: classes4.dex */
public final class C5845f {

    /* renamed from: a */
    public static final C5845f f9249a;

    static {
        C5845f c5845f = new C5845f();
        if (!AbstractC0000a.m3d("  ") && !AbstractC0000a.m3d("") && !AbstractC0000a.m3d("")) {
            AbstractC0000a.m3d("");
        }
        f9249a = c5845f;
    }

    /* renamed from: a */
    public final void m5367a(StringBuilder sb, String str) {
        sb.append(str);
        sb.append("bytesPerLine = ");
        sb.append(Integer.MAX_VALUE);
        sb.append(",");
        sb.append('\n');
        sb.append(str);
        sb.append("bytesPerGroup = ");
        sb.append(Integer.MAX_VALUE);
        sb.append(",");
        sb.append('\n');
        sb.append(str);
        sb.append("groupSeparator = \"");
        sb.append("  ");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSeparator = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        AbstractC1923c.m1060x(sb, str, "bytePrefix = \"", "", "\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSuffix = \"");
        sb.append("");
        sb.append("\"");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BytesHexFormat(\n");
        m5367a(sb, "    ");
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
