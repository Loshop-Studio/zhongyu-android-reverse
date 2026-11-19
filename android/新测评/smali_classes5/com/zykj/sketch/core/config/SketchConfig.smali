.class public final Lcom/zykj/sketch/core/config/SketchConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/core/config/SketchConfig$Builder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001:\u0001\u001dB\u0017\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\t\u0010\u000b\"\u0004\u0008\u000c\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0015\u0010\u0011\"\u0004\u0008\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/zykj/sketch/core/config/SketchConfig;",
        "",
        "builder",
        "Lcom/zykj/sketch/core/config/SketchConfig$Builder;",
        "context",
        "Landroid/content/Context;",
        "(Lcom/zykj/sketch/core/config/SketchConfig$Builder;Landroid/content/Context;)V",
        "getContext",
        "()Landroid/content/Context;",
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
        "maxPPTCount",
        "getMaxPPTCount",
        "setMaxPPTCount",
        "sourcePath",
        "",
        "getSourcePath",
        "()Ljava/lang/String;",
        "setSourcePath",
        "(Ljava/lang/String;)V",
        "Builder",
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
.field private final context:Landroid/content/Context;

.field private isTouchable:Z

.field private maxImageCount:I

.field private maxPPTCount:I

.field private sourcePath:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lcom/zykj/sketch/core/config/SketchConfig$Builder;Landroid/content/Context;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/zykj/sketch/core/config/SketchConfig;->context:Landroid/content/Context;

    const/4 v0, 0x3

    .line 3
    iput v0, p0, Lcom/zykj/sketch/core/config/SketchConfig;->maxImageCount:I

    const/4 v0, 0x1

    .line 4
    iput v0, p0, Lcom/zykj/sketch/core/config/SketchConfig;->maxPPTCount:I

    .line 5
    const-string v0, ""

    iput-object v0, p0, Lcom/zykj/sketch/core/config/SketchConfig;->sourcePath:Ljava/lang/String;

    .line 6
    invoke-virtual {p1}, Lcom/zykj/sketch/core/config/SketchConfig$Builder;->isTouchable()Z

    move-result v0

    iput-boolean v0, p0, Lcom/zykj/sketch/core/config/SketchConfig;->isTouchable:Z

    .line 7
    invoke-virtual {p1}, Lcom/zykj/sketch/core/config/SketchConfig$Builder;->getMaxImageCount()I

    move-result v0

    iput v0, p0, Lcom/zykj/sketch/core/config/SketchConfig;->maxImageCount:I

    .line 8
    invoke-virtual {p1}, Lcom/zykj/sketch/core/config/SketchConfig$Builder;->getSourcePath()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 9
    invoke-virtual {p1}, Lcom/zykj/sketch/core/config/SketchConfig$Builder;->getSourcePath()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/sketch/core/config/SketchConfig;->sourcePath:Ljava/lang/String;

    return-void

    .line 10
    :cond_0
    sget-object p1, Landroid/os/Environment;->DIRECTORY_DOCUMENTS:Ljava/lang/String;

    invoke-virtual {p2, p1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 11
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/sketch/core/config/SketchConfig;->sourcePath:Ljava/lang/String;

    :cond_1
    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/sketch/core/config/SketchConfig$Builder;Landroid/content/Context;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/sketch/core/config/SketchConfig;-><init>(Lcom/zykj/sketch/core/config/SketchConfig$Builder;Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final getContext()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/config/SketchConfig;->context:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMaxImageCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/core/config/SketchConfig;->maxImageCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getMaxPPTCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/core/config/SketchConfig;->maxPPTCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSourcePath()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/config/SketchConfig;->sourcePath:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isTouchable()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/sketch/core/config/SketchConfig;->isTouchable:Z

    .line 2
    .line 3
    return v0
.end method

.method public final setMaxImageCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/core/config/SketchConfig;->maxImageCount:I

    .line 2
    .line 3
    return-void
.end method

.method public final setMaxPPTCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/core/config/SketchConfig;->maxPPTCount:I

    .line 2
    .line 3
    return-void
.end method

.method public final setSourcePath(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/sketch/core/config/SketchConfig;->sourcePath:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final setTouchable(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/sketch/core/config/SketchConfig;->isTouchable:Z

    .line 2
    .line 3
    return-void
.end method
