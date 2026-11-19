.class public Lcom/luck/picture/lib/PictureSelectorPreviewFragment$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->H1(Lcom/luck/picture/lib/entity/LocalMedia;ZLq6/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/luck/picture/lib/entity/LocalMedia;

.field public final synthetic b:Lq6/b;

.field public final synthetic c:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;Lcom/luck/picture/lib/entity/LocalMedia;Lq6/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$m;->c:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$m;->a:Lcom/luck/picture/lib/entity/LocalMedia;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$m;->b:Lq6/b;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lo6/b;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$m;->b(Lo6/b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(Lo6/b;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lo6/b;->c()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$m;->a:Lcom/luck/picture/lib/entity/LocalMedia;

    .line 8
    .line 9
    invoke-virtual {p1}, Lo6/b;->c()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/entity/LocalMedia;->s0(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p1}, Lo6/b;->b()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-lez v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$m;->a:Lcom/luck/picture/lib/entity/LocalMedia;

    .line 23
    .line 24
    invoke-virtual {p1}, Lo6/b;->b()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-virtual {v0, p1}, Lcom/luck/picture/lib/entity/LocalMedia;->f0(I)V

    .line 29
    .line 30
    .line 31
    :cond_1
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$m;->b:Lq6/b;

    .line 32
    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$m;->a:Lcom/luck/picture/lib/entity/LocalMedia;

    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMedia;->D()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$m;->a:Lcom/luck/picture/lib/entity/LocalMedia;

    .line 42
    .line 43
    invoke-virtual {v1}, Lcom/luck/picture/lib/entity/LocalMedia;->r()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    filled-new-array {v0, v1}, [I

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-interface {p1, v0}, Lq6/b;->a(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    return-void
.end method
