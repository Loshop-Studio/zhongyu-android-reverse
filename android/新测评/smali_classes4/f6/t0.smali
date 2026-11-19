.class public final synthetic Lf6/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function2;

.field public final synthetic b:Lw5/g;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function2;Lw5/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf6/t0;->a:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, Lf6/t0;->b:Lw5/g;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lf6/t0;->a:Lkotlin/jvm/functions/Function2;

    iget-object v1, p0, Lf6/t0;->b:Lw5/g;

    invoke-static {v0, v1}, Lf6/u0;->e(Lkotlin/jvm/functions/Function2;Lw5/g;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
