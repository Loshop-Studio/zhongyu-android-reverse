.class public final Lcom/zykj/sketch/core/config/SketchConfig$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/sketch/core/config/SketchConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private isTouchable:Z

.field private maxImageCount:I

.field private sourcePath:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lcom/zykj/sketch/core/config/SketchConfig$Builder;->maxImageCount:I

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/zykj/sketch/core/config/SketchConfig$Builder;->isTouchable:Z

    .line 4
    const-string v0, ""

    iput-object v0, p0, Lcom/zykj/sketch/core/config/SketchConfig$Builder;->sourcePath:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/zykj/sketch/core/config/SketchConfig;)V
    .locals 1

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    .line 6
    iput v0, p0, Lcom/zykj/sketch/core/config/SketchConfig$Builder;->maxImageCount:I

    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/zykj/sketch/core/config/SketchConfig$Builder;->isTouchable:Z

    .line 8
    const-string v0, ""

    iput-object v0, p0, Lcom/zykj/sketch/core/config/SketchConfig$Builder;->sourcePath:Ljava/lang/String;

    .line 9
    invoke-virtual {p1}, Lcom/zykj/sketch/core/config/SketchConfig;->getMaxImageCount()I

    move-result v0

    iput v0, p0, Lcom/zykj/sketch/core/config/SketchConfig$Builder;->maxImageCount:I

    .line 10
    invoke-virtual {p1}, Lcom/zykj/sketch/core/config/SketchConfig;->isTouchable()Z

    move-result v0

    iput-boolean v0, p0, Lcom/zykj/sketch/core/config/SketchConfig$Builder;->isTouchable:Z

    .line 11
    invoke-virtual {p1}, Lcom/zykj/sketch/core/config/SketchConfig;->getSourcePath()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/sketch/core/config/SketchConfig$Builder;->sourcePath:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final build(Landroid/content/Context;)Lcom/zykj/sketch/core/config/SketchConfig;
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/sketch/core/config/SketchConfig;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, p1, v1}, Lcom/zykj/sketch/core/config/SketchConfig;-><init>(Lcom/zykj/sketch/core/config/SketchConfig$Builder;Landroid/content/Context;Lkotlin/jvm/internal/n;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final getMaxImageCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/core/config/SketchConfig$Builder;->maxImageCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSourcePath()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/config/SketchConfig$Builder;->sourcePath:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isTouchable()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/sketch/core/config/SketchConfig$Builder;->isTouchable:Z

    .line 2
    .line 3
    return v0
.end method

.method public final setMaxImageCount(I)Lcom/zykj/sketch/core/config/SketchConfig$Builder;
    .locals 0

    .line 2
    iput p1, p0, Lcom/zykj/sketch/core/config/SketchConfig$Builder;->maxImageCount:I

    return-object p0
.end method

.method public final setMaxImageCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/core/config/SketchConfig$Builder;->maxImageCount:I

    return-void
.end method

.method public final setSourcePath(Ljava/lang/String;)Lcom/zykj/sketch/core/config/SketchConfig$Builder;
    .locals 1

    const-string v0, "sourcePath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Lcom/zykj/sketch/core/config/SketchConfig$Builder;->sourcePath:Ljava/lang/String;

    return-object p0
.end method

.method public final setSourcePath(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/core/config/SketchConfig$Builder;->sourcePath:Ljava/lang/String;

    return-void
.end method

.method public final setTouchable(Z)Lcom/zykj/sketch/core/config/SketchConfig$Builder;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/zykj/sketch/core/config/SketchConfig$Builder;->isTouchable:Z

    return-object p0
.end method

.method public final setTouchable(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/sketch/core/config/SketchConfig$Builder;->isTouchable:Z

    return-void
.end method
