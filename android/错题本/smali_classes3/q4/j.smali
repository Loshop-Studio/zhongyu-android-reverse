.class public final Lq4/j;
.super Ls0/g;
.source "SourceFile"


# instance fields
.field public final synthetic b:Landroid/widget/ImageView;

.field public final synthetic c:Landroid/view/View;

.field public final synthetic d:Lcom/zykj/mistake/fragment/OriginalAnswerFragment;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;Landroid/view/View;Lcom/zykj/mistake/fragment/OriginalAnswerFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq4/j;->b:Landroid/widget/ImageView;

    .line 5
    .line 6
    iput-object p2, p0, Lq4/j;->c:Landroid/view/View;

    .line 7
    .line 8
    iput-object p3, p0, Lq4/j;->d:Lcom/zykj/mistake/fragment/OriginalAnswerFragment;

    .line 9
    .line 10
    iput-object p4, p0, Lq4/j;->e:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    iget-object v0, p0, Lq4/j;->b:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 6
    .line 7
    .line 8
    new-instance p1, La5/f;

    .line 9
    .line 10
    const/16 v0, 0xb

    .line 11
    .line 12
    iget-object v1, p0, Lq4/j;->d:Lcom/zykj/mistake/fragment/OriginalAnswerFragment;

    .line 13
    .line 14
    iget-object v2, p0, Lq4/j;->e:Ljava/lang/String;

    .line 15
    .line 16
    invoke-direct {p1, v0, v1, v2}, La5/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lq4/j;->c:Landroid/view/View;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final h(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq4/j;->b:Landroid/widget/ImageView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
