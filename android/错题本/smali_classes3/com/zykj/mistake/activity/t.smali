.class public final Lcom/zykj/mistake/activity/t;
.super La6/a;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

.field public final synthetic c:Landroid/widget/ImageView;

.field public final synthetic d:I

.field public final synthetic e:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(ILandroid/widget/ImageView;Landroid/widget/ImageView;Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;)V
    .locals 0

    .line 1
    iput-object p4, p0, Lcom/zykj/mistake/activity/t;->b:Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/activity/t;->c:Landroid/widget/ImageView;

    .line 4
    .line 5
    iput p1, p0, Lcom/zykj/mistake/activity/t;->d:I

    .line 6
    .line 7
    iput-object p3, p0, Lcom/zykj/mistake/activity/t;->e:Landroid/widget/ImageView;

    .line 8
    .line 9
    invoke-direct {p0}, La6/a;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onComplete()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/activity/t;->b:Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseMVPActivity;->c()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "uri"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/mistake/activity/t;->b:Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/bumptech/glide/b;->d(Landroid/content/Context;)Lo0/h;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1, v0}, Lo0/h;->c(Landroidx/fragment/app/FragmentActivity;)Lcom/bumptech/glide/h;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1, p1}, Lcom/bumptech/glide/h;->l(Ljava/lang/String;)Lcom/bumptech/glide/f;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    new-instance v2, Lr0/d;

    .line 23
    .line 24
    invoke-direct {v2}, Lr0/a;-><init>()V

    .line 25
    .line 26
    .line 27
    sget-object v3, Lb0/o;->b:Lb0/m;

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Lr0/a;->g(Lb0/o;)Lr0/a;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Lr0/d;

    .line 34
    .line 35
    invoke-virtual {v2}, Lr0/a;->r()Lr0/a;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v1, v2}, Lcom/bumptech/glide/f;->w(Lr0/a;)Lcom/bumptech/glide/f;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iget-object v2, p0, Lcom/zykj/mistake/activity/t;->c:Landroid/widget/ImageView;

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Lcom/bumptech/glide/f;->y(Landroid/widget/ImageView;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, v0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->p:[Ljava/lang/String;

    .line 49
    .line 50
    iget v1, p0, Lcom/zykj/mistake/activity/t;->d:I

    .line 51
    .line 52
    aput-object p1, v0, v1

    .line 53
    .line 54
    const/4 p1, 0x1

    .line 55
    invoke-virtual {v2, p1}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 56
    .line 57
    .line 58
    invoke-static {v2, p1}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->C(Landroid/widget/ImageView;Z)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, Lcom/zykj/mistake/activity/t;->e:Landroid/widget/ImageView;

    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 65
    .line 66
    .line 67
    return-void
.end method
