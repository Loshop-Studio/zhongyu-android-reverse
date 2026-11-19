.class public final Lcom/zykj/study/utils/CommonDecoration;
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


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(IIZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/zykj/study/utils/CommonDecoration;->a:I

    .line 5
    .line 6
    iput p2, p0, Lcom/zykj/study/utils/CommonDecoration;->b:I

    .line 7
    .line 8
    iput-boolean p3, p0, Lcom/zykj/study/utils/CommonDecoration;->c:Z

    .line 9
    .line 10
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
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 22
    .line 23
    .line 24
    move-result-object p4

    .line 25
    instance-of v0, p4, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 26
    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    check-cast p4, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 30
    .line 31
    invoke-virtual {p4}, Landroidx/recyclerview/widget/GridLayoutManager;->getSpanCount()I

    .line 32
    .line 33
    .line 34
    move-result p4

    .line 35
    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    rem-int p3, p2, p4

    .line 40
    .line 41
    div-int/2addr p2, p4

    .line 42
    iget-boolean v0, p0, Lcom/zykj/study/utils/CommonDecoration;->c:Z

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    if-nez p2, :cond_0

    .line 48
    .line 49
    iget v1, p0, Lcom/zykj/study/utils/CommonDecoration;->b:I

    .line 50
    .line 51
    :cond_0
    iput v1, p1, Landroid/graphics/Rect;->top:I

    .line 52
    .line 53
    iget p2, p0, Lcom/zykj/study/utils/CommonDecoration;->b:I

    .line 54
    .line 55
    iput p2, p1, Landroid/graphics/Rect;->bottom:I

    .line 56
    .line 57
    sub-int p2, p4, p3

    .line 58
    .line 59
    iget v0, p0, Lcom/zykj/study/utils/CommonDecoration;->a:I

    .line 60
    .line 61
    mul-int/2addr p2, v0

    .line 62
    div-int/2addr p2, p4

    .line 63
    iput p2, p1, Landroid/graphics/Rect;->left:I

    .line 64
    .line 65
    add-int/lit8 p3, p3, 0x1

    .line 66
    .line 67
    mul-int/2addr p3, v0

    .line 68
    div-int/2addr p3, p4

    .line 69
    iput p3, p1, Landroid/graphics/Rect;->right:I

    .line 70
    .line 71
    return-void

    .line 72
    :cond_1
    if-nez p2, :cond_2

    .line 73
    .line 74
    move p2, v1

    .line 75
    goto :goto_0

    .line 76
    :cond_2
    iget p2, p0, Lcom/zykj/study/utils/CommonDecoration;->b:I

    .line 77
    .line 78
    :goto_0
    iput p2, p1, Landroid/graphics/Rect;->top:I

    .line 79
    .line 80
    iput v1, p1, Landroid/graphics/Rect;->bottom:I

    .line 81
    .line 82
    iget p2, p0, Lcom/zykj/study/utils/CommonDecoration;->a:I

    .line 83
    .line 84
    mul-int v0, p3, p2

    .line 85
    .line 86
    div-int/2addr v0, p4

    .line 87
    iput v0, p1, Landroid/graphics/Rect;->left:I

    .line 88
    .line 89
    sub-int p3, p4, p3

    .line 90
    .line 91
    add-int/lit8 p3, p3, -0x1

    .line 92
    .line 93
    mul-int/2addr p3, p2

    .line 94
    div-int/2addr p3, p4

    .line 95
    iput p3, p1, Landroid/graphics/Rect;->right:I

    .line 96
    .line 97
    return-void

    .line 98
    :cond_3
    instance-of p2, p4, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 99
    .line 100
    if-eqz p2, :cond_4

    .line 101
    .line 102
    iget p2, p0, Lcom/zykj/study/utils/CommonDecoration;->a:I

    .line 103
    .line 104
    iget p3, p0, Lcom/zykj/study/utils/CommonDecoration;->b:I

    .line 105
    .line 106
    invoke-virtual {p1, p2, p3, p2, p3}, Landroid/graphics/Rect;->set(IIII)V

    .line 107
    .line 108
    .line 109
    :cond_4
    return-void
.end method
