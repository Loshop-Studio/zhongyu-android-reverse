.class public final Lp4/s;
.super Lp2/d;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "listItems"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lm1/c;

    .line 12
    .line 13
    invoke-direct {v0, p1, p2}, Lm1/c;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1, v0}, Lp2/d;-><init>(Landroid/content/Context;Lm1/c;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public v(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lp2/c;->v(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lp2/c;->o:Landroid/widget/ImageView;

    .line 5
    .line 6
    const/16 v0, 0x8

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lp2/c;->n:Landroid/widget/ImageView;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
