.class public Lg5/c$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/Camera$PictureCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg5/c;->i(Landroid/hardware/Camera;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lg5/c;


# direct methods
.method public constructor <init>(Lg5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg5/c$e;->a:Lg5/c;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onPictureTaken([BLandroid/hardware/Camera;)V
    .locals 2

    .line 1
    invoke-static {}, Lg5/c;->a()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "\u5bf9\u7126\u6210\u529f\uff0ccapture-------->>>>>"

    .line 6
    .line 7
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lg5/c$e;->a:Lg5/c;

    .line 11
    .line 12
    invoke-static {v0}, Lg5/c;->g(Lg5/c;)Lg5/c$f;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0, p1, p2}, Lg5/c$f;->onPictureTaken([BLandroid/hardware/Camera;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lg5/c$e;->a:Lg5/c;

    .line 20
    .line 21
    invoke-virtual {p1}, Lg5/c;->q()V

    .line 22
    .line 23
    .line 24
    return-void
.end method
