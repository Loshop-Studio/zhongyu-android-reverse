package androidx.window.core;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10773d;
import p310qd.AbstractC10793c0;

/* loaded from: classes3.dex */
public final class Version implements Comparable<Version> {
    private static final Version CURRENT;
    public static final Companion Companion = new Companion(null);
    private static final Version UNKNOWN = new Version(0, 0, 0, "");
    private static final Version VERSION_0_1 = new Version(0, 1, 0, "");
    private static final Version VERSION_1_0;
    private static final String VERSION_PATTERN_STRING = "(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?";
    private final InterfaceC10773d bigInteger$delegate;
    private final String description;
    private final int major;
    private final int minor;
    private final int patch;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final Version getCURRENT() {
            return Version.CURRENT;
        }

        public final Version getUNKNOWN() {
            return Version.UNKNOWN;
        }

        public final Version getVERSION_0_1() {
            return Version.VERSION_0_1;
        }

        public final Version getVERSION_1_0() {
            return Version.VERSION_1_0;
        }

        public final Version parse(String str) {
            if (str == null || AbstractC10793c0.m23132h0(str)) {
                return null;
            }
            Matcher matcher = Pattern.compile(Version.VERSION_PATTERN_STRING).matcher(str);
            if (!matcher.matches()) {
                return null;
            }
            String strGroup = matcher.group(1);
            Integer numValueOf = strGroup == null ? null : Integer.valueOf(Integer.parseInt(strGroup));
            if (numValueOf == null) {
                return null;
            }
            int iIntValue = numValueOf.intValue();
            String strGroup2 = matcher.group(2);
            Integer numValueOf2 = strGroup2 == null ? null : Integer.valueOf(Integer.parseInt(strGroup2));
            if (numValueOf2 == null) {
                return null;
            }
            int iIntValue2 = numValueOf2.intValue();
            String strGroup3 = matcher.group(3);
            Integer numValueOf3 = strGroup3 == null ? null : Integer.valueOf(Integer.parseInt(strGroup3));
            if (numValueOf3 == null) {
                return null;
            }
            int iIntValue3 = numValueOf3.intValue();
            String description = matcher.group(4) != null ? matcher.group(4) : "";
            AbstractC9979u.m20293f(description, "description");
            return new Version(iIntValue, iIntValue2, iIntValue3, description, null);
        }

        private Companion() {
        }
    }

    static {
        Version version = new Version(1, 0, 0, "");
        VERSION_1_0 = version;
        CURRENT = version;
    }

    public /* synthetic */ Version(int i10, int i11, int i12, String str, AbstractC9972n abstractC9972n) {
        this(i10, i11, i12, str);
    }

    private final BigInteger getBigInteger() {
        Object value = this.bigInteger$delegate.getValue();
        AbstractC9979u.m20293f(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    public static final Version parse(String str) {
        return Companion.parse(str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Version)) {
            return false;
        }
        Version version = (Version) obj;
        return this.major == version.major && this.minor == version.minor && this.patch == version.patch;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    public int hashCode() {
        return ((((527 + this.major) * 31) + this.minor) * 31) + this.patch;
    }

    public String toString() {
        return this.major + '.' + this.minor + '.' + this.patch + (!AbstractC10793c0.m23132h0(this.description) ? AbstractC9979u.m20303p("-", this.description) : "");
    }

    private Version(int i10, int i11, int i12, String str) {
        this.major = i10;
        this.minor = i11;
        this.patch = i12;
        this.description = str;
        this.bigInteger$delegate = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: androidx.window.core.Version$bigInteger$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final BigInteger invoke() {
                return BigInteger.valueOf(this.this$0.getMajor()).shiftLeft(32).or(BigInteger.valueOf(this.this$0.getMinor())).shiftLeft(32).or(BigInteger.valueOf(this.this$0.getPatch()));
            }
        });
    }

    @Override // java.lang.Comparable
    public int compareTo(Version other) {
        AbstractC9979u.m20294g(other, "other");
        return getBigInteger().compareTo(other.getBigInteger());
    }
}
