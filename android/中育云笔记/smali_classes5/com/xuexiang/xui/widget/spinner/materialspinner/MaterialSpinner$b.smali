.class public Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->r(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$b;->c:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onDismiss()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$b;->c:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->f(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$b;->c:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->i(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$e;

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$b;->c:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    .line 15
    .line 16
    invoke-static {v0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->j(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$b;->c:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-static {v0, v1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->k(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;Z)V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
.end method
