.class public final Lw1/g$d;
.super Lw1/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw1/g$d$a;
    }
.end annotation


# instance fields
.field public final a:Lw1/g$h;

.field public final b:Lw1/g$d;

.field public c:Lgc/f;


# direct methods
.method public constructor <init>(Lw1/g$h;Ldc/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lw1/c;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p0, p0, Lw1/g$d;->b:Lw1/g$d;

    .line 5
    .line 6
    iput-object p1, p0, Lw1/g$d;->a:Lw1/g$h;

    .line 7
    .line 8
    invoke-virtual {p0, p2}, Lw1/g$d;->c(Ldc/h;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a()Lbc/a;
    .locals 4

    .line 1
    new-instance v0, Lw1/g$a;

    .line 2
    .line 3
    iget-object v1, p0, Lw1/g$d;->a:Lw1/g$h;

    .line 4
    .line 5
    iget-object v2, p0, Lw1/g$d;->b:Lw1/g$d;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v1, v2, v3}, Lw1/g$a;-><init>(Lw1/g$h;Lw1/g$d;Lw1/h;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public b()Lxb/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lw1/g$d;->c:Lgc/f;

    .line 2
    .line 3
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lxb/a;

    .line 8
    .line 9
    return-object v0
.end method

.method public final c(Ldc/h;)V
    .locals 3

    .line 1
    new-instance p1, Lw1/g$d$a;

    .line 2
    .line 3
    iget-object v0, p0, Lw1/g$d;->a:Lw1/g$h;

    .line 4
    .line 5
    iget-object v1, p0, Lw1/g$d;->b:Lw1/g$d;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {p1, v0, v1, v2}, Lw1/g$d$a;-><init>(Lw1/g$h;Lw1/g$d;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lgc/b;->b(Lgc/f;)Lgc/f;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lw1/g$d;->c:Lgc/f;

    .line 16
    .line 17
    return-void
.end method
