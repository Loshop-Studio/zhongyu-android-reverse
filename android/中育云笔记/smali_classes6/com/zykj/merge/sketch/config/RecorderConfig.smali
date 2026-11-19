.class public final Lcom/zykj/merge/sketch/config/RecorderConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;
    }
.end annotation


# instance fields
.field private isRecord:Ljava/lang/Boolean;

.field private isTouchable:Ljava/lang/Boolean;

.field private maxImageCount:I

.field private paintColor:Ljava/lang/Integer;

.field private paintWidth:Ljava/lang/Float;

.field private shapeType:Ljava/lang/Integer;

.field private sourcePath:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;)V
    .locals 1

    .line 1
    const-string v0, "builder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    iput v0, p0, Lcom/zykj/merge/sketch/config/RecorderConfig;->maxImageCount:I

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;->isRecord()Ljava/lang/Boolean;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lcom/zykj/merge/sketch/config/RecorderConfig;->isRecord:Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;->isTouchable()Ljava/lang/Boolean;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lcom/zykj/merge/sketch/config/RecorderConfig;->isTouchable:Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;->getSourcePath()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Lcom/zykj/merge/sketch/config/RecorderConfig;->sourcePath:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;->getPaintColor()Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lcom/zykj/merge/sketch/config/RecorderConfig;->paintColor:Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;->getShapeType()Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, Lcom/zykj/merge/sketch/config/RecorderConfig;->shapeType:Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;->getPaintWidth()Ljava/lang/Float;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcom/zykj/merge/sketch/config/RecorderConfig;->paintWidth:Ljava/lang/Float;

    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;->getMaxImageCount()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    iput p1, p0, Lcom/zykj/merge/sketch/config/RecorderConfig;->maxImageCount:I

    .line 53
    .line 54
    return-void
.end method


# virtual methods
.method public final getMaxImageCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/merge/sketch/config/RecorderConfig;->maxImageCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getPaintColor()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/config/RecorderConfig;->paintColor:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPaintWidth()Ljava/lang/Float;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/config/RecorderConfig;->paintWidth:Ljava/lang/Float;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getShapeType()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/config/RecorderConfig;->shapeType:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSourcePath()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/config/RecorderConfig;->sourcePath:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isRecord()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/config/RecorderConfig;->isRecord:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isTouchable()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/config/RecorderConfig;->isTouchable:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setMaxImageCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/merge/sketch/config/RecorderConfig;->maxImageCount:I

    .line 2
    .line 3
    return-void
.end method

.method public final setPaintColor(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/merge/sketch/config/RecorderConfig;->paintColor:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setPaintWidth(Ljava/lang/Float;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/merge/sketch/config/RecorderConfig;->paintWidth:Ljava/lang/Float;

    .line 2
    .line 3
    return-void
.end method

.method public final setRecord(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/merge/sketch/config/RecorderConfig;->isRecord:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-void
.end method

.method public final setShapeType(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/merge/sketch/config/RecorderConfig;->shapeType:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setSourcePath(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/merge/sketch/config/RecorderConfig;->sourcePath:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setTouchable(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/merge/sketch/config/RecorderConfig;->isTouchable:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-void
.end method
