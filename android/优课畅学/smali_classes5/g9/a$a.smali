.class public Lg9/a$a;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lg9/a;


# direct methods
.method public constructor <init>(Lg9/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg9/a$a;->a:Lg9/a;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lg9/a$a;->a:Lg9/a;

    .line 2
    .line 3
    invoke-static {p1}, Lg9/a;->a(Lg9/a;)Ly8/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lg9/a$a;->a:Lg9/a;

    .line 10
    .line 11
    invoke-static {p1}, Lg9/a;->a(Lg9/a;)Ly8/f;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p1}, Ly8/f;->getOnDanmakuClickListener()Ly8/f$a;

    .line 16
    .line 17
    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return p1
.end method

.method public onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lg9/a$a;->a:Lg9/a;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-static {v0, v1, p1}, Lg9/a;->b(Lg9/a;FF)Lz8/l;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-interface {p1}, Lz8/l;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lg9/a$a;->a:Lg9/a;

    .line 24
    .line 25
    invoke-static {v0, p1}, Lg9/a;->c(Lg9/a;Lz8/l;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p1, 0x0

    .line 31
    :goto_0
    if-nez p1, :cond_1

    .line 32
    .line 33
    iget-object p1, p0, Lg9/a$a;->a:Lg9/a;

    .line 34
    .line 35
    invoke-static {p1}, Lg9/a;->d(Lg9/a;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    :cond_1
    return p1
.end method
