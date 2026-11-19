.class public final Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;
.super Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001BG\u0008\u0007\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0008\u0001\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J%\u0010\u001d\u001a\u00020\u00152\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\u0008!\u0010\"J1\u0010&\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001f2\u0018\u0010%\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020$0\u00180#H\u0016\u00a2\u0006\u0004\u0008&\u0010\'J\u0017\u0010*\u001a\u00020\u00152\u0006\u0010)\u001a\u00020(H\u0016\u00a2\u0006\u0004\u0008*\u0010+J%\u0010.\u001a\u00020\u00152\u0006\u0010)\u001a\u00020(2\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u00150,H\u0016\u00a2\u0006\u0004\u0008.\u0010/J%\u00101\u001a\u00020\u00152\u0006\u0010)\u001a\u00020(2\u000c\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u00150,H\u0016\u00a2\u0006\u0004\u00081\u0010/J#\u00104\u001a\u00020\u00152\u0006\u00102\u001a\u00020$2\u000c\u00103\u001a\u0008\u0012\u0004\u0012\u00020$0\u0018\u00a2\u0006\u0004\u00084\u00105J\u0015\u00107\u001a\u00020\u00152\u0006\u00106\u001a\u00020\u0013\u00a2\u0006\u0004\u00087\u00108J\u001d\u0010:\u001a\u00020\u00152\u0006\u00102\u001a\u00020$2\u0006\u00109\u001a\u00020\u0013\u00a2\u0006\u0004\u0008:\u0010;J\u0081\u0001\u0010H\u001a\u00020\u00152\u0006\u0010<\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020=2\u0008\u0010@\u001a\u0004\u0018\u00010?2\u0018\u0010%\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020$0\u00180#2\u000c\u0010B\u001a\u0008\u0012\u0004\u0012\u00020A0\u00182\u0016\u0010F\u001a\u0012\u0012\u0004\u0012\u00020D0Cj\u0008\u0012\u0004\u0012\u00020D`E2\u0016\u0010G\u001a\u0012\u0012\u0004\u0012\u00020D0Cj\u0008\u0012\u0004\u0012\u00020D`EH\u0002\u00a2\u0006\u0004\u0008H\u0010IJw\u0010M\u001a\u00020\u00152\u0006\u0010<\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?2\u0006\u0010J\u001a\u00020$2\u000c\u0010K\u001a\u0008\u0012\u0004\u0012\u00020$0\u00182\u0008\u0010L\u001a\u0004\u0018\u00010A2\u0016\u0010F\u001a\u0012\u0012\u0004\u0012\u00020D0Cj\u0008\u0012\u0004\u0012\u00020D`E2\u0016\u0010G\u001a\u0012\u0012\u0004\u0012\u00020D0Cj\u0008\u0012\u0004\u0012\u00020D`EH\u0002\u00a2\u0006\u0004\u0008M\u0010NJ\u0010\u0010O\u001a\u00020\u0015H\u0082@\u00a2\u0006\u0004\u0008O\u0010PJ\u0010\u0010Q\u001a\u00020\u0015H\u0082@\u00a2\u0006\u0004\u0008Q\u0010PJ \u0010S\u001a\u00020\u00152\u0006\u00102\u001a\u00020$2\u0006\u0010R\u001a\u00020\u001bH\u0082@\u00a2\u0006\u0004\u0008S\u0010TR\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008U\u0010VR\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008W\u0010VR\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008X\u0010YR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Z\u0010[R\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\\\u0010]R \u0010a\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001b0^8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008_\u0010`\u00a8\u0006b"
    }
    d2 = {
        "Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;",
        "Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/zykj/message/server/bean/UserInfo;",
        "userInfo",
        "Lcom/zykj/http/bean/HeaderBean;",
        "headerBeanFlow",
        "Lcom/zykj/evaluation/di/AppDatabase;",
        "database",
        "Lcom/zykj/evaluation/upload/OssTaskManger;",
        "ossTaskManger",
        "Lcom/zykj/evaluation/submit/SubmitTaskManger;",
        "submitTaskManger",
        "Lp5/j;",
        "service",
        "<init>",
        "(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/di/AppDatabase;Lcom/zykj/evaluation/upload/OssTaskManger;Lcom/zykj/evaluation/submit/SubmitTaskManger;Lp5/j;)V",
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
        "callback",
        "u",
        "uuid",
        "localAnswer",
        "S0",
        "(Ljava/lang/String;Ljava/util/List;)V",
        "isInCorrect",
        "M0",
        "(Z)V",
        "isRight",
        "R0",
        "(Ljava/lang/String;Z)V",
        "specificTrainingType",
        "",
        "questionId",
        "Lcom/zykj/evaluation/bean/DetailSubQuestion;",
        "subQuestion",
        "Lcom/zykj/evaluation/bean/DetailAnswerInfo;",
        "answerList",
        "Ljava/util/ArrayList;",
        "Lcom/zykj/evaluation/ui/detail/c;",
        "Lkotlin/collections/ArrayList;",
        "localAnswerList",
        "examAnswerList",
        "Q0",
        "(IJLcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/util/Map;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;)V",
        "numberString",
        "localAnswers",
        "answer",
        "P0",
        "(IJLcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;Ljava/util/List;Lcom/zykj/evaluation/bean/DetailAnswerInfo;Ljava/util/ArrayList;Ljava/util/ArrayList;)V",
        "N0",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "O0",
        "correctResult",
        "T0",
        "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "w",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "x",
        "y",
        "Lcom/zykj/evaluation/di/AppDatabase;",
        "z",
        "Lcom/zykj/evaluation/upload/OssTaskManger;",
        "A",
        "Lcom/zykj/evaluation/submit/SubmitTaskManger;",
        "Landroidx/collection/ArrayMap;",
        "B",
        "Landroidx/collection/ArrayMap;",
        "localCorrectResult",
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
        "SMAP\nToCorrectSelfDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToCorrectSelfDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel\n+ 2 ArrayMap.jvm.kt\nandroidx/collection/ArrayMapKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,638:1\n27#2:639\n27#2:640\n27#2:658\n27#2:667\n1869#3,2:641\n1869#3:643\n1869#3,2:644\n1870#3:646\n295#3,2:648\n1563#3:650\n1634#3,3:651\n1563#3:654\n1634#3,3:655\n1869#3,2:659\n1563#3:661\n1634#3,2:662\n295#3,2:664\n1636#3:666\n1869#3:668\n295#3,2:669\n1870#3:671\n1869#3,2:672\n1563#3:674\n1634#3,2:675\n1563#3:677\n1634#3,3:678\n1636#3:681\n1563#3:682\n1634#3,3:683\n1869#3:686\n1563#3:687\n1634#3,3:688\n1870#3:691\n1#4:647\n*S KotlinDebug\n*F\n+ 1 ToCorrectSelfDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel\n*L\n62#1:639\n117#1:640\n422#1:658\n458#1:667\n118#1:641,2\n142#1:643\n158#1:644,2\n142#1:646\n223#1:648,2\n300#1:650\n300#1:651,3\n342#1:654\n342#1:655,3\n424#1:659,2\n444#1:661\n444#1:662,2\n446#1:664,2\n444#1:666\n459#1:668\n468#1:669,2\n459#1:671\n475#1:672,2\n512#1:674\n512#1:675,2\n516#1:677\n516#1:678,3\n512#1:681\n561#1:682\n561#1:683,3\n570#1:686\n576#1:687\n576#1:688,3\n570#1:691\n*E\n"
    }
.end annotation


# instance fields
.field public final A:Lcom/zykj/evaluation/submit/SubmitTaskManger;

.field public final B:Landroidx/collection/ArrayMap;

.field public final w:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final x:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final y:Lcom/zykj/evaluation/di/AppDatabase;

