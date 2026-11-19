package p130p5;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;

/* renamed from: p5.a */
/* loaded from: classes4.dex */
public final class C7601a {

    /* renamed from: a */
    public final String f10060a;

    /* renamed from: b */
    public final String f10061b;

    /* renamed from: c */
    public final String f10062c;

    public C7601a(String sections, String ranges, String mappings) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(ranges, "ranges");
        Intrinsics.checkNotNullParameter(mappings, "mappings");
        this.f10060a = sections;
        this.f10061b = ranges;
        this.f10062c = mappings;
    }

    /* renamed from: a */
    public final int m9009a(int i6, int i7, int i8) {
        int i9;
        int i10 = i6 & 127;
        int i11 = i8 - 1;
        while (true) {
            if (i7 > i11) {
                i9 = (-i7) - 1;
                break;
            }
            i9 = (i7 + i11) / 2;
            int iCompare = Intrinsics.compare(i10, (int) this.f10061b.charAt(i9 * 4));
            if (iCompare >= 0) {
                if (iCompare <= 0) {
                    break;
                }
                i7 = i9 + 1;
            } else {
                i11 = i9 - 1;
            }
        }
        return i9 >= 0 ? i9 * 4 : ((-i9) - 2) * 4;
    }

    /* renamed from: b */
    public final int m9010b(int i6) {
        int i7;
        int i8 = (i6 & 2097024) >> 7;
        int length = (this.f10060a.length() / 4) - 1;
        int i9 = 0;
        while (true) {
            if (i9 > length) {
                i7 = (-i9) - 1;
                break;
            }
            i7 = (i9 + length) / 2;
            int iCompare = Intrinsics.compare(i8, AbstractC7603c.m9013a(this.f10060a, i7 * 4));
            if (iCompare >= 0) {
                if (iCompare <= 0) {
                    break;
                }
                i9 = i7 + 1;
            } else {
                length = i7 - 1;
            }
        }
        return i7 >= 0 ? i7 * 4 : ((-i7) - 2) * 4;
    }

    /* renamed from: c */
    public final boolean m9011c(int i6, BufferedSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        int iM9010b = m9010b(i6);
        int iM9009a = m9009a(i6, AbstractC7603c.m9013a(this.f10060a, iM9010b + 2), iM9010b + 4 < this.f10060a.length() ? AbstractC7603c.m9013a(this.f10060a, iM9010b + 6) : this.f10061b.length() / 4);
        char cCharAt = this.f10061b.charAt(iM9009a + 1);
        if (cCharAt >= 0 && cCharAt < '@') {
            int iM9013a = AbstractC7603c.m9013a(this.f10061b, iM9009a + 2);
            sink.writeUtf8(this.f10062c, iM9013a, cCharAt + iM9013a);
            return true;
        }
        if ('@' <= cCharAt && cCharAt < 'P') {
            sink.writeUtf8CodePoint(i6 - (this.f10061b.charAt(iM9009a + 3) | (((cCharAt & 15) << 14) | (this.f10061b.charAt(iM9009a + 2) << 7))));
            return true;
        }
        if ('P' <= cCharAt && cCharAt < '`') {
            sink.writeUtf8CodePoint(i6 + (this.f10061b.charAt(iM9009a + 3) | ((cCharAt & 15) << 14) | (this.f10061b.charAt(iM9009a + 2) << 7)));
            return true;
        }
        if (cCharAt == 'w') {
            Unit unit = Unit.INSTANCE;
            return true;
        }
        if (cCharAt == 'x') {
            sink.writeUtf8CodePoint(i6);
            return true;
        }
        if (cCharAt == 'y') {
            sink.writeUtf8CodePoint(i6);
            return false;
        }
        if (cCharAt == 'z') {
            sink.writeByte(this.f10061b.charAt(iM9009a + 2));
            return true;
        }
        if (cCharAt == '{') {
            sink.writeByte(this.f10061b.charAt(iM9009a + 2) | 128);
            return true;
        }
        if (cCharAt == '|') {
            sink.writeByte(this.f10061b.charAt(iM9009a + 2));
            sink.writeByte(this.f10061b.charAt(iM9009a + 3));
            return true;
        }
        if (cCharAt == '}') {
            sink.writeByte(this.f10061b.charAt(iM9009a + 2) | 128);
            sink.writeByte(this.f10061b.charAt(iM9009a + 3));
            return true;
        }
        if (cCharAt == '~') {
            sink.writeByte(this.f10061b.charAt(iM9009a + 2));
            sink.writeByte(this.f10061b.charAt(iM9009a + 3) | 128);
            return true;
        }
        if (cCharAt == 127) {
            sink.writeByte(this.f10061b.charAt(iM9009a + 2) | 128);
            sink.writeByte(this.f10061b.charAt(iM9009a + 3) | 128);
            return true;
        }
        throw new IllegalStateException(("unexpected rangesIndex for " + i6).toString());
    }
}
