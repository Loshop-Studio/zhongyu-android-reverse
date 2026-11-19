.class public Lb/c/a/e/f/b/f/c;
.super Lb/c/a/e/f/b/f/b;
.source ""


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x8
.end annotation


# instance fields
.field public final j:Landroid/view/ScaleGestureDetector;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0, p1}, Lb/c/a/e/f/b/f/b;-><init>(Landroid/content/Context;)V

    new-instance v0, Lb/c/a/e/f/b/f/c$a;

    invoke-direct {v0, p0}, Lb/c/a/e/f/b/f/c$a;-><init>(Lb/c/a/e/f/b/f/c;)V

    new-instance v1, Landroid/view/ScaleGestureDetector;

    invoke-direct {v1, p1, v0}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    iput-object v1, p0, Lb/c/a/e/f/b/f/c;->j:Landroid/view/ScaleGestureDetector;

    return-void
.end method


# virtual methods
.method public c()Z
    .locals 1

    iget-object v0, p0, Lb/c/a/e/f/b/f/c;->j:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v0}, Landroid/view/ScaleGestureDetector;->isInProgress()Z

    move-result v0

    return v0
.end method

.method public d(Landroid/view/MotionEvent;)Z
    .locals 1

    :try_start_0
    iget-object v0, p0, Lb/c/a/e/f/b/f/c;->j:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/ScaleGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    invoke-super {p0, p1}, Lb/c/a/e/f/b/f/b;->d(Landroid/view/MotionEvent;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 p1, 0x1

    return p1
.end method
