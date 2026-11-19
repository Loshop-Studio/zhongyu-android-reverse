.class Lcom/lljjcoder/style/cityjd/JDCityPicker$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


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
    iput-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$1;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

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
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$1;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$000(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/high16 v1, 0x3f800000    # 1.0f

    .line 8
    .line 9
    invoke-static {v0, v1}, Lcom/lljjcoder/utils/utils;->setBackgroundAlpha(Landroid/content/Context;F)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
