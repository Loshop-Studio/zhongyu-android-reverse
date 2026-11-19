package com.zykj.blackboard.bean;

import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes5.dex */
public final class BackgroundLineConfig {

    /* renamed from: a */
    public int f17753a;

    /* renamed from: b */
    public float f17754b;

    /* renamed from: c */
    public BackgroundLineType f17755c;

    /* renamed from: d */
    public float f17756d;

    public enum BackgroundLineType {
        Horizontal,
        Interweave
    }

    public BackgroundLineConfig(int i10, float f10, BackgroundLineType lineType, float f11) {
        AbstractC9979u.m20294g(lineType, "lineType");
        this.f17753a = i10;
        this.f17754b = f10;
        this.f17755c = lineType;
        this.f17756d = f11;
    }

    /* renamed from: a */
    public final int m13711a() {
        return this.f17753a;
    }

    /* renamed from: b */
    public final float m13712b() {
        return this.f17754b;
    }

    /* renamed from: c */
    public final BackgroundLineType m13713c() {
        return this.f17755c;
    }

    /* renamed from: d */
    public final float m13714d() {
        return this.f17756d;
    }

    /* renamed from: e */
    public final void m13715e(int i10) {
        this.f17753a = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackgroundLineConfig)) {
            return false;
        }
        BackgroundLineConfig backgroundLineConfig = (BackgroundLineConfig) obj;
        return this.f17753a == backgroundLineConfig.f17753a && AbstractC9979u.m20289b(Float.valueOf(this.f17754b), Float.valueOf(backgroundLineConfig.f17754b)) && this.f17755c == backgroundLineConfig.f17755c && AbstractC9979u.m20289b(Float.valueOf(this.f17756d), Float.valueOf(backgroundLineConfig.f17756d));
    }

    /* renamed from: f */
    public final void m13716f(float f10) {
        this.f17754b = f10;
    }

    /* renamed from: g */
    public final void m13717g(BackgroundLineType backgroundLineType) {
        AbstractC9979u.m20294g(backgroundLineType, "<set-?>");
        this.f17755c = backgroundLineType;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f17753a) * 31) + Float.hashCode(this.f17754b)) * 31) + this.f17755c.hashCode()) * 31) + Float.hashCode(this.f17756d);
    }

    public String toString() {
        return "BackgroundLineConfig(lineColor=" + this.f17753a + ", lineSpace=" + this.f17754b + ", lineType=" + this.f17755c + ", lineWidth=" + this.f17756d + ')';
    }

    public /* synthetic */ BackgroundLineConfig(int i10, float f10, BackgroundLineType backgroundLineType, float f11, int i11, AbstractC9972n abstractC9972n) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? 96.0f : f10, (i11 & 4) != 0 ? BackgroundLineType.Horizontal : backgroundLineType, (i11 & 8) != 0 ? 3.0f : f11);
    }
}
