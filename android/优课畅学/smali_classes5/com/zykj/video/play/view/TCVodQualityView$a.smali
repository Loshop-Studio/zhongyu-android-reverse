.class public Lcom/zykj/video/play/view/TCVodQualityView$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/video/play/view/TCVodQualityView;->g(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/video/play/view/TCVodQualityView;


# direct methods
.method public constructor <init>(Lcom/zykj/video/play/view/TCVodQualityView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/view/TCVodQualityView$a;->a:Lcom/zykj/video/play/view/TCVodQualityView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/zykj/video/play/view/TCVodQualityView$a;->a:Lcom/zykj/video/play/view/TCVodQualityView;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/zykj/video/play/view/TCVodQualityView;->a(Lcom/zykj/video/play/view/TCVodQualityView;)Lcom/zykj/video/play/view/TCVodQualityView$b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/zykj/video/play/view/TCVodQualityView$a;->a:Lcom/zykj/video/play/view/TCVodQualityView;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/zykj/video/play/view/TCVodQualityView;->b(Lcom/zykj/video/play/view/TCVodQualityView;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lcom/zykj/video/play/view/TCVodQualityView$a;->a:Lcom/zykj/video/play/view/TCVodQualityView;

    .line 18
    .line 19
    invoke-static {p1}, Lcom/zykj/video/play/view/TCVodQualityView;->b(Lcom/zykj/video/play/view/TCVodQualityView;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-lez p1, :cond_0

    .line 28
    .line 29
    iget-object p1, p0, Lcom/zykj/video/play/view/TCVodQualityView$a;->a:Lcom/zykj/video/play/view/TCVodQualityView;

    .line 30
    .line 31
    invoke-static {p1}, Lcom/zykj/video/play/view/TCVodQualityView;->b(Lcom/zykj/video/play/view/TCVodQualityView;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Lj5/g;

    .line 40
    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    iget-object p2, p0, Lcom/zykj/video/play/view/TCVodQualityView$a;->a:Lcom/zykj/video/play/view/TCVodQualityView;

    .line 44
    .line 45
    invoke-static {p2}, Lcom/zykj/video/play/view/TCVodQualityView;->c(Lcom/zykj/video/play/view/TCVodQualityView;)I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    if-eq p3, p2, :cond_0

    .line 50
    .line 51
    iget-object p2, p0, Lcom/zykj/video/play/view/TCVodQualityView$a;->a:Lcom/zykj/video/play/view/TCVodQualityView;

    .line 52
    .line 53
    invoke-static {p2}, Lcom/zykj/video/play/view/TCVodQualityView;->a(Lcom/zykj/video/play/view/TCVodQualityView;)Lcom/zykj/video/play/view/TCVodQualityView$b;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-interface {p2, p1}, Lcom/zykj/video/play/view/TCVodQualityView$b;->f(Lj5/g;)V

    .line 58
    .line 59
    .line 60
    :cond_0
    iget-object p1, p0, Lcom/zykj/video/play/view/TCVodQualityView$a;->a:Lcom/zykj/video/play/view/TCVodQualityView;

    .line 61
    .line 62
    invoke-static {p1, p3}, Lcom/zykj/video/play/view/TCVodQualityView;->d(Lcom/zykj/video/play/view/TCVodQualityView;I)I

    .line 63
    .line 64
    .line 65
    iget-object p1, p0, Lcom/zykj/video/play/view/TCVodQualityView$a;->a:Lcom/zykj/video/play/view/TCVodQualityView;

    .line 66
    .line 67
    invoke-static {p1}, Lcom/zykj/video/play/view/TCVodQualityView;->e(Lcom/zykj/video/play/view/TCVodQualityView;)Lcom/zykj/video/play/view/TCVodQualityView$c;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 72
    .line 73
    .line 74
    return-void
.end method
