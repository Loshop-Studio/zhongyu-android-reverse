package com.zykj.view.board.board;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u001d\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m5110d2 = {"Lcom/zykj/view/board/board/ConfirmButtonType;", "", "isCommitVisible", "", "isRecordVisible", "<init>", "(ZZ)V", "()Z", "Commit", "CommitWithRecord", "Null", "Lcom/zykj/view/board/board/ConfirmButtonType$Commit;", "Lcom/zykj/view/board/board/ConfirmButtonType$CommitWithRecord;", "Lcom/zykj/view/board/board/ConfirmButtonType$Null;", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class ConfirmButtonType {
    private final boolean isCommitVisible;
    private final boolean isRecordVisible;

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/ConfirmButtonType$Commit;", "Lcom/zykj/view/board/board/ConfirmButtonType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Commit extends ConfirmButtonType {

        @NotNull
        public static final Commit INSTANCE = new Commit();

        private Commit() {
            super(true, false, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Commit);
        }

        public int hashCode() {
            return -2081658897;
        }

        @NotNull
        public String toString() {
            return "Commit";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/ConfirmButtonType$CommitWithRecord;", "Lcom/zykj/view/board/board/ConfirmButtonType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class CommitWithRecord extends ConfirmButtonType {

        @NotNull
        public static final CommitWithRecord INSTANCE = new CommitWithRecord();

        private CommitWithRecord() {
            super(false, true, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof CommitWithRecord);
        }

        public int hashCode() {
            return -2002959866;
        }

        @NotNull
        public String toString() {
            return "CommitWithRecord";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/ConfirmButtonType$Null;", "Lcom/zykj/view/board/board/ConfirmButtonType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Null extends ConfirmButtonType {

        @NotNull
        public static final Null INSTANCE = new Null();

        /* JADX WARN: Illegal instructions before constructor call */
        private Null() {
            boolean z8 = false;
            super(z8, z8, 3, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Null);
        }

        public int hashCode() {
            return -703507905;
        }

        @NotNull
        public String toString() {
            return "Null";
        }
    }

    public /* synthetic */ ConfirmButtonType(boolean z8, boolean z9, AbstractC5824e abstractC5824e) {
        this(z8, z9);
    }

    /* renamed from: isCommitVisible, reason: from getter */
    public final boolean getIsCommitVisible() {
        return this.isCommitVisible;
    }

    /* renamed from: isRecordVisible, reason: from getter */
    public final boolean getIsRecordVisible() {
        return this.isRecordVisible;
    }

    private ConfirmButtonType(boolean z8, boolean z9) {
        this.isCommitVisible = z8;
        this.isRecordVisible = z9;
    }

    public /* synthetic */ ConfirmButtonType(boolean z8, boolean z9, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? false : z8, (i & 2) != 0 ? false : z9, null);
    }
}
