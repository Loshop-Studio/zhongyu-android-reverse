package p267v6;

import androidx.compose.p013ui.graphics.ColorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: v6.x */
/* loaded from: classes4.dex */
public abstract class AbstractC9707x {

    /* renamed from: a */
    public final long f17035a;

    /* renamed from: b */
    public final long f17036b;

    /* renamed from: v6.x$a */
    public static final class a extends AbstractC9707x {

        /* renamed from: c */
        public static final a f17037c = new a();

        public a() {
            super(ColorKt.Color(0), ColorKt.Color(0), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -768642596;
        }

        public String toString() {
            return "Default";
        }
    }

    /* renamed from: v6.x$b */
    public static final class b extends AbstractC9707x {

        /* renamed from: c */
        public static final b f17038c = new b();

        public b() {
            super(ColorKt.Color(4294910208L), ColorKt.Color(4294961127L), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -1447520157;
        }

        public String toString() {
            return "Error";
        }
    }

    public /* synthetic */ AbstractC9707x(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11);
    }

    /* renamed from: a */
    public final long m16214a() {
        return this.f17036b;
    }

    /* renamed from: b */
    public final long m16215b() {
        return this.f17035a;
    }

    public AbstractC9707x(long j10, long j11) {
        this.f17035a = j10;
        this.f17036b = j11;
    }
}
