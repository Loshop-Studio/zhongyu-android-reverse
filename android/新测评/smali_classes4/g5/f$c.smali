.class public Lg5/f$c;
.super Lg5/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg5/f;->onPictureTaken([BLandroid/hardware/Camera;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic e:Lg5/f;


# direct methods
.method public constructor <init>(Lg5/f;Landroid/hardware/Camera;[BLg5/e$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg5/f$c;->e:Lg5/f;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3, p4}, Lg5/e;-><init>(Landroid/hardware/Camera;[BLg5/e$a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public d(Lh5/a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lg5/e;->a:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "\u5206\u6790\u5b8c\u6210>>>>>"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lg5/f$c;->e:Lg5/f;

    .line 9
    .line 10
    iget-boolean v1, v0, Lg5/f;->e:Z

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    iget-object v0, v0, Lg5/f;->d:Lg5/f$d;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    iget-boolean v1, p1, Lh5/a;->a:Z

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-interface {v0, p1}, Lg5/f$d;->a(Lh5/a;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-interface {v0, p1}, Lg5/f$d;->b(Lh5/a;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method

.method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lh5/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lg5/f$c;->d(Lh5/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
