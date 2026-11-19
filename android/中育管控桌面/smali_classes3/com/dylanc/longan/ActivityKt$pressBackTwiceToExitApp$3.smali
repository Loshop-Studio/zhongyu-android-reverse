.class public final Lcom/dylanc/longan/ActivityKt$pressBackTwiceToExitApp$3;
.super Landroidx/activity/OnBackPressedCallback;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0004\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004R\u0016\u0010\u0008\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "com/dylanc/longan/ActivityKt$pressBackTwiceToExitApp$3",
        "Landroidx/activity/OnBackPressedCallback;",
        "",
        "handleOnBackPressed",
        "()V",
        "",
        "a",
        "J",
        "lastBackTime",
        "longan"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field public a:J

.field public final synthetic b:J

.field public final synthetic c:Lkotlin/jvm/functions/Function0;


# virtual methods
.method public handleOnBackPressed()V
    .locals 6

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lcom/dylanc/longan/ActivityKt$pressBackTwiceToExitApp$3;->a:J

    .line 6
    .line 7
    sub-long v2, v0, v2

    .line 8
    .line 9
    iget-wide v4, p0, Lcom/dylanc/longan/ActivityKt$pressBackTwiceToExitApp$3;->b:J

    .line 10
    .line 11
    cmp-long v2, v2, v4

    .line 12
    .line 13
    if-lez v2, :cond_0

    .line 14
    .line 15
    iget-object v2, p0, Lcom/dylanc/longan/ActivityKt$pressBackTwiceToExitApp$3;->c:Lkotlin/jvm/functions/Function0;

    .line 16
    .line 17
    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    iput-wide v0, p0, Lcom/dylanc/longan/ActivityKt$pressBackTwiceToExitApp$3;->a:J

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-static {}, Lcom/dylanc/longan/ActivityKt;->b()Z

    .line 24
    .line 25
    .line 26
    return-void
.end method
