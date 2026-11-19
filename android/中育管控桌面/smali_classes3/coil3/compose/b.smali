.class public abstract Lcoil3/compose/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcoil3/compose/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcoil3/compose/b$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lcoil3/compose/b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcoil3/compose/b;->a:Lcoil3/compose/b$a;

    .line 7
    .line 8
    return-void
.end method

.method public static final a(Lcoil3/compose/AsyncImagePainter$c;Lcoil3/compose/AsyncImagePainter$c;Landroidx/compose/ui/layout/ContentScale;)Lcoil3/compose/CrossfadePainter;
    .locals 1

    .line 1
    instance-of p0, p1, Lcoil3/compose/AsyncImagePainter$c$d;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lcoil3/compose/AsyncImagePainter$c$d;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcoil3/compose/AsyncImagePainter$c$d;->b()Ly/q;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    instance-of p0, p1, Lcoil3/compose/AsyncImagePainter$c$b;

    .line 14
    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    check-cast p1, Lcoil3/compose/AsyncImagePainter$c$b;

    .line 18
    .line 19
    invoke-virtual {p1}, Lcoil3/compose/AsyncImagePainter$c$b;->b()Ly/d;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :goto_0
    invoke-interface {p0}, Ly/j;->a()Ly/e;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, Ly/i;->o(Ly/e;)Lb0/c$a;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    sget-object v0, Lcoil3/compose/b;->a:Lcoil3/compose/b$a;

    .line 32
    .line 33
    invoke-interface {p1, v0, p0}, Lb0/c$a;->a(Lb0/d;Ly/j;)Lb0/c;

    .line 34
    .line 35
    .line 36
    :cond_1
    return-object p2
.end method
