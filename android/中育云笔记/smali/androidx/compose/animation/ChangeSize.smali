.class public final Landroidx/compose/animation/ChangeSize;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/Immutable;
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final alignment:Landroidx/compose/ui/Alignment;

.field private final animationSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "Landroidx/compose/ui/unit/IntSize;",
            ">;"
        }
    .end annotation
.end field

.field private final clip:Z

.field private final size:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/Alignment;Lhd/l;Landroidx/compose/animation/core/FiniteAnimationSpec;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Alignment;",
            "Lhd/l;",
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "Landroidx/compose/ui/unit/IntSize;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/compose/animation/ChangeSize;->alignment:Landroidx/compose/ui/Alignment;

    .line 3
    iput-object p2, p0, Landroidx/compose/animation/ChangeSize;->size:Lhd/l;

    .line 4
    iput-object p3, p0, Landroidx/compose/animation/ChangeSize;->animationSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 5
    iput-boolean p4, p0, Landroidx/compose/animation/ChangeSize;->clip:Z

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/Alignment;Lhd/l;Landroidx/compose/animation/core/FiniteAnimationSpec;ZILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 6
    sget-object p2, Landroidx/compose/animation/ChangeSize$1;->INSTANCE:Landroidx/compose/animation/ChangeSize$1;

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    const/4 p4, 0x1

    .line 7
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/animation/ChangeSize;-><init>(Landroidx/compose/ui/Alignment;Lhd/l;Landroidx/compose/animation/core/FiniteAnimationSpec;Z)V

    return-void
.end method

.method public static synthetic copy$default(Landroidx/compose/animation/ChangeSize;Landroidx/compose/ui/Alignment;Lhd/l;Landroidx/compose/animation/core/FiniteAnimationSpec;ZILjava/lang/Object;)Landroidx/compose/animation/ChangeSize;
    .locals 0

    .line 1
    and-int/lit8 p6, p5, 0x1

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/compose/animation/ChangeSize;->alignment:Landroidx/compose/ui/Alignment;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p6, p5, 0x2

    .line 8
    .line 9
    if-eqz p6, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Landroidx/compose/animation/ChangeSize;->size:Lhd/l;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p6, p5, 0x4

    .line 14
    .line 15
    if-eqz p6, :cond_2

    .line 16
    .line 17
    iget-object p3, p0, Landroidx/compose/animation/ChangeSize;->animationSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p5, p5, 0x8

    .line 20
    .line 21
    if-eqz p5, :cond_3

    .line 22
    .line 23
    iget-boolean p4, p0, Landroidx/compose/animation/ChangeSize;->clip:Z

    .line 24
    .line 25
    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/compose/animation/ChangeSize;->copy(Landroidx/compose/ui/Alignment;Lhd/l;Landroidx/compose/animation/core/FiniteAnimationSpec;Z)Landroidx/compose/animation/ChangeSize;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method


# virtual methods
.method public final component1()Landroidx/compose/ui/Alignment;
    .locals 1

    iget-object v0, p0, Landroidx/compose/animation/ChangeSize;->alignment:Landroidx/compose/ui/Alignment;

    return-object v0
.end method

.method public final component2()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/ChangeSize;->size:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component3()Landroidx/compose/animation/core/FiniteAnimationSpec;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "Landroidx/compose/ui/unit/IntSize;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/animation/ChangeSize;->animationSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/animation/ChangeSize;->clip:Z

    return v0
.end method

.method public final copy(Landroidx/compose/ui/Alignment;Lhd/l;Landroidx/compose/animation/core/FiniteAnimationSpec;Z)Landroidx/compose/animation/ChangeSize;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Alignment;",
            "Lhd/l;",
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "Landroidx/compose/ui/unit/IntSize;",
            ">;Z)",
            "Landroidx/compose/animation/ChangeSize;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/animation/ChangeSize;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3, p4}, Landroidx/compose/animation/ChangeSize;-><init>(Landroidx/compose/ui/Alignment;Lhd/l;Landroidx/compose/animation/core/FiniteAnimationSpec;Z)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/animation/ChangeSize;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/animation/ChangeSize;

    iget-object v1, p0, Landroidx/compose/animation/ChangeSize;->alignment:Landroidx/compose/ui/Alignment;

    iget-object v3, p1, Landroidx/compose/animation/ChangeSize;->alignment:Landroidx/compose/ui/Alignment;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/compose/animation/ChangeSize;->size:Lhd/l;

    iget-object v3, p1, Landroidx/compose/animation/ChangeSize;->size:Lhd/l;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Landroidx/compose/animation/ChangeSize;->animationSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    iget-object v3, p1, Landroidx/compose/animation/ChangeSize;->animationSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Landroidx/compose/animation/ChangeSize;->clip:Z

    iget-boolean p1, p1, Landroidx/compose/animation/ChangeSize;->clip:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getAlignment()Landroidx/compose/ui/Alignment;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/ChangeSize;->alignment:Landroidx/compose/ui/Alignment;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getAnimationSpec()Landroidx/compose/animation/core/FiniteAnimationSpec;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "Landroidx/compose/ui/unit/IntSize;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/ChangeSize;->animationSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getClip()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/animation/ChangeSize;->clip:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getSize()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/ChangeSize;->size:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Landroidx/compose/animation/ChangeSize;->alignment:Landroidx/compose/ui/Alignment;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/animation/ChangeSize;->size:Lhd/l;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/animation/ChangeSize;->animationSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Landroidx/compose/animation/ChangeSize;->clip:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ChangeSize(alignment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/animation/ChangeSize;->alignment:Landroidx/compose/ui/Alignment;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/animation/ChangeSize;->size:Lhd/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", animationSpec="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/animation/ChangeSize;->animationSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", clip="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/compose/animation/ChangeSize;->clip:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
