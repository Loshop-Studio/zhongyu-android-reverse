.class public Lcom/luck/picture/lib/PictureSelectorSystemFragment$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/PictureSelectorSystemFragment;->e1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/luck/picture/lib/PictureSelectorSystemFragment;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/PictureSelectorSystemFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/PictureSelectorSystemFragment$h;->a:Lcom/luck/picture/lib/PictureSelectorSystemFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-ge v0, v1, :cond_2

    .line 16
    .line 17
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorSystemFragment$h;->a:Lcom/luck/picture/lib/PictureSelectorSystemFragment;

    .line 18
    .line 19
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Landroid/net/Uri;

    .line 24
    .line 25
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {v1, v2}, Lcom/luck/picture/lib/PictureSelectorSystemFragment;->Z0(Lcom/luck/picture/lib/PictureSelectorSystemFragment;Ljava/lang/String;)Lcom/luck/picture/lib/entity/LocalMedia;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {}, La7/j;->e()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/luck/picture/lib/entity/LocalMedia;->x()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    invoke-virtual {v1}, Lcom/luck/picture/lib/entity/LocalMedia;->z()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    :goto_1
    invoke-virtual {v1, v2}, Lcom/luck/picture/lib/entity/LocalMedia;->n0(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v1}, Lu6/a;->c(Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 52
    .line 53
    .line 54
    add-int/lit8 v0, v0, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorSystemFragment$h;->a:Lcom/luck/picture/lib/PictureSelectorSystemFragment;

    .line 58
    .line 59
    invoke-static {p1}, Lcom/luck/picture/lib/PictureSelectorSystemFragment;->a1(Lcom/luck/picture/lib/PictureSelectorSystemFragment;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_3
    :goto_2
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorSystemFragment$h;->a:Lcom/luck/picture/lib/PictureSelectorSystemFragment;

    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->p0()V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public bridge synthetic onActivityResult(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/PictureSelectorSystemFragment$h;->a(Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
