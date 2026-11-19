.class public final Lcom/zykj/blackboard/bean/BackgroundLineConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;
    }
.end annotation


# instance fields
.field public a:I

.field public b:F

.field public c:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

.field public d:F


# direct methods
.method public constructor <init>(IFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;F)V
    .locals 1

    const-string v0, "lineType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->a:I

    .line 3
    iput p2, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->b:F

    .line 4
    iput-object p3, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->c:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 5
    iput p4, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->d:F

    return-void
.end method

.method public synthetic constructor <init>(IFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;FILkotlin/jvm/internal/n;)V
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

    .line 6
    sget-object p3, Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;->c:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    const/high16 p4, 0x40400000    # 3.0f

    .line 7
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;-><init>(IFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;F)V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public final b()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->b:F

    .line 2
    .line 3
    return v0
.end method

.method public final c()Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->c:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->d:F

    .line 2
    .line 3
    return v0
.end method

.method public final e(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->a:I

    .line 2
    .line 3
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    iget v1, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->a:I

    iget v3, p1, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->b:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget v3, p1, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->b:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->c:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    iget-object v3, p1, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->c:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->d:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget p1, p1, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->d:F

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final f(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->b:F

    .line 2
    .line 3
    return-void
.end method

.method public final g(Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->c:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 7
    .line 8
    return-void
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->b:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->c:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->d:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BackgroundLineConfig(lineColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", lineSpace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->b:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", lineType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->c:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lineWidth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->d:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
