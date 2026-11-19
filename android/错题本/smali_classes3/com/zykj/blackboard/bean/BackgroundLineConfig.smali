.class public final Lcom/zykj/blackboard/bean/BackgroundLineConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001:\u0001#B-\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J1\u0010\u001c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u0008\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0016\u0010\u000f\"\u0004\u0008\u0017\u0010\u0011\u00a8\u0006$"
    }
    d2 = {
        "Lcom/zykj/blackboard/bean/BackgroundLineConfig;",
        "",
        "lineColor",
        "",
        "lineSpace",
        "",
        "lineType",
        "Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;",
        "lineWidth",
        "(IFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;F)V",
        "getLineColor",
        "()I",
        "setLineColor",
        "(I)V",
        "getLineSpace",
        "()F",
        "setLineSpace",
        "(F)V",
        "getLineType",
        "()Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;",
        "setLineType",
        "(Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;)V",
        "getLineWidth",
        "setLineWidth",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "",
        "BackgroundLineType",
        "blackboard_release"
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
.field private lineColor:I

.field private lineSpace:F

.field private lineType:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private lineWidth:F


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;-><init>(IFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;FILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(IFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;F)V
    .locals 1
    .param p3    # Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "lineType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineColor:I

    .line 4
    iput p2, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineSpace:F

    .line 5
    iput-object p3, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineType:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 6
    iput p4, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineWidth:F

    return-void
.end method

.method public synthetic constructor <init>(IFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;FILkotlin/jvm/internal/e;)V
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    const/high16 p2, 0x42c00000    # 96.0f

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    .line 7
    sget-object p3, Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;->Horizontal:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    const/high16 p4, 0x40400000    # 3.0f

    .line 8
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;-><init>(IFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;F)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/blackboard/bean/BackgroundLineConfig;IFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;FILjava/lang/Object;)Lcom/zykj/blackboard/bean/BackgroundLineConfig;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineColor:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineSpace:F

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineType:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget p4, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineWidth:F

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->copy(IFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;F)Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineColor:I

    return v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineSpace:F

    return v0
.end method

.method public final component3()Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineType:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    return-object v0
.end method

.method public final component4()F
    .locals 1

    iget v0, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineWidth:F

    return v0
.end method

.method public final copy(IFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;F)Lcom/zykj/blackboard/bean/BackgroundLineConfig;
    .locals 1
    .param p3    # Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "lineType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;-><init>(IFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;F)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 12
    .line 13
    iget v1, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineColor:I

    .line 14
    .line 15
    iget v3, p1, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineColor:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget v1, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineSpace:F

    .line 21
    .line 22
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget v3, p1, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineSpace:F

    .line 27
    .line 28
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_3

    .line 37
    .line 38
    return v2

    .line 39
    :cond_3
    iget-object v1, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineType:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 40
    .line 41
    iget-object v3, p1, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineType:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 42
    .line 43
    if-eq v1, v3, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget v1, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineWidth:F

    .line 47
    .line 48
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iget p1, p1, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineWidth:F

    .line 53
    .line 54
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-nez p1, :cond_5

    .line 63
    .line 64
    return v2

    .line 65
    :cond_5
    return v0
.end method

.method public final getLineColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineColor:I

    .line 2
    .line 3
    return v0
.end method

.method public final getLineSpace()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineSpace:F

    .line 2
    .line 3
    return v0
.end method

.method public final getLineType()Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineType:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLineWidth()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineWidth:F

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineColor:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget v2, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineSpace:F

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->b(FII)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineType:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/2addr v2, v0

    .line 23
    mul-int/2addr v2, v1

    .line 24
    iget v0, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineWidth:F

    .line 25
    .line 26
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    add-int/2addr v0, v2

    .line 31
    return v0
.end method

.method public final setLineColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineColor:I

    .line 2
    .line 3
    return-void
.end method

.method public final setLineSpace(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineSpace:F

    .line 2
    .line 3
    return-void
.end method

.method public final setLineType(Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineType:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 7
    .line 8
    return-void
.end method

.method public final setLineWidth(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineWidth:F

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "BackgroundLineConfig(lineColor="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineColor:I

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", lineSpace="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineSpace:F

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", lineType="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineType:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", lineWidth="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget v1, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->lineWidth:F

    .line 39
    .line 40
    const/16 v2, 0x29

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->p(Ljava/lang/StringBuilder;FC)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0
.end method
