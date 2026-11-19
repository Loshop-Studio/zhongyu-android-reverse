.class public La7/h$a;
.super Lcom/luck/picture/lib/thread/PictureThreadUtils$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La7/h;->l(Landroid/content/Context;Ljava/lang/String;Lq6/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Lq6/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lq6/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, La7/h$a;->h:Landroid/content/Context;

    .line 2
    .line 3
    iput-object p2, p0, La7/h$a;->i:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, La7/h$a;->j:Lq6/b;

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/luck/picture/lib/thread/PictureThreadUtils$d;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public bridge synthetic d()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, La7/h$a;->k()Lo6/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic i(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lo6/b;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La7/h$a;->l(Lo6/b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public k()Lo6/b;
    .locals 2

    .line 1
    iget-object v0, p0, La7/h$a;->h:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, La7/h$a;->i:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0, v1}, La7/h;->k(Landroid/content/Context;Ljava/lang/String;)Lo6/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public l(Lo6/b;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/luck/picture/lib/thread/PictureThreadUtils;->d(Lcom/luck/picture/lib/thread/PictureThreadUtils$e;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La7/h$a;->j:Lq6/b;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lq6/b;->a(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method
