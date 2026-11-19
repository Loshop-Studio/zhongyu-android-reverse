.class public final Lcom/zykj/view/board/board/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public final j:Lcom/zykj/view/board/board/g;


# direct methods
.method public constructor <init>(ZZZZZZZZZLcom/zykj/view/board/board/g;)V
    .locals 1

    .line 1
    const-string v0, "confirmButtonType"

    .line 2
    .line 3
    invoke-static {p10, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-boolean p1, p0, Lcom/zykj/view/board/board/d;->a:Z

    .line 10
    .line 11
    iput-boolean p2, p0, Lcom/zykj/view/board/board/d;->b:Z

    .line 12
    .line 13
    iput-boolean p3, p0, Lcom/zykj/view/board/board/d;->c:Z

    .line 14
    .line 15
    iput-boolean p4, p0, Lcom/zykj/view/board/board/d;->d:Z

    .line 16
    .line 17
    iput-boolean p5, p0, Lcom/zykj/view/board/board/d;->e:Z

    .line 18
    .line 19
    iput-boolean p6, p0, Lcom/zykj/view/board/board/d;->f:Z

    .line 20
    .line 21
    iput-boolean p7, p0, Lcom/zykj/view/board/board/d;->g:Z

    .line 22
    .line 23
    iput-boolean p8, p0, Lcom/zykj/view/board/board/d;->h:Z

    .line 24
    .line 25
    iput-boolean p9, p0, Lcom/zykj/view/board/board/d;->i:Z

    .line 26
    .line 27
    iput-object p10, p0, Lcom/zykj/view/board/board/d;->j:Lcom/zykj/view/board/board/g;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final a()Lcom/zykj/view/board/board/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/d;->j:Lcom/zykj/view/board/board/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/d;->i:Z

    .line 2
    .line 3
    return v0
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/d;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/d;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/d;->e:Z

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
    instance-of v1, p1, Lcom/zykj/view/board/board/d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/view/board/board/d;

    iget-boolean v1, p0, Lcom/zykj/view/board/board/d;->a:Z

    iget-boolean v3, p1, Lcom/zykj/view/board/board/d;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/zykj/view/board/board/d;->b:Z

    iget-boolean v3, p1, Lcom/zykj/view/board/board/d;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/zykj/view/board/board/d;->c:Z

    iget-boolean v3, p1, Lcom/zykj/view/board/board/d;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/zykj/view/board/board/d;->d:Z

    iget-boolean v3, p1, Lcom/zykj/view/board/board/d;->d:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/zykj/view/board/board/d;->e:Z

    iget-boolean v3, p1, Lcom/zykj/view/board/board/d;->e:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/zykj/view/board/board/d;->f:Z

    iget-boolean v3, p1, Lcom/zykj/view/board/board/d;->f:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/zykj/view/board/board/d;->g:Z

    iget-boolean v3, p1, Lcom/zykj/view/board/board/d;->g:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/zykj/view/board/board/d;->h:Z

    iget-boolean v3, p1, Lcom/zykj/view/board/board/d;->h:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/zykj/view/board/board/d;->i:Z

    iget-boolean v3, p1, Lcom/zykj/view/board/board/d;->i:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/zykj/view/board/board/d;->j:Lcom/zykj/view/board/board/g;

    iget-object p1, p1, Lcom/zykj/view/board/board/d;->j:Lcom/zykj/view/board/board/g;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/d;->h:Z

    .line 2
    .line 3
    return v0
.end method

.method public final g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/d;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public final h()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/d;->a:Z

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/zykj/view/board/board/d;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/view/board/board/d;->b:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/view/board/board/d;->c:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/view/board/board/d;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/view/board/board/d;->e:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/view/board/board/d;->f:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/view/board/board/d;->g:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/view/board/board/d;->h:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/view/board/board/d;->i:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/view/board/board/d;->j:Lcom/zykj/view/board/board/g;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/d;->g:Z

    .line 2
    .line 3
    return v0
.end method

.method public final j()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/d;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-boolean v0, p0, Lcom/zykj/view/board/board/d;->a:Z

    iget-boolean v1, p0, Lcom/zykj/view/board/board/d;->b:Z

    iget-boolean v2, p0, Lcom/zykj/view/board/board/d;->c:Z

    iget-boolean v3, p0, Lcom/zykj/view/board/board/d;->d:Z

    iget-boolean v4, p0, Lcom/zykj/view/board/board/d;->e:Z

    iget-boolean v5, p0, Lcom/zykj/view/board/board/d;->f:Z

    iget-boolean v6, p0, Lcom/zykj/view/board/board/d;->g:Z

    iget-boolean v7, p0, Lcom/zykj/view/board/board/d;->h:Z

    iget-boolean v8, p0, Lcom/zykj/view/board/board/d;->i:Z

    iget-object v9, p0, Lcom/zykj/view/board/board/d;->j:Lcom/zykj/view/board/board/g;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "BoardViewConfig(needRevoke="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", needZoom="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", needDot="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", needPenHighlighter="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", needGallery="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", needCamera="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", needText="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", needGraph="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", needBackgroundLine="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", confirmButtonType="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
