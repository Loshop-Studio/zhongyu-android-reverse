.class public Lg6/h$h$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/student/dialogue/upload/UploadWork_AssistedFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg6/h$h$a;->get()Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lg6/h$h$a;


# direct methods
.method public constructor <init>(Lg6/h$h$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg6/h$h$a$a;->a:Lg6/h$h$a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroidx/work/WorkerParameters;)Lcom/zykj/student/dialogue/upload/UploadWork;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/student/dialogue/upload/UploadWork;

    .line 2
    .line 3
    iget-object v1, p0, Lg6/h$h$a$a;->a:Lg6/h$h$a;

    .line 4
    .line 5
    invoke-static {v1}, Lg6/h$h$a;->a(Lg6/h$h$a;)Lg6/h$h;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v1, v1, Lg6/h$h;->h:Lz7/f;

    .line 10
    .line 11
    invoke-interface {v1}, Lh8/a;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lcom/zykj/student/dialogue/upload/OssTaskManger;

    .line 16
    .line 17
    invoke-direct {v0, p1, p2, v1}, Lcom/zykj/student/dialogue/upload/UploadWork;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/zykj/student/dialogue/upload/OssTaskManger;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public bridge synthetic create(Landroid/content/Context;Landroidx/work/WorkerParameters;)Landroidx/work/ListenableWorker;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lg6/h$h$a$a;->a(Landroid/content/Context;Landroidx/work/WorkerParameters;)Lcom/zykj/student/dialogue/upload/UploadWork;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
