.class public final Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel;
.super Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u00002\u00020\u0001B/\u0008\u0007\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0008\u0001\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J%\u0010\u0017\u001a\u00020\u000f2\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ1\u0010 \u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001e0\u00120\u001dH\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u0017\u0010$\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"H\u0016\u00a2\u0006\u0004\u0008$\u0010%J%\u0010(\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"2\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u000f0&H\u0016\u00a2\u0006\u0004\u0008(\u0010)J\u0083\u0001\u00107\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u00152\u0006\u0010,\u001a\u00020+2\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020-0\u00122\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u00020.0\u00122\u0016\u00103\u001a\u0012\u0012\u0004\u0012\u00020100j\u0008\u0012\u0004\u0012\u000201`22\u0016\u00105\u001a\u0012\u0012\u0004\u0012\u00020400j\u0008\u0012\u0004\u0012\u000204`22\u0016\u00106\u001a\u0012\u0012\u0004\u0012\u00020400j\u0008\u0012\u0004\u0012\u000204`2H\u0002\u00a2\u0006\u0004\u00087\u00108Jy\u0010<\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u00152\u0006\u00109\u001a\u00020-2\u0006\u0010:\u001a\u00020\u001e2\u0008\u0010;\u001a\u0004\u0018\u00010.2\u0016\u00103\u001a\u0012\u0012\u0004\u0012\u00020100j\u0008\u0012\u0004\u0012\u000201`22\u0016\u00105\u001a\u0012\u0012\u0004\u0012\u00020400j\u0008\u0012\u0004\u0012\u000204`22\u0016\u00106\u001a\u0012\u0012\u0004\u0012\u00020400j\u0008\u0012\u0004\u0012\u000204`2H\u0002\u00a2\u0006\u0004\u0008<\u0010=R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008>\u0010?R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010?\u00a8\u0006A"
    }
    d2 = {
        "Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel;",
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
        "Lcom/zykj/evaluation/ui/detail/c;",
        "examAnswerList",
        "reviseAnswerList",
        "F0",
        "(IJLjava/util/List;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V",
        "question",
        "numberString",
        "answer",
        "E0",
        "(ILcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;Lcom/zykj/evaluation/bean/DetailAnswerInfo;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V",
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
        "SMAP\nRevisingDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RevisingDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel\n+ 2 ArrayMap.jvm.kt\nandroidx/collection/ArrayMapKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,462:1\n27#2:463\n1869#3,2:464\n1869#3:466\n1869#3,2:467\n1870#3:469\n1878#3,3:471\n1878#3,3:474\n774#3:477\n865#3,2:478\n295#3,2:480\n1563#3:482\n1634#3,3:483\n1563#3:486\n1634#3,3:487\n1#4:470\n*S KotlinDebug\n*F\n+ 1 RevisingDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel\n*L\n105#1:463\n106#1:464,2\n135#1:466\n150#1:467,2\n135#1:469\n219#1:471,3\n260#1:474,3\n295#1:477\n295#1:478,2\n299#1:480,2\n392#1:482\n392#1:483,3\n427#1:486\n427#1:487,3\n*E\n"
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
    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel;->x:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 22
    .line 23
    return-void
.end method

.method public static final synthetic A0(Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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

.method public static final synthetic B0(Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel;)I
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

.method public static final synthetic C0(Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel;)Ljava/util/List;
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

.method public static final synthetic D0(Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel;Lcom/zykj/evaluation/ui/detail/GuideQuestion;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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

.method public static final synthetic z0(Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
.method public final E0(ILcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;Lcom/zykj/evaluation/bean/DetailAnswerInfo;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 35

    .line 1
    invoke-virtual/range {p2 .. p2}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getType()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-object v1, Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;->QSTANDANSWER:Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;->getType()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    move v0, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v0, v3

    .line 18
    :goto_0
    invoke-virtual/range {p2 .. p2}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getDisplayNumber()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v4, ""

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    move-object v1, v4

    .line 27
    :cond_1
    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-eqz v5, :cond_2

    .line 32
    .line 33
    move-object/from16 v11, p3

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    move-object v11, v1

    .line 37
    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->I()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    const/4 v5, 0x0

    .line 42
    if-eqz v1, :cond_4

    .line 43
    .line 44
    if-eqz p4, :cond_4

    .line 45
    .line 46
    if-eqz v0, :cond_4

    .line 47
    .line 48
    invoke-virtual/range {p2 .. p2}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getScore()D

    .line 49
    .line 50
    .line 51
    move-result-wide v6

    .line 52
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getScore()D

    .line 53
    .line 54
    .line 55
    move-result-wide v8

    .line 56
    new-instance v1, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v8, "/"

    .line 65
    .line 66
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getOriginScore()Ljava/lang/Double;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    if-eqz v9, :cond_3

    .line 81
    .line 82
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getOriginScore()Ljava/lang/Double;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    new-instance v10, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v10, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    new-instance v7, Landroidx/compose/ui/text/AnnotatedString$Builder;

    .line 105
    .line 106
    invoke-direct {v7, v6}, Landroidx/compose/ui/text/AnnotatedString$Builder;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    new-instance v12, Landroidx/compose/ui/text/SpanStyle;

    .line 110
    .line 111
    sget-object v8, Landroidx/compose/ui/text/style/TextDecoration;->Companion:Landroidx/compose/ui/text/style/TextDecoration$Companion;

    .line 112
    .line 113
    invoke-virtual {v8}, Landroidx/compose/ui/text/style/TextDecoration$Companion;->getLineThrough()Landroidx/compose/ui/text/style/TextDecoration;

    .line 114
    .line 115
    .line 116
    move-result-object v29

    .line 117
    const v33, 0xefff

    .line 118
    .line 119
    .line 120
    const/16 v34, 0x0

    .line 121
    .line 122
    const-wide/16 v13, 0x0

    .line 123
    .line 124
    const-wide/16 v15, 0x0

    .line 125
    .line 126
    const/16 v17, 0x0

    .line 127
    .line 128
    const/16 v18, 0x0

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
    const-wide/16 v22, 0x0

    .line 137
    .line 138
    const/16 v24, 0x0

    .line 139
    .line 140
    const/16 v25, 0x0

    .line 141
    .line 142
    const/16 v26, 0x0

    .line 143
    .line 144
    const-wide/16 v27, 0x0

    .line 145
    .line 146
    const/16 v30, 0x0

    .line 147
    .line 148
    const/16 v31, 0x0

    .line 149
    .line 150
    const/16 v32, 0x0

    .line 151
    .line 152
    invoke-direct/range {v12 .. v34}, Landroidx/compose/ui/text/SpanStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    invoke-virtual {v7, v12, v3, v6}, Landroidx/compose/ui/text/AnnotatedString$Builder;->addStyle(Landroidx/compose/ui/text/SpanStyle;II)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v7}, Landroidx/compose/ui/text/AnnotatedString$Builder;->toAnnotatedString()Landroidx/compose/ui/text/AnnotatedString;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    goto :goto_2

    .line 167
    :cond_3
    new-instance v6, Landroidx/compose/ui/text/AnnotatedString;

    .line 168
    .line 169
    const/4 v7, 0x2

    .line 170
    invoke-direct {v6, v4, v5, v7, v5}, Landroidx/compose/ui/text/AnnotatedString;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 171
    .line 172
    .line 173
    :goto_2
    new-instance v7, Lw5/f;

    .line 174
    .line 175
    invoke-direct {v7, v11, v6, v1}, Lw5/f;-><init>(Ljava/lang/String;Landroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    move-object/from16 v1, p5

    .line 179
    .line 180
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    :cond_4
    new-instance v12, Lcom/zykj/evaluation/ui/detail/c;

    .line 184
    .line 185
    invoke-virtual/range {p2 .. p2}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getQuestionId()J

    .line 186
    .line 187
    .line 188
    move-result-wide v7

    .line 189
    invoke-virtual/range {p2 .. p2}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v9

    .line 193
    invoke-virtual/range {p2 .. p2}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getQstType()I

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    move/from16 v6, p1

    .line 198
    .line 199
    invoke-static {v1, v6}, Lw5/h;->a(II)Li6/p0;

    .line 200
    .line 201
    .line 202
    move-result-object v10

    .line 203
    const/16 v18, 0x3f0

    .line 204
    .line 205
    const/16 v19, 0x0

    .line 206
    .line 207
    move-object v6, v12

    .line 208
    const/4 v12, 0x0

    .line 209
    const/4 v13, 0x0

    .line 210
    const/4 v14, 0x0

    .line 211
    const/4 v15, 0x0

    .line 212
    const/16 v16, 0x0

    .line 213
    .line 214
    const/16 v17, 0x0

    .line 215
    .line 216
    invoke-direct/range {v6 .. v19}, Lcom/zykj/evaluation/ui/detail/c;-><init>(JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 217
    .line 218
    .line 219
    move-object v12, v6

    .line 220
    const/4 v1, -0x1

    .line 221
    if-eqz p4, :cond_5

    .line 222
    .line 223
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getOriginResult()Ljava/lang/Integer;

    .line 224
    .line 225
    .line 226
    move-result-object v6

    .line 227
    if-eqz v6, :cond_5

    .line 228
    .line 229
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 230
    .line 231
    .line 232
    move-result v6

    .line 233
    goto :goto_3

    .line 234
    :cond_5
    if-eqz p4, :cond_6

    .line 235
    .line 236
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getResult()I

    .line 237
    .line 238
    .line 239
    move-result v6

    .line 240
    goto :goto_3

    .line 241
    :cond_6
    move v6, v1

    .line 242
    :goto_3
    if-eqz p4, :cond_7

    .line 243
    .line 244
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getResult()I

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    :cond_7
    if-eqz p4, :cond_8

    .line 249
    .line 250
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getExamAnswers()Ljava/util/List;

    .line 251
    .line 252
    .line 253
    move-result-object v7

    .line 254
    if-nez v7, :cond_9

    .line 255
    .line 256
    :cond_8
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 257
    .line 258
    .line 259
    move-result-object v7

    .line 260
    :cond_9
    sget-object v8, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->RIGHT:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    .line 261
    .line 262
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 263
    .line 264
    .line 265
    move-result v8

    .line 266
    if-ne v8, v1, :cond_a

    .line 267
    .line 268
    move v8, v2

    .line 269
    goto :goto_4

    .line 270
    :cond_a
    move v8, v3

    .line 271
    :goto_4
    invoke-virtual/range {p2 .. p2}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getOptions()Ljava/util/List;

    .line 272
    .line 273
    .line 274
    move-result-object v9

    .line 275
    const/16 v10, 0xa

    .line 276
    .line 277
    if-eqz v9, :cond_e

    .line 278
    .line 279
    new-instance v11, Ljava/util/ArrayList;

    .line 280
    .line 281
    invoke-static {v9, v10}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 282
    .line 283
    .line 284
    move-result v13

    .line 285
    invoke-direct {v11, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 286
    .line 287
    .line 288
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 289
    .line 290
    .line 291
    move-result-object v9

    .line 292
    :goto_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 293
    .line 294
    .line 295
    move-result v13

    .line 296
    if-eqz v13, :cond_d

    .line 297
    .line 298
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v13

    .line 302
    move-object v15, v13

    .line 303
    check-cast v15, Ljava/lang/String;

    .line 304
    .line 305
    new-instance v14, Lw5/b;

    .line 306
    .line 307
    invoke-interface {v7, v15}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v13

    .line 311
    if-eqz v13, :cond_c

    .line 312
    .line 313
    if-eqz v8, :cond_b

    .line 314
    .line 315
    sget-object v13, Lw5/a$d;->c:Lw5/a$d;

    .line 316
    .line 317
    :goto_6
    move-object/from16 v16, v13

    .line 318
    .line 319
    goto :goto_7

    .line 320
    :cond_b
    sget-object v13, Lw5/a$c;->c:Lw5/a$c;

    .line 321
    .line 322
    goto :goto_6

    .line 323
    :cond_c
    sget-object v13, Lw5/a$b;->c:Lw5/a$b;

    .line 324
    .line 325
    goto :goto_6

    .line 326
    :goto_7
    const/16 v18, 0x4

    .line 327
    .line 328
    const/16 v19, 0x0

    .line 329
    .line 330
    const/16 v17, 0x0

    .line 331
    .line 332
    invoke-direct/range {v14 .. v19}, Lw5/b;-><init>(Ljava/lang/String;Lw5/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 333
    .line 334
    .line 335
    invoke-interface {v11, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    goto :goto_5

    .line 339
    :cond_d
    :goto_8
    move-object/from16 v18, v11

    .line 340
    .line 341
    goto :goto_9

    .line 342
    :cond_e
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 343
    .line 344
    .line 345
    move-result-object v11

    .line 346
    goto :goto_8

    .line 347
    :goto_9
    if-eqz p4, :cond_10

    .line 348
    .line 349
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getScore()D

    .line 350
    .line 351
    .line 352
    move-result-wide v8

    .line 353
    const-wide/16 v13, 0x0

    .line 354
    .line 355
    cmpl-double v5, v8, v13

    .line 356
    .line 357
    if-lez v5, :cond_f

    .line 358
    .line 359
    invoke-virtual/range {p2 .. p2}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getScore()D

    .line 360
    .line 361
    .line 362
    move-result-wide v13

    .line 363
    cmpg-double v5, v8, v13

    .line 364
    .line 365
    if-gez v5, :cond_f

    .line 366
    .line 367
    goto :goto_a

    .line 368
    :cond_f
    move v2, v3

    .line 369
    :goto_a
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 370
    .line 371
    .line 372
    move-result-object v5

    .line 373
    :cond_10
    if-eqz p4, :cond_12

    .line 374
    .line 375
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getExamComments()Ljava/util/List;

    .line 376
    .line 377
    .line 378
    move-result-object v2

    .line 379
    if-eqz v2, :cond_12

    .line 380
    .line 381
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    check-cast v2, Ljava/lang/String;

    .line 386
    .line 387
    if-nez v2, :cond_11

    .line 388
    .line 389
    goto :goto_c

    .line 390
    :cond_11
    move-object/from16 v21, v2

    .line 391
    .line 392
    :goto_b
    move-object/from16 v2, p0

    .line 393
    .line 394
    goto :goto_d

    .line 395
    :cond_12
    :goto_c
    move-object/from16 v21, v4

    .line 396
    .line 397
    goto :goto_b

    .line 398
    :goto_d
    invoke-virtual {v2, v1, v0, v5}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->y(IZLjava/lang/Boolean;)Lcom/zykj/evaluation/ui/detail/f;

    .line 399
    .line 400
    .line 401
    move-result-object v22

    .line 402
    const/16 v24, 0x24f

    .line 403
    .line 404
    const/16 v25, 0x0

    .line 405
    .line 406
    const-wide/16 v13, 0x0

    .line 407
    .line 408
    const/4 v15, 0x0

    .line 409
    const/16 v16, 0x0

    .line 410
    .line 411
    const/16 v17, 0x0

    .line 412
    .line 413
    const/16 v20, 0x0

    .line 414
    .line 415
    const/16 v23, 0x0

    .line 416
    .line 417
    move-object/from16 v19, v7

    .line 418
    .line 419
    invoke-static/range {v12 .. v25}, Lcom/zykj/evaluation/ui/detail/c;->b(Lcom/zykj/evaluation/ui/detail/c;JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/c;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    move-object/from16 v1, p6

    .line 424
    .line 425
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    sget-object v0, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->RIGHT:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    .line 429
    .line 430
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 431
    .line 432
    .line 433
    move-result v0

    .line 434
    if-le v6, v0, :cond_1a

    .line 435
    .line 436
    if-eqz p4, :cond_13

    .line 437
    .line 438
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getRevisingAnswers()Ljava/util/List;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    if-nez v0, :cond_14

    .line 443
    .line 444
    :cond_13
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    :cond_14
    invoke-virtual/range {p2 .. p2}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getOptions()Ljava/util/List;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    if-eqz v1, :cond_17

    .line 453
    .line 454
    new-instance v3, Ljava/util/ArrayList;

    .line 455
    .line 456
    invoke-static {v1, v10}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 457
    .line 458
    .line 459
    move-result v5

    .line 460
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 461
    .line 462
    .line 463
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 468
    .line 469
    .line 470
    move-result v5

    .line 471
    if-eqz v5, :cond_16

    .line 472
    .line 473
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v5

    .line 477
    move-object v7, v5

    .line 478
    check-cast v7, Ljava/lang/String;

    .line 479
    .line 480
    new-instance v6, Lw5/b;

    .line 481
    .line 482
    invoke-interface {v0, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 483
    .line 484
    .line 485
    move-result v5

    .line 486
    if-eqz v5, :cond_15

    .line 487
    .line 488
    sget-object v5, Lw5/a$a;->c:Lw5/a$a;

    .line 489
    .line 490
    :goto_f
    move-object v8, v5

    .line 491
    goto :goto_10

    .line 492
    :cond_15
    sget-object v5, Lw5/a$b;->c:Lw5/a$b;

    .line 493
    .line 494
    goto :goto_f

    .line 495
    :goto_10
    const/4 v10, 0x4

    .line 496
    const/4 v11, 0x0

    .line 497
    const/4 v9, 0x0

    .line 498
    invoke-direct/range {v6 .. v11}, Lw5/b;-><init>(Ljava/lang/String;Lw5/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 499
    .line 500
    .line 501
    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 502
    .line 503
    .line 504
    goto :goto_e

    .line 505
    :cond_16
    :goto_11
    move-object/from16 v18, v3

    .line 506
    .line 507
    goto :goto_12

    .line 508
    :cond_17
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 509
    .line 510
    .line 511
    move-result-object v3

    .line 512
    goto :goto_11

    .line 513
    :goto_12
    if-eqz p4, :cond_19

    .line 514
    .line 515
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getRevisingComments()Ljava/util/List;

    .line 516
    .line 517
    .line 518
    move-result-object v1

    .line 519
    if-eqz v1, :cond_19

    .line 520
    .line 521
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v1

    .line 525
    check-cast v1, Ljava/lang/String;

    .line 526
    .line 527
    if-nez v1, :cond_18

    .line 528
    .line 529
    goto :goto_13

    .line 530
    :cond_18
    move-object/from16 v21, v1

    .line 531
    .line 532
    goto :goto_14

    .line 533
    :cond_19
    :goto_13
    move-object/from16 v21, v4

    .line 534
    .line 535
    :goto_14
    const/16 v24, 0x34f

    .line 536
    .line 537
    const/16 v25, 0x0

    .line 538
    .line 539
    const-wide/16 v13, 0x0

    .line 540
    .line 541
    const/4 v15, 0x0

    .line 542
    const/16 v16, 0x0

    .line 543
    .line 544
    const/16 v17, 0x0

    .line 545
    .line 546
    const/16 v20, 0x0

    .line 547
    .line 548
    const/16 v22, 0x0

    .line 549
    .line 550
    const/16 v23, 0x0

    .line 551
    .line 552
    move-object/from16 v19, v0

    .line 553
    .line 554
    invoke-static/range {v12 .. v25}, Lcom/zykj/evaluation/ui/detail/c;->b(Lcom/zykj/evaluation/ui/detail/c;JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/c;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    move-object/from16 v1, p7

    .line 559
    .line 560
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 561
    .line 562
    .line 563
    :cond_1a
    return-void
.end method

.method public final F0(IJLjava/util/List;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 35

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->I()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x2

    .line 8
    const-string v3, ""

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    if-eqz v1, :cond_3

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_3

    .line 19
    .line 20
    invoke-interface/range {p5 .. p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    move v6, v4

    .line 25
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    if-eqz v7, :cond_3

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    add-int/lit8 v8, v6, 0x1

    .line 36
    .line 37
    if-gez v6, :cond_0

    .line 38
    .line 39
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 40
    .line 41
    .line 42
    :cond_0
    check-cast v7, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 43
    .line 44
    invoke-static {v0, v6}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v9

    .line 48
    check-cast v9, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 49
    .line 50
    if-eqz v9, :cond_1

    .line 51
    .line 52
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getScore()D

    .line 53
    .line 54
    .line 55
    move-result-wide v9

    .line 56
    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    move-object v9, v3

    .line 62
    :goto_1
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getScore()D

    .line 63
    .line 64
    .line 65
    move-result-wide v10

    .line 66
    new-instance v12, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v12, v10, v11}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v10, "/"

    .line 75
    .line 76
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v11

    .line 86
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getOriginScore()Ljava/lang/Double;

    .line 87
    .line 88
    .line 89
    move-result-object v12

    .line 90
    if-eqz v12, :cond_2

    .line 91
    .line 92
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getOriginScore()Ljava/lang/Double;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    new-instance v12, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    new-instance v9, Landroidx/compose/ui/text/AnnotatedString$Builder;

    .line 115
    .line 116
    invoke-direct {v9, v7}, Landroidx/compose/ui/text/AnnotatedString$Builder;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    new-instance v12, Landroidx/compose/ui/text/SpanStyle;

    .line 120
    .line 121
    sget-object v10, Landroidx/compose/ui/text/style/TextDecoration;->Companion:Landroidx/compose/ui/text/style/TextDecoration$Companion;

    .line 122
    .line 123
    invoke-virtual {v10}, Landroidx/compose/ui/text/style/TextDecoration$Companion;->getLineThrough()Landroidx/compose/ui/text/style/TextDecoration;

    .line 124
    .line 125
    .line 126
    move-result-object v29

    .line 127
    const v33, 0xefff

    .line 128
    .line 129
    .line 130
    const/16 v34, 0x0

    .line 131
    .line 132
    const-wide/16 v13, 0x0

    .line 133
    .line 134
    const-wide/16 v15, 0x0

    .line 135
    .line 136
    const/16 v17, 0x0

    .line 137
    .line 138
    const/16 v18, 0x0

    .line 139
    .line 140
    const/16 v19, 0x0

    .line 141
    .line 142
    const/16 v20, 0x0

    .line 143
    .line 144
    const/16 v21, 0x0

    .line 145
    .line 146
    const-wide/16 v22, 0x0

    .line 147
    .line 148
    const/16 v24, 0x0

    .line 149
    .line 150
    const/16 v25, 0x0

    .line 151
    .line 152
    const/16 v26, 0x0

    .line 153
    .line 154
    const-wide/16 v27, 0x0

    .line 155
    .line 156
    const/16 v30, 0x0

    .line 157
    .line 158
    const/16 v31, 0x0

    .line 159
    .line 160
    const/16 v32, 0x0

    .line 161
    .line 162
    invoke-direct/range {v12 .. v34}, Landroidx/compose/ui/text/SpanStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 166
    .line 167
    .line 168
    move-result v7

    .line 169
    invoke-virtual {v9, v12, v4, v7}, Landroidx/compose/ui/text/AnnotatedString$Builder;->addStyle(Landroidx/compose/ui/text/SpanStyle;II)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v9}, Landroidx/compose/ui/text/AnnotatedString$Builder;->toAnnotatedString()Landroidx/compose/ui/text/AnnotatedString;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    goto :goto_2

    .line 177
    :cond_2
    new-instance v7, Landroidx/compose/ui/text/AnnotatedString;

    .line 178
    .line 179
    invoke-direct {v7, v3, v5, v2, v5}, Landroidx/compose/ui/text/AnnotatedString;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 180
    .line 181
    .line 182
    :goto_2
    new-instance v9, Lw5/f;

    .line 183
    .line 184
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v6

    .line 188
    invoke-direct {v9, v6, v7, v11}, Lw5/f;-><init>(Ljava/lang/String;Landroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    move-object/from16 v6, p6

    .line 192
    .line 193
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move v6, v8

    .line 197
    goto/16 :goto_0

    .line 198
    .line 199
    :cond_3
    new-instance v10, Lcom/zykj/evaluation/ui/detail/c;

    .line 200
    .line 201
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    check-cast v1, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 206
    .line 207
    if-eqz v1, :cond_4

    .line 208
    .line 209
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getQuestionId()J

    .line 210
    .line 211
    .line 212
    move-result-wide v6

    .line 213
    move-wide v11, v6

    .line 214
    goto :goto_3

    .line 215
    :cond_4
    move-wide/from16 v11, p2

    .line 216
    .line 217
    :goto_3
    sget-object v1, Li6/p0$c$a;->b:Li6/p0$c$a;

    .line 218
    .line 219
    invoke-virtual {v1}, Li6/p0;->a()I

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    move/from16 v6, p1

    .line 224
    .line 225
    invoke-static {v1, v6}, Lw5/h;->a(II)Li6/p0;

    .line 226
    .line 227
    .line 228
    move-result-object v14

    .line 229
    const/16 v22, 0x3fa

    .line 230
    .line 231
    const/16 v23, 0x0

    .line 232
    .line 233
    const/4 v13, 0x0

    .line 234
    const/4 v15, 0x0

    .line 235
    const/16 v16, 0x0

    .line 236
    .line 237
    const/16 v17, 0x0

    .line 238
    .line 239
    const/16 v18, 0x0

    .line 240
    .line 241
    const/16 v19, 0x0

    .line 242
    .line 243
    const/16 v20, 0x0

    .line 244
    .line 245
    const/16 v21, 0x0

    .line 246
    .line 247
    invoke-direct/range {v10 .. v23}, Lcom/zykj/evaluation/ui/detail/c;-><init>(JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 248
    .line 249
    .line 250
    sget-object v1, Lcom/zykj/evaluation/ui/detail/f$d;->b:Lcom/zykj/evaluation/ui/detail/f$d;

    .line 251
    .line 252
    invoke-interface/range {p5 .. p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 253
    .line 254
    .line 255
    move-result-object v6

    .line 256
    move v8, v4

    .line 257
    move-object v7, v5

    .line 258
    move-object v9, v7

    .line 259
    move-object v11, v9

    .line 260
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 261
    .line 262
    .line 263
    move-result v12

    .line 264
    const-string v13, "http"

    .line 265
    .line 266
    if-eqz v12, :cond_c

    .line 267
    .line 268
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v12

    .line 272
    add-int/lit8 v15, v8, 0x1

    .line 273
    .line 274
    if-gez v8, :cond_5

    .line 275
    .line 276
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 277
    .line 278
    .line 279
    :cond_5
    check-cast v12, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 280
    .line 281
    if-nez v9, :cond_6

    .line 282
    .line 283
    invoke-virtual {v12}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getExamAnswers()Ljava/util/List;

    .line 284
    .line 285
    .line 286
    move-result-object v16

    .line 287
    invoke-static/range {v16 .. v16}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v16

    .line 291
    move-object/from16 v14, v16

    .line 292
    .line 293
    check-cast v14, Ljava/lang/String;

    .line 294
    .line 295
    if-eqz v14, :cond_6

    .line 296
    .line 297
    invoke-static {v14, v13, v4, v2, v5}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v14

    .line 301
    const/4 v2, 0x1

    .line 302
    if-ne v14, v2, :cond_6

    .line 303
    .line 304
    invoke-virtual {v12}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getUuid()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v7

    .line 308
    invoke-virtual {v12}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getExamAnswers()Ljava/util/List;

    .line 309
    .line 310
    .line 311
    move-result-object v9

    .line 312
    :cond_6
    if-nez v11, :cond_7

    .line 313
    .line 314
    invoke-virtual {v12}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getExamComments()Ljava/util/List;

    .line 315
    .line 316
    .line 317
    move-result-object v2

    .line 318
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    check-cast v2, Ljava/lang/String;

    .line 323
    .line 324
    if-eqz v2, :cond_7

    .line 325
    .line 326
    const/4 v14, 0x2

    .line 327
    invoke-static {v2, v13, v4, v14, v5}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    move-result v2

    .line 331
    const/4 v13, 0x1

    .line 332
    if-ne v2, v13, :cond_7

    .line 333
    .line 334
    invoke-virtual {v12}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getExamComments()Ljava/util/List;

    .line 335
    .line 336
    .line 337
    move-result-object v11

    .line 338
    :cond_7
    invoke-virtual {v12}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getResult()I

    .line 339
    .line 340
    .line 341
    move-result v2

    .line 342
    invoke-virtual {v12}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getScore()D

    .line 343
    .line 344
    .line 345
    move-result-wide v13

    .line 346
    const-wide/16 v16, 0x0

    .line 347
    .line 348
    cmpl-double v13, v13, v16

    .line 349
    .line 350
    if-lez v13, :cond_9

    .line 351
    .line 352
    invoke-virtual {v12}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getScore()D

    .line 353
    .line 354
    .line 355
    move-result-wide v12

    .line 356
    invoke-static {v0, v8}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v8

    .line 360
    check-cast v8, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 361
    .line 362
    if-eqz v8, :cond_8

    .line 363
    .line 364
    invoke-virtual {v8}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getScore()D

    .line 365
    .line 366
    .line 367
    move-result-wide v16

    .line 368
    :cond_8
    cmpg-double v8, v12, v16

    .line 369
    .line 370
    if-gez v8, :cond_9

    .line 371
    .line 372
    const/4 v8, 0x1

    .line 373
    goto :goto_5

    .line 374
    :cond_9
    move v8, v4

    .line 375
    :goto_5
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 376
    .line 377
    .line 378
    move-result-object v8

    .line 379
    const/4 v14, 0x1

    .line 380
    move-object/from16 v12, p0

    .line 381
    .line 382
    invoke-virtual {v12, v2, v14, v8}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->y(IZLjava/lang/Boolean;)Lcom/zykj/evaluation/ui/detail/f;

    .line 383
    .line 384
    .line 385
    move-result-object v2

    .line 386
    sget-object v8, Lcom/zykj/evaluation/ui/detail/f$a;->b:Lcom/zykj/evaluation/ui/detail/f$a;

    .line 387
    .line 388
    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    move-result v13

    .line 392
    if-eqz v13, :cond_a

    .line 393
    .line 394
    move-object v1, v8

    .line 395
    goto :goto_6

    .line 396
    :cond_a
    sget-object v13, Lcom/zykj/evaluation/ui/detail/f$b;->b:Lcom/zykj/evaluation/ui/detail/f$b;

    .line 397
    .line 398
    invoke-static {v2, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    move-result v2

    .line 402
    if-eqz v2, :cond_b

    .line 403
    .line 404
    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result v2

    .line 408
    if-nez v2, :cond_b

    .line 409
    .line 410
    move-object v1, v13

    .line 411
    :cond_b
    :goto_6
    move v8, v15

    .line 412
    const/4 v2, 0x2

    .line 413
    goto/16 :goto_4

    .line 414
    .line 415
    :cond_c
    move-object/from16 v12, p0

    .line 416
    .line 417
    const/4 v14, 0x1

    .line 418
    if-nez v7, :cond_d

    .line 419
    .line 420
    move-object v7, v3

    .line 421
    :cond_d
    if-nez v9, :cond_e

    .line 422
    .line 423
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 424
    .line 425
    .line 426
    move-result-object v9

    .line 427
    :cond_e
    move-object/from16 v17, v9

    .line 428
    .line 429
    if-eqz v11, :cond_10

    .line 430
    .line 431
    invoke-static {v11}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    check-cast v0, Ljava/lang/String;

    .line 436
    .line 437
    if-nez v0, :cond_f

    .line 438
    .line 439
    goto :goto_7

    .line 440
    :cond_f
    move-object/from16 v19, v0

    .line 441
    .line 442
    goto :goto_8

    .line 443
    :cond_10
    :goto_7
    move-object/from16 v19, v3

    .line 444
    .line 445
    :goto_8
    const/16 v22, 0x25d

    .line 446
    .line 447
    const/16 v23, 0x0

    .line 448
    .line 449
    const-wide/16 v11, 0x0

    .line 450
    .line 451
    move v2, v14

    .line 452
    const/4 v14, 0x0

    .line 453
    const/4 v15, 0x0

    .line 454
    const/16 v16, 0x0

    .line 455
    .line 456
    const/16 v18, 0x0

    .line 457
    .line 458
    const/16 v21, 0x0

    .line 459
    .line 460
    move-object/from16 v20, v1

    .line 461
    .line 462
    move-object v0, v13

    .line 463
    move-object v13, v7

    .line 464
    invoke-static/range {v10 .. v23}, Lcom/zykj/evaluation/ui/detail/c;->b(Lcom/zykj/evaluation/ui/detail/c;JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/c;

    .line 465
    .line 466
    .line 467
    move-result-object v1

    .line 468
    move-object/from16 v6, p7

    .line 469
    .line 470
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 471
    .line 472
    .line 473
    new-instance v1, Ljava/util/ArrayList;

    .line 474
    .line 475
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 476
    .line 477
    .line 478
    invoke-interface/range {p5 .. p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 479
    .line 480
    .line 481
    move-result-object v6

    .line 482
    :cond_11
    :goto_9
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 483
    .line 484
    .line 485
    move-result v7

    .line 486
    if-eqz v7, :cond_12

    .line 487
    .line 488
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v7

    .line 492
    move-object v8, v7

    .line 493
    check-cast v8, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 494
    .line 495
    invoke-virtual {v8}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getResult()I

    .line 496
    .line 497
    .line 498
    move-result v8

    .line 499
    sget-object v9, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->RIGHT:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    .line 500
    .line 501
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 502
    .line 503
    .line 504
    move-result v9

    .line 505
    if-le v8, v9, :cond_11

    .line 506
    .line 507
    invoke-interface {v1, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 508
    .line 509
    .line 510
    goto :goto_9

    .line 511
    :cond_12
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 512
    .line 513
    .line 514
    move-result v6

    .line 515
    move v7, v4

    .line 516
    :cond_13
    if-ge v7, v6, :cond_14

    .line 517
    .line 518
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v8

    .line 522
    add-int/lit8 v7, v7, 0x1

    .line 523
    .line 524
    move-object v9, v8

    .line 525
    check-cast v9, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 526
    .line 527
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getRevisingAnswers()Ljava/util/List;

    .line 528
    .line 529
    .line 530
    move-result-object v11

    .line 531
    invoke-static {v11}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v11

    .line 535
    check-cast v11, Ljava/lang/String;

    .line 536
    .line 537
    const/4 v14, 0x2

    .line 538
    if-eqz v11, :cond_13

    .line 539
    .line 540
    invoke-static {v11, v0, v4, v14, v5}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 541
    .line 542
    .line 543
    move-result v11

    .line 544
    if-ne v11, v2, :cond_13

    .line 545
    .line 546
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getRevisingComments()Ljava/util/List;

    .line 547
    .line 548
    .line 549
    move-result-object v9

    .line 550
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v9

    .line 554
    check-cast v9, Ljava/lang/String;

    .line 555
    .line 556
    if-eqz v9, :cond_13

    .line 557
    .line 558
    invoke-static {v9, v0, v4, v14, v5}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    move-result v9

    .line 562
    if-ne v9, v2, :cond_13

    .line 563
    .line 564
    move-object v5, v8

    .line 565
    :cond_14
    check-cast v5, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 566
    .line 567
    if-nez v5, :cond_15

    .line 568
    .line 569
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    move-object v5, v0

    .line 574
    check-cast v5, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 575
    .line 576
    :cond_15
    if-eqz v5, :cond_17

    .line 577
    .line 578
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getUuid()Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    move-result-object v13

    .line 582
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getRevisingAnswers()Ljava/util/List;

    .line 583
    .line 584
    .line 585
    move-result-object v17

    .line 586
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getRevisingComments()Ljava/util/List;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    check-cast v0, Ljava/lang/String;

    .line 595
    .line 596
    if-nez v0, :cond_16

    .line 597
    .line 598
    move-object/from16 v19, v3

    .line 599
    .line 600
    goto :goto_a

    .line 601
    :cond_16
    move-object/from16 v19, v0

    .line 602
    .line 603
    :goto_a
    const/16 v22, 0x35d

    .line 604
    .line 605
    const/16 v23, 0x0

    .line 606
    .line 607
    const-wide/16 v11, 0x0

    .line 608
    .line 609
    const/4 v14, 0x0

    .line 610
    const/4 v15, 0x0

    .line 611
    const/16 v16, 0x0

    .line 612
    .line 613
    const/16 v18, 0x0

    .line 614
    .line 615
    const/16 v20, 0x0

    .line 616
    .line 617
    const/16 v21, 0x0

    .line 618
    .line 619
    invoke-static/range {v10 .. v23}, Lcom/zykj/evaluation/ui/detail/c;->b(Lcom/zykj/evaluation/ui/detail/c;JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/c;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    move-object/from16 v1, p8

    .line 624
    .line 625
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 626
    .line 627
    .line 628
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
    sget-object v3, Lcom/zykj/evaluation/bean/TaskState$Revising;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$Revising;

    .line 16
    .line 17
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

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
    new-instance v6, Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel$initData$1;

    .line 93
    .line 94
    const/4 v1, 0x0

    .line 95
    invoke-direct {v6, v0, v1}, Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel$initData$1;-><init>(Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel;Lkotlin/coroutines/Continuation;)V

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
    new-instance v6, Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel$commitAndChangeQuestionToNext$1;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    invoke-direct {v6, p0, p2, p1}, Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel$commitAndChangeQuestionToNext$1;-><init>(Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

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
    new-instance v7, Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel$commitAndChangeQuestionToPre$1;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    invoke-direct {v7, p0, p1}, Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel$commitAndChangeQuestionToPre$1;-><init>(Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel;Lkotlin/coroutines/Continuation;)V

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
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel;->x:Lkotlinx/coroutines/flow/MutableStateFlow;

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
    .locals 26

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
    new-instance v10, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    new-instance v11, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    new-instance v12, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getAnswerWithQuestion()Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_1

    .line 68
    .line 69
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->M()I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getId()J

    .line 74
    .line 75
    .line 76
    move-result-wide v7

    .line 77
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getQstFlows()Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v9

    .line 81
    move-object v15, v11

    .line 82
    move-object v11, v10

    .line 83
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getAnswerList()Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object v10

    .line 87
    move-object/from16 v5, p0

    .line 88
    .line 89
    move-object v13, v12

    .line 90
    move-object v12, v15

    .line 91
    invoke-virtual/range {v5 .. v13}, Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel;->F0(IJLjava/util/List;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 92
    .line 93
    .line 94
    move-object v12, v13

    .line 95
    goto/16 :goto_9

    .line 96
    .line 97
    :cond_1
    move-object v15, v11

    .line 98
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getQstFlows()Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    const/4 v3, 0x0

    .line 107
    const/4 v4, 0x1

    .line 108
    if-le v2, v4, :cond_2

    .line 109
    .line 110
    move v2, v4

    .line 111
    goto :goto_1

    .line 112
    :cond_2
    move v2, v3

    .line 113
    :goto_1
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getQstFlows()Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object v13

    .line 121
    :cond_3
    :goto_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    if-eqz v5, :cond_b

    .line 126
    .line 127
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    move-object v7, v5

    .line 132
    check-cast v7, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 133
    .line 134
    const-string v14, "."

    .line 135
    .line 136
    const-string v16, ""

    .line 137
    .line 138
    if-eqz v2, :cond_5

    .line 139
    .line 140
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getNumber()I

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-nez v5, :cond_4

    .line 145
    .line 146
    move-object/from16 v5, v16

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_4
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getNumber()I

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    new-instance v6, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    :goto_3
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getNumber()I

    .line 169
    .line 170
    .line 171
    move-result v6

    .line 172
    new-instance v8, Ljava/lang/StringBuilder;

    .line 173
    .line 174
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    goto :goto_4

    .line 188
    :cond_5
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getNumber()I

    .line 189
    .line 190
    .line 191
    move-result v5

    .line 192
    if-nez v5, :cond_6

    .line 193
    .line 194
    move-object/from16 v5, v16

    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_6
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getNumber()I

    .line 198
    .line 199
    .line 200
    move-result v5

    .line 201
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    :goto_4
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getType()I

    .line 206
    .line 207
    .line 208
    move-result v6

    .line 209
    if-nez v6, :cond_a

    .line 210
    .line 211
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getSubQuestions()Ljava/util/List;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    if-eqz v6, :cond_a

    .line 216
    .line 217
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 218
    .line 219
    .line 220
    move-result v6

    .line 221
    if-eqz v6, :cond_7

    .line 222
    .line 223
    goto :goto_8

    .line 224
    :cond_7
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getSubQuestions()Ljava/util/List;

    .line 225
    .line 226
    .line 227
    move-result-object v6

    .line 228
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 229
    .line 230
    .line 231
    move-result v6

    .line 232
    if-le v6, v4, :cond_8

    .line 233
    .line 234
    move/from16 v17, v4

    .line 235
    .line 236
    goto :goto_5

    .line 237
    :cond_8
    move/from16 v17, v3

    .line 238
    .line 239
    :goto_5
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getSubQuestions()Ljava/util/List;

    .line 240
    .line 241
    .line 242
    move-result-object v6

    .line 243
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 244
    .line 245
    .line 246
    move-result-object v18

    .line 247
    :goto_6
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    .line 248
    .line 249
    .line 250
    move-result v6

    .line 251
    if-eqz v6, :cond_3

    .line 252
    .line 253
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v6

    .line 257
    move-object v7, v6

    .line 258
    check-cast v7, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 259
    .line 260
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->M()I

    .line 261
    .line 262
    .line 263
    move-result v6

    .line 264
    if-eqz v17, :cond_9

    .line 265
    .line 266
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getNumber()I

    .line 267
    .line 268
    .line 269
    move-result v8

    .line 270
    new-instance v9, Ljava/lang/StringBuilder;

    .line 271
    .line 272
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v8

    .line 285
    goto :goto_7

    .line 286
    :cond_9
    move-object/from16 v8, v16

    .line 287
    .line 288
    :goto_7
    new-instance v9, Ljava/lang/StringBuilder;

    .line 289
    .line 290
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v8

    .line 303
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v9

    .line 307
    invoke-virtual {v1, v9}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v9

    .line 311
    check-cast v9, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 312
    .line 313
    move-object v11, v15

    .line 314
    move-object v15, v5

    .line 315
    move-object/from16 v5, p0

    .line 316
    .line 317
    invoke-virtual/range {v5 .. v12}, Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel;->E0(ILcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;Lcom/zykj/evaluation/bean/DetailAnswerInfo;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 318
    .line 319
    .line 320
    move-object v5, v15

    .line 321
    move-object v15, v11

    .line 322
    goto :goto_6

    .line 323
    :cond_a
    :goto_8
    move-object v11, v15

    .line 324
    move-object v15, v5

    .line 325
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->M()I

    .line 326
    .line 327
    .line 328
    move-result v6

    .line 329
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v5

    .line 333
    invoke-virtual {v1, v5}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v5

    .line 337
    move-object v9, v5

    .line 338
    check-cast v9, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 339
    .line 340
    move-object/from16 v5, p0

    .line 341
    .line 342
    move-object v8, v15

    .line 343
    invoke-virtual/range {v5 .. v12}, Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel;->E0(ILcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;Lcom/zykj/evaluation/bean/DetailAnswerInfo;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 344
    .line 345
    .line 346
    move-object v15, v11

    .line 347
    goto/16 :goto_2

    .line 348
    .line 349
    :cond_b
    :goto_9
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->x()Lw5/e;

    .line 350
    .line 351
    .line 352
    move-result-object v11

    .line 353
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getAnswerWithQuestion()Z

    .line 354
    .line 355
    .line 356
    move-result v13

    .line 357
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->D()Z

    .line 358
    .line 359
    .line 360
    move-result v1

    .line 361
    invoke-static {v0, v1}, Lw5/h;->h(Lcom/zykj/evaluation/bean/TaskDetailInfo;Z)Ljava/util/List;

    .line 362
    .line 363
    .line 364
    move-result-object v20

    .line 365
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->D()Z

    .line 366
    .line 367
    .line 368
    move-result v1

    .line 369
    invoke-static {v0, v1}, Lw5/h;->k(Lcom/zykj/evaluation/bean/TaskDetailInfo;Z)Ljava/util/List;

    .line 370
    .line 371
    .line 372
    move-result-object v21

    .line 373
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->D()Z

    .line 374
    .line 375
    .line 376
    move-result v1

    .line 377
    invoke-static {v0, v1}, Lw5/h;->j(Lcom/zykj/evaluation/bean/TaskDetailInfo;Z)Ljava/util/List;

    .line 378
    .line 379
    .line 380
    move-result-object v22

    .line 381
    new-instance v1, Ljava/util/ArrayList;

    .line 382
    .line 383
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 384
    .line 385
    .line 386
    invoke-static {v0}, Lw5/h;->f(Lcom/zykj/evaluation/bean/TaskDetailInfo;)Lw5/c;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    if-eqz v2, :cond_c

    .line 391
    .line 392
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    :cond_c
    invoke-static {v0}, Lw5/h;->e(Lcom/zykj/evaluation/bean/TaskDetailInfo;)Lw5/c;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    if-eqz v0, :cond_d

    .line 400
    .line 401
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    :cond_d
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 405
    .line 406
    const/16 v24, 0xe5

    .line 407
    .line 408
    const/16 v25, 0x0

    .line 409
    .line 410
    move-object/from16 v16, v12

    .line 411
    .line 412
    const/4 v12, 0x0

    .line 413
    const/4 v14, 0x0

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
    move-object/from16 v23, v1

    .line 421
    .line 422
    invoke-static/range {v11 .. v25}, Lw5/e;->b(Lw5/e;Ljava/util/List;ZZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lw5/e;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    move-object/from16 v5, p0

    .line 427
    .line 428
    invoke-virtual {v5, v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->i0(Lw5/e;)V

    .line 429
    .line 430
    .line 431
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
