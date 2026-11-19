.class public final Lcom/friday/lecture/adapter/PaintColorAdapter;
.super Lcom/chad/library/adapter/base/BaseQuickAdapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
        "Lcom/friday/lecture/model/PaintColorEntity;",
        "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;",
        ">;"
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    invoke-direct {p0, p1, v0, v1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;-><init>(ILjava/util/List;ILkotlin/jvm/internal/n;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic convert(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/friday/lecture/model/PaintColorEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/adapter/PaintColorAdapter;->i(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/friday/lecture/model/PaintColorEntity;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public i(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/friday/lecture/model/PaintColorEntity;)V
    .locals 2

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "item"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget v0, Lcom/friday/lecture/R$id;->iv_color:I

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Landroid/widget/ImageView;

    .line 18
    .line 19
    invoke-virtual {p2}, Lcom/friday/lecture/model/PaintColorEntity;->getSelected()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-static {p1}, Lcom/bumptech/glide/b;->u(Landroid/view/View;)Lcom/bumptech/glide/h;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sget v1, Lcom/friday/lecture/R$drawable;->paint_color_selected:I

    .line 30
    .line 31
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/h;->r(Ljava/lang/Integer;)Lcom/bumptech/glide/g;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Lz0/a;->k()Lz0/a;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Lcom/bumptech/glide/g;

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/g;->A0(Landroid/widget/ImageView;)La1/i;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    const/4 v0, 0x0

    .line 54
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 55
    .line 56
    .line 57
    :goto_0
    invoke-virtual {p2}, Lcom/friday/lecture/model/PaintColorEntity;->getColor()I

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 62
    .line 63
    .line 64
    return-void
.end method
