.class Lg1/a$a;
.super Lg1/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg1/a;->c(Ljava/util/UUID;Ly0/i;)Lg1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ly0/i;

.field final synthetic c:Ljava/util/UUID;


# direct methods
.method constructor <init>(Ly0/i;Ljava/util/UUID;)V
    .locals 0

    iput-object p1, p0, Lg1/a$a;->b:Ly0/i;

    iput-object p2, p0, Lg1/a$a;->c:Ljava/util/UUID;

    invoke-direct {p0}, Lg1/a;-><init>()V

    return-void
.end method


# virtual methods
.method i()V
    .locals 3

    .line 1
    iget-object v0, p0, Lg1/a$a;->b:Ly0/i;

    invoke-virtual {v0}, Ly0/i;->s()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Landroidx/room/h0;->e()V

    .line 3
    :try_start_0
    iget-object v1, p0, Lg1/a$a;->b:Ly0/i;

    iget-object v2, p0, Lg1/a$a;->c:Ljava/util/UUID;

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lg1/a;->a(Ly0/i;Ljava/lang/String;)V

    .line 4
    invoke-virtual {v0}, Landroidx/room/h0;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    invoke-virtual {v0}, Landroidx/room/h0;->i()V

    .line 6
    iget-object v0, p0, Lg1/a$a;->b:Ly0/i;

    invoke-virtual {p0, v0}, Lg1/a;->h(Ly0/i;)V

    return-void

    :catchall_0
    move-exception v1

    .line 7
    invoke-virtual {v0}, Landroidx/room/h0;->i()V

    .line 8
    throw v1
.end method
