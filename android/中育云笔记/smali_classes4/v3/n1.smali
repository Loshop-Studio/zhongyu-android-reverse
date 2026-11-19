.class public final synthetic Lv3/n1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/q;


# instance fields
.field public final synthetic c:Lcom/friday/main/view/HomeActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/main/view/HomeActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/n1;->c:Lcom/friday/main/view/HomeActivity;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lv3/n1;->c:Lcom/friday/main/view/HomeActivity;

    check-cast p1, Landroid/view/View;

    check-cast p2, Landroid/widget/PopupWindow;

    check-cast p3, Lcom/friday/main/databinding/PopupWindowCreateNewBinding;

    invoke-static {v0, p1, p2, p3}, Lcom/friday/main/view/HomeActivity;->f0(Lcom/friday/main/view/HomeActivity;Landroid/view/View;Landroid/widget/PopupWindow;Lcom/friday/main/databinding/PopupWindowCreateNewBinding;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
