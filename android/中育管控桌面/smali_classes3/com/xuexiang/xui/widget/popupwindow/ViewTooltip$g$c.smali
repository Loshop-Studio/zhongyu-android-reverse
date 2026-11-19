.class public Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g$c;->a:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g$c;->a:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->c(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g$c;->a:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->i()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
