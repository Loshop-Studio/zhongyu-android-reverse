package com.zykj.evaluation.p057ui.sheet;

import com.blankj.utilcode.util.Utils;
import com.zykj.evaluation.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.zykj.evaluation.ui.sheet.b */
/* loaded from: classes4.dex */
public abstract class AbstractC6934b {

    /* renamed from: a */
    public final String f9951a;

    /* renamed from: com.zykj.evaluation.ui.sheet.b$a */
    public static final class a extends AbstractC6934b {

        /* renamed from: b */
        public static final a f9952b = new a();

        public a() {
            super("", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 710746823;
        }

        public String toString() {
            return "Default";
        }
    }

    /* renamed from: com.zykj.evaluation.ui.sheet.b$b */
    public static final class b extends AbstractC6934b {

        /* renamed from: b */
        public static final b f9953b = new b();

        /* JADX WARN: Illegal instructions before constructor call */
        public b() {
            String string = Utils.getApp().getString(R.string.sheet_preview_tip_error);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            super(string, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 551782414;
        }

        public String toString() {
            return "Error";
        }
    }

    /* renamed from: com.zykj.evaluation.ui.sheet.b$c */
    public static final class c extends AbstractC6934b {

        /* renamed from: b */
        public final boolean f9954b;

        /* renamed from: c */
        public final boolean f9955c;

        /* renamed from: d */
        public final boolean f9956d;

        public /* synthetic */ c(boolean z9, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? true : z9, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11);
        }

        /* renamed from: b */
        public final boolean m10217b() {
            return this.f9956d;
        }

        /* renamed from: c */
        public final boolean m10218c() {
            return this.f9954b;
        }

        /* renamed from: d */
        public final boolean m10219d() {
            return this.f9955c;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public c(boolean z9, boolean z10, boolean z11) {
            String string = Utils.getApp().getString(R.string.sheet_preview_tip_failed);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            super(string, null);
            this.f9954b = z9;
            this.f9955c = z10;
            this.f9956d = z11;
        }
    }

    /* renamed from: com.zykj.evaluation.ui.sheet.b$d */
    public static final class d extends AbstractC6934b {

        /* renamed from: b */
        public static final d f9957b = new d();

        /* JADX WARN: Illegal instructions before constructor call */
        public d() {
            String string = Utils.getApp().getString(R.string.sheet_preview_tip_success);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            super(string, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 1593740425;
        }

        public String toString() {
            return "Success";
        }
    }

    public /* synthetic */ AbstractC6934b(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* renamed from: a */
    public final String m10216a() {
        return this.f9951a;
    }

    public AbstractC6934b(String str) {
        this.f9951a = str;
    }
}
