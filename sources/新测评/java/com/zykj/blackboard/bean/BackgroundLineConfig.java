package com.zykj.blackboard.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class BackgroundLineConfig {

    /* renamed from: a */
    public int f6903a;

    /* renamed from: b */
    public float f6904b;

    /* renamed from: c */
    public BackgroundLineType f6905c;

    /* renamed from: d */
    public float f6906d;

    @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m13558d2 = {"Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "blackboard_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
    public enum BackgroundLineType {
        Horizontal,
        Interweave
    }

    public BackgroundLineConfig(int i10, float f10, BackgroundLineType lineType, float f11) {
        Intrinsics.checkNotNullParameter(lineType, "lineType");
        this.f6903a = i10;
        this.f6904b = f10;
        this.f6905c = lineType;
        this.f6906d = f11;
    }

    /* renamed from: a */
    public final int m5974a() {
        return this.f6903a;
    }

    /* renamed from: b */
    public final float m5975b() {
        return this.f6904b;
    }

    /* renamed from: c */
    public final BackgroundLineType m5976c() {
        return this.f6905c;
    }

    /* renamed from: d */
    public final float m5977d() {
        return this.f6906d;
    }

    /* renamed from: e */
    public final void m5978e(int i10) {
        this.f6903a = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackgroundLineConfig)) {
            return false;
        }
        BackgroundLineConfig backgroundLineConfig = (BackgroundLineConfig) obj;
        return this.f6903a == backgroundLineConfig.f6903a && Intrinsics.areEqual((Object) Float.valueOf(this.f6904b), (Object) Float.valueOf(backgroundLineConfig.f6904b)) && this.f6905c == backgroundLineConfig.f6905c && Intrinsics.areEqual((Object) Float.valueOf(this.f6906d), (Object) Float.valueOf(backgroundLineConfig.f6906d));
    }

    /* renamed from: f */
    public final void m5979f(float f10) {
        this.f6904b = f10;
    }

    /* renamed from: g */
    public final void m5980g(BackgroundLineType backgroundLineType) {
        Intrinsics.checkNotNullParameter(backgroundLineType, "<set-?>");
        this.f6905c = backgroundLineType;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f6903a) * 31) + Float.hashCode(this.f6904b)) * 31) + this.f6905c.hashCode()) * 31) + Float.hashCode(this.f6906d);
    }

    public String toString() {
        return "BackgroundLineConfig(lineColor=" + this.f6903a + ", lineSpace=" + this.f6904b + ", lineType=" + this.f6905c + ", lineWidth=" + this.f6906d + ')';
    }

    public /* synthetic */ BackgroundLineConfig(int i10, float f10, BackgroundLineType backgroundLineType, float f11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? 96.0f : f10, (i11 & 4) != 0 ? BackgroundLineType.Horizontal : backgroundLineType, (i11 & 8) != 0 ? 3.0f : f11);
    }
}
