.class public final Lcom/zykj/mistake/feature/ask/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlinx/serialization/Serializable;
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/mistake/feature/ask/w;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final g:[Ld6/e;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Lcom/zykj/mistake/feature/ask/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/mistake/feature/ask/w;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/mistake/feature/ask/x;->Companion:Lcom/zykj/mistake/feature/ask/w;

    .line 7
    .line 8
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 9
    .line 10
    new-instance v1, Landroidx/lifecycle/k;

    .line 11
    .line 12
    const/16 v2, 0x10

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
    const/4 v1, 0x6

    .line 22
    new-array v1, v1, [Ld6/e;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    const/4 v3, 0x0

    .line 26
    aput-object v3, v1, v2

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    aput-object v3, v1, v2

    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    aput-object v0, v1, v2

    .line 33
    .line 34
    const/4 v0, 0x3

    .line 35
    aput-object v3, v1, v0

    .line 36
    .line 37
    const/4 v0, 0x4

    .line 38
    aput-object v3, v1, v0

    .line 39
    .line 40
    const/4 v0, 0x5

    .line 41
    aput-object v3, v1, v0

    .line 42
    .line 43
    sput-object v1, Lcom/zykj/mistake/feature/ask/x;->g:[Ld6/e;

    .line 44
    .line 45
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/ask/c0;)V
    .locals 3

    and-int/lit8 v0, p1, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x7

    if-ne v2, v0, :cond_3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/zykj/mistake/feature/ask/x;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/zykj/mistake/feature/ask/x;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/zykj/mistake/feature/ask/x;->c:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;

    and-int/lit8 p2, p1, 0x8

    const-string p3, ""

    if-nez p2, :cond_0

    iput-object p3, p0, Lcom/zykj/mistake/feature/ask/x;->d:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p5, p0, Lcom/zykj/mistake/feature/ask/x;->d:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/zykj/mistake/feature/ask/x;->e:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p6, p0, Lcom/zykj/mistake/feature/ask/x;->e:Ljava/lang/String;

    :goto_1
    and-int/lit8 p1, p1, 0x20

    if-nez p1, :cond_2

    iput-object v1, p0, Lcom/zykj/mistake/feature/ask/x;->f:Lcom/zykj/mistake/feature/ask/c0;

    return-void

    :cond_2
    iput-object p7, p0, Lcom/zykj/mistake/feature/ask/x;->f:Lcom/zykj/mistake/feature/ask/c0;

    return-void

    :cond_3
    sget-object p2, Lcom/zykj/mistake/feature/ask/v;->a:Lcom/zykj/mistake/feature/ask/v;

    invoke-virtual {p2}, Lcom/zykj/mistake/feature/ask/v;->getDescriptor()Lk7/g;

    move-result-object p2

    invoke-static {p2, p1, v2}, Lm7/y0;->k(Lk7/g;II)V

    throw v1
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/ask/c0;I)V
    .locals 2

    and-int/lit8 v0, p7, 0x8

    .line 2
    const-string v1, ""

    if-eqz v0, :cond_0

    move-object p4, v1

    :cond_0
    and-int/lit8 v0, p7, 0x10

    if-eqz v0, :cond_1

    move-object p5, v1

    :cond_1
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_2

    const/4 p6, 0x0

    .line 3
    :cond_2
    const-string p7, "id"

    invoke-static {p1, p7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p7, "title"

    invoke-static {p2, p7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p7, "sourceType"

    invoke-static {p3, p7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p7, "imageSource"

    invoke-static {p4, p7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p7, "webUrl"

    invoke-static {p5, p7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/zykj/mistake/feature/ask/x;->a:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/zykj/mistake/feature/ask/x;->b:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lcom/zykj/mistake/feature/ask/x;->c:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;

    .line 8
    iput-object p4, p0, Lcom/zykj/mistake/feature/ask/x;->d:Ljava/lang/String;

    .line 9
    iput-object p5, p0, Lcom/zykj/mistake/feature/ask/x;->e:Ljava/lang/String;

    .line 10
    iput-object p6, p0, Lcom/zykj/mistake/feature/ask/x;->f:Lcom/zykj/mistake/feature/ask/c0;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/mistake/feature/ask/x;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/mistake/feature/ask/x;

    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/x;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/ask/x;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/x;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/ask/x;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/x;->c:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;

    iget-object v3, p1, Lcom/zykj/mistake/feature/ask/x;->c:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/x;->d:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/ask/x;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/x;->e:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/ask/x;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/x;->f:Lcom/zykj/mistake/feature/ask/c0;

    iget-object p1, p1, Lcom/zykj/mistake/feature/ask/x;->f:Lcom/zykj/mistake/feature/ask/c0;

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
    iget-object v0, p0, Lcom/zykj/mistake/feature/ask/x;->a:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/zykj/mistake/feature/ask/x;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lcom/zykj/mistake/feature/ask/x;->c:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;

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
    iget-object v0, p0, Lcom/zykj/mistake/feature/ask/x;->d:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v2, v1, v0}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v2, p0, Lcom/zykj/mistake/feature/ask/x;->e:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/x;->f:Lcom/zykj/mistake/feature/ask/c0;

    .line 37
    .line 38
    if-nez v1, :cond_0

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {v1}, Lcom/zykj/mistake/feature/ask/c0;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    :goto_0
    add-int/2addr v0, v1

    .line 47
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", title="

    .line 2
    .line 3
    const-string v1, ", sourceType="

    .line 4
    .line 5
    const-string v2, "Item(id="

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/mistake/feature/ask/x;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/mistake/feature/ask/x;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Landroid/support/v4/media/f;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/x;->c:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", imageSource="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/x;->d:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", webUrl="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/x;->e:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", textPayload="

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/x;->f:Lcom/zykj/mistake/feature/ask/c0;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ")"

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    return-object v0
.end method
