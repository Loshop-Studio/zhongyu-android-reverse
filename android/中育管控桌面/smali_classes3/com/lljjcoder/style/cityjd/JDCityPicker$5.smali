.class Lcom/lljjcoder/style/cityjd/JDCityPicker$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lljjcoder/style/cityjd/JDCityPicker;->initJDCityPickerPop()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;


# direct methods
.method public constructor <init>(Lcom/lljjcoder/style/cityjd/JDCityPicker;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$5;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

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
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$5;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    invoke-static {p1, v0}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$302(Lcom/lljjcoder/style/cityjd/JDCityPicker;I)I

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$5;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 8
    .line 9
    invoke-static {p1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$900(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Lcom/lljjcoder/style/cityjd/AreaAdapter;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$5;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 16
    .line 17
    invoke-static {p1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$500(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Landroid/widget/ListView;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$5;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 22
    .line 23
    invoke-static {v0}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$900(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Lcom/lljjcoder/style/cityjd/AreaAdapter;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$5;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 31
    .line 32
    invoke-static {p1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$900(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Lcom/lljjcoder/style/cityjd/AreaAdapter;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Lcom/lljjcoder/style/cityjd/AreaAdapter;->getSelectedPosition()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    const/4 v0, -0x1

    .line 41
    if-eq p1, v0, :cond_0

    .line 42
    .line 43
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$5;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 44
    .line 45
    invoke-static {p1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$500(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Landroid/widget/ListView;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$5;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 50
    .line 51
    invoke-static {v0}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$900(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Lcom/lljjcoder/style/cityjd/AreaAdapter;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Lcom/lljjcoder/style/cityjd/AreaAdapter;->getSelectedPosition()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setSelection(I)V

    .line 60
    .line 61
    .line 62
    :cond_0
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$5;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 63
    .line 64
    invoke-static {p1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$600(Lcom/lljjcoder/style/cityjd/JDCityPicker;)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$5;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 68
    .line 69
    invoke-static {p1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$700(Lcom/lljjcoder/style/cityjd/JDCityPicker;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method
