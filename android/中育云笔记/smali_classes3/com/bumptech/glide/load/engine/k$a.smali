.class public Lcom/bumptech/glide/load/engine/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/data/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bumptech/glide/load/engine/k;->j(Ln0/n$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Ln0/n$a;

.field public final synthetic d:Lcom/bumptech/glide/load/engine/k;


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/load/engine/k;Ln0/n$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bumptech/glide/load/engine/k$a;->d:Lcom/bumptech/glide/load/engine/k;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bumptech/glide/load/engine/k$a;->c:Ln0/n$a;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/k$a;->d:Lcom/bumptech/glide/load/engine/k;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/k$a;->c:Ln0/n$a;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/load/engine/k;->g(Ln0/n$a;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/k$a;->d:Lcom/bumptech/glide/load/engine/k;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/k$a;->c:Ln0/n$a;

    .line 14
    .line 15
    invoke-virtual {v0, v1, p1}, Lcom/bumptech/glide/load/engine/k;->i(Ln0/n$a;Ljava/lang/Exception;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public d(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/k$a;->d:Lcom/bumptech/glide/load/engine/k;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/k$a;->c:Ln0/n$a;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/load/engine/k;->g(Ln0/n$a;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/k$a;->d:Lcom/bumptech/glide/load/engine/k;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/k$a;->c:Ln0/n$a;

    .line 14
    .line 15
    invoke-virtual {v0, v1, p1}, Lcom/bumptech/glide/load/engine/k;->h(Ln0/n$a;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method
