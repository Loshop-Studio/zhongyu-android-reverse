package p292x4;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x4.c */
/* loaded from: classes4.dex */
public abstract class AbstractC9879c {

    /* renamed from: a */
    public final String f17649a;

    /* renamed from: b */
    public boolean f17650b;

    /* renamed from: x4.c$a */
    public static final class a extends AbstractC9879c {

        /* renamed from: c */
        public static final a f17651c = new a();

        public a() {
            super("删除", false, 2, null);
        }
    }

    /* renamed from: x4.c$b */
    public static final class b extends AbstractC9879c {

        /* renamed from: c */
        public boolean f17652c;

        /* renamed from: d */
        public List f17653d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z9, List colorList) {
            super("边框", false, 2, null);
            Intrinsics.checkNotNullParameter(colorList, "colorList");
            this.f17652c = z9;
            this.f17653d = colorList;
        }

        /* renamed from: d */
        public final List m16894d() {
            return this.f17653d;
        }

        /* renamed from: e */
        public final boolean m16895e() {
            return this.f17652c;
        }

        /* renamed from: f */
        public final void m16896f(List list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.f17653d = list;
        }

        /* renamed from: g */
        public final void m16897g(boolean z9) {
            this.f17652c = z9;
        }
    }

    /* renamed from: x4.c$c */
    public static final class c extends AbstractC9879c {
        public c() {
            super("裁剪", false, 2, null);
        }
    }

    /* renamed from: x4.c$d */
    public static final class d extends AbstractC9879c {

        /* renamed from: c */
        public static final d f17654c = new d();

        public d() {
            super("", false, 2, null);
        }
    }

    /* renamed from: x4.c$e */
    public static final class e extends AbstractC9879c {

        /* renamed from: c */
        public static final e f17655c = new e();

        public e() {
            super("", false, 2, null);
        }
    }

    /* renamed from: x4.c$f */
    public static final class f extends AbstractC9879c {

        /* renamed from: c */
        public boolean f17656c;

        /* renamed from: d */
        public List f17657d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z9, List colorList) {
            super("编辑", false, 2, null);
            Intrinsics.checkNotNullParameter(colorList, "colorList");
            this.f17656c = z9;
            this.f17657d = colorList;
        }

        /* renamed from: d */
        public final List m16898d() {
            return this.f17657d;
        }

        /* renamed from: e */
        public final boolean m16899e() {
            return this.f17656c;
        }

        /* renamed from: f */
        public final void m16900f(List list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.f17657d = list;
        }

        /* renamed from: g */
        public final void m16901g(boolean z9) {
            this.f17656c = z9;
        }
    }

    /* renamed from: x4.c$g */
    public static final class g extends AbstractC9879c {

        /* renamed from: c */
        public boolean f17658c;

        /* renamed from: d */
        public float f17659d;

        /* renamed from: e */
        public List f17660e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z9, float f10, List colorList) {
            super("编辑", false, 2, null);
            Intrinsics.checkNotNullParameter(colorList, "colorList");
            this.f17658c = z9;
            this.f17659d = f10;
            this.f17660e = colorList;
        }

        /* renamed from: d */
        public final List m16902d() {
            return this.f17660e;
        }

        /* renamed from: e */
        public final float m16903e() {
            return this.f17659d;
        }

        /* renamed from: f */
        public final boolean m16904f() {
            return this.f17658c;
        }

        /* renamed from: g */
        public final void m16905g(List list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.f17660e = list;
        }

        /* renamed from: h */
        public final void m16906h(boolean z9) {
            this.f17658c = z9;
        }

        /* renamed from: i */
        public final void m16907i(float f10) {
            this.f17659d = f10;
        }
    }

    public /* synthetic */ AbstractC9879c(String str, boolean z9, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z9);
    }

    /* renamed from: a */
    public final String m16891a() {
        return this.f17649a;
    }

    /* renamed from: b */
    public final boolean m16892b() {
        return this.f17650b;
    }

    /* renamed from: c */
    public final void m16893c(boolean z9) {
        this.f17650b = z9;
    }

    public AbstractC9879c(String str, boolean z9) {
        this.f17649a = str;
        this.f17650b = z9;
    }

    public /* synthetic */ AbstractC9879c(String str, boolean z9, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i9 & 2) != 0 ? false : z9, null);
    }
}
