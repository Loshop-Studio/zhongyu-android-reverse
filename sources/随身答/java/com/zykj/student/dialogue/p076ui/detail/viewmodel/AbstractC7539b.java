package com.zykj.student.dialogue.p076ui.detail.viewmodel;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.student.dialogue.ui.detail.viewmodel.b */
/* loaded from: classes5.dex */
public abstract class AbstractC7539b {

    /* renamed from: com.zykj.student.dialogue.ui.detail.viewmodel.b$a */
    public static final class a extends AbstractC7539b {

        /* renamed from: a */
        public final boolean f11254a;

        /* renamed from: b */
        public final int f11255b;

        /* renamed from: c */
        public final boolean f11256c;

        /* renamed from: d */
        public final double f11257d;

        public a(boolean z9, int i9, boolean z10, double d10) {
            super(null);
            this.f11254a = z9;
            this.f11255b = i9;
            this.f11256c = z10;
            this.f11257d = d10;
        }

        /* renamed from: a */
        public final int m10503a() {
            return this.f11255b;
        }

        /* renamed from: b */
        public final double m10504b() {
            return this.f11257d;
        }

        /* renamed from: c */
        public final boolean m10505c() {
            return this.f11254a;
        }

        /* renamed from: d */
        public final boolean m10506d() {
            return this.f11256c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f11254a == aVar.f11254a && this.f11255b == aVar.f11255b && this.f11256c == aVar.f11256c && Double.compare(this.f11257d, aVar.f11257d) == 0;
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.f11254a) * 31) + Integer.hashCode(this.f11255b)) * 31) + Boolean.hashCode(this.f11256c)) * 31) + Double.hashCode(this.f11257d);
        }

        public String toString() {
            return "FullScreenEvent(isFullscreen=" + this.f11254a + ", currentProgress=" + this.f11255b + ", isPlaying=" + this.f11256c + ", speedRate=" + this.f11257d + ")";
        }
    }

    /* renamed from: com.zykj.student.dialogue.ui.detail.viewmodel.b$b */
    public static final class b extends AbstractC7539b {

        /* renamed from: a */
        public static final b f11258a = new b();

        public b() {
            super(null);
        }
    }

    /* renamed from: com.zykj.student.dialogue.ui.detail.viewmodel.b$c */
    public static final class c extends AbstractC7539b {

        /* renamed from: a */
        public static final c f11259a = new c();

        public c() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC7539b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC7539b() {
    }
}
