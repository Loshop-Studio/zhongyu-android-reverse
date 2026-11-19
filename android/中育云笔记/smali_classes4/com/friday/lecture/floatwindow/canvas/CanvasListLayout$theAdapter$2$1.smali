.class public final Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout$theAdapter$2$1;
.super Lcom/chad/library/adapter/base/BaseQuickAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
        "Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;",
        "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    invoke-direct {p0, p1, v0, v1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;-><init>(ILjava/util/List;ILkotlin/jvm/internal/n;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic i()Lqc/q;
    .locals 1

    .line 1
    invoke-static {}, Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout$theAdapter$2$1;->k()Lqc/q;

    move-result-object v0

    return-object v0
.end method

.method public static final k()Lqc/q;
    .locals 4

    .line 1
    sget-object v0, Lcom/friday/lecture/floatwindow/canvas/a;->d:Lcom/friday/lecture/floatwindow/canvas/a$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/canvas/a$a;->a()Lcom/friday/lecture/floatwindow/canvas/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/canvas/a;->h()V

    .line 8
    .line 9
    .line 10
    sget-object v0, Lcom/friday/lecture/floatwindow/options/a;->g:Lcom/friday/lecture/floatwindow/options/a$a;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/options/a$a;->a()Lcom/friday/lecture/floatwindow/options/a;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x1

    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-static {v0, v3, v1, v2}, Lcom/friday/lecture/floatwindow/options/a;->q(Lcom/friday/lecture/floatwindow/options/a;ZILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 23
    .line 24
    return-object v0
.end method


# virtual methods
.method public bridge synthetic convert(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout$theAdapter$2$1;->j(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public j(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;)V
    .locals 1

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_1

    .line 7
    .line 8
    sget v0, Lcom/friday/lecture/R$id;->fl_container:I

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Landroid/widget/FrameLayout;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    new-instance p1, Le3/b;

    .line 33
    .line 34
    invoke-direct {p1}, Le3/b;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2, p1}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->setOnClose(Lhd/a;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void
.end method
