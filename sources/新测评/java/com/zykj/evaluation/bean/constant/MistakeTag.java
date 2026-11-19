package com.zykj.evaluation.bean.constant;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\f\r\u000e\u000fB\u001b\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0004\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m13558d2 = {"Lcom/zykj/evaluation/bean/constant/MistakeTag;", "", "id", "", HintConstants.AUTOFILL_HINT_NAME, "", "<init>", "(JLjava/lang/String;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "Add", "Diff", "AttainedLevel", "ErrorReason", "Lcom/zykj/evaluation/bean/constant/MistakeTag$Add;", "Lcom/zykj/evaluation/bean/constant/MistakeTag$AttainedLevel;", "Lcom/zykj/evaluation/bean/constant/MistakeTag$Diff;", "Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason;", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public abstract class MistakeTag {
    public static final int $stable = 0;
    private final long id;
    private final String name;

    @StabilityInferred(parameters = 1)
    @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13558d2 = {"Lcom/zykj/evaluation/bean/constant/MistakeTag$Add;", "Lcom/zykj/evaluation/bean/constant/MistakeTag;", "<init>", "()V", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
    public static final class Add extends MistakeTag {
        public static final int $stable = 0;
        public static final Add INSTANCE = new Add();

        /* JADX WARN: Multi-variable type inference failed */
        private Add() {
            super(-1L, null, 0 == true ? 1 : 0);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(m13557d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m13558d2 = {"Lcom/zykj/evaluation/bean/constant/MistakeTag$AttainedLevel;", "Lcom/zykj/evaluation/bean/constant/MistakeTag;", "id", "", HintConstants.AUTOFILL_HINT_NAME, "", "<init>", "(JLjava/lang/String;)V", "Unknown", "Generally", "Obviously", "Lcom/zykj/evaluation/bean/constant/MistakeTag$AttainedLevel$Generally;", "Lcom/zykj/evaluation/bean/constant/MistakeTag$AttainedLevel$Obviously;", "Lcom/zykj/evaluation/bean/constant/MistakeTag$AttainedLevel$Unknown;", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
    public static abstract class AttainedLevel extends MistakeTag {
        public static final int $stable = 0;

        @StabilityInferred(parameters = 1)
        @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13558d2 = {"Lcom/zykj/evaluation/bean/constant/MistakeTag$AttainedLevel$Generally;", "Lcom/zykj/evaluation/bean/constant/MistakeTag$AttainedLevel;", "<init>", "()V", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
        public static final class Generally extends AttainedLevel {
            public static final int $stable = 0;
            public static final Generally INSTANCE = new Generally();

            private Generally() {
                super(2L, "基本懂", null);
            }
        }

        @StabilityInferred(parameters = 1)
        @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13558d2 = {"Lcom/zykj/evaluation/bean/constant/MistakeTag$AttainedLevel$Obviously;", "Lcom/zykj/evaluation/bean/constant/MistakeTag$AttainedLevel;", "<init>", "()V", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
        public static final class Obviously extends AttainedLevel {
            public static final int $stable = 0;
            public static final Obviously INSTANCE = new Obviously();

            private Obviously() {
                super(3L, "完全懂", null);
            }
        }

        @StabilityInferred(parameters = 1)
        @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13558d2 = {"Lcom/zykj/evaluation/bean/constant/MistakeTag$AttainedLevel$Unknown;", "Lcom/zykj/evaluation/bean/constant/MistakeTag$AttainedLevel;", "<init>", "()V", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
        public static final class Unknown extends AttainedLevel {
            public static final int $stable = 0;
            public static final Unknown INSTANCE = new Unknown();

            private Unknown() {
                super(1L, "不懂", null);
            }
        }

        public /* synthetic */ AttainedLevel(long j10, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, str);
        }

        private AttainedLevel(long j10, String str) {
            super(j10, str, null);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(m13557d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m13558d2 = {"Lcom/zykj/evaluation/bean/constant/MistakeTag$Diff;", "Lcom/zykj/evaluation/bean/constant/MistakeTag;", "id", "", HintConstants.AUTOFILL_HINT_NAME, "", "<init>", "(JLjava/lang/String;)V", "Easy", "Normal", "Hard", "Lcom/zykj/evaluation/bean/constant/MistakeTag$Diff$Easy;", "Lcom/zykj/evaluation/bean/constant/MistakeTag$Diff$Hard;", "Lcom/zykj/evaluation/bean/constant/MistakeTag$Diff$Normal;", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
    public static abstract class Diff extends MistakeTag {
        public static final int $stable = 0;

        @StabilityInferred(parameters = 1)
        @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13558d2 = {"Lcom/zykj/evaluation/bean/constant/MistakeTag$Diff$Easy;", "Lcom/zykj/evaluation/bean/constant/MistakeTag$Diff;", "<init>", "()V", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
        public static final class Easy extends Diff {
            public static final int $stable = 0;
            public static final Easy INSTANCE = new Easy();

            private Easy() {
                super(1L, "简单", null);
            }
        }

        @StabilityInferred(parameters = 1)
        @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13558d2 = {"Lcom/zykj/evaluation/bean/constant/MistakeTag$Diff$Hard;", "Lcom/zykj/evaluation/bean/constant/MistakeTag$Diff;", "<init>", "()V", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
        public static final class Hard extends Diff {
            public static final int $stable = 0;
            public static final Hard INSTANCE = new Hard();

            private Hard() {
                super(3L, "困难", null);
            }
        }

        @StabilityInferred(parameters = 1)
        @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13558d2 = {"Lcom/zykj/evaluation/bean/constant/MistakeTag$Diff$Normal;", "Lcom/zykj/evaluation/bean/constant/MistakeTag$Diff;", "<init>", "()V", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
        public static final class Normal extends Diff {
            public static final int $stable = 0;
            public static final Normal INSTANCE = new Normal();

            private Normal() {
                super(2L, "一般", null);
            }
        }

        public /* synthetic */ Diff(long j10, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, str);
        }

        private Diff(long j10, String str) {
            super(j10, str, null);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(m13557d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, m13558d2 = {"Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason;", "Lcom/zykj/evaluation/bean/constant/MistakeTag;", "id", "", HintConstants.AUTOFILL_HINT_NAME, "", "<init>", "(JLjava/lang/String;)V", "Concept", "Examination", "Calculate", "Careless", "Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason$Calculate;", "Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason$Careless;", "Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason$Concept;", "Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason$Examination;", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
    public static abstract class ErrorReason extends MistakeTag {
        public static final int $stable = 0;

        @StabilityInferred(parameters = 1)
        @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13558d2 = {"Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason$Calculate;", "Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason;", "<init>", "()V", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
        public static final class Calculate extends ErrorReason {
            public static final int $stable = 0;
            public static final Calculate INSTANCE = new Calculate();

            private Calculate() {
                super(3L, "运算", null);
            }
        }

        @StabilityInferred(parameters = 1)
        @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13558d2 = {"Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason$Careless;", "Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason;", "<init>", "()V", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
        public static final class Careless extends ErrorReason {
            public static final int $stable = 0;
            public static final Careless INSTANCE = new Careless();

            private Careless() {
                super(4L, "粗心", null);
            }
        }

        @StabilityInferred(parameters = 1)
        @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13558d2 = {"Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason$Concept;", "Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason;", "<init>", "()V", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
        public static final class Concept extends ErrorReason {
            public static final int $stable = 0;
            public static final Concept INSTANCE = new Concept();

            private Concept() {
                super(1L, "概念", null);
            }
        }

        @StabilityInferred(parameters = 1)
        @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13558d2 = {"Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason$Examination;", "Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason;", "<init>", "()V", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
        public static final class Examination extends ErrorReason {
            public static final int $stable = 0;
            public static final Examination INSTANCE = new Examination();

            private Examination() {
                super(2L, "审题", null);
            }
        }

        public /* synthetic */ ErrorReason(long j10, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, str);
        }

        private ErrorReason(long j10, String str) {
            super(j10, str, null);
        }
    }

    public /* synthetic */ MistakeTag(long j10, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, str);
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    private MistakeTag(long j10, String str) {
        this.id = j10;
        this.name = str;
    }
}
