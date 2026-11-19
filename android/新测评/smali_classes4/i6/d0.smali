.class public final synthetic Li6/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

.field public final synthetic b:Li6/l;

.field public final synthetic c:Lkotlin/jvm/functions/Function3;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Li6/l;Lkotlin/jvm/functions/Function3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li6/d0;->a:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    iput-object p2, p0, Li6/d0;->b:Li6/l;

    iput-object p3, p0, Li6/d0;->c:Lkotlin/jvm/functions/Function3;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Li6/d0;->a:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    iget-object v1, p0, Li6/d0;->b:Li6/l;

    iget-object v2, p0, Li6/d0;->c:Lkotlin/jvm/functions/Function3;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, v2, p1}, Li6/k0;->i(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Li6/l;Lkotlin/jvm/functions/Function3;Z)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
