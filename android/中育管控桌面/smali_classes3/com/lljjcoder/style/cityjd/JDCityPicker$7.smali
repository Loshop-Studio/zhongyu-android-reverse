.class Lcom/lljjcoder/style/cityjd/JDCityPicker$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lljjcoder/style/cityjd/JDCityPicker;->updateIndicator()V
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
    iput-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$7;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$7;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$300(Lcom/lljjcoder/style/cityjd/JDCityPicker;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$7;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 17
    .line 18
    invoke-static {v0}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$1400(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Landroid/widget/TextView;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v0, v1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$1200(Lcom/lljjcoder/style/cityjd/JDCityPicker;Landroid/widget/TextView;)Landroid/animation/AnimatorSet;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$7;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 31
    .line 32
    invoke-static {v0}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$1300(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Landroid/widget/TextView;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v0, v1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$1200(Lcom/lljjcoder/style/cityjd/JDCityPicker;Landroid/widget/TextView;)Landroid/animation/AnimatorSet;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$7;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 45
    .line 46
    invoke-static {v0}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$1100(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Landroid/widget/TextView;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-static {v0, v1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$1200(Lcom/lljjcoder/style/cityjd/JDCityPicker;Landroid/widget/TextView;)Landroid/animation/AnimatorSet;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 55
    .line 56
    .line 57
    return-void
.end method
