package p109h4;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h4.c */
/* loaded from: classes4.dex */
public abstract class AbstractC7625c {

    /* renamed from: a */
    public final String f12800a;

    /* renamed from: b */
    public boolean f12801b;

    /* renamed from: h4.c$a */
    public static final class a extends AbstractC7625c {

        /* renamed from: c */
        public static final a f12802c = new a();

        public a() {
            super("删除", false, 2, null);
        }
    }

    /* renamed from: h4.c$b */
    public static final class b extends AbstractC7625c {

        /* renamed from: c */
        public boolean f12803c;

        /* renamed from: d */
        public List f12804d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z9, List colorList) {
            super("边框", false, 2, null);
            Intrinsics.checkNotNullParameter(colorList, "colorList");
            this.f12803c = z9;
            this.f12804d = colorList;
        }

        /* renamed from: d */
        public final List m12567d() {
            return this.f12804d;
        }

        /* renamed from: e */
        public final boolean m12568e() {
            return this.f12803c;
        }

        /* renamed from: f */
        public final void m12569f(List list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.f12804d = list;
        }

        /* renamed from: g */
        public final void m12570g(boolean z9) {
            this.f12803c = z9;
        }
    }

    /* renamed from: h4.c$c */
    public static final class c extends AbstractC7625c {
        public c() {
            super("裁剪", false, 2, null);
        }
    }

    /* renamed from: h4.c$d */
    public static final class d extends AbstractC7625c {

        /* renamed from: c */
        public static final d f12805c = new d();

        public d() {
            super("", false, 2, null);
        }
    }

    /* renamed from: h4.c$e */
    public static final class e extends AbstractC7625c {

        /* renamed from: c */
        public static final e f12806c = new e();

        public e() {
            super("", false, 2, null);
        }
    }

    /* renamed from: h4.c$f */
    public static final class f extends AbstractC7625c {

        /* renamed from: c */
        public boolean f12807c;

        /* renamed from: d */
        public List f12808d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z9, List colorList) {
            super("编辑", false, 2, null);
            Intrinsics.checkNotNullParameter(colorList, "colorList");
            this.f12807c = z9;
            this.f12808d = colorList;
        }

        /* renamed from: d */
        public final List m12571d() {
            return this.f12808d;
        }

        /* renamed from: e */
        public final boolean m12572e() {
            return this.f12807c;
        }

        /* renamed from: f */
        public final void m12573f(List list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.f12808d = list;
        }

        /* renamed from: g */
        public final void m12574g(boolean z9) {
            this.f12807c = z9;
        }
    }

    /* renamed from: h4.c$g */
    public static final class g extends AbstractC7625c {

        /* renamed from: c */
        public boolean f12809c;

        /* renamed from: d */
        public float f12810d;

        /* renamed from: e */
        public List f12811e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z9, float f10, List colorList) {
            super("编辑", false, 2, null);
            Intrinsics.checkNotNullParameter(colorList, "colorList");
            this.f12809c = z9;
            this.f12810d = f10;
            this.f12811e = colorList;
        }

        /* renamed from: d */
        public final List m12575d() {
            return this.f12811e;
        }

        /* renamed from: e */
        public final float m12576e() {
            return this.f12810d;
        }

        /* renamed from: f */
        public final boolean m12577f() {
            return this.f12809c;
        }

        /* renamed from: g */
        public final void m12578g(List list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.f12811e = list;
        }

        /* renamed from: h */
        public final void m12579h(boolean z9) {
            this.f12809c = z9;
        }

        /* renamed from: i */
        public final void m12580i(float f10) {
            this.f12810d = f10;
        }
    }

    public /* synthetic */ AbstractC7625c(String str, boolean z9, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z9);
    }

    /* renamed from: a */
    public final String m12564a() {
        return this.f12800a;
    }

    /* renamed from: b */
    public final boolean m12565b() {
        return this.f12801b;
    }

    /* renamed from: c */
    public final void m12566c(boolean z9) {
        this.f12801b = z9;
    }

    public AbstractC7625c(String str, boolean z9) {
        this.f12800a = str;
        this.f12801b = z9;
    }

    public /* synthetic */ AbstractC7625c(String str, boolean z9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? false : z9, null);
    }
}
