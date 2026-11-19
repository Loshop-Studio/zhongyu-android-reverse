.class public Lcom/zykj/video/play/view/TCVodQualityView$c;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/video/play/view/TCVodQualityView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/video/play/view/TCVodQualityView;


# direct methods
.method public constructor <init>(Lcom/zykj/video/play/view/TCVodQualityView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/view/TCVodQualityView$c;->a:Lcom/zykj/video/play/view/TCVodQualityView;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/view/TCVodQualityView$c;->a:Lcom/zykj/video/play/view/TCVodQualityView;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/video/play/view/TCVodQualityView;->b(Lcom/zykj/video/play/view/TCVodQualityView;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    new-instance p2, Lcom/zykj/video/play/view/TCVodQualityView$d;

    .line 4
    .line 5
    iget-object p3, p0, Lcom/zykj/video/play/view/TCVodQualityView$c;->a:Lcom/zykj/video/play/view/TCVodQualityView;

    .line 6
    .line 7
    invoke-static {p3}, Lcom/zykj/video/play/view/TCVodQualityView;->f(Lcom/zykj/video/play/view/TCVodQualityView;)Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-direct {p2, p3, v0}, Lcom/zykj/video/play/view/TCVodQualityView$d;-><init>(Lcom/zykj/video/play/view/TCVodQualityView;Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    check-cast p2, Lcom/zykj/video/play/view/TCVodQualityView$d;

    .line 15
    .line 16
    const/4 p3, 0x0

    .line 17
    invoke-virtual {p2, p3}, Lcom/zykj/video/play/view/TCVodQualityView$d;->setSelected(Z)V

    .line 18
    .line 19
    .line 20
    iget-object p3, p0, Lcom/zykj/video/play/view/TCVodQualityView$c;->a:Lcom/zykj/video/play/view/TCVodQualityView;

    .line 21
    .line 22
    invoke-static {p3}, Lcom/zykj/video/play/view/TCVodQualityView;->b(Lcom/zykj/video/play/view/TCVodQualityView;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    check-cast p3, Lj5/g;

    .line 31
    .line 32
    iget-object p3, p3, Lj5/g;->d:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {p2, p3}, Lcom/zykj/video/play/view/TCVodQualityView$d;->b(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object p3, p0, Lcom/zykj/video/play/view/TCVodQualityView$c;->a:Lcom/zykj/video/play/view/TCVodQualityView;

    .line 38
    .line 39
    invoke-static {p3}, Lcom/zykj/video/play/view/TCVodQualityView;->c(Lcom/zykj/video/play/view/TCVodQualityView;)I

    .line 40
    .line 41
    .line 42
    move-result p3

    .line 43
    if-ne p3, p1, :cond_1

    .line 44
    .line 45
    const/4 p1, 0x1

    .line 46
    invoke-virtual {p2, p1}, Lcom/zykj/video/play/view/TCVodQualityView$d;->setSelected(Z)V

    .line 47
    .line 48
    .line 49
    :cond_1
    return-object p2
.end method
