.class Lcom/lljjcoder/style/citylist/CityListSelectActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lljjcoder/style/citylist/CityListSelectActivity;->initList()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lljjcoder/style/citylist/CityListSelectActivity;


# direct methods
.method public constructor <init>(Lcom/lljjcoder/style/citylist/CityListSelectActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity$3;->this$0:Lcom/lljjcoder/style/citylist/CityListSelectActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity$3;->this$0:Lcom/lljjcoder/style/citylist/CityListSelectActivity;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->adapter:Lcom/lljjcoder/style/citylist/sortlistview/SortAdapter;

    .line 4
    .line 5
    invoke-virtual {p1, p3}, Lcom/lljjcoder/style/citylist/sortlistview/SortAdapter;->getItem(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/lljjcoder/style/citylist/sortlistview/SortModel;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/lljjcoder/style/citylist/sortlistview/SortModel;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object p2, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity$3;->this$0:Lcom/lljjcoder/style/citylist/CityListSelectActivity;

    .line 16
    .line 17
    invoke-static {p2}, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->access$100(Lcom/lljjcoder/style/citylist/CityListSelectActivity;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    invoke-static {p3, p1}, Lcom/lljjcoder/style/citylist/bean/CityInfoBean;->findCity(Ljava/util/List;Ljava/lang/String;)Lcom/lljjcoder/style/citylist/bean/CityInfoBean;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p2, p1}, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->access$002(Lcom/lljjcoder/style/citylist/CityListSelectActivity;Lcom/lljjcoder/style/citylist/bean/CityInfoBean;)Lcom/lljjcoder/style/citylist/bean/CityInfoBean;

    .line 26
    .line 27
    .line 28
    new-instance p1, Landroid/content/Intent;

    .line 29
    .line 30
    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance p2, Landroid/os/Bundle;

    .line 34
    .line 35
    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 36
    .line 37
    .line 38
    iget-object p3, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity$3;->this$0:Lcom/lljjcoder/style/citylist/CityListSelectActivity;

    .line 39
    .line 40
    invoke-static {p3}, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->access$000(Lcom/lljjcoder/style/citylist/CityListSelectActivity;)Lcom/lljjcoder/style/citylist/bean/CityInfoBean;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    const-string p4, "cityinfo"

    .line 45
    .line 46
    invoke-virtual {p2, p4, p3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 50
    .line 51
    .line 52
    iget-object p2, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity$3;->this$0:Lcom/lljjcoder/style/citylist/CityListSelectActivity;

    .line 53
    .line 54
    const/4 p3, -0x1

    .line 55
    invoke-virtual {p2, p3, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity$3;->this$0:Lcom/lljjcoder/style/citylist/CityListSelectActivity;

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 61
    .line 62
    .line 63
    return-void
.end method
