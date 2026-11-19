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

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u0008\u0016\u00a2\u0006\u0002\u0010\u0002B\u000f\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u000cJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0008\"\u0004\u0008\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u000cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/zykj/sketch/core/config/SketchConfig$Builder;",
        "",
        "()V",
        "config",
        "Lcom/zykj/sketch/core/config/SketchConfig;",
        "(Lcom/zykj/sketch/core/config/SketchConfig;)V",
        "isTouchable",
        "",
        "()Z",
        "setTouchable",
        "(Z)V",
        "maxImageCount",
        "",
        "getMaxImageCount",
        "()I",
        "setMaxImageCount",
        "(I)V",
        "sourcePath",
        "",
        "getSourcePath",
        "()Ljava/lang/String;",
        "setSourcePath",
        "(Ljava/lang/String;)V",
        "build",
        "context",
        "Landroid/content/Context;",
        "sketch_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
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

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/sketch/core/config/SketchConfig;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, p1, v1}, Lcom/zykj/sketch/core/config/SketchConfig;-><init>(Lcom/zykj/sketch/core/config/SketchConfig$Builder;Landroid/content/Context;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Lcom/zykj/sketch/core/config/SketchConfig$Builder;->sourcePath:Ljava/lang/String;

    return-object p0
.end method

.method public final setSourcePath(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
