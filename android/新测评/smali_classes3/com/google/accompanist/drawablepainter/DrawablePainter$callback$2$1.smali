.class public final Lcom/google/accompanist/drawablepainter/DrawablePainter$callback$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/drawable/Drawable$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/accompanist/drawablepainter/DrawablePainter;-><init>(Landroid/graphics/drawable/Drawable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0008H\u0016\u00a8\u0006\u000c"
    }
    d2 = {
        "com/google/accompanist/drawablepainter/DrawablePainter$callback$2$1",
        "Landroid/graphics/drawable/Drawable$Callback;",
        "invalidateDrawable",
        "",
        "d",
        "Landroid/graphics/drawable/Drawable;",
        "scheduleDrawable",
        "what",
        "Ljava/lang/Runnable;",
        "time",
        "",
        "unscheduleDrawable",
        "drawablepainter_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/accompanist/drawablepainter/DrawablePainter;


# direct methods
.method public constructor <init>(Lcom/google/accompanist/drawablepainter/DrawablePainter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/accompanist/drawablepainter/DrawablePainter$callback$2$1;->this$0:Lcom/google/accompanist/drawablepainter/DrawablePainter;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    const-string v0, "d"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/google/accompanist/drawablepainter/DrawablePainter$callback$2$1;->this$0:Lcom/google/accompanist/drawablepainter/DrawablePainter;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/google/accompanist/drawablepainter/DrawablePainter;->access$getDrawInvalidateTick(Lcom/google/accompanist/drawablepainter/DrawablePainter;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iget-object v0, p0, Lcom/google/accompanist/drawablepainter/DrawablePainter$callback$2$1;->this$0:Lcom/google/accompanist/drawablepainter/DrawablePainter;

    .line 13
    .line 14
    add-int/lit8 p1, p1, 0x1

    .line 15
    .line 16
    invoke-static {v0, p1}, Lcom/google/accompanist/drawablepainter/DrawablePainter;->access$setDrawInvalidateTick(Lcom/google/accompanist/drawablepainter/DrawablePainter;I)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lcom/google/accompanist/drawablepainter/DrawablePainter$callback$2$1;->this$0:Lcom/google/accompanist/drawablepainter/DrawablePainter;

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/google/accompanist/drawablepainter/DrawablePainter;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Lcom/google/accompanist/drawablepainter/DrawablePainterKt;->access$getIntrinsicSize(Landroid/graphics/drawable/Drawable;)J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    invoke-static {p1, v0, v1}, Lcom/google/accompanist/drawablepainter/DrawablePainter;->access$setDrawableIntrinsicSize-uvyYCjk(Lcom/google/accompanist/drawablepainter/DrawablePainter;J)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V
    .locals 1

    .line 1
    const-string v0, "d"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "what"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/google/accompanist/drawablepainter/DrawablePainterKt;->access$getMAIN_HANDLER()Landroid/os/Handler;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1, p2, p3, p4}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;J)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    const-string v0, "d"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "what"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/google/accompanist/drawablepainter/DrawablePainterKt;->access$getMAIN_HANDLER()Landroid/os/Handler;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
