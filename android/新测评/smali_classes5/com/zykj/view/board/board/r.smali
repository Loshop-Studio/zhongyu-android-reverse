.class public abstract Lcom/zykj/view/board/board/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/board/board/r$a;,
        Lcom/zykj/view/board/board/r$b;,
        Lcom/zykj/view/board/board/r$c;,
        Lcom/zykj/view/board/board/r$d;,
        Lcom/zykj/view/board/board/r$e;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Lcom/zykj/board/EzyModeEnum$ModeEnum;

.field public final c:Z

.field public final d:Ljava/util/List;

.field public final e:F


# direct methods
.method public constructor <init>(ILcom/zykj/board/EzyModeEnum$ModeEnum;ZLjava/util/List;F)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/zykj/view/board/board/r;->a:I

    .line 4
    iput-object p2, p0, Lcom/zykj/view/board/board/r;->b:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 5
    iput-boolean p3, p0, Lcom/zykj/view/board/board/r;->c:Z

    .line 6
    iput-object p4, p0, Lcom/zykj/view/board/board/r;->d:Ljava/util/List;

    .line 7
    iput p5, p0, Lcom/zykj/view/board/board/r;->e:F

    return-void
.end method

.method public synthetic constructor <init>(ILcom/zykj/board/EzyModeEnum$ModeEnum;ZLjava/util/List;FILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    const/4 p3, 0x0

    :cond_0
    move v3, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    const/high16 p3, 0x40400000    # 3.0f

    .line 8
    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    const/high16 p4, 0x41000000    # 8.0f

    invoke-static {p4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p4

    const/high16 p7, 0x41700000    # 15.0f

    invoke-static {p7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p7

    filled-new-array {p3, p4, p7}, [Ljava/lang/Float;

    move-result-object p3

    invoke-static {p3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p4

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_2

    const/high16 p5, 0x3f800000    # 1.0f

    :cond_2
    move v5, p5

    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    .line 9
    invoke-direct/range {v0 .. v6}, Lcom/zykj/view/board/board/r;-><init>(ILcom/zykj/board/EzyModeEnum$ModeEnum;ZLjava/util/List;FLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILcom/zykj/board/EzyModeEnum$ModeEnum;ZLjava/util/List;FLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/zykj/view/board/board/r;-><init>(ILcom/zykj/board/EzyModeEnum$ModeEnum;ZLjava/util/List;F)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/zykj/board/EzyModeEnum$ModeEnum;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/r;->b:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/r;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public final c()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/r;->e:F

    .line 2
    .line 3
    return v0
.end method

.method public final d()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/r;->d:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/board/r;->c:Z

    .line 2
    .line 3
    return v0
.end method
