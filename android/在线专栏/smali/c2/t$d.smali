.class final Lc2/t$d;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lx2/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc2/t;->onActivityCreated(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lx2/p<",
        "Ljava/lang/Integer;",
        "Ljava/lang/Float;",
        "Lo2/r;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lc2/t;


# direct methods
.method constructor <init>(Lc2/t;)V
    .locals 0

    iput-object p1, p0, Lc2/t$d;->a:Lc2/t;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(IF)V
    .locals 2

    iget-object v0, p0, Lc2/t$d;->a:Lc2/t;

    invoke-static {v0}, Lc2/t;->h(Lc2/t;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, "localPath"

    invoke-static {v1}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    invoke-static {v0, v1, p1, p2}, Lc2/t;->j(Lc2/t;Ljava/lang/String;IF)V

    return-void
.end method

.method public bridge synthetic d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    invoke-virtual {p0, p1, p2}, Lc2/t$d;->a(IF)V

    sget-object p1, Lo2/r;->a:Lo2/r;

    return-object p1
.end method
