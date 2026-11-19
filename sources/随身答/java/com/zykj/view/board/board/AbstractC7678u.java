package com.zykj.view.board.board;

import android.graphics.Color;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.view.board.board.u */
/* loaded from: classes5.dex */
public abstract class AbstractC7678u {

    /* renamed from: a */
    public final int f12301a;

    /* renamed from: b */
    public final int f12302b;

    /* renamed from: com.zykj.view.board.board.u$a */
    public static final class a extends AbstractC7678u {

        /* renamed from: c */
        public static final a f12303c = new a();

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

    /* renamed from: com.zykj.view.board.board.u$b */
    public static final class b extends AbstractC7678u {
        public b(int i9) {
            super(0, i9, null);
        }

        public /* synthetic */ b(int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 0 : i9);
        }
    }

    /* renamed from: com.zykj.view.board.board.u$c */
    public static final class c extends AbstractC7678u {

        /* renamed from: c */
        public static final c f12304c = new c();

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

    /* renamed from: com.zykj.view.board.board.u$d */
    public static final class d extends AbstractC7678u {

        /* renamed from: c */
        public static final d f12305c = new d();

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

    public /* synthetic */ AbstractC7678u(int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i9, i10);
    }

    /* renamed from: a */
    public final int m11451a() {
        return this.f12302b;
    }

    /* renamed from: b */
    public final int m11452b() {
        return this.f12301a;
    }

    public AbstractC7678u(int i9, int i10) {
        this.f12301a = i9;
        this.f12302b = i10;
    }
}
