package com.zykj.evaluation.base;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.evaluation.base.a */
/* loaded from: classes4.dex */
public abstract class AbstractC6856a {

    /* renamed from: a */
    public final boolean f8695a;

    /* renamed from: b */
    public final boolean f8696b;

    /* renamed from: com.zykj.evaluation.base.a$a */
    public static final class a extends AbstractC6856a {

        /* renamed from: c */
        public static final a f8697c = new a();

        /* JADX WARN: Illegal instructions before constructor call */
        public a() {
            boolean z9 = false;
            super(z9, z9, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1527382733;
        }

        public String toString() {
            return "Null";
        }
    }

    /* renamed from: com.zykj.evaluation.base.a$b */
    public static final class b extends AbstractC6856a {

        /* renamed from: c */
        public static final b f8698c = new b();

        public b() {
            super(true, false, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 597617779;
        }

        public String toString() {
            return "Progress";
        }
    }

    public /* synthetic */ AbstractC6856a(boolean z9, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z9, z10);
    }

    /* renamed from: a */
    public final boolean m8656a() {
        return this.f8695a;
    }

    /* renamed from: b */
    public final boolean m8657b() {
        return this.f8696b;
    }

    public AbstractC6856a(boolean z9, boolean z10) {
        this.f8695a = z9;
        this.f8696b = z10;
    }
}
