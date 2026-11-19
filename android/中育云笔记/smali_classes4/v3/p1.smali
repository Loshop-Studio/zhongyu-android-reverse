.class public final synthetic Lv3/p1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic c:Lcom/friday/main/view/HomeActivity;

.field public final synthetic d:Landroid/widget/PopupWindow;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/main/view/HomeActivity;Landroid/widget/PopupWindow;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/p1;->c:Lcom/friday/main/view/HomeActivity;

    iput-object p2, p0, Lv3/p1;->d:Landroid/widget/PopupWindow;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv3/p1;->c:Lcom/friday/main/view/HomeActivity;

    iget-object v1, p0, Lv3/p1;->d:Landroid/widget/PopupWindow;

    invoke-static {v0, v1, p1}, Lcom/friday/main/view/HomeActivity;->W(Lcom/friday/main/view/HomeActivity;Landroid/widget/PopupWindow;Landroid/view/View;)V

    return-void
.end method
