.class public Lcom/luck/picture/lib/PictureSelectorPreviewFragment$a;
.super Lcom/luck/picture/lib/decoration/WrapContentLinearLayoutManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->O1(Landroid/view/ViewGroup;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$a;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/luck/picture/lib/decoration/WrapContentLinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public smoothScrollToPosition(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->smoothScrollToPosition(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;I)V

    .line 2
    .line 3
    .line 4
    new-instance p2, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$a$a;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-direct {p2, p0, p1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$a$a;-><init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment$a;Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView$SmoothScroller;->setTargetPosition(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->startSmoothScroll(Landroidx/recyclerview/widget/RecyclerView$SmoothScroller;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
