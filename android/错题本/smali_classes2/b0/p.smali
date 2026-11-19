.class public final Lb0/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw0/c;


# instance fields
.field public final synthetic a:Lb0/q;


# direct methods
.method public constructor <init>(Lb0/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb0/p;->a:Lb0/q;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lcom/bumptech/glide/load/engine/b;

    .line 2
    .line 3
    iget-object v1, p0, Lb0/p;->a:Lb0/q;

    .line 4
    .line 5
    iget-object v2, v1, Lb0/q;->a:Lb0/t;

    .line 6
    .line 7
    iget-object v1, v1, Lb0/q;->b:Lw0/d;

    .line 8
    .line 9
    invoke-direct {v0, v2, v1}, Lcom/bumptech/glide/load/engine/b;-><init>(Lb0/t;Lw0/d;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
