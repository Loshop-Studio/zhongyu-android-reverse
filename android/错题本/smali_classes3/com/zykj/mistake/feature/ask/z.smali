.class public final Lcom/zykj/mistake/feature/ask/z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

.field public final c:I

.field public final d:I


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;II)V
    .locals 1

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    .line 6
    sget-object p1, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    :cond_0
    and-int/lit8 v0, p4, 0x2

    if-eqz v0, :cond_1

    .line 7
    sget-object p2, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;->STEM:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    const/4 p3, 0x0

    :cond_2
    const/4 p4, 0x5

    .line 8
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/zykj/mistake/feature/ask/z;-><init>(Ljava/util/List;Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;II)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;II)V
    .locals 1

    const-string v0, "groups"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/zykj/mistake/feature/ask/z;->a:Ljava/util/List;

    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/ask/z;->b:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 4
    iput p3, p0, Lcom/zykj/mistake/feature/ask/z;->c:I

    .line 5
    iput p4, p0, Lcom/zykj/mistake/feature/ask/z;->d:I

    return-void
.end method

.method public static a(Lcom/zykj/mistake/feature/ask/z;Ljava/util/ArrayList;Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;II)Lcom/zykj/mistake/feature/ask/z;
    .locals 1

    .line 1
    and-int/lit8 v0, p4, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/zykj/mistake/feature/ask/z;->a:Ljava/util/List;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 v0, p4, 0x2

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lcom/zykj/mistake/feature/ask/z;->b:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 14
    .line 15
    if-eqz p4, :cond_2

    .line 16
    .line 17
    iget p3, p0, Lcom/zykj/mistake/feature/ask/z;->c:I

    .line 18
    .line 19
    :cond_2
    iget p4, p0, Lcom/zykj/mistake/feature/ask/z;->d:I

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    const-string p0, "groups"

    .line 28
    .line 29
    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string p0, "selectedType"

    .line 33
    .line 34
    invoke-static {p2, p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    new-instance p0, Lcom/zykj/mistake/feature/ask/z;

    .line 38
    .line 39
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/zykj/mistake/feature/ask/z;-><init>(Ljava/util/List;Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;II)V

    .line 40
    .line 41
    .line 42
    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/mistake/feature/ask/z;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/zykj/mistake/feature/ask/z;

    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/z;->a:Ljava/util/List;

    iget-object v2, p1, Lcom/zykj/mistake/feature/ask/z;->a:Ljava/util/List;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/z;->b:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    iget-object v2, p1, Lcom/zykj/mistake/feature/ask/z;->b:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    if-eq v1, v2, :cond_3

    goto :goto_0

    :cond_3
    iget v1, p0, Lcom/zykj/mistake/feature/ask/z;->c:I

    iget v2, p1, Lcom/zykj/mistake/feature/ask/z;->c:I

    if-eq v1, v2, :cond_4

    goto :goto_0

    :cond_4
    iget v1, p0, Lcom/zykj/mistake/feature/ask/z;->d:I

    iget p1, p1, Lcom/zykj/mistake/feature/ask/z;->d:I

    if-eq v1, p1, :cond_5

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/ask/z;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

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
    iget-object v2, p0, Lcom/zykj/mistake/feature/ask/z;->b:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget v0, p0, Lcom/zykj/mistake/feature/ask/z;->c:I

    .line 19
    .line 20
    invoke-static {v0, v2, v1}, Landroidx/collection/a;->c(III)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget v2, p0, Lcom/zykj/mistake/feature/ask/z;->d:I

    .line 25
    .line 26
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    add-int/2addr v1, v0

    .line 36
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "State(groups="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/z;->a:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", selectedType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/z;->b:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", selectedCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/zykj/mistake/feature/ask/z;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", maxSelectedCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/zykj/mistake/feature/ask/z;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isPreparing=false)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
