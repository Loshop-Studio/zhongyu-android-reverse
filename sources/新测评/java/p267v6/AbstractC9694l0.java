package p267v6;

import androidx.compose.p013ui.graphics.ColorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: v6.l0 */
/* loaded from: classes4.dex */
public abstract class AbstractC9694l0 {

    /* renamed from: a */
    public final long f17003a;

    /* renamed from: b */
    public final long f17004b;

    /* renamed from: v6.l0$a */
    public static final class a extends AbstractC9694l0 {

        /* renamed from: c */
        public static final a f17005c = new a();

        public a() {
            super(ColorKt.Color(4284900966L), ColorKt.Color(4292600038L), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1975405813;
        }

        public String toString() {
            return "Default";
        }
    }

    /* renamed from: v6.l0$b */
    public static final class b extends AbstractC9694l0 {

        /* renamed from: c */
        public static final b f17006c = new b();

        public b() {
            super(ColorKt.Color(4294967295L), ColorKt.Color(4283015417L), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 1655329383;
        }

        public String toString() {
            return "Selected";
        }
    }

    public /* synthetic */ AbstractC9694l0(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11);
    }

    /* renamed from: a */
    public final long m16207a() {
        return this.f17004b;
    }

    /* renamed from: b */
    public final long m16208b() {
        return this.f17003a;
    }

    public AbstractC9694l0(long j10, long j11) {
        this.f17003a = j10;
        this.f17004b = j11;
    }
}
