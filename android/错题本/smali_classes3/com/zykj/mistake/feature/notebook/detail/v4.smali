.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/v4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/mistake/feature/notebook/detail/a5;

.field public final synthetic b:Lcom/zykj/mistake/feature/notebook/detail/f;

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/io/File;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/feature/notebook/detail/a5;Lcom/zykj/mistake/feature/notebook/detail/f;ILjava/lang/String;Ljava/io/File;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/v4;->a:Lcom/zykj/mistake/feature/notebook/detail/a5;

    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/v4;->b:Lcom/zykj/mistake/feature/notebook/detail/f;

    iput p3, p0, Lcom/zykj/mistake/feature/notebook/detail/v4;->c:I

    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/detail/v4;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/zykj/mistake/feature/notebook/detail/v4;->e:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/v4;->a:Lcom/zykj/mistake/feature/notebook/detail/a5;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/v4;->b:Lcom/zykj/mistake/feature/notebook/detail/f;

    .line 4
    .line 5
    iget v2, p0, Lcom/zykj/mistake/feature/notebook/detail/v4;->c:I

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/v4;->d:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/v4;->e:Ljava/io/File;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/feature/notebook/detail/a5;->g(Lcom/zykj/mistake/feature/notebook/detail/f;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iget v1, v0, Lcom/zykj/mistake/feature/notebook/detail/a5;->f:I

    .line 18
    .line 19
    if-ne v1, v2, :cond_1

    .line 20
    .line 21
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/a5;->k:Lr6/e;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-interface {v1, v5, v3}, Lr6/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    :cond_0
    new-instance v1, Lcom/zykj/mistake/feature/notebook/detail/w4;

    .line 33
    .line 34
    invoke-direct {v1, v0, v2, v4}, Lcom/zykj/mistake/feature/notebook/detail/w4;-><init>(Lcom/zykj/mistake/feature/notebook/detail/a5;ILjava/io/File;)V

    .line 35
    .line 36
    .line 37
    const-string v0, "StemSnapshotCleaner"

    .line 38
    .line 39
    invoke-static {v0, v1}, Lh4/a;->o(Ljava/lang/String;Lr6/a;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
.end method
