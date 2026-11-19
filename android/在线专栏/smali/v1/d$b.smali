.class Lv1/d$b;
.super Lp0/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv1/d;-><init>(Landroidx/room/h0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lp0/f<",
        "Lv1/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic d:Lv1/d;


# direct methods
.method constructor <init>(Lv1/d;Landroidx/room/h0;)V
    .locals 0

    iput-object p1, p0, Lv1/d$b;->d:Lv1/d;

    invoke-direct {p0, p2}, Lp0/f;-><init>(Landroidx/room/h0;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM `download` WHERE `id` = ?"

    return-object v0
.end method

.method public bridge synthetic g(Ls0/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lv1/b;

    invoke-virtual {p0, p1, p2}, Lv1/d$b;->i(Ls0/f;Lv1/b;)V

    return-void
.end method

.method public i(Ls0/f;Lv1/b;)V
    .locals 2

    invoke-virtual {p2}, Lv1/b;->f()I

    move-result p2

    int-to-long v0, p2

    const/4 p2, 0x1

    invoke-interface {p1, p2, v0, v1}, Ls0/d;->w(IJ)V

    return-void
.end method
