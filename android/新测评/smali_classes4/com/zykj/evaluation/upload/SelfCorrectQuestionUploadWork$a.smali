.class public final Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;
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
    invoke-direct {p0}, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(JJJI)Landroidx/work/OneTimeWorkRequest$Builder;
    .locals 2

    .line 1
    new-instance v0, Landroidx/work/Data$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/work/Data$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "USER_ID"

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1, p2}, Landroidx/work/Data$Builder;->putLong(Ljava/lang/String;J)Landroidx/work/Data$Builder;

    .line 9
    .line 10
    .line 11
    const-string p1, "TASK_ID"

    .line 12
    .line 13
    invoke-virtual {v0, p1, p3, p4}, Landroidx/work/Data$Builder;->putLong(Ljava/lang/String;J)Landroidx/work/Data$Builder;

    .line 14
    .line 15
    .line 16
    const-string p1, "TASK_STATE"

    .line 17
    .line 18
    invoke-virtual {v0, p1, p7}, Landroidx/work/Data$Builder;->putInt(Ljava/lang/String;I)Landroidx/work/Data$Builder;

    .line 19
    .line 20
    .line 21
    const-string p1, "QUESTION_ID"

    .line 22
    .line 23
    invoke-virtual {v0, p1, p5, p6}, Landroidx/work/Data$Builder;->putLong(Ljava/lang/String;J)Landroidx/work/Data$Builder;

    .line 24
    .line 25
    .line 26
    new-instance p1, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 27
    .line 28
    const-class p2, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;

    .line 29
    .line 30
    invoke-direct {p1, p2}, Landroidx/work/OneTimeWorkRequest$Builder;-><init>(Ljava/lang/Class;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p1, p2}, Landroidx/work/WorkRequest$Builder;->setInputData(Landroidx/work/Data;)Landroidx/work/WorkRequest$Builder;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 42
    .line 43
    return-object p1
.end method
