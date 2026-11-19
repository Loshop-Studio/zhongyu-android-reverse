.class public final synthetic Li6/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Li6/b;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Li6/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li6/m;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Li6/m;->b:Li6/b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Li6/m;->a:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Li6/m;->b:Li6/b;

    invoke-static {v0, v1}, Li6/k0;->x(Lkotlin/jvm/functions/Function1;Li6/b;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
