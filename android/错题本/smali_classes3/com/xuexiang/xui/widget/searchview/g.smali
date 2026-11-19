.class public final Lcom/xuexiang/xui/widget/searchview/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic a:Lcom/xuexiang/xui/widget/searchview/m;

.field public final synthetic b:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;Lcom/xuexiang/xui/widget/searchview/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/g;->b:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/xuexiang/xui/widget/searchview/g;->a:Lcom/xuexiang/xui/widget/searchview/m;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/g;->a:Lcom/xuexiang/xui/widget/searchview/m;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/xuexiang/xui/widget/searchview/m;->a:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Ljava/lang/String;

    .line 10
    .line 11
    iget-object p2, p0, Lcom/xuexiang/xui/widget/searchview/g;->b:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;

    .line 12
    .line 13
    iget-boolean p3, p2, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->n:Z

    .line 14
    .line 15
    invoke-virtual {p2, p1, p3}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->d(Ljava/lang/CharSequence;Z)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
