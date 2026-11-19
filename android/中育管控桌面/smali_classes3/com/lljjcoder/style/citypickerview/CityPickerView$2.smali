.class Lcom/lljjcoder/style/citypickerview/CityPickerView$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lljjcoder/style/citypickerview/CityPickerView;->initCityPickerPopwindow()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lljjcoder/style/citypickerview/CityPickerView;


# direct methods
.method public constructor <init>(Lcom/lljjcoder/style/citypickerview/CityPickerView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView$2;->this$0:Lcom/lljjcoder/style/citypickerview/CityPickerView;

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
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView$2;->this$0:Lcom/lljjcoder/style/citypickerview/CityPickerView;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/lljjcoder/style/citypickerview/CityPickerView;->access$200(Lcom/lljjcoder/style/citypickerview/CityPickerView;)Lcom/lljjcoder/Interface/OnCityItemClickListener;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lcom/lljjcoder/Interface/OnCityItemClickListener;->onCancel()V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView$2;->this$0:Lcom/lljjcoder/style/citypickerview/CityPickerView;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/lljjcoder/style/citypickerview/CityPickerView;->hide()V

    .line 13
    .line 14
    .line 15
    return-void
.end method
