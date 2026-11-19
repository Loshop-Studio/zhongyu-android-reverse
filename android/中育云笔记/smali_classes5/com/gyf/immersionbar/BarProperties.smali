.class public Lcom/gyf/immersionbar/BarProperties;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private actionBarHeight:I

.field private hasNavigationBar:Z

.field private landscapeLeft:Z

.field private landscapeRight:Z

.field private navigationBarHeight:I

.field private navigationBarWidth:I

.field private notchHeight:I

.field private notchScreen:Z

.field private portrait:Z

.field private statusBarHeight:I


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
.method public getActionBarHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/gyf/immersionbar/BarProperties;->actionBarHeight:I

    .line 2
    .line 3
    return v0
.end method

.method public getNavigationBarHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/gyf/immersionbar/BarProperties;->navigationBarHeight:I

    .line 2
    .line 3
    return v0
.end method

.method public getNavigationBarWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/gyf/immersionbar/BarProperties;->navigationBarWidth:I

    .line 2
    .line 3
    return v0
.end method

.method public getNotchHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/gyf/immersionbar/BarProperties;->notchHeight:I

    .line 2
    .line 3
    return v0
.end method

.method public getStatusBarHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/gyf/immersionbar/BarProperties;->statusBarHeight:I

    .line 2
    .line 3
    return v0
.end method

.method public hasNavigationBar()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/gyf/immersionbar/BarProperties;->hasNavigationBar:Z

    .line 2
    .line 3
    return v0
.end method

.method public isLandscapeLeft()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/gyf/immersionbar/BarProperties;->landscapeLeft:Z

    .line 2
    .line 3
    return v0
.end method

.method public isLandscapeRight()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/gyf/immersionbar/BarProperties;->landscapeRight:Z

    .line 2
    .line 3
    return v0
.end method

.method public isNotchScreen()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/gyf/immersionbar/BarProperties;->notchScreen:Z

    .line 2
    .line 3
    return v0
.end method

.method public isPortrait()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/gyf/immersionbar/BarProperties;->portrait:Z

    .line 2
    .line 3
    return v0
.end method

.method public setActionBarHeight(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/gyf/immersionbar/BarProperties;->actionBarHeight:I

    .line 2
    .line 3
    return-void
.end method

.method public setLandscapeLeft(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/gyf/immersionbar/BarProperties;->landscapeLeft:Z

    .line 2
    .line 3
    return-void
.end method

.method public setLandscapeRight(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/gyf/immersionbar/BarProperties;->landscapeRight:Z

    .line 2
    .line 3
    return-void
.end method

.method public setNavigationBar(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/gyf/immersionbar/BarProperties;->hasNavigationBar:Z

    .line 2
    .line 3
    return-void
.end method

.method public setNavigationBarHeight(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/gyf/immersionbar/BarProperties;->navigationBarHeight:I

    .line 2
    .line 3
    return-void
.end method

.method public setNavigationBarWidth(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/gyf/immersionbar/BarProperties;->navigationBarWidth:I

    .line 2
    .line 3
    return-void
.end method

.method public setNotchHeight(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/gyf/immersionbar/BarProperties;->notchHeight:I

    .line 2
    .line 3
    return-void
.end method

.method public setNotchScreen(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/gyf/immersionbar/BarProperties;->notchScreen:Z

    .line 2
    .line 3
    return-void
.end method

.method public setPortrait(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/gyf/immersionbar/BarProperties;->portrait:Z

    .line 2
    .line 3
    return-void
.end method

.method public setStatusBarHeight(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/gyf/immersionbar/BarProperties;->statusBarHeight:I

    .line 2
    .line 3
    return-void
.end method
