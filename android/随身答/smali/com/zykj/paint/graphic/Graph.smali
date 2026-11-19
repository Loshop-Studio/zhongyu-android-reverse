.class public abstract Lcom/zykj/paint/graphic/Graph;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private baseColor:I

.field public graphId:I

.field public graphMatrix:Landroid/graphics/Matrix;

.field public graphs:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/zykj/paint/graphic/Graph;",
            ">;"
        }
    .end annotation
.end field

.field private isVisable:Z

.field public mBoundBox:Lcom/zykj/paint/data/Rect2D;

.field public map:Lcom/zykj/paint/graphic/Map;

.field public matrix:Landroid/graphics/Matrix;

.field private name:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/zykj/paint/graphic/Graph;->isVisable:Z

    .line 6
    .line 7
    new-instance v0, Landroid/graphics/Matrix;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/zykj/paint/graphic/Graph;->graphMatrix:Landroid/graphics/Matrix;

    .line 13
    .line 14
    new-instance v0, Landroid/graphics/Matrix;

    .line 15
    .line 16
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/zykj/paint/graphic/Graph;->matrix:Landroid/graphics/Matrix;

    .line 20
    .line 21
    new-instance v0, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lcom/zykj/paint/graphic/Graph;->graphs:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/zykj/paint/graphic/Graph;->getBoundBox()Lcom/zykj/paint/data/Rect2D;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lcom/zykj/paint/graphic/Graph;->mBoundBox:Lcom/zykj/paint/data/Rect2D;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public addGraph(Lcom/zykj/paint/graphic/Graph;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/graphic/Graph;->graphs:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public abstract directRender(Lcom/zykj/paint/render/MapRender;Landroid/graphics/Canvas;)V
.end method

.method public getBaseColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/paint/graphic/Graph;->baseColor:I

    .line 2
    .line 3
    return v0
.end method

.method public abstract getBoundBox()Lcom/zykj/paint/data/Rect2D;
.end method

.method public getGraphs()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/zykj/paint/graphic/Graph;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/graphic/Graph;->graphs:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/graphic/Graph;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hide(I)V
    .locals 0

    return-void
.end method

.method public isVisable()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/paint/graphic/Graph;->isVisable:Z

    .line 2
    .line 3
    return v0
.end method

.method public abstract render(Lcom/zykj/paint/render/MapRender;)V
.end method

.method public abstract render(Lcom/zykj/paint/render/MapRender;Lcom/zykj/paint/data/Rect2D;)V
.end method

.method public setBaseColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/paint/graphic/Graph;->baseColor:I

    .line 2
    .line 3
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/graphic/Graph;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setVisable(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/paint/graphic/Graph;->isVisable:Z

    .line 2
    .line 3
    return-void
.end method

.method public updateMatrix()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/graphic/Graph;->graphMatrix:Landroid/graphics/Matrix;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/paint/graphic/Graph;->matrix:Landroid/graphics/Matrix;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 6
    .line 7
    .line 8
    new-instance v0, Landroid/graphics/Matrix;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/zykj/paint/graphic/Graph;->matrix:Landroid/graphics/Matrix;

    .line 14
    .line 15
    return-void
.end method
