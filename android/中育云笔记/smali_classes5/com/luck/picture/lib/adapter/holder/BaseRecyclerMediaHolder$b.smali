.class public Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->d(Lcom/luck/picture/lib/entity/LocalMedia;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/luck/picture/lib/entity/LocalMedia;

.field public final synthetic d:I

.field public final synthetic e:Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;Lcom/luck/picture/lib/entity/LocalMedia;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$b;->e:Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$b;->c:Lcom/luck/picture/lib/entity/LocalMedia;

    .line 4
    .line 5
    iput p3, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$b;->d:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$b;->c:Lcom/luck/picture/lib/entity/LocalMedia;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->J()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_4

    .line 8
    .line 9
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$b;->e:Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->a(Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;)Lcom/luck/picture/lib/adapter/PictureImageGridAdapter$b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$b;->e:Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;

    .line 19
    .line 20
    invoke-static {p1}, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->a(Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;)Lcom/luck/picture/lib/adapter/PictureImageGridAdapter$b;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$b;->e:Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;

    .line 25
    .line 26
    iget-object v0, v0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->d:Landroid/widget/TextView;

    .line 27
    .line 28
    iget v1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$b;->d:I

    .line 29
    .line 30
    iget-object v2, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$b;->c:Lcom/luck/picture/lib/entity/LocalMedia;

    .line 31
    .line 32
    invoke-interface {p1, v0, v1, v2}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter$b;->a(Landroid/view/View;ILcom/luck/picture/lib/entity/LocalMedia;)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    const/4 v0, -0x1

    .line 37
    if-ne p1, v0, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    if-nez p1, :cond_2

    .line 41
    .line 42
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$b;->e:Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;

    .line 43
    .line 44
    iget-object v0, p1, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 45
    .line 46
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->F0:Z

    .line 47
    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 51
    .line 52
    iget-object p1, p1, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->c:Landroid/widget/ImageView;

    .line 53
    .line 54
    invoke-static {p1}, La7/b;->b(Landroid/view/View;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    const/4 v0, 0x1

    .line 59
    if-ne p1, v0, :cond_3

    .line 60
    .line 61
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$b;->e:Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;

    .line 62
    .line 63
    iget-object p1, p1, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 64
    .line 65
    iget-boolean p1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->F0:Z

    .line 66
    .line 67
    if-eqz p1, :cond_3

    .line 68
    .line 69
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 70
    .line 71
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$b;->e:Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;

    .line 72
    .line 73
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$b;->c:Lcom/luck/picture/lib/entity/LocalMedia;

    .line 74
    .line 75
    invoke-static {p1, v0}, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->b(Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;Lcom/luck/picture/lib/entity/LocalMedia;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-static {p1, v0}, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->c(Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;Z)V

    .line 80
    .line 81
    .line 82
    :cond_4
    :goto_1
    return-void
.end method
