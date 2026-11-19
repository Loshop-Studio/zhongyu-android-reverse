.class public Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g$b;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->l(Landroid/animation/Animator$AnimatorListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/animation/Animator$AnimatorListener;

.field public final synthetic b:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;Landroid/animation/Animator$AnimatorListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g$b;->b:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g$b;->a:Landroid/animation/Animator$AnimatorListener;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g$b;->a:Landroid/animation/Animator$AnimatorListener;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Landroid/animation/Animator$AnimatorListener;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g$b;->b:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->b(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;)Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$e;

    .line 12
    .line 13
    .line 14
    return-void
.end method
