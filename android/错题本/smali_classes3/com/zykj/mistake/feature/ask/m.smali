.class public final Lcom/zykj/mistake/feature/ask/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlinx/serialization/Serializable;
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/mistake/feature/ask/l;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:[Ld6/e;


# instance fields
.field public final a:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

.field public final b:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/mistake/feature/ask/l;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/mistake/feature/ask/m;->Companion:Lcom/zykj/mistake/feature/ask/l;

    .line 7
    .line 8
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 9
    .line 10
    new-instance v1, Landroidx/lifecycle/k;

    .line 11
    .line 12
    const/16 v2, 0xe

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
    move-result-object v1

    .line 21
    new-instance v2, Landroidx/lifecycle/k;

    .line 22
    .line 23
    const/16 v3, 0xf

    .line 24
    .line 25
    invoke-direct {v2, v3}, Landroidx/lifecycle/k;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lr6/a;)Ld6/e;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/4 v2, 0x2

    .line 33
    new-array v2, v2, [Ld6/e;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    aput-object v1, v2, v3

    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    aput-object v0, v2, v1

    .line 40
    .line 41
    sput-object v2, Lcom/zykj/mistake/feature/ask/m;->c:[Ld6/e;

    .line 42
    .line 43
    return-void
.end method

.method public synthetic constructor <init>(ILcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;Ljava/util/List;)V
    .locals 2

    and-int/lit8 v0, p1, 0x3

    const/4 v1, 0x3

    if-ne v1, v0, :cond_0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/zykj/mistake/feature/ask/m;->a:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    iput-object p3, p0, Lcom/zykj/mistake/feature/ask/m;->b:Ljava/util/List;

    return-void

    :cond_0
    sget-object p2, Lcom/zykj/mistake/feature/ask/k;->a:Lcom/zykj/mistake/feature/ask/k;

    invoke-virtual {p2}, Lcom/zykj/mistake/feature/ask/k;->getDescriptor()Lk7/g;

    move-result-object p2

    invoke-static {p2, p1, v1}, Lm7/y0;->k(Lk7/g;II)V

    const/4 p1, 0x0

    throw p1
.end method

.method public constructor <init>(Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;Ljava/util/List;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/zykj/mistake/feature/ask/m;->a:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 4
    iput-object p2, p0, Lcom/zykj/mistake/feature/ask/m;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/mistake/feature/ask/m;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/mistake/feature/ask/m;

    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/m;->a:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    iget-object v3, p1, Lcom/zykj/mistake/feature/ask/m;->a:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/m;->b:Ljava/util/List;

    iget-object p1, p1, Lcom/zykj/mistake/feature/ask/m;->b:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/zykj/mistake/feature/ask/m;->a:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/m;->b:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Group(type="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/m;->a:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", items="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/m;->b:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
