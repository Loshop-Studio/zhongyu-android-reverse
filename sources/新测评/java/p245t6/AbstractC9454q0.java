package p245t6;

import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorKt;
import com.zykj.evaluation.R;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t6.q0 */
/* loaded from: classes4.dex */
public abstract class AbstractC9454q0 {

    /* renamed from: t6.q0$a */
    public static abstract class a extends AbstractC9454q0 {

        /* renamed from: a */
        public final String f16495a;

        /* renamed from: b */
        public final long f16496b;

        /* renamed from: c */
        public final long f16497c;

        /* renamed from: d */
        public final long f16498d;

        /* renamed from: t6.q0$a$a, reason: collision with other inner class name */
        public static final class C10159a extends a {

            /* renamed from: e */
            public static final C10159a f16499e = new C10159a();

            public C10159a() {
                super("电子答题", ColorKt.Color(4282882035L), 0L, 0L, 12, null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C10159a);
            }

            public int hashCode() {
                return -506382899;
            }

            public String toString() {
                return "AnswerPad";
            }
        }

        /* renamed from: t6.q0$a$b */
        public static final class b extends a {

            /* renamed from: e */
            public static final b f16500e = new b();

            public b() {
                super("拍答题卡", ColorKt.Color(4282882035L), 0L, 0L, 12, null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -1299678183;
            }

            public String toString() {
                return "AnswerSheet";
            }
        }

        /* renamed from: t6.q0$a$c */
        public static final class c extends a {

            /* renamed from: e */
            public static final c f16501e = new c();

            public c() {
                super("去自批", ColorKt.Color(4282882035L), 0L, 0L, 12, null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 488623790;
            }

            public String toString() {
                return "CorrectSelf";
            }
        }

        /* renamed from: t6.q0$a$d */
        public static final class d extends a {

            /* renamed from: e */
            public static final d f16502e = new d();

            public d() {
                super("查看测评", ColorKt.Color(4284900966L), ColorKt.Color(4291611852L), Color.INSTANCE.m21011getTransparent0d7_KjU(), null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -1510949979;
            }

            public String toString() {
                return "Nothing";
            }
        }

        /* renamed from: t6.q0$a$e */
        public static final class e extends a {

            /* renamed from: e */
            public static final e f16503e = new e();

            public e() {
                super("马上订正", ColorKt.Color(4294227498L), 0L, 0L, 12, null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return 606600400;
            }

            public String toString() {
                return "StartCorrect";
            }
        }

        /* renamed from: t6.q0$a$f */
        public static final class f extends a {

            /* renamed from: e */
            public final List f16504e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(List buttonList) {
                super(null, 0L, 0L, 0L, 15, null);
                Intrinsics.checkNotNullParameter(buttonList, "buttonList");
                this.f16504e = buttonList;
            }

            /* renamed from: e */
            public final List m15764e() {
                return this.f16504e;
            }
        }

        /* renamed from: t6.q0$a$g */
        public static final class g extends a {

            /* renamed from: e */
            public static final g f16505e = new g();

            public g() {
                super("查看测评", ColorKt.Color(4280796826L), 0L, 0L, 12, null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public int hashCode() {
                return 16494834;
            }

            public String toString() {
                return "ViewTask";
            }
        }

        public /* synthetic */ a(String str, long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j10, j11, j12);
        }

        /* renamed from: a */
        public final long m15760a() {
            return this.f16497c;
        }

        /* renamed from: b */
        public final long m15761b() {
            return this.f16498d;
        }

        /* renamed from: c */
        public final String m15762c() {
            return this.f16495a;
        }

        /* renamed from: d */
        public final long m15763d() {
            return this.f16496b;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ a(String str, long j10, long j11, long j12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            String str2 = (i10 & 1) != 0 ? "" : str;
            long jColor = (i10 & 2) != 0 ? ColorKt.Color(4282882035L) : j10;
            this(str2, jColor, (i10 & 4) != 0 ? Color.INSTANCE.m21013getWhite0d7_KjU() : j11, (i10 & 8) != 0 ? jColor : j12, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String text, long j10, long j11, long j12) {
            super(null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.f16495a = text;
            this.f16496b = j10;
            this.f16497c = j11;
            this.f16498d = j12;
        }
    }

    /* renamed from: t6.q0$b */
    public static abstract class b extends AbstractC9454q0 {

        /* renamed from: a */
        public final int f16506a;

        /* renamed from: b */
        public final long f16507b;

        /* renamed from: c */
        public final String f16508c;

        /* renamed from: t6.q0$b$a */
        public static final class a extends b {

            /* renamed from: d */
            public static final a f16509d = new a();

            public a() {
                super(R.drawable.icon_home_commit_failed, ColorKt.Color(4294916912L), "交卷失败，点击重试", null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -2018441600;
            }

            public String toString() {
                return "CommitFailed";
            }
        }

        /* renamed from: t6.q0$b$b, reason: collision with other inner class name */
        public static final class C10160b extends b {

            /* renamed from: d */
            public static final C10160b f16510d = new C10160b();

            public C10160b() {
                super(R.drawable.icon_home_commit_success, ColorKt.Color(4280796826L), "提交成功", null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C10160b);
            }

            public int hashCode() {
                return 1072240160;
            }

            public String toString() {
                return "CommitSuccess";
            }
        }

        /* renamed from: t6.q0$b$c */
        public static final class c extends b {

            /* renamed from: d */
            public static final c f16511d = new c();

            public c() {
                super(R.drawable.icon_home_committing, ColorKt.Color(4282882035L), "正在提交", null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 365757905;
            }

            public String toString() {
                return "Committing";
            }
        }

        /* renamed from: t6.q0$b$d */
        public static final class d extends b {

            /* renamed from: d */
            public static final d f16512d = new d();

            public d() {
                super(R.drawable.icon_home_committing, ColorKt.Color(4282882035L), "作业数据处理中，请稍后", null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -530450159;
            }

            public String toString() {
                return "Handling";
            }
        }

        public /* synthetic */ b(int i10, long j10, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, j10, str);
        }

        /* renamed from: a */
        public final long m15765a() {
            return this.f16507b;
        }

        /* renamed from: b */
        public final int m15766b() {
            return this.f16506a;
        }

        /* renamed from: c */
        public final String m15767c() {
            return this.f16508c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, long j10, String text) {
            super(null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.f16506a = i10;
            this.f16507b = j10;
            this.f16508c = text;
        }
    }

    public /* synthetic */ AbstractC9454q0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC9454q0() {
    }
}
