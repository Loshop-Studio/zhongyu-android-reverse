package com.zykj.view.board.board;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.view.board.board.i */
/* loaded from: classes5.dex */
public abstract class AbstractC7666i {

    /* renamed from: a */
    public final boolean f12234a;

    /* renamed from: b */
    public final boolean f12235b;

    /* renamed from: com.zykj.view.board.board.i$a */
    public static final class a extends AbstractC7666i {

        /* renamed from: c */
        public static final a f12236c = new a();

        public a() {
            super(false, true, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -2002959866;
        }

        public String toString() {
            return "CommitWithRecord";
        }
    }

    /* renamed from: com.zykj.view.board.board.i$b */
    public static final class b extends AbstractC7666i {

        /* renamed from: c */
        public static final b f12237c = new b();

        /* JADX WARN: Illegal instructions before constructor call */
        public b() {
            boolean z9 = false;
            super(z9, z9, 3, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -703507905;
        }

        public String toString() {
            return "Null";
        }
    }

    public /* synthetic */ AbstractC7666i(boolean z9, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z9, z10);
    }

    /* renamed from: a */
    public final boolean m11397a() {
        return this.f12234a;
    }

    /* renamed from: b */
    public final boolean m11398b() {
        return this.f12235b;
    }

    public AbstractC7666i(boolean z9, boolean z10) {
        this.f12234a = z9;
        this.f12235b = z10;
    }

    public /* synthetic */ AbstractC7666i(boolean z9, boolean z10, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? false : z9, (i9 & 2) != 0 ? false : z10, null);
    }
}
