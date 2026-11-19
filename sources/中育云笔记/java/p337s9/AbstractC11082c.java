package p337s9;

import kotlin.jvm.internal.AbstractC9972n;

/* renamed from: s9.c */
/* loaded from: classes5.dex */
public abstract class AbstractC11082c {

    /* renamed from: a */
    public final String f26755a;

    /* renamed from: b */
    public boolean f26756b;

    /* renamed from: s9.c$a */
    public static final class a extends AbstractC11082c {

        /* renamed from: c */
        public static final a f26757c = new a();

        public a() {
            super("删除", false, 2, null);
        }
    }

    /* renamed from: s9.c$b */
    public static final class b extends AbstractC11082c {

        /* renamed from: c */
        public boolean f26758c;

        /* renamed from: d */
        public int f26759d;

        public b(boolean z10, int i10) {
            super("边框", false, 2, null);
            this.f26758c = z10;
            this.f26759d = i10;
        }

        /* renamed from: d */
        public final int m24643d() {
            return this.f26759d;
        }

        /* renamed from: e */
        public final boolean m24644e() {
            return this.f26758c;
        }

        /* renamed from: f */
        public final void m24645f(int i10) {
            this.f26759d = i10;
        }

        /* renamed from: g */
        public final void m24646g(boolean z10) {
            this.f26758c = z10;
        }
    }

    /* renamed from: s9.c$c */
    public static final class c extends AbstractC11082c {
        public c() {
            super("裁剪", false, 2, null);
        }
    }

    /* renamed from: s9.c$d */
    public static final class d extends AbstractC11082c {

        /* renamed from: c */
        public static final d f26760c = new d();

        public d() {
            super("", false, 2, null);
        }
    }

    /* renamed from: s9.c$e */
    public static final class e extends AbstractC11082c {

        /* renamed from: c */
        public static final e f26761c = new e();

        public e() {
            super("", false, 2, null);
        }
    }

    /* renamed from: s9.c$f */
    public static final class f extends AbstractC11082c {

        /* renamed from: c */
        public boolean f26762c;

        /* renamed from: d */
        public int f26763d;

        public f(boolean z10, int i10) {
            super("编辑", false, 2, null);
            this.f26762c = z10;
            this.f26763d = i10;
        }

        /* renamed from: d */
        public final int m24647d() {
            return this.f26763d;
        }

        /* renamed from: e */
        public final boolean m24648e() {
            return this.f26762c;
        }

        /* renamed from: f */
        public final void m24649f(int i10) {
            this.f26763d = i10;
        }

        /* renamed from: g */
        public final void m24650g(boolean z10) {
            this.f26762c = z10;
        }
    }

    /* renamed from: s9.c$g */
    public static final class g extends AbstractC11082c {

        /* renamed from: c */
        public boolean f26764c;

        /* renamed from: d */
        public float f26765d;

        /* renamed from: e */
        public int f26766e;

        public g(boolean z10, float f10, int i10) {
            super("编辑", false, 2, null);
            this.f26764c = z10;
            this.f26765d = f10;
            this.f26766e = i10;
        }

        /* renamed from: d */
        public final int m24651d() {
            return this.f26766e;
        }

        /* renamed from: e */
        public final float m24652e() {
            return this.f26765d;
        }

        /* renamed from: f */
        public final boolean m24653f() {
            return this.f26764c;
        }

        /* renamed from: g */
        public final void m24654g(int i10) {
            this.f26766e = i10;
        }

        /* renamed from: h */
        public final void m24655h(boolean z10) {
            this.f26764c = z10;
        }

        /* renamed from: i */
        public final void m24656i(float f10) {
            this.f26765d = f10;
        }
    }

    public /* synthetic */ AbstractC11082c(String str, boolean z10, AbstractC9972n abstractC9972n) {
        this(str, z10);
    }

    /* renamed from: a */
    public final String m24640a() {
        return this.f26755a;
    }

    /* renamed from: b */
    public final boolean m24641b() {
        return this.f26756b;
    }

    /* renamed from: c */
    public final void m24642c(boolean z10) {
        this.f26756b = z10;
    }

    public AbstractC11082c(String str, boolean z10) {
        this.f26755a = str;
        this.f26756b = z10;
    }

    public /* synthetic */ AbstractC11082c(String str, boolean z10, int i10, AbstractC9972n abstractC9972n) {
        this(str, (i10 & 2) != 0 ? false : z10, null);
    }
}
