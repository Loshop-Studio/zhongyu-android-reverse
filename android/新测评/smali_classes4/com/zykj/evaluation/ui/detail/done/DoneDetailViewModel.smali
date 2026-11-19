.class public final Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;
.super Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0007\u0018\u00002\u00020\u0001B/\u0008\u0007\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0008\u0001\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J%\u0010\u0017\u001a\u00020\u000f2\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ1\u0010 \u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001e0\u00120\u001dH\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u0017\u0010$\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"H\u0016\u00a2\u0006\u0004\u0008$\u0010%J%\u0010(\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"2\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u000f0&H\u0016\u00a2\u0006\u0004\u0008(\u0010)J\u008b\u0001\u00108\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u00152\u0006\u0010,\u001a\u00020+2\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020-0\u00122\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u00020.0\u00122\u0016\u00103\u001a\u0012\u0012\u0004\u0012\u00020100j\u0008\u0012\u0004\u0012\u000201`22\u0006\u00104\u001a\u00020\r2\u0016\u00106\u001a\u0012\u0012\u0004\u0012\u00020500j\u0008\u0012\u0004\u0012\u000205`22\u0016\u00107\u001a\u0012\u0012\u0004\u0012\u00020500j\u0008\u0012\u0004\u0012\u000205`2H\u0002\u00a2\u0006\u0004\u00088\u00109J\u008f\u0001\u0010>\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u00152\u0006\u0010:\u001a\u00020-2\u0006\u0010;\u001a\u00020\u001e2\u0008\u0010<\u001a\u0004\u0018\u00010.2\u000c\u0010=\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u00122\u0016\u00103\u001a\u0012\u0012\u0004\u0012\u00020100j\u0008\u0012\u0004\u0012\u000201`22\u0006\u00104\u001a\u00020\r2\u0016\u00106\u001a\u0012\u0012\u0004\u0012\u00020500j\u0008\u0012\u0004\u0012\u000205`22\u0016\u00107\u001a\u0012\u0012\u0004\u0012\u00020500j\u0008\u0012\u0004\u0012\u000205`2H\u0002\u00a2\u0006\u0004\u0008>\u0010?R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010AR\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008B\u0010A\u00a8\u0006C"
    }
    d2 = {
        "Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;",
        "Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/zykj/message/server/bean/UserInfo;",
        "userInfo",
        "Lcom/zykj/http/bean/HeaderBean;",
        "headerBeanFlow",
        "Lp5/j;",
        "service",
        "<init>",
        "(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lp5/j;)V",
        "Lcom/zykj/evaluation/bean/bundle/DetailBundle;",
        "detailBundle",
        "",
        "isSpecial",
        "",
        "U",
        "(Lcom/zykj/evaluation/bean/bundle/DetailBundle;Z)V",
        "",
        "Lcom/zykj/evaluation/ui/detail/GuideQuestion;",
        "questionList",
        "",
        "index",
        "y0",
        "(Ljava/util/List;I)V",
        "Lcom/zykj/evaluation/bean/TaskDetailInfo;",
        "taskDetailInfo",
        "v0",
        "(Lcom/zykj/evaluation/bean/TaskDetailInfo;)V",
        "",
        "",
        "localAnswerMap",
        "w0",
        "(Lcom/zykj/evaluation/bean/TaskDetailInfo;Ljava/util/Map;)V",
        "Lf6/j;",
        "draftFunctions",
        "t",
        "(Lf6/j;)V",
        "Lkotlin/Function0;",
        "lastCallback",
        "s",
        "(Lf6/j;Lkotlin/jvm/functions/Function0;)V",
        "specificTrainingType",
        "",
        "questionId",
        "Lcom/zykj/evaluation/bean/DetailSubQuestion;",
        "Lcom/zykj/evaluation/bean/DetailAnswerInfo;",
        "answerList",
        "Ljava/util/ArrayList;",
        "Lw5/f;",
        "Lkotlin/collections/ArrayList;",
        "scoreList",
        "revisingAnswered",
        "Lcom/zykj/evaluation/ui/detail/c;",
        "examAnswerList",
        "reviseAnswerList",
        "F0",
        "(IJLjava/util/List;Ljava/util/List;Ljava/util/ArrayList;ZLjava/util/ArrayList;Ljava/util/ArrayList;)V",
        "question",
        "numberString",
        "answer",
        "serverRightAnswers",
        "E0",
        "(ILcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;Lcom/zykj/evaluation/bean/DetailAnswerInfo;Ljava/util/List;Ljava/util/ArrayList;ZLjava/util/ArrayList;Ljava/util/ArrayList;)V",
        "w",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "x",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDoneDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoneDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/done/DoneDetailViewModel\n+ 2 ArrayMap.jvm.kt\nandroidx/collection/ArrayMapKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,512:1\n27#2:513\n27#2:516\n1869#3,2:514\n1869#3,2:517\n1869#3:519\n1869#3,2:520\n1870#3:522\n1878#3,3:524\n1878#3,3:527\n774#3:530\n865#3,2:531\n295#3,2:533\n1563#3:535\n1634#3,3:536\n1563#3:539\n1634#3,3:540\n1#4:523\n*S KotlinDebug\n*F\n+ 1 DoneDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/done/DoneDetailViewModel\n*L\n123#1:513\n129#1:516\n124#1:514,2\n130#1:517,2\n160#1:519\n175#1:520,2\n160#1:522\n250#1:524,3\n291#1:527,3\n327#1:530\n327#1:531,2\n331#1:533,2\n428#1:535\n428#1:536,3\n469#1:539\n469#1:540,3\n*E\n"
    }
.end annotation


