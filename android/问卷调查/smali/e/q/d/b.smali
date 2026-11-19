.class public final Le/q/d/b;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Le/q/d/a;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/q/d/a;",
            ">;"
        }
    .end annotation
.end field

.field public c:Z

.field public final d:Le/q/d/c;

.field public final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Le/q/d/c;Ljava/lang/String;)V
    .locals 1

    const-string v0, "taskRunner"

    invoke-static {p1, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/q/d/b;->d:Le/q/d/c;

    iput-object p2, p0, Le/q/d/b;->e:Ljava/lang/String;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Le/q/d/b;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 5

    iget-object v0, p0, Le/q/d/b;->a:Le/q/d/a;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-static {v0}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    .line 1
    iget-boolean v0, v0, Le/q/d/a;->d:Z

    if-eqz v0, :cond_0

    .line 2
    iput-boolean v1, p0, Le/q/d/b;->c:Z

    :cond_0
    const/4 v0, 0x0

    iget-object v2, p0, Le/q/d/b;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v1

    :goto_0
    if-ltz v2, :cond_3

    iget-object v3, p0, Le/q/d/b;->b:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le/q/d/a;

    .line 3
    iget-boolean v3, v3, Le/q/d/a;->d:Z

    if-eqz v3, :cond_2

    .line 4
    iget-object v0, p0, Le/q/d/b;->b:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/q/d/a;

    sget-object v3, Le/q/d/c;->j:Le/q/d/c;

    .line 5
    sget-object v3, Le/q/d/c;->i:Ljava/util/logging/Logger;

    .line 6
    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v3, v4}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v3, "canceled"

    invoke-static {v0, p0, v3}, Lb/c/a/a;->a(Le/q/d/a;Le/q/d/b;Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Le/q/d/b;->b:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move v0, v1

    :cond_2
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le/q/d/b;->e:Ljava/lang/String;

    return-object v0
.end method