.field public final z:Lcom/zykj/evaluation/upload/OssTaskManger;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/di/AppDatabase;Lcom/zykj/evaluation/upload/OssTaskManger;Lcom/zykj/evaluation/submit/SubmitTaskManger;Lp5/j;)V
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
    const-string v0, "database"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "ossTaskManger"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "submitTaskManger"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "service"

    .line 27
    .line 28
    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, p1, p6}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;-><init>(Lkotlinx/coroutines/flow/MutableStateFlow;Lp5/j;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 35
    .line 36
    iput-object p2, p0, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;->x:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 37
    .line 38
    iput-object p3, p0, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;->y:Lcom/zykj/evaluation/di/AppDatabase;

    .line 39
    .line 40
    iput-object p4, p0, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;->z:Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 41
    .line 42
    iput-object p5, p0, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;->A:Lcom/zykj/evaluation/submit/SubmitTaskManger;

    .line 43
    .line 44
    new-instance p1, Landroidx/collection/ArrayMap;

    .line 45
    .line 46
    invoke-direct {p1}, Landroidx/collection/ArrayMap;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;->B:Landroidx/collection/ArrayMap;

    .line 50
    .line 51
    return-void
.end method

.method public static final synthetic A0(Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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

.method public static final synthetic B0(Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;->N0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic C0(Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->B(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic D0(Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;)Landroidx/collection/ArrayMap;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;->B:Landroidx/collection/ArrayMap;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic E0(Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;->O0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic F0(Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;)I
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

.method public static final synthetic G0(Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;)Ljava/util/List;
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

.method public static final synthetic H0(Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;Lcom/zykj/evaluation/ui/detail/GuideQuestion;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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

.method public static final synthetic I0(Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;)Lcom/zykj/evaluation/submit/SubmitTaskManger;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;->A:Lcom/zykj/evaluation/submit/SubmitTaskManger;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic J0(Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic K0(Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->x0(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic L0(Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;->T0(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic z0(Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
.method public final M0(Z)V
    .locals 15

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->x()Lw5/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v13, 0xffb

    .line 6
    .line 7
    const/4 v14, 0x0

    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x0

    .line 15
    const/4 v9, 0x0

    .line 16
    const/4 v10, 0x0

    .line 17
    const/4 v11, 0x0

    .line 18
    const/4 v12, 0x0

    .line 19
    move/from16 v3, p1

    .line 20
    .line 21
    invoke-static/range {v0 .. v14}, Lw5/e;->b(Lw5/e;Ljava/util/List;ZZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lw5/e;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p0, v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->i0(Lw5/e;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final N0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$commitAnswer$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$commitAnswer$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$commitAnswer$1;->i:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$commitAnswer$1;->i:I

    .line 22
    .line 23
    :goto_0
    move-object v11, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$commitAnswer$1;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$commitAnswer$1;-><init>(Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;Lkotlin/coroutines/Continuation;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v11, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$commitAnswer$1;->g:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget v3, v11, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$commitAnswer$1;->i:I

    .line 38
    .line 39
    const-string v12, "getId(...)"

    .line 40
    .line 41
    const/4 v13, 0x2

    .line 42
    const/4 v4, 0x1

    .line 43
    if-eqz v3, :cond_3

    .line 44
    .line 45
    if-eq v3, v4, :cond_2

    .line 46
    .line 47
    if-ne v3, v13, :cond_1

    .line 48
    .line 49
    iget-object v2, v11, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$commitAnswer$1;->f:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, Ljava/util/ArrayList;

    .line 52
    .line 53
    iget-object v2, v11, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$commitAnswer$1;->e:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v2, Landroidx/collection/ArrayMap;

    .line 56
    .line 57
    iget-object v2, v11, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$commitAnswer$1;->d:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v2, Ljava/util/List;

    .line 60
    .line 61
    iget-object v2, v11, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$commitAnswer$1;->c:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v2, Ljava/util/ArrayList;

    .line 64
    .line 65
    iget-object v2, v11, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$commitAnswer$1;->b:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v2, Landroidx/collection/ArrayMap;

    .line 68
    .line 69
    iget-object v2, v11, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$commitAnswer$1;->a:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v2, Ln5/o;

    .line 72
    .line 73
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto/16 :goto_f

    .line 77
    .line 78
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 79
    .line 80
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 81
    .line 82
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw v1

    .line 86
    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;->y:Lcom/zykj/evaluation/di/AppDatabase;

    .line 94
    .line 95
    invoke-virtual {v1}, Lcom/zykj/evaluation/di/AppDatabase;->i()Ln5/p;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 100
    .line 101
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    check-cast v1, Lcom/zykj/message/server/bean/UserInfo;

    .line 106
    .line 107
    invoke-virtual {v1}, Lcom/zykj/message/server/bean/UserInfo;->a()Ljava/lang/Long;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-static {v1, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 115
    .line 116
    .line 117
    move-result-wide v5

    .line 118
    move-wide v8, v5

    .line 119
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->N()J

    .line 120
    .line 121
    .line 122
    move-result-wide v6

    .line 123
    sget-object v1, Lcom/zykj/evaluation/bean/TaskState$ToCorrect;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$ToCorrect;

    .line 124
    .line 125
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/TaskState;->getState()I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    move-wide v14, v8

    .line 130
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->Q()J

    .line 131
    .line 132
    .line 133
    move-result-wide v9

    .line 134
    iput v4, v11, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$commitAnswer$1;->i:I

    .line 135
    .line 136
    move v8, v1

    .line 137
    move-wide v4, v14

    .line 138
    invoke-interface/range {v3 .. v11}, Ln5/p;->d(JJIJLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    if-ne v1, v2, :cond_4

    .line 143
    .line 144
    goto/16 :goto_e

    .line 145
    .line 146
    :cond_4
    :goto_2
    check-cast v1, Ln5/o;

    .line 147
    .line 148
    new-instance v3, Landroidx/collection/ArrayMap;

    .line 149
    .line 150
    invoke-direct {v3}, Landroidx/collection/ArrayMap;-><init>()V

    .line 151
    .line 152
    .line 153
    new-instance v4, Ljava/util/ArrayList;

    .line 154
    .line 155
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->x()Lw5/e;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    invoke-virtual {v5}, Lw5/e;->f()Ljava/util/List;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    :cond_5
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v6

    .line 174
    if-eqz v6, :cond_a

    .line 175
    .line 176
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    check-cast v6, Lcom/zykj/evaluation/ui/detail/c;

    .line 181
    .line 182
    invoke-virtual {v6}, Lcom/zykj/evaluation/ui/detail/c;->h()J

    .line 183
    .line 184
    .line 185
    move-result-wide v7

    .line 186
    invoke-static {v7, v8}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 187
    .line 188
    .line 189
    move-result-object v7

    .line 190
    invoke-virtual {v3, v7}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    if-nez v7, :cond_6

    .line 195
    .line 196
    invoke-virtual {v6}, Lcom/zykj/evaluation/ui/detail/c;->h()J

    .line 197
    .line 198
    .line 199
    move-result-wide v7

    .line 200
    invoke-static {v7, v8}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 201
    .line 202
    .line 203
    move-result-object v7

    .line 204
    new-instance v8, Ljava/util/ArrayList;

    .line 205
    .line 206
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 207
    .line 208
    .line 209
    invoke-interface {v3, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    :cond_6
    invoke-virtual {v6}, Lcom/zykj/evaluation/ui/detail/c;->h()J

    .line 213
    .line 214
    .line 215
    move-result-wide v7

    .line 216
    invoke-static {v7, v8}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 217
    .line 218
    .line 219
    move-result-object v7

    .line 220
    invoke-virtual {v3, v7}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v7

    .line 224
    check-cast v7, Ljava/util/ArrayList;

    .line 225
    .line 226
    if-eqz v7, :cond_7

    .line 227
    .line 228
    new-instance v8, Lcom/zykj/evaluation/bean/CommitAnswer;

    .line 229
    .line 230
    invoke-virtual {v6}, Lcom/zykj/evaluation/ui/detail/c;->l()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v9

    .line 234
    invoke-virtual {v6}, Lcom/zykj/evaluation/ui/detail/c;->c()Ljava/util/List;

    .line 235
    .line 236
    .line 237
    move-result-object v10

    .line 238
    invoke-direct {v8, v9, v10}, Lcom/zykj/evaluation/bean/CommitAnswer;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v7

    .line 245
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 246
    .line 247
    .line 248
    :cond_7
    invoke-virtual {v6}, Lcom/zykj/evaluation/ui/detail/c;->k()Li6/p0;

    .line 249
    .line 250
    .line 251
    move-result-object v7

    .line 252
    instance-of v7, v7, Li6/p0$c;

    .line 253
    .line 254
    if-nez v7, :cond_8

    .line 255
    .line 256
    invoke-virtual {v6}, Lcom/zykj/evaluation/ui/detail/c;->k()Li6/p0;

    .line 257
    .line 258
    .line 259
    move-result-object v7

    .line 260
    instance-of v7, v7, Li6/p0$a;

    .line 261
    .line 262
    if-eqz v7, :cond_5

    .line 263
    .line 264
    :cond_8
    new-instance v14, Lcom/zykj/evaluation/bean/UploadData;

    .line 265
    .line 266
    invoke-virtual {v6}, Lcom/zykj/evaluation/ui/detail/c;->l()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v15

    .line 270
    invoke-virtual {v6}, Lcom/zykj/evaluation/ui/detail/c;->c()Ljava/util/List;

    .line 271
    .line 272
    .line 273
    move-result-object v6

    .line 274
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v6

    .line 278
    check-cast v6, Ljava/lang/String;

    .line 279
    .line 280
    if-nez v6, :cond_9

    .line 281
    .line 282
    const-string v6, ""

    .line 283
    .line 284
    :cond_9
    move-object/from16 v16, v6

    .line 285
    .line 286
    sget-object v6, Lm5/e$c;->b:Lm5/e$c;

    .line 287
    .line 288
    invoke-virtual {v6}, Lm5/e;->a()I

    .line 289
    .line 290
    .line 291
    move-result v18

    .line 292
    const/16 v19, 0x4

    .line 293
    .line 294
    const/16 v20, 0x0

    .line 295
    .line 296
    const/16 v17, 0x0

    .line 297
    .line 298
    invoke-direct/range {v14 .. v20}, Lcom/zykj/evaluation/bean/UploadData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v4, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    goto/16 :goto_3

    .line 305
    .line 306
    :cond_a
    new-instance v5, Ljava/util/ArrayList;

    .line 307
    .line 308
    const/16 v6, 0xa

    .line 309
    .line 310
    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 311
    .line 312
    .line 313
    move-result v6

    .line 314
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 318
    .line 319
    .line 320
    move-result v6

    .line 321
    const/4 v8, 0x0

    .line 322
    :goto_4
    if-ge v8, v6, :cond_e

    .line 323
    .line 324
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v10

    .line 328
    add-int/lit8 v8, v8, 0x1

    .line 329
    .line 330
    check-cast v10, Lcom/zykj/evaluation/bean/UploadData;

    .line 331
    .line 332
    if-eqz v1, :cond_d

    .line 333
    .line 334
    invoke-virtual {v1}, Ln5/o;->c()Ljava/util/List;

    .line 335
    .line 336
    .line 337
    move-result-object v14

    .line 338
    if-eqz v14, :cond_d

    .line 339
    .line 340
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 341
    .line 342
    .line 343
    move-result-object v14

    .line 344
    :cond_b
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 345
    .line 346
    .line 347
    move-result v15

    .line 348
    if-eqz v15, :cond_c

    .line 349
    .line 350
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v15

    .line 354
    move-object/from16 v16, v15

    .line 355
    .line 356
    check-cast v16, Lcom/zykj/evaluation/bean/UploadData;

    .line 357
    .line 358
    invoke-virtual/range {v16 .. v16}, Lcom/zykj/evaluation/bean/UploadData;->getUuid()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v7

    .line 362
    invoke-virtual {v10}, Lcom/zykj/evaluation/bean/UploadData;->getUuid()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v9

    .line 366
    invoke-static {v7, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 367
    .line 368
    .line 369
    move-result v7

    .line 370
    if-eqz v7, :cond_b

    .line 371
    .line 372
    move-object v9, v15

    .line 373
    goto :goto_5

    .line 374
    :cond_c
    const/4 v9, 0x0

    .line 375
    :goto_5
    check-cast v9, Lcom/zykj/evaluation/bean/UploadData;

    .line 376
    .line 377
    if-eqz v9, :cond_d

    .line 378
    .line 379
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/UploadData;->getLocalPath()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v7

    .line 383
    invoke-virtual {v10}, Lcom/zykj/evaluation/bean/UploadData;->getLocalPath()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v14

    .line 387
    invoke-static {v7, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    move-result v7

    .line 391
    if-eqz v7, :cond_d

    .line 392
    .line 393
    move-object v10, v9

    .line 394
    :cond_d
    invoke-interface {v5, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    goto :goto_4

    .line 398
    :cond_e
    new-instance v6, Landroidx/collection/ArrayMap;

    .line 399
    .line 400
    invoke-direct {v6}, Landroidx/collection/ArrayMap;-><init>()V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->x()Lw5/e;

    .line 404
    .line 405
    .line 406
    move-result-object v7

    .line 407
    invoke-virtual {v7}, Lw5/e;->d()Ljava/util/List;

    .line 408
    .line 409
    .line 410
    move-result-object v7

    .line 411
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 412
    .line 413
    .line 414
    move-result-object v7

    .line 415
    :goto_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 416
    .line 417
    .line 418
    move-result v8

    .line 419
    if-eqz v8, :cond_15

    .line 420
    .line 421
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v8

    .line 425
    check-cast v8, Lcom/zykj/evaluation/ui/detail/c;

    .line 426
    .line 427
    invoke-virtual {v8}, Lcom/zykj/evaluation/ui/detail/c;->h()J

    .line 428
    .line 429
    .line 430
    move-result-wide v9

    .line 431
    invoke-static {v9, v10}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 432
    .line 433
    .line 434
    move-result-object v9

    .line 435
    invoke-virtual {v6, v9}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v9

    .line 439
    if-nez v9, :cond_f

    .line 440
    .line 441
    invoke-virtual {v8}, Lcom/zykj/evaluation/ui/detail/c;->h()J

    .line 442
    .line 443
    .line 444
    move-result-wide v9

    .line 445
    invoke-static {v9, v10}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 446
    .line 447
    .line 448
    move-result-object v9

    .line 449
    new-instance v10, Ljava/util/ArrayList;

    .line 450
    .line 451
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 452
    .line 453
    .line 454
    invoke-interface {v6, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    :cond_f
    invoke-virtual {v8}, Lcom/zykj/evaluation/ui/detail/c;->h()J

    .line 458
    .line 459
    .line 460
    move-result-wide v9

    .line 461
    invoke-static {v9, v10}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 462
    .line 463
    .line 464
    move-result-object v9

    .line 465
    invoke-virtual {v6, v9}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v9

    .line 469
    check-cast v9, Ljava/util/ArrayList;

    .line 470
    .line 471
    if-eqz v9, :cond_14

    .line 472
    .line 473
    invoke-virtual {v8}, Lcom/zykj/evaluation/ui/detail/c;->l()Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v10

    .line 477
    invoke-virtual {v8}, Lcom/zykj/evaluation/ui/detail/c;->e()Lcom/zykj/evaluation/ui/detail/e;

    .line 478
    .line 479
    .line 480
    move-result-object v14

    .line 481
    invoke-virtual {v14}, Lcom/zykj/evaluation/ui/detail/e;->b()I

    .line 482
    .line 483
    .line 484
    move-result v14

    .line 485
    invoke-virtual {v8}, Lcom/zykj/evaluation/ui/detail/c;->h()J

    .line 486
    .line 487
    .line 488
    move-result-wide v17

    .line 489
    invoke-static/range {v17 .. v18}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 490
    .line 491
    .line 492
    move-result-object v15

    .line 493
    invoke-virtual {v3, v15}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v15

    .line 497
    check-cast v15, Ljava/util/ArrayList;

    .line 498
    .line 499
    if-eqz v15, :cond_12

    .line 500
    .line 501
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 502
    .line 503
    .line 504
    move-result v13

    .line 505
    move-object/from16 v18, v1

    .line 506
    .line 507
    const/4 v1, 0x0

    .line 508
    :goto_7
    if-ge v1, v13, :cond_11

    .line 509
    .line 510
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v19

    .line 514
    add-int/lit8 v1, v1, 0x1

    .line 515
    .line 516
    move-object/from16 v20, v19

    .line 517
    .line 518
    check-cast v20, Lcom/zykj/evaluation/bean/CommitAnswer;

    .line 519
    .line 520
    move/from16 v21, v1

    .line 521
    .line 522
    invoke-virtual/range {v20 .. v20}, Lcom/zykj/evaluation/bean/CommitAnswer;->getUuid()Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object v1

    .line 526
    move-object/from16 v20, v3

    .line 527
    .line 528
    invoke-virtual {v8}, Lcom/zykj/evaluation/ui/detail/c;->l()Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v3

    .line 532
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 533
    .line 534
    .line 535
    move-result v1

    .line 536
    if-eqz v1, :cond_10

    .line 537
    .line 538
    goto :goto_8

    .line 539
    :cond_10
    move-object/from16 v3, v20

    .line 540
    .line 541
    move/from16 v1, v21

    .line 542
    .line 543
    goto :goto_7

    .line 544
    :cond_11
    move-object/from16 v20, v3

    .line 545
    .line 546
    const/16 v19, 0x0

    .line 547
    .line 548
    :goto_8
    check-cast v19, Lcom/zykj/evaluation/bean/CommitAnswer;

    .line 549
    .line 550
    if-eqz v19, :cond_13

    .line 551
    .line 552
    invoke-virtual/range {v19 .. v19}, Lcom/zykj/evaluation/bean/CommitAnswer;->getAnswers()Ljava/util/List;

    .line 553
    .line 554
    .line 555
    move-result-object v1

    .line 556
    if-eqz v1, :cond_13

    .line 557
    .line 558
    goto :goto_9

    .line 559
    :cond_12
    move-object/from16 v18, v1

    .line 560
    .line 561
    move-object/from16 v20, v3

    .line 562
    .line 563
    :cond_13
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 564
    .line 565
    .line 566
    move-result-object v1

    .line 567
    :goto_9
    new-instance v3, Lcom/zykj/evaluation/bean/SelfCorrectResult;

    .line 568
    .line 569
    invoke-direct {v3, v10, v14, v1}, Lcom/zykj/evaluation/bean/SelfCorrectResult;-><init>(Ljava/lang/String;ILjava/util/List;)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 573
    .line 574
    .line 575
    move-result v1

    .line 576
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 577
    .line 578
    .line 579
    goto :goto_a

    .line 580
    :cond_14
    move-object/from16 v18, v1

    .line 581
    .line 582
    move-object/from16 v20, v3

    .line 583
    .line 584
    :goto_a
    move-object/from16 v1, v18

    .line 585
    .line 586
    move-object/from16 v3, v20

    .line 587
    .line 588
    const/4 v13, 0x2

    .line 589
    goto/16 :goto_6

    .line 590
    .line 591
    :cond_15
    move-object/from16 v18, v1

    .line 592
    .line 593
    move-object/from16 v20, v3

    .line 594
    .line 595
    new-instance v1, Ljava/util/ArrayList;

    .line 596
    .line 597
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 598
    .line 599
    .line 600
    invoke-virtual {v6}, Landroidx/collection/ArrayMap;->keySet()Ljava/util/Set;

    .line 601
    .line 602
    .line 603
    move-result-object v3

    .line 604
    check-cast v3, Ljava/lang/Iterable;

    .line 605
    .line 606
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 607
    .line 608
    .line 609
    move-result-object v3

    .line 610
    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 611
    .line 612
    .line 613
    move-result v7

    .line 614
    if-eqz v7, :cond_17

    .line 615
    .line 616
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v7

    .line 620
    check-cast v7, Ljava/lang/Long;

    .line 621
    .line 622
    new-instance v21, Lcom/zykj/evaluation/bean/CommitSelfCorrectReq;

    .line 623
    .line 624
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->N()J

    .line 625
    .line 626
    .line 627
    move-result-wide v22

    .line 628
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 629
    .line 630
    .line 631
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 632
    .line 633
    .line 634
    move-result-wide v24

    .line 635
    invoke-virtual {v6, v7}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v7

    .line 639
    check-cast v7, Ljava/util/ArrayList;

    .line 640
    .line 641
    if-eqz v7, :cond_16

    .line 642
    .line 643
    :goto_c
    move-object/from16 v26, v7

    .line 644
    .line 645
    goto :goto_d

    .line 646
    :cond_16
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 647
    .line 648
    .line 649
    move-result-object v7

    .line 650
    goto :goto_c

    .line 651
    :goto_d
    invoke-direct/range {v21 .. v26}, Lcom/zykj/evaluation/bean/CommitSelfCorrectReq;-><init>(JJLjava/util/List;)V

    .line 652
    .line 653
    .line 654
    move-object/from16 v7, v21

    .line 655
    .line 656
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 657
    .line 658
    .line 659
    goto :goto_b

    .line 660
    :cond_17
    iget-object v3, v0, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;->z:Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 661
    .line 662
    iget-object v7, v0, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 663
    .line 664
    invoke-interface {v7}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object v7

    .line 668
    check-cast v7, Lcom/zykj/message/server/bean/UserInfo;

    .line 669
    .line 670
    invoke-virtual {v7}, Lcom/zykj/message/server/bean/UserInfo;->a()Ljava/lang/Long;

    .line 671
    .line 672
    .line 673
    move-result-object v7

    .line 674
    invoke-static {v7, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    .line 678
    .line 679
    .line 680
    move-result-wide v7

    .line 681
    move-object v9, v4

    .line 682
    move-object v10, v5

    .line 683
    move-wide v4, v7

    .line 684
    move-object v8, v6

    .line 685
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->N()J

    .line 686
    .line 687
    .line 688
    move-result-wide v6

    .line 689
    sget-object v12, Lcom/zykj/evaluation/bean/TaskState$ToCorrect;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$ToCorrect;

    .line 690
    .line 691
    invoke-virtual {v12}, Lcom/zykj/evaluation/bean/TaskState;->getState()I

    .line 692
    .line 693
    .line 694
    move-result v12

    .line 695
    move-object v13, v9

    .line 696
    move-object v14, v10

    .line 697
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->Q()J

    .line 698
    .line 699
    .line 700
    move-result-wide v9

    .line 701
    invoke-static/range {v18 .. v18}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 702
    .line 703
    .line 704
    move-result-object v15

    .line 705
    iput-object v15, v11, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$commitAnswer$1;->a:Ljava/lang/Object;

    .line 706
    .line 707
    invoke-static/range {v20 .. v20}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 708
    .line 709
    .line 710
    move-result-object v15

    .line 711
    iput-object v15, v11, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$commitAnswer$1;->b:Ljava/lang/Object;

    .line 712
    .line 713
    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 714
    .line 715
    .line 716
    move-result-object v13

    .line 717
    iput-object v13, v11, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$commitAnswer$1;->c:Ljava/lang/Object;

    .line 718
    .line 719
    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 720
    .line 721
    .line 722
    move-result-object v13

    .line 723
    iput-object v13, v11, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$commitAnswer$1;->d:Ljava/lang/Object;

    .line 724
    .line 725
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    move-result-object v8

    .line 729
    iput-object v8, v11, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$commitAnswer$1;->e:Ljava/lang/Object;

    .line 730
    .line 731
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 732
    .line 733
    .line 734
    move-result-object v8

    .line 735
    iput-object v8, v11, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$commitAnswer$1;->f:Ljava/lang/Object;

    .line 736
    .line 737
    const/4 v8, 0x2

    .line 738
    iput v8, v11, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$commitAnswer$1;->i:I

    .line 739
    .line 740
    move-object v13, v11

    .line 741
    move v8, v12

    .line 742
    move-object v11, v14

    .line 743
    move-object v12, v1

    .line 744
    invoke-virtual/range {v3 .. v13}, Lcom/zykj/evaluation/upload/OssTaskManger;->s(JJIJLjava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    move-result-object v1

    .line 748
    if-ne v1, v2, :cond_18

    .line 749
    .line 750
    :goto_e
    return-object v2

    .line 751
    :cond_18
    :goto_f
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 752
    .line 753
    return-object v1
.end method

.method public final O0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$getLocalCorrectResultMap$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$getLocalCorrectResultMap$2;-><init>(Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;Lkotlin/coroutines/Continuation;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p1}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-ne p1, v0, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p1
.end method

.method public final P0(IJLcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;Ljava/util/List;Lcom/zykj/evaluation/bean/DetailAnswerInfo;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 32

    .line 1
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getQstType()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    move/from16 v1, p1

    .line 6
    .line 7
    invoke-static {v0, v1}, Lw5/h;->a(II)Li6/p0;

    .line 8
    .line 9
    .line 10
    move-result-object v5

    .line 11
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getDisplayNumber()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const-string v0, ""

    .line 18
    .line 19
    :cond_0
    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    move-object/from16 v6, p5

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object v6, v0

    .line 29
    :goto_0
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getQuestionId()J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 38
    .line 39
    .line 40
    move-result-wide v1

    .line 41
    const-wide/16 v3, 0x0

    .line 42
    .line 43
    cmp-long v1, v1, v3

    .line 44
    .line 45
    const/4 v15, 0x0

    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move-object v0, v15

    .line 50
    :goto_1
    if-eqz v0, :cond_3

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 53
    .line 54
    .line 55
    move-result-wide v0

    .line 56
    goto :goto_2

    .line 57
    :cond_3
    move-wide/from16 v0, p2

    .line 58
    .line 59
    :goto_2
    new-instance v16, Lcom/zykj/evaluation/ui/detail/c;

    .line 60
    .line 61
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getQuestionId()J

    .line 62
    .line 63
    .line 64
    move-result-wide v2

    .line 65
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    const/16 v13, 0x3f0

    .line 70
    .line 71
    const/4 v14, 0x0

    .line 72
    const/4 v7, 0x0

    .line 73
    const/4 v8, 0x0

    .line 74
    const/4 v9, 0x0

    .line 75
    const/4 v10, 0x0

    .line 76
    const/4 v11, 0x0

    .line 77
    const/4 v12, 0x0

    .line 78
    move-wide/from16 v30, v0

    .line 79
    .line 80
    move-object/from16 v1, v16

    .line 81
    .line 82
    invoke-direct/range {v1 .. v14}, Lcom/zykj/evaluation/ui/detail/c;-><init>(JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getOptions()Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    const/16 v1, 0xa

    .line 90
    .line 91
    if-eqz v0, :cond_6

    .line 92
    .line 93
    new-instance v2, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 100
    .line 101
    .line 102
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-eqz v3, :cond_5

    .line 111
    .line 112
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    move-object v7, v3

    .line 117
    check-cast v7, Ljava/lang/String;

    .line 118
    .line 119
    new-instance v6, Lw5/b;

    .line 120
    .line 121
    move-object/from16 v3, p6

    .line 122
    .line 123
    invoke-interface {v3, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    if-eqz v4, :cond_4

    .line 128
    .line 129
    sget-object v4, Lw5/a$a;->c:Lw5/a$a;

    .line 130
    .line 131
    :goto_4
    move-object v8, v4

    .line 132
    goto :goto_5

    .line 133
    :cond_4
    sget-object v4, Lw5/a$b;->c:Lw5/a$b;

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :goto_5
    const/4 v10, 0x4

    .line 137
    const/4 v11, 0x0

    .line 138
    const/4 v9, 0x0

    .line 139
    invoke-direct/range {v6 .. v11}, Lw5/b;-><init>(Ljava/lang/String;Lw5/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 140
    .line 141
    .line 142
    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_5
    move-object/from16 v3, p6

    .line 147
    .line 148
    :goto_6
    move-object/from16 v0, p0

    .line 149
    .line 150
    move-object/from16 v22, v2

    .line 151
    .line 152
    goto :goto_7

    .line 153
    :cond_6
    move-object/from16 v3, p6

    .line 154
    .line 155
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    goto :goto_6

    .line 160
    :goto_7
    iget-object v2, v0, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;->B:Landroidx/collection/ArrayMap;

    .line 161
    .line 162
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-virtual {v2, v4}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    check-cast v2, Ljava/lang/Integer;

    .line 171
    .line 172
    if-eqz v2, :cond_7

    .line 173
    .line 174
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    goto :goto_8

    .line 179
    :cond_7
    if-eqz p7, :cond_8

    .line 180
    .line 181
    invoke-virtual/range {p7 .. p7}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getResult()I

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 186
    .line 187
    .line 188
    move-result-object v15

    .line 189
    :cond_8
    if-eqz v15, :cond_9

    .line 190
    .line 191
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    goto :goto_8

    .line 196
    :cond_9
    const/4 v2, -0x1

    .line 197
    :goto_8
    sget-object v4, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->RIGHT:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    .line 198
    .line 199
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 200
    .line 201
    .line 202
    move-result v6

    .line 203
    if-le v2, v6, :cond_c

    .line 204
    .line 205
    instance-of v6, v5, Li6/p0$c$a;

    .line 206
    .line 207
    if-nez v6, :cond_a

    .line 208
    .line 209
    instance-of v5, v5, Li6/p0$a;

    .line 210
    .line 211
    if-eqz v5, :cond_b

    .line 212
    .line 213
    :cond_a
    move-wide/from16 v7, v30

    .line 214
    .line 215
    goto :goto_a

    .line 216
    :cond_b
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->K()Lg7/e;

    .line 217
    .line 218
    .line 219
    move-result-object v5

    .line 220
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v6

    .line 224
    move-wide/from16 v7, v30

    .line 225
    .line 226
    invoke-virtual {v5, v7, v8, v6}, Lg7/e;->k(JLjava/lang/String;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    :goto_9
    move-object/from16 v24, v5

    .line 231
    .line 232
    goto :goto_b

    .line 233
    :goto_a
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->K()Lg7/e;

    .line 234
    .line 235
    .line 236
    move-result-object v5

    .line 237
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v6

    .line 241
    invoke-virtual {v5, v7, v8, v6}, Lg7/e;->l(JLjava/lang/String;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v5

    .line 245
    goto :goto_9

    .line 246
    :goto_b
    const/16 v28, 0x38f

    .line 247
    .line 248
    const/16 v29, 0x0

    .line 249
    .line 250
    const-wide/16 v17, 0x0

    .line 251
    .line 252
    const/16 v19, 0x0

    .line 253
    .line 254
    const/16 v20, 0x0

    .line 255
    .line 256
    const/16 v21, 0x0

    .line 257
    .line 258
    const/16 v25, 0x0

    .line 259
    .line 260
    const/16 v26, 0x0

    .line 261
    .line 262
    const/16 v27, 0x0

    .line 263
    .line 264
    move-object/from16 v23, v3

    .line 265
    .line 266
    invoke-static/range {v16 .. v29}, Lcom/zykj/evaluation/ui/detail/c;->b(Lcom/zykj/evaluation/ui/detail/c;JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/c;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    move-object/from16 v5, p8

    .line 271
    .line 272
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    :cond_c
    if-eqz p7, :cond_d

    .line 276
    .line 277
    invoke-virtual/range {p7 .. p7}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getExamAnswers()Ljava/util/List;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    if-nez v3, :cond_e

    .line 282
    .line 283
    :cond_d
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    :cond_e
    const/4 v5, 0x0

    .line 288
    if-eqz p7, :cond_f

    .line 289
    .line 290
    invoke-virtual/range {p7 .. p7}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getResult()I

    .line 291
    .line 292
    .line 293
    move-result v6

    .line 294
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 295
    .line 296
    .line 297
    move-result v4

    .line 298
    if-ne v6, v4, :cond_f

    .line 299
    .line 300
    const/4 v5, 0x1

    .line 301
    :cond_f
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getOptions()Ljava/util/List;

    .line 302
    .line 303
    .line 304
    move-result-object v4

    .line 305
    if-eqz v4, :cond_13

    .line 306
    .line 307
    new-instance v6, Ljava/util/ArrayList;

    .line 308
    .line 309
    invoke-static {v4, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    invoke-direct {v6, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 314
    .line 315
    .line 316
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 321
    .line 322
    .line 323
    move-result v4

    .line 324
    if-eqz v4, :cond_12

    .line 325
    .line 326
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v4

    .line 330
    check-cast v4, Ljava/lang/String;

    .line 331
    .line 332
    new-instance v7, Lw5/b;

    .line 333
    .line 334
    invoke-interface {v3, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    move-result v8

    .line 338
    if-eqz v8, :cond_11

    .line 339
    .line 340
    if-eqz v5, :cond_10

    .line 341
    .line 342
    sget-object v8, Lw5/a$d;->c:Lw5/a$d;

    .line 343
    .line 344
    goto :goto_d

    .line 345
    :cond_10
    sget-object v8, Lw5/a$c;->c:Lw5/a$c;

    .line 346
    .line 347
    goto :goto_d

    .line 348
    :cond_11
    sget-object v8, Lw5/a$b;->c:Lw5/a$b;

    .line 349
    .line 350
    :goto_d
    const/4 v9, 0x4

    .line 351
    const/4 v10, 0x0

    .line 352
    const/4 v11, 0x0

    .line 353
    move-object/from16 p2, v4

    .line 354
    .line 355
    move-object/from16 p1, v7

    .line 356
    .line 357
    move-object/from16 p3, v8

    .line 358
    .line 359
    move/from16 p5, v9

    .line 360
    .line 361
    move-object/from16 p6, v10

    .line 362
    .line 363
    move/from16 p4, v11

    .line 364
    .line 365
    invoke-direct/range {p1 .. p6}, Lw5/b;-><init>(Ljava/lang/String;Lw5/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 366
    .line 367
    .line 368
    move-object/from16 v4, p1

    .line 369
    .line 370
    invoke-interface {v6, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    goto :goto_c

    .line 374
    :cond_12
    :goto_e
    move-object/from16 v22, v6

    .line 375
    .line 376
    goto :goto_f

    .line 377
    :cond_13
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 378
    .line 379
    .line 380
    move-result-object v6

    .line 381
    goto :goto_e

    .line 382
    :goto_f
    sget-object v1, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->RIGHT:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    .line 383
    .line 384
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 385
    .line 386
    .line 387
    move-result v1

    .line 388
    if-ne v2, v1, :cond_14

    .line 389
    .line 390
    sget-object v1, Lcom/zykj/evaluation/ui/detail/e$d;->d:Lcom/zykj/evaluation/ui/detail/e$d;

    .line 391
    .line 392
    :goto_10
    move-object/from16 v27, v1

    .line 393
    .line 394
    goto :goto_11

    .line 395
    :cond_14
    sget-object v1, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->ERROR:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    .line 396
    .line 397
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 398
    .line 399
    .line 400
    move-result v1

    .line 401
    if-ne v2, v1, :cond_15

    .line 402
    .line 403
    sget-object v1, Lcom/zykj/evaluation/ui/detail/e$a;->d:Lcom/zykj/evaluation/ui/detail/e$a;

    .line 404
    .line 405
    goto :goto_10

    .line 406
    :cond_15
    sget-object v1, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->REVISING_RIGHT:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    .line 407
    .line 408
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 409
    .line 410
    .line 411
    move-result v1

    .line 412
    if-ne v2, v1, :cond_16

    .line 413
    .line 414
    sget-object v1, Lcom/zykj/evaluation/ui/detail/e$a;->d:Lcom/zykj/evaluation/ui/detail/e$a;

    .line 415
    .line 416
    goto :goto_10

    .line 417
    :cond_16
    sget-object v1, Lcom/zykj/evaluation/ui/detail/e$b;->d:Lcom/zykj/evaluation/ui/detail/e$b;

    .line 418
    .line 419
    goto :goto_10

    .line 420
    :goto_11
    const/16 v28, 0x1cf

    .line 421
    .line 422
    const/16 v29, 0x0

    .line 423
    .line 424
    const-wide/16 v17, 0x0

    .line 425
    .line 426
    const/16 v19, 0x0

    .line 427
    .line 428
    const/16 v20, 0x0

    .line 429
    .line 430
    const/16 v21, 0x0

    .line 431
    .line 432
    const/16 v24, 0x0

    .line 433
    .line 434
    const/16 v25, 0x0

    .line 435
    .line 436
    const/16 v26, 0x0

    .line 437
    .line 438
    move-object/from16 v23, v3

    .line 439
    .line 440
    invoke-static/range {v16 .. v29}, Lcom/zykj/evaluation/ui/detail/c;->b(Lcom/zykj/evaluation/ui/detail/c;JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/c;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    move-object/from16 v2, p9

    .line 445
    .line 446
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 447
    .line 448
    .line 449
    return-void
.end method

.method public final Q0(IJLcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/util/Map;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 18

    .line 1
    invoke-interface/range {p6 .. p6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

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
    move-result v3

    .line 39
    const/4 v4, 0x1

    .line 40
    if-ne v3, v4, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move-object v1, v2

    .line 44
    :goto_0
    check-cast v1, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 45
    .line 46
    if-nez v1, :cond_2

    .line 47
    .line 48
    invoke-static/range {p6 .. p6}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    move-object v1, v0

    .line 53
    check-cast v1, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 54
    .line 55
    :cond_2
    new-instance v3, Lcom/zykj/evaluation/ui/detail/c;

    .line 56
    .line 57
    if-eqz p4, :cond_3

    .line 58
    .line 59
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getQuestionId()J

    .line 60
    .line 61
    .line 62
    move-result-wide v4

    .line 63
    goto :goto_1

    .line 64
    :cond_3
    move-wide/from16 v4, p2

    .line 65
    .line 66
    :goto_1
    const-string v0, ""

    .line 67
    .line 68
    if-eqz p4, :cond_4

    .line 69
    .line 70
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    if-nez v6, :cond_5

    .line 75
    .line 76
    :cond_4
    move-object v6, v0

    .line 77
    :cond_5
    sget-object v7, Li6/p0$c$a;->b:Li6/p0$c$a;

    .line 78
    .line 79
    invoke-virtual {v7}, Li6/p0;->a()I

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    move/from16 v8, p1

    .line 84
    .line 85
    invoke-static {v7, v8}, Lw5/h;->a(II)Li6/p0;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    const/16 v15, 0x3f8

    .line 90
    .line 91
    const/16 v16, 0x0

    .line 92
    .line 93
    const/4 v8, 0x0

    .line 94
    const/4 v9, 0x0

    .line 95
    const/4 v10, 0x0

    .line 96
    const/4 v11, 0x0

    .line 97
    const/4 v12, 0x0

    .line 98
    const/4 v13, 0x0

    .line 99
    const/4 v14, 0x0

    .line 100
    invoke-direct/range {v3 .. v16}, Lcom/zykj/evaluation/ui/detail/c;-><init>(JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 101
    .line 102
    .line 103
    if-eqz p4, :cond_7

    .line 104
    .line 105
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    if-eqz v4, :cond_7

    .line 110
    .line 111
    move-object/from16 v5, p0

    .line 112
    .line 113
    iget-object v6, v5, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;->B:Landroidx/collection/ArrayMap;

    .line 114
    .line 115
    invoke-virtual {v6, v4}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    check-cast v4, Ljava/lang/Integer;

    .line 120
    .line 121
    if-nez v4, :cond_6

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_6
    move-object v2, v4

    .line 125
    goto :goto_3

    .line 126
    :cond_7
    move-object/from16 v5, p0

    .line 127
    .line 128
    :goto_2
    if-eqz v1, :cond_8

    .line 129
    .line 130
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getResult()I

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    :cond_8
    :goto_3
    sget-object v17, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->ERROR:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    .line 139
    .line 140
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    if-nez v2, :cond_9

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_9
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    if-eq v6, v4, :cond_c

    .line 152
    .line 153
    :goto_4
    sget-object v4, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->REVISING_RIGHT:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    .line 154
    .line 155
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    if-nez v2, :cond_b

    .line 160
    .line 161
    :cond_a
    move-object v4, v3

    .line 162
    goto :goto_9

    .line 163
    :cond_b
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    if-ne v6, v4, :cond_a

    .line 168
    .line 169
    :cond_c
    if-eqz p4, :cond_e

    .line 170
    .line 171
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    if-eqz v4, :cond_e

    .line 176
    .line 177
    move-object/from16 v6, p5

    .line 178
    .line 179
    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    check-cast v4, Ljava/util/List;

    .line 184
    .line 185
    if-nez v4, :cond_d

    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_d
    :goto_5
    move-object v10, v4

    .line 189
    goto :goto_7

    .line 190
    :cond_e
    :goto_6
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 191
    .line 192
    .line 193
    move-result-object v4

    .line 194
    goto :goto_5

    .line 195
    :goto_7
    invoke-virtual {v5}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->K()Lg7/e;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    if-eqz p4, :cond_10

    .line 200
    .line 201
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v6

    .line 205
    if-nez v6, :cond_f

    .line 206
    .line 207
    goto :goto_8

    .line 208
    :cond_f
    move-object v0, v6

    .line 209
    :cond_10
    :goto_8
    move-wide/from16 v6, p2

    .line 210
    .line 211
    invoke-virtual {v4, v6, v7, v0}, Lg7/e;->l(JLjava/lang/String;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v11

    .line 215
    const/16 v15, 0x39f

    .line 216
    .line 217
    const/16 v16, 0x0

    .line 218
    .line 219
    const-wide/16 v4, 0x0

    .line 220
    .line 221
    const/4 v6, 0x0

    .line 222
    const/4 v7, 0x0

    .line 223
    const/4 v8, 0x0

    .line 224
    const/4 v9, 0x0

    .line 225
    const/4 v12, 0x0

    .line 226
    const/4 v13, 0x0

    .line 227
    const/4 v14, 0x0

    .line 228
    invoke-static/range {v3 .. v16}, Lcom/zykj/evaluation/ui/detail/c;->b(Lcom/zykj/evaluation/ui/detail/c;JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/c;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    move-object v4, v3

    .line 233
    move-object/from16 v3, p7

    .line 234
    .line 235
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    :goto_9
    if-eqz v1, :cond_12

    .line 239
    .line 240
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->getExamAnswers()Ljava/util/List;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    if-nez v0, :cond_11

    .line 245
    .line 246
    goto :goto_b

    .line 247
    :cond_11
    :goto_a
    move-object v10, v0

    .line 248
    goto :goto_c

    .line 249
    :cond_12
    :goto_b
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    goto :goto_a

    .line 254
    :goto_c
    sget-object v0, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->RIGHT:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    .line 255
    .line 256
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    if-nez v2, :cond_13

    .line 261
    .line 262
    goto :goto_e

    .line 263
    :cond_13
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    if-ne v1, v0, :cond_14

    .line 268
    .line 269
    sget-object v0, Lcom/zykj/evaluation/ui/detail/e$d;->d:Lcom/zykj/evaluation/ui/detail/e$d;

    .line 270
    .line 271
    :goto_d
    move-object v14, v0

    .line 272
    goto :goto_11

    .line 273
    :cond_14
    :goto_e
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    if-nez v2, :cond_15

    .line 278
    .line 279
    goto :goto_f

    .line 280
    :cond_15
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    if-ne v1, v0, :cond_16

    .line 285
    .line 286
    sget-object v0, Lcom/zykj/evaluation/ui/detail/e$a;->d:Lcom/zykj/evaluation/ui/detail/e$a;

    .line 287
    .line 288
    goto :goto_d

    .line 289
    :cond_16
    :goto_f
    sget-object v0, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->REVISING_RIGHT:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    .line 290
    .line 291
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    if-nez v2, :cond_17

    .line 296
    .line 297
    goto :goto_10

    .line 298
    :cond_17
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    if-ne v1, v0, :cond_18

    .line 303
    .line 304
    sget-object v0, Lcom/zykj/evaluation/ui/detail/e$a;->d:Lcom/zykj/evaluation/ui/detail/e$a;

    .line 305
    .line 306
    goto :goto_d

    .line 307
    :cond_18
    :goto_10
    sget-object v0, Lcom/zykj/evaluation/ui/detail/e$b;->d:Lcom/zykj/evaluation/ui/detail/e$b;

    .line 308
    .line 309
    goto :goto_d

    .line 310
    :goto_11
    const/16 v15, 0x1df

    .line 311
    .line 312
    const/16 v16, 0x0

    .line 313
    .line 314
    move-object v3, v4

    .line 315
    const-wide/16 v4, 0x0

    .line 316
    .line 317
    const/4 v6, 0x0

    .line 318
    const/4 v7, 0x0

    .line 319
    const/4 v8, 0x0

    .line 320
    const/4 v9, 0x0

    .line 321
    const/4 v11, 0x0

    .line 322
    const/4 v12, 0x0

    .line 323
    const/4 v13, 0x0

    .line 324
    invoke-static/range {v3 .. v16}, Lcom/zykj/evaluation/ui/detail/c;->b(Lcom/zykj/evaluation/ui/detail/c;JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/c;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    move-object/from16 v1, p8

    .line 329
    .line 330
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    return-void
.end method

.method public final R0(Ljava/lang/String;Z)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v9, p1

    .line 4
    .line 5
    const-string v1, "uuid"

    .line 6
    .line 7
    invoke-static {v9, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    sget-object v1, Lcom/zykj/evaluation/ui/detail/e$d;->d:Lcom/zykj/evaluation/ui/detail/e$d;

    .line 13
    .line 14
    :goto_0
    move-object v10, v1

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    sget-object v1, Lcom/zykj/evaluation/ui/detail/e$a;->d:Lcom/zykj/evaluation/ui/detail/e$a;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :goto_1
    new-instance v3, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$updateCorrectResult$1;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v3, v1}, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$updateCorrectResult$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    new-instance v4, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$updateCorrectResult$2;

    .line 26
    .line 27
    invoke-direct {v4, v1}, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$updateCorrectResult$2;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 28
    .line 29
    .line 30
    new-instance v6, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$updateCorrectResult$3;

    .line 31
    .line 32
    invoke-direct {v6, v0, v9, v10, v1}, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$updateCorrectResult$3;-><init>(Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/e;Lkotlin/coroutines/Continuation;)V

    .line 33
    .line 34
    .line 35
    const/16 v7, 0x13

    .line 36
    .line 37
    const/4 v8, 0x0

    .line 38
    const/4 v2, 0x0

    .line 39
    const/4 v5, 0x0

    .line 40
    invoke-static/range {v0 .. v8}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->x()Lw5/e;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1}, Lw5/e;->d()Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    new-instance v2, Ljava/util/ArrayList;

    .line 52
    .line 53
    const/16 v3, 0xa

    .line 54
    .line 55
    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_2

    .line 71
    .line 72
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    check-cast v4, Lcom/zykj/evaluation/ui/detail/c;

    .line 77
    .line 78
    invoke-virtual {v4}, Lcom/zykj/evaluation/ui/detail/c;->l()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-eqz v5, :cond_1

    .line 87
    .line 88
    const/16 v22, 0x1ff

    .line 89
    .line 90
    const/16 v23, 0x0

    .line 91
    .line 92
    const-wide/16 v11, 0x0

    .line 93
    .line 94
    const/4 v13, 0x0

    .line 95
    const/4 v14, 0x0

    .line 96
    const/4 v15, 0x0

    .line 97
    const/16 v16, 0x0

    .line 98
    .line 99
    const/16 v17, 0x0

    .line 100
    .line 101
    const/16 v18, 0x0

    .line 102
    .line 103
    const/16 v19, 0x0

    .line 104
    .line 105
    const/16 v20, 0x0

    .line 106
    .line 107
    move-object/from16 v21, v10

    .line 108
    .line 109
    move-object v10, v4

    .line 110
    invoke-static/range {v10 .. v23}, Lcom/zykj/evaluation/ui/detail/c;->b(Lcom/zykj/evaluation/ui/detail/c;JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/c;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    goto :goto_3

    .line 115
    :cond_1
    move-object/from16 v21, v10

    .line 116
    .line 117
    move-object v10, v4

    .line 118
    :goto_3
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-object/from16 v10, v21

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    const/4 v5, 0x0

    .line 134
    :cond_3
    :goto_4
    if-ge v5, v4, :cond_7

    .line 135
    .line 136
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    add-int/lit8 v5, v5, 0x1

    .line 141
    .line 142
    move-object v7, v6

    .line 143
    check-cast v7, Lcom/zykj/evaluation/ui/detail/c;

    .line 144
    .line 145
    invoke-virtual {v7}, Lcom/zykj/evaluation/ui/detail/c;->e()Lcom/zykj/evaluation/ui/detail/e;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    sget-object v8, Lcom/zykj/evaluation/ui/detail/e$a;->d:Lcom/zykj/evaluation/ui/detail/e$a;

    .line 150
    .line 151
    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v6

    .line 155
    if-eqz v6, :cond_3

    .line 156
    .line 157
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->A()Landroidx/collection/ArrayMap;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    invoke-virtual {v7}, Lcom/zykj/evaluation/ui/detail/c;->l()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v8

    .line 165
    invoke-virtual {v6, v8}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    check-cast v6, Ljava/util/List;

    .line 170
    .line 171
    if-nez v6, :cond_4

    .line 172
    .line 173
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    :cond_4
    move-object v14, v6

    .line 178
    invoke-virtual {v7}, Lcom/zykj/evaluation/ui/detail/c;->g()Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object v6

    .line 182
    new-instance v13, Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-static {v6, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 185
    .line 186
    .line 187
    move-result v8

    .line 188
    invoke-direct {v13, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 189
    .line 190
    .line 191
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 196
    .line 197
    .line 198
    move-result v8

    .line 199
    if-eqz v8, :cond_6

    .line 200
    .line 201
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v8

    .line 205
    check-cast v8, Lw5/b;

    .line 206
    .line 207
    new-instance v15, Lw5/b;

    .line 208
    .line 209
    invoke-virtual {v8}, Lw5/b;->d()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v16

    .line 213
    invoke-virtual {v8}, Lw5/b;->d()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v8

    .line 217
    invoke-interface {v14, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v8

    .line 221
    if-eqz v8, :cond_5

    .line 222
    .line 223
    sget-object v8, Lw5/a$a;->c:Lw5/a$a;

    .line 224
    .line 225
    :goto_6
    move-object/from16 v17, v8

    .line 226
    .line 227
    goto :goto_7

    .line 228
    :cond_5
    sget-object v8, Lw5/a$b;->c:Lw5/a$b;

    .line 229
    .line 230
    goto :goto_6

    .line 231
    :goto_7
    const/16 v19, 0x4

    .line 232
    .line 233
    const/16 v20, 0x0

    .line 234
    .line 235
    const/16 v18, 0x0

    .line 236
    .line 237
    invoke-direct/range {v15 .. v20}, Lw5/b;-><init>(Ljava/lang/String;Lw5/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 238
    .line 239
    .line 240
    invoke-interface {v13, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_6
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->K()Lg7/e;

    .line 245
    .line 246
    .line 247
    move-result-object v6

    .line 248
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->Q()J

    .line 249
    .line 250
    .line 251
    move-result-wide v8

    .line 252
    invoke-virtual {v7}, Lcom/zykj/evaluation/ui/detail/c;->l()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v10

    .line 256
    invoke-virtual {v6, v8, v9, v10}, Lg7/e;->l(JLjava/lang/String;)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v15

    .line 260
    sget-object v18, Lcom/zykj/evaluation/ui/detail/e$c;->d:Lcom/zykj/evaluation/ui/detail/e$c;

    .line 261
    .line 262
    const/16 v19, 0x18f

    .line 263
    .line 264
    const/16 v20, 0x0

    .line 265
    .line 266
    const-wide/16 v8, 0x0

    .line 267
    .line 268
    const/4 v10, 0x0

    .line 269
    const/4 v11, 0x0

    .line 270
    const/4 v12, 0x0

    .line 271
    const/16 v16, 0x0

    .line 272
    .line 273
    const/16 v17, 0x0

    .line 274
    .line 275
    invoke-static/range {v7 .. v20}, Lcom/zykj/evaluation/ui/detail/c;->b(Lcom/zykj/evaluation/ui/detail/c;JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/c;

    .line 276
    .line 277
    .line 278
    move-result-object v6

    .line 279
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    goto/16 :goto_4

    .line 283
    .line 284
    :cond_7
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->x()Lw5/e;

    .line 285
    .line 286
    .line 287
    move-result-object v11

    .line 288
    const/16 v24, 0xfd7

    .line 289
    .line 290
    const/16 v25, 0x0

    .line 291
    .line 292
    const/4 v12, 0x0

    .line 293
    const/4 v13, 0x0

    .line 294
    const/4 v14, 0x0

    .line 295
    const/16 v16, 0x0

    .line 296
    .line 297
    const/16 v18, 0x0

    .line 298
    .line 299
    const/16 v19, 0x0

    .line 300
    .line 301
    const/16 v20, 0x0

    .line 302
    .line 303
    const/16 v21, 0x0

    .line 304
    .line 305
    const/16 v22, 0x0

    .line 306
    .line 307
    const/16 v23, 0x0

    .line 308
    .line 309
    move-object/from16 v17, v1

    .line 310
    .line 311
    move-object v15, v2

    .line 312
    invoke-static/range {v11 .. v25}, Lw5/e;->b(Lw5/e;Ljava/util/List;ZZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lw5/e;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    invoke-virtual {v0, v1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->i0(Lw5/e;)V

    .line 317
    .line 318
    .line 319
    return-void
.end method

.method public final S0(Ljava/lang/String;Ljava/util/List;)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v9, p1

    .line 4
    .line 5
    move-object/from16 v10, p2

    .line 6
    .line 7
    const-string v1, "uuid"

    .line 8
    .line 9
    invoke-static {v9, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v1, "localAnswer"

    .line 13
    .line 14
    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    new-instance v3, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$updateLocalAnswer$1;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v3, v1}, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$updateLocalAnswer$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 21
    .line 22
    .line 23
    new-instance v4, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$updateLocalAnswer$2;

    .line 24
    .line 25
    invoke-direct {v4, v1}, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$updateLocalAnswer$2;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 26
    .line 27
    .line 28
    new-instance v6, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$updateLocalAnswer$3;

    .line 29
    .line 30
    invoke-direct {v6, v0, v9, v10, v1}, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$updateLocalAnswer$3;-><init>(Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    .line 31
    .line 32
    .line 33
    const/16 v7, 0x13

    .line 34
    .line 35
    const/4 v8, 0x0

    .line 36
    const/4 v2, 0x0

    .line 37
    const/4 v5, 0x0

    .line 38
    invoke-static/range {v0 .. v8}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->x()Lw5/e;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->x()Lw5/e;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v2}, Lw5/e;->f()Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    new-instance v7, Ljava/util/ArrayList;

    .line 54
    .line 55
    const/16 v3, 0xa

    .line 56
    .line 57
    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    invoke-direct {v7, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 62
    .line 63
    .line 64
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_3

    .line 73
    .line 74
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    check-cast v4, Lcom/zykj/evaluation/ui/detail/c;

    .line 79
    .line 80
    invoke-virtual {v4}, Lcom/zykj/evaluation/ui/detail/c;->l()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    if-eqz v5, :cond_2

    .line 89
    .line 90
    invoke-virtual {v4}, Lcom/zykj/evaluation/ui/detail/c;->g()Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    new-instance v6, Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-static {v5, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 101
    .line 102
    .line 103
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v8

    .line 111
    if-eqz v8, :cond_1

    .line 112
    .line 113
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    move-object v11, v8

    .line 118
    check-cast v11, Lw5/b;

    .line 119
    .line 120
    invoke-virtual {v11}, Lw5/b;->d()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    invoke-interface {v10, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v8

    .line 128
    if-eqz v8, :cond_0

    .line 129
    .line 130
    sget-object v8, Lw5/a$a;->c:Lw5/a$a;

    .line 131
    .line 132
    :goto_2
    move-object v13, v8

    .line 133
    goto :goto_3

    .line 134
    :cond_0
    sget-object v8, Lw5/a$b;->c:Lw5/a$b;

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :goto_3
    const/4 v15, 0x5

    .line 138
    const/16 v16, 0x0

    .line 139
    .line 140
    const/4 v12, 0x0

    .line 141
    const/4 v14, 0x0

    .line 142
    invoke-static/range {v11 .. v16}, Lw5/b;->b(Lw5/b;Ljava/lang/String;Lw5/a;ZILjava/lang/Object;)Lw5/b;

    .line 143
    .line 144
    .line 145
    move-result-object v8

    .line 146
    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_1
    const/16 v22, 0x3cf

    .line 151
    .line 152
    const/16 v23, 0x0

    .line 153
    .line 154
    const-wide/16 v11, 0x0

    .line 155
    .line 156
    const/4 v13, 0x0

    .line 157
    const/4 v14, 0x0

    .line 158
    const/4 v15, 0x0

    .line 159
    const/16 v18, 0x0

    .line 160
    .line 161
    const/16 v19, 0x0

    .line 162
    .line 163
    const/16 v20, 0x0

    .line 164
    .line 165
    const/16 v21, 0x0

    .line 166
    .line 167
    move-object/from16 v16, v6

    .line 168
    .line 169
    move-object/from16 v17, v10

    .line 170
    .line 171
    move-object v10, v4

    .line 172
    invoke-static/range {v10 .. v23}, Lcom/zykj/evaluation/ui/detail/c;->b(Lcom/zykj/evaluation/ui/detail/c;JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/c;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    goto :goto_4

    .line 177
    :cond_2
    move-object v10, v4

    .line 178
    :goto_4
    invoke-interface {v7, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-object/from16 v10, p2

    .line 182
    .line 183
    goto :goto_0

    .line 184
    :cond_3
    const/16 v14, 0xfdf

    .line 185
    .line 186
    const/4 v15, 0x0

    .line 187
    const/4 v2, 0x0

    .line 188
    const/4 v3, 0x0

    .line 189
    const/4 v4, 0x0

    .line 190
    const/4 v5, 0x0

    .line 191
    const/4 v6, 0x0

    .line 192
    const/4 v8, 0x0

    .line 193
    const/4 v9, 0x0

    .line 194
    const/4 v10, 0x0

    .line 195
    const/4 v11, 0x0

    .line 196
    const/4 v12, 0x0

    .line 197
    const/4 v13, 0x0

    .line 198
    invoke-static/range {v1 .. v15}, Lw5/e;->b(Lw5/e;Ljava/util/List;ZZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lw5/e;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-virtual {v0, v1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->i0(Lw5/e;)V

    .line 203
    .line 204
    .line 205
    return-void
.end method

.method public final T0(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$updateLocalCorrectResultMap$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, p2, v2}, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$updateLocalCorrectResultMap$2;-><init>(Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;Ljava/lang/String;ILkotlin/coroutines/Continuation;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p3}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    if-ne p1, p2, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p1
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
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;->w:Lkotlinx/coroutines/flow/MutableStateFlow;

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
    const/16 v18, 0x1

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
    new-instance v6, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$initData$1;

    .line 93
    .line 94
    const/4 v1, 0x0

    .line 95
    invoke-direct {v6, v0, v1}, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$initData$1;-><init>(Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;Lkotlin/coroutines/Continuation;)V

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
    new-instance v6, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$commitAndChangeQuestionToNext$1;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    invoke-direct {v6, p0, p2, p1}, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$commitAndChangeQuestionToNext$1;-><init>(Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

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
    new-instance v7, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$commitAndChangeQuestionToPre$1;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    invoke-direct {v7, p0, p1}, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$commitAndChangeQuestionToPre$1;-><init>(Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;Lkotlin/coroutines/Continuation;)V

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

.method public u(Lf6/j;Lkotlin/jvm/functions/Function0;)V
    .locals 9

    .line 1
    const-string v0, "draftFunctions"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "callback"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v6, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$commitAndSubmitTask$1;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    invoke-direct {v6, p0, p2, p1}, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$commitAndSubmitTask$1;-><init>(Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

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
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;->x:Lkotlinx/coroutines/flow/MutableStateFlow;

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
    sget-object v16, Lw5/i$a;->c:Lw5/i$a;

    .line 105
    .line 106
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getStem()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v23

    .line 110
    const v24, 0x7c5bf

    .line 111
    .line 112
    .line 113
    const/16 v25, 0x0

    .line 114
    .line 115
    const/4 v3, 0x0

    .line 116
    const/4 v4, 0x0

    .line 117
    const/4 v5, 0x0

    .line 118
    const/4 v6, 0x0

    .line 119
    const/4 v7, 0x0

    .line 120
    const/4 v8, 0x0

    .line 121
    const/4 v10, 0x0

    .line 122
    const/4 v11, 0x0

    .line 123
    const/4 v13, 0x0

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
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->x()Lw5/e;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    const/16 v15, 0xffb

    .line 146
    .line 147
    const/16 v16, 0x0

    .line 148
    .line 149
    const/4 v4, 0x0

    .line 150
    const/4 v5, 0x0

    .line 151
    const/4 v7, 0x0

    .line 152
    const/4 v9, 0x0

    .line 153
    const/4 v10, 0x0

    .line 154
    const/4 v11, 0x0

    .line 155
    const/4 v12, 0x0

    .line 156
    const/4 v13, 0x0

    .line 157
    const/4 v14, 0x0

    .line 158
    invoke-static/range {v2 .. v16}, Lw5/e;->b(Lw5/e;Ljava/util/List;ZZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lw5/e;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-virtual {v0, v1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->i0(Lw5/e;)V

    .line 163
    .line 164
    .line 165
    return-void
.end method

.method public w0(Lcom/zykj/evaluation/bean/TaskDetailInfo;Ljava/util/Map;)V
    .locals 21

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v6, p2

    .line 4
    .line 5
    const-string v1, "taskDetailInfo"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "localAnswerMap"

    .line 11
    .line 12
    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    new-instance v13, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    new-instance v14, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getAnswerWithQuestion()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_1

    .line 63
    .line 64
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->M()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getId()J

    .line 69
    .line 70
    .line 71
    move-result-wide v3

    .line 72
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getQstFlows()Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    move-object v5, v1

    .line 81
    check-cast v5, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 82
    .line 83
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getAnswerList()Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    move-object/from16 v1, p0

    .line 88
    .line 89
    move-object v8, v13

    .line 90
    move-object v9, v14

    .line 91
    invoke-virtual/range {v1 .. v9}, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;->Q0(IJLcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/util/Map;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 92
    .line 93
    .line 94
    goto/16 :goto_9

    .line 95
    .line 96
    :cond_1
    move-object v2, v6

    .line 97
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getQstFlows()Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    const/4 v15, 0x1

    .line 106
    if-le v3, v15, :cond_2

    .line 107
    .line 108
    move v3, v15

    .line 109
    goto :goto_1

    .line 110
    :cond_2
    const/4 v3, 0x0

    .line 111
    :goto_1
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getQstFlows()Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v16

    .line 119
    :cond_3
    :goto_2
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-eqz v5, :cond_d

    .line 124
    .line 125
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    move-object v9, v5

    .line 130
    check-cast v9, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 131
    .line 132
    const-string v5, "."

    .line 133
    .line 134
    const-string v17, ""

    .line 135
    .line 136
    if-eqz v3, :cond_5

    .line 137
    .line 138
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getNumber()I

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    if-nez v6, :cond_4

    .line 143
    .line 144
    move-object/from16 v6, v17

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_4
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getNumber()I

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    new-instance v7, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    :goto_3
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getNumber()I

    .line 167
    .line 168
    .line 169
    move-result v7

    .line 170
    new-instance v8, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    goto :goto_4

    .line 186
    :cond_5
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getNumber()I

    .line 187
    .line 188
    .line 189
    move-result v6

    .line 190
    if-nez v6, :cond_6

    .line 191
    .line 192
    move-object/from16 v6, v17

    .line 193
    .line 194
    goto :goto_4

    .line 195
    :cond_6
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getNumber()I

    .line 196
    .line 197
    .line 198
    move-result v6

    .line 199
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    :goto_4
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getType()I

    .line 204
    .line 205
    .line 206
    move-result v7

    .line 207
    if-nez v7, :cond_b

    .line 208
    .line 209
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getSubQuestions()Ljava/util/List;

    .line 210
    .line 211
    .line 212
    move-result-object v7

    .line 213
    if-eqz v7, :cond_b

    .line 214
    .line 215
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 216
    .line 217
    .line 218
    move-result v7

    .line 219
    if-eqz v7, :cond_7

    .line 220
    .line 221
    goto/16 :goto_8

    .line 222
    .line 223
    :cond_7
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getSubQuestions()Ljava/util/List;

    .line 224
    .line 225
    .line 226
    move-result-object v7

    .line 227
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 228
    .line 229
    .line 230
    move-result v7

    .line 231
    if-le v7, v15, :cond_8

    .line 232
    .line 233
    move/from16 v18, v15

    .line 234
    .line 235
    goto :goto_5

    .line 236
    :cond_8
    const/16 v18, 0x0

    .line 237
    .line 238
    :goto_5
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getSubQuestions()Ljava/util/List;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 243
    .line 244
    .line 245
    move-result-object v19

    .line 246
    :goto_6
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    .line 247
    .line 248
    .line 249
    move-result v7

    .line 250
    if-eqz v7, :cond_3

    .line 251
    .line 252
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v7

    .line 256
    move-object v9, v7

    .line 257
    check-cast v9, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    .line 258
    .line 259
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->M()I

    .line 260
    .line 261
    .line 262
    move-result v7

    .line 263
    move v10, v7

    .line 264
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getId()J

    .line 265
    .line 266
    .line 267
    move-result-wide v7

    .line 268
    if-eqz v18, :cond_9

    .line 269
    .line 270
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getNumber()I

    .line 271
    .line 272
    .line 273
    move-result v11

    .line 274
    new-instance v12, Ljava/lang/StringBuilder;

    .line 275
    .line 276
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v11

    .line 289
    goto :goto_7

    .line 290
    :cond_9
    move-object/from16 v11, v17

    .line 291
    .line 292
    :goto_7
    new-instance v12, Ljava/lang/StringBuilder;

    .line 293
    .line 294
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v11

    .line 307
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v12

    .line 311
    invoke-interface {v2, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v12

    .line 315
    check-cast v12, Ljava/util/List;

    .line 316
    .line 317
    if-nez v12, :cond_a

    .line 318
    .line 319
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 320
    .line 321
    .line 322
    move-result-object v12

    .line 323
    :cond_a
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    invoke-virtual {v1, v4}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    check-cast v4, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 332
    .line 333
    move-object/from16 v20, v12

    .line 334
    .line 335
    move-object v12, v4

    .line 336
    move-object v4, v6

    .line 337
    move v6, v10

    .line 338
    move-object v10, v11

    .line 339
    move-object/from16 v11, v20

    .line 340
    .line 341
    move-object/from16 v20, v5

    .line 342
    .line 343
    move-object/from16 v5, p0

    .line 344
    .line 345
    invoke-virtual/range {v5 .. v14}, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;->P0(IJLcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;Ljava/util/List;Lcom/zykj/evaluation/bean/DetailAnswerInfo;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 346
    .line 347
    .line 348
    move-object v6, v4

    .line 349
    move-object/from16 v5, v20

    .line 350
    .line 351
    goto :goto_6

    .line 352
    :cond_b
    :goto_8
    move-object v4, v6

    .line 353
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->M()I

    .line 354
    .line 355
    .line 356
    move-result v6

    .line 357
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getId()J

    .line 358
    .line 359
    .line 360
    move-result-wide v7

    .line 361
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v5

    .line 365
    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v5

    .line 369
    check-cast v5, Ljava/util/List;

    .line 370
    .line 371
    if-nez v5, :cond_c

    .line 372
    .line 373
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 374
    .line 375
    .line 376
    move-result-object v5

    .line 377
    :cond_c
    move-object v11, v5

    .line 378
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->getUuid()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v5

    .line 382
    invoke-virtual {v1, v5}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v5

    .line 386
    move-object v12, v5

    .line 387
    check-cast v12, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    .line 388
    .line 389
    move-object/from16 v5, p0

    .line 390
    .line 391
    move-object v10, v4

    .line 392
    invoke-virtual/range {v5 .. v14}, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;->P0(IJLcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;Ljava/util/List;Lcom/zykj/evaluation/bean/DetailAnswerInfo;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 393
    .line 394
    .line 395
    goto/16 :goto_2

    .line 396
    .line 397
    :cond_d
    :goto_9
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->x()Lw5/e;

    .line 398
    .line 399
    .line 400
    move-result-object v5

    .line 401
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskDetailInfo;->getAnswerWithQuestion()Z

    .line 402
    .line 403
    .line 404
    move-result v7

    .line 405
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->D()Z

    .line 406
    .line 407
    .line 408
    move-result v1

    .line 409
    invoke-static {v0, v1}, Lw5/h;->h(Lcom/zykj/evaluation/bean/TaskDetailInfo;Z)Ljava/util/List;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->D()Z

    .line 414
    .line 415
    .line 416
    move-result v2

    .line 417
    invoke-static {v0, v2}, Lw5/h;->k(Lcom/zykj/evaluation/bean/TaskDetailInfo;Z)Ljava/util/List;

    .line 418
    .line 419
    .line 420
    move-result-object v15

    .line 421
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->D()Z

    .line 422
    .line 423
    .line 424
    move-result v2

    .line 425
    invoke-static {v0, v2}, Lw5/h;->j(Lcom/zykj/evaluation/bean/TaskDetailInfo;Z)Ljava/util/List;

    .line 426
    .line 427
    .line 428
    move-result-object v16

    .line 429
    new-instance v2, Ljava/util/ArrayList;

    .line 430
    .line 431
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 432
    .line 433
    .line 434
    invoke-static {v0}, Lw5/h;->f(Lcom/zykj/evaluation/bean/TaskDetailInfo;)Lw5/c;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    if-eqz v0, :cond_e

    .line 439
    .line 440
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    :cond_e
    const/16 v18, 0xd5

    .line 444
    .line 445
    const/16 v19, 0x0

    .line 446
    .line 447
    const/4 v6, 0x0

    .line 448
    const/4 v8, 0x0

    .line 449
    const/4 v10, 0x0

    .line 450
    const/4 v12, 0x0

    .line 451
    move-object v11, v13

    .line 452
    const/4 v13, 0x0

    .line 453
    move-object/from16 v17, v2

    .line 454
    .line 455
    move-object v9, v14

    .line 456
    move-object v14, v1

    .line 457
    invoke-static/range {v5 .. v19}, Lw5/e;->b(Lw5/e;Ljava/util/List;ZZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lw5/e;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    move-object/from16 v5, p0

    .line 462
    .line 463
    invoke-virtual {v5, v0}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->i0(Lw5/e;)V

    .line 464
    .line 465
    .line 466
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
    const-string v0, "\u4fdd\u5b58\u7b54\u6848"

    .line 77
    .line 78
    :goto_2
    move-object/from16 v20, v0

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_1
    const-string v0, "\u4fdd\u5b58,\u4e0b\u4e00\u9898"

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
