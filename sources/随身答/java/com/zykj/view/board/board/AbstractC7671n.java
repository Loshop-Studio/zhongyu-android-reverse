package com.zykj.view.board.board;

import com.zykj.view.R$drawable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.view.board.board.n */
/* loaded from: classes5.dex */
public abstract class AbstractC7671n {

    /* renamed from: a */
    public final int f12251a;

    /* renamed from: com.zykj.view.board.board.n$a */
    public static final class a extends AbstractC7671n {

        /* renamed from: b */
        public static final a f12252b = new a();

        public a() {
            super(R$drawable.view_icon_expansion_right, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -393733831;
        }

        public String toString() {
            return "Collapse";
        }
    }

    /* renamed from: com.zykj.view.board.board.n$b */
    public static final class b extends AbstractC7671n {

        /* renamed from: b */
        public static final b f12253b = new b();

        public b() {
            super(R$drawable.view_icon_expansion_left, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -1700748731;
        }

        public String toString() {
            return "Expanded";
        }
    }

    public /* synthetic */ AbstractC7671n(int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(i9);
    }

    /* renamed from: a */
    public final int m11411a() {
        return this.f12251a;
    }

    public AbstractC7671n(int i9) {
        this.f12251a = i9;
    }
}
