.class Lcom/lljjcoder/style/citycustome/CustomCityPicker$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


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
    iput-object p1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker$1;->this$0:Lcom/lljjcoder/style/citycustome/CustomCityPicker;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onDismiss()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker$1;->this$0:Lcom/lljjcoder/style/citycustome/CustomCityPicker;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->access$000(Lcom/lljjcoder/style/citycustome/CustomCityPicker;)Lcom/lljjcoder/citywheel/CustomConfig;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CustomConfig;->isShowBackground()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker$1;->this$0:Lcom/lljjcoder/style/citycustome/CustomCityPicker;

    .line 14
    .line 15
    invoke-static {v0}, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->access$100(Lcom/lljjcoder/style/citycustome/CustomCityPicker;)Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/high16 v1, 0x3f800000    # 1.0f

    .line 20
    .line 21
    invoke-static {v0, v1}, Lcom/lljjcoder/utils/utils;->setBackgroundAlpha(Landroid/content/Context;F)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method
