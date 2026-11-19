.class Lcom/lljjcoder/style/cityjd/JDCityPicker$2;
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
    iput-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$2;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

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
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$2;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$100(Lcom/lljjcoder/style/cityjd/JDCityPicker;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$2;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$000(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/high16 v0, 0x3f800000    # 1.0f

    .line 13
    .line 14
    invoke-static {p1, v0}, Lcom/lljjcoder/utils/utils;->setBackgroundAlpha(Landroid/content/Context;F)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$2;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 18
    .line 19
    invoke-static {p1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$200(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Lcom/lljjcoder/Interface/OnCityItemClickListener;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$2;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 26
    .line 27
    invoke-static {p1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$200(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Lcom/lljjcoder/Interface/OnCityItemClickListener;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Lcom/lljjcoder/Interface/OnCityItemClickListener;->onCancel()V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method
