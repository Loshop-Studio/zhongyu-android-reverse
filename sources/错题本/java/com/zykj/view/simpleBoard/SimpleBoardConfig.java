package com.zykj.view.simpleBoard;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b*\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003Jc\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\nHÆ\u0001J\u0013\u00101\u001a\u00020\u00032\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\nHÖ\u0001J\t\u00104\u001a\u000205HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0011\"\u0004\b\"\u0010\u0013R\u001a\u0010\f\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0017\"\u0004\b$\u0010\u0019R\u001a\u0010\r\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001f\"\u0004\b&\u0010!¨\u00066"}, m5110d2 = {"Lcom/zykj/view/simpleBoard/SimpleBoardConfig;", "", "enableFinger", "", "enableControl", "maxScaleTime", "", "minScaleTime", "penWidth", "penColor", "", "isPenDashed", "eraserSize", "eraserColor", "<init>", "(ZZFFFIZFI)V", "getEnableFinger", "()Z", "setEnableFinger", "(Z)V", "getEnableControl", "setEnableControl", "getMaxScaleTime", "()F", "setMaxScaleTime", "(F)V", "getMinScaleTime", "setMinScaleTime", "getPenWidth", "setPenWidth", "getPenColor", "()I", "setPenColor", "(I)V", "setPenDashed", "getEraserSize", "setEraserSize", "getEraserColor", "setEraserColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class SimpleBoardConfig {
    private boolean enableControl;
    private boolean enableFinger;
    private int eraserColor;
    private float eraserSize;
    private boolean isPenDashed;
    private float maxScaleTime;
    private float minScaleTime;
    private int penColor;
    private float penWidth;

    public SimpleBoardConfig() {
        this(false, false, 0.0f, 0.0f, 0.0f, 0, false, 0.0f, 0, 511, null);
    }

    public static /* synthetic */ SimpleBoardConfig copy$default(SimpleBoardConfig simpleBoardConfig, boolean z8, boolean z9, float f, float f7, float f8, int i, boolean z10, float f9, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z8 = simpleBoardConfig.enableFinger;
        }
        if ((i9 & 2) != 0) {
            z9 = simpleBoardConfig.enableControl;
        }
        if ((i9 & 4) != 0) {
            f = simpleBoardConfig.maxScaleTime;
        }
        if ((i9 & 8) != 0) {
            f7 = simpleBoardConfig.minScaleTime;
        }
        if ((i9 & 16) != 0) {
            f8 = simpleBoardConfig.penWidth;
        }
        if ((i9 & 32) != 0) {
            i = simpleBoardConfig.penColor;
        }
        if ((i9 & 64) != 0) {
            z10 = simpleBoardConfig.isPenDashed;
        }
        if ((i9 & 128) != 0) {
            f9 = simpleBoardConfig.eraserSize;
        }
        if ((i9 & 256) != 0) {
            i8 = simpleBoardConfig.eraserColor;
        }
        float f10 = f9;
        int i10 = i8;
        int i11 = i;
        boolean z11 = z10;
        float f11 = f8;
        float f12 = f;
        return simpleBoardConfig.copy(z8, z9, f12, f7, f11, i11, z11, f10, i10);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnableFinger() {
        return this.enableFinger;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnableControl() {
        return this.enableControl;
    }

    /* renamed from: component3, reason: from getter */
    public final float getMaxScaleTime() {
        return this.maxScaleTime;
    }

    /* renamed from: component4, reason: from getter */
    public final float getMinScaleTime() {
        return this.minScaleTime;
    }

    /* renamed from: component5, reason: from getter */
    public final float getPenWidth() {
        return this.penWidth;
    }

    /* renamed from: component6, reason: from getter */
    public final int getPenColor() {
        return this.penColor;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsPenDashed() {
        return this.isPenDashed;
    }

    /* renamed from: component8, reason: from getter */
    public final float getEraserSize() {
        return this.eraserSize;
    }

    /* renamed from: component9, reason: from getter */
    public final int getEraserColor() {
        return this.eraserColor;
    }

    @NotNull
    public final SimpleBoardConfig copy(boolean enableFinger, boolean enableControl, float maxScaleTime, float minScaleTime, float penWidth, int penColor, boolean isPenDashed, float eraserSize, int eraserColor) {
        return new SimpleBoardConfig(enableFinger, enableControl, maxScaleTime, minScaleTime, penWidth, penColor, isPenDashed, eraserSize, eraserColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimpleBoardConfig)) {
            return false;
        }
        SimpleBoardConfig simpleBoardConfig = (SimpleBoardConfig) other;
        return this.enableFinger == simpleBoardConfig.enableFinger && this.enableControl == simpleBoardConfig.enableControl && Float.compare(this.maxScaleTime, simpleBoardConfig.maxScaleTime) == 0 && Float.compare(this.minScaleTime, simpleBoardConfig.minScaleTime) == 0 && Float.compare(this.penWidth, simpleBoardConfig.penWidth) == 0 && this.penColor == simpleBoardConfig.penColor && this.isPenDashed == simpleBoardConfig.isPenDashed && Float.compare(this.eraserSize, simpleBoardConfig.eraserSize) == 0 && this.eraserColor == simpleBoardConfig.eraserColor;
    }

    public final boolean getEnableControl() {
        return this.enableControl;
    }

    public final boolean getEnableFinger() {
        return this.enableFinger;
    }

    public final int getEraserColor() {
        return this.eraserColor;
    }

    public final float getEraserSize() {
        return this.eraserSize;
    }

    public final float getMaxScaleTime() {
        return this.maxScaleTime;
    }

    public final float getMinScaleTime() {
        return this.minScaleTime;
    }

    public final int getPenColor() {
        return this.penColor;
    }

    public final float getPenWidth() {
        return this.penWidth;
    }

    public int hashCode() {
        return Integer.hashCode(this.eraserColor) + AbstractC0584a.m901b(this.eraserSize, AbstractC0584a.m908i(this.isPenDashed, AbstractC0584a.m902c(this.penColor, AbstractC0584a.m901b(this.penWidth, AbstractC0584a.m901b(this.minScaleTime, AbstractC0584a.m901b(this.maxScaleTime, AbstractC0584a.m908i(this.enableControl, Boolean.hashCode(this.enableFinger) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final boolean isPenDashed() {
        return this.isPenDashed;
    }

    public final void setEnableControl(boolean z8) {
        this.enableControl = z8;
    }

    public final void setEnableFinger(boolean z8) {
        this.enableFinger = z8;
    }

    public final void setEraserColor(int i) {
        this.eraserColor = i;
    }

    public final void setEraserSize(float f) {
        this.eraserSize = f;
    }

    public final void setMaxScaleTime(float f) {
        this.maxScaleTime = f;
    }

    public final void setMinScaleTime(float f) {
        this.minScaleTime = f;
    }

    public final void setPenColor(int i) {
        this.penColor = i;
    }

    public final void setPenDashed(boolean z8) {
        this.isPenDashed = z8;
    }

    public final void setPenWidth(float f) {
        this.penWidth = f;
    }

    @NotNull
    public String toString() {
        boolean z8 = this.enableFinger;
        boolean z9 = this.enableControl;
        float f = this.maxScaleTime;
        float f7 = this.minScaleTime;
        float f8 = this.penWidth;
        int i = this.penColor;
        boolean z10 = this.isPenDashed;
        float f9 = this.eraserSize;
        int i8 = this.eraserColor;
        StringBuilder sb = new StringBuilder("SimpleBoardConfig(enableFinger=");
        sb.append(z8);
        sb.append(", enableControl=");
        sb.append(z9);
        sb.append(", maxScaleTime=");
        sb.append(f);
        sb.append(", minScaleTime=");
        sb.append(f7);
        sb.append(", penWidth=");
        sb.append(f8);
        sb.append(", penColor=");
        sb.append(i);
        sb.append(", isPenDashed=");
        sb.append(z10);
        sb.append(", eraserSize=");
        sb.append(f9);
        sb.append(", eraserColor=");
        return AbstractC0037f.m90o(sb, ")", i8);
    }

    public SimpleBoardConfig(boolean z8, boolean z9, float f, float f7, float f8, int i, boolean z10, float f9, int i8) {
        this.enableFinger = z8;
        this.enableControl = z9;
        this.maxScaleTime = f;
        this.minScaleTime = f7;
        this.penWidth = f8;
        this.penColor = i;
        this.isPenDashed = z10;
        this.eraserSize = f9;
        this.eraserColor = i8;
    }

    public /* synthetic */ SimpleBoardConfig(boolean z8, boolean z9, float f, float f7, float f8, int i, boolean z10, float f9, int i8, int i9, AbstractC5824e abstractC5824e) {
        this((i9 & 1) != 0 ? true : z8, (i9 & 2) != 0 ? false : z9, (i9 & 4) != 0 ? 1.5f : f, (i9 & 8) != 0 ? 1.0f : f7, (i9 & 16) != 0 ? 3.0f : f8, (i9 & 32) != 0 ? ViewCompat.MEASURED_STATE_MASK : i, (i9 & 64) != 0 ? false : z10, (i9 & 128) != 0 ? 40.0f : f9, (i9 & 256) != 0 ? SupportMenu.CATEGORY_MASK : i8);
    }
}
