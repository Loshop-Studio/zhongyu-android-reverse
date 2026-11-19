.class public final Lcom/zykj/student/dialogue/upload/UploadWork_AssistedFactory_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/student/dialogue/upload/UploadWork_AssistedFactory;


# virtual methods
.method public a(Landroid/content/Context;Landroidx/work/WorkerParameters;)Lcom/zykj/student/dialogue/upload/UploadWork;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    throw p1
.end method

.method public bridge synthetic create(Landroid/content/Context;Landroidx/work/WorkerParameters;)Landroidx/work/ListenableWorker;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/upload/UploadWork_AssistedFactory_Impl;->a(Landroid/content/Context;Landroidx/work/WorkerParameters;)Lcom/zykj/student/dialogue/upload/UploadWork;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
