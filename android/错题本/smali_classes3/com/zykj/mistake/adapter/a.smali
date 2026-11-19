.class public final Lcom/zykj/mistake/adapter/a;
.super Ls0/f;
.source "SourceFile"


# instance fields
.field public final synthetic d:Lcom/zykj/mistake/adapter/MistakeListAdapter$ViewHolder;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/adapter/MistakeListAdapter$ViewHolder;Landroid/widget/ImageView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/adapter/a;->d:Lcom/zykj/mistake/adapter/MistakeListAdapter$ViewHolder;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ls0/f;-><init>(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/mistake/adapter/a;->d:Lcom/zykj/mistake/adapter/MistakeListAdapter$ViewHolder;

    .line 4
    .line 5
    iget-object v1, v0, Lcom/zykj/mistake/adapter/MistakeListAdapter$ViewHolder;->c:Landroid/widget/ImageView;

    .line 6
    .line 7
    sget-object v2, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, v0, Lcom/zykj/mistake/adapter/MistakeListAdapter$ViewHolder;->c:Landroid/widget/ImageView;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final h(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/adapter/a;->d:Lcom/zykj/mistake/adapter/MistakeListAdapter$ViewHolder;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/zykj/mistake/adapter/MistakeListAdapter$ViewHolder;->c:Landroid/widget/ImageView;

    .line 4
    .line 5
    sget-object v2, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Lcom/zykj/mistake/adapter/MistakeListAdapter$ViewHolder;->c:Landroid/widget/ImageView;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final i(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/adapter/a;->d:Lcom/zykj/mistake/adapter/MistakeListAdapter$ViewHolder;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/zykj/mistake/adapter/MistakeListAdapter$ViewHolder;->c:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
