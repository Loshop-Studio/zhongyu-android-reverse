.class public final Lz0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm0/e;


# instance fields
.field public final a:Lp0/d;


# direct methods
.method public constructor <init>(Lp0/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz0/f;->a:Lp0/d;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lm0/d;)Z
    .locals 0

    .line 1
    check-cast p1, Ll0/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lz0/f;->d(Ll0/a;Lm0/d;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILm0/d;)Lo0/j;
    .locals 0

    .line 1
    check-cast p1, Ll0/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lz0/f;->c(Ll0/a;IILm0/d;)Lo0/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Ll0/a;IILm0/d;)Lo0/j;
    .locals 0

    .line 1
    invoke-interface {p1}, Ll0/a;->a()Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, Lz0/f;->a:Lp0/d;

    .line 6
    .line 7
    invoke-static {p1, p2}, Lv0/f;->c(Landroid/graphics/Bitmap;Lp0/d;)Lv0/f;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public d(Ll0/a;Lm0/d;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method
