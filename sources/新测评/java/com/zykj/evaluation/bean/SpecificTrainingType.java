package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, m13558d2 = {"Lcom/zykj/evaluation/bean/SpecificTrainingType;", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "<init>", "(I)V", "getType", "()I", "Normal", "CompositionTraining", "QuickHomework", "TeachMaterial", "Lcom/zykj/evaluation/bean/SpecificTrainingType$CompositionTraining;", "Lcom/zykj/evaluation/bean/SpecificTrainingType$Normal;", "Lcom/zykj/evaluation/bean/SpecificTrainingType$QuickHomework;", "Lcom/zykj/evaluation/bean/SpecificTrainingType$TeachMaterial;", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public abstract class SpecificTrainingType {
    public static final int $stable = 0;
    private final int type;

    @StabilityInferred(parameters = 1)
    @Metadata(m13557d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m13558d2 = {"Lcom/zykj/evaluation/bean/SpecificTrainingType$CompositionTraining;", "Lcom/zykj/evaluation/bean/SpecificTrainingType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
    public static final /* data */ class CompositionTraining extends SpecificTrainingType {
        public static final int $stable = 0;
        public static final CompositionTraining INSTANCE = new CompositionTraining();

        private CompositionTraining() {
            super(1, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CompositionTraining);
        }

        public int hashCode() {
            return -385284885;
        }

        public String toString() {
            return "CompositionTraining";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(m13557d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m13558d2 = {"Lcom/zykj/evaluation/bean/SpecificTrainingType$Normal;", "Lcom/zykj/evaluation/bean/SpecificTrainingType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
    public static final /* data */ class Normal extends SpecificTrainingType {
        public static final int $stable = 0;
        public static final Normal INSTANCE = new Normal();

        private Normal() {
            super(0, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Normal);
        }

        public int hashCode() {
            return -1086128832;
        }

        public String toString() {
            return "Normal";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(m13557d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m13558d2 = {"Lcom/zykj/evaluation/bean/SpecificTrainingType$QuickHomework;", "Lcom/zykj/evaluation/bean/SpecificTrainingType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
    public static final /* data */ class QuickHomework extends SpecificTrainingType {
        public static final int $stable = 0;
        public static final QuickHomework INSTANCE = new QuickHomework();

        private QuickHomework() {
            super(2, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof QuickHomework);
        }

        public int hashCode() {
            return -2054628604;
        }

        public String toString() {
            return "QuickHomework";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(m13557d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m13558d2 = {"Lcom/zykj/evaluation/bean/SpecificTrainingType$TeachMaterial;", "Lcom/zykj/evaluation/bean/SpecificTrainingType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
    public static final /* data */ class TeachMaterial extends SpecificTrainingType {
        public static final int $stable = 0;
        public static final TeachMaterial INSTANCE = new TeachMaterial();

        private TeachMaterial() {
            super(3, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof TeachMaterial);
        }

        public int hashCode() {
            return -1597839805;
        }

        public String toString() {
            return "TeachMaterial";
        }
    }

    public /* synthetic */ SpecificTrainingType(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public final int getType() {
        return this.type;
    }

    private SpecificTrainingType(int i10) {
        this.type = i10;
    }
}
