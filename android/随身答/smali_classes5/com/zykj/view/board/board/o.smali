.class public final Lcom/zykj/view/board/board/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/zykj/view/board/board/t;

.field public final b:Lcom/zykj/view/board/board/i;

.field public final c:Z

.field public final d:Z

.field public final e:F

.field public final f:F

.field public final g:Z

.field public final h:F

.field public final i:F


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/board/t;Lcom/zykj/view/board/board/i;ZZFFZFF)V
    .locals 1

    const-string v0, "minorToolType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmButtonType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/zykj/view/board/board/o;->a:Lcom/zykj/view/board/board/t;

    .line 3
    iput-object p2, p0, Lcom/zykj/view/board/board/o;->b:Lcom/zykj/view/board/board/i;

    .line 4
    iput-boolean p3, p0, Lcom/zykj/view/board/board/o;->c:Z

    .line 5
    iput-boolean p4, p0, Lcom/zykj/view/board/board/o;->d:Z

    .line 6
    iput p5, p0, Lcom/zykj/view/board/board/o;->e:F

    .line 7
    iput p6, p0, Lcom/zykj/view/board/board/o;->f:F

    .line 8
    iput-boolean p7, p0, Lcom/zykj/view/board/board/o;->g:Z

    .line 9
    iput p8, p0, Lcom/zykj/view/board/board/o;->h:F

    .line 10
    iput p9, p0, Lcom/zykj/view/board/board/o;->i:F

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/view/board/board/t;Lcom/zykj/view/board/board/i;ZZFFZFFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 3

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    .line 11
    sget-object p1, Lcom/zykj/view/board/board/t$d;->f:Lcom/zykj/view/board/board/t$d;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    .line 12
    sget-object p2, Lcom/zykj/view/board/board/i$b;->c:Lcom/zykj/view/board/board/i$b;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    const/4 p3, 0x0

    :cond_2
    and-int/lit8 p11, p10, 0x8

    const/4 v0, 0x1

    if-eqz p11, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p11, p10, 0x10

    const/4 v1, 0x0

    if-eqz p11, :cond_4

    move p5, v1

    :cond_4
    and-int/lit8 p11, p10, 0x20

    const/high16 v2, 0x3f800000    # 1.0f

    if-eqz p11, :cond_5

    move p6, v2

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    move p7, v0

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    move p8, v1

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    move p11, v2

    move p9, p7

    move p10, p8

    move p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    goto :goto_0

    :cond_8
    move p11, p9

    move p10, p8

    move p8, p6

    move p9, p7

    move p6, p4

    move p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 13
    :goto_0
    invoke-direct/range {p2 .. p11}, Lcom/zykj/view/board/board/o;-><init>(Lcom/zykj/view/board/board/t;Lcom/zykj/view/board/board/i;ZZFFZFF)V

    return-void
.end method

.method public static synthetic b(Lcom/zykj/view/board/board/o;Lcom/zykj/view/board/board/t;Lcom/zykj/view/board/board/i;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/o;
    .locals 0

    .line 1
    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/zykj/view/board/board/o;->a:Lcom/zykj/view/board/board/t;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/zykj/view/board/board/o;->b:Lcom/zykj/view/board/board/i;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-boolean p3, p0, Lcom/zykj/view/board/board/o;->c:Z

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-boolean p4, p0, Lcom/zykj/view/board/board/o;->d:Z

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget p5, p0, Lcom/zykj/view/board/board/o;->e:F

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget p6, p0, Lcom/zykj/view/board/board/o;->f:F

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-boolean p7, p0, Lcom/zykj/view/board/board/o;->g:Z

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget p8, p0, Lcom/zykj/view/board/board/o;->h:F

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget p9, p0, Lcom/zykj/view/board/board/o;->i:F

    :cond_8
    move p10, p8

    move p11, p9

    move p8, p6

    move p9, p7

    move p6, p4

    move p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/zykj/view/board/board/o;->a(Lcom/zykj/view/board/board/t;Lcom/zykj/view/board/board/i;ZZFFZFF)Lcom/zykj/view/board/board/o;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/zykj/view/board/board/t;Lcom/zykj/view/board/board/i;ZZFFZFF)Lcom/zykj/view/board/board/o;
    .locals 11

    .line 1
    const-string v0, "minorToolType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmButtonType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/view/board/board/o;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/zykj/view/board/board/o;-><init>(Lcom/zykj/view/board/board/t;Lcom/zykj/view/board/board/i;ZZFFZFF)V

    return-object v1
