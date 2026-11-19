package com.zykj.view.board.board;

import android.graphics.Color;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.view.board.board.p */
/* loaded from: classes5.dex */
public abstract class AbstractC7229p {

    /* renamed from: a */
    public final int f11082a;

    /* renamed from: b */
    public final int f11083b;

    /* renamed from: com.zykj.view.board.board.p$a */
    public static final class a extends AbstractC7229p {

        /* renamed from: c */
        public static final a f11084c = new a();

        public a() {
            super(1, Color.parseColor("#000000"), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -1683564406;
        }

        public String toString() {
            return "ColorBlack";
        }
    }

    /* renamed from: com.zykj.view.board.board.p$b */
    public static final class b extends AbstractC7229p {
        public b(int i10) {
            super(0, i10, null);
        }

        public /* synthetic */ b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 0 : i10);
        }
    }

    /* renamed from: com.zykj.view.board.board.p$c */
    public static final class c extends AbstractC7229p {

        /* renamed from: c */
        public static final c f11085c = new c();

        public c() {
            super(3, Color.parseColor("#FF4931"), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -774920228;
        }

        public String toString() {
            return "ColorRed";
        }
    }

    /* renamed from: com.zykj.view.board.board.p$d */
    public static final class d extends AbstractC7229p {

        /* renamed from: c */
        public static final d f11086c = new d();

        public d() {
            super(2, Color.parseColor("#EEEEEE"), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return -1664281420;
        }

        public String toString() {
            return "ColorWhite";
        }
    }

    public /* synthetic */ AbstractC7229p(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11);
    }

    /* renamed from: a */
    public final int m11021a() {
        return this.f11083b;
    }

    /* renamed from: b */
    public final int m11022b() {
        return this.f11082a;
    }

    public AbstractC7229p(int i10, int i11) {
        this.f11082a = i10;
        this.f11083b = i11;
    }
}
