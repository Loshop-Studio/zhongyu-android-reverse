.class public Lk5/h$h$a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/evaluation/upload/QuestionUploadWork_AssistedFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk5/h$h$a;->get()Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lk5/h$h$a;


# direct methods
.method public constructor <init>(Lk5/h$h$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk5/h$h$a$d;->a:Lk5/h$h$a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroidx/work/WorkerParameters;)Lcom/zykj/evaluation/upload/QuestionUploadWork;
    .locals 6

    .line 1
    new-instance v0, Lcom/zykj/evaluation/upload/QuestionUploadWork;

    .line 2
    .line 3
    iget-object v1, p0, Lk5/h$h$a$d;->a:Lk5/h$h$a;

    .line 4
    .line 5
    invoke-static {v1}, Lk5/h$h$a;->a(Lk5/h$h$a;)Lk5/h$h;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v1, v1, Lk5/h$h;->o:Lo8/f;

    .line 10
    .line 11
    invoke-interface {v1}, Lw8/a;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    move-object v3, v1

    .line 16
    check-cast v3, Lp5/j;

    .line 17
    .line 18
    iget-object v1, p0, Lk5/h$h$a$d;->a:Lk5/h$h$a;

    .line 19
    .line 20
    invoke-static {v1}, Lk5/h$h$a;->a(Lk5/h$h$a;)Lk5/h$h;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-object v1, v1, Lk5/h$h;->j:Lo8/f;

    .line 25
    .line 26
    invoke-interface {v1}, Lw8/a;->get()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    move-object v4, v1

    .line 31
    check-cast v4, Lcom/zykj/evaluation/di/AppDatabase;

    .line 32
    .line 33
    iget-object v1, p0, Lk5/h$h$a$d;->a:Lk5/h$h$a;

    .line 34
    .line 35
    invoke-static {v1}, Lk5/h$h$a;->a(Lk5/h$h$a;)Lk5/h$h;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-object v1, v1, Lk5/h$h;->k:Lo8/f;

    .line 40
    .line 41
    invoke-interface {v1}, Lw8/a;->get()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    move-object v5, v1

    .line 46
    check-cast v5, Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 47
    .line 48
    move-object v1, p1

    .line 49
    move-object v2, p2

    .line 50
    invoke-direct/range {v0 .. v5}, Lcom/zykj/evaluation/upload/QuestionUploadWork;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp5/j;Lcom/zykj/evaluation/di/AppDatabase;Lcom/zykj/evaluation/upload/OssTaskManger;)V

    .line 51
    .line 52
    .line 53
    return-object v0
.end method

.method public bridge synthetic create(Landroid/content/Context;Landroidx/work/WorkerParameters;)Landroidx/work/ListenableWorker;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lk5/h$h$a$d;->a(Landroid/content/Context;Landroidx/work/WorkerParameters;)Lcom/zykj/evaluation/upload/QuestionUploadWork;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