.end method

.method public final c()Lcom/zykj/view/board/board/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/o;->b:Lcom/zykj/view/board/board/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/o;->h:F

    .line 2
    .line 3
    return v0
.end method

.method public final e()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/o;->i:F

    .line 2
    .line 3
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/view/board/board/o;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/view/board/board/o;

    iget-object v1, p0, Lcom/zykj/view/board/board/o;->a:Lcom/zykj/view/board/board/t;

    iget-object v3, p1, Lcom/zykj/view/board/board/o;->a:Lcom/zykj/view/board/board/t;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/view/board/board/o;->b:Lcom/zykj/view/board/board/i;

    iget-object v3, p1, Lcom/zykj/view/board/board/o;->b:Lcom/zykj/view/board/board/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/zykj/view/board/board/o;->c:Z

    iget-boolean v3, p1, Lcom/zykj/view/board/board/o;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/zykj/view/board/board/o;->d:Z

    iget-boolean v3, p1, Lcom/zykj/view/board/board/o;->d:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/zykj/view/board/board/o;->e:F

    iget v3, p1, Lcom/zykj/view/board/board/o;->e:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/zykj/view/board/board/o;->f:F

    iget v3, p1, Lcom/zykj/view/board/board/o;->f:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/zykj/view/board/board/o;->g:Z

    iget-boolean v3, p1, Lcom/zykj/view/board/board/o;->g:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/zykj/view/board/board/o;->h:F

    iget v3, p1, Lcom/zykj/view/board/board/o;->h:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/zykj/view/board/board/o;->i:F

    iget p1, p1, Lcom/zykj/view/board/board/o;->i:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final f()Lcom/zykj/view/board/board/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/o;->a:Lcom/zykj/view/board/board/t;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/o;->e:F

    .line 2
    .line 3
    return v0
.end method

.method public final h()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/o;->f:F

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/zykj/view/board/board/o;->a:Lcom/zykj/view/board/board/t;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/view/board/board/o;->b:Lcom/zykj/view/board/board/i;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/view/board/board/o;->c:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/view/board/board/o;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/view/board/board/o;->e:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/view/board/board/o;->f:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/view/board/board/o;->g:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/view/board/board/o;->h:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/view/board/board/o;->i:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/o;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public final j()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/o;->g:Z

    .line 2
    .line 3
    return v0
.end method

.method public final k()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/o;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/zykj/view/board/board/o;->a:Lcom/zykj/view/board/board/t;

    iget-object v1, p0, Lcom/zykj/view/board/board/o;->b:Lcom/zykj/view/board/board/i;

    iget-boolean v2, p0, Lcom/zykj/view/board/board/o;->c:Z

    iget-boolean v3, p0, Lcom/zykj/view/board/board/o;->d:Z

    iget v4, p0, Lcom/zykj/view/board/board/o;->e:F

    iget v5, p0, Lcom/zykj/view/board/board/o;->f:F

    iget-boolean v6, p0, Lcom/zykj/view/board/board/o;->g:Z

    iget v7, p0, Lcom/zykj/view/board/board/o;->h:F

    iget v8, p0, Lcom/zykj/view/board/board/o;->i:F

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "ExtraUIState(minorToolType="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", confirmButtonType="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isDeleteDraftVisible="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isVerticalProgressTouchable="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", verticalProgress="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", verticalThumbTime="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", isHorizontalProgressTouchable="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", horizontalProgress="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", horizontalThumbTime="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
