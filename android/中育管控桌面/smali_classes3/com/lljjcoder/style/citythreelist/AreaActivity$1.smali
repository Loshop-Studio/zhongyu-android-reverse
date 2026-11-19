.class Lcom/lljjcoder/style/citythreelist/AreaActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/lljjcoder/style/citythreelist/CityAdapter$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lljjcoder/style/citythreelist/AreaActivity;->setData()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lljjcoder/style/citythreelist/AreaActivity;

.field final synthetic val$cityList:Ljava/util/List;


# direct methods
.method public constructor <init>(Lcom/lljjcoder/style/citythreelist/AreaActivity;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/style/citythreelist/AreaActivity$1;->this$0:Lcom/lljjcoder/style/citythreelist/AreaActivity;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/lljjcoder/style/citythreelist/AreaActivity$1;->val$cityList:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onItemSelected(Landroid/view/View;I)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/lljjcoder/style/citythreelist/AreaActivity$1;->this$0:Lcom/lljjcoder/style/citythreelist/AreaActivity;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/lljjcoder/style/citythreelist/AreaActivity;->access$000(Lcom/lljjcoder/style/citythreelist/AreaActivity;)Lcom/lljjcoder/style/citythreelist/CityBean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lcom/lljjcoder/style/citythreelist/AreaActivity$1;->val$cityList:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lcom/lljjcoder/style/citylist/bean/CityInfoBean;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/lljjcoder/style/citylist/bean/CityInfoBean;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p1, v0}, Lcom/lljjcoder/style/citythreelist/CityBean;->setName(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/lljjcoder/style/citythreelist/AreaActivity$1;->this$0:Lcom/lljjcoder/style/citythreelist/AreaActivity;

    .line 23
    .line 24
    invoke-static {p1}, Lcom/lljjcoder/style/citythreelist/AreaActivity;->access$000(Lcom/lljjcoder/style/citythreelist/AreaActivity;)Lcom/lljjcoder/style/citythreelist/CityBean;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iget-object v0, p0, Lcom/lljjcoder/style/citythreelist/AreaActivity$1;->val$cityList:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    check-cast p2, Lcom/lljjcoder/style/citylist/bean/CityInfoBean;

    .line 35
    .line 36
    invoke-virtual {p2}, Lcom/lljjcoder/style/citylist/bean/CityInfoBean;->getId()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {p1, p2}, Lcom/lljjcoder/style/citythreelist/CityBean;->setId(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    new-instance p1, Landroid/content/Intent;

    .line 44
    .line 45
    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    .line 46
    .line 47
    .line 48
    iget-object p2, p0, Lcom/lljjcoder/style/citythreelist/AreaActivity$1;->this$0:Lcom/lljjcoder/style/citythreelist/AreaActivity;

    .line 49
    .line 50
    invoke-static {p2}, Lcom/lljjcoder/style/citythreelist/AreaActivity;->access$000(Lcom/lljjcoder/style/citythreelist/AreaActivity;)Lcom/lljjcoder/style/citythreelist/CityBean;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    const-string v0, "area"

    .line 55
    .line 56
    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 57
    .line 58
    .line 59
    iget-object p2, p0, Lcom/lljjcoder/style/citythreelist/AreaActivity$1;->this$0:Lcom/lljjcoder/style/citythreelist/AreaActivity;

    .line 60
    .line 61
    const/16 v0, 0x3e9

    .line 62
    .line 63
    invoke-virtual {p2, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, Lcom/lljjcoder/style/citythreelist/AreaActivity$1;->this$0:Lcom/lljjcoder/style/citythreelist/AreaActivity;

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 69
    .line 70
    .line 71
    return-void
.end method
