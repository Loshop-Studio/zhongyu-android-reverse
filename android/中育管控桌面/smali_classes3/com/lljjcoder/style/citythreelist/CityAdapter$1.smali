.class Lcom/lljjcoder/style/citythreelist/CityAdapter$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lljjcoder/style/citythreelist/CityAdapter;->onBindViewHolder(Lcom/lljjcoder/style/citythreelist/CityAdapter$MyViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lljjcoder/style/citythreelist/CityAdapter;

.field final synthetic val$position:I


# direct methods
.method public constructor <init>(Lcom/lljjcoder/style/citythreelist/CityAdapter;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/style/citythreelist/CityAdapter$1;->this$0:Lcom/lljjcoder/style/citythreelist/CityAdapter;

    .line 2
    .line 3
    iput p2, p0, Lcom/lljjcoder/style/citythreelist/CityAdapter$1;->val$position:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/style/citythreelist/CityAdapter$1;->this$0:Lcom/lljjcoder/style/citythreelist/CityAdapter;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/lljjcoder/style/citythreelist/CityAdapter;->access$000(Lcom/lljjcoder/style/citythreelist/CityAdapter;)Lcom/lljjcoder/style/citythreelist/CityAdapter$OnItemSelectedListener;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lcom/lljjcoder/style/citythreelist/CityAdapter$1;->val$position:I

    .line 10
    .line 11
    iget-object v1, p0, Lcom/lljjcoder/style/citythreelist/CityAdapter$1;->this$0:Lcom/lljjcoder/style/citythreelist/CityAdapter;

    .line 12
    .line 13
    iget-object v1, v1, Lcom/lljjcoder/style/citythreelist/CityAdapter;->cityList:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-ge v0, v1, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lcom/lljjcoder/style/citythreelist/CityAdapter$1;->this$0:Lcom/lljjcoder/style/citythreelist/CityAdapter;

    .line 22
    .line 23
    invoke-static {v0}, Lcom/lljjcoder/style/citythreelist/CityAdapter;->access$000(Lcom/lljjcoder/style/citythreelist/CityAdapter;)Lcom/lljjcoder/style/citythreelist/CityAdapter$OnItemSelectedListener;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget v1, p0, Lcom/lljjcoder/style/citythreelist/CityAdapter$1;->val$position:I

    .line 28
    .line 29
    invoke-interface {v0, p1, v1}, Lcom/lljjcoder/style/citythreelist/CityAdapter$OnItemSelectedListener;->onItemSelected(Landroid/view/View;I)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method
