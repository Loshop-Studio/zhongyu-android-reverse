package com.zykj.view.board.board;

import android.graphics.Color;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import kotlin.jvm.internal.AbstractC9126n;

/* renamed from: com.zykj.view.board.board.b */
/* loaded from: classes5.dex */
public abstract class AbstractC8206b {

    /* renamed from: a */
    public final int f14998a;

    /* renamed from: b */
    public final int f14999b;

    /* renamed from: c */
    public final BackgroundLineConfig.BackgroundLineType f15000c;

    /* renamed from: d */
    public final int f15001d;

    /* renamed from: e */
    public final float f15002e;

    /* renamed from: com.zykj.view.board.board.b$a */
    public static final class a extends AbstractC8206b {

        /* renamed from: f */
        public static final a f15003f = new a();

        public a() {
            super(1, Color.parseColor("#000000"), null, 0, 0.0f, 28, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.b$b */
    public static final class b extends AbstractC8206b {

        /* renamed from: f */
        public static final b f15004f = new b();

        public b() {
            super(2, Color.parseColor("#435772"), null, 0, 0.0f, 28, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.b$c */
    public static final class c extends AbstractC8206b {

        /* renamed from: f */
        public static final c f15005f = new c();

        public c() {
            super(3, Color.parseColor("#4C7068"), null, 0, 0.0f, 28, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.b$d */
    public static final class d extends AbstractC8206b {

        /* renamed from: f */
        public static final d f15006f = new d();

        public d() {
            super(0, Color.parseColor("#FFFFFF"), null, 0, 0.0f, 28, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.b$e */
    public static final class e extends AbstractC8206b {

        /* renamed from: f */
        public static final e f15007f = new e();

        /* JADX WARN: Illegal instructions before constructor call */
        public e() {
            int i10 = 5;
            super(i10, Color.parseColor("#F6F0E8"), BackgroundLineConfig.BackgroundLineType.Horizontal, Color.parseColor("#B0AEAE"), 108.0f, null);
        }
    }

    /* renamed from: com.zykj.view.board.board.b$f */
    public static final class f extends AbstractC8206b {

        /* renamed from: f */
        public static final f f15008f = new f();

        /* JADX WARN: Illegal instructions before constructor call */
        public f() {
            int i10 = 4;
            super(i10, Color.parseColor("#F6F0E9"), BackgroundLineConfig.BackgroundLineType.Interweave, Color.parseColor("#B0AEAE"), 64.0f, null);
        }
    }

    public /* synthetic */ AbstractC8206b(int i10, int i11, BackgroundLineConfig.BackgroundLineType backgroundLineType, int i12, float f10, AbstractC9126n abstractC9126n) {
        this(i10, i11, backgroundLineType, i12, f10);
    }

    /* renamed from: a */
    public final int m12831a() {
        return this.f14999b;
    }

    /* renamed from: b */
    public final int m12832b() {
        return this.f15001d;
    }

    /* renamed from: c */
    public final float m12833c() {
        return this.f15002e;
    }

    /* renamed from: d */
    public final BackgroundLineConfig.BackgroundLineType m12834d() {
        return this.f15000c;
    }

    /* renamed from: e */
    public final int m12835e() {
        return this.f14998a;
    }

    public AbstractC8206b(int i10, int i11, BackgroundLineConfig.BackgroundLineType backgroundLineType, int i12, float f10) {
        this.f14998a = i10;
        this.f14999b = i11;
        this.f15000c = backgroundLineType;
        this.f15001d = i12;
        this.f15002e = f10;
    }

    public /* synthetic */ AbstractC8206b(int i10, int i11, BackgroundLineConfig.BackgroundLineType backgroundLineType, int i12, float f10, int i13, AbstractC9126n abstractC9126n) {
        this(i10, (i13 & 2) != 0 ? -1 : i11, (i13 & 4) != 0 ? BackgroundLineConfig.BackgroundLineType.Horizontal : backgroundLineType, (i13 & 8) != 0 ? 0 : i12, (i13 & 16) != 0 ? 64.0f : f10, null);
    }
}
