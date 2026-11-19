.class public final synthetic Lf6/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function2;

.field public final synthetic b:Lw5/c;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function2;Lw5/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf6/j0;->a:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, Lf6/j0;->b:Lw5/c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lf6/j0;->a:Lkotlin/jvm/functions/Function2;

    iget-object v1, p0, Lf6/j0;->b:Lw5/c;

    invoke-static {v0, v1}, Lf6/u0;->m(Lkotlin/jvm/functions/Function2;Lw5/c;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
