package p078i4;

import com.zykj.huiwei.launcher.app.App;
import com.zykj.manage.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i4.c */
/* loaded from: classes4.dex */
public abstract class AbstractC6533c {

    /* renamed from: a */
    public static final a f8364a = new a(null);

    /* renamed from: b */
    public static final Lazy f8365b = LazyKt.lazy(new Function0() { // from class: i4.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC6533c.m7300c();
        }
    });

    /* renamed from: i4.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String[] m7301a() {
            Object value = AbstractC6533c.f8365b.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (String[]) value;
        }

        public a() {
        }
    }

    /* renamed from: c */
    public static final String[] m7300c() {
        return App.INSTANCE.m5206a().getResources().getStringArray(R.array.hw_weeks);
    }
}
