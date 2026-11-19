.class public Lcom/zykj/video/play/view/TCVodQualityView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/video/play/view/TCVodQualityView$b;,
        Lcom/zykj/video/play/view/TCVodQualityView$d;,
        Lcom/zykj/video/play/view/TCVodQualityView$c;
    }
.end annotation


# instance fields
.field public a:Landroid/content/Context;

.field public b:Lcom/zykj/video/play/view/TCVodQualityView$b;

.field public c:Landroid/widget/ListView;

.field public d:Lcom/zykj/video/play/view/TCVodQualityView$c;

.field public e:Ljava/util/List;

.field public f:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 p2, -0x1

    .line 5
    iput p2, p0, Lcom/zykj/video/play/view/TCVodQualityView;->f:I

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/zykj/video/play/view/TCVodQualityView;->g(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic a(Lcom/zykj/video/play/view/TCVodQualityView;)Lcom/zykj/video/play/view/TCVodQualityView$b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/view/TCVodQualityView;->b:Lcom/zykj/video/play/view/TCVodQualityView$b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(Lcom/zykj/video/play/view/TCVodQualityView;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/view/TCVodQualityView;->e:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic c(Lcom/zykj/video/play/view/TCVodQualityView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/zykj/video/play/view/TCVodQualityView;->f:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic d(Lcom/zykj/video/play/view/TCVodQualityView;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/video/play/view/TCVodQualityView;->f:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic e(Lcom/zykj/video/play/view/TCVodQualityView;)Lcom/zykj/video/play/view/TCVodQualityView$c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/view/TCVodQualityView;->d:Lcom/zykj/video/play/view/TCVodQualityView$c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic f(Lcom/zykj/video/play/view/TCVodQualityView;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/view/TCVodQualityView;->a:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final g(Landroid/content/Context;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/view/TCVodQualityView;->a:Landroid/content/Context;

    .line 2
    .line 3
    new-instance p1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/zykj/video/play/view/TCVodQualityView;->e:Ljava/util/List;

    .line 9
    .line 10
    iget-object p1, p0, Lcom/zykj/video/play/view/TCVodQualityView;->a:Landroid/content/Context;

    .line 11
    .line 12
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    sget v0, Lcom/zykj/video/play/R$layout;->superplayer_quality_popup_view:I

    .line 17
    .line 18
    invoke-virtual {p1, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_lv_quality:I

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Landroid/widget/ListView;

    .line 28
    .line 29
    iput-object p1, p0, Lcom/zykj/video/play/view/TCVodQualityView;->c:Landroid/widget/ListView;

    .line 30
    .line 31
    new-instance v0, Lcom/zykj/video/play/view/TCVodQualityView$a;

    .line 32
    .line 33
    invoke-direct {v0, p0}, Lcom/zykj/video/play/view/TCVodQualityView$a;-><init>(Lcom/zykj/video/play/view/TCVodQualityView;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 37
    .line 38
    .line 39
    new-instance p1, Lcom/zykj/video/play/view/TCVodQualityView$c;

    .line 40
    .line 41
    invoke-direct {p1, p0}, Lcom/zykj/video/play/view/TCVodQualityView$c;-><init>(Lcom/zykj/video/play/view/TCVodQualityView;)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lcom/zykj/video/play/view/TCVodQualityView;->d:Lcom/zykj/video/play/view/TCVodQualityView$c;

    .line 45
    .line 46
    iget-object v0, p0, Lcom/zykj/video/play/view/TCVodQualityView;->c:Landroid/widget/ListView;

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public setCallback(Lcom/zykj/video/play/view/TCVodQualityView$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/view/TCVodQualityView;->b:Lcom/zykj/video/play/view/TCVodQualityView$b;

    .line 2
    .line 3
    return-void
.end method

.method public setDefaultSelectedQuality(I)V
    .locals 0

    .line 1
    if-gez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    :cond_0
    iput p1, p0, Lcom/zykj/video/play/view/TCVodQualityView;->f:I

    .line 5
    .line 6
    iget-object p1, p0, Lcom/zykj/video/play/view/TCVodQualityView;->d:Lcom/zykj/video/play/view/TCVodQualityView$c;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setVideoQualityList(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lj5/g;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/view/TCVodQualityView;->e:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/video/play/view/TCVodQualityView;->e:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/video/play/view/TCVodQualityView;->d:Lcom/zykj/video/play/view/TCVodQualityView$c;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method
