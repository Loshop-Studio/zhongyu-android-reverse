package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m13558d2 = {"Lcom/zykj/evaluation/bean/PageSize;", "", "value", "", "<init>", "(I)V", "getValue", "()I", "A4", "A3Normal", "A3Special", "Lcom/zykj/evaluation/bean/PageSize$A3Normal;", "Lcom/zykj/evaluation/bean/PageSize$A3Special;", "Lcom/zykj/evaluation/bean/PageSize$A4;", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public abstract class PageSize {
    public static final int $stable = 0;
    private final int value;

    @StabilityInferred(parameters = 1)
    @Metadata(m13557d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m13558d2 = {"Lcom/zykj/evaluation/bean/PageSize$A3Normal;", "Lcom/zykj/evaluation/bean/PageSize;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
    public static final /* data */ class A3Normal extends PageSize {
        public static final int $stable = 0;
        public static final A3Normal INSTANCE = new A3Normal();

        private A3Normal() {
            super(2, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof A3Normal);
        }

        public int hashCode() {
            return 353669288;
        }

        public String toString() {
            return "A3Normal";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(m13557d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m13558d2 = {"Lcom/zykj/evaluation/bean/PageSize$A3Special;", "Lcom/zykj/evaluation/bean/PageSize;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
    public static final /* data */ class A3Special extends PageSize {
        public static final int $stable = 0;
        public static final A3Special INSTANCE = new A3Special();

        private A3Special() {
            super(3, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof A3Special);
        }

        public int hashCode() {
            return -1762269928;
        }

        public String toString() {
            return "A3Special";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(m13557d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m13558d2 = {"Lcom/zykj/evaluation/bean/PageSize$A4;", "Lcom/zykj/evaluation/bean/PageSize;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
    /* renamed from: com.zykj.evaluation.bean.PageSize$A4 */
    public static final /* data */ class C6857A4 extends PageSize {
        public static final int $stable = 0;
        public static final C6857A4 INSTANCE = new C6857A4();

        private C6857A4() {
            super(1, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C6857A4);
        }

        public int hashCode() {
            return 366179426;
        }

        public String toString() {
            return "A4";
        }
    }

    public /* synthetic */ PageSize(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public final int getValue() {
        return this.value;
    }

    private PageSize(int i10) {
        this.value = i10;
    }
}
