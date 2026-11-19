.class public final Lcom/zykj/view/simpleBoard/ActionManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/simpleBoard/ActionManager$Action;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0001$B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006%"
    }
    d2 = {
        "Lcom/zykj/view/simpleBoard/ActionManager;",
        "",
        "Lcom/zykj/view/simpleBoard/SimpleBoardConfig;",
        "boardConfig",
        "Landroid/graphics/Matrix;",
        "cameraMatrix",
        "Lcom/zykj/view/simpleBoard/DrawControl;",
        "drawControl",
        "<init>",
        "(Lcom/zykj/view/simpleBoard/SimpleBoardConfig;Landroid/graphics/Matrix;Lcom/zykj/view/simpleBoard/DrawControl;)V",
        "",
        "mode",
        "Ld6/s;",
        "setActonMode",
        "(I)V",
        "Landroid/view/MotionEvent;",
        "event",
        "handTouchEvent",
        "(Landroid/view/MotionEvent;)V",
        "mActionMode",
        "I",
        "Lcom/zykj/view/simpleBoard/action/WriteAction;",
        "mWriteAction",
        "Lcom/zykj/view/simpleBoard/action/WriteAction;",
        "Lcom/zykj/view/simpleBoard/action/LineAction;",
        "mLineAction",
        "Lcom/zykj/view/simpleBoard/action/LineAction;",
        "Lcom/zykj/view/simpleBoard/action/EraserAction;",
        "mEraserAction",
        "Lcom/zykj/view/simpleBoard/action/EraserAction;",
        "Lcom/zykj/view/simpleBoard/action/SeeAction;",
        "mSeeAction",
        "Lcom/zykj/view/simpleBoard/action/SeeAction;",
        "Lcom/zykj/view/simpleBoard/action/BaseAction;",
        "mCurrentAction",
        "Lcom/zykj/view/simpleBoard/action/BaseAction;",
        "Action",
        "view_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private mActionMode:I

.field private mCurrentAction:Lcom/zykj/view/simpleBoard/action/BaseAction;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final mEraserAction:Lcom/zykj/view/simpleBoard/action/EraserAction;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mLineAction:Lcom/zykj/view/simpleBoard/action/LineAction;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mSeeAction:Lcom/zykj/view/simpleBoard/action/SeeAction;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mWriteAction:Lcom/zykj/view/simpleBoard/action/WriteAction;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/zykj/view/simpleBoard/SimpleBoardConfig;Landroid/graphics/Matrix;Lcom/zykj/view/simpleBoard/DrawControl;)V
    .locals 1
    .param p1    # Lcom/zykj/view/simpleBoard/SimpleBoardConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/zykj/view/simpleBoard/DrawControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "boardConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "cameraMatrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "drawControl"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance v0, Lcom/zykj/view/simpleBoard/action/WriteAction;

    .line 20
    .line 21
    invoke-direct {v0, p1, p2, p3}, Lcom/zykj/view/simpleBoard/action/WriteAction;-><init>(Lcom/zykj/view/simpleBoard/SimpleBoardConfig;Landroid/graphics/Matrix;Lcom/zykj/view/simpleBoard/DrawControl;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/zykj/view/simpleBoard/ActionManager;->mWriteAction:Lcom/zykj/view/simpleBoard/action/WriteAction;

    .line 25
    .line 26
    new-instance v0, Lcom/zykj/view/simpleBoard/action/LineAction;

    .line 27
    .line 28
    invoke-direct {v0, p1, p2, p3}, Lcom/zykj/view/simpleBoard/action/LineAction;-><init>(Lcom/zykj/view/simpleBoard/SimpleBoardConfig;Landroid/graphics/Matrix;Lcom/zykj/view/simpleBoard/DrawControl;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lcom/zykj/view/simpleBoard/ActionManager;->mLineAction:Lcom/zykj/view/simpleBoard/action/LineAction;

    .line 32
    .line 33
    new-instance v0, Lcom/zykj/view/simpleBoard/action/EraserAction;

    .line 34
    .line 35
    invoke-direct {v0, p1, p2, p3}, Lcom/zykj/view/simpleBoard/action/EraserAction;-><init>(Lcom/zykj/view/simpleBoard/SimpleBoardConfig;Landroid/graphics/Matrix;Lcom/zykj/view/simpleBoard/DrawControl;)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lcom/zykj/view/simpleBoard/ActionManager;->mEraserAction:Lcom/zykj/view/simpleBoard/action/EraserAction;

    .line 39
    .line 40
    new-instance v0, Lcom/zykj/view/simpleBoard/action/SeeAction;

    .line 41
    .line 42
    invoke-direct {v0, p1, p2, p3}, Lcom/zykj/view/simpleBoard/action/SeeAction;-><init>(Lcom/zykj/view/simpleBoard/SimpleBoardConfig;Landroid/graphics/Matrix;Lcom/zykj/view/simpleBoard/DrawControl;)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Lcom/zykj/view/simpleBoard/ActionManager;->mSeeAction:Lcom/zykj/view/simpleBoard/action/SeeAction;

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final handTouchEvent(Landroid/view/MotionEvent;)V
    .locals 3
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x2

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v0, :cond_5

    .line 13
    .line 14
    if-eq v0, v2, :cond_3

    .line 15
    .line 16
    if-eq v0, v1, :cond_2

    .line 17
    .line 18
    const/4 v1, 0x5

    .line 19
    if-eq v0, v1, :cond_1

    .line 20
    .line 21
    const/4 v1, 0x6

    .line 22
    if-eq v0, v1, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/ActionManager;->mCurrentAction:Lcom/zykj/view/simpleBoard/action/BaseAction;

    .line 26
    .line 27
    if-eqz v0, :cond_a

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Lcom/zykj/view/simpleBoard/action/BaseAction;->onTouchPointerUp(Landroid/view/MotionEvent;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/ActionManager;->mCurrentAction:Lcom/zykj/view/simpleBoard/action/BaseAction;

    .line 34
    .line 35
    if-eqz v0, :cond_a

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Lcom/zykj/view/simpleBoard/action/BaseAction;->onTouchPointerDown(Landroid/view/MotionEvent;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/ActionManager;->mCurrentAction:Lcom/zykj/view/simpleBoard/action/BaseAction;

    .line 42
    .line 43
    if-eqz v0, :cond_a

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Lcom/zykj/view/simpleBoard/action/BaseAction;->onTouchMove(Landroid/view/MotionEvent;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_3
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/ActionManager;->mCurrentAction:Lcom/zykj/view/simpleBoard/action/BaseAction;

    .line 50
    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    invoke-virtual {v0, p1}, Lcom/zykj/view/simpleBoard/action/BaseAction;->onTouchUp(Landroid/view/MotionEvent;)V

    .line 54
    .line 55
    .line 56
    :cond_4
    const/4 p1, 0x0

    .line 57
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/ActionManager;->mCurrentAction:Lcom/zykj/view/simpleBoard/action/BaseAction;

    .line 58
    .line 59
    return-void

    .line 60
    :cond_5
    iget v0, p0, Lcom/zykj/view/simpleBoard/ActionManager;->mActionMode:I

    .line 61
    .line 62
    if-eqz v0, :cond_9

    .line 63
    .line 64
    if-eq v0, v2, :cond_8

    .line 65
    .line 66
    if-eq v0, v1, :cond_7

    .line 67
    .line 68
    const/4 v1, 0x3

    .line 69
    if-eq v0, v1, :cond_6

    .line 70
    .line 71
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/ActionManager;->mSeeAction:Lcom/zykj/view/simpleBoard/action/SeeAction;

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/ActionManager;->mSeeAction:Lcom/zykj/view/simpleBoard/action/SeeAction;

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_7
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/ActionManager;->mEraserAction:Lcom/zykj/view/simpleBoard/action/EraserAction;

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_8
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/ActionManager;->mLineAction:Lcom/zykj/view/simpleBoard/action/LineAction;

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_9
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/ActionManager;->mWriteAction:Lcom/zykj/view/simpleBoard/action/WriteAction;

    .line 84
    .line 85
    :goto_0
    iput-object v0, p0, Lcom/zykj/view/simpleBoard/ActionManager;->mCurrentAction:Lcom/zykj/view/simpleBoard/action/BaseAction;

    .line 86
    .line 87
    if-eqz v0, :cond_a

    .line 88
    .line 89
    invoke-virtual {v0, p1}, Lcom/zykj/view/simpleBoard/action/BaseAction;->onTouchDown(Landroid/view/MotionEvent;)V

    .line 90
    .line 91
    .line 92
    :cond_a
    :goto_1
    return-void
.end method

.method public final setActonMode(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/view/simpleBoard/ActionManager;->mActionMode:I

    .line 2
    .line 3
    return-void
.end method
