.class public final Lcom/zykj/mistake/feature/notebook/list/l1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:F

.field public final c:F

.field public final d:J

.field public final e:I


# direct methods
.method public constructor <init>(Ljava/lang/String;FFJI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/list/l1;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, Lcom/zykj/mistake/feature/notebook/list/l1;->b:F

    .line 7
    .line 8
    iput p3, p0, Lcom/zykj/mistake/feature/notebook/list/l1;->c:F

    .line 9
    .line 10
    iput-wide p4, p0, Lcom/zykj/mistake/feature/notebook/list/l1;->d:J

    .line 11
    .line 12
    iput p6, p0, Lcom/zykj/mistake/feature/notebook/list/l1;->e:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/mistake/feature/notebook/list/l1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/mistake/feature/notebook/list/l1;

    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/list/l1;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/list/l1;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/mistake/feature/notebook/list/l1;->b:F

    iget v3, p1, Lcom/zykj/mistake/feature/notebook/list/l1;->b:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/zykj/mistake/feature/notebook/list/l1;->c:F

    iget v3, p1, Lcom/zykj/mistake/feature/notebook/list/l1;->c:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/zykj/mistake/feature/notebook/list/l1;->d:J

    iget-wide v5, p1, Lcom/zykj/mistake/feature/notebook/list/l1;->d:J

    invoke-static {v3, v4, v5, v6}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/zykj/mistake/feature/notebook/list/l1;->e:I

    iget p1, p1, Lcom/zykj/mistake/feature/notebook/list/l1;->e:I

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/list/l1;->a:Ljava/lang/String;

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
    iget v2, p0, Lcom/zykj/mistake/feature/notebook/list/l1;->b:F

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->b(FII)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lcom/zykj/mistake/feature/notebook/list/l1;->c:F

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->b(FII)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v2, p0, Lcom/zykj/mistake/feature/notebook/list/l1;->d:J

    .line 23
    .line 24
    invoke-static {v2, v3, v0, v1}, Landroidx/collection/a;->e(JII)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v1, p0, Lcom/zykj/mistake/feature/notebook/list/l1;->e:I

    .line 29
    .line 30
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    add-int/2addr v1, v0

    .line 35
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-wide v0, p0, Lcom/zykj/mistake/feature/notebook/list/l1;->d:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/Color;->toString-impl(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v2, "MistakeTagDrawInfo(text="

    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/list/l1;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v2, ", x="

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget v2, p0, Lcom/zykj/mistake/feature/notebook/list/l1;->b:F

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v2, ", width="

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget v2, p0, Lcom/zykj/mistake/feature/notebook/list/l1;->c:F

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v2, ", backgroundColor="

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v0, ", textColor="

    .line 48
    .line 49
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v0, ")"

    .line 53
    .line 54
    iget v2, p0, Lcom/zykj/mistake/feature/notebook/list/l1;->e:I

    .line 55
    .line 56
    invoke-static {v1, v0, v2}, Landroid/support/v4/media/f;->o(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    return-object v0
.end method
