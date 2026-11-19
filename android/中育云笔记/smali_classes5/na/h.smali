.class public final Lna/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lma/j;


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Lcom/zykj/blackboard/widgets/TextDialog;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lna/h;->a:Landroid/content/Context;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lhd/l;Lhd/l;Lhd/a;)V
    .locals 5

    .line 1
    const-string v0, "initText"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "afterTextChangedCallback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "doneCallback"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "cancelCallback"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lna/h;->b:Lcom/zykj/blackboard/widgets/TextDialog;

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    new-instance v0, Lcom/zykj/blackboard/widgets/TextDialog;

    .line 26
    .line 27
    iget-object v1, p0, Lna/h;->a:Landroid/content/Context;

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x0

    .line 31
    const/4 v4, 0x0

    .line 32
    invoke-direct {v0, v1, v4, v2, v3}, Lcom/zykj/blackboard/widgets/TextDialog;-><init>(Landroid/content/Context;IILkotlin/jvm/internal/n;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lna/h;->b:Lcom/zykj/blackboard/widgets/TextDialog;

    .line 36
    .line 37
    :cond_0
    iget-object v0, p0, Lna/h;->b:Lcom/zykj/blackboard/widgets/TextDialog;

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/zykj/blackboard/widgets/TextDialog;->d(Ljava/lang/String;Lhd/l;Lhd/l;Lhd/a;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    return-void
.end method
