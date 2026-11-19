.class public final Lk2/n$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk2/n$a;->e(Landroidx/fragment/app/Fragment;Lhd/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lhd/l;


# direct methods
.method public constructor <init>(Lhd/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk2/n$a$a;->a:Lhd/l;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ljava/util/ArrayList;)V
    .locals 8

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/luck/picture/lib/entity/LocalMedia;->j()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/luck/picture/lib/entity/LocalMedia;->z()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->x()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :cond_1
    move-object v3, v1

    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    sget-object v2, Lk2/n;->a:Lk2/n$a;

    .line 49
    .line 50
    const/4 v6, 0x6

    .line 51
    const/4 v7, 0x0

    .line 52
    const/4 v4, 0x0

    .line 53
    const/4 v5, 0x0

    .line 54
    invoke-static/range {v2 .. v7}, Lk2/n$a;->b(Lk2/n$a;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_2
    :goto_0
    iget-object p1, p0, Lk2/n$a$a;->a:Lhd/l;

    .line 58
    .line 59
    if-eqz p1, :cond_3

    .line 60
    .line 61
    const/4 v0, 0x1

    .line 62
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-interface {p1, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    :cond_3
    return-void
.end method

.method public onCancel()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk2/n$a$a;->a:Lhd/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v0, v1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method
