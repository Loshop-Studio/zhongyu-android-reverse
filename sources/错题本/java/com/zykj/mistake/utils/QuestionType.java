package com.zykj.mistake.utils;

import android.view.serialization.ClassDiscriminatorModeKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, m5110d2 = {"Lcom/zykj/mistake/utils/QuestionType;", "", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "I", "getType", "()I", "setType", "(I)V", "", "typeName", "Ljava/lang/String;", "getTypeName", "()Ljava/lang/String;", "setTypeName", "(Ljava/lang/String;)V", "TYPE_UNKNOW", "TYPE_SINGLE", "TYPE_MULTIPLE", "TYPE_JUDGE", "TYPE_BLANK", "TYPE_SUMMARY", "TYPE_CLOZE", "TYPE_MIX", "TYPE_LISTEN", "TYPE_COMPREHENSION", "TYPE_SEVEN_CHOICES_FIVE", "TYPE_COMPOSITION", "TYPE_CORRECTION", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class QuestionType {
    public static final QuestionType TYPE_BLANK;
    public static final QuestionType TYPE_CLOZE;
    public static final QuestionType TYPE_COMPOSITION;
    public static final QuestionType TYPE_COMPREHENSION;
    public static final QuestionType TYPE_CORRECTION;
    public static final QuestionType TYPE_JUDGE;
    public static final QuestionType TYPE_LISTEN;
    public static final QuestionType TYPE_MIX;
    public static final QuestionType TYPE_MULTIPLE;
    public static final QuestionType TYPE_SEVEN_CHOICES_FIVE;
    public static final QuestionType TYPE_SINGLE;
    public static final QuestionType TYPE_SUMMARY;
    public static final QuestionType TYPE_UNKNOW;

    /* renamed from: a */
    public static final /* synthetic */ QuestionType[] f8021a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f8022b;
    private int type;

    @NotNull
    private String typeName;

    static {
        QuestionType questionType = new QuestionType("TYPE_UNKNOW", 0, 0, "未赋值");
        TYPE_UNKNOW = questionType;
        QuestionType questionType2 = new QuestionType("TYPE_SINGLE", 1, 1, "单选题");
        TYPE_SINGLE = questionType2;
        QuestionType questionType3 = new QuestionType("TYPE_MULTIPLE", 2, 2, "多选题");
        TYPE_MULTIPLE = questionType3;
        QuestionType questionType4 = new QuestionType("TYPE_JUDGE", 3, 3, "判断题");
        TYPE_JUDGE = questionType4;
        QuestionType questionType5 = new QuestionType("TYPE_BLANK", 4, 4, "填空题");
        TYPE_BLANK = questionType5;
        QuestionType questionType6 = new QuestionType("TYPE_SUMMARY", 5, 5, "问答题");
        TYPE_SUMMARY = questionType6;
        QuestionType questionType7 = new QuestionType("TYPE_CLOZE", 6, 6, "完型填空");
        TYPE_CLOZE = questionType7;
        QuestionType questionType8 = new QuestionType("TYPE_MIX", 7, 7, "混合题");
        TYPE_MIX = questionType8;
        QuestionType questionType9 = new QuestionType("TYPE_LISTEN", 8, 8, "听力题");
        TYPE_LISTEN = questionType9;
        QuestionType questionType10 = new QuestionType("TYPE_COMPREHENSION", 9, 9, "阅读理解");
        TYPE_COMPREHENSION = questionType10;
        QuestionType questionType11 = new QuestionType("TYPE_SEVEN_CHOICES_FIVE", 10, 10, "七选五");
        TYPE_SEVEN_CHOICES_FIVE = questionType11;
        QuestionType questionType12 = new QuestionType("TYPE_COMPOSITION", 11, 11, "作文");
        TYPE_COMPOSITION = questionType12;
        QuestionType questionType13 = new QuestionType("TYPE_CORRECTION", 12, 12, "短文改错");
        TYPE_CORRECTION = questionType13;
        QuestionType[] questionTypeArr = {questionType, questionType2, questionType3, questionType4, questionType5, questionType6, questionType7, questionType8, questionType9, questionType10, questionType11, questionType12, questionType13};
        f8021a = questionTypeArr;
        f8022b = AbstractC5817a.m5310a(questionTypeArr);
    }

    public QuestionType(String str, int i, int i8, String str2) {
        this.type = i8;
        this.typeName = str2;
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f8022b;
    }

    public static QuestionType valueOf(String str) {
        return (QuestionType) Enum.valueOf(QuestionType.class, str);
    }

    public static QuestionType[] values() {
        return (QuestionType[]) f8021a.clone();
    }

    public final int getType() {
        return this.type;
    }

    @NotNull
    public final String getTypeName() {
        return this.typeName;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setTypeName(@NotNull String str) {
        AbstractC5830k.m5330g(str, "<set-?>");
        this.typeName = str;
    }
}
