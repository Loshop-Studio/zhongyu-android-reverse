.class public Lcom/lljjcoder/style/cityjd/ProvinceAdapter;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lljjcoder/style/cityjd/ProvinceAdapter$Holder;
    }
.end annotation


# instance fields
.field context:Landroid/content/Context;

.field mProList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/lljjcoder/bean/ProvinceBean;",
            ">;"
        }
    .end annotation
.end field

.field private provinceIndex:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/lljjcoder/bean/ProvinceBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/lljjcoder/style/cityjd/ProvinceAdapter;->provinceIndex:I

    .line 6
    .line 7
    iput-object p1, p0, Lcom/lljjcoder/style/cityjd/ProvinceAdapter;->context:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p2, p0, Lcom/lljjcoder/style/cityjd/ProvinceAdapter;->mProList:Ljava/util/List;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/ProvinceAdapter;->mProList:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItem(I)Lcom/lljjcoder/bean/ProvinceBean;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/ProvinceAdapter;->mProList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/lljjcoder/bean/ProvinceBean;

    return-object p1
.end method

.method public bridge synthetic getItem(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/lljjcoder/style/cityjd/ProvinceAdapter;->getItem(I)Lcom/lljjcoder/bean/ProvinceBean;

    move-result-object p1

    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/ProvinceAdapter;->mProList:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/lljjcoder/bean/ProvinceBean;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/lljjcoder/bean/ProvinceBean;->getId()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    return-wide v0
.end method

.method public getSelectedPosition()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/lljjcoder/style/cityjd/ProvinceAdapter;->provinceIndex:I

    .line 2
    .line 3
    return v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    sget v1, Lcom/lljjcoder/style/citypickerview/R$layout;->pop_jdcitypicker_item:I

    .line 13
    .line 14
    invoke-virtual {p2, v1, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    new-instance p3, Lcom/lljjcoder/style/cityjd/ProvinceAdapter$Holder;

    .line 19
    .line 20
    invoke-direct {p3, p0}, Lcom/lljjcoder/style/cityjd/ProvinceAdapter$Holder;-><init>(Lcom/lljjcoder/style/cityjd/ProvinceAdapter;)V

    .line 21
    .line 22
    .line 23
    sget v1, Lcom/lljjcoder/style/citypickerview/R$id;->name:I

    .line 24
    .line 25
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Landroid/widget/TextView;

    .line 30
    .line 31
    iput-object v1, p3, Lcom/lljjcoder/style/cityjd/ProvinceAdapter$Holder;->name:Landroid/widget/TextView;

    .line 32
    .line 33
    sget v1, Lcom/lljjcoder/style/citypickerview/R$id;->selectImg:I

    .line 34
    .line 35
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Landroid/widget/ImageView;

    .line 40
    .line 41
    iput-object v1, p3, Lcom/lljjcoder/style/cityjd/ProvinceAdapter$Holder;->selectImg:Landroid/widget/ImageView;

    .line 42
    .line 43
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    check-cast p3, Lcom/lljjcoder/style/cityjd/ProvinceAdapter$Holder;

    .line 52
    .line 53
    :goto_0
    invoke-virtual {p0, p1}, Lcom/lljjcoder/style/cityjd/ProvinceAdapter;->getItem(I)Lcom/lljjcoder/bean/ProvinceBean;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iget-object v1, p3, Lcom/lljjcoder/style/cityjd/ProvinceAdapter$Holder;->name:Landroid/widget/TextView;

    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/lljjcoder/bean/ProvinceBean;->getName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 64
    .line 65
    .line 66
    iget v1, p0, Lcom/lljjcoder/style/cityjd/ProvinceAdapter;->provinceIndex:I

    .line 67
    .line 68
    const/4 v2, -0x1

    .line 69
    if-eq v1, v2, :cond_1

    .line 70
    .line 71
    iget-object v2, p0, Lcom/lljjcoder/style/cityjd/ProvinceAdapter;->mProList:Ljava/util/List;

    .line 72
    .line 73
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, Lcom/lljjcoder/bean/ProvinceBean;

    .line 78
    .line 79
    invoke-virtual {v1}, Lcom/lljjcoder/bean/ProvinceBean;->getName()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {p1}, Lcom/lljjcoder/bean/ProvinceBean;->getName()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_1

    .line 92
    .line 93
    const/4 p1, 0x1

    .line 94
    goto :goto_1

    .line 95
    :cond_1
    move p1, v0

    .line 96
    :goto_1
    iget-object v1, p3, Lcom/lljjcoder/style/cityjd/ProvinceAdapter$Holder;->name:Landroid/widget/TextView;

    .line 97
    .line 98
    xor-int/lit8 v2, p1, 0x1

    .line 99
    .line 100
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 101
    .line 102
    .line 103
    iget-object p3, p3, Lcom/lljjcoder/style/cityjd/ProvinceAdapter$Holder;->selectImg:Landroid/widget/ImageView;

    .line 104
    .line 105
    if-eqz p1, :cond_2

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_2
    const/16 v0, 0x8

    .line 109
    .line 110
    :goto_2
    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 111
    .line 112
    .line 113
    return-object p2
.end method

.method public updateSelectedPosition(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/lljjcoder/style/cityjd/ProvinceAdapter;->provinceIndex:I

    .line 2
    .line 3
    return-void
.end method
