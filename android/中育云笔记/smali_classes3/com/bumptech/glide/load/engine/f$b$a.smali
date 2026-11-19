.class public Lcom/bumptech/glide/load/engine/f$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le1/a$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bumptech/glide/load/engine/f$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/bumptech/glide/load/engine/f$b;


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/load/engine/f$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bumptech/glide/load/engine/f$b$a;->a:Lcom/bumptech/glide/load/engine/f$b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()Lcom/bumptech/glide/load/engine/g;
    .locals 8

    .line 1
    new-instance v0, Lcom/bumptech/glide/load/engine/g;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/f$b$a;->a:Lcom/bumptech/glide/load/engine/f$b;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    iget-object v1, v2, Lcom/bumptech/glide/load/engine/f$b;->a:Lm0/a;

    .line 7
    .line 8
    move-object v3, v2

    .line 9
    iget-object v2, v3, Lcom/bumptech/glide/load/engine/f$b;->b:Lm0/a;

    .line 10
    .line 11
    move-object v4, v3

    .line 12
    iget-object v3, v4, Lcom/bumptech/glide/load/engine/f$b;->c:Lm0/a;

    .line 13
    .line 14
    move-object v5, v4

    .line 15
    iget-object v4, v5, Lcom/bumptech/glide/load/engine/f$b;->d:Lm0/a;

    .line 16
    .line 17
    move-object v6, v5

    .line 18
    iget-object v5, v6, Lcom/bumptech/glide/load/engine/f$b;->e:Lj0/d;

    .line 19
    .line 20
    move-object v7, v6

    .line 21
    iget-object v6, v7, Lcom/bumptech/glide/load/engine/f$b;->f:Lcom/bumptech/glide/load/engine/h$a;

    .line 22
    .line 23
    iget-object v7, v7, Lcom/bumptech/glide/load/engine/f$b;->g:Landroidx/core/util/Pools$Pool;

    .line 24
    .line 25
    invoke-direct/range {v0 .. v7}, Lcom/bumptech/glide/load/engine/g;-><init>(Lm0/a;Lm0/a;Lm0/a;Lm0/a;Lj0/d;Lcom/bumptech/glide/load/engine/h$a;Landroidx/core/util/Pools$Pool;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public bridge synthetic create()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/bumptech/glide/load/engine/f$b$a;->a()Lcom/bumptech/glide/load/engine/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
