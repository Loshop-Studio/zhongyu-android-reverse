.class public abstract Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;
.super Lcom/zykj/evaluation/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/zykj/evaluation/bean/BaseGuideQuestion;",
        ">",
        "Lcom/zykj/evaluation/base/BaseViewModel;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\'\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0012\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\r2\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0013H\u0004\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0004\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR+\u0010%\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#\"\u0004\u0008$\u0010\u000fR+\u0010-\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020&8F@DX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*\"\u0004\u0008+\u0010,R*\u00106\u001a\u00020.2\u0006\u0010/\u001a\u00020.8\u0006@DX\u0086.\u00a2\u0006\u0012\n\u0004\u00080\u00101\u001a\u0004\u00082\u00103\"\u0004\u00084\u00105R*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00138\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u00087\u00108\u001a\u0004\u00089\u0010:\"\u0004\u0008;\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008<\u0010=\u001a\u0004\u0008>\u0010?\"\u0004\u0008@\u0010\u001aR\u0011\u0010D\u001a\u00020A8F\u00a2\u0006\u0006\u001a\u0004\u0008B\u0010C\u00a8\u0006E"
    }
    d2 = {
        "Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;",
        "Lcom/zykj/evaluation/bean/BaseGuideQuestion;",
        "T",
        "Lcom/zykj/evaluation/base/BaseViewModel;",
        "Lp5/j;",
        "service",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/zykj/message/server/bean/UserInfo;",
        "userInfo",
        "<init>",
        "(Lp5/j;Lkotlinx/coroutines/flow/MutableStateFlow;)V",
        "",
        "taskId",
        "",
        "s",
        "(J)V",
        "t",
        "()V",
        "z",
        "Lcom/zykj/evaluation/bean/GuideTaskInfo;",
        "guideTaskInfo",
        "B",
        "(Lcom/zykj/evaluation/bean/GuideTaskInfo;)V",
        "Lcom/zykj/evaluation/bean/ExamProgress;",
        "progress",
        "A",
        "(Lcom/zykj/evaluation/bean/ExamProgress;)V",
        "c",
        "Lp5/j;",
        "d",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "<set-?>",
        "e",
        "Lkotlin/properties/ReadWriteProperty;",
        "q",
        "()J",
        "x",
        "mTaskId",
        "Lh6/a;",
        "f",
        "Landroidx/compose/runtime/MutableState;",
        "o",
        "()Lh6/a;",
        "v",
        "(Lh6/a;)V",
        "leftInfoViewState",
        "Lg7/e;",
        "value",
        "g",
        "Lg7/e;",
        "p",
        "()Lg7/e;",
        "w",
        "(Lg7/e;)V",
        "mPathManager",
        "h",
        "Lcom/zykj/evaluation/bean/GuideTaskInfo;",
        "n",
        "()Lcom/zykj/evaluation/bean/GuideTaskInfo;",
        "u",
        "i",
        "Lcom/zykj/evaluation/bean/ExamProgress;",
        "getProgress",
        "()Lcom/zykj/evaluation/bean/ExamProgress;",
        "y",
        "",
        "r",
        "()I",
        "taskState",
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
        "SMAP\nBaseGuideViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseGuideViewModel.kt\ncom/zykj/evaluation/ui/guide/BaseGuideViewModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,149:1\n85#2:150\n113#2,2:151\n*S KotlinDebug\n*F\n+ 1 BaseGuideViewModel.kt\ncom/zykj/evaluation/ui/guide/BaseGuideViewModel\n*L\n48#1:150\n48#1:151,2\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic j:[Lkotlin/reflect/KProperty;

.field public static final k:I


# instance fields
.field public final c:Lp5/j;

.field public final d:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final e:Lkotlin/properties/ReadWriteProperty;

.field public final f:Landroidx/compose/runtime/MutableState;

.field public g:Lg7/e;

.field public h:Lcom/zykj/evaluation/bean/GuideTaskInfo;

.field public i:Lcom/zykj/evaluation/bean/ExamProgress;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-class v1, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;

    const-string v2, "mTaskId"

    const-string v3, "getMTaskId()J"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lkotlin/reflect/KProperty;

    aput-object v0, v1, v4

    sput-object v1, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->j:[Lkotlin/reflect/KProperty;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->k:I

    return-void
.end method

.method public constructor <init>(Lp5/j;Lkotlinx/coroutines/flow/MutableStateFlow;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-string v3, "service"

    .line 8
    .line 9
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v3, "userInfo"

    .line 13
    .line 14
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0}, Lcom/zykj/evaluation/base/BaseViewModel;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v1, v0, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->c:Lp5/j;

    .line 21
    .line 22
    iput-object v2, v0, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->d:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 23
    .line 24
    sget-object v1, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    .line 25
    .line 26
    invoke-virtual {v1}, Lkotlin/properties/Delegates;->notNull()Lkotlin/properties/ReadWriteProperty;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iput-object v1, v0, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->e:Lkotlin/properties/ReadWriteProperty;

    .line 31
    .line 32
    new-instance v2, Lh6/a;

    .line 33
    .line 34
    const/16 v17, 0x3fff

    .line 35
    .line 36
    const/16 v18, 0x0

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    const/4 v4, 0x0

    .line 40
    const/4 v5, 0x0

    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v7, 0x0

    .line 43
    const/4 v8, 0x0

    .line 44
    const/4 v9, 0x0

    .line 45
    const/4 v10, 0x0

    .line 46
    const/4 v11, 0x0

    .line 47
    const/4 v12, 0x0

    .line 48
    const/4 v13, 0x0

    .line 49
    const/4 v14, 0x0

    .line 50
    const/4 v15, 0x0

    .line 51
    const/16 v16, 0x0

    .line 52
    .line 53
    invoke-direct/range {v2 .. v18}, Lh6/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lj6/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 54
    .line 55
    .line 56
    const/4 v1, 0x0

    .line 57
    const/4 v3, 0x2

    .line 58
    invoke-static {v2, v1, v3, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    iput-object v1, v0, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->f:Landroidx/compose/runtime/MutableState;

    .line 63
    .line 64
    return-void
.end method

.method public static final synthetic m(Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;)Lp5/j;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->c:Lp5/j;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final A(Lcom/zykj/evaluation/bean/ExamProgress;)V
    .locals 18

    .line 1
    const-string v0, "progress"

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->o()Lh6/a;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/ExamProgress;->getTestingCount()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v3, "\u672a\u4ea4\u4f5c\u4e1a\uff1a"

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v0, "\u4eba"

    .line 30
    .line 31
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v10

    .line 38
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/ExamProgress;->getTestingStudents()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v11

    .line 42
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/ExamProgress;->getRevisingCount()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    new-instance v3, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string v4, "\u672a\u4ea4\u8ba2\u6b63\uff1a"

    .line 52
    .line 53
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v12

    .line 66
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/ExamProgress;->getRevisingStudents()Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v13

    .line 70
    const/16 v16, 0x30ff

    .line 71
    .line 72
    const/16 v17, 0x0

    .line 73
    .line 74
    const/4 v2, 0x0

    .line 75
    const/4 v3, 0x0

    .line 76
    const/4 v4, 0x0

    .line 77
    const/4 v5, 0x0

    .line 78
    const/4 v6, 0x0

    .line 79
    const/4 v7, 0x0

    .line 80
    const/4 v8, 0x0

    .line 81
    const/4 v9, 0x0

    .line 82
    const/4 v14, 0x0

    .line 83
    const/4 v15, 0x0

    .line 84
    invoke-static/range {v1 .. v17}, Lh6/a;->b(Lh6/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lj6/a;ILjava/lang/Object;)Lh6/a;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    move-object/from16 v1, p0

    .line 89
    .line 90
    invoke-virtual {v1, v0}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->v(Lh6/a;)V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public final B(Lcom/zykj/evaluation/bean/GuideTaskInfo;)V
    .locals 18

    .line 1
    const-string v0, "guideTaskInfo"

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->o()Lh6/a;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getExamName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v2, ""

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    move-object v0, v2

    .line 21
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getGradeName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    move-object v3, v2

    .line 28
    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v5, "\u5e74\u7ea7: "

    .line 34
    .line 35
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getTopicName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    if-nez v4, :cond_2

    .line 50
    .line 51
    move-object v4, v2

    .line 52
    :cond_2
    new-instance v5, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v6, "\u79d1\u76ee: "

    .line 58
    .line 59
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getStartTime()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    const-string v6, "---- ----"

    .line 74
    .line 75
    if-nez v5, :cond_3

    .line 76
    .line 77
    move-object v5, v6

    .line 78
    :cond_3
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getEndTime()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    if-nez v7, :cond_4

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_4
    move-object v6, v7

    .line 86
    :goto_0
    new-instance v7, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v5, " ~ "

    .line 95
    .line 96
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getEnableScore()Z

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getScore()D

    .line 111
    .line 112
    .line 113
    move-result-wide v7

    .line 114
    new-instance v9, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 117
    .line 118
    .line 119
    const-string v10, "\u603b\u5206\uff1a"

    .line 120
    .line 121
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v9, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getState()I

    .line 132
    .line 133
    .line 134
    move-result v8

    .line 135
    sget-object v9, Lcom/zykj/evaluation/bean/TaskState$ToCorrect;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$ToCorrect;

    .line 136
    .line 137
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/TaskState;->getState()I

    .line 138
    .line 139
    .line 140
    move-result v9

    .line 141
    if-lt v8, v9, :cond_5

    .line 142
    .line 143
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getMyScore()D

    .line 144
    .line 145
    .line 146
    move-result-wide v8

    .line 147
    new-instance v10, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 150
    .line 151
    .line 152
    const-string v11, "\u5f97\u5206\uff1a"

    .line 153
    .line 154
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v10, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v8

    .line 164
    goto :goto_1

    .line 165
    :cond_5
    move-object v8, v2

    .line 166
    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->isRepresentative()Z

    .line 167
    .line 168
    .line 169
    move-result v9

    .line 170
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getExamDescription()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v10

    .line 174
    if-nez v10, :cond_6

    .line 175
    .line 176
    move-object v14, v2

    .line 177
    goto :goto_2

    .line 178
    :cond_6
    move-object v14, v10

    .line 179
    :goto_2
    const/16 v16, 0x2f00

    .line 180
    .line 181
    const/16 v17, 0x0

    .line 182
    .line 183
    const/4 v10, 0x0

    .line 184
    const/4 v11, 0x0

    .line 185
    const/4 v12, 0x0

    .line 186
    const/4 v13, 0x0

    .line 187
    const/4 v15, 0x0

    .line 188
    move-object v2, v0

    .line 189
    invoke-static/range {v1 .. v17}, Lh6/a;->b(Lh6/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lj6/a;ILjava/lang/Object;)Lh6/a;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    move-object/from16 v1, p0

    .line 194
    .line 195
    invoke-virtual {v1, v0}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->v(Lh6/a;)V

    .line 196
    .line 197
    .line 198
    return-void
.end method

.method public final n()Lcom/zykj/evaluation/bean/GuideTaskInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->h:Lcom/zykj/evaluation/bean/GuideTaskInfo;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o()Lh6/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->f:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lh6/a;

    .line 8
    .line 9
    return-object v0
.end method

.method public final p()Lg7/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->g:Lg7/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "mPathManager"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final q()J
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->e:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->j:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    return-wide v0
.end method

.method public final r()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->h:Lcom/zykj/evaluation/bean/GuideTaskInfo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getState()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, -0x1

    .line 11
    return v0
.end method

.method public s(J)V
    .locals 6

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->x(J)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lg7/e;

    .line 5
    .line 6
    sget-object v1, Lcom/zykj/evaluation/bean/TaskState$ToCorrect;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$ToCorrect;

    .line 7
    .line 8
    iget-object p1, p0, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->d:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 9
    .line 10
    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lcom/zykj/message/server/bean/UserInfo;

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/UserInfo;->a()Ljava/lang/Long;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string p2, "getId(...)"

    .line 21
    .line 22
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->q()J

    .line 30
    .line 31
    .line 32
    move-result-wide v4

    .line 33
    invoke-direct/range {v0 .. v5}, Lg7/e;-><init>(Lcom/zykj/evaluation/bean/TaskState;JJ)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->w(Lg7/e;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final t()V
    .locals 9

    .line 1
    new-instance v6, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel$refreshSubmitProgress$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v6, p0, v0}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel$refreshSubmitProgress$1;-><init>(Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;Lkotlin/coroutines/Continuation;)V

    .line 5
    .line 6
    .line 7
    const/16 v7, 0x1f

    .line 8
    .line 9
    const/4 v8, 0x0

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    move-object v0, p0

    .line 16
    invoke-static/range {v0 .. v8}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final u(Lcom/zykj/evaluation/bean/GuideTaskInfo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->h:Lcom/zykj/evaluation/bean/GuideTaskInfo;

    .line 2
    .line 3
    return-void
.end method

.method public final v(Lh6/a;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->f:Landroidx/compose/runtime/MutableState;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final w(Lg7/e;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->g:Lg7/e;

    .line 7
    .line 8
    return-void
.end method

.method public final x(J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->e:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->j:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final y(Lcom/zykj/evaluation/bean/ExamProgress;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->i:Lcom/zykj/evaluation/bean/ExamProgress;

    .line 2
    .line 3
    return-void
.end method

.method public final z()V
    .locals 9

    .line 1
    new-instance v6, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel$switchCorrectAnalysisState$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v6, p0, v0}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel$switchCorrectAnalysisState$1;-><init>(Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;Lkotlin/coroutines/Continuation;)V

    .line 5
    .line 6
    .line 7
    const/16 v7, 0x1f

    .line 8
    .line 9
    const/4 v8, 0x0

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    move-object v0, p0

    .line 16
    invoke-static/range {v0 .. v8}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
