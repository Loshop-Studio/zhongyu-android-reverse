package com.zykj.view.board.board;

import kotlin.jvm.internal.AbstractC9126n;

/* renamed from: com.zykj.view.board.board.c */
/* loaded from: classes5.dex */
public abstract class AbstractC8207c {

    /* renamed from: com.zykj.view.board.board.c$a */
    public static final class a extends AbstractC8207c {

        /* renamed from: a */
        public final boolean f15009a;

        public a(boolean z10) {
            super(null);
            this.f15009a = z10;
        }

        /* renamed from: a */
        public final boolean m12836a() {
            return this.f15009a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f15009a == ((a) obj).f15009a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f15009a);
        }

        public String toString() {
            return "ExpandAnimate(isOpen=" + this.f15009a + ")";
        }
    }

    public /* synthetic */ AbstractC8207c(AbstractC9126n abstractC9126n) {
        this();
    }

    public AbstractC8207c() {
    }
}
