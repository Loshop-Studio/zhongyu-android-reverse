.class public final Lb0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw0/c;


# instance fields
.field public final synthetic a:Lb0/s;


# direct methods
.method public constructor <init>(Lb0/s;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb0/r;->a:Lb0/s;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 8

    .line 1
    new-instance v0, Lb0/w;

    .line 2
    .line 3
    iget-object v1, p0, Lb0/r;->a:Lb0/s;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    iget-object v1, v2, Lb0/s;->a:Le0/b;

    .line 7
    .line 8
    move-object v3, v2

    .line 9
    iget-object v2, v3, Lb0/s;->b:Le0/b;

    .line 10
    .line 11
    move-object v4, v3

    .line 12
    iget-object v3, v4, Lb0/s;->c:Le0/b;

    .line 13
    .line 14
    move-object v5, v4

    .line 15
    iget-object v4, v5, Lb0/s;->d:Le0/b;

    .line 16
    .line 17
    move-object v6, v5

    .line 18
    iget-object v5, v6, Lb0/s;->e:Lcom/bumptech/glide/load/engine/c;

    .line 19
    .line 20
    move-object v7, v6

    .line 21
    iget-object v6, v7, Lb0/s;->f:Lcom/bumptech/glide/load/engine/c;

    .line 22
    .line 23
    iget-object v7, v7, Lb0/s;->g:Lw0/d;

    .line 24
    .line 25
    invoke-direct/range {v0 .. v7}, Lb0/w;-><init>(Le0/b;Le0/b;Le0/b;Le0/b;Lcom/bumptech/glide/load/engine/c;Lcom/bumptech/glide/load/engine/c;Lw0/d;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method
