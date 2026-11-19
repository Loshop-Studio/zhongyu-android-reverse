.class public final Lcom/zykj/mistake/feature/collection/filter/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlinx/serialization/Serializable;
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/mistake/feature/collection/filter/k;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final j:[Ld6/e;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:I

.field public final e:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

.field public final f:I

.field public final g:I

.field public final h:Z

.field public final i:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/mistake/feature/collection/filter/k;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/mistake/feature/collection/filter/l;->Companion:Lcom/zykj/mistake/feature/collection/filter/k;

    .line 7
    .line 8
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 9
    .line 10
    new-instance v1, Landroidx/lifecycle/k;

    .line 11
    .line 12
    const/16 v2, 0x13

    .line 13
    .line 14
    invoke-direct {v1, v2}, Landroidx/lifecycle/k;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lr6/a;)Ld6/e;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/16 v1, 0x9

    .line 22
    .line 23
    new-array v1, v1, [Ld6/e;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    const/4 v3, 0x0

    .line 27
    aput-object v3, v1, v2

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    aput-object v3, v1, v2

    .line 31
    .line 32
    const/4 v2, 0x2

    .line 33
    aput-object v3, v1, v2

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    aput-object v3, v1, v2

    .line 37
    .line 38
    const/4 v2, 0x4

    .line 39
    aput-object v3, v1, v2

    .line 40
    .line 41
    const/4 v2, 0x5

    .line 42
    aput-object v3, v1, v2

    .line 43
    .line 44
    const/4 v2, 0x6

    .line 45
    aput-object v3, v1, v2

    .line 46
    .line 47
    const/4 v2, 0x7

    .line 48
    aput-object v3, v1, v2

    .line 49
    .line 50
    const/16 v2, 0x8

    .line 51
    .line 52
    aput-object v0, v1, v2

    .line 53
    .line 54
    sput-object v1, Lcom/zykj/mistake/feature/collection/filter/l;->j:[Ld6/e;

    .line 55
    .line 56
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;IIZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x1

    if-nez v0, :cond_0

    .line 2
    const-string p2, ""

    .line 3
    :cond_0
    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/filter/l;->a:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    .line 4
    const-string p2, "\u9519\u9898\u96c6"

    .line 5
    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/filter/l;->b:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/zykj/mistake/feature/collection/filter/l;->b:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_2

    iput p3, p0, Lcom/zykj/mistake/feature/collection/filter/l;->c:I

    goto :goto_1

    :cond_2
    iput p4, p0, Lcom/zykj/mistake/feature/collection/filter/l;->c:I

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    const/16 p2, 0x64

    iput p2, p0, Lcom/zykj/mistake/feature/collection/filter/l;->d:I

    goto :goto_2

    :cond_3
    iput p5, p0, Lcom/zykj/mistake/feature/collection/filter/l;->d:I

    :goto_2
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    .line 6
    new-instance p2, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    invoke-direct {p2}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;-><init>()V

    .line 7
    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/filter/l;->e:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    goto :goto_3

    :cond_4
    iput-object p6, p0, Lcom/zykj/mistake/feature/collection/filter/l;->e:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    :goto_3
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput p3, p0, Lcom/zykj/mistake/feature/collection/filter/l;->f:I

    goto :goto_4

    :cond_5
    iput p7, p0, Lcom/zykj/mistake/feature/collection/filter/l;->f:I

    :goto_4
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    const/4 p2, 0x1

    iput p2, p0, Lcom/zykj/mistake/feature/collection/filter/l;->g:I

    goto :goto_5

    :cond_6
    iput p8, p0, Lcom/zykj/mistake/feature/collection/filter/l;->g:I

    :goto_5
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    iput-boolean p3, p0, Lcom/zykj/mistake/feature/collection/filter/l;->h:Z

    goto :goto_6

    :cond_7
    iput-boolean p9, p0, Lcom/zykj/mistake/feature/collection/filter/l;->h:Z

    :goto_6
    and-int/lit16 p1, p1, 0x100

    if-nez p1, :cond_8

    .line 8
    sget-object p1, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;->CREATE_COLLECTION:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    .line 9
    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/filter/l;->i:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    return-void

    :cond_8
    iput-object p10, p0, Lcom/zykj/mistake/feature/collection/filter/l;->i:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;IIZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;)V
    .locals 1

    const-string v0, "sourceType"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/filter/l;->a:Ljava/lang/String;

    .line 12
    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/filter/l;->b:Ljava/lang/String;

    .line 13
    iput p3, p0, Lcom/zykj/mistake/feature/collection/filter/l;->c:I

    const/16 p1, 0x64

    .line 14
    iput p1, p0, Lcom/zykj/mistake/feature/collection/filter/l;->d:I

    .line 15
    iput-object p4, p0, Lcom/zykj/mistake/feature/collection/filter/l;->e:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 16
    iput p5, p0, Lcom/zykj/mistake/feature/collection/filter/l;->f:I

    .line 17
    iput p6, p0, Lcom/zykj/mistake/feature/collection/filter/l;->g:I

    .line 18
    iput-boolean p7, p0, Lcom/zykj/mistake/feature/collection/filter/l;->h:Z

    .line 19
    iput-object p8, p0, Lcom/zykj/mistake/feature/collection/filter/l;->i:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/mistake/feature/collection/filter/l;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/mistake/feature/collection/filter/l;

    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/l;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/collection/filter/l;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/l;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/collection/filter/l;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/zykj/mistake/feature/collection/filter/l;->c:I

    iget v3, p1, Lcom/zykj/mistake/feature/collection/filter/l;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/zykj/mistake/feature/collection/filter/l;->d:I

    iget v3, p1, Lcom/zykj/mistake/feature/collection/filter/l;->d:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/l;->e:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    iget-object v3, p1, Lcom/zykj/mistake/feature/collection/filter/l;->e:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/zykj/mistake/feature/collection/filter/l;->f:I

    iget v3, p1, Lcom/zykj/mistake/feature/collection/filter/l;->f:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/zykj/mistake/feature/collection/filter/l;->g:I

    iget v3, p1, Lcom/zykj/mistake/feature/collection/filter/l;->g:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/filter/l;->h:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/collection/filter/l;->h:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/l;->i:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    iget-object p1, p1, Lcom/zykj/mistake/feature/collection/filter/l;->i:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    if-eq v1, p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/filter/l;->a:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/filter/l;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lcom/zykj/mistake/feature/collection/filter/l;->c:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, Lcom/zykj/mistake/feature/collection/filter/l;->d:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/filter/l;->e:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    add-int/2addr v2, v0

    .line 35
    mul-int/2addr v2, v1

    .line 36
    iget v0, p0, Lcom/zykj/mistake/feature/collection/filter/l;->f:I

    .line 37
    .line 38
    invoke-static {v0, v2, v1}, Landroidx/collection/a;->c(III)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget v2, p0, Lcom/zykj/mistake/feature/collection/filter/l;->g:I

    .line 43
    .line 44
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/collection/filter/l;->h:Z

    .line 49
    .line 50
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/l;->i:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    add-int/2addr v1, v0

    .line 61
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", title="

    .line 2
    .line 3
    const-string v1, ", currentCount="

    .line 4
    .line 5
    const-string v2, "Args(collectionId="

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/mistake/feature/collection/filter/l;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/mistake/feature/collection/filter/l;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Landroid/support/v4/media/f;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", capacity="

    .line 16
    .line 17
    const-string v2, ", mistakeListReq="

    .line 18
    .line 19
    iget v3, p0, Lcom/zykj/mistake/feature/collection/filter/l;->c:I

    .line 20
    .line 21
    iget v4, p0, Lcom/zykj/mistake/feature/collection/filter/l;->d:I

    .line 22
    .line 23
    invoke-static {v0, v3, v1, v4, v2}, Landroidx/compose/material3/c;->w(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/l;->e:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, ", currentCollectionType="

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget v1, p0, Lcom/zykj/mistake/feature/collection/filter/l;->f:I

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, ", otherCollectionType="

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget v1, p0, Lcom/zykj/mistake/feature/collection/filter/l;->g:I

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v1, ", showCurrentCollectionFilter="

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/filter/l;->h:Z

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v1, ", sourceType="

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/l;->i:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v1, ")"

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    return-object v0
.end method
