.class public final Ly/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll/e;


# instance fields
.field public final a:Lo/d;


# direct methods
.method public constructor <init>(Lo/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly/f;->a:Lo/d;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;IILl/d;)Ln/j;
    .locals 0

    .line 1
    check-cast p1, Lk/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Ly/f;->c(Lk/a;IILl/d;)Ln/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;Ll/d;)Z
    .locals 0

    .line 1
    check-cast p1, Lk/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Ly/f;->d(Lk/a;Ll/d;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public c(Lk/a;IILl/d;)Ln/j;
    .locals 0

    .line 1
    invoke-interface {p1}, Lk/a;->a()Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, Ly/f;->a:Lo/d;

    .line 6
    .line 7
    invoke-static {p1, p2}, Lu/f;->c(Landroid/graphics/Bitmap;Lo/d;)Lu/f;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public d(Lk/a;Ll/d;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method
