.class public final Lx/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj/e;


# instance fields
.field public final a:Ln/d;


# direct methods
.method public constructor <init>(Ln/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx/f;->a:Ln/d;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lj/d;)Z
    .locals 0

    .line 1
    check-cast p1, Li/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lx/f;->d(Li/a;Lj/d;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILj/d;)Lm/j;
    .locals 0

    .line 1
    check-cast p1, Li/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lx/f;->c(Li/a;IILj/d;)Lm/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Li/a;IILj/d;)Lm/j;
    .locals 0

    .line 1
    invoke-interface {p1}, Li/a;->a()Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, Lx/f;->a:Ln/d;

    .line 6
    .line 7
    invoke-static {p1, p2}, Lt/e;->d(Landroid/graphics/Bitmap;Ln/d;)Lt/e;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public d(Li/a;Lj/d;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    return p1
.end method
