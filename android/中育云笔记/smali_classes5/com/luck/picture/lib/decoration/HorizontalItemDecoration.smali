.class public Lcom/luck/picture/lib/decoration/HorizontalItemDecoration;
.super Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/luck/picture/lib/decoration/HorizontalItemDecoration;->a:I

    .line 5
    .line 6
    iput p2, p0, Lcom/luck/picture/lib/decoration/HorizontalItemDecoration;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 2

    .line 1
    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    iget p3, p0, Lcom/luck/picture/lib/decoration/HorizontalItemDecoration;->a:I

    .line 6
    .line 7
    rem-int p4, p2, p3

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    iget v0, p0, Lcom/luck/picture/lib/decoration/HorizontalItemDecoration;->b:I

    .line 12
    .line 13
    mul-int v1, p4, v0

    .line 14
    .line 15
    div-int/2addr v1, p3

    .line 16
    sub-int/2addr v0, v1

    .line 17
    iput v0, p1, Landroid/graphics/Rect;->left:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget v0, p0, Lcom/luck/picture/lib/decoration/HorizontalItemDecoration;->b:I

    .line 21
    .line 22
    mul-int/2addr v0, p4

    .line 23
    div-int/2addr v0, p3

    .line 24
    iput v0, p1, Landroid/graphics/Rect;->left:I

    .line 25
    .line 26
    :goto_0
    iget v0, p0, Lcom/luck/picture/lib/decoration/HorizontalItemDecoration;->b:I

    .line 27
    .line 28
    add-int/lit8 p4, p4, 0x1

    .line 29
    .line 30
    mul-int/2addr p4, v0

    .line 31
    div-int/2addr p4, p3

    .line 32
    sub-int p4, v0, p4

    .line 33
    .line 34
    iput p4, p1, Landroid/graphics/Rect;->right:I

    .line 35
    .line 36
    if-ge p2, p3, :cond_1

    .line 37
    .line 38
    iput v0, p1, Landroid/graphics/Rect;->top:I

    .line 39
    .line 40
    :cond_1
    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 41
    .line 42
    return-void
.end method
