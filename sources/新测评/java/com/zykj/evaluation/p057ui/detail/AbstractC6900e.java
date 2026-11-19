package com.zykj.evaluation.p057ui.detail;

import com.zykj.evaluation.R;
import com.zykj.evaluation.bean.constant.QuestionResultEnum;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.evaluation.ui.detail.e */
/* loaded from: classes4.dex */
public abstract class AbstractC6900e {

    /* renamed from: a */
    public final int f9261a;

    /* renamed from: b */
    public final int f9262b;

    /* renamed from: c */
    public final int f9263c;

    /* renamed from: com.zykj.evaluation.ui.detail.e$a */
    public static final class a extends AbstractC6900e {

        /* renamed from: d */
        public static final a f9264d = new a();

        public a() {
            super(QuestionResultEnum.ERROR.ordinal(), R.drawable.icon_correct_self_right, R.drawable.icon_correct_self_wrong_h, null);
        }
    }

    /* renamed from: com.zykj.evaluation.ui.detail.e$b */
    public static final class b extends AbstractC6900e {

        /* renamed from: d */
        public static final b f9265d = new b();

        public b() {
            super(QuestionResultEnum.NO_CORRECT.ordinal(), R.drawable.icon_correct_self_right, R.drawable.icon_correct_self_wrong, null);
        }
    }

    /* renamed from: com.zykj.evaluation.ui.detail.e$c */
    public static final class c extends AbstractC6900e {

        /* renamed from: d */
        public static final c f9266d = new c();

        /* JADX WARN: Illegal instructions before constructor call */
        public c() {
            int iOrdinal = QuestionResultEnum.NO_CORRECT.ordinal();
            int i10 = R.drawable.icon_nothing;
            super(iOrdinal, i10, i10, null);
        }
    }

    /* renamed from: com.zykj.evaluation.ui.detail.e$d */
    public static final class d extends AbstractC6900e {

        /* renamed from: d */
        public static final d f9267d = new d();

        public d() {
            super(QuestionResultEnum.RIGHT.ordinal(), R.drawable.icon_correct_self_right_h, R.drawable.icon_correct_self_wrong, null);
        }
    }

    public /* synthetic */ AbstractC6900e(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12);
    }

    /* renamed from: a */
    public final int m9480a() {
        return this.f9263c;
    }

    /* renamed from: b */
    public final int m9481b() {
        return this.f9261a;
    }

    /* renamed from: c */
    public final int m9482c() {
        return this.f9262b;
    }

    public AbstractC6900e(int i10, int i11, int i12) {
        this.f9261a = i10;
        this.f9262b = i11;
        this.f9263c = i12;
    }
}
