.class public final Lcoil3/compose/AsyncImagePainter$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La0/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcoil3/compose/AsyncImagePainter;->y(Ly/e;Z)Ly/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ly/e;

.field public final synthetic b:Lcoil3/compose/AsyncImagePainter;


# direct methods
.method public constructor <init>(Ly/e;Lcoil3/compose/AsyncImagePainter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil3/compose/AsyncImagePainter$d;->a:Ly/e;

    .line 2
    .line 3
    iput-object p2, p0, Lcoil3/compose/AsyncImagePainter$d;->b:Lcoil3/compose/AsyncImagePainter;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lk/j;)V
    .locals 0

    .line 1
    return-void
.end method

.method public b(Lk/j;)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(Lk/j;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter$d;->a:Ly/e;

    .line 4
    .line 5
    invoke-virtual {v0}, Ly/e;->c()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lcoil3/compose/AsyncImagePainter$d;->b:Lcoil3/compose/AsyncImagePainter;

    .line 10
    .line 11
    invoke-virtual {v1}, Lcoil3/compose/AsyncImagePainter;->g()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {p1, v0, v1}, Ll/d;->a(Lk/j;Landroid/content/Context;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    :goto_0
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter$d;->b:Lcoil3/compose/AsyncImagePainter;

    .line 22
    .line 23
    new-instance v1, Lcoil3/compose/AsyncImagePainter$c$c;

    .line 24
    .line 25
    invoke-direct {v1, p1}, Lcoil3/compose/AsyncImagePainter$c$c;-><init>(Landroidx/compose/ui/graphics/painter/Painter;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1}, Lcoil3/compose/AsyncImagePainter;->f(Lcoil3/compose/AsyncImagePainter;Lcoil3/compose/AsyncImagePainter$c;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method
