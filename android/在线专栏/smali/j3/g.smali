.class public final Lj3/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lx2/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/q<",
            "Li3/b<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Object;",
            "Lq2/d<",
            "-",
            "Lo2/r;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lj3/g$a;->c:Lj3/g$a;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lkotlin/jvm/internal/b0;->b(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx2/q;

    sput-object v0, Lj3/g;->a:Lx2/q;

    return-void
.end method

.method public static final synthetic a()Lx2/q;
    .locals 1

    sget-object v0, Lj3/g;->a:Lx2/q;

    return-object v0
.end method
