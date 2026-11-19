.class public Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setSuggestions([Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/xuexiang/xui/widget/searchview/d;

.field public final synthetic d:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;Lcom/xuexiang/xui/widget/searchview/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$e;->d:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$e;->c:Lcom/xuexiang/xui/widget/searchview/d;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$e;->d:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;

    .line 2
    .line 3
    iget-object p2, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$e;->c:Lcom/xuexiang/xui/widget/searchview/d;

    .line 4
    .line 5
    invoke-virtual {p2, p3}, Lcom/xuexiang/xui/widget/searchview/d;->getItem(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    check-cast p2, Ljava/lang/String;

    .line 10
    .line 11
    iget-object p3, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$e;->d:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;

    .line 12
    .line 13
    invoke-static {p3}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->b(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)Z

    .line 14
    .line 15
    .line 16
    move-result p3

    .line 17
    invoke-virtual {p1, p2, p3}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->x(Ljava/lang/CharSequence;Z)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
