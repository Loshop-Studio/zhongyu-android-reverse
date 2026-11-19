.class public final Ls0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf0/e;


# instance fields
.field public final a:Li0/d;


# direct methods
.method public constructor <init>(Li0/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls0/f;->a:Li0/d;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;IILf0/d;)Lh0/j;
    .locals 0

    .line 1
    check-cast p1, Le0/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Ls0/f;->c(Le0/a;IILf0/d;)Lh0/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;Lf0/d;)Z
    .locals 0

    .line 1
    check-cast p1, Le0/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Ls0/f;->d(Le0/a;Lf0/d;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public c(Le0/a;IILf0/d;)Lh0/j;
    .locals 0

    .line 1
    invoke-interface {p1}, Le0/a;->a()Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, Ls0/f;->a:Li0/d;

    .line 6
    .line 7
    invoke-static {p1, p2}, Lo0/f;->c(Landroid/graphics/Bitmap;Li0/d;)Lo0/f;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public d(Le0/a;Lf0/d;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method
