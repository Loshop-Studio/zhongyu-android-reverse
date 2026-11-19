.class public final Lcom/zykj/evaluation/bean/GetTaskListKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "convertToTaskState",
        "Lcom/zykj/evaluation/bean/TaskState;",
        "",
        "app_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final convertToTaskState(I)Lcom/zykj/evaluation/bean/TaskState;
    .locals 1

    .line 1
    if-eqz p0, :cond_5

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p0, v0, :cond_4

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p0, v0, :cond_3

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    if-eq p0, v0, :cond_2

    .line 11
    .line 12
    const/4 v0, 0x4

    .line 13
    if-eq p0, v0, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x5

    .line 16
    if-eq p0, v0, :cond_0

    .line 17
    .line 18
    sget-object p0, Lcom/zykj/evaluation/bean/TaskState$Done;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$Done;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    sget-object p0, Lcom/zykj/evaluation/bean/TaskState$Revising;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$Revising;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_1
    sget-object p0, Lcom/zykj/evaluation/bean/TaskState$WaitRevise;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$WaitRevise;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_2
    sget-object p0, Lcom/zykj/evaluation/bean/TaskState$ToCorrect;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$ToCorrect;

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_3
    sget-object p0, Lcom/zykj/evaluation/bean/TaskState$Correcting;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$Correcting;

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_4
    sget-object p0, Lcom/zykj/evaluation/bean/TaskState$WaitCorrect;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$WaitCorrect;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_5
    sget-object p0, Lcom/zykj/evaluation/bean/TaskState$ToDo;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$ToDo;

    .line 37
    .line 38
    return-object p0
.end method
