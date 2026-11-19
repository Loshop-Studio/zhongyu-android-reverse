.class public Lcom/xuexiang/xui/widget/dialog/materialdialog/simplelist/MaterialSimpleListAdapter$b;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/dialog/materialdialog/simplelist/MaterialSimpleListAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final c:Landroid/widget/ImageView;

.field public final d:Landroid/widget/TextView;

.field public final e:Lcom/xuexiang/xui/widget/dialog/materialdialog/simplelist/MaterialSimpleListAdapter;


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/xuexiang/xui/widget/dialog/materialdialog/simplelist/MaterialSimpleListAdapter;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    const v0, 0x1020006

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/widget/ImageView;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/simplelist/MaterialSimpleListAdapter$b;->c:Landroid/widget/ImageView;

    .line 14
    .line 15
    const v0, 0x1020016

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Landroid/widget/TextView;

    .line 23
    .line 24
    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/simplelist/MaterialSimpleListAdapter$b;->d:Landroid/widget/TextView;

    .line 25
    .line 26
    iput-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/simplelist/MaterialSimpleListAdapter$b;->e:Lcom/xuexiang/xui/widget/dialog/materialdialog/simplelist/MaterialSimpleListAdapter;

    .line 27
    .line 28
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/simplelist/MaterialSimpleListAdapter$b;->e:Lcom/xuexiang/xui/widget/dialog/materialdialog/simplelist/MaterialSimpleListAdapter;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/simplelist/MaterialSimpleListAdapter;->a(Lcom/xuexiang/xui/widget/dialog/materialdialog/simplelist/MaterialSimpleListAdapter;)Lcom/xuexiang/xui/widget/dialog/materialdialog/simplelist/MaterialSimpleListAdapter$a;

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
