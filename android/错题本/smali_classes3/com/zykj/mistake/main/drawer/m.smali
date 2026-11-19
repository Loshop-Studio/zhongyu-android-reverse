.class public final Lcom/zykj/mistake/main/drawer/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:Z

.field public final d:Z

.field public final e:Z

.field public final f:Lr6/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZZLr6/a;I)V
    .locals 3

    .line 1
    and-int/lit8 v0, p5, 0x4

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p3, v1

    .line 7
    :cond_0
    and-int/lit8 v0, p5, 0x8

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    move v0, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    move v0, v2

    .line 15
    :goto_0
    and-int/lit8 p5, p5, 0x10

    .line 16
    .line 17
    if-eqz p5, :cond_2

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_2
    move v1, v2

    .line 21
    :goto_1
    const-string p5, "text"

    .line 22
    .line 23
    invoke-static {p1, p5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string p5, "onClick"

    .line 27
    .line 28
    invoke-static {p4, p5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lcom/zykj/mistake/main/drawer/m;->a:Ljava/lang/String;

    .line 35
    .line 36
    iput-boolean p2, p0, Lcom/zykj/mistake/main/drawer/m;->b:Z

    .line 37
    .line 38
    iput-boolean p3, p0, Lcom/zykj/mistake/main/drawer/m;->c:Z

    .line 39
    .line 40
    iput-boolean v0, p0, Lcom/zykj/mistake/main/drawer/m;->d:Z

    .line 41
    .line 42
    iput-boolean v1, p0, Lcom/zykj/mistake/main/drawer/m;->e:Z

    .line 43
    .line 44
    iput-object p4, p0, Lcom/zykj/mistake/main/drawer/m;->f:Lr6/a;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/mistake/main/drawer/m;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/mistake/main/drawer/m;

    iget-object v1, p0, Lcom/zykj/mistake/main/drawer/m;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/main/drawer/m;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/zykj/mistake/main/drawer/m;->b:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/main/drawer/m;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/zykj/mistake/main/drawer/m;->c:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/main/drawer/m;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/zykj/mistake/main/drawer/m;->d:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/main/drawer/m;->d:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/zykj/mistake/main/drawer/m;->e:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/main/drawer/m;->e:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/zykj/mistake/main/drawer/m;->f:Lr6/a;

    iget-object p1, p1, Lcom/zykj/mistake/main/drawer/m;->f:Lr6/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/main/drawer/m;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

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
    iget-boolean v2, p0, Lcom/zykj/mistake/main/drawer/m;->b:Z

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, Lcom/zykj/mistake/main/drawer/m;->c:Z

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, Lcom/zykj/mistake/main/drawer/m;->d:Z

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, Lcom/zykj/mistake/main/drawer/m;->e:Z

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v1, p0, Lcom/zykj/mistake/main/drawer/m;->f:Lr6/a;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    add-int/2addr v1, v0

    .line 41
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "NotebookFilterOption(text="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/zykj/mistake/main/drawer/m;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", selected="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, Lcom/zykj/mistake/main/drawer/m;->b:Z

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", wide="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", wrapContent="

    .line 29
    .line 30
    const-string v2, ", adaptiveWidth="

    .line 31
    .line 32
    iget-boolean v3, p0, Lcom/zykj/mistake/main/drawer/m;->c:Z

    .line 33
    .line 34
    iget-boolean v4, p0, Lcom/zykj/mistake/main/drawer/m;->d:Z

    .line 35
    .line 36
    invoke-static {v1, v2, v0, v3, v4}, Landroidx/compose/material3/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 37
    .line 38
    .line 39
    iget-boolean v1, p0, Lcom/zykj/mistake/main/drawer/m;->e:Z

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, ", onClick="

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Lcom/zykj/mistake/main/drawer/m;->f:Lr6/a;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, ")"

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    return-object v0
.end method
