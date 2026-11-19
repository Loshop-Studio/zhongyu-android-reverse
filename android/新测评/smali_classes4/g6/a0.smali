.class public final synthetic Lg6/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function2;

.field public final synthetic b:Lcom/zykj/evaluation/ui/detail/c;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function2;Lcom/zykj/evaluation/ui/detail/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg6/a0;->a:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, Lg6/a0;->b:Lcom/zykj/evaluation/ui/detail/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lg6/a0;->a:Lkotlin/jvm/functions/Function2;

    iget-object v1, p0, Lg6/a0;->b:Lcom/zykj/evaluation/ui/detail/c;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, p1}, Lg6/z0;->c(Lkotlin/jvm/functions/Function2;Lcom/zykj/evaluation/ui/detail/c;Z)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
