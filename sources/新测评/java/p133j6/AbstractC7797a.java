package p133j6;

import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorKt;
import com.blankj.utilcode.util.Utils;
import com.zykj.evaluation.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j6.a */
/* loaded from: classes4.dex */
public abstract class AbstractC7797a {

    /* renamed from: a */
    public final long f13457a;

    /* renamed from: b */
    public final String f13458b;

    /* renamed from: j6.a$a */
    public static final class a extends AbstractC7797a {

        /* renamed from: c */
        public static final a f13459c = new a();

        public a() {
            super(Color.INSTANCE.m21011getTransparent0d7_KjU(), "", null);
        }
    }

    /* renamed from: j6.a$b */
    public static final class b extends AbstractC7797a {

        /* renamed from: c */
        public static final b f13460c = new b();

        /* JADX WARN: Illegal instructions before constructor call */
        public b() {
            long jColor = ColorKt.Color(4288256409L);
            String string = Utils.getApp().getString(R.string.correct_hide_analysis);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            super(jColor, string, null);
        }
    }

    /* renamed from: j6.a$c */
    public static final class c extends AbstractC7797a {

        /* renamed from: c */
        public static final c f13461c = new c();

        /* JADX WARN: Illegal instructions before constructor call */
        public c() {
            long jColor = ColorKt.Color(4282882035L);
            String string = Utils.getApp().getString(R.string.correct_show_analysis);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            super(jColor, string, null);
        }
    }

    public /* synthetic */ AbstractC7797a(long j10, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, str);
    }

    /* renamed from: a */
    public final long m13203a() {
        return this.f13457a;
    }

    /* renamed from: b */
    public final String m13204b() {
        return this.f13458b;
    }

    public AbstractC7797a(long j10, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f13457a = j10;
        this.f13458b = text;
    }
}
