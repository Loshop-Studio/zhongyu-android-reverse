package com.zykj.view.board.board;

import kotlin.jvm.internal.AbstractC9972n;

/* renamed from: com.zykj.view.board.board.c */
/* loaded from: classes6.dex */
public abstract class AbstractC8841c {

    /* renamed from: com.zykj.view.board.board.c$a */
    public static final class a extends AbstractC8841c {

        /* renamed from: a */
        public final boolean f20226a;

        public a(boolean z10) {
            super(null);
            this.f20226a = z10;
        }

        /* renamed from: a */
        public final boolean m16952a() {
            return this.f20226a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f20226a == ((a) obj).f20226a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f20226a);
        }

        public String toString() {
            return "ExpandAnimate(isOpen=" + this.f20226a + ")";
        }
    }

    public /* synthetic */ AbstractC8841c(AbstractC9972n abstractC9972n) {
        this();
    }

    public AbstractC8841c() {
    }
}
