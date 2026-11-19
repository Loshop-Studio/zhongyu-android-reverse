.class public Lk5/h$h$a$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork_AssistedFactory;


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
    iput-object p1, p0, Lk5/h$h$a$f;->a:Lk5/h$h$a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroidx/work/WorkerParameters;)Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork;
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork;

    .line 2
    .line 3
    iget-object v1, p0, Lk5/h$h$a$f;->a:Lk5/h$h$a;

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
    check-cast v1, Lp5/j;

    .line 16
    .line 17
    iget-object v2, p0, Lk5/h$h$a$f;->a:Lk5/h$h$a;

    .line 18
    .line 19
    invoke-static {v2}, Lk5/h$h$a;->a(Lk5/h$h$a;)Lk5/h$h;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-object v2, v2, Lk5/h$h;->j:Lo8/f;

    .line 24
    .line 25
    invoke-interface {v2}, Lw8/a;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Lcom/zykj/evaluation/di/AppDatabase;

    .line 30
    .line 31
    invoke-direct {v0, p1, p2, v1, v2}, Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp5/j;Lcom/zykj/evaluation/di/AppDatabase;)V

    .line 32
    .line 33
    .line 34
    return-object v0
.end method

.method public bridge synthetic create(Landroid/content/Context;Landroidx/work/WorkerParameters;)Landroidx/work/ListenableWorker;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lk5/h$h$a$f;->a(Landroid/content/Context;Landroidx/work/WorkerParameters;)Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
