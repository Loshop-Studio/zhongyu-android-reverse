package com.zykj.blackboard.bean;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class BackgroundLineConfig {

    /* renamed from: a */
    public int f8187a;

    /* renamed from: b */
    public float f8188b;

    /* renamed from: c */
    public BackgroundLineType f8189c;

    /* renamed from: d */
    public float f8190d;

    @Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m13413d2 = {"Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "blackboard_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public enum BackgroundLineType {
        Horizontal,
        Interweave
    }

    public BackgroundLineConfig(int i9, float f10, BackgroundLineType lineType, float f11) {
        Intrinsics.checkNotNullParameter(lineType, "lineType");
        this.f8187a = i9;
        this.f8188b = f10;
        this.f8189c = lineType;
        this.f8190d = f11;
    }

    /* renamed from: a */
    public final int m7069a() {
        return this.f8187a;
    }

    /* renamed from: b */
    public final float m7070b() {
        return this.f8188b;
    }

    /* renamed from: c */
    public final BackgroundLineType m7071c() {
        return this.f8189c;
    }

    /* renamed from: d */
    public final float m7072d() {
        return this.f8190d;
    }

    /* renamed from: e */
    public final void m7073e(int i9) {
        this.f8187a = i9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackgroundLineConfig)) {
            return false;
        }
        BackgroundLineConfig backgroundLineConfig = (BackgroundLineConfig) obj;
        return this.f8187a == backgroundLineConfig.f8187a && Intrinsics.areEqual((Object) Float.valueOf(this.f8188b), (Object) Float.valueOf(backgroundLineConfig.f8188b)) && this.f8189c == backgroundLineConfig.f8189c && Intrinsics.areEqual((Object) Float.valueOf(this.f8190d), (Object) Float.valueOf(backgroundLineConfig.f8190d));
    }

    /* renamed from: f */
    public final void m7074f(float f10) {
        this.f8188b = f10;
    }

    /* renamed from: g */
    public final void m7075g(BackgroundLineType backgroundLineType) {
        Intrinsics.checkNotNullParameter(backgroundLineType, "<set-?>");
        this.f8189c = backgroundLineType;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f8187a) * 31) + Float.hashCode(this.f8188b)) * 31) + this.f8189c.hashCode()) * 31) + Float.hashCode(this.f8190d);
    }

    public String toString() {
        return "BackgroundLineConfig(lineColor=" + this.f8187a + ", lineSpace=" + this.f8188b + ", lineType=" + this.f8189c + ", lineWidth=" + this.f8190d + ')';
    }

    public /* synthetic */ BackgroundLineConfig(int i9, float f10, BackgroundLineType backgroundLineType, float f11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0 : i9, (i10 & 2) != 0 ? 96.0f : f10, (i10 & 4) != 0 ? BackgroundLineType.Horizontal : backgroundLineType, (i10 & 8) != 0 ? 3.0f : f11);
    }
}
