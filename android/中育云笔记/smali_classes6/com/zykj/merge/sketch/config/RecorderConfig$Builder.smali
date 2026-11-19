.class public final Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/merge/sketch/config/RecorderConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
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
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;->sourcePath:Ljava/lang/String;

    .line 5
    .line 6
    const/4 p1, 0x3

    .line 7
    iput p1, p0, Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;->maxImageCount:I

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final build()Lcom/zykj/merge/sketch/config/RecorderConfig;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/merge/sketch/config/RecorderConfig;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/merge/sketch/config/RecorderConfig;-><init>(Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final getMaxImageCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;->maxImageCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getPaintColor()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;->paintColor:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPaintWidth()Ljava/lang/Float;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;->paintWidth:Ljava/lang/Float;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getShapeType()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;->shapeType:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSourcePath()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;->sourcePath:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isRecord()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;->isRecord:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isTouchable()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;->isTouchable:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setMaxImageCount(I)Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;
    .locals 0

    .line 2
    iput p1, p0, Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;->maxImageCount:I

    return-object p0
.end method

.method public final setMaxImageCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;->maxImageCount:I

    return-void
.end method

.method public final setPaintColor(Ljava/lang/Integer;)Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;->paintColor:Ljava/lang/Integer;

    return-object p0
.end method

.method public final setPaintColor(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;->paintColor:Ljava/lang/Integer;

    return-void
.end method

.method public final setPaintWidth(Ljava/lang/Float;)Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;->paintWidth:Ljava/lang/Float;

    return-object p0
.end method

.method public final setPaintWidth(Ljava/lang/Float;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;->paintWidth:Ljava/lang/Float;

    return-void
.end method

.method public final setRecord(Ljava/lang/Boolean;)Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;->isRecord:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final setRecord(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;->isRecord:Ljava/lang/Boolean;

    return-void
.end method

.method public final setShapeType(Ljava/lang/Integer;)Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;->shapeType:Ljava/lang/Integer;

    return-object p0
.end method

.method public final setShapeType(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;->shapeType:Ljava/lang/Integer;

    return-void
.end method

.method public final setSourcePath(Ljava/lang/String;)Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;
    .locals 1

    const-string v0, "sourcePath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;->sourcePath:Ljava/lang/String;

    return-object p0
.end method

.method public final setSourcePath(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;->sourcePath:Ljava/lang/String;

    return-void
.end method

.method public final setTouchable(Ljava/lang/Boolean;)Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;->isTouchable:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final setTouchable(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;->isTouchable:Ljava/lang/Boolean;

    return-void
.end method
