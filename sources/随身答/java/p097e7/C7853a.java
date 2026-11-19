package p097e7;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e7.a */
/* loaded from: classes5.dex */
public final class C7853a {

    /* renamed from: a */
    public boolean f13195a;

    /* renamed from: b */
    public Function0 f13196b;

    /* renamed from: c */
    public Function0 f13197c;

    /* renamed from: d */
    public boolean f13198d;

    /* renamed from: e */
    public Function0 f13199e;

    /* renamed from: f */
    public List f13200f;

    /* renamed from: g */
    public Function0 f13201g;

    /* renamed from: h */
    public boolean f13202h;

    /* renamed from: i */
    public boolean f13203i;

    public C7853a(boolean z9, Function0 function0, Function0 function02, boolean z10, Function0 function03, List extrasForSetting, Function0 function04, AbstractC7855b abstractC7855b, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(extrasForSetting, "extrasForSetting");
        this.f13195a = z9;
        this.f13196b = function0;
        this.f13197c = function02;
        this.f13198d = z10;
        this.f13199e = function03;
        this.f13200f = extrasForSetting;
        this.f13201g = function04;
        this.f13202h = z11;
        this.f13203i = z12;
    }

    /* renamed from: a */
    public final Function0 m12330a() {
        return this.f13196b;
    }

    /* renamed from: b */
    public final Function0 m12331b() {
        return this.f13199e;
    }

    /* renamed from: c */
    public final Function0 m12332c() {
        return this.f13197c;
    }

    /* renamed from: d */
    public final List m12333d() {
        return this.f13200f;
    }

    /* renamed from: e */
    public final boolean m12334e() {
        return this.f13202h;
    }

    /* renamed from: f */
    public final boolean m12335f() {
        return this.f13198d;
    }

    /* renamed from: g */
    public final boolean m12336g() {
        return this.f13195a;
    }

    /* renamed from: h */
    public final AbstractC7855b m12337h() {
        return null;
    }

    /* renamed from: i */
    public final boolean m12338i() {
        return this.f13203i;
    }

    public /* synthetic */ C7853a(boolean z9, Function0 function0, Function0 function02, boolean z10, Function0 function03, List list, Function0 function04, AbstractC7855b abstractC7855b, boolean z11, boolean z12, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? false : z9, (i9 & 2) != 0 ? null : function0, (i9 & 4) != 0 ? null : function02, (i9 & 8) != 0 ? false : z10, (i9 & 16) != 0 ? null : function03, (i9 & 32) != 0 ? new ArrayList() : list, (i9 & 64) != 0 ? null : function04, (i9 & 128) != 0 ? null : abstractC7855b, (i9 & 256) != 0 ? false : z11, (i9 & 512) != 0 ? false : z12);
    }
}
