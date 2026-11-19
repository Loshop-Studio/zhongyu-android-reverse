package com.zykj.blackboard.core.action.newSelectAtion;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;

@Metadata(m5109d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u000e\u000f\u0010\u0011\u0012B\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u0082\u0001\u0005\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;", "", "value", "", "isSelected", "", "(IZ)V", "()Z", "setSelected", "(Z)V", "getValue", "()I", "setValue", "(I)V", "Black", TypedValues.Custom.NAME, "Preset", "Red", "White", "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Black;", "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;", "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Preset;", "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Red;", "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$White;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class SelectColor {
    private boolean isSelected;
    private int value;

    @Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Black;", "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;", "isSelected", "", "(Z)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Black extends SelectColor {
        public Black() {
            this(false, 1, null);
        }

        public /* synthetic */ Black(boolean z8, int i, AbstractC5824e abstractC5824e) {
            this((i & 1) != 0 ? false : z8);
        }

        public Black(boolean z8) {
            super(ViewCompat.MEASURED_STATE_MASK, z8, null);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;", "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;", TypedValues.Custom.S_COLOR, "", "isSelected", "", "isOpen", "(IZZ)V", "()Z", "setOpen", "(Z)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Custom extends SelectColor {
        private boolean isOpen;

        public Custom() {
            this(0, false, false, 7, null);
        }

        /* renamed from: isOpen, reason: from getter */
        public final boolean getIsOpen() {
            return this.isOpen;
        }

        public final void setOpen(boolean z8) {
            this.isOpen = z8;
        }

        public /* synthetic */ Custom(int i, boolean z8, boolean z9, int i8, AbstractC5824e abstractC5824e) {
            this((i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? false : z8, (i8 & 4) != 0 ? false : z9);
        }

        public Custom(int i, boolean z8, boolean z9) {
            super(i, z8, null);
            this.isOpen = z9;
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Preset;", "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;", TypedValues.Custom.S_COLOR, "", "isSelected", "", "(IZ)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Preset extends SelectColor {
        public /* synthetic */ Preset(int i, boolean z8, int i8, AbstractC5824e abstractC5824e) {
            this(i, (i8 & 2) != 0 ? false : z8);
        }

        public Preset(int i, boolean z8) {
            super(i, z8, null);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Red;", "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;", "isSelected", "", "(Z)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Red extends SelectColor {
        public Red() {
            this(false, 1, null);
        }

        public /* synthetic */ Red(boolean z8, int i, AbstractC5824e abstractC5824e) {
            this((i & 1) != 0 ? false : z8);
        }

        public Red(boolean z8) {
            super(-46799, z8, null);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$White;", "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;", "isSelected", "", "(Z)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class White extends SelectColor {
        public White() {
            this(false, 1, null);
        }

        public /* synthetic */ White(boolean z8, int i, AbstractC5824e abstractC5824e) {
            this((i & 1) != 0 ? false : z8);
        }

        public White(boolean z8) {
            super(-1118482, z8, null);
        }
    }

    public /* synthetic */ SelectColor(int i, boolean z8, AbstractC5824e abstractC5824e) {
        this(i, z8);
    }

    public final int getValue() {
        return this.value;
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z8) {
        this.isSelected = z8;
    }

    public final void setValue(int i) {
        this.value = i;
    }

    private SelectColor(int i, boolean z8) {
        this.value = i;
        this.isSelected = z8;
    }
}
