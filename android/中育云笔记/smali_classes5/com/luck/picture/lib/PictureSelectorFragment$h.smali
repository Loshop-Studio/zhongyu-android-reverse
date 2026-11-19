.class public Lcom/luck/picture/lib/PictureSelectorFragment$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/luck/picture/lib/widget/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/PictureSelectorFragment;->L1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/util/HashSet;

.field public final synthetic b:Lcom/luck/picture/lib/PictureSelectorFragment;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/PictureSelectorFragment;Ljava/util/HashSet;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$h;->b:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/luck/picture/lib/PictureSelectorFragment$h;->a:Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(IIZZ)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/luck/picture/lib/PictureSelectorFragment$h;->b:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 2
    .line 3
    invoke-static {p2}, Lcom/luck/picture/lib/PictureSelectorFragment;->U0(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p2}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->b()Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    if-eqz p3, :cond_2

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    if-le p1, p3, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 29
    .line 30
    iget-object p2, p0, Lcom/luck/picture/lib/PictureSelectorFragment$h;->b:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 31
    .line 32
    invoke-static {}, Lu6/a;->n()Ljava/util/ArrayList;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    invoke-virtual {p2, p1, p3}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->E(Lcom/luck/picture/lib/entity/LocalMedia;Z)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    iget-object p2, p0, Lcom/luck/picture/lib/PictureSelectorFragment$h;->b:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 45
    .line 46
    invoke-static {p2}, Lcom/luck/picture/lib/PictureSelectorFragment;->l1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/widget/SlideSelectTouchListener;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    const/4 p3, -0x1

    .line 51
    if-eq p1, p3, :cond_1

    .line 52
    .line 53
    const/4 p1, 0x1

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    const/4 p1, 0x0

    .line 56
    :goto_0
    invoke-virtual {p2, p1}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->m(Z)V

    .line 57
    .line 58
    .line 59
    :cond_2
    :goto_1
    return-void
.end method

.method public b()Ljava/util/HashSet;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-static {}, Lu6/a;->l()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    invoke-static {}, Lu6/a;->n()Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 17
    .line 18
    iget-object v2, p0, Lcom/luck/picture/lib/PictureSelectorFragment$h;->a:Ljava/util/HashSet;

    .line 19
    .line 20
    iget v1, v1, Lcom/luck/picture/lib/entity/LocalMedia;->o:I

    .line 21
    .line 22
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    add-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment$h;->a:Ljava/util/HashSet;

    .line 33
    .line 34
    return-object v0
.end method

.method public bridge synthetic getSelection()Ljava/util/Set;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/PictureSelectorFragment$h;->b()Ljava/util/HashSet;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
