package com.zykj.view.board.play;

import androidx.annotation.ColorRes;
import androidx.collection.AbstractC0584a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.view.C5280R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\tHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m5110d2 = {"Lcom/zykj/view/board/play/SpeedRate;", "", "speed", "", "label", "", "selected", "", "textColor", "", "<init>", "(DLjava/lang/String;ZI)V", "getSpeed", "()D", "getLabel", "()Ljava/lang/String;", "getSelected", "()Z", "getTextColor", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "Companion", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class SpeedRate {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final double DEFAULT_SPEED = 1.0d;

    @NotNull
    public static final String DEFAULT_SPEED_LABEL = "1.0X";

    @NotNull
    private final String label;
    private final boolean selected;
    private final double speed;
    private final int textColor;

    @Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m5110d2 = {"Lcom/zykj/view/board/play/SpeedRate$Companion;", "", "<init>", "()V", "DEFAULT_SPEED", "", "DEFAULT_SPEED_LABEL", "", "generateList", "", "Lcom/zykj/view/board/play/SpeedRate;", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final List<SpeedRate> generateList() {
            SpeedRate speedRate = new SpeedRate(2.0d, "2.0X", false, 0, 12, null);
            Object[] objArr = 0 == true ? 1 : 0;
            SpeedRate speedRate2 = new SpeedRate(1.75d, "1.75X", objArr, 0, 12, null);
            Object[] objArr2 = 0 == true ? 1 : 0;
            SpeedRate speedRate3 = new SpeedRate(1.5d, "1.5X", objArr2, 0, 12, null);
            Object[] objArr3 = 0 == true ? 1 : 0;
            SpeedRate speedRate4 = new SpeedRate(1.25d, "1.25X", objArr3, 0, 12, null);
            SpeedRate speedRate5 = new SpeedRate(1.0d, SpeedRate.DEFAULT_SPEED_LABEL, true, 0, 8, null);
            Object[] objArr4 = 0 == true ? 1 : 0;
            int i = 0;
            return AbstractC5806u.m5267f(speedRate, speedRate2, speedRate3, speedRate4, speedRate5, new SpeedRate(0.75d, "0.75X", objArr4, 0, 12, null), new SpeedRate(0.5d, "0.5X", 0 == true ? 1 : 0, i, 12, null));
        }

        private Companion() {
        }
    }

    public SpeedRate(double d9, @NotNull String label, boolean z8, @ColorRes int i) {
        AbstractC5830k.m5330g(label, "label");
        this.speed = d9;
        this.label = label;
        this.selected = z8;
        this.textColor = i;
    }

    public static /* synthetic */ SpeedRate copy$default(SpeedRate speedRate, double d9, String str, boolean z8, int i, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            d9 = speedRate.speed;
        }
        double d10 = d9;
        if ((i8 & 2) != 0) {
            str = speedRate.label;
        }
        String str2 = str;
        if ((i8 & 4) != 0) {
            z8 = speedRate.selected;
        }
        boolean z9 = z8;
        if ((i8 & 8) != 0) {
            i = speedRate.textColor;
        }
        return speedRate.copy(d10, str2, z9, i);
    }

    /* renamed from: component1, reason: from getter */
    public final double getSpeed() {
        return this.speed;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTextColor() {
        return this.textColor;
    }

    @NotNull
    public final SpeedRate copy(double speed, @NotNull String label, boolean selected, @ColorRes int textColor) {
        AbstractC5830k.m5330g(label, "label");
        return new SpeedRate(speed, label, selected, textColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpeedRate)) {
            return false;
        }
        SpeedRate speedRate = (SpeedRate) other;
        return Double.compare(this.speed, speedRate.speed) == 0 && AbstractC5830k.m5325b(this.label, speedRate.label) && this.selected == speedRate.selected && this.textColor == speedRate.textColor;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final double getSpeed() {
        return this.speed;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        return Integer.hashCode(this.textColor) + AbstractC0584a.m908i(this.selected, AbstractC0584a.m903d(Double.hashCode(this.speed) * 31, 31, this.label), 31);
    }

    @NotNull
    public String toString() {
        return "SpeedRate(speed=" + this.speed + ", label=" + this.label + ", selected=" + this.selected + ", textColor=" + this.textColor + ")";
    }

    public /* synthetic */ SpeedRate(double d9, String str, boolean z8, int i, int i8, AbstractC5824e abstractC5824e) {
        this(d9, str, (i8 & 4) != 0 ? false : z8, (i8 & 8) != 0 ? C5280R.color.view_selector_green_white : i);
    }
}
