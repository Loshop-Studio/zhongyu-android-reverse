package com.zykj.evaluation.p057ui.widget;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.evaluation.ui.widget.a */
/* loaded from: classes4.dex */
public abstract class AbstractC6943a {

    /* renamed from: com.zykj.evaluation.ui.widget.a$a */
    public static final class a extends AbstractC6943a {

        /* renamed from: a */
        public static final a f10263a = new a();

        public a() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 2087469481;
        }

        public String toString() {
            return "CorrectClick";
        }
    }

    /* renamed from: com.zykj.evaluation.ui.widget.a$b */
    public static final class b extends AbstractC6943a {

        /* renamed from: a */
        public static final b f10264a = new b();

        public b() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 545742070;
        }

        public String toString() {
            return "Default";
        }
    }

    /* renamed from: com.zykj.evaluation.ui.widget.a$c */
    public static final class c extends AbstractC6943a {

        /* renamed from: a */
        public final boolean f10265a;

        public c(boolean z9) {
            super(null);
            this.f10265a = z9;
        }

        /* renamed from: a */
        public final boolean m10451a() {
            return this.f10265a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f10265a == ((c) obj).f10265a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f10265a);
        }

        public String toString() {
            return "Drag(enable=" + this.f10265a + ")";
        }
    }

    public /* synthetic */ AbstractC6943a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC6943a() {
    }
}
