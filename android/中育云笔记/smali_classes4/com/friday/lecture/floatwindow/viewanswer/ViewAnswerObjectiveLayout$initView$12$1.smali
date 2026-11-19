.class public final Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$initView$12$1;
.super Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->t()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$initView$12$1;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 1

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
    invoke-super {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;->getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V

    .line 22
    .line 23
    .line 24
    iget-object p4, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$initView$12$1;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 25
    .line 26
    invoke-virtual {p4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 27
    .line 28
    .line 29
    move-result-object p4

    .line 30
    sget v0, Lcom/friday/lecture/R$dimen;->view_9:I

    .line 31
    .line 32
    invoke-virtual {p4, v0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 33
    .line 34
    .line 35
    move-result p4

    .line 36
    float-to-int p4, p4

    .line 37
    iput p4, p1, Landroid/graphics/Rect;->top:I

    .line 38
    .line 39
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 40
    .line 41
    .line 42
    move-result-object p4

    .line 43
    if-eqz p4, :cond_0

    .line 44
    .line 45
    invoke-virtual {p4}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 46
    .line 47
    .line 48
    move-result p4

    .line 49
    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    add-int/lit8 p4, p4, -0x1

    .line 54
    .line 55
    if-ne p2, p4, :cond_0

    .line 56
    .line 57
    iget-object p2, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$initView$12$1;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 58
    .line 59
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    sget p3, Lcom/friday/lecture/R$dimen;->view_9:I

    .line 64
    .line 65
    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDimension(I)F

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    float-to-int p2, p2

    .line 70
    iput p2, p1, Landroid/graphics/Rect;->bottom:I

    .line 71
    .line 72
    :cond_0
    return-void
.end method
