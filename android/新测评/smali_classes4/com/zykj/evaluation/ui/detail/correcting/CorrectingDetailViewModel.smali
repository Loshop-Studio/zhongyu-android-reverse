.class public final Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel;
.super Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u00020\u0001B/\u0008\u0007\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0008\u0001\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J%\u0010\u0017\u001a\u00020\u000f2\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ1\u0010 \u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001e0\u00120\u001dH\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u0017\u0010$\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"H\u0016\u00a2\u0006\u0004\u0008$\u0010%J%\u0010(\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"2\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u000f0&H\u0016\u00a2\u0006\u0004\u0008(\u0010)JO\u00105\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u00152\u0006\u0010,\u001a\u00020+2\u0008\u0010.\u001a\u0004\u0018\u00010-2\u000c\u00100\u001a\u0008\u0012\u0004\u0012\u00020/0\u00122\u0016\u00104\u001a\u0012\u0012\u0004\u0012\u00020201j\u0008\u0012\u0004\u0012\u000202`3H\u0002\u00a2\u0006\u0004\u00085\u00106JI\u0010:\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u00152\u0006\u00107\u001a\u00020-2\u0006\u00108\u001a\u00020\u001e2\u0008\u00109\u001a\u0004\u0018\u00010/2\u0016\u00104\u001a\u0012\u0012\u0004\u0012\u00020201j\u0008\u0012\u0004\u0012\u000202`3H\u0002\u00a2\u0006\u0004\u0008:\u0010;R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u0010=R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008>\u0010=\u00a8\u0006?"
    }
    d2 = {
        "Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel;",
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
        "question",
        "Lcom/zykj/evaluation/bean/DetailAnswerInfo;",
        "answerList",
        "Ljava/util/ArrayList;",
        "Lcom/zykj/evaluation/ui/detail/c;",
        "Lkotlin/collections/ArrayList;",
        "examAnswerList",
        "F0",
        "(IJLcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/util/List;Ljava/util/ArrayList;)V",
        "subQuestion",
        "numberString",
        "answer",
        "E0",
        "(ILcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;Lcom/zykj/evaluation/bean/DetailAnswerInfo;Ljava/util/ArrayList;)V",
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
        "SMAP\nCorrectingDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CorrectingDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel\n+ 2 ArrayMap.jvm.kt\nandroidx/collection/ArrayMapKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,240:1\n27#2:241\n1869#3,2:242\n1869#3:244\n1869#3,2:245\n1870#3:247\n295#3,2:249\n1563#3:251\n1634#3,3:252\n1#4:248\n*S KotlinDebug\n*F\n+ 1 CorrectingDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel\n*L\n74#1:241\n75#1:242,2\n96#1:244\n111#1:245,2\n96#1:247\n165#1:249,2\n199#1:251\n199#1:252,3\n*E\n"
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
    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel;->x:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 22
    .line 23
    return-void
.end method

.method public static final synthetic A0(Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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

.method public static final synthetic B0(Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel;)I
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

.method public static final synthetic C0(Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel;)Ljava/util/List;
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

.method public static final synthetic D0(Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel;Lcom/zykj/evaluation/ui/detail/GuideQuestion;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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

.method public static final synthetic z0(Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
.method public final E0(ILcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;Lcom/zykj/evaluation/bean/DetailAnswerInfo;Ljava/util/ArrayList;)V
    .locals 15

    .line 1
    if-eqz p4, :cond_1

    .line 2
    .line 3
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getExamAnswers()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    :goto_0
    move-object v8, v0

    .line 11
    goto :goto_2

    .line 12
    :cond_1
    :goto_1
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :goto_2
    invoke-virtual/range {p2 .. p2}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getOptions()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_4

    .line 22
    .line 23
    new-instance v1, Ljava/util/ArrayList;

    .line 24
    .line 25
    const/16 v2, 0xa

    .line 26
    .line 27
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    move-object v10, v2

    .line 49
    check-cast v10, Ljava/lang/String;

    .line 50
    .line 51
    new-instance v9, Lw5/b;

    .line 52
    .line 53
    invoke-interface {v8, v10}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    sget-object v2, Lw5/a$a;->c:Lw5/a$a;

    .line 60
    .line 61
    :goto_4
    move-object v11, v2

    .line 62
    goto :goto_5

    .line 63
    :cond_2
    sget-object v2, Lw5/a$b;->c:Lw5/a$b;

    .line 64
    .line 65
    goto :goto_4

    .line 66
    :goto_5
    const/4 v13, 0x4

    .line 67
    const/4 v14, 0x0

    .line 68
    const/4 v12, 0x0

    .line 69
    invoke-direct/range {v9 .. v14}, Lw5/b;-><init>(Ljava/lang/String;Lw5/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 70
    .line 71
    .line 72
    invoke-interface {v1, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_3
    :goto_6
    move-object v7, v1

    .line 77
    goto :goto_7

    .line 78
    :cond_4
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    goto :goto_6

    .line 83
    :goto_7
    invoke-virtual/range {p2 .. p2}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getDisplayNumber()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    if-nez v0, :cond_5

    .line 88
    .line 89
    const-string v0, ""

    .line 90
    .line 91
    :cond_5
    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_6

    .line 96
    .line 97
    move-object/from16 v6, p3

    .line 98
    .line 99
    goto :goto_8

    .line 100
    :cond_6
    move-object v6, v0

    .line 101
    :goto_8
    new-instance v1, Lcom/zykj/evaluation/ui/detail/c;

    .line 102
    .line 103
    invoke-virtual/range {p2 .. p2}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getQuestionId()J

    .line 104
    .line 105
    .line 106
    move-result-wide v2

    .line 107
    invoke-virtual/range {p2 .. p2}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    invoke-virtual/range {p2 .. p2}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getQstType()I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    move/from16 v5, p1

    .line 116
    .line 117
    invoke-static {v0, v5}, Lw5/h;->a(II)Li6/p0;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    const/16 v13, 0x3c0

    .line 122
    .line 123
    const/4 v14, 0x0

    .line 124
    const/4 v9, 0x0

    .line 125
    const/4 v10, 0x0

    .line 126
    const/4 v11, 0x0

    .line 127
    const/4 v12, 0x0

    .line 128
    invoke-direct/range {v1 .. v14}, Lcom/zykj/evaluation/ui/detail/c;-><init>(JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 129
    .line 130
    .line 131
    move-object/from16 v0, p5

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    return-void
.end method

.method public final F0(IJLcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/util/List;Ljava/util/ArrayList;)V
    .locals 17

    .line 1
    invoke-interface/range {p5 .. p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    move-object v3, v1

    .line 17
    check-cast v3, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 18
    .line 19
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getExamAnswers()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Ljava/lang/String;

    .line 28
    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    const/4 v5, 0x2

    .line 33
    const-string v6, "http"

    .line 34
    .line 35
    invoke-static {v3, v6, v4, v5, v2}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    const/4 v3, 0x1

    .line 40
    if-ne v2, v3, :cond_0

    .line 41
    .line 42
    move-object v2, v1

    .line 43
    :cond_1
    check-cast v2, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 44
    .line 45
    if-nez v2, :cond_2

    .line 46
    .line 47
    invoke-static/range {p5 .. p5}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    move-object v2, v0

    .line 52
    check-cast v2, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 53
    .line 54
    :cond_2
    new-instance v3, Lcom/zykj/evaluation/ui/detail/c;

    .line 55
    .line 56
    if-eqz p4, :cond_3

    .line 57
    .line 58
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getQuestionId()J

    .line 59
    .line 60
    .line 61
    move-result-wide v0

    .line 62
    move-wide v4, v0

    .line 63
    goto :goto_0

    .line 64
    :cond_3
    move-wide/from16 v4, p2

    .line 65
    .line 66
    :goto_0
    if-eqz v2, :cond_5

    .line 67
    .line 68
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getUuid()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-nez v0, :cond_4

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_4
    :goto_1
    move-object v6, v0

    .line 76
    goto :goto_3

    .line 77
    :cond_5
    :goto_2
    const-string v0, ""

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :goto_3
    sget-object v0, Li6/p0$c$a;->b:Li6/p0$c$a;

    .line 81
    .line 82
    invoke-virtual {v0}, Li6/p0;->a()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    move/from16 v1, p1

    .line 87
    .line 88
    invoke-static {v0, v1}, Lw5/h;->a(II)Li6/p0;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    if-eqz v2, :cond_7

    .line 93
    .line 94
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getExamAnswers()Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    if-nez v0, :cond_6

    .line 99
    .line 100
    goto :goto_5

    .line 101
    :cond_6
    :goto_4
    move-object v10, v0

    .line 102
    goto :goto_6

    .line 103
    :cond_7
    :goto_5
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    goto :goto_4

    .line 108
    :goto_6
    const/16 v15, 0x3d8

    .line 109
    .line 110
    const/16 v16, 0x0

    .line 111
    .line 112
    const/4 v8, 0x0

    .line 113
    const/4 v9, 0x0

    .line 114
    const/4 v11, 0x0

    .line 115
    const/4 v12, 0x0

    .line 116
    const/4 v13, 0x0

    .line 117
    const/4 v14, 0x0

    .line 118
    invoke-direct/range {v3 .. v16}, Lcom/zykj/evaluation/ui/detail/c;-><init>(JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 119
    .line 120
    .line 121
    move-object/from16 v0, p6

    .line 122
    .line 123
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
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
    sget-object v3, Lcom/zykj/evaluation/bean/TaskState$Correcting;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$Correcting;

    .line 16
    .line 17
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

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
    new-instance v6, Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel$initData$1;

    .line 93
    .line 94
    const/4 v1, 0x0

    .line 95
    invoke-direct {v6, v0, v1}, Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel$initData$1;-><init>(Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel;Lkotlin/coroutines/Continuation;)V

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
    new-instance v6, Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel$commitAndChangeQuestionToNext$1;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    invoke-direct {v6, p0, p2, p1}, Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel$commitAndChangeQuestionToNext$1;-><init>(Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

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
    new-instance v7, Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel$commitAndChangeQuestionToPre$1;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    invoke-direct {v7, p0, p1}, Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel$commitAndChangeQuestionToPre$1;-><init>(Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel;Lkotlin/coroutines/Continuation;)V

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
    .locals 26

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
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->w()Lcom/zykj/evaluation/ui/detail/b;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel;->x:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 15
    .line 16
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lcom/zykj/http/bean/HeaderBean;

    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/zykj/http/bean/HeaderBean;->getServerUrl()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v3, ""

    .line 27
    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    move-object v1, v3

    .line 31
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getPath()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    if-nez v4, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move-object v3, v4

    .line 39
    :goto_0
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->C()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    new-instance v5, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, "?showAnalysis="

    .line 55
    .line 56
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->K()Lg7/e;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getId()J

    .line 71
    .line 72
    .line 73
    move-result-wide v3

    .line 74
    invoke-virtual {v1, v3, v4}, Lg7/e;->j(J)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v12

    .line 78
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getAskForHelp()Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_2

    .line 83
    .line 84
    sget-object v1, Lcom/zykj/evaluation/ui/detail/a$b;->c:Lcom/zykj/evaluation/ui/detail/a$b;

    .line 85
    .line 86
    :goto_1
    move-object v14, v1

    .line 87
    goto :goto_2

    .line 88
    :cond_2
    sget-object v1, Lcom/zykj/evaluation/ui/detail/a$a;->c:Lcom/zykj/evaluation/ui/detail/a$a;

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->isInMistakeBook()Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_3

    .line 96
    .line 97
    sget-object v1, Lcom/zykj/evaluation/ui/detail/d$b;->c:Lcom/zykj/evaluation/ui/detail/d$b;

    .line 98
    .line 99
    :goto_3
    move-object v15, v1

    .line 100
    goto :goto_4

    .line 101
    :cond_3
    sget-object v1, Lcom/zykj/evaluation/ui/detail/d$a;->c:Lcom/zykj/evaluation/ui/detail/d$a;

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :goto_4
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getStem()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v23

    .line 108
    const v24, 0x7e5bf

    .line 109
    .line 110
    .line 111
    const/16 v25, 0x0

    .line 112
    .line 113
    const/4 v3, 0x0

    .line 114
    const/4 v4, 0x0

    .line 115
    const/4 v5, 0x0

    .line 116
    const/4 v6, 0x0

    .line 117
    const/4 v7, 0x0

    .line 118
    const/4 v8, 0x0

    .line 119
    const/4 v10, 0x0

    .line 120
    const/4 v11, 0x0

    .line 121
    const/4 v13, 0x0

    .line 122
    const/16 v16, 0x0

    .line 123
    .line 124
    const/16 v17, 0x0

    .line 125
    .line 126
    const/16 v18, 0x0

    .line 127
    .line 128
    const/16 v19, 0x0

    .line 129
    .line 130
    const/16 v20, 0x0

    .line 131
    .line 132
    const-wide/16 v21, 0x0

    .line 133
    .line 134
    invoke-static/range {v2 .. v25}, Lcom/zykj/evaluation/ui/detail/b;->b(Lcom/zykj/evaluation/ui/detail/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;ZZLjava/lang/String;ZLcom/zykj/evaluation/ui/detail/a;Lcom/zykj/evaluation/ui/detail/d;Lw5/i;ZZLjava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/b;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-virtual {v0, v1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->h0(Lcom/zykj/evaluation/ui/detail/b;)V

    .line 139
    .line 140
    .line 141
    return-void
.end method

.method public w0(Lcom/zykj/evaluation/bean/TaskDetailInfo;Ljava/util/Map;)V
    .locals 20

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
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getAnswerWithQuestion()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_1

    .line 58
    .line 59
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->M()I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getId()J

    .line 64
    .line 65
    .line 66
    move-result-wide v7

    .line 67
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getQstFlows()Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    move-object v9, v1

    .line 76
    check-cast v9, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 77
    .line 78
    move-object v11, v10

    .line 79
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getAnswerList()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v10

    .line 83
    move-object/from16 v5, p0

    .line 84
    .line 85
    invoke-virtual/range {v5 .. v11}, Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel;->F0(IJLcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/util/List;Ljava/util/ArrayList;)V

    .line 86
    .line 87
    .line 88
    move-object v10, v11

    .line 89
    goto/16 :goto_a

    .line 90
    .line 91
    :cond_1
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getQstFlows()Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    const/4 v3, 0x0

    .line 100
    const/4 v4, 0x1

    .line 101
    if-le v2, v4, :cond_2

    .line 102
    .line 103
    move v2, v4

    .line 104
    goto :goto_1

    .line 105
    :cond_2
    move v2, v3

    .line 106
    :goto_1
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getQstFlows()Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object v11

    .line 114
    :cond_3
    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    if-eqz v5, :cond_b

    .line 119
    .line 120
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    move-object v7, v5

    .line 125
    check-cast v7, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 126
    .line 127
    const-string v12, "."

    .line 128
    .line 129
    const-string v13, ""

    .line 130
    .line 131
    if-eqz v2, :cond_5

    .line 132
    .line 133
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getNumber()I

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    if-nez v5, :cond_4

    .line 138
    .line 139
    move-object v5, v13

    .line 140
    goto :goto_3

    .line 141
    :cond_4
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getNumber()I

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    new-instance v6, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    :goto_3
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getNumber()I

    .line 161
    .line 162
    .line 163
    move-result v6

    .line 164
    new-instance v8, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    :goto_4
    move-object v14, v5

    .line 180
    goto :goto_5

    .line 181
    :cond_5
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getNumber()I

    .line 182
    .line 183
    .line 184
    move-result v5

    .line 185
    if-nez v5, :cond_6

    .line 186
    .line 187
    move-object v14, v13

    .line 188
    goto :goto_5

    .line 189
    :cond_6
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getNumber()I

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    goto :goto_4

    .line 198
    :goto_5
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getType()I

    .line 199
    .line 200
    .line 201
    move-result v5

    .line 202
    if-nez v5, :cond_a

    .line 203
    .line 204
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getSubQuestions()Ljava/util/List;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    if-eqz v5, :cond_a

    .line 209
    .line 210
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 211
    .line 212
    .line 213
    move-result v5

    .line 214
    if-eqz v5, :cond_7

    .line 215
    .line 216
    goto :goto_9

    .line 217
    :cond_7
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getSubQuestions()Ljava/util/List;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 222
    .line 223
    .line 224
    move-result v5

    .line 225
    if-le v5, v4, :cond_8

    .line 226
    .line 227
    move v15, v4

    .line 228
    goto :goto_6

    .line 229
    :cond_8
    move v15, v3

    .line 230
    :goto_6
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getSubQuestions()Ljava/util/List;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 235
    .line 236
    .line 237
    move-result-object v16

    .line 238
    :goto_7
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 239
    .line 240
    .line 241
    move-result v5

    .line 242
    if-eqz v5, :cond_3

    .line 243
    .line 244
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v5

    .line 248
    move-object v7, v5

    .line 249
    check-cast v7, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 250
    .line 251
    if-eqz v15, :cond_9

    .line 252
    .line 253
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getNumber()I

    .line 254
    .line 255
    .line 256
    move-result v5

    .line 257
    new-instance v6, Ljava/lang/StringBuilder;

    .line 258
    .line 259
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v5

    .line 272
    goto :goto_8

    .line 273
    :cond_9
    move-object v5, v13

    .line 274
    :goto_8
    new-instance v6, Ljava/lang/StringBuilder;

    .line 275
    .line 276
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v8

    .line 289
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->M()I

    .line 290
    .line 291
    .line 292
    move-result v6

    .line 293
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v5

    .line 297
    invoke-virtual {v1, v5}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v5

    .line 301
    move-object v9, v5

    .line 302
    check-cast v9, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 303
    .line 304
    move-object/from16 v5, p0

    .line 305
    .line 306
    invoke-virtual/range {v5 .. v10}, Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel;->E0(ILcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;Lcom/zykj/evaluation/bean/DetailAnswerInfo;Ljava/util/ArrayList;)V

    .line 307
    .line 308
    .line 309
    goto :goto_7

    .line 310
    :cond_a
    :goto_9
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->M()I

    .line 311
    .line 312
    .line 313
    move-result v6

    .line 314
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v5

    .line 318
    invoke-virtual {v1, v5}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v5

    .line 322
    move-object v9, v5

    .line 323
    check-cast v9, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 324
    .line 325
    move-object/from16 v5, p0

    .line 326
    .line 327
    move-object v8, v14

    .line 328
    invoke-virtual/range {v5 .. v10}, Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel;->E0(ILcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;Lcom/zykj/evaluation/bean/DetailAnswerInfo;Ljava/util/ArrayList;)V

    .line 329
    .line 330
    .line 331
    goto/16 :goto_2

    .line 332
    .line 333
    :cond_b
    :goto_a
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->x()Lw5/e;

    .line 334
    .line 335
    .line 336
    move-result-object v5

    .line 337
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getAnswerWithQuestion()Z

    .line 338
    .line 339
    .line 340
    move-result v7

    .line 341
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->D()Z

    .line 342
    .line 343
    .line 344
    move-result v1

    .line 345
    invoke-static {v0, v1}, Lw5/h;->h(Lcom/zykj/evaluation/bean/TaskDetailInfo;Z)Ljava/util/List;

    .line 346
    .line 347
    .line 348
    move-result-object v14

    .line 349
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->D()Z

    .line 350
    .line 351
    .line 352
    move-result v1

    .line 353
    invoke-static {v0, v1}, Lw5/h;->k(Lcom/zykj/evaluation/bean/TaskDetailInfo;Z)Ljava/util/List;

    .line 354
    .line 355
    .line 356
    move-result-object v15

    .line 357
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->D()Z

    .line 358
    .line 359
    .line 360
    move-result v1

    .line 361
    invoke-static {v0, v1}, Lw5/h;->j(Lcom/zykj/evaluation/bean/TaskDetailInfo;Z)Ljava/util/List;

    .line 362
    .line 363
    .line 364
    move-result-object v16

    .line 365
    new-instance v1, Ljava/util/ArrayList;

    .line 366
    .line 367
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 368
    .line 369
    .line 370
    invoke-static {v0}, Lw5/h;->f(Lcom/zykj/evaluation/bean/TaskDetailInfo;)Lw5/c;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    if-eqz v0, :cond_c

    .line 375
    .line 376
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    :cond_c
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 380
    .line 381
    const/16 v18, 0xf5

    .line 382
    .line 383
    const/16 v19, 0x0

    .line 384
    .line 385
    const/4 v6, 0x0

    .line 386
    const/4 v8, 0x0

    .line 387
    move-object v11, v10

    .line 388
    const/4 v10, 0x0

    .line 389
    move-object v9, v11

    .line 390
    const/4 v11, 0x0

    .line 391
    const/4 v12, 0x0

    .line 392
    const/4 v13, 0x0

    .line 393
    move-object/from16 v17, v1

    .line 394
    .line 395
    invoke-static/range {v5 .. v19}, Lw5/e;->b(Lw5/e;Ljava/util/List;ZZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lw5/e;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    move-object/from16 v5, p0

    .line 400
    .line 401
    invoke-virtual {v5, v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->i0(Lw5/e;)V

    .line 402
    .line 403
    .line 404
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
