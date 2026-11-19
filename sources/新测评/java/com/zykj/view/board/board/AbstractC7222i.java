package com.zykj.view.board.board;

import com.zykj.view.R$drawable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.view.board.board.i */
/* loaded from: classes5.dex */
public abstract class AbstractC7222i {

    /* renamed from: a */
    public final int f11032a;

    /* renamed from: com.zykj.view.board.board.i$a */
    public static final class a extends AbstractC7222i {

        /* renamed from: b */
        public static final a f11033b = new a();

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

    /* renamed from: com.zykj.view.board.board.i$b */
    public static final class b extends AbstractC7222i {

        /* renamed from: b */
        public static final b f11034b = new b();

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

    public /* synthetic */ AbstractC7222i(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    /* renamed from: a */
    public final int m10981a() {
        return this.f11032a;
    }

    public AbstractC7222i(int i10) {
        this.f11032a = i10;
    }
}
