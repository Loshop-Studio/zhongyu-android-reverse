.class Lcom/lljjcoder/style/citylist/CityListSelectActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/lljjcoder/style/citylist/sortlistview/SideBar$OnTouchingLetterChangedListener;


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
    iput-object p1, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity$2;->this$0:Lcom/lljjcoder/style/citylist/CityListSelectActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onTouchingLetterChanged(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity$2;->this$0:Lcom/lljjcoder/style/citylist/CityListSelectActivity;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->adapter:Lcom/lljjcoder/style/citylist/sortlistview/SortAdapter;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-virtual {v0, p1}, Lcom/lljjcoder/style/citylist/sortlistview/SortAdapter;->getPositionForSection(I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    const/4 v0, -0x1

    .line 15
    if-eq p1, v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity$2;->this$0:Lcom/lljjcoder/style/citylist/CityListSelectActivity;

    .line 18
    .line 19
    iget-object v0, v0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->sortListView:Landroid/widget/ListView;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Landroid/widget/ListView;->setSelection(I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method
