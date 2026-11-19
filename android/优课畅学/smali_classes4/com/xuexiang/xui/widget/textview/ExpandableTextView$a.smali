.class public Lcom/xuexiang/xui/widget/textview/ExpandableTextView$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/xuexiang/xui/widget/textview/ExpandableTextView;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/textview/ExpandableTextView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$a;->a:Lcom/xuexiang/xui/widget/textview/ExpandableTextView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$a;->a:Lcom/xuexiang/xui/widget/textview/ExpandableTextView;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$a;->a:Lcom/xuexiang/xui/widget/textview/ExpandableTextView;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->c(Lcom/xuexiang/xui/widget/textview/ExpandableTextView;Z)Z

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$a;->a:Lcom/xuexiang/xui/widget/textview/ExpandableTextView;

    .line 13
    .line 14
    invoke-static {p1}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->d(Lcom/xuexiang/xui/widget/textview/ExpandableTextView;)Lcom/xuexiang/xui/widget/textview/ExpandableTextView$d;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/ExpandableTextView$a;->a:Lcom/xuexiang/xui/widget/textview/ExpandableTextView;

    .line 2
    .line 3
    iget-object v0, p1, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->a:Landroid/widget/TextView;

    .line 4
    .line 5
    invoke-static {p1}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->a(Lcom/xuexiang/xui/widget/textview/ExpandableTextView;)F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {v0, p1}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->b(Landroid/view/View;F)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
