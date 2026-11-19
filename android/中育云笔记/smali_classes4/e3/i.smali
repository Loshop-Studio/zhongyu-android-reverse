.class public final synthetic Le3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic c:Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;

.field public final synthetic d:Lcom/friday/common/widget/TouchSwitchView;

.field public final synthetic e:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Lcom/friday/common/widget/TouchSwitchView;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le3/i;->c:Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;

    iput-object p2, p0, Le3/i;->d:Lcom/friday/common/widget/TouchSwitchView;

    iput-object p3, p0, Le3/i;->e:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Le3/i;->c:Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;

    iget-object v1, p0, Le3/i;->d:Lcom/friday/common/widget/TouchSwitchView;

    iget-object v2, p0, Le3/i;->e:Landroid/view/View;

    invoke-static {v0, v1, v2, p1}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->k(Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;Lcom/friday/common/widget/TouchSwitchView;Landroid/view/View;Landroid/view/View;)V

    return-void
.end method
