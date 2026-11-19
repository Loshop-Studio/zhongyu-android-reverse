.class public Lh7/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh7/b;->j(Lcom/lzy/okgo/model/Progress;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/lzy/okgo/model/Progress;

.field public final synthetic d:Lh7/b;


# direct methods
.method public constructor <init>(Lh7/b;Lcom/lzy/okgo/model/Progress;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh7/b$d;->d:Lh7/b;

    .line 2
    .line 3
    iput-object p2, p0, Lh7/b$d;->c:Lcom/lzy/okgo/model/Progress;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lh7/b$d;->d:Lh7/b;

    .line 2
    .line 3
    iget-object v0, v0, Lh7/b;->d:Ljava/util/Map;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lh7/a;

    .line 24
    .line 25
    iget-object v2, p0, Lh7/b$d;->c:Lcom/lzy/okgo/model/Progress;

    .line 26
    .line 27
    invoke-interface {v1, v2}, Lg7/b;->b(Lcom/lzy/okgo/model/Progress;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void
.end method
