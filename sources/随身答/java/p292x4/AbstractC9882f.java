package p292x4;

import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: x4.f */
/* loaded from: classes4.dex */
public abstract class AbstractC9882f {

    /* renamed from: a */
    public int f17662a;

    /* renamed from: b */
    public boolean f17663b;

    /* renamed from: x4.f$a */
    public static final class a extends AbstractC9882f {
        public /* synthetic */ a(boolean z9, int i9, DefaultConstructorMarker defaultConstructorMarker) {
            this((i9 & 1) != 0 ? false : z9);
        }

        public a(boolean z9) {
            super(ViewCompat.MEASURED_STATE_MASK, z9, null);
        }
    }

    /* renamed from: x4.f$b */
    public static final class b extends AbstractC9882f {

        /* renamed from: c */
        public boolean f17664c;

        public /* synthetic */ b(int i9, boolean z9, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 0 : i9, (i10 & 2) != 0 ? false : z9, (i10 & 4) != 0 ? false : z10);
        }

        /* renamed from: e */
        public final boolean m16925e() {
            return this.f17664c;
        }

        /* renamed from: f */
        public final void m16926f(boolean z9) {
            this.f17664c = z9;
        }

        public b(int i9, boolean z9, boolean z10) {
            super(i9, z9, null);
            this.f17664c = z10;
        }
    }

    /* renamed from: x4.f$c */
    public static final class c extends AbstractC9882f {
        public /* synthetic */ c(int i9, boolean z9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(i9, (i10 & 2) != 0 ? false : z9);
        }

        public c(int i9, boolean z9) {
            super(i9, z9, null);
        }
    }

    /* renamed from: x4.f$d */
    public static final class d extends AbstractC9882f {
        public /* synthetic */ d(boolean z9, int i9, DefaultConstructorMarker defaultConstructorMarker) {
            this((i9 & 1) != 0 ? false : z9);
        }

        public d(boolean z9) {
            super(-46799, z9, null);
        }
    }

    /* renamed from: x4.f$e */
    public static final class e extends AbstractC9882f {
        public /* synthetic */ e(boolean z9, int i9, DefaultConstructorMarker defaultConstructorMarker) {
            this((i9 & 1) != 0 ? false : z9);
        }

        public e(boolean z9) {
            super(-1118482, z9, null);
        }
    }

    public /* synthetic */ AbstractC9882f(int i9, boolean z9, DefaultConstructorMarker defaultConstructorMarker) {
        this(i9, z9);
    }

    /* renamed from: a */
    public final int m16921a() {
        return this.f17662a;
    }

    /* renamed from: b */
    public final boolean m16922b() {
        return this.f17663b;
    }

    /* renamed from: c */
    public final void m16923c(boolean z9) {
        this.f17663b = z9;
    }

    /* renamed from: d */
    public final void m16924d(int i9) {
        this.f17662a = i9;
    }

    public AbstractC9882f(int i9, boolean z9) {
        this.f17662a = i9;
        this.f17663b = z9;
    }
}
