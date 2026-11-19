.class public abstract La9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Lz8/c;Landroid/graphics/Canvas;FFLandroid/graphics/Paint;Landroid/text/TextPaint;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Lz8/c;->e()Lz8/n;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-interface {p1}, Lz8/n;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, La9/f;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1, p2, p3, p4, p5}, La9/f;->b(Landroid/graphics/Canvas;FFLandroid/graphics/Paint;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return p1
.end method

.method public abstract b(Lz8/c;Landroid/graphics/Canvas;FFZLa9/a$a;)V
.end method

.method public abstract c(Lz8/c;Landroid/text/TextPaint;Z)V
.end method

.method public d(Lz8/c;Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public e(Lz8/c;)V
    .locals 0

    .line 1
    return-void
.end method
