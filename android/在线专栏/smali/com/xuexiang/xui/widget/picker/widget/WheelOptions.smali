.class public Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/github/inflationx/calligraphy3/HasTypeface;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/github/inflationx/calligraphy3/HasTypeface;"
    }
.end annotation


# instance fields
.field private dividerColor:I

.field private dividerType:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

.field private isRestoreItem:Z

.field private lineSpacingMultiplier:F

.field private linkage:Z

.field private mOptions1Items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end field

.field private mOptions2Items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/List<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field private mOptions3Items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "TT;>;>;>;"
        }
    .end annotation
.end field

.field private optionsSelectChangeListener:Lcom/xuexiang/xui/widget/picker/widget/listener/OnOptionsSelectChangeListener;

.field private textColorCenter:I

.field private textColorOut:I

.field private view:Landroid/view/View;

.field private wheelListenerOption2:Lcom/xuexiang/xui/widget/picker/wheelview/listener/OnItemSelectedListener;

.field private wvOption1:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

.field private wvOption2:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

.field private wvOption3:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;


# direct methods
.method public constructor <init>(Landroid/view/View;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->linkage:Z

    .line 3
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->isRestoreItem:Z

    .line 4
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->view:Landroid/view/View;

    .line 5
    sget p2, Lcom/xuexiang/xui/R$id;->options1:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption1:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 6
    sget p2, Lcom/xuexiang/xui/R$id;->options2:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption2:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 7
    sget p2, Lcom/xuexiang/xui/R$id;->options3:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption3:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->mOptions2Items:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Lcom/xuexiang/xui/widget/picker/widget/listener/OnOptionsSelectChangeListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->optionsSelectChangeListener:Lcom/xuexiang/xui/widget/picker/widget/listener/OnOptionsSelectChangeListener;

    return-object p0
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption1:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    return-object p0
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->isRestoreItem:Z

    return p0
.end method

.method static synthetic access$400(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption2:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    return-object p0
.end method

.method static synthetic access$500(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->mOptions3Items:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$600(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Lcom/xuexiang/xui/widget/picker/wheelview/listener/OnItemSelectedListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wheelListenerOption2:Lcom/xuexiang/xui/widget/picker/wheelview/listener/OnItemSelectedListener;

    return-object p0
.end method

.method static synthetic access$700(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption3:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    return-object p0
.end method

.method private itemSelected(III)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->mOptions1Items:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption1:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->mOptions2Items:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption2:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance v2, Lcom/xuexiang/xui/widget/picker/widget/adapter/ArrayWheelAdapter;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-direct {v2, v0}, Lcom/xuexiang/xui/widget/picker/widget/adapter/ArrayWheelAdapter;-><init>(Ljava/util/List;)V

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption2:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->mOptions3Items:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption3:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance v2, Lcom/xuexiang/xui/widget/picker/widget/adapter/ArrayWheelAdapter;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-direct {v2, p1}, Lcom/xuexiang/xui/widget/picker/widget/adapter/ArrayWheelAdapter;-><init>(Ljava/util/List;)V

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption3:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p1, p3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    :cond_2
    return-void
.end method

.method private setDividerColor()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption1:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->dividerColor:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setDividerColor(I)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption2:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->dividerColor:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setDividerColor(I)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption3:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->dividerColor:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setDividerColor(I)V

    return-void
.end method

.method private setDividerType()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption1:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->dividerType:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setDividerType(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption2:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->dividerType:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setDividerType(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption3:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->dividerType:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setDividerType(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;)V

    return-void
.end method

.method private setLineSpacingMultiplier()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption1:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->lineSpacingMultiplier:F

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLineSpacingMultiplier(F)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption2:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->lineSpacingMultiplier:F

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLineSpacingMultiplier(F)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption3:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->lineSpacingMultiplier:F

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLineSpacingMultiplier(F)V

    return-void
.end method

.method private setTextColorCenter()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption1:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->textColorCenter:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextColorCenter(I)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption2:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->textColorCenter:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextColorCenter(I)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption3:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->textColorCenter:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextColorCenter(I)V

    return-void
.end method

.method private setTextColorOut()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption1:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->textColorOut:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextColorOut(I)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption2:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->textColorOut:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextColorOut(I)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption3:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->textColorOut:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextColorOut(I)V

    return-void
.end method


# virtual methods
.method public getCurrentItems()[I
    .locals 7

    const/4 v0, 0x3

    new-array v0, v0, [I

    .line 1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption1:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->mOptions2Items:Ljava/util/List;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption2:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v1

    iget-object v4, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->mOptions2Items:Ljava/util/List;

    aget v5, v0, v2

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    sub-int/2addr v4, v3

    if-le v1, v4, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption2:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v1

    :goto_0
    aput v1, v0, v3

    goto :goto_1

    .line 4
    :cond_1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption2:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v1

    aput v1, v0, v3

    .line 5
    :goto_1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->mOptions3Items:Ljava/util/List;

    const/4 v4, 0x2

    if-eqz v1, :cond_3

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_3

    .line 6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption3:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v1

    iget-object v5, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->mOptions3Items:Ljava/util/List;

    aget v6, v0, v2

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    aget v6, v0, v3

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    sub-int/2addr v5, v3

    if-le v1, v5, :cond_2

    goto :goto_2

    :cond_2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption3:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v2

    :goto_2
    aput v2, v0, v4

    goto :goto_3

    .line 7
    :cond_3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption3:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v1

    aput v1, v0, v4

    :goto_3
    return-object v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->view:Landroid/view/View;

    return-object v0
.end method

.method public isCenterLabel(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption1:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->isCenterLabel(Z)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption2:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->isCenterLabel(Z)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption3:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->isCenterLabel(Z)V

    return-void
.end method

.method public setCurrentItems(III)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->linkage:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->itemSelected(III)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption1:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption2:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption3:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p1, p3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    :goto_0
    return-void
.end method

.method public setCyclic(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption1:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCyclic(Z)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption2:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCyclic(Z)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption3:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCyclic(Z)V

    return-void
.end method

.method public setCyclic(ZZZ)V
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption1:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCyclic(Z)V

    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption2:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCyclic(Z)V

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption3:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p1, p3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCyclic(Z)V

    return-void
.end method

.method public setDividerColor(I)V
    .locals 0

    .line 4
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->dividerColor:I

    .line 5
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->setDividerColor()V

    return-void
.end method

.method public setDividerType(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;)V
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->dividerType:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

    .line 5
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->setDividerType()V

    return-void
.end method

.method public setLabels(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption1:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLabel(Ljava/lang/String;)V

    :cond_0
    if-eqz p2, :cond_1

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption2:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLabel(Ljava/lang/String;)V

    :cond_1
    if-eqz p3, :cond_2

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption3:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p1, p3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLabel(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public setLineSpacingMultiplier(F)V
    .locals 0

    .line 4
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->lineSpacingMultiplier:F

    .line 5
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->setLineSpacingMultiplier()V

    return-void
.end method

.method public setLinkage(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->linkage:Z

    return-void
.end method

.method public setNPicker(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;",
            "Ljava/util/List<",
            "TT;>;",
            "Ljava/util/List<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption1:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance v1, Lcom/xuexiang/xui/widget/picker/widget/adapter/ArrayWheelAdapter;

    invoke-direct {v1, p1}, Lcom/xuexiang/xui/widget/picker/widget/adapter/ArrayWheelAdapter;-><init>(Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption1:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    if-eqz p2, :cond_0

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption2:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance v1, Lcom/xuexiang/xui/widget/picker/widget/adapter/ArrayWheelAdapter;

    invoke-direct {v1, p2}, Lcom/xuexiang/xui/widget/picker/widget/adapter/ArrayWheelAdapter;-><init>(Ljava/util/List;)V

    invoke-virtual {p1, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption2:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    if-eqz p3, :cond_1

    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption3:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance v1, Lcom/xuexiang/xui/widget/picker/widget/adapter/ArrayWheelAdapter;

    invoke-direct {v1, p3}, Lcom/xuexiang/xui/widget/picker/widget/adapter/ArrayWheelAdapter;-><init>(Ljava/util/List;)V

    invoke-virtual {p1, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    .line 6
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption3:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption1:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setIsOptions(Z)V

    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption2:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p1, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setIsOptions(Z)V

    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption3:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p1, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setIsOptions(Z)V

    .line 10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->optionsSelectChangeListener:Lcom/xuexiang/xui/widget/picker/widget/listener/OnOptionsSelectChangeListener;

    if-eqz p1, :cond_2

    .line 11
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption1:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance v1, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$4;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$4;-><init>(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)V

    invoke-virtual {p1, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setOnItemSelectedListener(Lcom/xuexiang/xui/widget/picker/wheelview/listener/OnItemSelectedListener;)V

    :cond_2
    const/16 p1, 0x8

    if-nez p2, :cond_3

    .line 12
    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption2:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 13
    :cond_3
    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption2:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 14
    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->optionsSelectChangeListener:Lcom/xuexiang/xui/widget/picker/widget/listener/OnOptionsSelectChangeListener;

    if-eqz p2, :cond_4

    .line 15
    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption2:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance v1, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$5;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$5;-><init>(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)V

    invoke-virtual {p2, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setOnItemSelectedListener(Lcom/xuexiang/xui/widget/picker/wheelview/listener/OnItemSelectedListener;)V

    :cond_4
    :goto_0
    if-nez p3, :cond_5

    .line 16
    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption3:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 17
    :cond_5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption3:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 18
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->optionsSelectChangeListener:Lcom/xuexiang/xui/widget/picker/widget/listener/OnOptionsSelectChangeListener;

    if-eqz p1, :cond_6

    .line 19
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption3:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance p2, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$6;

    invoke-direct {p2, p0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$6;-><init>(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)V

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setOnItemSelectedListener(Lcom/xuexiang/xui/widget/picker/wheelview/listener/OnItemSelectedListener;)V

    :cond_6
    :goto_1
    return-void
.end method

.method public setOptionsSelectChangeListener(Lcom/xuexiang/xui/widget/picker/widget/listener/OnOptionsSelectChangeListener;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->optionsSelectChangeListener:Lcom/xuexiang/xui/widget/picker/widget/listener/OnOptionsSelectChangeListener;

    return-void
.end method

.method public setPicker(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "TT;>;>;",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "TT;>;>;>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->mOptions1Items:Ljava/util/List;

    .line 2
    iput-object p2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->mOptions2Items:Ljava/util/List;

    .line 3
    iput-object p3, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->mOptions3Items:Ljava/util/List;

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption1:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance v1, Lcom/xuexiang/xui/widget/picker/widget/adapter/ArrayWheelAdapter;

    invoke-direct {v1, p1}, Lcom/xuexiang/xui/widget/picker/widget/adapter/ArrayWheelAdapter;-><init>(Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption1:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->mOptions2Items:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 7
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption2:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance v3, Lcom/xuexiang/xui/widget/picker/widget/adapter/ArrayWheelAdapter;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-direct {v3, v0}, Lcom/xuexiang/xui/widget/picker/widget/adapter/ArrayWheelAdapter;-><init>(Ljava/util/List;)V

    invoke-virtual {v2, v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption2:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->mOptions3Items:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 10
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption3:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance v3, Lcom/xuexiang/xui/widget/picker/widget/adapter/ArrayWheelAdapter;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-direct {v3, v0}, Lcom/xuexiang/xui/widget/picker/widget/adapter/ArrayWheelAdapter;-><init>(Ljava/util/List;)V

    invoke-virtual {v2, v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    .line 11
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption3:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption1:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setIsOptions(Z)V

    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption2:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setIsOptions(Z)V

    .line 14
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption3:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setIsOptions(Z)V

    .line 15
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->mOptions2Items:Ljava/util/List;

    const/16 v2, 0x8

    if-nez v0, :cond_2

    .line 16
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption2:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 17
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption2:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 18
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->mOptions3Items:Ljava/util/List;

    if-nez v0, :cond_3

    .line 19
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption3:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 20
    :cond_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption3:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 21
    :goto_1
    new-instance v0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$1;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$1;-><init>(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)V

    .line 22
    new-instance v1, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$2;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$2;-><init>(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)V

    iput-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wheelListenerOption2:Lcom/xuexiang/xui/widget/picker/wheelview/listener/OnItemSelectedListener;

    if-eqz p1, :cond_4

    .line 23
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->linkage:Z

    if-eqz p1, :cond_4

    .line 24
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption1:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setOnItemSelectedListener(Lcom/xuexiang/xui/widget/picker/wheelview/listener/OnItemSelectedListener;)V

    :cond_4
    if-eqz p2, :cond_5

    .line 25
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->linkage:Z

    if-eqz p1, :cond_5

    .line 26
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption2:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wheelListenerOption2:Lcom/xuexiang/xui/widget/picker/wheelview/listener/OnItemSelectedListener;

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setOnItemSelectedListener(Lcom/xuexiang/xui/widget/picker/wheelview/listener/OnItemSelectedListener;)V

    :cond_5
    if-eqz p3, :cond_6

    .line 27
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->linkage:Z

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->optionsSelectChangeListener:Lcom/xuexiang/xui/widget/picker/widget/listener/OnOptionsSelectChangeListener;

    if-eqz p1, :cond_6

    .line 28
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption3:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance p2, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$3;

    invoke-direct {p2, p0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions$3;-><init>(Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;)V

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setOnItemSelectedListener(Lcom/xuexiang/xui/widget/picker/wheelview/listener/OnItemSelectedListener;)V

    :cond_6
    return-void
.end method

.method public setTextColorCenter(I)V
    .locals 0

    .line 4
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->textColorCenter:I

    .line 5
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->setTextColorCenter()V

    return-void
.end method

.method public setTextColorOut(I)V
    .locals 0

    .line 4
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->textColorOut:I

    .line 5
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->setTextColorOut()V

    return-void
.end method

.method public setTextContentSize(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption1:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextSize(F)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption2:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextSize(F)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption3:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextSize(F)V

    return-void
.end method

.method public setTextXOffset(III)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption1:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextXOffset(I)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption2:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextXOffset(I)V

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption3:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p1, p3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextXOffset(I)V

    return-void
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption1:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption2:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->wvOption3:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_2
    return-void
.end method

.method public setView(Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->view:Landroid/view/View;

    return-void
.end method
