package p133j6;

import androidx.compose.p013ui.graphics.ColorKt;
import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j6.q */
/* loaded from: classes4.dex */
public abstract class AbstractC7813q {

    /* renamed from: a */
    public final long f13513a;

    /* renamed from: b */
    public final long f13514b;

    /* renamed from: c */
    public final String f13515c;

    /* renamed from: d */
    public final long f13516d;

    /* renamed from: j6.q$a */
    public static final class a extends AbstractC7813q {

        /* renamed from: e */
        public static final a f13517e = new a();

        public a() {
            super(ColorKt.Color(4294967295L), ColorKt.Color(4280796826L), "订正正确", ColorKt.Color(4280796826L), null);
        }
    }

    /* renamed from: j6.q$b */
    public static final class b extends AbstractC7813q {

        /* renamed from: e */
        public static final b f13518e = new b();

        public b() {
            super(ColorKt.Color(4294670184L), ColorKt.Color(ViewCompat.MEASURED_SIZE_MASK), "错误", ColorKt.Color(4294967295L), null);
        }
    }

    /* renamed from: j6.q$c */
    public static final class c extends AbstractC7813q {

        /* renamed from: e */
        public static final c f13519e = new c();

        public c() {
            super(ColorKt.Color(4294949939L), ColorKt.Color(ViewCompat.MEASURED_SIZE_MASK), "半对", ColorKt.Color(4294967295L), null);
        }
    }

    /* renamed from: j6.q$d */
    public static final class d extends AbstractC7813q {

        /* renamed from: e */
        public static final d f13520e = new d();

        public d() {
            super(ColorKt.Color(4282882035L), ColorKt.Color(ViewCompat.MEASURED_SIZE_MASK), "已订正", ColorKt.Color(4294967295L), null);
        }
    }

    /* renamed from: j6.q$e */
    public static final class e extends AbstractC7813q {

        /* renamed from: e */
        public static final e f13521e = new e();

        public e() {
            super(ColorKt.Color(4282882035L), ColorKt.Color(ViewCompat.MEASURED_SIZE_MASK), "已作答", ColorKt.Color(4294967295L), null);
        }
    }

    /* renamed from: j6.q$f */
    public static final class f extends AbstractC7813q {

        /* renamed from: e */
        public static final f f13522e = new f();

        public f() {
            super(ColorKt.Color(4294967295L), ColorKt.Color(4292665056L), "未订正", ColorKt.Color(4284769638L), null);
        }
    }

    /* renamed from: j6.q$g */
    public static final class g extends AbstractC7813q {

        /* renamed from: e */
        public static final g f13523e = new g();

        public g() {
            super(ColorKt.Color(4294967295L), ColorKt.Color(4292665056L), "未批改", ColorKt.Color(4284769638L), null);
        }
    }

    /* renamed from: j6.q$h */
    public static final class h extends AbstractC7813q {

        /* renamed from: e */
        public static final h f13524e = new h();

        public h() {
            super(ColorKt.Color(4294967295L), ColorKt.Color(4292665056L), "未作答", ColorKt.Color(4284769638L), null);
        }
    }

    /* renamed from: j6.q$i */
    public static final class i extends AbstractC7813q {

        /* renamed from: e */
        public static final i f13525e = new i();

        public i() {
            super(ColorKt.Color(4280796826L), ColorKt.Color(ViewCompat.MEASURED_SIZE_MASK), "无需订正", ColorKt.Color(4294967295L), null);
        }
    }

    /* renamed from: j6.q$j */
    public static final class j extends AbstractC7813q {

        /* renamed from: e */
        public static final j f13526e = new j();

        public j() {
            super(ColorKt.Color(4280796826L), ColorKt.Color(ViewCompat.MEASURED_SIZE_MASK), "正确", ColorKt.Color(4294967295L), null);
        }
    }

    /* renamed from: j6.q$k */
    public static final class k extends AbstractC7813q {

        /* renamed from: e */
        public static final k f13527e = new k();

        public k() {
            super(ColorKt.Color(4294967295L), ColorKt.Color(4292665056L), "待订正", ColorKt.Color(4284769638L), null);
        }
    }

    /* renamed from: j6.q$l */
    public static final class l extends AbstractC7813q {

        /* renamed from: e */
        public static final l f13528e = new l();

        public l() {
            super(ColorKt.Color(4294967295L), ColorKt.Color(4292665056L), "待作答", ColorKt.Color(4284769638L), null);
        }
    }

    /* renamed from: j6.q$m */
    public static final class m extends AbstractC7813q {

        /* renamed from: e */
        public static final m f13529e = new m();

        public m() {
            super(ColorKt.Color(4294967295L), ColorKt.Color(4294916912L), "数据损坏", ColorKt.Color(4284769638L), null);
        }
    }

    public /* synthetic */ AbstractC7813q(long j10, long j11, String str, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, str, j12);
    }

    /* renamed from: a */
    public final long m13236a() {
        return this.f13513a;
    }

    /* renamed from: b */
    public final String m13237b() {
        return this.f13515c;
    }

    /* renamed from: c */
    public final long m13238c() {
        return this.f13514b;
    }

    /* renamed from: d */
    public final long m13239d() {
        return this.f13516d;
    }

    public AbstractC7813q(long j10, long j11, String name, long j12) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f13513a = j10;
        this.f13514b = j11;
        this.f13515c = name;
        this.f13516d = j12;
    }
}
