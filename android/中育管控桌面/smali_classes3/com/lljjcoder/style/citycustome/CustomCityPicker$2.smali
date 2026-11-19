.class Lcom/lljjcoder/style/citycustome/CustomCityPicker$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lljjcoder/style/citycustome/CustomCityPicker;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lljjcoder/style/citycustome/CustomCityPicker;


# direct methods
.method public constructor <init>(Lcom/lljjcoder/style/citycustome/CustomCityPicker;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker$2;->this$0:Lcom/lljjcoder/style/citycustome/CustomCityPicker;

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
    iget-object p1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker$2;->this$0:Lcom/lljjcoder/style/citycustome/CustomCityPicker;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->access$200(Lcom/lljjcoder/style/citycustome/CustomCityPicker;)Lcom/lljjcoder/Interface/OnCustomCityPickerItemClickListener;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lcom/lljjcoder/Interface/OnCustomCityPickerItemClickListener;->onCancel()V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker$2;->this$0:Lcom/lljjcoder/style/citycustome/CustomCityPicker;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->hide()V

    .line 13
    .line 14
    .line 15
    return-void
.end method
