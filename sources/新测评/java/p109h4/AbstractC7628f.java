package p109h4;

import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: h4.f */
/* loaded from: classes4.dex */
public abstract class AbstractC7628f {

    /* renamed from: a */
    public int f12813a;

    /* renamed from: b */
    public boolean f12814b;

    /* renamed from: h4.f$a */
    public static final class a extends AbstractC7628f {
        public /* synthetic */ a(boolean z9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z9);
        }

        public a(boolean z9) {
            super(ViewCompat.MEASURED_STATE_MASK, z9, null);
        }
    }

    /* renamed from: h4.f$b */
    public static final class b extends AbstractC7628f {

        /* renamed from: c */
        public boolean f12815c;

        public /* synthetic */ b(int i10, boolean z9, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? false : z9, (i11 & 4) != 0 ? false : z10);
        }

        /* renamed from: e */
        public final boolean m12598e() {
            return this.f12815c;
        }

        /* renamed from: f */
        public final void m12599f(boolean z9) {
            this.f12815c = z9;
        }

        public b(int i10, boolean z9, boolean z10) {
            super(i10, z9, null);
            this.f12815c = z10;
        }
    }

    /* renamed from: h4.f$c */
    public static final class c extends AbstractC7628f {
        public /* synthetic */ c(int i10, boolean z9, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i11 & 2) != 0 ? false : z9);
        }

        public c(int i10, boolean z9) {
            super(i10, z9, null);
        }
    }

    /* renamed from: h4.f$d */
    public static final class d extends AbstractC7628f {
        public /* synthetic */ d(boolean z9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z9);
        }

        public d(boolean z9) {
            super(-46799, z9, null);
        }
    }

    /* renamed from: h4.f$e */
    public static final class e extends AbstractC7628f {
        public /* synthetic */ e(boolean z9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z9);
        }

        public e(boolean z9) {
            super(-1118482, z9, null);
        }
    }

    public /* synthetic */ AbstractC7628f(int i10, boolean z9, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, z9);
    }

    /* renamed from: a */
    public final int m12594a() {
        return this.f12813a;
    }

    /* renamed from: b */
    public final boolean m12595b() {
        return this.f12814b;
    }

    /* renamed from: c */
    public final void m12596c(boolean z9) {
        this.f12814b = z9;
    }

    /* renamed from: d */
    public final void m12597d(int i10) {
        this.f12813a = i10;
    }

    public AbstractC7628f(int i10, boolean z9) {
        this.f12813a = i10;
        this.f12814b = z9;
    }
}
