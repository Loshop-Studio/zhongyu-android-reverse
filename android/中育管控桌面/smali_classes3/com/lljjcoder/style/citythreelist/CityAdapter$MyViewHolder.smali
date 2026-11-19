.class Lcom/lljjcoder/style/citythreelist/CityAdapter$MyViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lljjcoder/style/citythreelist/CityAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "MyViewHolder"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lljjcoder/style/citythreelist/CityAdapter;

.field tv:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Lcom/lljjcoder/style/citythreelist/CityAdapter;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/style/citythreelist/CityAdapter$MyViewHolder;->this$0:Lcom/lljjcoder/style/citythreelist/CityAdapter;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    sget p1, Lcom/lljjcoder/style/citypickerview/R$id;->default_item_city_name_tv:I

    .line 7
    .line 8
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Landroid/widget/TextView;

    .line 13
    .line 14
    iput-object p1, p0, Lcom/lljjcoder/style/citythreelist/CityAdapter$MyViewHolder;->tv:Landroid/widget/TextView;

    .line 15
    .line 16
    return-void
.end method
