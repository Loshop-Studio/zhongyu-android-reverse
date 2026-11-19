package com.zykj.evaluation.p057ui.detail;

import com.zykj.evaluation.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.evaluation.ui.detail.d */
/* loaded from: classes4.dex */
public abstract class AbstractC6899d {

    /* renamed from: a */
    public final int f9243a;

    /* renamed from: b */
    public final int f9244b;

    /* renamed from: com.zykj.evaluation.ui.detail.d$a */
    public static final class a extends AbstractC6899d {

        /* renamed from: c */
        public static final a f9245c = new a();

        public a() {
            super(R.drawable.icon_add_mistake, R.string.no_in_mistake, null);
        }
    }

    /* renamed from: com.zykj.evaluation.ui.detail.d$b */
    public static final class b extends AbstractC6899d {

        /* renamed from: c */
        public static final b f9246c = new b();

        public b() {
            super(R.drawable.icon_add_mistake_h, R.string.in_mistake, null);
        }
    }

    public /* synthetic */ AbstractC6899d(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11);
    }

    /* renamed from: a */
    public final int m9468a() {
        return this.f9243a;
    }

    /* renamed from: b */
    public final int m9469b() {
        return this.f9244b;
    }

    public AbstractC6899d(int i10, int i11) {
        this.f9243a = i10;
        this.f9244b = i11;
    }
}
