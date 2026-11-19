.class public Lcom/luck/picture/lib/PictureSelectorSystemFragment$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/PictureSelectorSystemFragment;->d1()V
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
    iput-object p1, p0, Lcom/luck/picture/lib/PictureSelectorSystemFragment$a;->a:Lcom/luck/picture/lib/PictureSelectorSystemFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorSystemFragment$a;->a:Lcom/luck/picture/lib/PictureSelectorSystemFragment;

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->p0()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorSystemFragment$a;->a:Lcom/luck/picture/lib/PictureSelectorSystemFragment;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {v0, p1}, Lcom/luck/picture/lib/PictureSelectorSystemFragment;->b1(Lcom/luck/picture/lib/PictureSelectorSystemFragment;Ljava/lang/String;)Lcom/luck/picture/lib/entity/LocalMedia;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {}, La7/j;->e()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->x()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->z()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :goto_0
    invoke-virtual {p1, v0}, Lcom/luck/picture/lib/entity/LocalMedia;->n0(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorSystemFragment$a;->a:Lcom/luck/picture/lib/PictureSelectorSystemFragment;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-virtual {v0, p1, v1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->E(Lcom/luck/picture/lib/entity/LocalMedia;Z)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_2

    .line 45
    .line 46
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorSystemFragment$a;->a:Lcom/luck/picture/lib/PictureSelectorSystemFragment;

    .line 47
    .line 48
    invoke-static {p1}, Lcom/luck/picture/lib/PictureSelectorSystemFragment;->c1(Lcom/luck/picture/lib/PictureSelectorSystemFragment;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorSystemFragment$a;->a:Lcom/luck/picture/lib/PictureSelectorSystemFragment;

    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->p0()V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public bridge synthetic onActivityResult(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Landroid/net/Uri;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/PictureSelectorSystemFragment$a;->a(Landroid/net/Uri;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
