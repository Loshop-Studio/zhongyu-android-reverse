package p267v6;

import com.zykj.evaluation.bean.constant.QuestionTypeEnum;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: v6.m0 */
/* loaded from: classes4.dex */
public abstract class AbstractC9696m0 {

    /* renamed from: a */
    public final int f17009a;

    /* renamed from: v6.m0$a */
    public static final class a extends AbstractC9696m0 {

        /* renamed from: b */
        public static final a f17010b = new a();

        public a() {
            super(QuestionTypeEnum.FILLINBLANK.getType(), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 786427901;
        }

        public String toString() {
            return "Blank";
        }
    }

    /* renamed from: v6.m0$b */
    public static final class b extends AbstractC9696m0 {

        /* renamed from: b */
        public static final b f17011b = new b();

        public b() {
            super(QuestionTypeEnum.QSTANDANSWER.getType(), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -528652122;
        }

        public String toString() {
            return "Hand";
        }
    }

    /* renamed from: v6.m0$c */
    public static final class c extends AbstractC9696m0 {

        /* renamed from: b */
        public static final c f17012b = new c();

        public c() {
            super(QuestionTypeEnum.SINGLE.getType(), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -909989005;
        }

        public String toString() {
            return "Select";
        }
    }

    public /* synthetic */ AbstractC9696m0(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    /* renamed from: a */
    public final int m16209a() {
        return this.f17009a;
    }

    public AbstractC9696m0(int i10) {
        this.f17009a = i10;
    }
}
