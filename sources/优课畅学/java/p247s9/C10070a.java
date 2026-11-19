package p247s9;

import kotlin.jvm.internal.AbstractC9133u;
import okio.BufferedSink;
import p123h7.C8736p;

/* renamed from: s9.a */
/* loaded from: classes5.dex */
public final class C10070a {

    /* renamed from: a */
    public final String f20118a;

    /* renamed from: b */
    public final String f20119b;

    /* renamed from: c */
    public final String f20120c;

    public C10070a(String sections, String ranges, String mappings) {
        AbstractC9133u.m16133g(sections, "sections");
        AbstractC9133u.m16133g(ranges, "ranges");
        AbstractC9133u.m16133g(mappings, "mappings");
        this.f20118a = sections;
        this.f20119b = ranges;
        this.f20120c = mappings;
    }

    /* renamed from: a */
    public final int m18799a(int i10, int i11, int i12) {
        int i13;
        int i14 = i10 & 127;
        int i15 = i12 - 1;
        while (true) {
            if (i11 > i15) {
                i13 = (-i11) - 1;
                break;
            }
            i13 = (i11 + i15) / 2;
            int iM16135i = AbstractC9133u.m16135i(i14, this.f20119b.charAt(i13 * 4));
            if (iM16135i >= 0) {
                if (iM16135i <= 0) {
                    break;
                }
                i11 = i13 + 1;
            } else {
                i15 = i13 - 1;
            }
        }
        return i13 >= 0 ? i13 * 4 : ((-i13) - 2) * 4;
    }

    /* renamed from: b */
    public final int m18800b(int i10) {
        int i11;
        int i12 = (i10 & 2097024) >> 7;
        int length = (this.f20118a.length() / 4) - 1;
        int i13 = 0;
        while (true) {
            if (i13 > length) {
                i11 = (-i13) - 1;
                break;
            }
            i11 = (i13 + length) / 2;
            int iM16135i = AbstractC9133u.m16135i(i12, AbstractC10072c.m18803a(this.f20118a, i11 * 4));
            if (iM16135i >= 0) {
                if (iM16135i <= 0) {
                    break;
                }
                i13 = i11 + 1;
            } else {
                length = i11 - 1;
            }
        }
        return i11 >= 0 ? i11 * 4 : ((-i11) - 2) * 4;
    }

    /* renamed from: c */
    public final boolean m18801c(int i10, BufferedSink sink) {
        AbstractC9133u.m16133g(sink, "sink");
        int iM18800b = m18800b(i10);
        int iM18799a = m18799a(i10, AbstractC10072c.m18803a(this.f20118a, iM18800b + 2), iM18800b + 4 < this.f20118a.length() ? AbstractC10072c.m18803a(this.f20118a, iM18800b + 6) : this.f20119b.length() / 4);
        char cCharAt = this.f20119b.charAt(iM18799a + 1);
        if (cCharAt >= 0 && cCharAt < '@') {
            int iM18803a = AbstractC10072c.m18803a(this.f20119b, iM18799a + 2);
            sink.writeUtf8(this.f20120c, iM18803a, cCharAt + iM18803a);
            return true;
        }
        if ('@' <= cCharAt && cCharAt < 'P') {
            sink.writeUtf8CodePoint(i10 - (this.f20119b.charAt(iM18799a + 3) | (((cCharAt & 15) << 14) | (this.f20119b.charAt(iM18799a + 2) << 7))));
            return true;
        }
        if ('P' <= cCharAt && cCharAt < '`') {
            sink.writeUtf8CodePoint(i10 + (this.f20119b.charAt(iM18799a + 3) | ((cCharAt & 15) << 14) | (this.f20119b.charAt(iM18799a + 2) << 7)));
            return true;
        }
        if (cCharAt == 'w') {
            C8736p c8736p = C8736p.f16368a;
            return true;
        }
        if (cCharAt == 'x') {
            sink.writeUtf8CodePoint(i10);
            return true;
        }
        if (cCharAt == 'y') {
            sink.writeUtf8CodePoint(i10);
            return false;
        }
        if (cCharAt == 'z') {
            sink.writeByte(this.f20119b.charAt(iM18799a + 2));
            return true;
        }
        if (cCharAt == '{') {
            sink.writeByte(this.f20119b.charAt(iM18799a + 2) | 128);
            return true;
        }
        if (cCharAt == '|') {
            sink.writeByte(this.f20119b.charAt(iM18799a + 2));
            sink.writeByte(this.f20119b.charAt(iM18799a + 3));
            return true;
        }
        if (cCharAt == '}') {
            sink.writeByte(this.f20119b.charAt(iM18799a + 2) | 128);
            sink.writeByte(this.f20119b.charAt(iM18799a + 3));
            return true;
        }
        if (cCharAt == '~') {
            sink.writeByte(this.f20119b.charAt(iM18799a + 2));
            sink.writeByte(this.f20119b.charAt(iM18799a + 3) | 128);
            return true;
        }
        if (cCharAt == 127) {
            sink.writeByte(this.f20119b.charAt(iM18799a + 2) | 128);
            sink.writeByte(this.f20119b.charAt(iM18799a + 3) | 128);
            return true;
        }
        throw new IllegalStateException(("unexpected rangesIndex for " + i10).toString());
    }
}
