package p246t7;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t7.a */
/* loaded from: classes5.dex */
public final class C9464a {

    /* renamed from: a */
    public boolean f16528a;

    /* renamed from: b */
    public Function0 f16529b;

    /* renamed from: c */
    public Function0 f16530c;

    /* renamed from: d */
    public boolean f16531d;

    /* renamed from: e */
    public Function0 f16532e;

    /* renamed from: f */
    public List f16533f;

    /* renamed from: g */
    public Function0 f16534g;

    /* renamed from: h */
    public boolean f16535h;

    /* renamed from: i */
    public boolean f16536i;

    public C9464a(boolean z9, Function0 function0, Function0 function02, boolean z10, Function0 function03, List extrasForSetting, Function0 function04, AbstractC9466b abstractC9466b, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(extrasForSetting, "extrasForSetting");
        this.f16528a = z9;
        this.f16529b = function0;
        this.f16530c = function02;
        this.f16531d = z10;
        this.f16532e = function03;
        this.f16533f = extrasForSetting;
        this.f16534g = function04;
        this.f16535h = z11;
        this.f16536i = z12;
    }

    /* renamed from: a */
    public final Function0 m15833a() {
        return this.f16529b;
    }

    /* renamed from: b */
    public final Function0 m15834b() {
        return this.f16532e;
    }

    /* renamed from: c */
    public final Function0 m15835c() {
        return this.f16530c;
    }

    /* renamed from: d */
    public final List m15836d() {
        return this.f16533f;
    }

    /* renamed from: e */
    public final boolean m15837e() {
        return this.f16535h;
    }

    /* renamed from: f */
    public final boolean m15838f() {
        return this.f16531d;
    }

    /* renamed from: g */
    public final boolean m15839g() {
        return this.f16528a;
    }

    /* renamed from: h */
    public final AbstractC9466b m15840h() {
        return null;
    }

    /* renamed from: i */
    public final boolean m15841i() {
        return this.f16536i;
    }

    public /* synthetic */ C9464a(boolean z9, Function0 function0, Function0 function02, boolean z10, Function0 function03, List list, Function0 function04, AbstractC9466b abstractC9466b, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z9, (i10 & 2) != 0 ? null : function0, (i10 & 4) != 0 ? null : function02, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? null : function03, (i10 & 32) != 0 ? new ArrayList() : list, (i10 & 64) != 0 ? null : function04, (i10 & 128) != 0 ? null : abstractC9466b, (i10 & 256) != 0 ? false : z11, (i10 & 512) != 0 ? false : z12);
    }
}
