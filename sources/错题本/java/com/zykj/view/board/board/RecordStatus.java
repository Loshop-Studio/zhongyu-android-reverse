package com.zykj.view.board.board;

import androidx.annotation.DrawableRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.view.C5280R;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u000e\u000f\u0010\u0011B7\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\r\u0082\u0001\u0004\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m5110d2 = {"Lcom/zykj/view/board/board/RecordStatus;", "", "icon", "", "isProgressVisible", "", "isFunctionVisible", "isCropVisible", "isRecordVisible", "<init>", "(IZZZZ)V", "getIcon", "()I", "()Z", "Init", "Pause", "Recording", "Continue", "Lcom/zykj/view/board/board/RecordStatus$Continue;", "Lcom/zykj/view/board/board/RecordStatus$Init;", "Lcom/zykj/view/board/board/RecordStatus$Pause;", "Lcom/zykj/view/board/board/RecordStatus$Recording;", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class RecordStatus {
    private final int icon;
    private final boolean isCropVisible;
    private final boolean isFunctionVisible;
    private final boolean isProgressVisible;
    private final boolean isRecordVisible;

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/RecordStatus$Continue;", "Lcom/zykj/view/board/board/RecordStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Continue extends RecordStatus {

        @NotNull
        public static final Continue INSTANCE = new Continue();

        private Continue() {
            super(C5280R.drawable.view_icon_record_resume2, true, true, false, false, 24, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Continue);
        }

        public int hashCode() {
            return -266170468;
        }

        @NotNull
        public String toString() {
            return "Continue";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/RecordStatus$Init;", "Lcom/zykj/view/board/board/RecordStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Init extends RecordStatus {

        @NotNull
        public static final Init INSTANCE = new Init();

        private Init() {
            super(C5280R.drawable.view_icon_record_resume, false, true, false, false, 24, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Init);
        }

        public int hashCode() {
            return 1204587141;
        }

        @NotNull
        public String toString() {
            return "Init";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/RecordStatus$Pause;", "Lcom/zykj/view/board/board/RecordStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Pause extends RecordStatus {

        @NotNull
        public static final Pause INSTANCE = new Pause();

        private Pause() {
            super(C5280R.drawable.icon_record_start, true, true, false, false, 24, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Pause);
        }

        public int hashCode() {
            return -1306415327;
        }

        @NotNull
        public String toString() {
            return "Pause";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/RecordStatus$Recording;", "Lcom/zykj/view/board/board/RecordStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Recording extends RecordStatus {

        @NotNull
        public static final Recording INSTANCE = new Recording();

        private Recording() {
            super(C5280R.drawable.view_icon_record_stop, true, false, false, false, 24, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Recording);
        }

        public int hashCode() {
            return 1735621020;
        }

        @NotNull
        public String toString() {
            return "Recording";
        }
    }

    public /* synthetic */ RecordStatus(int i, boolean z8, boolean z9, boolean z10, boolean z11, AbstractC5824e abstractC5824e) {
        this(i, z8, z9, z10, z11);
    }

    public final int getIcon() {
        return this.icon;
    }

    /* renamed from: isCropVisible, reason: from getter */
    public final boolean getIsCropVisible() {
        return this.isCropVisible;
    }

    /* renamed from: isFunctionVisible, reason: from getter */
    public final boolean getIsFunctionVisible() {
        return this.isFunctionVisible;
    }

    /* renamed from: isProgressVisible, reason: from getter */
    public final boolean getIsProgressVisible() {
        return this.isProgressVisible;
    }

    /* renamed from: isRecordVisible, reason: from getter */
    public final boolean getIsRecordVisible() {
        return this.isRecordVisible;
    }

    private RecordStatus(@DrawableRes int i, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.icon = i;
        this.isProgressVisible = z8;
        this.isFunctionVisible = z9;
        this.isCropVisible = z10;
        this.isRecordVisible = z11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RecordStatus(int i, boolean z8, boolean z9, boolean z10, boolean z11, int i8, AbstractC5824e abstractC5824e) {
        boolean z12 = (i8 & 8) != 0 ? z8 && z9 : z10;
        this(i, z8, z9, z12, (i8 & 16) != 0 ? z8 || z12 : z11, null);
    }
}
