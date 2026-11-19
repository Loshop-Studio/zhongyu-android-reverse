.class Lg1/a$b;
.super Lg1/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg1/a;->e(Ljava/lang/String;Ly0/i;)Lg1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ly0/i;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(Ly0/i;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lg1/a$b;->b:Ly0/i;

    iput-object p2, p0, Lg1/a$b;->c:Ljava/lang/String;

    invoke-direct {p0}, Lg1/a;-><init>()V

    return-void
.end method


# virtual methods
.method i()V
    .locals 4

    .line 1
    iget-object v0, p0, Lg1/a$b;->b:Ly0/i;

    invoke-virtual {v0}, Ly0/i;->s()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Landroidx/room/h0;->e()V

    .line 3
    :try_start_0
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->M()Lf1/s;

    move-result-object v1

    .line 4
    iget-object v2, p0, Lg1/a$b;->c:Ljava/lang/String;

    invoke-interface {v1, v2}, Lf1/s;->o(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 5
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 6
    iget-object v3, p0, Lg1/a$b;->b:Ly0/i;

    invoke-virtual {p0, v3, v2}, Lg1/a;->a(Ly0/i;Ljava/lang/String;)V

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v0}, Landroidx/room/h0;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    invoke-virtual {v0}, Landroidx/room/h0;->i()V

    .line 9
    iget-object v0, p0, Lg1/a$b;->b:Ly0/i;

    invoke-virtual {p0, v0}, Lg1/a;->h(Ly0/i;)V

    return-void

    :catchall_0
    move-exception v1

    .line 10
    invoke-virtual {v0}, Landroidx/room/h0;->i()V

    .line 11
    throw v1
.end method
