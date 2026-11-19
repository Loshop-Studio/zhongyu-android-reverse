.class public final Lcom/friday/common/helper/GridSpacingItemDecoration;
.super Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Z

.field public final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(IIZZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;-><init>()V

    .line 3
    iput p1, p0, Lcom/friday/common/helper/GridSpacingItemDecoration;->a:I

    .line 4
    iput p2, p0, Lcom/friday/common/helper/GridSpacingItemDecoration;->b:I

    .line 5
    iput-boolean p3, p0, Lcom/friday/common/helper/GridSpacingItemDecoration;->c:Z

    .line 6
    iput-boolean p4, p0, Lcom/friday/common/helper/GridSpacingItemDecoration;->d:Z

    return-void
.end method

.method public synthetic constructor <init>(IIZZILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x1

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/friday/common/helper/GridSpacingItemDecoration;-><init>(IIZZ)V

    return-void
.end method


# virtual methods
.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 2

    .line 1
    const-string v0, "outRect"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "view"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "parent"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "state"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->getChildLayoutPosition(Landroid/view/View;)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    iget p3, p0, Lcom/friday/common/helper/GridSpacingItemDecoration;->a:I

    .line 26
    .line 27
    rem-int p4, p2, p3

    .line 28
    .line 29
    iget-boolean v0, p0, Lcom/friday/common/helper/GridSpacingItemDecoration;->c:Z

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget v0, p0, Lcom/friday/common/helper/GridSpacingItemDecoration;->b:I

    .line 34
    .line 35
    mul-int v1, p4, v0

    .line 36
    .line 37
    div-int/2addr v1, p3

    .line 38
    sub-int v1, v0, v1

    .line 39
    .line 40
    iput v1, p1, Landroid/graphics/Rect;->left:I

    .line 41
    .line 42
    add-int/lit8 p4, p4, 0x1

    .line 43
    .line 44
    mul-int/2addr p4, v0

    .line 45
    div-int/2addr p4, p3

    .line 46
    iput p4, p1, Landroid/graphics/Rect;->right:I

    .line 47
    .line 48
    if-ge p2, p3, :cond_0

    .line 49
    .line 50
    iget-boolean p2, p0, Lcom/friday/common/helper/GridSpacingItemDecoration;->d:Z

    .line 51
    .line 52
    if-eqz p2, :cond_0

    .line 53
    .line 54
    iput v0, p1, Landroid/graphics/Rect;->top:I

    .line 55
    .line 56
    :cond_0
    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    iget v0, p0, Lcom/friday/common/helper/GridSpacingItemDecoration;->b:I

    .line 60
    .line 61
    mul-int v1, p4, v0

    .line 62
    .line 63
    div-int/2addr v1, p3

    .line 64
    iput v1, p1, Landroid/graphics/Rect;->left:I

    .line 65
    .line 66
    add-int/lit8 p4, p4, 0x1

    .line 67
    .line 68
    mul-int/2addr p4, v0

    .line 69
    div-int/2addr p4, p3

    .line 70
    sub-int p4, v0, p4

    .line 71
    .line 72
    iput p4, p1, Landroid/graphics/Rect;->right:I

    .line 73
    .line 74
    if-lt p2, p3, :cond_2

    .line 75
    .line 76
    iput v0, p1, Landroid/graphics/Rect;->top:I

    .line 77
    .line 78
    :cond_2
    return-void
.end method
