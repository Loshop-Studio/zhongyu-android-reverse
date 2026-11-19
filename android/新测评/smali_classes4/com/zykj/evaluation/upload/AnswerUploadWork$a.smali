.class public final Lcom/zykj/evaluation/upload/AnswerUploadWork$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/evaluation/upload/AnswerUploadWork;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/evaluation/upload/AnswerUploadWork$a;-><init>()V

    return-void
.end method

.method public static synthetic b(Lcom/zykj/evaluation/upload/AnswerUploadWork$a;JJLjava/lang/String;ILjava/lang/String;[Ljava/lang/String;[Ljava/lang/String;ILjava/lang/Object;)Landroidx/work/OneTimeWorkRequest$Builder;
    .locals 12

    .line 1
    and-int/lit8 v0, p10, 0x20

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-array v0, v1, [Ljava/lang/String;

    .line 7
    .line 8
    move-object v10, v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object/from16 v10, p8

    .line 11
    .line 12
    :goto_0
    and-int/lit8 v0, p10, 0x40

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    new-array v0, v1, [Ljava/lang/String;

    .line 17
    .line 18
    move-object v11, v0

    .line 19
    :goto_1
    move-object v2, p0

    .line 20
    move-wide v3, p1

    .line 21
    move-wide v5, p3

    .line 22
    move-object/from16 v7, p5

    .line 23
    .line 24
    move/from16 v8, p6

    .line 25
    .line 26
    move-object/from16 v9, p7

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_1
    move-object/from16 v11, p9

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :goto_2
    invoke-virtual/range {v2 .. v11}, Lcom/zykj/evaluation/upload/AnswerUploadWork$a;->a(JJLjava/lang/String;ILjava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Landroidx/work/OneTimeWorkRequest$Builder;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method


# virtual methods
.method public final varargs a(JJLjava/lang/String;ILjava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Landroidx/work/OneTimeWorkRequest$Builder;
    .locals 2

    .line 1
    const-string v0, "uuid"

    .line 2
    .line 3
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileAbsolutePath"

    .line 7
    .line 8
    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "extras"

    .line 12
    .line 13
    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "tags"

    .line 17
    .line 18
    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Landroidx/work/Data$Builder;

    .line 22
    .line 23
    invoke-direct {v0}, Landroidx/work/Data$Builder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v1, "USER_ID"

    .line 27
    .line 28
    invoke-virtual {v0, v1, p1, p2}, Landroidx/work/Data$Builder;->putLong(Ljava/lang/String;J)Landroidx/work/Data$Builder;

    .line 29
    .line 30
    .line 31
    const-string p1, "TASK_ID"

    .line 32
    .line 33
    invoke-virtual {v0, p1, p3, p4}, Landroidx/work/Data$Builder;->putLong(Ljava/lang/String;J)Landroidx/work/Data$Builder;

    .line 34
    .line 35
    .line 36
    const-string p1, "TASK_STATE"

    .line 37
    .line 38
    invoke-virtual {v0, p1, p6}, Landroidx/work/Data$Builder;->putInt(Ljava/lang/String;I)Landroidx/work/Data$Builder;

    .line 39
    .line 40
    .line 41
    const-string p1, "UUID"

    .line 42
    .line 43
    invoke-virtual {v0, p1, p5}, Landroidx/work/Data$Builder;->putString(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/Data$Builder;

    .line 44
    .line 45
    .line 46
    const-string p1, "INPUT_TYPE"

    .line 47
    .line 48
    const/4 p2, 0x0

    .line 49
    invoke-virtual {v0, p1, p2}, Landroidx/work/Data$Builder;->putInt(Ljava/lang/String;I)Landroidx/work/Data$Builder;

    .line 50
    .line 51
    .line 52
    const-string p1, "INPUT_FILE_ABSOLUTE_PATH"

    .line 53
    .line 54
    invoke-virtual {v0, p1, p7}, Landroidx/work/Data$Builder;->putString(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/Data$Builder;

    .line 55
    .line 56
    .line 57
    const-string p1, "EXTRA_DATA"

    .line 58
    .line 59
    invoke-virtual {v0, p1, p8}, Landroidx/work/Data$Builder;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)Landroidx/work/Data$Builder;

    .line 60
    .line 61
    .line 62
    new-instance p1, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 63
    .line 64
    const-class p3, Lcom/zykj/evaluation/upload/AnswerUploadWork;

    .line 65
    .line 66
    invoke-direct {p1, p3}, Landroidx/work/OneTimeWorkRequest$Builder;-><init>(Ljava/lang/Class;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 70
    .line 71
    .line 72
    move-result-object p3

    .line 73
    invoke-virtual {p1, p3}, Landroidx/work/WorkRequest$Builder;->setInputData(Landroidx/work/Data;)Landroidx/work/WorkRequest$Builder;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    check-cast p1, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 78
    .line 79
    array-length p3, p9

    .line 80
    :goto_0
    if-ge p2, p3, :cond_0

    .line 81
    .line 82
    aget-object p4, p9, p2

    .line 83
    .line 84
    invoke-virtual {p1, p4}, Landroidx/work/WorkRequest$Builder;->addTag(Ljava/lang/String;)Landroidx/work/WorkRequest$Builder;

    .line 85
    .line 86
    .line 87
    add-int/lit8 p2, p2, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_0
    return-object p1
.end method
