.class Lcom/lljjcoder/style/citythreelist/ProvinceActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/lljjcoder/style/citythreelist/CityAdapter$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lljjcoder/style/citythreelist/ProvinceActivity;->setData()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lljjcoder/style/citythreelist/ProvinceActivity;

.field final synthetic val$cityList:Ljava/util/List;


# direct methods
.method public constructor <init>(Lcom/lljjcoder/style/citythreelist/ProvinceActivity;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/style/citythreelist/ProvinceActivity$1;->this$0:Lcom/lljjcoder/style/citythreelist/ProvinceActivity;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/lljjcoder/style/citythreelist/ProvinceActivity$1;->val$cityList:Ljava/util/List;

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
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/lljjcoder/style/citythreelist/ProvinceActivity$1;->this$0:Lcom/lljjcoder/style/citythreelist/ProvinceActivity;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/lljjcoder/style/citythreelist/ProvinceActivity;->access$000(Lcom/lljjcoder/style/citythreelist/ProvinceActivity;)Lcom/lljjcoder/style/citythreelist/CityBean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lcom/lljjcoder/style/citythreelist/ProvinceActivity$1;->val$cityList:Ljava/util/List;

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
    invoke-virtual {v0}, Lcom/lljjcoder/style/citylist/bean/CityInfoBean;->getId()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p1, v0}, Lcom/lljjcoder/style/citythreelist/CityBean;->setId(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/lljjcoder/style/citythreelist/ProvinceActivity$1;->this$0:Lcom/lljjcoder/style/citythreelist/ProvinceActivity;

    .line 23
    .line 24
    invoke-static {p1}, Lcom/lljjcoder/style/citythreelist/ProvinceActivity;->access$000(Lcom/lljjcoder/style/citythreelist/ProvinceActivity;)Lcom/lljjcoder/style/citythreelist/CityBean;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iget-object v0, p0, Lcom/lljjcoder/style/citythreelist/ProvinceActivity$1;->val$cityList:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lcom/lljjcoder/style/citylist/bean/CityInfoBean;

    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/lljjcoder/style/citylist/bean/CityInfoBean;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p1, v0}, Lcom/lljjcoder/style/citythreelist/CityBean;->setName(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    new-instance p1, Landroid/content/Intent;

    .line 44
    .line 45
    iget-object v0, p0, Lcom/lljjcoder/style/citythreelist/ProvinceActivity$1;->this$0:Lcom/lljjcoder/style/citythreelist/ProvinceActivity;

    .line 46
    .line 47
    const-class v1, Lcom/lljjcoder/style/citythreelist/CityActivity;

    .line 48
    .line 49
    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lcom/lljjcoder/style/citythreelist/ProvinceActivity$1;->val$cityList:Ljava/util/List;

    .line 53
    .line 54
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    check-cast p2, Landroid/os/Parcelable;

    .line 59
    .line 60
    const-string v0, "bundata"

    .line 61
    .line 62
    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 63
    .line 64
    .line 65
    iget-object p2, p0, Lcom/lljjcoder/style/citythreelist/ProvinceActivity$1;->this$0:Lcom/lljjcoder/style/citythreelist/ProvinceActivity;

    .line 66
    .line 67
    const/16 v0, 0x3e9

    .line 68
    .line 69
    invoke-virtual {p2, p1, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 70
    .line 71
    .line 72
    return-void
.end method