# instance fields
.field public final w:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final x:Lkotlinx/coroutines/flow/MutableStateFlow;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lp5/j;)V
    .locals 1

    .line 1
    const-string v0, "userInfo"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "headerBeanFlow"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "service"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1, p3}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;-><init>(Lkotlinx/coroutines/flow/MutableStateFlow;Lp5/j;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;->x:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 22
    .line 23
    return-void
.end method

.method public static final synthetic A0(Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->q(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic B0(Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->E()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic C0(Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->L()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic D0(Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;Lcom/zykj/evaluation/ui/detail/GuideQuestion;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->R(Lcom/zykj/evaluation/ui/detail/GuideQuestion;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic z0(Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->p(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final E0(ILcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;Lcom/zykj/evaluation/bean/DetailAnswerInfo;Ljava/util/List;Ljava/util/ArrayList;ZLjava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p5

    .line 4
    .line 5
    invoke-virtual/range {p2 .. p2}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getType()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    sget-object v3, Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;->QSTANDANSWER:Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;

    .line 10
    .line 11
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;->getType()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    const/4 v5, 0x0

    .line 16
    if-ne v2, v3, :cond_0

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v2, v5

    .line 21
    :goto_0
    invoke-virtual/range {p2 .. p2}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getDisplayNumber()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const-string v6, ""

    .line 26
    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    move-object v3, v6

    .line 30
    :cond_1
    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    if-eqz v7, :cond_2

    .line 35
    .line 36
    move-object/from16 v13, p3

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move-object v13, v3

    .line 40
    :goto_1
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->I()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    const/4 v7, 0x2

    .line 45
    const/4 v8, 0x0

    .line 46
    if-eqz v3, :cond_4

    .line 47
    .line 48
    if-eqz p4, :cond_4

    .line 49
    .line 50
    if-eqz v2, :cond_4

    .line 51
    .line 52
    invoke-virtual/range {p2 .. p2}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getScore()D

    .line 53
    .line 54
    .line 55
    move-result-wide v9

    .line 56
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getScore()D

    .line 57
    .line 58
    .line 59
    move-result-wide v11

    .line 60
    new-instance v3, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3, v11, v12}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v11, "/"

    .line 69
    .line 70
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getOriginScore()Ljava/lang/Double;

    .line 81
    .line 82
    .line 83
    move-result-object v12

    .line 84
    if-eqz v12, :cond_3

    .line 85
    .line 86
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getOriginScore()Ljava/lang/Double;

    .line 87
    .line 88
    .line 89
    move-result-object v12

    .line 90
    new-instance v14, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v14, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v9

    .line 108
    new-instance v10, Landroidx/compose/ui/text/AnnotatedString$Builder;

    .line 109
    .line 110
    invoke-direct {v10, v9}, Landroidx/compose/ui/text/AnnotatedString$Builder;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    new-instance v14, Landroidx/compose/ui/text/SpanStyle;

    .line 114
    .line 115
    sget-object v11, Landroidx/compose/ui/text/style/TextDecoration;->Companion:Landroidx/compose/ui/text/style/TextDecoration$Companion;

    .line 116
    .line 117
    invoke-virtual {v11}, Landroidx/compose/ui/text/style/TextDecoration$Companion;->getLineThrough()Landroidx/compose/ui/text/style/TextDecoration;

    .line 118
    .line 119
    .line 120
    move-result-object v31

    .line 121
    const v35, 0xefff

    .line 122
    .line 123
    .line 124
    const/16 v36, 0x0

    .line 125
    .line 126
    const-wide/16 v15, 0x0

    .line 127
    .line 128
    const-wide/16 v17, 0x0

    .line 129
    .line 130
    const/16 v19, 0x0

    .line 131
    .line 132
    const/16 v20, 0x0

    .line 133
    .line 134
    const/16 v21, 0x0

    .line 135
    .line 136
    const/16 v22, 0x0

    .line 137
    .line 138
    const/16 v23, 0x0

    .line 139
    .line 140
    const-wide/16 v24, 0x0

    .line 141
    .line 142
    const/16 v26, 0x0

    .line 143
    .line 144
    const/16 v27, 0x0

    .line 145
    .line 146
    const/16 v28, 0x0

    .line 147
    .line 148
    const-wide/16 v29, 0x0

    .line 149
    .line 150
    const/16 v32, 0x0

    .line 151
    .line 152
    const/16 v33, 0x0

    .line 153
    .line 154
    const/16 v34, 0x0

    .line 155
    .line 156
    invoke-direct/range {v14 .. v36}, Landroidx/compose/ui/text/SpanStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 160
    .line 161
    .line 162
    move-result v9

    .line 163
    invoke-virtual {v10, v14, v5, v9}, Landroidx/compose/ui/text/AnnotatedString$Builder;->addStyle(Landroidx/compose/ui/text/SpanStyle;II)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v10}, Landroidx/compose/ui/text/AnnotatedString$Builder;->toAnnotatedString()Landroidx/compose/ui/text/AnnotatedString;

    .line 167
    .line 168
    .line 169
    move-result-object v9

    .line 170
    goto :goto_2

    .line 171
    :cond_3
    new-instance v9, Landroidx/compose/ui/text/AnnotatedString;

    .line 172
    .line 173
    invoke-direct {v9, v6, v8, v7, v8}, Landroidx/compose/ui/text/AnnotatedString;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 174
    .line 175
    .line 176
    :goto_2
    new-instance v10, Lw5/f;

    .line 177
    .line 178
    invoke-direct {v10, v13, v9, v3}, Lw5/f;-><init>(Ljava/lang/String;Landroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    move-object/from16 v3, p6

    .line 182
    .line 183
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    :cond_4
    new-instance v14, Lcom/zykj/evaluation/ui/detail/c;

    .line 187
    .line 188
    invoke-virtual/range {p2 .. p2}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getQuestionId()J

    .line 189
    .line 190
    .line 191
    move-result-wide v9

    .line 192
    invoke-virtual/range {p2 .. p2}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v11

    .line 196
    invoke-virtual/range {p2 .. p2}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getQstType()I

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    move/from16 v12, p1

    .line 201
    .line 202
    invoke-static {v3, v12}, Lw5/h;->a(II)Li6/p0;

    .line 203
    .line 204
    .line 205
    move-result-object v12

    .line 206
    const/16 v20, 0x3f0

    .line 207
    .line 208
    const/16 v21, 0x0

    .line 209
    .line 210
    move-object v3, v8

    .line 211
    move-object v8, v14

    .line 212
    const/4 v14, 0x0

    .line 213
    const/4 v15, 0x0

    .line 214
    const/16 v16, 0x0

    .line 215
    .line 216
    const/16 v17, 0x0

    .line 217
    .line 218
    const/16 v18, 0x0

    .line 219
    .line 220
    const/16 v19, 0x0

    .line 221
    .line 222
    invoke-direct/range {v8 .. v21}, Lcom/zykj/evaluation/ui/detail/c;-><init>(JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 223
    .line 224
    .line 225
    const/4 v9, -0x1

    .line 226
    if-eqz p4, :cond_5

    .line 227
    .line 228
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getOriginResult()Ljava/lang/Integer;

    .line 229
    .line 230
    .line 231
    move-result-object v10

    .line 232
    if-eqz v10, :cond_5

    .line 233
    .line 234
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 235
    .line 236
    .line 237
    move-result v10

    .line 238
    goto :goto_3

    .line 239
    :cond_5
    if-eqz p4, :cond_6

    .line 240
    .line 241
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getResult()I

    .line 242
    .line 243
    .line 244
    move-result v10

    .line 245
    goto :goto_3

    .line 246
    :cond_6
    move v10, v9

    .line 247
    :goto_3
    if-eqz p4, :cond_7

    .line 248
    .line 249
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getResult()I

    .line 250
    .line 251
    .line 252
    move-result v9

    .line 253
    :cond_7
    if-eqz p4, :cond_8

    .line 254
    .line 255
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getExamAnswers()Ljava/util/List;

    .line 256
    .line 257
    .line 258
    move-result-object v11

    .line 259
    if-nez v11, :cond_9

    .line 260
    .line 261
    :cond_8
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 262
    .line 263
    .line 264
    move-result-object v11

    .line 265
    :cond_9
    sget-object v12, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->RIGHT:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    .line 266
    .line 267
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 268
    .line 269
    .line 270
    move-result v12

    .line 271
    if-ne v12, v9, :cond_a

    .line 272
    .line 273
    const/4 v12, 0x1

    .line 274
    goto :goto_4

    .line 275
    :cond_a
    move v12, v5

    .line 276
    :goto_4
    invoke-virtual/range {p2 .. p2}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getOptions()Ljava/util/List;

    .line 277
    .line 278
    .line 279
    move-result-object v13

    .line 280
    const/16 v14, 0xa

    .line 281
    .line 282
    if-eqz v13, :cond_e

    .line 283
    .line 284
    new-instance v15, Ljava/util/ArrayList;

    .line 285
    .line 286
    invoke-static {v13, v14}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 287
    .line 288
    .line 289
    move-result v4

    .line 290
    invoke-direct {v15, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 291
    .line 292
    .line 293
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 294
    .line 295
    .line 296
    move-result-object v4

    .line 297
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 298
    .line 299
    .line 300
    move-result v13

    .line 301
    if-eqz v13, :cond_d

    .line 302
    .line 303
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v13

    .line 307
    check-cast v13, Ljava/lang/String;

    .line 308
    .line 309
    new-instance v14, Lw5/b;

    .line 310
    .line 311
    invoke-interface {v11, v13}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v16

    .line 315
    if-eqz v16, :cond_c

    .line 316
    .line 317
    if-eqz v12, :cond_b

    .line 318
    .line 319
    sget-object v16, Lw5/a$d;->c:Lw5/a$d;

    .line 320
    .line 321
    :goto_6
    move-object/from16 v3, v16

    .line 322
    .line 323
    goto :goto_7

    .line 324
    :cond_b
    sget-object v16, Lw5/a$c;->c:Lw5/a$c;

    .line 325
    .line 326
    goto :goto_6

    .line 327
    :cond_c
    sget-object v16, Lw5/a$b;->c:Lw5/a$b;

    .line 328
    .line 329
    goto :goto_6

    .line 330
    :goto_7
    invoke-interface {v1, v13}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    move-result v5

    .line 334
    invoke-direct {v14, v13, v3, v5}, Lw5/b;-><init>(Ljava/lang/String;Lw5/a;Z)V

    .line 335
    .line 336
    .line 337
    invoke-interface {v15, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    const/4 v3, 0x0

    .line 341
    const/4 v5, 0x0

    .line 342
    const/16 v14, 0xa

    .line 343
    .line 344
    goto :goto_5

    .line 345
    :cond_d
    :goto_8
    move-object/from16 v20, v15

    .line 346
    .line 347
    goto :goto_9

    .line 348
    :cond_e
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 349
    .line 350
    .line 351
    move-result-object v15

    .line 352
    goto :goto_8

    .line 353
    :goto_9
    if-eqz p4, :cond_10

    .line 354
    .line 355
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getScore()D

    .line 356
    .line 357
    .line 358
    move-result-wide v3

    .line 359
    const-wide/16 v12, 0x0

    .line 360
    .line 361
    cmpl-double v5, v3, v12

    .line 362
    .line 363
    if-lez v5, :cond_f

    .line 364
    .line 365
    invoke-virtual/range {p2 .. p2}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getScore()D

    .line 366
    .line 367
    .line 368
    move-result-wide v12

    .line 369
    cmpg-double v3, v3, v12

    .line 370
    .line 371
    if-gez v3, :cond_f

    .line 372
    .line 373
    const/4 v3, 0x1

    .line 374
    goto :goto_a

    .line 375
    :cond_f
    const/4 v3, 0x0

    .line 376
    :goto_a
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 377
    .line 378
    .line 379
    move-result-object v3

    .line 380
    goto :goto_b

    .line 381
    :cond_10
    const/4 v3, 0x0

    .line 382
    :goto_b
    if-eqz p4, :cond_12

    .line 383
    .line 384
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getExamComments()Ljava/util/List;

    .line 385
    .line 386
    .line 387
    move-result-object v4

    .line 388
    if-eqz v4, :cond_12

    .line 389
    .line 390
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v4

    .line 394
    check-cast v4, Ljava/lang/String;

    .line 395
    .line 396
    if-nez v4, :cond_11

    .line 397
    .line 398
    goto :goto_c

    .line 399
    :cond_11
    move-object/from16 v23, v4

    .line 400
    .line 401
    goto :goto_d

    .line 402
    :cond_12
    :goto_c
    move-object/from16 v23, v6

    .line 403
    .line 404
    :goto_d
    invoke-virtual {v0, v9, v2, v3}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->y(IZLjava/lang/Boolean;)Lcom/zykj/evaluation/ui/detail/f;

    .line 405
    .line 406
    .line 407
    move-result-object v24

    .line 408
    const/16 v26, 0x24f

    .line 409
    .line 410
    const/16 v27, 0x0

    .line 411
    .line 412
    const-wide/16 v15, 0x0

    .line 413
    .line 414
    const/16 v17, 0x0

    .line 415
    .line 416
    const/16 v18, 0x0

    .line 417
    .line 418
    const/16 v19, 0x0

    .line 419
    .line 420
    const/16 v22, 0x0

    .line 421
    .line 422
    const/16 v25, 0x0

    .line 423
    .line 424
    move-object v14, v8

    .line 425
    move-object/from16 v21, v11

    .line 426
    .line 427
    const/16 v2, 0xa

    .line 428
    .line 429
    invoke-static/range {v14 .. v27}, Lcom/zykj/evaluation/ui/detail/c;->b(Lcom/zykj/evaluation/ui/detail/c;JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/c;

    .line 430
    .line 431
    .line 432
    move-result-object v3

    .line 433
    move-object/from16 v4, p8

    .line 434
    .line 435
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    sget-object v3, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->RIGHT:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    .line 439
    .line 440
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 441
    .line 442
    .line 443
    move-result v3

    .line 444
    if-le v10, v3, :cond_1c

    .line 445
    .line 446
    if-eqz p7, :cond_1c

    .line 447
    .line 448
    if-eqz p4, :cond_13

    .line 449
    .line 450
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getRevisingAnswers()Ljava/util/List;

    .line 451
    .line 452
    .line 453
    move-result-object v3

    .line 454
    if-nez v3, :cond_14

    .line 455
    .line 456
    :cond_13
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 457
    .line 458
    .line 459
    move-result-object v3

    .line 460
    :cond_14
    sget-object v4, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->REVISING_RIGHT:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    .line 461
    .line 462
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 463
    .line 464
    .line 465
    move-result v4

    .line 466
    if-ne v4, v9, :cond_15

    .line 467
    .line 468
    const/4 v4, 0x1

    .line 469
    goto :goto_e

    .line 470
    :cond_15
    const/4 v4, 0x0

    .line 471
    :goto_e
    invoke-virtual/range {p2 .. p2}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getOptions()Ljava/util/List;

    .line 472
    .line 473
    .line 474
    move-result-object v5

    .line 475
    if-eqz v5, :cond_19

    .line 476
    .line 477
    new-instance v10, Ljava/util/ArrayList;

    .line 478
    .line 479
    invoke-static {v5, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 480
    .line 481
    .line 482
    move-result v2

    .line 483
    invoke-direct {v10, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 484
    .line 485
    .line 486
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 487
    .line 488
    .line 489
    move-result-object v2

    .line 490
    :goto_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 491
    .line 492
    .line 493
    move-result v5

    .line 494
    if-eqz v5, :cond_18

    .line 495
    .line 496
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v5

    .line 500
    check-cast v5, Ljava/lang/String;

    .line 501
    .line 502
    new-instance v11, Lw5/b;

    .line 503
    .line 504
    invoke-interface {v3, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 505
    .line 506
    .line 507
    move-result v12

    .line 508
    if-eqz v12, :cond_17

    .line 509
    .line 510
    if-eqz v4, :cond_16

    .line 511
    .line 512
    sget-object v12, Lw5/a$d;->c:Lw5/a$d;

    .line 513
    .line 514
    goto :goto_10

    .line 515
    :cond_16
    sget-object v12, Lw5/a$c;->c:Lw5/a$c;

    .line 516
    .line 517
    goto :goto_10

    .line 518
    :cond_17
    sget-object v12, Lw5/a$b;->c:Lw5/a$b;

    .line 519
    .line 520
    :goto_10
    invoke-interface {v1, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 521
    .line 522
    .line 523
    move-result v13

    .line 524
    invoke-direct {v11, v5, v12, v13}, Lw5/b;-><init>(Ljava/lang/String;Lw5/a;Z)V

    .line 525
    .line 526
    .line 527
    invoke-interface {v10, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 528
    .line 529
    .line 530
    goto :goto_f

    .line 531
    :cond_18
    :goto_11
    move-object/from16 v20, v10

    .line 532
    .line 533
    goto :goto_12

    .line 534
    :cond_19
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 535
    .line 536
    .line 537
    move-result-object v10

    .line 538
    goto :goto_11

    .line 539
    :goto_12
    if-eqz p4, :cond_1b

    .line 540
    .line 541
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getRevisingComments()Ljava/util/List;

    .line 542
    .line 543
    .line 544
    move-result-object v1

    .line 545
    if-eqz v1, :cond_1b

    .line 546
    .line 547
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v1

    .line 551
    check-cast v1, Ljava/lang/String;

    .line 552
    .line 553
    if-nez v1, :cond_1a

    .line 554
    .line 555
    goto :goto_14

    .line 556
    :cond_1a
    move-object/from16 v23, v1

    .line 557
    .line 558
    :goto_13
    const/4 v1, 0x0

    .line 559
    const/4 v2, 0x0

    .line 560
    goto :goto_15

    .line 561
    :cond_1b
    :goto_14
    move-object/from16 v23, v6

    .line 562
    .line 563
    goto :goto_13

    .line 564
    :goto_15
    invoke-static {v0, v9, v2, v7, v1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->T(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;IZILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/f;

    .line 565
    .line 566
    .line 567
    move-result-object v24

    .line 568
    const/16 v26, 0x24f

    .line 569
    .line 570
    const/16 v27, 0x0

    .line 571
    .line 572
    const-wide/16 v15, 0x0

    .line 573
    .line 574
    const/16 v17, 0x0

    .line 575
    .line 576
    const/16 v18, 0x0

    .line 577
    .line 578
    const/16 v19, 0x0

    .line 579
    .line 580
    const/16 v22, 0x0

    .line 581
    .line 582
    const/16 v25, 0x0

    .line 583
    .line 584
    move-object/from16 v21, v3

    .line 585
    .line 586
    move-object v14, v8

    .line 587
    invoke-static/range {v14 .. v27}, Lcom/zykj/evaluation/ui/detail/c;->b(Lcom/zykj/evaluation/ui/detail/c;JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/c;

    .line 588
    .line 589
    .line 590
    move-result-object v1

    .line 591
    move-object/from16 v2, p9

    .line 592
    .line 593
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 594
    .line 595
    .line 596
    :cond_1c
    return-void
.end method

.method public final F0(IJLjava/util/List;Ljava/util/List;Ljava/util/ArrayList;ZLjava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->I()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const-string v3, ""

    .line 10
    .line 11
    const/4 v4, 0x2

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x0

    .line 14
    if-eqz v2, :cond_3

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_3

    .line 21
    .line 22
    invoke-interface/range {p5 .. p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    move v7, v5

    .line 27
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v8

    .line 31
    if-eqz v8, :cond_3

    .line 32
    .line 33
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    add-int/lit8 v9, v7, 0x1

    .line 38
    .line 39
    if-gez v7, :cond_0

    .line 40
    .line 41
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 42
    .line 43
    .line 44
    :cond_0
    check-cast v8, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 45
    .line 46
    invoke-static {v1, v7}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    check-cast v7, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 51
    .line 52
    if-eqz v7, :cond_1

    .line 53
    .line 54
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getScore()D

    .line 55
    .line 56
    .line 57
    move-result-wide v10

    .line 58
    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    move-object v7, v3

    .line 64
    :goto_1
    invoke-virtual {v8}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getScore()D

    .line 65
    .line 66
    .line 67
    move-result-wide v10

    .line 68
    new-instance v12, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v12, v10, v11}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v10, "/"

    .line 77
    .line 78
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v11

    .line 88
    invoke-virtual {v8}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getOriginScore()Ljava/lang/Double;

    .line 89
    .line 90
    .line 91
    move-result-object v12

    .line 92
    if-eqz v12, :cond_2

    .line 93
    .line 94
    invoke-virtual {v8}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getOriginScore()Ljava/lang/Double;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    new-instance v12, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    new-instance v8, Landroidx/compose/ui/text/AnnotatedString$Builder;

    .line 117
    .line 118
    invoke-direct {v8, v7}, Landroidx/compose/ui/text/AnnotatedString$Builder;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    new-instance v12, Landroidx/compose/ui/text/SpanStyle;

    .line 122
    .line 123
    sget-object v10, Landroidx/compose/ui/text/style/TextDecoration;->Companion:Landroidx/compose/ui/text/style/TextDecoration$Companion;

    .line 124
    .line 125
    invoke-virtual {v10}, Landroidx/compose/ui/text/style/TextDecoration$Companion;->getLineThrough()Landroidx/compose/ui/text/style/TextDecoration;

    .line 126
    .line 127
    .line 128
    move-result-object v29

    .line 129
    const v33, 0xefff

    .line 130
    .line 131
    .line 132
    const/16 v34, 0x0

    .line 133
    .line 134
    const-wide/16 v13, 0x0

    .line 135
    .line 136
    const-wide/16 v15, 0x0

    .line 137
    .line 138
    const/16 v17, 0x0

    .line 139
    .line 140
    const/16 v18, 0x0

    .line 141
    .line 142
    const/16 v19, 0x0

    .line 143
    .line 144
    const/16 v20, 0x0

    .line 145
    .line 146
    const/16 v21, 0x0

    .line 147
    .line 148
    const-wide/16 v22, 0x0

    .line 149
    .line 150
    const/16 v24, 0x0

    .line 151
    .line 152
    const/16 v25, 0x0

    .line 153
    .line 154
    const/16 v26, 0x0

    .line 155
    .line 156
    const-wide/16 v27, 0x0

    .line 157
    .line 158
    const/16 v30, 0x0

    .line 159
    .line 160
    const/16 v31, 0x0

    .line 161
    .line 162
    const/16 v32, 0x0

    .line 163
    .line 164
    invoke-direct/range {v12 .. v34}, Landroidx/compose/ui/text/SpanStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 168
    .line 169
    .line 170
    move-result v7

    .line 171
    invoke-virtual {v8, v12, v5, v7}, Landroidx/compose/ui/text/AnnotatedString$Builder;->addStyle(Landroidx/compose/ui/text/SpanStyle;II)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v8}, Landroidx/compose/ui/text/AnnotatedString$Builder;->toAnnotatedString()Landroidx/compose/ui/text/AnnotatedString;

    .line 175
    .line 176
    .line 177
    move-result-object v7

    .line 178
    goto :goto_2

    .line 179
    :cond_2
    new-instance v7, Landroidx/compose/ui/text/AnnotatedString;

    .line 180
    .line 181
    invoke-direct {v7, v3, v6, v4, v6}, Landroidx/compose/ui/text/AnnotatedString;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 182
    .line 183
    .line 184
    :goto_2
    new-instance v8, Lw5/f;

    .line 185
    .line 186
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v10

    .line 190
    invoke-direct {v8, v10, v7, v11}, Lw5/f;-><init>(Ljava/lang/String;Landroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    move-object/from16 v7, p6

    .line 194
    .line 195
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move v7, v9

    .line 199
    goto/16 :goto_0

    .line 200
    .line 201
    :cond_3
    new-instance v10, Lcom/zykj/evaluation/ui/detail/c;

    .line 202
    .line 203
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    check-cast v2, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 208
    .line 209
    if-eqz v2, :cond_4

    .line 210
    .line 211
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getQuestionId()J

    .line 212
    .line 213
    .line 214
    move-result-wide v7

    .line 215
    move-wide v11, v7

    .line 216
    goto :goto_3

    .line 217
    :cond_4
    move-wide/from16 v11, p2

    .line 218
    .line 219
    :goto_3
    sget-object v2, Li6/p0$c$a;->b:Li6/p0$c$a;

    .line 220
    .line 221
    invoke-virtual {v2}, Li6/p0;->a()I

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    move/from16 v7, p1

    .line 226
    .line 227
    invoke-static {v2, v7}, Lw5/h;->a(II)Li6/p0;

    .line 228
    .line 229
    .line 230
    move-result-object v14

    .line 231
    const/16 v22, 0x3fa

    .line 232
    .line 233
    const/16 v23, 0x0

    .line 234
    .line 235
    const/4 v13, 0x0

    .line 236
    const/4 v15, 0x0

    .line 237
    const/16 v16, 0x0

    .line 238
    .line 239
    const/16 v17, 0x0

    .line 240
    .line 241
    const/16 v18, 0x0

    .line 242
    .line 243
    const/16 v19, 0x0

    .line 244
    .line 245
    const/16 v20, 0x0

    .line 246
    .line 247
    const/16 v21, 0x0

    .line 248
    .line 249
    invoke-direct/range {v10 .. v23}, Lcom/zykj/evaluation/ui/detail/c;-><init>(JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 250
    .line 251
    .line 252
    sget-object v2, Lcom/zykj/evaluation/ui/detail/f$d;->b:Lcom/zykj/evaluation/ui/detail/f$d;

    .line 253
    .line 254
    invoke-interface/range {p5 .. p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 255
    .line 256
    .line 257
    move-result-object v7

    .line 258
    move v9, v5

    .line 259
    move-object v8, v6

    .line 260
    move-object v11, v8

    .line 261
    move-object v12, v11

    .line 262
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 263
    .line 264
    .line 265
    move-result v13

    .line 266
    const-string v14, "http"

    .line 267
    .line 268
    if-eqz v13, :cond_c

    .line 269
    .line 270
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v13

    .line 274
    add-int/lit8 v16, v9, 0x1

    .line 275
    .line 276
    if-gez v9, :cond_5

    .line 277
    .line 278
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 279
    .line 280
    .line 281
    :cond_5
    check-cast v13, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 282
    .line 283
    if-nez v11, :cond_6

    .line 284
    .line 285
    invoke-virtual {v13}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getExamAnswers()Ljava/util/List;

    .line 286
    .line 287
    .line 288
    move-result-object v17

    .line 289
    invoke-static/range {v17 .. v17}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v17

    .line 293
    move-object/from16 v15, v17

    .line 294
    .line 295
    check-cast v15, Ljava/lang/String;

    .line 296
    .line 297
    if-eqz v15, :cond_6

    .line 298
    .line 299
    invoke-static {v15, v14, v5, v4, v6}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v15

    .line 303
    const/4 v4, 0x1

    .line 304
    if-ne v15, v4, :cond_6

    .line 305
    .line 306
    invoke-virtual {v13}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getUuid()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v8

    .line 310
    invoke-virtual {v13}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getExamAnswers()Ljava/util/List;

    .line 311
    .line 312
    .line 313
    move-result-object v11

    .line 314
    :cond_6
    if-nez v12, :cond_7

    .line 315
    .line 316
    invoke-virtual {v13}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getExamComments()Ljava/util/List;

    .line 317
    .line 318
    .line 319
    move-result-object v4

    .line 320
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v4

    .line 324
    check-cast v4, Ljava/lang/String;

    .line 325
    .line 326
    if-eqz v4, :cond_7

    .line 327
    .line 328
    const/4 v15, 0x2

    .line 329
    invoke-static {v4, v14, v5, v15, v6}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v4

    .line 333
    const/4 v14, 0x1

    .line 334
    if-ne v4, v14, :cond_7

    .line 335
    .line 336
    invoke-virtual {v13}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getExamComments()Ljava/util/List;

    .line 337
    .line 338
    .line 339
    move-result-object v12

    .line 340
    :cond_7
    invoke-virtual {v13}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getResult()I

    .line 341
    .line 342
    .line 343
    move-result v4

    .line 344
    invoke-virtual {v13}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getScore()D

    .line 345
    .line 346
    .line 347
    move-result-wide v14

    .line 348
    const-wide/16 v17, 0x0

    .line 349
    .line 350
    cmpl-double v14, v14, v17

    .line 351
    .line 352
    if-lez v14, :cond_9

    .line 353
    .line 354
    invoke-virtual {v13}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getScore()D

    .line 355
    .line 356
    .line 357
    move-result-wide v13

    .line 358
    invoke-static {v1, v9}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v9

    .line 362
    check-cast v9, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 363
    .line 364
    if-eqz v9, :cond_8

    .line 365
    .line 366
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getScore()D

    .line 367
    .line 368
    .line 369
    move-result-wide v17

    .line 370
    :cond_8
    cmpg-double v9, v13, v17

    .line 371
    .line 372
    if-gez v9, :cond_9

    .line 373
    .line 374
    const/4 v9, 0x1

    .line 375
    goto :goto_5

    .line 376
    :cond_9
    move v9, v5

    .line 377
    :goto_5
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 378
    .line 379
    .line 380
    move-result-object v9

    .line 381
    const/4 v13, 0x1

    .line 382
    invoke-virtual {v0, v4, v13, v9}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->y(IZLjava/lang/Boolean;)Lcom/zykj/evaluation/ui/detail/f;

    .line 383
    .line 384
    .line 385
    move-result-object v4

    .line 386
    sget-object v9, Lcom/zykj/evaluation/ui/detail/f$a;->b:Lcom/zykj/evaluation/ui/detail/f$a;

    .line 387
    .line 388
    invoke-static {v4, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    move-result v13

    .line 392
    if-eqz v13, :cond_a

    .line 393
    .line 394
    move-object v2, v9

    .line 395
    goto :goto_6

    .line 396
    :cond_a
    sget-object v13, Lcom/zykj/evaluation/ui/detail/f$b;->b:Lcom/zykj/evaluation/ui/detail/f$b;

    .line 397
    .line 398
    invoke-static {v4, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    move-result v4

    .line 402
    if-eqz v4, :cond_b

    .line 403
    .line 404
    invoke-static {v2, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result v4

    .line 408
    if-nez v4, :cond_b

    .line 409
    .line 410
    move-object v2, v13

    .line 411
    :cond_b
    :goto_6
    move/from16 v9, v16

    .line 412
    .line 413
    const/4 v4, 0x2

    .line 414
    goto/16 :goto_4

    .line 415
    .line 416
    :cond_c
    const/4 v13, 0x1

    .line 417
    if-nez v8, :cond_d

    .line 418
    .line 419
    move-object v8, v3

    .line 420
    :cond_d
    if-nez v11, :cond_e

    .line 421
    .line 422
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 423
    .line 424
    .line 425
    move-result-object v11

    .line 426
    :cond_e
    move-object/from16 v17, v11

    .line 427
    .line 428
    if-eqz v12, :cond_10

    .line 429
    .line 430
    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v1

    .line 434
    check-cast v1, Ljava/lang/String;

    .line 435
    .line 436
    if-nez v1, :cond_f

    .line 437
    .line 438
    goto :goto_7

    .line 439
    :cond_f
    move-object/from16 v19, v1

    .line 440
    .line 441
    goto :goto_8

    .line 442
    :cond_10
    :goto_7
    move-object/from16 v19, v3

    .line 443
    .line 444
    :goto_8
    const/16 v22, 0x25d

    .line 445
    .line 446
    const/16 v23, 0x0

    .line 447
    .line 448
    const-wide/16 v11, 0x0

    .line 449
    .line 450
    move-object v1, v14

    .line 451
    const/4 v14, 0x0

    .line 452
    const/4 v15, 0x0

    .line 453
    const/16 v16, 0x0

    .line 454
    .line 455
    const/16 v18, 0x0

    .line 456
    .line 457
    const/16 v21, 0x0

    .line 458
    .line 459
    move-object/from16 v20, v2

    .line 460
    .line 461
    move v4, v13

    .line 462
    move-object v13, v8

    .line 463
    invoke-static/range {v10 .. v23}, Lcom/zykj/evaluation/ui/detail/c;->b(Lcom/zykj/evaluation/ui/detail/c;JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/c;

    .line 464
    .line 465
    .line 466
    move-result-object v2

    .line 467
    move-object/from16 v7, p8

    .line 468
    .line 469
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    if-eqz p7, :cond_17

    .line 473
    .line 474
    new-instance v2, Ljava/util/ArrayList;

    .line 475
    .line 476
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 477
    .line 478
    .line 479
    invoke-interface/range {p5 .. p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 480
    .line 481
    .line 482
    move-result-object v7

    .line 483
    :cond_11
    :goto_9
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 484
    .line 485
    .line 486
    move-result v8

    .line 487
    if-eqz v8, :cond_12

    .line 488
    .line 489
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v8

    .line 493
    move-object v9, v8

    .line 494
    check-cast v9, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 495
    .line 496
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getResult()I

    .line 497
    .line 498
    .line 499
    move-result v9

    .line 500
    sget-object v11, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->RIGHT:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    .line 501
    .line 502
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 503
    .line 504
    .line 505
    move-result v11

    .line 506
    if-le v9, v11, :cond_11

    .line 507
    .line 508
    invoke-interface {v2, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 509
    .line 510
    .line 511
    goto :goto_9

    .line 512
    :cond_12
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 513
    .line 514
    .line 515
    move-result v7

    .line 516
    move v8, v5

    .line 517
    :cond_13
    if-ge v8, v7, :cond_14

    .line 518
    .line 519
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object v9

    .line 523
    add-int/lit8 v8, v8, 0x1

    .line 524
    .line 525
    move-object v11, v9

    .line 526
    check-cast v11, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 527
    .line 528
    invoke-virtual {v11}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getRevisingAnswers()Ljava/util/List;

    .line 529
    .line 530
    .line 531
    move-result-object v12

    .line 532
    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v12

    .line 536
    check-cast v12, Ljava/lang/String;

    .line 537
    .line 538
    if-eqz v12, :cond_13

    .line 539
    .line 540
    const/4 v15, 0x2

    .line 541
    invoke-static {v12, v1, v5, v15, v6}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 542
    .line 543
    .line 544
    move-result v12

    .line 545
    if-ne v12, v4, :cond_13

    .line 546
    .line 547
    invoke-virtual {v11}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getRevisingComments()Ljava/util/List;

    .line 548
    .line 549
    .line 550
    move-result-object v11

    .line 551
    invoke-static {v11}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v11

    .line 555
    check-cast v11, Ljava/lang/String;

    .line 556
    .line 557
    if-eqz v11, :cond_13

    .line 558
    .line 559
    invoke-static {v11, v1, v5, v15, v6}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 560
    .line 561
    .line 562
    move-result v11

    .line 563
    if-ne v11, v4, :cond_13

    .line 564
    .line 565
    goto :goto_a

    .line 566
    :cond_14
    move-object v9, v6

    .line 567
    :goto_a
    check-cast v9, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 568
    .line 569
    if-nez v9, :cond_15

    .line 570
    .line 571
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v1

    .line 575
    move-object v9, v1

    .line 576
    check-cast v9, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 577
    .line 578
    :cond_15
    if-eqz v9, :cond_17

    .line 579
    .line 580
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getUuid()Ljava/lang/String;

    .line 581
    .line 582
    .line 583
    move-result-object v13

    .line 584
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getRevisingAnswers()Ljava/util/List;

    .line 585
    .line 586
    .line 587
    move-result-object v17

    .line 588
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getRevisingComments()Ljava/util/List;

    .line 589
    .line 590
    .line 591
    move-result-object v1

    .line 592
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object v1

    .line 596
    check-cast v1, Ljava/lang/String;

    .line 597
    .line 598
    if-nez v1, :cond_16

    .line 599
    .line 600
    move-object/from16 v19, v3

    .line 601
    .line 602
    goto :goto_b

    .line 603
    :cond_16
    move-object/from16 v19, v1

    .line 604
    .line 605
    :goto_b
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getResult()I

    .line 606
    .line 607
    .line 608
    move-result v1

    .line 609
    const/4 v15, 0x2

    .line 610
    invoke-static {v0, v1, v5, v15, v6}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->T(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;IZILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/f;

    .line 611
    .line 612
    .line 613
    move-result-object v20

    .line 614
    const/16 v22, 0x25d

    .line 615
    .line 616
    const/16 v23, 0x0

    .line 617
    .line 618
    const-wide/16 v11, 0x0

    .line 619
    .line 620
    const/4 v14, 0x0

    .line 621
    const/4 v15, 0x0

    .line 622
    const/16 v16, 0x0

    .line 623
    .line 624
    const/16 v18, 0x0

    .line 625
    .line 626
    const/16 v21, 0x0

    .line 627
    .line 628
    invoke-static/range {v10 .. v23}, Lcom/zykj/evaluation/ui/detail/c;->b(Lcom/zykj/evaluation/ui/detail/c;JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/c;

    .line 629
    .line 630
    .line 631
    move-result-object v1

    .line 632
    move-object/from16 v2, p9

    .line 633
    .line 634
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 635
    .line 636
    .line 637
    :cond_17
    return-void
.end method

.method public U(Lcom/zykj/evaluation/bean/bundle/DetailBundle;Z)V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "detailBundle"

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-super/range {p0 .. p2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->U(Lcom/zykj/evaluation/bean/bundle/DetailBundle;Z)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Lg7/e;

    .line 14
    .line 15
    sget-object v3, Lcom/zykj/evaluation/bean/TaskState$Done;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$Done;

    .line 16
    .line 17
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 18
    .line 19
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lcom/zykj/message/server/bean/UserInfo;

    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/zykj/message/server/bean/UserInfo;->a()Ljava/lang/Long;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-string v4, "getId(...)"

    .line 30
    .line 31
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 35
    .line 36
    .line 37
    move-result-wide v4

    .line 38
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->N()J

    .line 39
    .line 40
    .line 41
    move-result-wide v6

    .line 42
    invoke-direct/range {v2 .. v7}, Lg7/e;-><init>(Lcom/zykj/evaluation/bean/TaskState;JJ)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->q0(Lg7/e;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->w()Lcom/zykj/evaluation/ui/detail/b;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    const v25, 0xfbfff

    .line 53
    .line 54
    .line 55
    const/16 v26, 0x0

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    const/4 v5, 0x0

    .line 59
    const/4 v6, 0x0

    .line 60
    const/4 v7, 0x0

    .line 61
    const/4 v8, 0x0

    .line 62
    const/4 v9, 0x0

    .line 63
    const/4 v10, 0x0

    .line 64
    const/4 v11, 0x0

    .line 65
    const/4 v12, 0x0

    .line 66
    const/4 v13, 0x0

    .line 67
    const/4 v14, 0x0

    .line 68
    const/4 v15, 0x0

    .line 69
    const/16 v16, 0x0

    .line 70
    .line 71
    const/16 v17, 0x0

    .line 72
    .line 73
    const/16 v18, 0x0

    .line 74
    .line 75
    const/16 v19, 0x0

    .line 76
    .line 77
    const/16 v20, 0x0

    .line 78
    .line 79
    const/16 v21, 0x0

    .line 80
    .line 81
    const-wide/16 v22, 0x0

    .line 82
    .line 83
    const/16 v24, 0x0

    .line 84
    .line 85
    invoke-static/range {v3 .. v26}, Lcom/zykj/evaluation/ui/detail/b;->b(Lcom/zykj/evaluation/ui/detail/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;ZZLjava/lang/String;ZLcom/zykj/evaluation/ui/detail/a;Lcom/zykj/evaluation/ui/detail/d;Lw5/i;ZZLjava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/b;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v0, v1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->h0(Lcom/zykj/evaluation/ui/detail/b;)V

    .line 90
    .line 91
    .line 92
    new-instance v6, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel$initData$1;

    .line 93
    .line 94
    const/4 v1, 0x0

    .line 95
    invoke-direct {v6, v0, v1}, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel$initData$1;-><init>(Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;Lkotlin/coroutines/Continuation;)V

    .line 96
    .line 97
    .line 98
    const/16 v7, 0x1f

    .line 99
    .line 100
    const/4 v8, 0x0

    .line 101
    const/4 v2, 0x0

    .line 102
    const/4 v3, 0x0

    .line 103
    invoke-static/range {v0 .. v8}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method public s(Lf6/j;Lkotlin/jvm/functions/Function0;)V
    .locals 9

    .line 1
    const-string v0, "draftFunctions"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "lastCallback"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v6, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel$commitAndChangeQuestionToNext$1;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    invoke-direct {v6, p0, p2, p1}, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel$commitAndChangeQuestionToNext$1;-><init>(Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

    .line 15
    .line 16
    .line 17
    const/16 v7, 0x1f

    .line 18
    .line 19
    const/4 v8, 0x0

    .line 20
    const/4 v1, 0x0

    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    const/4 v5, 0x0

    .line 25
    move-object v0, p0

    .line 26
    invoke-static/range {v0 .. v8}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public t(Lf6/j;)V
    .locals 10

    .line 1
    const-string v0, "draftFunctions"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v7, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel$commitAndChangeQuestionToPre$1;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    invoke-direct {v7, p0, p1}, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel$commitAndChangeQuestionToPre$1;-><init>(Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;Lkotlin/coroutines/Continuation;)V

    .line 10
    .line 11
    .line 12
    const/16 v8, 0x1f

    .line 13
    .line 14
    const/4 v9, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    move-object v1, p0

    .line 21
    invoke-static/range {v1 .. v9}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public v0(Lcom/zykj/evaluation/bean/TaskDetailInfo;)V
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "taskDetailInfo"

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->I()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v3, 0x2

    .line 15
    const-string v4, ""

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getTotalAnswerScore()D

    .line 21
    .line 22
    .line 23
    move-result-wide v6

    .line 24
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getTotalScore()D

    .line 25
    .line 26
    .line 27
    move-result-wide v8

    .line 28
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v6, "/"

    .line 37
    .line 38
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getOriginScore()Ljava/lang/Double;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    const-string v8, "\u5f97\u5206: "

    .line 53
    .line 54
    if-eqz v7, :cond_0

    .line 55
    .line 56
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getOriginScore()Ljava/lang/Double;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getTotalScore()D

    .line 61
    .line 62
    .line 63
    move-result-wide v9

    .line 64
    new-instance v5, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    new-instance v5, Landroidx/compose/ui/text/AnnotatedString$Builder;

    .line 83
    .line 84
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getOriginScore()Ljava/lang/Double;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getTotalScore()D

    .line 89
    .line 90
    .line 91
    move-result-wide v9

    .line 92
    new-instance v11, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v11, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string v6, ", \u4fee\u6b63\u540e\u5f97\u5206: "

    .line 110
    .line 111
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-direct {v5, v1}, Landroidx/compose/ui/text/AnnotatedString$Builder;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    new-instance v6, Landroidx/compose/ui/text/SpanStyle;

    .line 125
    .line 126
    sget-object v1, Landroidx/compose/ui/text/style/TextDecoration;->Companion:Landroidx/compose/ui/text/style/TextDecoration$Companion;

    .line 127
    .line 128
    invoke-virtual {v1}, Landroidx/compose/ui/text/style/TextDecoration$Companion;->getLineThrough()Landroidx/compose/ui/text/style/TextDecoration;

    .line 129
    .line 130
    .line 131
    move-result-object v23

    .line 132
    const v27, 0xefff

    .line 133
    .line 134
    .line 135
    const/16 v28, 0x0

    .line 136
    .line 137
    const-wide/16 v7, 0x0

    .line 138
    .line 139
    const-wide/16 v9, 0x0

    .line 140
    .line 141
    const/4 v11, 0x0

    .line 142
    const/4 v12, 0x0

    .line 143
    const/4 v13, 0x0

    .line 144
    const/4 v14, 0x0

    .line 145
    const/4 v15, 0x0

    .line 146
    const-wide/16 v16, 0x0

    .line 147
    .line 148
    const/16 v18, 0x0

    .line 149
    .line 150
    const/16 v19, 0x0

    .line 151
    .line 152
    const/16 v20, 0x0

    .line 153
    .line 154
    const-wide/16 v21, 0x0

    .line 155
    .line 156
    const/16 v24, 0x0

    .line 157
    .line 158
    const/16 v25, 0x0

    .line 159
    .line 160
    const/16 v26, 0x0

    .line 161
    .line 162
    invoke-direct/range {v6 .. v28}, Landroidx/compose/ui/text/SpanStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    const/4 v3, 0x3

    .line 170
    add-int/2addr v1, v3

    .line 171
    invoke-virtual {v5, v6, v3, v1}, Landroidx/compose/ui/text/AnnotatedString$Builder;->addStyle(Landroidx/compose/ui/text/SpanStyle;II)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v5}, Landroidx/compose/ui/text/AnnotatedString$Builder;->toAnnotatedString()Landroidx/compose/ui/text/AnnotatedString;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    :goto_0
    move-object v12, v1

    .line 179
    goto :goto_1

    .line 180
    :cond_0
    new-instance v6, Landroidx/compose/ui/text/AnnotatedString;

    .line 181
    .line 182
    new-instance v7, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-direct {v6, v1, v5, v3, v5}, Landroidx/compose/ui/text/AnnotatedString;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 198
    .line 199
    .line 200
    move-object v12, v6

    .line 201
    goto :goto_1

    .line 202
    :cond_1
    new-instance v1, Landroidx/compose/ui/text/AnnotatedString;

    .line 203
    .line 204
    invoke-direct {v1, v4, v5, v3, v5}, Landroidx/compose/ui/text/AnnotatedString;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 205
    .line 206
    .line 207
    goto :goto_0

    .line 208
    :goto_1
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->w()Lcom/zykj/evaluation/ui/detail/b;

    .line 209
    .line 210
    .line 211
    move-result-object v6

    .line 212
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;->x:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 213
    .line 214
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    check-cast v1, Lcom/zykj/http/bean/HeaderBean;

    .line 219
    .line 220
    invoke-virtual {v1}, Lcom/zykj/http/bean/HeaderBean;->getServerUrl()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    if-nez v1, :cond_2

    .line 225
    .line 226
    move-object v1, v4

    .line 227
    :cond_2
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getPath()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    if-nez v3, :cond_3

    .line 232
    .line 233
    goto :goto_2

    .line 234
    :cond_3
    move-object v4, v3

    .line 235
    :goto_2
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->C()Z

    .line 236
    .line 237
    .line 238
    move-result v3

    .line 239
    new-instance v5, Ljava/lang/StringBuilder;

    .line 240
    .line 241
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    const-string v1, "?showAnalysis="

    .line 251
    .line 252
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v13

    .line 262
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->K()Lg7/e;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getId()J

    .line 267
    .line 268
    .line 269
    move-result-wide v3

    .line 270
    invoke-virtual {v1, v3, v4}, Lg7/e;->j(J)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v16

    .line 274
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getAskForHelp()Z

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    if-eqz v1, :cond_4

    .line 279
    .line 280
    sget-object v1, Lcom/zykj/evaluation/ui/detail/a$b;->c:Lcom/zykj/evaluation/ui/detail/a$b;

    .line 281
    .line 282
    :goto_3
    move-object/from16 v18, v1

    .line 283
    .line 284
    goto :goto_4

    .line 285
    :cond_4
    sget-object v1, Lcom/zykj/evaluation/ui/detail/a$a;->c:Lcom/zykj/evaluation/ui/detail/a$a;

    .line 286
    .line 287
    goto :goto_3

    .line 288
    :goto_4
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->isInMistakeBook()Z

    .line 289
    .line 290
    .line 291
    move-result v1

    .line 292
    if-eqz v1, :cond_5

    .line 293
    .line 294
    sget-object v1, Lcom/zykj/evaluation/ui/detail/d$b;->c:Lcom/zykj/evaluation/ui/detail/d$b;

    .line 295
    .line 296
    :goto_5
    move-object/from16 v19, v1

    .line 297
    .line 298
    goto :goto_6

    .line 299
    :cond_5
    sget-object v1, Lcom/zykj/evaluation/ui/detail/d$a;->c:Lcom/zykj/evaluation/ui/detail/d$a;

    .line 300
    .line 301
    goto :goto_5

    .line 302
    :goto_6
    sget-object v20, Lw5/i$a;->c:Lw5/i$a;

    .line 303
    .line 304
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getStem()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v27

    .line 308
    const v28, 0x7c59f

    .line 309
    .line 310
    .line 311
    const/16 v29, 0x0

    .line 312
    .line 313
    const/4 v7, 0x0

    .line 314
    const/4 v8, 0x0

    .line 315
    const/4 v9, 0x0

    .line 316
    const/4 v10, 0x0

    .line 317
    const/4 v11, 0x0

    .line 318
    const/4 v14, 0x0

    .line 319
    const/4 v15, 0x0

    .line 320
    const/16 v17, 0x0

    .line 321
    .line 322
    const/16 v21, 0x0

    .line 323
    .line 324
    const/16 v22, 0x0

    .line 325
    .line 326
    const/16 v23, 0x0

    .line 327
    .line 328
    const/16 v24, 0x0

    .line 329
    .line 330
    const-wide/16 v25, 0x0

    .line 331
    .line 332
    invoke-static/range {v6 .. v29}, Lcom/zykj/evaluation/ui/detail/b;->b(Lcom/zykj/evaluation/ui/detail/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;ZZLjava/lang/String;ZLcom/zykj/evaluation/ui/detail/a;Lcom/zykj/evaluation/ui/detail/d;Lw5/i;ZZLjava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/b;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    invoke-virtual {v0, v1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->h0(Lcom/zykj/evaluation/ui/detail/b;)V

    .line 337
    .line 338
    .line 339
    return-void
.end method

.method public w0(Lcom/zykj/evaluation/bean/TaskDetailInfo;Ljava/util/Map;)V
    .locals 22

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "taskDetailInfo"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "localAnswerMap"

    .line 9
    .line 10
    move-object/from16 v2, p2

    .line 11
    .line 12
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Landroidx/collection/ArrayMap;

    .line 16
    .line 17
    invoke-direct {v1}, Landroidx/collection/ArrayMap;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getAnswerList()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 39
    .line 40
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getUuid()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    new-instance v2, Landroidx/collection/ArrayMap;

    .line 49
    .line 50
    invoke-direct {v2}, Landroidx/collection/ArrayMap;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getQstAnswers()Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    if-eqz v3, :cond_1

    .line 58
    .line 59
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_1

    .line 68
    .line 69
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    check-cast v4, Lcom/zykj/evaluation/bean/DetailGroupQstAnswer;

    .line 74
    .line 75
    invoke-virtual {v4}, Lcom/zykj/evaluation/bean/DetailGroupQstAnswer;->getUuid()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-virtual {v4}, Lcom/zykj/evaluation/bean/DetailGroupQstAnswer;->getAnswers()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-interface {v2, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_1
    new-instance v12, Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 90
    .line 91
    .line 92
    new-instance v14, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 95
    .line 96
    .line 97
    new-instance v15, Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getAnswerWithQuestion()Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-eqz v3, :cond_2

    .line 107
    .line 108
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->M()I

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getId()J

    .line 113
    .line 114
    .line 115
    move-result-wide v8

    .line 116
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getQstFlows()Ljava/util/List;

    .line 117
    .line 118
    .line 119
    move-result-object v10

    .line 120
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getAnswerList()Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object v11

    .line 124
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getRevisingAnswerd()Z

    .line 125
    .line 126
    .line 127
    move-result v13

    .line 128
    move-object/from16 v6, p0

    .line 129
    .line 130
    invoke-virtual/range {v6 .. v15}, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;->F0(IJLjava/util/List;Ljava/util/List;Ljava/util/ArrayList;ZLjava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 131
    .line 132
    .line 133
    goto/16 :goto_a

    .line 134
    .line 135
    :cond_2
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getQstFlows()Ljava/util/List;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    const/4 v4, 0x0

    .line 144
    const/4 v5, 0x1

    .line 145
    if-le v3, v5, :cond_3

    .line 146
    .line 147
    move v3, v5

    .line 148
    goto :goto_2

    .line 149
    :cond_3
    move v3, v4

    .line 150
    :goto_2
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getQstFlows()Ljava/util/List;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object v16

    .line 158
    :cond_4
    :goto_3
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 159
    .line 160
    .line 161
    move-result v6

    .line 162
    if-eqz v6, :cond_e

    .line 163
    .line 164
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    move-object v8, v6

    .line 169
    check-cast v8, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 170
    .line 171
    const-string v6, "."

    .line 172
    .line 173
    const-string v17, ""

    .line 174
    .line 175
    if-eqz v3, :cond_6

    .line 176
    .line 177
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getNumber()I

    .line 178
    .line 179
    .line 180
    move-result v7

    .line 181
    if-nez v7, :cond_5

    .line 182
    .line 183
    move-object/from16 v7, v17

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_5
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getNumber()I

    .line 187
    .line 188
    .line 189
    move-result v7

    .line 190
    new-instance v9, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v7

    .line 205
    :goto_4
    invoke-virtual {v8}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getNumber()I

    .line 206
    .line 207
    .line 208
    move-result v9

    .line 209
    new-instance v10, Ljava/lang/StringBuilder;

    .line 210
    .line 211
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v7

    .line 224
    goto :goto_5

    .line 225
    :cond_6
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getNumber()I

    .line 226
    .line 227
    .line 228
    move-result v7

    .line 229
    if-nez v7, :cond_7

    .line 230
    .line 231
    move-object/from16 v7, v17

    .line 232
    .line 233
    goto :goto_5

    .line 234
    :cond_7
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getNumber()I

    .line 235
    .line 236
    .line 237
    move-result v7

    .line 238
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    :goto_5
    invoke-virtual {v8}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getType()I

    .line 243
    .line 244
    .line 245
    move-result v9

    .line 246
    if-nez v9, :cond_c

    .line 247
    .line 248
    invoke-virtual {v8}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getSubQuestions()Ljava/util/List;

    .line 249
    .line 250
    .line 251
    move-result-object v9

    .line 252
    if-eqz v9, :cond_c

    .line 253
    .line 254
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 255
    .line 256
    .line 257
    move-result v9

    .line 258
    if-eqz v9, :cond_8

    .line 259
    .line 260
    goto/16 :goto_9

    .line 261
    .line 262
    :cond_8
    invoke-virtual {v8}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getSubQuestions()Ljava/util/List;

    .line 263
    .line 264
    .line 265
    move-result-object v9

    .line 266
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 267
    .line 268
    .line 269
    move-result v9

    .line 270
    if-le v9, v5, :cond_9

    .line 271
    .line 272
    move/from16 v18, v5

    .line 273
    .line 274
    goto :goto_6

    .line 275
    :cond_9
    move/from16 v18, v4

    .line 276
    .line 277
    :goto_6
    invoke-virtual {v8}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getSubQuestions()Ljava/util/List;

    .line 278
    .line 279
    .line 280
    move-result-object v8

    .line 281
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 282
    .line 283
    .line 284
    move-result-object v19

    .line 285
    :goto_7
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    .line 286
    .line 287
    .line 288
    move-result v8

    .line 289
    if-eqz v8, :cond_4

    .line 290
    .line 291
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v8

    .line 295
    check-cast v8, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 296
    .line 297
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->M()I

    .line 298
    .line 299
    .line 300
    move-result v9

    .line 301
    if-eqz v18, :cond_a

    .line 302
    .line 303
    invoke-virtual {v8}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getNumber()I

    .line 304
    .line 305
    .line 306
    move-result v10

    .line 307
    new-instance v11, Ljava/lang/StringBuilder;

    .line 308
    .line 309
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v10

    .line 322
    goto :goto_8

    .line 323
    :cond_a
    move-object/from16 v10, v17

    .line 324
    .line 325
    :goto_8
    new-instance v11, Ljava/lang/StringBuilder;

    .line 326
    .line 327
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v10

    .line 340
    invoke-virtual {v8}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v11

    .line 344
    invoke-virtual {v1, v11}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v11

    .line 348
    check-cast v11, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 349
    .line 350
    invoke-virtual {v8}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v13

    .line 354
    invoke-virtual {v2, v13}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v13

    .line 358
    check-cast v13, Ljava/util/List;

    .line 359
    .line 360
    if-nez v13, :cond_b

    .line 361
    .line 362
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 363
    .line 364
    .line 365
    move-result-object v13

    .line 366
    :cond_b
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getRevisingAnswerd()Z

    .line 367
    .line 368
    .line 369
    move-result v20

    .line 370
    move/from16 v21, v20

    .line 371
    .line 372
    move-object/from16 v20, v7

    .line 373
    .line 374
    move v7, v9

    .line 375
    move-object v9, v10

    .line 376
    move-object v10, v11

    .line 377
    move-object v11, v13

    .line 378
    move/from16 v13, v21

    .line 379
    .line 380
    move-object/from16 v21, v6

    .line 381
    .line 382
    move-object/from16 v6, p0

    .line 383
    .line 384
    invoke-virtual/range {v6 .. v15}, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;->E0(ILcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;Lcom/zykj/evaluation/bean/DetailAnswerInfo;Ljava/util/List;Ljava/util/ArrayList;ZLjava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 385
    .line 386
    .line 387
    move-object/from16 v7, v20

    .line 388
    .line 389
    move-object/from16 v6, v21

    .line 390
    .line 391
    goto :goto_7

    .line 392
    :cond_c
    :goto_9
    move-object/from16 v20, v7

    .line 393
    .line 394
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->M()I

    .line 395
    .line 396
    .line 397
    move-result v7

    .line 398
    invoke-virtual {v8}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v6

    .line 402
    invoke-virtual {v1, v6}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v6

    .line 406
    move-object v10, v6

    .line 407
    check-cast v10, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 408
    .line 409
    invoke-virtual {v8}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v6

    .line 413
    invoke-virtual {v2, v6}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v6

    .line 417
    check-cast v6, Ljava/util/List;

    .line 418
    .line 419
    if-nez v6, :cond_d

    .line 420
    .line 421
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 422
    .line 423
    .line 424
    move-result-object v6

    .line 425
    :cond_d
    move-object v11, v6

    .line 426
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getRevisingAnswerd()Z

    .line 427
    .line 428
    .line 429
    move-result v13

    .line 430
    move-object/from16 v6, p0

    .line 431
    .line 432
    move-object/from16 v9, v20

    .line 433
    .line 434
    invoke-virtual/range {v6 .. v15}, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;->E0(ILcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;Lcom/zykj/evaluation/bean/DetailAnswerInfo;Ljava/util/List;Ljava/util/ArrayList;ZLjava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 435
    .line 436
    .line 437
    goto/16 :goto_3

    .line 438
    .line 439
    :cond_e
    :goto_a
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->x()Lw5/e;

    .line 440
    .line 441
    .line 442
    move-result-object v6

    .line 443
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getAnswerWithQuestion()Z

    .line 444
    .line 445
    .line 446
    move-result v8

    .line 447
    invoke-static {v0}, Lw5/h;->g(Lcom/zykj/evaluation/bean/TaskDetailInfo;)Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v13

    .line 451
    move-object v10, v14

    .line 452
    invoke-static {v0}, Lw5/h;->i(Lcom/zykj/evaluation/bean/TaskDetailInfo;)Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v14

    .line 456
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->D()Z

    .line 457
    .line 458
    .line 459
    move-result v1

    .line 460
    invoke-static {v0, v1}, Lw5/h;->h(Lcom/zykj/evaluation/bean/TaskDetailInfo;Z)Ljava/util/List;

    .line 461
    .line 462
    .line 463
    move-result-object v1

    .line 464
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->D()Z

    .line 465
    .line 466
    .line 467
    move-result v2

    .line 468
    invoke-static {v0, v2}, Lw5/h;->k(Lcom/zykj/evaluation/bean/TaskDetailInfo;Z)Ljava/util/List;

    .line 469
    .line 470
    .line 471
    move-result-object v16

    .line 472
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->D()Z

    .line 473
    .line 474
    .line 475
    move-result v2

    .line 476
    invoke-static {v0, v2}, Lw5/h;->j(Lcom/zykj/evaluation/bean/TaskDetailInfo;Z)Ljava/util/List;

    .line 477
    .line 478
    .line 479
    move-result-object v17

    .line 480
    new-instance v2, Ljava/util/ArrayList;

    .line 481
    .line 482
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 483
    .line 484
    .line 485
    invoke-static {v0}, Lw5/h;->f(Lcom/zykj/evaluation/bean/TaskDetailInfo;)Lw5/c;

    .line 486
    .line 487
    .line 488
    move-result-object v3

    .line 489
    if-eqz v3, :cond_f

    .line 490
    .line 491
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 492
    .line 493
    .line 494
    :cond_f
    invoke-static {v0}, Lw5/h;->e(Lcom/zykj/evaluation/bean/TaskDetailInfo;)Lw5/c;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    if-eqz v0, :cond_10

    .line 499
    .line 500
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 501
    .line 502
    .line 503
    :cond_10
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 504
    .line 505
    const/16 v19, 0x24

    .line 506
    .line 507
    const/16 v20, 0x0

    .line 508
    .line 509
    const/4 v9, 0x0

    .line 510
    move-object v7, v12

    .line 511
    const/4 v12, 0x0

    .line 512
    move-object/from16 v18, v2

    .line 513
    .line 514
    move-object v11, v15

    .line 515
    move-object v15, v1

    .line 516
    invoke-static/range {v6 .. v20}, Lw5/e;->b(Lw5/e;Ljava/util/List;ZZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lw5/e;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    move-object/from16 v6, p0

    .line 521
    .line 522
    invoke-virtual {v6, v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->i0(Lw5/e;)V

    .line 523
    .line 524
    .line 525
    return-void
.end method

.method public y0(Ljava/util/List;I)V
    .locals 26

    .line 1
    move/from16 v0, p2

    .line 2
    .line 3
    const-string v1, "questionList"

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    if-ltz v0, :cond_3

    .line 11
    .line 12
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ge v0, v1, :cond_2

    .line 17
    .line 18
    invoke-interface/range {p1 .. p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lcom/zykj/evaluation/ui/detail/GuideQuestion;

    .line 23
    .line 24
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->w()Lcom/zykj/evaluation/ui/detail/b;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1}, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->getTitle()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    add-int/lit8 v1, v0, 0x1

    .line 33
    .line 34
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    new-instance v5, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v1, "/"

    .line 47
    .line 48
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    if-nez v0, :cond_0

    .line 59
    .line 60
    const-string v1, "\u7b2c\u4e00\u9898"

    .line 61
    .line 62
    :goto_0
    move-object/from16 v19, v1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_0
    const-string v1, "\u4e0a\u4e00\u9898"

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :goto_1
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    add-int/lit8 v1, v1, -0x1

    .line 73
    .line 74
    if-ne v0, v1, :cond_1

    .line 75
    .line 76
    const-string v0, "\u6700\u540e\u4e00\u9898"

    .line 77
    .line 78
    :goto_2
    move-object/from16 v20, v0

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_1
    const-string v0, "\u4e0b\u4e00\u9898"

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :goto_3
    const v24, 0xcfffc

    .line 85
    .line 86
    .line 87
    const/16 v25, 0x0

    .line 88
    .line 89
    const/4 v5, 0x0

    .line 90
    const/4 v6, 0x0

    .line 91
    const/4 v7, 0x0

    .line 92
    const/4 v8, 0x0

    .line 93
    const/4 v9, 0x0

    .line 94
    const/4 v10, 0x0

    .line 95
    const/4 v11, 0x0

    .line 96
    const/4 v12, 0x0

    .line 97
    const/4 v13, 0x0

    .line 98
    const/4 v14, 0x0

    .line 99
    const/4 v15, 0x0

    .line 100
    const/16 v16, 0x0

    .line 101
    .line 102
    const/16 v17, 0x0

    .line 103
    .line 104
    const/16 v18, 0x0

    .line 105
    .line 106
    const-wide/16 v21, 0x0

    .line 107
    .line 108
    const/16 v23, 0x0

    .line 109
    .line 110
    invoke-static/range {v2 .. v25}, Lcom/zykj/evaluation/ui/detail/b;->b(Lcom/zykj/evaluation/ui/detail/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;ZZLjava/lang/String;ZLcom/zykj/evaluation/ui/detail/a;Lcom/zykj/evaluation/ui/detail/d;Lw5/i;ZZLjava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/b;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    move-object/from16 v1, p0

    .line 115
    .line 116
    invoke-virtual {v1, v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->h0(Lcom/zykj/evaluation/ui/detail/b;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_2
    move-object/from16 v1, p0

    .line 121
    .line 122
    return-void

    .line 123
    :cond_3
    move-object/from16 v1, p0

    .line 124
    .line 125
    return-void
.end method
