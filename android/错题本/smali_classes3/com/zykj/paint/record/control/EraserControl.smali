.class public Lcom/zykj/paint/record/control/EraserControl;
.super Lcom/zykj/paint/record/control/BaseControl;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/paint/record/control/ISketchControl;


# instance fields
.field private sketchSyncView:Lcom/zykj/paint/SketchSyncView;


# direct methods
.method public constructor <init>(Lcom/zykj/paint/SketchSyncView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/paint/record/control/BaseControl;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/paint/record/control/EraserControl;->sketchSyncView:Lcom/zykj/paint/SketchSyncView;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public cleanAll()V
    .locals 0

    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 0

    return-void
.end method

.method public getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public hasDraw()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public touchDown(Landroid/view/MotionEvent;)V
    .locals 0

    return-void
.end method

.method public touchMove(Landroid/view/MotionEvent;)V
    .locals 0

    return-void
.end method

.method public touchPointerDown(Landroid/view/MotionEvent;)V
    .locals 0

    return-void
.end method

.method public touchPointerUp(Landroid/view/MotionEvent;)V
    .locals 0

    return-void
.end method

.method public touchUp(Landroid/view/MotionEvent;)V
    .locals 0

    return-void
.end method
