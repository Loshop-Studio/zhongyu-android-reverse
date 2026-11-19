.class public Lcom/luck/picture/lib/decoration/ViewPage2ItemDecoration;
.super Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I


# virtual methods
.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 1

    .line 1
    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    iget p3, p0, Lcom/luck/picture/lib/decoration/ViewPage2ItemDecoration;->a:I

    .line 6
    .line 7
    rem-int/2addr p2, p3

    .line 8
    iget p4, p0, Lcom/luck/picture/lib/decoration/ViewPage2ItemDecoration;->b:I

    .line 9
    .line 10
    mul-int v0, p2, p4

    .line 11
    .line 12
    div-int/2addr v0, p3

    .line 13
    sub-int v0, p4, v0

    .line 14
    .line 15
    iput v0, p1, Landroid/graphics/Rect;->left:I

    .line 16
    .line 17
    add-int/lit8 p2, p2, 0x1

    .line 18
    .line 19
    mul-int/2addr p2, p4

    .line 20
    div-int/2addr p2, p3

    .line 21
    iput p2, p1, Landroid/graphics/Rect;->right:I

    .line 22
    .line 23
    return-void
.end method
