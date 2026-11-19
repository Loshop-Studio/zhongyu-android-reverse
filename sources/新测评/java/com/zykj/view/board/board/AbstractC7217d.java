package com.zykj.view.board.board;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.view.board.board.d */
/* loaded from: classes5.dex */
public abstract class AbstractC7217d {

    /* renamed from: a */
    public final boolean f11016a;

    /* renamed from: b */
    public final boolean f11017b;

    /* renamed from: com.zykj.view.board.board.d$a */
    public static final class a extends AbstractC7217d {

        /* renamed from: c */
        public static final a f11018c = new a();

        /* JADX WARN: Illegal instructions before constructor call */
        public a() {
            boolean z9 = false;
            super(z9, z9, 3, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -703507905;
        }

        public String toString() {
            return "Null";
        }
    }

    public /* synthetic */ AbstractC7217d(boolean z9, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z9, z10);
    }

    /* renamed from: a */
    public final boolean m10968a() {
        return this.f11016a;
    }

    /* renamed from: b */
    public final boolean m10969b() {
        return this.f11017b;
    }

    public AbstractC7217d(boolean z9, boolean z10) {
        this.f11016a = z9;
        this.f11017b = z10;
    }

    public /* synthetic */ AbstractC7217d(boolean z9, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z9, (i10 & 2) != 0 ? false : z10, null);
    }
}
