.class public final Lk5/h$d;
.super Lk5/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk5/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk5/h$d$a;
    }
.end annotation


# instance fields
.field public final a:Lk5/h$h;

.field public final b:Lk5/h$d;

.field public c:Lo8/f;


# direct methods
.method public constructor <init>(Lk5/h$h;Ll8/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lk5/c;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p0, p0, Lk5/h$d;->b:Lk5/h$d;

    .line 5
    .line 6
    iput-object p1, p0, Lk5/h$d;->a:Lk5/h$h;

    .line 7
    .line 8
    invoke-virtual {p0, p2}, Lk5/h$d;->c(Ll8/g;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a()Lj8/a;
    .locals 4

    .line 1
    new-instance v0, Lk5/h$a;

    .line 2
    .line 3
    iget-object v1, p0, Lk5/h$d;->a:Lk5/h$h;

    .line 4
    .line 5
    iget-object v2, p0, Lk5/h$d;->b:Lk5/h$d;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v1, v2, v3}, Lk5/h$a;-><init>(Lk5/h$h;Lk5/h$d;Lk5/i;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public b()Lf8/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/h$d;->c:Lo8/f;

    .line 2
    .line 3
    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lf8/a;

    .line 8
    .line 9
    return-object v0
.end method

.method public final c(Ll8/g;)V
    .locals 3

    .line 1
    new-instance p1, Lk5/h$d$a;

    .line 2
    .line 3
    iget-object v0, p0, Lk5/h$d;->a:Lk5/h$h;

    .line 4
    .line 5
    iget-object v1, p0, Lk5/h$d;->b:Lk5/h$d;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {p1, v0, v1, v2}, Lk5/h$d$a;-><init>(Lk5/h$h;Lk5/h$d;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lo8/b;->b(Lo8/f;)Lo8/f;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lk5/h$d;->c:Lo8/f;

    .line 16
    .line 17
    return-void
.end method
