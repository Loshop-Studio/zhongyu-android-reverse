.class public final synthetic Le3/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic c:Landroid/view/View;

.field public final synthetic d:Lcom/friday/common/widget/TouchSwitchView;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Lcom/friday/common/widget/TouchSwitchView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le3/h;->c:Landroid/view/View;

    iput-object p2, p0, Le3/h;->d:Lcom/friday/common/widget/TouchSwitchView;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Le3/h;->c:Landroid/view/View;

    iget-object v1, p0, Le3/h;->d:Lcom/friday/common/widget/TouchSwitchView;

    invoke-static {v0, v1, p1}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->i(Landroid/view/View;Lcom/friday/common/widget/TouchSwitchView;Landroid/view/View;)V

    return-void
.end method
