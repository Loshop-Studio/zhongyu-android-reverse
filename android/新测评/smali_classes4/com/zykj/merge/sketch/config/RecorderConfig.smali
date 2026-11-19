.class public final Lcom/zykj/merge/sketch/config/RecorderConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0010\u0007\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001:\u0001)B\u000f\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\u0008\u0005\u0010\u0007\"\u0004\u0008\u0008\u0010\tR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\u0008\u000b\u0010\u0007\"\u0004\u0008\u000c\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001eR\u001e\u0010 \u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\u0008!\u0010\u0015\"\u0004\u0008\"\u0010\u0017R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008%\u0010&\"\u0004\u0008\'\u0010(\u00a8\u0006*"
    }
    d2 = {
        "Lcom/zykj/merge/sketch/config/RecorderConfig;",
        "",
        "builder",
        "Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;",
        "(Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;)V",
        "isRecord",
        "",
        "()Ljava/lang/Boolean;",
        "setRecord",
        "(Ljava/lang/Boolean;)V",
        "Ljava/lang/Boolean;",
        "isTouchable",
        "setTouchable",
        "maxImageCount",
        "",
        "getMaxImageCount",
        "()I",
        "setMaxImageCount",
        "(I)V",
        "paintColor",
        "getPaintColor",
        "()Ljava/lang/Integer;",
        "setPaintColor",
        "(Ljava/lang/Integer;)V",
        "Ljava/lang/Integer;",
        "paintWidth",
        "",
        "getPaintWidth",
        "()Ljava/lang/Float;",
        "setPaintWidth",
        "(Ljava/lang/Float;)V",
        "Ljava/lang/Float;",
        "shapeType",
        "getShapeType",
        "setShapeType",
        "sourcePath",
        "",
        "getSourcePath",
        "()Ljava/lang/String;",
        "setSourcePath",
        "(Ljava/lang/String;)V",
        "Builder",
        "merge_release"
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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
